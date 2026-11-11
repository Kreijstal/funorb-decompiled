/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexBuffer extends OpenGlBuffer implements VertexBuffer {
    private una field_l;

    public final void allocate(int param0, int param1) {
        int var3 = -28 / ((param0 + 30) / 36);
        super.allocate(69, this.field_l.field_e * param1);
    }

    public final void close(int param0) {
        super.close(param0);
    }

    public final boolean unmap(byte param0) {
        int var2 = -26 % ((54 - param0) / 41);
        return super.unmap(this.field_h.field_Qc, 99);
    }

    public final una getFormat(int param0) {
        if (param0 != -32491) {
          this.unmap((byte) -127);
          return this.field_l;
        }
        return this.field_l;
    }

    public final jaclib.memory.Buffer map(boolean param0, byte param1) {
        if (param1 < -9) {
          return super.mapWith(this.field_h.field_Qc, param0, 1);
        }
        this.unmap((byte) 69);
        return super.mapWith(this.field_h.field_Qc, param0, 1);
    }

    OpenGlVertexBuffer(HardwareOpenGlToolkit param0, una param1, boolean param2) {
        super(param0, 34963, param2);
        try {
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
