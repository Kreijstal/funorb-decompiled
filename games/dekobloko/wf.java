/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wf extends eh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_t;
    static um field_p;
    static um field_u;
    private java.awt.image.ImageConsumer field_r;
    static String field_m;
    static mm field_q;
    static int[] field_o;
    static String field_n;
    static ei[] field_l;
    static String field_k;
    static java.awt.Font field_s;

    final static void a(int param0, int param1, int param2, boolean param3) {
        wm.field_l = param1;
        gn.field_a = param0;
        wa.field_c = param2;
        if (!param3) {
          wf.f(-31);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_r = param0;
          param0.setDimensions(this.field_g, this.field_i);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_t);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wf.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void e(int param0) {
        if (param0 >= -113) {
          this.e(-60);
        }
        if (null == this.field_r) {
          return;
        }
        this.field_r.setPixels(0, 0, this.field_g, this.field_i, this.field_t, this.field_f, 0, this.field_g);
        this.field_r.imageComplete(2);
    }

    final static w c(int param0) {
        int var1 = 12 % ((-44 - param0) / 51);
        return k.field_b.field_Sb;
    }

    final void a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
          this.field_g = param0;
          this.field_f = new int[1 + param0 * param2];
          if (param1 != 83) {
            field_n = (String) null;
          }
          this.field_i = param2;
          this.field_t = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_c = param3.createImage((java.awt.image.ImageProducer) (this));
          this.e(-117);
          param3.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.e(-123);
          param3.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.e(param1 ^ -46);
          param3.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
          this.a((byte) -98);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_r == param0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wf.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_o = null;
        field_p = null;
        int var1 = 4 / ((param0 - 24) / 42);
        field_k = null;
        field_m = null;
        field_u = null;
        field_l = null;
        field_n = null;
        field_q = null;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_r == param0) {
            this.field_r = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wf.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void d(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (f.field_r != null) {
          var1 = f.field_r;
          synchronized (var1) {
            f.field_r = null;
          }
        }
        if (param0 < 88) {
          field_s = (java.awt.Font) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12, int param13, int param14, int param15) {
        int var17;
        var17 = client.field_A ? 1 : 0;
        if (param1 > param11) {
          if (param8 > param1) {
            oj.a(param3, param7, param13, param1, param4, param14, param15, (byte) -105, param9, param10, param2, param11, hk.field_l, param6, param8, param5, param0);
          } else {
            if (param8 > param11) {
              oj.a(param9, param6, param13, param8, param14, param4, param10, (byte) -101, param3, param15, param2, param11, hk.field_l, param7, param1, param5, param0);
            } else {
              oj.a(param9, param0, param10, param11, param2, param4, param13, (byte) -120, param5, param15, param14, param8, hk.field_l, param7, param1, param3, param6);
            }
          }
        } else {
          if (param11 < param8) {
            oj.a(param3, param0, param15, param11, param2, param14, param13, (byte) -52, param5, param10, param4, param1, hk.field_l, param6, param8, param9, param7);
          } else {
            if (param8 > param1) {
              oj.a(param5, param6, param15, param8, param14, param2, param10, (byte) -95, param3, param13, param4, param1, hk.field_l, param0, param11, param9, param7);
            } else {
              oj.a(param5, param7, param10, param1, param4, param2, param15, (byte) -39, param9, param13, param14, param8, hk.field_l, param0, param11, param3, param6);
            }
          }
        }
        if (!param12) {
          field_p = (um) null;
        }
    }

    final static boolean a(boolean param0) {
        if (la.field_d) {
          return true;
        }
        if (!ii.field_t.a("benefits", (byte) -75)) {
          return false;
        }
        if (param0) {
          return true;
        }
        ck var1 = id.a(ii.field_t, "borders", "benefits", 8192);
        ck var2 = id.a(ii.field_t, "price", "benefits", 8192);
        ck var3 = id.a(ii.field_t, "logo", "benefits", 8192);
        ck[] var4 = bj.a(112, ii.field_t, "benefits", "screenshots");
        ik.a(200, var1, ph.field_Gb);
        id.a(103, 92, 2, -2400, 35, 13, 8192, var2, 15);
        ib.a((byte) -108, var4);
        wj.a(var3, 369179521);
        la.field_d = true;
        return true;
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = client.field_A ? 1 : 0;
        try {
          var1 = f.field_r;
          synchronized (var1) {
            if (param0 != 19012) {
              field_p = (um) null;
            }
            sf.field_B = ea.field_n;
            om.field_d = om.field_d + 1;
            if (wi.field_b < 0) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                bj.field_d[var5] = false;
                var5++;
              }
              wi.field_b = rc.field_a;
            } else {
              while (wi.field_b != rc.field_a) {
                var2 = la.field_h[rc.field_a];
                rc.field_a = 1 + rc.field_a & 127;
                if (0 > var2) {
                  bj.field_d[~var2] = false;
                  continue;
                }
                bj.field_d[var2] = true;
              }
            }
            ea.field_n = jh.field_e;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "wf.A(" + param0 + ')');
        }
    }

    wf() {
    }

    final void a(byte param0, java.awt.Graphics param1, int param2, int param3) {
        try {
          this.e(-127);
          param1.drawImage(this.field_c, param2, param3, (java.awt.image.ImageObserver) (this));
          if (param0 < 38) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wf.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
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
          stackIn_4_1 = new StringBuilder().append("wf.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_p = new um();
        field_m = "Loading...";
        field_u = new um();
        field_l = new ei[8];
        field_k = "Account created successfully!";
    }
}
