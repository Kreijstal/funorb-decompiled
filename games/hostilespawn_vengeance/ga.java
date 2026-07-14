/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static bd field_a;
    static int field_b;
    static String field_c;

    public static void a(byte param0) {
        if (param0 > -47) {
            ga.a((byte) -107);
        }
        field_a = null;
        field_c = null;
    }

    final static byte[] a(int param0, en param1, byte[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var4 = param1.a(param3, true);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (var4 == param2.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param2 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param1.a(3, true);
            var6 = (byte)param1.a(8, true);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param2[var7] = (byte)(var6 + param1.a(var5, true));
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          if (param0 >= 90) {
            return param2;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 256;
        field_c = "The marine's current health is shown at the bottom-right of the screen. Killing enough hostiles will provide you with a promotion and a health boost to keep you fighting fit.";
    }
}
