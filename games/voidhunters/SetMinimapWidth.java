/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetMinimapWidth extends ConsoleCommand {
    static int field_o;

    final static int[] a(int[] param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < -95) {
            stackIn_4_0 = nra.a(false, param0, param1, 28849, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (int[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kdb.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        if (NebulaField.field_c <= param0 &&
          param0 <= hab.field_i) {
          param4 = IntrusiveNode.a(31123, ob.field_j, GetCountermeasureLauncherProjectiles.field_o, param4);
          param1 = IntrusiveNode.a(31123, ob.field_j, GetCountermeasureLauncherProjectiles.field_o, param1);
          bpa.a(param3, param0, (byte) -25, param4, param1);
        }
        int var5 = 54 % ((param2 - 59) / 49);
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
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          GetAiFiringRangeUpshift.field_o = arguments[0].a(70);
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kdb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMinimapWidth(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
