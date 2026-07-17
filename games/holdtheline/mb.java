/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mb extends mm {
    private java.awt.Component field_i;

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((mb) this).field_h = new int[param0 * param1 + 1];
        ((mb) this).field_c = param1;
        ((mb) this).field_f = param0;
        if (param3 != 0) {
          ((mb) this).field_i = null;
          var5 = new java.awt.image.DataBufferInt(((mb) this).field_h, ((mb) this).field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((mb) this).field_f, ((mb) this).field_c), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((mb) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((mb) this).field_i = param2;
          ((mb) this).a(false);
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(((mb) this).field_h, ((mb) this).field_h.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((mb) this).field_f, ((mb) this).field_c), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((mb) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((mb) this).field_i = param2;
          ((mb) this).a(false);
          return;
        }
    }

    public mb() {
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        Object var6 = null;
        if (param3 != 34) {
          var6 = null;
          ((mb) this).a(40, 118, (java.awt.Component) null, -42);
          boolean discarded$4 = param2.drawImage(((mb) this).field_b, param1, param0, (java.awt.image.ImageObserver) (Object) ((mb) this).field_i);
          return;
        } else {
          boolean discarded$5 = param2.drawImage(((mb) this).field_b, param1, param0, (java.awt.image.ImageObserver) (Object) ((mb) this).field_i);
          return;
        }
    }
}
