/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ma extends lk implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_j;
    static String field_k;
    private java.awt.image.ImageConsumer field_l;
    static int field_m;

    private final synchronized void a(byte param0) {
        if (param0 != -8) {
            this.a((byte) 5);
            if (!(((ma) this).field_l != null)) {
                return;
            }
            ((ma) this).field_l.setPixels(0, 0, ((ma) this).field_i, ((ma) this).field_d, ((ma) this).field_j, ((ma) this).field_e, 0, ((ma) this).field_i);
            ((ma) this).field_l.imageComplete(2);
            return;
        }
        if (!(((ma) this).field_l != null)) {
            return;
        }
        ((ma) this).field_l.setPixels(0, 0, ((ma) this).field_i, ((ma) this).field_d, ((ma) this).field_j, ((ma) this).field_e, 0, ((ma) this).field_i);
        ((ma) this).field_l.imageComplete(2);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((ma) this).field_l = param0;
        param0.setDimensions(((ma) this).field_i, ((ma) this).field_d);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((ma) this).field_j);
        param0.setHints(14);
    }

    final static void a(boolean param0, int param1) {
        ql var2 = null;
        if (param1 >= 53) {
          td.field_c.b(param0, 0);
          var2 = lq.field_a;
          if (var2 != null) {
            var2.a(td.field_c.field_ob, 54, td.field_c.field_C);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        int var1 = -5 % ((param0 - 1) / 38);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((ma) this).addConsumer(param0);
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        Object var6 = null;
        if (param2 != 15698) {
          var6 = null;
          ((ma) this).a((java.awt.Component) null, -69, -63, 49);
          this.a((byte) -8);
          boolean discarded$4 = param0.drawImage(((ma) this).field_b, param3, param1, (java.awt.image.ImageObserver) this);
          return;
        } else {
          this.a((byte) -8);
          boolean discarded$5 = param0.drawImage(((ma) this).field_b, param3, param1, (java.awt.image.ImageObserver) this);
          return;
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            ((ma) this).field_d = param3;
            ((ma) this).field_e = new int[1 + param3 * param2];
            ((ma) this).field_i = param2;
            ((ma) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((ma) this).field_b = param0.createImage((java.awt.image.ImageProducer) this);
            this.a((byte) -8);
            boolean discarded$12 = param0.prepareImage(((ma) this).field_b, (java.awt.image.ImageObserver) this);
            if (param1 != -3) {
              return;
            } else {
              this.a((byte) -8);
              boolean discarded$13 = param0.prepareImage(((ma) this).field_b, (java.awt.image.ImageObserver) this);
              this.a((byte) -8);
              boolean discarded$14 = param0.prepareImage(((ma) this).field_b, (java.awt.image.ImageObserver) this);
              ((ma) this).a(44);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((ma) this).field_l) {
            ((ma) this).field_l = null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((ma) this).field_l;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    ma() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Accept";
    }
}
