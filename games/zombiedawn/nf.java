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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = me.a((byte) 114, param1, param3, param2, param5, param0);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new la();
          if (param4) {
            nf.a(-19);
          }
          var7.field_e = var8;
          var7.field_e.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param1, param0);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("nf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
