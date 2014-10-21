Alix Jimenez - alji2106   
Aided by Roberto K.   
1.)   
    a.)   
        canst x = 38   
        const minus = Function(x) { return function(y) { return (x-y) } };   
        minus(16)(8)   
   
    Static will return 8   
    Dynamic will return 30    
   
    The static case does not take the initial assignment of x into account whereas the dynamic   
    case does.   

2.)    
	c.) The evaluation order is deterministic because it is left to right order evaluation.   
	(Just like the given eval function.)   

3.) e1 would get evaluated, then e2, then +. If e1 and e2 are not strings,    
then do DoPlusNumber, if  e1 is a string and e2 isn't then do DoPlusString1,    
if vis versa do DoPlusString2. Big-step order would change that.    
4.)    
	a.) Usefulness of short cuircut: Nullifies potential seg-fault:   
		//http://en.wikipedia.org/wiki/Short-circuit_evaluation   
		bool is_first_char_valid_alpha_unsafe(const char *p)   
		{   
			return isalpha(p[0]); // SEGFAULT highly possible with p == NULL   
		}   

		bool is_first_char_valid_alpha(const char *p)   
		{   
			return p != NULL && isalpha(p[0]);    
			// a) no unneeded isalpha() execution with p == NULL, b) no SEGFAULT risk   
		}    
	b.) This short cuircuts because e1 is checked first and if it is false, then the    
	function automatically returns false. (There is no need to check the other statement    
	because of the definition of and.)   
	