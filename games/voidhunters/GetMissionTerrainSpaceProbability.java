/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMissionTerrainSpaceProbability extends ConsoleCommand {
    static int[][] field_o;
    static String field_p;

    final static void a(int param0) {
        if (param0 <= 48) {
          GetMissionTerrainSpaceProbability.a(45);
          if (li.field_i) {
            feb.a(GetDebrisGroupColour.field_r, true).a(true);
            return;
          }
          bia.a((byte) 124);
          return;
        }
        if (li.field_i) {
          feb.a(GetDebrisGroupColour.field_r, true).a(true);
          return;
        }
        bia.a((byte) 124);
    }

    GetMissionTerrainSpaceProbability(String param0, Class[] param1, String param2) {
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
            field_p = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(66, 94));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tm.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = (int[][]) null;
        field_p = null;
        if (!param0) {
          field_p = (String) null;
        }
    }

    static {
        field_p = "Who can join";
    }
}
