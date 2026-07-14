/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class si extends vj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static ci field_l;
    private java.awt.image.ImageConsumer field_m;
    static int field_n;
    static volatile int field_o;
    private java.awt.image.ColorModel field_k;

    public static void c(int param0) {
        field_l = null;
        int var1 = -63 % ((param0 - -32) / 55);
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((si) this).field_e = param3;
        int var5 = -68 % ((param1 - 16) / 60);
        ((si) this).field_b = new int[param2 * param3 - -1];
        ((si) this).field_i = param2;
        ((si) this).field_k = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((si) this).field_j = param0.createImage((java.awt.image.ImageProducer) this);
        this.e(126);
        boolean discarded$0 = param0.prepareImage(((si) this).field_j, (java.awt.image.ImageObserver) this);
        this.e(125);
        boolean discarded$1 = param0.prepareImage(((si) this).field_j, (java.awt.image.ImageObserver) this);
        this.e(98);
        boolean discarded$2 = param0.prepareImage(((si) this).field_j, (java.awt.image.ImageObserver) this);
        ((si) this).b(48);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((si) this).field_m)) {
            ((si) this).field_m = null;
        }
    }

    final static void d(int param0) {
        if (param0 != 65280) {
            return;
        }
        if (!(lj.field_a == null)) {
            lj.field_a.a(-1);
            lj.field_a = null;
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.e(118);
        if (param1 != 12105912) {
          si.c(65);
          boolean discarded$4 = param2.drawImage(((si) this).field_j, param0, param3, (java.awt.image.ImageObserver) this);
          return;
        } else {
          boolean discarded$5 = param2.drawImage(((si) this).field_j, param0, param3, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    final static String f(int param0) {
        if (g.field_a == ci.field_ub) {
            return ih.field_Q;
        }
        if (param0 != 1633075718) {
            return null;
        }
        return gg.field_a;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, -68);
        var2.field_l = var2.field_l + 1;
        int var3 = -54 % ((param0 - 63) / 36);
        int var4 = var2.field_l;
        var2.c(5, (byte) -79);
        var2.c(pd.field_Rb.field_hc, (byte) 66);
        int var5 = (pd.field_Rb.field_Mb << 1633075718) + pd.field_Rb.field_ic;
        var2.c(var5, (byte) -62);
        var2.a(pd.field_Rb.field_sc, (byte) -45, 0, pd.field_Rb.field_sc.length);
        var2.a(var2.field_l - var4, -1);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((si) this).addConsumer(param0);
    }

    private final synchronized void e(int param0) {
        if (param0 >= 97) {
          if (null == ((si) this).field_m) {
            return;
          } else {
            ((si) this).field_m.setPixels(0, 0, ((si) this).field_e, ((si) this).field_i, ((si) this).field_k, ((si) this).field_b, 0, ((si) this).field_e);
            ((si) this).field_m.imageComplete(2);
            return;
          }
        } else {
          si.a((byte) 127);
          if (null == ((si) this).field_m) {
            return;
          } else {
            ((si) this).field_m.setPixels(0, 0, ((si) this).field_e, ((si) this).field_i, ((si) this).field_k, ((si) this).field_b, 0, ((si) this).field_e);
            ((si) this).field_m.imageComplete(2);
            return;
          }
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((si) this).field_m;
    }

    final static void a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -52) {
          L0: {
            field_n = -122;
            qf.field_b = false;
            if (tk.field_h.i(-122) != 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          kh.field_o = stackIn_8_0 != 0;
          return;
        } else {
          L1: {
            qf.field_b = false;
            if (tk.field_h.i(-122) != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          kh.field_o = stackIn_4_0 != 0;
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((si) this).field_m = param0;
        param0.setDimensions(((si) this).field_e, ((si) this).field_i);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((si) this).field_k);
        param0.setHints(14);
    }

    si() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
