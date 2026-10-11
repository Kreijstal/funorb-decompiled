/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport115 {
    static long longState0045;
    static MusicTrack musicTrackState0006;
    static RgbSprite[] rgbSpriteArrayState0024;

    final static boolean computeBoolean1659(int integerArgument1, int integerArgument2, byte byteArgument3, int integerArgument4) {
        int integerLocal1 = -27 % ((-37 - byteArgument3) / 37);
        if (MixedSupport151.booleanState0221) {
          return MixedSupport009.uiComponentPart019State0001.computeBoolean0228(MixedSupport153.integerState0931, ArchiveRequestManager.characterState0002, (byte) 126);
        }
        if (GameDomainSupport004.booleanState0087) {
          return MixedSupport129.computeBoolean1829(integerArgument1, 102, integerArgument4);
        }
        if (MixedSupport023.computeBoolean0370(integerArgument4, integerArgument1, 6774)) {
          return true;
        }
        if (!PacketBuffer.booleanState0228) {
          return SceneWidgetPart008.computeBoolean1288(integerArgument2, 1, integerArgument4);
        }
        return false;
    }

    final static void performAction1657(byte byteArgument1, String stringArgument2) {
        try {
          MixedSupport146.stringState0594 = stringArgument2;
          if (byteArgument1 != 73) {
            rgbSpriteArrayState0024 = (RgbSprite[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "rm.A(" + byteArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void performAction1660(int integerArgument1, RgbSprite[] rgbSpriteArrayArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        integerLocal11 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (rgbSpriteArrayArgument2 != null &&
            integerArgument4 > 0) {
            integerLocal5 = rgbSpriteArrayArgument2[0].integerState0254;
            integerLocal7 = rgbSpriteArrayArgument2[2].integerState0254;
            integerLocal8 = rgbSpriteArrayArgument2[1].integerState0254;
            rgbSpriteArrayArgument2[0].performAction0279(integerArgument3, integerArgument1, integerArgument5);
            rgbSpriteArrayArgument2[2].performAction0279(-integerLocal7 + integerArgument3 + integerArgument4, integerArgument1, integerArgument5);
            SoftwareRaster.performAction0731(MixedSupport073.integerArrayState0123);
            SoftwareRaster.performAction0742(integerLocal5 + integerArgument3, integerArgument1, -integerLocal7 + (integerArgument4 + integerArgument3), rgbSpriteArrayArgument2[1].integerState0260 + integerArgument1);
            integerLocal9 = integerArgument3 + integerLocal5;
            integerLocal10 = integerArgument4 + integerArgument3 - integerLocal7;
            if (integerArgument6 >= -98) {
              rgbSpriteArrayState0024 = (RgbSprite[]) null;
            }
            for (integerArgument3 = integerLocal9; integerArgument3 < integerLocal10; integerArgument3 = integerArgument3 + integerLocal8) {
              rgbSpriteArrayArgument2[1].performAction0279(integerArgument3, integerArgument1, integerArgument5);
            }
            SoftwareRaster.performAction0723(MixedSupport073.integerArrayState0123);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal4 = caughtParameterLocal12;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("rm.B(").append(integerArgument1).append(',');
          if (rgbSpriteArrayArgument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(')').toString());
        }
    }

    public static void performAction1658(int integerArgument1) {
        if (integerArgument1 != 2) {
          longState0045 = 40L;
          rgbSpriteArrayState0024 = null;
          musicTrackState0006 = null;
          return;
        }
        rgbSpriteArrayState0024 = null;
        musicTrackState0006 = null;
    }

    static {
    }
}
