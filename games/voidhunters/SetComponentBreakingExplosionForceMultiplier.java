/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetComponentBreakingExplosionForceMultiplier extends ConsoleCommand {
    static int field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = -101;
          }
          SetMachineGunEnergyUsed.a(49, 62, arguments[0].a(58));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tna.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(String[] args, int param1) {
        try {
          if (param1 != 29141) {
            String[] var3 = (String[]) null;
            SetComponentBreakingExplosionForceMultiplier.a((String[]) null, -79);
          }
          GetShieldsDirectionalArcParticleLife.field_q = args;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "tna.B(" + (args != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SetComponentBreakingExplosionForceMultiplier(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 0;
    }
}
