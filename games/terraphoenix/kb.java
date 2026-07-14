/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    int[] field_G;
    int[][] field_w;
    int field_h;
    int field_m;
    int[] field_k;
    boolean[] field_B;
    byte field_j;
    int field_p;
    int[][] field_r;
    byte[] field_E;
    int[] field_c;
    boolean[] field_v;
    byte[] field_D;
    int field_e;
    byte[] field_d;
    int[][] field_i;
    byte[][] field_g;
    int[] field_u;
    int field_A;
    byte[] field_f;
    byte[] field_y;
    int field_l;
    int field_x;
    static ci field_s;
    int field_b;
    int field_q;
    static ci[] field_a;
    int field_o;
    int field_C;
    int field_H;
    byte[] field_F;
    int field_n;
    int field_z;
    int field_t;

    public static void a(byte param0) {
        int var1 = -73 / ((param0 - 3) / 61);
        field_a = null;
        field_s = null;
    }

    final static int a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        if (param0 <= 40) {
            field_s = null;
        }
        return vc.field_f.a(param3, param4, param5 + -24, param2 - param4, 480, param6, -1, 0, 0, param1);
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        pl.field_P = param2;
        if (param3 != -83) {
            field_a = null;
        }
        eb.field_I = param0;
        ib.field_cb = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, boolean param11, int param12) {
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        var15 = Terraphoenix.field_V;
        var13 = param9 & 16711935;
        var14 = param9 >> 268757576 & 255;
        param8 = -param2;
        L0: while (true) {
          if (param8 >= 0) {
            L1: {
              if (param11) {
                break L1;
              } else {
                var16 = null;
                kb.a(-123, (int[]) null, -30, -85, -53, -125, (int[]) null, 41, 37, -119, -27, true, -85);
                break L1;
              }
            }
            return;
          } else {
            param7 = -param10;
            L2: while (true) {
              if (-1 >= (param7 ^ -1)) {
                param4 = param4 + param5;
                param12 = param12 + param0;
                param8++;
                continue L0;
              } else {
                param12++;
                param3 = param1[param12];
                if (param3 == 0) {
                  param4++;
                  param7++;
                  continue L2;
                } else {
                  if (param3 >> -692654072 != (param3 & 65535)) {
                    param4++;
                    param6[param4] = param3;
                    param7++;
                    continue L2;
                  } else {
                    param3 = param3 & 255;
                    param4++;
                    param6[param4] = dg.a(param3 * var14, 65280) + dg.a(var13 * param3 >> 180975112, 16711935);
                    if (param6[-1 + param4] == 0) {
                      param6[param4 + -1] = 1;
                      param7++;
                      continue L2;
                    } else {
                      param7++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
    }

    kb() {
        ((kb) this).field_G = new int[257];
        ((kb) this).field_r = new int[6][258];
        ((kb) this).field_v = new boolean[16];
        ((kb) this).field_d = new byte[18002];
        ((kb) this).field_B = new boolean[256];
        ((kb) this).field_f = new byte[256];
        ((kb) this).field_k = new int[16];
        ((kb) this).field_q = 0;
        ((kb) this).field_y = new byte[4096];
        ((kb) this).field_E = new byte[18002];
        ((kb) this).field_u = new int[256];
        ((kb) this).field_i = new int[6][258];
        ((kb) this).field_g = new byte[6][258];
        ((kb) this).field_w = new int[6][258];
        ((kb) this).field_z = 0;
        ((kb) this).field_c = new int[6];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ci[4];
    }
}
