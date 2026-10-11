/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static hr[] field_b;
    static ri[] field_c;
    static hr field_a;

    final static ah a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != 84) {
          return (ah) null;
        }
        return (ah) ((Object) new dr(param0, param2, param1, param4));
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          field_c = (ri[]) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, int param1, boolean param2, tv param3) {
        Object var4 = null;
        int var4_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          if (qr.field_b != null) {
            u.a(param3, param1, (byte) -87, 1048576, param2);
          }
          if (null != qc.field_e) {
            var4_ref = wd.field_f;
            synchronized (var4_ref) {
              qc.field_e.a((byte) -91, -1, param1);
              if (nd.field_B == param3) {
                return;
              }
              qc.field_e.e(0);
              wd.field_f.d();
              nd.field_B = param3;
              if (null != nd.field_B) {
                qc.field_e.a(param2, nd.field_B, 91);
              }
            }
          }
          var4_int = -69 % ((param0 + 78) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var4_ref2;
          stackIn_19_1 = new StringBuilder().append("uj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
