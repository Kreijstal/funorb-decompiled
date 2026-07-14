/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends fh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_i;
    static byte[] field_h;
    static int field_g;
    private java.awt.image.ColorModel field_j;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        mj var4 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 == -34) {
          var4 = (mj) (Object) nd.field_b.b((byte) -77);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              nk.a(param1, var4, 14);
              var4 = (mj) (Object) nd.field_b.d(853);
              continue L0;
            }
          }
        } else {
          ij.a((byte) -53, 0);
          var4 = (mj) (Object) nd.field_b.b((byte) -77);
          L1: while (true) {
            if (var4 == null) {
              return;
            } else {
              nk.a(param1, var4, 14);
              var4 = (mj) (Object) nd.field_b.d(853);
              continue L1;
            }
          }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ij) this).field_i = param0;
        param0.setDimensions(((ij) this).field_e, ((ij) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ij) this).field_j);
        param0.setHints(14);
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        ((ij) this).field_f = param1;
        ((ij) this).field_d = new int[param1 * param2 + 1];
        ((ij) this).field_e = param2;
        ((ij) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((ij) this).field_a = param3.createImage((java.awt.image.ImageProducer) this);
        this.c(-123);
        boolean discarded$0 = param3.prepareImage(((ij) this).field_a, (java.awt.image.ImageObserver) this);
        this.c(-123);
        boolean discarded$1 = param3.prepareImage(((ij) this).field_a, (java.awt.image.ImageObserver) this);
        this.c(-126);
        boolean discarded$2 = param3.prepareImage(((ij) this).field_a, (java.awt.image.ImageObserver) this);
        int var5 = -113 / ((0 - param0) / 52);
        ((ij) this).a(-40);
    }

    final static void b(int param0) {
        vh.field_q[4] = new int[1];
        nc.field_cb[4] = new ja(4);
        kg.a(30, 468, 32, (byte) -128, new int[4], 2, 400);
        nc.field_cb[2] = new ja(2);
        if (param0 < tc.field_b) {
          if (ug.a((byte) 94, wc.field_c)) {
            kg.a(50, 288, 32, (byte) -96, new int[7], 1, 200);
            nc.field_cb[1] = new ja(1);
            vh.field_q[8] = new int[7];
            nc.field_cb[8] = new ja(8);
            if (-1 > (tc.field_b ^ -1)) {
              if ((bk.field_e ^ -1) != -8) {
                return;
              } else {
                bk.field_e = 0;
                return;
              }
            } else {
              return;
            }
          } else {
            vh.field_q[8] = new int[7];
            nc.field_cb[8] = new ja(8);
            if (-1 > (tc.field_b ^ -1)) {
              if ((bk.field_e ^ -1) != -8) {
                return;
              } else {
                bk.field_e = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          vh.field_q[8] = new int[7];
          nc.field_cb[8] = new ja(8);
          if (-1 > (tc.field_b ^ -1)) {
            if ((bk.field_e ^ -1) != -8) {
              return;
            } else {
              bk.field_e = 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ij) this).addConsumer(param0);
    }

    final static void a(int param0, String param1, hj param2) {
        if (param0 > -26) {
            field_h = null;
            hc.field_l = param2;
            pj.field_k = param1;
            return;
        }
        hc.field_l = param2;
        pj.field_k = param1;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void b(byte param0) {
        if (param0 <= 49) {
            ij.b(87);
            field_h = null;
            return;
        }
        field_h = null;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    private final synchronized void c(int param0) {
        if (param0 > -119) {
            field_h = null;
            if (!(((ij) this).field_i != null)) {
                return;
            }
            ((ij) this).field_i.setPixels(0, 0, ((ij) this).field_e, ((ij) this).field_f, ((ij) this).field_j, ((ij) this).field_d, 0, ((ij) this).field_e);
            ((ij) this).field_i.imageComplete(2);
            return;
        }
        if (!(((ij) this).field_i != null)) {
            return;
        }
        ((ij) this).field_i.setPixels(0, 0, ((ij) this).field_e, ((ij) this).field_f, ((ij) this).field_j, ((ij) this).field_d, 0, ((ij) this).field_e);
        ((ij) this).field_i.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((ij) this).field_i == param0) {
            ((ij) this).field_i = null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((ij) this).field_i;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, boolean param3) {
        this.c(-122);
        boolean discarded$9 = param2.drawImage(((ij) this).field_a, param0, param1, (java.awt.image.ImageObserver) this);
        if (!param3) {
            field_g = -68;
        }
    }

    ij() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 256;
    }
}
