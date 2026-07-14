/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sh extends dk {
    private java.awt.Component field_n;

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            Object var8 = null;
            ((sh) this).field_e = param3;
            ((sh) this).field_m = param0;
            ((sh) this).field_l = new int[1 + param3 * param0];
            var5 = new java.awt.image.DataBufferInt(((sh) this).field_l, ((sh) this).field_l.length);
            var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((sh) this).field_e, ((sh) this).field_m), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
            if (param2 != 0) {
              var8 = null;
              ((sh) this).a(117, (java.awt.Graphics) null, 45, -66);
              ((sh) this).field_j = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((sh) this).field_n = param1;
              ((sh) this).a(true);
              return;
            } else {
              ((sh) this).field_j = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((sh) this).field_n = param1;
              ((sh) this).a(true);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public sh() {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        if (param2 != 0) {
          ((sh) this).field_n = null;
          boolean discarded$4 = param1.drawImage(((sh) this).field_j, param3, param0, (java.awt.image.ImageObserver) (Object) ((sh) this).field_n);
          return;
        } else {
          boolean discarded$5 = param1.drawImage(((sh) this).field_j, param3, param0, (java.awt.image.ImageObserver) (Object) ((sh) this).field_n);
          return;
        }
    }
}
