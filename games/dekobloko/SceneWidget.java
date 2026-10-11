/*
 * Decompiled by CFR-JS 0.4.0.
 */
class SceneWidget extends SceneWidgetNode {
    static MixedSupport104 mixedSupport104State0001;
    RgbSprite[] rgbSpriteArrayState0032;
    int integerState0884;
    int integerState0885;
    BitmapFont bitmapFontState0020;
    boolean booleanState0211;
    int integerState0886;
    String stringState0598;
    String stringState0599;
    private int integerState0887;
    int integerState0888;
    boolean booleanState0212;
    int integerState0889;
    int integerState0890;
    RgbSprite rgbSpriteState0065;
    int integerState0891;
    private boolean booleanState0213;
    RgbSprite[] rgbSpriteArrayState0033;
    RgbSprite rgbSpriteState0066;
    int integerState0892;
    static RawSound rawSoundState0022;
    int integerState0893;
    private int integerState0894;
    RgbSprite[] rgbSpriteArrayState0034;
    boolean booleanState0214;
    int integerState0895;
    int integerState0896;
    RgbSprite[] rgbSpriteArrayState0035;
    int integerState0897;
    private int integerState0898;
    private boolean booleanState0215;
    int integerState0899;
    private int integerState0900;
    private boolean booleanState0216;
    int integerState0901;
    int integerState0902;
    int integerState0903;
    static RenderingSupport010 renderingSupport010State0007;
    int integerState0904;
    RgbSprite rgbSpriteState0067;
    private int integerState0905;
    boolean booleanState0217;
    int integerState0906;
    private int integerState0907;
    int integerState0908;
    static RgbSprite rgbSpriteState0068;
    static int integerState0909;
    int integerState0910;
    boolean booleanState0218;
    RgbSprite rgbSpriteState0069;
    boolean booleanState0219;
    RgbSprite[] rgbSpriteArrayState0036;
    private int integerState0911;
    int integerState0912;
    int integerState0913;
    RgbSprite rgbSpriteState0070;
    private int integerState0914;
    NodeDeque nodeDequeState0034;
    int integerState0915;
    int integerState0916;
    int integerState0917;

    SceneWidget(long longArgument1, SceneWidget sceneWidgetArgument2, String stringArgument3) {
        this(longArgument1, sceneWidgetArgument2, 0, 0, 0, 0, stringArgument3);
    }

