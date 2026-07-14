/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends c {
    private java.awt.Component field_i;

    final void a(byte param0, java.awt.Component param1, int param2, int param3) {
        ((ij) this).field_f = param2;
        ((ij) this).field_g = new int[param3 * param2 - -1];
        ((ij) this).field_b = param3;
        java.awt.image.DataBufferInt var5 = new java.awt.image.DataBufferInt(((ij) this).field_g, ((ij) this).field_g.length);
        java.awt.image.DirectColorModel var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ij) this).field_b, ((ij) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((ij) this).field_a = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        ((ij) this).field_i = param1;
        int var8 = -63 / ((param0 - -15) / 33);
        ((ij) this).a(true);
    }

    final void a(int param0, boolean param1, java.awt.Graphics param2, int param3) {
        if (!param1) {
          ((ij) this).field_i = null;
          boolean discarded$4 = param2.drawImage(((ij) this).field_a, param0, param3, (java.awt.image.ImageObserver) (Object) ((ij) this).field_i);
          return;
        } else {
          boolean discarded$5 = param2.drawImage(((ij) this).field_a, param0, param3, (java.awt.image.ImageObserver) (Object) ((ij) this).field_i);
          return;
        }
    }

    public ij() {
    }
}
