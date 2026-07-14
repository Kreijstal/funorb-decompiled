/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hg extends bc {
    private java.awt.Component field_g;

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        boolean discarded$0 = param0.drawImage(((hg) this).field_b, param3, param1, (java.awt.image.ImageObserver) (Object) ((hg) this).field_g);
        int var5 = -48 / ((param2 - 83) / 34);
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        ((hg) this).field_e = param3;
        ((hg) this).field_d = param1;
        int var5 = 119 / ((50 - param0) / 32);
        ((hg) this).field_c = new int[1 + param1 * param3];
        java.awt.image.DataBufferInt var6 = new java.awt.image.DataBufferInt(((hg) this).field_c, ((hg) this).field_c.length);
        java.awt.image.DirectColorModel var7 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var8 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var7).createCompatibleSampleModel(((hg) this).field_d, ((hg) this).field_e), (java.awt.image.DataBuffer) (Object) var6, (java.awt.Point) null);
        ((hg) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var7, var8, false, new Hashtable());
        ((hg) this).field_g = param2;
        ((hg) this).a(6945);
    }

    public hg() {
    }
}
