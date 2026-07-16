/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kd extends vn {
    private java.awt.Component field_j;

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((kd) this).field_h = param3;
        ((kd) this).field_d = param1;
        ((kd) this).field_i = new int[param3 * param1 - -1];
        var5 = new java.awt.image.DataBufferInt(((kd) this).field_i, ((kd) this).field_i.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((kd) this).field_d, ((kd) this).field_h), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((kd) this).field_f = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        ((kd) this).field_j = param2;
        if (param0 != 1018) {
          return;
        } else {
          ((kd) this).a(108);
          return;
        }
    }

    public kd() {
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$10 = param3.drawImage(((kd) this).field_f, param0, param2, (java.awt.image.ImageObserver) (Object) ((kd) this).field_j);
        if (param1 != 0) {
            ((kd) this).field_j = null;
        }
    }
}
