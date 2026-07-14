/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fg extends kn {
    private java.awt.Component field_i;

    final void a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((fg) this).field_d = new int[param2 * param3 - -1];
            ((fg) this).field_g = param3;
            if (param1 != 24) {
              ((fg) this).field_i = null;
              ((fg) this).field_a = param2;
              var5 = new java.awt.image.DataBufferInt(((fg) this).field_d, ((fg) this).field_d.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((fg) this).field_g, ((fg) this).field_a), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((fg) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((fg) this).field_i = param0;
              ((fg) this).a(-105);
              return;
            } else {
              ((fg) this).field_a = param2;
              var5 = new java.awt.image.DataBufferInt(((fg) this).field_d, ((fg) this).field_d.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((fg) this).field_g, ((fg) this).field_a), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((fg) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((fg) this).field_i = param0;
              ((fg) this).a(-105);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$9 = param3.drawImage(((fg) this).field_c, param1, param2, (java.awt.image.ImageObserver) (Object) ((fg) this).field_i);
        if (param0 <= 70) {
            ((fg) this).field_i = null;
        }
    }

    public fg() {
    }
}
