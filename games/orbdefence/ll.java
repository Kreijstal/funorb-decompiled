/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static char[] field_b;
    static fj field_a;

    public static void a(int param0) {
        int var1 = -46 % ((param0 - 59) / 40);
        field_b = null;
        field_a = null;
    }

    abstract void a(int param0, byte[] param1);

    final static void a(ed param0, int param1, String param2, kc param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var10 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 1;
          if (param4 != 404465128) {
            var10 = (kc) null;
            ll.a((ed) null, 108, (String) null, (kc) null, 30);
          }
          while (param2.length() > var7) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + (param0.field_g[0] + param3.a(param2.substring(0, var7)));
            }
            if (var6 != -1) {
              param0.field_g[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param0.field_g[var7] = param0.field_g[0] + ((var5_int >> 8) + param3.a(param2.substring(0, 1 + var7)) - param3.a((char) var8));
            }
            if (var8 == 62) {
              var6 = -1;
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ll.F(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract byte[] a(byte param0);

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -153798488) {
            field_b = (char[]) null;
          }
          stackIn_5_0 = (gi.a(param0, param1 ^ 153798427) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ll.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = new char[128];
    }
}
