/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qg {
    qfa field_b;
    static soa field_a;

    public static void c(int param0) {
        field_a = null;
        if (param0 != -15081) {
            field_a = (soa) null;
        }
    }

    abstract void a(int param0);

    abstract void a(boolean param0, boolean param1);

    abstract void a(boolean param0, int param1);

    final static int a(slb param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!param1) {
              if (param0 == qcb.field_q) {
                stackOut_13_0 = 5890;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 4;
                break L0;
              } else {
                if (param0 != tma.field_q) {
                  if (param0 != pja.field_l) {
                    if (param0 != pea.field_d) {
                      throw new IllegalArgumentException();
                    } else {
                      stackOut_11_0 = 34166;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackOut_8_0 = 34168;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackOut_5_0 = 34167;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 104;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("qg.I(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    abstract boolean b(int param0);

    qg(qfa param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "qg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, byte param1, pib param2);

    static {
        vja discarded$0 = new vja();
    }
}
