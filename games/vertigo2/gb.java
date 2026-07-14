/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gb {
    static String field_a;
    static cc field_b;
    static cr field_c;
    static int field_d;

    final static er[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 28290) {
            field_d = -33;
        }
        return ui.a(1, 1, param4, param1, param0, 1, 5, param2, 3);
    }

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -49) {
          var3 = 0;
          var4 = param2.length();
          var5 = 0;
          L0: while (true) {
            if (var5 >= var4) {
              return var3;
            } else {
              if (param2.charAt(var5) == param1) {
                var3++;
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return 126;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 19199) {
            er[] discarded$0 = gb.a(-81, 34, -41, -66, -87);
        }
    }

    final static void a(int param0, fb param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
        if (param7 >= -82) {
            field_a = null;
        }
        jn.a(param4, param5, param1, param0, 256, param2, param3, 10, param6);
    }

    final static String a(Throwable param0, boolean param1) throws IOException {
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
        dg var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = Vertigo2.field_L ? 1 : 0;
          if (!(param0 instanceof dg)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (dg) (Object) param0;
            var2 = var14.field_e + " | ";
            param0 = var14.field_a;
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
        if (!param1) {
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
                if (-1 == var9) {
                  var11 = var8;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var8.substring(0, var9);
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
                var18 = var17.substring(1 + var17.lastIndexOf('\t'));
                var2 = var18;
                var2 = var18;
                var19 = var2 + var18;
                var2 = var19;
                var2 = var19;
                if (0 == var9) {
                  break L3;
                } else {
                  if (0 == var10) {
                    break L3;
                  } else {
                    var12 = var8.indexOf(".java:", var9);
                    if ((var12 ^ -1) > -1) {
                      break L3;
                    } else {
                      var2 = var19 + var8.substring(var12 + 5, var10);
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L1;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Return to game";
        field_d = 0;
    }
}
