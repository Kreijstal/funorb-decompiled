/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh extends og implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_l;
    static String field_m;
    private java.awt.image.ImageConsumer field_f;
    static String field_k;
    static String[] field_j;
    static int[] field_i;
    static String field_g;
    private java.awt.image.ColorModel field_h;

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$0 = false;
        try {
            if (param1 != 10) {
                this.b((byte) 4);
            }
            this.b((byte) -104);
            discarded$0 = param3.drawImage(this.field_d, param2, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Component param3) {
        this.field_e = param2;
        this.field_a = param1;
        this.field_b = new int[param1 * param2 - -1];
        this.field_h = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.field_d = param3.createImage((java.awt.image.ImageProducer) (this));
        this.b((byte) 119);
        boolean discarded$0 = param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        this.b((byte) -127);
        boolean discarded$1 = param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        this.b((byte) 116);
        boolean discarded$9 = param3.prepareImage(this.field_d, (java.awt.image.ImageObserver) (this));
        if (param0 != 30) {
            return;
        }
        try {
            this.b(32);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_f = param0;
            param0.setDimensions(this.field_a, this.field_e);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_h);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dh.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static sj a(byte param0, int param1) {
        iw var3 = null;
        if (param0 > -124) {
          var3 = (iw) null;
          dh.a(81, 114, (iw) null, 122, 17);
          return uj.a(param1, (byte) -58, 1, false, false, true);
        } else {
          return uj.a(param1, (byte) -58, 1, false, false, true);
        }
    }

    private final synchronized void b(byte param0) {
        int var2 = 0;
        var2 = -79 % ((62 - param0) / 32);
        if (null == this.field_f) {
          return;
        } else {
          this.field_f.setPixels(0, 0, this.field_a, this.field_e, this.field_h, this.field_b, 0, this.field_a);
          this.field_f.imageComplete(2);
          return;
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_f == param0;
    }

    final static int a(up param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
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
            L1: {
              if (param1) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            L2: {
              var2_int = gp.a(param0, -576054046) / 10;
              if (-1 <= (gp.a(param0, -576054046) ^ -1)) {
                break L2;
              } else {
                if (var2_int != 0) {
                  break L2;
                } else {
                  var2_int = 1;
                  break L2;
                }
              }
            }
            stackOut_5_0 = var2_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("dh.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
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
            stackOut_2_1 = new StringBuilder().append("dh.imageUpdate(");
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
          throw nb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public static void a(byte param0) {
        field_l = null;
        field_m = null;
        field_i = null;
        field_g = null;
        field_k = null;
        field_j = null;
        if (param0 != -29) {
            dh.b(true);
        }
    }

    final static void a(int param0, int param1, iw param2, int param3, int param4) {
        try {
            param2.a(param3 ^ -3315, 12);
            param2.g(param3 ^ 1207447422, 17);
            param2.g(-1207444472, param1);
            if (param3 != -3210) {
                iw var6 = (iw) null;
                dh.a(106, -79, (iw) null, 72, 113);
            }
            param2.g(param3 + -1207441262, param4);
            param2.a(param3 ^ -3298, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dh.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "dh.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    dh() {
    }

    final static void c(byte param0) {
        if (param0 != -77) {
            iw var2 = (iw) null;
            dh.a(105, -41, (iw) null, 7, -41);
            tf.field_f = false;
            return;
        }
        tf.field_f = false;
    }

    final static void b(boolean param0) {
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        int fieldTemp$24 = 0;
        int discarded$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        int var1 = 0;
        int var2 = 0;
        up var3 = null;
        if (param0) {
          if (iu.field_h) {
            if (null != um.field_e) {
              if (ra.field_G == null) {
                if (-1 != (cq.field_h.field_c ^ -1)) {
                  ht.a(true, (byte) 89);
                  return;
                } else {
                  L0: {
                    ia.field_c = false;
                    var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                    var2 = aq.a(true) + -qt.field_r[ew.field_a];
                    if (var2 * var2 + var1 * var1 < 10000) {
                      fieldTemp$21 = ew.field_a + 1;
                      ew.field_a = ew.field_a + 1;
                      ew.field_a = fieldTemp$21 % nv.field_E.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
                  ht.a(false, (byte) 89);
                  return;
                }
              } else {
                if (ra.field_G.field_c == 0) {
                  L1: {
                    ia.field_c = false;
                    var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                    var2 = aq.a(true) + -qt.field_r[ew.field_a];
                    if (var2 * var2 + var1 * var1 < 10000) {
                      fieldTemp$22 = ew.field_a + 1;
                      ew.field_a = ew.field_a + 1;
                      ew.field_a = fieldTemp$22 % nv.field_E.length;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
                  ht.a(false, (byte) 89);
                  return;
                } else {
                  L2: {
                    if (-1 == (cq.field_h.field_c ^ -1)) {
                      L3: {
                        ia.field_c = false;
                        var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                        var2 = aq.a(true) + -qt.field_r[ew.field_a];
                        if (var2 * var2 + var1 * var1 < 10000) {
                          fieldTemp$23 = ew.field_a + 1;
                          ew.field_a = ew.field_a + 1;
                          ew.field_a = fieldTemp$23 % nv.field_E.length;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
                      ht.a(false, (byte) 89);
                      break L2;
                    } else {
                      ht.a(true, (byte) 89);
                      break L2;
                    }
                  }
                  return;
                }
              }
            } else {
              L4: {
                ia.field_c = false;
                var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                var2 = aq.a(true) + -qt.field_r[ew.field_a];
                if (var2 * var2 + var1 * var1 < 10000) {
                  fieldTemp$24 = ew.field_a + 1;
                  ew.field_a = ew.field_a + 1;
                  ew.field_a = fieldTemp$24 % nv.field_E.length;
                  break L4;
                } else {
                  break L4;
                }
              }
              mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
              ht.a(false, (byte) 89);
              return;
            }
          } else {
            ht.a(true, (byte) 89);
            return;
          }
        } else {
          var3 = (up) null;
          discarded$25 = dh.a((up) null, false);
          if (iu.field_h) {
            if (null != um.field_e) {
              if (ra.field_G != null) {
                if (ra.field_G.field_c != 0) {
                  if (-1 == (cq.field_h.field_c ^ -1)) {
                    L5: {
                      ia.field_c = false;
                      var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                      var2 = aq.a(true) + -qt.field_r[ew.field_a];
                      if (var2 * var2 + var1 * var1 < 10000) {
                        fieldTemp$26 = ew.field_a + 1;
                        ew.field_a = ew.field_a + 1;
                        ew.field_a = fieldTemp$26 % nv.field_E.length;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
                    ht.a(false, (byte) 89);
                    return;
                  } else {
                    ht.a(true, (byte) 89);
                    return;
                  }
                } else {
                  L6: {
                    ia.field_c = false;
                    var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                    var2 = aq.a(true) + -qt.field_r[ew.field_a];
                    if (var2 * var2 + var1 * var1 < 10000) {
                      fieldTemp$27 = ew.field_a + 1;
                      ew.field_a = ew.field_a + 1;
                      ew.field_a = fieldTemp$27 % nv.field_E.length;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
                  ht.a(false, (byte) 89);
                  return;
                }
              } else {
                L7: {
                  if (-1 == (cq.field_h.field_c ^ -1)) {
                    L8: {
                      ia.field_c = false;
                      var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                      var2 = aq.a(true) + -qt.field_r[ew.field_a];
                      if (var2 * var2 + var1 * var1 < 10000) {
                        fieldTemp$28 = ew.field_a + 1;
                        ew.field_a = ew.field_a + 1;
                        ew.field_a = fieldTemp$28 % nv.field_E.length;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
                    ht.a(false, (byte) 89);
                    break L7;
                  } else {
                    ht.a(true, (byte) 89);
                    break L7;
                  }
                }
                return;
              }
            } else {
              L9: {
                ia.field_c = false;
                var1 = tq.h(-2521) - nv.field_E[ew.field_a];
                var2 = aq.a(true) + -qt.field_r[ew.field_a];
                if (var2 * var2 + var1 * var1 < 10000) {
                  fieldTemp$29 = ew.field_a + 1;
                  ew.field_a = ew.field_a + 1;
                  ew.field_a = fieldTemp$29 % nv.field_E.length;
                  break L9;
                } else {
                  break L9;
                }
              }
              mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
              ht.a(false, (byte) 89);
              return;
            }
          } else {
            ht.a(true, (byte) 89);
            return;
          }
        }
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
            if (param0 == this.field_f) {
              this.field_f = null;
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
            stackOut_4_1 = new StringBuilder().append("dh.removeConsumer(");
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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_j = new String[]{"primary colour", "secondary colour"};
        field_i = new int[12];
        field_g = "Logging in...";
        field_l = "Orb points: ";
        field_k = "Solicitation";
        field_m = "Private";
    }
}
