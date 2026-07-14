/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lf extends pj {
    private java.awt.Component field_g;

    final void a(byte param0, int param1, int param2, java.awt.Component param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((lf) this).field_e = new int[1 + param1 * param2];
            ((lf) this).field_b = param1;
            ((lf) this).field_c = param2;
            if (param0 >= -31) {
              return;
            } else {
              var5 = new java.awt.image.DataBufferInt(((lf) this).field_e, ((lf) this).field_e.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((lf) this).field_c, ((lf) this).field_b), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((lf) this).field_d = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((lf) this).field_g = param3;
              ((lf) this).a(-12595);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        int var5 = 43 / ((-72 - param0) / 48);
        boolean discarded$0 = param1.drawImage(((lf) this).field_d, param3, param2, (java.awt.image.ImageObserver) (Object) ((lf) this).field_g);
    }

    public lf() {
    }
}
