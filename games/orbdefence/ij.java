/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ij extends fh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_i;
    static byte[] field_h;
    static int field_g;
    private java.awt.image.ColorModel field_j;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        mj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != -34) {
            ij.a((byte) -53, 0);
          }
          var4 = (mj) (nd.field_b.b((byte) -77));
          while (var4 != null) {
            nk.a(param1, var4, 14);
            var4 = (mj) (nd.field_b.d(853));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2), "ij.J(" + param0 + ',' + param1 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_i = param0;
          param0.setDimensions(this.field_e, this.field_f);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_j);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ij.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          this.field_f = param1;
          this.field_d = new int[param1 * param2 + 1];
          this.field_e = param2;
          this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_a = param3.createImage((java.awt.image.ImageProducer) (this));
          this.c(-123);
          param3.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
          this.c(-123);
          param3.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
          this.c(-126);
          param3.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
          int var5_int = -113 / ((0 - param0) / 52);
          this.a(-40);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ij.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        vh.field_q[4] = new int[]{5};
        nc.field_cb[4] = new ja(4);
        kg.a(30, 468, 32, (byte) -128, new int[]{8, 9, 10, 5}, 2, 400);
        nc.field_cb[2] = new ja(2);
        if (param0 >= tc.field_b) {
          vh.field_q[8] = new int[]{19, 20, 21, 22, 23, 24, 5};
          nc.field_cb[8] = new ja(8);
          if (tc.field_b <= 0) {
            return;
          }
          if (bk.field_e == 7) {
            bk.field_e = 0;
            return;
          }
          return;
        }
        if (!ug.a((byte) 94, wc.field_c)) {
          vh.field_q[8] = new int[]{19, 20, 21, 22, 23, 24, 5};
          nc.field_cb[8] = new ja(8);
          if (tc.field_b <= 0) {
            return;
          }
          if (bk.field_e == 7) {
            bk.field_e = 0;
            return;
          }
          return;
        }
        kg.a(50, 288, 32, (byte) -96, new int[]{1, 12, 13, 4, 3, 25, 7}, 1, 200);
        nc.field_cb[1] = new ja(1);
        vh.field_q[8] = new int[]{19, 20, 21, 22, 23, 24, 5};
        nc.field_cb[8] = new ja(8);
        if (tc.field_b <= 0) {
          return;
        }
        if (bk.field_e == 7) {
          bk.field_e = 0;
          return;
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ij.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, hj param2) {
        try {
          if (param0 > -26) {
            field_h = (byte[]) null;
          }
          hc.field_l = param2;
          pj.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ij.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public static void b(byte param0) {
        if (param0 <= 49) {
          ij.b(87);
          field_h = null;
          return;
        }
        field_h = null;
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
          stackIn_4_1 = new StringBuilder().append("ij.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final synchronized void c(int param0) {
        if (param0 > -119) {
          field_h = (byte[]) null;
          if (this.field_i == null) {
            return;
          }
          this.field_i.setPixels(0, 0, this.field_e, this.field_f, this.field_j, this.field_d, 0, this.field_e);
          this.field_i.imageComplete(2);
          return;
        }
        if (this.field_i == null) {
          return;
        }
        this.field_i.setPixels(0, 0, this.field_e, this.field_f, this.field_j, this.field_d, 0, this.field_e);
        this.field_i.imageComplete(2);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_i == param0) {
            this.field_i = null;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ij.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_i;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, boolean param3) {
        try {
          this.c(-122);
          param2.drawImage(this.field_a, param0, param1, (java.awt.image.ImageObserver) (this));
          if (!param3) {
            field_g = -68;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ij.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ij() {
    }

    static {
        field_g = 256;
    }
}
