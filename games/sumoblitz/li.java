/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class li extends ce implements java.awt.image.ImageProducer {
    static wb[] field_v;
    static int field_r;
    private java.awt.image.ColorModel field_s;
    static int field_u;
    private java.awt.Image field_x;
    private java.awt.image.ImageConsumer field_t;
    static String field_y;
    private java.awt.Canvas field_w;

    final static Boolean c(int param0) {
        Boolean var1 = aw.field_j;
        aw.field_j = null;
        int var2 = -13 % ((8 - param0) / 32);
        return var1;
    }

    private final synchronized void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (null != this.field_t) {
          this.field_t.setPixels(param1, param0, param2, param4, this.field_s, this.field_m, this.field_n * param0 + param1, this.field_n);
          if (!param3) {
            field_v = (wb[]) null;
            this.field_t.imageComplete(2);
            return;
          } else {
            this.field_t.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    private final synchronized void c(boolean param0) {
        if (this.field_t == null) {
          return;
        } else {
          if (!param0) {
            field_v = (wb[]) null;
            this.field_t.setPixels(0, 0, this.field_n, this.field_k, this.field_s, this.field_m, 0, this.field_n);
            this.field_t.imageComplete(2);
            return;
          } else {
            this.field_t.setPixels(0, 0, this.field_n, this.field_k, this.field_s, this.field_m, 0, this.field_n);
            this.field_t.imageComplete(2);
            return;
          }
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
              if (this.field_t != param0) {
                break L1;
              } else {
                this.field_t = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("li.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void d(int param0) {
        if (param0 < 118) {
            return;
        }
        field_v = null;
        field_y = null;
    }

    final void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        try {
            this.field_k = param1;
            this.field_n = param2;
            this.field_w = param0;
            this.field_m = new int[this.field_n * this.field_k];
            this.field_s = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_x = this.field_w.createImage((java.awt.image.ImageProducer) (this));
            this.c(true);
            discarded$0 = this.field_w.prepareImage(this.field_x, (java.awt.image.ImageObserver) ((Object) this.field_w));
            int var5_int = 85 / ((-34 - param3) / 39);
            this.c(true);
            discarded$1 = this.field_w.prepareImage(this.field_x, (java.awt.image.ImageObserver) ((Object) this.field_w));
            this.c(true);
            discarded$2 = this.field_w.prepareImage(this.field_x, (java.awt.image.ImageObserver) ((Object) this.field_w));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "li.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_t;
    }

    li() {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "li.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        java.awt.Shape var9 = null;
        boolean discarded$0 = false;
        try {
            this.a(param2, param4, param3, true, param5);
            if (param7 >= -47) {
                java.awt.Canvas var10 = (java.awt.Canvas) null;
                this.a((java.awt.Canvas) null, -85, -107, 85);
            }
            var9 = param0.getClip();
            param0.clipRect(param6, param1, param3, param5);
            discarded$0 = param0.drawImage(this.field_x, -param4 + param6, -param2 + param1, (java.awt.image.ImageObserver) ((Object) this.field_w));
            param0.setClip(var9);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "li.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_t = param0;
            param0.setDimensions(this.field_n, this.field_k);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_s);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "li.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = -1;
        field_y = "Loading...";
    }
}
