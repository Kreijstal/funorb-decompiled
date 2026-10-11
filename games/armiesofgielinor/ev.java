/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ev implements ok {
    static String field_e;
    static int field_d;
    static boolean field_b;
    static int field_a;
    static int field_c;

    public static void a(int param0) {
        if (param0 != 960112080) {
          vh var2 = (vh) null;
          ev.a((vh) null, (byte) 105);
        }
        field_e = null;
    }

    final static int[] a(vh param0, byte param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var5 = 0;
        int[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = param0.k(param1 ^ -98);
          if (var2_int == 0) {
            return null;
          }
          var3 = new int[var2_int];
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[var4] = param0.k(0);
          }
          if (param1 != -98) {
            ev.a(4);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ev.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(int param0, int param1, int param2) {
        if (param1 != -32263) {
          return;
        }
        ra.a(param2, param1 ^ -9688, param0);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = param2 >> 16;
        if (param0 >= -33) {
          field_e = (String) null;
        }
        int var4 = 65535 & param2;
        int var5 = param1 >> 16;
        int var6 = param1 & 65535;
        return var5 * var4 + param1 * var3 + (var6 * var4 >> 16);
    }

    static {
        field_d = -1;
        field_e = "Join <%0>'s game";
        field_a = 0;
        field_c = 0;
    }
}
