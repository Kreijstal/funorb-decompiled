/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qja extends IntrusiveNode {
    int field_g;
    static String field_i;
    int field_h;
    static String field_k;
    static AnimationSequence[] field_f;
    static UiComponent field_j;

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 <= -37) {
          field_j = null;
          field_i = null;
          field_k = null;
          return;
        }
        qja.a(true, true, -119);
        field_j = null;
        field_i = null;
        field_k = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param0) {
          SoftwareRasterizer.clear();
          if (param2 <= -121) {
            TileGrid.a(param0, (byte) 106);
            return;
          }
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
        if (param2 <= -121) {
          TileGrid.a(param0, (byte) 106);
          return;
        }
    }

    qja(int param0, int param1) {
        this.field_g = param1;
        this.field_h = param0;
    }

    static {
        field_i = "Achievements";
        field_k = "HOLD <img=8><img=9> TO DRAG OBJECTS";
    }
}