    final static void performAction1995(int integerArgument1, int integerArgument2, MixedSupport034 mixedSupport034Argument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        int integerLocal2 = 0;
        try {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
          cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
          integerLocal2 = cipherPacketBufferLocal1.position;
          cipherPacketBufferLocal1.performAction2073(true, 1);
          if (null != mixedSupport034Argument3.byteArrayState0007) {
            cipherPacketBufferLocal1.performAction2073(true, mixedSupport034Argument3.byteArrayState0007.length);
            cipherPacketBufferLocal1.performAction2074(false, mixedSupport034Argument3.byteArrayState0007.length, mixedSupport034Argument3.byteArrayState0007, 0);
          } else {
            cipherPacketBufferLocal1.performAction2073(true, 0);
          }
          int integerLocal3 = 120 % ((integerArgument1 - 60) / 53);
          cipherPacketBufferLocal1.computeInteger2061((byte) -15, integerLocal2);
          cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position - 4;
          mixedSupport034Argument3.integerState0218 = cipherPacketBufferLocal1.computeInteger2096(7553);
          cipherPacketBufferLocal1.performAction2079(cipherPacketBufferLocal1.position - integerLocal2, true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "w.NA(" + integerArgument1 + ',' + integerArgument2 + ',' + (mixedSupport034Argument3 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction1994(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        this.integerState0907 = integerArgument2;
        this.integerState0895 = 0;
        this.integerState0890 = integerArgument5;
        this.integerState0903 = integerArgument3;
        this.integerState0904 = 0;
        this.integerState0915 = integerArgument4;
        this.integerState0896 = integerArgument1;
        this.integerState0887 = 0;
    }

    public static void performAction2005(byte byteArgument1) {
        rgbSpriteState0068 = null;
        renderingSupport010State0007 = null;
        int integerLocal1 = 10 % ((-8 - byteArgument1) / 47);
        mixedSupport104State0001 = null;
        rawSoundState0022 = null;
    }

    final int computeInteger2000(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return -120;
        }
        return this.computeInteger1991((byte) 84, 2147483647);
    }

    private final void performAction2001(boolean booleanArgument1, int integerArgument2, boolean booleanArgument3, boolean booleanArgument4, int integerArgument5, int integerArgument6, boolean booleanArgument7, int integerArgument8, boolean booleanArgument9, boolean booleanArgument10, int integerArgument11) {
        boolean stackBooleanLocal1 = false;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        RgbSprite[] rgbSpriteArrayLocal6;
        RgbSprite rgbSpriteLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        String stringLocal14;
        SceneWidget sceneWidgetLocal15;
        int integerLocal16;
        int integerLocal17;
        String stringLocal18;
        String stringLocal19;
        String stringLocal20;
        integerLocal17 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        this.integerState0892 = this.integerState0890 + integerArgument5;
        this.integerState0886 = integerArgument8 + this.integerState0903;
        integerLocal2 = SoftwareRaster.integerState0282;
        integerLocal3 = SoftwareRaster.integerState0280;
        integerLocal4 = SoftwareRaster.integerState0281;
        integerLocal5 = SoftwareRaster.integerState0283;
        SoftwareRaster.performAction0742(this.integerState0892, this.integerState0886, this.integerState0892 + this.integerState0896, this.integerState0915 + this.integerState0886);
        booleanArgument4 = booleanArgument4 & this.booleanState0212;
        if (!this.booleanState0215) {
          booleanArgument3 = this.booleanState0218;
          stackBooleanLocal1 = (0 != this.integerState0888);
          booleanArgument10 = stackBooleanLocal1;
          booleanArgument7 = this.booleanState0217;
        }
        rgbSpriteArrayLocal6 = this.rgbSpriteArrayState0033;
        rgbSpriteLocal7 = this.rgbSpriteState0070;
        integerLocal8 = this.integerState0910;
        integerLocal9 = 0;
        if (!booleanArgument4) {
          if (0 <= this.integerState0912) {
            integerLocal8 = this.integerState0912;
          }
          if (this.rgbSpriteArrayState0034 != null) {
            rgbSpriteArrayLocal6 = this.rgbSpriteArrayState0034;
          }
          if (null != this.rgbSpriteState0065) {
            rgbSpriteLocal7 = this.rgbSpriteState0065;
          }
        }
        integerLocal10 = 0;
        if (booleanArgument3) {
          if (this.integerState0889 >= 0) {
            integerLocal8 = this.integerState0889;
          }
          if (this.rgbSpriteState0067 != null) {
            rgbSpriteLocal7 = this.rgbSpriteState0067;
          }
          if (null != this.rgbSpriteArrayState0035) {
            rgbSpriteArrayLocal6 = this.rgbSpriteArrayState0035;
          }
          if (this.integerState0898 != -2147483648) {
            integerLocal9 = this.integerState0898;
          }
          if (this.integerState0914 != -2147483648) {
            integerLocal10 = this.integerState0914;
          }
        }
        if (booleanArgument10) {
          if (null != this.rgbSpriteState0066) {
            rgbSpriteLocal7 = this.rgbSpriteState0066;
          }
          if (this.integerState0899 >= 0) {
            integerLocal8 = this.integerState0899;
          }
          if (this.integerState0901 != -2147483648) {
            integerLocal9 = this.integerState0901;
          }
          if (null != this.rgbSpriteArrayState0036) {
            rgbSpriteArrayLocal6 = this.rgbSpriteArrayState0036;
          }
          if (this.integerState0902 != -2147483648) {
            integerLocal10 = this.integerState0902;
          }
        }
        if (booleanArgument7) {
          if (this.integerState0906 >= 0) {
            integerLocal8 = this.integerState0906;
          }
          if (this.integerState0884 != -2147483648) {
            integerLocal10 = this.integerState0884;
          }
          if (null != this.rgbSpriteArrayState0032) {
            rgbSpriteArrayLocal6 = this.rgbSpriteArrayState0032;
          }
          if (null != this.rgbSpriteState0069) {
            rgbSpriteLocal7 = this.rgbSpriteState0069;
          }
          if (-2147483648 != this.integerState0913) {
            integerLocal9 = this.integerState0913;
          }
        }
        integerLocal11 = this.integerState0911 + integerLocal9;
        if (integerArgument11 != -29696) {
          return;
        }
        integerLocal12 = integerLocal10 + this.integerState0900;
        if (!this.booleanState0214) {
          GameplayControls.performAction1978(this.integerState0915, (byte) 50, rgbSpriteArrayLocal6, this.integerState0896, this.integerState0886, this.integerState0892);
        } else {
          GameplayControls.performAction1978(integerArgument6, (byte) 50, rgbSpriteArrayLocal6, integerArgument2, integerArgument8, integerArgument5);
        }
        if (rgbSpriteLocal7 != null) {
          integerLocal13 = integerLocal11 + this.integerState0892;
          integerLocal16 = this.integerState0886 + integerLocal12;
          if (this.integerState0916 == 1) {
            integerLocal13 = integerLocal13 + (this.integerState0896 - rgbSpriteLocal7.integerState0254) / 2;
          }
          if (this.integerState0885 == 1) {
            integerLocal16 = integerLocal16 + (this.integerState0915 - rgbSpriteLocal7.integerState0260) / 2;
          }
          if (2 == this.integerState0916) {
            integerLocal13 = integerLocal13 + (-rgbSpriteLocal7.integerState0254 + this.integerState0896);
          }
          if (this.integerState0885 == 2) {
            integerLocal16 = integerLocal16 + (this.integerState0915 - rgbSpriteLocal7.integerState0260);
          }
          if (this.integerState0905 < 256) {
            rgbSpriteLocal7.performAction0301(integerLocal13, integerLocal16, this.integerState0905);
          } else {
            rgbSpriteLocal7.performAction0300(integerLocal13, integerLocal16);
          }
        }
        boolean frameRemainderLocal21 = true;
        if (null != this.stringState0598 &&
          this.bitmapFontState0020 != null) {
          stringLocal18 = this.stringState0598;
          stringLocal14 = stringLocal18;
          stringLocal19 = stringLocal18;
          stringLocal20 = stringLocal18;
          if (booleanArgument1 &&
            this.stringState0599 != null) {
            stringLocal20 = stringLocal18 + this.stringState0599;
          }
          if (this.bitmapFontState0020.computeInteger1208(stringLocal20) <= this.integerState0896 - 2 * this.integerState0893 &&
            0 > stringLocal20.indexOf("<br>")) {
            if (this.integerState0885 != 1) {
              if (this.integerState0885 == 2) {
                integerLocal12 = integerLocal12 + (-this.bitmapFontState0020.integerState0518 + (-this.bitmapFontState0020.integerState0523 + this.integerState0915));
              }
            } else {
              integerLocal12 = integerLocal12 + (this.integerState0915 - this.bitmapFontState0020.integerState0518 - this.bitmapFontState0020.integerState0523) / 2;
            }
            if (this.integerState0916 == 0) {
              this.bitmapFontState0020.performAction1229(stringLocal20, this.integerState0893 + (this.integerState0892 + integerLocal11), this.bitmapFontState0020.integerState0518 + (integerLocal12 + this.integerState0886), integerLocal8, -1, this.integerState0917);
            } else {
              if (this.integerState0916 == 1) {
                this.bitmapFontState0020.performAction1225(stringLocal20, (-(2 * this.integerState0893) + this.integerState0896) / 2 + (this.integerState0892 - (-this.integerState0893 - integerLocal11)), this.bitmapFontState0020.integerState0518 + (this.integerState0886 + integerLocal12), integerLocal8, -1, this.integerState0917);
              } else {
                if (2 == this.integerState0916) {
                  this.bitmapFontState0020.performAction1212(stringLocal20, -(this.integerState0893 * 2) + (this.integerState0896 + this.integerState0892 + this.integerState0893) + integerLocal11, this.integerState0886 + (integerLocal12 + this.bitmapFontState0020.integerState0518), integerLocal8, -1, this.integerState0917);
                } else {
                  this.bitmapFontState0020.computeInteger1214(stringLocal20, integerLocal11 + this.integerState0893 + this.integerState0892, integerLocal12 + this.integerState0886, -(2 * this.integerState0893) + this.integerState0896, this.integerState0915, integerLocal8, -1, this.integerState0917, this.integerState0916, this.integerState0885, this.integerState0908);
                }
              }
            }
            frameRemainderLocal21 = false;
          }
          else {
            this.bitmapFontState0020.computeInteger1214(stringLocal20, integerLocal11 + this.integerState0893 + this.integerState0892, this.integerState0886 + integerLocal12, -(this.integerState0893 * 2) + this.integerState0896, this.integerState0915, integerLocal8, -1, this.integerState0917, this.integerState0916, this.integerState0885, this.integerState0908);
          }
        }
        if (this.nodeDequeState0034 != null) {
          sceneWidgetLocal15 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1970((byte) -124));
          while (sceneWidgetLocal15 != null) {
            sceneWidgetLocal15.performAction2001(booleanArgument1, this.integerState0896, booleanArgument3, booleanArgument4, integerLocal9 + this.integerState0892, this.integerState0915, booleanArgument7, this.integerState0886 + integerLocal10, this.booleanState0213, booleanArgument10, -29696);
            sceneWidgetLocal15 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1974(true));
          }
        }
        SoftwareRaster.performAction0728(integerLocal2, integerLocal3, integerLocal4, integerLocal5);
        return;
    }

    final static RenderingSupport010 computeRenderingSupport0102003(byte[] byteArrayArgument1, byte byteArgument2) {
        RenderingSupport010 renderingSupport010Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        byte[] byteArrayLocal3 = null;
        Object stackObjectLocal4 = null;
        RenderingSupport010 stackRenderingSupport010Local5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          if (byteArrayArgument1 == null) {
            stackObjectLocal4 = null;
            return (RenderingSupport010) (stackObjectLocal4);
          }
          renderingSupport010Local1 = new RenderingSupport010(byteArrayArgument1, InputAdapter006.integerArrayState0206, MixedSupport039.integerArrayState0047, MixedSupport130.integerArrayState0208, MixedSupport052.integerArrayState0054, SceneWidgetPart011.byteArrayArrayState0008);
          MixedSupport094.performAction1305(127);
          if (byteArgument2 != -5) {
            byteArrayLocal3 = (byte[]) null;
            SceneWidget.computeRenderingSupport0102003((byte[]) null, (byte) -7);
          }
          stackRenderingSupport010Local5 = renderingSupport010Local1;
          return stackRenderingSupport010Local5;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal2;
          stackStringBuilderLocal7 = new StringBuilder().append("w.AA(");
          if (byteArrayArgument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final void performAction1992(byte byteArgument1, int integerArgument2, int integerArgument3, boolean booleanArgument4) {
        SceneWidget sceneWidgetLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal4 = -this.integerState0903;
        int integerLocal5 = integerLocal4 - this.integerState0904;
        int integerLocal6 = this.integerState0915;
        int integerLocal7 = integerLocal6 + this.integerState0895;
        int integerLocal8;
        if (!booleanArgument4) {
          integerLocal2 = 0;
          sceneWidgetLocal1 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1970((byte) 118));
          while (sceneWidgetLocal1 != null) {
            sceneWidgetLocal1.integerState0904 = -sceneWidgetLocal1.integerState0903 + integerLocal2;
            integerLocal2 = integerLocal2 + (sceneWidgetLocal1.integerState0895 + sceneWidgetLocal1.integerState0915 + integerArgument2);
            sceneWidgetLocal1 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1974(true));
          }
          integerLocal7 = -integerArgument2 + integerLocal2;
        }
        if (byteArgument1 != -94) {
          this.booleanState0219 = true;
        }
        integerLocal8 = -integerArgument3 + integerLocal7;
        if (integerLocal5 > integerLocal8) {
          integerLocal5 = integerLocal8;
        }
        if (integerLocal5 < 0) {
          integerLocal5 = 0;
        }
        int integerLocal9 = integerLocal6 - integerArgument3;
        if (integerLocal4 > integerLocal9) {
          integerLocal4 = integerLocal9;
        }
        if (0 > integerLocal4) {
          integerLocal4 = 0;
        }
        this.integerState0895 = integerLocal7 - integerLocal6;
        this.integerState0915 = integerLocal6;
        this.integerState0904 = integerLocal4 - integerLocal5;
        this.integerState0903 = -integerLocal4;
    }

    SceneWidget(long longArgument1, SceneWidget sceneWidgetArgument2) {
        this(longArgument1, sceneWidgetArgument2, 0, 0, 0, 0, (String) null);
    }

    final void performAction2002(boolean booleanArgument1, boolean booleanArgument2) {
        if (booleanArgument1) {
          this.integerState0893 = -111;
        }
        SceneWidgetPart002.booleanState0051 = !booleanArgument2 ? true : false;
        MixedSupport122.booleanState0179 = !booleanArgument2 ? true : false;
        this.performAction1993(0, (byte) 127, true, SoftwareRaster.integerState0284, SoftwareRaster.integerState0285, 0);
    }

    final void performAction1998(SceneWidget sceneWidgetArgument1, int integerArgument2) {
        try {
          if (integerArgument2 != -16834) {
            SceneWidget sceneWidgetLocal1 = (SceneWidget) null;
            this.performAction1998((SceneWidget) null, -88);
          }
          if (null == this.nodeDequeState0034) {
            this.nodeDequeState0034 = new NodeDeque();
          }
          this.nodeDequeState0034.performAction1963(sceneWidgetArgument1, 2777);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "w.GA(" + (sceneWidgetArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    final void performAction2004(int integerArgument1) {
        SceneWidget sceneWidgetLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.nodeDequeState0034 != null) {
          sceneWidgetLocal1 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1969(true));
          while (sceneWidgetLocal1 != null) {
            sceneWidgetLocal1.booleanState0215 = true;
            sceneWidgetLocal1.performAction2004(-92);
            sceneWidgetLocal1 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1972(true));
          }
        }
        if (integerArgument1 >= -16) {
          renderingSupport010State0007 = (RenderingSupport010) null;
        }
    }

    private final void performAction1993(int integerArgument1, byte byteArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        boolean stackBooleanLocal1 = false;
        boolean stackBooleanLocal2 = false;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        SceneWidget sceneWidgetLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (this.integerState0887 <= 0) {
          integerLocal3 = this.integerState0887 >> 2;
        } else {
          integerLocal3 = -(-this.integerState0887 >> 2);
        }
        this.integerState0890 = this.integerState0890 + integerLocal3;
        this.integerState0887 = this.integerState0887 - integerLocal3;
        if (this.integerState0904 <= 0) {
          integerLocal11 = this.integerState0904 >> 2;
        } else {
          integerLocal11 = -(-this.integerState0904 >> 2);
        }
        this.integerState0903 = this.integerState0903 + integerLocal11;
        this.integerState0904 = this.integerState0904 - integerLocal11;
        if (this.integerState0907 > 0) {
          integerLocal12 = -(-this.integerState0907 >> 2);
        } else {
          integerLocal12 = this.integerState0907 >> 2;
        }
        this.integerState0896 = this.integerState0896 + integerLocal12;
        this.integerState0907 = this.integerState0907 - integerLocal12;
        if (this.integerState0895 <= 0) {
          integerLocal13 = this.integerState0895 >> 2;
        } else {
          integerLocal13 = -(-this.integerState0895 >> 2);
        }
        this.integerState0886 = integerArgument6 + this.integerState0903;
        this.integerState0895 = this.integerState0895 - integerLocal13;
        booleanArgument3 = booleanArgument3 & this.booleanState0212;
        this.integerState0915 = this.integerState0915 + integerLocal13;
        this.integerState0892 = this.integerState0890 + integerArgument1;
        integerLocal4 = SoftwareRaster.integerState0282;
        integerLocal5 = SoftwareRaster.integerState0280;
        integerLocal6 = SoftwareRaster.integerState0281;
        integerLocal7 = SoftwareRaster.integerState0283;
        SoftwareRaster.performAction0742(this.integerState0892, this.integerState0886, this.integerState0896 + this.integerState0892, this.integerState0915 + this.integerState0886);
        integerLocal8 = 0;
        if (!SceneWidgetPart002.booleanState0051 &&
          booleanArgument3 &&
          0 != SceneWidgetPart005.integerState0328 &&
          UiComponentPart013.integerState0276 >= SoftwareRaster.integerState0282 &&
          SoftwareRaster.integerState0281 > UiComponentPart013.integerState0276 &&
          SoftwareRaster.integerState0280 <= TextLineMetrics.integerState0535 &&
          TextLineMetrics.integerState0535 < SoftwareRaster.integerState0283) {
          this.integerState0897 = -this.integerState0892 + UiComponentPart013.integerState0276;
          this.integerState0894 = -this.integerState0886 + TextLineMetrics.integerState0535;
          this.integerState0888 = SceneWidgetPart005.integerState0328;
          integerLocal8 = 1;
          this.integerState0891 = SceneWidgetPart005.integerState0328;
        } else {
          this.integerState0891 = 0;
          if (SceneWidgetPart005.integerState0328 != 0) {
            this.integerState0888 = 0;
          }
        }
        stackBooleanLocal1 = (!MixedSupport122.booleanState0179) && (SoftwareRaster.integerState0282 <= HashNode.integerState0069) && (HashNode.integerState0069 < SoftwareRaster.integerState0281) && (SoftwareRaster.integerState0280 <= MixedSupport106.integerState0590) && (MixedSupport106.integerState0590 < SoftwareRaster.integerState0283);
        this.booleanState0211 = stackBooleanLocal1;
        if (0 == DualNode.integerState0062) {
          this.integerState0888 = 0;
        }
        stackBooleanLocal2 = (this.booleanState0211) && (DualNode.integerState0062 == this.integerState0888) && (booleanArgument3);
        this.booleanState0218 = stackBooleanLocal2;
        if (null != this.nodeDequeState0034) {
          sceneWidgetLocal9 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1969(true));
          while (sceneWidgetLocal9 != null) {
            sceneWidgetLocal9.performAction1993(this.integerState0892, (byte) 126, booleanArgument3, this.integerState0915, this.integerState0896, this.integerState0886);
            sceneWidgetLocal9 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1972(true));
          }
        }
        if (this.booleanState0211) {
          MixedSupport122.booleanState0179 = true;
        }
        if (integerLocal8 != 0) {
          SceneWidgetPart002.booleanState0051 = true;
        }
        SoftwareRaster.performAction0728(integerLocal4, integerLocal5, integerLocal6, integerLocal7);
        if (this.integerState0888 != 0 &&
          this.booleanState0219) {
          this.integerState0890 = -integerArgument1 + HashNode.integerState0069 - this.integerState0897;
          this.integerState0903 = -this.integerState0894 + MixedSupport106.integerState0590 - integerArgument6;
          if (this.integerState0890 < 0) {
            this.integerState0890 = 0;
          }
          if (0 > this.integerState0903) {
            this.integerState0903 = 0;
          }
          if (-this.integerState0896 + integerArgument5 < this.integerState0890) {
            this.integerState0890 = integerArgument5 - this.integerState0896;
          }
          this.integerState0887 = 0;
          this.integerState0904 = 0;
          if (integerArgument4 - this.integerState0915 < this.integerState0903) {
            this.integerState0903 = integerArgument4 - this.integerState0915;
          }
          this.integerState0892 = integerArgument1 + this.integerState0890;
          this.integerState0886 = this.integerState0903 + integerArgument6;
        }
        if (byteArgument2 < 125) {
          this.integerState0892 = 12;
        }
    }

    final void performAction1997(int integerArgument1, boolean booleanArgument2) {
        this.performAction2001(booleanArgument2, SoftwareRaster.integerState0285, false, true, 0, SoftwareRaster.integerState0284, false, 0, false, false, -29696);
        if (integerArgument1 != 1141039778) {
          this.rgbSpriteState0069 = (RgbSprite) null;
        }
    }

    final void performAction1996(int integerArgument1, SceneWidget sceneWidgetArgument2) {
        boolean stackBooleanLocal1 = false;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          if (sceneWidgetArgument2 != null) {
            if (sceneWidgetArgument2.rgbSpriteArrayState0033 != null) {
              this.rgbSpriteArrayState0033 = sceneWidgetArgument2.rgbSpriteArrayState0033;
            }
            if (sceneWidgetArgument2.integerState0906 >= 0) {
              this.integerState0906 = sceneWidgetArgument2.integerState0906;
            }
            if (sceneWidgetArgument2.booleanState0217) {
              this.booleanState0217 = sceneWidgetArgument2.booleanState0217;
            }
            if (sceneWidgetArgument2.rgbSpriteState0066 != null) {
              this.rgbSpriteState0066 = sceneWidgetArgument2.rgbSpriteState0066;
            }
            if (null != sceneWidgetArgument2.stringState0598) {
              this.stringState0598 = sceneWidgetArgument2.stringState0598;
            }
            if (sceneWidgetArgument2.rgbSpriteArrayState0035 != null) {
              this.rgbSpriteArrayState0035 = sceneWidgetArgument2.rgbSpriteArrayState0035;
            }
            if (sceneWidgetArgument2.booleanState0214) {
              this.booleanState0214 = sceneWidgetArgument2.booleanState0214;
            }
            if (sceneWidgetArgument2.rgbSpriteArrayState0032 != null) {
              this.rgbSpriteArrayState0032 = sceneWidgetArgument2.rgbSpriteArrayState0032;
            }
            if (sceneWidgetArgument2.rgbSpriteArrayState0034 != null) {
              this.rgbSpriteArrayState0034 = sceneWidgetArgument2.rgbSpriteArrayState0034;
            }
            if (null != sceneWidgetArgument2.stringState0599) {
              this.stringState0599 = sceneWidgetArgument2.stringState0599;
            }
            if (0 <= sceneWidgetArgument2.integerState0899) {
              this.integerState0899 = sceneWidgetArgument2.integerState0899;
            }
            if (sceneWidgetArgument2.integerState0912 >= 0) {
              this.integerState0912 = sceneWidgetArgument2.integerState0912;
            }
            if (sceneWidgetArgument2.integerState0893 != 0) {
              this.integerState0893 = sceneWidgetArgument2.integerState0893;
            }
            if (null != sceneWidgetArgument2.rgbSpriteState0065) {
              this.rgbSpriteState0065 = sceneWidgetArgument2.rgbSpriteState0065;
            }
            if (sceneWidgetArgument2.booleanState0215) {
              this.booleanState0215 = sceneWidgetArgument2.booleanState0215;
            }
            if (sceneWidgetArgument2.integerState0908 != 0) {
              this.integerState0908 = sceneWidgetArgument2.integerState0908;
            }
            if (!sceneWidgetArgument2.booleanState0212) {
              this.booleanState0212 = sceneWidgetArgument2.booleanState0212;
            }
            if (0 <= sceneWidgetArgument2.integerState0889) {
              this.integerState0889 = sceneWidgetArgument2.integerState0889;
            }
            if (sceneWidgetArgument2.rgbSpriteArrayState0036 != null) {
              this.rgbSpriteArrayState0036 = sceneWidgetArgument2.rgbSpriteArrayState0036;
            }
            if (null != sceneWidgetArgument2.rgbSpriteState0067) {
              this.rgbSpriteState0067 = sceneWidgetArgument2.rgbSpriteState0067;
            }
            if (sceneWidgetArgument2.rgbSpriteState0070 != null) {
              this.rgbSpriteState0070 = sceneWidgetArgument2.rgbSpriteState0070;
            }
            if (sceneWidgetArgument2.integerState0910 != 0) {
              this.integerState0910 = sceneWidgetArgument2.integerState0910;
            }
            if (sceneWidgetArgument2.integerState0917 != 256) {
              this.integerState0917 = sceneWidgetArgument2.integerState0917;
            }
            if (null != sceneWidgetArgument2.bitmapFontState0020) {
              this.bitmapFontState0020 = sceneWidgetArgument2.bitmapFontState0020;
            }
            if (null != sceneWidgetArgument2.rgbSpriteState0069) {
              this.rgbSpriteState0069 = sceneWidgetArgument2.rgbSpriteState0069;
            }
            if (sceneWidgetArgument2.booleanState0216) {
              this.booleanState0216 = sceneWidgetArgument2.booleanState0216;
            }
            stackBooleanLocal1 = (this.booleanState0216) && (sceneWidgetArgument2.booleanState0213);
            this.booleanState0213 = stackBooleanLocal1;
            if (sceneWidgetArgument2.integerState0902 != -2147483648) {
              this.integerState0902 = sceneWidgetArgument2.integerState0902;
            }
            if (0 != sceneWidgetArgument2.integerState0900) {
              this.integerState0900 = sceneWidgetArgument2.integerState0900;
            }
            if (0 != sceneWidgetArgument2.integerState0916) {
              this.integerState0916 = sceneWidgetArgument2.integerState0916;
            }
            if (sceneWidgetArgument2.integerState0914 != -2147483648) {
              this.integerState0914 = sceneWidgetArgument2.integerState0914;
            }
            if (sceneWidgetArgument2.integerState0884 != -2147483648) {
              this.integerState0884 = sceneWidgetArgument2.integerState0884;
            }
            if (sceneWidgetArgument2.integerState0913 != -2147483648) {
              this.integerState0913 = sceneWidgetArgument2.integerState0913;
            }
            if (sceneWidgetArgument2.integerState0911 != 0) {
              this.integerState0911 = sceneWidgetArgument2.integerState0911;
            }
            if (sceneWidgetArgument2.integerState0898 != -2147483648) {
              this.integerState0898 = sceneWidgetArgument2.integerState0898;
            }
            if (sceneWidgetArgument2.integerState0885 != 0) {
              this.integerState0885 = sceneWidgetArgument2.integerState0885;
            }
            if (sceneWidgetArgument2.integerState0901 != -2147483648) {
              this.integerState0901 = sceneWidgetArgument2.integerState0901;
            }
            if (sceneWidgetArgument2.booleanState0219) {
              this.booleanState0219 = sceneWidgetArgument2.booleanState0219;
            }
          }
          if (integerArgument1 >= -111) {
            this.computeInteger2000(true);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("w.W(").append(integerArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final void performAction1999(SceneWidget sceneWidgetArgument1, SceneWidget sceneWidgetArgument2, int integerArgument3, int integerArgument4) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        try {
          if (integerArgument4 != 0) {
            return;
          }
          if (sceneWidgetArgument1 == null) {
            sceneWidgetArgument2.integerState0903 = 0;
            sceneWidgetArgument2.integerState0904 = 0;
          } else {
            sceneWidgetArgument2.integerState0904 = sceneWidgetArgument1.integerState0904 + sceneWidgetArgument1.integerState0895;
            sceneWidgetArgument2.integerState0903 = sceneWidgetArgument1.integerState0915 + (sceneWidgetArgument1.integerState0903 + integerArgument3);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal7;
          stackStringBuilderLocal2 = new StringBuilder().append("w.KA(");
          if (sceneWidgetArgument1 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          stackStringBuilderLocal4 = ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument3).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final int computeInteger1991(byte byteArgument1, int integerArgument2) {
        SceneWidget sceneWidgetLocal1 = null;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal5 = 0;
        int integerLocal6;
        if (this.stringState0598 != null &&
          this.bitmapFontState0020 != null) {
          integerLocal3 = this.bitmapFontState0020.computeInteger1222(this.stringState0598, integerArgument2);
          if (integerLocal3 > integerLocal5) {
            integerLocal5 = integerLocal3;
          }
        }
        if (byteArgument1 != 84) {
          this.integerState0914 = -71;
        }
        if (this.rgbSpriteState0070 != null) {
          integerLocal6 = this.rgbSpriteState0070.integerState0254;
          if (integerLocal5 < integerLocal6) {
            integerLocal5 = integerLocal6;
          }
        }
        if (null != this.nodeDequeState0034) {
          sceneWidgetLocal1 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1970((byte) -125));
          while (sceneWidgetLocal1 != null) {
            integerLocal2 = sceneWidgetLocal1.integerState0896 + sceneWidgetLocal1.integerState0890;
            if (integerLocal5 < integerLocal2) {
              integerLocal5 = integerLocal2;
            }
            sceneWidgetLocal1 = (SceneWidget) (this.nodeDequeState0034.computeHashNode1974(true));
          }
        }
        return integerLocal5;
    }

    protected SceneWidget() {
        this.integerState0884 = -2147483648;
        this.integerState0889 = -1;
        this.integerState0898 = -2147483648;
        this.booleanState0213 = false;
        this.integerState0901 = -2147483648;
        this.integerState0902 = -2147483648;
        this.booleanState0216 = false;
        this.booleanState0212 = true;
        this.integerState0906 = -1;
        this.integerState0899 = -1;
        this.integerState0905 = 256;
        this.integerState0913 = -2147483648;
        this.integerState0912 = -1;
        this.integerState0917 = 256;
        this.integerState0914 = -2147483648;
    }

    SceneWidget(long longArgument1, SceneWidget sceneWidgetArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, String stringArgument7) {
        RuntimeException runtimeException = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        this.integerState0884 = -2147483648;
        this.integerState0889 = -1;
        this.integerState0898 = -2147483648;
        this.booleanState0213 = false;
        this.integerState0901 = -2147483648;
        this.integerState0902 = -2147483648;
        this.booleanState0216 = false;
        this.booleanState0212 = true;
        this.integerState0906 = -1;
        this.integerState0899 = -1;
        this.integerState0905 = 256;
        this.integerState0913 = -2147483648;
        this.integerState0912 = -1;
        this.integerState0917 = 256;
        this.integerState0914 = -2147483648;
        try {
          this.integerState0896 = integerArgument5;
          this.key = longArgument1;
          this.integerState0915 = integerArgument6;
          this.integerState0890 = integerArgument3;
          this.integerState0903 = integerArgument4;
          this.performAction1996(-119, sceneWidgetArgument2);
          if (stringArgument7 != null) {
            this.stringState0598 = stringArgument7;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeException = caughtExceptionLocal7;
          stackRuntimeExceptionLocal2 = runtimeException;
          stackStringBuilderLocal3 = new StringBuilder().append("w.<init>(").append(longArgument1).append(',');
          if (sceneWidgetArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          stackStringBuilderLocal5 = ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',');
          if (stringArgument7 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
        integerState0909 = 100;
    }
}
