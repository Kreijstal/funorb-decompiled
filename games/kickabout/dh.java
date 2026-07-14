/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh extends og implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_l;
    static String field_m;
    private java.awt.image.ImageConsumer field_f;
    static String field_k;
    static String[] field_j;
    static int[] field_i;
    static String field_g;
    private java.awt.image.ColorModel field_h;

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        if (param1 != 10) {
          this.b((byte) 4);
          this.b((byte) -104);
          boolean discarded$4 = param3.drawImage(((dh) this).field_d, param2, param0, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.b((byte) -104);
          boolean discarded$5 = param3.drawImage(((dh) this).field_d, param2, param0, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            ((dh) this).field_e = param2;
            ((dh) this).field_a = param1;
            ((dh) this).field_b = new int[param1 * param2 - -1];
            ((dh) this).field_h = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((dh) this).field_d = param3.createImage((java.awt.image.ImageProducer) this);
            this.b((byte) 119);
            boolean discarded$12 = param3.prepareImage(((dh) this).field_d, (java.awt.image.ImageObserver) this);
            this.b((byte) -127);
            boolean discarded$13 = param3.prepareImage(((dh) this).field_d, (java.awt.image.ImageObserver) this);
            this.b((byte) 116);
            boolean discarded$14 = param3.prepareImage(((dh) this).field_d, (java.awt.image.ImageObserver) this);
            if (param0 != 30) {
              return;
            } else {
              ((dh) this).b(32);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((dh) this).field_f = param0;
        param0.setDimensions(((dh) this).field_a, ((dh) this).field_e);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((dh) this).field_h);
        param0.setHints(14);
    }

    final static sj a(byte param0, int param1) {
        Object var3 = null;
        if (param0 > -124) {
          var3 = null;
          dh.a(81, 114, (iw) null, 122, 17);
          return uj.a(param1, (byte) -58, 1, false, false, true);
        } else {
          return uj.a(param1, (byte) -58, 1, false, false, true);
        }
    }

    private final synchronized void b(byte param0) {
        int var2 = 0;
        var2 = -79 % ((62 - param0) / 32);
        if (null == ((dh) this).field_f) {
          return;
        } else {
          ((dh) this).field_f.setPixels(0, 0, ((dh) this).field_a, ((dh) this).field_e, ((dh) this).field_h, ((dh) this).field_b, 0, ((dh) this).field_a);
          ((dh) this).field_f.imageComplete(2);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((dh) this).field_f == param0;
    }

    final static int a(up param0, boolean param1) {
        int var2 = 0;
        if (!param1) {
          L0: {
            field_g = null;
            var2 = gp.a(param0, -576054046) / 10;
            if (-1 <= gp.a(param0, -576054046)) {
              break L0;
            } else {
              if (var2 != 0) {
                break L0;
              } else {
                var2 = 1;
                break L0;
              }
            }
          }
          return var2;
        } else {
          L1: {
            var2 = gp.a(param0, -576054046) / 10;
            if (-1 >= gp.a(param0, -576054046)) {
              break L1;
            } else {
              if (var2 != 0) {
                break L1;
              } else {
                var2 = 1;
                break L1;
              }
            }
          }
          return var2;
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        field_g = null;
        field_k = null;
        field_j = null;
        if (param0 != -29) {
            dh.b(true);
        }
    }

    final static void a(int param0, int param1, iw param2, int param3, int param4) {
        Object var6 = null;
        param2.a(param3 ^ -3315, 12);
        param2.g(param3 ^ 1207447422, 17);
        param2.g(-1207444472, param1);
        if (param3 != -3210) {
          var6 = null;
          dh.a(106, -79, (iw) null, 72, 113);
          param2.g(param3 + -1207441262, param4);
          param2.a(param3 ^ -3298, param0);
          return;
        } else {
          param2.g(param3 + -1207441262, param4);
          param2.a(param3 ^ -3298, param0);
          return;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((dh) this).addConsumer(param0);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    dh() {
    }

    final static void c(byte param0) {
        if (param0 != -77) {
            Object var2 = null;
            dh.a(105, -41, (iw) null, 7, -41);
            tf.field_f = false;
            return;
        }
        tf.field_f = false;
    }

    final static void b(boolean param0) {
        if (!param0) {
            Object var3 = null;
            int discarded$0 = dh.a((up) null, false);
            ht.a(true, (byte) 89);
            return;
        }
        ht.a(true, (byte) 89);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((dh) this).field_f)) {
            ((dh) this).field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"primary colour", "secondary colour"};
        field_i = new int[12];
        field_g = "Logging in...";
        field_l = "Orb points: ";
        field_k = "Solicitation";
        field_m = "Private";
    }
}
