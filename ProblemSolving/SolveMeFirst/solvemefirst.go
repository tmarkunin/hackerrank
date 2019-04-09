package main

import "fmt"

//Run from console using 'go run solvemefirst.go'
//golang should be installed
func solveMeFirst(a uint32, b uint32) uint32 {
	return (a + b)
}

func main() {
	var a, b, res uint32
	fmt.Scanf("%v\n%v", &a, &b)
	res = solveMeFirst(a, b)
	fmt.Println(res)
}
