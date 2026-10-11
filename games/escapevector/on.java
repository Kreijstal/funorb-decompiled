/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static int field_a;
    static String field_b;
    static int field_e;
    static int[] field_g;
    static String field_c;
    static String field_d;
    static String[] field_f;

    final static void a(mf param0, int param1) {
        in var2 = null;
        try {
          in.a(param0.a(-4, "", "headers.packvorbis"));
          var2 = in.a(param0, "jagex logo2.packvorbis", "");
          if (param1 != -58) {
            field_c = (String) null;
          }
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "on.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(dk[] param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        dk[] var3 = null;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = EscapeVector.field_A;
        try {
          var2_int = -2147483648;
          var3 = param0;
          if (param1 != -49) {
            on.a('\030', true);
          }
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var6 = var5.field_f + var5.field_p;
            if (var6 > var2_int) {
              var2_int = var6;
            }
          }
          if (-2147483648 != var2_int) {
            stackIn_14_0 = var2_int;
            return stackIn_14_0;
          }
          stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("on.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 > -65) {
          field_f = (String[]) null;
        }
    }

    final static boolean a(char param0, boolean param1) {
        boolean stackIn_6_0 = false;
        if (param1) {
          return false;
        }
        stackIn_6_0 = (param0 >= 48) && (param0 <= 57);
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_c = null;
        if (param0 <= 72) {
          mf var2 = (mf) null;
          on.a((mf) null, -94);
        }
        field_f = null;
    }

    static {
        field_c = "Enter the caves, find the containers, land next to them to attach your tether,<br>and steer them out and up to the mothership.";
        field_g = new int[8192];
        field_d = "Cannot load power-up - please land beside it";
        field_b = null;
        field_f = new String[]{"infracstructure_asteroid", "infracstructure_ice", "infracstructure_moon", "infracstructure_alien", null};
    }
}
