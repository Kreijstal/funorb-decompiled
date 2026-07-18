/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ih extends hl {
    static int field_p;
    static ah field_n;
    static ah field_j;
    static int field_o;
    int field_r;
    int field_l;
    static int field_m;
    int field_k;
    static hj[] field_t;
    int field_s;
    int field_u;
    int field_q;
    static long field_i;

    final static void a(int param0, int param1, int param2, int param3) {
        hg.field_I = param3;
        sd.field_c = param2;
        if (param0 != 14893) {
            ih.a(-62, -61, 42, 74);
        }
        ge.field_b = param1;
    }

    public static void a() {
        field_n = null;
        field_j = null;
        field_t = null;
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
        ii var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = HoldTheLine.field_D;
          if (param0 instanceof ii) {
            var14 = (ii) (Object) param0;
            param0 = var14.field_f;
            var2 = var14.field_a + " | ";
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 + 1);
              if (var9 == -1) {
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
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (-1 == var9) {
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
            var2 = var2 + ' ';
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static String a(int param0) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        StringBuilder var2 = new StringBuilder(5);
        for (var3 = 0; var3 < param0; var3++) {
            StringBuilder discarded$0 = var2.append('‘');
        }
        while (var3 < 5) {
            StringBuilder discarded$1 = var2.append('’');
            var3++;
        }
        return var2.toString();
    }

    ih(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ih) this).field_r = param0;
        ((ih) this).field_s = param1;
        ((ih) this).field_q = param3;
        ((ih) this).field_l = param2;
        ((ih) this).field_u = param5;
        ((ih) this).field_k = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ah();
    }
}
