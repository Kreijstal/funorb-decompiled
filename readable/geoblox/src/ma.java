/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends IntrusiveNode {
    int field_h;
    long field_f;
    byte[] field_g;

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Geoblox.field_C;
        try {
          var5 = uh.field_x;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          if (param0 != -35) {
            return;
          }
          L0: while (var2 < var3) {
            incrementValue$16 = var2;
            var2++;
            var5[incrementValue$16] = 0;
            incrementValue$17 = var2;
            var2++;
            var5[incrementValue$17] = 0;
            incrementValue$18 = var2;
            var2++;
            var5[incrementValue$18] = 0;
            incrementValue$19 = var2;
            var2++;
            var5[incrementValue$19] = 0;
            incrementValue$20 = var2;
            var2++;
            var5[incrementValue$20] = 0;
            incrementValue$21 = var2;
            var2++;
            var5[incrementValue$21] = 0;
            incrementValue$22 = var2;
            var2++;
            var5[incrementValue$22] = 0;
            incrementValue$23 = var2;
            var2++;
            var5[incrementValue$23] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "ma.E(" + param0 + ')');
        }
    }

    final static boolean contactProbeOverlapsScratchSprite(boolean methodGuard, float diagnosticBoardAngleRadians, GameplayEntity diagnosticEntity) {
        RuntimeException contactOverlapFailureForContext = null;
        boolean overlapFound = false;
        RuntimeException contactOverlapFailureBeforeEntityDescription = null;
        StringBuilder contactOverlapMessagePrefix = null;
        RuntimeException contactOverlapFailureAtEntityDescription = null;
        StringBuilder contactOverlapMessageAtEntityDescription = null;
        String entityArgumentDescription = null;
        RuntimeException caughtContactOverlapFailure = null;
        try {
          if (!methodGuard) {
            ma.b(-91);
          }
          overlapFound = PixelOverlapProbe.findFirstNonzeroPixelOverlap(SecondaryDeque.contactProbeRaster, 0, 0, vf.spriteScratchRaster, -SecondaryDeque.contactProbeOffsetX + ng.rotatedEntityScreenX - (vf.spriteScratchRaster.fullWidth >> 1), -SecondaryDeque.contactProbeOffsetY - (vf.spriteScratchRaster.fullHeight >> 1) + td.rotatedEntityScreenY);
          return overlapFound;
        } catch (java.lang.RuntimeException contactOverlapFailure) {
          caughtContactOverlapFailure = contactOverlapFailure;
          contactOverlapFailureForContext = caughtContactOverlapFailure;
          contactOverlapFailureBeforeEntityDescription = (RuntimeException) (contactOverlapFailureForContext);

          contactOverlapMessagePrefix = new StringBuilder().append("ma.A(").append(methodGuard).append(',').append(diagnosticBoardAngleRadians).append(',');

          if (diagnosticEntity == null) {
            contactOverlapFailureAtEntityDescription = (RuntimeException) ((Object) contactOverlapFailureBeforeEntityDescription);
            contactOverlapMessageAtEntityDescription = (StringBuilder) ((Object) contactOverlapMessagePrefix);
            entityArgumentDescription = "null";
          } else {
            contactOverlapFailureAtEntityDescription = (RuntimeException) ((Object) contactOverlapFailureBeforeEntityDescription);
            contactOverlapMessageAtEntityDescription = (StringBuilder) ((Object) contactOverlapMessagePrefix);
            entityArgumentDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) contactOverlapFailureAtEntityDescription), ((StringBuilder) (Object) contactOverlapMessageAtEntityDescription).append(entityArgumentDescription).append(')').toString());
        }
    }

    final static int b(int param0) {
        gb.field_b.a((byte) -65);
        if (param0 != 15869) {
            return 61;
        }
        if (!wg.field_i.a((byte) 95)) {
            return ge.a((byte) -74);
        }
        return 0;
    }

    final static boolean c(byte param0) {
        int var1 = 39 / ((param0 - 18) / 54);
        return fa.releasesPerTheme > fj.field_m ? true : false;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, Sprite[] param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
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
        int var22 = 0;
        var22 = Geoblox.field_C;
        try {
          if (param5 == null) {
            return;
          }
          if (param4 > 0) {
            if (0 < param2) {
              if (param5[3] == null) {
                stackIn_10_0 = 0;
              } else {
                stackIn_10_0 = param5[3].fullWidth;
              }
              var6_int = stackIn_10_0;
              if (null == param5[5]) {
                stackIn_13_0 = 0;
              } else {
                stackIn_13_0 = param5[5].fullWidth;
              }
              var7 = stackIn_13_0;
              if (param3 != -92) {
                return;
              }
              {
                if (null != param5[1]) {
                  stackIn_18_0 = param5[1].fullHeight;
                } else {
                  stackIn_18_0 = 0;
                }
                var8 = stackIn_18_0;
                if (null != param5[7]) {
                  stackIn_21_0 = param5[7].fullHeight;
                } else {
                  stackIn_21_0 = 0;
                }
                var9 = stackIn_21_0;
                var10 = param4 + param1;
                var11 = param0 + param2;
                var12 = param1 + var6_int;
                var13 = var10 - var7;
                var14 = param0 + var8;
                var15 = -var9 + var11;
                var16 = var12;
                var17 = var13;
                if (var16 > var17) {
                  var17 = var6_int * param4 / (var6_int + var7) + param1;
                  var16 = var6_int * param4 / (var6_int + var7) + param1;
                }
                var18 = var14;
                var19 = var15;
                SoftwareRasterizer.saveClip(hd.field_I);
                if (var19 < var18) {
                  var19 = param2 * var8 / (var8 + var9) + param0;
                  var18 = param2 * var8 / (var8 + var9) + param0;
                }
                if (null != param5[0]) {
                  SoftwareRasterizer.intersectClip(param1, param0, var16, var18);
                  param5[0].draw(param1, param0);
                  SoftwareRasterizer.restoreClip(hd.field_I);
                }
                if (param5[2] != null) {
                  SoftwareRasterizer.intersectClip(var17, param0, var10, var18);
                  param5[2].draw(var13, param0);
                  SoftwareRasterizer.restoreClip(hd.field_I);
                }
                if (null != param5[6]) {
                  SoftwareRasterizer.intersectClip(param1, var19, var16, var11);
                  param5[6].draw(param1, var15);
                  SoftwareRasterizer.restoreClip(hd.field_I);
                }
                if (null != param5[8]) {
                  SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
                  param5[8].draw(var13, var15);
                  SoftwareRasterizer.restoreClip(hd.field_I);
                }
                L11: {
                  if (null != param5[1]) {
                    if (param5[1].fullWidth != 0) {
                      SoftwareRasterizer.intersectClip(var16, param0, var17, var18);
                      for (var20 = var12; var13 > var20; var20 = var20 + param5[1].fullWidth) {
                        param5[1].draw(var20, param0);
                      }
                      SoftwareRasterizer.restoreClip(hd.field_I);
                      break L11;
                    }
                  }
                }
                L13: {
                  if (param5[7] != null) {
                    if (0 != param5[7].fullWidth) {
                      SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
                      for (var20 = var12; var20 < var13; var20 = var20 + param5[7].fullWidth) {
                        param5[7].draw(var20, var15);
                      }
                      SoftwareRasterizer.restoreClip(hd.field_I);
                      break L13;
                    }
                  }
                }
                L15: {
                  if (param5[3] != null) {
                    if (0 != param5[3].fullHeight) {
                      SoftwareRasterizer.intersectClip(param1, var18, var16, var19);
                      for (var20 = var14; var15 > var20; var20 = var20 + param5[3].fullHeight) {
                        param5[3].draw(param1, var20);
                      }
                      SoftwareRasterizer.restoreClip(hd.field_I);
                      break L15;
                    }
                  }
                }
                L17: {
                  if (param5[5] != null) {
                    if (param5[5].fullHeight != 0) {
                      SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
                      for (var20 = var14; var20 < var15; var20 = var20 + param5[5].fullHeight) {
                        param5[5].draw(var13, var20);
                      }
                      SoftwareRasterizer.restoreClip(hd.field_I);
                      break L17;
                    }
                  }
                }
                L19: {
                  if (param5[4] != null) {
                    if (param5[4].fullWidth != 0) {
                      if (0 != param5[4].fullHeight) {
                        SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
                        for (var20 = var14; var15 > var20; var20 = var20 + param5[4].fullHeight) {
                          for (var21 = var12; var21 < var13; var21 = var21 + param5[4].fullWidth) {
                            param5[4].draw(var21, var20);
                          }
                        }
                        SoftwareRasterizer.restoreClip(hd.field_I);
                        break L19;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = (RuntimeException) (var6);

          stackIn_77_1 = new StringBuilder().append("ma.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

          if (param5 == null) {
            stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
            stackIn_78_2 = "null";
          } else {
            stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
            stackIn_78_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(')').toString());
        }
    }

    final static boolean a(rh param0, rh param1, rh param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.a(0)) {
            if (param2.a("commonui", (byte) -127)) {
              if (param1.a(param3 + 11652)) {
                if (param1.a("commonui", (byte) -124)) {
                  if (param3 != -11652) {
                    return false;
                  }
                  if (param0.a(0)) {
                    if (param0.a("button.gif", (byte) -125)) {
                      return true;
                    }
                  }
                  return false;
                }
              }
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = (RuntimeException) (var4);

          stackIn_20_1 = new StringBuilder().append("ma.D(");

          if (param0 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
            stackIn_21_2 = "{...}";
          }


          stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

          if (param1 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }


          stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

          if (param2 == null) {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "null";
          } else {
            stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    ma(long param0, int param1, byte[] param2) {
        try {
            this.field_h = param1;
            this.field_g = param2;
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ma.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
