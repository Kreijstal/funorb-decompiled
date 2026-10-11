/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport040 {
    static boolean booleanState0046;
    static String stringState0177;
    static String stringState0178;
    static SceneWidget sceneWidgetState0031;
    static SceneWidget sceneWidgetState0032;
    static RgbSprite[] rgbSpriteArrayState0011;
    static String stringState0179;
    static RawSound rawSoundState0008;
    static String stringState0180;
    static String stringState0181;
    static boolean booleanState0047;

    final static void performAction0587(int integerArgument1, byte byteArgument2, RawSound rawSoundArgument3) {
        try {
          UiComponentPart001.performAction0063(103, 0, rawSoundArgument3, 128, integerArgument1);
          if (byteArgument2 != -89) {
            booleanState0046 = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "fj.A(" + integerArgument1 + ',' + byteArgument2 + ',' + (rawSoundArgument3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction0586(int integerArgument1) {
        stringState0181 = null;
        sceneWidgetState0032 = null;
        if (integerArgument1 == 25988) {
          stringState0179 = null;
          rgbSpriteArrayState0011 = null;
          stringState0177 = null;
          stringState0178 = null;
          rawSoundState0008 = null;
          stringState0180 = null;
          sceneWidgetState0031 = null;
          return;
        }
        MixedSupport040.performAction0586(-61);
        stringState0179 = null;
        rgbSpriteArrayState0011 = null;
        stringState0177 = null;
        stringState0178 = null;
        rawSoundState0008 = null;
        stringState0180 = null;
        sceneWidgetState0031 = null;
    }

    final static void performAction0588(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        PlatformSupport002.rgbSpriteState0013.performAction0313(integerArgument1, integerArgument4, integerArgument2);
        GameDomainSupport004.rgbSpriteState0024.performAction0313(integerArgument1 + 35, integerArgument4, integerArgument2);
        MixedSupport121.rgbSpriteState0056.performAction0313(integerArgument1 + 605, integerArgument4, integerArgument2);
        MixedSupport042.rgbSpriteState0016.performAction0313(integerArgument1, integerArgument4 + 35, integerArgument2);
        MixedSupport155.rgbSpriteState0076.performAction0313(integerArgument1 + 605, integerArgument4 + 35, integerArgument2);
        if (integerArgument3 <= -7) {
          MixedSupport145.rgbSpriteState0064.performAction0313(integerArgument1, 445 + integerArgument4, integerArgument2);
          MixedSupport105.rgbSpriteState0041.performAction0313(integerArgument1 + 35, integerArgument4 + 445, integerArgument2);
          MixedSupport151.rgbSpriteState0071.performAction0313(integerArgument1 + 605, integerArgument4 + 445, integerArgument2);
          return;
        }
    }

    static {
        stringState0181 = "Withdraw request to join <%0>'s game";
        booleanState0046 = false;
        stringState0179 = "Music: ";
        stringState0180 = "Enter name of friend to delete from list";
        stringState0178 = "Try again";
        stringState0177 = "The '<%0>' setting needs to be changed.";
    }
}
