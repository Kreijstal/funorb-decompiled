/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    short[] field_v;
    private boolean field_J;
    int[] field_z;
    short[] field_y;
    byte[] field_d;
    short[] field_x;
    short[] field_l;
    short field_g;
    int[] field_s;
    int[] field_L;
    int field_I;
    short field_i;
    short[] field_N;
    short[] field_F;
    short[] field_w;
    int field_G;
    int[] field_j;
    short[] field_m;
    short[] field_O;
    int field_u;
    int[] field_a;
    short[] field_C;
    short[] field_t;
    int field_A;
    short[] field_r;
    int field_B;
    short[] field_e;
    int[] field_p;
    short[] field_c;
    short field_K;
    int field_q;
    short[] field_H;
    short[] field_f;
    static int field_E;
    short[] field_h;
    int[] field_D;
    static String field_k;
    short[] field_b;
    int[] field_o;
    int[] field_M;
    byte field_n;

    public static void a() {
        field_k = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        for (var5 = param1; var5 < ((ma) this).field_g; var5++) {
            ((ma) this).field_x[var5] = (short)(((ma) this).field_x[var5] + param3);
            ((ma) this).field_O[var5] = (short)(((ma) this).field_O[var5] + param2);
            ((ma) this).field_r[var5] = (short)(((ma) this).field_r[var5] + param0);
        }
        this.c(-119);
    }

    final void b(int param0) {
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
        var12 = BachelorFridge.field_y;
        if (!((ma) this).field_J) {
          ((ma) this).field_J = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((ma) this).field_g) {
              L1: {
                ((ma) this).field_A = var5;
                if (param0 >= 100) {
                  break L1;
                } else {
                  ((ma) this).field_u = -119;
                  break L1;
                }
              }
              ((ma) this).field_I = var7;
              ((ma) this).field_G = var3;
              ((ma) this).field_q = var4;
              ((ma) this).field_u = var2;
              ((ma) this).field_B = var6;
              return;
            } else {
              L2: {
                var9 = ((ma) this).field_x[var8];
                var10 = ((ma) this).field_O[var8];
                if (var9 < var2) {
                  var2 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 >= var3) {
                  break L3;
                } else {
                  var3 = var10;
                  break L3;
                }
              }
              L4: {
                var11 = ((ma) this).field_r[var8];
                if (var5 < var9) {
                  var5 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var10 <= var6) {
                  break L5;
                } else {
                  var6 = var10;
                  break L5;
                }
              }
              L6: {
                if (var11 <= var7) {
                  break L6;
                } else {
                  var7 = var11;
                  break L6;
                }
              }
              if (var4 > var11) {
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

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = BachelorFridge.field_y;
        for (var6 = param0; ((ma) this).field_g > var6; var6++) {
            ((ma) this).field_x[var6] = (short)(param2 * ((ma) this).field_x[var6] / param4);
            ((ma) this).field_O[var6] = (short)(((ma) this).field_O[var6] * param1 / param4);
            ((ma) this).field_r[var6] = (short)(((ma) this).field_r[var6] * param3 / param4);
        }
        this.c(-69);
    }

    private final void c(int param0) {
        ((ma) this).field_J = false;
        if (param0 >= -16) {
            this.c(83);
        }
    }

    ma() {
        ((ma) this).field_J = false;
        ((ma) this).field_n = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Quick Chat game";
    }
}
