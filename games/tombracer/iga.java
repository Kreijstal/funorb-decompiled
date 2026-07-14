/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iga extends ija implements java.awt.image.ImageProducer {
    private java.awt.image.ColorModel field_j;
    static int[] field_m;
    private java.awt.Canvas field_p;
    private java.awt.image.ImageConsumer field_n;
    private java.awt.Image field_l;
    static String field_k;
    static ssa field_o;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void b(int param0) {
        if (((iga) this).field_n == null) {
          return;
        } else {
          ((iga) this).field_n.setPixels(0, param0, ((iga) this).field_h, ((iga) this).field_f, ((iga) this).field_j, ((iga) this).field_g, 0, ((iga) this).field_h);
          ((iga) this).field_n.imageComplete(2);
          return;
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_k = null;
        int var1 = 126 / ((23 - param0) / 51);
        field_o = null;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((iga) this).field_n = param0;
        param0.setDimensions(((iga) this).field_h, ((iga) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((iga) this).field_j);
        param0.setHints(14);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((iga) this).field_n) {
            ((iga) this).field_n = null;
        }
    }

    private final synchronized void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          if (((iga) this).field_n == null) {
            return;
          } else {
            ((iga) this).field_n.setPixels(param3, param0, param2, param1, ((iga) this).field_j, ((iga) this).field_g, param0 * ((iga) this).field_h - -param3, ((iga) this).field_h);
            ((iga) this).field_n.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    iga() {
    }

    final void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        ((iga) this).field_p = param0;
        ((iga) this).field_h = param1;
        ((iga) this).field_f = param3;
        ((iga) this).field_g = new int[((iga) this).field_h * ((iga) this).field_f];
        ((iga) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((iga) this).field_l = ((iga) this).field_p.createImage((java.awt.image.ImageProducer) this);
        this.b(0);
        boolean discarded$0 = ((iga) this).field_p.prepareImage(((iga) this).field_l, (java.awt.image.ImageObserver) (Object) ((iga) this).field_p);
        this.b(param2 ^ param2);
        boolean discarded$1 = ((iga) this).field_p.prepareImage(((iga) this).field_l, (java.awt.image.ImageObserver) (Object) ((iga) this).field_p);
        this.b(param2 + -11329);
        boolean discarded$2 = ((iga) this).field_p.prepareImage(((iga) this).field_l, (java.awt.image.ImageObserver) (Object) ((iga) this).field_p);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, java.awt.Graphics param6, int param7) {
        java.awt.Shape var9 = null;
        if (param3 < 61) {
          iga.a(90);
          this.a(param4, param0, param7, param2, true);
          var9 = param6.getClip();
          param6.clipRect(param5, param1, param7, param0);
          boolean discarded$2 = param6.drawImage(((iga) this).field_l, param5 - param2, -param4 + param1, (java.awt.image.ImageObserver) (Object) ((iga) this).field_p);
          param6.setClip(var9);
          return;
        } else {
          this.a(param4, param0, param7, param2, true);
          var9 = param6.getClip();
          param6.clipRect(param5, param1, param7, param0);
          boolean discarded$3 = param6.drawImage(((iga) this).field_l, param5 - param2, -param4 + param1, (java.awt.image.ImageObserver) (Object) ((iga) this).field_p);
          param6.setClip(var9);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((iga) this).field_n == param0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((iga) this).addConsumer(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Show lobby chat from my friends";
    }
}
