 def a = [1,3,4,6,8]
 def b = [3,6,45,77]
 def answer = []
    int i = 0, j = 0, k = 0
    while (i < a.size() && j < b.size())
    {
        if (a[i] < b[j])
        {
            answer[k] = a[i]
            i++
        }
        else
        {
            answer[k] = b[j]
            j++
        }
        k++
    }

    while (i < a.size())
    {
        answer[k] = a[i]
        i++
        k++
    }

    while (j < b.size())
    {
        answer[k] = b[j]
        j++
        k++
    }
println answer