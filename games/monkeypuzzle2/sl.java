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
        try {
            this.b(-102);
            param2.drawImage(this.field_b, param0, param3, (java.awt.image.ImageObserver) (this));
            if (param1 != 7) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_l == param0;
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
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (th.a(false, param1)) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = bi.field_s;
                var2 = var6;
                var3 = param0;
                L1: while (true) {
                  if (var3 >= var6.length) {
                    var2 = ff.field_e;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L2;
                        } else {
                          stackIn_19_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 != var4) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "sl.G(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_o = null;
        field_n = null;
        field_k = null;
        if (param0 != 74) {
            sl.a(22, (byte) -64);
        }
    }

    final void a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            this.field_i = param2;
            this.field_e = new int[1 + param2 * param0];
            this.field_g = param0;
            this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_b = param1.createImage((java.awt.image.ImageProducer) (this));
            this.b(-68);
            param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(-78);
            if (param3 > -10) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                this.isConsumer((java.awt.image.ImageConsumer) null);
            }
            param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(-62);
            param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.a((byte) 112);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_l = param0;
            param0.setDimensions(this.field_g, this.field_i);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        ki var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (ki) ((Object) hd.field_u.a((byte) -117));
            L1: while (true) {
              if (var1 == null) {
                L2: {
                  if (!param0) {
                    sl.a(6, (byte) 31);
                    ac.field_a.a((byte) 127);
                    break L2;
                  } else {
                    ac.field_a.a((byte) 127);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (var1.field_t != null) {
                    break L3;
                  } else {
                    var1.b((byte) -106);
                    var1.f(-7);
                    if ((float)var1.field_y + var1.field_q >= 480.0f) {
                      var1.field_t = ri.field_b;
                      break L3;
                    } else {
                      L4: {
                        if (!var1.field_E) {
                          break L4;
                        } else {
                          if (var1.field_q - (float)var1.field_y < (float)hf.field_f.field_O) {
                            break L4;
                          } else {
                            lb.b(false);
                            break L4;
                          }
                        }
                      }
                      if (!var1.field_E) {
                        if ((float)var1.field_y + var1.field_q <= 0.0f) {
                          dc.field_e = 0;
                          var1.field_q = var1.field_q - (var1.field_q + (float)var1.field_y);
                          var1.field_j = true;
                          var1.field_t = ok.field_a;
                          cj.a((byte) -73, ke.field_h[3]);
                          break L3;
                        } else {
                          if (!pa.a(var1.field_I, (int)((float)var1.field_G + var1.field_B), var1.field_y + (int)var1.field_q, sb.field_m, 80, 0)) {
                            break L3;
                          } else {
                            L5: {
                              jj.a(-32680, var1, var1.field_G + ((int)var1.field_B - 80), (int)var1.field_q + var1.field_y);
                              if (0 < var1.field_m) {
                                break L5;
                              } else {
                                if (var1.field_x) {
                                  break L5;
                                } else {
                                  var1 = (ki) ((Object) hd.field_u.d((byte) 63));
                                  continue L1;
                                }
                              }
                            }
                            var1.field_t = ok.field_a;
                            lc.field_f = true;
                            var2 = 1;
                            var3 = 0;
                            L6: while (true) {
                              L7: {
                                if (var1.field_m <= var3) {
                                  break L7;
                                } else {
                                  if (!var1.field_o[var3].field_x) {
                                    var2 = 0;
                                    break L7;
                                  } else {
                                    var3++;
                                    continue L6;
                                  }
                                }
                              }
                              if (var2 == 0) {
                                var1.field_v = var1.field_v * 0.5f;
                                var1.field_D = var1.field_D * 0.5f;
                                var1.b((byte) -115);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1 = (ki) ((Object) hd.field_u.d((byte) 63));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "sl.H(" + param0 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
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

            stackIn_4_1 = new StringBuilder().append("sl.imageUpdate(");

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
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        m var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (m) ((Object) gi.field_l.a((byte) -117));
            var3 = 65 / ((param1 - -27) / 57);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                oe.a(var5, param0, (byte) -95);
                var5 = (m) ((Object) gi.field_l.d((byte) 63));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "sl.F(" + param0 + ',' + param1 + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
            if (this.field_l == param0) {
                this.field_l = null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    sl() {
    }

    private final synchronized void b(int param0) {
        if (param0 > -31) {
            java.awt.Image var3 = (java.awt.Image) null;
            this.imageUpdate((java.awt.Image) null, 57, 66, 101, 18, -15);
        }
        if (null == this.field_l) {
            return;
        }
        this.field_l.setPixels(0, 0, this.field_g, this.field_i, this.field_m, this.field_e, 0, this.field_g);
        this.field_l.imageComplete(2);
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "sl.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = 0;
        field_k = new int[5];
    }
}
