/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sk {
    static int field_b;
    static double[] field_a;
    static boolean[] field_c;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          sk.a(false);
        }
        field_a = null;
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 > -102) {
          return false;
        }
        stackIn_9_0 = (param0 == 160) || (32 == param0) || (param0 == 95) || (45 == param0);
        return stackIn_9_0;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          if (!mj.a((byte) -27, param0, param2)) {
            return false;
          }
          for (var3_int = param1; var3_int < param2.length(); var3_int++) {
            if (!b.a(param2.charAt(var3_int), (byte) -123)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("sk.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract ua a(int param0);

    abstract void a(int param0, ka param1);

    static {
        field_a = new double[12];
    }
}
