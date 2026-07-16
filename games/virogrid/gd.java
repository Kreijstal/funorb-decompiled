/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gd extends wf implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_s;
    private java.awt.image.ImageConsumer field_o;
    static wl field_r;
    static String field_p;
    static String field_q;
    static p field_n;

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((gd) this).field_o != param0)) {
            ((gd) this).field_o = null;
        }
    }

    public static void b(byte param0) {
        field_n = null;
        field_p = null;
        field_q = null;
        if (param0 < 67) {
            gd.b((byte) 93);
            field_r = null;
            return;
        }
        field_r = null;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((gd) this).addConsumer(param0);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((gd) this).field_o;
    }

    private final synchronized void b(int param0) {
        if (null == ((gd) this).field_o) {
          return;
        } else {
          ((gd) this).field_o.setPixels(0, 0, ((gd) this).field_c, ((gd) this).field_b, ((gd) this).field_s, ((gd) this).field_l, 0, ((gd) this).field_c);
          ((gd) this).field_o.imageComplete(param0);
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((gd) this).field_o = param0;
        param0.setDimensions(((gd) this).field_c, ((gd) this).field_b);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((gd) this).field_s);
        param0.setHints(14);
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        ((gd) this).field_l = new int[param0 * param1 - -1];
        ((gd) this).field_c = param1;
        ((gd) this).field_b = param0;
        if (param2 >= -24) {
          return;
        } else {
          ((gd) this).field_s = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          ((gd) this).field_h = param3.createImage((java.awt.image.ImageProducer) this);
          this.b(2);
          boolean discarded$3 = param3.prepareImage(((gd) this).field_h, (java.awt.image.ImageObserver) this);
          this.b(2);
          boolean discarded$4 = param3.prepareImage(((gd) this).field_h, (java.awt.image.ImageObserver) this);
          this.b(2);
          boolean discarded$5 = param3.prepareImage(((gd) this).field_h, (java.awt.image.ImageObserver) this);
          ((gd) this).a((byte) 29);
          return;
        }
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        Object var6 = null;
        if (param0 <= 6) {
          var6 = null;
          ((gd) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
          this.b(2);
          boolean discarded$4 = param2.drawImage(((gd) this).field_h, param1, param3, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.b(2);
          boolean discarded$5 = param2.drawImage(((gd) this).field_h, param1, param3, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    gd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new wl();
        field_p = "Security";
        field_q = "Shortcut Reference";
        field_n = new p();
    }
}
