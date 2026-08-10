/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ub extends rc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_f;
    static ja field_e;
    private java.awt.image.ImageConsumer field_g;

    private final synchronized void b(int param0) {
        if (!(null != this.field_g)) {
            return;
        }
        int var2 = -102 % ((15 - param0) / 43);
        this.field_g.setPixels(0, 0, this.field_c, this.field_a, this.field_f, this.field_b, 0, this.field_c);
        this.field_g.imageComplete(2);
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 12) {
            field_e = (ja) null;
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            this.field_b = new int[param3 * param0 + 1];
            this.field_c = param0;
            this.field_a = param3;
            this.field_f = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_d = param2.createImage((java.awt.image.ImageProducer) (this));
            this.b(81);
            if (param1 > -37) {
                java.awt.Graphics var6 = (java.awt.Graphics) null;
                this.a(114, (java.awt.Graphics) null, 91, 59);
            }
            param2.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
            this.b(101);
            param2.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
            this.b(-64);
            param2.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
            this.a(-91);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ub.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var7);

            stackIn_4_1 = new StringBuilder().append("ub.imageUpdate(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_g == param0;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_g = param0;
            param0.setDimensions(this.field_c, this.field_a);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_f);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ub.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ub.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == this.field_g) {
              this.field_g = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ub.removeConsumer(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        try {
            this.b(-29);
            param1.drawImage(this.field_d, param2, param3, (java.awt.image.ImageObserver) (this));
            if (param0 != -11) {
                this.field_g = (java.awt.image.ImageConsumer) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ub.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    ub() {
    }

    static {
        field_e = new ja();
    }
}
