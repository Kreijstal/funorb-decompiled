/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart022 extends UiComponentPart025 {
    static MixedSupport004 mixedSupport004State0003;
    static volatile int integerState0572;
    static int integerState0573;
    private int integerState0574;
    static int integerState0575;
    private CallbackContract011 callbackContract011State0003;
    static RgbSprite rgbSpriteState0038;
    private RgbSprite rgbSpriteState0039;
    static String[] stringArrayState0026;
    private String stringState0400;
    static String[] stringArrayState0027;
    static int integerState0576;
    static String stringState0401;

    UiComponentPart022(CallbackContract011 callbackContract011Argument1, String stringArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        super(stringArgument2, MixedSupport146.computeMixedSupport0011952(1424));
        try {
          this.stringState0400 = stringArgument2;
          this.callbackContract011State0003 = callbackContract011Argument1;
          this.performAction0241(integerArgument6, integerArgument5, integerArgument3, integerArgument4, -16555);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pa.<init>(" + (callbackContract011Argument1 != null ? "{...}" : "null") + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RenderingSupport015 renderingSupport015Local1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        UiComponent uiComponentLocal5;
        String stringLocal6;
        Object objectLocal7;
        RgbSprite rgbSpriteLocal8;
        RgbSprite rgbSpriteLocal9;
        Object objectLocal10;
        Object objectLocal11;
        CallbackContract012 callbackContract012Local12;
        String stringLocal13;
        int integerLocal14;
        int integerLocal15;
        RgbSprite rgbSpriteLocal16;
        RgbSprite rgbSpriteLocal17;
        RgbSprite rgbSpriteLocal18;
        RgbSprite rgbSpriteLocal19;
        RgbSprite rgbSpriteLocal20;
        RgbSprite rgbSpriteLocal21;
        RgbSprite rgbSpriteLocal22;
        RgbSprite rgbSpriteLocal23;
        RgbSprite rgbSpriteLocal24;
        RgbSprite rgbSpriteLocal25;
        RgbSprite rgbSpriteLocal26;
        RgbSprite rgbSpriteLocal27;
        RgbSprite rgbSpriteLocal28;
        RgbSprite rgbSpriteLocal29;
        RgbSprite rgbSpriteLocal30;
        RgbSprite rgbSpriteLocal31;
        RgbSprite rgbSpriteLocal32;
        CallbackContract012 callbackContract012Local33;
        CallbackContract012 callbackContract012Local34;
        int integerLocal35;
        int integerLocal36;
        int integerLocal37;
        int integerLocal38;
        int integerLocal39;
        int integerLocal40;
        int integerLocal41;
        int integerLocal42;
        int integerLocal43;
        int integerLocal44;
        int integerLocal45;
        int integerLocal46;
        int integerLocal47;
        int integerLocal48;
        int integerLocal49;
        int integerLocal50;
        int integerLocal51;
        RenderingSupport015 renderingSupport015Local52;
        RenderingSupport015 renderingSupport015Local53;
        UiComponent uiComponentLocal54;
        UiComponent uiComponentLocal55;
        objectLocal7 = null;
        objectLocal10 = null;
        objectLocal11 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        renderingSupport015Local1 = this.callbackContract011State0003.computeRenderingSupport0150093(20350);
        if (renderingSupport015Local1 == MixedSupport080.renderingSupport015State0004) {
          stringLocal6 = UiComponentPart025.stringState0451;
          if (!stringLocal6.equals(this.stringState0078)) {
            this.stringState0078 = stringLocal6;
            this.performAction1542(2874);
          }
          super.performAction0175(integerArgument1, -105, integerArgument3, integerArgument4);
          renderingSupport015Local1 = this.callbackContract011State0003.computeRenderingSupport0150093(20350);
          callbackContract012Local12 = (CallbackContract012) ((Object) this.callbackContract004State0006);
          integerLocal2 = this.integerState0110 + integerArgument1;
          if (integerArgument2 >= -103) {
            uiComponentLocal5 = (UiComponent) null;
            this.computeBoolean0240(true, (UiComponent) null);
            integerLocal3 = callbackContract012Local12.computeInteger0006(integerArgument4, 0, (UiComponent) (this)) + (callbackContract012Local12.computeTextLayout0012((UiComponent) (this), (byte) 44).computeInteger0258(-1) >> 1);
            if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local1 &&
              DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local1) {
              if (renderingSupport015Local1 == MixedSupport149.renderingSupport015State0005) {
                rgbSpriteLocal8 = MixedSupport129.rgbSpriteArrayState0028[2];
                rgbSpriteLocal8.performAction0317(integerLocal2, integerLocal3 - (rgbSpriteLocal8.integerState0255 >> 1), 256);
                return;
              }
              if (renderingSupport015Local1 != MixedSupport023.renderingSupport015State0001) {
                return;
              }
              rgbSpriteLocal9 = MixedSupport129.rgbSpriteArrayState0028[1];
              rgbSpriteLocal9.performAction0317(integerLocal2, integerLocal3 - (rgbSpriteLocal9.integerState0255 >> 1), 256);
              return;
            }
            rgbSpriteLocal17 = MixedSupport129.rgbSpriteArrayState0028[0];
            integerLocal14 = rgbSpriteLocal17.integerState0254 << 1;
            integerLocal15 = rgbSpriteLocal17.integerState0260 << 1;
            if (this.rgbSpriteState0039 != null &&
              integerLocal14 <= this.rgbSpriteState0039.integerState0258 &&
              integerLocal15 <= this.rgbSpriteState0039.integerState0255) {
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
              SoftwareRaster.performAction0727();
            } else {
              this.rgbSpriteState0039 = new RgbSprite(integerLocal14, integerLocal15);
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
            }
            rgbSpriteLocal17.performAction0281(112, 144, rgbSpriteLocal17.integerState0254 << 4, rgbSpriteLocal17.integerState0260 << 4, -this.integerState0574 << 10, 4096);
            MixedSupport086.performAction1200((byte) -5);
            this.rgbSpriteState0039.performAction0317(integerLocal2 - (rgbSpriteLocal17.integerState0254 >> 1), integerLocal3 - rgbSpriteLocal17.integerState0260, 256);
            return;
          }
          integerLocal46 = callbackContract012Local12.computeInteger0006(integerArgument4, 0, (UiComponent) (this)) + (callbackContract012Local12.computeTextLayout0012((UiComponent) (this), (byte) 44).computeInteger0258(-1) >> 1);
          if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local1 &&
            DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local1) {
            if (renderingSupport015Local1 == MixedSupport149.renderingSupport015State0005) {
              rgbSpriteLocal18 = MixedSupport129.rgbSpriteArrayState0028[2];
              rgbSpriteLocal18.performAction0317(integerLocal2, integerLocal46 - (rgbSpriteLocal18.integerState0255 >> 1), 256);
              return;
            }
            if (renderingSupport015Local1 != MixedSupport023.renderingSupport015State0001) {
              return;
            }
            rgbSpriteLocal19 = MixedSupport129.rgbSpriteArrayState0028[1];
            rgbSpriteLocal19.performAction0317(integerLocal2, integerLocal46 - (rgbSpriteLocal19.integerState0255 >> 1), 256);
            return;
          }
          rgbSpriteLocal20 = MixedSupport129.rgbSpriteArrayState0028[0];
          integerLocal47 = rgbSpriteLocal20.integerState0254 << 1;
          integerLocal48 = rgbSpriteLocal20.integerState0260 << 1;
          if (this.rgbSpriteState0039 == null) {
            this.rgbSpriteState0039 = new RgbSprite(integerLocal47, integerLocal48);
            RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
          } else {
            if (integerLocal47 > this.rgbSpriteState0039.integerState0258) {
              this.rgbSpriteState0039 = new RgbSprite(integerLocal47, integerLocal48);
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
            } else {
              if (integerLocal48 > this.rgbSpriteState0039.integerState0255) {
                this.rgbSpriteState0039 = new RgbSprite(integerLocal47, integerLocal48);
                RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
              } else {
                RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
                SoftwareRaster.performAction0727();
              }
            }
          }
          rgbSpriteLocal20.performAction0281(112, 144, rgbSpriteLocal20.integerState0254 << 4, rgbSpriteLocal20.integerState0260 << 4, -this.integerState0574 << 10, 4096);
          MixedSupport086.performAction1200((byte) -5);
          this.rgbSpriteState0039.performAction0317(integerLocal2 - (rgbSpriteLocal20.integerState0254 >> 1), integerLocal46 - rgbSpriteLocal20.integerState0260, 256);
          return;
        }
        if (DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local1) {
          stringLocal13 = this.callbackContract011State0003.computeString0097((byte) 107);
          if (stringLocal13 == null) {
            stringLocal13 = this.stringState0400;
          }
        } else {
          stringLocal13 = UiComponentPart025.stringState0451;
        }
        if (stringLocal13.equals(this.stringState0078)) {
          super.performAction0175(integerArgument1, -105, integerArgument3, integerArgument4);
          renderingSupport015Local52 = this.callbackContract011State0003.computeRenderingSupport0150093(20350);
          callbackContract012Local33 = (CallbackContract012) ((Object) this.callbackContract004State0006);
          integerLocal35 = this.integerState0110 + integerArgument1;
          if (integerArgument2 >= -103) {
            uiComponentLocal54 = (UiComponent) null;
            this.computeBoolean0240(true, (UiComponent) null);
            integerLocal37 = callbackContract012Local33.computeInteger0006(integerArgument4, 0, (UiComponent) (this)) + (callbackContract012Local33.computeTextLayout0012((UiComponent) (this), (byte) 44).computeInteger0258(-1) >> 1);
            if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local52 &&
              DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local52) {
              if (renderingSupport015Local52 == MixedSupport149.renderingSupport015State0005) {
                rgbSpriteLocal21 = MixedSupport129.rgbSpriteArrayState0028[2];
                rgbSpriteLocal21.performAction0317(integerLocal35, integerLocal37 - (rgbSpriteLocal21.integerState0255 >> 1), 256);
                return;
              }
              if (renderingSupport015Local52 != MixedSupport023.renderingSupport015State0001) {
                return;
              }
              rgbSpriteLocal22 = MixedSupport129.rgbSpriteArrayState0028[1];
              rgbSpriteLocal22.performAction0317(integerLocal35, integerLocal37 - (rgbSpriteLocal22.integerState0255 >> 1), 256);
              return;
            }
            rgbSpriteLocal23 = MixedSupport129.rgbSpriteArrayState0028[0];
            integerLocal40 = rgbSpriteLocal23.integerState0254 << 1;
            integerLocal43 = rgbSpriteLocal23.integerState0260 << 1;
            if (this.rgbSpriteState0039 != null &&
              integerLocal40 <= this.rgbSpriteState0039.integerState0258 &&
              integerLocal43 <= this.rgbSpriteState0039.integerState0255) {
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
              SoftwareRaster.performAction0727();
            } else {
              this.rgbSpriteState0039 = new RgbSprite(integerLocal40, integerLocal43);
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
            }
            rgbSpriteLocal23.performAction0281(112, 144, rgbSpriteLocal23.integerState0254 << 4, rgbSpriteLocal23.integerState0260 << 4, -this.integerState0574 << 10, 4096);
            MixedSupport086.performAction1200((byte) -5);
            this.rgbSpriteState0039.performAction0317(integerLocal35 - (rgbSpriteLocal23.integerState0254 >> 1), integerLocal37 - rgbSpriteLocal23.integerState0260, 256);
            return;
          }
          integerLocal49 = callbackContract012Local33.computeInteger0006(integerArgument4, 0, (UiComponent) (this)) + (callbackContract012Local33.computeTextLayout0012((UiComponent) (this), (byte) 44).computeInteger0258(-1) >> 1);
          if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local52 &&
            DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local52) {
            if (renderingSupport015Local52 == MixedSupport149.renderingSupport015State0005) {
              rgbSpriteLocal24 = MixedSupport129.rgbSpriteArrayState0028[2];
              rgbSpriteLocal24.performAction0317(integerLocal35, integerLocal49 - (rgbSpriteLocal24.integerState0255 >> 1), 256);
              return;
            }
            if (renderingSupport015Local52 != MixedSupport023.renderingSupport015State0001) {
              return;
            }
            rgbSpriteLocal25 = MixedSupport129.rgbSpriteArrayState0028[1];
            rgbSpriteLocal25.performAction0317(integerLocal35, integerLocal49 - (rgbSpriteLocal25.integerState0255 >> 1), 256);
            return;
          }
          rgbSpriteLocal26 = MixedSupport129.rgbSpriteArrayState0028[0];
          integerLocal50 = rgbSpriteLocal26.integerState0254 << 1;
          integerLocal51 = rgbSpriteLocal26.integerState0260 << 1;
          if (this.rgbSpriteState0039 == null) {
            this.rgbSpriteState0039 = new RgbSprite(integerLocal50, integerLocal51);
            RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
          } else {
            if (integerLocal50 > this.rgbSpriteState0039.integerState0258) {
              this.rgbSpriteState0039 = new RgbSprite(integerLocal50, integerLocal51);
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
            } else {
              if (integerLocal51 > this.rgbSpriteState0039.integerState0255) {
                this.rgbSpriteState0039 = new RgbSprite(integerLocal50, integerLocal51);
                RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
              } else {
                RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
                SoftwareRaster.performAction0727();
              }
            }
          }
          rgbSpriteLocal26.performAction0281(112, 144, rgbSpriteLocal26.integerState0254 << 4, rgbSpriteLocal26.integerState0260 << 4, -this.integerState0574 << 10, 4096);
          MixedSupport086.performAction1200((byte) -5);
          this.rgbSpriteState0039.performAction0317(integerLocal35 - (rgbSpriteLocal26.integerState0254 >> 1), integerLocal49 - rgbSpriteLocal26.integerState0260, 256);
          return;
        }
        this.stringState0078 = stringLocal13;
        this.performAction1542(2874);
        super.performAction0175(integerArgument1, -105, integerArgument3, integerArgument4);
        renderingSupport015Local53 = this.callbackContract011State0003.computeRenderingSupport0150093(20350);
        callbackContract012Local34 = (CallbackContract012) ((Object) this.callbackContract004State0006);
        integerLocal36 = this.integerState0110 + integerArgument1;
        if (integerArgument2 < -103) {
          integerLocal38 = callbackContract012Local34.computeInteger0006(integerArgument4, 0, (UiComponent) (this)) + (callbackContract012Local34.computeTextLayout0012((UiComponent) (this), (byte) 44).computeInteger0258(-1) >> 1);
          if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local53 &&
            DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local53) {
            if (renderingSupport015Local53 == MixedSupport149.renderingSupport015State0005) {
              rgbSpriteLocal30 = MixedSupport129.rgbSpriteArrayState0028[2];
              rgbSpriteLocal30.performAction0317(integerLocal36, integerLocal38 - (rgbSpriteLocal30.integerState0255 >> 1), 256);
              return;
            }
            if (renderingSupport015Local53 != MixedSupport023.renderingSupport015State0001) {
              return;
            }
            rgbSpriteLocal31 = MixedSupport129.rgbSpriteArrayState0028[1];
            rgbSpriteLocal31.performAction0317(integerLocal36, integerLocal38 - (rgbSpriteLocal31.integerState0255 >> 1), 256);
            return;
          }
          rgbSpriteLocal32 = MixedSupport129.rgbSpriteArrayState0028[0];
          integerLocal41 = rgbSpriteLocal32.integerState0254 << 1;
          integerLocal44 = rgbSpriteLocal32.integerState0260 << 1;
          if (this.rgbSpriteState0039 == null) {
            this.rgbSpriteState0039 = new RgbSprite(integerLocal41, integerLocal44);
            RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
          } else {
            if (integerLocal41 > this.rgbSpriteState0039.integerState0258) {
              this.rgbSpriteState0039 = new RgbSprite(integerLocal41, integerLocal44);
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
            } else {
              if (integerLocal44 <= this.rgbSpriteState0039.integerState0255) {
                RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
                SoftwareRaster.performAction0727();
              } else {
                this.rgbSpriteState0039 = new RgbSprite(integerLocal41, integerLocal44);
                RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
              }
            }
          }
          rgbSpriteLocal32.performAction0281(112, 144, rgbSpriteLocal32.integerState0254 << 4, rgbSpriteLocal32.integerState0260 << 4, -this.integerState0574 << 10, 4096);
          MixedSupport086.performAction1200((byte) -5);
          this.rgbSpriteState0039.performAction0317(integerLocal36 - (rgbSpriteLocal32.integerState0254 >> 1), integerLocal38 - rgbSpriteLocal32.integerState0260, 256);
          return;
        }
        uiComponentLocal55 = (UiComponent) null;
        this.computeBoolean0240(true, (UiComponent) null);
        integerLocal39 = callbackContract012Local34.computeInteger0006(integerArgument4, 0, (UiComponent) (this)) + (callbackContract012Local34.computeTextLayout0012((UiComponent) (this), (byte) 44).computeInteger0258(-1) >> 1);
        if (MixedSupport080.renderingSupport015State0004 != renderingSupport015Local53 &&
          DiagnosticSupport002.renderingSupport015State0002 != renderingSupport015Local53) {
          if (renderingSupport015Local53 == MixedSupport149.renderingSupport015State0005) {
            rgbSpriteLocal27 = MixedSupport129.rgbSpriteArrayState0028[2];
            rgbSpriteLocal27.performAction0317(integerLocal36, integerLocal39 - (rgbSpriteLocal27.integerState0255 >> 1), 256);
            return;
          }
          if (renderingSupport015Local53 != MixedSupport023.renderingSupport015State0001) {
            return;
          }
          rgbSpriteLocal28 = MixedSupport129.rgbSpriteArrayState0028[1];
          rgbSpriteLocal28.performAction0317(integerLocal36, integerLocal39 - (rgbSpriteLocal28.integerState0255 >> 1), 256);
          return;
        }
        rgbSpriteLocal29 = MixedSupport129.rgbSpriteArrayState0028[0];
        rgbSpriteLocal16 = rgbSpriteLocal29;
        integerLocal42 = rgbSpriteLocal29.integerState0254 << 1;
        integerLocal45 = rgbSpriteLocal29.integerState0260 << 1;
        if (this.rgbSpriteState0039 == null) {
          this.rgbSpriteState0039 = new RgbSprite(integerLocal42, integerLocal45);
          RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
        } else {
          if (integerLocal42 > this.rgbSpriteState0039.integerState0258) {
            this.rgbSpriteState0039 = new RgbSprite(integerLocal42, integerLocal45);
            RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
          } else {
            if (integerLocal45 <= this.rgbSpriteState0039.integerState0255) {
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
              SoftwareRaster.performAction0727();
            } else {
              this.rgbSpriteState0039 = new RgbSprite(integerLocal42, integerLocal45);
              RenderingSupport015.performAction1778(true, this.rgbSpriteState0039);
            }
          }
        }
        rgbSpriteLocal29.performAction0281(112, 144, rgbSpriteLocal29.integerState0254 << 4, rgbSpriteLocal29.integerState0260 << 4, -this.integerState0574 << 10, 4096);
        MixedSupport086.performAction1200((byte) -5);
        this.rgbSpriteState0039.performAction0317(integerLocal36 - (rgbSpriteLocal29.integerState0254 >> 1), integerLocal39 - rgbSpriteLocal29.integerState0260, 256);
        return;
    }

    public static void performAction1384(byte byteArgument1) {
        rgbSpriteState0038 = null;
        stringArrayState0026 = null;
        stringArrayState0027 = null;
        if (byteArgument1 > 19) {
          mixedSupport004State0003 = null;
          stringState0401 = null;
          return;
        }
        integerState0572 = -63;
        mixedSupport004State0003 = null;
        stringState0401 = null;
    }

    final static int computeInteger1382(int integerArgument1, int integerArgument2) {
        if (integerArgument1 < 4) {
          throw new IllegalArgumentException();
        }
        if (integerArgument2 > 45) {
          return 400 + 50 * (-2 + integerArgument1) * (integerArgument1 - 3);
        }
        stringState0401 = (String) null;
        return 400 + 50 * (-2 + integerArgument1) * (integerArgument1 - 3);
    }

    final boolean computeBoolean0240(boolean booleanArgument1, UiComponent uiComponentArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        try {
          if (!booleanArgument1) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal5 = caughtParameterLocal6;
          runtimeExceptionLocal1 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal1;
          stackStringBuilderLocal3 = new StringBuilder().append("pa.EC(").append(booleanArgument1).append(',');
          if (uiComponentArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final String computeString0242(byte byteArgument1) {
        if (byteArgument1 == 113) {
          return null;
        }
        UiComponent uiComponentLocal1 = (UiComponent) null;
        this.performAction0237((UiComponent) null, -51, 86, -72);
        return null;
    }

    final static void performAction1383(byte byteArgument1) {
        int integerLocal1 = (-640 + UiComponentPart033.integerState0934) / 2;
        int integerLocal2 = UiComponentPart009.integerState0149 * UiComponentPart009.integerState0149;
        int integerLocal3 = integerLocal2 - UiComponentPart017.integerState0437 * UiComponentPart017.integerState0437;
        int integerLocal4 = 50 / ((byteArgument1 - 51) / 46);
        UiComponentPart011.sceneWidgetState0035.performAction1994(199, 0, 90, -90 + (-120 + SoftwareRaster.integerState0284) - 4, -(integerLocal3 * 199 / integerLocal2) + integerLocal1);
        MixedSupport155.sceneWidgetState0151.performAction1994(438, 0, 0, -4 + (SoftwareRaster.integerState0284 - 120), 202 + (integerLocal1 + 438 * integerLocal3 / integerLocal2));
    }

    final void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        try {
          this.integerState0574 = this.integerState0574 + 1;
          if (integerArgument2 <= 38) {
            stringArrayState0027 = (String[]) null;
          }
          super.performAction0237(uiComponentArgument1, 109, integerArgument3, integerArgument4);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "pa.A(" + (uiComponentArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ')');
        }
    }

    static {
        integerState0572 = 0;
        integerState0573 = -1;
        mixedSupport004State0003 = new MixedSupport004();
        stringArrayState0027 = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        stringState0401 = "Eight-bit";
    }
}
