/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh implements bf {
    private vd field_b;
    static String field_i;
    private int field_f;
    static String field_h;
    private int field_j;
    private int field_d;
    static uh field_e;
    private int field_a;
    private int field_c;
    private int field_g;

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        vb var12 = null;
        ub stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        ub stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof vb)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (ub) ((Object) stackOut_3_0);
                break L1;
              } else {
                stackOut_2_0 = (ub) (param2);
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (vb) ((Object) stackIn_4_0);
              ed.c(param2.field_o + param0, param1 + param2.field_l, param2.field_r, param2.field_n, this.field_a);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = -(2 * var12.field_G) + param2.field_r;
            var8 = var12.field_G + (param2.field_o + param0);
            if (param3) {
              var9 = param2.field_l + param1 - -var12.field_J;
              ed.e(var8, var9, var8 - -var7, var9, this.field_j);
              var10 = -1 + var12.d(0);
              L3: while (true) {
                if (-1 < (var10 ^ -1)) {
                  if (this.field_b != null) {
                    this.field_b.b(var12.field_k, var8 - -(var7 / 2), var12.field_J + var9 + this.field_b.field_E, this.field_c, this.field_g);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  ed.a(var12.b(-10455, var10) * var7 / var12.e(1) + var8, var9, this.field_d, this.field_f);
                  var10--;
                  continue L3;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("eh.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 2) {
            eh.b(-17);
            field_e = null;
            field_i = null;
            return;
        }
        field_e = null;
        field_i = null;
    }

    eh(vd param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_d = param5;
            this.field_g = param2;
            this.field_j = param3;
            this.field_f = param6;
            this.field_c = param1;
            this.field_b = param0;
            this.field_a = param4;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "eh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static long a(int param0) {
        if (param0 != 2) {
            field_e = (uh) null;
            return d.a((byte) 75) + -eg.field_C;
        }
        return d.a((byte) 75) + -eg.field_C;
    }

    static {
        field_h = "Email is valid";
        field_e = null;
        field_i = " </col>Stage:<col=ffff00>";
    }
}
