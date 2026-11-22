/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ClientMemoryBuffer {
    private OpenGlToolkit toolkit;
    jaclib.memory.Buffer buffer;

    final void setData(byte[] param0, int param1) {
        if (this.buffer == null ||
          this.buffer.getSize() < param1) {
          this.buffer = (jaclib.memory.Buffer) ((Object) this.toolkit.field_md.createBuffer(param1, false));
        }
        this.buffer.putBytes(param0, 0, 0, param1);
    }

    ClientMemoryBuffer(OpenGlToolkit param0, byte[] param1, int param2) {
        this.toolkit = param0;
        this.buffer = (jaclib.memory.Buffer) ((Object) this.toolkit.field_md.createBuffer(param2, false));
        if (param1 != null) {
          this.buffer.putBytes(param1, 0, 0, param2);
        }
    }
}
