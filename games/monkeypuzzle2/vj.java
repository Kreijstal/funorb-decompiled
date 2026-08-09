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
        int var1;
        int var2;
        var1 = pf.b(1);
        var2 = al.a((byte) 113);
        hh.field_u.a(var1 + (rb.field_cb << 2134357441), -rb.field_cb + sc.field_g, false, -wg.field_h + fb.field_k, (wg.field_h << -1565569887) + var2);
        ne.a((byte) -107);
        if (param0 != -123) {
          vj.a(42, -55);
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
            float[] var2 = (float[]) null;
            vj.a((float[]) null, (byte) 107, (float[]) null);
        }
    }

    final static float[] a(float[] param0, byte param1, float[] param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] stackIn_2_0 = null;
        float[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -2) {
              var4 = new float[2];
              var3 = var4;
              var4[0] = param0[0] + param2[0];
              var4[1] = param2[1] + param0[1];
              stackIn_4_0 = (float[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (float[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("vj.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static int a(int param0, int param1) {
        byte[] var4 = wc.field_d.a("level" + (param1 + param0), "", -125);
        byte[] var2 = var4;
        if (!(var4 != null)) {
            return -1;
        }
        gk var3 = new gk(var4);
        var3.a((byte) 114);
        return var3.a((byte) 114);
    }

    final static void a(int param0, boolean param1) {
        float[] var3;
        if (param0 != 1) {
          var3 = (float[]) null;
          vj.a((float[]) null, (byte) 50, (float[]) null);
          wg.field_j.a(0, 0, 112);
          return;
        } else {
          wg.field_j.a(0, 0, 112);
          return;
        }
    }

    static {
        field_a = new te(13, 0, 1, 0);
        field_c = "Return to Main Menu";
        field_e = "Achieved";
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
