/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    short[] field_w;
    int[] field_A;
    int[] field_y;
    int field_e;
    short field_d;
    int[] field_J;
    int[] field_o;
    short[] field_t;
    short[] field_D;
    int[] field_E;
    static String[][] field_b;
    short field_x;
    int field_N;
    short[] field_F;
    short[] field_q;
    int field_h;
    short[] field_f;
    int field_B;
    int field_p;
    short field_c;
    short[] field_L;
    short[] field_r;
    short[] field_G;
    byte field_s;
    short[] field_n;
    int[] field_a;
    short[] field_m;
    short[] field_i;
    int[] field_u;
    int[] field_C;
    byte[] field_z;
    short[] field_g;
    int field_K;
    short[] field_M;
    private boolean field_v;
    short[] field_j;
    int[] field_l;
    short[] field_H;
    short[] field_k;
    short[] field_I;

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param0 < 67) {
          ((vg) this).field_s = (byte) 40;
          var5 = 0;
          L0: while (true) {
            if (((vg) this).field_d <= var5) {
              this.a(1);
              return;
            } else {
              ((vg) this).field_g[var5] = (short)(((vg) this).field_g[var5] + param1);
              ((vg) this).field_t[var5] = (short)(((vg) this).field_t[var5] + param3);
              ((vg) this).field_q[var5] = (short)(((vg) this).field_q[var5] + param2);
              var5++;
              continue L0;
            }
          }
        } else {
          var5 = 0;
          L1: while (true) {
            if (((vg) this).field_d <= var5) {
              this.a(1);
              return;
            } else {
              ((vg) this).field_g[var5] = (short)(((vg) this).field_g[var5] + param1);
              ((vg) this).field_t[var5] = (short)(((vg) this).field_t[var5] + param3);
              ((vg) this).field_q[var5] = (short)(((vg) this).field_q[var5] + param2);
              var5++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        for (var6 = 0; ((vg) this).field_d > var6; var6++) {
            ((vg) this).field_g[var6] = (short)(param0 * ((vg) this).field_g[var6] / param4);
            ((vg) this).field_t[var6] = (short)(param1 * ((vg) this).field_t[var6] / param4);
            ((vg) this).field_q[var6] = (short)(param3 * ((vg) this).field_q[var6] / param4);
        }
        this.a(param2);
    }

    final static void a(int param0, int param1, ka param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var9 = param2.field_s + (param3 + (param1 - param7));
        var10 = param6 + param3 + (param2.field_s - -param1);
        var11 = (param2.field_x >> 606002657) + param2.field_p - -param4;
        qg.a(var9, 0, var10, param5 + var11);
        param2.b(param3 + -1, -1 + param4, param0);
        param2.b(param3 + -1, 1 + param4, param0);
        qg.b(ck.field_c);
        qg.a(var9 - -1, 0, 1 + var10, var11 - -param5);
        param2.b(param3 - -1, -1 + param4, param0);
        param2.b(param3 + 1, param4 + 1, param0);
        qg.b(ck.field_c);
        var9 = -param6 + (param3 + param2.field_u) + (param2.field_s + -param1);
        var10 = -param1 + (param3 + param2.field_s) - (-param2.field_u - -param7);
        qg.a(var9, var11 - param5, var10, 480);
        if (param8 <= 56) {
          return;
        } else {
          param2.b(-1 + param3, param4 + -1, param0);
          param2.b(param3 - 1, 1 + param4, param0);
          qg.b(ck.field_c);
          qg.a(1 + var9, var11 - param5, var10 - -1, 480);
          param2.b(1 + param3, param4 + -1, param0);
          param2.b(param3 + 1, param4 + 1, param0);
          qg.b(ck.field_c);
          return;
        }
    }

    private final void a(int param0) {
        ((vg) this).field_v = false;
        if (param0 != 1) {
            ((vg) this).field_o = null;
        }
    }

    final static boolean a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (-11 >= (var2 ^ -1)) {
            if (param1 != -1) {
              field_b = null;
              return false;
            } else {
              return false;
            }
          } else {
            if (ba.field_g[var2] != param0) {
              var2++;
              continue L0;
            } else {
              return true;
            }
          }
        }
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
        var12 = TorChallenge.field_F ? 1 : 0;
        if (!((vg) this).field_v) {
          ((vg) this).field_v = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L0: while (true) {
            if (((vg) this).field_d <= var8) {
              ((vg) this).field_K = var3;
              ((vg) this).field_N = var6;
              ((vg) this).field_p = var2;
              ((vg) this).field_B = var7;
              if (param0 < -88) {
                ((vg) this).field_h = var4;
                ((vg) this).field_e = var5;
                return;
              } else {
                ((vg) this).field_o = null;
                ((vg) this).field_h = var4;
                ((vg) this).field_e = var5;
                return;
              }
            } else {
              L1: {
                var9 = ((vg) this).field_g[var8];
                var10 = ((vg) this).field_t[var8];
                if (var9 > var5) {
                  var5 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var6 < var10) {
                  var6 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var2 <= var9) {
                  break L3;
                } else {
                  var2 = var9;
                  break L3;
                }
              }
              L4: {
                if (var10 < var3) {
                  var3 = var10;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var11 = ((vg) this).field_q[var8];
                if (var11 > var7) {
                  var7 = var11;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (var11 < var4) {
                var4 = var11;
                var8++;
                var8++;
                continue L0;
              } else {
                var8++;
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 606002657) {
            return;
        }
        field_b = null;
    }

    vg() {
        ((vg) this).field_s = (byte) 0;
        ((vg) this).field_v = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[][]{new String[2], new String[2]};
    }
}
