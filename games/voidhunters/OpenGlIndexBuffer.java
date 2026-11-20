/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlIndexBuffer extends OpenGlGpuBuffer implements GpuIndexBuffer {
    private GpuDataType dataType;
    static int field_j;
    static int field_k;

    OpenGlIndexBuffer(OpenGlGpuToolkit param0, GpuDataType param1, boolean param2) {
        super(param0, 34963, param2);
        try {
          this.dataType = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void allocate(int param0, int param1) {
        super.allocate(param0, param1 * this.dataType.byteSize);
    }

    public final boolean unlock(int param0) {
        int var2 = 10 / ((param0 - 13) / 37);
        return super.unlockBuffer((byte) -81, this.toolkit.field_Sc);
    }

    public final void release(int param0) {
        if (param0 >= -84) {
          return;
        }
        super.release(-119);
    }

    final static boolean a(int param0, int param1, boolean param2) {
        if (param2) {
          return false;
        }
        return 0 != (param1 & 2048) ? true : false;
    }

    public final jaclib.memory.Buffer lock(byte param0, boolean param1) {
        if (param0 <= -23) {
          return super.lockBuffer(false, param1, this.toolkit.field_Sc);
        }
        field_k = 77;
        return super.lockBuffer(false, param1, this.toolkit.field_Sc);
    }

    static {
        field_j = 100;
    }
}
