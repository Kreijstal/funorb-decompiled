/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlInterleavedVertexBuffer {
    static TextureTransformMode field_a;
    private OpenGlVertexBufferBinding vertexBuffer;

    final void initialize(int param0, OpenGlToolkit param1) {
        OpenGlVertexAttribute discarded$0 = null;
        OpenGlVertexAttribute discarded$1 = null;
        OpenGlVertexAttribute discarded$2 = null;
        try {
          this.vertexBuffer = param1.createVertexBuffer((byte[]) null, 24, 196584, true, (byte) 125);
          discarded$0 = new OpenGlVertexAttribute(this.vertexBuffer, 5126, 2, 0);
          discarded$1 = new OpenGlVertexAttribute(this.vertexBuffer, 5126, 3, param0);
          discarded$2 = new OpenGlVertexAttribute(this.vertexBuffer, 5121, 4, 20);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    OpenGlInterleavedVertexBuffer() {
        FloatPacketBuffer discarded$0 = new FloatPacketBuffer(786336);
        SetMutatorVotes.bitLength(1600, -61);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -26) {
          OpenGlInterleavedVertexBuffer.clearSharedReferences((byte) 123);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = new TextureTransformMode();
    }
}
