/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jf extends kh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_l;
    static boolean field_n;
    static int[] field_i;
    private java.awt.image.ImageConsumer field_j;
    static String field_k;
    private java.awt.image.ColorModel field_m;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((jf) this).field_j = param0;
        param0.setDimensions(((jf) this).field_b, ((jf) this).field_d);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((jf) this).field_m);
        param0.setHints(14);
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Main.field_T;
        if (!param1) {
          if ((g.field_A ^ -1) <= -11) {
            if (lc.a((byte) -82)) {
              if (-1 == (cd.field_e ^ -1)) {
                ej.a(false, (byte) 55, param2);
                ll.a(0, (byte) 115, param0, 0);
                return;
              } else {
                nl.a(param0, -125);
                return;
              }
            } else {
              vj.d();
              mg.a(320, 207, 240);
              ll.a(0, (byte) 115, param0, 0);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (!ii.field_a) {
                break L0;
              } else {
                var3 = 1;
                ii.field_a = false;
                break L0;
              }
            }
            uk.a(ej.r(-6545), var3 != 0, (byte) -96, aj.field_p, mj.a(-1));
            return;
          }
        } else {
          var5 = null;
          jf.a((java.awt.Canvas) null, false, false);
          if ((g.field_A ^ -1) <= -11) {
            if (lc.a((byte) -82)) {
              if (-1 == (cd.field_e ^ -1)) {
                ej.a(false, (byte) 55, param2);
                ll.a(0, (byte) 115, param0, 0);
                return;
              } else {
                nl.a(param0, -125);
                return;
              }
            } else {
              vj.d();
              mg.a(320, 207, 240);
              ll.a(0, (byte) 115, param0, 0);
              return;
            }
          } else {
            L1: {
              var3 = 0;
              if (!ii.field_a) {
                break L1;
              } else {
                var3 = 1;
                ii.field_a = false;
                break L1;
              }
            }
            uk.a(ej.r(-6545), var3 != 0, (byte) -96, aj.field_p, mj.a(-1));
            return;
          }
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((jf) this).addConsumer(param0);
    }

    public static void d(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != -14143) {
            field_n = true;
            field_l = null;
            return;
        }
        field_l = null;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        if (param3 <= 110) {
          ((jf) this).field_j = null;
          this.c(14);
          boolean discarded$4 = param0.drawImage(((jf) this).field_a, param1, param2, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.c(14);
          boolean discarded$5 = param0.drawImage(((jf) this).field_a, param1, param2, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((jf) this).field_j)) {
            ((jf) this).field_j = null;
        }
    }

    final void a(java.awt.Component param0, int param1, byte param2, int param3) {
        ((jf) this).field_d = param1;
        ((jf) this).field_b = param3;
        if (param2 != 68) {
          return;
        } else {
          ((jf) this).field_h = new int[param1 * param3 - -1];
          ((jf) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
          ((jf) this).field_a = param0.createImage((java.awt.image.ImageProducer) this);
          this.c(14);
          boolean discarded$3 = param0.prepareImage(((jf) this).field_a, (java.awt.image.ImageObserver) this);
          this.c(14);
          boolean discarded$4 = param0.prepareImage(((jf) this).field_a, (java.awt.image.ImageObserver) this);
          this.c(param2 ^ 74);
          boolean discarded$5 = param0.prepareImage(((jf) this).field_a, (java.awt.image.ImageObserver) this);
          ((jf) this).a(200);
          return;
        }
    }

    final static aa a(int param0, String param1) {
        String var2 = null;
        aa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = Main.field_T;
        if (null != rf.field_d) {
          if (param1 != null) {
            if (0 != param1.length()) {
              var6 = (CharSequence) (Object) param1;
              var2 = ff.a((byte) 116, var6);
              if (var2 != null) {
                var3 = (aa) (Object) rf.field_d.a(-78, (long)var2.hashCode());
                if (param0 == 0) {
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_gb;
                      var4 = ff.a((byte) 116, var7);
                      if (var4.equals((Object) (Object) var2)) {
                        return var3;
                      } else {
                        var3 = (aa) (Object) rf.field_d.a(26847);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((jf) this).field_j == param0;
    }

    jf() {
    }

    private final synchronized void c(int param0) {
        if (param0 != 14) {
            field_k = null;
            if (!(null != ((jf) this).field_j)) {
                return;
            }
            ((jf) this).field_j.setPixels(0, 0, ((jf) this).field_b, ((jf) this).field_d, ((jf) this).field_m, ((jf) this).field_h, 0, ((jf) this).field_b);
            ((jf) this).field_j.imageComplete(2);
            return;
        }
        if (!(null != ((jf) this).field_j)) {
            return;
        }
        ((jf) this).field_j.setPixels(0, 0, ((jf) this).field_b, ((jf) this).field_d, ((jf) this).field_m, ((jf) this).field_h, 0, ((jf) this).field_b);
        ((jf) this).field_j.imageComplete(2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = false;
        field_k = "Connection timed out. Please try using a different server.";
    }
}
