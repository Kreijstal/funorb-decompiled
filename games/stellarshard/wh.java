/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static int field_c;
    static pb[] field_e;
    int field_b;
    static String field_d;
    static pb field_a;

    final static byte[] a(int param0, ha param1, byte[] param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        var4 = 69 % ((param3 - -61) / 48);
        var5 = param1.e(param0, 8);
        if (0 != var5) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param2.length == var5) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param2 = new byte[var5];
            break L0;
          }
          L2: {
            var6 = param1.e(3, 8);
            var7 = (byte)param1.e(8, 8);
            if (-1 > (var6 ^ -1)) {
              var8 = 0;
              L3: while (true) {
                if (var8 >= var5) {
                  break L2;
                } else {
                  param2[var8] = (byte)(var7 + param1.e(var6, 8));
                  var8++;
                  continue L3;
                }
              }
            } else {
              var8 = 0;
              L4: while (true) {
                if (var8 >= var5) {
                  break L2;
                } else {
                  param2[var8] = (byte)var7;
                  var8++;
                  continue L4;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    final static String a(byte param0) {
        if (!(o.field_l != dj.field_a)) {
            return kc.field_c;
        }
        if (param0 < 79) {
            wh.a(-83);
        }
        return wb.field_c;
    }

    public static void b(int param0) {
        if (param0 != -1) {
            wh.a(-125);
        }
        field_a = null;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0) {
        if (param0 > -31) {
            return;
        }
        gg.field_f = ee.a(5, 0, (byte) -119, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
