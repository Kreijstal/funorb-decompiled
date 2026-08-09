/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ga implements el {
    static int field_S;
    private rg field_P;
    static int[] field_T;
    static double[] field_R;
    static int field_H;
    private rg field_Q;
    static int field_L;
    private rg field_O;

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_P != param3) {
                if (param3 == this.field_O) {
                  jl.a((byte) -124);
                  break L1;
                } else {
                  if (param3 == this.field_Q) {
                    bd.a(1849965346);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                rk.b((byte) 120);
                break L1;
              }
            }
            if (param0 >= 68) {
              break L0;
            } else {
              field_H = -89;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("tg.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
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
            if (super.a(param0, (byte) -115, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 == 98) {
                stackIn_7_0 = this.c(param0, 32);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = 39 / ((param1 - 47) / 43);
                if (param2 != 99) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(17731, param0);
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

            stackIn_15_1 = new StringBuilder().append("tg.Q(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    public tg() {
        super(0, 0, 476, 225, (fe) null);
        this.field_O = new rg(ej.field_c, (uk) null);
        this.field_P = new rg(qn.field_m, (uk) null);
        this.field_Q = new rg(ug.field_cb, (uk) null);
        je var1 = new je();
        this.field_O.field_n = (fe) ((Object) var1);
        this.field_P.field_n = (fe) ((Object) var1);
        this.field_Q.field_n = (fe) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -286888095;
        this.field_P.a(-110, var4, -48 + this.field_z + -var2, 30, -var3 + this.field_F >> -691989247);
        this.field_Q.a(-128, var4, -48 + this.field_z + -var2, 30, (-var3 + this.field_F >> 1594002753) + (var4 + var2));
        this.field_O.a(-111, var3, -78 + this.field_z + -(2 * var2), 30, this.field_F - var3 >> 989213633);
        this.field_P.field_t = (uk) (this);
        this.field_O.field_t = (uk) (this);
        this.field_O.field_C = eh.field_eb;
        this.field_Q.field_t = (uk) (this);
        this.field_Q.field_C = nl.field_a;
        this.b(this.field_P, 10);
        this.b(this.field_O, 10);
        this.b(this.field_Q, 10);
    }

    public static void g(byte param0) {
        field_T = null;
        if (param0 <= 123) {
            field_S = 121;
            field_R = null;
            return;
        }
        field_R = null;
    }

    final static void a(byte param0) {
        if (param0 > -120) {
            field_H = 85;
            eb.a((byte) -122);
            return;
        }
        eb.a((byte) -122);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        if (param2 < 36) {
          field_R = (double[]) null;
          var5 = this.field_q - -param3;
          var6 = this.field_m + param0;
          gm.field_cb.a(gb.field_c, 20 + var5, var6 + 20, -40 + this.field_F, -50 + this.field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
          super.a(param0, param1, (byte) 86, param3);
          return;
        } else {
          var5 = this.field_q - -param3;
          var6 = this.field_m + param0;
          gm.field_cb.a(gb.field_c, 20 + var5, var6 + 20, -40 + this.field_F, -50 + this.field_z, 16777215, -1, 1, 0, gm.field_cb.field_C);
          super.a(param0, param1, (byte) 86, param3);
          return;
        }
    }

    static {
        field_S = -1;
        field_T = new int[8192];
        field_R = new double[]{0.2, 0.2, 0.2, 0.06};
        field_L = 640;
    }
}
