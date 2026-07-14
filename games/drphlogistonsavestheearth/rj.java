/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends na {
    private java.awt.Component field_i;

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        if (param3 != 255) {
          ((rj) this).field_i = null;
          boolean discarded$4 = param0.drawImage(((rj) this).field_h, param1, param2, (java.awt.image.ImageObserver) (Object) ((rj) this).field_i);
          return;
        } else {
          boolean discarded$5 = param0.drawImage(((rj) this).field_h, param1, param2, (java.awt.image.ImageObserver) (Object) ((rj) this).field_i);
          return;
        }
    }

    public rj() {
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((rj) this).field_e = new int[param1 * param0 - -1];
            ((rj) this).field_f = param0;
            ((rj) this).field_g = param1;
            var5 = new java.awt.image.DataBufferInt(((rj) this).field_e, ((rj) this).field_e.length);
            var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((rj) this).field_f, ((rj) this).field_g), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
            ((rj) this).field_h = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
            ((rj) this).field_i = param3;
            if (param2 >= -22) {
              ((rj) this).field_i = null;
              ((rj) this).a(121);
              return;
            } else {
              ((rj) this).a(121);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }
}
