/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetTorpedoReload extends ConsoleCommand {
    static String[] field_o;
    static String field_p;

    SetTorpedoReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(int param0) {
        field_p = null;
        if (param0 != 109) {
          SetTorpedoReload.clearSharedReferences(114);
          field_o = null;
          return;
        }
        field_o = null;
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
            SetTorpedoReload.clearSharedReferences(112);
          }
          SetMachineGunEnergyUsed.submitSettingsChange(109, 62, arguments[0].intValue(52));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gsa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = "Go Back";
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
