/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int[] field_c;
    static int field_b;
    static String field_a;

    public static void clearStaticReferences(byte param0) {
        field_c = null;
        if (param0 <= 117) {
          return;
        }
        field_a = null;
    }

    final static void a(Archive param0, byte param1) {
        Sprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new Sprite(param0.getFileByName("final_frame.jpg", "", -21653), (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_G));
          var3 = var2.field_r;
          var4 = var2.field_t;
          ja.c((byte) 88);
          hd.field_l = new Sprite(var3, var4 * 3 / 4);
          hd.field_l.bindAsRenderTarget();
          var2.drawOpaque(0, 0);
          ValidatedTextField.field_Y = new Sprite(var3, var4 - hd.field_l.field_t);
          ValidatedTextField.field_Y.bindAsRenderTarget();
          int var5 = -112 % ((param1 + 32) / 48);
          var2.drawOpaque(0, -hd.field_l.field_t);
          ValidatedTextField.field_Y.field_v = hd.field_l.field_t;
          MessageKeys.a(false);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "ik.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = new int[12];
        field_a = "Log in";
    }
}
