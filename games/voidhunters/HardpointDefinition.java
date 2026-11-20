/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardpointDefinition {
    int field_c;
    int field_a;
    int field_b;

    final static void closeChatInputDialog(boolean param0) {
        if (!param0) {
          return;
        }
        OpenGlGpuTexture.disposeChatInputDialog((byte) -48);
    }

    HardpointDefinition(int param0, int param1, int param2) {
        this.field_c = param1;
        this.field_b = param0;
        this.field_a = param2;
    }

    static {
    }
}
