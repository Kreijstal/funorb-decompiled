/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static ha field_c;
    static hr field_a;
    static jn field_b;

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static an a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        an stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -23) {
            field_c = (ha) null;
          }
          if (ad.field_p == vm.field_c) {
            stackIn_4_0 = null;
            return (an) (stackIn_4_0);
          }
          if (st.field_z == vm.field_c &&
            param1.equals(tl.field_s)) {
            vm.field_c = hm.field_a;
            stackIn_8_0 = jh.field_z;
            return stackIn_8_0;
          }
          jh.field_z = null;
          vm.field_c = ad.field_p;
          tl.field_s = param1;
          stackIn_10_0 = null;
          return (an) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("im.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_c = null;
    }
}
