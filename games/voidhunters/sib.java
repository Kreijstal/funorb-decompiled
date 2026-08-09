/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sib extends mab implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static int field_i;
    private java.awt.image.ImageConsumer field_k;
    private java.awt.image.ColorModel field_j;

    final void a(int param0, int param1, java.awt.Component param2, byte param3) {
        try {
            this.field_b = param1;
            this.field_c = new int[param1 * param0 - -1];
            this.field_d = param0;
            this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_g = param2.createImage((java.awt.image.ImageProducer) (this));
            this.b((byte) -69);
            param2.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
            this.b((byte) -113);
            param2.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
            this.b((byte) -67);
            int var5_int = -10 % ((12 - param3) / 45);
            param2.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
            this.a((byte) -108);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sib.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sib.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void b(byte param0) {
        int var2;
        if (null == this.field_k) {
          return;
        } else {
          var2 = 99 / ((param0 - 29) / 63);
          this.field_k.setPixels(0, 0, this.field_d, this.field_b, this.field_j, this.field_c, 0, this.field_d);
          this.field_k.imageComplete(2);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    final void a(java.awt.Graphics param0, int param1, byte param2, int param3) {
        try {
            this.b((byte) -42);
            int var5_int = -106 % ((-6 - param2) / 41);
            param0.drawImage(this.field_g, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sib.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(int param0, ds param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        Exception var4 = null;
        byte[] var5 = null;
        String var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -82 % ((46 - param2) / 62);
            try {
              L1: {
                L2: {
                  var4_int = param1.f(50);
                  if (param0 >= var4_int) {
                    break L2;
                  } else {
                    var4_int = param0;
                    break L2;
                  }
                }
                var5 = new byte[var4_int];
                param1.field_e = param1.field_e + eob.field_o.a(0, param1.field_h, var5, var4_int, 0, param1.field_e);
                var6 = tja.a(0, 0, var4_int, var5);
                stackIn_4_0 = (String) (var6);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
              stackIn_6_0 = "Cabbage";
              return stackIn_6_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("sib.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
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
            if (param0 == this.field_k) {
              this.field_k = null;
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

            stackIn_6_1 = new StringBuilder().append("sib.removeConsumer(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    sib() {
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_k = param0;
            param0.setDimensions(this.field_d, this.field_b);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "sib.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
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

            stackIn_4_1 = new StringBuilder().append("sib.imageUpdate(");

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
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    static {
        field_i = 1024;
    }
}
