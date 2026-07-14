/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gn extends rb {
    private java.awt.Component field_j;

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            ((gn) this).field_c = param3;
            ((gn) this).field_f = new int[param3 * param1 - -1];
            ((gn) this).field_b = param1;
            var5 = new java.awt.image.DataBufferInt(((gn) this).field_f, ((gn) this).field_f.length);
            if (param2 >= -53) {
              return;
            } else {
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((gn) this).field_b, ((gn) this).field_c), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((gn) this).field_e = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((gn) this).field_j = param0;
              ((gn) this).a((byte) 102);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$0 = param1.drawImage(((gn) this).field_e, param3, param2, (java.awt.image.ImageObserver) (Object) ((gn) this).field_j);
        int var5 = 44 % ((param0 - 36) / 52);
    }

    public gn() {
    }
}
