/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static String field_c;
    static String field_a;
    static int field_b;

    final static java.awt.Frame a(int param0, int param1, int param2, byte param3, int param4, ab param5) {
        int var8_int = 0;
        Object stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        we[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        java.awt.Frame var8 = null;
        int var9 = 0;
        we[] var10 = null;
        ei var11 = null;
        int var7Lifetime1;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          if (!param5.b(0)) {
            return null;
          }
          if (param4 == 0) {
            var10 = gb.a((byte) -127, param5);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7 = 0;
            for (var8_int = 0; var8_int < var10.length; var8_int++) {
              if (var10[var8_int].field_a == param1 &&
                param0 == var10[var8_int].field_e && ((param2 == 0 ||
                param2 == var10[var8_int].field_k) &&
                (var7 == 0 ||
                !(var10[var8_int].field_f <= param4)))) {
                param4 = var10[var8_int].field_f;
                var7 = 1;
              }
            }
            if (var7 == 0) {
              return null;
            }
          }
          var11 = param5.a(28460, param1, param0, param4, param2);
          var7Lifetime1 = -55 / ((param3 + 61) / 63);
          while (var11.field_b == 0) {
            ge.a(0, 10L);
          }
          var8 = (java.awt.Frame) (var11.field_g);
          if (var8 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          if (var11.field_b != 2) {
            stackIn_38_0 = var8;
            return stackIn_38_0;
          }
          ca.a(param5, 15232, var8);
          stackIn_36_0 = null;
          return (java.awt.Frame) (stackIn_36_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("oh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    final static boolean a(sh param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -16) {
            field_c = (String) null;
          }
          stackIn_3_0 = param0.a((byte) -128);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("oh.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, boolean param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        ab var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var4_int = -1;
          if (param2) {
            var7 = (ab) null;
            oh.a(-37, 109, 83, (byte) 108, 101, (ab) null);
          }
          for (var5 = param0; var5 < param3; var5++) {
            var4_int = var4_int >>> 8 ^ d.field_c[255 & (param1[var5] ^ var4_int)];
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("oh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, db param1, boolean param2, String param3, int param4, int param5) {
        try {
          if (param2) {
            ab var7 = (ab) null;
            oh.a(-85, -81, 63, (byte) 46, 52, (ab) null);
          }
          eh.a(param4, param1, param5 - 24 * (param3.length() - 1), 0, param3, param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "oh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -85 % ((param0 + 65) / 48);
    }

    static {
        field_c = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
