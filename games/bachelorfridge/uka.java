/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uka extends qm implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static hk field_k;
    private java.awt.image.ColorModel field_m;
    static int[] field_i;
    static hca field_h;
    static boolean field_j;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((uka) this).field_l != param0)) {
            ((uka) this).field_l = null;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((uka) this).addConsumer(param0);
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Object var6 = null;
            ((uka) this).field_f = param0;
            ((uka) this).field_b = param2;
            ((uka) this).field_e = new int[1 + param0 * param2];
            if (param3 != 256) {
              var6 = null;
              ((uka) this).addConsumer((java.awt.image.ImageConsumer) null);
              ((uka) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((uka) this).field_c = param1.createImage((java.awt.image.ImageProducer) this);
              this.b(2);
              boolean discarded$6 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
              this.b(param3 + -254);
              boolean discarded$7 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
              this.b(2);
              boolean discarded$8 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
              ((uka) this).a((byte) 125);
              return;
            } else {
              ((uka) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
              ((uka) this).field_c = param1.createImage((java.awt.image.ImageProducer) this);
              this.b(2);
              boolean discarded$9 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
              this.b(param3 + -254);
              boolean discarded$10 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
              this.b(2);
              boolean discarded$11 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
              ((uka) this).a((byte) 125);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ema a(long param0, int param1) {
        if (param1 != 28791) {
            return null;
        }
        return (ema) (Object) wi.field_i.a(param0, (byte) -87);
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        kha var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var3 = 0;
        var4 = (kha) (Object) iea.field_d.b((byte) 90);
        if (param0 >= -40) {
          field_j = true;
          L0: while (true) {
            if (var4 != null) {
              if (var3 == 0) {
                L1: {
                  if (param1 != var4.field_h) {
                    break L1;
                  } else {
                    if (255 > mg.field_m.field_f[param1] + var4.field_g) {
                      var4.d((byte) 95);
                      var3 = 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (param1 != var4.field_h) {
                    break L2;
                  } else {
                    if (mg.field_m.field_f[param1] + var4.field_g != 255) {
                      break L2;
                    } else {
                      var3 = 1;
                      break L2;
                    }
                  }
                }
                var4 = (kha) (Object) iea.field_d.c(0);
                continue L0;
              } else {
                L3: {
                  if (var3 != 0) {
                    break L3;
                  } else {
                    iea.field_d.a((bw) (Object) new kha(param1, param2), true);
                    qg.field_b.a(-1, (sna) (Object) new kr(param1, gr.field_a[param1], (kha) (Object) iea.field_d.a(6)));
                    break L3;
                  }
                }
                iaa.a(-110);
                gu.field_d = gu.field_d + 1;
                return;
              }
            } else {
              L4: {
                if (var3 != 0) {
                  break L4;
                } else {
                  iea.field_d.a((bw) (Object) new kha(param1, param2), true);
                  qg.field_b.a(-1, (sna) (Object) new kr(param1, gr.field_a[param1], (kha) (Object) iea.field_d.a(6)));
                  break L4;
                }
              }
              iaa.a(-110);
              gu.field_d = gu.field_d + 1;
              return;
            }
          }
        } else {
          L5: while (true) {
            L6: {
              if (var4 == null) {
                break L6;
              } else {
                if (var3 != 0) {
                  break L6;
                } else {
                  L7: {
                    if (param1 != var4.field_h) {
                      break L7;
                    } else {
                      if (255 > mg.field_m.field_f[param1] + var4.field_g) {
                        var4.d((byte) 95);
                        var3 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (param1 != var4.field_h) {
                      break L8;
                    } else {
                      if (mg.field_m.field_f[param1] + var4.field_g != 255) {
                        break L8;
                      } else {
                        var3 = 1;
                        break L8;
                      }
                    }
                  }
                  var4 = (kha) (Object) iea.field_d.c(0);
                  continue L5;
                }
              }
            }
            if (var3 == 0) {
              iea.field_d.a((bw) (Object) new kha(param1, param2), true);
              qg.field_b.a(-1, (sna) (Object) new kr(param1, gr.field_a[param1], (kha) (Object) iea.field_d.a(6)));
              iaa.a(-110);
              gu.field_d = gu.field_d + 1;
              return;
            } else {
              iaa.a(-110);
              gu.field_d = gu.field_d + 1;
              return;
            }
          }
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    private final synchronized void b(int param0) {
        if (!(((uka) this).field_l != null)) {
            return;
        }
        ((uka) this).field_l.setPixels(0, 0, ((uka) this).field_b, ((uka) this).field_f, ((uka) this).field_m, ((uka) this).field_e, 0, ((uka) this).field_b);
        ((uka) this).field_l.imageComplete(param0);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((uka) this).field_l;
    }

    uka() {
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        this.b(2);
        if (param0 <= 27) {
          ((uka) this).field_l = null;
          boolean discarded$4 = param2.drawImage(((uka) this).field_c, param3, param1, (java.awt.image.ImageObserver) this);
          return;
        } else {
          boolean discarded$5 = param2.drawImage(((uka) this).field_c, param3, param1, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((uka) this).field_l = param0;
        param0.setDimensions(((uka) this).field_b, ((uka) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((uka) this).field_m);
        param0.setHints(14);
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 != 81) {
            field_k = null;
            field_h = null;
            field_k = null;
            return;
        }
        field_h = null;
        field_k = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, kia param1, int param2, boolean param3, byte param4) {
        int var5 = -93 % ((param4 - -9) / 42);
        kw.field_j.a(param1, !param3 ? true : false, 1000000, param2, param0, true);
    }

    final static kv[] a(int param0, int param1, vr param2, int param3) {
        int var4 = 0;
        var4 = 17 % ((70 - param1) / 38);
        if (!g.a(param3, param0, -30744, param2)) {
          return null;
        } else {
          return mfa.a(10583);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new hk("");
        field_i = new int[4];
    }
}
