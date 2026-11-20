/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackBoundary extends BoundaryCurve {
    static long[] field_w;
    Point2i end;
    static int field_x;
    static MouseWheelInput field_u;
    Point2i start;
    static Sprite[] field_t;
    static int menuHeight;

    final BoundaryCurve reversed(boolean param0) {
        if (!param0) {
          return (BoundaryCurve) ((Object) new TrackBoundary(this.end, this.start, this.layer, this.field_p, this.field_q));
        }
        return (BoundaryCurve) null;
    }

    final Vector2f getEndDirection(boolean param0) {
        if (!param0) {
          return new Vector2i(this.start, this.end).normalized(-114);
        }
        field_t = (Sprite[]) null;
        return new Vector2i(this.start, this.end).normalized(-114);
    }

    final Vector2f getStartDirection(int param0) {
        if (param0 == -1) {
          return new Vector2i(this.start, this.end).normalized(-117);
        }
        this.end = (Point2i) null;
        return new Vector2i(this.start, this.end).normalized(-117);
    }

    final Vector2f directionAt(byte param0, float param1) {
        if (param0 >= 117) {
          return new Vector2i(this.start, this.end).normalized(-126);
        }
        this.start = (Point2i) null;
        return new Vector2i(this.start, this.end).normalized(-126);
    }

    final Point2i getEndPoint(int param0) {
        if (param0 != 0) {
          field_x = 13;
          return this.end;
        }
        return this.end;
    }

    final Point2i pointAt(boolean param0, float param1) {
        if (!param0) {
          return new Point2i((int)((float)(this.end.x - this.start.x) * param1 + (float)this.start.x), (int)((float)(-this.start.y + this.end.y) * param1 + (float)this.start.y));
        }
        this.directionAt((byte) -61, 1.257719874382019f);
        return new Point2i((int)((float)(this.end.x - this.start.x) * param1 + (float)this.start.x), (int)((float)(-this.start.y + this.end.y) * param1 + (float)this.start.y));
    }

    final float length(int param0) {
        if (param0 == 50) {
          return (float)Math.sqrt((double)((-this.start.y + this.end.y) * (this.end.y - this.start.y) + (this.end.x - this.start.x) * (-this.start.x + this.end.x)));
        }
        this.lengthSquared(31);
        return (float)Math.sqrt((double)((-this.start.y + this.end.y) * (this.end.y - this.start.y) + (this.end.x - this.start.x) * (-this.start.x + this.end.x)));
    }

    final int lengthSquared(int param0) {
        if (param0 < -72) {
          return (-this.start.x + this.end.x) * (this.end.x - this.start.x) + (this.end.y - this.start.y) * (-this.start.y + this.end.y);
        }
        this.pointAt(true, 1.4694377183914185f);
        return (-this.start.x + this.end.x) * (this.end.x - this.start.x) + (this.end.y - this.start.y) * (-this.start.y + this.end.y);
    }

    TrackBoundary(Point2i param0, Point2i param1, int param2, boolean param3, boolean param4) {
        try {
          this.field_p = param3 ? true : false;
          this.end = param1;
          this.layer = param2;
          this.field_q = param4 ? true : false;
          this.start = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (!param0) {
          field_w = null;
          field_t = null;
          field_u = null;
          return;
        }
        field_t = (Sprite[]) null;
        field_w = null;
        field_t = null;
        field_u = null;
    }

    final static RotatedSpriteAsset[] createDestroyableSpriteAssets(String param0, byte param1) {
        RotatedSpriteAsset[] var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        int var4 = 0;
        RotatedSpriteAsset[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new RotatedSpriteAsset[2];
          var4 = -16 / ((param1 + 14) / 63);
          var2[0] = WeightedLruCache.createRotatedSpriteAsset(false, param0, true, false, 2048);
          var3 = param0 + "_destroyed";
          var2[1] = WeightedLruCache.createRotatedSpriteAsset(false, var3, true, false, 2048);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("lb.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_w = new long[32];
        field_x = 0;
        field_t = new Sprite[4];
    }
}
