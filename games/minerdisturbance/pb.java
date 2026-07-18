/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    int[] field_o;
    int[] field_k;
    short field_I;
    short[] field_P;
    short[] field_M;
    short[] field_d;
    int field_h;
    int field_H;
    short[] field_C;
    short[] field_F;
    short[] field_f;
    int[] field_S;
    short[] field_u;
    short[] field_a;
    int field_v;
    short[] field_Q;
    short[] field_G;
    short[] field_B;
    int[] field_b;
    short[] field_w;
    private boolean field_t;
    int[] field_p;
    int field_j;
    int[] field_N;
    short[] field_O;
    short field_g;
    byte[] field_x;
    short[] field_q;
    short[] field_s;
    int[] field_D;
    short[] field_e;
    byte field_E;
    int[] field_L;
    short[] field_n;
    int[] field_m;
    static String field_z;
    short field_y;
    int field_J;
    int field_l;
    static String field_A;
    static ae field_c;
    short[] field_i;
    static int field_K;
    static String[][] field_R;
    static bj field_r;

    private final void b(int param0) {
        if (param0 != 0) {
            ((pb) this).field_v = -28;
        }
        ((pb) this).field_t = false;
    }

    final static void d(int param0) {
        jg.a(qf.field_r, km.field_b, -115, true);
        int var1 = 108 / ((param0 - -30) / 55);
        oh.field_F = true;
    }

    final static int b(boolean param0) {
        if (!fh.field_d) {
            if (ld.field_w <= hk.field_e) {
                if (qn.field_K + ld.field_w > hk.field_e) {
                    return se.field_K;
                }
            }
        }
        field_A = null;
        return -1;
    }

    final static ln a(String param0, bj param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ln stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param1.a(127, param0);
            var5 = param1.a(param2, var4_int, -76);
            stackOut_0_0 = ac.a(23917, param1, var4_int, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("pb.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + -77 + ')');
        }
        return stackIn_1_0;
    }

    final void a(boolean param0) {
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var12 = MinerDisturbance.field_ab;
        if (!((pb) this).field_t) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (!param0) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((pb) this).field_t = stackIn_5_1 != 0;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (((pb) this).field_y <= var8) {
              ((pb) this).field_H = var2;
              ((pb) this).field_j = var4;
              ((pb) this).field_J = var7;
              ((pb) this).field_v = var5;
              ((pb) this).field_h = var3;
              ((pb) this).field_l = var6;
              return;
            } else {
              L2: {
                var9 = ((pb) this).field_n[var8];
                var10 = ((pb) this).field_M[var8];
                if (var10 <= var6) {
                  break L2;
                } else {
                  var6 = var10;
                  break L2;
                }
              }
              L3: {
                var11 = ((pb) this).field_Q[var8];
                if (var9 <= var5) {
                  break L3;
                } else {
                  var5 = var9;
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
                if (var2 > var9) {
                  var2 = var9;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var11 < var4) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var7 < var11) {
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

    final static void a(int param0) {
        mb.field_b.n(21974);
        if (bd.field_e == null) {
            bd.field_e = new jl(mb.field_b, ic.field_i);
        }
        int var1 = 67 / ((-18 - param0) / 56);
        mb.field_b.b(1, (fe) (Object) bd.field_e);
    }

    public static void c(int param0) {
        field_R = null;
        field_r = null;
        field_A = null;
        int var1 = -27;
        field_z = null;
        field_c = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        for (var5 = param2; var5 < ((pb) this).field_y; var5++) {
            ((pb) this).field_n[var5] = (short)(((pb) this).field_n[var5] + param3);
            ((pb) this).field_M[var5] = (short)(((pb) this).field_M[var5] + param1);
            ((pb) this).field_Q[var5] = (short)(((pb) this).field_Q[var5] + param0);
        }
        this.b(0);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        if (param4 != -81) {
            ((pb) this).a(21, -115, 39, 65);
        }
        for (var6 = 0; var6 < ((pb) this).field_y; var6++) {
            ((pb) this).field_n[var6] = (short)(((pb) this).field_n[var6] * param1 / param0);
            ((pb) this).field_M[var6] = (short)(((pb) this).field_M[var6] * param3 / param0);
            ((pb) this).field_Q[var6] = (short)(((pb) this).field_Q[var6] * param2 / param0);
        }
        this.b(param4 ^ -81);
    }

    pb() {
        ((pb) this).field_t = false;
        ((pb) this).field_E = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "You have <%0> unread messages!";
        field_z = "Tragically Molten";
        field_c = new ae();
        field_R = new String[][]{new String[1]};
    }
}
