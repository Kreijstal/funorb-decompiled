/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends ma {
    static int field_u;
    static String field_p;
    static ba field_n;
    int field_s;
    int field_v;
    static int field_o;
    int field_l;
    static vh field_w;
    int field_t;
    int field_m;
    int field_r;
    int[] field_q;

    final static void a(uf param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        qe var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            L1: {
              var6 = param0.field_I.j(param1 + 16848);
              var7 = var6;
              if (param1 == -16813) {
                break L1;
              } else {
                field_w = (vh) null;
                break L1;
              }
            }
            L2: {
              var3 = param0.i(-1) ? 1 : 0;
              if ((hq.field_c & param0.field_L) != 0) {
                if (var3 != 0) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_8_0;
              if ((hq.field_c & param0.field_L) != 0) {
                if (var3 == 0) {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = 1;
                stackIn_14_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              L5: {
                var5 = stackIn_14_0;
                if (var4 == 0) {
                  break L5;
                } else {
                  if (var7.c(true)) {
                    rb.a(nr.a(new String[]{param0.field_I.field_h[var6.field_L]}, -1, ka.field_u), dq.field_a.a((byte) 99, 1), dq.field_a.a((byte) 120, 0), 40, 2, 1);
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 == 0) {
                  break L6;
                } else {
                  if (!var7.a(-110)) {
                    break L6;
                  } else {
                    rb.a(nr.a(new String[]{param0.field_I.field_h[var6.field_L]}, -1, ml.field_g), rl.field_i, jf.field_q, param1 + 16877, 16, 8);
                    return;
                  }
                }
              }
              if (var5 == 0) {
                break L4;
              } else {
                if (var7.c((byte) 91)) {
                  rb.a(nr.a(new String[]{param0.field_I.field_h[(1 + var7.field_L) % param0.field_I.field_n]}, -1, ml.field_g), rl.field_i, jf.field_q, -122, 64, 32);
                  return;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("tn.C(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        RuntimeException runtimeException = null;
        int[] var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_t = param2;
              this.field_l = param1;
              this.field_m = param5;
              this.field_v = param0;
              this.field_s = param7;
              this.field_r = param3;
              this.field_q = param6;
              if (param4 <= -42) {
                break L1;
              } else {
                var10 = (int[]) null;
                this.a(-126, -20, -108, -2, -31, -56, (int[]) null, -107);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("tn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param7 + ')');
        }
    }

    public static void c(byte param0) {
        field_p = null;
        field_w = null;
        if (param0 <= 4) {
            return;
        }
        field_n = null;
    }

    tn() {
    }

    static {
        field_p = "Cannot put the cue there! Try raising it.";
        field_u = 0;
    }
}
