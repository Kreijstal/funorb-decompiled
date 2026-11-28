/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dg {
    final static String a(boolean param0) {
        if (param0) {
          dg.a(false);
        }
        if (bk.field_c == DualLinkNode.field_i) {
          return ce.field_d;
        }
        if (MouseWheelInput.field_c == DualLinkNode.field_i) {
          return ef.field_b;
        }
        if (!qa.field_c.b(12)) {
          return ef.field_b;
        }
        return AwtRasterBuffer.field_d;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(boolean param0, boolean param1) {
        long dupTemp$2 = 0L;
        if (!param1) {
          return true;
        }
        if (null == ModalDialog.field_H) {
          ModalDialog.field_H = vl.field_a.requestDirectSocket(nj.field_a, (byte) -58, AccountNameAvailabilityValidator.field_n);
        }
        if (0 == ModalDialog.field_H.status) {
          return false;
        }
        dupTemp$2 = rf.correctedCurrentTimeMillis(0);
        p.field_c = dupTemp$2;
        ta.field_e = dupTemp$2;
        if (ModalDialog.field_H.status != 1) {
        }
        AgeValidator.field_m = rh.field_r;
        ModalDialog.field_H = null;
        return true;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        RgbSprite var1 = new RgbSprite(540, 140);
        de.a(var1, 6);
        MeshRasterState.b();
        SoftwareRasterizer.clearRaster();
        mc.field_k = 0;
        rg.b(0);
        RgbSprite var2 = var1.copy();
        for (var3 = 0; var3 < 15; var3++) {
          var2.drawSilhouette(-2, -2, 16777215);
          SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
        }
        t.field_a.bindAsRenderTarget();
        var1.drawHalfSize(0, 0);
        if (param0 != 19681) {
          return;
        }
        try {
          pd.a(-22949);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "dg.C(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != -2) {
          return false;
        }
        stackIn_8_0 = (he.field_h == this) || (this == ug.field_q) || (gg.field_b == this);
        return stackIn_8_0;
    }

    static {
    }
}
