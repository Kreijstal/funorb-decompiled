/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport052 {
    static double doubleState0001;
    static String stringState0218;
    static String stringState0219;
    static int integerState0269;
    static int integerState0270;
    static int[] integerArrayState0054;

    final static void performAction0683(int integerArgument1) {
        RuntimeException caughtExceptionLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        Object objectLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        RgbSprite rgbSpriteLocal9 = null;
        RgbSprite rgbSpriteLocal10 = null;
        RgbSprite rgbSpriteLocal11 = null;
        RgbSprite rgbSpriteLocal12;
        RgbSprite rgbSpriteLocal13;
        int integerLocal14;
        integerLocal7 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          SoftwareRaster.performAction0743(243, 197, 369, 143, 16777215);
          SoftwareRaster.performAction0719(244, 198, 367, 141, 0);
          if (null == MixedSupport021.rgbSpriteArrayState0008) {
            if (null != MixedSupport013.bitmapFontState0007) {
              MixedSupport013.bitmapFontState0007.computeInteger1213(SoftwareFramebuffer.stringState0616, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          rgbSpriteLocal9 = MixedSupport021.rgbSpriteArrayState0008[MixedSupport153.integerState0930];
          rgbSpriteLocal10 = rgbSpriteLocal9;
          rgbSpriteLocal12 = rgbSpriteLocal9;
          if (rgbSpriteLocal9 != null) {
            rgbSpriteLocal9.performAction0300(245, 199);
          } else {
            if (null != MixedSupport013.bitmapFontState0007) {
              MixedSupport013.bitmapFontState0007.computeInteger1213(SoftwareFramebuffer.stringState0616, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          }
          integerLocal3 = -96 / ((integerArgument1 + 79) / 41);
          if (MixedSupport003.integerState0019 < PlatformSupport002.integerState0147) {
            rgbSpriteLocal13 = MixedSupport021.rgbSpriteArrayState0008[HashNode.integerState0068];
            if (rgbSpriteLocal13 != null) {
              integerLocal4 = (rgbSpriteLocal13.integerState0254 + 60) * MixedSupport003.integerState0019 / PlatformSupport002.integerState0147;
              integerLocal6 = -30 + integerLocal4;
              if (MixedSupport079.booleanState0098) {
                MixedSupport013.performAction0186((byte) -112, integerLocal6 * -256 / 30, (rgbSpriteLocal13.integerState0254 - integerLocal6) * 256 / 30, 199, rgbSpriteLocal13, 245);
              } else {
                MixedSupport013.performAction0186((byte) -115, (rgbSpriteLocal13.integerState0254 - integerLocal6) * 256 / 30, -256 * integerLocal6 / 30, 199, rgbSpriteLocal13, 245);
              }
            }
          }
          if (MixedSupport013.bitmapFontState0007 != null) {
            objectLocal5 = null;
            integerLocal8 = 0;
            integerLocal14 = integerLocal8;
            while (integerLocal8 < MixedSupport021.rgbSpriteArrayState0008.length) {
              rgbSpriteLocal11 = MixedSupport021.rgbSpriteArrayState0008[integerLocal8];
              if (rgbSpriteLocal11 != null && (365 != rgbSpriteLocal11.integerState0254 ||
                rgbSpriteLocal11.integerState0260 != 139)) {
                if (objectLocal5 != null) {
                  objectLocal5 = (String) (objectLocal5) + ", " + integerLocal8;
                } else {
                  objectLocal5 = Integer.toString(integerLocal8);
                }
              }
              integerLocal8++;
            }
            if (objectLocal5 != null) {
              MixedSupport013.bitmapFontState0007.computeInteger1213("Screenshot(s) " + (String) (objectLocal5) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal15) {
          caughtExceptionLocal1 = caughtParameterLocal15;
          runtimeExceptionLocal2 = caughtExceptionLocal1;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal2), "hc.B(" + integerArgument1 + ')');
        }
    }

    public static void performAction0682(byte byteArgument1) {
        stringState0218 = null;
        integerArrayState0054 = null;
        int integerLocal1 = -68 / ((16 - byteArgument1) / 39);
        stringState0219 = null;
    }

    final static IndexedSprite computeIndexedSprite0684(int integerArgument1, int[] integerArrayArgument2, IndexedSprite indexedSpriteArgument3) {
        IndexedSprite indexedSpriteLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        IndexedSprite stackIndexedSpriteLocal3 = null;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          indexedSpriteLocal1 = new IndexedSprite(0, integerArgument1, 0);
          indexedSpriteLocal1.integerState0425 = indexedSpriteArgument3.integerState0425;
          indexedSpriteLocal1.integerState0426 = indexedSpriteArgument3.integerState0426;
          indexedSpriteLocal1.integerState0422 = indexedSpriteArgument3.integerState0422;
          indexedSpriteLocal1.integerState0423 = indexedSpriteArgument3.integerState0423;
          indexedSpriteLocal1.integerState0428 = indexedSpriteArgument3.integerState0428;
          indexedSpriteLocal1.integerArrayState0183 = integerArrayArgument2;
          indexedSpriteLocal1.integerState0427 = indexedSpriteArgument3.integerState0427;
          indexedSpriteLocal1.byteArrayState0021 = indexedSpriteArgument3.byteArrayState0021;
          stackIndexedSpriteLocal3 = indexedSpriteLocal1;
          return stackIndexedSpriteLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("hc.A(").append(integerArgument1).append(',');
          if (integerArrayArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',');
          if (indexedSpriteArgument3 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(')').toString());
        }
    }

    static {
        doubleState0001 = Math.atan2(1.0, 0.0);
        stringState0218 = "Searching for opponents";
        stringState0219 = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
