/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends dl implements oj, ae {
    static int field_P;
    static int[] field_S;
    private oa field_T;
    static gh field_V;
    private bc field_Q;
    ij field_R;
    private oa field_U;

    private final boolean a(int param0, qn param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        vd var4 = null;
        lh var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(false);
            if (var3 != null) {
              L1: {
                if (param0 > 97) {
                  break L1;
                } else {
                  var5 = (lh) null;
                  this.a(-76, 19, 'ￂ', (lh) null);
                  break L1;
                }
              }
              L2: {
                var4 = var3.a((byte) 21);
                if (var4 != vf.field_b) {
                  stackIn_8_0 = 0;
                  break L2;
                } else {
                  stackIn_8_0 = 1;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("qc.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    public qc() {
        super(0, 0, 496, 0, (qk) null);
        this.field_Q = new bc("", (tn) null, 12);
        cn var1 = new cn(rc.field_m, 0, 0, 0, 0, 16777215, -1, 3, 0, tj.field_e.field_G, -1, 2147483647, true);
        lh var2 = new lh(na.field_h, var1, (tn) null);
        this.field_U = new oa(mb.field_D, (tn) null);
        this.field_T = new oa(tj.field_b, (tn) null);
        this.field_Q.field_v = lc.field_i;
        this.field_Q.a(true, new ei(this.field_Q));
        this.field_U.field_K = false;
        this.field_U.field_p = (qk) ((Object) new kh());
        this.field_T.field_p = (qk) ((Object) new bl());
        this.field_Q.field_p = (qk) ((Object) new ag(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, (byte) -117, var3, 270, 50);
        this.a(var2, -100);
        var3 += 50;
        var3 = var3 + (this.a(170, var3, -95, this.field_Q, bl.field_b, cf.field_s) - -5);
        this.field_U.a(496 + -var5 >> -886189887, (byte) -82, var3, var5, 40);
        this.field_T.a(3 + var4, (byte) -86, 15 + var3, 60, 40);
        this.field_T.field_A = (tn) (this);
        this.field_U.field_A = (tn) (this);
        this.a(this.field_U, -89);
        this.a(this.field_T, -116);
        this.field_R = new ij((oj) (this));
        this.field_R.a(this.field_Q.field_x + (this.field_Q.field_o + 60), (byte) -126, 20, -this.field_Q.field_x + (-this.field_Q.field_o + this.field_x - 60), 150);
        this.a(this.field_R, -103);
        this.a(0, (byte) -123, 0, 496, var4 + 55 + var3);
    }

    public final void a(int param0, String param1) {
        bc var3 = null;
        String var4 = null;
        if (param0 != 20522) {
            return;
        }
        try {
            var3 = this.field_Q;
            var4 = param1;
            ((jf) ((Object) var3)).a(var4, 29597, false);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qc.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void i(int param0) {
        if (!this.h((byte) -100)) {
            return;
        }
        k.a((byte) 120, this.field_Q.field_y);
        if (param0 != 55) {
            this.a((byte) 61);
        }
    }

    public final void a(byte param0) {
        boolean discarded$1 = false;
        qn var3;
        if (param0 != 86) {
          var3 = (qn) null;
          discarded$1 = this.a(45, (qn) null);
          ((ei) ((Object) this.field_Q.a(false))).d(78);
          return;
        } else {
          ((ei) ((Object) this.field_Q.a(false))).d(78);
          return;
        }
    }

    private final boolean h(byte param0) {
        int discarded$1 = 0;
        String var3;
        if (param0 <= -50) {
          if (!this.a(127, (qn) (this.field_Q))) {
            return false;
          } else {
            return true;
          }
        } else {
          var3 = (String) null;
          discarded$1 = this.a((String) null, -50, (lh) null, 71, (String) null, 5, -8);
          if (!this.a(127, (qn) (this.field_Q))) {
            return false;
          } else {
            return true;
          }
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              if (98 == param1) {
                stackIn_6_0 = this.b(param3, 114);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 != (param1 ^ -1)) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b(-11963, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("qc.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, lh param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -68) {
                break L1;
              } else {
                field_V = (gh) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param4, param1, param3, 35, param5, 3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("qc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(String param0, int param1, lh param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ff var9 = null;
        hc var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new hc(20, param1, 120 - -param6, 25, param2, false, 120, param5, tj.field_e, 16777215, param0);
            this.a(var10, param5 ^ -106);
            var9 = new ff(((qn) ((Object) param2)).a(false), param4, 126, var10.field_E + param1, 25 + param6, param3);
            var9.field_A = (tn) (this);
            this.a(var9, -108);
            stackIn_1_0 = var9.field_E + var10.field_E;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var8);

            stackIn_4_1 = new StringBuilder().append("qc.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_1_0;
    }

    public static void j(int param0) {
        field_S = null;
        if (param0 != 60) {
            field_S = (int[]) null;
            field_V = null;
            return;
        }
        field_V = null;
    }

    final void a(int param0, int param1, lh param2, int param3) {
        boolean discarded$1 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, 122, param2, param3);
              this.field_U.field_K = this.h((byte) -103);
              if (param1 > 56) {
                break L1;
              } else {
                discarded$1 = this.h((byte) 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qc.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        try {
            if (this.field_T == param3) {
                il.a(103);
            } else {
                if (!(param3 != this.field_U)) {
                    this.i(55);
                }
            }
            int var6_int = -2 % ((-85 - param1) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "qc.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_S = new int[]{40, 150, 135, 40, 85, 75, 70, 30, 0, 70, 100, 90};
    }
}
