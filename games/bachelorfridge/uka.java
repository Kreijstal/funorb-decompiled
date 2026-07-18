/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uka extends qm implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static hk field_k;
    private java.awt.image.ColorModel field_m;
    static int[] field_i;
    static hca field_h;
    static boolean field_j;

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
            if (((uka) this).field_l == param0) {
              ((uka) this).field_l = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("uka.removeConsumer(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((uka) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uka.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            ((uka) this).field_f = param0;
            ((uka) this).field_b = param2;
            ((uka) this).field_e = new int[1 + param0 * param2];
            if (param3 != 256) {
                Object var6 = null;
                ((uka) this).addConsumer((java.awt.image.ImageConsumer) null);
            }
            ((uka) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((uka) this).field_c = param1.createImage((java.awt.image.ImageProducer) this);
            this.b(2);
            boolean discarded$0 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
            this.b(param3 + -254);
            boolean discarded$1 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
            this.b(2);
            boolean discarded$2 = param1.prepareImage(((uka) this).field_c, (java.awt.image.ImageObserver) this);
            ((uka) this).a((byte) 125);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uka.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ema a(long param0, int param1) {
        return (ema) (Object) wi.field_i.a(param0, (byte) -87);
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        kha var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = (kha) (Object) iea.field_d.b((byte) 90);
              if (param0 < -40) {
                break L1;
              } else {
                field_j = true;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3_int != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (param1 != var4.field_h) {
                        break L4;
                      } else {
                        if (255 > mg.field_m.field_f[param1] + var4.field_g) {
                          var4.d((byte) 95);
                          var3_int = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (param1 != var4.field_h) {
                        break L5;
                      } else {
                        if (mg.field_m.field_f[param1] + var4.field_g != 255) {
                          break L5;
                        } else {
                          var3_int = 1;
                          break L5;
                        }
                      }
                    }
                    var4 = (kha) (Object) iea.field_d.c(0);
                    continue L2;
                  }
                }
              }
              L6: {
                if (var3_int != 0) {
                  break L6;
                } else {
                  iea.field_d.a((bw) (Object) new kha(param1, 1), true);
                  qg.field_b.a(-1, (sna) (Object) new kr(param1, gr.field_a[param1], (kha) (Object) iea.field_d.a(6)));
                  break L6;
                }
              }
              iaa.a(-110);
              gu.field_d = gu.field_d + 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "uka.D(" + param0 + ',' + param1 + ',' + 1 + ')');
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
            stackOut_2_1 = new StringBuilder().append("uka.imageUpdate(");
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
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final synchronized void b(int param0) {
        if (!(((uka) this).field_l != null)) {
            return;
        }
        ((uka) this).field_l.setPixels(0, 0, ((uka) this).field_b, ((uka) this).field_f, ((uka) this).field_m, ((uka) this).field_e, 0, ((uka) this).field_b);
        ((uka) this).field_l.imageComplete(param0);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((uka) this).field_l;
    }

    uka() {
    }

    final void a(byte param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.b(2);
            if (param0 <= 27) {
                ((uka) this).field_l = null;
            }
            boolean discarded$0 = param2.drawImage(((uka) this).field_c, param3, param1, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uka.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((uka) this).field_l = param0;
            param0.setDimensions(((uka) this).field_b, ((uka) this).field_f);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((uka) this).field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uka.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(byte param0) {
        field_i = null;
        field_h = null;
        field_k = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, kia param1, int param2, boolean param3, byte param4) {
        try {
            int var5_int = -1;
            kw.field_j.a(param1, !param3 ? true : false, 1000000, 256, 1048576, true);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "uka.H(" + 1048576 + ',' + (param1 != null ? "{...}" : "null") + ',' + 256 + ',' + param3 + ',' + -112 + ')');
        }
    }

    final static kv[] a(int param0, int param1, vr param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
          var4_int = 0;
          if (g.a(param3, param0, -30744, param2)) {
            return mfa.a(10583);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("uka.F(").append(param0).append(',').append(126).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new hk("");
        field_i = new int[4];
    }
}
