/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj extends uc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_j;
    static String field_i;
    private java.awt.image.ImageConsumer field_k;
    static int field_m;
    static int field_l;
    static vc field_n;

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        Object var6 = null;
        if (param3 < 19) {
          var6 = null;
          ((bj) this).a((java.awt.Component) null, 87, -48, 10);
          this.d((byte) -112);
          boolean discarded$4 = param0.drawImage(((bj) this).field_b, param2, param1, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.d((byte) -112);
          boolean discarded$5 = param0.drawImage(((bj) this).field_b, param2, param1, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_n = null;
            field_i = null;
            field_n = null;
            return;
        }
        field_i = null;
        field_n = null;
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((bj) this).field_g = new int[param1 * param2 + 1];
        ((bj) this).field_h = param1;
        ((bj) this).field_f = param2;
        ((bj) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((bj) this).field_b = param0.createImage((java.awt.image.ImageProducer) this);
        this.d((byte) -112);
        boolean discarded$12 = param0.prepareImage(((bj) this).field_b, (java.awt.image.ImageObserver) this);
        if (param3 > -72) {
          return;
        } else {
          this.d((byte) -112);
          boolean discarded$13 = param0.prepareImage(((bj) this).field_b, (java.awt.image.ImageObserver) this);
          this.d((byte) -112);
          boolean discarded$14 = param0.prepareImage(((bj) this).field_b, (java.awt.image.ImageObserver) this);
          ((bj) this).a((byte) 74);
          return;
        }
    }

    final static void e(byte param0) {
        ih var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = fleas.field_A ? 1 : 0;
        var1 = ud.field_b;
        L0: while (true) {
          if (!hd.a(-101)) {
            if (param0 != -41) {
              bj.e((byte) -119);
              return;
            } else {
              return;
            }
          } else {
            var1.e(8, 8);
            int fieldTemp$2 = var1.field_i + 1;
            var1.field_i = var1.field_i + 1;
            var2 = fieldTemp$2;
            ec.a(var1, false);
            ud.field_b.c((byte) -80, var1.field_i - var2);
            continue L0;
          }
        }
    }

    bj() {
    }

    final static ob a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) >= param0) {
            var3 = 0;
            L0: while (true) {
              if (var2 > var3) {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if ((kb.field_j.indexOf(var4) ^ -1) == 0) {
                    return je.field_M;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var3 == -1 + var2) {
                        break L1;
                      } else {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return je.field_M;
                }
              } else {
                return null;
              }
            }
          } else {
            return hg.field_i;
          }
        } else {
          return tf.field_H;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((bj) this).field_k == param0) {
            ((bj) this).field_k = null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((bj) this).field_k == param0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        if (param0 != 14) {
          return;
        } else {
          qj.field_G = true;
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          uk.a(var3, var4, 0, param1, var2);
          return;
        }
    }

    private final synchronized void d(byte param0) {
        if (param0 != -112) {
            return;
        }
        if (!(((bj) this).field_k != null)) {
            return;
        }
        ((bj) this).field_k.setPixels(0, 0, ((bj) this).field_h, ((bj) this).field_f, ((bj) this).field_j, ((bj) this).field_g, 0, ((bj) this).field_h);
        ((bj) this).field_k.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((bj) this).addConsumer(param0);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((bj) this).field_k = param0;
        param0.setDimensions(((bj) this).field_h, ((bj) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((bj) this).field_j);
        param0.setHints(14);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_l = 9;
        field_i = "Your email address is used to identify this account";
    }
}
