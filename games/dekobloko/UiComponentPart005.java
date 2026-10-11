/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart005 extends ComponentContainer implements CallbackContract002, CallbackContract019 {
    static int integerState0122;
    static String stringState0100;
    private UiComponentPart021 uiComponentPart021State0001;
    static String stringState0101;
    private InteractiveComponent interactiveComponentState0001;
    static SceneWidget sceneWidgetState0014;
    static String stringState0102;
    private InteractiveComponent interactiveComponentState0002;
    UiComponentPart007 uiComponentPart007State0001;

    final static boolean computeBoolean0349(byte byteArgument1) {
        if (byteArgument1 < 69) {
          return false;
        }
        return UiComponentPart023.booleanState0134;
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
          if (super.computeBoolean0198(-85, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          if (98 == integerArgument2) {
            stackBooleanLocal3 = this.computeBoolean1010(uiComponentArgument3, (byte) -113);
            return stackBooleanLocal3;
          }
          if (integerArgument2 == 99) {
            stackBooleanLocal4 = this.computeBoolean1009(32, uiComponentArgument3);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    public final void performAction0342(int integerArgument1) {
        ((MixedSupport069) (this.uiComponentPart021State0001.computeCallbackContract0110935(-105))).performAction0938(true);
        if (integerArgument1 != 25) {
          UiComponent uiComponentLocal1 = (UiComponent) null;
          this.computeBoolean0198(79, 36, (UiComponent) null, 'ﾻ');
        }
    }

    private final int computeInteger0344(int integerArgument1, String stringArgument2, UiComponent uiComponentArgument3, String stringArgument4, boolean booleanArgument5, int integerArgument6, int integerArgument7) {
        RuntimeException runtimeExceptionLocal1 = null;
        UiComponentPart022 uiComponentPart022Local2 = null;
        UiComponentPart006 uiComponentPart006Local3 = null;
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
          uiComponentPart006Local3 = new UiComponentPart006(20, integerArgument6, 120 + integerArgument7, 25, uiComponentArgument3, booleanArgument5, 120, 3, GameDomainSupport003.bitmapFontState0015, 16777215, stringArgument4);
          this.performAction1012(uiComponentPart006Local3, (byte) -55);
          uiComponentPart022Local2 = new UiComponentPart022(((CallbackContract005) ((Object) uiComponentArgument3)).computeCallbackContract0110935(-126), stringArgument2, 126, integerArgument6 + uiComponentPart006Local3.integerState0108, integerArgument7 + 25, integerArgument1);
          uiComponentPart022Local2.callbackContract006State0001 = (CallbackContract006) (this);
          this.performAction1012(uiComponentPart022Local2, (byte) -55);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(',').append(booleanArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(')').toString());
        }
    }

    public final void performAction0345(String stringArgument1, int integerArgument2) {
        UiComponentPart021 uiComponentPart021Local1 = null;
        String stringLocal2 = null;
        try {
          uiComponentPart021Local1 = this.uiComponentPart021State0001;
          stringLocal2 = stringArgument1;
          if (integerArgument2 != -28464) {
            stringState0100 = (String) null;
          }
          ((UiComponentPart028) ((Object) uiComponentPart021Local1)).performAction1642(stringLocal2, (byte) 114, false);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cn.B(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final static int computeInteger0348(boolean booleanArgument1) {
        ResourceArchive stackResourceArchiveLocal1 = null;
        boolean stackBooleanLocal2 = false;
        ResourceArchive stackResourceArchiveLocal3 = null;
        boolean stackBooleanLocal4 = false;
        if (UiComponentPart004.integerState0091 < 2) {
          return 0;
        }
        if (RenderingSupport007.integerState0360 == 0) {
          if (!MixedSupport121.resourceArchiveState0021.computeBoolean0904((byte) 121)) {
            return 20;
          }
          if (!MixedSupport121.resourceArchiveState0021.computeBoolean0918("commonui", (byte) -33)) {
            return 40;
          }
          if (!AudioSupport004.resourceArchiveState0020.computeBoolean0904((byte) 121)) {
            return 50;
          }
          if (!AudioSupport004.resourceArchiveState0020.computeBoolean0918("commonui", (byte) 57)) {
            return 60;
          }
          if (!UiComponentPart023.resourceArchiveState0016.computeBoolean0904((byte) 121)) {
            return 70;
          }
          if (!UiComponentPart023.resourceArchiveState0016.computeBoolean0921(false)) {
            return 80;
          }
        } else {
          if (null == NodeDeque.resourceArchiveState0025) {
            if (!MixedSupport121.resourceArchiveState0021.computeBoolean0904((byte) 121)) {
              return 43;
            }
            if (!MixedSupport121.resourceArchiveState0021.computeBoolean0918("commonui", (byte) -114)) {
              return 57;
            }
            if (!AudioSupport004.resourceArchiveState0020.computeBoolean0904((byte) 121)) {
              return 71;
            }
            if (!AudioSupport004.resourceArchiveState0020.computeBoolean0918("commonui", (byte) -125)) {
              return 80;
            }
            if (!UiComponentPart023.resourceArchiveState0016.computeBoolean0904((byte) 121)) {
              return 82;
            }
            stackResourceArchiveLocal3 = UiComponentPart023.resourceArchiveState0016;
            stackBooleanLocal4 = (booleanArgument1) ? false : true;
            if (!((ResourceArchive) (Object) stackResourceArchiveLocal3).computeBoolean0921(stackBooleanLocal4)) {
              return 86;
            }
          } else {
            if (!NodeDeque.resourceArchiveState0025.computeBoolean0904((byte) 121)) {
              return 14;
            }
            if (!NodeDeque.resourceArchiveState0025.computeBoolean0919("", 0)) {
              return 29;
            }
            if (!NodeDeque.resourceArchiveState0025.computeBoolean0918("", (byte) 63)) {
              return 29;
            }
            if (!MixedSupport121.resourceArchiveState0021.computeBoolean0904((byte) 121)) {
              return 43;
            }
            if (!MixedSupport121.resourceArchiveState0021.computeBoolean0918("commonui", (byte) -114)) {
              return 57;
            }
            if (!AudioSupport004.resourceArchiveState0020.computeBoolean0904((byte) 121)) {
              return 71;
            }
            if (!AudioSupport004.resourceArchiveState0020.computeBoolean0918("commonui", (byte) -125)) {
              return 80;
            }
            if (!UiComponentPart023.resourceArchiveState0016.computeBoolean0904((byte) 121)) {
              return 82;
            }
            stackResourceArchiveLocal1 = UiComponentPart023.resourceArchiveState0016;
            stackBooleanLocal2 = (booleanArgument1) ? false : true;
            if (!((ResourceArchive) (Object) stackResourceArchiveLocal1).computeBoolean0921(stackBooleanLocal2)) {
              return 86;
            }
          }
        }
        if (!booleanArgument1) {
          return -41;
        }
        return 100;
    }

    private final int computeInteger0343(int integerArgument1, int integerArgument2, int integerArgument3, String stringArgument4, UiComponent uiComponentArgument5, String stringArgument6) {
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
          stackIntegerLocal3 = this.computeInteger0344(35, stringArgument4, uiComponentArgument5, stringArgument6, false, integerArgument1, integerArgument2);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
        }
    }

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException runtimeExceptionLocal1 = null;
        InteractiveComponent interactiveComponentLocal2 = null;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (byteArgument1 != 67) {
            interactiveComponentLocal2 = (InteractiveComponent) null;
            this.performAction0341((byte) 103, -75, (InteractiveComponent) null, 25, 38);
          }
          if (this.interactiveComponentState0001 == interactiveComponentArgument3) {
            UiComponentPart032.performAction1928((byte) 105);
            return;
          }
          if (this.interactiveComponentState0002 != interactiveComponentArgument3) {
            return;
          }
          this.performAction0351(-14356);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    private final boolean computeBoolean0346(CallbackContract005 callbackContract005Argument1, byte byteArgument2) {
        CallbackContract011 callbackContract011Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        RenderingSupport015 renderingSupport015Local3 = null;
        boolean stackBooleanLocal4 = false;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          callbackContract011Local1 = callbackContract005Argument1.computeCallbackContract0110935(-120);
          if (callbackContract011Local1 == null) {
            return true;
          }
          if (byteArgument2 > -28) {
            UiComponentPart005.performAction0352(8);
          }
          renderingSupport015Local3 = callbackContract011Local1.computeRenderingSupport0150093(20350);
          stackBooleanLocal4 = (renderingSupport015Local3 == MixedSupport023.renderingSupport015State0001);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final static void performAction0347(boolean booleanArgument1, java.awt.Canvas canvasArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (MixedSupport052.integerState0269 == 11) {
            GameDomainSupport001.performAction0102((byte) -22);
          }
          ReturnedShape.performAction1625(12, UiComponentPart031.booleanState0185, RenderingSupport002.floatState0002, UiComponentPart013.stringState0227);
          UiComponentPart019.performAction1174(1, 0, 0, canvasArgument2);
          if (booleanArgument1) {
            return;
          }
          UiComponentPart005.computeInteger0348(true);
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
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    public static void performAction0352(int integerArgument1) {
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

    final void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          if (integerArgument2 <= 38) {
            UiComponentPart005.computeBoolean0349((byte) 40);
          }
          super.performAction0237(uiComponentArgument1, 45, integerArgument3, integerArgument4);
          this.interactiveComponentState0002.booleanState0035 = this.computeBoolean0350((byte) -29);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cn.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    public UiComponentPart005() {
        super(0, 0, 496, 0, (CallbackContract004) null);
        this.uiComponentPart021State0001 = new UiComponentPart021("", (CallbackContract006) null, 12);
        MixedSupport001 mixedSupport001Local1 = new MixedSupport001(MixedSupport011.bitmapFontState0006, 0, 0, 0, 0, 16777215, -1, 3, 0, GameDomainSupport003.bitmapFontState0015.integerState0518, -1, 2147483647, true);
        UiComponent uiComponentLocal2 = new UiComponent(stringState0102, mixedSupport001Local1, (CallbackContract006) null);
        this.interactiveComponentState0002 = new InteractiveComponent(MixedSupport050.stringState0208, (CallbackContract006) null);
        this.interactiveComponentState0001 = new InteractiveComponent(MixedSupport036.stringState0167, (CallbackContract006) null);
        this.uiComponentPart021State0001.stringState0080 = RichTextLayout.stringState0136;
        this.uiComponentPart021State0001.performAction1336(new MixedSupport069(this.uiComponentPart021State0001), -5362);
        this.interactiveComponentState0002.booleanState0035 = false;
        this.interactiveComponentState0002.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport041());
        this.interactiveComponentState0001.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport099());
        this.uiComponentPart021State0001.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport024(10000536));
        int integerLocal3 = 20;
        int integerLocal4 = 4;
        uiComponentLocal2.performAction0241(50, 270, 20, integerLocal3, -16555);
        int integerLocal5 = 200;
        integerLocal3 += 50;
        this.performAction1012(uiComponentLocal2, (byte) -55);
        integerLocal3 = integerLocal3 + (5 + this.computeInteger0343(integerLocal3, 170, -107, MixedSupport114.stringState0476, this.uiComponentPart021State0001, MixedSupport062.stringState0260));
        this.interactiveComponentState0002.performAction0241(40, integerLocal5, -integerLocal5 + 496 >> 1, integerLocal3, -16555);
        this.interactiveComponentState0001.performAction0241(40, 60, 3 + integerLocal4, integerLocal3 + 15, -16555);
        this.interactiveComponentState0001.callbackContract006State0001 = (CallbackContract006) (this);
        this.interactiveComponentState0002.callbackContract006State0001 = (CallbackContract006) (this);
        this.performAction1012(this.interactiveComponentState0002, (byte) -55);
        this.performAction1012(this.interactiveComponentState0001, (byte) -55);
        this.uiComponentPart007State0001 = new UiComponentPart007((CallbackContract002) (this));
        this.uiComponentPart007State0001.performAction0241(150, -60 - this.uiComponentPart021State0001.integerState0107 + this.integerState0107 - this.uiComponentPart021State0001.integerState0110, 60 + (this.uiComponentPart021State0001.integerState0107 + this.uiComponentPart021State0001.integerState0110), 20, -16555);
        this.performAction1012(this.uiComponentPart007State0001, (byte) -55);
        this.performAction0241(integerLocal4 + (integerLocal3 + 55), 496, 0, 0, -16555);
    }

    private final void performAction0351(int integerArgument1) {
        if (!this.computeBoolean0350((byte) -29)) {
          return;
        }
        SceneWidgetPart002.performAction0617(integerArgument1 + 14253, this.uiComponentPart021State0001.stringState0078);
        if (integerArgument1 != -14356) {
          integerState0122 = -2;
        }
    }

    private final boolean computeBoolean0350(byte byteArgument1) {
        if (!this.computeBoolean0346((CallbackContract005) (this.uiComponentPart021State0001), (byte) -116)) {
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
