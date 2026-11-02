/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetTorpedoAcceleration extends ConsoleCommand {
    static PacketBuffer field_p;
    static llb field_o;

    SetTorpedoAcceleration(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, byte param1, int[] param2) {
        if (param1 != 16) {
          return;
        }
        try {
          smb.a(param2, 0, param0.length - 1, (byte) -79, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ss.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 169) {
          return;
        }
        field_o = null;
        field_p = null;
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
            SetTorpedoAcceleration.a(58);
          }
          SetMachineGunEnergyUsed.a(169, 62, arguments[0].a(42));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ss.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = new PacketBuffer(256);
    }
}
