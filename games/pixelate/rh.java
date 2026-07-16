/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends fa {
    int field_l;
    int field_s;
    static gi[] field_u;
    int field_n;
    long field_q;
    int[] field_k;
    int field_p;
    int field_t;
    int field_o;
    int field_v;
    static long[] field_x;
    static String field_m;
    static ak field_y;
    static String field_w;
    static String field_r;

    final static void a(boolean param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        tm.field_X = h.field_N;
        if (param0) {
          L0: {
            if (-256 == (param3 ^ -1)) {
              L1: {
                if ((um.field_r ^ -1) <= -14) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L1;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                }
              }
              v.field_b = pk.a(stackIn_11_0 != 0, 5731);
              break L0;
            } else {
              L2: {
                if ((param3 ^ -1) > -101) {
                  break L2;
                } else {
                  if (-106 <= (param3 ^ -1)) {
                    v.field_b = fk.a((byte) 117, param2);
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              v.field_b = pa.a(param3, param1, (byte) -120);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        int var1 = -5 % ((param0 - 16) / 63);
        te.b(false, 93);
    }

    public static void a(byte param0) {
        field_r = null;
        field_u = null;
        if (param0 != 64) {
            field_x = null;
        }
        field_y = null;
        field_m = null;
        field_x = null;
        field_w = null;
    }

    rh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = dm.field_Bb;
        dm.field_Bb = dm.field_Bb + 1;
        ((rh) this).field_o = fieldTemp$0 & 65535;
        ((rh) this).field_v = param3;
        ((rh) this).field_n = param5;
        ((rh) this).field_l = param4;
        ((rh) this).field_t = param0;
        ((rh) this).field_p = param1;
        ((rh) this).field_k = param6;
        ((rh) this).field_s = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_u = new gi[255];
        field_x = new long[32];
        for (var0 = 0; var0 < field_u.length; var0++) {
            field_u[var0] = new gi();
        }
        field_m = "Rating";
        field_r = "Unpacking sound effects";
        field_w = "<%0> is not a member, and cannot play with the current options.";
    }
}
