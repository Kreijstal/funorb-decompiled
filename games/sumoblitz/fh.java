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
            if (this.field_l == param0) {
              this.field_l = null;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("fh.removeConsumer(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 > -83) {
            field_n = (mf[]) null;
            return lm.a(59, ra.c(2));
        }
        return lm.a(59, ra.c(2));
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_l = param0;
            param0.setDimensions(this.field_h, this.field_b);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_m);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
    }

    private final synchronized void b(byte param0) {
        java.awt.image.ImageConsumer var3 = null;
        if (this.field_l == null) {
          return;
        } else {
          L0: {
            this.field_l.setPixels(0, 0, this.field_h, this.field_b, this.field_m, this.field_c, 0, this.field_h);
            this.field_l.imageComplete(2);
            if (param0 >= 31) {
              break L0;
            } else {
              var3 = (java.awt.image.ImageConsumer) null;
              this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
              break L0;
            }
          }
          return;
        }
    }

    final static dk a(String param0, int param1) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dk stackIn_4_0 = null;
        dk stackIn_8_0 = null;
        dk stackIn_20_0 = null;
        dk stackIn_24_0 = null;
        Object stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dk stackOut_3_0 = null;
        dk stackOut_7_0 = null;
        dk stackOut_23_0 = null;
        dk stackOut_19_0 = null;
        Object stackOut_30_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackOut_3_0 = qo.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 63) {
                stackOut_7_0 = cn.field_ib;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var3 >= var2_int) {
                        break L3;
                      } else {
                        var4 = param0.charAt(var3);
                        var7 = 45;
                        var6 = var4;
                        if (var5 != 0) {
                          if (var6 != var7) {
                            discarded$4 = fh.c(40);
                            break L2;
                          } else {
                            return null;
                          }
                        } else {
                          L4: {
                            if (var6 != var7) {
                              if (ji.field_a.indexOf(var4) == -1) {
                                stackOut_23_0 = gs.field_a;
                                stackIn_24_0 = stackOut_23_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                if (var3 == 0) {
                                  break L5;
                                } else {
                                  if (var2_int + -1 == var3) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              stackOut_19_0 = gs.field_a;
                              stackIn_20_0 = stackOut_19_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (param1 != -1) {
                      discarded$5 = fh.c(40);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                  stackOut_30_0 = null;
                  stackIn_31_0 = stackOut_30_0;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("fh.C(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0;
              } else {
                return (dk) ((Object) stackIn_31_0);
              }
            }
          }
        }
    }

    final static gk a(pl param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        gk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        gk stackIn_3_0 = null;
        gk stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_28_0 = null;
        gk stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b(8, (byte) -92);
            if (param1 == -16736) {
              if ((var2_int ^ -1) >= -1) {
                L1: {
                  var3 = kh.a(param0, false) ? 1 : 0;
                  var4 = kh.a(param0, false) ? 1 : 0;
                  var5 = new gk();
                  var5.field_D = (short)param0.b(16, (byte) -119);
                  var5.field_Q = sm.a(var5.field_Q, param0, -119, 16);
                  var5.field_B = sm.a(var5.field_B, param0, -120, 16);
                  var5.field_r = sm.a(var5.field_r, param0, -127, 16);
                  var5.field_n = (short)param0.b(16, (byte) -117);
                  var5.field_A = sm.a(var5.field_A, param0, -128, 16);
                  var5.field_b = sm.a(var5.field_b, param0, -116, 16);
                  var5.field_l = sm.a(var5.field_l, param0, -126, 16);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    var5.field_c = (short)param0.b(16, (byte) -94);
                    var5.field_x = sm.a(var5.field_x, param0, param1 + 16608, 16);
                    var5.field_g = sm.a(var5.field_g, param0, -124, 16);
                    var5.field_L = sm.a(var5.field_L, param0, -113, 16);
                    var5.field_e = sm.a(var5.field_e, param0, -127, 16);
                    var5.field_k = sm.a(var5.field_k, param0, -118, 16);
                    var5.field_h = sm.a(var5.field_h, param0, param1 + 16615, 16);
                    break L1;
                  }
                }
                L2: {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    discarded$1 = param0.b(16, (byte) -127);
                    var5.field_z = sm.a(var5.field_z, param0, -121, 16);
                    var5.field_C = sm.a(var5.field_C, param0, param1 + 16619, 16);
                    var5.field_G = sm.a(var5.field_G, param0, -114, 16);
                    var5.field_y = sm.a(var5.field_y, param0, param1 + 16619, 16);
                    var5.field_R = sm.a(var5.field_R, param0, param1 + 16623, 16);
                    break L2;
                  }
                }
                L3: {
                  if (!kh.a(param0, false)) {
                    break L3;
                  } else {
                    var5.field_K = sm.a(var5.field_K, param0, -112, 16);
                    break L3;
                  }
                }
                L4: {
                  if (!kh.a(param0, false)) {
                    break L4;
                  } else {
                    var5.field_a = ua.a(16, 0, var5.field_a, param0);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var7 >= var5.field_a.length) {
                            break L7;
                          } else {
                            var10 = 255 & var5.field_a[var7];
                            var9 = var6;
                            if (var8 != 0) {
                              if (var9 == var10) {
                                var5.field_a = null;
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              L8: {
                                if (var9 < var10) {
                                  var6 = 255 & var5.field_a[var7];
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (var6 == 0) {
                          var5.field_a = null;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                      var5.field_E = (byte)(var6 + 1);
                      if (var8 == 0) {
                        break L4;
                      } else {
                        var5.field_a = null;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_28_0 = (gk) (var5);
                stackIn_29_0 = stackOut_28_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new IllegalStateException("" + var2_int);
              }
            } else {
              stackOut_2_0 = (gk) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var2);
            stackOut_30_1 = new StringBuilder().append("fh.G(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_29_0;
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
            stackOut_2_0 = (RuntimeException) (var7);
            stackOut_2_1 = new StringBuilder().append("fh.imageUpdate(");
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
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        boolean discarded$0 = false;
        if (param0 >= -47) {
            return;
        }
        try {
            this.b((byte) 55);
            discarded$0 = param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        try {
            this.field_c = new int[param1 * param2 - -1];
            this.field_b = param1;
            this.field_h = param2;
            if (param3 > -97) {
                this.field_m = (java.awt.image.ColorModel) null;
            }
            this.field_m = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_f = param0.createImage((java.awt.image.ImageProducer) (this));
            this.b((byte) 117);
            discarded$0 = param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.b((byte) 75);
            discarded$1 = param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.b((byte) 45);
            discarded$2 = param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 > -27) {
            return;
        }
        field_j = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    fh() {
    }

    static {
        field_k = 0;
        field_j = "Connection restored.";
        field_n = new mf[3];
    }
}
