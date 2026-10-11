/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fh extends ov implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_j;
    static int field_k;
    static mf[] field_n;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_m;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_l == param0) {
            this.field_l = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fh.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (param0 > -83) {
          field_n = (mf[]) null;
        }
        return lm.a(59, ra.c(2));
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_l = param0;
          param0.setDimensions(this.field_h, this.field_b);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_m);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
    }

    private final synchronized void b(byte param0) {
        if (this.field_l == null) {
          return;
        }
        this.field_l.setPixels(0, 0, this.field_h, this.field_b, this.field_m, this.field_c, 0, this.field_h);
        this.field_l.imageComplete(2);
        if (param0 < 31) {
          java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
          this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
    }

    final static dk a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        dk stackIn_4_0 = null;
        dk stackIn_8_0 = null;
        dk stackIn_18_0 = null;
        dk stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = qo.field_a;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = cn.field_ib;
            return stackIn_8_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_18_0 = gs.field_a;
                return stackIn_18_0;
              }
            } else {
              if (ji.field_a.indexOf(var4) == -1) {
                stackIn_22_0 = gs.field_a;
                return stackIn_22_0;
              }
            }
          }
          if (param1 == -1) {
            return null;
          }
          fh.c(40);
          stackIn_27_0 = null;
          return (dk) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("fh.C(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final static gk a(pl param0, int param1) {
        int var7 = 0;
        gk stackIn_3_0 = null;
        gk stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gk var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.b(8, (byte) -92);
          if (param1 != -16736) {
            stackIn_3_0 = (gk) null;
            return stackIn_3_0;
          }
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = kh.a(param0, false) ? 1 : 0;
          var4 = kh.a(param0, false) ? 1 : 0;
          var5 = new gk();
          var5.field_D = (short)param0.b(16, (byte) -119);
          var5.field_Q = sm.a(var5.field_Q, param0, -119, 16);
          var5.field_B = sm.a(var5.field_B, param0, -120, 16);
          var5.field_r = sm.a(var5.field_r, param0, -127, 16);
          var5.field_n = (short)param0.b(16, (byte) -117);
          var5.field_A = sm.a(var5.field_A, param0, -128, 16);
          var5.field_b = sm.a(var5.field_b, param0, -116, 16);
          var5.field_l = sm.a(var5.field_l, param0, -126, 16);
          if (var3 != 0) {
            var5.field_c = (short)param0.b(16, (byte) -94);
            var5.field_x = sm.a(var5.field_x, param0, param1 + 16608, 16);
            var5.field_g = sm.a(var5.field_g, param0, -124, 16);
            var5.field_L = sm.a(var5.field_L, param0, -113, 16);
            var5.field_e = sm.a(var5.field_e, param0, -127, 16);
            var5.field_k = sm.a(var5.field_k, param0, -118, 16);
            var5.field_h = sm.a(var5.field_h, param0, param1 + 16615, 16);
          }
          if (var4 != 0) {
            param0.b(16, (byte) -127);
            var5.field_z = sm.a(var5.field_z, param0, -121, 16);
            var5.field_C = sm.a(var5.field_C, param0, param1 + 16619, 16);
            var5.field_G = sm.a(var5.field_G, param0, -114, 16);
            var5.field_y = sm.a(var5.field_y, param0, param1 + 16619, 16);
            var5.field_R = sm.a(var5.field_R, param0, param1 + 16623, 16);
          }
          if (kh.a(param0, false)) {
            var5.field_K = sm.a(var5.field_K, param0, -112, 16);
          }
          if (kh.a(param0, false)) {
            var5.field_a = ua.a(16, 0, var5.field_a, param0);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_a.length; var7++) {
              if (var6 < (255 & var5.field_a[var7])) {
                var6 = 255 & var5.field_a[var7];
              }
            }
            if (var6 == 0) {
              var5.field_a = null;
            } else {
              var5.field_E = (byte)(var6 + 1);
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("fh.G(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
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
          stackIn_4_1 = new StringBuilder().append("fh.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param0 >= -47) {
          return;
        }
        try {
          this.b((byte) 55);
          param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          this.field_c = new int[param1 * param2 + 1];
          this.field_b = param1;
          this.field_h = param2;
          if (param3 > -97) {
            this.field_m = (java.awt.image.ColorModel) null;
          }
          this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_f = param0.createImage((java.awt.image.ImageProducer) (this));
          this.b((byte) 117);
          param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.b((byte) 75);
          param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.b((byte) 45);
          param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.a(-1);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "fh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 > -27) {
          return;
        }
        field_j = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    fh() {
    }

    static {
        field_k = 0;
        field_j = "Connection restored.";
        field_n = new mf[3];
    }
}
