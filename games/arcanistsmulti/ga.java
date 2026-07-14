/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga extends dk implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_t;
    static int[] field_s;
    static String field_q;
    static String field_n;
    private java.awt.image.ColorModel field_o;
    private java.awt.image.ImageConsumer field_p;
    static int field_r;

    public static void a(byte param0) {
        field_t = null;
        field_q = null;
        field_n = null;
        field_s = null;
        if (param0 != -109) {
            ga.a((byte) -48);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ga) this).field_p = param0;
        param0.setDimensions(((ga) this).field_e, ((ga) this).field_m);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ga) this).field_o);
        param0.setHints(14);
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        this.b((byte) -118);
        if (param2 != 0) {
          field_q = null;
          boolean discarded$4 = param1.drawImage(((ga) this).field_j, param3, param0, (java.awt.image.ImageObserver) this);
          return;
        } else {
          boolean discarded$5 = param1.drawImage(((ga) this).field_j, param3, param0, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            if (param2 != 0) {
              return;
            } else {
              ((ga) this).field_l = new int[param0 * param3 + 1];
              ((ga) this).field_e = param3;
              ((ga) this).field_m = param0;
              ((ga) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((ga) this).field_j = param1.createImage((java.awt.image.ImageProducer) this);
              this.b((byte) 115);
              boolean discarded$3 = param1.prepareImage(((ga) this).field_j, (java.awt.image.ImageObserver) this);
              this.b((byte) -93);
              boolean discarded$4 = param1.prepareImage(((ga) this).field_j, (java.awt.image.ImageObserver) this);
              this.b((byte) -97);
              boolean discarded$5 = param1.prepareImage(((ga) this).field_j, (java.awt.image.ImageObserver) this);
              ((ga) this).a(true);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((ga) this).field_p == param0;
    }

    final static boolean b(int param0) {
        if (param0 != 3236) {
            return false;
        }
        return !wn.field_z.a((byte) -84) ? true : false;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((ga) this).field_p)) {
            ((ga) this).field_p = null;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ga) this).addConsumer(param0);
    }

    ga() {
    }

    private final synchronized void b(byte param0) {
        int var2 = 83 % ((param0 - -44) / 43);
        if (!(null != ((ga) this).field_p)) {
            return;
        }
        ((ga) this).field_p.setPixels(0, 0, ((ga) this).field_e, ((ga) this).field_m, ((ga) this).field_o, ((ga) this).field_l, 0, ((ga) this).field_e);
        ((ga) this).field_p.imageComplete(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Create unrated game";
        field_q = "Please remove <%0> from your friend list first.";
        field_n = "Larry";
    }
}
