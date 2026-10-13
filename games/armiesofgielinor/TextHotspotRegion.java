/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRegion extends IntrusiveNode {
    int top;
    int hotspotId;
    static String field_m;
    int left;
    static SpellMenuGroup[] spellMenuById;
    int height;
    TextHotspotRegion nextRegion;
    int width;

    public static void a(int param0) {
        field_m = null;
        if (param0 != 135) {
          spellMenuById = (SpellMenuGroup[]) null;
          spellMenuById = null;
          return;
        }
        spellMenuById = null;
    }

    TextHotspotRegion(int hotspotId, int left, int top, int width, int height) {
        this.height = height;
        this.hotspotId = hotspotId;
        this.top = top;
        this.width = width;
        this.left = left;
    }

    static {
        field_m = "Unable to add name - system busy";
        spellMenuById = new SpellMenuGroup[135];
    }
}
