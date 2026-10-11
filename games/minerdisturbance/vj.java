/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vj extends ci implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_n;
    static String field_l;
    private java.awt.image.ImageConsumer field_m;

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vj.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
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
          stackIn_4_1 = new StringBuilder().append("vj.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          bd.field_h = kd.field_p;
          if (param0 != -21614) {
            vj.d(-99);
          }
          if (param2 == 255) {
            stackIn_7_0 = !(me.field_j >= 13);
            sd.field_d = hn.a(stackIn_7_0, (byte) 105);
            var6 = (String[]) null;
            en.a((String[]) null, 18423);
            return;
          }
          if (param2 < 100) {
            sd.field_d = ij.a(param2, param1, true);
            return;
          }
          if (param2 > 105) {
            sd.field_d = ij.a(param2, param1, true);
            return;
          }
          var7 = param3;
          en.a(var7, 18423);
          sd.field_d = rh.a(param0 + 21734, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("vj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          if (param2 != 13961) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
          }
          this.field_d = param1;
          this.field_f = new int[1 + param1 * param3];
          this.field_c = param3;
          this.field_n = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_g = param0.createImage((java.awt.image.ImageProducer) (this));
          this.c(-1494965825);
          param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.c(-1494965825);
          param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.c(param2 ^ -1494968522);
          param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.a((byte) -45);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_m == param0;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          int var5_int = 40 / ((62 - param1) / 50);
          this.c(-1494965825);
          param2.drawImage(this.field_g, param3, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_m = param0;
          param0.setDimensions(this.field_c, this.field_d);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_n);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vj.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 16711680) {
          vj.a((byte) 62, -63, 61);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m != param0) {
            return;
          }
          this.field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vj.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param0 == -101) {
          var3 = param1 >> 31 & -1 + param2;
          return var3 + ((param1 >>> 31) + param1) % param2;
        }
        field_l = (String) null;
        var3Lifetime1 = param1 >> 31 & -1 + param2;
        return var3Lifetime1 + ((param1 >>> 31) + param1) % param2;
    }

    vj() {
    }

    private final synchronized void c(int param0) {
        if (null == this.field_m) {
          return;
        }
        this.field_m.setPixels(0, 0, this.field_c, this.field_d, this.field_n, this.field_f, 0, this.field_c);
        if (param0 == -1494965825) {
          this.field_m.imageComplete(2);
          return;
        }
        field_l = (String) null;
        this.field_m.imageComplete(2);
    }

    final static void a(String param0, int param1) {
        if (param1 == 1) {
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        }
        field_l = (String) null;
        System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
    }

    static {
        field_l = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
