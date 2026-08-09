/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bra extends ofa implements tsa {
    static String[] field_M;
    private rj field_N;
    private rj field_L;
    static iu field_O;

    private final void f(int param0) {
        if (param0 != -25050) {
            this.field_N = (rj) null;
            if (!(this.field_B)) {
                return;
            }
            this.field_B = false;
            return;
        }
        if (!(this.field_B)) {
            return;
        }
        this.field_B = false;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((param2 ^ -1) == -99) {
              if (this.field_L != null) {
                this.field_L.a((ae) (this), false);
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                this.field_N.a((ae) (this), false);
                return true;
              }
            } else {
              if ((param2 ^ -1) == -100) {
                this.field_N.a((ae) (this), false);
                stackIn_9_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param3) {
                    break L1;
                  } else {
                    this.f(-100);
                    break L1;
                  }
                }
                stackIn_13_0 = super.a(param0, param1, param2, true);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("bra.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void i(byte param0) {
        field_O = null;
        field_M = null;
        if (param0 != 86) {
            bra.i((byte) -117);
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4 >= 44) {
              break L0;
            } else {
              field_M = (String[]) null;
              break L0;
            }
          }
          if (param2 == this.field_L) {
            pg.b(false);
            this.f(-25050);
            return;
          } else {
            if (param2 == this.field_N) {
              this.f(-25050);
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("bra.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    bra(jta param0) {
        super(param0, 200, 130);
        ae var2 = null;
        try {
            var2 = new ae(jba.field_l, (qc) null);
            var2.field_m = this.field_m;
            var2.field_i = 0;
            var2.field_p = 80;
            var2.field_n = 50;
            var2.field_r = (isa) ((Object) new vpa(eka.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(var2, -1);
            if (vpa.a(94)) {
                this.field_L = this.a(ae.field_k, (byte) 91, (qc) (this));
            }
            this.field_N = this.a(kh.field_j, (byte) 54, (qc) (this));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bra.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final rj a(String param0, byte param1, qc param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_2_0 = null;
        rj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new rj(param0, param2);
            var4.field_r = (isa) ((Object) new td());
            var5 = this.field_p + -6;
            this.field_p = this.field_p + 38;
            var4.a((byte) -31, -30 + this.field_m, 30, 15, var5);
            this.a(var4, -1);
            this.c((byte) -72);
            if (param1 > 25) {
              stackIn_4_0 = (rj) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (rj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("bra.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_M = new String[255];
    }
}
