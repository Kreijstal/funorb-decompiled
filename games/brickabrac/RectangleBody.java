/*
 * Decompiled by CFR-JS 0.4.0.
 */
class RectangleBody extends MovingBody {
    int height256;
    static String field_t;
    static RgbSprite field_p;
    int width256;
    static UiComponent field_q;
    static PacketBuffer field_r;

    boolean resolveCircleCollision(CircleBody circle, byte obfuscationGuard) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String circleSummary = null;
        RuntimeException caughtFailure = null;
        int radius256 = 0;
        RuntimeException failure = null;
        int circleCenterX = 0;
        int circleCenterY = 0;
        int absoluteCenterDeltaY = 0;
        int nearestX = 0;
        int nearestY = 0;
        int nearestDistanceSquared = 0;
        int unusedContactTime = 0;
        int unusedHorizontalTime = 0;
        int unusedVerticalTime = 0;
        int unusedContactX = 0;
        int unusedContactY = 0;
        int unusedFace = 0;
        int unusedHorizontalFace = 0;
        int unusedVerticalFace = 0;
        int relativeVelocityY = 0;
        int topDistance = 0;
        int topTime256 = 0;
        int bottomDistance = 0;
        int bottomTime256 = 0;
        int unusedGuardQuotient = 0;
        int relativeVelocityX = 0;
        int leftDistance = 0;
        int leftTime256 = 0;
        int rightDistance = 0;
        int rightTime256 = 0;
        int xAtVerticalTime = 0;
        int yAtHorizontalTime = 0;
        int normalX256 = 0;
        int normalY256 = 0;
        int negativeNormalVelocity = 0;
        int unusedGameFlag = 0;
        int absoluteCenterDeltaX;
        int contactTime256;
        int horizontalTime256;
        int verticalTime256;
        int contactCenterX;
        int contactCenterY;
        int face;
        int horizontalFace;
        int verticalFace;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          radius256 = circle.radius256;
          circleCenterX = radius256 + circle.x256;
          circleCenterY = radius256 + circle.y256;
          absoluteCenterDeltaY = -this.y256 - (this.height256 >> 1) + circleCenterY;
          if (absoluteCenterDeltaY < 0) {
            absoluteCenterDeltaY = -absoluteCenterDeltaY;
          }
          if (radius256 + (this.height256 >> 1) <= absoluteCenterDeltaY) {
            return false;
          }
          absoluteCenterDeltaX = -(this.width256 >> 1) - (this.x256 - circleCenterX);
          if (absoluteCenterDeltaX < 0) {
            absoluteCenterDeltaX = -absoluteCenterDeltaX;
          }
          if (absoluteCenterDeltaX >= (this.width256 >> 1) + radius256) {
            return false;
          }
          nearestX = circleCenterX;
          nearestY = circleCenterY;
          if (this.y256 <= circleCenterY) {
            if (this.height256 + this.y256 < circleCenterY) {
              nearestY = this.y256 + this.height256;
            }
          } else {
            nearestY = this.y256;
          }
          if (circleCenterX < this.x256) {
            nearestX = this.x256;
          } else {
            if (circleCenterX > this.x256 + this.width256) {
              nearestX = this.width256 + this.x256;
            }
          }
          nearestDistanceSquared = (-circleCenterX + nearestX) * (nearestX - circleCenterX) + (nearestY - circleCenterY) * (-circleCenterY + nearestY);
          if (nearestDistanceSquared > radius256 * radius256) {
            return false;
          }
          unusedContactTime = 0;
          unusedHorizontalTime = 0;
          unusedVerticalTime = 0;
          unusedContactX = 0;
          unusedContactY = 0;
          unusedFace = 0;
          unusedHorizontalFace = 0;
          unusedVerticalFace = 0;
          relativeVelocityY = -this.velocityY256 + circle.velocityY256;
          topDistance = -radius256 + this.y256 - circleCenterY;
          topTime256 = topDistance << 8;
          bottomDistance = -circleCenterY + (this.y256 + radius256) + this.height256;
          bottomTime256 = bottomDistance << 8;
          if (relativeVelocityY != 0) {
            bottomTime256 = bottomTime256 / relativeVelocityY;
            topTime256 = topTime256 / relativeVelocityY;
          }
          unusedGuardQuotient = -3 / ((obfuscationGuard + 29) / 35);
          if (topTime256 < bottomTime256) {
            contactCenterY = topDistance;
            verticalFace = 1;
            verticalTime256 = topTime256;
          } else {
            contactCenterY = bottomDistance;
            verticalTime256 = bottomTime256;
            verticalFace = 2;
          }
          contactCenterY = contactCenterY + circleCenterY;
          relativeVelocityX = -this.velocityX256 + circle.velocityX256;
          leftDistance = -radius256 + this.x256 - circleCenterX;
          leftTime256 = leftDistance << 8;
          rightDistance = -circleCenterX + (this.x256 + radius256 + this.width256);
          rightTime256 = rightDistance << 8;
          if (relativeVelocityX != 0) {
            rightTime256 = rightTime256 / relativeVelocityX;
            leftTime256 = leftTime256 / relativeVelocityX;
          }
          if (rightTime256 <= leftTime256) {
            contactCenterX = rightDistance;
            horizontalFace = 4;
            horizontalTime256 = rightTime256;
          } else {
            horizontalFace = 8;
            horizontalTime256 = leftTime256;
            contactCenterX = leftDistance;
          }
          contactCenterX = contactCenterX + circleCenterX;
          xAtVerticalTime = circleCenterX + (verticalTime256 * relativeVelocityX >> 8);
          yAtHorizontalTime = (relativeVelocityY * horizontalTime256 >> 8) + circleCenterY;
          if (relativeVelocityY != 0 &&
            xAtVerticalTime >= this.x256 - radius256 &&
            xAtVerticalTime <= radius256 + this.width256 + this.x256) {
            if (relativeVelocityX != 0 &&
              -radius256 + this.y256 <= yAtHorizontalTime &&
              radius256 + this.y256 + this.height256 >= yAtHorizontalTime) {
              if (verticalTime256 >= horizontalTime256) {
                contactTime256 = horizontalTime256;
                face = horizontalFace;
                contactCenterY = circleCenterY + (relativeVelocityY * contactTime256 >> 8);
              } else {
                face = verticalFace;
                contactTime256 = verticalTime256;
                contactCenterX = (relativeVelocityX * contactTime256 >> 8) + circleCenterX;
              }
            } else {
              face = verticalFace;
              contactTime256 = verticalTime256;
              contactCenterX = circleCenterX + (contactTime256 * relativeVelocityX >> 8);
            }
          } else {
            contactTime256 = horizontalTime256;
            face = horizontalFace;
            contactCenterY = (contactTime256 * relativeVelocityY >> 8) + circleCenterY;
          }
          normalX256 = 0;
          normalY256 = 0;
          if (face == 8) {
            normalX256 = 256;
          }
          if (4 == face) {
            normalX256 = -256;
          }
          if (1 == face) {
            normalY256 = 256;
          }
          if (2 == face) {
            normalY256 = -256;
          }
          negativeNormalVelocity = -(normalY256 * relativeVelocityY + normalX256 * relativeVelocityX) >> 8;
          if (negativeNormalVelocity > 0) {
            return false;
          }
          if (contactTime256 > ea.collisionTime256) {
            return true;
          }
          AccountResponse.collisionX256 = contactCenterX - circle.radius256;
          ea.collisionTime256 = contactTime256;
          SpriteGeometry.collisionNormalX256 = normalX256;
          DualLinkIterator.collisionNormalY256 = normalY256;
          GameClock.collisionBody = this;
          IntegerValidationHelpers.collisionFace = face;
          ScrollPane.collisionY256 = -circle.radius256 + contactCenterY;
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("bn.F(");
          if (circle == null) {
            circleSummary = "null";
          } else {
            circleSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(circleSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    RectangleBody(int x256, int y256, int velocityX256, int velocityY256, int width256, int height256, int typeId) {
        super(x256, y256, velocityX256, velocityY256, typeId);
        this.height256 = height256;
        this.width256 = width256;
    }

    final boolean overlapsCircle(CircleBody circle, boolean obfuscationGuard) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        long var7 = 0L;
        long var9 = 0L;
        long var11 = 0L;
        long var13 = 0L;
        long var15 = 0L;
        int var17 = 0;
        long var9Lifetime1;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_long = (long)circle.radius256;
          var5 = (long)circle.x256;
          var7 = (long)circle.y256;
          var9 = (long)(-this.y256 - this.height256 / 2) + var7;
          if (var9 < 0L) {
            var9 = -var9;
          }
          if (var9 >= (long)(this.height256 / 2) + var3_long) {
            return false;
          }
          var9Lifetime1 = var5 + (long)(-this.x256 - this.width256 / 2);
          if (var9Lifetime1 < 0L) {
            var9Lifetime1 = -var9Lifetime1;
          }
          if (obfuscationGuard) {
            RectangleBody.c(111);
          }
          if (var3_long + (long)(this.width256 / 2) <= var9Lifetime1) {
            return false;
          }
          var11 = var5;
          var13 = var7;
          if (var5 < (long)this.x256) {
            var11 = (long)this.x256;
          } else {
            if (var5 > (long)(this.x256 + this.width256)) {
              var11 = (long)(this.x256 + this.width256);
            }
          }
          if (var7 >= (long)this.y256) {
            if (var7 > (long)(this.height256 + this.y256)) {
              var13 = (long)(this.y256 + this.height256);
            }
          } else {
            var13 = (long)this.y256;
          }
          var15 = (var11 - var5) * (var11 - var5) + (-var7 + var13) * (var13 - var7);
          if (var15 <= var3_long * var3_long) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("bn.C(");
          if (circle == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    void onCircleContact(byte obfuscationGuard, PlayerBoard board, CircleBody circle) {
        try {
          if (obfuscationGuard != 53) {
            CircleBody var5 = (CircleBody) null;
            this.resolveCircleCollision((CircleBody) null, (byte) 44);
          }
          circle.x256 = AccountResponse.collisionX256;
          circle.y256 = ScrollPane.collisionY256;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bn.E(" + obfuscationGuard + ',' + (board != null ? "{...}" : "null") + ',' + (circle != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        int var1 = 62 / ((25 - param0) / 57);
        if (StrongCacheEntry.field_I != null) {
          StrongCacheEntry.field_I.closeDialog(17);
        }
        MusicPatch.field_o = new PlayerNameChooserPanel();
        rj.accountContentLayer.transitionToContent((byte) 110, MusicPatch.field_o);
    }

    int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 79) {
            this.height256 = 1;
          }
          stackIn_3_0 = (33029 + this.height256 * 37 << 13) + (41 * this.width256 + 29813 << 2) ^ super.computeSyncChecksum(80, diagnostics);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bn.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        int var1 = 51 / ((-46 - param0) / 34);
        field_t = null;
    }

    static {
        field_t = "Offer rematch";
    }
}
