/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends jk {
    final void a(byte param0, fe param1) {
        if (param0 > -30) {
          return;
        }
        try {
          super.a((byte) -104, param1);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "rh.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rh(hm param0, fe param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static ed a(int param0, String[] param1) {
        ed var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        ed stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ed(false);
          var2.field_d = param1;
          if (param0 < 118) {
            var3 = (String[]) null;
            rh.a(17, (String[]) null);
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("rh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
