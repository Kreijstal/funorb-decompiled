/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sn extends kn implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_j;
    private java.awt.image.ImageConsumer field_k;
    static int field_i;

    final void a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
            ((sn) this).field_d = new int[1 + param3 * param2];
            ((sn) this).field_a = param2;
            ((sn) this).field_g = param3;
            ((sn) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((sn) this).field_c = param0.createImage((java.awt.image.ImageProducer) this);
            this.b(0);
            boolean discarded$5 = param0.prepareImage(((sn) this).field_c, (java.awt.image.ImageObserver) this);
            this.b(param1 ^ 24);
            if (param1 != 24) {
              ((sn) this).field_j = null;
              boolean discarded$6 = param0.prepareImage(((sn) this).field_c, (java.awt.image.ImageObserver) this);
              this.b(0);
              boolean discarded$7 = param0.prepareImage(((sn) this).field_c, (java.awt.image.ImageObserver) this);
              ((sn) this).a(-104);
              return;
            } else {
              boolean discarded$8 = param0.prepareImage(((sn) this).field_c, (java.awt.image.ImageObserver) this);
              this.b(0);
              boolean discarded$9 = param0.prepareImage(((sn) this).field_c, (java.awt.image.ImageObserver) this);
              ((sn) this).a(-104);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((sn) this).field_k;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        this.b(0);
        if (param0 <= 70) {
          field_i = -86;
          boolean discarded$4 = param3.drawImage(((sn) this).field_c, param1, param2, (java.awt.image.ImageObserver) this);
          return;
        } else {
          boolean discarded$5 = param3.drawImage(((sn) this).field_c, param1, param2, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((sn) this).field_k = param0;
        param0.setDimensions(((sn) this).field_g, ((sn) this).field_a);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((sn) this).field_j);
        param0.setHints(14);
    }

    final static void b(byte param0) {
        oe.a(false, 0, false);
        if (param0 != 88) {
            field_i = -89;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((sn) this).addConsumer(param0);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((sn) this).field_k == param0) {
            ((sn) this).field_k = null;
        }
    }

    sn() {
    }

    private final synchronized void b(int param0) {
        if (!(((sn) this).field_k != null)) {
            return;
        }
        ((sn) this).field_k.setPixels(0, 0, ((sn) this).field_g, ((sn) this).field_a, ((sn) this).field_j, ((sn) this).field_d, param0, ((sn) this).field_g);
        ((sn) this).field_k.imageComplete(2);
    }

    static {
    }
}
