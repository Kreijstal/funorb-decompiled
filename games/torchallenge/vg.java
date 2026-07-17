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

    final static void a(int param0, int param1, ka param2, int param3, int param4) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var9_int = param2.field_s + (param3 + param1);
            var10 = 30 + param3 + (param2.field_s - -param1);
            var11 = (param2.field_x >> 1) + param2.field_p - -param4;
            qg.a(var9_int, 0, var10, var11);
            param2.b(param3 + -1, -1 + param4, 80);
            param2.b(param3 + -1, 1 + param4, 80);
            qg.b(ck.field_c);
            qg.a(var9_int - -1, 0, 1 + var10, var11);
            param2.b(param3 - -1, -1 + param4, 80);
            param2.b(param3 + 1, param4 + 1, 80);
            qg.b(ck.field_c);
            var9_int = -30 + (param3 + param2.field_u) + (param2.field_s + -param1);
            var10 = -param1 + (param3 + param2.field_s) - -param2.field_u;
            qg.a(var9_int, var11, var10, 480);
            param2.b(-1 + param3, param4 + -1, 80);
            param2.b(param3 - 1, 1 + param4, 80);
            qg.b(ck.field_c);
            qg.a(1 + var9_int, var11, var10 - -1, 480);
            param2.b(1 + param3, param4 + -1, 80);
            param2.b(param3 + 1, param4 + 1, 80);
            qg.b(ck.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var9;
            stackOut_4_1 = new StringBuilder().append("vg.B(").append(80).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 44 + param4 + 44 + 0 + 44 + 30 + 44 + 0 + 44 + 65 + 41);
        }
    }

    private final void a(int param0) {
        ((vg) this).field_v = false;
        if (param0 != 1) {
            ((vg) this).field_o = null;
        }
    }

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 10) {
                if (param1 == -1) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  field_b = null;
                  return false;
                }
              } else {
                if (ba.field_g[var2_int] != param0) {
                  var2_int++;
                  continue L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "vg.D(" + param0 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
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

    public static void c() {
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
