/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static int field_a;
    static String[] field_b;

    final static se a(long param0, boolean param1, String param2, String param3, boolean param4) {
        if (param4) {
            ds.a((byte) 100);
            if (param0 != 0L) {
                if (!(!param1)) {
                    return (se) (Object) new tn(param0, param3);
                }
                return (se) (Object) new jb(param0, param3);
            }
            if (param2 != null) {
                return (se) (Object) new wd(param2, param3);
            }
            if (!(!param1)) {
                return (se) (Object) new tn(param0, param3);
            }
            return (se) (Object) new jb(param0, param3);
        }
        if (param0 == 0L) {
            if (param2 != null) {
                return (se) (Object) new wd(param2, param3);
            }
            if (!(!param1)) {
                return (se) (Object) new tn(param0, param3);
            }
            return (se) (Object) new jb(param0, param3);
        }
        if (!(!param1)) {
            return (se) (Object) new tn(param0, param3);
        }
        return (se) (Object) new jb(param0, param3);
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
