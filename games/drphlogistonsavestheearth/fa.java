/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fa extends na implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static he field_o;
    static he[] field_m;
    static he[] field_n;
    static int[] field_j;
    private java.awt.image.ImageConsumer field_p;
    static int[] field_l;
    private java.awt.image.ColorModel field_i;
    static he[] field_k;

    private final synchronized void c() {
        if (null == ((fa) this).field_p) {
          return;
        } else {
          ((fa) this).field_p.setPixels(0, 0, ((fa) this).field_f, ((fa) this).field_g, ((fa) this).field_i, ((fa) this).field_e, 0, ((fa) this).field_f);
          ((fa) this).field_p.imageComplete(2);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
            if (param2 > -22) {
                Object var6 = null;
                boolean discarded$0 = ((fa) this).isConsumer((java.awt.image.ImageConsumer) null);
            }
            ((fa) this).field_f = param0;
            ((fa) this).field_e = new int[1 + param0 * param1];
            ((fa) this).field_g = param1;
            ((fa) this).field_i = (java.awt.image.ColorModel) (Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255);
            ((fa) this).field_h = param3.createImage((java.awt.image.ImageProducer) this);
            int discarded$1 = 0;
            this.c();
            boolean discarded$2 = param3.prepareImage(((fa) this).field_h, (java.awt.image.ImageObserver) this);
            int discarded$3 = 0;
            this.c();
            boolean discarded$4 = param3.prepareImage(((fa) this).field_h, (java.awt.image.ImageObserver) this);
            int discarded$5 = 0;
            this.c();
            boolean discarded$6 = param3.prepareImage(((fa) this).field_h, (java.awt.image.ImageObserver) this);
            ((fa) this).a(119);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "fa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d() {
        return null != hg.field_S && hg.field_S.k(110) != null;
    }

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
              if (((fa) this).field_p == param0) {
                ((fa) this).field_p = null;
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
            stackOut_4_1 = new StringBuilder().append("fa.removeConsumer(");
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
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            ((fa) this).addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "fa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return ((fa) this).field_p == param0;
    }

    public static void e() {
        field_m = null;
        field_n = null;
        field_l = null;
        field_k = null;
        field_o = null;
        field_j = null;
    }

    final static boolean a() {
        return rh.field_i;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            ((fa) this).field_p = param0;
            param0.setDimensions(((fa) this).field_f, ((fa) this).field_g);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(((fa) this).field_i);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "fa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
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
            stackOut_2_1 = new StringBuilder().append("fa.imageUpdate(");
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
          throw ie.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        hi.field_g = param2;
        s.field_g = param1;
        ha.field_a = param4;
        ni.field_p = param3;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
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
              int discarded$7 = 0;
              this.c();
              boolean discarded$8 = param0.drawImage(((fa) this).field_h, param1, param2, (java.awt.image.ImageObserver) this);
              if (param3 == 255) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$9 = ((fa) this).isConsumer((java.awt.image.ImageConsumer) null);
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
            stackOut_3_1 = new StringBuilder().append("fa.B(");
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
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 0) {
                break L1;
              } else {
                if (~param0 <= ~uc.field_h) {
                  break L1;
                } else {
                  L2: {
                    if (param6 >= 0) {
                      break L2;
                    } else {
                      if (param2 >= 0) {
                        break L2;
                      } else {
                        if (param7 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~param6 > ~uc.field_f) {
                      break L3;
                    } else {
                      if (uc.field_f > param2) {
                        break L3;
                      } else {
                        if (param7 >= uc.field_f) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = -param0 + param3;
                    if (~param5 != ~param0) {
                      L5: {
                        var10 = param6 << 16;
                        var9_int = param6 << 16;
                        var15 = param5 + -param0;
                        var11 = (-param6 + param2 << 16) / var15;
                        var12 = (-param6 + param7 << 16) / var14;
                        if (var12 <= var11) {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L5;
                        } else {
                          var13 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param0 >= 0) {
                            break L7;
                          } else {
                            if (param5 >= 0) {
                              param0 = -param0;
                              var9_int = var9_int + var11 * param0;
                              var10 = var10 + var12 * param0;
                              param0 = 0;
                              break L7;
                            } else {
                              param0 = param5 - param0;
                              var9_int = var9_int + param0 * var11;
                              var10 = var10 + var12 * param0;
                              param0 = param5;
                              break L6;
                            }
                          }
                        }
                        var16 = uc.field_g[param0];
                        L8: while (true) {
                          if (param0 >= param5) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> 16;
                              if (uc.field_f <= var17) {
                                break L9;
                              } else {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (0 == var18) {
                                  if (0 > var17) {
                                    break L9;
                                  } else {
                                    if (~uc.field_f < ~var17) {
                                      int discarded$6 = -2141888031;
                                      qa.a(var17 - -var16, param8, param4, var18);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (~(var18 + var17) > ~uc.field_f) {
                                      break L10;
                                    } else {
                                      var18 = -1 + (-var17 + uc.field_f);
                                      break L10;
                                    }
                                  }
                                  if (var17 < 0) {
                                    int discarded$7 = -2141888031;
                                    qa.a(var16, param8, param4, var17 + var18);
                                    break L9;
                                  } else {
                                    int discarded$8 = -2141888031;
                                    qa.a(var17 - -var16, param8, param4, var18);
                                    break L9;
                                  }
                                }
                              }
                            }
                            param0++;
                            if (~param0 <= ~uc.field_h) {
                              return;
                            } else {
                              var16 = var16 + wj.field_k;
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              continue L8;
                            }
                          }
                        }
                      }
                      var16 = -param5 + param3;
                      if (0 != var16) {
                        L11: {
                          var17 = param7 << 16;
                          if (var13 == 0) {
                            var9_int = param2 << 16;
                            break L11;
                          } else {
                            var10 = param2 << 16;
                            break L11;
                          }
                        }
                        var12 = (var17 + -var10) / var16;
                        var11 = (-var9_int + var17) / var16;
                        break L4;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param3 != param0) {
                          var15 = -param5 + param3;
                          if (param2 <= param6) {
                            var12 = (-param6 + param7 << 16) / var14;
                            var9_int = param2 << 16;
                            var10 = param6 << 16;
                            var11 = (-param2 + param7 << 16) / var15;
                            break L12;
                          } else {
                            var11 = (param7 + -param6 << 16) / var14;
                            var10 = param2 << 16;
                            var9_int = param6 << 16;
                            var12 = (-param2 + param7 << 16) / var15;
                            break L12;
                          }
                        } else {
                          var10 = param2 << 16;
                          var9_int = param6 << 16;
                          var12 = 0;
                          var11 = 0;
                          break L12;
                        }
                      }
                      L13: {
                        if (param0 >= 0) {
                          break L13;
                        } else {
                          param0 = Math.min(-param0, -param0 + param5);
                          var10 = var10 + param0 * var12;
                          var9_int = var9_int + param0 * var11;
                          param0 = 0;
                          break L13;
                        }
                      }
                      var13 = 0;
                      break L4;
                    }
                  }
                  L14: {
                    if (0 <= param0) {
                      break L14;
                    } else {
                      param0 = -param0;
                      var9_int = var9_int + param0 * var11;
                      var10 = var10 + var12 * param0;
                      param0 = 0;
                      break L14;
                    }
                  }
                  var15 = uc.field_g[param0];
                  L15: while (true) {
                    if (~param3 >= ~param0) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (~var16 <= ~uc.field_f) {
                          break L16;
                        } else {
                          var17 = (var10 >> 16) - (var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (uc.field_f > var16) {
                                int discarded$9 = -2141888031;
                                qa.a(var15 + var16, param8, param4, var17);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (~uc.field_f < ~(var17 + var16)) {
                                break L17;
                              } else {
                                var17 = -1 + -var16 + uc.field_f;
                                break L17;
                              }
                            }
                            if (var16 < 0) {
                              int discarded$10 = -2141888031;
                              qa.a(var15, param8, param4, var16 + var17);
                              break L16;
                            } else {
                              int discarded$11 = -2141888031;
                              qa.a(var15 + var16, param8, param4, var17);
                              break L16;
                            }
                          }
                        }
                      }
                      param0++;
                      if (~param0 > ~uc.field_h) {
                        var15 = var15 + wj.field_k;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L15;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var9;
            stackOut_73_1 = new StringBuilder().append("fa.K(").append(param0).append(',').append(-124).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param8 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
    }

    fa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[8192];
        field_l = new int[]{0, 16744448, 98559, 16711680, 16776960, 65280, 16777215, 16711680, 16711680, 16711680, 16744448, 0, 16777215, 16744448};
    }
}
