/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ub extends rc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_f;
    static ja field_e;
    private java.awt.image.ImageConsumer field_g;

    private final synchronized void b(int param0) {
        if (!(null != ((ub) this).field_g)) {
            return;
        }
        int var2 = -102 % ((15 - param0) / 43);
        ((ub) this).field_g.setPixels(0, 0, ((ub) this).field_c, ((ub) this).field_a, ((ub) this).field_f, ((ub) this).field_b, 0, ((ub) this).field_c);
        ((ub) this).field_g.imageComplete(2);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 12) {
            field_e = null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        Object var6 = null;
        ((ub) this).field_b = new int[param3 * param0 + 1];
        ((ub) this).field_c = param0;
        ((ub) this).field_a = param3;
        ((ub) this).field_f = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((ub) this).field_d = param2.createImage((java.awt.image.ImageProducer) this);
        this.b(81);
        if (param1 > -37) {
          var6 = null;
          ((ub) this).a(114, (java.awt.Graphics) null, 91, 59);
          boolean discarded$6 = param2.prepareImage(((ub) this).field_d, (java.awt.image.ImageObserver) this);
          this.b(101);
          boolean discarded$7 = param2.prepareImage(((ub) this).field_d, (java.awt.image.ImageObserver) this);
          this.b(-64);
          boolean discarded$8 = param2.prepareImage(((ub) this).field_d, (java.awt.image.ImageObserver) this);
          ((ub) this).a(-91);
          return;
        } else {
          boolean discarded$9 = param2.prepareImage(((ub) this).field_d, (java.awt.image.ImageObserver) this);
          this.b(101);
          boolean discarded$10 = param2.prepareImage(((ub) this).field_d, (java.awt.image.ImageObserver) this);
          this.b(-64);
          boolean discarded$11 = param2.prepareImage(((ub) this).field_d, (java.awt.image.ImageObserver) this);
          ((ub) this).a(-91);
          return;
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((ub) this).field_g == param0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ub) this).field_g = param0;
        param0.setDimensions(((ub) this).field_c, ((ub) this).field_a);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ub) this).field_f);
        param0.setHints(14);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ub) this).addConsumer(param0);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((ub) this).field_g)) {
            ((ub) this).field_g = null;
        }
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        this.b(-29);
        boolean discarded$9 = param1.drawImage(((ub) this).field_d, param2, param3, (java.awt.image.ImageObserver) this);
        if (param0 != -11) {
            ((ub) this).field_g = null;
        }
    }

    ub() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ja();
    }
}
