/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NineSliceFrame {
    static String rule20;
    static int field_e;
    static int field_f;
    static Sprite field_d;
    static boolean field_c;
    static UiComponent field_a;
    static boolean field_b;
    private Sprite[] field_h;

    final static void a(byte param0) {
        if (param0 != 41) {
          return;
        }
        HotspotRectangle.a(true, LoginPayload.field_d, -104, SocialListEntry.field_Rb);
        PolarBallSkin.field_q = true;
    }

    final void draw(int param0, int param1, int param2, int param3, int param4) {
        LogoMaterial.drawNineSlice(this.field_h, (byte) -72, param0, param3, param1, param4);
        if (param2 != -6316) {
          NineSliceFrame.a((byte) -25);
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          NineSliceFrame.releaseStatics(true);
          field_a = null;
          rule20 = null;
          field_d = null;
          return;
        }
        field_a = null;
        rule20 = null;
        field_d = null;
    }

    NineSliceFrame(Sprite[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        rule20 = "Asking for or providing contact information";
    }
}
