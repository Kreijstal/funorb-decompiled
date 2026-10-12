/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchUsage extends IntrusiveNode {
    static RgbSprite[] manaStarSprites;
    static ResourceArchive backgroundArchive;
    byte[] notes;
    static ClientUiComponent gameOptionsGrid;

    public static void releaseUiReferences(int obfuscationGuard) {
        backgroundArchive = null;
        gameOptionsGrid = null;
        manaStarSprites = null;
        if (obfuscationGuard >= -64) {
          MusicPatchUsage.releaseUiReferences(-103);
        }
    }

    MusicPatchUsage(byte[] notes) {
        try {
          this.notes = notes;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vc.<init>(" + (notes != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
