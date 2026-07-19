/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class le extends nb {
    private java.awt.Component field_h;

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$10 = param3.drawImage(this.field_c, param1, param0, (java.awt.image.ImageObserver) ((Object) this.field_h));
        if (param2 != -17260) {
            java.awt.Graphics var6 = (java.awt.Graphics) null;
            this.a(84, 3, -39, (java.awt.Graphics) null);
        }
    }

    final void a(java.awt.Component param0, int param1, boolean param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.Graphics var8 = null;
        this.field_g = param3;
        this.field_f = param1;
        this.field_d = new int[1 + param3 * param1];
        var5 = new java.awt.image.DataBufferInt(this.field_d, this.field_d.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_f), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        if (!param2) {
          var8 = (java.awt.Graphics) null;
          this.a(-19, 8, 121, (java.awt.Graphics) null);
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_h = param0;
          this.a((byte) 74);
          return;
        } else {
          this.field_c = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_h = param0;
          this.a((byte) 74);
          return;
        }
    }

    public le() {
    }
}
