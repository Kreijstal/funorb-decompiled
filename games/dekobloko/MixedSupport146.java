/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport146 {
    static String stringState0593;
    static SceneWidgetPart004 sceneWidgetPart004State0001;
    static int integerState0855;
    static String[] stringArrayState0054;
    static int integerState0856;
    static int integerState0857;
    static String stringState0594;
    static PcmStreamMixer pcmStreamMixerState0005;

    final static boolean computeBoolean1951(byte byteArgument1) {
        long longLocal1;
        long longLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        if (byteArgument1 <= 50) {
          return false;
        }
        longLocal1 = MixedSupport063.computeLong0827(4);
        longLocal2 = -MouseInput.longState0054 + longLocal1;
        if (longLocal2 > 30000L) {
          MixedSupport004.integerState0030 = 0;
          MouseInput.longState0054 = longLocal1;
          return true;
        }
        integerLocal3 = 3000;
        if (MixedSupport004.integerState0030 >= 7) {
          integerLocal3 = 12000;
        } else {
          if (MixedSupport004.integerState0030 >= 5) {
            integerLocal3 = 9000;
          } else {
            if (MixedSupport004.integerState0030 >= 3) {
              integerLocal3 = 6000;
            }
          }
        }
        if ((long)integerLocal3 >= longLocal2) {
          return false;
        }
        MouseInput.longState0054 = longLocal1;
        MixedSupport004.integerState0030 = MixedSupport004.integerState0030 + 1;
        return true;
    }

    final static MixedSupport001 computeMixedSupport0011952(int integerArgument1) {
        if (integerArgument1 == 1424) {
          if (null == NetworkSupport012.mixedSupport001State0001) {
            NetworkSupport012.mixedSupport001State0001 = new MixedSupport001(MixedSupport011.bitmapFontState0006, 20, 0, 0, 0, 11579568, -1, 0, 0, MixedSupport011.bitmapFontState0006.integerState0518, -1, 2147483647, true);
          }
          return NetworkSupport012.mixedSupport001State0001;
        }
        return (MixedSupport001) null;
    }

    public static void performAction1954(boolean booleanArgument1) {
        sceneWidgetPart004State0001 = null;
        stringArrayState0054 = null;
        pcmStreamMixerState0005 = null;
        stringState0594 = null;
        stringState0593 = null;
        if (!booleanArgument1) {
          pcmStreamMixerState0005 = (PcmStreamMixer) null;
        }
    }

    final static int computeInteger1953(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (!(SoftwareRaster.integerState0285 < integerArgument3 + integerArgument4)) {
          return integerArgument4;
        }
        if (-integerArgument3 + integerArgument4 + integerArgument1 >= 0) {
          return integerArgument1 + integerArgument4 - integerArgument3;
        }
        if (integerArgument2 == -18265) {
          return SoftwareRaster.integerState0285 - integerArgument3;
        }
        MixedSupport146.computeInteger1953(-78, -105, 117, -8);
        return SoftwareRaster.integerState0285 - integerArgument3;
    }

    static {
        stringState0593 = "Asking for or providing contact information";
        integerState0855 = 15;
        integerState0857 = 0;
        stringArrayState0054 = new String[]{"By rating", "By win percentage"};
    }
}
