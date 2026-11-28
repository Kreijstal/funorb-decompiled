/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static Sprite[] field_b;
    static int[] field_a;

    final static void a(byte param0, PacketBuffer param1) {
        NanoFrameTimer.field_i = param1.readUnsignedShort(31) << 5;
        int var2_int = param1.readUnsignedByte(255);
        NanoFrameTimer.field_i = NanoFrameTimer.field_i + (var2_int >> 3);
        FullscreenStatusDialog.field_S = (7 & var2_int) << 18;
        FullscreenStatusDialog.field_S = FullscreenStatusDialog.field_S + (param1.readUnsignedShort(-105) << 2);
        var2_int = param1.readUnsignedByte(255);
        FullscreenStatusDialog.field_S = FullscreenStatusDialog.field_S + (var2_int >> 6);
        EditableTextField.field_P = var2_int << 15 & 2064384;
        EditableTextField.field_P = EditableTextField.field_P + (param1.readUnsignedByte(255) << 7);
        var2_int = param1.readUnsignedByte(255);
        if (param0 <= 51) {
          return;
        }
        try {
          fh.field_a = var2_int << 16 & 65536;
          EditableTextField.field_P = EditableTextField.field_P + (var2_int >> 1);
          fh.field_a = fh.field_a + param1.readUnsignedShort(40);
        } catch (RuntimeException runtimeException) {
          throw fc.wrapClientException((Throwable) ((Object) runtimeException), "eh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 58) {
          field_a = (int[]) null;
        }
    }

    static {
    }
}
