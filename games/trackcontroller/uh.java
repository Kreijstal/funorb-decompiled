/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    int field_f;
    static int field_e;
    static String field_d;
    int field_g;
    int field_a;
    int field_h;
    int field_k;
    byte[] field_i;
    static bh[] field_b;
    int field_l;
    byte[] field_c;
    int field_j;

    public static void a(byte param0) {
        field_b = null;
        int var1 = -113 % ((param0 - -9) / 60);
        field_d = null;
    }

    final static String a(int param0, char param1, byte param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = TrackController.field_F ? 1 : 0;
        if (param2 != 20) {
          return null;
        } else {
          var6 = new char[param0];
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (param0 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param1;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, na param1, int param2, int param3, int param4, na param5) {
        of.field_f = param0;
        mk.field_a = param5;
        int var6 = 43 % ((49 - param3) / 32);
        mb.field_c = param4;
        na.field_e = param2;
        nh.field_c = param1;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var3 = 1;
        L0: while (true) {
          if (-2 <= (param0 ^ -1)) {
            if ((param0 ^ -1) != -2) {
              if (param1 < 15) {
                int discarded$2 = uh.a(4, (byte) 36, 66);
                return var3;
              } else {
                return var3;
              }
            } else {
              return var3 * param2;
            }
          } else {
            L1: {
              if ((1 & param0) == 0) {
                break L1;
              } else {
                var3 = var3 * param2;
                break L1;
              }
            }
            param2 = param2 * param2;
            param0 = param0 >> 1;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "to return to the normal view.";
        field_b = new bh[13];
    }
}
