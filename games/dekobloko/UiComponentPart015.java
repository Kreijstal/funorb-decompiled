/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart015 extends ComponentDecorator {
    static String stringState0252;
    static int[] integerArrayState0100;
    static int integerState0319;
    static SceneWidgetPart010 sceneWidgetPart010State0002;

    final void performAction0232(int integerArgument1, int integerArgument2, int integerArgument3, UiComponent uiComponentArgument4, int integerArgument5, int integerArgument6) {
        UiComponentPart029 uiComponentPart029Local1 = null;
        try {
          super.performAction0232(integerArgument1, integerArgument2, integerArgument3, uiComponentArgument4, integerArgument5, integerArgument6);
          uiComponentPart029Local1 = UiComponentPart017.uiComponentPart029State0001;
          if (uiComponentPart029Local1 != null) {
            if (!this.computeBoolean0226(integerArgument6, (byte) -58, integerArgument5, integerArgument1, integerArgument3)) {
              return;
            }
            if (this.callbackContract006State0001 instanceof CallbackContract010) {
              ((CallbackContract010) (this.callbackContract006State0001)).performAction1238(uiComponentPart029Local1, this, (byte) -128);
              UiComponentPart017.uiComponentPart029State0001 = null;
              return;
            }
            if (uiComponentPart029Local1.callbackContract006State0001 instanceof CallbackContract010) {
              ((CallbackContract010) (uiComponentPart029Local1.callbackContract006State0001)).performAction1238(uiComponentPart029Local1, this, (byte) -128);
              UiComponentPart017.uiComponentPart029State0001 = null;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "id.IB(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + (uiComponentArgument4 != null ? "{...}" : "null") + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    private UiComponentPart015(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, CallbackContract004 callbackContract004Argument5, CallbackContract006 callbackContract006Argument6, UiComponent uiComponentArgument7) {
        super(integerArgument1, integerArgument2, integerArgument3, integerArgument4, callbackContract004Argument5, callbackContract006Argument6);
        try {
          this.uiComponentState0002 = uiComponentArgument7;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "id.<init>(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + (callbackContract004Argument5 != null ? "{...}" : "null") + ',' + (callbackContract006Argument6 != null ? "{...}" : "null") + ',' + (uiComponentArgument7 != null ? "{...}" : "null") + ')');
        }
    }

    final static RgbSprite computeRgbSprite0791(ResourceArchive resourceArchiveArgument1, String stringArgument2, String stringArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RgbSprite stackRgbSpriteLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          if (integerArgument4 != 8192) {
            sceneWidgetPart010State0002 = (SceneWidgetPart010) null;
          }
          integerLocal1 = resourceArchiveArgument1.computeInteger0926(-1, stringArgument3);
          integerLocal3 = resourceArchiveArgument1.computeInteger0913(integerLocal1, 13030, stringArgument2);
          stackRgbSpriteLocal4 = MixedSupport004.computeRgbSprite0054(integerLocal3, 50, resourceArchiveArgument1, integerLocal1);
          return stackRgbSpriteLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal2 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("id.F(");
          if (resourceArchiveArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public static void performAction0792(boolean booleanArgument1) {
        integerArrayState0100 = null;
        sceneWidgetPart010State0002 = null;
        if (booleanArgument1) {
          stringState0252 = null;
          return;
        }
        RgbSprite rgbSpriteLocal1 = (RgbSprite) null;
        UiComponentPart015.performAction0790(99, 26, 67, 28, -65, -116, 74, (RgbSprite) null, 106);
        stringState0252 = null;
    }

    final static void performAction0790(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, RgbSprite rgbSpriteArgument8, int integerArgument9) {
        try {
          BufferedSocket.integerState0668 = integerArgument9;
          MixedSupport106.integerState0591 = integerArgument6;
          UiComponentPart011.integerState0240 = integerArgument3;
          DiagnosticSupport001.integerState0125 = integerArgument4;
          MixedSupport080.integerState0429 = integerArgument5;
          UiComponent.integerState0106 = integerArgument2;
          MouseInput.rgbSpriteState0073 = rgbSpriteArgument8;
          if (integerArgument7 != 8192) {
            UiComponentPart015.performAction0792(false);
          }
          CollectionSupport003.integerState0543 = integerArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "id.E(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + (rgbSpriteArgument8 != null ? "{...}" : "null") + ',' + integerArgument9 + ')');
        }
    }

    final static SceneWidget computeSceneWidget0793(int integerArgument1) {
        if (integerArgument1 != 8192) {
          UiComponentPart015.performAction0792(false);
          return LoginCredentials.computeSceneWidget0899(false);
        }
        return LoginCredentials.computeSceneWidget0899(false);
    }

    static {
        stringState0252 = "<%0>: <%1>";
        integerArrayState0100 = new int[8192];
    }
}
