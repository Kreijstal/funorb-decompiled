/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jp {
    static String field_u;
    static fk field_n;
    short[] field_Q;
    short[] field_r;
    int field_S;
    int field_D;
    short field_K;
    static String field_j;
    int[] field_v;
    int field_E;
    short[] field_N;
    int field_k;
    short[] field_q;
    short[] field_m;
    short[] field_L;
    int[] field_s;
    short field_F;
    short[] field_c;
    static String field_R;
    short[] field_O;
    int field_t;
    int field_B;
    int[] field_f;
    int[] field_l;
    short[] field_P;
    short[] field_p;
    private boolean field_i;
    short[] field_d;
    short[] field_J;
    int[] field_y;
    static int field_o;
    short field_w;
    int[] field_M;
    int[] field_A;
    short[] field_C;
    int[] field_b;
    short[] field_g;
    short[] field_I;
    int[] field_z;
    byte[] field_x;
    byte field_G;
    short[] field_h;
    short[] field_a;
    short[] field_e;

    public static void a(boolean param0) {
        field_n = null;
        field_R = null;
        field_u = null;
        field_j = null;
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
        var12 = Vertigo2.field_L ? 1 : 0;
        if (!((jp) this).field_i) {
          L0: {
            ((jp) this).field_i = true;
            var2 = 32767;
            var3 = 32767;
            var4 = 32767;
            if (param0 == 117) {
              break L0;
            } else {
              ((jp) this).a((byte) -11);
              break L0;
            }
          }
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= ((jp) this).field_F) {
              ((jp) this).field_S = var2;
              ((jp) this).field_t = var3;
              ((jp) this).field_D = var5;
              ((jp) this).field_B = var4;
              ((jp) this).field_E = var6;
              ((jp) this).field_k = var7;
              return;
            } else {
              L2: {
                var9 = ((jp) this).field_I[var8];
                var10 = ((jp) this).field_r[var8];
                if (var9 <= var5) {
                  break L2;
                } else {
                  var5 = var9;
                  break L2;
                }
              }
              L3: {
                if (var2 > var9) {
                  var2 = var9;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var6 >= var10) {
                  break L4;
                } else {
                  var6 = var10;
                  break L4;
                }
              }
              L5: {
                if (var10 >= var3) {
                  break L5;
                } else {
                  var3 = var10;
                  break L5;
                }
              }
              L6: {
                var11 = ((jp) this).field_m[var8];
                if (var11 < var4) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 > var7) {
                var7 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static char a(boolean param0, char param1) {
        L0: {
          if (param1 == 181) {
            break L0;
          } else {
            if (param1 == 402) {
              break L0;
            } else {
              return Character.toTitleCase(param1);
            }
          }
        }
        return param1;
    }

    private final void b(boolean param0) {
        ((jp) this).field_i = false;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var8 = Vertigo2.field_L ? 1 : 0;
        for (var6 = 0; ((jp) this).field_F > var6; var6++) {
            ((jp) this).field_I[var6] = (short)(param0 * ((jp) this).field_I[var6] / param4);
            ((jp) this).field_r[var6] = (short)(param2 * ((jp) this).field_r[var6] / param4);
            ((jp) this).field_m[var6] = (short)(((jp) this).field_m[var6] * param3 / param4);
        }
        int var7 = -7 / ((-70 - param1) / 45);
        this.b(true);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = Vertigo2.field_L ? 1 : 0;
        int var5 = -72 % ((param3 - 67) / 57);
        for (var6 = 0; var6 < ((jp) this).field_F; var6++) {
            ((jp) this).field_I[var6] = (short)(((jp) this).field_I[var6] + param2);
            ((jp) this).field_r[var6] = (short)(((jp) this).field_r[var6] + param0);
            ((jp) this).field_m[var6] = (short)(((jp) this).field_m[var6] + param1);
        }
        this.b(true);
    }

    jp() {
        ((jp) this).field_i = false;
        ((jp) this).field_G = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "<%0> and <%1> drew!";
        field_j = "Asking for or providing contact information";
        field_R = "<%0> is not on your ignore list.";
    }
}
