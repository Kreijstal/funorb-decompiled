/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapRepository {
    static int field_c;
    static String field_f;
    static char[] field_a;
    static DiskCacheWorker field_h;
    private NodeDeque[][] mapsByThemeAndSize;
    private MapLayout[] tutorialMaps;
    static String field_g;
    private ResourceArchive[] archives;
    private boolean bypassMembershipChecks;
    static String field_j;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_j = null;
          field_g = null;
          if (param0 != 4116) {
            MapRepository.a(-15);
          }
          field_h = null;
          field_f = null;
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "ou.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        fh.field_i = false;
        ac.field_n = false;
        if (!param0) {
          return;
        }
        try {
          gl.a(127, -1);
          ChannelBaseVolumeConsoleCommand.field_L = SpriteScrollBar.nameCheckResultConsumed;
          mh.accountNameCheckState = SpriteScrollBar.nameCheckResultConsumed;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ou.M(" + param0 + ')');
        }
    }

    private final void installArchive(int obfuscationGuard, int archiveGroup, ResourceArchive archive) {
        RuntimeException var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 24402) {
            this.bypassMembershipChecks = false;
          }
          if (null != this.archives &&
            2 <= this.archives.length) {
            if (archiveGroup != 0 &&
              archiveGroup != 1) {
              return;
            }
            if (LoginForm.memberEntitlementValue <= 0 &&
              archiveGroup == 1 &&
              !this.bypassMembershipChecks) {
              return;
            }
            this.archives[archiveGroup] = archive;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ou.I(").append(obfuscationGuard).append(',').append(archiveGroup).append(',');
          if (archive == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void showEmptyLogin(byte obfuscationGuard) {
        if (obfuscationGuard <= 114) {
          return;
        }
        try {
          vi.showLoginWithDescription("", 640, (String) null);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ou.D(" + obfuscationGuard + ')');
        }
    }

    final int countAvailableMaps(int initialCount, int mapSizeSetting, int mapTheme, int minimumPlayerCapacity) {
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int matchingCount = 0;
        RuntimeException var5 = null;
        NodeIterator maps = null;
        MapLayout map = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.mapsByThemeAndSize != null &&
            mapTheme >= 0 &&
            this.mapsByThemeAndSize.length > mapTheme) {
            if (this.mapsByThemeAndSize[mapTheme] != null &&
              mapSizeSetting >= 0 &&
              this.mapsByThemeAndSize[mapTheme].length > mapSizeSetting) {
              if (null == this.mapsByThemeAndSize[mapTheme][mapSizeSetting]) {
                stackIn_25_0 = 0;
                return stackIn_25_0;
              }
              matchingCount = initialCount;
              maps = new NodeIterator(this.mapsByThemeAndSize[mapTheme][mapSizeSetting]);
              map = (MapLayout) (maps.first(initialCount + 50));
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (null == map))) {
                stackIn_36_0 = map.playerCapacity;
                if (obfuscationControl == 0) {
                  if (stackIn_36_0 >= minimumPlayerCapacity) {
                    matchingCount++;
                  }
                  map = (MapLayout) (maps.next(initialCount + 50));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_36_0 = matchingCount;
              }
              return stackIn_36_0;
            }
            stackIn_20_0 = 0;
            return stackIn_20_0;
          }
          stackIn_9_0 = 0;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var5), "ou.H(" + initialCount + ',' + mapSizeSetting + ',' + mapTheme + ',' + minimumPlayerCapacity + ')');
        }
    }

    private final void loadTutorialMaps(byte obfuscationGuard) {
        int tutorialIndex = 0;
        byte[] encodedMap = null;
        int obfuscationControl = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.tutorialMaps = new MapLayout[AdaptiveMidiPcmStream.tutorialMapNames.length];
          tutorialIndex = 0;
          if (obfuscationGuard <= 110) {
            this.loadTutorialMaps((byte) -41);
          }
          while (AdaptiveMidiPcmStream.tutorialMapNames.length > tutorialIndex) {
            encodedMap = this.archives[0].getFileByName(AdaptiveMidiPcmStream.tutorialMapNames[tutorialIndex], 35, "");
            if (obfuscationControl != 0) {
              return;
            }
            if (encodedMap != null &&
              encodedMap.length != 0) {
              this.tutorialMaps[tutorialIndex] = new MapLayout(-1, encodedMap);
              tutorialIndex++;
              continue;
            } else {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ou.F(" + obfuscationGuard + ')');
        }
    }

    final MapLayout selectAvailableMap(int minimumPlayerCapacity, int obfuscationGuard, int mapSizeSetting, int mapTheme, int matchingOrdinal) {
        Object stackIn_12_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_42_0 = null;
        MapLayout stackIn_45_0 = null;
        Object stackIn_50_0 = null;
        MapLayout stackIn_67_0 = null;
        RuntimeException decompiledCaughtException = null;
        NodeIterator maps = null;
        RuntimeException var6_ref = null;
        MapLayout map = null;
        int matchingIndex = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != this.mapsByThemeAndSize &&
            mapTheme >= 0 &&
            mapTheme < this.mapsByThemeAndSize.length &&
            AttackEvent.mapNamesByThemeAndSize.length > mapTheme) {
            if (null != this.mapsByThemeAndSize[mapTheme] &&
              0 <= mapSizeSetting &&
              mapSizeSetting < this.mapsByThemeAndSize[mapTheme].length) {
              if (this.mapsByThemeAndSize.length == AttackEvent.mapNamesByThemeAndSize.length &&
                AttackEvent.mapNamesByThemeAndSize[mapTheme].length == this.mapsByThemeAndSize[mapTheme].length) {
                if (mapTheme == 1 &&
                  !this.bypassMembershipChecks &&
                  LoginForm.memberEntitlementValue < 0) {
                  stackIn_42_0 = null;
                  return (MapLayout) (stackIn_42_0);
                }
                if (obfuscationGuard != 4136) {
                  stackIn_45_0 = (MapLayout) null;
                  return stackIn_45_0;
                }
                if (null == this.mapsByThemeAndSize[mapTheme][mapSizeSetting]) {
                  stackIn_50_0 = null;
                  return (MapLayout) (stackIn_50_0);
                }
                maps = new NodeIterator(this.mapsByThemeAndSize[mapTheme][mapSizeSetting]);
                map = (MapLayout) (maps.first(obfuscationGuard - 4086));
                matchingIndex = 0;
                while (map != null) {
                  if (!(minimumPlayerCapacity <= map.playerCapacity) ||
                    ~matchingIndex != ~matchingOrdinal ||
                    obfuscationControl != 0) {
                    if (minimumPlayerCapacity <= map.playerCapacity) {
                      matchingIndex++;
                    }
                    map = (MapLayout) (maps.next(50));
                    if (obfuscationControl == 0) {
                      continue;
                    }
                  }
                  break;
                }
                stackIn_67_0 = map;
                return stackIn_67_0;
              }
              stackIn_31_0 = null;
              return (MapLayout) (stackIn_31_0);
            }
            stackIn_23_0 = null;
            return (MapLayout) (stackIn_23_0);
          }
          stackIn_12_0 = null;
          return (MapLayout) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6_ref), "ou.K(" + minimumPlayerCapacity + ',' + obfuscationGuard + ',' + mapSizeSetting + ',' + mapTheme + ',' + matchingOrdinal + ')');
        }
    }

    final static void a(pu param0, boolean param1, boolean param2, boolean param3, boolean param4, int[] param5, int[] param6) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param6[3] >> 2;
          var22 = param6[4] >> 2;
          var23 = param6[5] >> 2;
          var24 = param6[6] >> 2;
          var25 = param6[7] >> 2;
          var26 = param6[8] >> 2;
          var27 = param6[9] >> 2;
          var28 = param6[10] >> 2;
          var12 = param5[3] * var21 + param5[4] * var22 + param5[5] * var23 >> 14;
          var29 = param6[11] >> 2;
          var13 = param5[5] * var26 + (var25 * param5[4] + var24 * param5[3]) >> 14;
          var18 = var22 * param5[10] + var21 * param5[9] + var23 * param5[11] >> 14;
          var16 = var24 * param5[6] + param5[7] * var25 + param5[8] * var26 >> 14;
          var17 = var29 * param5[8] + (param5[6] * var27 + var28 * param5[7]) >> 14;
          var14 = param5[5] * var29 + var27 * param5[3] + var28 * param5[4] >> 14;
          var15 = param5[7] * var22 + (param5[6] * var21 + param5[8] * var23) >> 14;
          var19 = param5[9] * var24 + (param5[10] * var25 + var26 * param5[11]) >> 14;
          var20 = param5[10] * var28 + var27 * param5[9] + var29 * param5[11] >> 14;
          var21 = -param6[0] + param5[0];
          var22 = -param6[1] + param5[1];
          var23 = param5[2] - param6[2];
          var9 = param6[5] * var23 + (param6[4] * var22 + param6[3] * var21) >> -EditableTextWidget.field_M + 16;
          if (!param2) {
            return;
          }
          var11 = var23 * param6[11] + var22 * param6[10] + var21 * param6[9] >> 16;
          var10 = param6[6] * var21 + param6[7] * var22 + param6[8] * var23 >> -EditableTextWidget.field_M + 16;
          var21 = TriangleRasterizer.projectionCenterX;
          var22 = TriangleRasterizer.projectionCenterY;
          var23 = 0;
          scanLoop1: while (true) {
            if (var23 < param0.field_O) {
              var24 = param0.field_z[var23];
              var25 = param0.field_y[var23];
              var26 = param0.field_o[var23];
              var27 = (var18 * var26 + (var24 * var12 + var25 * var15) >> -EditableTextWidget.field_M + 16) + var9;
              var28 = (var13 * var24 + var25 * var16 + var19 * var26 >> -EditableTextWidget.field_M + 16) + var10;
              var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 16) + var11;
              stackIn_59_0 = 50;
              stackIn_59_1 = var29;
              if (var30 != 0) {
                if (stackIn_59_0 > stackIn_59_1) {
                  if (var18 >= ArmiesOfGielinor.field_I.length) {
                    break scanLoop1;
                  }
                  var19 = param0.field_l[var18];
                  var20 = param0.field_f[var18];
                  var21 = param0.field_x[var18];
                  ArmiesOfGielinor.field_I[var18] = var12 * var20 + (var19 * var9 + var21 * var15) >> 16;
                  Widget.field_m[var18] = var16 * var21 + var10 * var19 + var20 * var13 >> 16;
                  StripedProgressWidget.field_Q[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                  var18++;
                  break scanLoop1;
                }
                break scanLoop1;
              }
              if (stackIn_59_0 > stackIn_59_1) {
                FullscreenDisplayMode.field_c[var23] = -2147483648;
              } else {
                TileMetadata.field_f[var23] = var21 + var27 / var29;
                BoundedUrlRequest.field_k[var23] = var28 / var29 + var22;
                FullscreenDisplayMode.field_c[var23] = var29;
                if (var29 > var8) {
                  var8 = var29;
                }
                if (var7_int > var29) {
                  var7_int = var29;
                }
              }
              if (param4) {
                uh.field_f[var23] = var27 >> EditableTextWidget.field_M;
                ArchiveProvider.field_a[var23] = var28 >> EditableTextWidget.field_M;
                qt.field_c[var23] = var29;
              }
              var23++;
              continue;
            }
            if (null != param0.field_g &&
              param0.field_M != null &&
              param0.field_v != null &&
              param0.field_N != null &&
              null != param0.field_a &&
              param0.field_n != null &&
              param0.field_m != null &&
              param0.field_F != null &&
              param0.field_I != null) {
              var23 = 0;
              while (!(var23 >= param0.field_q)) {
                var24 = param0.field_g[var23];
                var25 = param0.field_M[var23];
                var26 = param0.field_v[var23];
                UiSelectionState.field_c[var23] = (var26 * var18 + (var24 * var12 + var15 * var25) >> 16) + var9;
                AiActionCandidate.field_p[var23] = (var26 * var19 + var13 * var24 + var16 * var25 >> 16) + var10;
                CacheEntry.field_u[var23] = (var24 * var14 + (var17 * var25 + var26 * var20) >> 16) + var11;
                var24 = param0.field_N[var23];
                var25 = param0.field_a[var23];
                var26 = param0.field_n[var23];
                TextLayout.field_c[var23] = (var18 * var26 + (var12 * var24 + var15 * var25) >> 16) + var9;
                ji.field_c[var23] = var10 + (var13 * var24 + (var16 * var25 + var26 * var19) >> 16);
                fl.field_f[var23] = (var26 * var20 + var24 * var14 + var25 * var17 >> 16) + var11;
                var24 = param0.field_m[var23];
                var25 = param0.field_F[var23];
                var26 = param0.field_I[var23];
                dj.field_b[var23] = (var26 * var18 + var12 * var24 + var15 * var25 >> 16) + var9;
                li.field_k[var23] = var10 + (var16 * var25 + var24 * var13 + var19 * var26 >> 16);
                is.field_e[var23] = var11 + (var26 * var20 + (var25 * var17 + var24 * var14) >> 16);
                var23++;
                if (var30 != 0) {
                  return;
                }
              }
            }
            if (param1) {
              var9 = param5[3];
              var10 = param5[4];
              var11 = param5[5];
              var12 = param5[6];
              var13 = param5[7];
              var14 = param5[8];
              var15 = param5[9];
              var16 = param5[10];
              var17 = param5[11];
              var18 = 0;
              do {
                stackIn_59_0 = param0.field_t;
                stackIn_59_1 = var18;
                if (stackIn_59_0 <= stackIn_59_1) {
                  break;
                }
                if (var18 >= ArmiesOfGielinor.field_I.length) {
                  break;
                }
                var19 = param0.field_l[var18];
                var20 = param0.field_f[var18];
                var21 = param0.field_x[var18];
                ArmiesOfGielinor.field_I[var18] = var12 * var20 + (var19 * var9 + var21 * var15) >> 16;
                Widget.field_m[var18] = var16 * var21 + var10 * var19 + var20 * var13 >> 16;
                StripedProgressWidget.field_Q[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                var18++;
              } while (var30 == 0);
            }
            break;
          }
          et.a(param0, -10, param3, var7_int, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("ou.L(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param6 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    private final int findArchiveGroup(int obfuscationGuard, int mapTheme) {
        int archiveGroup = 0;
        RuntimeException var3 = null;
        int groupIndex = 0;
        int themeIndex = 0;
        int obfuscationControl = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackIn_23_0Lifetime1;
        int stackIn_23_1Lifetime1;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          archiveGroup = -1;
          groupIndex = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (groupIndex <= 1) {
              stackIn_31_0 = -1;
              stackIn_31_1 = ~groupIndex;
              if (obfuscationControl != 0) {
                break scanLoop1;
              }
              if (stackIn_31_0 >= stackIn_31_1 &&
                groupIndex < lp.mapThemesByArchive.length) {
                themeIndex = 0;
                while (lp.mapThemesByArchive[groupIndex].length > themeIndex) {
                  stackIn_23_0 = ~lp.mapThemesByArchive[groupIndex][themeIndex];
                  stackIn_23_1 = ~mapTheme;
                  if (stackIn_23_0 == stackIn_23_1) {
                    archiveGroup = groupIndex;
                  } else {
                    themeIndex++;
                    continue;
                  }
                  break;
                }
                stackIn_23_0Lifetime1 = 0;
                stackIn_23_1Lifetime1 = archiveGroup;
                decompiledFrameRemainder0 = (!(stackIn_23_0Lifetime1 <= stackIn_23_1Lifetime1) ||
                  obfuscationControl != 0);
                if (decompiledFrameRemainder0) {
                  groupIndex++;
                  continue scanLoop1;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_11_0 = -1;
                return stackIn_11_0;
              }
            }
            stackIn_31_0 = obfuscationGuard;
            stackIn_31_1 = archiveGroup;
            break;
          }
          if (stackIn_31_0 != stackIn_31_1 &&
            1 != archiveGroup) {
            stackIn_38_0 = -1;
            return stackIn_38_0;
          }
          stackIn_40_0 = archiveGroup;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ou.C(" + obfuscationGuard + ',' + mapTheme + ')');
        }
    }

    private final ResourceArchive getArchiveForTheme(int obfuscationGuard, int mapTheme) {
        int archiveGroup = 0;
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_30_0 = null;
        ResourceArchive stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.archives != null &&
            this.archives.length == 2) {
            if (mapTheme >= 0 &&
              AttackEvent.mapNamesByThemeAndSize.length > mapTheme) {
              archiveGroup = this.findArchiveGroup(0, mapTheme);
              if (~archiveGroup != obfuscationGuard &&
                archiveGroup != 1) {
                stackIn_21_0 = null;
                return (ResourceArchive) (stackIn_21_0);
              }
              if (archiveGroup == 1 &&
                !this.bypassMembershipChecks &&
                0 >= LoginForm.memberEntitlementValue) {
                stackIn_30_0 = null;
                return (ResourceArchive) (stackIn_30_0);
              }
              stackIn_32_0 = this.archives[archiveGroup];
              return stackIn_32_0;
            }
            stackIn_13_0 = null;
            return (ResourceArchive) (stackIn_13_0);
          }
          stackIn_5_0 = null;
          return (ResourceArchive) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ou.J(" + obfuscationGuard + ',' + mapTheme + ')');
        }
    }

    private final void initializeMapLists(int obfuscationGuard) {
        NodeDeque[] sizeLists = null;
        int guardQuotient = 0;
        RuntimeException var2 = null;
        int mapTheme = 0;
        int obfuscationControl = 0;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.mapsByThemeAndSize = new NodeDeque[AttackEvent.mapNamesByThemeAndSize.length][];
          guardQuotient = 35 / ((70 - obfuscationGuard) / 47);
          mapTheme = 0;
          while (mapTheme < AttackEvent.mapNamesByThemeAndSize.length) {
            sizeLists = new NodeDeque[AttackEvent.mapNamesByThemeAndSize[mapTheme].length];
            this.mapsByThemeAndSize[mapTheme] = sizeLists;
            mapTheme++;
            if (obfuscationControl == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ou.N(" + obfuscationGuard + ')');
        }
    }

    private final void loadArchiveMaps(boolean obfuscationGuard, int archiveGroup) {
        int[] themeIndices = null;
        RuntimeException var3_ref = null;
        int themeIndex = 0;
        int mapTheme = 0;
        int sizeCount = 0;
        int sizeIndex = 0;
        int obfuscationControl = 0;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (archiveGroup != 0 &&
            archiveGroup != 1) {
            return;
          }
          if (0 >= LoginForm.memberEntitlementValue &&
            archiveGroup == 1 &&
            !this.bypassMembershipChecks) {
            return;
          }
          themeIndices = lp.mapThemesByArchive[archiveGroup];
          if (obfuscationGuard) {
            field_h = (DiskCacheWorker) null;
          }
          themeIndex = 0;
          while (themeIndex < themeIndices.length) {
            boolean decompiledFrameCompleted0 = true;
            mapTheme = themeIndices[themeIndex];
            if (mapTheme >= 0 && (!(mapTheme >= AttackEvent.mapNamesByThemeAndSize.length) ||
              obfuscationControl != 0)) {
              sizeCount = AttackEvent.mapNamesByThemeAndSize[mapTheme].length;
              sizeIndex = 0;
              while (sizeCount > sizeIndex) {
                this.loadMapList(5301, sizeIndex, mapTheme);
                sizeIndex++;
                if (obfuscationControl != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              themeIndex++;
            }
            if (obfuscationControl == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "ou.B(" + obfuscationGuard + ',' + archiveGroup + ')');
        }
    }

    final MapLayout getTutorialMap(byte obfuscationGuard, int tutorialIndex) {
        RuntimeException var3 = null;
        MapLayout stackIn_4_0 = null;
        MapLayout stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tutorialIndex < this.tutorialMaps.length) {
            stackIn_4_0 = this.tutorialMaps[tutorialIndex];
            return stackIn_4_0;
          }
          if (obfuscationGuard != 59) {
            field_c = 32;
          }
          stackIn_9_0 = this.tutorialMaps[0];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ou.E(" + obfuscationGuard + ',' + tutorialIndex + ')');
        }
    }

    MapRepository(ResourceArchive freeArchive, ResourceArchive memberArchive, boolean bypassMembershipChecks) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.archives = new ResourceArchive[2];
          this.bypassMembershipChecks = bypassMembershipChecks;
          this.installArchive(24402, 0, freeArchive);
          this.installArchive(24402, 1, memberArchive);
          this.initializeMapLists(-127);
          this.loadArchiveMaps(false, 0);
          this.loadArchiveMaps(false, 1);
          this.loadTutorialMaps((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ou.<init>(");
          if (freeArchive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (memberArchive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(bypassMembershipChecks).append(')').toString());
        }
    }

    private final void loadMapList(int obfuscationGuard, int mapSizeSetting, int mapTheme) {
        ResourceArchive archive = null;
        RuntimeException var4_ref = null;
        int mapIndex = 0;
        byte[] encodedMap = null;
        int obfuscationControl = 0;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          archive = this.getArchiveForTheme(obfuscationGuard ^ -5302, mapTheme);
          if (obfuscationGuard != 5301) {
            return;
          }
          if (archive == null) {
            return;
          }
          this.mapsByThemeAndSize[mapTheme][mapSizeSetting] = new NodeDeque();
          mapIndex = 0;
          while (AttackEvent.mapNamesByThemeAndSize[mapTheme][mapSizeSetting].length > mapIndex) {
            encodedMap = archive.getFileByName(AttackEvent.mapNamesByThemeAndSize[mapTheme][mapSizeSetting][mapIndex], obfuscationGuard - 5249, "");
            if (encodedMap != null && (encodedMap.length != 0 ||
              obfuscationControl != 0)) {
              this.mapsByThemeAndSize[mapTheme][mapSizeSetting].addLast((byte) -119, (IntrusiveNode) (new MapLayout(mapIndex, encodedMap)));
            }
            mapIndex++;
            if (obfuscationControl == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "ou.G(" + obfuscationGuard + ',' + mapSizeSetting + ',' + mapTheme + ')');
        }
    }

    static {
        field_a = new char[]{'€', '\0', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\0', 'Ž', '\0', '\0', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\0', 'ž', 'Ÿ'};
        field_f = "Played";
        field_c = 0;
        field_g = "Hide lobby chat";
        field_j = "Equipment Stock";
    }
}
