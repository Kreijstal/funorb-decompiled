/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jp extends ota {
    final static void loadFinalFrame(ResourceArchive param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        Sprite var2 = new Sprite(param0.getFileByName("final_frame.jpg", (byte) 114, ""), (java.awt.Component) ((Object) nma.field_l));
        if (param1 != 20) {
          return;
        }
        try {
          var3 = var2.field_m;
          var4 = var2.field_q;
          gb.pushRasterState(param1 - 29731);
          bra.field_O = new Sprite(var3, var4 * 3 / 4);
          bra.field_O.makeRasterTarget();
          var2.drawOpaque(0, 0);
          Player.field_W = new Sprite(var3, -bra.field_O.field_q + var4);
          Player.field_W.makeRasterTarget();
          var2.drawOpaque(0, -bra.field_O.field_q);
          Player.field_W.field_p = bra.field_O.field_q;
          pfa.popRasterState(1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "jp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract LegacyOpenGlCubeTexture b(int param0);

    final static void a(boolean param0) {
        if (param0) {
          return;
        }
        pu.clearStatusCookie(di.getApplet(111), 255);
    }

    private jp() throws Throwable {
        throw new Error();
    }

    static {
    }
}
