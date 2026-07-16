/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qb extends rc {
    private java.awt.Component field_e;

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$10 = param1.drawImage(((qb) this).field_d, param2, param3, (java.awt.image.ImageObserver) (Object) ((qb) this).field_e);
        if (param0 != -11) {
            ((qb) this).field_e = null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        if (param1 > -37) {
          ((qb) this).field_e = null;
          ((qb) this).field_b = new int[param0 * param3 - -1];
          ((qb) this).field_a = param3;
          ((qb) this).field_c = param0;
          var5 = new java.awt.image.DataBufferInt(((qb) this).field_b, ((qb) this).field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((qb) this).field_c, ((qb) this).field_a), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((qb) this).field_d = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((qb) this).field_e = param2;
          ((qb) this).a(-91);
          return;
        } else {
          ((qb) this).field_b = new int[param0 * param3 - -1];
          ((qb) this).field_a = param3;
          ((qb) this).field_c = param0;
          var5 = new java.awt.image.DataBufferInt(((qb) this).field_b, ((qb) this).field_b.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((qb) this).field_c, ((qb) this).field_a), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((qb) this).field_d = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((qb) this).field_e = param2;
          ((qb) this).a(-91);
          return;
        }
    }

    public qb() {
    }
}
