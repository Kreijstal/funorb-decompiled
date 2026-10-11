/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uka extends qm implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static hk field_k;
    private java.awt.image.ColorModel field_m;
    static int[] field_i;
    static hca field_h;
    static boolean field_j;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l != param0) {
            return;
          }
          this.field_l = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uka.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uka.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          this.field_f = param0;
          this.field_b = param2;
          this.field_e = new int[1 + param0 * param2];
          if (param3 != 256) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.addConsumer((java.awt.image.ImageConsumer) null);
          }
          this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_c = param1.createImage((java.awt.image.ImageProducer) (this));
          this.b(2);
          param1.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.b(param3 - 254);
          param1.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.b(2);
          param1.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.a((byte) 125);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ema a(long param0, int param1) {
        if (param1 != 28791) {
          return (ema) null;
        }
        return (ema) (wi.field_i.a(param0, (byte) -87));
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kha var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          var4 = (kha) (iea.field_d.b((byte) 90));
          if (param0 >= -40) {
            field_j = true;
          }
          while (var4 != null) {
            if (var3_int == 0) {
              if (param1 == var4.field_h &&
                255 > mg.field_m.field_f[param1] + var4.field_g) {
                var4.d((byte) 95);
                var3_int = 1;
              }
              if (param1 == var4.field_h &&
                mg.field_m.field_f[param1] + var4.field_g == 255) {
                var3_int = 1;
              }
              var4 = (kha) (iea.field_d.c(0));
              continue;
            }
            break;
          }
          if (var3_int == 0) {
            iea.field_d.a(new kha(param1, param2), true);
            qg.field_b.a(-1, new kr(param1, gr.field_a[param1], (kha) (iea.field_d.a(6))));
          }
          iaa.a(-110);
          gu.field_d = gu.field_d + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "uka.D(" + param0 + ',' + param1 + ',' + param2 + ')');
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
          stackIn_4_1 = new StringBuilder().append("uka.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final synchronized void b(int param0) {
        if (this.field_l == null) {
          return;
        }
        this.field_l.setPixels(0, 0, this.field_b, this.field_f, this.field_m, this.field_e, 0, this.field_b);
        this.field_l.imageComplete(param0);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
    }

    uka() {
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          this.b(2);
          if (param0 <= 27) {
            this.field_l = (java.awt.image.ImageConsumer) null;
          }
          param2.drawImage(this.field_c, param3, param1, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uka.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_l = param0;
          param0.setDimensions(this.field_b, this.field_f);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_m);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uka.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 != 81) {
          field_k = (hk) null;
          field_h = null;
          field_k = null;
          return;
        }
        field_h = null;
        field_k = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, kia param1, int param2, boolean param3, byte param4) {
        try {
          int var5_int = -93 % ((param4 + 9) / 42);
          kw.field_j.a(param1, !param3 ? true : false, 1000000, param2, param0, true);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "uka.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static kv[] a(int param0, int param1, vr param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 17 % ((70 - param1) / 38);
          if (g.a(param3, param0, -30744, param2)) {
            return mfa.a(10583);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("uka.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_k = new hk("");
        field_i = new int[4];
    }
}
