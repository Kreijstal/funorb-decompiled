/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetTorpedoReload extends ConsoleCommand {
    static LoginCredentialType numericCredentialType;
    static int field_o;
    static int field_q;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            numericCredentialType = (LoginCredentialType) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(109, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("noa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetTorpedoReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void clearSharedReferences(int param0) {
        numericCredentialType = null;
        if (param0 != 194) {
          numericCredentialType = (LoginCredentialType) null;
        }
    }

    static {
        numericCredentialType = new LoginCredentialType(2);
    }
}
