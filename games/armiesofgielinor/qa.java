/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ConsoleCommand {
    static boolean field_F;
    static String field_E;

    final static int h(int param0) {
        if (param0 != 1) {
          field_E = (String) null;
          return 1;
        }
        return 1;
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == -24872) {
            stackIn_4_0 = new ConsoleValue(bh.a(arguments[0].asInt(2), (byte) 74));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qa.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        BattleUnitRenderer.field_c = wf.field_F[param0];
        db.field_b = eq.field_m[param0];
        if (param1 == 1) {
          LobbyPlayer.field_Jb = CorpseConditionMarker.field_s[param0];
          return;
        }
        field_F = true;
        LobbyPlayer.field_Jb = CorpseConditionMarker.field_s[param0];
    }

    public static void g(int param0) {
        if (param0 != 1) {
          return;
        }
        field_E = null;
    }

    qa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_F = false;
        field_E = "Mages have forsworn the use of bladed weapons.";
    }
}
