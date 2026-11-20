/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetTorpedoFireForce extends ConsoleCommand {
    static ValidationState emptyInput;
    static int field_o;

    SetTorpedoFireForce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          SetTorpedoFireForce.clearSharedReferences(true);
          emptyInput = null;
          return;
        }
        emptyInput = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(99, 62, arguments[0].intValue(98));
          if (obfuscationGuard > -119) {
            field_o = -16;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mp.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        emptyInput = new ValidationState();
        field_o = 0;
    }
}
