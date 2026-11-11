/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareDepthBuffer implements RenderBuffer {
    static IndexedSprite[] field_e;
    int field_d;
    static UiComponent field_c;
    static int[] field_a;
    static int field_g;
    int field_b;
    static int field_f;
    float[] field_h;

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
          field_g = -90;
          field_e = null;
          return;
        }
        field_e = null;
    }

    SoftwareDepthBuffer(int param0, int param1) {
        this.field_d = param0;
        this.field_b = param1;
        this.field_h = new float[param0 * param1];
    }

    static {
        field_a = new int[2];
        field_f = 0;
    }
}
