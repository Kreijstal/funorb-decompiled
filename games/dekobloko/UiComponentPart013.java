/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart013 extends ComponentContainer implements CallbackContract013, CallbackContract019 {
    private InteractiveComponent interactiveComponentState0003;
    static int integerState0274;
    private InteractiveComponent interactiveComponentState0004;
    static int[] integerArrayState0055;
    static boolean booleanState0066;
    private UiComponentPart028 uiComponentPart028State0001;
    private boolean booleanState0067;
    private boolean booleanState0068;
    private boolean booleanState0069;
    static int integerState0275;
    private UiComponentPart028 uiComponentPart028State0002;
    static String stringState0224;
    static SceneWidget sceneWidgetState0048;
    static int integerState0276;
    private String stringState0225;
    static String stringState0226;
    private InteractiveComponent interactiveComponentState0005;
    static String stringState0227;

    UiComponentPart013(String stringArgument1, String stringArgument2, boolean booleanArgument3, boolean booleanArgument4, boolean booleanArgument5) {
        super(0, 0, 310, 190, (CallbackContract004) null);
        UiComponentPart006 cachedUiComponentPart006Local1 = null;
        UiComponentPart006 cachedUiComponentPart006Local2 = null;
        boolean stackBooleanLocal3 = false;
        boolean stackBooleanLocal4 = false;
        boolean stackBooleanLocal5 = false;
        InteractiveComponent stackInteractiveComponentLocal6 = null;
        InteractiveComponent stackInteractiveComponentLocal7 = null;
        InteractiveComponent stackInteractiveComponentLocal8 = null;
        InteractiveComponent stackInteractiveComponentLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException stackRuntimeExceptionLocal11 = null;
        StringBuilder stackStringBuilderLocal12 = null;
        String stackStringLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        MixedSupport041 mixedSupport041Local17 = null;
        RuntimeException runtimeExceptionLocal18 = null;
        BitmapFont bitmapFontLocal19 = null;
        String stringLocal20 = null;
        MixedSupport062 mixedSupport062Local21 = null;
        UiComponentPart006 uiComponentPart006Local22 = null;
        UiComponentPart006 uiComponentPart006Local23 = null;
        try {
          this.stringState0225 = stringArgument2;
          stackBooleanLocal3 = (booleanArgument3);
          this.booleanState0067 = stackBooleanLocal3;
          stackBooleanLocal4 = (booleanArgument5);
          this.booleanState0068 = stackBooleanLocal4;
          stackBooleanLocal5 = (booleanArgument4);
          this.booleanState0069 = stackBooleanLocal5;
          if (this.booleanState0067 && (this.booleanState0069 ||
            this.booleanState0068)) {
            throw new IllegalStateException();
          }
          this.uiComponentPart028State0001 = (UiComponentPart028) ((Object) new UiComponentPart021(stringArgument1, (CallbackContract006) (this), 100));
          this.uiComponentPart028State0002 = (UiComponentPart028) ((Object) new UiComponentPart021("", (CallbackContract006) (this), 20));
          if (this.booleanState0067) {
            this.interactiveComponentState0005 = new InteractiveComponent(GameAssets.stringState0504, (CallbackContract006) null);
            this.interactiveComponentState0003 = new InteractiveComponent(SceneWidgetPart005.stringState0255, (CallbackContract006) null);
            this.uiComponentPart028State0001.booleanState0035 = false;
          } else {
            this.interactiveComponentState0005 = new InteractiveComponent(GameDomainSupport004.stringState0285, (CallbackContract006) null);
            stackInteractiveComponentLocal6 = null;
            stackInteractiveComponentLocal7 = null;
            if (!this.booleanState0068) {
              stackInteractiveComponentLocal8 = null;
              stackInteractiveComponentLocal9 = null;
              stackStringLocal10 = UiComponentPart003.stringState0060;
            } else {
              stackInteractiveComponentLocal8 = null;
              stackInteractiveComponentLocal9 = null;
              stackStringLocal10 = MixedSupport058.stringState0250;
            }
            this.interactiveComponentState0003 = new InteractiveComponent(stackStringLocal10, (CallbackContract006) null);
            if (this.booleanState0069) {
              this.interactiveComponentState0004 = new InteractiveComponent(MixedSupport057.stringState0246, (CallbackContract006) (this));
            }
          }
          this.uiComponentPart028State0001.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport024(10000536));
          this.uiComponentPart028State0002.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport050(10000536));
          mixedSupport041Local17 = new MixedSupport041();
          this.interactiveComponentState0005.callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport041Local17);
          if (this.interactiveComponentState0003 != null) {
            this.interactiveComponentState0003.callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport041Local17);
          }
          this.uiComponentPart028State0001.stringState0080 = MixedSupport033.stringState0161;
          if (this.interactiveComponentState0004 != null) {
            this.interactiveComponentState0004.callbackContract004State0006 = (CallbackContract004) ((Object) mixedSupport041Local17);
          }
          if (null != this.interactiveComponentState0004) {
            this.interactiveComponentState0004.stringState0080 = MixedSupport130.stringState0541;
          }
          if (!this.booleanState0067) {
            if (this.booleanState0068) {
              this.interactiveComponentState0003.stringState0080 = MixedSupport073.stringState0312;
              this.interactiveComponentState0003.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport099());
            } else {
              this.interactiveComponentState0003.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport099());
            }
          } else {
            this.interactiveComponentState0003.stringState0080 = MixedSupport049.stringState0205;
          }
          this.integerState0104 = 15;
          bitmapFontLocal19 = GameDomainSupport003.bitmapFontState0015;
          if (this.stringState0225 != null) {
            this.integerState0104 = this.integerState0104 + (5 + bitmapFontLocal19.computeInteger1223(this.stringState0225, this.integerState0107 - 40, bitmapFontLocal19.integerState0518));
          }
          stringLocal20 = MixedSupport132.stringState0548;
          mixedSupport062Local21 = DiagnosticSupport002.computeMixedSupport0620863(UiComponentPart029.computeApplet1689(25144), -10314);
          if (mixedSupport062Local21 != MixedSupport005.mixedSupport062State0001) {
            if (mixedSupport062Local21 == RenderingSupport003.mixedSupport062State0002) {
              stringLocal20 = MixedSupport122.stringState0514;
            }
          } else {
            stringLocal20 = MixedSupport141.stringState0575;
          }
          cachedUiComponentPart006Local1 = new UiComponentPart006(10, this.integerState0104, this.integerState0107 - 20, 25, this.uiComponentPart028State0001, false, 80, 3, bitmapFontLocal19, 16777215, stringLocal20);
          uiComponentPart006Local22 = cachedUiComponentPart006Local1;
          this.performAction1012(cachedUiComponentPart006Local1, (byte) -55);
          this.integerState0104 = this.integerState0104 + (((UiComponent) ((Object) uiComponentPart006Local22)).integerState0108 + 5);
          cachedUiComponentPart006Local2 = new UiComponentPart006(10, this.integerState0104, -20 + this.integerState0107, 25, this.uiComponentPart028State0002, false, 80, 3, bitmapFontLocal19, 16777215, MixedSupport017.stringState0087);
          uiComponentPart006Local23 = cachedUiComponentPart006Local2;
          this.performAction1012(cachedUiComponentPart006Local2, (byte) -55);
          this.interactiveComponentState0005.callbackContract006State0001 = (CallbackContract006) (this);
          this.integerState0104 = this.integerState0104 + (5 + ((UiComponent) ((Object) uiComponentPart006Local23)).integerState0108);
          if (this.interactiveComponentState0004 != null) {
            this.interactiveComponentState0004.callbackContract006State0001 = (CallbackContract006) (this);
          }
          if (this.interactiveComponentState0003 != null) {
            this.interactiveComponentState0003.callbackContract006State0001 = (CallbackContract006) (this);
          }
          if (null == this.interactiveComponentState0004) {
            this.interactiveComponentState0005.performAction0241(30, this.integerState0107 - 16, 8, this.integerState0104, -16555);
            this.integerState0104 = this.integerState0104 + 35;
          } else {
            this.interactiveComponentState0005.performAction0241(30, this.integerState0107 - 95, 85, this.integerState0104, -16555);
            this.integerState0104 = this.integerState0104 + 60;
          }
          if (null != this.interactiveComponentState0004) {
            this.interactiveComponentState0004.performAction0241(30, -10 + (-6 + this.integerState0107), 8, this.integerState0104, -16555);
            this.integerState0104 = this.integerState0104 + 35;
          }
          if (this.interactiveComponentState0003 != null) {
            if (!this.booleanState0067 &&
              !this.booleanState0068) {
              this.interactiveComponentState0003.performAction0241(20, 40, 8, this.integerState0104, -16555);
              this.integerState0104 = this.integerState0104 + 25;
            } else {
              this.interactiveComponentState0003.performAction0241(30, -10 + (-6 + this.integerState0107), 8, this.integerState0104, -16555);
              this.integerState0104 = this.integerState0104 + 35;
            }
          }
          this.performAction0241(this.integerState0104 + 3, this.integerState0107, 0, 0, -16555);
          this.performAction1012(this.interactiveComponentState0005, (byte) -55);
          if (null != this.interactiveComponentState0004) {
            this.performAction1012(this.interactiveComponentState0004, (byte) -55);
          }
          if (this.interactiveComponentState0003 != null) {
            this.performAction1012(this.interactiveComponentState0003, (byte) -55);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal24) {
          caughtExceptionLocal16 = caughtParameterLocal24;
          runtimeExceptionLocal18 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal11 = runtimeExceptionLocal18;
          stackStringBuilderLocal12 = new StringBuilder().append("he.<init>(");
          if (stringArgument1 == null) {
            stackStringLocal13 = "null";
          } else {
            stackStringLocal13 = "{...}";
          }
          stackStringBuilderLocal14 = ((StringBuilder) (Object) stackStringBuilderLocal12).append(stackStringLocal13).append(',');
          if (stringArgument2 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal11), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(',').append(booleanArgument3).append(',').append(booleanArgument4).append(',').append(booleanArgument5).append(')').toString());
        }
    }

    public final void performAction0695(int integerArgument1, UiComponentPart028 uiComponentPart028Argument2) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (this.uiComponentPart028State0001 == uiComponentPart028Argument2) {
            this.uiComponentPart028State0002.computeBoolean0240(false, (UiComponent) (this));
          }
          if (uiComponentPart028Argument2 == this.uiComponentPart028State0002) {
            this.performAction0696((byte) -29);
          }
          if (integerArgument1 != -2569) {
            stringState0224 = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("he.K(").append(integerArgument1).append(',');
          if (uiComponentPart028Argument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    final static byte[] computeByteArray0687(byte byteArgument1, byte[] byteArrayArgument2, int integerArgument3, CipherPacketBuffer cipherPacketBufferArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        byte[] stackByteArrayLocal6 = null;
        byte[] stackByteArrayLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        StringBuilder stackStringBuilderLocal11 = null;
        String stackStringLocal12 = null;
        RuntimeException caughtExceptionLocal13 = null;
        RuntimeException runtimeExceptionLocal14 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = cipherPacketBufferArgument4.computeInteger1857(integerArgument3, (byte) 81);
          if (integerLocal1 == 0) {
            return null;
          }
          if (byteArrayArgument2 == null ||
            byteArrayArgument2.length != integerLocal1) {
            byteArrayArgument2 = new byte[integerLocal1];
          }
          integerLocal2 = cipherPacketBufferArgument4.computeInteger1857(3, (byte) 52);
          if (byteArgument1 != 5) {
            stackByteArrayLocal6 = (byte[]) null;
            return stackByteArrayLocal6;
          }
          integerLocal3 = (byte)cipherPacketBufferArgument4.computeInteger1857(8, (byte) 58);
          if (integerLocal2 <= 0) {
            for (integerLocal4 = 0; integerLocal4 < integerLocal1; integerLocal4++) {
              byteArrayArgument2[integerLocal4] = (byte)integerLocal3;
            }
          } else {
            for (integerLocal4 = 0; integerLocal1 > integerLocal4; integerLocal4++) {
              byteArrayArgument2[integerLocal4] = (byte)(integerLocal3 + cipherPacketBufferArgument4.computeInteger1857(integerLocal2, (byte) 117));
            }
          }
          stackByteArrayLocal7 = (byte[]) (byteArrayArgument2);
          return stackByteArrayLocal7;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal13 = caughtParameterLocal15;
          runtimeExceptionLocal14 = caughtExceptionLocal13;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal14;
          stackStringBuilderLocal9 = new StringBuilder().append("he.F(").append(byteArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          stackStringBuilderLocal11 = ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(integerArgument3).append(',');
          if (cipherPacketBufferArgument4 == null) {
            stackStringLocal12 = "null";
          } else {
            stackStringLocal12 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal11).append(stackStringLocal12).append(')').toString());
        }
    }

    private final void performAction0696(byte byteArgument1) {
        if (CodecSupport004.computeBoolean1631(71) ||
          !(this.uiComponentPart028State0001.stringState0078.length() <= 0) &&
          !(this.uiComponentPart028State0002.stringState0078.length() <= 0)) {
          MixedSupport022.performAction0356((byte) -109, this.uiComponentPart028State0001.stringState0078, this.uiComponentPart028State0002.stringState0078);
        }
        if (byteArgument1 > -26) {
          stringState0227 = (String) null;
        }
    }

    final String computeString0698(int integerArgument1) {
        if (integerArgument1 != 80) {
          UiComponentPart013.performAction0694(false, false, -20);
        }
        if (this.uiComponentPart028State0001.stringState0078 == null) {
          return "";
        }
        return this.uiComponentPart028State0001.stringState0078;
    }

    final static void performAction0694(boolean booleanArgument1, boolean booleanArgument2, int integerArgument3) {
        SceneWidgetPart008 stackSceneWidgetPart008Local1;
        int stackIntegerLocal2;
        int stackIntegerLocal3;
        int stackIntegerLocal4;
        boolean stackBooleanLocal5 = false;
        SceneWidget stackSceneWidgetLocal6 = null;
        String stackStringLocal7 = null;
        int stackIntegerLocal8 = 0;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        NodeDeque nodeDequeLocal12 = null;
        Object objectLocal13 = null;
        SceneWidgetPart014 sceneWidgetPart014Local14 = null;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        String stringLocal20 = null;
        int integerLocal21 = 0;
        int integerLocal22 = 0;
        int integerLocal23 = 0;
        MixedSupport104 mixedSupport104Local24 = null;
        MixedSupport104 mixedSupport104Local25 = null;
        integerLocal23 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          stackSceneWidgetPart008Local1 = RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005;
          stackIntegerLocal2 = 2 + ComponentContainer.integerState0377;
          stackIntegerLocal3 = integerArgument3 * ((ComponentContainer.integerState0377 + 2) * 3);
          stackIntegerLocal4 = -15230;
          stackBooleanLocal5 = (NetworkSupport005.sceneWidgetPart008State0004 == RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005);
          integerLocal10 = ((SceneWidgetPart008) (Object) stackSceneWidgetPart008Local1).computeBoolean1291(stackIntegerLocal2, stackIntegerLocal3, stackIntegerLocal4, stackBooleanLocal5, 2, booleanArgument2) ? 1 : 0;
          nodeDequeLocal12 = RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0108.nodeDequeState0034;
          if (ThemeTips.integerState0351 != 2 &&
            ThemeTips.integerState0351 != 1) {
            RenderingSupport003.sceneWidgetPart010State0001.booleanState0212 = false;
            RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005.sceneWidgetState0089.stringState0598 = SoftwareFramebuffer.stringState0616;
            UiComponentPart012.performAction0653(RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0108, true);
          } else {
            RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005.sceneWidgetState0089.stringState0598 = null;
            RenderingSupport003.sceneWidgetPart010State0001.booleanState0212 = true;
            objectLocal13 = null;
            sceneWidgetPart014Local14 = (SceneWidgetPart014) (nodeDequeLocal12.computeHashNode1970((byte) 95));
            while (sceneWidgetPart014Local14 != null) {
              integerLocal15 = 0;
              if (null == sceneWidgetPart014Local14.nodeDequeState0034) {
                sceneWidgetPart014Local14.sceneWidgetState0147 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart014Local14.performAction1998(sceneWidgetPart014Local14.sceneWidgetState0147, -16834);
                sceneWidgetPart014Local14.sceneWidgetState0148 = new SceneWidget(0L, RenderingSupport004.sceneWidgetState0040);
                sceneWidgetPart014Local14.performAction1998(sceneWidgetPart014Local14.sceneWidgetState0148, -16834);
                sceneWidgetPart014Local14.performAction2004(-36);
                integerLocal15 = 1;
              }
              sceneWidgetPart014Local14.integerState0896 = RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0108.integerState0896;
              sceneWidgetPart014Local14.sceneWidgetState0147.performAction1994(sceneWidgetPart014Local14.integerState0896, 0, 0, ComponentContainer.integerState0377, 0);
              integerLocal16 = 0;
              if (sceneWidgetPart014Local14.stringState0605 != null &&
                !sceneWidgetPart014Local14.stringState0605.equals("")) {
                sceneWidgetPart014Local14.sceneWidgetState0148.rgbSpriteState0070 = MixedSupport001.rgbSpriteState0001;
                sceneWidgetPart014Local14.sceneWidgetState0148.integerState0889 = 16737894;
                sceneWidgetPart014Local14.sceneWidgetState0148.performAction1994(3 + MixedSupport001.rgbSpriteState0001.integerState0254, 0, 0, ComponentContainer.integerState0377, 0);
                integerLocal16 = 1;
              }
              integerLocal17 = 0;
              integerLocal18 = sceneWidgetPart014Local14.integerState0896;
              if (integerLocal16 != 0) {
                integerLocal17 = 3 + MixedSupport001.rgbSpriteState0001.integerState0254;
                integerLocal18 = integerLocal18 - integerLocal17;
              }
              stackSceneWidgetLocal6 = sceneWidgetPart014Local14.sceneWidgetState0147;
              if (integerLocal18 <= 0) {
                stackStringLocal7 = sceneWidgetPart014Local14.stringState0606;
              } else {
                stackStringLocal7 = BitmapFont.computeString1216(sceneWidgetPart014Local14.sceneWidgetState0147.bitmapFontState0020, sceneWidgetPart014Local14.stringState0606, integerLocal18);
              }
              stackSceneWidgetLocal6.stringState0598 = stackStringLocal7;
              stackIntegerLocal8 = (sceneWidgetPart014Local14.sceneWidgetState0147.stringState0598.equals(sceneWidgetPart014Local14.stringState0606)) ? 0 : 1;
              integerLocal19 = stackIntegerLocal8;
              sceneWidgetPart014Local14.sceneWidgetState0147.performAction1994(integerLocal18, 0, 0, ComponentContainer.integerState0377, integerLocal17);
              if (integerLocal10 == 0) {
                sceneWidgetPart014Local14.integerState0895 = ComponentContainer.integerState0377 - sceneWidgetPart014Local14.integerState0915;
              }
              if (integerLocal15 != 0) {
                RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0108.performAction1999((SceneWidget) (objectLocal13), sceneWidgetPart014Local14, 2, 0);
              }
              if (null != sceneWidgetPart014Local14.sceneWidgetState0148 &&
                sceneWidgetPart014Local14.sceneWidgetState0148.booleanState0218) {
                MixedSupport122.stringState0515 = sceneWidgetPart014Local14.stringState0605;
              } else {
                if (sceneWidgetPart014Local14.sceneWidgetState0147.booleanState0218 &&
                  integerLocal19 != 0) {
                  MixedSupport122.stringState0515 = sceneWidgetPart014Local14.stringState0606;
                }
              }
              objectLocal13 = sceneWidgetPart014Local14;
              if (sceneWidgetPart014Local14.integerState0891 != 0) {
                MixedSupport122.performAction1732(sceneWidgetPart014Local14.stringState0603, (int[]) null, 112, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetPart008State0005, sceneWidgetPart014Local14, sceneWidgetPart014Local14.stringState0606, 0L, -1, -1);
                mixedSupport104Local24 = SceneWidget.mixedSupport104State0001;
                stringLocal20 = GameDomainSupport006.stringState0630;
                mixedSupport104Local24.sceneWidgetPart002State0002.performAction0620(stringLocal20, 7, 72);
                mixedSupport104Local25 = SceneWidget.mixedSupport104State0001;
                integerLocal21 = integerState0276;
                integerLocal22 = TextLineMetrics.integerState0535;
                mixedSupport104Local25.sceneWidgetPart002State0002.performAction0621(integerLocal22, integerLocal21, 89, 0, 0);
              }
              sceneWidgetPart014Local14 = (SceneWidgetPart014) (nodeDequeLocal12.computeHashNode1974(booleanArgument1));
            }
            if (RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0106.integerState0891 != 0) {
              MixedSupport146.sceneWidgetPart004State0001 = new SceneWidgetPart004(RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0106.integerState0892, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0106.integerState0886, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0106.integerState0896, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0106.integerState0915, ResourceSupport004.stringState0429, MixedSupport005.sceneWidgetState0002, MixedSupport132.sceneWidgetState0125, MixedSupport132.sceneWidgetState0125);
              ResourceSupport003.integerState0555 = 2;
            }
            if (RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0107.integerState0891 != 0) {
              MixedSupport146.sceneWidgetPart004State0001 = new SceneWidgetPart004(RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0107.integerState0892, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0107.integerState0886, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0107.integerState0896, RenderingSupport003.sceneWidgetPart010State0001.sceneWidgetState0107.integerState0915, MixedSupport013.stringState0063, MixedSupport005.sceneWidgetState0002, MixedSupport132.sceneWidgetState0125, MixedSupport132.sceneWidgetState0125);
              ResourceSupport003.integerState0555 = 3;
            }
          }
          if (!booleanArgument1) {
            sceneWidgetState0048 = (SceneWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal26) {
          caughtExceptionLocal9 = caughtParameterLocal26;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal11), "he.M(" + booleanArgument1 + ',' + booleanArgument2 + ',' + integerArgument3 + ')');
        }
    }

    final static boolean computeBoolean0689(int integerArgument1, char characterArgument2) {
        int integerLocal1 = 0;
        char[] characterArrayLocal2 = null;
        RuntimeException runtimeExceptionLocal3 = null;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        char[] characterArrayLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 >= -5) {
            UiComponentPart013.performAction0694(true, true, -20);
          }
          if ((characterArgument2 <= 0 ||
            128 <= characterArgument2) &&
            (characterArgument2 < 160 ||
            255 < characterArgument2)) {
            if (characterArgument2 != 0) {
              characterArrayLocal6 = MixedSupport091.characterArrayState0006;
              characterArrayLocal2 = characterArrayLocal6;
              for (integerLocal1 = 0; integerLocal1 < characterArrayLocal6.length; integerLocal1++) {
                integerLocal4 = characterArrayLocal6[integerLocal1];
                if (characterArgument2 == integerLocal4) {
                  return true;
                }
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal3 = caughtExceptionLocal7;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal3), "he.B(" + integerArgument1 + ',' + characterArgument2 + ')');
        }
    }

    final static boolean computeBoolean0691(String stringArgument1, byte byteArgument2, String stringArgument3) {
        String stringLocal1 = null;
        int integerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        try {
          stringArgument1 = MixedSupport069.computeString0936('_', stringArgument1, "", -1);
          stringLocal1 = MixedSupport094.computeString1307(stringArgument1, -1);
          integerLocal2 = -17 % ((58 - byteArgument2) / 55);
          stackBooleanLocal3 = (stringArgument3.indexOf(stringArgument1) != -1) || (stringArgument3.indexOf(stringLocal1) != -1);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal10;
          stackStringBuilderLocal5 = new StringBuilder().append("he.D(");
          if (stringArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(byteArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    final void performAction0692(String stringArgument1, int integerArgument2) {
        UiComponentPart028 uiComponentPart028Local1 = null;
        String stringLocal2 = null;
        try {
          uiComponentPart028Local1 = this.uiComponentPart028State0001;
          stringLocal2 = stringArgument1;
          uiComponentPart028Local1.performAction1642(stringLocal2, (byte) 114, false);
          if (integerArgument2 != 30534) {
            this.computeBoolean0198(127, 108, (UiComponent) null, 'ﾫ');
          }
          this.uiComponentPart028State0002.performAction1655(0);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "he.G(" + (stringArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
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
          if (super.computeBoolean0198(65, integerArgument2, uiComponentArgument3, characterArgument4)) {
            return true;
          }
          integerLocal1 = 56 / ((-22 - integerArgument1) / 49);
          if (integerArgument2 == 98) {
            stackBooleanLocal3 = this.computeBoolean1010(uiComponentArgument3, (byte) -45);
            return stackBooleanLocal3;
          }
          if (99 != integerArgument2) {
            return false;
          }
          stackBooleanLocal4 = this.computeBoolean1009(32, uiComponentArgument3);
          return stackBooleanLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("he.QA(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(characterArgument4).append(')').toString());
        }
    }

    public final void performAction0690(int integerArgument1, UiComponentPart028 uiComponentPart028Argument2) {
        try {
          if (integerArgument1 != 16737894) {
            this.booleanState0068 = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "he.N(" + integerArgument1 + ',' + (uiComponentPart028Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0688(int integerArgument1) {
        if (integerArgument1 <= 28) {
          this.interactiveComponentState0003 = (InteractiveComponent) null;
        }
        this.uiComponentPart028State0001.performAction1655(0);
        this.uiComponentPart028State0002.performAction1655(0);
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (this.stringState0225 != null) {
          GameDomainSupport003.bitmapFontState0015.computeInteger1213(this.stringState0225, integerArgument1 + (this.integerState0110 + 20), integerArgument4 + (this.integerState0104 + 15), this.integerState0107 - 40, this.integerState0108, 16777215, -1, 1, 0, GameDomainSupport003.bitmapFontState0015.integerState0518);
        }
        if (integerArgument2 > -103) {
          sceneWidgetState0048 = (SceneWidget) null;
        }
        if (this.interactiveComponentState0004 != null) {
          SoftwareRaster.performAction0718(10 + integerArgument1, 134 + integerArgument4, -20 + this.integerState0107, 4210752);
        }
        super.performAction0175(integerArgument1, -119, integerArgument3, integerArgument4);
    }

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (interactiveComponentArgument3 != this.interactiveComponentState0005) {
            if (interactiveComponentArgument3 == this.interactiveComponentState0004) {
              SceneWidgetPart003.performAction0676(0);
            } else {
              if (interactiveComponentArgument3 == this.interactiveComponentState0003) {
                if (this.booleanState0067) {
                  UiComponentPart025.performAction1549(17);
                } else {
                  if (this.booleanState0068) {
                    UiComponentPart030.performAction1763((byte) -73);
                  } else {
                    UiComponentPart017.performAction1078(8927);
                  }
                }
              }
            }
          } else {
            this.performAction0696((byte) -37);
          }
          if (byteArgument1 != 67) {
            this.computeString0698(-21);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("he.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static void performAction0693(boolean booleanArgument1, int integerArgument2) {
        UiComponentPart031.sceneWidgetState0116.performAction1997(1141039778, booleanArgument1);
        if (integerArgument2 > -73) {
          stringState0224 = (String) null;
        }
    }

    public static void performAction0697(int integerArgument1) {
        stringState0227 = null;
        stringState0226 = null;
        integerArrayState0055 = null;
        if (integerArgument1 != 0) {
          stringState0227 = (String) null;
        }
        stringState0224 = null;
        sceneWidgetState0048 = null;
    }

    static {
        integerArrayState0055 = new int[4];
        integerState0274 = 250;
        stringState0224 = "Loading sound effects";
        integerState0276 = 0;
    }
}
