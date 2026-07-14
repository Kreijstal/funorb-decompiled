/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wa extends sm implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static bd field_n;
    private java.awt.image.ColorModel field_j;
    static String field_l;
    static bd field_o;
    private java.awt.image.ImageConsumer field_m;
    static int field_p;
    static ue field_q;
    static int field_k;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((wa) this).field_m == param0) {
            ((wa) this).field_m = null;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void a(int param0) {
        if (param0 != -1) {
            return;
        }
        if (!(null != ((wa) this).field_m)) {
            return;
        }
        ((wa) this).field_m.setPixels(0, 0, ((wa) this).field_b, ((wa) this).field_e, ((wa) this).field_j, ((wa) this).field_f, 0, ((wa) this).field_b);
        ((wa) this).field_m.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((wa) this).addConsumer(param0);
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        return true;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((wa) this).field_m = param0;
        param0.setDimensions(((wa) this).field_b, ((wa) this).field_e);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((wa) this).field_j);
        param0.setHints(14);
    }

    final void a(int param0, byte param1, int param2, java.awt.Graphics param3) {
        if (param1 >= -124) {
          field_q = null;
          this.a(-1);
          boolean discarded$4 = param3.drawImage(((wa) this).field_c, param0, param2, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.a(-1);
          boolean discarded$5 = param3.drawImage(((wa) this).field_c, param0, param2, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Object var6 = null;
            ((wa) this).field_f = new int[1 + param0 * param3];
            ((wa) this).field_b = param3;
            ((wa) this).field_e = param0;
            ((wa) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((wa) this).field_c = param1.createImage((java.awt.image.ImageProducer) this);
            this.a(-1);
            if (param2 != 9484) {
              var6 = null;
              ((wa) this).startProduction((java.awt.image.ImageConsumer) null);
              boolean discarded$6 = param1.prepareImage(((wa) this).field_c, (java.awt.image.ImageObserver) this);
              this.a(-1);
              boolean discarded$7 = param1.prepareImage(((wa) this).field_c, (java.awt.image.ImageObserver) this);
              this.a(param2 + -9485);
              boolean discarded$8 = param1.prepareImage(((wa) this).field_c, (java.awt.image.ImageObserver) this);
              ((wa) this).b((byte) 116);
              return;
            } else {
              boolean discarded$9 = param1.prepareImage(((wa) this).field_c, (java.awt.image.ImageObserver) this);
              this.a(-1);
              boolean discarded$10 = param1.prepareImage(((wa) this).field_c, (java.awt.image.ImageObserver) this);
              this.a(param2 + -9485);
              boolean discarded$11 = param1.prepareImage(((wa) this).field_c, (java.awt.image.ImageObserver) this);
              ((wa) this).b((byte) 116);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    wa() {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public static void c(byte param0) {
        field_n = null;
        field_o = null;
        if (param0 <= 2) {
          field_k = -19;
          field_q = null;
          field_l = null;
          return;
        } else {
          field_q = null;
          field_l = null;
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            return true;
        }
        return -1 > (wb.field_R ^ -1) ? true : false;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((wa) this).field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "If you do nothing the game will revert to normal view in <%0> second.";
        field_p = 0;
        field_k = -1;
    }
}
