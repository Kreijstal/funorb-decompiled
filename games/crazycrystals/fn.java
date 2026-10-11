/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends ln {
    static String field_g;
    static am field_h;
    static int field_j;
    static String field_i;

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
          fn.a(true);
          field_g = null;
          field_h = null;
          return;
        }
        field_g = null;
        field_h = null;
    }

    fn(String param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static boolean a(int param0, md param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            stackIn_6_0 = (param1.d((byte) -96, 1) == 1);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fn.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var3 = -121 % ((param1 - 55) / 50);
        return (va.field_d & 1 << param0) != 0 ? 1 : 0;
    }

    static {
        field_g = "Rocks roll off curved surfaces. You can use this fact to get through.";
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
