add %edx, %eax     
    jc if_overflow 
    
    mov $1, %eax  
    jmp return

if_overflow:
    mov $0, %eax 

jmp return
return:
