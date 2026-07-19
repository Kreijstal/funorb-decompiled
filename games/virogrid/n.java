/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class n extends wf {
    private java.awt.Component field_n;

    public n() {
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_c = param1;
        this.field_l = new int[param0 * param1 - -1];
        this.field_b = param0;
        var5 = new java.awt.image.DataBufferInt(this.field_l, this.field_l.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_c, this.field_b), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_h = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.field_n = param3;
        if (param2 >= -24) {
          this.field_n = (java.awt.Component) null;
          this.a((byte) 29);
          return;
        } else {
          this.a((byte) 29);
          return;
        }
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (param0 < 6) {
          this.field_n = (java.awt.Component) null;
          discarded$4 = param2.drawImage(this.field_h, param1, param3, (java.awt.image.ImageObserver) ((Object) this.field_n));
          return;
        } else {
          discarded$5 = param2.drawImage(this.field_h, param1, param3, (java.awt.image.ImageObserver) ((Object) this.field_n));
          return;
        }
    }
}
