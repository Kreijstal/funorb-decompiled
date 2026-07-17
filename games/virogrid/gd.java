/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gd extends wf implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_s;
    private java.awt.image.ImageConsumer field_o;
    static wl field_r;
    static String field_p;
    static String field_q;
    static p field_n;

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
            stackOut_2_1 = new StringBuilder().append("gd.imageUpdate(");
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
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (((gd) this).field_o == param0) {
              ((gd) this).field_o = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("gd.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    public static void b(byte param0) {
        field_n = null;
        field_p = null;
        field_q = null;
        if (param0 < 67) {
            gd.b((byte) 93);
            field_r = null;
            return;
        }
        field_r = null;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((gd) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "gd.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((gd) this).field_o;
    }

    private final synchronized void b() {
        if (null == ((gd) this).field_o) {
          return;
        } else {
          ((gd) this).field_o.setPixels(0, 0, ((gd) this).field_c, ((gd) this).field_b, ((gd) this).field_s, ((gd) this).field_l, 0, ((gd) this).field_c);
          ((gd) this).field_o.imageComplete(2);
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((gd) this).field_o = param0;
            param0.setDimensions(((gd) this).field_c, ((gd) this).field_b);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((gd) this).field_s);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "gd.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        ((gd) this).field_l = new int[param0 * param1 - -1];
        ((gd) this).field_c = param1;
        ((gd) this).field_b = param0;
        if (param2 >= -24) {
            return;
        }
        try {
            ((gd) this).field_s = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((gd) this).field_h = param3.createImage((java.awt.image.ImageProducer) this);
            int discarded$0 = 2;
            this.b();
            boolean discarded$1 = param3.prepareImage(((gd) this).field_h, (java.awt.image.ImageObserver) this);
            int discarded$2 = 2;
            this.b();
            boolean discarded$3 = param3.prepareImage(((gd) this).field_h, (java.awt.image.ImageObserver) this);
            int discarded$4 = 2;
            this.b();
            boolean discarded$5 = param3.prepareImage(((gd) this).field_h, (java.awt.image.ImageObserver) this);
            ((gd) this).a((byte) 29);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "gd.A(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            if (param0 <= 6) {
                Object var6 = null;
                ((gd) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
            }
            int discarded$0 = 2;
            this.b();
            boolean discarded$1 = param2.drawImage(((gd) this).field_h, param1, param3, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "gd.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    gd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new wl();
        field_p = "Security";
        field_q = "Shortcut Reference";
        field_n = new p();
    }
}
