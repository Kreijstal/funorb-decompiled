/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mb extends mm {
    private java.awt.Component field_i;

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_h = new int[param0 * param1 + 1];
        this.field_c = param1;
        this.field_f = param0;
        if (param3 != 0) {
          this.field_i = (java.awt.Component) null;
          var5 = new java.awt.image.DataBufferInt(this.field_h, this.field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_f, this.field_c), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param2;
          this.a(false);
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(this.field_h, this.field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_f, this.field_c), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_b = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_i = param2;
          this.a(false);
          return;
        }
    }

    public mb() {
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        java.awt.Component var6 = null;
        if (param3 != 34) {
          var6 = (java.awt.Component) null;
          this.a(40, 118, (java.awt.Component) null, -42);
          discarded$4 = param2.drawImage(this.field_b, param1, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        } else {
          discarded$5 = param2.drawImage(this.field_b, param1, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        }
    }
}
