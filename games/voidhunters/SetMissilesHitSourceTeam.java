/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMissilesHitSourceTeam extends ConsoleCommand {
    static boolean field_p;
    static String field_r;
    static String field_q;
    static String field_o;

    SetMissilesHitSourceTeam(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
          SetMissilesHitSourceTeam.b(false);
          field_o = null;
          field_r = null;
          return;
        }
        field_o = null;
        field_r = null;
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
            field_q = (String) null;
          }
          SetMachineGunEnergyUsed.a(13, 62, arguments[0].a(36));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("acb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_q = "One team has a base, the other team wants to destroy it";
        field_r = "Try changing the following settings:  ";
        field_o = "<%0> has declined the invitation.";
    }
}
