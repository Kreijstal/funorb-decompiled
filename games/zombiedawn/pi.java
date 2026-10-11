/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pi extends dh implements java.awt.image.ImageProducer, java.awt.image.ImageObserver {
    static long field_i;
    static bm field_l;
    private java.awt.image.ColorModel field_j;
    private java.awt.image.ImageConsumer field_h;
    static int[] field_k;

    final void a(java.awt.Graphics param0, int param1, int param2, byte param3) {
        try {
          this.a((byte) 105);
          param0.drawImage(this.field_f, param2, param1, (java.awt.image.ImageObserver) (this));
          if (param3 != 58) {
            pi.a(82, 39, (int[]) null, -71, (byte) 97, 95, -74, -52, -27, -83, -68, 66, 42, -121, 2, -104, -2);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pi.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
          stackIn_4_1 = new StringBuilder().append("pi.imageUpdate(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final synchronized void removeConsumer(java.awt.image.ImageConsumer param0) {
        try {
          if (this.field_h == param0) {
            this.field_h = null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pi.removeConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void requestTopDownLeftRightResend(java.awt.image.ImageConsumer param0) {
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = ZombieDawn.field_J;
        try {
          if (0 <= param11 &&
            en.field_d > param15) {
            if (0 > param9 &&
              param1 < 0 &&
              param10 < 0) {
              return;
            }
            if (param4 != -104) {
              field_l = (bm) null;
            }
            if (param9 >= en.field_g &&
              en.field_g <= param1 &&
              en.field_g <= param10) {
              return;
            }
            var34 = param11 - param15;
            if (param15 != param16) {
              var30 = param8 << 16;
              var29 = param8 << 16;
              var26 = param12 << 16;
              var25 = param12 << 16;
              var22 = param3 << 16;
              var21 = param3 << 16;
              var18 = param9 << 16;
              var17_int = param9 << 16;
              var35 = -param15 + param16;
              var19 = (-param9 + param1 << 16) / var35;
              var20 = (-param9 + param10 << 16) / var34;
              if (var20 <= var19) {
                var32 = (-param8 + param13 << 16) / var35;
                var27 = (-param12 + param5 << 16) / var34;
                var24 = (param14 - param3 << 16) / var35;
                var31 = (-param8 + param7 << 16) / var34;
                var28 = (-param12 + param6 << 16) / var35;
                var23 = (param0 - param3 << 16) / var34;
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var33 = 1;
              } else {
                var23 = (-param3 + param14 << 16) / var35;
                var31 = (-param8 + param13 << 16) / var35;
                var27 = (-param12 + param6 << 16) / var35;
                var28 = (-param12 + param5 << 16) / var34;
                var32 = (-param8 + param7 << 16) / var34;
                var24 = (-param3 + param0 << 16) / var34;
                var33 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (param16 < 0) {
                  param15 = param16 - param15;
                  var17_int = var17_int + param15 * var19;
                  var21 = var21 + var23 * param15;
                  var22 = var22 + param15 * var24;
                  var18 = var18 + var20 * param15;
                  var29 = var29 + param15 * var31;
                  var25 = var25 + param15 * var27;
                  var26 = var26 + var28 * param15;
                  var30 = var30 + param15 * var32;
                  param15 = param16;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var18 = var18 + var20 * param15;
                  var21 = var21 + param15 * var23;
                  var22 = var22 + var24 * param15;
                  var26 = var26 + var28 * param15;
                  var17_int = var17_int + param15 * var19;
                  var30 = var30 + param15 * var32;
                  var29 = var29 + var31 * param15;
                  var25 = var25 + param15 * var27;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = en.field_b[param15];
                while (param16 > param15) {
                  var37 = var17_int >> 16;
                  if (en.field_g > var37) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (0 == var38) {
                      if (var37 >= 0 &&
                        en.field_g > var37) {
                        fg.a(var21, 0, 0, var38, var29, 61653921, var36Lifetime2 + var37, 0, var25, param2);
                      }
                    } else {
                      var39 = (-var21 + var22) / var38;
                      var40 = (var26 - var25) / var38;
                      var41 = (var30 - var29) / var38;
                      if (var38 + var37 >= en.field_g) {
                        var38 = -1 - var37 + en.field_g;
                      }
                      if (var37 >= 0) {
                        fg.a(var21, var41, var39, var38, var29, 61653921, var36Lifetime2 + var37, var40, var25, param2);
                      } else {
                        fg.a(-(var39 * var37) + var21, var41, var39, var37 + var38, -(var41 * var37) + var29, param4 ^ -61653959, var36Lifetime2, var40, var25 - var40 * var37, param2);
                      }
                    }
                  }
                  param15++;
                  if (param15 >= en.field_d) {
                    return;
                  }
                  var18 = var18 + var20;
                  var26 = var26 + var28;
                  var30 = var30 + var32;
                  var21 = var21 + var23;
                  var22 = var22 + var24;
                  var25 = var25 + var27;
                  var29 = var29 + var31;
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + bi.field_f;
                }
              }
              var36Lifetime3 = -param16 + param11;
              if (var36Lifetime3 != 0) {
                var37Lifetime2 = param10 << 16;
                var38Lifetime2 = param0 << 16;
                var39Lifetime2 = param5 << 16;
                var40Lifetime2 = param7 << 16;
                if (var33 == 0) {
                  var21 = param14 << 16;
                  var25 = param6 << 16;
                  var29 = param13 << 16;
                  var17_int = param1 << 16;
                } else {
                  var22 = param14 << 16;
                  var18 = param1 << 16;
                  var30 = param13 << 16;
                  var26 = param6 << 16;
                }
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var32 = (var40Lifetime2 - var30) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
              } else {
                var19 = 0;
                var31 = 0;
                var23 = 0;
                var24 = 0;
                var28 = 0;
                var20 = 0;
                var32 = 0;
                var27 = 0;
              }
            } else {
              if (param15 != param11) {
                var35 = param11 - param16;
                if (param1 <= param9) {
                  var30 = param8 << 16;
                  var25 = param6 << 16;
                  var19 = (-param1 + param10 << 16) / var35;
                  var20 = (param10 - param9 << 16) / var34;
                  var31 = (-param13 + param7 << 16) / var35;
                  var27 = (-param6 + param5 << 16) / var35;
                  var17_int = param1 << 16;
                  var18 = param9 << 16;
                  var22 = param3 << 16;
                  var29 = param13 << 16;
                  var21 = param14 << 16;
                  var26 = param12 << 16;
                  var32 = (param7 - param8 << 16) / var34;
                  var24 = (-param3 + param0 << 16) / var34;
                  var28 = (param5 - param12 << 16) / var34;
                  var23 = (-param14 + param0 << 16) / var35;
                } else {
                  var25 = param12 << 16;
                  var29 = param8 << 16;
                  var17_int = param9 << 16;
                  var28 = (-param6 + param5 << 16) / var35;
                  var32 = (-param13 + param7 << 16) / var35;
                  var23 = (param0 - param3 << 16) / var34;
                  var26 = param6 << 16;
                  var21 = param3 << 16;
                  var27 = (-param12 + param5 << 16) / var34;
                  var20 = (-param1 + param10 << 16) / var35;
                  var19 = (-param9 + param10 << 16) / var34;
                  var24 = (-param14 + param0 << 16) / var35;
                  var18 = param1 << 16;
                  var22 = param14 << 16;
                  var31 = (param7 - param8 << 16) / var34;
                  var30 = param13 << 16;
                }
              } else {
                var24 = 0;
                var27 = 0;
                var31 = 0;
                var32 = 0;
                var22 = param14;
                var26 = param6;
                var17_int = param9 << 16;
                var20 = 0;
                var18 = param1 << 16;
                var30 = param13;
                var29 = param8;
                var21 = param3;
                var28 = 0;
                var19 = 0;
                var23 = 0;
                var25 = param12;
              }
              if (param15 < 0) {
                param15 = Math.min(-param15, -param15 + param16);
                var30 = var30 + var32 * param15;
                var18 = var18 + param15 * var20;
                var25 = var25 + param15 * var27;
                var22 = var22 + param15 * var24;
                var17_int = var17_int + param15 * var19;
                var26 = var26 + var28 * param15;
                var21 = var21 + param15 * var23;
                var29 = var29 + param15 * var31;
                param15 = 0;
              }
              var33 = 0;
            }
            if (param15 < 0) {
              param15 = -param15;
              var22 = var22 + param15 * var24;
              var21 = var21 + param15 * var23;
              var18 = var18 + var20 * param15;
              var29 = var29 + param15 * var31;
              var17_int = var17_int + param15 * var19;
              var26 = var26 + param15 * var28;
              var30 = var30 + param15 * var32;
              var25 = var25 + var27 * param15;
              param15 = 0;
            }
            var35Lifetime1 = en.field_b[param15];
            while (param15 < param11) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < en.field_g) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (0 != var37Lifetime1) {
                  var38Lifetime1 = (-var21 + var22) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (en.field_g <= var36Lifetime1 + var37Lifetime1) {
                    var37Lifetime1 = -var36Lifetime1 + en.field_g - 1;
                  }
                  if (0 <= var36Lifetime1) {
                    fg.a(var21, var40Lifetime1, var38Lifetime1, var37Lifetime1, var29, param4 ^ -61653959, var36Lifetime1 + var35Lifetime1, var39Lifetime1, var25, param2);
                  } else {
                    fg.a(var21 - var36Lifetime1 * var38Lifetime1, var40Lifetime1, var38Lifetime1, var37Lifetime1 + var36Lifetime1, -(var36Lifetime1 * var40Lifetime1) + var29, 61653921, var35Lifetime1, var39Lifetime1, -(var39Lifetime1 * var36Lifetime1) + var25, param2);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    en.field_g > var36Lifetime1) {
                    fg.a(var21, 0, 0, var37Lifetime1, var29, 61653921, var35Lifetime1 + var36Lifetime1, 0, var25, param2);
                  }
                }
              }
              param15++;
              if (param15 >= en.field_d) {
                return;
              }
              var29 = var29 + var31;
              var17_int = var17_int + var19;
              var30 = var30 + var32;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var35Lifetime1 = var35Lifetime1 + bi.field_f;
              var26 = var26 + var28;
              var21 = var21 + var23;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_79_0 = var17;
          stackIn_79_1 = new StringBuilder().append("pi.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    public final synchronized void addConsumer(java.awt.image.ImageConsumer param0) {
        try {
          this.field_h = param0;
          param0.setDimensions(this.field_d, this.field_a);
          param0.setProperties((Hashtable) null);
          param0.setColorModel(this.field_j);
          param0.setHints(14);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pi.addConsumer(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, nn param2) {
        am var3 = null;
        try {
          var3 = dp.field_e;
          var3.j(param0 - 14, param1);
          var3.i(param2.field_h, 120);
          if (param0 != 25) {
            field_k = (int[]) null;
          }
          var3.a(param2.field_i, (byte) 105);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pi.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(byte param0) {
        if (null != this.field_h) {
          this.field_h.setPixels(0, 0, this.field_d, this.field_a, this.field_j, this.field_c, 0, this.field_d);
          this.field_h.imageComplete(2);
          int var2 = -33 % ((param0 + 61) / 61);
          return;
        }
    }

    pi() {
    }

    public static void d(int param0) {
        field_k = null;
        field_l = null;
        if (param0 != -1) {
          nn var2 = (nn) null;
          pi.a((byte) 111, 106, (nn) null);
        }
    }

    final static void a(int param0, int param1, byte param2) {
        int[] dupTemp$1 = null;
        param0 = param0 / 24;
        param1 = param1 / 24;
        if (param2 != 101) {
          return;
        }
        if (param1 >= 0 &&
          vm.field_u[0].length > param1 &&
          param0 >= 0 &&
          vm.field_u.length > param0) {
          dupTemp$1 = vm.field_u[param0];
          dupTemp$1[param1] = dupTemp$1[param1] + 1;
          return;
        }
    }

    final static f[] a(int param0, am param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        f[] var4 = null;
        f var6_ref_f = null;
        int var6 = 0;
        int var7 = 0;
        f[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          var2_int = param1.k(127, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.k(param0 ^ 100, param0);
          var4 = new f[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!dg.a(param1, false)) {
              var6 = param1.k(40, gf.a(-1 + var5, 21));
              var4[var5] = var4[var6];
            } else {
              var6_ref_f = new f();
              param1.k(param0 ^ 82, 24);
              param1.k(108, 24);
              var6_ref_f.field_h = param1.k(91, 24);
              param1.k(54, 9);
              param1.k(116, 12);
              param1.k(118, 12);
              param1.k(param0 + 58, 12);
              var4[var5] = var6_ref_f;
            }
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("pi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          this.field_a = param0;
          this.field_d = param1;
          this.field_c = new int[1 + param1 * param0];
          this.field_j = (java.awt.image.ColorModel) ((Object) new java.awt.image.DirectColorModel(32, 16711680, 65280, 255));
          this.field_f = param2.createImage((java.awt.image.ImageProducer) (this));
          this.a((byte) 112);
          param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.a((byte) 7);
          if (param3 != -11055) {
            field_i = 5L;
          }
          param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.a((byte) -128);
          param2.prepareImage(this.field_f, (java.awt.image.ImageObserver) (this));
          this.b(-127);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pi.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void startProduction(java.awt.image.ImageConsumer param0) {
        try {
          this.addConsumer(param0);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pi.startProduction(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized boolean isConsumer(java.awt.image.ImageConsumer param0) {
        return param0 == this.field_h;
    }

    static {
        field_k = new int[]{12263987, 11184691, 4491485};
    }
}
