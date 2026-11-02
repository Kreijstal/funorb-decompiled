/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetDebrisProjectileCollision extends ConsoleCommand {
    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(11, 97));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ig.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetDebrisProjectileCollision(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        GetPhasedEnergyBeamProjectiles.field_o = param1;
        if (GetRepairModePower.field_o != tb.field_b) {
          var2 = GetRepairModePower.field_o * GetRepairModePower.field_o;
          var3 = -(tb.field_b * tb.field_b) + var2;
          param1 = param1 + (-param1 + GetAngularForceDownshift.field_p) * var3 / var2;
        }
        SetToggledScoreboard.field_o.a(SetUseDetailLines.field_o, param0 + 123, 640, param1, 120);
        hp.a(640, GetAngularForceDownshift.field_p - 24, qs.field_c, false, hi.field_a, 5, param0);
    }

    static {
    }
}
