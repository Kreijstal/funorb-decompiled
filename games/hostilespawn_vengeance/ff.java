/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ff extends sm {
    private java.awt.Component field_j;

    final void a(int param0, byte param1, int param2, java.awt.Graphics param3) {
        boolean discarded$9 = param3.drawImage(((ff) this).field_c, param0, param2, (java.awt.image.ImageObserver) (Object) ((ff) this).field_j);
        if (param1 >= -124) {
            Object var6 = null;
            ((ff) this).a(28, (java.awt.Component) null, -28, -127);
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((ff) this).field_e = param0;
            if (param2 != 9484) {
              ((ff) this).field_j = null;
              ((ff) this).field_b = param3;
              ((ff) this).field_f = new int[1 + param3 * param0];
              var5 = new java.awt.image.DataBufferInt(((ff) this).field_f, ((ff) this).field_f.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ff) this).field_b, ((ff) this).field_e), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((ff) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((ff) this).field_j = param1;
              ((ff) this).b((byte) 116);
              return;
            } else {
              ((ff) this).field_b = param3;
              ((ff) this).field_f = new int[1 + param3 * param0];
              var5 = new java.awt.image.DataBufferInt(((ff) this).field_f, ((ff) this).field_f.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ff) this).field_b, ((ff) this).field_e), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((ff) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((ff) this).field_j = param1;
              ((ff) this).b((byte) 116);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ff() {
    }
}
