/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vo extends iq {
    private java.awt.Component field_m;

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        boolean discarded$10 = param0.drawImage(((vo) this).field_c, param1, param2, (java.awt.image.ImageObserver) (Object) ((vo) this).field_m);
        if (param3 != -23820) {
            Object var6 = null;
            ((vo) this).a((java.awt.Graphics) null, 50, 82, 44);
        }
    }

    public vo() {
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        Object var8 = null;
        if (param2 != -6980) {
          var8 = null;
          ((vo) this).a(16, 8, -58, (java.awt.Component) null);
          ((vo) this).field_h = new int[param1 * param0 + 1];
          ((vo) this).field_k = param0;
          ((vo) this).field_e = param1;
          var5 = new java.awt.image.DataBufferInt(((vo) this).field_h, ((vo) this).field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((vo) this).field_e, ((vo) this).field_k), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((vo) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((vo) this).field_m = param3;
          ((vo) this).b(15100);
          return;
        } else {
          ((vo) this).field_h = new int[param1 * param0 + 1];
          ((vo) this).field_k = param0;
          ((vo) this).field_e = param1;
          var5 = new java.awt.image.DataBufferInt(((vo) this).field_h, ((vo) this).field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((vo) this).field_e, ((vo) this).field_k), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((vo) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((vo) this).field_m = param3;
          ((vo) this).b(15100);
          return;
        }
    }
}
