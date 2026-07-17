/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int field_b;
    static vg field_a;

    final static void a(java.awt.Component param0) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) tf.field_n);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) tf.field_n);
        try {
            jd.field_J = -1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "lh.D(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final static qe a(int param0, String param1) {
        hf var3 = null;
        RuntimeException var3_ref = null;
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
          var3 = new hf();
          ((qe) (Object) var3).field_d = param0;
          ((qe) (Object) var3).field_c = param1;
          return (qe) (Object) var3;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("lh.A(").append(param0).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -1 + 41);
        }
    }

    final static void a(ib param0, int param1, java.awt.Component param2) {
        try {
            vl.field_d = new tf();
            vl.field_d.field_q.d(128, -13549, 9);
            vl.field_d.field_q.a(mk.field_e, false);
            vl.field_d.field_C.d(128, -13549, 9);
            vl.field_d.field_C.a(mk.field_e, false);
            int var3_int = 0;
            wc.a((byte) -111, param0, param2, 22050, 1102, true, 22050, vl.field_d);
            ll.a(-114, 160);
            pc.field_h = 256;
            int discarded$0 = -15676;
            sa.a((ee) null);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "lh.B(" + (param0 != null ? "{...}" : "null") + 44 + -81 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -29) {
            lh.a((byte) 28);
        }
    }

    static {
    }
}
