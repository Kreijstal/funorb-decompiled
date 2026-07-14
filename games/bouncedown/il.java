/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    static ue[] field_a;
    static int[] field_d;
    static eh field_c;
    static int[] field_e;
    static q field_b;

    final static void a(int param0) {
        Object var2 = null;
        if (null == q.field_N) {
          L0: {
            if (q.field_A != null) {
              q.field_A.m(65536);
              break L0;
            } else {
              break L0;
            }
          }
          ml.e(8192);
          if (param0 < 4) {
            var2 = null;
            String discarded$4 = il.a((String) null, 'a', 12, (String) null);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            q.field_N.l(-26623);
            if (q.field_A != null) {
              q.field_A.m(65536);
              break L1;
            } else {
              break L1;
            }
          }
          ml.e(8192);
          if (param0 >= 4) {
            return;
          } else {
            var2 = null;
            String discarded$5 = il.a((String) null, 'a', 12, (String) null);
            return;
          }
        }
    }

    final static String a(String param0, char param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Bounce.field_N;
          var4 = param0.length();
          if (param2 <= -28) {
            break L0;
          } else {
            il.a(-112);
            break L0;
          }
        }
        var5 = param3.length();
        var6 = var4;
        var7 = -1 + var5;
        if (-1 == (var7 ^ -1)) {
          var8 = new StringBuilder(var6);
          var9 = 0;
          L1: while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (var10 < 0) {
              StringBuilder discarded$6 = var8.append(param0.substring(var9));
              return var8.toString();
            } else {
              StringBuilder discarded$7 = var8.append(param0.substring(var9, var10));
              StringBuilder discarded$8 = var8.append(param3);
              var9 = 1 + var10;
              continue L1;
            }
          }
        } else {
          var8_int = 0;
          L2: while (true) {
            var8_int = param0.indexOf((int) param1, var8_int);
            if (var8_int >= 0) {
              var8_int++;
              var6 = var6 + var7;
              continue L2;
            } else {
              var8 = new StringBuilder(var6);
              var9 = 0;
              L3: while (true) {
                var10 = param0.indexOf((int) param1, var9);
                if (var10 < 0) {
                  StringBuilder discarded$9 = var8.append(param0.substring(var9));
                  return var8.toString();
                } else {
                  StringBuilder discarded$10 = var8.append(param0.substring(var9, var10));
                  StringBuilder discarded$11 = var8.append(param3);
                  var9 = 1 + var10;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -48 / ((param0 - 71) / 46);
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_a = new ue[16];
        field_c = new eh(9, 0, 4, 1);
    }
}
