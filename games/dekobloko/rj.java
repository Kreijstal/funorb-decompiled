/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj extends eh {
    private java.awt.Component field_k;

    final void a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
            java.awt.image.DataBufferInt var5 = null;
            java.awt.image.DirectColorModel var6 = null;
            java.awt.image.WritableRaster var7 = null;
            Object var8 = null;
            if (param1 != 83) {
              var8 = null;
              ((rj) this).a((byte) -42, (java.awt.Graphics) null, -83, -93);
              ((rj) this).field_g = param0;
              ((rj) this).field_i = param2;
              ((rj) this).field_f = new int[param2 * param0 + 1];
              var5 = new java.awt.image.DataBufferInt(((rj) this).field_f, ((rj) this).field_f.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((rj) this).field_g, ((rj) this).field_i), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((rj) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((rj) this).field_k = param3;
              ((rj) this).a((byte) -97);
              return;
            } else {
              ((rj) this).field_g = param0;
              ((rj) this).field_i = param2;
              ((rj) this).field_f = new int[param2 * param0 + 1];
              var5 = new java.awt.image.DataBufferInt(((rj) this).field_f, ((rj) this).field_f.length);
              var6 = new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              var7 = java.awt.image.Raster.createWritableRaster(((java.awt.image.ColorModel) (Object) var6).createCompatibleSampleModel(((rj) this).field_g, ((rj) this).field_i), (java.awt.image.DataBuffer) (Object) var5, (java.awt.Point) null);
              ((rj) this).field_c = (java.awt.Image) (Object) new java.awt.image.BufferedImage((java.awt.image.ColorModel) (Object) var6, var7, false, new Hashtable());
              ((rj) this).field_k = param3;
              ((rj) this).a((byte) -97);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        boolean discarded$9 = param1.drawImage(((rj) this).field_c, param2, param3, (java.awt.image.ImageObserver) (Object) ((rj) this).field_k);
        if (param0 <= 38) {
            Object var6 = null;
            ((rj) this).a((byte) -30, (java.awt.Graphics) null, -118, 16);
        }
    }

    public rj() {
    }
}
