/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sf extends mm implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static String field_o;
    static String field_j;
    static String field_k;
    static int field_m;
    static sa field_n;
    private java.awt.image.ImageConsumer field_i;
    private java.awt.image.ColorModel field_l;

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_i == param0;
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

            stackIn_4_1 = new StringBuilder().append("sf.imageUpdate(");

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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final synchronized void b(int param0) {
        if (!(this.field_i != null)) {
            return;
        }
        this.field_i.setPixels(param0, 0, this.field_f, this.field_c, this.field_l, this.field_h, 0, this.field_f);
        this.field_i.imageComplete(2);
    }

    final static hj[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 14) {
            return (hj[]) null;
        }
        return wa.a(1, 1, param1, param2, param0);
    }

    final static long d(int param0) {
        if (param0 <= 67) {
            return 77L;
        }
        return -cm.field_b + bb.b(-1);
    }

    final void a(int param0, int param1, java.awt.Graphics param2, int param3) {
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
              this.b(0);
              param2.drawImage(this.field_b, param1, param0, (java.awt.image.ImageObserver) (this));
              if (param3 == 34) {
                break L1;
              } else {
                field_o = (String) null;
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

            stackIn_5_1 = new StringBuilder().append("sf.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
            this.field_i = param0;
            param0.setDimensions(this.field_f, this.field_c);
            param0.setProperties((Hashtable) null);
            param0.setColorModel(this.field_l);
            param0.setHints(14);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "sf.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_j = null;
        if (param0 != -1) {
            sf.c(-126);
        }
        field_o = null;
        field_k = null;
        field_n = null;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
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
              if (this.field_i != param0) {
                break L1;
              } else {
                this.field_i = null;
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

            stackIn_5_1 = new StringBuilder().append("sf.removeConsumer(");

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
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static hj a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        hj var6;
        int var7;
        int var8;
        int var9;
        int var11;
        float var10;
        var11 = HoldTheLine.field_D;
        var3 = 1 + param0 * 2;
        var4 = param0 * 2 + 1;
        var5 = 29 % ((-27 - param1) / 49);
        var6 = new hj(var3, var4);
        var7 = -param0;
        L0: while (true) {
          if (var7 > param0) {
            return var6;
          } else {
            var8 = -param0;
            L1: while (true) {
              if (var8 > param0) {
                var7++;
                continue L0;
              } else {
                var9 = param0 * param0 - (var7 * var7 - -(var8 * var8));
                if (-1 > (var9 ^ -1)) {
                  var10 = (float)Math.sqrt((double)var9) / (float)param0;
                  var6.field_z[var3 * (var8 + param0) + (param0 + var7)] = lk.a(var10, -1, param2);
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            this.field_c = param1;
            this.field_f = param0;
            this.field_h = new int[1 + param0 * param1];
            this.field_l = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
            this.field_b = param2.createImage((java.awt.image.ImageProducer) (this));
            this.b(0);
            param2.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(0);
            param2.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.b(param3);
            param2.prepareImage(this.field_b, (java.awt.image.ImageObserver) (this));
            this.a(false);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "sf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
            this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "sf.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        ui var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              pk.field_G.d();
              if (param0 == -1379) {
                break L1;
              } else {
                sf.c(-82);
                break L1;
              }
            }
            L2: {
              jd.field_G.d();
              gg.field_G = gg.field_G - 1;
              if (0 == gg.field_G) {
                gg.field_G = 200;
                var1 = (ui) ((Object) ol.field_b.b((byte) 118));
                L3: while (true) {
                  if (var1 == null) {
                    if (null != ob.field_b) {
                      var1 = (ui) ((Object) ob.field_b.b((byte) 120));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (var1.field_k.b(88)) {
                              break L5;
                            } else {
                              var1.d(0);
                              break L5;
                            }
                          }
                          var1 = (ui) ((Object) ob.field_b.c((byte) -51));
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (!var1.field_k.b(116)) {
                        var1.d(0);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1 = (ui) ((Object) ol.field_b.c((byte) 93));
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (i.field_m == null) {
                break L7;
              } else {
                stackIn_20_0 = i.field_m.c((byte) 85);
                if (!stackIn_20_0) {
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "sf.J(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = 106 / ((12 - param2) / 42);
        int var3 = param0 >>> -2046096321;
        return -var3 + (var3 + param0) / param1;
    }

    sf() {
    }

    static {
        field_j = "Continue";
        field_o = "Age:";
        field_k = "Your vehicle can only hold <col=1>three</col> powerups at any one time. Collecting a fourth will replace the <col=1>oldest</col> powerup. Power-ups can also be lost in collisions or by being hit by weapons.<br><br>Each colour of powerup has a different effect, and the strength of the effect depends on how many powerups of that colour you currently have.";
        field_n = new sa();
    }
}
