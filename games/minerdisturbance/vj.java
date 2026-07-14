/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vj extends ci implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_n;
    static String field_l;
    private java.awt.image.ImageConsumer field_m;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((vj) this).addConsumer(param0);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var8 = null;
        String[] var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = MinerDisturbance.field_ab;
        bd.field_h = kd.field_p;
        if (param0 == -21614) {
          if (-256 != param2) {
            if (-101 >= (param2 ^ -1)) {
              if ((param2 ^ -1) >= -106) {
                var9 = param3;
                en.a(var9, 18423);
                sd.field_d = rh.a(param0 + 21734, param3);
                return;
              } else {
                sd.field_d = ij.a(param2, param1, true);
                return;
              }
            } else {
              sd.field_d = ij.a(param2, param1, true);
              return;
            }
          } else {
            L0: {
              if (-14 <= me.field_j) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            sd.field_d = hn.a(stackIn_16_0 != 0, (byte) 105);
            var6 = null;
            en.a((String[]) null, 18423);
            return;
          }
        } else {
          vj.d(-99);
          if (-256 != param2) {
            if (-101 >= (param2 ^ -1)) {
              if ((param2 ^ -1) >= -106) {
                var8 = param3;
                en.a(var8, 18423);
                sd.field_d = rh.a(param0 + 21734, param3);
                return;
              } else {
                sd.field_d = ij.a(param2, param1, true);
                return;
              }
            } else {
              sd.field_d = ij.a(param2, param1, true);
              return;
            }
          } else {
            L1: {
              if (-14 <= me.field_j) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            sd.field_d = hn.a(stackIn_5_0 != 0, (byte) 105);
            var6 = null;
            en.a((String[]) null, 18423);
            return;
          }
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Object var6 = null;
            if (param2 != 13961) {
              var6 = null;
              ((vj) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
              ((vj) this).field_d = param1;
              ((vj) this).field_f = new int[1 + param1 * param3];
              ((vj) this).field_c = param3;
              ((vj) this).field_n = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((vj) this).field_g = param0.createImage((java.awt.image.ImageProducer) this);
              this.c(-1494965825);
              boolean discarded$6 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
              this.c(-1494965825);
              boolean discarded$7 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
              this.c(param2 ^ -1494968522);
              boolean discarded$8 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
              ((vj) this).a((byte) -45);
              return;
            } else {
              ((vj) this).field_d = param1;
              ((vj) this).field_f = new int[1 + param1 * param3];
              ((vj) this).field_c = param3;
              ((vj) this).field_n = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((vj) this).field_g = param0.createImage((java.awt.image.ImageProducer) this);
              this.c(-1494965825);
              boolean discarded$9 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
              this.c(-1494965825);
              boolean discarded$10 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
              this.c(param2 ^ -1494968522);
              boolean discarded$11 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
              ((vj) this).a((byte) -45);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((vj) this).field_m == param0;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        int var5 = 40 / ((62 - param1) / 50);
        this.c(-1494965825);
        boolean discarded$0 = param2.drawImage(((vj) this).field_g, param3, param0, (java.awt.image.ImageObserver) this);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((vj) this).field_m = param0;
        param0.setDimensions(((vj) this).field_c, ((vj) this).field_d);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((vj) this).field_n);
        param0.setHints(14);
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 16711680) {
            int discarded$0 = vj.a((byte) 62, -63, 61);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((vj) this).field_m != param0)) {
            ((vj) this).field_m = null;
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        if (param0 != -101) {
          field_l = null;
          var3 = param1 >> -1494965825 & -1 + param2;
          return var3 + ((param1 >>> 1082098367) + param1) % param2;
        } else {
          var3 = param1 >> -1494965825 & -1 + param2;
          return var3 + ((param1 >>> 1082098367) + param1) % param2;
        }
    }

    vj() {
    }

    private final synchronized void c(int param0) {
        if (null == ((vj) this).field_m) {
          return;
        } else {
          ((vj) this).field_m.setPixels(0, 0, ((vj) this).field_c, ((vj) this).field_d, ((vj) this).field_n, ((vj) this).field_f, 0, ((vj) this).field_c);
          if (param0 != -1494965825) {
            field_l = null;
            ((vj) this).field_m.imageComplete(2);
            return;
          } else {
            ((vj) this).field_m.imageComplete(2);
            return;
          }
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 1) {
          field_l = null;
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        } else {
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
