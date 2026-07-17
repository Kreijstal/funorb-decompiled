/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rk extends ov {
    private java.awt.Component field_j;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param0 >= -47) {
            return;
        }
        boolean discarded$0 = param2.drawImage(((rk) this).field_f, param1, param3, (java.awt.image.ImageObserver) (Object) ((rk) this).field_j);
    }

    public rk() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((rk) this).field_c = new int[1 + param1 * param2];
        ((rk) this).field_b = param1;
        ((rk) this).field_h = param2;
        if (param3 >= -97) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(((rk) this).field_c, ((rk) this).field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((rk) this).field_h, ((rk) this).field_b), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((rk) this).field_f = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((rk) this).field_j = param0;
          ((rk) this).a(-1);
          return;
        }
    }
}
