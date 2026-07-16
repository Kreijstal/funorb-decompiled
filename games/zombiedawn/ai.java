/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ai extends dh {
    private java.awt.Component field_h;

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((ai) this).field_a = param0;
        ((ai) this).field_c = new int[param1 * param0 - -1];
        ((ai) this).field_d = param1;
        if (param3 != -11055) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(((ai) this).field_c, ((ai) this).field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ai) this).field_d, ((ai) this).field_a), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((ai) this).field_f = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((ai) this).field_h = param2;
          ((ai) this).b(126);
          return;
        }
    }

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        boolean discarded$10 = param0.drawImage(((ai) this).field_f, param2, param1, (java.awt.image.ImageObserver) (Object) ((ai) this).field_h);
        if (param3 != 58) {
            Object var6 = null;
            ((ai) this).a((java.awt.Graphics) null, -22, -79, (byte) 26);
        }
    }

    public ai() {
    }
}
