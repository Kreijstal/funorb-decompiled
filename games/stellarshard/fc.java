/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String field_d;
    static String field_c;
    static int field_e;
    static pf field_a;
    static String[] field_b;

    final static ek a(int param0, pf param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ek stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tl.a(param1, (byte) -5, param0, param2)) {
            stackIn_2_0 = null;
            return (ek) (stackIn_2_0);
          }
          if (!param3) {
            field_e = 29;
          }
          stackIn_6_0 = el.i(96);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("fc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        int var1 = -16 % ((0 - param0) / 44);
        field_a = null;
    }

    static {
        field_c = "Invunerability";
        field_d = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_e = 9;
    }
}
