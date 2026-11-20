/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSalvoaim extends ConsoleCommand {
    static int logoAnimationTick;
    static String field_q;
    static GameStateFactory field_s;
    static int field_p;
    static String field_o;

    public static void clearSharedReferences(boolean param0) {
        field_q = null;
        field_s = null;
        if (param0) {
          SetSalvoaim.clearSharedReferences(false);
          field_o = null;
          return;
        }
        field_o = null;
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
          SetMachineGunEnergyUsed.a(26, 62, arguments[0].intValue(30));
          if (obfuscationGuard >= -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -61);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nd.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetSalvoaim(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = "Pause Menu";
        field_p = 48;
        field_s = (GameStateFactory) ((Object) new TeamShipComponentConditionFactory());
        field_o = "Please select options in the following rows:  ";
    }
}
