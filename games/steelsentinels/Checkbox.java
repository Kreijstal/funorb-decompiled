/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Checkbox extends TextButton {
    static int field_Z;
    static RasterBuffer field_bb;
    static int[] field_V;
    static SceneWidget field_Y;
    static RgbSprite field_W;
    static SceneWidget field_ab;
    static RgbSprite[] field_X;

    public static void g(int param0) {
        field_bb = null;
        if (param0 >= 92) {
          field_ab = null;
          field_X = null;
          field_V = null;
          field_Y = null;
          field_W = null;
          return;
        }
        Checkbox.g(-16);
        field_ab = null;
        field_X = null;
        field_V = null;
        field_Y = null;
        field_W = null;
    }

    Checkbox(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_T = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private Checkbox(String param0, WidgetPainter param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.field_p = ad.field_j.field_x;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1, int param2, int param3) {
        this.field_T = !this.field_T ? true : false;
        super.b(param0, (byte) -127, param2, param3);
        if (param1 < -122) {
          return;
        }
        this.b(-25, (byte) 43, -53, 29);
    }

    final static void a(boolean param0) {
        FullscreenFocusCanvas.a(param0);
        RegistrationRequestDialog.a(10, SocketConnector.field_b, SceneWidgetNode.field_y[0].field_z, TextLayout.field_g, ReflectionCheck.field_G, te.field_b);
    }

    private Checkbox(String param0, UiListener param1) {
        this(param0, ad.field_j.field_f, param1);
        try {
          this.field_p = ad.field_j.field_x;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_V = new int[8192];
    }
}
