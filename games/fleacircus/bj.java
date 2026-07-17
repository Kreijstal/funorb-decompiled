/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bj extends uc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_j;
    static String field_i;
    private java.awt.image.ImageConsumer field_k;
    static int field_m;
    static int field_l;
    static vc field_n;

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        try {
            if (param3 < 19) {
                Object var6 = null;
                ((bj) this).a((java.awt.Component) null, 87, -48, 10);
            }
            int discarded$0 = -112;
            this.d();
            boolean discarded$1 = param0.drawImage(((bj) this).field_b, param2, param1, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bj.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void a() {
        field_i = null;
        field_n = null;
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        ((bj) this).field_g = new int[param1 * param2 + 1];
        ((bj) this).field_h = param1;
        ((bj) this).field_f = param2;
        ((bj) this).field_j = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
        ((bj) this).field_b = param0.createImage((java.awt.image.ImageProducer) this);
        int discarded$0 = -112;
        this.d();
        boolean discarded$7 = param0.prepareImage(((bj) this).field_b, (java.awt.image.ImageObserver) this);
        if (param3 > -72) {
            return;
        }
        try {
            int discarded$8 = -112;
            this.d();
            boolean discarded$9 = param0.prepareImage(((bj) this).field_b, (java.awt.image.ImageObserver) this);
            int discarded$10 = -112;
            this.d();
            boolean discarded$11 = param0.prepareImage(((bj) this).field_b, (java.awt.image.ImageObserver) this);
            ((bj) this).a((byte) 74);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bj.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void e(byte param0) {
        ih var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1 = ud.field_b;
            L1: while (true) {
              if (!hd.a(-101)) {
                if (param0 == -41) {
                  break L0;
                } else {
                  bj.e((byte) -119);
                  return;
                }
              } else {
                var1.e(8, 8);
                int fieldTemp$4 = var1.field_i + 1;
                var1.field_i = var1.field_i + 1;
                var2 = fieldTemp$4;
                int discarded$5 = 0;
                ec.a(var1);
                ud.field_b.c((byte) -80, var1.field_i - var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1_ref, "bj.K(" + param0 + 41);
        }
    }

    bj() {
    }

    final static ob a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ob stackIn_3_0 = null;
        ob stackIn_6_0 = null;
        ob stackIn_15_0 = null;
        ob stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ob stackOut_18_0 = null;
        ob stackOut_14_0 = null;
        ob stackOut_5_0 = null;
        ob stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int <= 63) {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (kb.field_j.indexOf(var4) == -1) {
                        stackOut_18_0 = je.field_M;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        break L1;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var3 == -1 + var2_int) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_14_0 = je.field_M;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              stackOut_5_0 = hg.field_i;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = tf.field_H;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("bj.I(").append(-64).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (((bj) this).field_k != param0) {
                break L1;
              } else {
                ((bj) this).field_k = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bj.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((bj) this).field_k == param0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            qj.field_G = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            uk.a(var3, var4, 0, param1, var2);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bj.J(" + 14 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final synchronized void d() {
        if (!(((bj) this).field_k != null)) {
            return;
        }
        ((bj) this).field_k.setPixels(0, 0, ((bj) this).field_h, ((bj) this).field_f, ((bj) this).field_j, ((bj) this).field_g, 0, ((bj) this).field_h);
        ((bj) this).field_k.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((bj) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bj.startProduction(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((bj) this).field_k = param0;
            param0.setDimensions(((bj) this).field_h, ((bj) this).field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((bj) this).field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "bj.addConsumer(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
            stackOut_2_1 = new StringBuilder().append("bj.imageUpdate(");
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
          throw pf.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_1_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_l = 9;
        field_i = "Your email address is used to identify this account";
    }
}
