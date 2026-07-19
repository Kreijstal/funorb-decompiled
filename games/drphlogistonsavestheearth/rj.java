/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends na {
    private java.awt.Component field_i;

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (param3 != 255) {
          this.field_i = (java.awt.Component) null;
          discarded$4 = param0.drawImage(this.field_h, param1, param2, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        } else {
          discarded$5 = param0.drawImage(this.field_h, param1, param2, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        }
    }

    public rj() {
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_e = new int[param1 * param0 - -1];
        this.field_f = param0;
        this.field_g = param1;
        var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_f, this.field_g), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_h = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.field_i = param3;
        if (param2 >= -22) {
          this.field_i = (java.awt.Component) null;
          this.a(121);
          return;
        } else {
          this.a(121);
          return;
        }
    }
}
