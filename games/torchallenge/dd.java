/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class dd extends oe implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static int[] field_p;
    private java.awt.image.ColorModel field_s;
    static boolean[][][] field_l;
    static String field_o;
    static ka[] field_m;
    static int field_u;
    static String field_r;
    static boolean[] field_n;
    private java.awt.image.ImageConsumer field_k;
    static int[][] field_q;
    static int[] field_t;

    final static ad a(int param0, uj param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ad var7 = null;
        Object stackIn_2_0 = null;
        ad stackIn_5_0 = null;
        ad stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = v.a(param5, param4, param0, 80, param1, param3);
          if (null == var6) {
            stackIn_2_0 = null;
            return (ad) (stackIn_2_0);
          }
          var7 = new ad();
          var7.field_d = var6;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param3, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          if (param2 >= 80) {
            stackIn_7_0 = var7;
            return stackIn_7_0;
          }
          stackIn_5_0 = (ad) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_11_0 = var6_ref;
          stackIn_11_1 = new StringBuilder().append("dd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = param0;
          param0.setDimensions(this.field_i, this.field_h);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_s);
          param0.setHints(14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dd.addConsumer(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        try {
          kc.field_s[bb.field_c] = param1;
          hi.field_G[bb.field_c] = bb.field_c;
          bg.field_Q[bb.field_c] = param3;
          if (param3 > ia.field_q) {
            v.field_Z = param3;
          }
          if (param3 < ol.field_d) {
            pi.field_e = param3;
          }
          rk.field_p[bb.field_c] = param0;
          if (param2 != 27715) {
            return;
          }
          ea.field_a[bb.field_c] = param5;
          cb.field_e[bb.field_c] = param4;
          var6_int = param4 + (param0 + param5);
          if (var6_int == 0) {
            stackIn_13_0 = 0;
          } else {
            stackIn_13_0 = param0 * 1000 / var6_int;
          }
          var7 = stackIn_13_0;
          bj.field_b[bb.field_c] = var7;
          if (var7 < pi.field_e) {
            pi.field_e = var7;
          }
          bb.field_c = bb.field_c + 1;
          if (v.field_Z < var7) {
            v.field_Z = var7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var6), "dd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != -19275) {
            this.e(45);
          }
          this.e(98);
          param3.drawImage(this.field_e, param1, param2, (java.awt.image.ImageObserver) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("dd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param2;
          this.field_c = new int[param0 * param2 + 1];
          this.field_i = param0;
          this.field_s = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_e = param1.createImage((java.awt.image.ImageProducer) (this));
          this.e(91);
          param1.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.e(98);
          param1.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          this.e(94);
          param1.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
          if (param3 != -23435) {
            return;
          }
          this.a(127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("dd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_k == param0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("dd.imageUpdate(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void c(int param0) {
        try {
          int stackIn_8_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          RuntimeException var1 = null;
          byte[] var2 = null;
          int var3 = 0;
          int var4 = 0;
          Exception var4_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var5Lifetime1;
          var6 = TorChallenge.field_F ? 1 : 0;
          try {
            if (!d.p(-87) &&
              ee.field_o > 0) {
              stackIn_8_0 = 0;
            } else {
              stackIn_8_0 = 1;
            }
            var1_int = stackIn_8_0;
            eb.field_n = false;
            n.field_kb = (int[][][]) null;
            vk.field_i = null;
            hk.field_b = false;
            var3 = 124 % ((param0 - 72) / 47);
            bj.a((byte) 71);
            if (!gh.field_x) {
              if ((!gh.field_x) &&
                ((1 + ea.field_e) % 2 == 0)) {
                gh.field_x = true;
                if (var6 != 0) {
                  gh.field_x = false;
                  ea.field_e = (-6 + ea.field_e + 1 << 1) - 1;
                  if (var1_int != 0 &&
                    ea.field_e >= 1) {
                    bb.a(var1_int != 0, (byte) -17);
                  }
                }
              }
            } else {
              gh.field_x = false;
              ea.field_e = (-6 + ea.field_e + 1 << 1) - 1;
              if (var1_int != 0 &&
                ea.field_e >= 1) {
                bb.a(var1_int != 0, (byte) -17);
              }
            }
            boolean decompiledSharedTail0 = !(!gh.field_x);
            if (!decompiledSharedTail0) {
              ea.field_e = ea.field_e + 1;
              var4 = ea.field_e;
              var5 = 32 + ea.field_e * 4;
              ba.field_i = new ra(var5, var4);
              decompiledSharedTail0 = (var6 != 0);
            }
            if (decompiledSharedTail0) {
              ea.field_e = 6 + (ea.field_e + 1 >> 1) - 1;
              var4 = -1 + (-6 + (ea.field_e + 1) << 1);
              var5 = 32;
              ba.field_i = new ra(var5, var4);
            }
            if (wi.field_a == null) {
              lb.d((byte) -77);
            }
            if (null == fj.field_m) {
              uf.c(-7668);
            }
            if (null == pa.field_z) {
              jf.m(96);
            }
            if (lj.field_j == null) {
              hl.a((byte) 50);
            }
            var2 = je.field_c[ea.field_e];
            if (null == je.field_c[ea.field_e]) {
              try {
                var4 = var2.length;
                i.a(var2, (byte) 108, var4, new File(cg.field_c[ea.field_e]));
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref_Exception = (Exception) (Object) decompiledCaughtException;
                System.out.println(var4_ref_Exception);
              }
              je.field_c[ea.field_e] = var2;
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != je.field_c[ea.field_e]) {
              if (gh.field_x) {
                mf.a(true, var2, 24233, true);
                decompiledFrameRemainder0 = (var6 != 0);
              }
              if (decompiledFrameRemainder0) {
                mf.a(false, var2, 24233, true);
                decompiledFrameRemainder0 = (var6 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (!gh.field_x) {
                var4 = ea.field_e;
                var5Lifetime1 = 32 + ea.field_e * 4;
                ba.field_i = new ra(var5Lifetime1, var4);
                if (var6 != 0) {
                  var4 = (1 + (ea.field_e - 6) << 1) - 1;
                  var5Lifetime1 = 32;
                  ba.field_i = new ra(var5Lifetime1, var4);
                }
              } else {
                var4 = (1 + (ea.field_e - 6) << 1) - 1;
                var5Lifetime1 = 32;
                ba.field_i = new ra(var5Lifetime1, var4);
              }
              if (null == wi.field_a) {
                lb.d((byte) -112);
              }
              if (null == fj.field_m) {
                uf.c(-7668);
              }
              if (pa.field_z == null) {
                jf.m(106);
              }
              if (lj.field_j == null) {
                hl.a((byte) 50);
              }
              ol.field_g = ba.field_i;
              ea.field_g = null;
            }
            df.field_O = true;
            if (gh.field_x) {
              ug.field_o = 1;
              if (var6 == 0) {
                return;
              }
            }
            ug.field_o = 0;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw oj.a((Throwable) ((Object) var1), "dd.D(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_q = (int[][]) null;
          field_o = null;
          field_r = null;
          field_n = null;
          field_l = (boolean[][][]) null;
          field_p = null;
          field_t = null;
          if (param0 != 15752) {
            dd.c(-123);
          }
          field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "dd.F(" + param0 + ')');
        }
    }

    private final synchronized void e(int param0) {
        if (param0 < 80) {
          return;
        }
        if (null == this.field_k) {
          return;
        }
        try {
          this.field_k.setPixels(0, 0, this.field_i, this.field_h, this.field_s, this.field_c, 0, this.field_i);
          this.field_k.imageComplete(2);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "dd.E(" + param0 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.addConsumer(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dd.startProduction(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == this.field_k) {
            this.field_k = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("dd.removeConsumer(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    dd() {
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2;
        int var3;
        long var4;
        long var6;
        int stackIn_10_0 = 0;
        field_p = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var4 = (long)((var0 << 1) - 1);
          var6 = (long)((var0 << 1) + 1);
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          if (var3 >= field_p.length) {
            var3 = field_p.length - 1;
          }
          stackIn_10_0 = (var2 < 0) ? 0 : var2;
          for (var1 = stackIn_10_0; var3 >= var1; var1++) {
            field_p[var1] = var0;
          }
        }
        field_l = new boolean[][][]{new boolean[][]{new boolean[]{false, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, true, true, true, true, false}, new boolean[]{false, true, true, true, true}, new boolean[]{true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, true, true, true}, new boolean[]{false}}, new boolean[][]{new boolean[]{true, true, true, true, true, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{true, true, false, true, true, true}, new boolean[]{false}, new boolean[]{false, false, false, true, true, true}}};
        field_r = "Members' Benefits";
        field_n = new boolean[]{true, true, true, true, true, true, true, true, true, false, false, false, false, false};
        field_o = "Menu";
        field_q = new int[][]{new int[]{18, 25}, new int[]{39, 46}};
    }
}
