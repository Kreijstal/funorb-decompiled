/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dd extends cj {
    private java.awt.Component field_h;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$10 = param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) ((Object) this.field_h));
        if (param0 != -32299) {
            this.field_h = (java.awt.Component) null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        this.field_d = param0;
        this.field_a = new int[1 + param1 * param0];
        this.field_g = param1;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.field_a, this.field_a.length);
        int var8 = -93 / ((param3 - -90) / 34);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_d, this.field_g), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_f = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.field_h = param2;
        this.a(113);
    }

    public dd() {
    }
}
