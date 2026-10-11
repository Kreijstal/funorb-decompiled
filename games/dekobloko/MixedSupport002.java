/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport002 {
    static NodeDeque nodeDequeState0001;
    static String stringState0004;
    static IndexedSprite[] indexedSpriteArrayState0001;
    static char characterState0001;
    static String stringState0005;
    static RgbSprite rgbSpriteState0002;

    public static void performAction0027(boolean booleanArgument1) {
        nodeDequeState0001 = null;
        stringState0004 = null;
        if (booleanArgument1) {
          indexedSpriteArrayState0001 = null;
          stringState0005 = null;
          rgbSpriteState0002 = null;
          return;
        }
        MixedSupport002.computeString0026(73);
        indexedSpriteArrayState0001 = null;
        stringState0005 = null;
        rgbSpriteState0002 = null;
    }

    final static String computeString0026(int integerArgument1) {
        if (UiComponentPart022.mixedSupport004State0003 == GameAssets.mixedSupport004State0004) {
          return NetworkArchiveRequestManager.stringState0438;
        }
        if (integerArgument1 >= -25) {
          indexedSpriteArrayState0001 = (IndexedSprite[]) null;
          if (UiComponentPart016.mixedSupport004State0001 == UiComponentPart022.mixedSupport004State0003) {
            return UiComponentPart024.stringState0435;
          }
          if (!ThemeTips.mixedSupport124State0001.computeBoolean1767(92)) {
            return UiComponentPart024.stringState0435;
          }
          return SceneWidgetPart004.stringState0217;
        }
        if (UiComponentPart016.mixedSupport004State0001 == UiComponentPart022.mixedSupport004State0003) {
          return UiComponentPart024.stringState0435;
        }
        if (!ThemeTips.mixedSupport124State0001.computeBoolean1767(92)) {
          return UiComponentPart024.stringState0435;
        }
        return SceneWidgetPart004.stringState0217;
    }

    static {
        stringState0004 = "Type your email address again to make sure it's correct";
        nodeDequeState0001 = new NodeDeque();
        characterState0001 = '/';
        stringState0005 = "You have 1 unread message!";
    }
}
