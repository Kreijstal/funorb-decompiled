/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends ce implements java.awt.image.ImageProducer {
    static wb[] field_v;
    static int field_r;
    private java.awt.image.ColorModel field_s;
    static int field_u;
    private java.awt.Image field_x;
    private java.awt.image.ImageConsumer field_t;
    static String field_y;
    private java.awt.Canvas field_w;

    final static Boolean c(int param0) {
        Boolean var1 = aw.field_j;
        aw.field_j = null;
        int var2 = -13 % ((8 - param0) / 32);
        return var1;
    }

    private final synchronized void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (null != ((li) this).field_t) {
          ((li) this).field_t.setPixels(param1, param0, param2, param4, ((li) this).field_s, ((li) this).field_m, ((li) this).field_n * param0 + param1, ((li) this).field_n);
          if (!param3) {
            field_v = null;
            ((li) this).field_t.imageComplete(2);
            return;
          } else {
            ((li) this).field_t.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    private final synchronized void c(boolean param0) {
        if (((li) this).field_t == null) {
          return;
        } else {
          if (!param0) {
            field_v = null;
            ((li) this).field_t.setPixels(0, 0, ((li) this).field_n, ((li) this).field_k, ((li) this).field_s, ((li) this).field_m, 0, ((li) this).field_n);
            ((li) this).field_t.imageComplete(2);
            return;
          } else {
            ((li) this).field_t.setPixels(0, 0, ((li) this).field_n, ((li) this).field_k, ((li) this).field_s, ((li) this).field_m, 0, ((li) this).field_n);
            ((li) this).field_t.imageComplete(2);
            return;
          }
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((li) this).field_t == param0) {
            ((li) this).field_t = null;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void d(int param0) {
        if (param0 < 118) {
            return;
        }
        field_v = null;
        field_y = null;
    }

    final void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        ((li) this).field_k = param1;
        ((li) this).field_n = param2;
        ((li) this).field_w = param0;
        ((li) this).field_m = new int[((li) this).field_n * ((li) this).field_k];
        ((li) this).field_s = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((li) this).field_x = ((li) this).field_w.createImage((java.awt.image.ImageProducer) this);
        this.c(true);
        boolean discarded$0 = ((li) this).field_w.prepareImage(((li) this).field_x, (java.awt.image.ImageObserver) (Object) ((li) this).field_w);
        int var5 = 85 / ((-34 - param3) / 39);
        this.c(true);
        boolean discarded$1 = ((li) this).field_w.prepareImage(((li) this).field_x, (java.awt.image.ImageObserver) (Object) ((li) this).field_w);
        this.c(true);
        boolean discarded$2 = ((li) this).field_w.prepareImage(((li) this).field_x, (java.awt.image.ImageObserver) (Object) ((li) this).field_w);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((li) this).field_t;
    }

    li() {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((li) this).addConsumer(param0);
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        java.awt.Shape var9 = null;
        Object var10 = null;
        this.a(param2, param4, param3, true, param5);
        if (param7 >= -47) {
          var10 = null;
          ((li) this).a((java.awt.Canvas) null, -85, -107, 85);
          var9 = param0.getClip();
          param0.clipRect(param6, param1, param3, param5);
          boolean discarded$2 = param0.drawImage(((li) this).field_x, -param4 + param6, -param2 + param1, (java.awt.image.ImageObserver) (Object) ((li) this).field_w);
          param0.setClip(var9);
          return;
        } else {
          var9 = param0.getClip();
          param0.clipRect(param6, param1, param3, param5);
          boolean discarded$3 = param0.drawImage(((li) this).field_x, -param4 + param6, -param2 + param1, (java.awt.image.ImageObserver) (Object) ((li) this).field_w);
          param0.setClip(var9);
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((li) this).field_t = param0;
        param0.setDimensions(((li) this).field_n, ((li) this).field_k);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((li) this).field_s);
        param0.setHints(14);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = -1;
        field_y = "Loading...";
    }
}
