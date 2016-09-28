power:              
 
    push %ebx       
    mov $0x1,%ebx   
 
multiplication:
    test %edx,%edx  
       jz exit      
    imul %eax,%ebx  
    dec %edx   
    
jmp multiplication  
 
exit:
    mov %ebx,%eax   
    pop %ebx        
ret
