/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspot extends IntrusiveNode {
    int field_g;
    TextHotspot field_k;
    int field_l;
    int field_h;
    int field_i;
    static ToolkitSprite[] field_f;
    int field_j;

    public static void releaseStatics(int param0) {
        if (param0 != 717) {
          field_f = (ToolkitSprite[]) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    TextHotspot(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param3;
        this.field_h = param0;
        this.field_i = param4;
        this.field_g = param1;
        this.field_l = param2;
    }

    static {
    }
}
