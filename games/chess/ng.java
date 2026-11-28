/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static di field_c;
    static RgbSprite field_b;
    static String field_d;
    static String field_a;

    final static void a(int param0, boolean param1, long param2, int param3, String param4, int param5) {
        int var7_int = 0;
        try {
          EditableTextField.field_U.writeCipheredByte(param0, -60);
          if (param5 < 23) {
            field_d = (String) null;
          }
          EditableTextField.field_U.position = EditableTextField.field_U.position + 1;
          var7_int = EditableTextField.field_U.position;
          EditableTextField.field_U.writeLong(-107, param2);
          EditableTextField.field_U.writeString(-110, param4);
          EditableTextField.field_U.writeByte(param3, (byte) -126);
          EditableTextField.field_U.writeByte(param1 ? 1 : 0, (byte) -95);
          EditableTextField.field_U.backpatchByteLength(EditableTextField.field_U.position - var7_int, -1);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ng.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        int var1 = 24 / ((param0 + 36) / 45);
        field_c = null;
    }

    static {
        field_d = "Player names can be up to 12 letters, numbers and underscores";
        field_a = "<%0> has entered another game.";
    }
}
