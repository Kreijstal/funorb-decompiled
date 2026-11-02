/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhasedEnergyBeamPulseFadetime extends ConsoleCommand {
    static long field_p;
    static int field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(187, 62, arguments[0].a(39));
          if (obfuscationGuard > -119) {
            SetPhasedEnergyBeamPulseFadetime.a(-47, -122);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("itb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static ri a(int param0, int param1) {
        int var3 = 0;
        ri[] var2;
        int var4;
        ri[] var5;
        var4 = VoidHunters.field_G;
        var5 = GetBurstFireRegenerationRate.e((byte) -66);
        var2 = var5;
        for (var3 = param0; var3 < var5.length; var3++) {
          if (param1 == var5[var3].field_a) {
            return var5[var3];
          }
        }
        return null;
    }

    SetPhasedEnergyBeamPulseFadetime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 0;
    }
}
