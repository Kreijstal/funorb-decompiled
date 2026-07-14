/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class on extends mab {
    private java.awt.Component field_i;

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        int var5 = -11 / ((param2 - -6) / 41);
        boolean discarded$0 = param0.drawImage(((on) this).field_g, param1, param3, (java.awt.image.ImageObserver) (Object) ((on) this).field_i);
    }

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        ((on) this).field_c = new int[param1 * param0 - -1];
        ((on) this).field_d = param0;
        ((on) this).field_b = param1;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((on) this).field_c, ((on) this).field_c.length);
        int var8 = 8 % ((12 - param3) / 45);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((on) this).field_d, ((on) this).field_b), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((on) this).field_g = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        ((on) this).field_i = param2;
        ((on) this).a((byte) -108);
    }

    public on() {
    }
}
