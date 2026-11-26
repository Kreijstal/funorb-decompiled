/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class AwtRasterBuffer {
    static String field_e;
    int field_f;
    int[] field_g;
    int field_b;
    static java.awt.Canvas field_h;
    static od field_d;
    static String field_c;
    java.awt.Image field_a;

    abstract void initialize(byte param0, java.awt.Component param1, int param2, int param3);

    abstract void drawImage(int param0, boolean param1, java.awt.Graphics param2, int param3);

    final void setAsRasterTarget(boolean param0) {
        if (param0) {
          SoftwareRasterizer.setRasterBuffer(this.field_g, this.field_b, this.field_f);
          return;
        }
        field_h = (java.awt.Canvas) null;
        SoftwareRasterizer.setRasterBuffer(this.field_g, this.field_b, this.field_f);
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        if (param3 < 26) {
          return;
        }
        vd.a(param1, 0, -14561, 0, param0, param2);
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != -9431) {
          return;
        }
        field_h = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    static {
        field_e = "Dragons of Renown";
        field_c = "Raider snuck past guardian and disarmed it.";
        field_d = new od();
    }
}
