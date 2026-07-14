/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fk extends df {
    private java.awt.Component field_j;

    final void a(byte param0, int param1, java.awt.Component param2, int param3) {
        ((fk) this).field_f = new int[param1 * param3 - -1];
        ((fk) this).field_h = param1;
        ((fk) this).field_d = param3;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((fk) this).field_f, ((fk) this).field_f.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((fk) this).field_d, ((fk) this).field_h), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((fk) this).field_g = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        ((fk) this).field_j = param2;
        ((fk) this).b(20);
        int var8 = 64 % ((-53 - param0) / 36);
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        if (param1 != -29402) {
            return;
        }
        boolean discarded$0 = param0.drawImage(((fk) this).field_g, param2, param3, (java.awt.image.ImageObserver) (Object) ((fk) this).field_j);
    }

    public fk() {
    }
}
