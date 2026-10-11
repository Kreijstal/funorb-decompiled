/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param1 == -2626) {
          return 0 != (2048 & param2) ? true : false;
        }
        tf.a((byte) -118);
        return 0 != (2048 & param2) ? true : false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static bo a(ki param0, byte param1, int param2, int param3, ki param4) {
        RuntimeException var5 = null;
        bo stackIn_5_0 = null;
        bo stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param4, param3, param2, -23046)) {
            return null;
          }
          if (param1 < -11) {
            stackIn_7_0 = vo.a(false, param0.a((byte) 94, param3, param2));
            return stackIn_7_0;
          }
          stackIn_5_0 = (bo) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("tf.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 17) {
          tf.a(-5, -49, 114);
        }
    }

    static {
        field_a = "OK";
    }
}
