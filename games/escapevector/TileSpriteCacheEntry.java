/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TileSpriteCacheEntry {
    static String field_c;
    int tileX;
    boolean dirty;
    Sprite sprite;
    int tileY;
    static java.awt.Color field_f;
    static int[] field_h;
    static long[] field_d;
    static String field_i;

    TileSpriteCacheEntry(int param0, int param1, int param2, int param3) {
        this.sprite = new Sprite(param0, param1);
        this.tileY = param2;
        this.tileX = param3;
        this.dirty = true;
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        field_h = null;
        if (guard == 64) {
          field_i = null;
          field_f = null;
          field_d = null;
          return;
        }
        TileSpriteCacheEntry.releaseStatics(66);
        field_i = null;
        field_f = null;
        field_d = null;
    }

    static {
        field_c = "Username: ";
        field_h = new int[]{64, 40, 48, 64, 64};
        field_f = new java.awt.Color(10040319);
        field_d = new long[32];
    }
}
