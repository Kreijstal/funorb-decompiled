/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMassDriverFireForce extends ConsoleCommand {
    static mma field_p;
    static String field_q;
    static int field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetMassDriverFireForce.a(-21);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(98, 125));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vl.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          var1 = GetMomentOfInertiaPerpointCalcDownshift.field_q;
          synchronized (var1) {
            if (param0 != -101) {
              return;
            }
            GetUseCircleOutline.field_q = GetUseCircleOutline.field_q + 1;
            bva.field_c = MessageLog.field_a;
            if (SetSniperCannonAimarc.field_p < 0) {
              for (var2 = 0; 112 > var2; var2++) {
                SetMachineGunEnergyUsed.field_o[var2] = false;
              }
              SetSniperCannonAimarc.field_p = GetFixedaim.field_p;
            } else {
              while (SetSniperCannonAimarc.field_p != GetFixedaim.field_p) {
                var2 = SetNumStars.field_o[GetFixedaim.field_p];
                GetFixedaim.field_p = 127 & 1 + GetFixedaim.field_p;
                if (var2 >= 0) {
                  SetMachineGunEnergyUsed.field_o[var2] = true;
                  continue;
                }
                SetMachineGunEnergyUsed.field_o[~var2] = false;
              }
            }
            MessageLog.field_a = SetComponentBreakingExplosionForceMultiplier.field_o;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1_ref), "vl.C(" + param0 + ')');
        }
    }

    GetMassDriverFireForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 127) {
          field_p = (mma) null;
          field_p = null;
          field_q = null;
          return;
        }
        field_p = null;
        field_q = null;
    }

    static {
        field_p = new mma();
        field_q = "You need a rating of <%1> to play with the current options.";
    }
}
