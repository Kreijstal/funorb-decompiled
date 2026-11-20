/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuDataType {
    int byteSize;
    static GpuDataType BYTE;
    static GpuDataType SHORT;
    static GpuDataType INT;
    static GpuDataType UNSIGNED_BYTE;
    static GpuDataType UNSIGNED_SHORT;
    static GpuDataType UNSIGNED_INT;
    static GpuDataType HALF_FLOAT;
    static GpuDataType FLOAT;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void clearSharedReferences(int param0) {
        SHORT = null;
        UNSIGNED_INT = null;
        UNSIGNED_SHORT = null;
        FLOAT = null;
        INT = null;
        HALF_FLOAT = null;
        UNSIGNED_BYTE = null;
        BYTE = null;
        if (param0 < 5) {
          GpuDataType.clearSharedReferences(31);
        }
    }

    private GpuDataType(int param0) {
        this.byteSize = param0;
    }

    static {
        BYTE = new GpuDataType(1);
        SHORT = new GpuDataType(2);
        INT = new GpuDataType(4);
        UNSIGNED_BYTE = new GpuDataType(1);
        UNSIGNED_SHORT = new GpuDataType(2);
        UNSIGNED_INT = new GpuDataType(4);
        HALF_FLOAT = new GpuDataType(2);
        FLOAT = new GpuDataType(4);
    }
}
