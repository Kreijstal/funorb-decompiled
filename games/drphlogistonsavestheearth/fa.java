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

    private final synchronized void c(int param0) {
        if (null != this.field_p) {
          this.field_p.setPixels(0, param0, this.field_f, this.field_g, this.field_i, this.field_e, 0, this.field_f);
          this.field_p.imageComplete(2);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, java.awt.Component param3) {
        try {
          if (param2 > -22) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.isConsumer((java.awt.image.ImageConsumer) null);
          }
          this.field_f = param0;
          this.field_e = new int[1 + param0 * param1];
          this.field_g = param1;
          this.field_i = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_h = param3.createImage((java.awt.image.ImageProducer) (this));
          this.c(0);
          param3.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
          this.c(0);
          param3.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
          this.c(0);
          param3.prepareImage(this.field_h, (java.awt.image.ImageObserver) (this));
          this.a(119);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          field_k = (he[]) null;
        }
        stackIn_6_0 = (null != hg.field_S) && (hg.field_S.k(param0 + 110) != null);
        return stackIn_6_0;
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_p == param0) {
            this.field_p = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fa.removeConsumer(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fa.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return this.field_p == param0;
    }

    public static void e(int param0) {
        field_m = null;
        field_n = null;
        field_l = null;
        field_k = null;
        field_o = null;
        if (param0 >= -49) {
          return;
        }
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return rh.field_i;
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_p = param0;
          param0.setDimensions(this.field_f, this.field_g);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_i);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fa.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean imageUpdate(java.awt.Image param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("fa.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        hi.field_g = param2;
        s.field_g = param1;
        if (param0) {
          fa.a(false);
        }
        ha.field_a = param4;
        ni.field_p = param3;
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final void a(java.awt.Graphics param0, int param1, int param2, int param3) {
        try {
          this.c(0);
          param0.drawImage(this.field_h, param1, param2, (java.awt.image.ImageObserver) (this));
          if (param3 != 255) {
            java.awt.image.ImageConsumer var6 = (java.awt.image.ImageConsumer) null;
            this.isConsumer((java.awt.image.ImageConsumer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "fa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param3 >= 0 &&
            param0 < uc.field_h) {
            if (param6 < 0 &&
              param2 < 0 &&
              param7 < 0) {
              return;
            }
            if (param6 >= uc.field_f &&
              uc.field_f <= param2 &&
              param7 >= uc.field_f) {
              return;
            }
            var14 = -param0 + param3;
            if (param5 != param0) {
              var10 = param6 << 16;
              var9_int = param6 << 16;
              var15 = param5 - param0;
              var11 = (-param6 + param2 << 16) / var15;
              var12 = (-param6 + param7 << 16) / var14;
              if (var12 <= var11) {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param5 < 0) {
                  param0 = param5 - param0;
                  var9_int = var9_int + param0 * var11;
                  var10 = var10 + var12 * param0;
                  param0 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var9_int = var9_int + var11 * param0;
                  var10 = var10 + var12 * param0;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = uc.field_g[param0];
                while (param0 < param5) {
                  var17 = var9_int >> 16;
                  if (uc.field_f > var17) {
                    var18 = -(var9_int >> 16) + (var10 >> 16);
                    if (0 == var18) {
                      if (0 <= var17 &&
                        uc.field_f > var17) {
                        qa.a(var17 + var16Lifetime2, param8, param4, var18, -2141888031);
                      }
                    } else {
                      if (var18 + var17 >= uc.field_f) {
                        var18 = -1 + (-var17 + uc.field_f);
                      }
                      if (var17 < 0) {
                        qa.a(var16Lifetime2, param8, param4, var17 + var18, param1 ^ 2141888101);
                      } else {
                        qa.a(var17 + var16Lifetime2, param8, param4, var18, -2141888031);
                      }
                    }
                  }
                  param0++;
                  if (param0 >= uc.field_h) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + wj.field_k;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param5 + param3;
              if (0 != var16Lifetime3) {
                var17Lifetime2 = param7 << 16;
                if (var13 == 0) {
                  var9_int = param2 << 16;
                } else {
                  var10 = param2 << 16;
                }
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              } else {
                var11 = 0;
                var12 = 0;
              }
            } else {
              if (param3 != param0) {
                var15 = -param5 + param3;
                if (param2 <= param6) {
                  var12 = (-param6 + param7 << 16) / var14;
                  var9_int = param2 << 16;
                  var10 = param6 << 16;
                  var11 = (-param2 + param7 << 16) / var15;
                } else {
                  var11 = (param7 - param6 << 16) / var14;
                  var10 = param2 << 16;
                  var9_int = param6 << 16;
                  var12 = (-param2 + param7 << 16) / var15;
                }
              } else {
                var10 = param2 << 16;
                var9_int = param6 << 16;
                var12 = 0;
                var11 = 0;
              }
              if (param0 < 0) {
                param0 = Math.min(-param0, -param0 + param5);
                var10 = var10 + param0 * var12;
                var9_int = var9_int + param0 * var11;
                param0 = 0;
              }
              var13 = 0;
            }
            if (0 > param0) {
              param0 = -param0;
              var9_int = var9_int + param0 * var11;
              var10 = var10 + var12 * param0;
              param0 = 0;
            }
            if (param1 != -124) {
              field_k = (he[]) null;
            }
            var15Lifetime1 = uc.field_g[param0];
            while (param3 > param0) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < uc.field_f) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    uc.field_f > var16Lifetime1) {
                    qa.a(var15Lifetime1 + var16Lifetime1, param8, param4, var17Lifetime1, -2141888031);
                  }
                } else {
                  if (uc.field_f <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 - var16Lifetime1 + uc.field_f;
                  }
                  if (var16Lifetime1 < 0) {
                    qa.a(var15Lifetime1, param8, param4, var16Lifetime1 + var17Lifetime1, param1 ^ 2141888101);
                  } else {
                    qa.a(var15Lifetime1 + var16Lifetime1, param8, param4, var17Lifetime1, -2141888031);
                  }
                }
              }
              param0++;
              if (param0 >= uc.field_h) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + wj.field_k;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_77_0 = var9;
          stackIn_77_1 = new StringBuilder().append("fa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    fa() {
    }

    static {
        field_j = new int[8192];
        field_l = new int[]{0, 16744448, 98559, 16711680, 16776960, 65280, 16777215, 16711680, 16711680, 16711680, 16744448, 0, 16777215, 16744448};
    }
}
