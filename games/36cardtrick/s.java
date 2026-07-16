/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String field_a;
    static int field_c;
    static j field_d;

    final static void a(ee param0, byte param1, int param2, di param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L0: while (true) {
          if (var7 >= param4.length()) {
            L1: {
              if (param1 == 61) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              var8 = param4.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = param3.field_a[0] + (var5 >> -6068152) + param0.a(param4.substring(0, var7));
                break L2;
              }
            }
            L3: {
              if (-1 != var6) {
                param3.field_a[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 != 32) {
                    break L4;
                  } else {
                    var5 = var5 + param2;
                    break L4;
                  }
                }
                param3.field_a[var7] = param3.field_a[0] + ((var5 >> -2142316216) - -param0.a(param4.substring(0, var7 + 1)) + -param0.a((char) var8));
                break L3;
              }
            }
            if (62 == var8) {
              var6 = -1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 30235) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords must be between 5 and 20 characters long";
        field_a = "Play free version";
    }
}
