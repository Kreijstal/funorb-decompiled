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
        if (null == ((oa) this).field_k) {
            return;
        }
        ((oa) this).field_k.setPixels(0, 0, ((oa) this).field_a, ((oa) this).field_d, ((oa) this).field_o, ((oa) this).field_h, 0, ((oa) this).field_a);
        ((oa) this).field_k.imageComplete(2);
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        fj var4_ref_fj = null;
        int var4 = 0;
        lc var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var9 = te.field_N;
              var2 = var9.j(255);
              var3 = var9.j(255);
              if (var2 != 0) {
                if (var2 != 1) {
                  int discarded$1 = 1;
                  hi.a((Throwable) null, "LR1: " + oc.a(false));
                  je.a(false);
                  break L1;
                } else {
                  var4 = var9.d(-116);
                  var5 = (lc) (Object) hc.field_a.a((byte) 51);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var5.field_n != var3) {
                            break L4;
                          } else {
                            if (var4 != var5.field_o) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = (lc) (Object) hc.field_a.b(-66);
                        continue L2;
                      }
                    }
                    if (var5 == null) {
                      je.a(false);
                      return;
                    } else {
                      var5.c(10);
                      break L1;
                    }
                  }
                }
              } else {
                var4_ref_fj = (fj) (Object) ti.field_b.a((byte) 51);
                if (var4_ref_fj != null) {
                  L5: {
                    var5_int = te.field_O + -var9.field_m;
                    var13 = var4_ref_fj.field_h;
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var6 = var10;
                    if (var5_int > var13.length << 2) {
                      var5_int = var13.length << 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5_int) {
                      var4_ref_fj.c(10);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var9.j(255) << fi.a(var7 << 8, 768));
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  je.a(false);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "oa.F(" + 1811357826 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((oa) this).field_k = param0;
            param0.setDimensions(((oa) this).field_a, ((oa) this).field_d);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((oa) this).field_o);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "oa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static fc a(int param0, int param1, da param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        fc stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = param2.a(param1, (byte) -104);
            var3 = var4;
            if (var4 != null) {
              stackOut_5_0 = new fc(var4);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (fc) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("oa.E(").append(-1803587230).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((oa) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "oa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
              if (((oa) this).field_k != param0) {
                break L1;
              } else {
                ((oa) this).field_k = null;
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
            stackOut_3_1 = new StringBuilder().append("oa.removeConsumer(");
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
          throw fc.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            stackOut_2_1 = new StringBuilder().append("oa.imageUpdate(");
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
          throw fc.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public static void b() {
        field_i = null;
        field_j = null;
        field_l = null;
    }

    oa() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            ((oa) this).field_d = param2;
            ((oa) this).field_a = param3;
            ((oa) this).field_h = new int[param2 * param3 - -1];
            ((oa) this).field_o = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((oa) this).field_g = param0.createImage((java.awt.image.ImageProducer) this);
            this.b(true);
            if (param1 != 9387) {
                field_n = false;
            }
            boolean discarded$0 = param0.prepareImage(((oa) this).field_g, (java.awt.image.ImageObserver) this);
            this.b(true);
            boolean discarded$1 = param0.prepareImage(((oa) this).field_g, (java.awt.image.ImageObserver) this);
            this.b(true);
            boolean discarded$2 = param0.prepareImage(((oa) this).field_g, (java.awt.image.ImageObserver) this);
            ((oa) this).a(true);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "oa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        if (param1 != 0) {
            return;
        }
        try {
            this.b(true);
            boolean discarded$0 = param3.drawImage(((oa) this).field_g, param0, param2, (java.awt.image.ImageObserver) this);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "oa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == ((oa) this).field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Type your age in years";
        field_j = new wh();
        field_n = false;
    }
}
