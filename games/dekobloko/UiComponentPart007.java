/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart007 extends ComponentContainer implements CallbackContract019 {
    static String stringState0111;
    static IndexedSprite[] indexedSpriteArrayState0002;
    static SceneWidget sceneWidgetState0019;
    private String[] stringArrayState0005;
    private InteractiveComponent[] interactiveComponentArrayState0001;
    private CallbackContract002 callbackContract002State0001;
    static int[][] integerArrayArrayState0006;
    static String stringState0112;
    static String stringState0113;
    static String stringState0114;

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = 0;
          if (byteArgument1 != 67) {
            UiComponentPart007.computeRgbSpriteArray0392(123, -2, -15);
          }
          while (integerLocal1 < this.stringArrayState0005.length) {
            if (this.interactiveComponentArrayState0001[integerLocal1] == interactiveComponentArgument3) {
              this.callbackContract002State0001.performAction0345(this.stringArrayState0005[integerLocal1], byteArgument1 - 28531);
            }
            integerLocal1++;
          }
          if (interactiveComponentArgument3 == this.interactiveComponentArrayState0001[this.stringArrayState0005.length]) {
            this.callbackContract002State0001.performAction0342(25);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("df.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final boolean computeBoolean0198(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          if (super.computeBoolean0198(86, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          integerLocal1 = 11 / ((-22 - integerArgument1) / 49);
          if (integerArgument2 == 98) {
            stackBooleanLocal3 = this.computeBoolean1010(uiComponentArgument3, (byte) -121);
            return stackBooleanLocal3;
          }
          if (integerArgument2 != 99) {
            return false;
          }
          stackBooleanLocal4 = this.computeBoolean1009(32, uiComponentArgument3);
          return stackBooleanLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("df.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    UiComponentPart007(CallbackContract002 callbackContract002Argument1) {
        super(0, 0, 0, 0, (CallbackContract004) null);
        try {
          this.callbackContract002State0001 = callbackContract002Argument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "df.<init>(" + (callbackContract002Argument1 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        super.performAction0175(integerArgument1, -124, integerArgument3, integerArgument4);
        if (integerArgument3 != 0) {
          return;
        }
        if (integerArgument2 > -103) {
          this.performAction0175(-127, -2, -30, -66);
        }
        BitmapFont bitmapFontLocal1 = GameDomainSupport003.bitmapFontState0015;
        if (this.stringArrayState0005 != null) {
          bitmapFontLocal1.computeInteger1213(UiComponentPart011.stringState0188, integerArgument1 + this.integerState0110, integerArgument4 + this.integerState0104, this.integerState0107, 20, 16777215, -1, 0, 0, bitmapFontLocal1.integerState0518 + bitmapFontLocal1.integerState0523);
        }
    }

    public static void performAction0391(int integerArgument1) {
        sceneWidgetState0019 = null;
        indexedSpriteArrayState0002 = null;
        stringState0112 = null;
        integerArrayArrayState0006 = (int[][]) null;
        stringState0113 = null;
        if (integerArgument1 != 1) {
          UiComponentPart007.performAction0391(-31);
        }
        stringState0111 = null;
        stringState0114 = null;
    }

    final static SceneWidget computeSceneWidget0394(int integerArgument1) {
        int integerLocal1 = -96 / ((45 - integerArgument1) / 63);
        return GameDomainSupport002.sceneWidgetPart008State0002.sceneWidgetState0090;
    }

    final static RgbSprite[] computeRgbSpriteArray0392(int integerArgument1, int integerArgument2, int integerArgument3) {
        if (integerArgument2 != 0) {
          UiComponentPart007.performAction0391(10);
        }
        return MixedSupport095.computeRgbSpriteArray1311(integerArgument3, integerArgument1, -3932, 1);
    }

    final void performAction0393(int integerArgument1, String[] stringArrayArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        MixedSupport099 mixedSupport099Local9 = null;
        int integerLocal10 = 0;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          this.nodeDequeState0013.performAction1971(126);
          if (stringArrayArgument2 != null &&
            stringArrayArgument2.length != 0) {
            if (integerArgument1 != 32) {
              UiComponentPart007.computeRgbSpriteArray0392(-125, -89, -29);
            }
            integerLocal7 = stringArrayArgument2.length;
            this.stringArrayState0005 = new String[integerLocal7];
            for (integerLocal1 = 0; integerLocal7 > integerLocal1; integerLocal1++) {
              this.stringArrayState0005[integerLocal1] = MixedSupport132.computeString1838((CharSequence) ((Object) stringArrayArgument2[integerLocal1]), true).replace(' ', ' ');
            }
            mixedSupport099Local9 = new MixedSupport099(GameDomainSupport003.bitmapFontState0015, 0, 1);
            this.interactiveComponentArrayState0001 = new InteractiveComponent[1 + integerLocal7];
            for (integerLocal2 = 0; integerLocal7 > integerLocal2; integerLocal2++) {
              this.interactiveComponentArrayState0001[integerLocal2] = new InteractiveComponent(this.stringArrayState0005[integerLocal2], (CallbackContract006) (this));
              this.interactiveComponentArrayState0001[integerLocal2].callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport099Local9);
              this.interactiveComponentArrayState0001[integerLocal2].stringState0080 = DekoBlokoClient.stringState0097;
              this.interactiveComponentArrayState0001[integerLocal2].performAction0241(15, 80, 0, integerLocal2 * 16 + 20, -16555);
              this.performAction1012(this.interactiveComponentArrayState0001[integerLocal2], (byte) -55);
            }
            this.interactiveComponentArrayState0001[integerLocal7] = new InteractiveComponent(MixedSupport015.stringState0074, (CallbackContract006) (this));
            this.interactiveComponentArrayState0001[integerLocal7].callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport099Local9);
            this.interactiveComponentArrayState0001[integerLocal7].performAction0241(15, 100, 0, 20 + 16 * (1 + integerLocal7), -16555);
            this.performAction1012(this.interactiveComponentArrayState0001[integerLocal7], (byte) -55);
            return;
          }
          this.stringArrayState0005 = null;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal6 = caughtParameterLocal11;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("df.B(").append(integerArgument1).append(',');
          if (stringArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    static {
        stringState0111 = "(Including <%0>)";
        stringState0112 = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        stringState0114 = "Press TAB to chat or F10 to open Quick Chat.";
        stringState0113 = "Reject <%0> from this game";
    }
}
