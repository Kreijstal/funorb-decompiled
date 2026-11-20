/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuDataType {
    int byteSize;
    static GpuDataType field_g;
    static GpuDataType field_i;
    static GpuDataType field_c;
    static GpuDataType field_f;
    static GpuDataType field_e;
    static GpuDataType field_a;
    static GpuDataType field_b;
    static GpuDataType field_d;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void clearSharedReferences(int param0) {
        field_i = null;
        field_a = null;
        field_e = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_f = null;
        field_g = null;
        if (param0 < 5) {
          GpuDataType.clearSharedReferences(31);
        }
    }

    private GpuDataType(int param0) {
        this.byteSize = param0;
    }

    static {
        field_g = new GpuDataType(1);
        field_i = new GpuDataType(2);
        field_c = new GpuDataType(4);
        field_f = new GpuDataType(1);
        field_e = new GpuDataType(2);
        field_a = new GpuDataType(4);
        field_b = new GpuDataType(2);
        field_d = new GpuDataType(4);
    }
}
