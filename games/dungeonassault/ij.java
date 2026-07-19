/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends c {
    private java.awt.Component field_i;

    final void a(byte param0, java.awt.Component param1, int param2, int param3) {
        this.field_f = param2;
        this.field_g = new int[param3 * param2 - -1];
        this.field_b = param3;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.field_g, this.field_g.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_b, this.field_f), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_a = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.field_i = param1;
        int var8 = -63 / ((param0 - -15) / 33);
        this.a(true);
    }

    final void a(int param0, boolean param1, java.awt.Graphics param2, int param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        if (!param1) {
          this.field_i = (java.awt.Component) null;
          discarded$4 = param2.drawImage(this.field_a, param0, param3, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        } else {
          discarded$5 = param2.drawImage(this.field_a, param0, param3, (java.awt.image.ImageObserver) ((Object) this.field_i));
          return;
        }
    }

    public ij() {
    }
}
