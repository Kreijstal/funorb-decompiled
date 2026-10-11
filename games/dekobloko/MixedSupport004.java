/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport004 {
    static int[][] integerArrayArrayState0003;
    static String stringState0014;
    static int integerState0029;
    static int integerState0030;
    static String stringState0015;
    static String stringState0016;
    static String stringState0017;

    final static RgbSprite computeRgbSprite0054(int integerArgument1, int integerArgument2, ResourceArchive resourceArchiveArgument3, int integerArgument4) {
        RuntimeException runtimeExceptionLocal1 = null;
        RgbSprite stackRgbSpriteLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (!SceneWidgetPart002.computeBoolean0618(integerArgument4, resourceArchiveArgument3, integerArgument1, 49)) {
            return null;
          }
          if (integerArgument2 != 50) {
            MixedSupport004.performAction0052((byte) -13);
          }
          stackRgbSpriteLocal2 = SceneWidgetPart008.computeRgbSprite1297((byte) 26);
          return stackRgbSpriteLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("af.C(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (resourceArchiveArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction0053(int integerArgument1, int integerArgument2) {
        SceneWidgetPart009.integerState0647 = integerArgument2 * integerArgument1 / 50;
        UiComponentPart014.integerState0316 = integerArgument2 * 20 / 50;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void performAction0052(byte byteArgument1) {
        stringState0015 = null;
        stringState0017 = null;
        stringState0016 = null;
        int integerLocal1 = -41 % ((3 - byteArgument1) / 37);
        integerArrayArrayState0003 = (int[][]) null;
        stringState0014 = null;
    }

    final static boolean computeBoolean0055(int integerArgument1, int[] integerArrayArgument2, int[] integerArrayArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          for (integerLocal1 = integerArgument1; integerLocal1 < 8; integerLocal1++) {
            if (integerArrayArgument2[integerLocal1] != integerArrayArgument3[integerLocal1]) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("af.D(").append(integerArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    static {
        stringState0015 = "FULL ACCESS";
        stringState0016 = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        stringState0014 = "Friends can be added in the multiplayer<nbsp>lobby";
        stringState0017 = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
