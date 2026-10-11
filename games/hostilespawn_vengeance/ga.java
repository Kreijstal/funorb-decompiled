/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static bd field_a;
    static int field_b;
    static String field_c;

    public static void a(byte param0) {
        if (param0 > -47) {
          ga.a((byte) -107);
        }
        field_a = null;
        field_c = null;
    }

    final static byte[] a(int param0, en param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_17_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4_int = param1.a(param3, true);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new byte[var4_int];
          }
          var5 = param1.a(3, true);
          var6 = (byte)param1.a(8, true);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (byte)(var6 + param1.a(var5, true));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)var6;
            }
          }
          if (param0 >= 90) {
            stackIn_19_0 = (byte[]) (param2);
            return stackIn_19_0;
          }
          stackIn_17_0 = (byte[]) null;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ga.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_b = 256;
        field_c = "The marine's current health is shown at the bottom-right of the screen. Killing enough hostiles will provide you with a promotion and a health boost to keep you fighting fit.";
    }
}
