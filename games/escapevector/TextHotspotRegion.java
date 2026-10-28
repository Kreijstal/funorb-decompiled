/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRegion extends IntrusiveNode {
    TextHotspotRegion nextFragment;
    int x;
    static String[] field_l;
    static int field_h;
    int height;
    int y;
    int width;
    int hotspotId;

    final static IndexedSprite[] loadIndexedSpriteSheet(int fileId, int guard, ResourceArchive archive, int groupId) {
        String stackIn_10_2 = null;
        try {
          if (!ArchivePreloader.loadSpriteSheet(archive, 100, groupId, fileId)) {
            return null;
          }
          if (guard != 255) {
            ResourceArchive var5 = (ResourceArchive) null;
            TextHotspotRegion.loadIndexedSpriteSheet(49, -40, (ResourceArchive) null, 15);
          }
          IndexedSprite[] stackIn_6_0 = SimulatorAssetSupport.buildIndexedSpritesFromSheet(13029);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("bl.A(").append(fileId).append(',').append(guard).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(groupId).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_l = null;
        if (guard != 255) {
          TextHotspotRegion.releaseStatics(125);
        }
    }

    TextHotspotRegion(int param0, int param1, int param2, int param3, int param4) {
        this.x = param1;
        this.y = param2;
        this.width = param3;
        this.hotspotId = param0;
        this.height = param4;
    }

    static {
        field_l = new String[255];
    }
}
