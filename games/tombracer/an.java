/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    byte[] field_q;
    int[] field_J;
    int field_b;
    int field_a;
    short field_I;
    short[] field_e;
    short[] field_f;
    int[] field_j;
    short[] field_k;
    int[] field_E;
    int field_p;
    short[] field_r;
    short[] field_c;
    int[] field_o;
    int field_i;
    int[] field_G;
    short field_A;
    int[] field_L;
    int[] field_x;
    short[] field_H;
    short[] field_t;
    short[] field_y;
    int field_m;
    int[] field_F;
    static oc[] field_g;
    short[] field_d;
    short[] field_s;
    short[] field_w;
    short[] field_M;
    byte field_K;
    short[] field_h;
    short[] field_D;
    short[] field_l;
    private boolean field_n;
    short[] field_B;
    int field_z;
    short[] field_N;
    short[] field_C;
    short field_u;
    int[] field_v;

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        for (var6 = 0; this.field_I > var6; var6++) {
            this.field_l[var6] = (short)(param1 * this.field_l[var6] / param4);
            this.field_h[var6] = (short)(this.field_h[var6] * param2 / param4);
            this.field_t[var6] = (short)(this.field_t[var6] * param0 / param4);
        }
        this.a(param3);
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != -32768) {
            field_g = (oc[]) null;
        }
    }

    private final void a(boolean param0) {
        if (!param0) {
            an.a(-106);
        }
        this.field_n = false;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = TombRacer.field_G ? 1 : 0;
          if (param0 < -112) {
            break L0;
          } else {
            this.a(10, -119, 107, false, 71);
            break L0;
          }
        }
        if (this.field_n) {
          return;
        } else {
          this.field_n = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= this.field_I) {
              this.field_z = var2;
              this.field_p = var4;
              this.field_b = var3;
              this.field_m = var6;
              this.field_a = var7;
              this.field_i = var5;
              return;
            } else {
              L2: {
                var9 = this.field_l[var8];
                var10 = this.field_h[var8];
                if (var10 < var3) {
                  var3 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var11 = this.field_t[var8];
                if (var6 >= var10) {
                  break L3;
                } else {
                  var6 = var10;
                  break L3;
                }
              }
              L4: {
                if (var2 <= var9) {
                  break L4;
                } else {
                  var2 = var9;
                  break L4;
                }
              }
              L5: {
                if (var9 > var5) {
                  var5 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var11 > var7) {
                  var7 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var4 > var11) {
                var4 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param2 != -86) {
            this.field_D = (short[]) null;
        }
        for (var5 = 0; this.field_I > var5; var5++) {
            this.field_l[var5] = (short)(this.field_l[var5] + param1);
            this.field_h[var5] = (short)(this.field_h[var5] + param3);
            this.field_t[var5] = (short)(this.field_t[var5] + param0);
        }
        this.a(true);
    }

    an() {
        this.field_n = false;
        this.field_K = (byte) 0;
    }

    static {
    }
}
