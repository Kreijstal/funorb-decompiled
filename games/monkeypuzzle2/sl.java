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
        boolean discarded$3 = false;
        RuntimeException runtimeException = null;
        java.awt.image.ImageConsumer var6 = null;
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
              discarded$3 = param2.drawImage(this.field_b, param0, param3, (java.awt.image.ImageObserver) (this));
              if (param1 == 7) {
                break L1;
              } else {
                var6 = (java.awt.image.ImageConsumer) null;
                this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sl.B(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
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
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_2_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (th.a(false, param1)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var6 = bi.field_s;
                var2 = var6;
                var3 = param0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 >= var6.length) {
                            break L5;
                          } else {
                            var4 = var6[var3];
                            var8 = var4;
                            var7 = param1;
                            if (var5 != 0) {
                              if (var7 <= var8) {
                                break L3;
                              } else {
                                L6: while (true) {
                                  var4 = var2[var3];
                                  stackOut_19_0 = var4 ^ -1;
                                  stackIn_25_0 = stackOut_19_0;
                                  stackIn_20_0 = stackOut_19_0;
                                  if (var5 != 0) {
                                    break L2;
                                  } else {
                                    if (stackIn_20_0 != (param1 ^ -1)) {
                                      var3++;
                                      if (var5 == 0) {
                                        if (var2.length <= var3) {
                                          break L3;
                                        } else {
                                          continue L6;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var7 != var8) {
                                var3++;
                                if (var5 == 0) {
                                  continue L1;
                                } else {
                                  break L5;
                                }
                              } else {
                                return true;
                              }
                            }
                          }
                        }
                        var2 = ff.field_e;
                        var3 = 0;
                        L7: while (true) {
                          if (var2.length <= var3) {
                            break L3;
                          } else {
                            var4 = var2[var3];
                            stackOut_19_0 = var4 ^ -1;
                            stackIn_25_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var5 != 0) {
                              break L2;
                            } else {
                              if (stackIn_20_0 != (param1 ^ -1)) {
                                var3++;
                                if (var5 == 0) {
                                  continue L7;
                                } else {
                                  break L3;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L2;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
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
              return stackIn_25_0 != 0;
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
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        try {
            this.field_i = param2;
            this.field_e = new int[1 + param2 * param0];
            this.field_g = param0;
            this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_b = param1.createImage((java.awt.image.ImageProducer) (this));
            this.b(-68);
            discarded$0 = param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(-78);
            if (param3 > -10) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                discarded$1 = this.isConsumer((java.awt.image.ImageConsumer) null);
            }
            discarded$2 = param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(-62);
            discarded$3 = param1.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
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
        boolean discarded$1 = false;
        RuntimeException var1 = null;
        ki var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0 = false;
        int stackOut_29_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = (ki) ((Object) hd.field_u.a((byte) -117));
            L1: while (true) {
              L2: {
                L3: {
                  if (var1_ref == null) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var1_ref.field_t != null) {
                          break L4;
                        } else {
                          L5: {
                            var1_ref.b((byte) -106);
                            var1_ref.f(-7);
                            if ((float)var1_ref.field_y + var1_ref.field_q >= 480.0f) {
                              var1_ref.field_t = ri.field_b;
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          L6: {
                            if (!var1_ref.field_E) {
                              break L6;
                            } else {
                              if (var1_ref.field_q - (float)var1_ref.field_y < (float)hf.field_f.field_O) {
                                break L6;
                              } else {
                                lb.b(false);
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (!var1_ref.field_E) {
                              break L7;
                            } else {
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if ((float)var1_ref.field_y + var1_ref.field_q <= 0.0f) {
                              dc.field_e = 0;
                              var1_ref.field_q = var1_ref.field_q - (var1_ref.field_q + (float)var1_ref.field_y);
                              var1_ref.field_j = true;
                              var1_ref.field_t = ok.field_a;
                              cj.a((byte) -73, ke.field_h[3]);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          if (!pa.a(var1_ref.field_I, (int)((float)var1_ref.field_G + var1_ref.field_B), var1_ref.field_y + (int)var1_ref.field_q, sb.field_m, 80, 0)) {
                            break L4;
                          } else {
                            L9: {
                              discarded$1 = jj.a(-32680, var1_ref, var1_ref.field_G + ((int)var1_ref.field_B - 80), (int)var1_ref.field_q + var1_ref.field_y);
                              if (0 < var1_ref.field_m) {
                                break L9;
                              } else {
                                if (var1_ref.field_x) {
                                  break L9;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var1_ref.field_t = ok.field_a;
                            lc.field_f = true;
                            var2 = 1;
                            var3 = 0;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var1_ref.field_m <= var3) {
                                    break L12;
                                  } else {
                                    stackOut_23_0 = var1_ref.field_o[var3].field_x;
                                    stackIn_30_0 = stackOut_23_0 ? 1 : 0;
                                    stackIn_24_0 = stackOut_23_0;
                                    if (var4 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (!stackIn_24_0) {
                                          var2 = 0;
                                          if (var4 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                      var3++;
                                      if (var4 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_29_0 = var2;
                                stackIn_30_0 = stackOut_29_0;
                                break L11;
                              }
                              if (stackIn_30_0 == 0) {
                                var1_ref.field_v = var1_ref.field_v * 0.5f;
                                var1_ref.field_D = var1_ref.field_D * 0.5f;
                                var1_ref.b((byte) -115);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var1_ref = (ki) ((Object) hd.field_u.d((byte) 63));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "sl.H(" + param0 + ')');
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
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("sl.imageUpdate(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
            var5 = (m) ((Object) gi.field_l.a((byte) -117));
            var3 = 65 / ((param1 - -27) / 57);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                oe.a(var5, param0, (byte) -95);
                var5 = (m) ((Object) gi.field_l.d((byte) 63));
                if (var4 == 0) {
                  continue L1;
                } else {
                  return;
                }
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
              if (this.field_l != param0) {
                break L1;
              } else {
                this.field_l = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sl.removeConsumer(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    sl() {
    }

    private final synchronized void b(int param0) {
        boolean discarded$1 = false;
        java.awt.Image var3 = null;
        if (param0 <= -31) {
          if (null == this.field_l) {
            return;
          } else {
            this.field_l.setPixels(0, 0, this.field_g, this.field_i, this.field_m, this.field_e, 0, this.field_g);
            this.field_l.imageComplete(2);
            return;
          }
        } else {
          var3 = (java.awt.Image) null;
          discarded$1 = this.imageUpdate((java.awt.Image) null, 57, 66, 101, 18, -15);
          if (null == this.field_l) {
            return;
          } else {
            this.field_l.setPixels(0, 0, this.field_g, this.field_i, this.field_m, this.field_e, 0, this.field_g);
            this.field_l.imageComplete(2);
            return;
          }
        }
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
