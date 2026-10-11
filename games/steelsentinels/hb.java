/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hb implements Iterable {
    DualNode field_a;
    static String field_h;
    static String[] field_g;
    static int field_b;
    static pn field_i;
    static boolean field_f;
    static int field_d;
    static RgbSprite[] field_j;
    static java.security.SecureRandom field_c;
    static RgbSprite field_e;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(ub.field_e);
          param1.removeMouseMotionListener(ub.field_e);
          param1.removeFocusListener(ub.field_e);
          wn.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "hb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final DualNode a(int param0) {
        if (param0 != 12515) {
          field_b = 114;
        }
        DualNode var2 = this.field_a.dualNext;
        if (this.field_a != var2) {
          var2.unlinkDual(480);
          return var2;
        }
        return null;
    }

    final void a(byte param0, DualNode param1) {
        try {
          if (param0 <= 16) {
            field_i = (pn) null;
          }
          if (param1.dualPrevious != null) {
            param1.unlinkDual(480);
          }
          param1.dualNext = this.field_a;
          param1.dualPrevious = this.field_a.dualPrevious;
          param1.dualPrevious.dualNext = param1;
          param1.dualNext.dualPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "hb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new wh(this));
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
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
        int var20 = 0;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime2;
        var20 = SteelSentinels.obfuscationControl;
        try {
          if (param4 >= 0 &&
            param7 < lf.field_h) {
            var9_int = 54 / ((59 - param1) / 54);
            if (param2 < 0 &&
              param5 < 0 &&
              param0 < 0) {
              return;
            }
            if (param2 >= lf.field_g &&
              lf.field_g <= param5 &&
              lf.field_g <= param0) {
              return;
            }
            var15 = -param7 + param4;
            if (param6 != param7) {
              var11 = param2 << 16;
              var10 = param2 << 16;
              var16 = -param7 + param6;
              var13 = (-param2 + param0 << 16) / var15;
              var12 = (-param2 + param5 << 16) / var16;
              if (var13 > var12) {
                var14 = 0;
              } else {
                var14 = 1;
                var17 = var12;
                var12 = var13;
                var13 = var17;
              }
              if (param7 >= 0) {
                var17Lifetime2 = lf.field_c[param7];
                while (param6 > param7) {
                  var18 = var10 >> 16;
                  if (var18 < lf.field_g) {
                    var19 = (var11 >> 16) - (var10 >> 16);
                    if (var19 != 0) {
                      if (var19 + var18 >= lf.field_g) {
                        var19 = -1 + lf.field_g - var18;
                      }
                      if (0 > var18) {
                        k.a(true, param3, var18 + var19, var17Lifetime2, param8);
                      } else {
                        k.a(true, param3, var19, var18 + var17Lifetime2, param8);
                      }
                    } else {
                      if (var18 >= 0 &&
                        var18 < lf.field_g) {
                        k.a(true, param3, var19, var17Lifetime2 + var18, param8);
                      }
                    }
                  }
                  param7++;
                  if (lf.field_h <= param7) {
                    return;
                  }
                  var17Lifetime2 = var17Lifetime2 + SoftwareRaster.field_c;
                  var11 = var11 + var13;
                  var10 = var10 + var12;
                }
              } else if (0 <= param6) {
                param7 = -param7;
                var11 = var11 + param7 * var13;
                var10 = var10 + var12 * param7;
                param7 = 0;
                var17Lifetime2 = lf.field_c[param7];
                while (param6 > param7) {
                  var18 = var10 >> 16;
                  if (var18 < lf.field_g) {
                    var19 = (var11 >> 16) - (var10 >> 16);
                    if (var19 != 0) {
                      if (var19 + var18 >= lf.field_g) {
                        var19 = -1 + lf.field_g - var18;
                      }
                      if (0 > var18) {
                        k.a(true, param3, var18 + var19, var17Lifetime2, param8);
                      } else {
                        k.a(true, param3, var19, var18 + var17Lifetime2, param8);
                      }
                    } else {
                      if (var18 >= 0 &&
                        var18 < lf.field_g) {
                        k.a(true, param3, var19, var17Lifetime2 + var18, param8);
                      }
                    }
                  }
                  param7++;
                  if (lf.field_h <= param7) {
                    return;
                  }
                  var17Lifetime2 = var17Lifetime2 + SoftwareRaster.field_c;
                  var11 = var11 + var13;
                  var10 = var10 + var12;
                }
              } else {
                param7 = -param7 + param6;
                var11 = var11 + var13 * param7;
                var10 = var10 + param7 * var12;
                param7 = param6;
              }
              var17Lifetime3 = param4 - param6;
              if (var17Lifetime3 != 0) {
                var18Lifetime2 = param0 << 16;
                if (var14 == 0) {
                  var10 = param5 << 16;
                } else {
                  var11 = param5 << 16;
                }
                var13 = (var18Lifetime2 - var11) / var17Lifetime3;
                var12 = (-var10 + var18Lifetime2) / var17Lifetime3;
              } else {
                var12 = 0;
                var13 = 0;
              }
            } else {
              if (param4 != param7) {
                var16 = -param6 + param4;
                if (param5 <= param2) {
                  var13 = (param0 - param2 << 16) / var15;
                  var12 = (param0 - param5 << 16) / var16;
                  var11 = param2 << 16;
                  var10 = param5 << 16;
                } else {
                  var11 = param5 << 16;
                  var10 = param2 << 16;
                  var12 = (param0 - param2 << 16) / var15;
                  var13 = (-param5 + param0 << 16) / var16;
                }
              } else {
                var10 = param2 << 16;
                var13 = 0;
                var11 = param5 << 16;
                var12 = 0;
              }
              var14 = 0;
              if (param7 < 0) {
                param7 = Math.min(-param7, param6 - param7);
                var11 = var11 + var13 * param7;
                var10 = var10 + var12 * param7;
                param7 = 0;
              }
            }
            if (0 > param7) {
              param7 = -param7;
              var10 = var10 + param7 * var12;
              var11 = var11 + var13 * param7;
              param7 = 0;
            }
            var16Lifetime1 = lf.field_c[param7];
            while (param4 > param7) {
              var17Lifetime1 = var10 >> 16;
              if (lf.field_g > var17Lifetime1) {
                var18Lifetime1 = -(var10 >> 16) + (var11 >> 16);
                if (var18Lifetime1 != 0) {
                  if (var17Lifetime1 + var18Lifetime1 >= lf.field_g) {
                    var18Lifetime1 = -var17Lifetime1 + lf.field_g - 1;
                  }
                  if (var17Lifetime1 < 0) {
                    k.a(true, param3, var17Lifetime1 + var18Lifetime1, var16Lifetime1, param8);
                  } else {
                    k.a(true, param3, var18Lifetime1, var16Lifetime1 + var17Lifetime1, param8);
                  }
                } else {
                  if (var17Lifetime1 >= 0 &&
                    var17Lifetime1 < lf.field_g) {
                    k.a(true, param3, var18Lifetime1, var16Lifetime1 + var17Lifetime1, param8);
                  }
                }
              }
              param7++;
              if (param7 >= lf.field_h) {
                return;
              }
              var10 = var10 + var12;
              var16Lifetime1 = var16Lifetime1 + SoftwareRaster.field_c;
              var11 = var11 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_91_0 = var9;
          stackIn_91_1 = new StringBuilder().append("hb.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          hb.a(true);
        }
        field_g = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_i = null;
    }

    hb() {
        this.field_a = new DualNode();
        this.field_a.dualNext = this.field_a;
        this.field_a.dualPrevious = this.field_a;
    }

    final static void a(int param0, int param1, int param2) {
        if (pd.field_S == null ||
          !(param1 <= pd.field_S.length)) {
          pd.field_S = new int[param1 * 2];
        }
        if (ok.field_d == null ||
          !(ok.field_d.length >= param1)) {
          ok.field_d = new int[2 * param1];
        }
        if (null == jm.field_r ||
          !(param1 <= jm.field_r.length)) {
          jm.field_r = new int[2 * param1];
        }
        if (null == ne.field_G ||
          !(ne.field_G.length >= param1)) {
          ne.field_G = new int[param1 * 2];
        }
        if (param0 >= -118) {
          field_j = (RgbSprite[]) null;
        }
        if (Sentinel.field_T == null ||
          !(Sentinel.field_T.length >= param1)) {
          Sentinel.field_T = new int[2 * param1];
        }
        if (null == eb.field_u ||
          !(param1 <= eb.field_u.length)) {
          eb.field_u = new int[2 * param1];
        }
        if (un.field_j == null ||
          !(param2 + param1 <= un.field_j.length)) {
          un.field_j = new int[(param2 + param1) * 2];
        }
        if (null == vd.field_g ||
          !(vd.field_g.length >= param1)) {
          vd.field_g = new boolean[param1 * 2];
        }
        k.field_Lb = -2147483648;
        nj.field_S = 2147483647;
        kc.field_z = 0;
        ti.field_w = 2147483647;
        mj.field_cc = -2147483648;
    }

    final static void a(byte param0, RgbSprite[] param1, int param2, int param3, int param4, int param5) {
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = SteelSentinels.obfuscationControl;
        try {
          if (param1 == null) {
            return;
          }
          if (param2 > 0 &&
            param5 > 0) {
            if (null == param1[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param1[3].field_z;
            }
            var6_int = stackIn_10_0;
            if (param1[5] != null) {
              stackIn_13_0 = param1[5].field_z;
            } else {
              stackIn_13_0 = 0;
            }
            var7 = stackIn_13_0;
            if (param1[1] != null) {
              stackIn_16_0 = param1[1].field_B;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (param1[7] == null) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param1[7].field_B;
            }
            var9 = stackIn_19_0;
            var11 = -128 % ((param0 + 4) / 41);
            var10 = param2 + param4;
            var12 = param3 + param5;
            var13 = param4 + var6_int;
            var14 = var10 - var7;
            var15 = var8 + param3;
            var16 = -var9 + var12;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = param4 + param2 * var6_int / (var6_int + var7);
              var17 = param4 + param2 * var6_int / (var6_int + var7);
            }
            var19 = var15;
            var20 = var16;
            SoftwareRaster.b(me.field_g);
            if (var19 > var20) {
              var20 = var8 * param5 / (var8 + var9) + param3;
              var19 = var8 * param5 / (var8 + var9) + param3;
            }
            if (param1[0] != null) {
              SoftwareRaster.h(param4, param3, var17, var19);
              param1[0].a(param4, param3);
              SoftwareRaster.a(me.field_g);
            }
            if (param1[2] != null) {
              SoftwareRaster.h(var18, param3, var10, var19);
              param1[2].a(var14, param3);
              SoftwareRaster.a(me.field_g);
            }
            if (param1[6] != null) {
              SoftwareRaster.h(param4, var20, var17, var12);
              param1[6].a(param4, var16);
              SoftwareRaster.a(me.field_g);
            }
            if (param1[8] != null) {
              SoftwareRaster.h(var18, var20, var10, var12);
              param1[8].a(var14, var16);
              SoftwareRaster.a(me.field_g);
            }
            if (param1[1] != null &&
              0 != param1[1].field_z) {
              SoftwareRaster.h(var17, param3, var18, var19);
              for (var21 = var13; var21 < var14; var21 = var21 + param1[1].field_z) {
                param1[1].a(var21, param3);
              }
              SoftwareRaster.a(me.field_g);
            }
            if (null != param1[7] &&
              param1[7].field_z != 0) {
              SoftwareRaster.h(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var21Lifetime1 < var14; var21Lifetime1 = var21Lifetime1 + param1[7].field_z) {
                param1[7].a(var21Lifetime1, var16);
              }
              SoftwareRaster.a(me.field_g);
            }
            if (param1[3] != null &&
              0 != param1[3].field_B) {
              SoftwareRaster.h(param4, var19, var17, var20);
              for (var21Lifetime2 = var15; var16 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param1[3].field_B) {
                param1[3].a(param4, var21Lifetime2);
              }
              SoftwareRaster.a(me.field_g);
            }
            if (null != param1[5] &&
              0 != param1[5].field_B) {
              SoftwareRaster.h(var18, var19, var10, var20);
              for (var21Lifetime3 = var15; var16 > var21Lifetime3; var21Lifetime3 = var21Lifetime3 + param1[5].field_B) {
                param1[5].a(var14, var21Lifetime3);
              }
              SoftwareRaster.a(me.field_g);
            }
            if (null != param1[4] &&
              param1[4].field_z != 0) {
              if (param1[4].field_B == 0) {
                return;
              }
              SoftwareRaster.h(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var16 > var21Lifetime4; var21Lifetime4 = var21Lifetime4 + param1[4].field_B) {
                for (var22 = var13; var14 > var22; var22 = var22 + param1[4].field_z) {
                  param1[4].a(var22, var21Lifetime4);
                }
              }
              SoftwareRaster.a(me.field_g);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("hb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_f = false;
        field_d = -1;
        field_h = "Rankings";
        field_g = new String[]{"Hold <img=26> and drag to move the camera.<br>'A','S','D' control walking.<br>'W' jump.", "'W','A','S','D' move the camera.<br>'Z','X','C' control walking.<br><img=26> or  'SHIFT'+<img=25> jump."};
    }
}
