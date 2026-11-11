/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static IntrusiveDeque field_a;
    static String field_c;
    static LoginForm field_b;

    final static void showMessageDialog(int param0, String param1, boolean param2) {
        try {
          S2CProfileUpdatePacket.field_d = param2;
          TileOperator.field_p = true;
          TextureOperator.field_l = new MessageDialog(ej.field_a, ft.field_c, param1, LoadProfileCommand.field_r, S2CProfileUpdatePacket.field_d);
          int var3_int = -94 / ((43 - param0) / 34);
          ej.field_a.pushDialog(TextureOperator.field_l, 104);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "vn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          vn.releaseStatics((byte) 63);
        }
    }

    static {
        field_c = "You need to play <%0> more rated games to unlock this option.";
    }
}
