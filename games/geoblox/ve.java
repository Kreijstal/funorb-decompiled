/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve extends sc {
    private java.awt.Component field_g;

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((ve) this).field_a = param2;
        if (param3 <= 116) {
          ((ve) this).field_g = null;
          ((ve) this).field_c = param0;
          ((ve) this).field_d = new int[1 + param2 * param0];
          var5 = new java.awt.image.DataBufferInt(((ve) this).field_d, ((ve) this).field_d.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ve) this).field_a, ((ve) this).field_c), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((ve) this).field_e = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((ve) this).field_g = param1;
          ((ve) this).a(255);
          return;
        } else {
          ((ve) this).field_c = param0;
          ((ve) this).field_d = new int[1 + param2 * param0];
          var5 = new java.awt.image.DataBufferInt(((ve) this).field_d, ((ve) this).field_d.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ve) this).field_a, ((ve) this).field_c), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((ve) this).field_e = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((ve) this).field_g = param1;
          ((ve) this).a(255);
          return;
        }
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        if (param3 != 0) {
          ((ve) this).field_g = null;
          boolean discarded$4 = param1.drawImage(((ve) this).field_e, param2, param0, (java.awt.image.ImageObserver) (Object) ((ve) this).field_g);
          return;
        } else {
          boolean discarded$5 = param1.drawImage(((ve) this).field_e, param2, param0, (java.awt.image.ImageObserver) (Object) ((ve) this).field_g);
          return;
        }
    }

    public ve() {
    }
}
