/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mb extends vj {
    private java.awt.Component field_k;

    public mb() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((mb) this).field_i = param2;
        ((mb) this).field_e = param3;
        ((mb) this).field_b = new int[param2 * param3 + 1];
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((mb) this).field_b, ((mb) this).field_b.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((mb) this).field_e, ((mb) this).field_i), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        int var8 = -119 / ((16 - param1) / 60);
        ((mb) this).field_j = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        ((mb) this).field_k = param0;
        ((mb) this).b(48);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param1 != 12105912) {
            return;
        }
        boolean discarded$0 = param2.drawImage(((mb) this).field_j, param0, param3, (java.awt.image.ImageObserver) (Object) ((mb) this).field_k);
    }
}
