/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChannelFadeTimeConsoleCommand extends ConsoleCommand {
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
        RuntimeException failure = null;
        ConsoleValue guardResult = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard == -24872) {
            result = new ConsoleValue(AlphaWidgetContainer.setMusicProfileTransitionMillis(arguments[0].asInt(2), (byte) 74));
            return result;
          }
          guardResult = (ConsoleValue) null;
          return guardResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("qa.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        BattleUnitRenderer.field_c = NetworkGameShell.field_F[param0];
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

    ChannelFadeTimeConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    static {
        field_F = false;
        field_E = "Mages have forsworn the use of bladed weapons.";
    }
}
