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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("gd.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_o != param0) {
            return;
          }
          this.field_o = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gd.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gd.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_o;
    }

    private final synchronized void b(int param0) {
        if (null != this.field_o) {
          this.field_o.setPixels(0, 0, this.field_c, this.field_b, this.field_s, this.field_l, 0, this.field_c);
          this.field_o.imageComplete(param0);
          return;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_o = param0;
          param0.setDimensions(this.field_c, this.field_b);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_s);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gd.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        this.field_l = new int[param0 * param1 + 1];
        this.field_c = param1;
        this.field_b = param0;
        if (param2 >= -24) {
          return;
        }
        try {
          this.field_s = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_h = param3.createImage((java.awt.image.ImageProducer) (this));
          this.b(2);
          param3.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
          this.b(2);
          param3.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
          this.b(2);
          param3.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
          this.a((byte) 29);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gd.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          if (param0 <= 6) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
          }
          this.b(2);
          param2.drawImage(this.field_h, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "gd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    gd() {
    }

    static {
        field_r = new wl();
        field_p = "Security";
        field_q = "Shortcut Reference";
        field_n = new p();
    }
}
