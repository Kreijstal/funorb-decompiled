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

            stackIn_4_1 = new StringBuilder().append("vj.imageUpdate(");

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
          throw lj.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var7 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            bd.field_h = kd.field_p;
            if (param0 == -21614) {
              break L0;
            } else {
              vj.d(-99);
              break L0;
            }
          }
          if (-256 != (param2 ^ -1)) {
            if (-101 < (param2 ^ -1)) {
              sd.field_d = ij.a(param2, param1, true);
              return;
            } else {
              if ((param2 ^ -1) < -106) {
                sd.field_d = ij.a(param2, param1, true);
                return;
              } else {
                var7 = param3;
                en.a(var7, 18423);
                sd.field_d = rh.a(param0 + 21734, param3);
                return;
              }
            }
          } else {
            L1: {
              if (-14 >= (me.field_j ^ -1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                stackIn_7_0 = 1;
                break L1;
              }
            }
            sd.field_d = hn.a(stackIn_7_0 != 0, (byte) 105);
            var6 = (String[]) null;
            en.a((String[]) null, 18423);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("vj.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_m == param0) {
              this.field_m = null;
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

            stackIn_6_1 = new StringBuilder().append("vj.removeConsumer(");

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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3;
        if (param0 != -101) {
          field_l = (String) null;
          var3 = param1 >> -1494965825 & -1 + param2;
          return var3 + ((param1 >>> 1082098367) + param1) % param2;
        } else {
          var3 = param1 >> -1494965825 & -1 + param2;
          return var3 + ((param1 >>> 1082098367) + param1) % param2;
        }
    }

    vj() {
    }

    private final synchronized void c(int param0) {
        if (null == this.field_m) {
          return;
        } else {
          this.field_m.setPixels(0, 0, this.field_c, this.field_d, this.field_n, this.field_f, 0, this.field_c);
          if (param0 != -1494965825) {
            field_l = (String) null;
            this.field_m.imageComplete(2);
            return;
          } else {
            this.field_m.imageComplete(2);
            return;
          }
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 1) {
          field_l = (String) null;
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        } else {
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        }
    }

    static {
        field_l = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
