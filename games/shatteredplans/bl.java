/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bl extends qd {
    private java.awt.Component field_i;

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        boolean discarded$9 = param0.drawImage(((bl) this).field_b, param1, param3, (java.awt.image.ImageObserver) (Object) ((bl) this).field_i);
        if (param2 >= -56) {
            Object var6 = null;
            ((bl) this).a((java.awt.Graphics) null, -17, (byte) -63, -24);
        }
    }

    final void a(int param0, java.awt.Component param1, byte param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        Object var8 = null;
        ((bl) this).field_g = param3;
        if (param2 >= -91) {
          var8 = null;
          ((bl) this).a(-82, (java.awt.Component) null, (byte) -8, -67);
          ((bl) this).field_c = new int[param3 * param0 + 1];
          ((bl) this).field_d = param0;
          var5 = new java.awt.image.DataBufferInt(((bl) this).field_c, ((bl) this).field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((bl) this).field_g, ((bl) this).field_d), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((bl) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((bl) this).field_i = param1;
          ((bl) this).a((byte) 109);
          return;
        } else {
          ((bl) this).field_c = new int[param3 * param0 + 1];
          ((bl) this).field_d = param0;
          var5 = new java.awt.image.DataBufferInt(((bl) this).field_c, ((bl) this).field_c.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((bl) this).field_g, ((bl) this).field_d), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((bl) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          ((bl) this).field_i = param1;
          ((bl) this).a((byte) 109);
          return;
        }
    }

    public bl() {
    }
}
