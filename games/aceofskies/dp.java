/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dp extends pj implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_j;
    private java.awt.image.ColorModel field_g;
    static vs field_h;
    static String field_i;

    private final synchronized void b(int param0) {
        if (!(null != ((dp) this).field_j)) {
            return;
        }
        ((dp) this).field_j.setPixels(param0, 0, ((dp) this).field_c, ((dp) this).field_b, ((dp) this).field_g, ((dp) this).field_e, 0, ((dp) this).field_c);
        ((dp) this).field_j.imageComplete(2);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    final void a(byte param0, int param1, int param2, java.awt.Component param3) {
        try {
            java.awt.image.ImageConsumer var6 = null;
            ((dp) this).field_e = new int[param2 * param1 - -1];
            ((dp) this).field_c = param2;
            ((dp) this).field_b = param1;
            ((dp) this).field_g = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((dp) this).field_d = param3.createImage((java.awt.image.ImageProducer) this);
            this.b(0);
            boolean discarded$6 = param3.prepareImage(((dp) this).field_d, (java.awt.image.ImageObserver) this);
            this.b(0);
            if (param0 > -31) {
              var6 = (java.awt.image.ImageConsumer) null;
              boolean discarded$7 = ((dp) this).isConsumer((java.awt.image.ImageConsumer) null);
              boolean discarded$8 = param3.prepareImage(((dp) this).field_d, (java.awt.image.ImageObserver) this);
              this.b(0);
              boolean discarded$9 = param3.prepareImage(((dp) this).field_d, (java.awt.image.ImageObserver) this);
              ((dp) this).a(-12595);
              return;
            } else {
              boolean discarded$10 = param3.prepareImage(((dp) this).field_d, (java.awt.image.ImageObserver) this);
              this.b(0);
              boolean discarded$11 = param3.prepareImage(((dp) this).field_d, (java.awt.image.ImageObserver) this);
              ((dp) this).a(-12595);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 != -55) {
            dp.d((byte) 111);
            field_i = null;
            field_h = null;
            return;
        }
        field_i = null;
        field_h = null;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((dp) this).field_j = param0;
        ((java.awt.image.ImageConsumer) param0).setDimensions(((dp) this).field_c, ((dp) this).field_b);
        ((java.awt.image.ImageConsumer) param0).setProperties((Hashtable) null);
        ((java.awt.image.ImageConsumer) param0).setColorModel(((dp) this).field_g);
        ((java.awt.image.ImageConsumer) param0).setHints(14);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((dp) this).field_j;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((dp) this).field_j) {
            ((dp) this).field_j = null;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((dp) this).addConsumer(param0);
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        int var5 = 62 % ((param0 - -72) / 48);
        this.b(0);
        boolean discarded$0 = param1.drawImage(((dp) this).field_d, param3, param2, (java.awt.image.ImageObserver) this);
    }

    dp() {
    }

    static {
    }
}
