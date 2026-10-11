/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends jt {
    private java.lang.ref.SoftReference field_B;
    static volatile int field_C;

    final Object c(byte param0) {
        int var2 = 58 % ((param0 - 37) / 58);
        return this.field_B.get();
    }

    final static ha a(int param0, java.awt.Canvas param1, d param2, int param3, int param4) {
        RuntimeException var5 = null;
        ha stackIn_2_0 = null;
        qa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == -1) {
            stackIn_4_0 = new qa(param1, param2, param3, param0);
            return (ha) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (ha) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("kl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    kl(Object param0, int param1) {
        super(param1);
        try {
          this.field_B = new java.lang.ref.SoftReference(param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        int var2 = -79 % ((14 - param0) / 51);
        return true;
    }

    static {
        field_C = -1;
    }
}
