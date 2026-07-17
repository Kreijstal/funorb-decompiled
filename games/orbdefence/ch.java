/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ch extends fh {
    private java.awt.Component field_g;

    final void a(int param0, int param1, java.awt.Graphics param2, boolean param3) {
        if (!param3) {
            return;
        }
        boolean discarded$0 = param2.drawImage(((ch) this).field_a, param0, param1, (java.awt.image.ImageObserver) (Object) ((ch) this).field_g);
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        ((ch) this).field_d = new int[1 + param2 * param1];
        ((ch) this).field_f = param1;
        ((ch) this).field_e = param2;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((ch) this).field_d, ((ch) this).field_d.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ch) this).field_e, ((ch) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((ch) this).field_a = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        int var8 = -36 % (param0 / 52);
        ((ch) this).field_g = param3;
        ((ch) this).a(-40);
    }

    public ch() {
    }
}
