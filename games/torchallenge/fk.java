/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class fk extends bc {
    static int[] field_u;
    static int[] field_v;
    static int[][] field_s;
    static int field_t;

    public static void b() {
        field_s = null;
        field_v = null;
        field_u = null;
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        try {
            if (!(!param4)) {
                v.b(param0.field_m + param2, param3 ^ 12105945, param0.field_p, param0.field_i + param1, param0.field_l);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "fk.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    fk(int param0) {
        this(oe.field_g, param0);
    }

    final static void a(boolean param0, int param1) {
        ri.field_i = param1;
        if (!param0) {
            field_v = null;
        }
    }

    fk(eg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_x, -1, 2147483647, false);
    }

    final static String a(Throwable param0) throws IOException {
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
        jd var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          if (!(param0 instanceof jd)) {
            var2 = "";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var14 = (jd) (Object) param0;
            param0 = var14.field_a;
            var2 = var14.field_c + " | ";
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
              var10 = var8.indexOf(')', var9 - -1);
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
              var17 = var16.substring(var16.lastIndexOf(' ') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 == -1) {
                  break L3;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 >= 0) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var2 = var2 + 32;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new int[2];
        field_t = 0;
        field_s = new int[][]{new int[2], new int[2]};
    }
}
