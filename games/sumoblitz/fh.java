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
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (((fh) this).field_l == param0) {
                ((fh) this).field_l = null;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("fh.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final static boolean c(int param0) {
        if (param0 > -83) {
            field_n = null;
        }
        return lm.a(59, ra.c(2));
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((fh) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fh.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((fh) this).field_l = param0;
            param0.setDimensions(((fh) this).field_h, ((fh) this).field_b);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((fh) this).field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fh.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((fh) this).field_l;
    }

    private final synchronized void b(byte param0) {
        if (((fh) this).field_l == null) {
            return;
        }
        ((fh) this).field_l.setPixels(0, 0, ((fh) this).field_h, ((fh) this).field_b, ((fh) this).field_m, ((fh) this).field_c, 0, ((fh) this).field_h);
        ((fh) this).field_l.imageComplete(2);
        if (param0 < 31) {
            Object var3 = null;
            ((fh) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
    }

    final static dk a(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dk stackIn_4_0 = null;
        dk stackIn_8_0 = null;
        dk stackIn_16_0 = null;
        dk stackIn_20_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_3_0 = null;
        dk stackOut_7_0 = null;
        dk stackOut_19_0 = null;
        dk stackOut_15_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = qo.field_a;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 63) {
              stackOut_7_0 = cn.field_ib;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var3 >= var2_int) {
                  return null;
                } else {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if (ji.field_a.indexOf(var4) == -1) {
                        stackOut_19_0 = gs.field_a;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      } else {
                        break L1;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var2_int + -1 == var3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_15_0 = gs.field_a;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("fh.C(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + -1 + 41);
        }
    }

    final static gk a(pl param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        gk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gk stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b(8, (byte) -92);
            if (var2_int <= 0) {
              L1: {
                int discarded$23 = 0;
                var3 = kh.a(param0) ? 1 : 0;
                int discarded$24 = 0;
                var4 = kh.a(param0) ? 1 : 0;
                var5 = new gk();
                var5.field_D = (short)param0.b(16, (byte) -119);
                int discarded$25 = 16;
                var5.field_Q = sm.a(var5.field_Q, param0, -119);
                int discarded$26 = 16;
                var5.field_B = sm.a(var5.field_B, param0, -120);
                int discarded$27 = 16;
                var5.field_r = sm.a(var5.field_r, param0, -127);
                var5.field_n = (short)param0.b(16, (byte) -117);
                int discarded$28 = 16;
                var5.field_A = sm.a(var5.field_A, param0, -128);
                int discarded$29 = 16;
                var5.field_b = sm.a(var5.field_b, param0, -116);
                int discarded$30 = 16;
                var5.field_l = sm.a(var5.field_l, param0, -126);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_c = (short)param0.b(16, (byte) -94);
                  int discarded$31 = 16;
                  var5.field_x = sm.a(var5.field_x, param0, -128);
                  int discarded$32 = 16;
                  var5.field_g = sm.a(var5.field_g, param0, -124);
                  int discarded$33 = 16;
                  var5.field_L = sm.a(var5.field_L, param0, -113);
                  int discarded$34 = 16;
                  var5.field_e = sm.a(var5.field_e, param0, -127);
                  int discarded$35 = 16;
                  var5.field_k = sm.a(var5.field_k, param0, -118);
                  int discarded$36 = 16;
                  var5.field_h = sm.a(var5.field_h, param0, -121);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$37 = param0.b(16, (byte) -127);
                  int discarded$38 = 16;
                  var5.field_z = sm.a(var5.field_z, param0, -121);
                  int discarded$39 = 16;
                  var5.field_C = sm.a(var5.field_C, param0, -117);
                  int discarded$40 = 16;
                  var5.field_G = sm.a(var5.field_G, param0, -114);
                  int discarded$41 = 16;
                  var5.field_y = sm.a(var5.field_y, param0, -117);
                  int discarded$42 = 16;
                  var5.field_R = sm.a(var5.field_R, param0, -113);
                  break L2;
                }
              }
              L3: {
                int discarded$43 = 0;
                if (!kh.a(param0)) {
                  break L3;
                } else {
                  int discarded$44 = 16;
                  var5.field_K = sm.a(var5.field_K, param0, -112);
                  break L3;
                }
              }
              L4: {
                int discarded$45 = 0;
                if (!kh.a(param0)) {
                  break L4;
                } else {
                  var5.field_a = ua.a(16, 0, var5.field_a, param0);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_a.length) {
                      if (var6 == 0) {
                        var5.field_a = null;
                        break L4;
                      } else {
                        var5.field_E = (byte)(var6 + 1);
                        break L4;
                      }
                    } else {
                      L6: {
                        if (var6 < (255 & var5.field_a[var7])) {
                          var6 = 255 & var5.field_a[var7];
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_21_0 = (gk) var5;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("fh.G(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + -16736 + 41);
        }
        return stackIn_22_0;
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = 1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("fh.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param0 >= -47) {
            return;
        }
        try {
            this.b((byte) 55);
            boolean discarded$0 = param2.drawImage(((fh) this).field_f, param1, param3, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fh.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            ((fh) this).field_c = new int[param1 * param2 - -1];
            ((fh) this).field_b = param1;
            ((fh) this).field_h = param2;
            if (param3 > -97) {
                ((fh) this).field_m = null;
            }
            ((fh) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((fh) this).field_f = param0.createImage((java.awt.image.ImageProducer) this);
            this.b((byte) 117);
            boolean discarded$0 = param0.prepareImage(((fh) this).field_f, (java.awt.image.ImageObserver) this);
            this.b((byte) 75);
            boolean discarded$1 = param0.prepareImage(((fh) this).field_f, (java.awt.image.ImageObserver) this);
            this.b((byte) 45);
            boolean discarded$2 = param0.prepareImage(((fh) this).field_f, (java.awt.image.ImageObserver) this);
            ((fh) this).a(-1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "fh.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void d() {
        field_j = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    fh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
        field_j = "Connection restored.";
        field_n = new mf[3];
    }
}
