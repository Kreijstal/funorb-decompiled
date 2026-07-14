/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jk extends vi {
    private java.awt.Component field_h;

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$10 = param1.drawImage(((jk) this).field_b, param0, param3, (java.awt.image.ImageObserver) (Object) ((jk) this).field_h);
        if (param2 != -22984) {
            ((jk) this).field_h = null;
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, byte param3) {
        int var5 = 53 % ((param3 - -79) / 35);
        ((jk) this).field_f = param1;
        ((jk) this).field_g = param2;
        ((jk) this).field_e = new int[param2 * param1 - -1];
        java.awt.image.DataBufferInt var6 = new java.awt.image.DataBufferInt(((jk) this).field_e, ((jk) this).field_e.length);
        java.awt.image.DirectColorModel var7 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var8 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var7).createCompatibleSampleModel(((jk) this).field_g, ((jk) this).field_f), (java.awt.image.DataBuffer) (Object) var6, (java.awt.Point) null);
        ((jk) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var7, var8, false, new Hashtable());
        ((jk) this).field_h = param0;
        ((jk) this).a((byte) -107);
    }

    public jk() {
    }
}
