/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart009 extends InteractiveComponent {
    static int integerState0149;
    static int integerState0150;
    static String[] stringArrayState0008;
    static String stringState0126;

    UiComponentPart009(String stringArgument1, CallbackContract006 callbackContract006Argument2, boolean booleanArgument3) {
        this(stringArgument1, callbackContract006Argument2);
        try {
          this.booleanState0034 = booleanArgument3 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "dl.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (callbackContract006Argument2 != null ? "{...}" : "null") + ',' + booleanArgument3 + ')');
        }
    }

    private UiComponentPart009(String stringArgument1, CallbackContract006 callbackContract006Argument2) {
        this(stringArgument1, RenderingSupport001.networkSupport002State0001.callbackContract004State0001, callbackContract006Argument2);
        try {
          this.callbackContract004State0006 = RenderingSupport001.networkSupport002State0001.callbackContract004State0004;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "dl.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (callbackContract006Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction0412(byte byteArgument1, boolean booleanArgument2, RgbSprite rgbSpriteArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (rgbSpriteArgument3 != SceneWidgetPart011.rgbSpriteState0058) {
            if (rgbSpriteArgument3 != null) {
              rgbSpriteArgument3.performAction0313(0, integerArgument4, integerArgument5);
            } else {
              SoftwareRaster.performAction0719(0, 0, 640, 480, 0);
            }
          } else {
            MixedSupport082.performAction1085(integerArgument5, integerArgument4, 0, true);
          }
          if (booleanArgument2) {
            MixedSupport040.performAction0588(0, integerArgument5, -26, integerArgument4);
          }
          if (byteArgument1 >= 40) {
            return;
          }
          stringState0126 = (String) null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("dl.I(").append(byteArgument1).append(',').append(booleanArgument2).append(',');
          if (rgbSpriteArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    public static void performAction0416(boolean booleanArgument1) {
        if (booleanArgument1) {
          return;
        }
        stringArrayState0008 = null;
        stringState0126 = null;
    }

    final static void performAction0414(int integerArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        RgbSprite rgbSpriteLocal3 = null;
        MixedSupport020 mixedSupport020Local4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport020Local4 = (MixedSupport020) (UiComponentPart020.nodeDequeState0022.computeHashNode1970((byte) 113));
          while (mixedSupport020Local4 != null) {
            MixedSupport039.performAction0581((byte) 104, mixedSupport020Local4, integerArgument2);
            mixedSupport020Local4 = (MixedSupport020) (UiComponentPart020.nodeDequeState0022.computeHashNode1974(true));
          }
          if (integerArgument1 == 640) {
            return;
          }
          rgbSpriteLocal3 = (RgbSprite) null;
          UiComponentPart009.performAction0412((byte) 62, true, (RgbSprite) null, -96, 15);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal1), "dl.L(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    private UiComponentPart009(String stringArgument1, CallbackContract004 callbackContract004Argument2, CallbackContract006 callbackContract006Argument3) {
        super(stringArgument1, callbackContract004Argument2, callbackContract006Argument3);
        try {
          this.callbackContract004State0006 = RenderingSupport001.networkSupport002State0001.callbackContract004State0004;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "dl.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (callbackContract004Argument2 != null ? "{...}" : "null") + ',' + (callbackContract006Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0415(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        this.booleanState0034 = !this.booleanState0034 ? true : false;
        super.performAction0415(integerArgument1, integerArgument2, integerArgument3, integerArgument4);
    }

    final static boolean computeBoolean0413(int integerArgument1) {
        if (integerArgument1 != 480) {
          return true;
        }
        return 250 < MixedSupport046.integerState0250 ? true : false;
    }

    static {
        integerState0149 = 20;
        stringState0126 = "Stage <%0>";
        integerState0150 = -1;
    }
}
