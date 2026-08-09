/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg extends tk implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ImageConsumer field_l;
    static int field_h;
    static ge field_i;
    private java.awt.image.ColorModel field_j;
    static String field_k;
    static String field_m;

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
        try {
            this.a(true);
            if (param3 != 19291) {
                java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
                this.requestTopDownLeftRightResend((java.awt.image.ImageConsumer) null);
            }
            param2.drawImage(this.field_c, param0, param1, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, fb param1) {
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fb var6 = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                L2: {
                  if (param0 >= 34) {
                    break L2;
                  } else {
                    var6 = (fb) null;
                    mg.a((byte) 71, (fb) null);
                    break L2;
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= wi.field_b) {
                    dupTemp$0 = param1.b(-126);
                    kk.field_b[dupTemp$0] = kk.field_b[dupTemp$0] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= wi.field_b) {
                        wi.field_b = var2_int;
                        fieldTemp$1 = wi.field_b;
                        wi.field_b = wi.field_b + 1;
                        lf.field_bb[fieldTemp$1] = param1;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (param1.field_q != lf.field_bb[var3].field_q) {
                              break L6;
                            } else {
                              var4 = lf.field_bb[var3].b(-126);
                              if (vh.field_q < kk.field_b[var4]) {
                                kk.field_b[var4] = kk.field_b[var4] - 1;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          incrementValue$2 = var2_int;
                          var2_int++;
                          lf.field_bb[incrementValue$2] = lf.field_bb[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param1.field_q != lf.field_bb[var2_int].field_q) {
                        break L7;
                      } else {
                        dupTemp$3 = lf.field_bb[var2_int].b(-128);
                        kk.field_b[dupTemp$3] = kk.field_b[dupTemp$3] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                kk.field_b[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("mg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_l) {
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("mg.removeConsumer(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    private final synchronized void a(boolean param0) {
        if (!(null != this.field_l)) {
            return;
        }
        this.field_l.setPixels(0, 0, this.field_d, this.field_b, this.field_j, this.field_g, 0, this.field_d);
        if (!param0) {
            return;
        }
        this.field_l.imageComplete(2);
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_l;
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

            stackIn_4_1 = new StringBuilder().append("mg.imageUpdate(");

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
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final static void a(boolean param0, oj param1, int param2) {
        ia var3 = null;
        try {
            if (!param0) {
                field_k = (String) null;
            }
            var3 = d.field_b;
            var3.d((byte) 25, param2);
            var3.a(param1.field_i, -50);
            var3.a(param1.field_h, -123);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mg.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mg.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 <= -64) {
              stackIn_4_0 = rj.a(0, param0, (byte) 93, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("mg.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    mg() {
    }

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ti.field_b.a((byte) -117, true, ob.field_h, cl.field_j);
            ti.field_b.h(-10597);
            L1: while (true) {
              if (!ad.e((byte) 107)) {
                if (md.field_a != -1) {
                  var1_int = md.field_a;
                  fd.a(-1, param0 + 78);
                  stackIn_6_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!s.field_c) {
                    L2: {
                      if (param0 == -78) {
                        break L2;
                      } else {
                        field_i = (ge) null;
                        break L2;
                      }
                    }
                    if (ie.field_x != jl.field_a) {
                      if (!qa.field_a.b(false)) {
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (uh.field_k == jl.field_a) {
                          stackIn_22_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          return -1;
                        }
                      }
                    } else {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_9_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                ti.field_b.a(lb.field_B, -119, StarCannon.field_E);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "mg.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        this.field_b = param3;
        this.field_g = new int[param1 * param3 - -1];
        this.field_d = param1;
        this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
        this.field_c = param2.createImage((java.awt.image.ImageProducer) (this));
        this.a(true);
        param2.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        this.a(true);
        param2.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        this.a(true);
        param2.prepareImage(this.field_c, (java.awt.image.ImageObserver) (this));
        if (param0 != -9623) {
            return;
        }
        try {
            this.b(-122);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        field_m = null;
        if (param0 != 0) {
            field_k = (String) null;
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_l = param0;
            param0.setDimensions(this.field_d, this.field_b);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "mg.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "LANCE LASER - Switches the Nova Ray to use the tight beam of the lance laser.";
        field_i = new ge();
        field_m = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
