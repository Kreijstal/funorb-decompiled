/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuDataType {
    int bytesPerComponent;
    static GpuDataType BYTE;
    static GpuDataType SHORT;
    static GpuDataType INT;
    static GpuDataType UNSIGNED_BYTE;
    static GpuDataType UNSIGNED_SHORT;
    static GpuDataType UNSIGNED_INT;
    static GpuDataType HALF_FLOAT;
    static GpuDataType FLOAT;
    static SecondaryNodeHashTable field_b;
    static float[] field_a;

    final static void a(int param0, PcmSampleStream param1) {
        try {
          sj.field_c.removeSubstream(param1);
          if (param0 < 93) {
            GpuDataType.releaseStatics(-28);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "io.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private GpuDataType(int byteWidth) {
        this.bytesPerComponent = byteWidth;
    }

    public static void releaseStatics(int param0) {
        BYTE = null;
        UNSIGNED_BYTE = null;
        field_b = null;
        INT = null;
        if (param0 == 0) {
          UNSIGNED_INT = null;
          SHORT = null;
          HALF_FLOAT = null;
          FLOAT = null;
          field_a = null;
          UNSIGNED_SHORT = null;
          return;
        }
        GpuDataType.releaseStatics(41);
        UNSIGNED_INT = null;
        SHORT = null;
        HALF_FLOAT = null;
        FLOAT = null;
        field_a = null;
        UNSIGNED_SHORT = null;
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
        field_a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
