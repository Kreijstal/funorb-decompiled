/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dd extends cj {
    private java.awt.Component field_h;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$10 = param2.drawImage(((dd) this).field_f, param1, param3, (java.awt.image.ImageObserver) (Object) ((dd) this).field_h);
        if (param0 != -32299) {
            ((dd) this).field_h = null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        ((dd) this).field_d = param0;
        ((dd) this).field_a = new int[1 + param1 * param0];
        ((dd) this).field_g = param1;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((dd) this).field_a, ((dd) this).field_a.length);
        int var8 = -93 / ((param3 - -90) / 34);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((dd) this).field_d, ((dd) this).field_g), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((dd) this).field_f = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        ((dd) this).field_h = param2;
        ((dd) this).a(113);
    }

    public dd() {
    }
}
