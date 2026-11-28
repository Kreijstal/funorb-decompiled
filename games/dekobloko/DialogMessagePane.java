/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogMessagePane extends ComponentContainer implements WidgetActivationListener {
    private String stringState0120;
    private ProgressMessageDialog uiComponentPart012State0002;
    static StringBuilder stringBuilderState0001;
    private InteractiveComponent[] interactiveComponentArrayState0002;
    static int[][] integerArrayArrayState0007;
    private int integerState0143;
    private BitmapFont bitmapFontState0010;
    static BufferedFile bufferedFileState0001;
    private int[] integerArrayState0033;
    static RgbSprite rgbSpriteState0012;
    static int integerState0144;
    static String stringState0121;
    static String stringState0122;

    DialogMessagePane(ProgressMessageDialog uiComponentPart012Argument1, BitmapFont bitmapFontArgument2, String stringArgument3) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int integerLocal1 = 0;
        this.integerState0143 = 0;
        try {
          this.bitmapFontState0010 = bitmapFontArgument2;
          this.stringState0120 = stringArgument3;
          this.uiComponentPart012State0002 = uiComponentPart012Argument1;
          integerLocal1 = null == this.stringState0120 ? 0 : this.bitmapFontState0010.textHeight(this.stringState0120, 260, this.bitmapFontState0010.integerState0518);
          this.setBounds(integerLocal1 + 22, 288, 0, 0, -16555);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "dj.<init>(" + (uiComponentPart012Argument1 != null ? "{...}" : "null") + ',' + (bitmapFontArgument2 != null ? "{...}" : "null") + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger0369(int integerArgument1) {
        if (integerArgument1 < 106) {
          DialogMessagePane.clearStaticReferences(false);
        }
        return SceneWidgetPart005.integerState0330;
    }

    public static void clearStaticReferences(boolean booleanArgument1) {
        stringBuilderState0001 = null;
        if (!booleanArgument1) {
          return;
        }
        rgbSpriteState0012 = null;
        integerArrayArrayState0007 = (int[][]) null;
        stringState0122 = null;
        stringState0121 = null;
        bufferedFileState0001 = null;
    }

    final void drawWidget(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        super.drawWidget(integerArgument1, -104, integerArgument3, integerArgument4);
        this.bitmapFontState0010.drawParagraph(this.stringState0120, integerArgument1 - (-this.integerState0110 - 14), this.integerState0104 + (integerArgument4 + 10), this.integerState0107 - 28, this.integerState0108, 16777215, -1, 0, 0, this.bitmapFontState0010.integerState0518);
        if (integerArgument2 > -103) {
          this.drawWidget(67, 1, 70, -22);
        }
    }

    private final void growActions(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3;
        if (this.integerState0143 >= integerArgument1) {
          return;
        }
        InteractiveComponent[] interactiveComponentArrayLocal4 = new InteractiveComponent[integerArgument1];
        InteractiveComponent[] interactiveComponentArrayLocal5 = interactiveComponentArrayLocal4;
        int[] integerArrayLocal6 = new int[integerArgument1];
        for (integerLocal1 = 0; integerLocal1 < this.integerState0143; integerLocal1++) {
          interactiveComponentArrayLocal4[integerLocal1] = this.interactiveComponentArrayState0002[integerLocal1];
          integerArrayLocal6[integerLocal1] = this.integerArrayState0033[integerLocal1];
        }
        this.integerState0143 = integerArgument1;
        integerLocal3 = -117 % ((50 - integerArgument2) / 51);
        this.integerArrayState0033 = integerArrayLocal6;
        this.interactiveComponentArrayState0002 = interactiveComponentArrayLocal5;
    }

    final InteractiveComponent addListenerButton(int integerArgument1, String stringArgument2, WidgetEventListener callbackContract006Argument3) {
        InteractiveComponent interactiveComponentLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        InteractiveComponent stackInteractiveComponentLocal4 = null;
        InteractiveComponent stackInteractiveComponentLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          interactiveComponentLocal1 = new InteractiveComponent(stringArgument2, callbackContract006Argument3);
          interactiveComponentLocal1.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport041());
          integerLocal3 = -2 + this.integerState0108;
          if (integerArgument1 <= 95) {
            stackInteractiveComponentLocal4 = (InteractiveComponent) null;
            return stackInteractiveComponentLocal4;
          }
          this.setBounds(this.integerState0108 + 34, this.integerState0107, 0, 0, -16555);
          interactiveComponentLocal1.setBounds(30, -14 + this.integerState0107, 7, integerLocal3, -16555);
          this.addChild(interactiveComponentLocal1, (byte) -55);
          stackInteractiveComponentLocal5 = interactiveComponentLocal1;
          return stackInteractiveComponentLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("dj.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (callbackContract006Argument3 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    final void addActionButton(String stringArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        try {
          if (integerArgument3 != 14) {
            this.stringState0120 = (String) null;
          }
          integerLocal1 = this.integerState0143;
          this.growActions(1 + integerLocal1, -104);
          this.interactiveComponentArrayState0002[integerLocal1] = this.addListenerButton(103, stringArgument1, (WidgetEventListener) (this));
          this.integerArrayState0033[integerLocal1] = integerArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "dj.E(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final static void performAction0372(RawSound rawSoundArgument1, int integerArgument2) {
        try {
          UiComponentPart001.performAction0057(98, 0, rawSoundArgument1, 128, 128);
          if (integerArgument2 != 22) {
            RawSound rawSoundLocal1 = (RawSound) null;
            DialogMessagePane.performAction0372((RawSound) null, 24);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "dj.D(" + (rawSoundArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    public final void onWidgetActivated(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 != 67) {
            stringState0121 = (String) null;
          }
          for (integerLocal1 = 0; integerLocal1 < this.integerState0143; integerLocal1++) {
            if (this.interactiveComponentArrayState0002[integerLocal1] != interactiveComponentArgument3) {
              continue;
            }
            integerLocal2 = this.integerArrayState0033[integerLocal1];
            if (integerLocal2 != -1) {
              MouseWheelInput.performAction0670(this.integerArrayState0033[integerLocal1], (byte) -109);
            } else {
              this.uiComponentPart012State0002.closeDialog(-123);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal7 = caughtParameterLocal9;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("dj.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    static {
        integerArrayArrayState0007 = (int[][]) null;
        stringBuilderState0001 = new StringBuilder(80);
        stringState0122 = "Show lobby chat from my friends";
        stringState0121 = "Show all game chat";
    }
}
