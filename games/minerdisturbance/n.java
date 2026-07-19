/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class n extends ci {
    private java.awt.Component field_l;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$0 = param2.drawImage(this.field_g, param3, param0, (java.awt.image.ImageObserver) ((Object) this.field_l));
        int var5 = 35 / ((62 - param1) / 50);
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_c = param3;
        this.field_d = param1;
        this.field_f = new int[param1 * param3 + 1];
        if (param2 != 13961) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(this.field_f, this.field_f.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_c, this.field_d), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_g = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_l = param0;
          this.a((byte) -45);
          return;
        }
    }

    public n() {
    }
}
