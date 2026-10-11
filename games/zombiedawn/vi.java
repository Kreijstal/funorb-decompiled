/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static boolean field_a;
    static sa field_c;
    static String field_b;
    static boolean field_d;

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -55) {
            field_c = (sa) null;
          }
          stackIn_5_0 = ((param1[param0 >> 5] & 1 << (param0 & 31)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vi.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 != 31153) {
          return false;
        }
        if (param1 == 160) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param1 != 45) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 >= -11) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = false;
        field_b = "Cancel";
    }
}
