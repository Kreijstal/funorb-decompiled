/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh extends bi implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_m;
    static byte[][] field_j;
    static int[] field_l;
    static wk[] field_n;
    static String field_i;
    static wk field_k;
    private java.awt.image.ColorModel field_o;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            ((dh) this).field_b = new int[param0 * param3 + 1];
            if (param1 != -46) {
              return;
            } else {
              ((dh) this).field_g = param3;
              ((dh) this).field_a = param0;
              ((dh) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((dh) this).field_h = param2.createImage((java.awt.image.ImageProducer) this);
              this.a(false);
              boolean discarded$3 = param2.prepareImage(((dh) this).field_h, (java.awt.image.ImageObserver) this);
              this.a(false);
              boolean discarded$4 = param2.prepareImage(((dh) this).field_h, (java.awt.image.ImageObserver) this);
              this.a(false);
              boolean discarded$5 = param2.prepareImage(((dh) this).field_h, (java.awt.image.ImageObserver) this);
              ((dh) this).a(5605);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(int param0) {
        tb.field_e = null;
        if (param0 != -1) {
            field_i = null;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((dh) this).field_m != param0)) {
            ((dh) this).field_m = null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((dh) this).field_m = param0;
        param0.setDimensions(((dh) this).field_a, ((dh) this).field_g);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((dh) this).field_o);
        param0.setHints(14);
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param2 == 32) {
          var3 = kd.field_Z[param0][param1];
          if (var3 > -1) {
            var4 = ns.a(false, td.field_d[var3].length, li.field_n);
            if (null != td.field_d[var3][var4]) {
              if (0 == td.field_d[var3][var4].field_o.length) {
                return;
              } else {
                te discarded$2 = ub.a((byte) 52, td.field_d[var3][var4]);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_l = null;
          var3 = kd.field_Z[param0][param1];
          if (var3 > -1) {
            var4 = ns.a(false, td.field_d[var3].length, li.field_n);
            if (null != td.field_d[var3][var4]) {
              if (0 == td.field_d[var3][var4].field_o.length) {
                return;
              } else {
                te discarded$3 = ub.a((byte) 52, td.field_d[var3][var4]);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_n = null;
        field_k = null;
        field_j = null;
        field_l = null;
        if (param0 >= -98) {
            field_i = null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((dh) this).field_m;
    }

    final static fo a(String param0, byte param1) {
        if (se.field_g.a((byte) 124)) {
          if (!param0.equals((Object) (Object) se.field_g.b(true))) {
            se.field_g = cr.a(param0, param1 ^ 4210691);
            if (param1 != 67) {
              field_i = null;
              return se.field_g;
            } else {
              return se.field_g;
            }
          } else {
            if (param1 != 67) {
              field_i = null;
              return se.field_g;
            } else {
              return se.field_g;
            }
          }
        } else {
          if (param1 != 67) {
            field_i = null;
            return se.field_g;
          } else {
            return se.field_g;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((dh) this).addConsumer(param0);
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        this.a(false);
        boolean discarded$9 = param1.drawImage(((dh) this).field_h, param3, param2, (java.awt.image.ImageObserver) this);
        if (param0 != 255) {
            Object var6 = null;
            ((dh) this).removeConsumer((java.awt.image.ImageConsumer) null);
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    private final synchronized void a(boolean param0) {
        if (((dh) this).field_m == null) {
          return;
        } else {
          ((dh) this).field_m.setPixels(0, 0, ((dh) this).field_a, ((dh) this).field_g, ((dh) this).field_o, ((dh) this).field_b, 0, ((dh) this).field_a);
          if (param0) {
            return;
          } else {
            ((dh) this).field_m.imageComplete(2);
            return;
          }
        }
    }

    dh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new byte[50][];
        field_i = "Players: ";
    }
}
