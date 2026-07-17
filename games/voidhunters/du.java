/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class du extends gpb {
    private java.awt.Canvas field_i;
    private java.awt.Shape field_j;
    private java.awt.Rectangle field_g;
    private java.awt.Image field_h;

    final void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        Object var10 = null;
        ((du) this).field_j = param0.getClip();
        ((du) this).field_g.x = param6;
        ((du) this).field_g.width = param1;
        ((du) this).field_g.height = param7;
        ((du) this).field_g.y = param5;
        param0.setClip((java.awt.Shape) (Object) ((du) this).field_g);
        boolean discarded$21 = param0.drawImage(((du) this).field_h, param6 + -param4, -param2 + param5, (java.awt.image.ImageObserver) (Object) ((du) this).field_i);
        if (param3 != 32255) {
          var10 = null;
          ((du) this).a((java.awt.Graphics) null, -3, 82, 99, 101, 54, -103, -62);
          param0.setClip(((du) this).field_j);
          return;
        } else {
          param0.setClip(((du) this).field_j);
          return;
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((du) this).field_i = param3;
        ((du) this).field_g = new java.awt.Rectangle();
        ((du) this).field_d = param2;
        ((du) this).field_e = param1;
        ((du) this).field_f = new int[((du) this).field_d * ((du) this).field_e];
        if (param0 != 4904) {
          return;
        } else {
          var5 = new java.awt.image.DataBufferInt(((du) this).field_f, ((du) this).field_f.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((du) this).field_e, ((du) this).field_d), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((du) this).field_h = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          return;
        }
    }

    private du() throws Throwable {
        throw new Error();
    }
}
