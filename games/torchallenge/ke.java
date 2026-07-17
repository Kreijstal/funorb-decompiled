/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke extends oe {
    private java.awt.Component field_k;

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((ke) this).field_i = param0;
        ((ke) this).field_h = param2;
        ((ke) this).field_c = new int[param2 * param0 - -1];
        if (param3 != -23435) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(((ke) this).field_c, ((ke) this).field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ke) this).field_i, ((ke) this).field_h), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((ke) this).field_e = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((ke) this).field_k = param1;
          ((ke) this).a(param3 + 23559);
          return;
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$10 = param3.drawImage(((ke) this).field_e, param1, param2, (java.awt.image.ImageObserver) (Object) ((ke) this).field_k);
        if (param0 != -19275) {
            Object var6 = null;
            ((ke) this).a(-68, (java.awt.Component) null, -73, -31);
        }
    }

    public ke() {
    }
}
