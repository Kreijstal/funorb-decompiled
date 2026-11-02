/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhasedEnergyBeamAimarc extends ConsoleCommand {
    SetPhasedEnergyBeamAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(137, 62, arguments[0].a(16));
          if (obfuscationGuard > -119) {
            SetPhasedEnergyBeamAimarc.a((byte) -118, -84L);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pdb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static jk a(byte param0, long param1) {
        if (param0 != 80) {
          return (jk) null;
        }
        return (jk) (GetReverbWet.field_o.a(-1, param1));
    }

    static {
    }
}
