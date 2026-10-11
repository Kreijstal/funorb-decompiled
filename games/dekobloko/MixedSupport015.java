/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport015 {
    static String stringState0071;
    static IndexedSprite[][] indexedSpriteArrayArrayState0001;
    static int[] integerArrayState0020;
    static String stringState0072;
    static String stringState0073;
    static int integerState0100;
    private RgbSprite[] rgbSpriteArrayState0004;
    static String stringState0074;

    final static MixedSupport033 computeMixedSupport0330219(int integerArgument1, byte byteArgument2) {
        MixedSupport033 mixedSupport033Local1 = new MixedSupport033();
        AudioSupport004.nodeDequeState0028.performAction1963(mixedSupport033Local1, 2777);
        MixedSupport050.performAction0659(integerArgument1, 65);
        if (byteArgument2 <= -81) {
          return mixedSupport033Local1;
        }
        integerState0100 = 118;
        return mixedSupport033Local1;
    }

    public static void performAction0217(byte byteArgument1) {
        stringState0071 = null;
        stringState0072 = null;
        integerArrayState0020 = null;
        stringState0074 = null;
        stringState0073 = null;
        if (byteArgument1 == -94) {
          indexedSpriteArrayArrayState0001 = (IndexedSprite[][]) null;
          return;
        }
        stringState0071 = (String) null;
        indexedSpriteArrayArrayState0001 = (IndexedSprite[][]) null;
    }

    final static void performAction0218(int integerArgument1) {
        MixedSupport071.sceneWidgetPart001State0001 = new SceneWidgetPart001(MusicTrack.sceneWidgetState0127, MixedSupport127.sceneWidgetState0119, UiComponentPart014.sceneWidgetState0053, MixedSupport132.sceneWidgetState0125, InputAdapter002.sceneWidgetPart003State0001, UiComponentPart007.sceneWidgetState0019);
        if (integerArgument1 != 8) {
          MixedSupport015.performAction0217((byte) 88);
        }
    }

    MixedSupport015(RgbSprite[] rgbSpriteArrayArgument1) {
        try {
          this.rgbSpriteArrayState0004 = rgbSpriteArrayArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "cc.<init>(" + (rgbSpriteArrayArgument1 != null ? "{...}" : "null") + ')');
        }
    }

    final void performAction0220(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = -29 / ((integerArgument2 + 69) / 54);
        GameplayControls.performAction1978(integerArgument5, (byte) 50, this.rgbSpriteArrayState0004, integerArgument1, integerArgument4, integerArgument3);
    }

    static {
        stringState0071 = "Score: ";
        indexedSpriteArrayArrayState0001 = new IndexedSprite[8][];
        stringState0072 = "Colourful pieces are falling from the sky!";
        stringState0073 = "Staff impersonation";
        stringState0074 = "More suggestions";
    }
}
