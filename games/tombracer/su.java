/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    int field_b;
    int field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(kb param0, byte param1, int param2) {
        try {
          nn.field_a.b((byte) -99, param0);
          mca.a(param0, param1 ^ -108, param2);
          if (param1 != -108) {
            kb var4 = (kb) null;
            su.a((kb) null, (byte) 124, 15);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "su.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static nh a(jpa param0, ha param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -107 % ((83 - param2) / 42);
          if (param0 == null) {
            return null;
          }
          stackIn_4_0 = param1.a(param0, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("su.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    su(int param0, int param1, int param2, int param3) {
        this.field_a = param0;
        this.field_b = param3;
    }

    static {
    }
}
