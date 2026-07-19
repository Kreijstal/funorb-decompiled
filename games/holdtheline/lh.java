/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int field_b;
    static vg field_a;

    final static void a(java.awt.Component param0, boolean param1) {
        param0.removeKeyListener(tf.field_n);
        param0.removeFocusListener(tf.field_n);
        if (param1) {
            return;
        }
        try {
            jd.field_J = -1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "lh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static qe a(int param0, String param1, int param2) {
        hf var3 = null;
        RuntimeException var3_ref = null;
        qe stackIn_2_0 = null;
        hf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hf stackOut_3_0 = null;
        qe stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new hf();
            ((qe) ((Object) var3)).field_d = param0;
            ((qe) ((Object) var3)).field_c = param1;
            if (param2 == -1) {
              stackOut_3_0 = (hf) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (qe) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("lh.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (qe) ((Object) stackIn_4_0);
        }
    }

    final static void a(ib param0, int param1, java.awt.Component param2) {
        try {
            vl.field_d = new tf();
            vl.field_d.field_q.d(128, -13549, 9);
            vl.field_d.field_q.a(mk.field_e, false);
            vl.field_d.field_C.d(128, -13549, 9);
            vl.field_d.field_C.a(mk.field_e, false);
            int var3_int = -54 % ((param1 - 11) / 55);
            wc.a((byte) -111, param0, param2, 22050, 1102, true, 22050, vl.field_d);
            ll.a(-114, 160);
            pc.field_h = 256;
            ee var4 = (ee) null;
            sa.a((ee) null, -15676);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "lh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
