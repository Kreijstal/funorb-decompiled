/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChannelBaseVolumeConsoleCommand extends ConsoleCommand {
    static wm field_L;
    static RgbSprite[] field_J;
    static boolean[] field_G;
    static String field_F;
    static MusicTrack field_K;
    static RgbSprite field_I;
    static int field_E;
    static long localAccountId;
    static ResourceArchive field_M;

    public static void g(int param0) {
        field_G = null;
        field_F = null;
        field_K = null;
        field_J = null;
        field_L = null;
        field_I = null;
        if (param0 == 21336) {
          field_M = null;
          return;
        }
    }

    final static void e(byte param0) {
        String var2 = null;
        if (PopupPresentation.field_e != null) {
          var2 = PopupPresentation.field_e;
          String var1 = var2;
          BirthDateChatEnableForm.a((byte) 68, EmailCheckResult.a(4800, ActionSpell.field_l, new String[]{var2}));
          PopupPresentation.field_e = null;
        }
        if (param0 <= -127) {
          return;
        }
        ChannelBaseVolumeConsoleCommand.e((byte) 28);
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
            result = new ConsoleValue(DisplacedUnitMarker.setCampaignBaseChannelGain(256, arguments[0].asInt(2)));
            return result;
          }
          guardResult = (ConsoleValue) null;
          return guardResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("oh.C(").append(obfuscationGuard).append(',');
          if (arguments == null) {
            argumentsDescription = "null";
          } else {
            argumentsDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(argumentsDescription).append(')').toString());
        }
    }

    ChannelBaseVolumeConsoleCommand(String commandName, Class[] parameterTypes, String description) {
        super(commandName, parameterTypes, description);
    }

    static {
        field_G = new boolean[56];
        field_F = "Dragonhide";
    }
}
