/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr extends oh {
    int[][] field_m;
    String[][] field_n;
    int field_r;
    int field_h;
    static int field_o;
    boolean field_q;
    int field_k;
    static pf field_p;
    int field_i;
    int field_j;
    int field_l;

    final static void a(int param0, int param1, int[] param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = -param0 + 256;
        var5 = 16711935 & param3;
        c.c();
        var6 = 65280 & param3;
        c.a(param2, 0, param2.length);
        c.d();
        L0: while (true) {
          if (!c.a()) {
            if (param1 > -58) {
              gr.a(false, true, 50);
              return;
            } else {
              return;
            }
          } else {
            L1: {
              var7 = c.field_e;
              if (gf.field_i > var7) {
                var7 = gf.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = c.field_a;
              if (gf.field_l >= var8) {
                break L2;
              } else {
                var8 = gf.field_l;
                break L2;
              }
            }
            var9 = (var7 & -8) - (7 & c.field_h);
            var9 = var9 + (8 + (-8 & -var9 + var7));
            var10 = var9 + c.field_h * gf.field_b;
            L3: while (true) {
              if (var8 <= var9) {
                continue L0;
              } else {
                gf.field_h[var10] = we.a(16711935, we.a(16711935, gf.field_h[var10]) * var4 + var5 * param0 >>> 900751112) - -(we.a(we.a(65280, gf.field_h[var10]) * var4 + var6 * param0, 16711680) >>> -724347832);
                var10 += 8;
                var9 += 8;
                continue L3;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 >= -25) {
            bi discarded$0 = gr.a((byte) -99, 47, -15);
            field_p = null;
            return;
        }
        field_p = null;
    }

    final static bi a(byte param0, int param1, int param2) {
        bi var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = new bi(param2, param2);
        var4 = 0;
        if (param0 <= -38) {
          L0: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var3.field_B[var4] = param1;
              var4++;
              continue L0;
            }
          }
        } else {
          field_p = null;
          L1: while (true) {
            if (var3.field_B.length <= var4) {
              return var3;
            } else {
              var3.field_B[var4] = param1;
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
            gf.b();
            og.a(param2, param0);
            return;
        }
        gf.c(0, 0, gf.field_b, gf.field_k, 0, 192);
        og.a(param2, param0);
    }

    gr() {
    }

    static {
    }
}
