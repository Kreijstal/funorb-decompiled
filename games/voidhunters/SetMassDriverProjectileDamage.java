/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMassDriverProjectileDamage extends ConsoleCommand {
    static int field_o;
    static String field_p;

    SetMassDriverProjectileDamage(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_p = null;
        if (param0 != 9099) {
          SetMassDriverProjectileDamage.a(-21, -94, -54);
        }
    }

    final static void a(int param0, int param1, int param2) {
        SetOndamageParticleFadestart.field_o = param1;
        ata.field_H = param0;
        if (param2 != 143) {
          SetMassDriverProjectileDamage.a(-87);
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            SetMassDriverProjectileDamage.a(4);
          }
          SetMachineGunEnergyUsed.a(143, 62, arguments[0].a(49));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qoa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = "CONGRATULATIONS, YOU ARE NOW QUALIFIED FOR BATTLE<br>PRESS ESCAPE TO OPEN THE MENU";
        field_o = 16;
    }
}
