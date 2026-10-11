/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MixedSupport155 extends ResourceSupport002 implements CallbackContract013 {
    private UiComponentPart028 uiComponentPart028State0009;
    static int integerState0937;
    static RgbSprite rgbSpriteState0076;
    static String stringState0633;
    static RgbSprite rgbSpriteState0077;
    static String stringState0634;
    static String stringState0635;
    static String stringState0636;
    static SceneWidget sceneWidgetState0151;

    abstract RenderingSupport015 computeRenderingSupport0150817(String stringArgument1, byte byteArgument2);

    final String computeString0101(byte byteArgument1) {
        if (byteArgument1 > 2) {
          return this.computeString0816(this.uiComponentPart028State0009.stringState0078, (byte) -11);
        }
        rgbSpriteState0076 = (RgbSprite) null;
        return this.computeString0816(this.uiComponentPart028State0009.stringState0078, (byte) -11);
    }

    final static void performAction2098(int integerArgument1) {
        MixedSupport094.stringState0372 = UiComponentPart006.cipherPacketBufferState0001.computeString2082((byte) -38);
        CharSequence charSequenceLocal1 = (CharSequence) ((Object) MixedSupport094.stringState0372);
        MixedSupport051.stringState0212 = ComponentContainer.computeString1011(charSequenceLocal1, (byte) 2);
        if (integerArgument1 != 140) {
          MixedSupport155.computeContainer2099((byte) 98);
        }
    }

    final RenderingSupport015 computeRenderingSupport0150098(int integerArgument1) {
        if (integerArgument1 == -5520) {
          return this.computeRenderingSupport0150817(this.uiComponentPart028State0009.stringState0078, (byte) -40);
        }
        this.uiComponentPart028State0009 = (UiComponentPart028) null;
        return this.computeRenderingSupport0150817(this.uiComponentPart028State0009.stringState0078, (byte) -40);
    }

    abstract String computeString0816(String stringArgument1, byte byteArgument2);

    public final void performAction0690(int integerArgument1, UiComponentPart028 uiComponentPart028Argument2) {
        if (integerArgument1 != 16737894) {
          return;
        }
        try {
          this.performAction0099((byte) -51);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wm.N(" + integerArgument1 + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Container computeContainer2099(byte byteArgument1) {
        if (MixedSupport054.frameState0001 != null) {
          return (java.awt.Container) ((Object) MixedSupport054.frameState0001);
        }
        if (byteArgument1 <= 123) {
          MixedSupport155.performAction2098(74);
          return (java.awt.Container) ((Object) UiComponentPart029.computeApplet1689(25144));
        }
        return (java.awt.Container) ((Object) UiComponentPart029.computeApplet1689(25144));
    }

    public final void performAction0695(int integerArgument1, UiComponentPart028 uiComponentPart028Argument2) {
        try {
          if (integerArgument1 != -2569) {
            rgbSpriteState0076 = (RgbSprite) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wm.K(" + integerArgument1 + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean computeBoolean1239(byte byteArgument1) {
        int integerLocal1 = 112 / ((byteArgument1 - 72) / 40);
        if (null == this.uiComponentPart028State0009.stringState0078) {
          return true;
        }
        if (0 != this.uiComponentPart028State0009.stringState0078.length()) {
          return false;
        }
        return true;
    }

    MixedSupport155(UiComponentPart028 uiComponentPart028Argument1) {
        try {
          this.uiComponentPart028State0009 = uiComponentPart028Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wm.<init>(" + (uiComponentPart028Argument1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction2097(int integerArgument1) {
        stringState0633 = null;
        sceneWidgetState0151 = null;
        stringState0636 = null;
        if (integerArgument1 == 18966) {
          rgbSpriteState0076 = null;
          rgbSpriteState0077 = null;
          stringState0635 = null;
          stringState0634 = null;
          return;
        }
        MixedSupport155.computeContainer2099((byte) 42);
        rgbSpriteState0076 = null;
        rgbSpriteState0077 = null;
        stringState0635 = null;
        stringState0634 = null;
    }

    static {
        stringState0633 = "Please wait...";
        stringState0634 = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        rgbSpriteState0077 = new RgbSprite(540, 140);
        stringState0635 = "Chain Bonus: ";
        stringState0636 = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
