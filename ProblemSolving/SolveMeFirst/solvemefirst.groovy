def solveMeFirst(a,b) { 
    return (a+b)
}


BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
def a = Integer.parseInt(br.readLine())
def b = Integer.parseInt(br.readLine())
def res = solveMeFirst(a,b)
println res