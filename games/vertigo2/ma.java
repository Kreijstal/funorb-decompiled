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
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("ma.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((ma) this).field_l = param0;
            param0.setDimensions(((ma) this).field_i, ((ma) this).field_d);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((ma) this).field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ma.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0, int param1) {
        td.field_c.b(param0, 0);
        ql var2 = lq.field_a;
        if (var2 != null) {
            var2.a(td.field_c.field_ob, 54, td.field_c.field_C);
            return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        int var1 = 0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((ma) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ma.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        try {
            if (param2 != 15698) {
                Object var6 = null;
                ((ma) this).a((java.awt.Component) null, -69, -63, 49);
            }
            this.a((byte) -8);
            boolean discarded$0 = param0.drawImage(((ma) this).field_b, param3, param1, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ma.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((ma) this).field_d = param3;
        ((ma) this).field_e = new int[1 + param3 * param2];
        ((ma) this).field_i = param2;
        ((ma) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((ma) this).field_b = param0.createImage((java.awt.image.ImageProducer) this);
        this.a((byte) -8);
        boolean discarded$7 = param0.prepareImage(((ma) this).field_b, (java.awt.image.ImageObserver) this);
        if (param1 != -3) {
            return;
        }
        try {
            this.a((byte) -8);
            boolean discarded$8 = param0.prepareImage(((ma) this).field_b, (java.awt.image.ImageObserver) this);
            this.a((byte) -8);
            boolean discarded$9 = param0.prepareImage(((ma) this).field_b, (java.awt.image.ImageObserver) this);
            ((ma) this).a(44);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ma.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != ((ma) this).field_l) {
                break L1;
              } else {
                ((ma) this).field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ma.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
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
