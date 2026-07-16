/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class di extends wd {
    private java.awt.Component field_l;

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$10 = param3.drawImage(((di) this).field_c, param2, param1, (java.awt.image.ImageObserver) (Object) ((di) this).field_l);
        if (param0 != 10) {
            ((di) this).field_l = null;
        }
    }

    public di() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((di) this).field_j = param3;
        ((di) this).field_h = param2;
        ((di) this).field_g = new int[1 + param3 * param2];
        var5 = new java.awt.image.DataBufferInt(((di) this).field_g, ((di) this).field_g.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((di) this).field_h, ((di) this).field_j), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        if (param1 != 42) {
          ((di) this).field_l = null;
          ((di) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((di) this).field_l = param0;
          ((di) this).a(param1 + -38);
          return;
        } else {
          ((di) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((di) this).field_l = param0;
          ((di) this).a(param1 + -38);
          return;
        }
    }
}
