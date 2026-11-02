/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetReloadBarWidth extends ConsoleCommand {
    static String field_p;
    static int[] field_o;
    static String field_q;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 1) {
          GetReloadBarWidth.a(-20);
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 16);
          }
          stackIn_3_0 = new ConsoleValue(GetSniperCannonAimarc.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fq.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetReloadBarWidth(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Capture the points to deplete the enemy's reinforcements";
        field_o = new int[]{-1, 0, 1, -1, 0, 1, 0, 1, 0, 1, 0, 1};
        field_q = "There are no valid types of game that match your preferences.";
    }
}
