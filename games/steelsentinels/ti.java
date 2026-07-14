/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ti extends he implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static cm field_t;
    static int field_w;
    static mg field_m;
    static long field_p;
    static String field_o;
    static String[] field_A;
    static nk field_B;
    static String field_r;
    static int[] field_n;
    static byte[] field_s;
    static volatile boolean field_x;
    static byte[] field_u;
    static String field_q;
    static ul field_z;
    static int field_y;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_v;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ti) this).field_l = param0;
        param0.setDimensions(((ti) this).field_c, ((ti) this).field_i);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ti) this).field_v);
        param0.setHints(14);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ti) this).addConsumer(param0);
    }

    public static void b(int param0) {
        if (param0 != 65280) {
          field_m = null;
          field_m = null;
          field_q = null;
          field_o = null;
          field_z = null;
          field_s = null;
          field_t = null;
          field_u = null;
          field_A = null;
          field_n = null;
          field_r = null;
          field_B = null;
          return;
        } else {
          field_m = null;
          field_q = null;
          field_o = null;
          field_z = null;
          field_s = null;
          field_t = null;
          field_u = null;
          field_A = null;
          field_n = null;
          field_r = null;
          field_B = null;
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(((ti) this).field_l != param0)) {
            ((ti) this).field_l = null;
        }
    }

    final void a(int param0, byte param1, java.awt.Component param2, int param3) {
        try {
            ((ti) this).field_i = param3;
            ((ti) this).field_a = new int[1 + param3 * param0];
            ((ti) this).field_c = param0;
            ((ti) this).field_v = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            if (param1 >= -55) {
              field_A = null;
              ((ti) this).field_b = param2.createImage((java.awt.image.ImageProducer) this);
              this.c(0);
              boolean discarded$6 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
              this.c(0);
              boolean discarded$7 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
              this.c(0);
              boolean discarded$8 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
              ((ti) this).b((byte) 122);
              return;
            } else {
              ((ti) this).field_b = param2.createImage((java.awt.image.ImageProducer) this);
              this.c(0);
              boolean discarded$9 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
              this.c(0);
              boolean discarded$10 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
              this.c(0);
              boolean discarded$11 = param2.prepareImage(((ti) this).field_b, (java.awt.image.ImageObserver) this);
              ((ti) this).b((byte) 122);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((ti) this).field_l == param0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void d(int param0) {
        L0: {
          if (fc.field_a != null) {
            fc.field_a.c();
            break L0;
          } else {
            break L0;
          }
        }
        if (cm.field_j == null) {
          if (param0 != 7094) {
            ti.b(-48);
            return;
          } else {
            return;
          }
        } else {
          cm.field_j.c();
          if (param0 == 7094) {
            return;
          } else {
            ti.b(-48);
            return;
          }
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        this.c(0);
        if (param0 != -51) {
            return;
        }
        boolean discarded$0 = param1.drawImage(((ti) this).field_b, param2, param3, (java.awt.image.ImageObserver) this);
    }

    private final synchronized void c(int param0) {
        if (null == ((ti) this).field_l) {
          return;
        } else {
          ((ti) this).field_l.setPixels(0, param0, ((ti) this).field_c, ((ti) this).field_i, ((ti) this).field_v, ((ti) this).field_a, 0, ((ti) this).field_c);
          ((ti) this).field_l.imageComplete(2);
          return;
        }
    }

    ti() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[4];
        field_r = "Add <%0> to friend list";
        field_q = "Offensive account name";
        field_x = false;
        field_u = new byte[]{(byte)2, (byte)3, (byte)6};
        field_o = "Wingslot";
        field_y = 200;
        field_z = new ul();
    }
}
