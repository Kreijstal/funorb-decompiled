/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterCacheSurface extends IntrusiveNode {
    private int cacheKeyOne;
    int height;
    static RgbSprite volcanicNearSprite;
    int width;
    static String field_o;
    static String field_l;
    private int cacheKeyTwo;
    RgbSprite sprite;
    static int[] horizontalFrameClipScratch;

    final boolean matchesCacheKeys(byte obfuscationGuard, int cacheKeyOne, int cacheKeyTwo) {
        if (obfuscationGuard != -84) {
          volcanicNearSprite = (RgbSprite) null;
          if (cacheKeyTwo != this.cacheKeyTwo) {
            return false;
          }
          if (this.cacheKeyOne == cacheKeyOne) {
            return true;
          }
          return false;
        }
        if (cacheKeyTwo != this.cacheKeyTwo) {
          return false;
        }
        if (this.cacheKeyOne == cacheKeyOne) {
          return true;
        }
        return false;
    }

    public static void a(byte param0) {
        field_o = null;
        horizontalFrameClipScratch = null;
        field_l = null;
        if (param0 < 22) {
          field_l = (String) null;
          volcanicNearSprite = null;
          return;
        }
        volcanicNearSprite = null;
    }

    final void setCacheKeys(int cacheKeyTwo, int cacheKeyOne, byte obfuscationGuard) {
        if (obfuscationGuard == 78) {
          this.cacheKeyOne = cacheKeyOne;
          this.cacheKeyTwo = cacheKeyTwo;
          return;
        }
        RasterCacheSurface.a(13, -48);
        this.cacheKeyOne = cacheKeyOne;
        this.cacheKeyTwo = cacheKeyTwo;
    }

    final static String a(int param0, int param1) {
        if (param1 == 4) {
          return 1 + param0 + "/" + TextChoiceDialogStyles.field_b.length;
        }
        return (String) null;
    }

    RasterCacheSurface(int width, int height) {
        this.width = width;
        this.height = height;
        this.sprite = new RgbSprite(this.width, this.height);
        this.setCacheKeys(-2, -2, (byte) 78);
    }

    static {
        field_o = "Reject <%0> from this game";
        horizontalFrameClipScratch = new int[4];
        field_l = "Solicitation";
    }
}
