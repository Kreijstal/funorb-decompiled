/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    static int field_a;
    static o[] field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            lk.a(47, (vd) null, 92, (fg) null, (String) null);
        }
    }

    final static void a(int param0, vd param1, int param2, fg param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = wizardrun.field_H;
        var5 = 0;
        var6 = -1;
        var7 = -117 % ((param0 - 0) / 57);
        var8 = 1;
        L0: while (true) {
          if (var8 >= param4.length()) {
            return;
          } else {
            L1: {
              var9 = param4.charAt(var8);
              if (var9 == 60) {
                var6 = param3.field_e[0] + (var5 >> -951373336) + param1.b(param4.substring(0, var8));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (-1 != var6) {
                param3.field_e[var8] = var6;
                break L2;
              } else {
                L3: {
                  if (var9 != 32) {
                    break L3;
                  } else {
                    var5 = var5 + param2;
                    break L3;
                  }
                }
                param3.field_e[var8] = param3.field_e[0] + (var5 >> -712605240) + (param1.b(param4.substring(0, 1 + var8)) + -param1.a((char) var9));
                break L2;
              }
            }
            if (var9 == 62) {
              var6 = -1;
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
