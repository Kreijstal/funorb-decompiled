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
        if (null != this.field_k) {
          if (!param0) {
            field_n = true;
            this.field_k.setPixels(0, 0, this.field_a, this.field_d, this.field_o, this.field_h, 0, this.field_a);
            this.field_k.imageComplete(2);
            return;
          } else {
            this.field_k.setPixels(0, 0, this.field_a, this.field_d, this.field_o, this.field_h, 0, this.field_a);
            this.field_k.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    final static void c(int param0) {
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
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_28_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 1811357826) {
              L1: {
                L2: {
                  var9 = te.field_N;
                  var2 = var9.j(255);
                  var3 = var9.j(255);
                  if (var2 != 0) {
                    break L2;
                  } else {
                    var4_ref_fj = (fj) ((Object) ti.field_b.a((byte) 51));
                    if (var4_ref_fj != null) {
                      L3: {
                        var5_int = te.field_O + -var9.field_m;
                        var11 = var4_ref_fj.field_h;
                        var10 = var11;
                        var6 = var10;
                        if (var5_int > var11.length << 1811357826) {
                          var5_int = var11.length << 829563906;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = 0;
                      L4: while (true) {
                        L5: {
                          if (var7 >= var5_int) {
                            var4_ref_fj.c(10);
                            break L5;
                          } else {
                            var6[var7 >> -1803587230] = var6[var7 >> -1803587230] + (var9.j(255) << fi.a(var7 << 210065288, 768));
                            var7++;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              continue L4;
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      je.a(false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                L6: {
                  if (var2 != 1) {
                    break L6;
                  } else {
                    var4 = var9.d(-116);
                    var5 = (lc) ((Object) hc.field_a.a((byte) 51));
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var5 == null) {
                            break L9;
                          } else {
                            stackOut_20_0 = var5.field_n ^ -1;
                            stackIn_29_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var8 != 0) {
                              break L8;
                            } else {
                              L10: {
                                if (stackIn_21_0 != (var3 ^ -1)) {
                                  break L10;
                                } else {
                                  if (var4 != var5.field_o) {
                                    break L10;
                                  } else {
                                    if (var8 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var5 = (lc) ((Object) hc.field_a.b(-66));
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (var5 == null) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          break L8;
                        } else {
                          var5.c(10);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L6;
                          }
                        }
                      }
                      je.a(stackIn_29_0 != 0);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
                hi.a((Throwable) null, "LR1: " + oc.a(false), 1);
                je.a(false);
                break L1;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "oa.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_k = param0;
            param0.setDimensions(this.field_a, this.field_d);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_o);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "oa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static fc a(int param0, int param1, da param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        fc stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        fc stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        fc stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == -1803587230) {
              var4 = param2.a(param1, (byte) -104);
              var3 = var4;
              if (var4 != null) {
                stackOut_6_0 = new fc(var4);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (fc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("oa.E(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fc) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "oa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
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
              if (this.field_k != param0) {
                break L1;
              } else {
                this.field_k = null;
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
            stackOut_3_1 = new StringBuilder().append("oa.removeConsumer(");
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
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            stackOut_2_1 = new StringBuilder().append("oa.imageUpdate(");
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
          throw fc.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    public static void b(int param0) {
        fc discarded$2 = null;
        da var2 = null;
        if (param0 != 768) {
          var2 = (da) null;
          discarded$2 = oa.a(-87, 28, (da) null);
          field_i = null;
          field_j = null;
          field_l = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_l = null;
          return;
        }
    }

    oa() {
    }

    final void a(java.awt.Component param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        try {
            this.field_d = param2;
            this.field_a = param3;
            this.field_h = new int[param2 * param3 - -1];
            this.field_o = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_g = param0.createImage((java.awt.image.ImageProducer) (this));
            this.b(true);
            if (param1 != 9387) {
                field_n = false;
            }
            discarded$0 = param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
            this.b(true);
            discarded$1 = param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
            this.b(true);
            discarded$2 = param0.prepareImage(this.field_g, (java.awt.image.ImageObserver) (this));
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "oa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, java.awt.Graphics param3) {
        boolean discarded$0 = false;
        if (param1 != 0) {
            return;
        }
        try {
            this.b(true);
            discarded$0 = param3.drawImage(this.field_g, param0, param2, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "oa.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_k;
    }

    static {
        field_i = "Type your age in years";
        field_j = new wh();
        field_n = false;
    }
}
