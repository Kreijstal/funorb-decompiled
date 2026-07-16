/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vf extends pd {
    private java.awt.Component field_i;

    public vf() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((vf) this).field_d = param2;
        ((vf) this).field_a = param3;
        ((vf) this).field_h = new int[param3 * param2 + 1];
        if (param1 != 9387) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(((vf) this).field_h, ((vf) this).field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((vf) this).field_a, ((vf) this).field_d), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((vf) this).field_g = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((vf) this).field_i = param0;
          ((vf) this).a(true);
          return;
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$10 = param3.drawImage(((vf) this).field_g, param0, param2, (java.awt.image.ImageObserver) (Object) ((vf) this).field_i);
        if (param1 != 0) {
            ((vf) this).field_i = null;
        }
    }
}
