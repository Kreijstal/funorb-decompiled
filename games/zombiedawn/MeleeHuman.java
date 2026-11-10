/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeleeHuman extends Human {
    static int[] field_wb;
    static String field_Ab;
    private Zombie field_yb;
    static int[] field_zb;
    static int field_xb;

    final void drawDebugOverlay(Camera param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          Rasterizer.drawCircleOutline(param0.worldToScreenX(this.getX(true), (byte) -124), param0.worldToScreenY(this.getY(237239984), 0), 250, 16711680);
          Rasterizer.drawCircleOutline(param0.worldToScreenX(this.getX(true), (byte) -79), param0.worldToScreenY(this.getY(237239984), param1 - 5060), 55, 16711935);
          var3_int = 0;
          do {
            if (!(this.field_ub > var3_int)) {
              if (param1 != 5060) {
                return;
              }
              break;
            }
            var4 = param0.worldToScreenX(this.field_jb[var3_int], (byte) -78);
            var5 = param0.worldToScreenY(this.field_gb[var3_int], param1 ^ 5060);
            Rasterizer.fillRect(-1 + var4, var5 - 1, 3, 3, 0);
            Rasterizer.setPixel(var4, var5, 65280);
            var3_int++;
          } while (var6 == 0);
          if (null != this.field_yb) {
            Rasterizer.drawLine(param0.worldToScreenX(this.getX(true), (byte) -122), param0.worldToScreenY(this.getY(237239984), 0), param0.worldToScreenX(this.field_yb.getX(true), (byte) -60), param0.worldToScreenY(this.field_yb.getY(param1 + 237234924), 0), 65280);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("po.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updateBehaviour(byte param0) {
        Zombie discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 52) {
            discarded$1 = this.findNearestVisibleZombie((byte) 55);
          }
          if (!this.isZombieThreatNear(false, false, -85, 55)) {
            if (!this.isZombieThreatNear(true, false, -102, 250)) {
              return;
            }
            if (1 == this.state) {
              return;
            }
            this.startFleeing(-123);
            if (ZombieDawn.field_J == 0) {
              return;
            }
          }
          this.startSwingAtZombie(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "po.I(" + param0 + ')');
        }
    }

    final void tick(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          super.tick(120);
          if (this.state == 10) {
            if (this.field_G == 0 &&
              this.field_N == 5) {
              this.field_U = SoundEffectPlayer.playSoundEffect((byte) 18, 12);
            }
            if (this.field_G == 1) {
              if (this.field_yb != null) {
                this.field_yb.knockBackFrom(401408, this.getY(237239984), this.getX(true));
                this.field_yb = null;
                if ((ZombieDawn.field_J != 0) &&
                  (this.field_G == 2)) {
                  this.setState(0, -6904);
                }
              }
            } else {
              if (this.field_G == 2) {
                this.setState(0, -6904);
              }
            }
          }
          if (param0 <= 95) {
            field_wb = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "po.A(" + param0 + ')');
        }
    }

    public static void clearStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_zb = null;
          field_Ab = null;
          if (param0 != -31113) {
            MeleeHuman.renderMeshFaces(69, -111, false, 104, (TriangleMesh) null);
          }
          field_wb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "po.D(" + param0 + ')');
        }
    }

    private final void startSwingAtZombie(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_10_1 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_yb = this.findNearestVisibleZombie((byte) -95);
          if (this.field_yb == null) {
            return;
          }
          var2_int = this.field_yb.getX(param0) - this.getX(true);
          var3 = this.field_yb.getY(237239984) - this.getY(237239984);
          boolean decompiledSharedTail0 = !(Math.abs(var3) > Math.abs(var2_int));
          if (!decompiledSharedTail0) {
            if (0 < var3) {
              stackIn_10_1 = 2;
            } else {
              stackIn_10_1 = 0;
            }
            this.field_S = stackIn_10_1;
            decompiledSharedTail0 = (ZombieDawn.field_J != 0);
          }
          if (decompiledSharedTail0) {
            if (var2_int <= 0) {
              stackIn_17_1 = 3;
            } else {
              stackIn_17_1 = 1;
            }
            this.field_S = stackIn_17_1;
          }
          this.setState(10, -6904);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "po.C(" + param0 + ')');
        }
    }

    MeleeHuman(int param0, int param1, int param2) {
        super(param0, param1, param2, 200704);
        this.field_yb = null;
        try {
          this.field_ub = 21;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "po.<init>(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void renderMeshFaces(int param0, int param1, boolean param2, int param3, TriangleMesh param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        int stackIn_39_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = ZombieDawn.field_J;
        try {
          var5_int = IterableNodeHashTable.bitLength((param3 - param1) * 3, (byte) -95);
          var6 = 3 * param1;
          AchievementsScreen.clearBucketCounts(param0 ^ -30006);
          var7 = var5_int - 10;
          if (param4.field_p > 0 &&
            null != param4.field_F) {
            MeshDepthBuckets.clearMeshDepthBuckets(91);
          }
          ArrayWidgetContainer.field_A = 0;
          var8 = param0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_c > var8)))) {
            var9 = param4.field_g[var8];
            var10 = param4.field_H[var8];
            var11 = param4.field_r[var8];
            stackOut_10_0 = param2;
            stackIn_49_0 = stackOut_10_0 ? 1 : 0;
            stackIn_11_0 = stackOut_10_0;
            if (var19 == 0) {
              if (stackIn_11_0) {
                var12 = IntroSpeedHelpers.field_a[var9];
                var13 = MinigunGunner.field_Nb[var9];
                var14 = -var12 + IntroSpeedHelpers.field_a[var10];
                var15 = -var12 + IntroSpeedHelpers.field_a[var11];
                var16 = -var13 + MinigunGunner.field_Nb[var10];
                var17 = MinigunGunner.field_Nb[var11] - var13;
              }
              if (!stackIn_11_0 ||
                !(0 <= var14 * var17 - var15 * var16)) {
                var12Lifetime1 = ArchiveRequest.field_s[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = ArchiveRequest.field_s[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = ArchiveRequest.field_s[var11];
                    if (-2147483648 != var14) {
                      var15 = var14 + var12Lifetime1 + var13Lifetime1 - var6;
                      if (var7 < 0) {
                        stackIn_29_0 = var15 << -var7;
                      } else {
                        stackIn_29_0 = var15 >> var7;
                      }
                      var16 = -stackIn_29_0 + OffsetHelpers.field_b.length - 1;
                      var17 = OffsetHelpers.field_b[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_39_0 = var16;
                          if (stackIn_39_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = OffsetHelpers.field_b[var16];
                          continue;
                        }
                        stackIn_39_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_39_0Lifetime1;
                        RasterState.field_o[var18] = var8;
                        OffsetHelpers.field_b[var16] = 1 + var17;
                        if (param4.field_p > 0 &&
                          null != param4.field_F) {
                          dupTemp$0 = param4.field_F[var8];
                          MenuSelection.field_f[dupTemp$0] = MenuSelection.field_f[dupTemp$0] + 1;
                        }
                        ArrayWidgetContainer.field_A = ArrayWidgetContainer.field_A + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_49_0 = ~param4.field_p;
          }
          if (stackIn_49_0 < -1 &&
            null != param4.field_F) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(MenuSelection.field_f.length <= var9Lifetime1)) {
              var10Lifetime1 = MenuSelection.field_f[var9Lifetime1];
              MenuSelection.field_f[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_65_0 = var5;
          stackIn_65_1 = new StringBuilder().append("po.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final static void selectLevelResources(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          LevelNavigation.field_o = MenuSpriteGlobals.field_b[param1];
          if (param0 != -1) {
            field_Ab = (String) null;
          }
          SoundEffectNode.field_h = Zombie.field_Fb[param1];
          if (null != MoveTargetMarker.field_j[param1]) {
            FullscreenFocusCanvas.field_c = MoveTargetMarker.field_j[param1];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "po.F(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean isGuestSession(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 13296) {
            MeleeHuman.selectLevelResources(-73, 6);
          }
          stackIn_4_0 = FullscreenErrorDialog.field_Y;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "po.E(" + param0 + ')');
        }
    }

    private final Zombie findNearestVisibleZombie(byte param0) {
        Object var2 = null;
        int var3 = 0;
        IntrusiveNode var4 = null;
        int var10 = 0;
        Object stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var10 = ZombieDawn.field_J;
        try {
          var2 = null;
          var3 = -1;
          if (param0 > -60) {
            field_wb = (int[]) null;
          }
          var4 = Js5Archive.field_e.zombies.last((byte) 26);
          while (var4 instanceof WorldObject) {
            if (var4 instanceof Zombie &&
              ((Zombie) (var4)).state != 8 &&
              ((Zombie) (var4)).isVisibleToHumans(37)) {
              var5 = ((Zombie) (var4)).getX(true);
              var6 = ((Zombie) (var4)).getY(237239984);
              var7 = -var5 + this.getX(true);
              var8 = -var6 + this.getY(237239984);
              var9 = var8 * var8 + var7 * var7;
              if (var9 < var3 ||
                -1 == var3) {
                var3 = var9;
                var2 = (Zombie) (var4);
              }
            }
            var4 = var4.previous;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          stackIn_22_0 = var2;
          return (Zombie) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) (var2), "po.G(" + param0 + ')');
        }
    }

    static {
        field_Ab = "Start Game";
        field_wb = new int[]{39, 38};
        field_zb = new int[8192];
    }
}
