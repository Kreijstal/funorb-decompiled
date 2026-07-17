/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tu extends qm {
    private java.awt.Component field_h;

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        Object var6 = null;
        if (param0 <= 27) {
          var6 = null;
          ((tu) this).a(-86, (java.awt.Component) null, 95, -74);
          boolean discarded$4 = param2.drawImage(((tu) this).field_c, param3, param1, (java.awt.image.ImageObserver) (Object) ((tu) this).field_h);
          return;
        } else {
          boolean discarded$5 = param2.drawImage(((tu) this).field_c, param3, param1, (java.awt.image.ImageObserver) (Object) ((tu) this).field_h);
          return;
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((tu) this).field_b = param2;
        ((tu) this).field_e = new int[param0 * param2 - -1];
        ((tu) this).field_f = param0;
        var5 = new java.awt.image.DataBufferInt(((tu) this).field_e, ((tu) this).field_e.length);
        var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((tu) this).field_b, ((tu) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
        ((tu) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
        if (param3 != 256) {
          return;
        } else {
          ((tu) this).field_h = param1;
          ((tu) this).a((byte) -28);
          return;
        }
    }

    public tu() {
    }
}
