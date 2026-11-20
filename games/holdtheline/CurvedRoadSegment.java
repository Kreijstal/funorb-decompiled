/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CurvedRoadSegment extends RoadSegment {
    int leftCollisionRadius;
    int rightCollisionOffset;
    int leftCollisionOffset;
    float startAngle;
    float controlPathStartParameter;
    private int leftRoadRadius;
    Point2i controlPathControl;
    int radius;
    Point2i center;
    float controlPathEndParameter;
    static int field_y;
    static ContentTransitionState field_G;
    static String field_J;
    int rightRoadOffset;
    int leftRoadOffset;
    int rightCollisionRadius;
    Point2i controlPathStart;
    static boolean field_T;
    private int rightRoadRadius;
    Point2i controlPathEnd;
    float endAngle;
    static int field_M;

    final static boolean openUrlOnWindows(boolean param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0) {
            field_M = 1;
          }
          try {
            if (!PlatformTaskDispatcher.field_s.startsWith("win")) {
              return false;
            }
            if (!param1.startsWith("http://") &&
              !param1.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            var3 = 0;
            while (true) {
              if (var3 >= param1.length()) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                return true;
              }
              if (var2.indexOf((int) param1.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var2_ref2;
          stackIn_23_1 = new StringBuilder().append("hn.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final Vector2f getStartDirection(int param0) {
        float var2 = this.startAngle;
        var2 = var2 + (this.endAngle < this.startAngle ? 1.5707963705062866f : -1.5707963705062866f);
        if (param0 != -1) {
          return (Vector2f) null;
        }
        return new Vector2f(var2);
    }

    final Point2i getLeftCollisionEnd(int param0) {
        if (param0 != 8421504) {
          this.startAngle = 0.36725643277168274f;
        }
        return new Point2i((int)((double)this.center.x + (double)this.leftCollisionRadius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.leftCollisionRadius * Math.sin((double)this.endAngle)));
    }

    final Vector2f getEndDirection(boolean param0) {
        float var2 = this.endAngle;
        var2 = var2 + (!(this.startAngle > this.endAngle) ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0) {
          this.rightRoadRadius = -21;
        }
        return new Vector2f(var2);
    }

    final Point2i leftRoadEdgeAt(float param0, int param1) {
        float var3 = this.startAngle + (-this.startAngle + this.endAngle) * param0;
        if (param1 != 255) {
          this.getLeftRoadEnd(78);
        }
        return new Point2i((int)((double)this.center.x + (double)this.leftRoadRadius * Math.cos((double)var3)), (int)((double)this.center.y - (double)this.leftRoadRadius * Math.sin((double)var3)));
    }

    final Point2i rightRoadEdgeAt(float param0, boolean param1) {
        float var3 = this.startAngle + (this.endAngle - this.startAngle) * param0;
        if (param1) {
          return (Point2i) null;
        }
        return new Point2i((int)((double)this.center.x + (double)this.rightRoadRadius * Math.cos((double)var3)), (int)((double)this.center.y - (double)this.rightRoadRadius * Math.sin((double)var3)));
    }

    final Point2i getLeftRoadEnd(int param0) {
        if (param0 != 7560980) {
          this.parameterAtAngle(0.218789204955101f, (byte) 23);
        }
        return new Point2i((int)((double)this.center.x + (double)this.leftRoadRadius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.leftRoadRadius * Math.sin((double)this.endAngle)));
    }

    final Point2i getEndPoint(int param0) {
        if (param0 != 0) {
          return (Point2i) null;
        }
        return new Point2i((int)((double)this.center.x + (double)this.radius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.radius * Math.sin((double)this.endAngle)));
    }

    final Point2i getRightCollisionStart(int param0) {
        if (param0 != 3337) {
          this.leftRoadEdgeAt(1.24961256980896f, -83);
        }
        return new Point2i((int)((double)this.center.x + (double)this.rightCollisionRadius * Math.cos((double)this.startAngle)), (int)((double)this.center.y - (double)this.rightCollisionRadius * Math.sin((double)this.startAngle)));
    }

    final Point2i leftCollisionEdgeAt(float param0, int param1) {
        if (param1 < 90) {
          this.controlPathStart = (Point2i) null;
        }
        float var3 = this.startAngle + (-this.startAngle + this.endAngle) * param0;
        return new Point2i((int)((double)this.center.x + (double)this.leftCollisionRadius * Math.cos((double)var3)), (int)((double)this.center.y - (double)this.leftCollisionRadius * Math.sin((double)var3)));
    }

    final Point2i getRightRoadEnd(byte param0) {
        if (param0 != 29) {
          this.controlPathEnd = (Point2i) null;
        }
        return new Point2i((int)((double)this.center.x + (double)this.rightRoadRadius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.rightRoadRadius * Math.sin((double)this.endAngle)));
    }

    final Vector2f directionAt(byte param0, float param1) {
        float var3 = (this.endAngle - this.startAngle) * param1 + this.startAngle;
        var3 = var3 + (this.endAngle < this.startAngle ? -1.5707963705062866f : 1.5707963705062866f);
        if (param0 < 117) {
          this.controlPathEnd = (Point2i) null;
        }
        return new Vector2f(var3);
    }

    final Point2i rightCollisionEdgeAt(int param0, float param1) {
        if (param0 != -851) {
          this.leftRoadRadius = 100;
        }
        float var3 = this.startAngle + (this.endAngle - this.startAngle) * param1;
        return new Point2i((int)((double)this.center.x + (double)this.rightCollisionRadius * Math.cos((double)var3)), (int)((double)this.center.y - (double)this.rightCollisionRadius * Math.sin((double)var3)));
    }

    final Point2i pointAt(boolean param0, float param1) {
        float var3 = this.startAngle + param1 * (-this.startAngle + this.endAngle);
        if (param0) {
          return (Point2i) null;
        }
        return new Point2i((int)((double)this.center.x + (double)this.radius * Math.cos((double)var3)), (int)((double)this.center.y - (double)this.radius * Math.sin((double)var3)));
    }

    final float parameterAtAngle(float param0, byte param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 < 33) {
          field_y = 109;
        }
        if (this.endAngle < this.startAngle) {
          while (param0 < this.endAngle) {
            param0 = (float)((double)param0 + 6.283185307179586);
          }
          while (this.startAngle < param0) {
            param0 = (float)((double)param0 - 6.283185307179586);
          }
          return (-this.startAngle + param0) / (this.endAngle - this.startAngle);
        }
        while (this.endAngle < param0) {
          param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (this.startAngle > param0) {
          param0 = (float)((double)param0 + 6.283185307179586);
        }
        return (param0 - this.startAngle) / (this.endAngle - this.startAngle);
    }

    final float length(int param0) {
        if (param0 != 50) {
          this.getLeftCollisionEnd(-4);
        }
        return Math.abs(this.endAngle - this.startAngle) * (float)this.radius;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 >= -120) {
          field_y = 99;
        }
        field_J = null;
        field_G = null;
    }

    final Point2i getRightCollisionEnd(int param0) {
        if (param0 != -14) {
          this.rightRoadRadius = 113;
        }
        return new Point2i((int)((double)this.center.x + (double)this.rightCollisionRadius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.rightCollisionRadius * Math.sin((double)this.endAngle)));
    }

    final Point2i getRightRoadStart(int param0) {
        if (param0 != -14) {
          return (Point2i) null;
        }
        return new Point2i((int)((double)this.center.x + (double)this.rightRoadRadius * Math.cos((double)this.startAngle)), (int)((double)this.center.y - (double)this.rightRoadRadius * Math.sin((double)this.startAngle)));
    }

    final Point2i getLeftCollisionStart(int param0) {
        if (param0 != 255) {
          this.pointAt(true, -0.0722532868385315f);
        }
        return new Point2i((int)((double)this.center.x + (double)this.leftCollisionRadius * Math.cos((double)this.startAngle)), (int)((double)this.center.y - (double)this.leftCollisionRadius * Math.sin((double)this.startAngle)));
    }

    final Point2i getLeftRoadStart(boolean param0) {
        if (!param0) {
          return (Point2i) null;
        }
        return new Point2i((int)((double)this.center.x + (double)this.leftRoadRadius * Math.cos((double)this.startAngle)), (int)((double)this.center.y - (double)this.leftRoadRadius * Math.sin((double)this.startAngle)));
    }

    CurvedRoadSegment(Point2i param0, int param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8, Point2i param9, Point2i param10, Point2i param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_27_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        try {
          stackIn_4_1 = (param13);
          this.field_s = stackIn_4_1;
          stackIn_7_1 = (param12);
          this.field_w = stackIn_7_1;
          stackIn_10_1 = (param17);
          this.field_q = stackIn_10_1;
          this.startAngle = param2;
          this.center = param0;
          this.controlPathEnd = param10;
          this.rightCollisionOffset = param8;
          this.leftRoadOffset = param5;
          this.controlPathControl = param11;
          this.rightRoadOffset = param6;
          this.leftCollisionOffset = param7;
          this.endAngle = param3;
          stackIn_13_1 = (param15);
          this.field_x = stackIn_13_1;
          this.layer = param4;
          stackIn_16_1 = (param16);
          this.field_t = stackIn_16_1;
          this.controlPathStart = param9;
          this.radius = param1;
          stackIn_19_1 = (param14);
          this.field_m = stackIn_19_1;
          stackIn_21_1 = this.radius;
          if (this.startAngle >= this.endAngle) {
            stackIn_22_2 = -this.rightCollisionOffset;
          } else {
            stackIn_22_2 = this.rightCollisionOffset;
          }
          this.rightCollisionRadius = stackIn_21_1 + stackIn_22_2;
          stackIn_24_1 = this.radius;
          if (this.startAngle >= this.endAngle) {
            stackIn_25_2 = -this.rightRoadOffset;
          } else {
            stackIn_25_2 = this.rightRoadOffset;
          }
          this.rightRoadRadius = stackIn_24_1 + stackIn_25_2;
          this.controlPathEndParameter = 1.0f;
          stackIn_27_1 = this.radius;
          if (!(this.endAngle <= this.startAngle)) {
            stackIn_28_2 = this.leftCollisionOffset;
          } else {
            stackIn_28_2 = -this.leftCollisionOffset;
          }
          this.leftCollisionRadius = stackIn_27_1 + stackIn_28_2;
          this.layerSlope = 0.0f;
          if (this.endAngle <= this.startAngle) {
            stackIn_31_1 = -this.leftRoadOffset;
          } else {
            stackIn_31_1 = this.leftRoadOffset;
          }
          this.leftRoadRadius = stackIn_31_1 + this.radius;
          this.controlPathStartParameter = 0.0f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_35_0 = var19;
          stackIn_35_1 = new StringBuilder().append("hn.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param10 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param11 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(')').toString());
        }
    }

    final boolean containsAngle(byte param0, float param1) {
        int var4 = HoldTheLine.field_D;
        if (param0 != -113) {
          this.leftCollisionOffset = 69;
        }
        if (this.startAngle > this.endAngle) {
          while (this.endAngle < param1) {
            param1 = (float)((double)param1 - 6.283185307179586);
          }
          while (param1 < this.endAngle) {
            param1 = (float)((double)param1 + 6.283185307179586);
          }
          return this.startAngle > param1 ? true : false;
        }
        while (this.startAngle < param1) {
          param1 = (float)((double)param1 - 6.283185307179586);
        }
        while (this.startAngle > param1) {
          param1 = (float)((double)param1 + 6.283185307179586);
        }
        return this.endAngle > param1 ? true : false;
    }

    final Point2i controlPathAt(float param0, int param1) {
        float var3 = this.controlPathStartParameter + (-this.controlPathStartParameter + this.controlPathEndParameter) * param0;
        int var4 = (int)((float)this.controlPathStart.x * (-var3 + 1.0f) * (-var3 + 1.0f) + (-var3 + 1.0f) * (float)(2 * this.controlPathControl.x) * var3 + var3 * (float)this.controlPathEnd.x * var3);
        int var5 = (int)(var3 * (float)this.controlPathEnd.y * var3 + (var3 * ((float)(2 * this.controlPathControl.y) * (1.0f - var3)) + (float)this.controlPathStart.y * (-var3 + 1.0f) * (1.0f - var3)));
        if (param1 != 7560980) {
          return (Point2i) null;
        }
        return new Point2i(var4, var5);
    }

    static {
        field_J = "Sound: ";
        field_G = new ContentTransitionState();
    }
}
