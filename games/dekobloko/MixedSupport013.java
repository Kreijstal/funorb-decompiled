/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport013 {
    static String stringState0061;
    static boolean[] booleanArrayState0003;
    static BitmapFont bitmapFontState0007;
    static String stringState0062;
    static String stringState0063;
    static String stringState0064;
    static RgbSprite rgbSpriteState0007;

    public static void performAction0185(byte byteArgument1) {
        if (byteArgument1 == 92) {
          bitmapFontState0007 = null;
          stringState0063 = null;
          rgbSpriteState0007 = null;
          stringState0061 = null;
          stringState0064 = null;
          booleanArrayState0003 = null;
          stringState0062 = null;
          return;
        }
        stringState0062 = (String) null;
        bitmapFontState0007 = null;
        stringState0063 = null;
        rgbSpriteState0007 = null;
        stringState0061 = null;
        stringState0064 = null;
        booleanArrayState0003 = null;
        stringState0062 = null;
    }

    final static void performAction0186(byte byteArgument1, int integerArgument2, int integerArgument3, int integerArgument4, RgbSprite rgbSpriteArgument5, int integerArgument6) {
        int previousIntegerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        int integerLocal20 = 0;
        int integerLocal21 = 0;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        integerLocal21 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal6 = (integerArgument2 - integerArgument3 << 8) / rgbSpriteArgument5.integerState0254;
          integerArgument6 = integerArgument6 + rgbSpriteArgument5.integerState0259;
          integerLocal8 = (integerArgument3 << 8) + integerLocal6 * rgbSpriteArgument5.integerState0259;
          if (byteArgument1 > -96) {
            stringState0064 = (String) null;
          }
          integerArgument4 = integerArgument4 + rgbSpriteArgument5.integerState0256;
          integerLocal9 = SoftwareRaster.integerState0285 * integerArgument4 + integerArgument6;
          integerLocal10 = 0;
          integerLocal11 = rgbSpriteArgument5.integerState0255;
          integerLocal12 = rgbSpriteArgument5.integerState0258;
          integerLocal13 = SoftwareRaster.integerState0285 - integerLocal12;
          integerLocal14 = 0;
          if (integerArgument4 < SoftwareRaster.integerState0280) {
            integerLocal15 = SoftwareRaster.integerState0280 - integerArgument4;
            integerLocal9 = integerLocal9 + integerLocal15 * SoftwareRaster.integerState0285;
            integerLocal10 = integerLocal10 + integerLocal12 * integerLocal15;
            integerLocal11 = integerLocal11 - integerLocal15;
            integerArgument4 = SoftwareRaster.integerState0280;
          }
          if (SoftwareRaster.integerState0283 < integerLocal11 + integerArgument4) {
            integerLocal11 = integerLocal11 - (-SoftwareRaster.integerState0283 + integerArgument4 + integerLocal11);
          }
          if (SoftwareRaster.integerState0282 > integerArgument6) {
            integerLocal22 = SoftwareRaster.integerState0282 - integerArgument6;
            integerLocal13 = integerLocal13 + integerLocal22;
            integerLocal12 = integerLocal12 - integerLocal22;
            integerLocal10 = integerLocal10 + integerLocal22;
            integerLocal14 = integerLocal14 + integerLocal22;
            integerLocal8 = integerLocal8 + integerLocal22 * integerLocal6;
            integerArgument6 = SoftwareRaster.integerState0282;
            integerLocal9 = integerLocal9 + integerLocal22;
          }
          if (integerLocal12 + integerArgument6 > SoftwareRaster.integerState0281) {
            integerLocal23 = integerLocal12 + (integerArgument6 - SoftwareRaster.integerState0281);
            integerLocal14 = integerLocal14 + integerLocal23;
            integerLocal13 = integerLocal13 + integerLocal23;
            integerLocal12 = integerLocal12 - integerLocal23;
          }
          if (integerLocal12 > 0 &&
            0 < integerLocal11) {
            for (integerArgument4 = -integerLocal11; 0 > integerArgument4; integerArgument4++) {
              integerLocal24 = integerLocal8;
              for (integerArgument6 = -integerLocal12; 0 > integerArgument6; integerArgument6++) {
                integerLocal16 = integerLocal24 >> 8;
                integerLocal24 = integerLocal24 + integerLocal6;
                integerLocal17 = -integerLocal16 + 256;
                if (integerLocal16 < 0) {
                  integerLocal10++;
                  integerLocal9++;
                } else {
                  previousIntegerLocal1 = integerLocal10;
                  integerLocal10++;
                  integerLocal18 = rgbSpriteArgument5.integerArrayState0024[previousIntegerLocal1];
                  if (integerLocal18 != 0) {
                    if (integerLocal16 <= 255) {
                      integerLocal19 = SoftwareRaster.integerArrayState0063[integerLocal9];
                      integerLocal20 = integerLocal17 * (16711935 & integerLocal19) + integerLocal16 * (integerLocal18 & 16711935) >> 8 & 16711935;
                      SoftwareRaster.integerArrayState0063[integerLocal9] = MixedSupport079.computeInteger1051(65280, MixedSupport079.computeInteger1051(65280, integerLocal18) * integerLocal16 + integerLocal17 * MixedSupport079.computeInteger1051(65280, integerLocal19) >> 8) + integerLocal20;
                    } else {
                      SoftwareRaster.integerArrayState0063[integerLocal9] = integerLocal18;
                    }
                    integerLocal9++;
                  } else {
                    integerLocal9++;
                  }
                }
              }
              integerLocal10 = integerLocal10 + integerLocal14;
              integerLocal9 = integerLocal9 + integerLocal13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal25) {
          caughtExceptionLocal5 = caughtParameterLocal25;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("bn.B(").append(byteArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',');
          if (rgbSpriteArgument5 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument6).append(')').toString());
        }
    }

    final static MixedSupport016 computeMixedSupport0160188(boolean booleanArgument1, boolean booleanArgument2) {
        MixedSupport016 mixedSupport016Local1 = null;
        MixedSupport016 mixedSupport016Local2;
        if (!booleanArgument1) {
          mixedSupport016Local1 = new MixedSupport016(true);
          mixedSupport016Local1.booleanState0013 = booleanArgument2 ? true : false;
          return mixedSupport016Local1;
        }
        RgbSprite rgbSpriteLocal3 = (RgbSprite) null;
        MixedSupport013.performAction0186((byte) 42, -57, 101, -103, (RgbSprite) null, 71);
        mixedSupport016Local2 = new MixedSupport016(true);
        mixedSupport016Local2.booleanState0013 = booleanArgument2 ? true : false;
        return mixedSupport016Local2;
    }

    final static void performAction0187(long longArgument1, int integerArgument2, byte byteArgument3) {
        CipherPacketBuffer cipherPacketBufferLocal1 = null;
        int integerLocal2 = 0;
        CipherPacketBuffer cipherPacketBufferLocal3;
        int integerLocal4;
        if (byteArgument3 == -84) {
          cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal1.performAction1861(integerArgument2, -4);
          cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
          integerLocal2 = cipherPacketBufferLocal1.position;
          cipherPacketBufferLocal1.performAction2073(true, 6);
          cipherPacketBufferLocal1.performAction2068(longArgument1, (byte) 0);
          cipherPacketBufferLocal1.performAction2079(cipherPacketBufferLocal1.position - integerLocal2, true);
          return;
        }
        booleanArrayState0003 = (boolean[]) null;
        cipherPacketBufferLocal3 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal3.performAction1861(integerArgument2, -4);
        cipherPacketBufferLocal3.position = cipherPacketBufferLocal3.position + 1;
        integerLocal4 = cipherPacketBufferLocal3.position;
        cipherPacketBufferLocal3.performAction2073(true, 6);
        cipherPacketBufferLocal3.performAction2068(longArgument1, (byte) 0);
        cipherPacketBufferLocal3.performAction2079(cipherPacketBufferLocal3.position - integerLocal4, true);
    }

    static {
        stringState0062 = "PANIC!";
        stringState0061 = "Kick";
        stringState0064 = "Loading graphics";
        stringState0063 = "Enter name of player to delete from list";
    }
}
