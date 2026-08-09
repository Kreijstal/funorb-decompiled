/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jf extends kh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_l;
    static boolean field_n;
    static int[] field_i;
    private java.awt.image.ImageConsumer field_j;
    static String field_k;
    private java.awt.image.ColorModel field_m;

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_j = param0;
            param0.setDimensions(this.field_b, this.field_d);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jf.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            if (!param1) {
              break L0;
            } else {
              var5 = (java.awt.Canvas) null;
              jf.a((java.awt.Canvas) null, false, false);
              break L0;
            }
          }
          if ((g.field_A ^ -1) <= -11) {
            if (lc.a((byte) -82)) {
              if (-1 != (cd.field_e ^ -1)) {
                nl.a(param0, -125);
                return;
              } else {
                ej.a(false, (byte) 55, param2);
                ll.a(0, (byte) 115, param0, 0);
                return;
              }
            } else {
              vj.d();
              mg.a(320, 207, 240);
              ll.a(0, (byte) 115, param0, 0);
              return;
            }
          } else {
            L1: {
              var3_int = 0;
              if (!ii.field_a) {
                break L1;
              } else {
                var3_int = 1;
                ii.field_a = false;
                break L1;
              }
            }
            uk.a(ej.r(-6545), var3_int != 0, (byte) -96, aj.field_p, mj.a(-1));
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("jf.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jf.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != -14143) {
            field_n = true;
            field_l = null;
            return;
        }
        field_l = null;
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

            stackIn_4_1 = new StringBuilder().append("jf.imageUpdate(");

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
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        try {
            if (param3 <= 110) {
                this.field_j = (java.awt.image.ImageConsumer) null;
            }
            this.c(14);
            param0.drawImage(this.field_a, param1, param2, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jf.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
            if (param0 == this.field_j) {
              this.field_j = null;
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

            stackIn_6_1 = new StringBuilder().append("jf.removeConsumer(");

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
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(java.awt.Component param0, int param1, byte param2, int param3) {
        this.field_d = param1;
        this.field_b = param3;
        if (param2 != 68) {
            return;
        }
        try {
            this.field_h = new int[param1 * param3 - -1];
            this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_a = param0.createImage((java.awt.image.ImageProducer) (this));
            this.c(14);
            param0.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.c(14);
            param0.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.c(param2 ^ 74);
            param0.prepareImage(this.field_a, (java.awt.image.ImageObserver) (this));
            this.a(200);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static aa a(int param0, String param1) {
        String var2 = null;
        aa var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        aa stackIn_13_0 = null;
        aa stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Main.field_T;
        try {
          L0: {
            if (null != rf.field_d) {
              if (param1 != null) {
                if (0 != param1.length()) {
                  var6 = (CharSequence) ((Object) param1);
                  var2 = ff.a((byte) 116, var6);
                  if (var2 != null) {
                    var3 = (aa) ((Object) rf.field_d.a(-78, (long)var2.hashCode()));
                    if (param0 == 0) {
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_gb);
                          var4 = ff.a((byte) 116, var7);
                          if (var4.equals(var2)) {
                            stackIn_19_0 = (aa) (var3);
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            var3 = (aa) ((Object) rf.field_d.a(26847));
                            continue L1;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = (aa) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_7_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("jf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (aa) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (aa) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_j == param0;
    }

    jf() {
    }

    private final synchronized void c(int param0) {
        if (param0 != 14) {
            field_k = (String) null;
            if (!(null != this.field_j)) {
                return;
            }
            this.field_j.setPixels(0, 0, this.field_b, this.field_d, this.field_m, this.field_h, 0, this.field_b);
            this.field_j.imageComplete(2);
            return;
        }
        if (!(null != this.field_j)) {
            return;
        }
        this.field_j.setPixels(0, 0, this.field_b, this.field_d, this.field_m, this.field_h, 0, this.field_b);
        this.field_j.imageComplete(2);
    }

    static {
        field_n = false;
        field_k = "Connection timed out. Please try using a different server.";
    }
}
