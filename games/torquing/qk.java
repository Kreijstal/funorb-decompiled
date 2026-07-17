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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.removeMouseListener((java.awt.event.MouseListener) (Object) ef.field_b);
              param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ef.field_b);
              param1.removeFocusListener((java.awt.event.FocusListener) (Object) ef.field_b);
              rn.field_f = 0;
              if (param0 <= -53) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qk.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, int param1, t[] param2, byte param3) {
        try {
            p.field_x = new fn(param2);
            dn.field_h = param0;
            wp.field_y = param1;
            w.c((byte) 109);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "qk.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + -4 + 41);
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
