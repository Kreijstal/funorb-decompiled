/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class b {
    static vn field_a;
    static ri field_e;
    static String field_c;
    static int[] field_f;
    static String field_b;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 <= 53) {
          field_a = null;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        int var5 = 0;
        String var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        p var15 = null;
        StringWriter var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        L0: {
          var14 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 instanceof p) {
            var15 = (p) (Object) param1;
            param1 = var15.field_g;
            var2 = var15.field_i + " | ";
            var12 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var16 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var16);
        param1.printStackTrace(var4);
        var5 = -66 % ((32 - param0) / 52);
        var4.close();
        var6 = var16.toString();
        var2 = var6;
        var12 = var6;
        var7 = new BufferedReader((Reader) (Object) new StringReader(var6));
        var8 = var7.readLine();
        var2 = var8;
        var12 = var8;
        L1: while (true) {
          var9 = var7.readLine();
          var2 = var9;
          var12 = var9;
          var2 = var12;
          if (var9 != null) {
            L2: {
              var10 = var9.indexOf('(');
              var11 = var9.indexOf(')', 1 + var10);
              if (-1 == var10) {
                var12 = var9;
                var2 = var12;
                var2 = var12;
                break L2;
              } else {
                var12 = var9.substring(0, var10);
                break L2;
              }
            }
            L3: {
              var17 = var12.trim();
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(1 + var17.lastIndexOf(' '));
              var2 = var18;
              var2 = var18;
              var19 = var18.substring(var18.lastIndexOf('\t') - -1);
              var2 = var19;
              var2 = var19;
              var20 = var2 + var19;
              var2 = var20;
              var2 = var20;
              if (var10 == -1) {
                break L3;
              } else {
                if ((var11 ^ -1) != 0) {
                  var13 = var9.indexOf(".java:", var10);
                  if ((var13 ^ -1) > -1) {
                    break L3;
                  } else {
                    var2 = var20 + var9.substring(var13 - -5, var11);
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
          } else {
            var2 = var12;
            var12 = var2;
            var2 = var12;
            var2 = var2 + "| " + var8;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new vn();
        field_e = new ri();
        field_f = new int[]{0, 2, 4, 6, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        field_b = "<%0> cannot join; the game is full.";
        field_c = "Mos Le'Harmless";
        field_d = "Red Team";
    }
}
