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
        this.field_j = param2;
        this.field_l = new java.awt.Rectangle();
        if (param0 != -12189) {
          return;
        } else {
          this.field_g = param1;
          this.field_h = param3;
          this.field_e = new int[this.field_g * this.field_h];
          var5 = new java.awt.image.DataBufferInt(this.field_e, this.field_e.length);
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_g, this.field_h), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_k = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, java.awt.Graphics param5, int param6, int param7) {
        this.field_i = param5.getClip();
        this.field_l.height = param3;
        this.field_l.y = param7;
        this.field_l.x = param2;
        this.field_l.width = param0;
        param5.setClip((java.awt.Shape) ((Object) this.field_l));
        int var9 = -6 % ((65 - param4) / 59);
        boolean discarded$0 = param5.drawImage(this.field_k, param2 + -param6, -param1 + param7, (java.awt.image.ImageObserver) ((Object) this.field_j));
        param5.setClip(this.field_i);
    }

    private c() throws Throwable {
        throw new Error();
    }
}
