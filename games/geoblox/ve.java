/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve extends sc {
    private java.awt.Component field_g;

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        java.awt.image.DataBufferInt var5Lifetime1;
        java.awt.image.DirectColorModel var6Lifetime1;
        java.awt.image.WritableRaster var7Lifetime1;
        this.field_a = param2;
        if (param3 > 116) {
            this.field_c = param0;
            this.field_d = new int[1 + param2 * param0];
            var5 = new java.awt.image.DataBufferInt(this.field_d, this.field_d.length);
            var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_a, this.field_c), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
            this.field_e = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
            this.field_g = param1;
            this.a(255);
            return;
        }
        this.field_g = (java.awt.Component) null;
        this.field_c = param0;
        this.field_d = new int[1 + param2 * param0];
        var5Lifetime1 = new java.awt.image.DataBufferInt(this.field_d, this.field_d.length);
        var6Lifetime1 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7Lifetime1 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6Lifetime1)).createCompatibleSampleModel(this.field_a, this.field_c), (java.awt.image.DataBuffer) ((Object) var5Lifetime1), (java.awt.Point) null);
        this.field_e = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6Lifetime1), var7Lifetime1, false, new Hashtable()));
        this.field_g = param1;
        this.a(255);
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        if (param3 == 0) {
            param1.drawImage(this.field_e, param2, param0, (java.awt.image.ImageObserver) ((Object) this.field_g));
            return;
        }
        this.field_g = (java.awt.Component) null;
        param1.drawImage(this.field_e, param2, param0, (java.awt.image.ImageObserver) ((Object) this.field_g));
    }

    public ve() {
    }
}
