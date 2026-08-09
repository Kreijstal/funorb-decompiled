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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_l == param0) {
                this.field_l = null;
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
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("fh.removeConsumer(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 > -83) {
            field_n = (mf[]) null;
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
        if (this.field_l == null) {
            return;
        }
        this.field_l.setPixels(0, 0, this.field_h, this.field_b, this.field_m, this.field_c, 0, this.field_h);
        this.field_l.imageComplete(2);
        if (param0 < 31) {
            java.awt.image.ImageConsumer var3 = (java.awt.image.ImageConsumer) null;
            this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
        }
    }

    final static dk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dk stackIn_4_0 = null;
        dk stackIn_8_0 = null;
        dk stackIn_18_0 = null;
        dk stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int == 0) {
              stackIn_4_0 = qo.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int > 63) {
                stackIn_8_0 = cn.field_ib;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param1 != -1) {
                      fh.c(40);
                      stackIn_27_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (ji.field_a.indexOf(var4) == -1) {
                          stackIn_22_0 = gs.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var2_int + -1 == var3) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_18_0 = gs.field_a;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("fh.C(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L4;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_22_0;
              } else {
                return (dk) ((Object) stackIn_27_0);
              }
            }
          }
        }
    }

    final static gk a(pl param0, int param1) {
        gk stackIn_3_0 = null;
        gk stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                    param0.b(16, (byte) -127);
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
                stackIn_25_0 = (gk) (var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new IllegalStateException("" + var2_int);
              }
            } else {
              stackIn_3_0 = (gk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("fh.G(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_25_0;
        }
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

            stackIn_4_1 = new StringBuilder().append("fh.imageUpdate(");

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
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        if (param0 >= -47) {
            return;
        }
        try {
            this.b((byte) 55);
            param2.drawImage(this.field_f, param1, param3, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fh.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
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
            param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.b((byte) 75);
            param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
            this.b((byte) 45);
            param0.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
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
