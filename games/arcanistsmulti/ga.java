/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ga extends dk implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_t;
    static int[] field_s;
    static String field_q;
    static String field_n;
    private java.awt.image.ColorModel field_o;
    private java.awt.image.ImageConsumer field_p;
    static int field_r;

    public static void a(byte param0) {
        field_t = null;
        field_q = null;
        field_n = null;
        field_s = null;
        if (param0 != -109) {
            ga.a((byte) -48);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_p = param0;
            param0.setDimensions(this.field_e, this.field_m);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_o);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ga.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        try {
            this.b((byte) -118);
            if (param2 != 0) {
                field_q = (String) null;
            }
            param1.drawImage(this.field_j, param3, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
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

            stackIn_4_1 = new StringBuilder().append("ga.imageUpdate(");

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
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        try {
            this.field_l = new int[param0 * param3 + 1];
            this.field_e = param3;
            this.field_m = param0;
            this.field_o = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_j = param1.createImage((java.awt.image.ImageProducer) (this));
            this.b((byte) 115);
            param1.prepareImage(this.field_j, (java.awt.image.ImageObserver) (this));
            this.b((byte) -93);
            param1.prepareImage(this.field_j, (java.awt.image.ImageObserver) (this));
            this.b((byte) -97);
            param1.prepareImage(this.field_j, (java.awt.image.ImageObserver) (this));
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ga.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_p == param0;
    }

    final static boolean b(int param0) {
        if (param0 != 3236) {
            return false;
        }
        return !wn.field_z.a((byte) -84) ? true : false;
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
            if (param0 == this.field_p) {
              this.field_p = null;
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

            stackIn_6_1 = new StringBuilder().append("ga.removeConsumer(");

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
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ga.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ga() {
    }

    private final synchronized void b(byte param0) {
        int var2 = 83 % ((param0 - -44) / 43);
        if (!(null != this.field_p)) {
            return;
        }
        this.field_p.setPixels(0, 0, this.field_e, this.field_m, this.field_o, this.field_l, 0, this.field_e);
        this.field_p.imageComplete(2);
    }

    static {
        field_t = "Create unrated game";
        field_q = "Please remove <%0> from your friend list first.";
        field_n = "Larry";
    }
}
