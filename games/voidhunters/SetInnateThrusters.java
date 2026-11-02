/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetInnateThrusters extends ConsoleCommand {
    static String field_p;
    static byte[][] field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(21, 62, arguments[0].a(10));
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 102);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hja.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = (byte[][]) null;
        if (param0 != 21) {
          SetInnateThrusters.a(0);
          field_p = null;
          return;
        }
        field_p = null;
    }

    final static void a(int param0, int[] param1) {
        SetSniperCannonProjectileLife.a(param0 + 1, param1);
        if (param0 != 0) {
          int[] var3 = (int[]) null;
          SetInnateThrusters.a(-95, (int[]) null);
        }
        try {
          SetFixedaim.field_o = false;
          GetBombletSprayPushMultiplier.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "hja.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    SetInnateThrusters(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
