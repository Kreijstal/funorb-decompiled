/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pm extends og {
    private java.awt.Component field_f;

    public pm() {
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$10 = param3.drawImage(((pm) this).field_d, param2, param0, (java.awt.image.ImageObserver) (Object) ((pm) this).field_f);
        if (param1 != 10) {
            ((pm) this).field_f = null;
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((pm) this).field_e = param2;
        ((pm) this).field_a = param1;
        ((pm) this).field_b = new int[param2 * param1 + 1];
        var5 = new java.awt.image.DataBufferInt(((pm) this).field_b, ((pm) this).field_b.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        if (param0 != 30) {
          return;
        } else {
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((pm) this).field_a, ((pm) this).field_e), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((pm) this).field_d = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((pm) this).field_f = param3;
          ((pm) this).b(32);
          return;
        }
    }
}
