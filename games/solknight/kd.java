/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static int[] field_b;
    static int field_a;
    static int field_c;

    public static void a(byte param0) {
        if (param0 > -93) {
          kd.a((byte) 57);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, byte param1, rl param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        se stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        boolean stackIn_3_3 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = ah.field_a;
          stackIn_2_1 = param3;
          stackIn_2_2 = 0;
          stackIn_3_3 = !(param4);
          ((se) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_3_3, param2, 1000000, param0);
          if (param1 == 101) {
            return;
          }
          field_a = -108;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("kd.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = new int[]{48, 90, 96, 93, 124, 48, 48, 96};
        field_c = -1;
    }
}
