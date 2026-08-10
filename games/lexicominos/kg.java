/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends nb implements ue, jk {
    private u field_F;
    private bc field_B;
    static hk field_G;
    private kf field_E;
    static int field_C;

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 215535458) {
                break L1;
              } else {
                discarded$1 = this.h(-91);
                break L1;
              }
            }
            if (this.field_E == param4) {
              jc.a((byte) 95);
              this.field_F.g(true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("kg.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    kg(u param0) {
        super(0, 0, 288, 0, (rd) null);
        String var7 = null;
        int var3 = 0;
        ik var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_F = param0;
            this.field_E = new kf(n.field_h, (vd) null);
            this.field_E.field_i = (rd) ((Object) new v());
            var7 = da.a(new String[]{this.e(true), this.h(-6724)}, ol.field_p, false);
            var3 = 20;
            var4 = new ik(ql.field_Q, 0, 0, 0, 0, 16777215, -1, 3, 0, ql.field_Q.field_E, -1, 2147483647, true);
            this.field_B = new bc(var7, var4);
            this.field_B.field_q = "";
            this.field_B.a(wc.field_b, 0, -27371);
            this.field_B.a(wc.field_b, 1, -27371);
            this.field_B.field_j = -40 + this.field_j;
            this.field_B.field_r = (vd) (this);
            this.field_B.b(26, var3, -2, this.field_j - 40);
            var3 = var3 + (this.field_B.field_v - -15);
            this.b((byte) 87, this.field_B);
            var5 = 4;
            var6 = 200;
            this.field_E.a(40, var6, true, var3, 300 + -var6 >> -1907982335);
            this.field_E.field_r = (vd) (this);
            this.b((byte) -127, this.field_E);
            this.a(var5 + (55 + var3), 300, true, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String h(int param0) {
        if (param0 != -6724) {
            return (String) null;
        }
        return "</col></u>";
    }

    final static String g(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        return ig.field_a.c(false);
    }

    public final void a(int param0, bc param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 > 50) {
              break L0;
            } else {
              field_C = 110;
              break L0;
            }
          }
          if (param2 == 0) {
            jl.a("terms.ws", (byte) -95);
            return;
          } else {
            if ((param2 ^ -1) != -2) {
              if (-3 == (param2 ^ -1)) {
                jl.a("conduct.ws", (byte) 127);
                return;
              } else {
                return;
              }
            } else {
              jl.a("privacy.ws", (byte) 102);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("kg.IA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        if (param0 != 300) {
            return;
        }
        field_G = null;
    }

    private final String e(boolean param0) {
        if (!param0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, (byte) -87)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = -81 % ((-13 - param3) / 55);
              if (param1 == 98) {
                stackIn_7_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 != param1) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("kg.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    static {
        field_C = 480;
    }
}
