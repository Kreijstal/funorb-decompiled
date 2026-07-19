/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rk extends ov {
    private java.awt.Component field_j;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param0 >= -47) {
            return;
        }
        boolean discarded$0 = param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) ((Object) this.field_j));
    }

    public rk() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_c = new int[1 + param1 * param2];
        this.field_b = param1;
        this.field_h = param2;
        if (param3 >= -97) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(this.field_c, this.field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_h, this.field_b), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_f = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_j = param0;
          this.a(-1);
          return;
        }
    }
}
