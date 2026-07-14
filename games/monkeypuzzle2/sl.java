/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sl extends ba implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static ta field_o;
    static int[] field_k;
    static String field_n;
    static int field_j;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_m;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        this.b(-102);
        boolean discarded$9 = param2.drawImage(((sl) this).field_b, param0, param3, (java.awt.image.ImageObserver) this);
        if (param1 != 7) {
            Object var6 = null;
            ((sl) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((sl) this).field_l == param0;
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (!(!th.a(false, param1))) {
            return true;
        }
        char[] var6 = bi.field_s;
        char[] var2 = var6;
        for (var3 = param0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (param1 == var4) {
                return true;
            }
        }
        var2 = ff.field_e;
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            if (var4 == param1) {
                return true;
            }
        }
        return false;
    }

    public static void b(byte param0) {
        field_o = null;
        field_n = null;
        field_k = null;
        if (param0 != 74) {
            sl.a(22, (byte) -64);
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        ((sl) this).field_i = param2;
        ((sl) this).field_e = new int[1 + param2 * param0];
        ((sl) this).field_g = param0;
        ((sl) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((sl) this).field_b = param1.createImage((java.awt.image.ImageProducer) this);
        this.b(-68);
        boolean discarded$0 = param1.prepareImage(((sl) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(-78);
        if (param3 > -10) {
            Object var6 = null;
            boolean discarded$1 = ((sl) this).isConsumer((java.awt.image.ImageConsumer) null);
        }
        boolean discarded$2 = param1.prepareImage(((sl) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(-62);
        boolean discarded$3 = param1.prepareImage(((sl) this).field_b, (java.awt.image.ImageObserver) this);
        ((sl) this).a((byte) 112);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((sl) this).field_l = param0;
        param0.setDimensions(((sl) this).field_g, ((sl) this).field_i);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((sl) this).field_m);
        param0.setHints(14);
    }

    final static void b(boolean param0) {
        ki var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = (ki) (Object) hd.field_u.a((byte) -117);
        L0: while (true) {
          if (var1 == null) {
            L1: {
              if (param0) {
                break L1;
              } else {
                sl.a(6, (byte) 31);
                break L1;
              }
            }
            ac.field_a.a((byte) 127);
            return;
          } else {
            L2: {
              if (var1.field_t != null) {
                break L2;
              } else {
                var1.b((byte) -106);
                var1.f(-7);
                if ((float)var1.field_y + var1.field_q >= 480.0f) {
                  var1.field_t = ri.field_b;
                  var1 = (ki) (Object) hd.field_u.d((byte) 63);
                  continue L0;
                } else {
                  L3: {
                    if (!var1.field_E) {
                      break L3;
                    } else {
                      if (var1.field_q - (float)var1.field_y < (float)hf.field_f.field_O) {
                        break L3;
                      } else {
                        lb.b(false);
                        break L3;
                      }
                    }
                  }
                  if (!var1.field_E) {
                    if ((float)var1.field_y + var1.field_q <= 0.0f) {
                      dc.field_e = 0;
                      var1.field_q = var1.field_q - (var1.field_q + (float)var1.field_y);
                      var1.field_j = true;
                      var1.field_t = ok.field_a;
                      cj.a((byte) -73, ke.field_h[3]);
                      var1 = (ki) (Object) hd.field_u.d((byte) 63);
                      continue L0;
                    } else {
                      if (!pa.a(var1.field_I, (int)((float)var1.field_G + var1.field_B), var1.field_y + (int)var1.field_q, sb.field_m, 80, 0)) {
                        break L2;
                      } else {
                        L4: {
                          boolean discarded$1 = jj.a(-32680, var1, var1.field_G + ((int)var1.field_B - 80), (int)var1.field_q + var1.field_y);
                          if (0 < var1.field_m) {
                            break L4;
                          } else {
                            if (var1.field_x) {
                              break L4;
                            } else {
                              var1 = (ki) (Object) hd.field_u.d((byte) 63);
                              continue L0;
                            }
                          }
                        }
                        var1.field_t = ok.field_a;
                        lc.field_f = true;
                        var2 = 1;
                        var3 = 0;
                        L5: while (true) {
                          L6: {
                            if (var1.field_m <= var3) {
                              break L6;
                            } else {
                              if (!var1.field_o[var3].field_x) {
                                var2 = 0;
                                break L6;
                              } else {
                                var3++;
                                continue L5;
                              }
                            }
                          }
                          if (var2 == 0) {
                            var1.field_v = var1.field_v * 0.5f;
                            var1.field_D = var1.field_D * 0.5f;
                            var1.b((byte) -115);
                            break L2;
                          } else {
                            var1 = (ki) (Object) hd.field_u.d((byte) 63);
                            continue L0;
                          }
                        }
                      }
                    }
                  } else {
                    var1 = (ki) (Object) hd.field_u.d((byte) 63);
                    continue L0;
                  }
                }
              }
            }
            var1 = (ki) (Object) hd.field_u.d((byte) 63);
            continue L0;
          }
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final static void a(int param0, byte param1) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        m var5 = (m) (Object) gi.field_l.a((byte) -117);
        int var3 = 65 / ((param1 - -27) / 57);
        while (var5 != null) {
            oe.a(var5, param0, (byte) -95);
            var5 = (m) (Object) gi.field_l.d((byte) 63);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((sl) this).field_l == param0) {
            ((sl) this).field_l = null;
        }
    }

    sl() {
    }

    private final synchronized void b(int param0) {
        if (param0 > -31) {
            Object var3 = null;
            boolean discarded$0 = ((sl) this).imageUpdate((java.awt.Image) null, 57, 66, 101, 18, -15);
        }
        if (null == ((sl) this).field_l) {
            return;
        }
        ((sl) this).field_l.setPixels(0, 0, ((sl) this).field_g, ((sl) this).field_i, ((sl) this).field_m, ((sl) this).field_e, 0, ((sl) this).field_g);
        ((sl) this).field_l.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((sl) this).addConsumer(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_k = new int[5];
    }
}
