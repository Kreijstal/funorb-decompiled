/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int field_a;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -25829) {
          wl.a(8);
        }
    }

    final static u a(String param0, byte param1, String param2, ki param3, ki param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        u stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param3.a(param2, 0);
          var6 = param3.a(param0, 5187, var5_int);
          if (param1 >= -86) {
            field_b = (String) null;
          }
          stackIn_3_0 = de.a(param3, var5_int, true, var6, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wl.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
          fa.field_b = true;
          if (param1 < 42) {
            wl.a(11);
          }
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          ke.a(849743536, var2, param0, var3, var4);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "wl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        int var2 = 0;
        ud var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        ud var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = (ud) (ab.field_h.b((byte) -35));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          if (param0 != -1) {
            field_a = 106;
          }
          for (var2 = 0; var2 < var1.field_o; var2++) {
            if (var4.field_h[var2] != null &&
              var4.field_h[var2].field_a == 0) {
              return false;
            }
            if (var4.field_i[var2] != null &&
              var4.field_i[var2].field_a == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "wl.B(" + param0 + ')');
        }
    }

    static {
        field_b = "This level is locked until you achieve the <col=cc88ff><%0></col> Achievement";
    }
}
