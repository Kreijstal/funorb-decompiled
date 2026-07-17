/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static int field_a;
    static String[] field_b;

    final static se a(long param0, boolean param1, String param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        tn stackIn_6_0 = null;
        wd stackIn_8_0 = null;
        jb stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_7_0 = null;
        tn stackOut_5_0 = null;
        jb stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != 0L) {
                break L1;
              } else {
                if (param2 != null) {
                  stackOut_7_0 = new wd(param2, param3);
                  stackIn_8_0 = stackOut_7_0;
                  return (se) (Object) stackIn_8_0;
                } else {
                  break L1;
                }
              }
            }
            if (param1) {
              stackOut_5_0 = new tn(param0, param3);
              stackIn_6_0 = stackOut_5_0;
              return (se) (Object) stackIn_6_0;
            } else {
              stackOut_9_0 = new jb(param0, param3);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ds.C(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 41);
        }
        return (se) (Object) stackIn_10_0;
    }

    final static void a(int param0) {
        if (param0 > 33) {
          aa.field_a[0] = (ah) (Object) new fe(81920, 61440);
          aa.field_a[0].field_I = ki.field_f;
          aa.field_a[0].field_t = hc.field_f;
          aa.field_a[0].field_y = iv.field_i;
          aa.field_a[0].c((byte) 35);
          fa.field_b = 250;
          if (bw.field_d) {
            bw.field_d = false;
            fa.field_b = fa.field_b * 2;
            return;
          } else {
            return;
          }
        } else {
          ds.a(-65);
          aa.field_a[0] = (ah) (Object) new fe(81920, 61440);
          aa.field_a[0].field_I = ki.field_f;
          aa.field_a[0].field_t = hc.field_f;
          aa.field_a[0].field_y = iv.field_i;
          aa.field_a[0].c((byte) 35);
          fa.field_b = 250;
          if (!bw.field_d) {
            return;
          } else {
            bw.field_d = false;
            fa.field_b = fa.field_b * 2;
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -1) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
