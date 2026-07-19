/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc implements ml {
    private int field_h;
    private int field_d;
    private int field_c;
    static int field_a;
    private int field_j;
    static int[] field_b;
    static int[][] field_e;
    private int field_k;
    static String field_i;
    private ta field_f;
    private int field_g;

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        we var12 = null;
        qj var13 = null;
        we stackIn_4_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        we stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof qj)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (we) ((Object) stackOut_3_0);
                break L1;
              } else {
                stackOut_2_0 = (we) (param1);
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var13 = (qj) ((Object) stackIn_4_0);
              if (param4 >= 19) {
                break L2;
              } else {
                var12 = (we) null;
                this.a(false, (we) null, 106, 30, 56);
                break L2;
              }
            }
            L3: {
              ge.d(param3 - -param1.field_r, param1.field_e + param2, param1.field_l, param1.field_p, this.field_g);
              if (var13 == null) {
                break L3;
              } else {
                break L3;
              }
            }
            var7 = -(2 * var13.field_B) + param1.field_l;
            var8 = var13.field_B + param1.field_r + param3;
            var9 = var13.field_F + (param1.field_e + param2);
            ge.e(var8, var9, var8 - -var7, var9, this.field_k);
            var10 = -1 + var13.a(true);
            L4: while (true) {
              L5: {
                L6: {
                  if ((var10 ^ -1) > -1) {
                    break L6;
                  } else {
                    ge.f(var13.a(false, var10) * var7 / var13.k(-64) + var8, var9, this.field_h, this.field_d);
                    var10--;
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                if (null != this.field_f) {
                  break L5;
                } else {
                  return;
                }
              }
              this.field_f.a(var13.field_s, var7 / 2 + var8, this.field_f.field_t + (var9 - -var13.field_F), this.field_j, this.field_c);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("mc.C(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        le var2 = null;
        field_e = (int[][]) null;
        field_b = null;
        if (param0 >= -49) {
          var2 = (le) null;
          mc.a(0, (le) null);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    final static void a(int param0, le param1) {
        try {
            if (param0 != -8497) {
                mc.a(100);
            }
            vf.a((byte) 109);
            ge.a(param1.field_s, param1.field_m, param1.field_n);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    mc(ta param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_f = param0;
            this.field_c = param2;
            this.field_d = param6;
            this.field_k = param3;
            this.field_h = param5;
            this.field_g = param4;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "mc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_b = new int[11];
        field_i = "You have 1 unread message!";
    }
}
