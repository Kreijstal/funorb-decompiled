/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    int field_c;
    int field_g;
    int field_j;
    int field_a;
    byte[] field_b;
    byte[] field_h;
    static vn field_d;
    int field_i;
    int field_f;
    int field_e;

    final static void a(int param0, String param1) {
        try {
            gk.field_F = param1;
            og.b(param0 ^ -114, param0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "nf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            nf.a(-56);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static la a(int param0, int param1, ec param2, int param3, boolean param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        la var7 = null;
        java.awt.Frame var8 = null;
        la stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = me.a((byte) 114, param1, param3, param2, param5, param0);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new la();
                if (!param4) {
                  break L1;
                } else {
                  nf.a(-19);
                  break L1;
                }
              }
              var7.field_e = var8;
              var7.field_e.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, 0, param1, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (la) (var7);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("nf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    static {
    }
}
