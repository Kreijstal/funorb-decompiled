/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sf extends mm implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_o;
    static String field_j;
    static String field_k;
    static int field_m;
    static sa field_n;
    private java.awt.image.ImageConsumer field_i;
    private java.awt.image.ColorModel field_l;

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((sf) this).field_i == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    private final synchronized void b(int param0) {
        if (!(((sf) this).field_i != null)) {
            return;
        }
        ((sf) this).field_i.setPixels(param0, 0, ((sf) this).field_f, ((sf) this).field_c, ((sf) this).field_l, ((sf) this).field_h, 0, ((sf) this).field_f);
        ((sf) this).field_i.imageComplete(2);
    }

    final static hj[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 14) {
            return null;
        }
        return wa.a(1, 1, param1, param2, param0);
    }

    final static long d(int param0) {
        if (param0 <= 67) {
            return 77L;
        }
        return -cm.field_b + bb.b(-1);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.b(0);
        boolean discarded$9 = param2.drawImage(((sf) this).field_b, param1, param0, (java.awt.image.ImageObserver) this);
        if (param3 != 34) {
            field_o = null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((sf) this).field_i = param0;
        param0.setDimensions(((sf) this).field_f, ((sf) this).field_c);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((sf) this).field_l);
        param0.setHints(14);
    }

    public static void c(int param0) {
        field_j = null;
        if (param0 != -1) {
            sf.c(-126);
        }
        field_o = null;
        field_k = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((sf) this).field_i == param0) {
            ((sf) this).field_i = null;
        }
    }

    final static hj a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        var3 = 1 + param0 * 2;
        var4 = param0 * 2 + 1;
        var5 = 29 % ((-27 - param1) / 49);
        var6 = new hj(var3, var4);
        var7 = -param0;
        L0: while (true) {
          if (var7 > param0) {
            return var6;
          } else {
            var8 = -param0;
            L1: while (true) {
              if (var8 > param0) {
                var7++;
                continue L0;
              } else {
                var9 = param0 * param0 - (var7 * var7 - -(var8 * var8));
                if (-1 > (var9 ^ -1)) {
                  var10 = (float)Math.sqrt((double)var9) / (float)param0;
                  var6.field_z[var3 * (var8 + param0) + (param0 + var7)] = lk.a(var10, -1, param2);
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        ((sf) this).field_c = param1;
        ((sf) this).field_f = param0;
        ((sf) this).field_h = new int[1 + param0 * param1];
        ((sf) this).field_l = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((sf) this).field_b = param2.createImage((java.awt.image.ImageProducer) this);
        this.b(0);
        boolean discarded$0 = param2.prepareImage(((sf) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(0);
        boolean discarded$1 = param2.prepareImage(((sf) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(param3);
        boolean discarded$2 = param2.prepareImage(((sf) this).field_b, (java.awt.image.ImageObserver) this);
        ((sf) this).a(false);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((sf) this).addConsumer(param0);
    }

    final static void a(int param0) {
        ui var1 = null;
        int var2 = HoldTheLine.field_D;
        pk.field_G.d();
        if (param0 != -1379) {
            sf.c(-82);
        }
        jd.field_G.d();
        gg.field_G = gg.field_G - 1;
        if (!(0 != gg.field_G)) {
            gg.field_G = 200;
            var1 = (ui) (Object) ol.field_b.b((byte) 118);
            while (var1 != null) {
                if (!(var1.field_k.b(116))) {
                    var1.d(0);
                }
                var1 = (ui) (Object) ol.field_b.c((byte) 93);
            }
            if (!(null == ob.field_b)) {
                var1 = (ui) (Object) ob.field_b.b((byte) 120);
                while (var1 != null) {
                    if (!var1.field_k.b(88)) {
                        var1.d(0);
                    }
                    var1 = (ui) (Object) ob.field_b.c((byte) -51);
                }
            }
        }
        if (i.field_m != null) {
            if (i.field_m.c((byte) 85)) {
            }
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = 106 / ((12 - param2) / 42);
        int var3 = param0 >>> -2046096321;
        return -var3 + (var3 + param0) / param1;
    }

    sf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Continue";
        field_o = "Age:";
        field_k = "Your vehicle can only hold <col=1>three</col> powerups at any one time. Collecting a fourth will replace the <col=1>oldest</col> powerup. Power-ups can also be lost in collisions or by being hit by weapons.<br><br>Each colour of powerup has a different effect, and the strength of the effect depends on how many powerups of that colour you currently have.";
        field_n = new sa();
    }
}
