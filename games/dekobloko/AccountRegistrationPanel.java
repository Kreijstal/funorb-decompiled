/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AccountRegistrationPanel extends ComponentContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    NameSuggestionsPanel uiComponentPart007State0002;
    static SceneWidget sceneWidgetState0116;
    private ValidatedTextField uiComponentPart021State0002;
    private ValidatedTextField uiComponentPart021State0003;
    private ValidatedTextField uiComponentPart021State0004;
    static Random randomState0003;
    private ValidatedTextField uiComponentPart021State0005;
    private InteractiveComponent interactiveComponentState0012;
    private UiComponentPart009 uiComponentPart009State0001;
    private InteractiveComponent interactiveComponentState0013;
    static String stringState0528;
    static String stringState0529;
    private ValidatedTextField uiComponentPart021State0006;
    private ValidatedTextField uiComponentPart021State0007;
    private RichTextWidget uiComponentPart025State0002;
    static boolean booleanState0185;

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.uiComponentPart021State0002 = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.uiComponentPart021State0007 = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.uiComponentPart021State0004 = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.uiComponentPart021State0005 = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.uiComponentPart021State0006 = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.uiComponentPart021State0003 = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int integerLocal1 = 1;
        this.uiComponentPart009State0001 = new UiComponentPart009("", (WidgetEventListener) null, integerLocal1 != 0);
        this.interactiveComponentState0012 = new InteractiveComponent(DraggableWidgetContainer.stringState0497, (WidgetEventListener) null);
        this.interactiveComponentState0013 = new InteractiveComponent(GameDomainSupport002.stringState0146, (WidgetEventListener) null);
        this.uiComponentPart021State0002.stringState0080 = RichTextLayout.stringState0136;
        this.uiComponentPart021State0007.stringState0080 = ResourceSupport001.stringState0011;
        this.uiComponentPart021State0004.stringState0080 = MixedSupport002.stringState0004;
        this.uiComponentPart021State0005.stringState0080 = MixedSupport145.stringState0609;
        this.uiComponentPart021State0006.stringState0080 = MixedSupport125.stringState0547;
        this.uiComponentPart021State0003.stringState0080 = MixedSupport035.stringState0165;
        this.uiComponentPart009State0001.stringState0080 = InputAdapter001.stringState0034;
        this.uiComponentPart021State0002.setFieldValidator(new PlayerNameAvailabilityValidator(this.uiComponentPart021State0002), -5362);
        this.uiComponentPart021State0007.setFieldValidator(new EmailFormatValidator(this.uiComponentPart021State0007), -5362);
        this.uiComponentPart021State0004.setFieldValidator(new ConfirmedEmailAvailabilityValidator(this.uiComponentPart021State0004, this.uiComponentPart021State0007), -5362);
        this.uiComponentPart021State0005.setFieldValidator(new PasswordValidator(this.uiComponentPart021State0005, this.uiComponentPart021State0002, this.uiComponentPart021State0007), -5362);
        this.uiComponentPart021State0006.setFieldValidator(new MatchingFieldValidator(this.uiComponentPart021State0006, this.uiComponentPart021State0005), -5362);
        this.uiComponentPart021State0003.setFieldValidator(new AgeValidator(this.uiComponentPart021State0003), -5362);
        this.interactiveComponentState0012.booleanState0035 = false;
        this.interactiveComponentState0012.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport041());
        this.interactiveComponentState0013.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport094());
        this.uiComponentPart021State0002.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport024(10000536));
        MixedSupport024 cachedMixedSupport024Local2 = new MixedSupport024(10000536);
        this.uiComponentPart021State0004.callbackContract004State0006 = (WidgetRenderer) ((Object) cachedMixedSupport024Local2);
        this.uiComponentPart021State0007.callbackContract004State0006 = (WidgetRenderer) ((Object) cachedMixedSupport024Local2);
        this.uiComponentPart021State0003.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport024(10000536));
        this.uiComponentPart009State0001.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport121());
        MixedSupport050 cachedMixedSupport050Local3 = new MixedSupport050(10000536);
        this.uiComponentPart021State0006.callbackContract004State0006 = (WidgetRenderer) ((Object) cachedMixedSupport050Local3);
        this.uiComponentPart021State0005.callbackContract004State0006 = (WidgetRenderer) ((Object) cachedMixedSupport050Local3);
        String stringLocal4 = NodeHashTableIterator.substituteIndexedPlaceholders(102, NetworkSupport007.stringState0347, new String[]{this.getLinkOpenMarkup((byte) 63), this.getLinkCloseMarkup((byte) 29)});
        int integerLocal5 = 20;
        integerLocal5 = integerLocal5 + this.addLabeledField(9828, this.uiComponentPart021State0007, integerLocal5, MixedSupport031.stringState0153, 170);
        integerLocal5 = integerLocal5 + (5 + this.addLabeledFieldWithValidationMessage(this.uiComponentPart021State0004, MixedSupport091.stringState0378, 20, (byte) -44, 170, integerLocal5, ""));
        integerLocal5 = integerLocal5 + this.addLabeledField(9828, this.uiComponentPart021State0005, integerLocal5, MixedSupport017.stringState0087, 170);
        integerLocal5 = integerLocal5 + (this.addLabeledFieldWithDefaultValidationMessage(125, this.uiComponentPart021State0006, integerLocal5, MixedSupport117.stringState0518, MixedSupport045.stringState0191, 170) + 5);
        integerLocal5 = integerLocal5 + (5 + this.addLabeledFieldWithDefaultValidationMessage(114, this.uiComponentPart021State0002, integerLocal5, MixedSupport109.stringState0476, MixedSupport061.stringState0260, 170));
        integerLocal5 = integerLocal5 + this.addLabeledFieldWithValidationIcon(RenderingSupport012.stringState0444, (byte) -107, this.uiComponentPart021State0003, 170, integerLocal5);
        LabeledWidgetContainer uiComponentPart006Local6 = new LabeledWidgetContainer(46, integerLocal5, -90 + this.integerState0107, 25, this.uiComponentPart009State0001, true, -120 + this.integerState0107, 5, MixedSupport011.bitmapFontState0006, 11579568, MixedSupport051.stringState0211);
        this.addChild(uiComponentPart006Local6, (byte) -55);
        integerLocal5 = integerLocal5 + uiComponentPart006Local6.integerState0108;
        DefaultTextWidgetRenderer mixedSupport001Local7 = new DefaultTextWidgetRenderer(GameDomainSupport003.bitmapFontState0015, 0, 0, 0, 0, 16777215, -1, 0, 0, GameDomainSupport003.bitmapFontState0015.integerState0518, -1, 2147483647, true);
        this.uiComponentPart025State0002 = new RichTextWidget(stringLocal4, mixedSupport001Local7);
        this.uiComponentPart025State0002.stringState0080 = "";
        this.uiComponentPart025State0002.setHotspotTooltip(MixedSupport107.stringState0464, 0, 1);
        this.uiComponentPart025State0002.setHotspotTooltip(MixedSupport107.stringState0464, 1, 1);
        this.uiComponentPart025State0002.callbackContract006State0001 = (WidgetEventListener) (this);
        this.uiComponentPart025State0002.setTextBounds(-114, 46, integerLocal5, -90 + this.integerState0107);
        integerLocal5 = integerLocal5 + (15 + this.uiComponentPart025State0002.integerState0108);
        this.addChild(this.uiComponentPart025State0002, (byte) -55);
        int integerLocal8 = 4;
        int integerLocal9 = 200;
        this.interactiveComponentState0012.setBounds(40, integerLocal9, -integerLocal9 + 496 >> 1, integerLocal5, -16555);
        this.interactiveComponentState0013.setBounds(40, 60, 3 + integerLocal8, integerLocal5 + 15, -16555);
        this.interactiveComponentState0013.callbackContract006State0001 = (WidgetEventListener) (this);
        this.interactiveComponentState0012.callbackContract006State0001 = (WidgetEventListener) (this);
        this.addChild(this.interactiveComponentState0012, (byte) -55);
        this.addChild(this.interactiveComponentState0013, (byte) -55);
        this.uiComponentPart007State0002 = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.uiComponentPart007State0002.setBounds(150, -60 - this.uiComponentPart021State0002.integerState0107 + (this.integerState0107 - this.uiComponentPart021State0002.integerState0110), this.uiComponentPart021State0002.integerState0110 + this.uiComponentPart021State0002.integerState0107 + 60, this.uiComponentPart021State0002.integerState0104 + 20, -16555);
        this.addChild(this.uiComponentPart007State0002, (byte) -55);
        this.setBounds(55 + integerLocal5 + integerLocal8, 496, 0, 0, -16555);
    }

    private final boolean submitRegistration(byte byteArgument1) {
        if (!this.canSubmitRegistration(94)) {
          return false;
        }
        int integerLocal1 = -1;
        try {
          integerLocal1 = Integer.parseInt(this.uiComponentPart021State0003.stringState0078);
        } catch (NumberFormatException numberFormatException) {
        }
        if (byteArgument1 != -35) {
          AccountRegistrationPanel.performAction1593(-18, false, -28, 107);
        }
        return SecondaryNodeHashTable.computeBoolean1118(this.uiComponentPart021State0005.stringState0078, (byte) 123, this, this.uiComponentPart009State0001.booleanState0034, integerLocal1, this.uiComponentPart021State0002.stringState0078, this.uiComponentPart021State0007.stringState0078);
    }

    final static boolean computeBoolean1586(byte byteArgument1, int[] integerArrayArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (byteArgument1 < 2) {
            return false;
          }
          for (integerLocal1 = 0; integerLocal1 < 8; integerLocal1++) {
            if (integerArrayArgument2[integerLocal1] != 0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal2 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("tf.HA(").append(byteArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final static void performAction1585(byte byteArgument1, boolean booleanArgument2) {
        MixedSupport079.performAction1000(-1, booleanArgument2);
        MouseWheelInput.performAction0671(-1, booleanArgument2);
        int integerLocal1 = 36 / ((-24 - byteArgument1) / 53);
    }

    public final void onWidgetActivated(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        boolean discarded$1 = false;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (byteArgument1 != 67) {
            return;
          }
          if (this.interactiveComponentState0013 != interactiveComponentArgument3) {
            if (interactiveComponentArgument3 == this.interactiveComponentState0012) {
              discarded$1 = this.submitRegistration((byte) -35);
            }
          } else {
            ResizableModalDialog.performAction1557((byte) -73);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("tf.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final void updatePointer(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          super.updatePointer(uiComponentArgument1, 75, integerArgument3, integerArgument4);
          this.interactiveComponentState0012.booleanState0035 = this.canSubmitRegistration(-113);
          if (integerArgument2 <= 38) {
            UiComponent uiComponentLocal1 = (UiComponent) null;
            this.handleKey(-32, 53, (UiComponent) null, '[');
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "tf.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    final static void performAction1598(byte byteArgument1) {
        if (null != SceneWidget.mixedSupport099State0001 &&
          SceneWidget.mixedSupport099State0001.sceneWidgetState0097 != null) {
          SceneWidget.mixedSupport099State0001.sceneWidgetState0097.booleanState0217 = false;
        }
        NetworkSupport005.sceneWidgetPart008State0004 = null;
        SceneWidget.mixedSupport099State0001 = null;
        if (byteArgument1 >= -55) {
          AccountRegistrationPanel.performAction1584(-5, false);
        }
    }

    public final void onNameSuggestionsRefreshRequested(int integerArgument1) {
        if (integerArgument1 != 25) {
          return;
        }
        ((PlayerNameAvailabilityValidator) (this.uiComponentPart021State0002.getFieldValidator(-96))).invalidateCheckedName(true);
    }

    private final int addLabeledFieldWithDefaultValidationMessage(int integerArgument1, UiComponent uiComponentArgument2, int integerArgument3, String stringArgument4, String stringArgument5, int integerArgument6) {
        RuntimeException runtimeExceptionLocal1 = null;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          if (integerArgument1 <= 99) {
            randomState0003 = (Random) null;
          }
          stackIntegerLocal2 = this.addLabeledFieldWithValidationMessage(uiComponentArgument2, stringArgument5, 35, (byte) -44, integerArgument6, integerArgument3, stringArgument4);
          return stackIntegerLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal1 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("tf.OA(").append(integerArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArgument5 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument6).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationMessage(UiComponent uiComponentArgument1, String stringArgument2, int integerArgument3, byte byteArgument4, int integerArgument5, int integerArgument6, String stringArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        AccountFieldStatusIndicator uiComponentPart022Local2 = null;
        LabeledWidgetContainer uiComponentPart006Local3 = null;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        try {
          uiComponentPart006Local3 = new LabeledWidgetContainer(20, integerArgument6, 120 + integerArgument5, 25, uiComponentArgument1, false, 120, 3, GameDomainSupport003.bitmapFontState0015, 16777215, stringArgument2);
          this.addChild(uiComponentPart006Local3, (byte) -55);
          uiComponentPart022Local2 = new AccountFieldStatusIndicator(((FieldValidatorProvider) ((Object) uiComponentArgument1)).getFieldValidator(-122), stringArgument7, 126, integerArgument6 + uiComponentPart006Local3.integerState0108, integerArgument5 + 50, integerArgument3);
          uiComponentPart022Local2.callbackContract006State0001 = (WidgetEventListener) (this);
          this.addChild(uiComponentPart022Local2, (byte) -55);
          if (byteArgument4 != -44) {
            booleanState0185 = false;
          }
          stackIntegerLocal4 = uiComponentPart006Local3.integerState0108 + uiComponentPart022Local2.integerState0108;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal1 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("tf.FA(");
          if (uiComponentArgument1 == null) {
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
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',');
          if (stringArgument7 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    public static void performAction1594(boolean booleanArgument1) {
        if (!booleanArgument1) {
          AccountRegistrationPanel.performAction1584(125, true);
        }
        stringState0529 = null;
        stringState0528 = null;
        sceneWidgetState0116 = null;
        randomState0003 = null;
    }

    private final boolean isFieldReadyForRegistration(FieldValidatorProvider callbackContract005Argument1, int integerArgument2) {
        FieldValidator callbackContract011Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        ValidationStatus validationStatusLocal3 = null;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          callbackContract011Local1 = callbackContract005Argument1.getFieldValidator(-101);
          if (callbackContract011Local1 == null) {
            return true;
          }
          integerLocal4 = -62 % ((integerArgument2 - 73) / 51);
          validationStatusLocal3 = callbackContract011Local1.getValidationStatus(20350);
          if (ReturnedShapeUpdate.validationStatusState0005 == validationStatusLocal3) {
            return false;
          }
          if (MixedSupport076.validationStatusState0004 == validationStatusLocal3) {
            return false;
          }
          if (NetworkSupport005.validationStatusState0003 != validationStatusLocal3) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("tf.GA(");
          if (callbackContract005Argument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(integerArgument2).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(byte byteArgument1) {
        if (byteArgument1 != 29) {
          AccountRegistrationPanel.performAction1593(118, false, -20, 75);
        }
        return "</col></u>";
    }

    private final String getLinkOpenMarkup(byte byteArgument1) {
        int integerLocal1 = 85 / ((byteArgument1 + 4) / 60);
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean canSubmitRegistration(int integerArgument1) {
        int integerLocal1;
        if (this.isFieldReadyForRegistration(this.uiComponentPart021State0002, 127) &&
          this.isFieldReadyForRegistration(this.uiComponentPart021State0007, -111) &&
          this.isFieldReadyForRegistration(this.uiComponentPart021State0004, 124) &&
          this.isFieldReadyForRegistration(this.uiComponentPart021State0005, 126) &&
          this.isFieldReadyForRegistration(this.uiComponentPart021State0006, -94)) {
          if (!this.isFieldReadyForRegistration(this.uiComponentPart021State0003, 124)) {
            return false;
          }
          integerLocal1 = 37 % ((16 - integerArgument1) / 54);
          return true;
        }
        return false;
    }

    final boolean handleKey(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, char characterArgument4) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          integerLocal1 = -45 % ((-22 - integerArgument1) / 49);
          if (super.handleKey(-84, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          if (integerArgument2 == 98) {
            stackBooleanLocal3 = this.focusPreviousChild(uiComponentArgument3, (byte) -115);
            return stackBooleanLocal3;
          }
          if (99 != integerArgument2) {
            return false;
          }
          stackBooleanLocal4 = this.focusNextChild(32, uiComponentArgument3);
          return stackBooleanLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("tf.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    final static ResourceArchive computeResourceArchive1587(int integerArgument1, int integerArgument2, boolean booleanArgument3, boolean booleanArgument4, int integerArgument5) {
        if (integerArgument2 < 73) {
          stringState0528 = (String) null;
        }
        return MixedSupport068.computeResourceArchive0841(booleanArgument4, integerArgument1, integerArgument5, false, false, booleanArgument3);
    }

    public final void onTextHotspotActivated(RichTextWidget uiComponentPart025Argument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (0 == integerArgument4) {
            LoginCredentials.performAction0792(true, "terms.ws");
          } else {
            if (1 == integerArgument4) {
              LoginCredentials.performAction0792(true, "privacy.ws");
            } else {
              if (2 == integerArgument4) {
                LoginCredentials.performAction0792(true, "conduct.ws");
              }
            }
          }
          if (integerArgument3 >= -87) {
            this.uiComponentPart021State0002 = (ValidatedTextField) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("tf.PA(");
          if (uiComponentPart025Argument1 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(String stringArgument1, int integerArgument2) {
        ValidatedTextField uiComponentPart021Local1 = null;
        int discarded$0 = 0;
        String stringLocal3 = null;
        try {
          uiComponentPart021Local1 = this.uiComponentPart021State0002;
          if (integerArgument2 != -28464) {
            UiComponent uiComponentLocal4 = (UiComponent) null;
            discarded$0 = this.addLabeledFieldWithValidationIcon((String) null, (byte) 117, (UiComponent) null, -76, -79);
          }
          stringLocal3 = stringArgument1;
          ((EditableTextField) ((Object) uiComponentPart021Local1)).setText(stringLocal3, (byte) 114, false);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "tf.B(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static void performAction1593(int integerArgument1, boolean booleanArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        SceneWidget sceneWidgetLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        String stringLocal7 = null;
        MixedSupport056 mixedSupport056Local8 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (ModalDialog.integerState0073 < UiComponentPart009.integerState0149) {
            ModalDialog.integerState0073 = ModalDialog.integerState0073 + 1;
          }
          if (MixedSupport076.framebufferState0001.integerState0191 != MixedSupport003.integerState0017) {
            GameSession.integerState0618 = GameSession.integerState0618 + (MixedSupport076.framebufferState0001.integerState0191 - MixedSupport003.integerState0017);
            MixedSupport003.integerState0017 = MixedSupport076.framebufferState0001.integerState0191;
          }
          if (ModalDialog.integerState0073 <= 0) {
            return;
          }
          MixedSupport094.performAction1203((byte) -100);
          RichTextLayout.sceneWidgetState0021.performAction1772(false, booleanArgument2);
          if (MixedSupport009.uiComponentPart019State0001 != null) {
            if (MixedSupport144.booleanState0221) {
              MixedSupport009.uiComponentPart019State0001.processPointerInput(RichTextLayout.sceneWidgetState0021.integerState0886, booleanArgument2, RichTextLayout.sceneWidgetState0021.integerState0892, 29166);
            } else {
              MixedSupport009.uiComponentPart019State0001 = null;
            }
          }
          for (integerLocal1 = integerArgument3; integerLocal1 < 5; integerLocal1++) {
            sceneWidgetLocal4 = ClientException.sceneWidgetArrayState0001[integerLocal1];
            if (sceneWidgetLocal4 != null) {
              if (sceneWidgetLocal4.integerState0891 != 0) {
                RenderingSupport002.performAction0244(1, sceneWidgetLocal4, integerLocal1);
              }
              integerLocal5 = ReturnedShape.computeInteger1429(0, integerLocal1);
              NodeHashTable.sceneWidgetArrayState0004[integerLocal1].rgbSpriteState0070 = AlphaWidgetContainer.rgbSpriteArrayState0010[integerLocal5];
              MixedSupport076.sceneWidgetArrayState0002[integerLocal1].stringState0598 = InputAdapter003.stringArrayState0044[integerLocal5];
            }
          }
          if (NetworkArchiveRequestManager.sceneWidgetState0098.integerState0891 != 0) {
            MixedSupport097.sceneWidgetPart007State0001 = new SceneWidgetPart007(NetworkArchiveRequestManager.sceneWidgetState0098.integerState0892, NetworkArchiveRequestManager.sceneWidgetState0098.integerState0886, NetworkArchiveRequestManager.sceneWidgetState0098.integerState0896, NetworkArchiveRequestManager.sceneWidgetState0098.integerState0915, integerArgument1, MusicTrack.sceneWidgetState0127, MixedSupport121.sceneWidgetState0119, FullscreenStatusDialog.sceneWidgetState0053, MixedSupport125.sceneWidgetState0125, InputAdapter001.sceneWidgetPart003State0001, NameSuggestionsPanel.sceneWidgetState0019, (String) null, 0L);
          }
          mixedSupport056Local8 = AccountCreationResultPanel.computeMixedSupport0561813((byte) 55, ComponentContainer.integerState0377, integerArgument4, SecondaryNodeHashTable.integerState0540);
          if (mixedSupport056Local8 != null) {
            MixedSupport014.performAction0193(mixedSupport056Local8, false);
          }
          stringLocal7 = MixedSupport115.computeString1487(-36);
          if (stringLocal7 != null) {
            MixedSupport117.stringState0515 = stringLocal7;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal2 = caughtParameterLocal9;
          runtimeExceptionLocal3 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal3), "tf.UA(" + integerArgument1 + ',' + booleanArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    private final int addLabeledFieldWithValidationIcon(String stringArgument1, byte byteArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        ValidationStatusIcon uiComponentPart011Local2 = null;
        LabeledWidgetContainer uiComponentPart006Local3 = null;
        int stackIntegerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          uiComponentPart006Local3 = new LabeledWidgetContainer(20, integerArgument5, 120 + integerArgument4, 25, uiComponentArgument3, false, 120, 3, GameDomainSupport003.bitmapFontState0015, 16777215, stringArgument1);
          this.addChild(uiComponentPart006Local3, (byte) -55);
          uiComponentPart011Local2 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) uiComponentArgument3)).getFieldValidator(-126));
          this.addChild(uiComponentPart011Local2, (byte) -55);
          if (byteArgument2 != -107) {
            this.uiComponentPart007State0002 = (NameSuggestionsPanel) null;
          }
          uiComponentPart011Local2.setBounds(15, 15, uiComponentPart006Local3.integerState0107 + (uiComponentPart006Local3.integerState0110 + 3), uiComponentPart006Local3.integerState0104 + (-15 + uiComponentPart006Local3.integerState0108 >> 1), -16555);
          stackIntegerLocal4 = uiComponentPart006Local3.integerState0108;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal1 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("tf.NA(");
          if (stringArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    private final int addLabeledField(int integerArgument1, UiComponent uiComponentArgument2, int integerArgument3, String stringArgument4, int integerArgument5) {
        int discarded$1 = 0;
        LabeledWidgetContainer uiComponentPart006Local2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        String stringLocal4 = null;
        int stackIntegerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          uiComponentPart006Local2 = new LabeledWidgetContainer(20, integerArgument3, integerArgument5 + 120, 25, uiComponentArgument2, false, 120, 3, GameDomainSupport003.bitmapFontState0015, 16777215, stringArgument4);
          this.addChild(uiComponentPart006Local2, (byte) -55);
          if (integerArgument1 != 9828) {
            stringLocal4 = (String) null;
            discarded$1 = this.addLabeledFieldWithValidationMessage((UiComponent) null, (String) null, -93, (byte) 120, -33, 113, (String) null);
          }
          stackIntegerLocal5 = uiComponentPart006Local2.integerState0108;
          return stackIntegerLocal5;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal3 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal3;
          stackStringBuilderLocal7 = new StringBuilder().append("tf.EA(").append(integerArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument5).append(')').toString());
        }
    }

    static {
        stringState0529 = "Status";
        stringState0528 = "Click";
        randomState0003 = new Random();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void performAction1584(int integerArgument1, boolean booleanArgument2) {
        MixedSupport079.performAction1000(-1, booleanArgument2);
        MouseWheelInput.performAction0671(-1, booleanArgument2);
        int integerLocal1 = 36 / ((-24 - integerArgument1) / 53);
    }
}
