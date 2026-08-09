/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kf extends c implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_l;
    static eh field_j;
    static pn field_m;
    static cn field_k;
    static String field_q;
    static String field_i;
    static qg field_o;
    static nh field_p;
    private java.awt.image.ImageConsumer field_n;

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

            stackIn_4_1 = new StringBuilder().append("kf.imageUpdate(");

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
          throw vk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 > -75) {
            return -59;
        }
        return 30;
    }

    public static void b(boolean param0) {
        field_q = null;
        if (param0) {
          field_j = (eh) null;
          field_k = null;
          field_j = null;
          field_i = null;
          field_o = null;
          field_p = null;
          field_m = null;
          return;
        } else {
          field_k = null;
          field_j = null;
          field_i = null;
          field_o = null;
          field_p = null;
          field_m = null;
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kf.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_n = param0;
            param0.setDimensions(this.field_b, this.field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_l);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kf.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_n;
    }

    private final synchronized void b(int param0) {
        if (!(this.field_n != null)) {
            return;
        }
        this.field_n.setPixels(param0, 0, this.field_b, this.field_f, this.field_l, this.field_g, 0, this.field_b);
        this.field_n.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_n) {
                break L1;
              } else {
                this.field_n = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kf.removeConsumer(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, boolean param1, java.awt.Graphics param2, int param3) {
        RuntimeException runtimeException = null;
        java.awt.Graphics var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(0);
              param2.drawImage(this.field_a, param0, param3, (java.awt.image.ImageObserver) (this));
              if (param1) {
                break L1;
              } else {
                var6 = (java.awt.Graphics) null;
                this.a(-93, true, (java.awt.Graphics) null, -124);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kf.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, java.awt.Component param1, int param2, int param3) {
        try {
            this.field_b = param3;
            this.field_f = param2;
            this.field_g = new int[param3 * param2 - -1];
            this.field_l = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_a = param1.createImage((java.awt.image.ImageProducer) (this));
            this.b(0);
            param1.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.b(0);
            param1.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            int var5_int = -26 % ((-15 - param0) / 33);
            this.b(0);
            param1.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    kf() {
    }

    static {
        field_q = "Hell Beast";
        field_i = "Sorceress";
    }
}
