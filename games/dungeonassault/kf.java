/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kf extends c implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_l;
    static eh field_j;
    static pn field_m;
    static cn field_k;
    static String field_q;
    static String field_i;
    static qg field_o;
    static nh field_p;
    private java.awt.image.ImageConsumer field_n;

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 > -75) {
            return -59;
        }
        return 30;
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
          field_j = null;
          field_k = null;
          field_j = null;
          field_i = null;
          field_o = null;
          field_p = null;
          field_m = null;
          return;
        } else {
          field_k = null;
          field_j = null;
          field_i = null;
          field_o = null;
          field_p = null;
          field_m = null;
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((kf) this).addConsumer(param0);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((kf) this).field_n = param0;
        param0.setDimensions(((kf) this).field_b, ((kf) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((kf) this).field_l);
        param0.setHints(14);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((kf) this).field_n;
    }

    private final synchronized void b(int param0) {
        if (!(((kf) this).field_n != null)) {
            return;
        }
        ((kf) this).field_n.setPixels(param0, 0, ((kf) this).field_b, ((kf) this).field_f, ((kf) this).field_l, ((kf) this).field_g, 0, ((kf) this).field_b);
        ((kf) this).field_n.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((kf) this).field_n) {
            ((kf) this).field_n = null;
        }
    }

    final void a(int param0, boolean param1, java.awt.Graphics param2, int param3) {
        this.b(0);
        boolean discarded$9 = param2.drawImage(((kf) this).field_a, param0, param3, (java.awt.image.ImageObserver) this);
        if (!param1) {
            Object var6 = null;
            ((kf) this).a(-93, true, (java.awt.Graphics) null, -124);
        }
    }

    final void a(byte param0, java.awt.Component param1, int param2, int param3) {
        ((kf) this).field_b = param3;
        ((kf) this).field_f = param2;
        ((kf) this).field_g = new int[param3 * param2 - -1];
        ((kf) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((kf) this).field_a = param1.createImage((java.awt.image.ImageProducer) this);
        this.b(0);
        boolean discarded$0 = param1.prepareImage(((kf) this).field_a, (java.awt.image.ImageObserver) this);
        this.b(0);
        boolean discarded$1 = param1.prepareImage(((kf) this).field_a, (java.awt.image.ImageObserver) this);
        int var5 = -26 % ((-15 - param0) / 33);
        this.b(0);
        boolean discarded$2 = param1.prepareImage(((kf) this).field_a, (java.awt.image.ImageObserver) this);
        ((kf) this).a(true);
    }

    kf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Hell Beast";
        field_i = "Sorceress";
    }
}
