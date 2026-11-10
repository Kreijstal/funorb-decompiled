/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GlowAreaSupport {
    static Js5Archive field_i;
    static int[] field_g;
    int field_h;
    static int field_f;
    static int field_k;
    static int field_b;
    static Sprite field_e;
    static String[] field_j;
    static int field_a;
    static int field_c;
    static Sprite field_d;

    public static void releaseStatics(byte param0) {
        if (param0 > 4) {
          field_j = null;
          field_i = null;
          field_e = null;
          field_d = null;
          field_g = null;
          return;
        }
        field_i = (Js5Archive) null;
        field_j = null;
        field_i = null;
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final static void drawGlowArea(byte param0, Camera param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (PowerupBar.field_g) {
          return;
        }
        try {
          int var2_int = -124 % ((-64 - param0) / 39);
          var3 = (ClientException.field_a * 5 >> 2) + LoginPayloadKind.field_c;
          var4 = IsaacCipher.field_h + (ValidationState.field_a >> 1);
          var5 = param1.worldToScreenX(LoginPayloadKind.field_c, (byte) -87);
          var6 = param1.worldToScreenY(IsaacCipher.field_h, 0);
          var7 = ArchiveRequest.getPositionalVolume(var6, 82, var5) * 5 >> 2;
          TextLayoutLine.field_c.setVolume(var7);
          Rasterizer.setClip(var5, var6, var5 + ClientException.field_a, var6 + ValidationState.field_a);
          Rasterizer.fillRadialPaletteCircle(param1.worldToScreenX(var3, (byte) -89) << 4, param1.worldToScreenY(var4, 0) << 4, LevelSelectScreen.field_r, UiWidget.field_q, PendingIntArrayRequest.field_p);
          Rasterizer.resetClip();
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "f.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[8192];
        field_k = 1;
        field_c = 5;
        field_a = 9;
    }
}
