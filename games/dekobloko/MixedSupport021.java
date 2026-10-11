/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport021 {
    static RgbSprite[] rgbSpriteArrayState0008;
    static SceneWidget sceneWidgetState0015;
    static int integerState0123;
    static AsyncTask asyncTaskState0001;
    static SceneWidget sceneWidgetState0016;
    static int[] integerArrayState0029;
    static IndexedSprite indexedSpriteState0001;
    static int integerState0124;

    public static void performAction0353(int integerArgument1) {
        integerArrayState0029 = null;
        sceneWidgetState0015 = null;
        sceneWidgetState0016 = null;
        asyncTaskState0001 = null;
        indexedSpriteState0001 = null;
        if (integerArgument1 == 36) {
          rgbSpriteArrayState0008 = null;
          return;
        }
        MixedSupport021.performAction0354(false);
        rgbSpriteArrayState0008 = null;
    }

    final static void performAction0354(boolean booleanArgument1) {
        DualNode dualNodeLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        DualNode dualNodeLocal3;
        try {
          UiComponentPart018.integerState0502 = 0;
          MixedSupport033.stringState0159 = null;
          MixedSupport029.integerState0182 = 0;
          UiComponentPart025.nodeDequeState0027.performAction1971(111);
          CipherPacketBuffer.nodeDequeState0033.performAction1971(117);
          if (!booleanArgument1) {
            MixedSupport021.performAction0354(true);
          }
          dualNodeLocal1 = MixedSupport085.collectionSupport003State0003.computeDualNode1285(-9443);
          while (dualNodeLocal1 != null) {
            dualNodeLocal1.performAction0145((byte) 105);
            dualNodeLocal1 = MixedSupport085.collectionSupport003State0003.computeDualNode1284(-112);
          }
          dualNodeLocal3 = MixedSupport054.collectionSupport003State0001.computeDualNode1285(-9443);
          while (dualNodeLocal3 != null) {
            dualNodeLocal3.performAction0145((byte) 100);
            dualNodeLocal3 = MixedSupport054.collectionSupport003State0001.computeDualNode1284(104);
          }
          ThemeTips.integerState0351 = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "d.A(" + booleanArgument1 + ')');
        }
    }

    static {
        integerArrayState0029 = new int[8192];
        integerState0124 = 0;
        indexedSpriteState0001 = new IndexedSprite(36, 36, 0);
    }
}
