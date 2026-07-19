/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi extends dd {
    private java.awt.Component field_g;

    final void a(boolean param0, int param1, int param2, java.awt.Component param3) {
        this.field_b = new int[1 + param1 * param2];
        this.field_a = param2;
        this.field_c = param1;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.field_b, this.field_b.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_a, this.field_c), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_e = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, param0, new Hashtable()));
        this.field_g = param3;
        this.b(1);
    }

    public qi() {
    }

    final void a(int param0, java.awt.Graphics param1, byte param2, int param3) {
        boolean discarded$0 = param1.drawImage(this.field_e, param0, param3, (java.awt.image.ImageObserver) ((Object) this.field_g));
        int var5 = -41 % ((param2 - 26) / 52);
    }
}
