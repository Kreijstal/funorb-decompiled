/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends uc {
    private java.awt.Component field_i;

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            if (param3 > -72) {
              ((ka) this).field_i = null;
              ((ka) this).field_h = param1;
              ((ka) this).field_f = param2;
              ((ka) this).field_g = new int[1 + param2 * param1];
              var5 = new java.awt.image.DataBufferInt(((ka) this).field_g, ((ka) this).field_g.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ka) this).field_h, ((ka) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((ka) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((ka) this).field_i = param0;
              ((ka) this).a((byte) 115);
              return;
            } else {
              ((ka) this).field_h = param1;
              ((ka) this).field_f = param2;
              ((ka) this).field_g = new int[1 + param2 * param1];
              var5 = new java.awt.image.DataBufferInt(((ka) this).field_g, ((ka) this).field_g.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((ka) this).field_h, ((ka) this).field_f), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((ka) this).field_b = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((ka) this).field_i = param0;
              ((ka) this).a((byte) 115);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ka() {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        if (param3 < 19) {
          ((ka) this).field_i = null;
          boolean discarded$4 = param0.drawImage(((ka) this).field_b, param2, param1, (java.awt.image.ImageObserver) (Object) ((ka) this).field_i);
          return;
        } else {
          boolean discarded$5 = param0.drawImage(((ka) this).field_b, param2, param1, (java.awt.image.ImageObserver) (Object) ((ka) this).field_i);
          return;
        }
    }
}
