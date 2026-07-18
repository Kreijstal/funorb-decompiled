/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t {
    static String[] field_f;
    static int field_e;
    static String field_b;
    static int field_d;
    static String field_a;
    static String[] field_c;

    abstract byte[] a(int param0);

    final static void a(ul param0, ul param1) {
        try {
            en.a(cm.field_b, m.field_B, (fm) (Object) jj.field_L, qc.field_u, vo.field_m, ra.field_j, true, td.field_f, 16736511, up.field_g, rb.field_d, nq.field_v);
            wp.field_j = pb.a("lobby", param1, -256, "chatfilter");
            vg.field_h[2] = hj.field_h;
            vg.field_h[1] = of.field_p;
            vg.field_h[0] = dp.field_a;
            ap.a(param0, (byte) -37, (fm) (Object) fd.field_G);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "t.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 0 + ',' + true + ')');
        }
    }

    final static int b(int param0) {
        int var1 = -9 / ((param0 - -67) / 57);
        return em.field_cb;
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        int var1 = 0;
    }

    final static void a(boolean param0, int param1, java.awt.Canvas param2) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            dl.field_h.a(0, var4, 2, 0);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L0: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref2;
            stackOut_4_1 = new StringBuilder().append("t.B(").append(false).append(',').append(0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + 0 + ')');
        }
    }

    abstract void a(byte[] param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "Chat is currently disabled.";
        field_b = "FULL ACCESS";
    }
}
