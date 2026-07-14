/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jw extends ce {
    private java.awt.Image field_r;
    private java.awt.Shape field_t;
    private java.awt.Rectangle field_s;
    private java.awt.Canvas field_u;

    final void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        ((jw) this).field_u = param0;
        ((jw) this).field_s = new java.awt.Rectangle();
        ((jw) this).field_k = param1;
        ((jw) this).field_n = param2;
        ((jw) this).field_m = new int[((jw) this).field_n * ((jw) this).field_k];
        int var5 = -61 % ((-34 - param3) / 39);
        java.awt.image.DataBufferInt var6 = new java.awt.image.DataBufferInt(((jw) this).field_m, ((jw) this).field_m.length);
        java.awt.image.DirectColorModel var7 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        java.awt.image.WritableRaster var8 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var7).createCompatibleSampleModel(((jw) this).field_n, ((jw) this).field_k), (java.awt.image.DataBuffer) (Object) var6, (java.awt.Point) null);
        ((jw) this).field_r = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var7, var8, false, new Hashtable());
    }

    private jw() throws Throwable {
        throw new Error();
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        Object var10 = null;
        ((jw) this).field_t = param0.getClip();
        if (param7 > -47) {
          var10 = null;
          ((jw) this).a((java.awt.Graphics) null, 122, -30, 120, -56, -55, 53, (byte) 1);
          ((jw) this).field_s.y = param1;
          ((jw) this).field_s.height = param5;
          ((jw) this).field_s.width = param3;
          ((jw) this).field_s.x = param6;
          param0.setClip((java.awt.Shape) (Object) ((jw) this).field_s);
          boolean discarded$2 = param0.drawImage(((jw) this).field_r, -param4 + param6, param1 - param2, (java.awt.image.ImageObserver) (Object) ((jw) this).field_u);
          param0.setClip(((jw) this).field_t);
          return;
        } else {
          ((jw) this).field_s.y = param1;
          ((jw) this).field_s.height = param5;
          ((jw) this).field_s.width = param3;
          ((jw) this).field_s.x = param6;
          param0.setClip((java.awt.Shape) (Object) ((jw) this).field_s);
          boolean discarded$3 = param0.drawImage(((jw) this).field_r, -param4 + param6, param1 - param2, (java.awt.image.ImageObserver) (Object) ((jw) this).field_u);
          param0.setClip(((jw) this).field_t);
          return;
        }
    }
}
