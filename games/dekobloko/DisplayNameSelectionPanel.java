/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameSelectionPanel extends ComponentContainer implements NameSuggestionListener, WidgetActivationListener {
    static int integerState0122;
    static String stringState0100;
    private ValidatedTextField uiComponentPart021State0001;
    static String stringState0101;
    private InteractiveComponent interactiveComponentState0001;
    static SceneWidget sceneWidgetState0014;
    static String stringState0102;
    private InteractiveComponent interactiveComponentState0002;
    NameSuggestionsPanel uiComponentPart007State0001;

    final static boolean computeBoolean0321(byte byteArgument1) {
        if (byteArgument1 < 69) {
          return false;
        }
        return StandardContentDialog.booleanState0134;
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
          if (super.handleKey(-85, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          if (98 == integerArgument2) {
            stackBooleanLocal3 = this.focusPreviousChild(uiComponentArgument3, (byte) -113);
            return stackBooleanLocal3;
          }
          if (integerArgument2 == 99) {
            stackBooleanLocal4 = this.focusNextChild(32, uiComponentArgument3);
            return stackBooleanLocal4;
          }
          integerLocal1 = -60 / ((-22 - integerArgument1) / 49);
          return false;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("cn.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    public final void onNameSuggestionsRefreshRequested(int integerArgument1) {
        ((PlayerNameAvailabilityValidator) (this.uiComponentPart021State0001.getFieldValidator(-105))).invalidateCheckedName(true);
        if (integerArgument1 != 25) {
          UiComponent uiComponentLocal1 = (UiComponent) null;
          this.handleKey(79, 36, (UiComponent) null, 'ﾻ');
        }
    }

    private final int computeInteger0316(int integerArgument1, String stringArgument2, UiComponent uiComponentArgument3, String stringArgument4, boolean booleanArgument5, int integerArgument6, int integerArgument7) {
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
          uiComponentPart006Local3 = new LabeledWidgetContainer(20, integerArgument6, 120 + integerArgument7, 25, uiComponentArgument3, booleanArgument5, 120, 3, GameDomainSupport003.bitmapFontState0015, 16777215, stringArgument4);
          this.addChild(uiComponentPart006Local3, (byte) -55);
          uiComponentPart022Local2 = new AccountFieldStatusIndicator(((FieldValidatorProvider) ((Object) uiComponentArgument3)).getFieldValidator(-126), stringArgument2, 126, integerArgument6 + uiComponentPart006Local3.integerState0108, integerArgument7 + 25, integerArgument1);
          uiComponentPart022Local2.callbackContract006State0001 = (WidgetEventListener) (this);
          this.addChild(uiComponentPart022Local2, (byte) -55);
          stackIntegerLocal4 = uiComponentPart022Local2.integerState0108 + uiComponentPart006Local3.integerState0108;
          return stackIntegerLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal12 = caughtParameterLocal13;
          runtimeExceptionLocal1 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal1;
          stackStringBuilderLocal6 = new StringBuilder().append("cn.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          stackStringBuilderLocal10 = ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',');
          if (stringArgument4 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(booleanArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(String stringArgument1, int integerArgument2) {
        ValidatedTextField uiComponentPart021Local1 = null;
        String stringLocal2 = null;
        try {
          uiComponentPart021Local1 = this.uiComponentPart021State0001;
          stringLocal2 = stringArgument1;
          if (integerArgument2 != -28464) {
            stringState0100 = (String) null;
          }
          ((EditableTextField) ((Object) uiComponentPart021Local1)).setText(stringLocal2, (byte) 114, false);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "cn.B(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static int computeInteger0320(boolean booleanArgument1) {
        ResourceArchive stackResourceArchiveLocal1 = null;
        boolean stackBooleanLocal2 = false;
        ResourceArchive stackResourceArchiveLocal3 = null;
        boolean stackBooleanLocal4 = false;
        if (ContentTransitionDialog.integerState0091 < 2) {
          return 0;
        }
        if (AgeValidator.integerState0360 == 0) {
          if (!MixedSupport116.resourceArchiveState0021.ensureIndexLoaded((byte) 121)) {
            return 20;
          }
          if (!MixedSupport116.resourceArchiveState0021.tryLoadGroupByName("commonui", (byte) -33)) {
            return 40;
          }
          if (!PcmPlayerService.resourceArchiveState0020.ensureIndexLoaded((byte) 121)) {
            return 50;
          }
          if (!PcmPlayerService.resourceArchiveState0020.tryLoadGroupByName("commonui", (byte) 57)) {
            return 60;
          }
          if (!StandardContentDialog.resourceArchiveState0016.ensureIndexLoaded((byte) 121)) {
            return 70;
          }
          if (!StandardContentDialog.resourceArchiveState0016.tryLoadAllGroups(false)) {
            return 80;
          }
        } else {
          if (null == NodeDeque.resourceArchiveState0025) {
            if (!MixedSupport116.resourceArchiveState0021.ensureIndexLoaded((byte) 121)) {
              return 43;
            }
            if (!MixedSupport116.resourceArchiveState0021.tryLoadGroupByName("commonui", (byte) -114)) {
              return 57;
            }
            if (!PcmPlayerService.resourceArchiveState0020.ensureIndexLoaded((byte) 121)) {
              return 71;
            }
            if (!PcmPlayerService.resourceArchiveState0020.tryLoadGroupByName("commonui", (byte) -125)) {
              return 80;
            }
            if (!StandardContentDialog.resourceArchiveState0016.ensureIndexLoaded((byte) 121)) {
              return 82;
            }
            stackResourceArchiveLocal3 = StandardContentDialog.resourceArchiveState0016;
            stackBooleanLocal4 = (booleanArgument1) ? false : true;
            if (!((ResourceArchive) (Object) stackResourceArchiveLocal3).tryLoadAllGroups(stackBooleanLocal4)) {
              return 86;
            }
          } else {
            if (!NodeDeque.resourceArchiveState0025.ensureIndexLoaded((byte) 121)) {
              return 14;
            }
            if (!NodeDeque.resourceArchiveState0025.hasGroupName("", 0)) {
              return 29;
            }
            if (!NodeDeque.resourceArchiveState0025.tryLoadGroupByName("", (byte) 63)) {
              return 29;
            }
            if (!MixedSupport116.resourceArchiveState0021.ensureIndexLoaded((byte) 121)) {
              return 43;
            }
            if (!MixedSupport116.resourceArchiveState0021.tryLoadGroupByName("commonui", (byte) -114)) {
              return 57;
            }
            if (!PcmPlayerService.resourceArchiveState0020.ensureIndexLoaded((byte) 121)) {
              return 71;
            }
            if (!PcmPlayerService.resourceArchiveState0020.tryLoadGroupByName("commonui", (byte) -125)) {
              return 80;
            }
            if (!StandardContentDialog.resourceArchiveState0016.ensureIndexLoaded((byte) 121)) {
              return 82;
            }
            stackResourceArchiveLocal1 = StandardContentDialog.resourceArchiveState0016;
            stackBooleanLocal2 = (booleanArgument1) ? false : true;
            if (!((ResourceArchive) (Object) stackResourceArchiveLocal1).tryLoadAllGroups(stackBooleanLocal2)) {
              return 86;
            }
          }
        }
        if (!booleanArgument1) {
          return -41;
        }
        return 100;
    }

    private final int computeInteger0315(int integerArgument1, int integerArgument2, int integerArgument3, String stringArgument4, UiComponent uiComponentArgument5, String stringArgument6) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          integerLocal1 = -109 % ((integerArgument3 - 16) / 54);
          stackIntegerLocal3 = this.computeInteger0316(35, stringArgument4, uiComponentArgument5, stringArgument6, false, integerArgument1, integerArgument2);
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("cn.K(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (uiComponentArgument5 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',');
          if (stringArgument6 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    public final void onWidgetActivated(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        InteractiveComponent interactiveComponentLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (byteArgument1 != 67) {
            interactiveComponentLocal2 = (InteractiveComponent) null;
            this.onWidgetActivated((byte) 103, -75, (InteractiveComponent) null, 25, 38);
          }
          if (this.interactiveComponentState0001 == interactiveComponentArgument3) {
            BirthDateInput.performAction1701((byte) 105);
            return;
          }
          if (this.interactiveComponentState0002 != interactiveComponentArgument3) {
            return;
          }
          this.submitDisplayName(-14356);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("cn.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    private final boolean isFieldValid(FieldValidatorProvider callbackContract005Argument1, byte byteArgument2) {
        FieldValidator callbackContract011Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        ValidationStatus validationStatusLocal3 = null;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          callbackContract011Local1 = callbackContract005Argument1.getFieldValidator(-120);
          if (callbackContract011Local1 == null) {
            return true;
          }
          if (byteArgument2 > -28) {
            DisplayNameSelectionPanel.clearStaticReferences(8);
          }
          validationStatusLocal3 = callbackContract011Local1.getValidationStatus(20350);
          stackBooleanLocal4 = (validationStatusLocal3 == MixedSupport023.validationStatusState0001);
          return stackBooleanLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("cn.L(");
          if (callbackContract005Argument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction0319(boolean booleanArgument1, java.awt.Canvas canvasArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport052.integerState0269 == 11) {
            GameDomainSupport001.performAction0092((byte) -22);
          }
          ReturnedShape.performAction1432(12, AccountRegistrationPanel.booleanState0185, RenderingSupport002.floatState0002, LoginPanel.stringState0227);
          BirthDateChatEnableForm.performAction1045(1, 0, 0, canvasArgument2);
          if (booleanArgument1) {
            return;
          }
          DisplayNameSelectionPanel.computeInteger0320(true);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("cn.I(").append(booleanArgument1).append(',');
          if (canvasArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        stringState0101 = null;
        if (integerArgument1 == 3) {
          stringState0100 = null;
          sceneWidgetState0014 = null;
          stringState0102 = null;
          return;
        }
        stringState0102 = (String) null;
        stringState0100 = null;
        sceneWidgetState0014 = null;
        stringState0102 = null;
    }

    final void updatePointer(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument2 <= 38) {
            DisplayNameSelectionPanel.computeBoolean0321((byte) 40);
          }
          super.updatePointer(uiComponentArgument1, 45, integerArgument3, integerArgument4);
          this.interactiveComponentState0002.booleanState0035 = this.canSubmitDisplayName((byte) -29);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "cn.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    public DisplayNameSelectionPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.uiComponentPart021State0001 = new ValidatedTextField("", (WidgetEventListener) null, 12);
        DefaultTextWidgetRenderer mixedSupport001Local1 = new DefaultTextWidgetRenderer(MixedSupport011.bitmapFontState0006, 0, 0, 0, 0, 16777215, -1, 3, 0, GameDomainSupport003.bitmapFontState0015.integerState0518, -1, 2147483647, true);
        UiComponent uiComponentLocal2 = new UiComponent(stringState0102, mixedSupport001Local1, (WidgetEventListener) null);
        this.interactiveComponentState0002 = new InteractiveComponent(MixedSupport050.stringState0208, (WidgetEventListener) null);
        this.interactiveComponentState0001 = new InteractiveComponent(MixedSupport036.stringState0167, (WidgetEventListener) null);
        this.uiComponentPart021State0001.stringState0080 = RichTextLayout.stringState0136;
        this.uiComponentPart021State0001.setFieldValidator(new PlayerNameAvailabilityValidator(this.uiComponentPart021State0001), -5362);
        this.interactiveComponentState0002.booleanState0035 = false;
        this.interactiveComponentState0002.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport041());
        this.interactiveComponentState0001.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport094());
        this.uiComponentPart021State0001.callbackContract004State0006 = (WidgetRenderer) ((Object) new MixedSupport024(10000536));
        int integerLocal3 = 20;
        int integerLocal4 = 4;
        uiComponentLocal2.setBounds(50, 270, 20, integerLocal3, -16555);
        int integerLocal5 = 200;
        integerLocal3 += 50;
        this.addChild(uiComponentLocal2, (byte) -55);
        integerLocal3 = integerLocal3 + (5 + this.computeInteger0315(integerLocal3, 170, -107, MixedSupport109.stringState0476, this.uiComponentPart021State0001, MixedSupport061.stringState0260));
        this.interactiveComponentState0002.setBounds(40, integerLocal5, -integerLocal5 + 496 >> 1, integerLocal3, -16555);
        this.interactiveComponentState0001.setBounds(40, 60, 3 + integerLocal4, integerLocal3 + 15, -16555);
        this.interactiveComponentState0001.callbackContract006State0001 = (WidgetEventListener) (this);
        this.interactiveComponentState0002.callbackContract006State0001 = (WidgetEventListener) (this);
        this.addChild(this.interactiveComponentState0002, (byte) -55);
        this.addChild(this.interactiveComponentState0001, (byte) -55);
        this.uiComponentPart007State0001 = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.uiComponentPart007State0001.setBounds(150, -60 - this.uiComponentPart021State0001.integerState0107 + this.integerState0107 - this.uiComponentPart021State0001.integerState0110, 60 + (this.uiComponentPart021State0001.integerState0107 + this.uiComponentPart021State0001.integerState0110), 20, -16555);
        this.addChild(this.uiComponentPart007State0001, (byte) -55);
        this.setBounds(integerLocal4 + (integerLocal3 + 55), 496, 0, 0, -16555);
    }

    private final void submitDisplayName(int integerArgument1) {
        if (!this.canSubmitDisplayName((byte) -29)) {
          return;
        }
        SceneWidgetPart002.performAction0557(integerArgument1 + 14253, this.uiComponentPart021State0001.stringState0078);
        if (integerArgument1 != -14356) {
          integerState0122 = -2;
        }
    }

    private final boolean canSubmitDisplayName(byte byteArgument1) {
        if (!this.isFieldValid((FieldValidatorProvider) (this.uiComponentPart021State0001), (byte) -116)) {
          return false;
        }
        if (byteArgument1 != -29) {
          return false;
        }
        return true;
    }

    static {
        stringState0101 = "YOU WIN!";
        stringState0102 = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        stringState0100 = "Remove <%0> from friend list";
    }
}
