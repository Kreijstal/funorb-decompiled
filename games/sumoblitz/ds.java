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
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4) {
            ds.a((byte) 100);
          }
          if (param0 == 0L &&
            param2 != null) {
            stackIn_10_0 = new wd(param2, param3);
            return (se) ((Object) stackIn_10_0);
          }
          if (param1) {
            stackIn_8_0 = new tn(param0, param3);
            return (se) ((Object) stackIn_8_0);
          }
          stackIn_12_0 = new jb(param0, param3);
          return (se) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ds.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 <= 33) {
          ds.a(-65);
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
          }
          return;
        }
        aa.field_a[0] = (ah) ((Object) new fe(81920, 61440));
        aa.field_a[0].field_I = ki.field_f;
        aa.field_a[0].field_t = hc.field_f;
        aa.field_a[0].field_y = iv.field_i;
        aa.field_a[0].c((byte) 35);
        fa.field_b = 250;
        if (!bw.field_d) {
          return;
        }
        bw.field_d = false;
        fa.field_b = fa.field_b * 2;
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
