/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart027 extends UiComponent {
    private int integerState0674;
    boolean booleanState0159;
    private RgbSprite rgbSpriteState0048;
    private int integerState0675;
    private int integerState0676;
    private RgbSprite[] rgbSpriteArrayState0023;
    private int integerState0677;
    private RgbSprite rgbSpriteState0049;
    private int integerState0678;
    private RgbSprite rgbSpriteState0050;
    private int integerState0679;
    int integerState0680;

    UiComponentPart027(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7) {
        this(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5, integerArgument6, integerArgument7, (integerArgument6 & 16711422) >> 1, (integerArgument7 & 16711422) >> 1);
    }

    final static void performAction1587(boolean booleanArgument1, int integerArgument2) {
        if (MixedSupport146.sceneWidgetPart004State0001 != null) {
          MixedSupport146.sceneWidgetPart004State0001.performAction1997(1141039778, booleanArgument1);
        }
        if (integerArgument2 != 4028) {
          UiComponentPart027.performAction1587(false, 20);
        }
    }

    final void performAction0241(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        super.performAction0241(integerArgument1, integerArgument2, integerArgument3, integerArgument4, integerArgument5);
        this.performAction1589(true);
    }

    private final void performAction1589(boolean booleanArgument1) {
        RgbSprite discarded$0 = null;
        if (!booleanArgument1) {
          discarded$0 = this.computeRgbSprite1590((byte) 116);
        }
        this.rgbSpriteArrayState0023 = new RgbSprite[]{this.computeRgbSprite1588(-81, this.integerState0676, this.integerState0678), this.computeRgbSprite1588(-107, this.integerState0677, this.integerState0674)};
        this.rgbSpriteState0048 = this.computeRgbSprite1590((byte) -125);
        this.rgbSpriteState0049 = this.rgbSpriteState0048.computeRgbSprite0311();
        this.rgbSpriteState0050 = new RgbSprite(this.integerState0108 >> 1, this.integerState0108);
    }

    final void performAction0175(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (integerArgument3 != 0) {
          return;
        }
        int integerLocal1 = this.integerState0110 + integerArgument1;
        if (integerArgument2 > -103) {
          this.performAction1585(-17, 35, 5);
        }
        int integerLocal2 = integerArgument4 + this.integerState0104;
        this.performAction1586(-2044, integerLocal2, integerLocal1, this.rgbSpriteArrayState0023[0]);
        if (65536 > this.integerState0680) {
          RenderingSupport004.performAction0640(integerLocal2, 20763, integerLocal1 + this.integerState0107, integerLocal1 + (this.integerState0680 * this.integerState0107 >> 16), this.integerState0108 + integerLocal2);
          this.performAction1586(-2044, integerLocal2, integerLocal1, this.rgbSpriteArrayState0023[1]);
          MixedSupport086.performAction1200((byte) -5);
        }
    }

    private final RgbSprite computeRgbSprite1590(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        double doubleLocal3 = 0.0;
        int integerLocal4 = 0;
        int integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal6 = this.integerState0108 >> 1;
        RgbSprite rgbSpriteLocal7 = new RgbSprite(integerLocal6, this.integerState0108);
        RenderingSupport015.performAction1778(true, rgbSpriteLocal7);
        for (integerLocal1 = 0; integerLocal1 < this.integerState0108; integerLocal1++) {
          for (integerLocal2 = 0; integerLocal6 > integerLocal2; integerLocal2++) {
            doubleLocal3 = (double)integerLocal2 * (double)integerLocal2 / (double)(integerLocal1 * (-integerLocal1 + this.integerState0108));
            integerLocal4 = 1;
            if (doubleLocal3 < 1.0) {
              doubleLocal3 = Math.sqrt(-doubleLocal3 + 1.0);
              integerLocal4 = 1.0 <= doubleLocal3 ? 255 : (int)(255.0 * doubleLocal3);
            }
            SoftwareRaster.performAction0717(integerLocal2, integerLocal1, integerLocal4 << 8 | integerLocal4 | integerLocal4 << 16);
          }
        }
        MixedSupport086.performAction1200((byte) -5);
        if (byteArgument1 > -73) {
          this.integerState0676 = -48;
        }
        return rgbSpriteLocal7;
    }

    private final RgbSprite computeRgbSprite1588(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        if (integerArgument1 >= -78) {
          this.rgbSpriteState0049 = (RgbSprite) null;
        }
        RgbSprite rgbSpriteLocal12 = new RgbSprite(2 * this.integerState0675, this.integerState0108);
        RenderingSupport015.performAction1778(true, rgbSpriteLocal12);
        int integerLocal13 = this.integerState0108 >> 1;
        for (integerLocal1 = 0; integerLocal1 < this.integerState0108; integerLocal1++) {
          integerLocal2 = (-1 + this.integerState0675 * 2) * (integerLocal1 >> 1) % (this.integerState0675 * 2);
          integerLocal3 = integerArgument3 & 16711935;
          integerLocal4 = 65280 & integerArgument3;
          integerLocal5 = -integerLocal13 + integerLocal1;
          integerLocal6 = 128 + (int)(128.0 * (Math.sqrt((double)(integerLocal13 * integerLocal13 - integerLocal5 * integerLocal5)) / (double)integerLocal13));
          integerLocal7 = integerLocal6 >= 256 ? integerLocal3 | integerLocal4 : (integerLocal3 * integerLocal6 & -16711936 | 16711680 & integerLocal4 * integerLocal6) >>> 8;
          SoftwareRaster.performAction0718(integerLocal2, integerLocal1, this.integerState0675, integerLocal7);
          integerLocal10 = integerArgument2 & 65280;
          SoftwareRaster.performAction0718(-(this.integerState0675 * 2) + integerLocal2, integerLocal1, this.integerState0675, integerLocal7);
          integerLocal9 = 16711935 & integerArgument2;
          integerLocal11 = integerLocal6 >= 256 ? integerLocal9 | integerLocal10 : (16711680 & integerLocal10 * integerLocal6 | -16711936 & integerLocal9 * integerLocal6) >>> 8;
          SoftwareRaster.performAction0718(integerLocal2 + this.integerState0675, integerLocal1, this.integerState0675, integerLocal11);
          SoftwareRaster.performAction0718(-this.integerState0675 + integerLocal2, integerLocal1, this.integerState0675, integerLocal11);
        }
        MixedSupport086.performAction1200((byte) -5);
        return rgbSpriteLocal12;
    }

    final void performAction1585(int integerArgument1, int integerArgument2, int integerArgument3) {
        RgbSprite discarded$0 = null;
        if (integerArgument2 != 4088) {
          discarded$0 = this.computeRgbSprite1590((byte) 42);
        }
        this.integerState0674 = 8355711 & integerArgument3 >> 1;
        this.integerState0678 = integerArgument3;
        this.integerState0676 = integerArgument1;
        this.integerState0677 = (integerArgument1 & 16711422) >> 1;
        this.performAction1589(true);
    }

    final void performAction0237(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (integerArgument2 <= 38) {
            this.integerState0680 = -76;
          }
          if (this.booleanState0159) {
            this.integerState0679 = this.integerState0679 + 1;
            if (2 * this.integerState0675 < this.integerState0679) {
              this.integerState0679 = this.integerState0679 - 2 * this.integerState0675;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("r.A(");
          if (uiComponentArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    private final void performAction1586(int integerArgument1, int integerArgument2, int integerArgument3, RgbSprite rgbSpriteArgument4) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal6 = integerArgument3 + this.integerState0107;
          if (integerArgument1 != -2044) {
            UiComponentPart027.performAction1587(true, 38);
          }
          RenderingSupport004.performAction0640(integerArgument2, 20763, integerLocal6 - this.rgbSpriteState0048.integerState0258, this.rgbSpriteState0048.integerState0258 + integerArgument3, this.integerState0108 + integerArgument2);
          for (integerLocal1 = integerArgument3 - this.integerState0679; integerLocal6 > integerLocal1; integerLocal1 = integerLocal1 + rgbSpriteArgument4.integerState0258) {
            rgbSpriteArgument4.performAction0300(integerLocal1, integerArgument2);
          }
          MixedSupport086.performAction1200((byte) -5);
          if (integerArgument3 + this.rgbSpriteState0048.integerState0258 >= SoftwareRaster.integerState0282) {
            RenderingSupport015.performAction1778(true, this.rgbSpriteState0050);
            rgbSpriteArgument4.performAction0300(-this.integerState0679, 0);
            rgbSpriteArgument4.performAction0300(-this.integerState0679 + this.integerState0675 * 2, 0);
            this.rgbSpriteState0049.performAction0316(0, 0);
            MixedSupport086.performAction1200((byte) -5);
            this.rgbSpriteState0050.performAction0300(integerArgument3, integerArgument2);
          }
          if (-this.rgbSpriteState0048.integerState0258 + integerLocal6 <= SoftwareRaster.integerState0281) {
            RenderingSupport015.performAction1778(true, this.rgbSpriteState0050);
            for (integerLocal8 = -this.rgbSpriteState0048.integerState0258 + (this.integerState0107 + this.integerState0679); this.integerState0675 * 2 < integerLocal8; integerLocal8 = integerLocal8 - 2 * this.integerState0675) {
            }
            rgbSpriteArgument4.performAction0300(-integerLocal8, 0);
            rgbSpriteArgument4.performAction0300(2 * this.integerState0675 - integerLocal8, 0);
            this.rgbSpriteState0048.performAction0316(0, 0);
            MixedSupport086.performAction1200((byte) -5);
            this.rgbSpriteState0050.performAction0300(integerLocal6 - this.rgbSpriteState0048.integerState0258, integerArgument2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal5 = caughtParameterLocal10;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("r.W(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (rgbSpriteArgument4 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    private UiComponentPart027(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8, int integerArgument9) {
        this.integerState0678 = integerArgument6;
        this.integerState0677 = integerArgument9;
        this.integerState0675 = integerArgument5;
        this.integerState0676 = integerArgument7;
        this.integerState0674 = integerArgument8;
        this.performAction0241(integerArgument4, integerArgument3, integerArgument1, integerArgument2, -16555);
    }

    static {
    }
}
