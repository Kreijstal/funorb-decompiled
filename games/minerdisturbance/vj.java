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
            ((vj) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "vj.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("vj.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
          if (param2 != 255) {
            if (param2 < 100) {
              sd.field_d = ij.a(param2, param1, true);
              return;
            } else {
              if (param2 > 105) {
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
              if (me.field_j >= 13) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            sd.field_d = hn.a(stackIn_7_0 != 0, (byte) 105);
            var6 = null;
            en.a((String[]) null, 18423);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("vj.K(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            if (param2 != 13961) {
                Object var6 = null;
                ((vj) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
            }
            ((vj) this).field_d = param1;
            ((vj) this).field_f = new int[1 + param1 * param3];
            ((vj) this).field_c = param3;
            ((vj) this).field_n = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((vj) this).field_g = param0.createImage((java.awt.image.ImageProducer) this);
            this.c(-1494965825);
            boolean discarded$0 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
            this.c(-1494965825);
            boolean discarded$1 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
            this.c(param2 ^ -1494968522);
            boolean discarded$2 = param0.prepareImage(((vj) this).field_g, (java.awt.image.ImageObserver) this);
            ((vj) this).a((byte) -45);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "vj.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((vj) this).field_m == param0;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            int var5_int = 40 / ((62 - param1) / 50);
            this.c(-1494965825);
            boolean discarded$0 = param2.drawImage(((vj) this).field_g, param3, param0, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "vj.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((vj) this).field_m = param0;
            param0.setDimensions(((vj) this).field_c, ((vj) this).field_d);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((vj) this).field_n);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "vj.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 16711680) {
            int discarded$0 = vj.a((byte) 62, -63, 61);
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (((vj) this).field_m == param0) {
              ((vj) this).field_m = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vj.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        if (param0 != -101) {
          field_l = null;
          var3 = param1 >> 31 & -1 + param2;
          return var3 + ((param1 >>> 31) + param1) % param2;
        } else {
          var3 = param1 >> 31 & -1 + param2;
          return var3 + ((param1 >>> 31) + param1) % param2;
        }
    }

    vj() {
    }

    private final synchronized void c(int param0) {
        if (null == ((vj) this).field_m) {
          return;
        } else {
          ((vj) this).field_m.setPixels(0, 0, ((vj) this).field_c, ((vj) this).field_d, ((vj) this).field_n, ((vj) this).field_f, 0, ((vj) this).field_c);
          if (param0 != -1494965825) {
            field_l = null;
            ((vj) this).field_m.imageComplete(2);
            return;
          } else {
            ((vj) this).field_m.imageComplete(2);
            return;
          }
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 1) {
          field_l = null;
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        } else {
          System.out.println("Error: " + ld.a("\n", param1 ^ -2, param0, "%0a"));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
