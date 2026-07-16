/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cg extends vn implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_k;
    static java.awt.Font field_l;
    private java.awt.image.ColorModel field_j;

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((cg) this).field_k;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((cg) this).field_k) {
            ((cg) this).field_k = null;
        }
    }

    private final synchronized void b(int param0) {
        if (!(((cg) this).field_k != null)) {
            return;
        }
        ((cg) this).field_k.setPixels(0, 0, ((cg) this).field_d, ((cg) this).field_h, ((cg) this).field_j, ((cg) this).field_i, 0, ((cg) this).field_d);
        ((cg) this).field_k.imageComplete(param0);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public static void f(int param0) {
        field_l = null;
        if (param0 != -1) {
            field_l = null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        Object var6 = null;
        ((cg) this).field_i = new int[1 + param3 * param1];
        ((cg) this).field_h = param3;
        ((cg) this).field_d = param1;
        ((cg) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((cg) this).field_f = param2.createImage((java.awt.image.ImageProducer) this);
        this.b(2);
        boolean discarded$5 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
        this.b(2);
        boolean discarded$6 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
        if (param0 != 1018) {
          var6 = null;
          boolean discarded$7 = ((cg) this).imageUpdate((java.awt.Image) null, 84, -46, -64, -30, -50);
          this.b(2);
          boolean discarded$8 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
          ((cg) this).a(param0 + -895);
          return;
        } else {
          this.b(2);
          boolean discarded$9 = param2.prepareImage(((cg) this).field_f, (java.awt.image.ImageObserver) this);
          ((cg) this).a(param0 + -895);
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((cg) this).field_k = param0;
        param0.setDimensions(((cg) this).field_d, ((cg) this).field_h);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((cg) this).field_j);
        param0.setHints(14);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((cg) this).addConsumer(param0);
    }

    final static void e(int param0) {
        jc.field_a[46] = 72;
        jc.field_a[47] = 73;
        jc.field_a[92] = 74;
        jc.field_a[45] = 26;
        jc.field_a[93] = 43;
        int var1 = -51 / ((46 - param0) / 32);
        jc.field_a[59] = 57;
        jc.field_a[61] = 27;
        jc.field_a[44] = 71;
        jc.field_a[91] = 42;
        jc.field_a[192] = 28;
        jc.field_a[520] = 59;
        jc.field_a[222] = 58;
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        this.b(2);
        if (param1 != 0) {
            return;
        }
        boolean discarded$0 = param3.drawImage(((cg) this).field_f, param0, param2, (java.awt.image.ImageObserver) this);
    }

    final static void d(int param0) {
        bo.field_F.l(17415);
        if (jb.field_r != null) {
          if (param0 != 32) {
            field_l = null;
            bo.field_F.b((hm) (Object) jb.field_r, 61);
            return;
          } else {
            bo.field_F.b((hm) (Object) jb.field_r, 61);
            return;
          }
        } else {
          jb.field_r = new w(bo.field_F, dj.field_b);
          if (param0 == 32) {
            bo.field_F.b((hm) (Object) jb.field_r, 61);
            return;
          } else {
            field_l = null;
            bo.field_F.b((hm) (Object) jb.field_r, 61);
            return;
          }
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        c var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        qd var12 = null;
        jh var13 = null;
        c var14 = null;
        jh var15 = null;
        var8 = EscapeVector.field_A;
        if (param0 > 68) {
          var14 = om.field_g;
          var2 = var14.e(0);
          if (-1 != (var2 ^ -1)) {
            if ((var2 ^ -1) != -2) {
              if (-3 == (var2 ^ -1)) {
                var15 = (jh) (Object) bc.field_b.a(false);
                if (var15 == null) {
                  nm.a(16);
                  return;
                } else {
                  var15.field_i = v.a(-92);
                  var15.field_g = true;
                  var15.field_h = true;
                  var15.c((byte) -77);
                  return;
                }
              } else {
                pf.a(false, "A1: " + hf.b((byte) 58), (Throwable) null);
                nm.a(16);
                return;
              }
            } else {
              var12 = (qd) (Object) mi.field_l.a(false);
              if (var12 == null) {
                nm.a(16);
                return;
              } else {
                var12.c((byte) -64);
                return;
              }
            }
          } else {
            var11 = v.a(-84);
            var3 = var11;
            var10 = var11;
            var4 = var10;
            var5 = var14;
            var6 = ((n) (Object) var5).e(0);
            var7 = 0;
            L0: while (true) {
              if (var6 <= var7) {
                var13 = (jh) (Object) bc.field_b.a(false);
                if (var13 == null) {
                  nm.a(16);
                  return;
                } else {
                  var13.field_i = var3;
                  var13.field_g = false;
                  var13.field_h = true;
                  var13.c((byte) -86);
                  return;
                }
              } else {
                var10[var7] = ((n) (Object) var5).g(-5053);
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    cg() {
    }

    static {
    }
}
