var s = new Array(1000);
var i;
function play(flag)
{
	//操作式子 ，flag是式子结束标�?
	var result = 0;
	var num = new Array(5);
	var op = new Array(5);
	var op_point = -1;
	var num_point = -1;
	for(; s[i] != flag; i++)
	{
		if(s[i] >= '0' && s[i] <= '9')
		{
			//遇到数字即提�?
			var num_temp = 0;
			while(s[i] != '.' && s[i] != '+' && s[i] != '-' && s[i] != '*' && s[i] != '/' && s[i] != '(' && s[i] != ')' && s[i] != '\0')
			{
				num_temp = num_temp * 10 + s[i] - '0';
				i++;
			}
			i--;
			//考虑到原来的函数存在i自增，所以这里要�?�?�?
			num_point++;
			num[num_point] = num_temp;
		}
		else if(s[i] == '(')
		{
			//遇到括号即当成一个新的式�?
			i++;
			var temp = play(')');
			//括号的结束标识为')'
			num_point++;
			num[num_point] = temp;
		}
		else if(s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/')
		{
			//遇到运算�?
			if(op_point == -1)
			{
				//空即�?
				op_point++;
				op[op_point] = s[i];
			}
			else
			{
				if((s[i] == '+' || s[i] == '-') && (op[op_point] == '*' || op[op_point] == '/'))
				{
					//当前运算符优先级小于上一个运算符的优先级，即前面的可以计算了
					var a, b;
					while(op_point >= 0)
					{
						//直到当前没有运算符剩余，即只剩下�?个结果�??
						b = num[num_point];
						num_point--;
						a = num[num_point];
						num_point--;
						switch(op[op_point])
						{
							case '+' :
								num_point++;
								num[num_point] = a + b;
								break;
							case '-' :
								num_point++;
								num[num_point] = a - b;
								break;
							case '*' :
								num_point++;
								num[num_point] = a * b;
								break;
							case '/' :
								num_point++;
								num[num_point] = a / b;
								break;
						}
						op_point--;
					}
				}
				else if(((s[i] == '+' || s[i] == '-') && (op[op_point] == '+' || op[op_point] == '-')) || ((s[i] == '*' || s[i] == '/') && (op[op_point] == '*' || op[op_point] == '/')))
				{
					var a, b;
					b = num[num_point];
					num_point--;
					a = num[num_point];
					num_point--;
					switch(op[op_point])
					{
						case '+' :
							num_point++;
							num[num_point] = a + b;
							break;
						case '-' :
							num_point++;
							num[num_point] = a - b;
							break;
						case '*' :
							num_point++;
							num[num_point] = a * b;
							break;
						case '/' :
							num_point++;
							num[num_point] = a / b;
							break;
					}
					op_point--;
				}
				op_point++;
				op[op_point] = s[i];
			}
		}
	}
	var a, b;
	while(op_point >= 0)
	{
		//直到当前没有运算符剩余，即只剩下�?个结果�??
		b = num[num_point];
		num_point--;
		a = num[num_point];
		num_point--;
		switch(op[op_point])
		{
			case '+' :
				num_point++;
				num[num_point] = a + b;
				break;
			case '-' :
				num_point++;
				num[num_point] = a - b;
				break;
			case '*' :
				num_point++;
				num[num_point] = a * b;
				break;
			case '/' :
				num_point++;
				num[num_point] = a / b;
				break;
		}
		op_point--;
	}
	result = num[num_point];
	num_point--;
	return result;
}

function main()
{
	var result;
	while(true)
	{
		s = window.prompt() + '\0';
		i = 0;
		result = play('\0');
		console.log(result);
		console.log('\n');
	}
	return 0;
}


