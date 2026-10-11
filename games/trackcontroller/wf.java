/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static int field_b;
    static String[] field_a;
    static int[] field_c;
    static volatile int field_d;

    final static boolean a(byte param0, String param1, String param2, String param3, vd param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        og var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hf.field_f != fd.field_h) {
            return false;
          }
          var8 = new og(gl.field_E, param4);
          if (param0 != 29) {
            return false;
          }
          gl.field_E.d((byte) -125, var8);
          if (pa.b((byte) 91)) {
            var8.u(-118);
            return true;
          }
          bf.field_f = param2;
          fi.field_l = param3;
          th.field_n = param1;
          h.field_c = null;
          v.field_e = param5;
          fd.field_h = oe.field_b;
          da.field_o = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("wf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -43) {
          field_d = 72;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static boolean a(int param0) {
        if (param0 != -28510) {
          field_b = -55;
          if (r.field_i == null) {
            return false;
          }
          if (jc.field_a.a(0)) {
            return true;
          }
          return false;
        }
        if (r.field_i == null) {
          return false;
        }
        if (jc.field_a.a(0)) {
          return true;
        }
        return false;
    }

    final static String a(String param0, String param1, String param2, kk param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3.c(-113)) {
            stackIn_2_0 = (String) (param1);
            return stackIn_2_0;
          }
          if (param4 < 3) {
            wf.a(121);
          }
          stackIn_6_0 = param2 + " - " + param3.a(param0, 0) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wf.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
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
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_c = new int[8192];
        field_d = 0;
    }
}
