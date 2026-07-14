/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String field_a;
    static ge[] field_d;
    static volatile boolean field_c;
    static String field_b;

    final static void a(int param0, byte param1, eg param2, String param3, qi param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TorChallenge.field_F ? 1 : 0;
          var5 = 0;
          var6 = -1;
          if (param1 == -113) {
            break L0;
          } else {
            ua.a(125);
            break L0;
          }
        }
        var7 = 1;
        L1: while (true) {
          if (var7 >= param3.length()) {
            return;
          } else {
            L2: {
              var8 = param3.charAt(var7);
              if (60 == var8) {
                var6 = param4.field_g[0] + (var5 >> -2014425080) + param2.a(param3.substring(0, var7));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((var6 ^ -1) != 0) {
                param4.field_g[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param4.field_g[var7] = (var5 >> -571783416) + param4.field_g[0] + param2.a(param3.substring(0, 1 + var7)) + -param2.a((char) var8);
                break L3;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 68 % ((18 - param0) / 56);
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Accept";
        field_c = false;
        field_b = "Passwords must be between 5 and 20 letters and numbers";
    }
}
