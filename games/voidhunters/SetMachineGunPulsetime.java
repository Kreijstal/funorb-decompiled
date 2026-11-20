/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMachineGunPulsetime extends ConsoleCommand {
    static String field_o;

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 >= -101) {
          field_o = (String) null;
        }
    }

    final static boolean hasPrivilegedAccess(int param0) {
        if (param0 != 0) {
          SetMachineGunPulsetime.clearSharedReferences(-11);
          return SetTorpedoProjectiles.field_o.privilegedAccess;
        }
        return SetTorpedoProjectiles.field_o.privilegedAccess;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(188, 62, arguments[0].intValue(124));
          if (obfuscationGuard >= -119) {
            SetMachineGunPulsetime.hasPrivilegedAccess(117);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("iha.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMachineGunPulsetime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = "Connecting to<br>friend server...";
    }
}
