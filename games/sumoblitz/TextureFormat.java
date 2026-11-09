/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureFormat {
    static int receivedAccountOpcode;
    static int elapsedTicks;
    int componentCount;

    final static RasterIndexedSprite loadIndexedSprite(int fileId, int groupId, ResourceArchive archive, int guard) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RasterIndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!SpriteSheetSupport.decodeSpriteSheet(archive, fileId, groupId, guard ^ 3916)) {
            stackIn_2_0 = null;
            return (RasterIndexedSprite) (stackIn_2_0);
          }
          if (guard != -21834) {
            elapsedTicks = -84;
          }
          stackIn_6_0 = LegacyOpenGlGraphicsHeap.takeDecodedIndexedSprite(guard + 34602);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("iw.A(").append(fileId).append(',').append(groupId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    TextureFormat(int components) {
        this.componentCount = components;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        elapsedTicks = 0;
        receivedAccountOpcode = -1;
    }
}
