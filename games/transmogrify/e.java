/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e {
    short[] field_L;
    private boolean field_z;
    int[] field_Q;
    int[] field_m;
    short[] field_s;
    short[] field_n;
    int field_k;
    short[] field_v;
    static String field_I;
    short[] field_J;
    int[] field_D;
    static String field_q;
    short field_l;
    short field_M;
    short[] field_N;
    int field_i;
    int[] field_E;
    short[] field_e;
    short[] field_B;
    short field_C;
    short[] field_d;
    int[] field_a;
    byte[] field_y;
    int field_P;
    int[] field_g;
    int[] field_j;
    short[] field_H;
    short[] field_G;
    short[] field_f;
    int[] field_p;
    short[] field_b;
    int field_t;
    short[] field_o;
    short[] field_F;
    short[] field_r;
    static String field_x;
    int[] field_c;
    int field_O;
    int field_u;
    byte field_w;
    short[] field_A;
    short[] field_h;

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
        var12 = Transmogrify.field_A ? 1 : 0;
        if (!((e) this).field_z) {
          ((e) this).field_z = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          if (param0 == 22856) {
            var5 = -32768;
            var6 = -32768;
            var7 = -32768;
            var8 = 0;
            L0: while (true) {
              if (var8 >= ((e) this).field_M) {
                ((e) this).field_P = var2;
                ((e) this).field_i = var7;
                ((e) this).field_u = var6;
                ((e) this).field_O = var3;
                ((e) this).field_t = var5;
                ((e) this).field_k = var4;
                return;
              } else {
                L1: {
                  var9 = ((e) this).field_v[var8];
                  var10 = ((e) this).field_d[var8];
                  if (var10 > var6) {
                    var6 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var9 <= var5) {
                    break L2;
                  } else {
                    var5 = var9;
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
                  var11 = ((e) this).field_B[var8];
                  if (var9 < var2) {
                    var2 = var9;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var11 >= var4) {
                    break L5;
                  } else {
                    var4 = var11;
                    break L5;
                  }
                }
                if (var7 < var11) {
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
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var6 = Transmogrify.field_A ? 1 : 0;
        int var5 = 0;
        if (param3 >= -126) {
            ((e) this).field_h = null;
        }
        while (((e) this).field_M > var5) {
            ((e) this).field_v[var5] = (short)(((e) this).field_v[var5] + param1);
            ((e) this).field_d[var5] = (short)(((e) this).field_d[var5] + param2);
            ((e) this).field_B[var5] = (short)(((e) this).field_B[var5] + param0);
            var5++;
        }
        this.c(10);
    }

    final static String a(long param0, byte param1) {
        v.field_a.setTime(new Date(param0));
        int var3 = v.field_a.get(7);
        int var4 = v.field_a.get(5);
        int var5 = v.field_a.get(2);
        int var6 = v.field_a.get(1);
        int var7 = v.field_a.get(11);
        if (param1 >= -76) {
            String discarded$0 = e.a(-53L, (byte) 59);
        }
        int var8 = v.field_a.get(12);
        int var9 = v.field_a.get(13);
        return bh.field_b[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + jj.field_b[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    public static void b(int param0) {
        field_q = null;
        field_I = null;
        field_x = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Transmogrify.field_A ? 1 : 0;
        for (var6 = 0; var6 < ((e) this).field_M; var6++) {
            ((e) this).field_v[var6] = (short)(param2 * ((e) this).field_v[var6] / param0);
            ((e) this).field_d[var6] = (short)(param3 * ((e) this).field_d[var6] / param0);
            ((e) this).field_B[var6] = (short)(((e) this).field_B[var6] * param4 / param0);
        }
        this.c(param1 ^ -22855);
        if (param1 != -22861) {
            this.c(118);
        }
    }

    private final void c(int param0) {
        ((e) this).field_z = false;
        if (param0 != 10) {
            this.c(93);
        }
    }

    e() {
        ((e) this).field_z = false;
        ((e) this).field_w = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Login: ";
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
