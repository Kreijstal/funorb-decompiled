/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cd extends rb implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static char[] field_m;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_p;
    static String field_k;
    static String field_n;
    static int[] field_j;
    static nf[] field_o;

    public static void a(int param0) {
        if (param0 > -40) {
          cd.a(32);
          field_o = null;
          field_k = null;
          field_n = null;
          field_j = null;
          field_m = null;
          return;
        } else {
          field_o = null;
          field_k = null;
          field_n = null;
          field_j = null;
          field_m = null;
          return;
        }
    }

    final static boolean c(byte param0) {
        if (param0 != 6) {
            field_j = null;
            return dh.field_vb.a(false);
        }
        return dh.field_vb.a(false);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((cd) this).field_l != param0)) {
            ((cd) this).field_l = null;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        this.d((byte) 126);
        int var5 = 57 / ((param0 - 36) / 52);
        boolean discarded$0 = param1.drawImage(((cd) this).field_e, param3, param2, (java.awt.image.ImageObserver) this);
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            ((cd) this).field_f = new int[1 + param1 * param3];
            ((cd) this).field_b = param1;
            ((cd) this).field_c = param3;
            if (param2 > -53) {
              return;
            } else {
              ((cd) this).field_p = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((cd) this).field_e = param0.createImage((java.awt.image.ImageProducer) this);
              this.d((byte) 120);
              boolean discarded$3 = param0.prepareImage(((cd) this).field_e, (java.awt.image.ImageObserver) this);
              this.d((byte) 125);
              boolean discarded$4 = param0.prepareImage(((cd) this).field_e, (java.awt.image.ImageObserver) this);
              this.d((byte) 116);
              boolean discarded$5 = param0.prepareImage(((cd) this).field_e, (java.awt.image.ImageObserver) this);
              ((cd) this).a((byte) 106);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((cd) this).field_l = param0;
        param0.setDimensions(((cd) this).field_b, ((cd) this).field_c);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((cd) this).field_p);
        param0.setHints(14);
    }

    private final synchronized void d(byte param0) {
        if (param0 <= 103) {
            return;
        }
        if (!(((cd) this).field_l != null)) {
            return;
        }
        ((cd) this).field_l.setPixels(0, 0, ((cd) this).field_b, ((cd) this).field_c, ((cd) this).field_p, ((cd) this).field_f, 0, ((cd) this).field_b);
        ((cd) this).field_l.imageComplete(2);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((cd) this).field_l == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    cd() {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((cd) this).addConsumer(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_n = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_j = new int[]{0, 60, 0, 120};
        field_k = "The journey went smoothly.#You have reached the fifth planet#of the system of Yonderia.";
    }
}
