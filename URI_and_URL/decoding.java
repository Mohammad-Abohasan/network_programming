/*
space   %20
!       %21
"       %22
#       %23
$       %24
%       %25
&       %26
'       %27
(       %28
)       %29
*       %2A
+       %2B
,       %2C
-       %2D
.       %2E
/       %2F
0       %30
1       %31
2       %32
3       %33
4       %34
5       %35
6       %36
7       %37
8       %38
9       %39
:       %3A
;       %3B
<       %3C
=       %3D
>       %3E
?       %3F
@       %40
A       %41
Z       %5A
[       %5B
\       %5C
]       %5D
^       %5E
_       %5F
`       %60
a       %61
z       %7A
{       %7B
|       %7C
}       %7D
~       %7E
*/
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String cipher_text = "https://www.google.com/my%20name%20mohammad%2Dabohasan";
        String plain_text  = URLDecoder.decode(cipher_text, "UTF-8");
        System.out.println(cipher_text);
        System.out.println(plain_text);
    }
}
