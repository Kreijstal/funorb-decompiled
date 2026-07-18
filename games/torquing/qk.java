/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends q {
    int field_j;
    int field_s;
    int field_o;
    int field_m;
    static k field_r;
    static up field_q;
    static int field_p;
    int field_n;
    int field_k;
    static String[] field_l;

    public static void a(byte param0) {
        field_l = null;
        field_r = null;
        field_q = null;
    }

    final static void a(int param0, java.awt.Component param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          param1.removeMouseListener((java.awt.event.MouseListener) (Object) ef.field_b);
          param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ef.field_b);
          param1.removeFocusListener((java.awt.event.FocusListener) (Object) ef.field_b);
          rn.field_f = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("qk.C(").append(-90).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
    }

    final static void a(int param0, int param1, t[] param2, byte param3) {
        try {
            p.field_x = new fn(param2);
            dn.field_h = 14;
            wp.field_y = 14;
            w.c((byte) 109);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "qk.B(" + 14 + ',' + 14 + ',' + (param2 != null ? "{...}" : "null") + ',' + -4 + ')');
        }
    }

    qk(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((qk) this).field_k = param0;
        ((qk) this).field_j = param5;
        ((qk) this).field_n = param2;
        ((qk) this).field_s = param4;
        ((qk) this).field_o = param1;
        ((qk) this).field_m = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 100;
        field_r = new k(11, 0, 1, 2);
        field_l = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
