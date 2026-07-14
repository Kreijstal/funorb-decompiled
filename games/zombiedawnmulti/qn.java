/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends l {
    private java.awt.Component field_i;

    public qn() {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        Object var6 = null;
        if (param2 != 2) {
          var6 = null;
          ((qn) this).a(87, (java.awt.Component) null, -87, -91);
          boolean discarded$4 = param1.drawImage(((qn) this).field_g, param3, param0, (java.awt.image.ImageObserver) (Object) ((qn) this).field_i);
          return;
        } else {
          boolean discarded$5 = param1.drawImage(((qn) this).field_g, param3, param0, (java.awt.image.ImageObserver) (Object) ((qn) this).field_i);
          return;
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((qn) this).field_f = param2;
            if (param0 != -6) {
              ((qn) this).field_i = null;
              ((qn) this).field_b = new int[param2 * param3 + 1];
              ((qn) this).field_h = param3;
              var5 = new java.awt.image.DataBufferInt(((qn) this).field_b, ((qn) this).field_b.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((qn) this).field_h, ((qn) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((qn) this).field_g = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((qn) this).field_i = param1;
              ((qn) this).b((byte) 112);
              return;
            } else {
              ((qn) this).field_b = new int[param2 * param3 + 1];
              ((qn) this).field_h = param3;
              var5 = new java.awt.image.DataBufferInt(((qn) this).field_b, ((qn) this).field_b.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((qn) this).field_h, ((qn) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((qn) this).field_g = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((qn) this).field_i = param1;
              ((qn) this).b((byte) 112);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }
}
