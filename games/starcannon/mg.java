/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg extends tk implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static int field_h;
    static ge field_i;
    private java.awt.image.ColorModel field_j;
    static String field_k;
    static String field_m;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.a(true);
        if (param3 != 19291) {
            Object var6 = null;
            ((mg) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
        boolean discarded$0 = param2.drawImage(((mg) this).field_c, param0, param1, (java.awt.image.ImageObserver) this);
    }

    final static void a(byte param0, fb param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = StarCannon.field_A;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            L1: {
              if (param0 >= 34) {
                break L1;
              } else {
                var6 = null;
                mg.a((byte) 71, (fb) null);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= wi.field_b) {
                kk.field_b[param1.b(-126)] = kk.field_b[param1.b(-126)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= wi.field_b) {
                    wi.field_b = var2;
                    wi.field_b = wi.field_b + 1;
                    lf.field_bb[wi.field_b] = param1;
                    return;
                  } else {
                    L4: {
                      if (param1.field_q != lf.field_bb[var3].field_q) {
                        break L4;
                      } else {
                        var4 = lf.field_bb[var3].b(-126);
                        if (vh.field_q < kk.field_b[var4]) {
                          kk.field_b[var4] = kk.field_b[var4] - 1;
                          var3++;
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2++;
                    lf.field_bb[var2] = lf.field_bb[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (param1.field_q == lf.field_bb[var2].field_q) {
                  kk.field_b[lf.field_bb[var2].b(-128)] = kk.field_b[lf.field_bb[var2].b(-128)] + 1;
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          } else {
            kk.field_b[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((mg) this).field_l) {
            ((mg) this).field_l = null;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void a(boolean param0) {
        if (!(null != ((mg) this).field_l)) {
            return;
        }
        ((mg) this).field_l.setPixels(0, 0, ((mg) this).field_d, ((mg) this).field_b, ((mg) this).field_j, ((mg) this).field_g, 0, ((mg) this).field_d);
        if (!param0) {
            return;
        }
        ((mg) this).field_l.imageComplete(2);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((mg) this).field_l;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final static void a(boolean param0, oj param1, int param2) {
        if (!param0) {
            field_k = null;
        }
        ia var3 = d.field_b;
        var3.d((byte) 25, param2);
        var3.a(param1.field_i, -50);
        var3.a(param1.field_h, -123);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((mg) this).addConsumer(param0);
    }

    final static int a(int param0, byte[] param1, byte param2) {
        if (param2 > -64) {
            return -2;
        }
        return rj.a(0, param0, (byte) 93, param1);
    }

    mg() {
    }

    final static int a(byte param0) {
        int var1 = 0;
        boolean discarded$8 = ti.field_b.a((byte) -117, true, ob.field_h, cl.field_j);
        ti.field_b.h(-10597);
        while (ad.e((byte) 107)) {
            boolean discarded$9 = ti.field_b.a(lb.field_B, -119, StarCannon.field_E);
        }
        if (!(md.field_a == -1)) {
            var1 = md.field_a;
            fd.a(-1, param0 + 78);
            return var1;
        }
        if (s.field_c) {
            return 3;
        }
        if (param0 != -78) {
            field_i = null;
        }
        if (ie.field_x == jl.field_a) {
            return 1;
        }
        if (!(qa.field_a.b(false))) {
            return 1;
        }
        if (!(uh.field_k != jl.field_a)) {
            return 2;
        }
        return -1;
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        ((mg) this).field_b = param3;
        ((mg) this).field_g = new int[param1 * param3 - -1];
        ((mg) this).field_d = param1;
        ((mg) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((mg) this).field_c = param2.createImage((java.awt.image.ImageProducer) this);
        this.a(true);
        boolean discarded$0 = param2.prepareImage(((mg) this).field_c, (java.awt.image.ImageObserver) this);
        this.a(true);
        boolean discarded$1 = param2.prepareImage(((mg) this).field_c, (java.awt.image.ImageObserver) this);
        this.a(true);
        boolean discarded$9 = param2.prepareImage(((mg) this).field_c, (java.awt.image.ImageObserver) this);
        if (param0 != -9623) {
            return;
        }
        ((mg) this).b(-122);
    }

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_m = null;
        if (param0 != 0) {
            field_k = null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((mg) this).field_l = param0;
        param0.setDimensions(((mg) this).field_d, ((mg) this).field_b);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((mg) this).field_j);
        param0.setHints(14);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "LANCE LASER - Switches the Nova Ray to use the tight beam of the lance laser.";
        field_i = new ge();
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
