/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh extends og implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_l;
    static String field_m;
    private java.awt.image.ImageConsumer field_f;
    static String field_k;
    static String[] field_j;
    static int[] field_i;
    static String field_g;
    private java.awt.image.ColorModel field_h;

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        try {
          if (param1 != 10) {
            this.b((byte) 4);
          }
          this.b((byte) -104);
          param3.drawImage(this.field_d, param2, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        this.field_e = param2;
        this.field_a = param1;
        this.field_b = new int[param1 * param2 + 1];
        this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.field_d = param3.createImage((java.awt.image.ImageProducer) (this));
        this.b((byte) 119);
        param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        this.b((byte) -127);
        param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        this.b((byte) 116);
        param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        if (param0 != 30) {
          return;
        }
        try {
          this.b(32);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_f = param0;
          param0.setDimensions(this.field_a, this.field_e);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_h);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static sj a(byte param0, int param1) {
        if (param0 <= -124) {
          return uj.a(param1, (byte) -58, 1, false, false, true);
        }
        iw var3 = (iw) null;
        dh.a(81, 114, (iw) null, 122, 17);
        return uj.a(param1, (byte) -58, 1, false, false, true);
    }

    private final synchronized void b(byte param0) {
        int var2 = -79 % ((62 - param0) / 32);
        if (null != this.field_f) {
          this.field_f.setPixels(0, 0, this.field_a, this.field_e, this.field_h, this.field_b, 0, this.field_a);
          this.field_f.imageComplete(2);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_f == param0;
    }

    final static int a(up param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_g = (String) null;
          }
          var2_int = gp.a(param0, -576054046) / 10;
          if (gp.a(param0, -576054046) > 0 &&
            var2_int == 0) {
            var2_int = 1;
          }
          stackIn_6_0 = var2_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("dh.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
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
          stackIn_4_1 = new StringBuilder().append("dh.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        field_g = null;
        field_k = null;
        field_j = null;
        if (param0 != -29) {
          dh.b(true);
        }
    }

    final static void a(int param0, int param1, iw param2, int param3, int param4) {
        try {
          param2.a(param3 ^ -3315, 12);
          param2.g(param3 ^ 1207447422, 17);
          param2.g(-1207444472, param1);
          if (param3 != -3210) {
            iw var6 = (iw) null;
            dh.a(106, -79, (iw) null, 72, 113);
          }
          param2.g(param3 - 1207441262, param4);
          param2.a(param3 ^ -3298, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dh.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    dh() {
    }

    final static void c(byte param0) {
        if (param0 != -77) {
          iw var2 = (iw) null;
          dh.a(105, -41, (iw) null, 7, -41);
          tf.field_f = false;
          return;
        }
        tf.field_f = false;
    }

    final static void b(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var1 = 0;
        int var2 = 0;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var1Lifetime4;
        int var1Lifetime5;
        int var1Lifetime6;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime6;
        int var1Lifetime2Lifetime1;
        int var2Lifetime2Lifetime1;
        if (!param0) {
          up var3 = (up) null;
          dh.a((up) null, false);
          if (!iu.field_h) {
            ht.a(true, (byte) 89);
            return;
          }
          if (null == um.field_e) {
            ia.field_c = false;
            var1 = tq.h(-2521) - nv.field_E[ew.field_a];
            var2 = aq.a(true) - qt.field_r[ew.field_a];
            if (var2 * var2 + var1 * var1 < 10000) {
              fieldTemp$0 = ew.field_a + 1;
              ew.field_a = ew.field_a + 1;
              ew.field_a = fieldTemp$0 % nv.field_E.length;
            }
            mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
            ht.a(false, (byte) 89);
            return;
          }
          if (ra.field_G == null) {
            if (cq.field_h.field_c != 0) {
              ht.a(true, (byte) 89);
            } else {
              ia.field_c = false;
              var1Lifetime4 = tq.h(-2521) - nv.field_E[ew.field_a];
              var2Lifetime4 = aq.a(true) - qt.field_r[ew.field_a];
              if (var2Lifetime4 * var2Lifetime4 + var1Lifetime4 * var1Lifetime4 < 10000) {
                fieldTemp$1 = ew.field_a + 1;
                ew.field_a = ew.field_a + 1;
                ew.field_a = fieldTemp$1 % nv.field_E.length;
              }
              mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
              ht.a(false, (byte) 89);
            }
            return;
          }
          if (ra.field_G.field_c == 0) {
            ia.field_c = false;
            var1Lifetime5 = tq.h(-2521) - nv.field_E[ew.field_a];
            var2Lifetime5 = aq.a(true) - qt.field_r[ew.field_a];
            if (var2Lifetime5 * var2Lifetime5 + var1Lifetime5 * var1Lifetime5 < 10000) {
              fieldTemp$2 = ew.field_a + 1;
              ew.field_a = ew.field_a + 1;
              ew.field_a = fieldTemp$2 % nv.field_E.length;
            }
            mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
            ht.a(false, (byte) 89);
            return;
          }
          if (cq.field_h.field_c != 0) {
            ht.a(true, (byte) 89);
            return;
          }
          ia.field_c = false;
          var1Lifetime6 = tq.h(-2521) - nv.field_E[ew.field_a];
          var2Lifetime6 = aq.a(true) - qt.field_r[ew.field_a];
          if (var2Lifetime6 * var2Lifetime6 + var1Lifetime6 * var1Lifetime6 < 10000) {
            fieldTemp$3 = ew.field_a + 1;
            ew.field_a = ew.field_a + 1;
            ew.field_a = fieldTemp$3 % nv.field_E.length;
          }
          mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
          ht.a(false, (byte) 89);
          return;
        }
        if (!iu.field_h) {
          ht.a(true, (byte) 89);
          return;
        }
        if (null == um.field_e) {
          ia.field_c = false;
          var1Lifetime1 = tq.h(-2521) - nv.field_E[ew.field_a];
          var2Lifetime1 = aq.a(true) - qt.field_r[ew.field_a];
          if (var2Lifetime1 * var2Lifetime1 + var1Lifetime1 * var1Lifetime1 < 10000) {
            fieldTemp$4 = ew.field_a + 1;
            ew.field_a = ew.field_a + 1;
            ew.field_a = fieldTemp$4 % nv.field_E.length;
          }
          mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
          ht.a(false, (byte) 89);
          return;
        }
        if (ra.field_G != null) {
          if (ra.field_G.field_c != 0) {
            if (cq.field_h.field_c != 0) {
              ht.a(true, (byte) 89);
            } else {
              ia.field_c = false;
              var1Lifetime2 = tq.h(-2521) - nv.field_E[ew.field_a];
              var2Lifetime2 = aq.a(true) - qt.field_r[ew.field_a];
              if (var2Lifetime2 * var2Lifetime2 + var1Lifetime2 * var1Lifetime2 < 10000) {
                fieldTemp$5 = ew.field_a + 1;
                ew.field_a = ew.field_a + 1;
                ew.field_a = fieldTemp$5 % nv.field_E.length;
              }
              mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
              ht.a(false, (byte) 89);
            }
            return;
          }
          ia.field_c = false;
          var1Lifetime2Lifetime1 = tq.h(-2521) - nv.field_E[ew.field_a];
          var2Lifetime2Lifetime1 = aq.a(true) - qt.field_r[ew.field_a];
          if (var2Lifetime2Lifetime1 * var2Lifetime2Lifetime1 + var1Lifetime2Lifetime1 * var1Lifetime2Lifetime1 < 10000) {
            fieldTemp$6 = ew.field_a + 1;
            ew.field_a = ew.field_a + 1;
            ew.field_a = fieldTemp$6 % nv.field_E.length;
          }
          mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
          ht.a(false, (byte) 89);
          return;
        }
        if (cq.field_h.field_c == 0) {
          ia.field_c = false;
          var1Lifetime3 = tq.h(-2521) - nv.field_E[ew.field_a];
          var2Lifetime3 = aq.a(true) - qt.field_r[ew.field_a];
          if (var2Lifetime3 * var2Lifetime3 + var1Lifetime3 * var1Lifetime3 < 10000) {
            fieldTemp$7 = ew.field_a + 1;
            ew.field_a = ew.field_a + 1;
            ew.field_a = fieldTemp$7 % nv.field_E.length;
          }
          mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
          ht.a(false, (byte) 89);
          return;
        }
        ht.a(true, (byte) 89);
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != this.field_f) {
            return;
          }
          this.field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dh.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_j = new String[]{"primary colour", "secondary colour"};
        field_i = new int[12];
        field_g = "Logging in...";
        field_l = "Orb points: ";
        field_k = "Solicitation";
        field_m = "Private";
    }
}
