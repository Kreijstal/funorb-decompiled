/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static uf[] field_a;
    static long field_b;

    public static void b(int param0) {
        if (param0 <= 75) {
          lc.a((byte) -52);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        e.a((byte) 112);
        gh.a(param0, 31888);
    }

    final static boolean a(byte param0) {
        if (param0 <= -73) {
          return h.field_F > 250 ? true : false;
        }
        lc.b(-42);
        return h.field_F > 250 ? true : false;
    }

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          var2_int = param1.charAt(0);
          if (param0 != -33) {
            return false;
          }
          for (var3 = 1; param1.length() > var3; var3++) {
            if (var2_int != param1.charAt(var3)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("lc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, vg param2, int param3, vg param4, int param5) {
        e.field_i = param5;
        a.field_o = param3;
        if (param1 != 4) {
          return;
        }
        try {
          tc.field_b = param0;
          ie.field_m = param2;
          wd.field_b = param4;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_a = new uf[3];
    }
}
