/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sl extends ba implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static ta field_o;
    static int[] field_k;
    static String field_n;
    static int field_j;
    private java.awt.image.ImageConsumer field_l;
    private java.awt.image.ColorModel field_m;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
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
              this.b(-102);
              boolean discarded$3 = param2.drawImage(((sl) this).field_b, param0, param3, (java.awt.image.ImageObserver) this);
              if (param1 == 7) {
                break L1;
              } else {
                var6 = null;
                ((sl) this).requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
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
            stackOut_3_1 = new StringBuilder().append("sl.B(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((sl) this).field_l == param0;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (th.a(false, param1)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                var6 = bi.field_s;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    var2 = ff.field_e;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L2;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0 != 0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      return stackIn_12_0 != 0;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2_ref, "sl.G(" + 0 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    public static void b() {
        field_o = null;
        field_n = null;
        field_k = null;
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            ((sl) this).field_i = param2;
            ((sl) this).field_e = new int[1 + param2 * param0];
            ((sl) this).field_g = param0;
            ((sl) this).field_m = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((sl) this).field_b = param1.createImage((java.awt.image.ImageProducer) this);
            this.b(-68);
            boolean discarded$0 = param1.prepareImage(((sl) this).field_b, (java.awt.image.ImageObserver) this);
            this.b(-78);
            if (param3 > -10) {
                Object var6 = null;
                boolean discarded$1 = ((sl) this).isConsumer((java.awt.image.ImageConsumer) null);
            }
            boolean discarded$2 = param1.prepareImage(((sl) this).field_b, (java.awt.image.ImageObserver) this);
            this.b(-62);
            boolean discarded$3 = param1.prepareImage(((sl) this).field_b, (java.awt.image.ImageObserver) this);
            ((sl) this).a((byte) 112);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((sl) this).field_l = param0;
            param0.setDimensions(((sl) this).field_g, ((sl) this).field_i);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((sl) this).field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sl.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(boolean param0) {
        RuntimeException var1 = null;
        ki var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = (ki) (Object) hd.field_u.a((byte) -117);
            L1: while (true) {
              if (var1_ref == null) {
                ac.field_a.a((byte) 127);
                break L0;
              } else {
                L2: {
                  if (var1_ref.field_t != null) {
                    break L2;
                  } else {
                    var1_ref.b((byte) -106);
                    var1_ref.f(-7);
                    if ((float)var1_ref.field_y + var1_ref.field_q >= 480.0f) {
                      var1_ref.field_t = ri.field_b;
                      break L2;
                    } else {
                      L3: {
                        if (!var1_ref.field_E) {
                          break L3;
                        } else {
                          if (var1_ref.field_q - (float)var1_ref.field_y < (float)hf.field_f.field_O) {
                            break L3;
                          } else {
                            int discarded$2 = 0;
                            lb.b();
                            break L3;
                          }
                        }
                      }
                      if (!var1_ref.field_E) {
                        if ((float)var1_ref.field_y + var1_ref.field_q <= 0.0f) {
                          dc.field_e = 0;
                          var1_ref.field_q = var1_ref.field_q - (var1_ref.field_q + (float)var1_ref.field_y);
                          var1_ref.field_j = true;
                          var1_ref.field_t = ok.field_a;
                          cj.a((byte) -73, ke.field_h[3]);
                          break L2;
                        } else {
                          if (!pa.a(var1_ref.field_I, (int)((float)var1_ref.field_G + var1_ref.field_B), var1_ref.field_y + (int)var1_ref.field_q, sb.field_m, 80, 0)) {
                            break L2;
                          } else {
                            L4: {
                              boolean discarded$3 = jj.a(-32680, var1_ref, var1_ref.field_G + ((int)var1_ref.field_B - 80), (int)var1_ref.field_q + var1_ref.field_y);
                              if (0 < var1_ref.field_m) {
                                break L4;
                              } else {
                                if (var1_ref.field_x) {
                                  break L4;
                                } else {
                                  var1_ref = (ki) (Object) hd.field_u.d((byte) 63);
                                  continue L1;
                                }
                              }
                            }
                            var1_ref.field_t = ok.field_a;
                            lc.field_f = true;
                            var2 = 1;
                            var3 = 0;
                            L5: while (true) {
                              L6: {
                                if (var1_ref.field_m <= var3) {
                                  break L6;
                                } else {
                                  if (!var1_ref.field_o[var3].field_x) {
                                    var2 = 0;
                                    break L6;
                                  } else {
                                    var3++;
                                    continue L5;
                                  }
                                }
                              }
                              if (var2 == 0) {
                                var1_ref.field_v = var1_ref.field_v * 0.5f;
                                var1_ref.field_D = var1_ref.field_D * 0.5f;
                                var1_ref.b((byte) -115);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var1_ref = (ki) (Object) hd.field_u.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "sl.H(" + true + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
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
            stackOut_2_1 = new StringBuilder().append("sl.imageUpdate(");
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
          throw la.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        m var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (m) (Object) gi.field_l.a((byte) -117);
            var3 = 65;
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                int discarded$8 = -95;
                int discarded$9 = 7;
                oe.a(var5);
                var5 = (m) (Object) gi.field_l.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "sl.F(" + 7 + ',' + 63 + ')');
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
              if (((sl) this).field_l != param0) {
                break L1;
              } else {
                ((sl) this).field_l = null;
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
            stackOut_3_1 = new StringBuilder().append("sl.removeConsumer(");
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    sl() {
    }

    private final synchronized void b(int param0) {
        if (param0 > -31) {
            Object var3 = null;
            boolean discarded$0 = ((sl) this).imageUpdate((java.awt.Image) null, 57, 66, 101, 18, -15);
        }
        if (null == ((sl) this).field_l) {
            return;
        }
        ((sl) this).field_l.setPixels(0, 0, ((sl) this).field_g, ((sl) this).field_i, ((sl) this).field_m, ((sl) this).field_e, 0, ((sl) this).field_g);
        ((sl) this).field_l.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((sl) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "sl.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_k = new int[5];
    }
}
