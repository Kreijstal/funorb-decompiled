/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends java.awt.Canvas {
    static String field_a;
    private java.awt.Component field_b;
    static String field_e;
    static int[] field_d;
    static int field_c;

    public static void a(int param0) {
        int var1 = 26;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((hd) this).field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hd.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (!lb.b((byte) -35, param0)) {
              if (aa.a(1, param0)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                if (!ol.a((byte) -7, param0)) {
                  if (param2.length() == 0) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  } else {
                    if (!lg.a(0, param0, param2)) {
                      if (lf.a(param0, (byte) 37, param2)) {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0 != 0;
                      } else {
                        if (!param1) {
                          if (!pi.a(-91, param0, param2)) {
                            stackOut_27_0 = 1;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0 != 0;
                          }
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        }
                      }
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    }
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("hd.B(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          L2: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L2;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
        return stackIn_28_0 != 0;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((hd) this).field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hd.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    hd(java.awt.Component param0) {
        try {
            ((hd) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Triple shot";
        field_d = new int[8192];
    }
}
