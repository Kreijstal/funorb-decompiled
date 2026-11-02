/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhysicsCollisionGrapplingHookForceMultiplier extends ConsoleCommand {
    static boolean field_q;
    static llb field_o;
    static float field_p;

    public static void e(byte param0) {
        if (param0 < 121) {
          SetPhysicsCollisionGrapplingHookForceMultiplier.e((byte) 2);
          field_o = null;
          return;
        }
        field_o = null;
    }

    SetPhysicsCollisionGrapplingHookForceMultiplier(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            field_q = true;
          }
          SetMachineGunEnergyUsed.a(51, 62, arguments[0].a(33));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gt.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_q = true;
        field_p = 0.0f;
    }
}
