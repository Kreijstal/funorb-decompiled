/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport129 extends MixedSupport155 {
    private boolean booleanState0190;
    static RgbSprite[] rgbSpriteArrayState0028;
    static String stringState0535;
    static String stringState0536;
    static RgbSprite[] rgbSpriteArrayState0029;
    static int[] integerArrayState0207;
    static String stringState0537;
    private String stringState0538;
    private CodecSupport003 codecSupport003State0001;

    final static boolean computeBoolean1829(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (13 == MixedSupport153.integerState0931) {
          UiComponentPart026.performAction1582(integerArgument2 - 89);
          return true;
        }
        if (MixedSupport153.integerState0931 == integerArgument2) {
          SceneWidgetPart007.sceneWidgetPart005State0002.performAction0804(0);
          return true;
        }
        if (null == SceneWidgetPart007.sceneWidgetPart005State0002) {
          return false;
        }
        if (SceneWidgetPart007.sceneWidgetPart005State0002.computeBoolean0802(integerArgument3, 15028, integerArgument1)) {
          return true;
        }
        return false;
    }

    final RenderingSupport015 computeRenderingSupport0150817(String stringArgument1, byte byteArgument2) {
        MixedSupport124 mixedSupport124Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        RenderingSupport015 stackRenderingSupport015Local3 = null;
        RenderingSupport015 stackRenderingSupport015Local4 = null;
        RenderingSupport015 stackRenderingSupport015Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (this.codecSupport003State0001.computeRenderingSupport0150817(stringArgument1, byteArgument2) == MixedSupport149.renderingSupport015State0005) {
            stackRenderingSupport015Local3 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local3;
          }
          if (!stringArgument1.equals(this.stringState0538)) {
            mixedSupport124Local1 = MixedSupport063.computeMixedSupport1240829(103, stringArgument1);
            if (!mixedSupport124Local1.computeBoolean1767(103)) {
              stackRenderingSupport015Local4 = DiagnosticSupport002.renderingSupport015State0002;
              return stackRenderingSupport015Local4;
            }
            this.stringState0538 = stringArgument1;
            this.booleanState0190 = mixedSupport124Local1.computeBoolean1774(-3348);
          }
          if (this.booleanState0190) {
            stackRenderingSupport015Local5 = MixedSupport023.renderingSupport015State0001;
          } else {
            stackRenderingSupport015Local5 = MixedSupport149.renderingSupport015State0005;
          }
          return stackRenderingSupport015Local5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("tl.B(");
          if (stringArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    public static void performAction1830(byte byteArgument1) {
        rgbSpriteArrayState0029 = null;
        stringState0537 = null;
        if (byteArgument1 < -59) {
          stringState0536 = null;
          stringState0535 = null;
          integerArrayState0207 = null;
          rgbSpriteArrayState0028 = null;
          return;
        }
        rgbSpriteArrayState0029 = (RgbSprite[]) null;
        stringState0536 = null;
        stringState0535 = null;
        integerArrayState0207 = null;
        rgbSpriteArrayState0028 = null;
    }

    MixedSupport129(UiComponentPart028 uiComponentPart028Argument1, UiComponentPart028 uiComponentPart028Argument2) {
        super(uiComponentPart028Argument1);
        this.stringState0538 = "";
        this.booleanState0190 = false;
        try {
          this.codecSupport003State0001 = new CodecSupport003(uiComponentPart028Argument1, uiComponentPart028Argument2);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "tl.<init>(" + (uiComponentPart028Argument1 != null ? "{...}" : "null") + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final String computeString0816(String stringArgument1, byte byteArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (byteArgument2 != -11) {
            stringState0536 = (String) null;
          }
          if (this.codecSupport003State0001.computeRenderingSupport0150817(stringArgument1, (byte) -40) == MixedSupport149.renderingSupport015State0005) {
            stackStringLocal2 = this.codecSupport003State0001.computeString0816(stringArgument1, (byte) -11);
            return stackStringLocal2;
          }
          if (this.computeRenderingSupport0150817(stringArgument1, (byte) -40) != MixedSupport149.renderingSupport015State0005) {
            return MixedSupport081.stringState0331;
          }
          stackStringLocal3 = NetworkSupport003.stringState0107;
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("tl.A(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(')').toString());
        }
    }

    static {
        stringState0535 = "This option cannot be combined with the current settings for:  ";
        integerArrayState0207 = new int[5];
        stringState0536 = "Ignore";
        stringState0537 = "You can spectate this game";
    }
}
