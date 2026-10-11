/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa extends pd implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_o;
    static String field_i;
    static wh field_j;
    static boolean field_n;
    private java.awt.image.ImageConsumer field_k;
    static int field_m;
    static int[] field_l;

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void b(boolean param0) {
        if (null == this.field_k) {
          return;
        }
        if (!param0) {
          field_n = true;
        }
        this.field_k.setPixels(0, 0, this.field_a, this.field_d, this.field_o, this.field_h, 0, this.field_a);
        this.field_k.imageComplete(2);
    }

    final static void c(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fj var4_ref_fj = null;
        lc var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        jd var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != 1811357826) {
            return;
          }
          var9 = te.field_N;
          var2 = var9.j(255);
          var3 = var9.j(255);
          if (var2 == 0) {
            var4_ref_fj = (fj) (ti.field_b.a((byte) 51));
            if (var4_ref_fj == null) {
              je.a(false);
              return;
            }
            var5_int = te.field_O - var9.field_m;
            var11 = var4_ref_fj.field_h;
            var10 = var11;
            var6 = var10;
            if (var5_int > var11.length << 2) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.j(255) << fi.a(var7 << 8, 768));
            }
            var4_ref_fj.c(10);
            return;
          }
          if (var2 == 1) {
            var4 = var9.d(-116);
            var5 = (lc) (hc.field_a.a((byte) 51));
            while (var5 != null) {
              if (var5.field_n != var3 ||
                var4 != var5.field_o) {
                var5 = (lc) (hc.field_a.b(-66));
                continue;
              }
              break;
            }
            if (var5 == null) {
              je.a(false);
              return;
            }
            var5.c(10);
            return;
          }
          hi.a((Throwable) null, "LR1: " + oc.a(false), 1);
          je.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "oa.F(" + param0 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_k = param0;
          param0.setDimensions(this.field_a, this.field_d);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_o);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "oa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static fc a(int param0, int param1, da param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        fc stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        fc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1803587230) {
            stackIn_2_0 = (fc) null;
            return stackIn_2_0;
          }
          var4 = param2.a(param1, (byte) -104);
          var3 = var4;
          if (var4 != null) {
            stackIn_7_0 = new fc(var4);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (fc) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("oa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "oa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_k == param0) {
            this.field_k = null;
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "oa.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
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
          stackIn_4_1 = new StringBuilder().append("oa.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 768) {
          da var2 = (da) null;
          oa.a(-87, 28, (da) null);
        }
        field_i = null;
        field_j = null;
        field_l = null;
    }

    oa() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
          this.field_d = param2;
          this.field_a = param3;
          this.field_h = new int[param2 * param3 + 1];
          this.field_o = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_g = param0.createImage((java.awt.image.ImageProducer) (this));
          this.b(true);
          if (param1 != 9387) {
            field_n = false;
          }
          param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.b(true);
          param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.b(true);
          param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "oa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        if (param1 != 0) {
          return;
        }
        try {
          this.b(true);
          param3.drawImage(this.field_g, param0, param2, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "oa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_k;
    }

    static {
        field_i = "Type your age in years";
        field_j = new wh();
        field_n = false;
    }
}
