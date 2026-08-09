/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static int field_a;
    static String[] field_b;

    final static se a(long param0, boolean param1, String param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        tn stackIn_8_0 = null;
        wd stackIn_10_0 = null;
        jb stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param4) {
                break L1;
              } else {
                ds.a((byte) 100);
                break L1;
              }
            }
            L2: {
              if (param0 != 0L) {
                break L2;
              } else {
                if (param2 != null) {
                  stackIn_10_0 = new wd(param2, param3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            if (param1) {
              stackIn_8_0 = new tn(param0, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_12_0 = new jb(param0, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ds.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (se) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (se) ((Object) stackIn_10_0);
          } else {
            return (se) ((Object) stackIn_12_0);
          }
        }
    }

    final static void a(int param0) {
        if (param0 > 33) {
          aa.field_a[0] = (ah) ((Object) new fe(81920, 61440));
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
          aa.field_a[0] = (ah) ((Object) new fe(81920, 61440));
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
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
