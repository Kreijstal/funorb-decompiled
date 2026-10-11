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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new hf();
          ((qe) ((Object) var3)).field_d = param0;
          ((qe) ((Object) var3)).field_c = param1;
          if (param2 == -1) {
            stackIn_4_0 = var3;
            return (qe) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (qe) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("lh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
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
