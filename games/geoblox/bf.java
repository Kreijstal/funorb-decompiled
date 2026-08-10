/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf extends sc implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    private java.awt.image.ColorModel field_j;
    static lh field_g;
    private java.awt.image.ImageConsumer field_h;
    static rh field_i;

    final static h a(byte param0, String param1) {
        RuntimeException var2 = null;
        h stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 86) {
                break L1;
              } else {
                field_i = (rh) null;
                break L1;
              }
            }
            stackIn_3_0 = new h(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("bf.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final synchronized void a(boolean param0) {
        if (null != this.field_h) {
          this.field_h.setPixels(0, 0, this.field_a, this.field_c, this.field_j, this.field_d, 0, this.field_a);
          if (!param0) {
            field_i = (rh) null;
            this.field_h.imageComplete(2);
            return;
          } else {
            this.field_h.imageComplete(2);
            return;
          }
        } else {
          return;
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(int param0, java.awt.Graphics param1, int param2, int param3) {
        try {
            if (param3 != 0) {
                java.awt.Image var6 = (java.awt.Image) null;
                this.imageUpdate((java.awt.Image) null, 94, -33, 114, 59, 88);
            }
            this.a(true);
            param1.drawImage(this.field_e, param2, param0, (java.awt.image.ImageObserver) (this));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_h == param0;
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bf.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_h = param0;
            param0.setDimensions(this.field_a, this.field_c);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_j);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bf.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
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

            stackIn_4_1 = new StringBuilder().append("bf.imageUpdate(");

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
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    final void a(int param0, java.awt.Component param1, int param2, byte param3) {
        try {
            this.field_c = param0;
            this.field_a = param2;
            this.field_d = new int[param0 * param2 - -1];
            this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_e = param1.createImage((java.awt.image.ImageProducer) (this));
            this.a(true);
            param1.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
            this.a(true);
            param1.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
            this.a(true);
            param1.prepareImage(this.field_e, (java.awt.image.ImageObserver) (this));
            this.a(255);
            if (param3 <= 116) {
                this.field_j = (java.awt.image.ColorModel) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var5_int = param1 + param4;
              var6 = param0 - -param3;
              if (param4 <= vb.field_e) {
                stackIn_4_0 = vb.field_e;
                break L1;
              } else {
                stackIn_4_0 = param4;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param0 > vb.field_i) {
                stackIn_7_0 = param0;
                break L2;
              } else {
                stackIn_7_0 = vb.field_i;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (vb.field_k > var5_int) {
                stackIn_10_0 = var5_int;
                break L3;
              } else {
                stackIn_10_0 = vb.field_k;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (vb.field_d <= var6) {
                stackIn_13_0 = vb.field_d;
                break L4;
              } else {
                stackIn_13_0 = var6;
                break L4;
              }
            }
            var10 = stackIn_13_0;
            if (param2 == 14164) {
              L5: {
                if (param4 < vb.field_e) {
                  break L5;
                } else {
                  if (param4 < vb.field_k) {
                    var11 = param4 + var8 * vb.field_f;
                    var12 = var10 + 1 + -var8 >> 158912129;
                    L6: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L5;
                      } else {
                        vb.field_c[var11] = 16777215;
                        var11 = var11 + vb.field_f * 2;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (param0 < vb.field_i) {
                  break L7;
                } else {
                  if (vb.field_d > var6) {
                    var11 = var7 + vb.field_f * param0;
                    var12 = -var7 + 1 + var9 >> -2109860607;
                    L8: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L7;
                      } else {
                        vb.field_c[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (var5_int < vb.field_e) {
                  break L9;
                } else {
                  if (vb.field_k <= var5_int) {
                    break L9;
                  } else {
                    var11 = var5_int + ((1 & -param4 + var5_int) + var8) * vb.field_f;
                    var12 = -var8 + 1 + var10 >> -161751903;
                    L10: while (true) {
                      var12--;
                      if (0 > var12) {
                        break L9;
                      } else {
                        vb.field_c[var11] = 16777215;
                        var11 = var11 + 2 * vb.field_f;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (vb.field_i > param0) {
                  break L11;
                } else {
                  if (vb.field_d <= var6) {
                    break L11;
                  } else {
                    var11 = vb.field_f * var6 + (var7 - -(1 & -param0 + var6));
                    var12 = 1 - (-var9 + var7) >> 880243777;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        vb.field_c[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "bf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
            if (param0 == this.field_h) {
                this.field_h = null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "bf.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    bf() {
    }

    public static void c(byte param0) {
        field_i = null;
        field_g = null;
        if (param0 >= -101) {
            field_g = (lh) null;
        }
    }

    static {
        field_g = new lh();
    }
}
