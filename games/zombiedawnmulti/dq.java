/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dq extends l implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_m;
    static String field_i;
    static cj field_k;
    static int[][] field_j;
    private java.awt.image.ImageConsumer field_n;
    static int field_l;

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_n == param0) {
            this.field_n = null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dq.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_n;
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        try {
          this.c((byte) -127);
          param1.drawImage(this.field_g, param3, param0, (java.awt.image.ImageObserver) (this));
          if (param2 != 2) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.isConsumer((java.awt.image.ImageConsumer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dq.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void c(byte param0) {
        if (this.field_n != null) {
          this.field_n.setPixels(0, 0, this.field_h, this.field_f, this.field_m, this.field_b, 0, this.field_h);
          int var2 = 56 / ((param0 + 54) / 43);
          this.field_n.imageComplete(2);
          return;
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
          this.field_b = new int[1 + param3 * param2];
          this.field_f = param2;
          this.field_h = param3;
          this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_g = param1.createImage((java.awt.image.ImageProducer) (this));
          this.c((byte) -110);
          param1.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.c((byte) 77);
          param1.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.c((byte) 50);
          param1.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
          this.b((byte) 126);
          if (param0 != -6) {
            field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_k = null;
        if (param0 == -2) {
          field_j = (int[][]) null;
          return;
        }
        field_j = (int[][]) null;
        field_j = (int[][]) null;
    }

    final static int b(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (param0 > 0) {
          var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            param0 = param0 >> 8;
            var2 += 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        if (param1 != 16) {
          dq.b(-122, 106);
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          param0 = param0 >> 16;
          var2Lifetime1 += 16;
        }
        if (param0 < -256) {
          param0 = param0 >> 8;
          var2Lifetime1 += 8;
        }
        if (param0 < -16) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 < -4) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (param0 < -2) {
          var2Lifetime1++;
          param0 = param0 >> 1;
        }
        return var2Lifetime1;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_n = param0;
          param0.setDimensions(this.field_h, this.field_f);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_m);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dq.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        if (param0 < -39) {
          if (param1 >= 0 &&
            param1 <= 11) {
            if (param2 >= 1 &&
              param2 <= ib.a(param1, 1, param3)) {
              return true;
            }
            return false;
          }
          return false;
        }
        field_j = (int[][]) null;
        if (param1 < 0) {
          return false;
        }
        if (param1 > 11) {
          return false;
        }
        if (param2 < 1) {
          return false;
        }
        if (param2 > ib.a(param1, 1, param3)) {
          return false;
        }
        return true;
    }

    final static void c(int param0) {
        if (param0 < -117) {
          wj.field_i.a((cf) (new dg()), (byte) -41);
          return;
        }
        field_j = (int[][]) null;
        wj.field_i.a((cf) (new dg()), (byte) -41);
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
          stackIn_4_1 = new StringBuilder().append("dq.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    dq() {
    }

    static {
        field_i = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
