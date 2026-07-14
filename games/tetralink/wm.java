/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wm extends wd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static java.awt.Image field_p;
    private java.awt.image.ColorModel field_o;
    static int field_l;
    static String[] field_n;
    private java.awt.image.ImageConsumer field_m;

    final static boolean d(int param0) {
        if (param0 != 2) {
          field_p = null;
          return d.a(-17840, lk.q(param0 + 11));
        } else {
          return d.a(-17840, lk.q(param0 + 11));
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((wm) this).field_m == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            ((wm) this).field_j = param3;
            ((wm) this).field_h = param2;
            ((wm) this).field_g = new int[1 + param3 * param2];
            ((wm) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((wm) this).field_c = param0.createImage((java.awt.image.ImageProducer) this);
            this.e(param1 + -103);
            boolean discarded$12 = param0.prepareImage(((wm) this).field_c, (java.awt.image.ImageObserver) this);
            this.e(-72);
            boolean discarded$13 = param0.prepareImage(((wm) this).field_c, (java.awt.image.ImageObserver) this);
            if (param1 != 42) {
              return;
            } else {
              this.e(-115);
              boolean discarded$14 = param0.prepareImage(((wm) this).field_c, (java.awt.image.ImageObserver) this);
              ((wm) this).a(63);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        this.e(-109);
        boolean discarded$9 = param3.drawImage(((wm) this).field_c, param2, param1, (java.awt.image.ImageObserver) this);
        if (param0 != 10) {
            Object var6 = null;
            ((wm) this).startProduction((java.awt.image.ImageConsumer) null);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static oh[] a(byte param0, int param1, int param2) {
        if (param0 != 28) {
          oh[] discarded$2 = wm.a(false, -66, 87, -112);
          return g.a(param2, param1, 1, (byte) 64);
        } else {
          return g.a(param2, param1, 1, (byte) 64);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((wm) this).field_m = param0;
        param0.setDimensions(((wm) this).field_h, ((wm) this).field_j);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((wm) this).field_o);
        param0.setHints(14);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((wm) this).field_m != param0)) {
            ((wm) this).field_m = null;
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            boolean discarded$0 = wm.c(52);
            field_p = null;
            field_n = null;
            return;
        }
        field_p = null;
        field_n = null;
    }

    private final synchronized void e(int param0) {
        if (((wm) this).field_m != null) {
          if (param0 >= -52) {
            boolean discarded$2 = wm.b(64);
            ((wm) this).field_m.setPixels(0, 0, ((wm) this).field_h, ((wm) this).field_j, ((wm) this).field_o, ((wm) this).field_g, 0, ((wm) this).field_h);
            ((wm) this).field_m.imageComplete(2);
            return;
          } else {
            ((wm) this).field_m.setPixels(0, 0, ((wm) this).field_h, ((wm) this).field_j, ((wm) this).field_o, ((wm) this).field_g, 0, ((wm) this).field_h);
            ((wm) this).field_m.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    wm() {
    }

    final static oh[] a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            return null;
        }
        return bd.a(param1, 1, param2, param3, (byte) 126);
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        return true;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((wm) this).addConsumer(param0);
    }

    final static boolean c(int param0) {
        if (param0 == -14688) {
          if (null != wa.field_e) {
            if (!qi.field_p.a((byte) 108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_n = null;
          if (null != wa.field_e) {
            if (!qi.field_p.a((byte) 108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
