/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class LevelObstacle extends WorldObject {
    boolean field_P;
    int field_F;
    private PcmSampleStream field_K;
    static int field_I;
    static int field_N;
    boolean field_J;
    private boolean field_G;
    static int field_D;
    int field_E;
    private boolean field_O;
    static String field_L;
    static int field_M;

    final boolean shatterIfFragile(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        if (!param0) {
          Camera var5 = (Camera) null;
          this.draw((byte) -30, (Camera) null);
        }
        for (var3 = 0; var3 < GameResourceLoader.field_g.length; var3++) {
          if (this.field_F == GameResourceLoader.field_g[var3]) {
            if (param1 &&
              !SoundEffectLibrary.field_h[var3]) {
              return false;
            }
            this.field_F = Tree.field_U[var3];
            if (this.field_z > 0) {
              Js5Archive.field_e.field_u[this.field_z - 1] = Js5Archive.field_e.field_u[this.field_z - 1] - 1;
            }
            this.field_z = 0;
            return true;
          }
        }
        return false;
    }

    void draw(byte param0, Camera param1) {
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 > -76) {
            this.openDoor(true);
          }
          var3_int = param1.worldToScreenX(this.getX(true), (byte) -118);
          var4 = param1.worldToScreenY(this.getY(237239984), 0) - 24;
          if (this.field_O && (var3_int < -48 ||
            var4 < -48 ||
            !(var3_int <= MoveTargetMarker.field_d) ||
            !(ArrivingPassenger.field_Bb >= var4 - 24))) {
            return;
          }
          if (!this.field_O && (var3_int < -48 ||
            var4 < -48 ||
            !(MoveTargetMarker.field_d >= var3_int) ||
            !(var4 <= ArrivingPassenger.field_Bb))) {
            return;
          }
          if (SoundEffectNode.field_h.length < this.field_F) {
            return;
          }
          if (this.field_E <= 0) {
            if (!this.field_P) {
              if (!this.field_J) {
                SoundEffectNode.field_h[this.field_F].drawTransparent(var3_int, var4);
              } else {
                SoundEffectNode.field_h[this.field_F].drawVerticalFlip(var3_int, var4);
              }
            } else {
              SoundEffectNode.field_h[this.field_F].drawMirrored(var3_int, var4);
            }
            if (this.field_O) {
              if (!this.field_P) {
                if (!this.field_J) {
                  SoundEffectNode.field_h[-8 + this.field_F].drawTransparent(var3_int, -24 + var4);
                } else {
                  SoundEffectNode.field_h[-8 + this.field_F].drawVerticalFlip(var3_int, var4 - 24);
                }
              } else {
                SoundEffectNode.field_h[this.field_F - 8].drawMirrored(var3_int, -24 + var4);
              }
            }
          } else {
            if (LoginConnectionHelpers.field_e &&
              this.field_E > 0) {
              Rasterizer.fillCircle(8 + var3_int, 1 + var4, 14, AccountPromptTexts.field_e[-1 + this.field_E]);
            }
            if (!this.field_P) {
              SoundEffectNode.field_h[this.field_F].drawTintedGrayscale(var3_int, var4, AccountPromptTexts.field_e[this.field_E - 1]);
              if (this.field_O) {
                SoundEffectNode.field_h[-8 + this.field_F].drawTintedGrayscale(var3_int, -24 + var4, AccountPromptTexts.field_e[this.field_E - 1]);
              }
            } else {
              SpriteEffectHelpers.drawMirroredTinted(SoundEffectNode.field_h[this.field_F], var3_int, var4, AccountPromptTexts.field_e[-1 + this.field_E]);
              if (this.field_O) {
                SpriteEffectHelpers.drawMirroredTinted(SoundEffectNode.field_h[this.field_F - 8], var3_int, var4 - 24, AccountPromptTexts.field_e[this.field_E - 1]);
              }
            }
          }
          if (LaserBarrier.field_Q) {
            Js5Transport.field_k.drawStringCentered(BlastAffectedObject.substituteTemplateArguments(1938762664, "<%0>,<%1>", new String[]{Integer.toString(this.field_B), Integer.toString(this.field_u)}), 12 + var3_int, -5 + var4, 16777215, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_45_0 = var3;
          stackIn_45_1 = new StringBuilder().append("id.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 >= -33) {
          LevelObstacle.releaseStatics(45);
        }
        field_L = null;
    }

    private final void openDoor(boolean param0) {
        IntrusiveNode var2;
        int var3;
        int var4;
        int var5;
        LevelNavigation var6;
        LevelNavigation var7;
        var5 = ZombieDawn.field_J;
        if (0 == this.field_z) {
          return;
        }
        Js5Archive.field_e.field_u[-1 + this.field_z] = Js5Archive.field_e.field_u[-1 + this.field_z] - 1;
        if (0 >= Js5Archive.field_e.field_u[-1 + this.field_z]) {
          var2 = Js5Archive.field_e.zombies.sentinel.previous;
          while (var2 instanceof WorldObject) {
            if (var2 instanceof Human &&
              this.field_z == ((WorldObject) (var2)).field_z) {
              ((WorldObject) (var2)).field_z = 0;
            }
            var2 = var2.previous;
          }
        }
        this.field_E = this.field_z;
        this.field_z = 0;
        var6 = Js5Archive.field_e.navigation;
        var7 = var6;
        var3 = this.getX(param0) / 24;
        var4 = this.getY(237239984) / 24;
        if (this.getY(237239984) % 24 == 0) {
          var4--;
        }
        var6.field_A.tiles[var4][var3] = TextHotspotRegion.bitAnd(var6.field_A.tiles[var4][var3], -33554433);
        var7.field_A.setCellOpen(param0, 14365, var4, false, var3);
        var6.field_A.field_t[var4 - 1][var3] = TextHotspotRegion.bitAnd(var6.field_A.field_t[var4 - 1][var3], -33554433);
        if (this.field_O) {
          var6.field_A.tiles[-1 + var4][var3] = TextHotspotRegion.bitAnd(var6.field_A.tiles[-1 + var4][var3], -33554433);
          var7.field_A.setCellOpen(true, 14365, -1 + var4, false, var3);
          var6.field_A.field_t[var4 - 1][var3] = TextHotspotRegion.bitAnd(var6.field_A.field_t[var4 - 1][var3], -33554433);
        }
        this.field_F = this.field_F + 1;
        return;
    }

    static long bitOr(long param0, long param1) {
        return param0 | param1;
    }

    LevelObstacle(int param0, int param1, int param2) {
        super(param0, param1, param2);
        int[] var4;
        int var5;
        int var6;
        int[] var8;
        int[] var9;
        int[] var10;
        boolean stackIn_3_1 = false;
        boolean stackIn_6_1 = false;
        int var5Lifetime1;
        int var6Lifetime1;
        int[] var4Lifetime1;
        this.field_K = null;
        this.field_O = false;
        this.field_F = this.field_t;
        stackIn_3_1 = (0 != (1073741824 & this.field_t));
        this.field_P = stackIn_3_1;
        stackIn_6_1 = (0 != (this.field_t & 536870912));
        this.field_J = stackIn_6_1;
        this.field_F = this.field_F & -1610612737;
        this.field_F = this.field_F - 1;
        var10 = PendingRecordRequest.field_u;
        var9 = var10;
        var8 = var9;
        var4 = var8;
        for (var5 = 0; var10.length > var5; var5++) {
          var6 = var10[var5];
          if (~this.field_F == ~var6) {
            this.field_O = true;
          }
        }
        var4Lifetime1 = TickClock.field_c;
        for (var5Lifetime1 = 0; var5Lifetime1 < var4Lifetime1.length; var5Lifetime1++) {
          var6Lifetime1 = var4Lifetime1[var5Lifetime1];
          if (this.field_F == var6Lifetime1) {
            this.field_G = true;
          }
        }
    }

    void tick(int param0) {
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int var2;
        WorldObject var2_ref_fb;
        int var3;
        int var4_int;
        WorldObject var4;
        int var5;
        int var6;
        FrameSequence var7;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = ZombieDawn.field_J;
        if (param0 <= 95) {
          return;
        }
        if (Js5Archive.field_e.field_r < 400 &&
          Js5Archive.field_e.field_r > 200) {
          var2 = 0;
          while (!(var2 >= SoundEffectLibrary.field_h.length)) {
            if (this.field_F != GameResourceLoader.field_g[var2]) {
              var2++;
              continue;
            }
            if (Js5Archive.field_e.field_r >= 250 &&
              0 != GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 25, 1)) {
              break;
            }
            if (!this.shatterIfFragile(true, true)) {
              break;
            }
            var3 = this.getX(true) / 24;
            var4_int = this.getY(237239984) / 24;
            if (this.getY(237239984) % 24 == 0) {
              var4_int--;
            }
            Js5Archive.field_e.navigation.field_A.tiles[var4_int][var3] = TextHotspotRegion.bitAnd(Js5Archive.field_e.navigation.field_A.tiles[var4_int][var3], -33554433);
            Js5Archive.field_e.navigation.field_A.tiles[-1 + var4_int][var3] = TextHotspotRegion.bitAnd(Js5Archive.field_e.navigation.field_A.tiles[-1 + var4_int][var3], -33554433);
            Js5Archive.field_e.navigation.field_A.setCellOpen(true, 14365, var4_int, false, var3);
            Js5Archive.field_e.navigation.field_A.setCellOpen(true, 14365, var4_int - 1, false, var3);
            if (GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 2, 1) != 0) {
              break;
            }
            if (null != this.field_K) {
              Js5Transport.stopSoundEffect((byte) 13, this.field_K);
            }
            this.field_K = EmptyWidgetPainter.queueSoundEffect(GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 2, 1) + 64, false);
            break;
          }
        }
        if (this.field_z > 0) {
          this.field_E = this.field_z;
          var2_ref_fb = this.firstNearbyObject((byte) -74, 50, 1);
          while (var2_ref_fb != null) {
            if (~var2_ref_fb.field_z == ~this.field_z &&
              this.distanceSquaredTo(var2_ref_fb, 1654152400) < 2500) {
              var3Lifetime1 = this.field_z;
              Blast.handleTutorialEvent(-9, 6836);
              EmptyWidgetPainter.queueSoundEffect(93, false);
              EmptyWidgetPainter.queueSoundEffect(94, false);
              var4 = this.firstNearbyObject((byte) -74, 48, 4);
              while (var4 != null) {
                if (var3Lifetime1 == var4.field_z) {
                  ((LevelObstacle) (var4)).openDoor(true);
                }
                var4 = this.nextNearbyObject((byte) 32);
              }
              Js5Archive.field_e.onWallsChanged(true);
              RasterCanvasSizeTarget.buildPathDistanceGrid((byte) -81);
              break;
            }
            var2_ref_fb = this.nextNearbyObject((byte) 32);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_G) {
          stackIn_36_0 = 12 + this.getX(true);
          stackIn_36_1 = 24;
          var2Lifetime1 = stackIn_36_0 / stackIn_36_1;
          var3Lifetime2 = (this.getY(237239984) - 1) / 24;
          if (0 <= var2Lifetime1 &&
            0 <= var3Lifetime2 &&
            var2Lifetime1 < Js5Archive.field_e.navigation.field_A.tiles[0].length &&
            var3Lifetime2 < Js5Archive.field_e.navigation.field_A.tiles.length) {
            var7 = LevelHud.findAnimatedTile(127, Js5Archive.field_e.navigation.field_A.tiles[var3Lifetime2][var2Lifetime1]);
            if ((var7 != null)) {
              if (var7.field_h >= 0) {
                if (var7.field_h <= 0) {
                  this.field_y = this.field_y + var7.field_h;
                } else {
                  var5 = (var7.field_h + this.field_y) % 1572864;
                  if (var5 >= var7.field_h) {
                    this.field_y = this.field_y + var7.field_h;
                  } else {
                    this.field_y = this.field_y + (-var5 + var7.field_h);
                  }
                }
              } else {
                var5 = this.field_y % 1572864;
                if (-var7.field_h > var5) {
                  this.field_y = this.field_y - (var5 + 1);
                } else {
                  this.field_y = this.field_y + var7.field_h;
                }
              }
              if (var7.field_i < 0) {
                var5Lifetime1 = this.field_x % 1572864;
                if (-var7.field_i <= var5Lifetime1) {
                  this.field_x = this.field_x + var7.field_i;
                } else {
                  this.field_x = -var5Lifetime1 + (this.field_x - 1);
                }
              } else {
                if (0 >= var7.field_i) {
                  this.field_x = this.field_x + var7.field_i;
                } else {
                  var5Lifetime2 = (var7.field_i + this.field_x) % 1572864;
                  if (var7.field_i <= var5Lifetime2) {
                    this.field_x = this.field_x + var7.field_i;
                  } else {
                    this.field_x = -var5Lifetime2 + var7.field_i + this.field_x;
                  }
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            return;
          }
        }

    }

    static {
        field_N = -1;
        field_L = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_M = 0;
    }
}
