/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingSupport013 {
    static String stringState0440;
    private long[] longArrayState0004;
    static String stringState0441;
    private byte[] byteArrayState0023;
    static String stringState0442;
    private byte[] byteArrayState0024;
    static int[] integerArrayState0191;
    private long[] longArrayState0005;
    private int integerState0649;
    private long[] longArrayState0006;
    private long[] longArrayState0007;
    static String stringState0443;
    private long[] longArrayState0008;
    static String stringState0444;
    private int integerState0650;

    final void performAction1527(byte byteArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        int integerLocal3;
        for (integerLocal1 = 0; integerLocal1 < 32; integerLocal1++) {
          this.byteArrayState0024[integerLocal1] = (byte) 0;
        }
        this.integerState0649 = 0;
        this.integerState0650 = 0;
        this.byteArrayState0023[0] = (byte) 0;
        integerLocal3 = 0;
        if (byteArgument1 >= -32) {
          return;
        }
        while (integerLocal3 < 8) {
          this.longArrayState0006[integerLocal3] = 0L;
          integerLocal3++;
        }
    }

    private final void performAction1528(int integerArgument1) {
        long cachedLongLocal1 = 0L;
        long arrayValue$1 = 0L;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal3 = 0;
        integerLocal4 = 0;
        while (integerLocal3 < 8) {
          this.longArrayState0004[integerLocal3] = ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427(LoginCredentials.computeLong0893((long)this.byteArrayState0023[integerLocal4 + 6], 255L) << 8, ResourceSupport004.computeLong1427(LoginCredentials.computeLong0893((long)this.byteArrayState0023[integerLocal4 + 5] << 16, 16711680L), ResourceSupport004.computeLong1427(LoginCredentials.computeLong0893(4278190080L, (long)this.byteArrayState0023[integerLocal4 + 4] << 24), ResourceSupport004.computeLong1427(LoginCredentials.computeLong0893((long)this.byteArrayState0023[3 + integerLocal4] << 32, 1095216660480L), ResourceSupport004.computeLong1427(ResourceSupport004.computeLong1427((long)this.byteArrayState0023[integerLocal4] << 56, LoginCredentials.computeLong0893((long)this.byteArrayState0023[integerLocal4 + 1] << 48, 71776119061217280L)), LoginCredentials.computeLong0893(280375465082880L, (long)this.byteArrayState0023[2 + integerLocal4] << 40)))))), LoginCredentials.computeLong0893(255L, (long)this.byteArrayState0023[7 + integerLocal4]));
          integerLocal3++;
          integerLocal4 += 8;
        }
        for (integerLocal9 = 0; integerLocal9 < 8; integerLocal9++) {
          cachedLongLocal1 = this.longArrayState0006[integerLocal9];
          arrayValue$1 = this.longArrayState0004[integerLocal9];
          this.longArrayState0005[integerLocal9] = cachedLongLocal1;
          this.longArrayState0007[integerLocal9] = ResourceSupport004.computeLong1427(arrayValue$1, cachedLongLocal1);
        }
        for (integerLocal10 = 1; integerLocal10 <= 10; integerLocal10++) {
          for (integerLocal12 = 0; 8 > integerLocal12; integerLocal12++) {
            this.longArrayState0008[integerLocal12] = 0L;
            integerLocal5 = 0;
            integerLocal6 = 56;
            while (integerLocal5 < 8) {
              this.longArrayState0008[integerLocal12] = ResourceSupport004.computeLong1427(this.longArrayState0008[integerLocal12], AnimatedTileRegion.longArrayArrayState0002[integerLocal5][MixedSupport079.computeInteger1051((int)(this.longArrayState0005[MixedSupport079.computeInteger1051(7, -integerLocal5 + integerLocal12)] >>> integerLocal6), 255)]);
              integerLocal5++;
              integerLocal6 -= 8;
            }
          }
          for (integerLocal15 = 0; integerLocal15 < 8; integerLocal15++) {
            this.longArrayState0005[integerLocal15] = this.longArrayState0008[integerLocal15];
          }
          this.longArrayState0005[0] = ResourceSupport004.computeLong1427(this.longArrayState0005[0], AnimatedTileRegion.longArrayState0010[integerLocal10]);
          for (integerLocal16 = 0; integerLocal16 < 8; integerLocal16++) {
            this.longArrayState0008[integerLocal16] = this.longArrayState0005[integerLocal16];
            integerLocal8 = 0;
            integerLocal13 = integerLocal8;
            integerLocal14 = 56;
            while (8 > integerLocal8) {
              this.longArrayState0008[integerLocal16] = ResourceSupport004.computeLong1427(this.longArrayState0008[integerLocal16], AnimatedTileRegion.longArrayArrayState0002[integerLocal8][MixedSupport079.computeInteger1051((int)(this.longArrayState0007[MixedSupport079.computeInteger1051(7, integerLocal16 - integerLocal8)] >>> integerLocal14), 255)]);
              integerLocal8++;
              integerLocal14 -= 8;
            }
          }
          for (integerLocal17 = 0; integerLocal17 < 8; integerLocal17++) {
            this.longArrayState0007[integerLocal17] = this.longArrayState0008[integerLocal17];
          }
        }
        if (integerArgument1 > -24) {
          this.byteArrayState0024 = (byte[]) null;
        }
        for (integerLocal11 = 0; integerLocal11 < 8; integerLocal11++) {
          this.longArrayState0006[integerLocal11] = ResourceSupport004.computeLong1427(this.longArrayState0006[integerLocal11], ResourceSupport004.computeLong1427(this.longArrayState0004[integerLocal11], this.longArrayState0007[integerLocal11]));
        }
    }

    final void performAction1523(int integerArgument1, byte[] byteArrayArgument2, long longArgument3) {
        int stackIntegerLocal1 = 0;
        int stackIntegerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        long longLocal12 = 0L;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16;
        integerLocal15 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal7 = 0;
          integerLocal9 = 7 & 8 - ((int)longArgument3 & 7);
          if (integerArgument1 != 255) {
            RenderingSupport013.computeString1520((byte) 13);
          }
          integerLocal10 = 7 & this.integerState0649;
          longLocal12 = longArgument3;
          integerLocal13 = 31;
          integerLocal14 = 0;
          while (0 <= integerLocal13) {
            integerLocal14 = integerLocal14 + ((this.byteArrayState0024[integerLocal13] & 255) + (255 & (int)longLocal12));
            this.byteArrayState0024[integerLocal13] = (byte)integerLocal14;
            integerLocal14 = integerLocal14 >>> 8;
            longLocal12 = longLocal12 >>> 8;
            integerLocal13--;
          }
          while (longArgument3 > 8L) {
            integerLocal11 = 255 & byteArrayArgument2[integerLocal7] << integerLocal9 | (byteArrayArgument2[1 + integerLocal7] & 255) >>> 8 - integerLocal9;
            if (0 <= integerLocal11 &&
              integerLocal11 < 256) {
              this.byteArrayState0023[this.integerState0650] = (byte)UiComponentPart006.computeInteger0388((int) this.byteArrayState0023[this.integerState0650], integerLocal11 >>> integerLocal10);
              this.integerState0649 = this.integerState0649 + (-integerLocal10 + 8);
              this.integerState0650 = this.integerState0650 + 1;
              if (this.integerState0649 == 512) {
                this.performAction1528(-63);
                this.integerState0649 = 0;
                this.integerState0650 = 0;
              }
              this.byteArrayState0023[this.integerState0650] = (byte)MixedSupport079.computeInteger1051(255, integerLocal11 << 8 - integerLocal10);
              longArgument3 = longArgument3 - 8L;
              integerLocal7++;
              this.integerState0649 = this.integerState0649 + integerLocal10;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (longArgument3 > 0L) {
            stackIntegerLocal1 = byteArrayArgument2[integerLocal7] << integerLocal9;
            stackIntegerLocal2 = 255;
            integerLocal16 = stackIntegerLocal1 & stackIntegerLocal2;
            this.byteArrayState0023[this.integerState0650] = (byte)UiComponentPart006.computeInteger0388((int) this.byteArrayState0023[this.integerState0650], integerLocal16 >>> integerLocal10);
          } else {
            integerLocal16 = 0;
          }
          if (longArgument3 + (long)integerLocal10 >= 8L) {
            this.integerState0649 = this.integerState0649 + (-integerLocal10 + 8);
            this.integerState0650 = this.integerState0650 + 1;
            longArgument3 = longArgument3 - (long)(8 - integerLocal10);
            if (this.integerState0649 == 512) {
              this.performAction1528(-26);
              this.integerState0650 = 0;
              this.integerState0649 = 0;
            }
            this.byteArrayState0023[this.integerState0650] = (byte)MixedSupport079.computeInteger1051(255, integerLocal16 << 8 - integerLocal10);
            this.integerState0649 = this.integerState0649 + (int)longArgument3;
          } else {
            this.integerState0649 = (int)((long)this.integerState0649 + longArgument3);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal6 = caughtParameterLocal17;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("qe.H(").append(integerArgument1).append(',');
          if (byteArrayArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(longArgument3).append(')').toString());
        }
    }

    final static boolean computeBoolean1525(String stringArgument1, int integerArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument2 != 3) {
            integerArrayState0191 = (int[]) null;
          }
          stackBooleanLocal2 = (null != MixedSupport029.computeSceneWidgetPart0140448(stringArgument1, (byte) -108));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("qe.D(");
          if (stringArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(')').toString());
        }
    }

    final void performAction1522(int integerArgument1, int integerArgument2, byte[] byteArrayArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        int integerLocal7 = 0;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9 = 0;
        long longLocal10 = 0L;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          this.byteArrayState0023[this.integerState0650] = (byte)UiComponentPart006.computeInteger0388((int) this.byteArrayState0023[this.integerState0650], 128 >>> MixedSupport079.computeInteger1051(this.integerState0649, 7));
          this.integerState0650 = this.integerState0650 + 1;
          if (this.integerState0650 > 32) {
            while (this.integerState0650 < 64) {
              integerLocal1 = this.integerState0650;
              this.integerState0650 = this.integerState0650 + 1;
              this.byteArrayState0023[integerLocal1] = (byte) 0;
            }
            this.performAction1528(-115);
            this.integerState0650 = 0;
          }
          while (32 > this.integerState0650) {
            integerLocal2 = this.integerState0650;
            this.integerState0650 = this.integerState0650 + 1;
            this.byteArrayState0023[integerLocal2] = (byte) 0;
          }
          MixedSupport008.performAction0082(this.byteArrayState0024, 0, this.byteArrayState0023, 32, 32);
          this.performAction1528(-76);
          integerLocal7 = 0;
          integerLocal9 = integerArgument2;
          while (integerLocal7 < 8) {
            longLocal10 = this.longArrayState0006[integerLocal7];
            byteArrayArgument3[integerLocal9] = (byte)(int)(longLocal10 >>> 56);
            byteArrayArgument3[integerLocal9 + 1] = (byte)(int)(longLocal10 >>> 48);
            byteArrayArgument3[2 + integerLocal9] = (byte)(int)(longLocal10 >>> 40);
            byteArrayArgument3[3 + integerLocal9] = (byte)(int)(longLocal10 >>> 32);
            byteArrayArgument3[integerLocal9 + 4] = (byte)(int)(longLocal10 >>> 24);
            byteArrayArgument3[5 + integerLocal9] = (byte)(int)(longLocal10 >>> 16);
            byteArrayArgument3[6 + integerLocal9] = (byte)(int)(longLocal10 >>> 8);
            byteArrayArgument3[7 + integerLocal9] = (byte)(int)longLocal10;
            integerLocal9 += 8;
            integerLocal7++;
          }
          if (integerArgument1 != 64767752) {
            this.integerState0650 = -86;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal6 = caughtParameterLocal12;
          runtimeExceptionLocal8 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal8;
          stackStringBuilderLocal4 = new StringBuilder().append("qe.C(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (byteArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static String computeString1520(byte byteArgument1) {
        String stringLocal1 = "";
        if (byteArgument1 < 85) {
          return (String) null;
        }
        if (MixedSupport025.uiComponentPart013State0001 != null) {
          stringLocal1 = MixedSupport025.uiComponentPart013State0001.computeString0698(80);
        }
        if (stringLocal1.length() == 0) {
          stringLocal1 = DiagnosticSupport001.computeString0368((byte) 122);
        }
        if (stringLocal1.length() == 0) {
          stringLocal1 = MixedSupport153.stringState0620;
        }
        return stringLocal1;
    }

    final static RgbSprite[] computeRgbSpriteArray1526(boolean booleanArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RgbSprite rgbSpriteLocal1 = null;
        RgbSprite rgbSpriteLocal2 = null;
        if (integerArgument6 != -26198) {
          stringState0443 = (String) null;
        }
        int[] integerArrayLocal3 = SoftwareRaster.integerArrayState0063;
        int[] integerArrayLocal4 = integerArrayLocal3;
        int[] integerArrayLocal5 = integerArrayLocal4;
        int[] integerArrayLocal6 = integerArrayLocal5;
        int integerLocal7 = SoftwareRaster.integerState0285;
        int integerLocal8 = SoftwareRaster.integerState0284;
        RgbSprite rgbSpriteLocal9 = new RgbSprite(16, integerArgument2);
        rgbSpriteLocal9.performAction0278();
        SoftwareRaster.performAction0739(0, 0, 16, integerArgument2, integerArgument4, integerArgument5);
        Object objectLocal10 = null;
        if (booleanArgument3) {
          rgbSpriteLocal1 = rgbSpriteLocal9.computeRgbSprite0299();
          objectLocal10 = rgbSpriteLocal1;
          rgbSpriteLocal1.performAction0278();
          SoftwareRaster.performAction0718(0, 0, 5, 0);
          SoftwareRaster.performAction0718(0, 1, 3, 0);
          SoftwareRaster.performAction0718(0, 2, 2, 0);
          SoftwareRaster.performAction0718(0, 3, 1, 0);
          SoftwareRaster.performAction0718(0, 4, 1, 0);
        }
        Object objectLocal11 = null;
        if (booleanArgument1) {
          rgbSpriteLocal2 = rgbSpriteLocal9.computeRgbSprite0299();
          objectLocal11 = rgbSpriteLocal2;
          rgbSpriteLocal2.performAction0278();
          SoftwareRaster.performAction0718(11, 0, 5, 0);
          SoftwareRaster.performAction0718(13, 1, 3, 0);
          SoftwareRaster.performAction0718(14, 2, 2, 0);
          SoftwareRaster.performAction0718(15, 3, 1, 0);
          SoftwareRaster.performAction0718(15, 4, 1, 0);
        }
        SoftwareRaster.performAction0724(integerArrayLocal3, integerLocal7, integerLocal8);
        return new RgbSprite[]{null, null, null, (RgbSprite) (objectLocal10), rgbSpriteLocal9, (RgbSprite) (objectLocal11), null, null, null};
    }

    public static void performAction1521(int integerArgument1) {
        stringState0442 = null;
        stringState0441 = null;
        stringState0444 = null;
        integerArrayState0191 = null;
        stringState0440 = null;
        stringState0443 = null;
        if (integerArgument1 != -20007) {
          stringState0442 = (String) null;
        }
    }

    final static void performAction1524(long longArgument1, int integerArgument2) {
        try {
          Throwable caughtExceptionLocal1 = null;
          InterruptedException interruptedExceptionLocal2 = null;
          if (integerArgument2 >= -100) {
            return;
          }
          try {
            Thread.sleep(longArgument1);
          } catch (java.lang.InterruptedException caughtParameterLocal3) {
            caughtExceptionLocal1 = caughtParameterLocal3;
            interruptedExceptionLocal2 = (InterruptedException) (Object) caughtExceptionLocal1;
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal4) {
          throw uncheckedExceptionLocal4;
        } catch (Throwable checkedExceptionLocal5) {
          throw new RuntimeException(checkedExceptionLocal5);
        }
    }

    RenderingSupport013() {
        this.byteArrayState0023 = new byte[64];
        this.longArrayState0004 = new long[8];
        this.integerState0649 = 0;
        this.longArrayState0006 = new long[8];
        this.byteArrayState0024 = new byte[32];
        this.longArrayState0008 = new long[8];
        this.longArrayState0007 = new long[8];
        this.integerState0650 = 0;
        this.longArrayState0005 = new long[8];
    }

    static {
        integerArrayState0191 = new int[8];
        stringState0441 = "Unable to add name - system busy";
        stringState0443 = "To activate a special item, pop a shape next to it.";
        stringState0440 = "Asking to join <%0>'s game...";
        stringState0444 = "Age:";
        stringState0442 = "Play rated game";
    }
}
