/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexBufferObject extends OpenGlBufferObject implements OpenGlVertexBufferBinding {
    static Sprite field_j;
    static IntrusiveDeque field_k;
    static GzipCodec field_h;
    static int field_i;

    public final int getBufferId(boolean param0) {
        if (!param0) {
          return 121;
        }
        return this.bufferId;
    }

    public static void clearSharedReferences(int param0) {
        field_k = null;
        if (param0 < 78) {
          return;
        }
        field_j = null;
        field_h = null;
    }

    OpenGlVertexBufferObject(OpenGlToolkit param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34962, param2, param3, param4);
    }

    final void bind(int param0) {
        this.toolkit.bindVertexBuffer(param0, (OpenGlVertexBufferBinding) (this));
    }

    final static boolean a(byte param0) {
        if (param0 > -33) {
          return false;
        }
        return GpuFractalNoiseVolume.field_p != null ? true : false;
    }

    final static double b(byte param0) {
        if (param0 >= -43) {
          OpenGlVertexBufferObject.a((byte) 83);
          return ServerTickFactory.field_c;
        }
        return ServerTickFactory.field_c;
    }

    static {
        field_k = new IntrusiveDeque();
        field_h = new GzipCodec();
        field_i = 100;
    }
}
