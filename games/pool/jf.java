/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jf extends iq implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_q;
    static String field_n;
    static String field_o;
    private java.awt.image.ImageConsumer field_p;
    private java.awt.image.ColorModel field_m;

    final static void a(eg param0, byte param1) {
        int[] var2 = null;
        int[] var3 = null;
        var3 = param0.field_v;
        var2 = var3;
        param0.field_v = param0.field_X;
        if (param1 != 38) {
          field_n = null;
          param0.field_X = var3;
          return;
        } else {
          param0.field_X = var3;
          return;
        }
    }

    private final synchronized void d(int param0) {
        if (null == ((jf) this).field_p) {
          return;
        } else {
          L0: {
            ((jf) this).field_p.setPixels(0, 0, ((jf) this).field_e, ((jf) this).field_k, ((jf) this).field_m, ((jf) this).field_h, 0, ((jf) this).field_e);
            ((jf) this).field_p.imageComplete(2);
            if (param0 > 59) {
              break L0;
            } else {
              field_n = null;
              break L0;
            }
          }
          return;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((jf) this).addConsumer(param0);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public static void c(int param0) {
        if (param0 != 2) {
          jf.c(-27);
          field_n = null;
          field_q = null;
          field_o = null;
          return;
        } else {
          field_n = null;
          field_q = null;
          field_o = null;
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        this.d(60);
        if (param3 != -23820) {
            return;
        }
        boolean discarded$0 = param0.drawImage(((jf) this).field_c, param1, param2, (java.awt.image.ImageObserver) this);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((jf) this).field_p == param0;
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        ((jf) this).field_h = new int[1 + param0 * param1];
        ((jf) this).field_e = param1;
        ((jf) this).field_k = param0;
        ((jf) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((jf) this).field_c = param3.createImage((java.awt.image.ImageProducer) this);
        this.d(84);
        boolean discarded$0 = param3.prepareImage(((jf) this).field_c, (java.awt.image.ImageObserver) this);
        this.d(105);
        boolean discarded$1 = param3.prepareImage(((jf) this).field_c, (java.awt.image.ImageObserver) this);
        this.d(65);
        boolean discarded$9 = param3.prepareImage(((jf) this).field_c, (java.awt.image.ImageObserver) this);
        ((jf) this).b(15100);
        if (param2 != -6980) {
            jf.c(68);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((jf) this).field_p = param0;
        param0.setDimensions(((jf) this).field_e, ((jf) this).field_k);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((jf) this).field_m);
        param0.setHints(14);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((jf) this).field_p != param0)) {
            ((jf) this).field_p = null;
        }
    }

    jf() {
    }

    final static eh a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = Pool.field_O;
        eh var5 = (eh) (Object) wg.field_Lb.c((byte) 118);
        while (var5 != null) {
            if (!(var5.field_A != param2)) {
                return var5;
            }
            var5 = (eh) (Object) wg.field_Lb.f((byte) -5);
        }
        eh var5_ref = new eh();
        var5_ref.field_A = param2;
        int var6 = -73 / ((param0 - 60) / 49);
        var5_ref.field_r = param4;
        var5_ref.field_v = param1;
        wg.field_Lb.b((byte) -24, (ma) (Object) var5_ref);
        ub.a(var5_ref, param3, (byte) -117);
        return var5_ref;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Play";
        field_o = null;
        field_n = "Played";
    }
}
