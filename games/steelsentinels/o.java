/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static String field_f;
    static int field_b;
    static boolean field_c;
    static String field_a;
    static NodeDeque field_d;
    static String field_e;

    final static int a(byte param0, int param1) {
        if (param1 == 0) {
          return 0;
        }
        if (param1 == 55) {
          return 1;
        }
        if (param1 == 57) {
          return 2;
        }
        if (param1 == 62) {
          return 3;
        }
        if (param1 == 65) {
          return 4;
        }
        if (param1 == 69) {
          return 5;
        }
        if (param0 != 84) {
          return -41;
        }
        if (param1 == 72) {
          return 6;
        }
        if (param1 == 75) {
          return 7;
        }
        if (79 == param1) {
          return 8;
        }
        if (param1 == 84) {
          return 9;
        }
        if (param1 == 88) {
          return 10;
        }
        if (92 == param1) {
          return 11;
        }
        if (param1 == 109) {
          return 12;
        }
        if (param1 == 107) {
          return 12;
        }
        if (param1 != 108) {
          return -1;
        }
        return 12;
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_f = null;
        if (param0 > -16) {
          field_d = (NodeDeque) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -29) {
            stackIn_6_0 = (null != da.a(param1, (byte) -41));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("o.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_f = "You cannot add yourself!";
        field_c = false;
        field_a = "Camera up/down: Inverted";
        field_e = "The '<%0>' setting needs to be changed.";
    }
}
