/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackObject extends MovingEntity {
    int transitionOffsetX;
    private int animationFrameCount;
    private int spriteIndex;
    int transitionLayer;
    int flags;
    private int homingDelay;
    static AccountProtocolState field_U;
    int transitionY;
    int transitionX;
    private int animationFrame;
    Sprite sprite;
    int transitionTicks;
    private RaceVehicle homingTarget;
    private int frameTicks;
    private int[] animation;
    TrackObjectDefinition definition;
    int transitionOffsetY;

    final static void switchMenu(boolean param0, boolean param1, int param2) {
        int var4;
        var4 = HoldTheLine.field_D;
        if (param1) {
          field_U = (AccountProtocolState) null;
        }
        TextLayout.field_a = ByteStorage.field_b;
        if (param2 == ClientMenuBootstrap.field_c) {
          if (ByteStorage.field_b == 1) {
            ClientMenuBootstrap.field_c = 1;
            ((GameMenu) (CollisionGeometry.field_a[1])).beginExitFromCurrentPosition(0);
          }
          ByteStorage.field_b = param2;
        } else {
          ByteStorage.field_b = param2;
          if (13 == ClientMenuBootstrap.field_c) {
            ((RaceSetupMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).beginExit((byte) -116);
          } else {
            if (ClientMenuBootstrap.field_c != -1) {
              ((GameMenu) (CollisionGeometry.field_a[ClientMenuBootstrap.field_c])).beginExit(123);
            }
          }
          if (ByteStorage.field_b == 13) {
            ((RaceSetupMenu) (CollisionGeometry.field_a[ByteStorage.field_b])).reset((byte) 69, param0);
          } else {
            if (ByteStorage.field_b != -1) {
              ((GameMenu) (CollisionGeometry.field_a[ByteStorage.field_b])).reset(param0, -110);
            }
          }
        }
    }

    final boolean containsPoint(int param0, Point2i param1) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.definition.rectangularCollision) {
            var3_float = (float)(-this.position.x + param1.x);
            var4 = (float)(param1.y - this.position.y);
            var5 = this.direction.y * var4 + this.direction.x * var3_float;
            var6 = var3_float * this.direction.y - var4 * this.direction.x;
            if (Math.abs(var5) < (float)this.definition.field_m &&
              Math.abs(var6) < (float)this.definition.field_h) {
              return true;
            }
          } else {
            if (this.definition.collisionRadius * this.definition.collisionRadius > (param1.y - this.position.y) * (-this.position.y + param1.y) + (-this.position.x + param1.x) * (-this.position.x + param1.x)) {
              return true;
            }
          }
          if (param0 == 2048) {
            return false;
          }
          this.getCurrentSprite((byte) -59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("wm.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void update(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        boolean stackIn_23_1 = false;
        float var2;
        float var3;
        if (this.animation != null) {
          fieldTemp$0 = this.frameTicks - 1;
          this.frameTicks = this.frameTicks - 1;
          if (fieldTemp$0 <= 0) {
            fieldTemp$1 = this.animationFrame + 1;
            this.animationFrame = this.animationFrame + 1;
            if (this.animationFrameCount <= fieldTemp$1) {
              this.animationFrame = 0;
            }
            this.spriteIndex = this.animation[this.animationFrame * 2];
            this.frameTicks = this.animation[1 + this.animationFrame * 2];
          }
        }
        if ((4 & this.flags) != param0) {
          this.advanceMotion(0);
          if ((this.flags & 16) != 0) {
            this.velocityY = this.velocityY * BackgroundSprites.field_c;
            this.velocityX = this.velocityX * BackgroundSprites.field_c;
            if (this.velocityX * this.velocityX + this.velocityY * this.velocityY < 0.25f) {
              this.flags = this.flags & -5;
              if ((this.flags & 1024) != 0) {
                this.flags = this.flags | 2048;
                this.setAnimation(EmailLoginCredentials.field_d, 98);
              }
            }
          }
        }
        if ((8192 & this.flags) != 0) {
          this.updateHoming(false);
        }
        if (0 != (this.flags & 131072)) {
          fieldTemp$2 = this.transitionTicks - 1;
          this.transitionTicks = this.transitionTicks - 1;
          if (0 == fieldTemp$2) {
            this.flags = this.flags & -131073;
            this.layer = this.transitionLayer;
            stackIn_23_1 = ((this.flags & 8) != 0);
            this.collidable = stackIn_23_1;
          }
          var2 = (float)this.transitionTicks / 150.0f;
          var3 = 0.1428571343421936f * var2 + (-(var2 * (-2.5714285373687744f * var2)) + var2 * -1.7142857313156128f * var2 * var2);
          this.position.x = this.transitionX - (int)(var3 * (float)this.transitionOffsetX);
          this.position.y = -(int)(var3 * (float)this.transitionOffsetY) + this.transitionY;
        }
    }

    final Sprite getCurrentSprite(byte param0) {
        if (param0 > -107) {
          this.animationFrameCount = -60;
        }
        if ((32 & this.flags) == 0) {
          this.sprite = this.definition.field_g[this.spriteIndex];
        } else {
          this.sprite = this.definition.field_f[this.spriteIndex].getByAngle(this.heading, 27788);
        }
        return this.sprite;
    }

    private final void updateHoming(boolean param0) {
        int fieldTemp$0 = 0;
        int var3_int = 0;
        int var9 = 0;
        float var2;
        float var3;
        RaceVehicle var4_ref_ja;
        int var4;
        float var5_float;
        int var5;
        float var6_float;
        int var6;
        float var7_float;
        int var7;
        float var8_float;
        int var8;
        float var9_float;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        float var2Lifetime1;
        float var2Lifetime2;
        float var3Lifetime1;
        var16 = HoldTheLine.field_D;
        if (this.homingDelay > 0) {
          fieldTemp$0 = this.homingDelay - 1;
          this.homingDelay = this.homingDelay - 1;
          if (fieldTemp$0 == 0) {
            this.flags = this.flags | 2048;
          }
        }
        if (this.homingTarget == null &&
          (this.flags & 2048) != 0) {
          var2 = -1.0f;
          for (var3_int = 0; var3_int < MusicPatchPcmStream.field_r.playerCount; var3_int++) {
            if (var3_int != (this.flags & 3)) {
              var4_ref_ja = MusicPatchPcmStream.field_r.vehicles[var3_int];
              if (var4_ref_ja != null &&
                -1 <= this.layer - var4_ref_ja.layer &&
                this.layer - var4_ref_ja.layer <= 1) {
                var5_float = var4_ref_ja.worldX - this.worldX;
                var6_float = var4_ref_ja.worldY - this.worldY;
                var7_float = this.direction.x * var5_float + this.direction.y * var6_float;
                var8_float = var5_float * this.direction.y - this.direction.x * var6_float;
                if (2.0f * Math.abs(var8_float) < var7_float) {
                  var9_float = Math.abs(var8_float) + var7_float;
                  if (null == this.homingTarget ||
                    var9_float < var2) {
                    this.homingTarget = var4_ref_ja;
                    var2 = var9_float;
                  }
                }
              }
            }
          }
        }
        if (this.homingTarget != null) {
          var2Lifetime1 = BoundaryIntersection.angleBetweenPoints(this.position, this.homingTarget.position, false);
          var3 = var2Lifetime1 - this.heading;
          if ((double)var3 > 3.141592653589793) {
            var3 = (float)((double)var3 - 6.283185307179586);
          }
          if (-3.141592653589793 > (double)var3) {
            var3 = (float)((double)var3 + 6.283185307179586);
          }
          if (10.0f < var3) {
            var3 = 10.0f;
          }
          if (var3 < -10.0f) {
            var3 = -10.0f;
          }
          this.heading = this.heading + var3;
          this.direction.setDirectionFromAngle(this.heading, (byte) -54);
        }
        var2Lifetime2 = (float)Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY));
        var2Lifetime2 = var2Lifetime2 + 0.05000000074505806f * (55.0f - var2Lifetime2);
        this.velocityX = this.direction.x * var2Lifetime2;
        this.velocityY = var2Lifetime2 * this.direction.y;
        var3Lifetime1 = 4.0f * (float)Math.cos((double)((float)this.homingDelay / 10.0f));
        var4 = this.position.x - (int)(this.direction.x * 5.0f) + (int)(this.direction.y * var3Lifetime1);
        var5 = this.position.y - ((int)(this.direction.y * 5.0f) + (int)(this.direction.x * var3Lifetime1));
        if (param0) {
          this.animation = (int[]) null;
        }
        if (MusicPatchPcmStream.field_r.useParticleOnlyMissileEffects((byte) 47)) {
          var6 = MusicPatchPcmStream.field_r.vehicles[this.flags & 3].field_Eb;
          var7 = (int)(-this.direction.x * 1024.0f);
          var8 = (int)(-this.direction.y * 1024.0f);
          for (var9 = 0; var9 < 4; var9++) {
            var11 = SolidRoadStripRenderer.nextRandomInt(2, 256);
            if (var11 < 128) {
              var10 = -16711936 & (-var11 + 256) * (16711935 & var6) | 16711680 & (var6 & 65280) * (256 - var11);
              var10 = var10 + (-16711936 & var11 * 16711935 | 16711680 & 65280 * var11);
              var10 = var10 >>> 8;
            } else {
              var10 = 16744448 | var11 - 128 << 8;
            }
            var12 = var4 + ClientMenuBootstrap.randomIntInclusive(-2, -1, 2);
            var13 = ClientMenuBootstrap.randomIntInclusive(-2, -1, 2) + var5;
            var14 = var7 + ClientMenuBootstrap.randomIntInclusive(-512, -1, 512);
            var15 = ClientMenuBootstrap.randomIntInclusive(-512, -1, 512) + var8;
            ArchiveIndex.createParticle(var14, var13, 0, 16, 1, -16, var12, this.layer, MusicPatchPcmStream.field_r.trailParticles, var10, var15, 128, 2);
          }
        } else {
          if (MusicPatchPcmStream.field_r.raceTicks % 2 == 0) {
            ArchiveIndex.createParticle((int)(-this.direction.x * 2048.0f), var5, 1, 64, 1, -2, var4, this.layer, MusicPatchPcmStream.field_r.trailParticles, 12632256, (int)(-this.direction.y * 2048.0f), 32, 4);
          }
          var6 = (int)(1024.0f * -this.direction.x);
          var7 = (int)(-this.direction.y * 1024.0f);
          var6 = var6 + (-256 + SolidRoadStripRenderer.nextRandomInt(2, 512));
          var7 = var7 + (SolidRoadStripRenderer.nextRandomInt(2, 512) - 256);
          var8 = (SolidRoadStripRenderer.nextRandomInt(2, 128) | 520159104) << 8;
          ArchiveIndex.createParticle(var6, var5, 0, 16, 1, -16, var4, this.layer, MusicPatchPcmStream.field_r.trailParticles, var8, var7, 128, 1);
        }
    }

    TrackObject(Point2i param0, int param1, int param2) {
        super((float)param0.x, (float)param0.y, param2);
        try {
          this.setDefinitionAndVelocity(-43, param1, 0.0f, 0.0f);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "wm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void setAnimation(int[] param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.spriteIndex = 0;
          this.animation = param0;
          if (null != this.animation) {
            this.animationFrameCount = this.animation.length / 2;
            this.animationFrame = 0;
            this.spriteIndex = this.animation[0];
            this.frameTicks = this.animation[1];
          }
          if (param1 < 3) {
            this.animationFrameCount = -78;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wm.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void setDefinitionAndVelocity(int param0, int param1, float param2, float param3) {
        this.definition = ArchiveCatalog.getTrackObjectDefinition(param1, (byte) 17);
        if (param0 >= -35) {
          this.flags = 78;
        }
        this.flags = this.definition.flags;
        this.velocityY = param3;
        this.velocityX = param2;
        if ((256 & this.flags) == 0) {
          this.setAnimation(this.definition.field_l, 71);
        }
        if (0 != (8192 & this.flags)) {
          this.homingTarget = null;
          this.homingDelay = 5;
        }
        if (0 != (8 & this.flags)) {
          this.collisionRadius = this.definition.collisionRadius;
          this.collidable = true;
          if ((1024 & this.flags) != 0) {
            this.collisionRadius = 6;
          }
        }
    }

    public static void clearSharedReferences(int param0) {
        field_U = null;
        if (param0 != -20668) {
          field_U = (AccountProtocolState) null;
        }
    }

    TrackObject(Point2i param0, int param1, int param2, float param3, float param4, float param5) {
        super((float)param0.x, (float)param0.y, param2, param3);
        try {
          this.setDefinitionAndVelocity(-62, param1, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "wm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_U = new AccountProtocolState();
    }
}
