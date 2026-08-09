/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends kn {
    static int field_V;
    private int field_N;
    private int field_W;
    private String field_R;
    static String field_O;
    static int[] field_P;
    static String field_T;
    private boolean field_S;
    private int field_U;
    private lh field_Q;

    public static void c(boolean param0) {
        field_O = null;
        if (param0) {
            kg.b(false);
            field_P = null;
            field_T = null;
            return;
        }
        field_P = null;
        field_T = null;
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = Chess.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!kf.d(18954)) {
                L2: {
                  nj.field_u.a(qn.a((byte) 107, re.field_m, ag.field_f), 99, qn.a((byte) 107, hn.field_k, rf.field_b));
                  if (nj.field_u.d((byte) 55)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (param0) {
                  L3: {
                    var2 = 0;
                    if (var1_int == 0) {
                      break L3;
                    } else {
                      if (nj.field_u.field_h >= 0) {
                        var2 = eh.field_L[nj.field_u.field_h];
                        if (var2 == 2) {
                          um.a(5);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_19_0 = var2;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = -38;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                nj.field_u.c((byte) 123);
                if (nj.field_u.d((byte) 66)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "kg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_19_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_5_0 = 0;
        lh stackIn_7_0;
        String stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int stackIn_7_4;
        int stackIn_7_5;
        int stackIn_7_6;
        int stackIn_7_7;
        lh stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_15_0 = 0;
        lh stackIn_17_0;
        String stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_17_5;
        int stackIn_17_6;
        int stackIn_17_7;
        lh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        var5 = param3 + this.field_u;
        var6 = param0 + this.field_r;
        super.a(param0, param1, -96, param3);
        if (param2 < -80) {
          if (0 != param1) {
            return;
          } else {
            L0: {
              if (this.field_S) {
                stackIn_15_0 = this.field_y - (this.field_W - -(2 * this.field_N));
                break L0;
              } else {
                stackIn_15_0 = 0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_15_0;
              stackIn_17_0 = this.field_Q;

              stackIn_17_1 = this.field_R;

              stackIn_17_2 = var5 + (var7 - -this.field_N);

              stackIn_17_3 = var6 + this.field_N;

              stackIn_17_4 = this.field_W + -this.field_N;

              stackIn_17_5 = -(2 * this.field_N) + this.field_C;

              stackIn_17_6 = this.field_U;

              stackIn_17_7 = -1;

              if (!this.field_S) {
                stackIn_18_0 = (lh) ((Object) stackIn_17_0);
                stackIn_18_1 = (String) ((Object) stackIn_17_1);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = stackIn_17_4;
                stackIn_18_5 = stackIn_17_5;
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 2;
                break L1;
              } else {
                stackIn_18_0 = (lh) ((Object) stackIn_17_0);
                stackIn_18_1 = (String) ((Object) stackIn_17_1);
                stackIn_18_2 = stackIn_17_2;
                stackIn_18_3 = stackIn_17_3;
                stackIn_18_4 = stackIn_17_4;
                stackIn_18_5 = stackIn_17_5;
                stackIn_18_6 = stackIn_17_6;
                stackIn_18_7 = stackIn_17_7;
                stackIn_18_8 = 0;
                break L1;
              }
            }
            ((lh) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, 1, this.field_Q.field_C);
            return;
          }
        } else {
          this.field_N = -28;
          if (0 != param1) {
            return;
          } else {
            L2: {
              if (this.field_S) {
                stackIn_5_0 = this.field_y - (this.field_W - -(2 * this.field_N));
                break L2;
              } else {
                stackIn_5_0 = 0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_5_0;
              stackIn_7_0 = this.field_Q;

              stackIn_7_1 = this.field_R;

              stackIn_7_2 = var5 + (var7 - -this.field_N);

              stackIn_7_3 = var6 + this.field_N;

              stackIn_7_4 = this.field_W + -this.field_N;

              stackIn_7_5 = -(2 * this.field_N) + this.field_C;

              stackIn_7_6 = this.field_U;

              stackIn_7_7 = -1;

              if (!this.field_S) {
                stackIn_8_0 = (lh) ((Object) stackIn_7_0);
                stackIn_8_1 = (String) ((Object) stackIn_7_1);
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = stackIn_7_5;
                stackIn_8_6 = stackIn_7_6;
                stackIn_8_7 = stackIn_7_7;
                stackIn_8_8 = 2;
                break L3;
              } else {
                stackIn_8_0 = (lh) ((Object) stackIn_7_0);
                stackIn_8_1 = (String) ((Object) stackIn_7_1);
                stackIn_8_2 = stackIn_7_2;
                stackIn_8_3 = stackIn_7_3;
                stackIn_8_4 = stackIn_7_4;
                stackIn_8_5 = stackIn_7_5;
                stackIn_8_6 = stackIn_7_6;
                stackIn_8_7 = stackIn_7_7;
                stackIn_8_8 = 0;
                break L3;
              }
            }
            ((lh) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5, stackIn_8_6, stackIn_8_7, stackIn_8_8, 1, this.field_Q.field_C);
            return;
          }
        }
    }

    kg(int param0, int param1, int param2, int param3, mf param4, boolean param5, int param6, int param7, lh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (jm) null, (rg) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_M = param4;
              this.field_R = param10;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((kg) (this)).field_S = stackIn_4_1 != 0;
              this.field_N = param7;
              this.field_U = param9;
              this.field_Q = param8;
              this.field_W = param6;
              var12_int = this.field_W + -this.field_N;
              var13 = this.field_Q.b(param10, var12_int, this.field_Q.field_C) - -(2 * this.field_N);
              if (var13 > param3) {
                this.a(param1, 34, var13, param2, param0);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (this.field_S) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_N * 2 + this.field_W;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_M.a(this.field_N + (-param3 + var13 >> 1367539777), 34, param3 + -(2 * this.field_N), -this.field_W + (param2 + -(3 * this.field_N)), var14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("kg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
        }
    }

    final String g(int param0) {
        int var2 = this.field_M.field_w ? 1 : 0;
        this.field_M.field_w = this.field_w;
        String var3 = this.field_M.g(param0);
        this.field_M.field_w = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_T = "Passwords must be between 5 and 20 characters long";
        field_P = new int[5];
    }
}
