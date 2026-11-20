/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexBufferObject extends OpenGlBufferObject implements OpenGlVertexBufferBinding {
    static Sprite field_j;
    static IntrusiveDeque pendingByteIndexedRecordWrites;
    static GzipCodec field_h;
    static int field_i;

    public final int getBufferId(boolean param0) {
        if (!param0) {
          return 121;
        }
        return this.bufferId;
    }

    public static void clearSharedReferences(int param0) {
        pendingByteIndexedRecordWrites = null;
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

    final static boolean isNameEntryDialogOpen(byte param0) {
        if (param0 > -33) {
          return false;
        }
        return GpuFractalNoiseVolume.activeNameEntryDialog != null ? true : false;
    }

    final static double b(byte param0) {
        if (param0 >= -43) {
          OpenGlVertexBufferObject.isNameEntryDialogOpen((byte) 83);
          return ServerTickFactory.outgoingLagStdDevMillis;
        }
        return ServerTickFactory.outgoingLagStdDevMillis;
    }

    static {
        pendingByteIndexedRecordWrites = new IntrusiveDeque();
        field_h = new GzipCodec();
        field_i = 100;
    }
}
