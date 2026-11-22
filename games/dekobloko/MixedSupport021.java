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

    public static void performAction0324(int integerArgument1) {
        integerArrayState0029 = null;
        sceneWidgetState0015 = null;
        sceneWidgetState0016 = null;
        asyncTaskState0001 = null;
        indexedSpriteState0001 = null;
        if (integerArgument1 == 36) {
          rgbSpriteArrayState0008 = null;
          return;
        }
        MixedSupport021.performAction0325(false);
        rgbSpriteArrayState0008 = null;
    }

    final static void performAction0325(boolean booleanArgument1) {
        DualNode dualNodeLocal1 = null;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        DualNode dualNodeLocal3;
        try {
          UiComponentPart018.integerState0502 = 0;
          MixedSupport033.stringState0159 = null;
          MixedSupport029.integerState0182 = 0;
          UiComponentPart025.nodeDequeState0027.performAction1742(111);
          CipherPacketBuffer.nodeDequeState0033.performAction1742(117);
          if (!booleanArgument1) {
            MixedSupport021.performAction0325(true);
          }
          dualNodeLocal1 = MixedSupport081.secondaryNodeHashTableState0003.first(-9443);
          while (dualNodeLocal1 != null) {
            dualNodeLocal1.performAction0134((byte) 105);
            dualNodeLocal1 = MixedSupport081.secondaryNodeHashTableState0003.next(-112);
          }
          dualNodeLocal3 = MixedSupport054.secondaryNodeHashTableState0001.first(-9443);
          while (dualNodeLocal3 != null) {
            dualNodeLocal3.performAction0134((byte) 100);
            dualNodeLocal3 = MixedSupport054.secondaryNodeHashTableState0001.next(104);
          }
          ThemeTips.integerState0351 = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "d.A(" + booleanArgument1 + ')');
        }
    }

    static {
        integerArrayState0029 = new int[8192];
        integerState0124 = 0;
        indexedSpriteState0001 = new IndexedSprite(36, 36, 0);
    }
}
