/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ob {
    static nl field_L;
    static String field_H;
    static int[] field_J;
    static dd[] field_K;
    static int field_I;

    og(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    public static void f(byte param0) {
        if (param0 >= -85) {
          og.f((byte) -111);
          field_K = null;
          field_L = null;
          field_J = null;
          field_H = null;
          return;
        } else {
          field_K = null;
          field_L = null;
          field_J = null;
          field_H = null;
          return;
        }
    }

    final static void a(java.awt.Frame param0, sj param1, int param2) {
        le var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 24442) {
                break L1;
              } else {
                var4 = null;
                og.a((java.awt.Frame) null, (sj) null, 107);
                break L1;
              }
            }
            L2: while (true) {
              var3 = param1.a(param0, false);
              L3: while (true) {
                if (-1 != var3.field_f) {
                  if (-2 == var3.field_f) {
                    param0.setVisible(false);
                    param0.dispose();
                    break L0;
                  } else {
                    cf.a(-96, 100L);
                    continue L2;
                  }
                } else {
                  cf.a(-108, 10L);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("og.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    final int b(byte param0, int param1) {
        if (param0 == 6) {
          if (((og) this).field_h.length + -1 <= param1) {
            return ((og) this).field_x + param1 * ((og) this).field_s;
          } else {
            return ((og) this).field_x + param1 * (-8 + ((og) this).field_s);
          }
        } else {
          field_H = null;
          if (((og) this).field_h.length + -1 <= param1) {
            return ((og) this).field_x + param1 * ((og) this).field_s;
          } else {
            return ((og) this).field_x + param1 * (-8 + ((og) this).field_s);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Offer unrated rematch";
        field_J = new int[]{62, 20, 21, 49, 5, 3, 61};
        field_L = new nl();
    }
}
