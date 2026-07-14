/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static lc[] field_b;
    static String field_e;
    static int field_d;
    static ld field_c;
    static ea field_a;

    final static byte[] a(byte[] param0, ld param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        var4 = param1.c((byte) -110, param2);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param0 = new byte[var4];
            break L0;
          }
          L2: {
            if (param3 < -78) {
              break L2;
            } else {
              boolean discarded$2 = sn.a((byte) 80);
              break L2;
            }
          }
          L3: {
            var5 = param1.c((byte) -114, 3);
            var6 = (byte)param1.c((byte) -96, 8);
            if ((var5 ^ -1) < -1) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (byte)(param1.c((byte) -115, var5) + var6);
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (byte)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 81) {
            return false;
        }
        return ke.field_U.a((byte) 16);
    }

    public static void b(byte param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -18) {
            sn.b((byte) 110);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new lc[2];
        field_e = "PER MONTH";
    }
}
