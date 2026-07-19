/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class em extends lk {
    private java.awt.Component field_j;

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_d = param3;
        this.field_e = new int[param3 * param2 + 1];
        this.field_i = param2;
        var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_i, this.field_d), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.field_j = param0;
        if (param1 != -3) {
          return;
        } else {
          this.a(-125);
          return;
        }
    }

    public em() {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        if (param2 != 15698) {
            return;
        }
        boolean discarded$0 = param0.drawImage(this.field_b, param3, param1, (java.awt.image.ImageObserver) ((Object) this.field_j));
    }
}
