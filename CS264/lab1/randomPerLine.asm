# Random numbers per line with a white space in between
# Junda Lou
# 4.15.2017
# CS264

.data
Input:	.asciiz "Please enter 20 integers(one per line):\n"
Prompt1: .asciiz "Please enter the number of output per line: "
Prompt2: .asciiz "Here are the 20 integers in the array in reverse order:\n"
whiteSpace: .asciiz " "
newLine: .asciiz "\n"

.align 2
list: .space 80



.text
.globl main
main:
	li $v0, 4	
	la $a0, Prompt1
	syscall
	li $v0, 5
	syscall
	move $t2, $v0
	li $v0, 4
	la $a0, Input
	syscall
	li $t0, 0
	li $t3, 0
	la $t1, list
	addu $t1, $t1, 76

ReadLoop:
	li $v0, 5
	syscall
	sw $v0, 0($t1)
	addu $t0, $t0, 1
	subu $t1, $t1, 4
	bne $t0, 20, ReadLoop
	li $t0, 0
	la $t1, list
	la $a0, Prompt2
	li $v0, 4
	syscall
	
Loop:		
	lw $a0, 0($t1)
	li $v0, 1
	syscall
	la $a0, whiteSpace
	li $v0, 4
	syscall
	addu $t3, $t3, 1
	beq $t3, $t2, changeLine

Clear:	
	addu $t0, $t0, 1
	addu $t1, $t1, 4	
	bne $t0, 20, Loop	

changeLine:
	la $a0, newLine
	li $v0, 4
	syscall
	li $t3, 0
	bne $t0, 20, Clear

End:
	li $v0, 10
	syscall
	