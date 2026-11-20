/*
 * Decompiled by CFR-JS 0.4.0.
 */
class OpenGlClientBuffer {
    private jaclib.memory.Buffer storage;
    private OpenGlToolkit toolkit;

    OpenGlClientBuffer(OpenGlToolkit param0, byte[] param1, int param2) {
        this.toolkit = param0;
        this.storage = (jaclib.memory.Buffer) ((Object) this.toolkit.field_Kb.allocate(param2, false));
        if (param1 != null) {
          this.storage.writeBytes(param1, 0, 0, param2);
        }
    }
}
