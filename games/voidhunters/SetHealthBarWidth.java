/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetHealthBarWidth extends ConsoleCommand {
    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          return (param2 & 2048) != 0 ? true : false;
        }
        int[] var4 = (int[]) null;
        SetHealthBarWidth.a(-42, -9, 37, 119, 111, 16, 52, (int[]) null, 30, true);
        return (param2 & 2048) != 0 ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, boolean param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = VoidHunters.field_G;
        try {
          if (!param9) {
            return;
          }
          while (true) {
            param4--;
            if (0 > param4) {
              return;
            }
            var17 = param7;
            var10 = var17;
            var11 = param3;
            var12 = param2;
            var13 = param0;
            var14 = param6;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = dla.a(65280, var13 >> 9) + (dla.a(var12 >> 1, 16711680) + dla.a(255, var14 >> 17) + var15);
            param6 = param6 + param5;
            param2 = param2 + param8;
            param0 = param0 + param1;
            param3++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("bdb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          tu.field_d = arguments[0].a(70);
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -116);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bdb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetHealthBarWidth(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
