/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    short[] field_F;
    static t field_l;
    short[] field_a;
    short[] field_z;
    int[] field_L;
    int[] field_v;
    short[] field_q;
    int field_A;
    int[] field_N;
    short[] field_b;
    int[] field_n;
    short[] field_P;
    short field_R;
    short[] field_G;
    byte[] field_i;
    short[] field_r;
    short[] field_I;
    int field_p;
    int field_H;
    short field_f;
    short[] field_c;
    short[] field_s;
    int field_x;
    short[] field_O;
    short[] field_B;
    int[] field_D;
    int[] field_w;
    int[] field_k;
    short[] field_t;
    short[] field_J;
    private boolean field_y;
    static int field_m;
    static java.awt.Image field_u;
    int field_g;
    short field_C;
    short[] field_E;
    short[] field_j;
    int[] field_K;
    byte field_M;
    int field_e;
    int[] field_h;
    short[] field_d;
    static int field_o;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Torquing.field_u;
        if (!((of) this).field_y) {
          ((of) this).field_y = true;
          var2 = 32767;
          var3 = param0;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((of) this).field_f) {
              ((of) this).field_x = var3;
              ((of) this).field_e = var7;
              ((of) this).field_H = var6;
              ((of) this).field_g = var5;
              ((of) this).field_A = var2;
              ((of) this).field_p = var4;
              return;
            } else {
              L1: {
                var9 = ((of) this).field_B[var8];
                var10 = ((of) this).field_j[var8];
                if (var5 >= var9) {
                  break L1;
                } else {
                  var5 = var9;
                  break L1;
                }
              }
              L2: {
                if (var10 >= var3) {
                  break L2;
                } else {
                  var3 = var10;
                  break L2;
                }
              }
              L3: {
                if (var10 > var6) {
                  var6 = var10;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var11 = ((of) this).field_d[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var7 < var11) {
                  var7 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static String d(byte param0) {
        if (bh.field_a == mg.field_b) {
            return ol.field_a;
        }
        if (!qk.field_q.c(484)) {
            return qk.field_q.a((byte) -96);
        }
        if (mg.field_b == kh.field_o) {
            return qk.field_q.a((byte) -97);
        }
        if (param0 >= -58) {
            return null;
        }
        return eo.field_a;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Torquing.field_u;
        for (var5 = 0; ((of) this).field_f > var5; var5++) {
            ((of) this).field_B[var5] = (short)(((of) this).field_B[var5] + param2);
            ((of) this).field_j[var5] = (short)(((of) this).field_j[var5] + param3);
            ((of) this).field_d[var5] = (short)(((of) this).field_d[var5] + param0);
        }
        if (param1 != -6) {
            ((of) this).field_N = null;
        }
        this.c((byte) 32);
    }

    private final void c(byte param0) {
        ((of) this).field_y = false;
        if (param0 != 32) {
            of.a((byte) -15);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var7 = 0;
        int var8 = Torquing.field_u;
        int var6 = 85 % ((param4 - -41) / 63);
        for (var7 = 0; var7 < ((of) this).field_f; var7++) {
            ((of) this).field_B[var7] = (short)(param3 * ((of) this).field_B[var7] / param0);
            ((of) this).field_j[var7] = (short)(((of) this).field_j[var7] * param2 / param0);
            ((of) this).field_d[var7] = (short)(((of) this).field_d[var7] * param1 / param0);
        }
        this.c((byte) 32);
    }

    final static void b(byte param0) {
        hb.field_x.c((gm) (Object) new fm(), param0 + -72);
        if (param0 != 105) {
            field_m = 65;
        }
    }

    public static void a(byte param0) {
        if (param0 != -81) {
            of.a((byte) -107);
        }
        field_u = null;
        field_l = null;
    }

    of() {
        ((of) this).field_y = false;
        ((of) this).field_M = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 160;
        field_o = 100;
    }
}
