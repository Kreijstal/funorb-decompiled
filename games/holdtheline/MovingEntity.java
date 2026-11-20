/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MovingEntity extends IntrusiveNode {
    boolean collidable;
    static int field_n;
    float velocityY;
    Point2i position;
    float velocityX;
    float angularVelocity;
    static String field_o;
    int field_s;
    int halfLength;
    int courseSegment;
    int field_m;
    int layer;
    int collisionRadius;
    float heading;
    int halfWidth;
    Vector2f direction;
    int field_l;
    float worldX;
    boolean rectangularCollision;
    float worldY;

    private final void initializeMotion(float param0, byte param1, int param2, float param3, float param4) {
        this.worldX = param3;
        if (param1 > 35) {
          this.worldY = param0;
          this.heading = param4;
          this.position = new Point2i((int)this.worldX, (int)this.worldY);
          this.courseSegment = -1;
          this.layer = param2;
          this.field_s = -1;
          this.field_l = -1;
          this.field_m = -1;
          this.direction = new Vector2f(this.heading);
          this.collidable = false;
          this.angularVelocity = 0.0f;
          this.velocityX = 0.0f;
          this.velocityY = 0.0f;
          return;
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 == 0) {
          return;
        }
        MovingEntity.clearSharedReferences(-50);
    }

    final void updateCourseMembership(int param0, RoadSegment[] param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          var3_float = AccountUiUtilities.findRoadParameter(this.layer, 77, this.position, param1);
          if ((float)param0 != var3_float) {
            this.courseSegment = (int)var3_float;
            if (this.courseSegment == param1.length) {
              this.courseSegment = 0;
            }
            var4 = 0;
            while (true) {
              var4++;
              if (var4 < param1.length) {
                var5 = var4 + this.courseSegment;
                if (param1.length <= var5) {
                  var5 = var5 - param1.length;
                }
                if (!IntrusiveNode.containsRoadPoint(false, this.layer, param1[var5], this.position)) {
                  continue;
                }
                this.field_m = var5;
              }
              break;
            }
            while (true) {
              var4++;
              if (param1.length > var4) {
                var5 = var4 + this.courseSegment;
                if (var5 >= param1.length) {
                  var5 = var5 - param1.length;
                }
                if (!IntrusiveNode.containsRoadPoint(false, this.layer, param1[var5], this.position)) {
                  continue;
                }
                this.field_l = var5;
              }
              break;
            }
            do {
              var4++;
              if (param1.length <= var4) {
                return;
              }
              var5 = var4 + this.courseSegment;
              if (var5 >= param1.length) {
                var5 = var5 - param1.length;
              }
            } while (!IntrusiveNode.containsRoadPoint(false, this.layer, param1[var5], this.position));
            this.field_s = var5;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("ee.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void advanceMotion(int param0) {
        if (0.0f != this.angularVelocity) {
          this.heading = this.heading + this.angularVelocity * 0.019999999552965164f;
          this.direction.setDirectionFromAngle(this.heading, (byte) -54);
          this.worldY = this.worldY + 0.019999999552965164f * (3.5f * this.velocityY);
          this.worldX = this.worldX + 0.019999999552965164f * (3.5f * this.velocityX);
          this.position.x = (int)this.worldX;
          this.position.y = (int)this.worldY;
          this.updateCourseMembership(-1, MusicPatchPcmStream.field_r.roadSegments);
          if (~this.courseSegment != param0) {
            this.layer = MusicPatchPcmStream.field_r.roadSegments[this.courseSegment].layer;
            return;
          }
          return;
        }
        this.worldY = this.worldY + 0.019999999552965164f * (3.5f * this.velocityY);
        this.worldX = this.worldX + 0.019999999552965164f * (3.5f * this.velocityX);
        this.position.x = (int)this.worldX;
        this.position.y = (int)this.worldY;
        this.updateCourseMembership(-1, MusicPatchPcmStream.field_r.roadSegments);
        if (~this.courseSegment != param0) {
          this.layer = MusicPatchPcmStream.field_r.roadSegments[this.courseSegment].layer;
          return;
        }
    }

    MovingEntity(float param0, float param1, int param2) {
        this.initializeMotion(param1, (byte) 81, param2, param0, 0.0f);
    }

    MovingEntity(float param0, float param1, int param2, float param3) {
        this.initializeMotion(param1, (byte) 39, param2, param0, param3);
    }

    static {
        field_o = "Finish!";
    }
}
