/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib extends ef implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static String field_o;
    static boolean[] field_m;
    private java.awt.image.ColorModel field_p;
    static int field_n;
    static String field_j;
    static int field_k;

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Bounce.field_N;
        var4 = -1;
        var5 = param2;
        L0: while (true) {
          if (param0 <= var5) {
            if (param3 != -33) {
              field_n = -120;
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 ^ -1;
              return var4;
            }
          } else {
            var4 = var4 >>> -356430648 ^ sh.field_gb[(var4 ^ param1[var5]) & 255];
            var5++;
            continue L0;
          }
        }
    }

    final static ph a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        ph[] var3 = null;
        int var4 = 0;
        ph var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        var2 = ah.a(-3058, param0, "jagex-last-login-method");
        if (var2 == null) {
          return ug.field_k;
        } else {
          var3 = ge.b(27579);
          if (param1 <= -41) {
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (!var5.a(var2, 0)) {
                  var4++;
                  continue L0;
                } else {
                  return var5;
                }
              } else {
                return ug.field_k;
              }
            }
          } else {
            field_k = -94;
            var4 = 0;
            L1: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (!var5.a(var2, 0)) {
                  var4++;
                  continue L1;
                } else {
                  return var5;
                }
              } else {
                return ug.field_k;
              }
            }
          }
        }
    }

    private final synchronized void b(boolean param0) {
        Object var3 = null;
        if (null != ((ib) this).field_l) {
          ((ib) this).field_l.setPixels(0, 0, ((ib) this).field_h, ((ib) this).field_b, ((ib) this).field_p, ((ib) this).field_g, 0, ((ib) this).field_h);
          if (!param0) {
            var3 = null;
            ((ib) this).a(-107, (byte) -17, (java.awt.Component) null, 70);
            ((ib) this).field_l.imageComplete(2);
            return;
          } else {
            ((ib) this).field_l.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ib) this).field_l = param0;
        param0.setDimensions(((ib) this).field_h, ((ib) this).field_b);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ib) this).field_p);
        param0.setHints(14);
    }

    final static void a(si param0, java.awt.Frame param1, byte param2) {
        mk var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (param2 >= 68) {
          L0: while (true) {
            var3 = param0.a(param1, (byte) 4);
            L1: while (true) {
              if (var3.field_f != 0) {
                if (-2 != (var3.field_f ^ -1)) {
                  wh.a(100L, 19406);
                  continue L0;
                } else {
                  param1.setVisible(false);
                  param1.dispose();
                  return;
                }
              } else {
                wh.a(10L, 19406);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.b(true);
        int var5 = 111 % ((-33 - param3) / 52);
        boolean discarded$0 = param2.drawImage(((ib) this).field_e, param1, param0, (java.awt.image.ImageObserver) this);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((ib) this).field_l != param0) {
            return;
        }
        ((ib) this).field_l = null;
    }

    ib() {
    }

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
            field_n = 64;
            field_o = null;
            field_m = null;
            return;
        }
        field_o = null;
        field_m = null;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ib) this).addConsumer(param0);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((ib) this).field_l;
    }

    final void a(int param0, byte param1, java.awt.Component param2, int param3) {
        ((ib) this).field_h = param0;
        ((ib) this).field_b = param3;
        ((ib) this).field_g = new int[1 + param0 * param3];
        ((ib) this).field_p = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((ib) this).field_e = param2.createImage((java.awt.image.ImageProducer) this);
        int var5 = -116 % ((-63 - param1) / 38);
        this.b(true);
        boolean discarded$0 = param2.prepareImage(((ib) this).field_e, (java.awt.image.ImageObserver) this);
        this.b(true);
        boolean discarded$1 = param2.prepareImage(((ib) this).field_e, (java.awt.image.ImageObserver) this);
        this.b(true);
        boolean discarded$2 = param2.prepareImage(((ib) this).field_e, (java.awt.image.ImageObserver) this);
        ((ib) this).c(64);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new boolean[64];
        field_j = "Please wait for high scores";
    }
}
