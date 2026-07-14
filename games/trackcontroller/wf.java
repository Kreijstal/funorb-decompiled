/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static int field_b;
    static String[] field_a;
    static int[] field_c;
    static volatile int field_d;

    final static boolean a(byte param0, String param1, String param2, String param3, vd param4, boolean param5, int param6) {
        if (hf.field_f != fd.field_h) {
            return false;
        }
        og var8 = new og(gl.field_E, param4);
        if (param0 != 29) {
            return false;
        }
        gl.field_E.d((byte) -125, (al) (Object) var8);
        if (pa.b((byte) 91)) {
            var8.u(-118);
        } else {
            bf.field_f = param2;
            fi.field_l = param3;
            th.field_n = param1;
            h.field_c = null;
            v.field_e = param5 ? true : false;
            fd.field_h = oe.field_b;
            da.field_o = param6;
            return true;
        }
        return true;
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
        if (param0 == -28510) {
          if (r.field_i != null) {
            if (!jc.field_a.a(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = -55;
          if (r.field_i != null) {
            if (!jc.field_a.a(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(String param0, String param1, String param2, kk param3, int param4) {
        if (param3.c(-113)) {
          if (param4 < 3) {
            boolean discarded$2 = wf.a(121);
            return param2 + " - " + param3.a(param0, 0) + "%";
          } else {
            return param2 + " - " + param3.a(param0, 0) + "%";
          }
        } else {
          return param1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_c = new int[8192];
        field_d = 0;
    }
}
