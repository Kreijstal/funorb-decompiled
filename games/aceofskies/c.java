/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class c extends oe {
    private java.awt.Shape field_i;
    private java.awt.Canvas field_j;
    private java.awt.Image field_k;
    private java.awt.Rectangle field_l;

    final void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        ((c) this).field_j = param2;
        ((c) this).field_l = new java.awt.Rectangle();
        if (param0 != -12189) {
          return;
        } else {
          ((c) this).field_g = param1;
          ((c) this).field_h = param3;
          ((c) this).field_e = new int[((c) this).field_g * ((c) this).field_h];
          var5 = new java.awt.image.DataBufferInt(((c) this).field_e, ((c) this).field_e.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((c) this).field_g, ((c) this).field_h), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
          ((c) this).field_k = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Graphics param5, int param6, int param7) {
        ((c) this).field_i = param5.getClip();
        ((c) this).field_l.height = param3;
        ((c) this).field_l.y = param7;
        ((c) this).field_l.x = param2;
        ((c) this).field_l.width = param0;
        param5.setClip((java.awt.Shape) (Object) ((c) this).field_l);
        int var9 = -6 % ((65 - param4) / 59);
        boolean discarded$0 = param5.drawImage(((c) this).field_k, param2 + -param6, -param1 + param7, (java.awt.image.ImageObserver) (Object) ((c) this).field_j);
        param5.setClip(((c) this).field_i);
    }

    private c() throws Throwable {
        throw new Error();
    }
}
