/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hq extends gpb implements java.awt.image.ImageProducer {
    private java.awt.image.ColorModel field_h;
    static String field_i;
    private java.awt.Image field_j;
    private java.awt.image.ImageConsumer field_g;
    private java.awt.Canvas field_k;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((hq) this).addConsumer(param0);
    }

    private final synchronized void e(byte param0) {
        if (param0 != 105) {
            Object var3 = null;
            boolean discarded$4 = ((hq) this).isConsumer((java.awt.image.ImageConsumer) null);
            if (!(((hq) this).field_g != null)) {
                return;
            }
            ((hq) this).field_g.setPixels(0, 0, ((hq) this).field_e, ((hq) this).field_d, ((hq) this).field_h, ((hq) this).field_f, 0, ((hq) this).field_e);
            ((hq) this).field_g.imageComplete(2);
            return;
        }
        if (!(((hq) this).field_g != null)) {
            return;
        }
        ((hq) this).field_g.setPixels(0, 0, ((hq) this).field_e, ((hq) this).field_d, ((hq) this).field_h, ((hq) this).field_f, 0, ((hq) this).field_e);
        ((hq) this).field_g.imageComplete(2);
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Shape var9 = null;
        this.a(param2, param4, (byte) 31, param1, param7);
        var9 = param0.getClip();
        param0.clipRect(param6, param5, param1, param7);
        if (param3 != 32255) {
          ((hq) this).field_j = null;
          boolean discarded$4 = param0.drawImage(((hq) this).field_j, -param4 + param6, param5 - param2, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
          param0.setClip(var9);
          return;
        } else {
          boolean discarded$5 = param0.drawImage(((hq) this).field_j, -param4 + param6, param5 - param2, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
          param0.setClip(var9);
          return;
        }
    }

    final static void d(byte param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (vsa.field_r == null) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            vsa.field_r.a(0, 0L);
                            vsa.field_r.a(24, qga.field_b.field_e, (byte) -88, qga.field_b.field_h);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        if (param0 < 53) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        qga.field_b.field_e = qga.field_b.field_e + 24;
                        return;
                    }
                    case 4: {
                        return;
                    }
                    case 6: {
                        var1 = (Exception) (Object) caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (param0 < 53) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        qga.field_b.field_e = qga.field_b.field_e + 24;
                        return;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((hq) this).field_g;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((hq) this).field_g = param0;
        param0.setDimensions(((hq) this).field_e, ((hq) this).field_d);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((hq) this).field_h);
        param0.setHints(14);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        try {
            ((hq) this).field_k = param3;
            ((hq) this).field_e = param1;
            ((hq) this).field_d = param2;
            ((hq) this).field_f = new int[((hq) this).field_d * ((hq) this).field_e];
            ((hq) this).field_h = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((hq) this).field_j = ((hq) this).field_k.createImage((java.awt.image.ImageProducer) this);
            this.e((byte) 105);
            boolean discarded$14 = ((hq) this).field_k.prepareImage(((hq) this).field_j, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
            if (param0 != 4904) {
              return;
            } else {
              this.e((byte) 105);
              boolean discarded$15 = ((hq) this).field_k.prepareImage(((hq) this).field_j, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
              this.e((byte) 105);
              boolean discarded$16 = ((hq) this).field_k.prepareImage(((hq) this).field_j, (java.awt.image.ImageObserver) (Object) ((hq) this).field_k);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(byte param0) {
        int var1 = -59 / ((param0 - -84) / 41);
        field_i = null;
    }

    private final synchronized void a(int param0, int param1, byte param2, int param3, int param4) {
        Object var7 = null;
        if (((hq) this).field_g == null) {
          return;
        } else {
          L0: {
            ((hq) this).field_g.setPixels(param1, param0, param3, param4, ((hq) this).field_h, ((hq) this).field_f, ((hq) this).field_e * param0 + param1, ((hq) this).field_e);
            ((hq) this).field_g.imageComplete(2);
            if (param2 == 31) {
              break L0;
            } else {
              var7 = null;
              ((hq) this).a(39, -33, -57, (java.awt.Canvas) null);
              break L0;
            }
          }
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (param0 == ((hq) this).field_g) {
            ((hq) this).field_g = null;
        }
    }

    hq() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Spawn enemy ship at mouse";
    }
}
