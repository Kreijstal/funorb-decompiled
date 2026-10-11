/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ib extends ef implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static String field_o;
    static boolean[] field_m;
    private java.awt.image.ColorModel field_p;
    static int field_n;
    static String field_j;
    static int field_k;

    final static int a(int param0, byte[] param1, int param2, byte param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          var4_int = -1;
          for (var5 = param2; param0 > var5; var5++) {
            var4_int = var4_int >>> 8 ^ sh.field_gb[(var4_int ^ param1[var5]) & 255];
          }
          if (param3 != -33) {
            field_n = -120;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ib.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static ph a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ph[] var3 = null;
        int var4 = 0;
        ph var5 = null;
        int var6 = 0;
        ph stackIn_4_0 = null;
        ph stackIn_11_0 = null;
        ph stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          var2 = ah.a(-3058, param0, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_4_0 = ug.field_k;
            return stackIn_4_0;
          }
          var3 = ge.b(27579);
          if (param1 > -41) {
            field_k = -94;
          }
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              stackIn_14_0 = ug.field_k;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a(var2, 0)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("ib.I(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void b(boolean param0) {
        if (null == this.field_l) {
          return;
        }
        this.field_l.setPixels(0, 0, this.field_h, this.field_b, this.field_p, this.field_g, 0, this.field_h);
        if (param0) {
          this.field_l.imageComplete(2);
          return;
        }
        java.awt.Component var3 = (java.awt.Component) null;
        this.a(-107, (byte) -17, (java.awt.Component) null, 70);
        this.field_l.imageComplete(2);
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_l = param0;
          param0.setDimensions(this.field_h, this.field_b);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_p);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ib.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(si param0, java.awt.Frame param1, byte param2) {
        mk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Bounce.field_N;
        try {
          if (param2 < 68) {
            return;
          }
          while (true) {
            var3 = param0.a(param1, (byte) 4);
            while (var3.field_f == 0) {
              wh.a(10L, 19406);
            }
            if (var3.field_f != 1) {
              wh.a(100L, 19406);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ib.L(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

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
          stackIn_4_1 = new StringBuilder().append("ib.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          this.b(true);
          int var5_int = 111 % ((-33 - param3) / 52);
          param2.drawImage(this.field_e, param1, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ib.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_l == param0) {
            this.field_l = null;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ib.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    ib() {
    }

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
          field_n = 64;
          field_o = null;
          field_m = null;
          return;
        }
        field_o = null;
        field_m = null;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ib.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
    }

    final void a(int param0, byte param1, java.awt.Component param2, int param3) {
        try {
          this.field_h = param0;
          this.field_b = param3;
          this.field_g = new int[1 + param0 * param3];
          this.field_p = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_e = param2.createImage((java.awt.image.ImageProducer) (this));
          int var5_int = -116 % ((-63 - param1) / 38);
          this.b(true);
          param2.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.b(true);
          param2.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.b(true);
          param2.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.c(64);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ib.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_m = new boolean[64];
        field_j = "Please wait for high scores";
    }
}
