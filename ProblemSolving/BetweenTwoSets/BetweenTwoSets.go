var total int32 = 0

        for i := int32(1); i < 101; i++ {
            var validForA bool = true
            var validForB bool = true

            for _, aMember := range a {
                if (i < aMember || i%aMember!=0){
                    validForA = false
                }
            }

            if(validForA){
                for _, bMember := range b {
                    if (bMember%i!=0){
                        validForB = false
                    }
                }
                if (validForB){
                    total++
                }
            }
            
    }

     return total

}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 1024 * 1024)

    outputFile, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer outputFile.Close()

    writer := bufio.NewWriterSize(outputFile, 1024 * 1024)

    nm := strings.Split(readLine(reader), " ")

    nTemp, err := strconv.ParseInt(nm[0], 10, 64)
    checkError(err)
    n := int32(nTemp)

    mTemp, err := strconv.ParseInt(nm[1], 10, 64)
    checkError(err)
    m := int32(mTemp)

    aTemp := strings.Split(readLine(reader), " ")

    var a []int32

    for aItr := 0; aItr < int(n); aItr++ {
        aItemTemp, err := strconv.ParseInt(aTemp[aItr], 10, 64)
        checkError(err)
        aItem := int32(aItemTemp)
        a = append(a, aItem)
    }

    bTemp := strings.Split(readLine(reader), " ")

    var b []int32

    for bItr := 0; bItr < int(m); bItr++ {
        bItemTemp, err := strconv.ParseInt(bTemp[bItr], 10, 64)
        checkError(err)
        bItem := int32(bItemTemp)
        b = append(b, bItem)
    }

    total := getTotalX(a, b)

    fmt.Fprintf(writer, "%d\n", total)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}
