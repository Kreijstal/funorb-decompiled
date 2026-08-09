/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends d {
    static String[] field_Q;
    static String field_P;
    int field_I;
    int field_L;
    static long field_N;
    int field_T;
    int field_S;
    static dm field_O;
    int field_M;
    int field_J;
    static int field_K;
    static int field_H;
    static String field_R;

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 113) {
                break L1;
              } else {
                field_R = (String) null;
                break L1;
              }
            }
            if (!param2) {
              stackIn_6_0 = oc.field_s.c(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = hd.field_f.c(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ao.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(int param0, r param1) {
        er var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new er(param1.a("final_frame.jpg", "", 0), (java.awt.Component) ((Object) ne.field_F));
            var3 = var2.field_y;
            var4 = var2.field_t;
            tg.a((byte) -31);
            qn.field_r = new er(var3, param0 * var4 / 4);
            qn.field_r.d();
            var2.c(0, 0);
            lr.field_O = new er(var3, -qn.field_r.field_t + var4);
            lr.field_O.d();
            var2.c(0, -qn.field_r.field_t);
            lr.field_O.field_z = qn.field_r.field_t;
            ln.d(-28558);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ao.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private ao() throws Throwable {
        throw new Error();
    }

    public static void h(int param0) {
        field_O = null;
        field_P = null;
        if (param0 != 0) {
          field_O = (dm) null;
          field_R = null;
          field_Q = null;
          return;
        } else {
          field_R = null;
          field_Q = null;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        r var13 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, (byte) -119, param6)) {
              L1: {
                if (param5 <= -107) {
                  break L1;
                } else {
                  var13 = (r) null;
                  ao.a(41, (r) null);
                  break L1;
                }
              }
              stackIn_18_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = param0 - param1 - this.field_o - this.field_J;
                var9 = param6 + -this.field_t + (-param2 + -this.field_M);
                if (this.field_L * this.field_L <= var9 * var9 + var8_int * var8_int) {
                  break L2;
                } else {
                  L3: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - lb.field_g;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)this.field_S;
                      break L3;
                    } else {
                      if (0.0 < var10) {
                        var10 = var10 + 3.141592653589793 / (double)this.field_S;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_T = (int)((double)this.field_S * var10 / 6.283185307179586);
                  L4: while (true) {
                    if (this.field_T < this.field_S) {
                      L5: while (true) {
                        if ((this.field_T ^ -1) <= -1) {
                          break L2;
                        } else {
                          this.field_T = this.field_T + this.field_S;
                          continue L5;
                        }
                      }
                    } else {
                      this.field_T = this.field_T - this.field_S;
                      continue L4;
                    }
                  }
                }
              }
              stackIn_14_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var8);

            stackIn_21_1 = new StringBuilder().append("ao.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0 != 0;
        } else {
          return stackIn_18_0 != 0;
        }
    }

    static {
        field_Q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = 3;
        field_P = "Show chat (<%0> unread messages)";
        field_R = "<col=ee9d32>The controls</col>";
    }
}
