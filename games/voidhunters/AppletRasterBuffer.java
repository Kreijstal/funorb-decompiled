/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AppletRasterBuffer {
    int height;
    static int field_f;
    int[] pixels;
    java.awt.Image image;
    static VoidHunters field_a;
    static String field_e;
    static String field_h;
    int width;

    abstract void initialize(int param0, int param1, java.awt.Component param2, byte param3);

    abstract void draw(java.awt.Graphics param0, int param1, byte param2, int param3);

    final void bind(byte param0) {
        SoftwareRasterizer2D.setTarget(this.pixels, this.width, this.height);
        if (param0 != -108) {
          java.awt.Component var3 = (java.awt.Component) null;
          this.initialize(-98, 3, (java.awt.Component) null, (byte) -19);
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 == -23483) {
          field_e = null;
          field_a = null;
          field_h = null;
          return;
        }
        AppletRasterBuffer.clearSharedReferences(83);
        field_e = null;
        field_a = null;
        field_h = null;
    }

    static {
        field_h = "To server list";
        field_e = "Location";
    }
}
