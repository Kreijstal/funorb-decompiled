/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport066 {
    static SceneWidget sceneWidgetState0058;
    static int integerState0341;
    static RgbSprite rgbSpriteState0023;
    static SceneWidget sceneWidgetState0059;
    static String stringState0272;
    static String stringState0273;
    static String stringState0274;
    static SceneWidget sceneWidgetState0060;

    final static void performAction0869(String[] args, int integerArgument2, String stringArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        boolean stackBooleanLocal2 = false;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        String stringLocal11 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          GameAssets.mixedSupport004State0004 = MixedSupport075.mixedSupport004State0002;
          if (integerArgument2 == 255) {
            stackBooleanLocal2 = false;
            stackBooleanLocal3 = !(MixedSupport068.integerState0352 >= 13);
            RichTextLayout.mixedSupport016State0001 = MixedSupport013.computeMixedSupport0160188(stackBooleanLocal2, stackBooleanLocal3);
          } else {
            if (100 > integerArgument2) {
              RichTextLayout.mixedSupport016State0001 = MixedSupport140.computeMixedSupport0161904(integerArgument2, stringArgument3, 127);
            } else {
              if (integerArgument2 > 105) {
                RichTextLayout.mixedSupport016State0001 = MixedSupport140.computeMixedSupport0161904(integerArgument2, stringArgument3, 127);
              } else {
                RichTextLayout.mixedSupport016State0001 = MixedSupport154.computeMixedSupport0162045(args, -3);
              }
            }
          }
          if (integerArgument4 == 0) {
            return;
          }
          stringLocal11 = (String) null;
          MixedSupport066.performAction0869((String[]) null, -25, (String) null, -72);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal9 = caughtParameterLocal12;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal10;
          stackStringBuilderLocal5 = new StringBuilder().append("jc.C(");
          if (args == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public static void performAction0868(boolean booleanArgument1) {
        sceneWidgetState0058 = null;
        stringState0274 = null;
        sceneWidgetState0059 = null;
        if (booleanArgument1) {
          rgbSpriteState0023 = null;
          stringState0272 = null;
          stringState0273 = null;
          sceneWidgetState0060 = null;
          return;
        }
        MixedSupport003 mixedSupport003Local1 = (MixedSupport003) null;
        MixedSupport066.performAction0867((MixedSupport003) null, -72);
        rgbSpriteState0023 = null;
        stringState0272 = null;
        stringState0273 = null;
        sceneWidgetState0060 = null;
    }

    final static void performAction0870(byte byteArgument1) {
        if (byteArgument1 != 84) {
          sceneWidgetState0059 = (SceneWidget) null;
        }
    }

    final static void performAction0867(MixedSupport003 mixedSupport003Argument1, int integerArgument2) {
        try {
          mixedSupport003Argument1.integerArrayState0005 = new int[]{integerArgument2};
          mixedSupport003Argument1.characterArrayState0002 = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "jc.B(" + (mixedSupport003Argument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void performAction0866(byte byteArgument1) {
        InputAdapter003.sceneWidgetState0050 = null;
        RenderingSupport001.sceneWidgetState0004 = null;
        SceneWidgetPart013.sceneWidgetState0139 = null;
        UiComponentPart031.sceneWidgetState0116 = null;
        LoginCredentials.booleanState0085 = true;
        if (byteArgument1 < 97) {
          return;
        }
        if (ComponentContainer.sceneWidgetState0069 == null) {
          MixedSupport070.sceneWidgetState0068 = null;
          return;
        }
        DiagnosticSupport002.sceneWidgetState0057 = MixedSupport067.sceneWidgetState0067;
        UiComponentPart033.sceneWidgetState0150 = ComponentContainer.sceneWidgetState0069;
        MixedSupport067.sceneWidgetState0067 = null;
        ComponentContainer.sceneWidgetState0069 = null;
        UiComponentPart033.sceneWidgetState0150.integerState0899 = -1;
        UiComponentPart033.sceneWidgetState0150.integerState0889 = -1;
        MixedSupport070.sceneWidgetState0068 = null;
    }

    static {
        integerState0341 = 0;
        stringState0273 = "Logging in...";
        stringState0274 = "You have <%0> unread messages!";
        stringState0272 = "Simultaneous Bonus: ";
    }
}
