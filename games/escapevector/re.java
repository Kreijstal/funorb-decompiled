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
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        if (null == ck.field_v) {
          if (param0 != 2) {
            var3 = null;
            re.a(68, (tj) null);
            return;
          } else {
            return;
          }
        } else {
          var1 = (Object) (Object) ck.field_v;
          synchronized (var1) {
            L0: {
              ck.field_v = null;
              break L0;
            }
          }
          L1: {
            if (param0 == 2) {
              break L1;
            } else {
              var3 = null;
              re.a(68, (tj) null);
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, tj param1) {
        mg.field_e.a(-12328, (hg) (Object) param1);
        if (param0 != 1820) {
            field_r = null;
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        if (!param4) {
          super.a(param0, param1, -60, param3, param4);
          if (param2 >= -14) {
            field_s = null;
            return;
          } else {
            return;
          }
        } else {
          mn.a(-27951, param0 - -param3.field_k, param1 - -param3.field_j, param3.field_g, param3.field_x);
          super.a(param0, param1, -60, param3, param4);
          if (param2 < -14) {
            return;
          } else {
            field_s = null;
            return;
          }
        }
    }

    public static void c(int param0) {
        field_r = null;
        field_s = null;
        field_q = null;
        if (param0 != -11967) {
            field_s = null;
        }
    }

    re(wl param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_r, -1, 2147483647, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new rf();
        field_q = new cn();
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
