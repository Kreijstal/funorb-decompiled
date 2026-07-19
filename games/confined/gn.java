/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gn extends rb {
    private java.awt.Component field_j;

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        java.awt.image.DataBufferInt var5 = null;
        java.awt.image.DirectColorModel var6 = null;
        java.awt.image.WritableRaster var7 = null;
        this.field_c = param3;
        this.field_f = new int[param3 * param1 - -1];
        this.field_b = param1;
        var5 = new java.awt.image.DataBufferInt(this.field_f, this.field_f.length);
        if (param2 >= -53) {
          return;
        } else {
          var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) ((Object) var6)).createCompatibleSampleModel(this.field_b, this.field_c), (java.awt.image.DataBuffer) ((Object) var5), (java.awt.Point) null);
          this.field_e = (java.awt.Image) ((Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) ((Object) var6), var7, false, new Hashtable()));
          this.field_j = param0;
          this.a((byte) 102);
          return;
        }
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$0 = param1.drawImage(this.field_e, param3, param2, (java.awt.image.ImageObserver) ((Object) this.field_j));
        int var5 = 44 % ((param0 - 36) / 52);
    }

    public gn() {
    }
}
