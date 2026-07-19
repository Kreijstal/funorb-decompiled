/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class de extends cha {
    private java.awt.Component field_i;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param3 != 2) {
            return;
        }
        boolean discarded$0 = param2.drawImage(this.field_a, param1, param0, (java.awt.image.ImageObserver) ((Object) this.field_i));
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        this.field_g = new int[param0 * param1 + 1];
        this.field_e = param1;
        this.field_f = param0;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(this.field_g, this.field_g.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_f, this.field_e), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
        this.field_a = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
        this.field_i = param2;
        int var8 = -23 % ((param3 - 74) / 41);
        this.a(-19216);
    }

    public de() {
    }
}
