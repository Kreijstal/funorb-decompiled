/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends td {
    static String field_p;

    final static hba a(lu param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        hba stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        hba stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 0;
            stackOut_0_0 = new hba(param1, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("nh.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + -116 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, jc param1) {
        try {
            param1.field_o = new char[]{'?'};
            param1.field_q = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nh.D(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 != 98) {
            return;
        }
        field_p = null;
    }

    final static void b(int param0) {
        nla.field_f = false;
        int var1 = 50 % ((param0 - -71) / 47);
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        lk var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        lk stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var9 = ((nh) this).field_h.a(25, param0);
              var4 = new lk(((nh) this).field_g, new nq(var9));
              var5 = 0;
              if (param1 == 3) {
                break L1;
              } else {
                nh.c((byte) 56);
                break L1;
              }
            }
            L2: while (true) {
              if (var5 >= param0.field_z) {
                stackOut_11_0 = (lk) var4;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var6 = 0;
                L3: while (true) {
                  if (var6 >= param0.field_B) {
                    var5++;
                    continue L2;
                  } else {
                    L4: {
                      if (null != param0.field_a[var5][var6].field_l) {
                        var7 = param0.field_a[var5][var6].field_l;
                        var4.field_o.a((bw) (Object) new iv(new nq(var7), false, 1, 0, 17), true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("nh.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_12_0;
    }

    nh(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Enter name of player to add to list";
    }
}
