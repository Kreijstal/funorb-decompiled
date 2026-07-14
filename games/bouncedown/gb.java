/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb extends ef {
    private java.awt.Component field_j;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$0 = param2.drawImage(((gb) this).field_e, param1, param0, (java.awt.image.ImageObserver) (Object) ((gb) this).field_j);
        int var5 = -89 % ((param3 - -33) / 52);
    }

    final void a(int param0, byte param1, java.awt.Component param2, int param3) {
        ((gb) this).field_h = param0;
        ((gb) this).field_b = param3;
        ((gb) this).field_g = new int[1 + param3 * param0];
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((gb) this).field_g, ((gb) this).field_g.length);
        int var7 = -119 / ((-63 - param1) / 38);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var8 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((gb) this).field_h, ((gb) this).field_b), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((gb) this).field_e = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var8, false, new Hashtable());
        ((gb) this).field_j = param2;
        ((gb) this).c(64);
    }

    public gb() {
    }
}
