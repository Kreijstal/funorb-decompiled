/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa extends pd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_o;
    static String field_i;
    static wh field_j;
    static boolean field_n;
    private java.awt.image.ImageConsumer field_k;
    static int field_m;
    static int[] field_l;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void b(boolean param0) {
        if (null == ((oa) this).field_k) {
            return;
        }
        if (!param0) {
            field_n = true;
        }
        ((oa) this).field_k.setPixels(0, 0, ((oa) this).field_a, ((oa) this).field_d, ((oa) this).field_o, ((oa) this).field_h, 0, ((oa) this).field_a);
        ((oa) this).field_k.imageComplete(2);
    }

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        fj var4_ref_fj = null;
        int var4 = 0;
        lc var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        if (param0 == 1811357826) {
          L0: {
            var9 = te.field_N;
            var2 = var9.j(255);
            var3 = var9.j(255);
            if (var2 != 0) {
              if (var2 != 1) {
                hi.a((Throwable) null, "LR1: " + oc.a(false), 1);
                je.a(false);
                break L0;
              } else {
                var4 = var9.d(-116);
                var5 = (lc) (Object) hc.field_a.a((byte) 51);
                L1: while (true) {
                  L2: {
                    if (var5 == null) {
                      break L2;
                    } else {
                      L3: {
                        if (var5.field_n != var3) {
                          break L3;
                        } else {
                          if (var4 != var5.field_o) {
                            break L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5 = (lc) (Object) hc.field_a.b(-66);
                      continue L1;
                    }
                  }
                  if (var5 == null) {
                    je.a(false);
                    return;
                  } else {
                    var5.c(10);
                    break L0;
                  }
                }
              }
            } else {
              var4_ref_fj = (fj) (Object) ti.field_b.a((byte) 51);
              if (var4_ref_fj != null) {
                L4: {
                  var5_int = te.field_O + -var9.field_m;
                  var13 = var4_ref_fj.field_h;
                  var12 = var13;
                  var11 = var12;
                  var10 = var11;
                  var6 = var10;
                  if (var5_int > var13.length << 1811357826) {
                    var5_int = var13.length << 829563906;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = 0;
                L5: while (true) {
                  if (var7 >= var5_int) {
                    var4_ref_fj.c(10);
                    break L0;
                  } else {
                    var6[var7 >> -1803587230] = var6[var7 >> -1803587230] + (var9.j(255) << fi.a(var7 << 210065288, 768));
                    var7++;
                    continue L5;
                  }
                }
              } else {
                je.a(false);
                return;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((oa) this).field_k = param0;
        param0.setDimensions(((oa) this).field_a, ((oa) this).field_d);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((oa) this).field_o);
        param0.setHints(14);
    }

    final static fc a(int param0, int param1, da param2) {
        if (param0 != -1803587230) {
            return null;
        }
        byte[] var4 = param2.a(param1, (byte) -104);
        byte[] var3 = var4;
        if (var4 == null) {
            return null;
        }
        return new fc(var4);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((oa) this).addConsumer(param0);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((oa) this).field_k == param0) {
            ((oa) this).field_k = null;
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public static void b(int param0) {
        if (param0 != 768) {
            Object var2 = null;
            fc discarded$0 = oa.a(-87, 28, (da) null);
        }
        field_i = null;
        field_j = null;
        field_l = null;
    }

    oa() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((oa) this).field_d = param2;
        ((oa) this).field_a = param3;
        ((oa) this).field_h = new int[param2 * param3 - -1];
        ((oa) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((oa) this).field_g = param0.createImage((java.awt.image.ImageProducer) this);
        this.b(true);
        if (param1 != 9387) {
            field_n = false;
        }
        boolean discarded$0 = param0.prepareImage(((oa) this).field_g, (java.awt.image.ImageObserver) this);
        this.b(true);
        boolean discarded$1 = param0.prepareImage(((oa) this).field_g, (java.awt.image.ImageObserver) this);
        this.b(true);
        boolean discarded$2 = param0.prepareImage(((oa) this).field_g, (java.awt.image.ImageObserver) this);
        ((oa) this).a(true);
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        if (param1 != 0) {
            return;
        }
        this.b(true);
        boolean discarded$0 = param3.drawImage(((oa) this).field_g, param0, param2, (java.awt.image.ImageObserver) this);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((oa) this).field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Type your age in years";
        field_j = new wh();
        field_n = false;
    }
}
