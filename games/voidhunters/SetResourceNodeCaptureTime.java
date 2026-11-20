/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetResourceNodeCaptureTime extends ConsoleCommand {
    static IntrusiveDeque delayedOutgoingPackets;
    static String field_p;

    SetResourceNodeCaptureTime(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard > -119) {
            delayedOutgoingPackets = (IntrusiveDeque) null;
          }
          SetMachineGunEnergyUsed.a(70, 62, arguments[0].intValue(123));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bfa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_p = null;
        delayedOutgoingPackets = null;
        if (param0 != 70) {
          delayedOutgoingPackets = (IntrusiveDeque) null;
        }
    }

    static {
    }
}
