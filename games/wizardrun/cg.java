/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cg extends df implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static int[] field_k;
    private java.awt.image.ColorModel field_l;
    static int[] field_m;
    private java.awt.image.ImageConsumer field_j;
    static int[] field_n;
    static String[] field_o;

    private final synchronized void c(int param0) {
        if (!(null != ((cg) this).field_j)) {
            return;
        }
        ((cg) this).field_j.setPixels(0, 0, ((cg) this).field_d, ((cg) this).field_h, ((cg) this).field_l, ((cg) this).field_f, param0, ((cg) this).field_d);
        ((cg) this).field_j.imageComplete(2);
    }

    final static boolean c(byte param0) {
        if (param0 == 54) {
          if (!e.a(-111)) {
            if (f.field_e) {
              if (e.field_a) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_o = null;
        field_n = null;
        field_m = null;
        if (param0 != 0) {
            field_m = null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((cg) this).field_j = param0;
        param0.setDimensions(((cg) this).field_d, ((cg) this).field_h);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((cg) this).field_l);
        param0.setHints(14);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((cg) this).field_j) {
            ((cg) this).field_j = null;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((cg) this).addConsumer(param0);
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        this.c(0);
        boolean discarded$9 = param0.drawImage(((cg) this).field_g, param2, param3, (java.awt.image.ImageObserver) this);
        if (param1 != -29402) {
            Object var6 = null;
            boolean discarded$10 = ((cg) this).imageUpdate((java.awt.Image) null, -29, -34, 122, 69, 70);
        }
    }

    final void a(byte param0, int param1, java.awt.Component param2, int param3) {
        ((cg) this).field_h = param1;
        ((cg) this).field_f = new int[param1 * param3 + 1];
        ((cg) this).field_d = param3;
        ((cg) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((cg) this).field_g = param2.createImage((java.awt.image.ImageProducer) this);
        this.c(0);
        boolean discarded$0 = param2.prepareImage(((cg) this).field_g, (java.awt.image.ImageObserver) this);
        int var5 = -33 / ((-53 - param0) / 36);
        this.c(0);
        boolean discarded$1 = param2.prepareImage(((cg) this).field_g, (java.awt.image.ImageObserver) this);
        this.c(0);
        boolean discarded$2 = param2.prepareImage(((cg) this).field_g, (java.awt.image.ImageObserver) this);
        ((cg) this).b(91);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    cg() {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((cg) this).field_j == param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[8192];
        field_o = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
