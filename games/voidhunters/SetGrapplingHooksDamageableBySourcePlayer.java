/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetGrapplingHooksDamageableBySourcePlayer extends ConsoleCommand {
    SetGrapplingHooksDamageableBySourcePlayer(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        jk var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = VoidHunters.field_G;
        try {
          SetSpinningBladeSpindamageMultiplier.field_o = null;
          if (param0 != 15) {
            SetGrapplingHooksDamageableBySourcePlayer.a(-127);
          }
          ii.field_h = false;
          SetThrusterParticleSpeedDownshift.field_o = null;
          if (null != SetMachineGunAimarc.field_q) {
            SetMachineGunAimarc.field_q.e(103);
            SetMachineGunAimarc.field_q = null;
          }
          GetReverbWet.field_o = null;
          if (null != kja.field_E) {
            kja.field_E.e(104);
            kja.field_E = null;
          }
          GetLaserReload.field_r = null;
          if (mea.field_e != null) {
            mea.field_e.e(126);
            mea.field_e = null;
          }
          SetUseDetailLines.field_p = null;
          if (GetReverbWet.field_o == null) {
            return;
          }
          var3 = (jk) (GetReverbWet.field_o.c(param0 - 99));
          while (var3 != null) {
            var3.d((byte) -35);
            var3 = (jk) (GetReverbWet.field_o.d(param0 - 16));
          }
          GetReverbWet.field_o = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "qo.B(" + param0 + ')');
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(15, 62, arguments[0].a(12));
          if (obfuscationGuard < -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qo.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
