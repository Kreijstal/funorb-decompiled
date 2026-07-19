/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui extends td {
    static String field_p;
    static sna field_r;
    static int field_q;

    ui(int param0, aga param1) {
        super(param0, param1);
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_q = -19;
        }
        field_r = null;
        field_p = null;
    }

    final static void a(byte param0, kv param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kv var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            if (((param1.field_p | param1.field_q | param1.field_t | param1.field_u) & 3) == 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_int = (param1.field_t & 3) + param1.field_q;
                if (param0 == -33) {
                  break L1;
                } else {
                  var10 = (kv) null;
                  ui.a((byte) -45, (kv) null);
                  break L1;
                }
              }
              var3 = param1.field_p + (3 & param1.field_u);
              var2_int = -(3 & var2_int) + (4 + var2_int);
              var3 = 4 - ((var3 & 3) - var3);
              var4 = new int[var2_int * var3];
              var5 = 0;
              var6 = (3 & param1.field_t) - -((3 & param1.field_u) * var2_int);
              var7 = 0;
              L2: while (true) {
                if (param1.field_p <= var7) {
                  param1.field_t = param1.field_t & -4;
                  param1.field_p = var3;
                  param1.field_u = param1.field_u & -4;
                  param1.field_v = var4;
                  param1.field_q = var2_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= param1.field_q) {
                      var6 = var6 + (var2_int - param1.field_q);
                      var7++;
                      continue L2;
                    } else {
                      incrementValue$2 = var6;
                      var6++;
                      incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param1.field_v[incrementValue$3];
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("ui.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        wfa var4 = null;
        ii stackIn_2_0 = null;
        wfa stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wfa stackOut_3_0 = null;
        ii stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = this.field_h.a(75, param0);
            var4 = new wfa(this.field_g, new nq(var3));
            if (param1 == 3) {
              var4.field_o.a(new iv(new nq(var3), false, 1, -var3.field_t, 0), true);
              stackOut_3_0 = (wfa) (var4);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ii) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("ui.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ii) ((Object) stackIn_4_0);
        }
    }

    static {
        field_p = "Kick";
    }
}
