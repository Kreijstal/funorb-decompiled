/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BattleUnitRenderer {
    static RgbSprite field_a;
    static String field_c;
    private BattleCamera camera;

    private final boolean isTileVisible(byte obfuscationGuard, int tileIndex) {
        this.camera.projectTile(1, tileIndex);
        int screenX = this.camera.screenPosition[0];
        int screenY = this.camera.screenPosition[1];
        if (obfuscationGuard > -77) {
          Unit var7 = (Unit) null;
          this.refreshUnitModel(-96, -101, (Unit) null);
        }
        int surfaceWidth = so.field_b.field_a;
        int surfaceHeight = so.field_b.field_g;
        if (screenX > surfaceWidth) {
          return false;
        }
        if (screenX < -180) {
          return false;
        }
        if (surfaceHeight < screenY) {
          return false;
        }
        if (screenY < -10) {
          return false;
        }
        return true;
    }

    final static int b(int param0) {
        if (param0 != 1) {
          return 66;
        }
        return ResourceArchive.field_a.currentPosition[1];
    }

    final boolean advanceUnitModel(int screenXOrTileIndex, int obfuscationGuard, int screenY, int yawOverride, Unit unit) {
        int var6_int = 0;
        RuntimeException var6 = null;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (unit == null) {
            return true;
          }
          if (obfuscationGuard != -35) {
            this.camera = (BattleCamera) null;
          }
          if (-1 < yawOverride) {
            unit.facingAngle = yawOverride;
          }
          if (null == unit.modelPreview) {
            var6_int = unit.unitType;
            if (var6_int == 34 &&
              unit.packedFlag8) {
              var6_int = 75;
            }
            unit.modelPreview = new UnitModelPreview(unit.field_R, var6_int, unit.facingAngle);
          }
          if (unit.modelPreview == null) {
            return true;
          }
          if (unit.modelAnimationIndex == -1) {
            unit.modelAnimationIndex = 0;
          }
          stackIn_18_0 = unit.modelPreview.advanceBattleModel(screenY, unit.modelVisible, screenXOrTileIndex, yawOverride, unit.modelAnimationIndex, false);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("eo.C(").append(screenXOrTileIndex).append(',').append(obfuscationGuard).append(',').append(screenY).append(',').append(yawOverride).append(',');
          if (unit == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void refreshUnitModels(int mapWidth, byte obfuscationGuard, int mapHeight, MapTile[] tiles) {
        int tileIndex = 0;
        int tileCount = 0;
        RuntimeException var5 = null;
        Unit unit = null;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          tileCount = mapHeight * mapWidth;
          for (tileIndex = 0; tileCount > tileIndex; tileIndex++) {
            unit = tiles[tileIndex].occupant;
            if (unit != null &&
              !unit.presentationOwnsModel) {
              this.refreshUnitModel(79, tileIndex, unit);
            }
          }
          if (obfuscationGuard <= 91) {
            field_c = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("eo.F(").append(mapWidth).append(',').append(obfuscationGuard).append(',').append(mapHeight).append(',');
          if (tiles == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2, IndexedSprite param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var8 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 > -55) {
            return;
          }
          var5_int = 0;
          param4 = param4 + param3.offsetY;
          param0 = param0 + param3.offsetX;
          for (var6 = 0; param3.pixelHeight > var6; var6++) {
            for (var7 = 0; param3.pixelWidth > var7; var7++) {
              var8 = param3.pixelIndices[var5_int];
              var5_int++;
              if (var8 > 0) {
                for (var9 = -3; 4 > var9; var9++) {
                  for (var10 = -3; var10 < 4; var10++) {
                    if (var7 + var9 <= -1 ||
                      !(var9 + var7 < param3.pixelWidth) ||
                      -1 >= var6 + var10 ||
                      !(param3.pixelHeight > var10 + var6) ||
                      param3.pixelIndices[(var10 + var6) * param3.pixelWidth + (var7 + var9)] == 0) {
                      SoftwareRaster.g(var7 + (param0 + var9), var10 + param4 + var6, param1, var9 * var9 + var10 * var10);
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("eo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 0) {
          field_c = (String) null;
        }
    }

    private final void refreshUnitModel(int obfuscationGuard, int tileIndex, Unit unit) {
        RuntimeException var4 = null;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (unit == null) {
            return;
          }
          unit.modelVisible = this.isTileVisible((byte) -81, tileIndex);
          if (obfuscationGuard <= 42) {
            var5 = (String) null;
            BattleUnitRenderer.a(false, (kd) null, (String) null, (String) null, -91, (byte) -105, (String) null);
          }
          if (!unit.modelVisible) {
            if (!unit.presentationOwnsModel) {
              unit.modelPreview = null;
            }
          } else {
            this.advanceUnitModel(tileIndex, -35, -1, -1, unit);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("eo.E(").append(obfuscationGuard).append(',').append(tileIndex).append(',');
          if (unit == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, kd param1, String param2, String param3, int param4, byte param5, String param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        oe var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nb.field_i != oh.field_L) {
            return false;
          }
          var9 = new oe(KingBlackDragonEvent.field_C, param1);
          KingBlackDragonEvent.field_C.a(var9, 0);
          if (!AnimationSkeleton.a(-8327)) {
            cd.field_e = param3;
            SoundCache.field_a = null;
            BufferedFile.field_a = param6;
            MusicCrossfadeStream.field_z = param4;
            oh.field_L = du.field_d;
            RadialSummonMenu.field_e = param0;
            qk.field_b = param2;
          } else {
            var9.k((byte) -119);
          }
          var8 = 114 / ((21 - param5) / 52);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("eo.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    BattleUnitRenderer(BattleCamera camera) {
        j discarded$0 = null;
        try {
          discarded$0 = new j(240, camera);
          this.camera = camera;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "eo.<init>(" + (camera != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
