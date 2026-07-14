/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class el extends kh {
    private java.awt.Component field_i;

    public el() {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        if (param3 < 110) {
          ((el) this).field_i = (java.awt.Component) null;
          boolean discarded$4 = param0.drawImage(((el) this).field_a, param1, param2, (java.awt.image.ImageObserver) (Object) ((el) this).field_i);
          return;
        } else {
          boolean discarded$5 = param0.drawImage(((el) this).field_a, param1, param2, (java.awt.image.ImageObserver) (Object) ((el) this).field_i);
          return;
        }
    }

    final void a(java.awt.Component param0, int param1, byte param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            if (param2 != 68) {
              ((el) this).field_i = (java.awt.Component) null;
              ((el) this).field_b = param3;
              ((el) this).field_d = param1;
              ((el) this).field_h = new int[1 + param3 * param1];
              var5 = new java.awt.image.DataBufferInt(((el) this).field_h, ((el) this).field_h.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((el) this).field_b, ((el) this).field_d), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((el) this).field_a = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((el) this).field_i = param0;
              ((el) this).a(200);
              return;
            } else {
              ((el) this).field_b = param3;
              ((el) this).field_d = param1;
              ((el) this).field_h = new int[1 + param3 * param1];
              var5 = new java.awt.image.DataBufferInt(((el) this).field_h, ((el) this).field_h.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((el) this).field_b, ((el) this).field_d), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((el) this).field_a = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((el) this).field_i = param0;
              ((el) this).a(200);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }
}
