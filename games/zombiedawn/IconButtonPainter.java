/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IconButtonPainter extends TextWidgetPainter {
    static String field_r;
    static int field_t;
    private IndexedSprite[] field_s;

    public static void releaseStatics(int param0) {
        field_r = null;
        int var1 = -126 % ((48 - param0) / 63);
    }

    public final void drawWidget(int param0, boolean param1, int param2, UiWidget param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        IndexedSprite var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          Rasterizer.drawRectOutline(param4 + param3.field_k, param3.field_j + param2, param3.field_i, param3.field_n, 10197915);
          if (param1) {
            stackIn_6_0 = (((TextButton) (param3)).field_x) ? 1 : 0;
          } else {
            stackIn_6_0 = 0;
          }
          var6_int = stackIn_6_0;
          if (param1) {
            stackIn_12_0 = (param3.isFocused(-17741)) ? 1 : 0;
          } else {
            stackIn_12_0 = 0;
          }
          var7 = stackIn_12_0;
          var8 = 0;
          stackIn_15_0 = (var6_int != 0) ? 2394342 : 16777215;
          var9 = stackIn_15_0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.field_s[var8];
          var11 = (-var10.field_j + param3.field_i) / 2 + (param4 + param3.field_k);
          var12 = (-var10.field_d + param3.field_n) / 2 + (param2 + param3.field_j);
          var13 = param3.field_k + (param4 + param3.field_i / 2);
          if (param0 != 16777215) {
            IconButtonPainter.handleConnectionFailure(-100, -115);
          }
          var10.draw(var11, var12);
          this.field_m.drawStringCentered(this.getDisplayText(12307, param3), var13, param2, var9, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_27_0 = var6;
          stackIn_27_1 = new StringBuilder().append("k.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int handleConnectionFailure(int param0, int param1) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        int var2Lifetime1;
        GameWorld.field_O = null;
        if (param1 != 50) {
          field_r = (String) null;
          SessionSocketHolder.field_a = null;
          MeshDepthBuckets.field_a = 0;
          var2 = WhirlpoolHasher.field_j;
          WhirlpoolHasher.field_j = MoveTargetMarker.field_e;
          MoveTargetMarker.field_e = var2;
          if (param0 != 51) {
            if (param0 != 50) {
              SpatialBucket.field_c.field_e = 1;
              SpatialBucket.field_c.field_h = SpatialBucket.field_c.field_h + 1;
              if (SpatialBucket.field_c.field_h < 2) {
                if (2 <= SpatialBucket.field_c.field_h &&
                  50 == param0) {
                  return 5;
                }
                if (SpatialBucket.field_c.field_h < 4) {
                  return -1;
                }
                return 1;
              }
              if (param0 == 51) {
                return 2;
              }
              if (2 > SpatialBucket.field_c.field_h) {
                if (SpatialBucket.field_c.field_h < 4) {
                  return -1;
                }
                return 1;
              }
              if (50 == param0) {
                return 5;
              }
              if (SpatialBucket.field_c.field_h < 4) {
                return -1;
              }
              return 1;
            }
            SpatialBucket.field_c.field_e = 5;
            SpatialBucket.field_c.field_h = SpatialBucket.field_c.field_h + 1;
            if (SpatialBucket.field_c.field_h < 2) {
              if (2 <= SpatialBucket.field_c.field_h &&
                50 == param0) {
                return 5;
              }
              if (SpatialBucket.field_c.field_h < 4) {
                return -1;
              }
              return 1;
            }
            if (param0 == 51) {
              return 2;
            }
            if (2 > SpatialBucket.field_c.field_h) {
              if (SpatialBucket.field_c.field_h < 4) {
                return -1;
              }
              return 1;
            }
            if (50 == param0) {
              return 5;
            }
            if (SpatialBucket.field_c.field_h < 4) {
              return -1;
            }
            return 1;
          }
          SpatialBucket.field_c.field_e = 2;
          SpatialBucket.field_c.field_h = SpatialBucket.field_c.field_h + 1;
          if (SpatialBucket.field_c.field_h < 2) {
            if (2 > SpatialBucket.field_c.field_h) {
              if (SpatialBucket.field_c.field_h < 4) {
                return -1;
              }
              return 1;
            }
            if (50 != param0) {
              if (SpatialBucket.field_c.field_h >= 4) {
                return 1;
              }
              return -1;
            }
            return 5;
          }
          if (param0 == 51) {
            return 2;
          }
          if (2 > SpatialBucket.field_c.field_h) {
            if (SpatialBucket.field_c.field_h >= 4) {
              return 1;
            }
            return -1;
          }
          if (50 == param0) {
            return 5;
          }
          if (SpatialBucket.field_c.field_h >= 4) {
            return 1;
          }
          return -1;
        }
        SessionSocketHolder.field_a = null;
        MeshDepthBuckets.field_a = 0;
        var2Lifetime1 = WhirlpoolHasher.field_j;
        WhirlpoolHasher.field_j = MoveTargetMarker.field_e;
        MoveTargetMarker.field_e = var2Lifetime1;
        if (param0 != 51) {
          if (param0 != 50) {
            SpatialBucket.field_c.field_e = 1;
            SpatialBucket.field_c.field_h = SpatialBucket.field_c.field_h + 1;
            if (SpatialBucket.field_c.field_h >= 2) {
              if (param0 != 51) {
                if (2 <= SpatialBucket.field_c.field_h &&
                  50 == param0) {
                  return 5;
                }
                if (SpatialBucket.field_c.field_h >= 4) {
                  return 1;
                }
                return -1;
              }
              return 2;
            }
            if (2 <= SpatialBucket.field_c.field_h &&
              50 == param0) {
              return 5;
            }
            if (SpatialBucket.field_c.field_h >= 4) {
              return 1;
            }
            return -1;
          }
          SpatialBucket.field_c.field_e = 5;
          SpatialBucket.field_c.field_h = SpatialBucket.field_c.field_h + 1;
          if (SpatialBucket.field_c.field_h >= 2) {
            if (param0 != 51) {
              if (2 <= SpatialBucket.field_c.field_h &&
                50 == param0) {
                return 5;
              }
              if (SpatialBucket.field_c.field_h >= 4) {
                return 1;
              }
              return -1;
            }
            return 2;
          }
          if (2 <= SpatialBucket.field_c.field_h &&
            50 == param0) {
            return 5;
          }
          if (SpatialBucket.field_c.field_h >= 4) {
            return 1;
          }
          return -1;
        }
        SpatialBucket.field_c.field_e = 2;
        SpatialBucket.field_c.field_h = SpatialBucket.field_c.field_h + 1;
        if (SpatialBucket.field_c.field_h >= 2) {
          if (param0 != 51) {
            if (2 <= SpatialBucket.field_c.field_h &&
              50 == param0) {
              return 5;
            }
            if (SpatialBucket.field_c.field_h >= 4) {
              return 1;
            }
            return -1;
          }
          return 2;
        }
        if (2 <= SpatialBucket.field_c.field_h &&
          50 == param0) {
          return 5;
        }
        if (SpatialBucket.field_c.field_h >= 4) {
          return 1;
        }
        return -1;
    }

    IconButtonPainter(IndexedSprite[] param0) {
        try {
          this.field_s = param0;
          this.field_m = MenuFontGlobals.field_e;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Friends can be added in multiplayer<nbsp>games";
    }
}
