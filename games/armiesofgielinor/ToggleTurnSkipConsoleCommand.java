/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToggleTurnSkipConsoleCommand extends ConsoleCommand {
    static QuickChatCommandDefinition field_F;
    static String field_G;
    static String field_E;
    static IndexedSprite[] field_H;
    static DebugConsole debugConsole;

    ToggleTurnSkipConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    public static void g(int param0) {
        if (param0 >= -112) {
          return;
        }
        debugConsole = null;
        field_G = null;
        field_H = null;
        field_E = null;
        field_F = null;
    }

    final static void h(int param0) {
        if (param0 != 2) {
          field_H = (IndexedSprite[]) null;
          ContextActionMenu.a(true, (byte) -113);
          return;
        }
        ContextActionMenu.a(true, (byte) -113);
    }

    final static void selectMusicWithDefaultProfile(int obfuscationGuard, MusicTrack track) {
        try {
          if (track != null) {
            TrianglePulse.selectMusicTrackWithDefaultGain(-16147, 50, track, true);
            ((AdaptiveMidiPcmStream) (lk.musicCrossfadeStream.selectedSequencer)).rampToProfile((byte) -111, 1, CorpseConditionMarker.defaultMusicProfile);
          }
          int var2_int = 100 / ((-17 - obfuscationGuard) / 33);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "oa.B(" + obfuscationGuard + ',' + (track != null ? "{...}" : "null") + ')');
        }
    }

    final ConsoleValue execute(int obfuscationGuard, ConsoleValue[] arguments) {
        RuntimeException failure = null;
        ConsoleValue result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String argumentsDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -24872) {
            ToggleTurnSkipConsoleCommand.g(-45);
          }
          result = new ConsoleValue(ti.toggleAutomaticTurnSkipping((byte) -120));
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("oa.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    static {
        field_G = "No";
        field_F = new QuickChatCommandDefinition(2, 4, 4, 0);
        field_E = "Remove <%0> from ignore list";
    }
}
