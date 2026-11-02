/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetFullMissionSet extends ConsoleCommand {
    static int field_o;
    static int field_p;

    final static void a(int[] param0, int param1, int param2) {
        try {
          SetReloadBarWidth.field_p[param2] = param0;
          lo.field_a[param2] = new wf(param2);
          if (param1 != 2182) {
            int[] var4 = (int[]) null;
            GetFullMissionSet.a((int[]) null, 47, 101);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    GetFullMissionSet(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(5, 104));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vc.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = 1;
    }
}
