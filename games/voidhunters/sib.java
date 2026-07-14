/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sib extends mab implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static int field_i;
    private java.awt.image.ImageConsumer field_k;
    private java.awt.image.ColorModel field_j;

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        ((sib) this).field_b = param1;
        ((sib) this).field_c = new int[param1 * param0 - -1];
        ((sib) this).field_d = param0;
        ((sib) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((sib) this).field_g = param2.createImage((java.awt.image.ImageProducer) this);
        this.b((byte) -69);
        boolean discarded$0 = param2.prepareImage(((sib) this).field_g, (java.awt.image.ImageObserver) this);
        this.b((byte) -113);
        boolean discarded$1 = param2.prepareImage(((sib) this).field_g, (java.awt.image.ImageObserver) this);
        this.b((byte) -67);
        int var5 = -10 % ((12 - param3) / 45);
        boolean discarded$2 = param2.prepareImage(((sib) this).field_g, (java.awt.image.ImageObserver) this);
        ((sib) this).a((byte) -108);
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        ((sib) this).addConsumer(param0);
    }

    private final synchronized void b(byte param0) {
        int var2 = 0;
        if (null == ((sib) this).field_k) {
          return;
        } else {
          var2 = 99 / ((param0 - 29) / 63);
          ((sib) this).field_k.setPixels(0, 0, ((sib) this).field_d, ((sib) this).field_b, ((sib) this).field_j, ((sib) this).field_c, 0, ((sib) this).field_d);
          ((sib) this).field_k.imageComplete(2);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((sib) this).field_k == param0;
    }

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        this.b((byte) -42);
        int var5 = -106 % ((-6 - param2) / 41);
        boolean discarded$0 = param0.drawImage(((sib) this).field_g, param1, param3, (java.awt.image.ImageObserver) this);
    }

    final static String a(int param0, ds param1, byte param2) {
        int var3 = 0;
        int var4_int = 0;
        Exception var4 = null;
        byte[] var5 = null;
        String var6 = null;
        String stackIn_4_0 = null;
        String stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = -82 % ((46 - param2) / 62);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param1.f(50);
                        if (param0 >= var4_int) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4_int = param0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = new byte[var4_int];
                        param1.field_e = param1.field_e + eob.field_o.a(0, param1.field_h, var5, var4_int, 0, param1.field_e);
                        var6 = tja.a(0, 0, var4_int, var5);
                        stackOut_3_0 = (String) var6;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    var4 = (Exception) (Object) caughtException;
                    return "Cabbage";
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        if (!(param0 != ((sib) this).field_k)) {
            ((sib) this).field_k = null;
        }
    }

    sib() {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        ((sib) this).field_k = param0;
        param0.setDimensions(((sib) this).field_d, ((sib) this).field_b);
        param0.setProperties((Hashtable) null);
        param0.setColorModel(((sib) this).field_j);
        param0.setHints(14);
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 1024;
    }
}
