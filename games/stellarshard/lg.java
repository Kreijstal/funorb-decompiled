/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static int field_d;
    static String field_e;
    static cg field_c;
    static int[] field_a;
    static int field_b;
    static int field_f;

    public static void a(int param0) {
        field_a = null;
        int var1 = 75 % ((param0 - 79) / 33);
        field_e = null;
        field_c = null;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          if (param0 >= -107) {
            lg.a(-86);
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!qc.a(-1750942672, (char) var3) &&
              !bh.a(-1, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("lg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_a = new int[]{2, 7, 4, 5, 6, 7};
        field_e = "Waiting for graphics";
        field_c = new cg();
        field_f = 34015232;
    }
}
