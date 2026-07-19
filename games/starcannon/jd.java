/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jd extends tk {
    private java.awt.Component field_h;

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_g = new int[param1 * param3 + 1];
        this.field_b = param3;
        this.field_d = param1;
        var5 = new java.awt.image.DataBufferInt(this.field_g, this.field_g.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_d, this.field_b), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        if (param0 != -9623) {
          return;
        } else {
          this.field_h = param2;
          this.b(126);
          return;
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (param3 != 19291) {
          this.field_h = (java.awt.Component) null;
          discarded$4 = param2.drawImage(this.field_c, param0, param1, (java.awt.image.ImageObserver) ((Object) this.field_h));
          return;
        } else {
          discarded$5 = param2.drawImage(this.field_c, param0, param1, (java.awt.image.ImageObserver) ((Object) this.field_h));
          return;
        }
    }

    public jd() {
    }
}
