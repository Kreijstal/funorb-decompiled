/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mh extends vi implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_k;
    static byte[][] field_j;
    static pb[] field_i;
    private java.awt.image.ImageConsumer field_l;
    static String[] field_h;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (((mh) this).field_l == param0) {
            ((mh) this).field_l = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 2188) {
          field_i = null;
          field_j = null;
          field_h = null;
          field_i = null;
          return;
        } else {
          field_j = null;
          field_h = null;
          field_i = null;
          return;
        }
    }

    private final synchronized void b(boolean param0) {
        Object var3 = null;
        if (((mh) this).field_l != null) {
          if (param0) {
            var3 = null;
            ((mh) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
            ((mh) this).field_l.setPixels(0, 0, ((mh) this).field_g, ((mh) this).field_f, ((mh) this).field_k, ((mh) this).field_e, 0, ((mh) this).field_g);
            ((mh) this).field_l.imageComplete(2);
            return;
          } else {
            ((mh) this).field_l.setPixels(0, 0, ((mh) this).field_g, ((mh) this).field_f, ((mh) this).field_k, ((mh) this).field_e, 0, ((mh) this).field_g);
            ((mh) this).field_l.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, byte param3) {
        ((mh) this).field_e = new int[param2 * param1 - -1];
        ((mh) this).field_f = param1;
        ((mh) this).field_g = param2;
        int var5 = -68 / ((param3 - -79) / 35);
        ((mh) this).field_k = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((mh) this).field_b = param0.createImage((java.awt.image.ImageProducer) this);
        this.b(false);
        boolean discarded$0 = param0.prepareImage(((mh) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(false);
        boolean discarded$1 = param0.prepareImage(((mh) this).field_b, (java.awt.image.ImageObserver) this);
        this.b(false);
        boolean discarded$2 = param0.prepareImage(((mh) this).field_b, (java.awt.image.ImageObserver) this);
        ((mh) this).a((byte) -107);
    }

    final static boolean a(ha param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 >= -2) {
          L0: {
            field_h = null;
            if (1 != param0.e(1, 8)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (1 != param0.e(1, 8)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1, String param2, uj param3, bd param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = stellarshard.field_B;
        var5 = 0;
        var6 = -1;
        var7 = param0;
        L0: while (true) {
          if (param2.length() <= var7) {
            return;
          } else {
            L1: {
              var8 = param2.charAt(var7);
              if (var8 != 60) {
                break L1;
              } else {
                var6 = (var5 >> 1213145288) - -param3.field_a[0] - -param4.b(param2.substring(0, var7));
                break L1;
              }
            }
            L2: {
              if (-1 == var6) {
                L3: {
                  if (32 != var8) {
                    break L3;
                  } else {
                    var5 = var5 + param1;
                    break L3;
                  }
                }
                param3.field_a[var7] = (var5 >> -570928088) + (param3.field_a[0] - -param4.b(param2.substring(0, 1 + var7))) - param4.a((char) var8);
                break L2;
              } else {
                param3.field_a[var7] = var6;
                break L2;
              }
            }
            if (var8 == 62) {
              var6 = -1;
              var7++;
              var7++;
              continue L0;
            } else {
              var7++;
              var7++;
              continue L0;
            }
          }
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((mh) this).field_l = param0;
        param0.setDimensions(((mh) this).field_g, ((mh) this).field_f);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((mh) this).field_k);
        param0.setHints(14);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((mh) this).addConsumer(param0);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((mh) this).field_l;
    }

    mh() {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        this.b(false);
        boolean discarded$9 = param1.drawImage(((mh) this).field_b, param0, param3, (java.awt.image.ImageObserver) this);
        if (param2 != -22984) {
            field_j = null;
        }
    }

    final static byte[] a(boolean param0, String param1) {
        if (param0) {
            return null;
        }
        return b.field_u.a("", param1, (byte) -12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new byte[50][];
        field_h = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
