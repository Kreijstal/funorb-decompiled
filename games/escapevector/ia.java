/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    short[] field_o;
    short[] field_v;
    static al field_y;
    short[] field_L;
    byte[] field_n;
    short[] field_Q;
    int field_O;
    int[] field_k;
    static String field_p;
    int[] field_H;
    short[] field_e;
    int[] field_C;
    int[] field_s;
    byte field_I;
    short[] field_J;
    int[] field_t;
    short[] field_N;
    short[] field_m;
    int field_i;
    int[] field_l;
    short[] field_c;
    short[] field_F;
    short field_K;
    int[] field_P;
    short[] field_w;
    short field_D;
    short[] field_r;
    short[] field_G;
    int field_R;
    short field_M;
    short[] field_f;
    int field_a;
    short[] field_h;
    private boolean field_B;
    int[] field_E;
    short[] field_q;
    int field_b;
    static te field_z;
    int field_g;
    short[] field_j;
    static int field_x;
    short[] field_u;
    int[] field_d;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = EscapeVector.field_A;
        for (var6 = 0; ((ia) this).field_K > var6; var6++) {
            ((ia) this).field_L[var6] = (short)(((ia) this).field_L[var6] * param3 / param1);
            ((ia) this).field_r[var6] = (short)(((ia) this).field_r[var6] * param2 / param1);
            ((ia) this).field_J[var6] = (short)(((ia) this).field_J[var6] * param0 / param1);
        }
        this.b((byte) 77);
        var6 = -28 % ((64 - param4) / 54);
    }

    final void a(byte param0) {
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
        var12 = EscapeVector.field_A;
        if (!((ia) this).field_B) {
          ((ia) this).field_B = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (var8 >= ((ia) this).field_K) {
              ((ia) this).field_R = var6;
              ((ia) this).field_a = var5;
              if (param0 == 49) {
                ((ia) this).field_i = var3;
                ((ia) this).field_b = var2;
                ((ia) this).field_g = var4;
                ((ia) this).field_O = var7;
                return;
              } else {
                return;
              }
            } else {
              L1: {
                var9 = ((ia) this).field_L[var8];
                var10 = ((ia) this).field_r[var8];
                if (var5 < var9) {
                  var5 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var3 <= var10) {
                  break L2;
                } else {
                  var3 = var10;
                  break L2;
                }
              }
              L3: {
                if (var6 >= var10) {
                  break L3;
                } else {
                  var6 = var10;
                  break L3;
                }
              }
              L4: {
                if (var9 >= var2) {
                  break L4;
                } else {
                  var2 = var9;
                  break L4;
                }
              }
              L5: {
                var11 = ((ia) this).field_J[var8];
                if (var11 >= var4) {
                  break L5;
                } else {
                  var4 = var11;
                  break L5;
                }
              }
              if (var11 > var7) {
                var7 = var11;
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

    private final void b(byte param0) {
        ((ia) this).field_B = false;
        if (param0 != 77) {
            ((ia) this).a((byte) -127);
        }
    }

    public static void a(boolean param0) {
        field_z = null;
        field_y = null;
        if (!param0) {
            field_p = null;
        }
        field_p = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        for (var5 = param1; ((ia) this).field_K > var5; var5++) {
            ((ia) this).field_L[var5] = (short)(((ia) this).field_L[var5] + param2);
            ((ia) this).field_r[var5] = (short)(((ia) this).field_r[var5] + param3);
            ((ia) this).field_J[var5] = (short)(((ia) this).field_J[var5] + param0);
        }
        this.b((byte) 77);
    }

    ia() {
        ((ia) this).field_I = (byte) 0;
        ((ia) this).field_B = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "The simulator is a training environment. Your objectives will be given to you at the beginning of each mission. Be prepared for anything.";
        field_y = new al();
    }
}
