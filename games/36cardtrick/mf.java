/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mf extends qb {
    static int field_g;
    int field_k;
    int field_h;
    static int field_i;
    static long field_j;

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ac var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Main.field_T;
          if (!(param0 instanceof ac)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (ac) param0;
            param0 = ((ac) var14).field_b;
            var2 = ((ac) var14).field_a + " | ";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        if (param1 != -3) {
          return (String) null;
        } else {
          var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
          var7 = var6.readLine();
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L1: while (true) {
            var8 = var6.readLine();
            var11 = var8;
            var2 = var11;
            var11 = var8;
            if (var8 == null) {
              var2 = var2 + "| " + var7;
              return var2;
            } else {
              L2: {
                var9 = var8.indexOf('(');
                var10 = var8.indexOf(')', 1 + var9);
                if (-1 != var9) {
                  var11 = var8.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8;
                  break L2;
                }
              }
              L3: {
                var16 = var11.trim();
                var2 = var16;
                var2 = var16;
                var17 = var16.substring(1 + var16.lastIndexOf(' '));
                var2 = var17;
                var2 = var17;
                var18 = var17.substring(var17.lastIndexOf('\t') - -1);
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                if (-1 == var9) {
                  break L3;
                } else {
                  if ((var10 ^ -1) != 0) {
                    var12 = var8.indexOf(".java:", var9);
                    if (0 <= var12) {
                      var2 = var19 + var8.substring(var12 - -5, var10);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    var2 = var2 + 32;
                    continue L1;
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            }
          }
        }
    }

    private mf() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 80;
    }
}
