/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg extends kk {
    private Object field_A;
    static cd field_B;
    static byte[] field_E;
    static String field_z;
    static ja field_D;
    static int field_C;

    final boolean f(int param0) {
        if (param0 != 1000) {
          return false;
        }
        return false;
    }

    final static ic a(int param0, long param1, String param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        wn stackIn_6_0 = null;
        mn stackIn_8_0 = null;
        pp stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0L == param1 &&
            param2 != null) {
            stackIn_8_0 = new mn(param2, param4);
            return (ic) ((Object) stackIn_8_0);
          }
          if (param3) {
            stackIn_6_0 = new wn(param1, param4);
            return (ic) ((Object) stackIn_6_0);
          }
          if (param0 != 64) {
            field_B = (cd) null;
          }
          stackIn_12_0 = new pp(param1, param4);
          return (ic) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("eg.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_E = null;
        field_z = null;
        field_D = null;
        if (param0 != 5) {
          return;
        }
        field_B = null;
    }

    eg(Object param0, int param1) {
        super(param1);
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "eg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object e(int param0) {
        if (param0 > -32) {
          this.f(-36);
          return this.field_A;
        }
        return this.field_A;
    }

    static {
        field_E = new byte[]{(byte)5};
        field_z = "Email address is unavailable";
        field_C = 64;
    }
}
