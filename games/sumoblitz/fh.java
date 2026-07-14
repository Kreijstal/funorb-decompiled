/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fh extends ov implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_j;
    static int field_k;
    static mf[] field_n;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_m;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((fh) this).field_l != param0)) {
            ((fh) this).field_l = null;
        }
    }

    final static boolean c(int param0) {
        if (param0 > -83) {
            field_n = null;
        }
        return lm.a(59, ra.c(2));
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((fh) this).addConsumer(param0);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((fh) this).field_l = param0;
        param0.setDimensions(((fh) this).field_h, ((fh) this).field_b);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((fh) this).field_m);
        param0.setHints(14);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((fh) this).field_l;
    }

    private final synchronized void b(byte param0) {
        if (((fh) this).field_l == null) {
            return;
        }
        ((fh) this).field_l.setPixels(0, 0, ((fh) this).field_h, ((fh) this).field_b, ((fh) this).field_m, ((fh) this).field_c, 0, ((fh) this).field_h);
        ((fh) this).field_l.imageComplete(2);
        if (param0 < 31) {
            Object var3 = null;
            ((fh) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
    }

    final static dk a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0.length();
        if (var2 == 0) {
          return qo.field_a;
        } else {
          if (var2 > 63) {
            return cn.field_ib;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (param1 != -1) {
                  boolean discarded$1 = fh.c(40);
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param0.charAt(var3);
                if (var4 != 45) {
                  if (ji.field_a.indexOf(var4) == -1) {
                    return gs.field_a;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var2 + -1 == var3) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return gs.field_a;
                }
              }
            }
          }
        }
    }

    final static gk a(pl param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        gk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0.b(8, (byte) -92);
        if (param1 == -16736) {
          if ((var2 ^ -1) >= -1) {
            L0: {
              var3 = kh.a(param0, false) ? 1 : 0;
              var4 = kh.a(param0, false) ? 1 : 0;
              var5 = new gk();
              var5.field_D = (short)param0.b(16, (byte) -119);
              var5.field_Q = sm.a(var5.field_Q, param0, -119, 16);
              var5.field_B = sm.a(var5.field_B, param0, -120, 16);
              var5.field_r = sm.a(var5.field_r, param0, -127, 16);
              var5.field_n = (short)param0.b(16, (byte) -117);
              var5.field_A = sm.a(var5.field_A, param0, -128, 16);
              var5.field_b = sm.a(var5.field_b, param0, -116, 16);
              var5.field_l = sm.a(var5.field_l, param0, -126, 16);
              if (var3 == 0) {
                break L0;
              } else {
                var5.field_c = (short)param0.b(16, (byte) -94);
                var5.field_x = sm.a(var5.field_x, param0, param1 + 16608, 16);
                var5.field_g = sm.a(var5.field_g, param0, -124, 16);
                var5.field_L = sm.a(var5.field_L, param0, -113, 16);
                var5.field_e = sm.a(var5.field_e, param0, -127, 16);
                var5.field_k = sm.a(var5.field_k, param0, -118, 16);
                var5.field_h = sm.a(var5.field_h, param0, param1 + 16615, 16);
                break L0;
              }
            }
            L1: {
              if (var4 == 0) {
                break L1;
              } else {
                int discarded$1 = param0.b(16, (byte) -127);
                var5.field_z = sm.a(var5.field_z, param0, -121, 16);
                var5.field_C = sm.a(var5.field_C, param0, param1 + 16619, 16);
                var5.field_G = sm.a(var5.field_G, param0, -114, 16);
                var5.field_y = sm.a(var5.field_y, param0, param1 + 16619, 16);
                var5.field_R = sm.a(var5.field_R, param0, param1 + 16623, 16);
                break L1;
              }
            }
            L2: {
              if (!kh.a(param0, false)) {
                break L2;
              } else {
                var5.field_K = sm.a(var5.field_K, param0, -112, 16);
                break L2;
              }
            }
            L3: {
              if (!kh.a(param0, false)) {
                break L3;
              } else {
                var5.field_a = ua.a(16, 0, var5.field_a, param0);
                var6 = 0;
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var5.field_a.length) {
                    if (var6 == 0) {
                      var5.field_a = null;
                      break L3;
                    } else {
                      var5.field_E = (byte)(var6 + 1);
                      break L3;
                    }
                  } else {
                    if (var6 < (255 & var5.field_a[var7])) {
                      var6 = 255 & var5.field_a[var7];
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
            return var5;
          } else {
            throw new IllegalStateException("" + var2);
          }
        } else {
          return null;
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param0 >= -47) {
            return;
        }
        this.b((byte) 55);
        boolean discarded$0 = param2.drawImage(((fh) this).field_f, param1, param3, (java.awt.image.ImageObserver) this);
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((fh) this).field_c = new int[param1 * param2 - -1];
        ((fh) this).field_b = param1;
        ((fh) this).field_h = param2;
        if (param3 > -97) {
            ((fh) this).field_m = null;
        }
        ((fh) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((fh) this).field_f = param0.createImage((java.awt.image.ImageProducer) this);
        this.b((byte) 117);
        boolean discarded$0 = param0.prepareImage(((fh) this).field_f, (java.awt.image.ImageObserver) this);
        this.b((byte) 75);
        boolean discarded$1 = param0.prepareImage(((fh) this).field_f, (java.awt.image.ImageObserver) this);
        this.b((byte) 45);
        boolean discarded$2 = param0.prepareImage(((fh) this).field_f, (java.awt.image.ImageObserver) this);
        ((fh) this).a(-1);
    }

    public static void d(int param0) {
        if (param0 > -27) {
            return;
        }
        field_j = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    fh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_j = "Connection restored.";
        field_n = new mf[3];
    }
}
