/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pc {
    static boolean[][] field_b;
    static ci field_d;
    static bg field_e;
    static long field_a;
    int field_f;
    static bg[] field_c;

    final static int a(int param0, int param1, int param2) {
        if (param0 > -10) {
            return 69;
        }
        int var3 = param2 >>> 1177897759;
        return -var3 + (var3 + param2) / param1;
    }

    final static void a(ci param0, int param1) {
        vi.field_h = param0;
        if (param1 != 40) {
            field_c = null;
        }
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
        el var14 = null;
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
          var13 = Terraphoenix.field_V;
          if (param0 instanceof el) {
            var14 = (el) (Object) param0;
            param0 = var14.field_a;
            var2 = var14.field_b + " | ";
            var11 = var2;
            var2 = var11;
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
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        if (param1 == 0) {
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
                var10 = var20.indexOf(')', 1 + var9);
                if ((var9 ^ -1) == 0) {
                  var11 = var20;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var20.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var21 = var11.trim();
                var2 = var21;
                var2 = var21;
                var22 = var21.substring(var21.lastIndexOf(' ') + 1);
                var2 = var22;
                var2 = var22;
                var23 = var22.substring(1 + var22.lastIndexOf('\t'));
                var2 = var23;
                var2 = var23;
                var24 = var2 + var23;
                var2 = var24;
                var2 = var24;
                if ((var9 ^ -1) == 0) {
                  break L3;
                } else {
                  if (var10 == -1) {
                    break L3;
                  } else {
                    var12 = var20.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
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
          int discarded$1 = pc.a(51, -88, -81);
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
                var10 = var26.indexOf(')', 1 + var9);
                if ((var9 ^ -1) == 0) {
                  var11 = var26;
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var26.substring(0, var9);
                  break L5;
                }
              }
              L6: {
                var27 = var11.trim();
                var2 = var27;
                var2 = var27;
                var28 = var27.substring(var27.lastIndexOf(' ') + 1);
                var2 = var28;
                var2 = var28;
                var29 = var28.substring(1 + var28.lastIndexOf('\t'));
                var2 = var29;
                var2 = var29;
                var30 = var2 + var29;
                var2 = var30;
                var2 = var30;
                if ((var9 ^ -1) == 0) {
                  break L6;
                } else {
                  if (var10 == -1) {
                    break L6;
                  } else {
                    var12 = var26.indexOf(".java:", var9);
                    if ((var12 ^ -1) <= -1) {
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

    pc() {
        ((pc) this).field_f = 0;
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 != 12653) {
            pc.a(53);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[640][480];
    }
}
