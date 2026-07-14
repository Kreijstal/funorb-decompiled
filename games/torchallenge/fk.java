/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class fk extends bc {
    static int[] field_u;
    static int[] field_v;
    static int[][] field_s;
    static int field_t;

    public static void b(byte param0) {
        if (param0 != -88) {
          field_t = 98;
          field_s = null;
          field_v = null;
          field_u = null;
          return;
        } else {
          field_s = null;
          field_v = null;
          field_u = null;
          return;
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        if (!(!param4)) {
            v.b(param0.field_m + param2, param3 ^ 12105945, param0.field_p, param0.field_i + param1, param0.field_l);
        }
        super.a(param0, param1, param2, param3, param4);
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

    final static String a(Throwable param0, int param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        jd var14 = null;
        StringWriter var15 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var38 = null;
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
        if (param1 == -1) {
          var25 = var6.readLine();
          var11 = var25;
          var2 = var11;
          var11 = var25;
          L1: while (true) {
            var20 = var6.readLine();
            var11 = var20;
            var2 = var11;
            var11 = var20;
            if (var20 == null) {
              var2 = var2 + "| " + var25;
              var11 = var2;
              var2 = var11;
              var11 = var2;
              return var2;
            } else {
              L2: {
                var9 = var20.indexOf('(');
                var10 = var20.indexOf(')', var9 - -1);
                if (-1 != var9) {
                  var11 = var20.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var20;
                  break L2;
                }
              }
              L3: {
                var21 = var11.trim();
                var2 = var21;
                var2 = var21;
                var22 = var21.substring(var21.lastIndexOf(' ') - -1);
                var2 = var22;
                var2 = var22;
                var23 = var22.substring(var22.lastIndexOf('\t') + 1);
                var2 = var23;
                var2 = var23;
                var24 = var2 + var23;
                var2 = var24;
                var2 = var24;
                if (var9 == 0) {
                  break L3;
                } else {
                  if (0 == var10) {
                    break L3;
                  } else {
                    var12 = var20.indexOf(".java:", var9);
                    if (-1 >= (var12 ^ -1)) {
                      var2 = var24 + var20.substring(5 + var12, var10);
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
        } else {
          fk.a(false, -103);
          var31 = var6.readLine();
          var11 = var31;
          var2 = var11;
          var11 = var31;
          var7 = var31;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L4: while (true) {
            var26 = var6.readLine();
            var11 = var26;
            var2 = var11;
            var11 = var26;
            if (var26 == null) {
              var2 = var2 + "| " + var31;
              var11 = var2;
              var38 = var11;
              var11 = var2;
              return var2;
            } else {
              L5: {
                var9 = var26.indexOf('(');
                var10 = var26.indexOf(')', var9 - -1);
                if (-1 != var9) {
                  var11 = var26.substring(0, var9);
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var26;
                  break L5;
                }
              }
              L6: {
                var27 = var11.trim();
                var2 = var27;
                var2 = var27;
                var28 = var27.substring(var27.lastIndexOf(' ') - -1);
                var2 = var28;
                var2 = var28;
                var29 = var28.substring(var28.lastIndexOf('\t') + 1);
                var2 = var29;
                var2 = var29;
                var30 = var2 + var29;
                var2 = var30;
                var2 = var30;
                if (var9 == 0) {
                  break L6;
                } else {
                  if (0 == var10) {
                    break L6;
                  } else {
                    var12 = var26.indexOf(".java:", var9);
                    if (-1 >= (var12 ^ -1)) {
                      var2 = var30 + var26.substring(5 + var12, var10);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + 32;
              continue L4;
            }
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
