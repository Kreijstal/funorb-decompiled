/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapClearanceRectangleFactory implements GameStateFactory {
    static float field_a;
    static int field_b;

    public final SerializableGameState create(byte param0) {
        int var2 = 46 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new MapClearanceRectangle());
    }

    final static void drawSortedHalfAlphaTriangle(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
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
        var20 = VoidHunters.field_G;
        try {
          if (param0 >= 0 &&
            param3 < SoftwareFlatTriangleRasterizer.clipHeight) {
            if (param4 < 0 &&
              param6 < 0 &&
              param5 < 0) {
              return;
            }
            if (param4 >= SoftwareFlatTriangleRasterizer.clipWidth &&
              param6 >= SoftwareFlatTriangleRasterizer.clipWidth &&
              param5 >= SoftwareFlatTriangleRasterizer.clipWidth) {
              return;
            }
            var13 = 94 / ((param1 + 45) / 51);
            var15 = -param3 + param0;
            if (param8 == param3) {
              if (param3 == param0) {
                var12 = 0;
                var10 = param6 << 16;
                var9_int = param4 << 16;
                var11 = 0;
              } else {
                var16 = -param8 + param0;
                if (param4 < param6) {
                  var12 = (param5 - param6 << 16) / var16;
                  var10 = param6 << 16;
                  var9_int = param4 << 16;
                  var11 = (param5 - param4 << 16) / var15;
                } else {
                  var9_int = param6 << 16;
                  var11 = (param5 - param6 << 16) / var16;
                  var10 = param4 << 16;
                  var12 = (param5 - param4 << 16) / var15;
                }
              }
              var14 = 0;
              if (0 > param3) {
                param3 = Math.min(-param3, -param3 + param8);
                var10 = var10 + param3 * var12;
                var9_int = var9_int + param3 * var11;
                param3 = 0;
              }
            } else {
              var10 = param4 << 16;
              var9_int = param4 << 16;
              var16 = param8 - param3;
              var11 = (param6 - param4 << 16) / var16;
              var12 = (-param4 + param5 << 16) / var15;
              if (var12 <= var11) {
                var17 = var11;
                var11 = var12;
                var12 = var17;
                var14 = 1;
              } else {
                var14 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param3 < 0) {
                if (param8 < 0) {
                  param3 = -param3 + param8;
                  var10 = var10 + param3 * var12;
                  var9_int = var9_int + var11 * param3;
                  param3 = param8;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param3 = -param3;
                  var9_int = var9_int + var11 * param3;
                  var10 = var10 + param3 * var12;
                  param3 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var17Lifetime2 = SoftwareFlatTriangleRasterizer.rowOffsets[param3];
                while (param3 < param8) {
                  var18 = var9_int >> 16;
                  if (SoftwareFlatTriangleRasterizer.clipWidth > var18) {
                    var19 = (var10 >> 16) - (var9_int >> 16);
                    if (0 != var19) {
                      if (SoftwareFlatTriangleRasterizer.clipWidth <= var19 + var18) {
                        var19 = -1 + (SoftwareFlatTriangleRasterizer.clipWidth - var18);
                      }
                      if (var18 >= 0) {
                        RoundResultFactory.blendHalfAlphaSpan(true, var18 + var17Lifetime2, param2, var19, param7);
                      } else {
                        RoundResultFactory.blendHalfAlphaSpan(true, var17Lifetime2, param2, var18 + var19, param7);
                      }
                    } else {
                      if (0 <= var18 &&
                        var18 < SoftwareFlatTriangleRasterizer.clipWidth) {
                        RoundResultFactory.blendHalfAlphaSpan(true, var17Lifetime2 + var18, param2, var19, param7);
                      }
                    }
                  }
                  param3++;
                  if (param3 >= SoftwareFlatTriangleRasterizer.clipHeight) {
                    return;
                  }
                  var10 = var10 + var12;
                  var17Lifetime2 = var17Lifetime2 + SoftwareRasterizer2D.width;
                  var9_int = var9_int + var11;
                }
              }
              var17Lifetime3 = param0 - param8;
              if (var17Lifetime3 != 0) {
                var18Lifetime2 = param5 << 16;
                if (var14 != 0) {
                  var10 = param6 << 16;
                } else {
                  var9_int = param6 << 16;
                }
                var11 = (-var9_int + var18Lifetime2) / var17Lifetime3;
                var12 = (-var10 + var18Lifetime2) / var17Lifetime3;
              } else {
                var12 = 0;
                var11 = 0;
              }
            }
            if (0 > param3) {
              param3 = -param3;
              var10 = var10 + var12 * param3;
              var9_int = var9_int + param3 * var11;
              param3 = 0;
            }
            var16Lifetime1 = SoftwareFlatTriangleRasterizer.rowOffsets[param3];
            while (param3 < param0) {
              var17Lifetime1 = var9_int >> 16;
              if (var17Lifetime1 < SoftwareFlatTriangleRasterizer.clipWidth) {
                var18Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var18Lifetime1 == 0) {
                  if (0 <= var17Lifetime1 &&
                    SoftwareFlatTriangleRasterizer.clipWidth > var17Lifetime1) {
                    RoundResultFactory.blendHalfAlphaSpan(true, var17Lifetime1 + var16Lifetime1, param2, var18Lifetime1, param7);
                  }
                } else {
                  if (SoftwareFlatTriangleRasterizer.clipWidth <= var18Lifetime1 + var17Lifetime1) {
                    var18Lifetime1 = -1 + SoftwareFlatTriangleRasterizer.clipWidth - var17Lifetime1;
                  }
                  if (0 > var17Lifetime1) {
                    RoundResultFactory.blendHalfAlphaSpan(true, var16Lifetime1, param2, var17Lifetime1 + var18Lifetime1, param7);
                  } else {
                    RoundResultFactory.blendHalfAlphaSpan(true, var17Lifetime1 + var16Lifetime1, param2, var18Lifetime1, param7);
                  }
                }
              }
              param3++;
              if (SoftwareFlatTriangleRasterizer.clipHeight <= param3) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var16Lifetime1 = var16Lifetime1 + SoftwareRasterizer2D.width;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_73_0 = var9;
          stackIn_73_1 = new StringBuilder().append("qaa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param8).append(')').toString());
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          int[] var4 = (int[]) null;
          MapClearanceRectangleFactory.drawSortedHalfAlphaTriangle(35, 80, -54, 13, 73, 4, -14, (int[]) null, -74);
        }
        return (SerializableGameState[]) ((Object) new MapClearanceRectangle[param1]);
    }

    static {
        field_a = 20.0f;
        field_b = 1500;
    }
}
