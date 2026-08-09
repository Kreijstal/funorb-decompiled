/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh extends bi implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_m;
    static byte[][] field_j;
    static int[] field_l;
    static wk[] field_n;
    static String field_i;
    static wk field_k;
    private java.awt.image.ColorModel field_o;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        this.field_b = new int[param0 * param3 + 1];
        if (param1 != -46) {
            return;
        }
        try {
            this.field_g = param3;
            this.field_a = param0;
            this.field_o = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_h = param2.createImage((java.awt.image.ImageProducer) (this));
            this.a(false);
            param2.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
            this.a(false);
            param2.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
            this.a(false);
            param2.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
            this.a(5605);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void d(int param0) {
        tb.field_e = null;
        if (param0 != -1) {
            field_i = (String) null;
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

            stackIn_6_1 = new StringBuilder().append("dh.removeConsumer(");

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_m = param0;
            param0.setDimensions(this.field_a, this.field_g);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_o);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        if (param2 == 32) {
          var3 = kd.field_Z[param0][param1];
          if (var3 > -1) {
            var4 = ns.a(false, td.field_d[var3].length, li.field_n);
            if (null != td.field_d[var3][var4]) {
              if (0 == td.field_d[var3][var4].field_o.length) {
                return;
              } else {
                ub.a((byte) 52, td.field_d[var3][var4]);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_l = (int[]) null;
          var3 = kd.field_Z[param0][param1];
          if (var3 > -1) {
            var4 = ns.a(false, td.field_d[var3].length, li.field_n);
            if (null != td.field_d[var3][var4]) {
              if (0 == td.field_d[var3][var4].field_o.length) {
                return;
              } else {
                ub.a((byte) 52, td.field_d[var3][var4]);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_n = null;
        field_k = null;
        field_j = (byte[][]) null;
        field_l = null;
        if (param0 >= -98) {
            field_i = (String) null;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_m;
    }

    final static fo a(String param0, byte param1) {
        RuntimeException var2 = null;
        fo stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!se.field_g.a((byte) 124)) {
                break L1;
              } else {
                if (param0.equals(se.field_g.b(true))) {
                  break L1;
                } else {
                  se.field_g = cr.a(param0, param1 ^ 4210691);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 67) {
                break L2;
              } else {
                field_i = (String) null;
                break L2;
              }
            }
            stackIn_6_0 = se.field_g;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("dh.F(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        try {
            this.a(false);
            param1.drawImage(this.field_h, param3, param2, (java.awt.image.ImageObserver) (this));
            if (param0 != 255) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                this.removeConsumer((java.awt.image.ImageConsumer) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
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

            stackIn_4_1 = new StringBuilder().append("dh.imageUpdate(");

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
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final synchronized void a(boolean param0) {
        if (this.field_m == null) {
          return;
        } else {
          this.field_m.setPixels(0, 0, this.field_a, this.field_g, this.field_o, this.field_b, 0, this.field_a);
          if (param0) {
            return;
          } else {
            this.field_m.imageComplete(2);
            return;
          }
        }
    }

    dh() {
    }

    static {
        field_j = new byte[50][];
        field_i = "Players: ";
    }
}
