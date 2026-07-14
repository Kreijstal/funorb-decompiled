/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static te field_a;
    static ai[] field_d;
    static String field_e;
    static String field_c;
    static String[] field_b;

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = pf.b(1);
        var2 = al.a((byte) 113);
        hh.field_u.a(var1 + (rb.field_cb << 2134357441), -rb.field_cb + sc.field_g, false, -wg.field_h + fb.field_k, (wg.field_h << -1565569887) + var2);
        ne.a((byte) -107);
        if (param0 != -123) {
          int discarded$2 = vj.a(42, -55);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != 17812) {
            Object var2 = null;
            float[] discarded$0 = vj.a((float[]) null, (byte) 107, (float[]) null);
        }
    }

    final static float[] a(float[] param0, byte param1, float[] param2) {
        float[] var3 = null;
        float[] var4 = null;
        if (param1 != -2) {
          return null;
        } else {
          var4 = new float[2];
          var3 = var4;
          var4[0] = param0[0] + param2[0];
          var4[1] = param2[1] + param0[1];
          return var4;
        }
    }

    final static int a(int param0, int param1) {
        byte[] var4 = wc.field_d.a("level" + (param1 + param0), "", -125);
        byte[] var2 = var4;
        if (!(var4 != null)) {
            return -1;
        }
        gk var3 = new gk(var4);
        int discarded$0 = var3.a((byte) 114);
        return var3.a((byte) 114);
    }

    final static void a(int param0, boolean param1) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          float[] discarded$2 = vj.a((float[]) null, (byte) 50, (float[]) null);
          wg.field_j.a(0, 0, 112);
          return;
        } else {
          wg.field_j.a(0, 0, 112);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new te(13, 0, 1, 0);
        field_c = "Return to Main Menu";
        field_e = "Achieved";
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
