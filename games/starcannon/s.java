/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static rk field_e;
    int field_j;
    static String field_d;
    static pf field_f;
    static int[] field_b;
    static String field_l;
    static String field_h;
    static String field_g;
    static int[] field_k;
    static String field_a;
    static sg field_i;
    static boolean field_c;

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_k = null;
        field_g = null;
        field_b = null;
        field_d = null;
        int var1 = 58 % ((9 - param0) / 56);
        field_l = null;
        field_f = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(String param0, char param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var11 = StarCannon.field_A;
        if (param3 == -10) {
          var4 = param0.length();
          var5 = param2.length();
          var6 = var4;
          var7 = var5 + -1;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var6 = var6 + var7;
                var8_int++;
                continue L0;
              } else {
                var14 = new StringBuilder(var6);
                var8 = var14;
                var9 = 0;
                L1: while (true) {
                  var10 = param0.indexOf((int) param1, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$13 = var14.append(param0.substring(var9, var10));
                    StringBuilder discarded$14 = var14.append(param2);
                    var9 = 1 + var10;
                    continue L1;
                  } else {
                    StringBuilder discarded$15 = var14.append(param0.substring(var9));
                    return var14.toString();
                  }
                }
              }
            }
          } else {
            var13 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$16 = var13.append(param0.substring(var9, var10));
                StringBuilder discarded$17 = var13.append(param2);
                var9 = 1 + var10;
                continue L2;
              } else {
                StringBuilder discarded$18 = var13.append(param0.substring(var9));
                return var13.toString();
              }
            }
          }
        } else {
          var12 = null;
          String discarded$19 = s.a((String) null, 'ﾛ', (String) null, (byte) -27);
          var4 = param0.length();
          var5 = param2.length();
          var6 = var4;
          var7 = var5 + -1;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var6 = var6 + var7;
                var8_int++;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param0.indexOf((int) param1, var9);
                  if (-1 >= (var10 ^ -1)) {
                    StringBuilder discarded$20 = var8.append(param0.substring(var9, var10));
                    StringBuilder discarded$21 = var8.append(param2);
                    var9 = 1 + var10;
                    continue L4;
                  } else {
                    StringBuilder discarded$22 = var8.append(param0.substring(var9));
                    return var8.toString();
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (-1 >= (var10 ^ -1)) {
                StringBuilder discarded$23 = var8.append(param0.substring(var9, var10));
                StringBuilder discarded$24 = var8.append(param2);
                var9 = 1 + var10;
                continue L5;
              } else {
                StringBuilder discarded$25 = var8.append(param0.substring(var9));
                return var8.toString();
              }
            }
          }
        }
    }

    s(int param0) {
        ((s) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new rk();
        field_b = new int[]{1, 3, 3, 5, 5, 10, 2, 2, 3, 1, 2, 3, 1, 2, 3};
        field_d = "Play free version";
        field_f = new pf();
        field_g = "Waiting for fonts";
        field_a = "Use the arrow keys to move the Nova Ray.<br><br>Press SPACE or CTRL to fire the Nova Ray's lasers and shoot the Paragulan attack ships out the sky.";
        field_l = "Log in";
        field_h = "BOSS HEALTH";
        field_k = new int[256];
        field_c = false;
    }
}
