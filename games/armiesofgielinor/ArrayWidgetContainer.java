/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ArrayWidgetContainer extends Widget implements WidgetContainerMarker {
    static String field_D;
    Widget[] children;
    static String field_I;
    static IconLabelControl field_H;
    static int[] field_G;
    static RgbSprite[] field_F;
    static String[] field_E;

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        int childIndex = 0;
        Widget child = null;
        int obfuscationControl = 0;
        Widget guardWidget = null;
        Widget[] childArray = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          super.updatePointer(obfuscationGuard ^ 0, originX, originY, rootWidget);
          if (null == this.children) {
            return;
          }
          childArray = this.children;
          childIndex = 0;
          if (obfuscationGuard != 32722) {
            guardWidget = (Widget) null;
            this.handleWheel(100, 40, 117, -12, 65, -112, (Widget) null);
          }
          while (childIndex < childArray.length) {
            child = childArray[childIndex];
            if (child != null) {
              child.updatePointer(32722, originX + this.x, this.y + originY, rootWidget);
            }
            childIndex++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_13_0 = failure;
          stackIn_13_1 = new StringBuilder().append("hs.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static MeshData a(String param0, int param1, String param2) {
        MeshData var3 = null;
        RuntimeException var3_ref = null;
        MeshData stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 235) {
            ArrayWidgetContainer.a(124);
          }
          var3 = MeshData.load(SummonEvent.field_B, param0, param2);
          if (var3 != null) {
            var3.faceTextureIds = null;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("hs.IA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, Unit param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_35_0 = 0;
        int stackIn_44_0 = 0;
        RgbSprite[] stackIn_54_0 = null;
        int[] stackIn_54_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_71_0 = 0;
        Unit stackIn_82_0 = null;
        boolean stackIn_83_1 = false;
        int stackIn_95_0 = 0;
        int stackIn_110_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        MapTile var18 = null;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        int var17Lifetime1;
        int var17Lifetime2;
        int var19Lifetime1;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          CampaignDefinition.field_t.drawOpaque(param4 + 2, param7 + param6 - 73);
          fe.b(param4 + 0, -76 + param6 + param7, 309, 71, MusicPatch.field_m, ConsoleValue.field_b, 0, 0);
          SoftwareRaster.b(param4 + 7, param7 - 70 + param6, 25, 25, 0, 128);
          SoftwareRaster.b(37 + param4, param7 - 70 + param6, 265, 25, 0, 128);
          var21 = param2.q((byte) 67);
          var8 = var21.toLowerCase();
          SoftwareRaster.setClip(param4 + 37, param7 - 70 + param6, 245 + param4, param6 + (param7 - 45));
          fe.a(var8, -param3 + (param4 + 42), param6 - 43 + param7, 16777215, true);
          SoftwareRaster.a();
          fe.c(param2.strength + param2.bonusStrength + "/" + param2.maximumStrength, param4 + 272, param6 - (42 - param7), 16777215, param1);
          ro.field_rb[param2.getUnitCategory(0)].draw(param4 + 9, param7 - 66 + param6);
          var9 = param2.l(-27014);
          SoftwareRaster.b(59 + param4, param7 - 41 + param6, 30, 30, 0, 128);
          cp.field_e[eb.bitCount((byte) -120, ~var9 & 3)].draw(param4 + 62, param7 - (-param6 + 41));
          var10 = param2.unitType;
          if (var10 == 34 &&
            param2.packedFlag8) {
            var10 = 75;
          }
          var11 = bw.unitDefinitions[var10][6];
          var12 = bw.unitDefinitions[var10][7];
          if (param2.packedFlag8 &&
            34 == param2.unitType) {
            var12 = 7;
            var11 = 2;
            if (param2.getEquipmentCategory(20640) == 3) {
              var12 = var12 + param2.getEquipmentProperty(1, -105);
            }
          }
          if ((param2.unitType == 81 ||
            param2.unitType == 4 ||
            74 == param2.unitType) &&
            param2.getEquipmentCategory(20640) == 3) {
            var12 = var12 + param2.getEquipmentProperty(1, 96);
          } else if (param2.getUnitCategory(0) == 3 &&
            param2.getEquipmentCategory(20640) == 2) {
            var12 = var12 + param2.getEquipmentProperty(1, -102);
          } else {
            if (param2.getUnitCategory(0) == 2 &&
              param2.getEquipmentCategory(20640) == 1) {
              var12 = var12 + param2.getEquipmentProperty(1, -116);
            }
          }
          if (var11 != var12) {
            SoftwareRaster.b(param4 + 92, param7 - 41 + param6, 39, 30, 0, 128);
            fe.c(fo.a(4800, td.field_a, new String[]{Integer.toString(var11), Integer.toString(var12)}), param4 + 111, param7 - 41 + (param6 + 30), 16777215, true);
          } else {
            SoftwareRaster.b(96 + param4, -41 - (-param6 - param7), 30, 30, 0, 128);
            fe.c(Integer.toString(var11), param4 + 111, -41 - (-param6 - (param7 + 30)), 16777215, true);
          }
          var13 = 0;
          SoftwareRaster.a(307 + param4 - 20, param7 - 26 + param6, 17, 0, 128);
          var14 = bw.unitDefinitions[param2.unitType][12];
          if (var14 > -1) {
            if (var14 < lb.field_e.length) {
              lb.field_e[var14].draw(-35 + (308 + param4), -42 + param6 + param7);
            } else {
              SoftwareRaster.a(-35 + (param4 + 308), param7 + param6 - 42, 25, (int)(Math.random() * 16777215.0), 128);
            }
          }
          var15 = eb.bitCount((byte) -104, var9 >> 2);
          if ((var15 & 3) <= 0 &&
            var15 != 0) {
            stackIn_35_0 = 0;
          } else {
            stackIn_35_0 = 1;
          }
          var16 = stackIn_35_0 + (var15 >> 2);
          SoftwareRaster.b(param4 + 284 - 150, -41 + param6 + param7, 130, 30 * var16, 0, 128);
          for (var17 = 5; 1 < var17; var17--) {
            if ((var9 & 1 << var17) != 0) {
              cp.field_e[var17 + 1].draw(-(30 * (3 & var13)) + 235 + param4, (var13 >> 2) * 30 + (param7 - 41 + param6));
              var13++;
            }
          }
          if (param2.statusEffectType != 0) {
            if (7 <= param2.statusEffectType) {
              stackIn_44_0 = 0;
            } else {
              stackIn_44_0 = -1 + param2.statusEffectValue;
            }
            var17Lifetime1 = stackIn_44_0;
            BattleCharacter.field_h[vr.field_a[param2.statusEffectType - 1] + var17Lifetime1].h(-(30 * (var13 & 3)) + (235 + param4), param7 + (-36 + param6) + (var13 >> 2) * 30);
            km.field_h[0].h(param4 + 233 - 30 * (3 & var13), 30 * (var13 >> 2) + param7 - 37 + param6);
            var13++;
          }
          if (param2.equipmentDescriptor > -1) {
            BattleCharacter.field_h[BattlefieldTheme.field_p[param2.getEquipmentCategory(20640)][param2.getEquipmentId((byte) 81)]].h(235 + param4 - (var13 & 3) * 30, (var13 >> 2) * 30 + param7 + (-36 + param6));
            km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), (var13 >> 2) * 30 - 37 + param6 + param7);
            var13++;
          }
          if (param2.accessoryType > 0) {
            BattleCharacter.field_h[uj.field_o[param2.accessoryType - 1]].h(-((3 & var13) * 30) + (235 + param4), 30 * (var13 >> 2) - 36 - (-param6 - param7));
            km.field_h[0].h(param4 + 233 - 30 * (3 & var13), (var13 >> 2) * 30 + param7 + param6 - 37);
            var13++;
          }
          if (param2.immobilizedTurns > 0) {
            stackIn_54_0 = BattleCharacter.field_h;
            stackIn_54_1 = SetCoatConsoleCommand.field_H;
            if (3 >= param2.immobilizedTurns) {
              stackIn_55_2 = -1 + param2.immobilizedTurns;
            } else {
              stackIn_55_2 = 2;
            }
            ((RgbSprite) (Object) stackIn_54_0[stackIn_54_1[stackIn_55_2]]).h(235 + param4 - (var13 & 3) * 30, param7 + (-36 + param6) + 30 * (var13 >> 2));
            km.field_h[0].h(-((var13 & 3) * 30) + (233 + param4), (var13 >> 2) * 30 + param7 - (-param6 + 37));
            var13++;
          }
          if (param2.meleeLifeSteal) {
            BattleCharacter.field_h[133].h(-((3 & var13) * 30) + 235 + param4, param6 - (36 - param7 - 30 * (var13 >> 2)));
            km.field_h[0].h(param4 + 233 - 30 * (3 & var13), -37 + (param6 + param7) + (var13 >> 2) * 30);
            var13++;
          }
          if (param2.packedFlag256) {
            BattleCharacter.field_h[122 + bw.unitDefinitions[param2.unitType][2]].h(param4 + (235 - (var13 & 3) * 30), param7 - 36 - (-param6 - (var13 >> 2) * 30));
            km.field_h[0].h(param4 + 233 - 30 * (var13 & 3), param7 - 37 - (-param6 - (var13 >> 2) * 30));
            var13++;
          }
          if (param2.packedFlag32) {
            BattleCharacter.field_h[j.field_j[td.a(param2.unitType, (byte) -125)]].h(-((3 & var13) * 30) + 235 + param4, 30 * (var13 >> 2) + param7 + param6 - 36);
            km.field_h[0].h(-((var13 & 3) * 30) + (param4 + 233), param6 - 37 + (param7 + (var13 >> 2) * 30));
            var13++;
          }
          if (param5 == 80) {
            if (param0) {
              stackIn_71_0 = (TabbedPanel.a(59 + param7, 26 + param4, 21, false)) ? 1 : 0;
            } else {
              stackIn_71_0 = 0;
            }
          } else {
            stackIn_71_0 = 0;
          }
          regionExit1: {
            var17Lifetime2 = stackIn_71_0;
            if (param2.unitType == 39) {
              if (!param2.movementSpent &&
                param2.attacksRemaining != 0) {
                lw.field_ob.g(11 + param4, param6 + (-36 + param7));
                ii.field_a[2].g(11 + param4, -36 + (param6 + param7));
                if ((var17Lifetime2 != 0)) {
                  lw.field_ob.f(11 + param4, param7 - (-param6 + 36), 128);
                }
                break regionExit1;
              }
              lw.field_ob.g(param4 + 11, param7 + param6 - 36, 128);
              ii.field_a[2].g(param4 + 11, param7 + param6 - 36, 128);
            } else {
              if (param2.unitType != 72) {
                if (param2.unitType == 17) {
                  stackIn_82_0 = (Unit) (param2);
                  stackIn_83_1 = !(param1);
                  if (!((Unit) (Object) stackIn_82_0).hasMovementFlag1(stackIn_83_1)) {
                    if (!param2.movementSpent &&
                      param2.attacksRemaining != 0) {
                      lw.field_ob.g(11 + param4, param7 - 36 + param6);
                      ii.field_a[1].g(param4 + 11, param7 + param6 - 36);
                      if ((var17Lifetime2 != 0)) {
                        lw.field_ob.f(11 + param4, -36 - (-param6 - param7), 128);
                      }
                    } else {
                      lw.field_ob.g(param4 + 11, param6 - 36 + param7, 128);
                      ii.field_a[1].g(11 + param4, param6 - 36 + param7, 128);
                    }
                    break regionExit1;
                  }
                }
                if (param2.unitType == 7 &&
                  !param2.packedFlag8) {
                  var18_int = param2.battlefield.tiles[param2.tileX + param2.tileY * param2.battlefield.mapWidth].terrainType;
                  stackIn_95_0 = (0 == var18_int) ? 0 : 1;
                  var19 = stackIn_95_0;
                  if (!param2.movementSpent &&
                    param2.attacksRemaining != 0 &&
                    var19 == 0) {
                    lw.field_ob.g(param4 + 11, param7 + (param6 - 36));
                    ii.field_a[4].g(param4 + 11, param7 + param6 - 36);
                    if ((var17Lifetime2 != 0)) {
                      lw.field_ob.f(11 + param4, param7 + (-36 + param6), 128);
                    }
                  } else {
                    lw.field_ob.g(11 + param4, param6 + (-36 + param7), 128);
                    ii.field_a[4].g(11 + param4, -36 + param6 + param7, 128);
                  }
                  break regionExit1;
                }
                if (param2.unitType == 34 &&
                  !param2.packedFlag8) {
                  var18 = param2.battlefield.tiles[param2.tileY * param2.battlefield.mapWidth + param2.tileX];
                  stackIn_110_0 = (var18.f(19725)) ? 0 : 1;
                  var19Lifetime1 = stackIn_110_0;
                  if (!param2.movementSpent &&
                    param2.attacksRemaining != 0 &&
                    var19Lifetime1 == 0) {
                    lw.field_ob.g(param4 + 11, -36 + (param6 + param7));
                    ii.field_a[0].g(11 + param4, -36 + param6 + param7);
                    if (var17Lifetime2 != 0) {
                      lw.field_ob.f(param4 + 11, -36 + param6 + param7, 128);
                      break regionExit1;
                    }
                    km.field_h[1].g(7 + param4, -40 + (param6 + param7));
                    return;
                  }
                  lw.field_ob.g(11 + param4, param6 - 36 + param7, 128);
                  ii.field_a[0].g(11 + param4, param7 - 36 + param6, 128);
                  break regionExit1;
                }
                lw.field_ob.g(11 + param4, -36 - (-param6 - param7), 128);
              } else {
                if (!param2.movementSpent &&
                  0 != param2.attacksRemaining) {
                  lw.field_ob.g(11 + param4, param7 - (-param6 + 36));
                  ii.field_a[3].g(param4 + 11, param6 - (36 - param7));
                  if ((var17Lifetime2 != 0)) {
                    lw.field_ob.f(param4 + 11, param6 + (-36 + param7), 128);
                  }
                  break regionExit1;
                }
                lw.field_ob.g(11 + param4, param6 + (-36 + param7), 128);
                ii.field_a[3].g(param4 + 11, param7 - (-param6 + 36), 128);
              }
            }
          }
          km.field_h[1].g(7 + param4, -40 + (param6 + param7));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_127_0 = var8_ref;
          stackIn_127_1 = new StringBuilder().append("hs.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final int getMaximumRenderLayer(int obfuscationGuard) {
        int childIndex = 0;
        int maximumLayer;
        Widget[] childArray;
        Widget child;
        int obfuscationControl;
        Widget guardWidget;
        int childLayer;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        maximumLayer = 0;
        if (obfuscationGuard != -31989) {
          guardWidget = (Widget) null;
          this.pointerPressed(-72, 104, -12, -47, (Widget) null, 52, 17);
        }
        childArray = this.children;
        for (childIndex = 0; childIndex < childArray.length; childIndex++) {
          child = childArray[childIndex];
          if (child != null) {
            childLayer = child.getMaximumRenderLayer(-31989);
            if (maximumLayer < childLayer) {
              maximumLayer = childLayer;
            }
          }
        }
        return maximumLayer;
    }

    boolean handleWheel(int pointerX, int originX, int originY, int pointerY, int wheelDelta, int obfuscationGuard, Widget rootWidget) {
        int childIndex = 0;
        Widget[] childArray = null;
        RuntimeException failure = null;
        Widget child = null;
        int obfuscationControl = 0;
        Widget[] retainedChildren = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          retainedChildren = this.children;
          childArray = retainedChildren;
          if (obfuscationGuard < 93) {
            this.getMaximumRenderLayer(-110);
          }
          for (childIndex = 0; childIndex < retainedChildren.length; childIndex++) {
            child = retainedChildren[childIndex];
            if (child != null &&
              child.isFocused(false) &&
              child.handleWheel(pointerX, originX, originY, pointerY, wheelDelta, 103, rootWidget)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_20_0 = failure;
          stackIn_20_1 = new StringBuilder().append("hs.RA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(pointerY).append(',').append(wheelDelta).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int childIndex = 0;
        Widget child;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (renderLayer == 0 &&
          null != this.painter) {
          this.painter.paintWidget((Widget) (this), originX, -121, true, originY);
        }
        if (obfuscationGuard >= -82) {
          this.blur(-101);
        }
        if (null != this.children) {
          for (childIndex = -1 + this.children.length; childIndex >= 0; childIndex--) {
            child = this.children[childIndex];
            if (child != null) {
              child.drawWidget(this.x + originX, originY + this.y, (byte) -124, renderLayer);
            }
          }
        }
    }

    final boolean focusForwardBy(Widget rootWidget, int step, boolean obfuscationGuard) {
        int childIndex = 0;
        RuntimeException failure = null;
        Widget child = null;
        Widget focusedCandidate = null;
        int obfuscationControl = 0;
        Widget stackIn_7_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Widget scannedChild;
        Widget nextChild;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          childIndex = 0;
          while (this.children.length > childIndex) {
            child = this.children[childIndex];
            focusedCandidate = child;
            scannedChild = child;
            stackIn_7_0 = child;
            if (stackIn_7_0 != null &&
              child.isFocused(false)) {
              for (childIndex = childIndex + step; this.children.length > childIndex; childIndex = childIndex + step) {
                nextChild = this.children[childIndex];
                if (nextChild != null &&
                  nextChild.takeFocus(11, rootWidget)) {
                  return true;
                }
              }
            }
            childIndex++;
          }
          if (obfuscationGuard) {
            return false;
          }
          field_G = (int[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_25_0 = failure;
          stackIn_25_1 = new StringBuilder().append("hs.EA(");
          if (rootWidget == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(step).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param0, (byte) 55, param1)) {
            this.a(param0, param3, true, param1);
            this.a(param3, -121, param1, param0);
          }
          if (param2 != 26477) {
            this.handleKey((Widget) null, -91, '￨', -125);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hs.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ArrayWidgetContainer(int x, int y, int width, int height, WidgetPainter painter) {
        super(x, y, width, height, painter, (WidgetListener) null);
    }

    final boolean focusBackwardBy(byte obfuscationGuard, Widget rootWidget, int step) {
        int childIndex = 0;
        RuntimeException failure = null;
        Widget child = null;
        Widget focusedCandidate = null;
        int obfuscationControl = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Widget scannedChild;
        Widget previousChild;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.children) {
            return false;
          }
          if (obfuscationGuard <= 79) {
            ArrayWidgetContainer.b(45, -36);
          }
          childIndex = this.children.length - 1;
          while (0 <= childIndex) {
            child = this.children[childIndex];
            focusedCandidate = child;
            scannedChild = child;
            if (child != null &&
              child.isFocused(false)) {
              for (childIndex = childIndex - step; childIndex >= 0; childIndex = childIndex - step) {
                previousChild = this.children[childIndex];
                if (previousChild != null &&
                  previousChild.takeFocus(11, rootWidget)) {
                  return true;
                }
              }
            }
            childIndex--;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_24_0 = failure;
          stackIn_24_1 = new StringBuilder().append("hs.CA(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(step).append(')').toString());
        }
    }

    boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        int var6 = 0;
        Widget[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        Widget var7 = null;
        int var8 = 0;
        Widget[] var9 = null;
        boolean stackIn_16_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          var9 = this.children;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (var7 != null &&
              var7.isFocused(false) &&
              var7.handleKey(rootWidget, keyCode, character, -12215)) {
              return true;
            }
          }
          var5_int = keyCode;
          if (var5_int != 80) {
            if (obfuscationGuard == -12215) {
              return false;
            }
            field_E = (String[]) null;
            return false;
          }
          if (!br.heldKeys[81]) {
            stackIn_16_0 = this.focusNextChild(-57, rootWidget);
          } else {
            stackIn_16_0 = this.focusPreviousChild((byte) 88, rootWidget);
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("hs.F(");
          if (rootWidget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    abstract void layoutChildren(byte obfuscationGuard);

    private final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var6 = 0;
        StringBuilder discarded$6 = null;
        int var8 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$7 = null;
        Widget var7 = null;
        int var9 = 0;
        Widget[] var10 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.children == null) {
            return;
          }
          var10 = this.children;
          if (param1 >= -95) {
            return;
          }
          for (var6 = 0; var6 < var10.length; var6++) {
            var7 = var10[var6];
            discarded$6 = param2.append('\n');
            for (var8 = 0; param3 >= var8; var8++) {
              discarded$8 = param2.append(' ');
            }
            if (var7 != null) {
              var7.a(param3 + 1, param2, 26477, param0);
            } else {
              discarded$7 = param2.append("null");
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("hs.MA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        if (param1 < 0) {
          return;
        }
        int var2 = 0 % ((43 - param0) / 60);
        param1 = uc.spellDefinitions[param1][8];
        if (param1 < 0) {
          return;
        }
        PcmSample var3 = MoveAttackRequest.field_v[param1];
        if (var3 != null &&
          0 != var3.samples.length) {
          RadialSummonMenu.playDefaultSoundWithIntGuard(127, var3);
        }
    }

    final String getTooltipText(int obfuscationGuard) {
        int var3 = 0;
        Widget[] var2;
        Widget var4;
        int var6;
        String var5;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.children) {
          return null;
        }
        var2 = this.children;
        if (obfuscationGuard != 21384) {
          return (String) null;
        }
        for (var3 = 0; var2.length > var3; var3++) {
          var4 = var2[var3];
          if (var4 != null) {
            var5 = var4.getTooltipText(21384);
            if (var5 != null) {
              return var5;
            }
          }
        }
        return null;
    }

    final boolean isFocused(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return true;
        }
        return null != this.getFocusedChild((byte) -86) ? true : false;
    }

    boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        int var9 = 0;
        Widget[] var8 = null;
        RuntimeException var8_ref = null;
        Widget var10 = null;
        int var11 = 0;
        Widget[] var12 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.children == null) {
            return false;
          }
          if (obfuscationGuard <= 103) {
            return true;
          }
          var12 = this.children;
          var8 = var12;
          for (var9 = 0; var12.length > var9; var9++) {
            var10 = var12[var9];
            if (var10 != null &&
              var10.pointerPressed(pointerX, this.x + originX, this.y + originY, 108, rootWidget, pointerY, button)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_18_0 = var8_ref;
          stackIn_18_1 = new StringBuilder().append("hs.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    public static void i(int param0) {
        if (param0 != 0) {
          return;
        }
        field_E = null;
        field_G = null;
        field_F = null;
        field_H = null;
        field_I = null;
        field_D = null;
    }

    final void blur(int obfuscationGuard) {
        int var3 = 0;
        Widget[] var2;
        Widget var4;
        int var5;
        Widget[] var6;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 1) {
          field_D = (String) null;
        }
        var6 = this.children;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            var4.blur(1);
          }
        }
    }

    final boolean focusPreviousChild(byte obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 88) {
            field_H = (IconLabelControl) null;
          }
          stackIn_3_0 = this.focusBackwardBy((byte) 99, rootWidget, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hs.HA(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, obfuscationGuard, height);
        this.layoutChildren((byte) 121);
    }

    private final Widget getFocusedChild(byte obfuscationGuard) {
        int childIndex = 0;
        Widget[] childArray;
        Widget child;
        int obfuscationControl;
        Widget[] retainedChildren;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.children == null) {
          return null;
        }
        retainedChildren = this.children;
        childArray = retainedChildren;
        for (childIndex = 0; childIndex < retainedChildren.length; childIndex++) {
          child = retainedChildren[childIndex];
          if (child != null &&
            child.isFocused(false)) {
            return child;
          }
        }
        if (obfuscationGuard > -64) {
          return (Widget) null;
        }
        return null;
    }

    final void pointerReleased(int originY, Widget rootWidget, int pointerX, byte obfuscationGuard, int pointerY, int originX) {
        int var8 = 0;
        Widget[] var7 = null;
        int var9 = 0;
        Widget var10 = null;
        int var11 = 0;
        Widget[] var12 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.children == null) {
            return;
          }
          var12 = this.children;
          var7 = var12;
          var9 = 100 / ((obfuscationGuard + 58) / 53);
          for (var8 = 0; var12.length > var8; var8++) {
            var10 = var12[var8];
            if (var10 != null) {
              var10.pointerReleased(this.y + originY, rootWidget, pointerX, (byte) -126, pointerY, this.x + originX);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_12_0 = var7_ref;
          stackIn_12_1 = new StringBuilder().append("hs.JA(").append(originY).append(',');
          if (rootWidget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(pointerX).append(',').append(obfuscationGuard).append(',').append(pointerY).append(',').append(originX).append(')').toString());
        }
    }

    boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        int var4 = 0;
        Widget[] var3 = null;
        RuntimeException var3_ref = null;
        Widget var5 = null;
        int var6 = 0;
        Widget[] var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 11) {
            return false;
          }
          var7 = this.children;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null &&
              var5.takeFocus(11, rootWidget)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hs.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean focusNextChild(int obfuscationGuard, Widget rootWidget) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 41 / ((2 - obfuscationGuard) / 58);
          stackIn_1_0 = this.focusForwardBy(rootWidget, 1, true);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("hs.GA(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (ResourceProtocolClient.effectsGain >= 224) {
          mh.setEffectsGain(256, (byte) -60);
        } else {
          var1 = ResourceProtocolClient.effectsGain % 32;
          mh.setEffectsGain(ResourceProtocolClient.effectsGain + 32 - var1, (byte) -36);
        }
        if (param0 != 30) {
          field_H = (IconLabelControl) null;
        }
    }

    static {
        field_I = "/";
        field_D = "Options";
        field_E = new String[]{"turntime_icons", "mapsize_icons", "gamelength_icons", "maptype_icons", "team_icons", "equipment_icons"};
        field_G = new int[]{20, 30, 40, 60, 10};
    }
}
