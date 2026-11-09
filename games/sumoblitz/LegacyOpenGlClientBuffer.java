/*
 * Decompiled by CFR-JS 0.4.0.
 */
class LegacyOpenGlClientBuffer {
    private LegacyOpenGlGraphicsToolkit toolkit;
    private jaclib.memory.Buffer buffer;

    LegacyOpenGlClientBuffer(LegacyOpenGlGraphicsToolkit renderer, byte[] initialData, int byteLength) {
        this.toolkit = renderer;
        this.buffer = (jaclib.memory.Buffer) ((Object) this.toolkit.field_pb.a(byteLength, false));
        if (initialData != null) {
          this.buffer.a(initialData, 0, 0, byteLength);
        }
    }
}
