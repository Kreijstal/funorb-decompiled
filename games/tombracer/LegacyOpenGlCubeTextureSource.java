/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyOpenGlCubeTextureSource extends CubeTextureSourceBase {
    final static void loadFinalFrame(ResourceArchive param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        Sprite var2 = new Sprite(param0.getFileByName("final_frame.jpg", (byte) 114, ""), (java.awt.Component) ((Object) CurveShape.field_l));
        if (param1 != 20) {
          return;
        }
        try {
          var3 = var2.field_m;
          var4 = var2.field_q;
          gb.pushRasterState(param1 - 29731);
          FullscreenMembershipDialog.field_O = new Sprite(var3, var4 * 3 / 4);
          FullscreenMembershipDialog.field_O.makeRasterTarget();
          var2.drawOpaque(0, 0);
          Player.field_W = new Sprite(var3, -FullscreenMembershipDialog.field_O.field_q + var4);
          Player.field_W.makeRasterTarget();
          var2.drawOpaque(0, -FullscreenMembershipDialog.field_O.field_q);
          Player.field_W.field_p = FullscreenMembershipDialog.field_O.field_q;
          CourseMapWalker.popRasterState(1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "jp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract LegacyOpenGlCubeTexture getCubeTexture(int param0);

    final static void clearStatusCookie(boolean param0) {
        if (param0) {
          return;
        }
        EmptyWidgetPainter.clearStatusCookie(ToolkitSelector.getApplet(111), 255);
    }

    private LegacyOpenGlCubeTextureSource() throws Throwable {
        throw new Error();
    }

    static {
    }
}
