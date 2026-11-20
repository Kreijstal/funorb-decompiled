/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ZombiePedestrian extends IntrusiveNode {
    private int fixedY;
    private int fixedX;
    static DisplayNameForm field_l;
    private float heading;
    private int stateTicks;
    static boolean field_v;
    private int knockbackY;
    private int state;
    int y;
    static int field_t;
    private int frameTicks;
    private int targetY;
    static GameAppletShell field_j;
    static String field_u;
    private int knockbackX;
    private int colorVariant;
    int x;
    static int field_w;
    private int targetX;
    private int frame;

    private final void setPosition(int param0, byte param1, int param2) {
        this.x = param0;
        this.y = param2;
        this.fixedY = this.y << 16;
        this.fixedX = this.x << 16;
        if (param1 == 44) {
          this.setState(true, 0);
          this.stateTicks = SolidRoadStripRenderer.b(param1 - 42, 500);
          return;
        }
    }

    final void draw(byte param0) {
        int var3;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        if (param0 == -99) {
          var3 = this.state;
          if (3 == var3) {
            SpriteSheetAsset.field_d[this.colorVariant][7 + this.frame].getByAngle(this.heading, param0 ^ -27887).draw(this.x, this.y);
          } else {
            if (this.frame >= 6) {
              stackIn_7_0 = 11 - this.frame;
            } else {
              stackIn_7_0 = this.frame;
            }
            var2 = stackIn_7_0;
            SpriteSheetAsset.field_d[this.colorVariant][var2].getByAngle(this.heading, 27788).draw(this.x, this.y);
          }
        } else {
          field_l = (DisplayNameForm) null;
          var3 = this.state;
          if (3 == var3) {
            SpriteSheetAsset.field_d[this.colorVariant][7 + this.frame].getByAngle(this.heading, param0 ^ -27887).draw(this.x, this.y);
          } else {
            if (this.frame >= 6) {
              stackIn_15_0 = 11 - this.frame;
            } else {
              stackIn_15_0 = this.frame;
            }
            var2 = stackIn_15_0;
            SpriteSheetAsset.field_d[this.colorVariant][var2].getByAngle(this.heading, 27788).draw(this.x, this.y);
          }
        }
    }

    private final void respawn(byte param0) {
        int var2;
        int var3;
        var3 = HoldTheLine.field_D;
        var2 = SolidRoadStripRenderer.b(2, 2240);
        if (param0 > -58) {
          return;
        }
        if (var2 < 640) {
          this.setPosition(var2, (byte) 44, -50);
        } else {
          var2 -= 640;
          if (var2 < 480) {
            this.setPosition(-50, (byte) 44, var2);
          } else {
            var2 -= 480;
            if (var2 >= 640) {
              this.setPosition(640, (byte) 44, var2 - 640);
            } else {
              this.setPosition(var2, (byte) 44, 480);
            }
          }
        }
        this.colorVariant = SolidRoadStripRenderer.b(2, 4);
    }

    final void update(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int stackIn_4_0 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = HoldTheLine.field_D;
        int fieldTemp$0 = this.frameTicks - 1;
        this.frameTicks = this.frameTicks - 1;
        if (0 <= fieldTemp$0) {
          boolean decompiledFrameRemainder0 = true;
          var2 = this.state;
          if (0 == var2) {
            fieldTemp$1 = this.stateTicks - 1;
            this.stateTicks = this.stateTicks - 1;
            if (0 >= fieldTemp$1) {
              this.chooseWalkTarget((byte) 50);
            }
          } else {
            if (var2 != 2 &&
              1 != var2) {
              if ((var2 == 3)) {
                this.fixedY = this.fixedY + this.knockbackY;
                this.fixedX = this.fixedX + this.knockbackX;
                fieldTemp$2 = this.stateTicks - 1;
                this.stateTicks = this.stateTicks - 1;
                if (!(fieldTemp$2 > 0)) {
                  this.stampBlood(25500);
                  this.respawn((byte) -65);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.moveTowardTarget(false)) {
                this.chooseWalkTarget((byte) 62);
              }
            }
          }
          this.y = this.fixedY >> 16;
          if (param0 != -19895) {
            return;
          }
          this.x = this.fixedX >> 16;
          return;
        }
        stackIn_4_0 = (this.state == 3) ? 7 : 11;
        var2Lifetime1 = stackIn_4_0;
        fieldTemp$3 = this.frame + 1;
        this.frame = this.frame + 1;
        if (fieldTemp$3 < var2Lifetime1) {
          this.frameTicks = this.getFrameDuration(5);
          var2Lifetime1 = this.state;
          if (0 == var2Lifetime1) {
            fieldTemp$4 = this.stateTicks - 1;
            this.stateTicks = this.stateTicks - 1;
            if (0 >= fieldTemp$4) {
              this.chooseWalkTarget((byte) 50);
              this.y = this.fixedY >> 16;
              if (param0 != -19895) {
                return;
              }
              this.x = this.fixedX >> 16;
              return;
            }
          } else {
            if (var2Lifetime1 == 2) {
              if (this.moveTowardTarget(false)) {
                this.chooseWalkTarget((byte) 62);
              }
            } else {
              if (1 == var2Lifetime1) {
                if (this.moveTowardTarget(false)) {
                  this.chooseWalkTarget((byte) 62);
                }
              } else {
                if (var2Lifetime1 == 3) {
                  this.fixedY = this.fixedY + this.knockbackY;
                  this.fixedX = this.fixedX + this.knockbackX;
                  fieldTemp$5 = this.stateTicks - 1;
                  this.stateTicks = this.stateTicks - 1;
                  if (fieldTemp$5 <= 0) {
                    this.stampBlood(25500);
                    this.respawn((byte) -65);
                    this.y = this.fixedY >> 16;
                    if (param0 != -19895) {
                      return;
                    }
                    this.x = this.fixedX >> 16;
                    return;
                  }
                }
              }
            }
          }
        } else {
          this.frame = 0;
          this.frameTicks = this.getFrameDuration(5);
          var2Lifetime1 = this.state;
          if (0 == var2Lifetime1) {
            fieldTemp$6 = this.stateTicks - 1;
            this.stateTicks = this.stateTicks - 1;
            if (0 >= fieldTemp$6) {
              this.chooseWalkTarget((byte) 50);
            }
            this.y = this.fixedY >> 16;
            if (param0 != -19895) {
              return;
            }
            this.x = this.fixedX >> 16;
            return;
          }
          if (var2Lifetime1 != 2 &&
            1 != var2Lifetime1) {
            if (var2Lifetime1 != 3) {
              this.y = this.fixedY >> 16;
              if (param0 != -19895) {
                return;
              }
              this.x = this.fixedX >> 16;
              return;
            }
            this.fixedY = this.fixedY + this.knockbackY;
            this.fixedX = this.fixedX + this.knockbackX;
            fieldTemp$7 = this.stateTicks - 1;
            this.stateTicks = this.stateTicks - 1;
            if (fieldTemp$7 <= 0) {
              this.stampBlood(25500);
              this.respawn((byte) -65);
            }
            this.y = this.fixedY >> 16;
            if (param0 != -19895) {
              return;
            }
            this.x = this.fixedX >> 16;
            return;
          }
          if (this.moveTowardTarget(false)) {
            this.chooseWalkTarget((byte) 62);
          }
        }
        this.y = this.fixedY >> 16;
        if (param0 != -19895) {
          return;
        }
        this.x = this.fixedX >> 16;
        return;
    }

    private final void stampBlood(int param0) {
        if (param0 == 25500) {
          vb.a(param0 - 25551, MusicPatchPcmStream.field_r.courseImage);
          IndexedSpriteState.a((byte) -61, this.x, this.y);
          IndexedSpriteState.a((byte) -61, this.x + 6, this.y);
          IndexedSpriteState.a((byte) -61, this.x - 6, this.y);
          IndexedSpriteState.a((byte) -61, this.x, this.y + 6);
          IndexedSpriteState.a((byte) -61, this.x, this.y - 6);
          MarkerSliderRenderer.restoreRasterTarget(param0 - 25501);
          return;
        }
        this.stampBlood(-70);
        vb.a(param0 - 25551, MusicPatchPcmStream.field_r.courseImage);
        IndexedSpriteState.a((byte) -61, this.x, this.y);
        IndexedSpriteState.a((byte) -61, this.x + 6, this.y);
        IndexedSpriteState.a((byte) -61, this.x - 6, this.y);
        IndexedSpriteState.a((byte) -61, this.x, this.y + 6);
        IndexedSpriteState.a((byte) -61, this.x, this.y - 6);
        MarkerSliderRenderer.restoreRasterTarget(param0 - 25501);
    }

    public static void clearSharedReferences(int param0) {
        field_l = null;
        if (param0 < 20) {
          ZombiePedestrian.clearSharedReferences(-50);
          field_u = null;
          return;
        }
        field_u = null;
    }

    private final void setState(boolean param0, int param1) {
        this.state = param1;
        this.frame = 0;
        this.frameTicks = this.getFrameDuration(5);
        if (!param0) {
          this.fixedX = 114;
        }
    }

    final void hit(RaceVehicle param0, int param1, byte param2, int param3) {
        if (this.state == 3) {
          return;
        }
        try {
          if (param2 < 6) {
            this.isAlive((byte) 80);
          }
          if (param0 != null) {
            param0.kills = param0.kills + 1;
          }
          this.setState(true, 3);
          this.stateTicks = 4 * this.getFrameDuration(5);
          this.knockbackX = param1;
          this.knockbackY = param3;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vf.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean isAlive(byte param0) {
        if (param0 <= -109) {
          return this.state != 3 ? true : false;
        }
        this.respawn((byte) 70);
        return this.state != 3 ? true : false;
    }

    private final int getFrameDuration(int param0) {
        if (param0 == 5) {
          return this.state == 3 ? 2 : 5;
        }
        field_t = -26;
        return this.state == 3 ? 2 : 5;
    }

    private final boolean moveTowardTarget(boolean param0) {
        int var2 = this.state != 1 ? 4096 : 16384;
        int var3 = -(this.fixedX >> 8) + (this.targetX << 8);
        int var4 = (this.targetY << 8) - (this.fixedY >> 8);
        int var5 = DropTargetWidget.approximateHypot(var4, 4805, var3);
        if (var5 < var2 >> 8) {
          return true;
        }
        if (!param0) {
          var4 = var4 * var2 / var5;
          var3 = var3 * var2 / var5;
          this.fixedY = this.fixedY + var4;
          this.fixedX = this.fixedX + var3;
          return false;
        }
        int discarded$0 = this.getFrameDuration(-93);
        var4 = var4 * var2 / var5;
        var3 = var3 * var2 / var5;
        this.fixedY = this.fixedY + var4;
        this.fixedX = this.fixedX + var3;
        return false;
    }

    private final void chooseWalkTarget(byte param0) {
        int var3 = HoldTheLine.field_D;
        int var2 = 56 % ((param0 - 9) / 40);
        do {
          this.targetX = SolidRoadStripRenderer.b(2, 640);
          this.targetY = SolidRoadStripRenderer.b(2, 480);
        } while (!MusicPatchPcmStream.field_r.isInsideCollisionBounds(0, this.targetY, true, this.targetX));
        this.setState(true, 1);
        this.heading = (float)Math.atan2((double)(this.y - this.targetY), (double)(-this.x + this.targetX));
    }

    ZombiePedestrian() {
        this.respawn((byte) -79);
    }

    static {
        field_u = "Kills";
        field_j = null;
    }
}
