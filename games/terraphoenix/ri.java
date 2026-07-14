/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ri extends te {
    private java.awt.Component field_h;

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((ri) this).field_b = param0;
            ((ri) this).field_c = new int[1 + param0 * param1];
            ((ri) this).field_f = param1;
            var5 = new java.awt.image.DataBufferInt(((ri) this).field_c, ((ri) this).field_c.length);
            var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            if (param2 != -36) {
              ((ri) this).field_h = null;
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ri) this).field_b, ((ri) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((ri) this).field_d = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((ri) this).field_h = param3;
              ((ri) this).a(param2 + 36);
              return;
            } else {
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ri) this).field_b, ((ri) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((ri) this).field_d = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((ri) this).field_h = param3;
              ((ri) this).a(param2 + 36);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ri() {
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        Object var6 = null;
        if (param3 <= 34) {
          var6 = null;
          ((ri) this).a(-39, 10, (java.awt.Graphics) null, 68);
          boolean discarded$4 = param2.drawImage(((ri) this).field_d, param1, param0, (java.awt.image.ImageObserver) (Object) ((ri) this).field_h);
          return;
        } else {
          boolean discarded$5 = param2.drawImage(((ri) this).field_d, param1, param0, (java.awt.image.ImageObserver) (Object) ((ri) this).field_h);
          return;
        }
    }
}
