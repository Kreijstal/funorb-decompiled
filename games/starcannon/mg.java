/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg extends tk implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static int field_h;
    static ge field_i;
    private java.awt.image.ColorModel field_j;
    static String field_k;
    static String field_m;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
          this.a(true);
          if (param3 != 19291) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
          }
          param2.drawImage(this.field_c, param0, param1, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, fb param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        fb var6 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = StarCannon.field_A;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            kk.field_b[var2_int] = 0;
          }
          if (param0 < 34) {
            var6 = (fb) null;
            mg.a((byte) 71, (fb) null);
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < wi.field_b; var2_intLifetime1++) {
            if (param1.field_q == lf.field_bb[var2_intLifetime1].field_q) {
              dupTemp$3 = lf.field_bb[var2_intLifetime1].b(-128);
              kk.field_b[dupTemp$3] = kk.field_b[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.b(-126);
          kk.field_b[dupTemp$0] = kk.field_b[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < wi.field_b; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param1.field_q == lf.field_bb[var3].field_q) {
              var4 = lf.field_bb[var3].b(-126);
              if (vh.field_q < kk.field_b[var4]) {
                kk.field_b[var4] = kk.field_b[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              lf.field_bb[incrementValue$2] = lf.field_bb[var3];
            }
          }
          wi.field_b = var2_intLifetime2;
          fieldTemp$1 = wi.field_b;
          wi.field_b = wi.field_b + 1;
          lf.field_bb[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("mg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (param0 == this.field_l) {
            this.field_l = null;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mg.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void a(boolean param0) {
        if (null == this.field_l) {
          return;
        }
        this.field_l.setPixels(0, 0, this.field_d, this.field_b, this.field_j, this.field_g, 0, this.field_d);
        if (!param0) {
          return;
        }
        this.field_l.imageComplete(2);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
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
          stackIn_4_1 = new StringBuilder().append("mg.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, oj param1, int param2) {
        ia var3 = null;
        try {
          if (!param0) {
            field_k = (String) null;
          }
          var3 = d.field_b;
          var3.d((byte) 25, param2);
          var3.a(param1.field_i, -50);
          var3.a(param1.field_h, -123);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= -64) {
            stackIn_4_0 = rj.a(0, param0, (byte) 93, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -2;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mg.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    mg() {
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          ti.field_b.a((byte) -117, true, ob.field_h, cl.field_j);
          ti.field_b.h(-10597);
          while (ad.e((byte) 107)) {
            ti.field_b.a(lb.field_B, -119, StarCannon.field_E);
          }
          if (md.field_a != -1) {
            var1_int = md.field_a;
            fd.a(-1, param0 + 78);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (s.field_c) {
            stackIn_9_0 = 3;
            return stackIn_9_0;
          }
          if (param0 != -78) {
            field_i = (ge) null;
          }
          if (ie.field_x == jl.field_a) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!qa.field_a.b(false)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (uh.field_k != jl.field_a) {
            return -1;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "mg.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        this.field_b = param3;
        this.field_g = new int[param1 * param3 + 1];
        this.field_d = param1;
        this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.field_c = param2.createImage((java.awt.image.ImageProducer) (this));
        this.a(true);
        param2.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        this.a(true);
        param2.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        this.a(true);
        param2.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        if (param0 != -9623) {
          return;
        }
        try {
          this.b(-122);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_m = null;
        if (param0 != 0) {
          field_k = (String) null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_l = param0;
          param0.setDimensions(this.field_d, this.field_b);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_j);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "mg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "LANCE LASER - Switches the Nova Ray to use the tight beam of the lance laser.";
        field_i = new ge();
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
