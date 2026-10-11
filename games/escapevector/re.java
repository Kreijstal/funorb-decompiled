/*
 * Decompiled by CFR-JS 0.4.0.
 */
class re extends k {
    static rf field_s;
    static cn field_q;
    static String[] field_r;

    re(int param0) {
        this(sb.field_a, param0);
    }

    final static void d(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        tj var3 = null;
        Throwable decompiledCaughtException = null;
        tj var3Lifetime1;
        if (null == ck.field_v) {
          if (param0 == 2) {
            return;
          }
          var3 = (tj) null;
          re.a(68, (tj) null);
          return;
        }
        var1 = ck.field_v;
        synchronized (var1) {
          ck.field_v = null;
        }
        if (param0 != 2) {
          var3Lifetime1 = (tj) null;
          re.a(68, (tj) null);
        }
    }

    final static void a(int param0, tj param1) {
        try {
          mg.field_e.a(-12328, param1);
          if (param0 != 1820) {
            field_r = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "re.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4) {
            mn.a(-27951, param0 + param3.field_k, param1 + param3.field_j, param3.field_g, param3.field_x);
          }
          super.a(param0, param1, -60, param3, param4);
          if (param2 < -14) {
            return;
          }
          field_s = (rf) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("re.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (param0 != -11967) {
          field_s = (rf) null;
        }
    }

    re(wl param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_r, -1, 2147483647, false);
    }

    static {
        field_s = new rf();
        field_q = new cn();
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
