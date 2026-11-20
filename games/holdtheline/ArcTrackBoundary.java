/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArcTrackBoundary extends BoundaryCurve {
    int radius;
    float endAngle;
    float startAngle;
    Point2i center;
    static LoginMethodPreference field_s;
    static String field_v;

    final float parameterAtAngle(float param0, int param1) {
        int var4;
        var4 = HoldTheLine.field_D;
        if (param1 != -7517) {
          this.parameterAtAngle(-0.6634728908538818f, -120);
        }
        if (this.endAngle < this.startAngle) {
          while (this.endAngle > param0) {
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
        return (param0 - this.startAngle) / (-this.startAngle + this.endAngle);
    }

    final BoundaryCurve reversed(boolean param0) {
        if (!param0) {
          return (BoundaryCurve) ((Object) new ArcTrackBoundary(this.center, this.radius, this.endAngle, this.startAngle, this.layer, this.field_p, this.field_q));
        }
        return (BoundaryCurve) null;
    }

    final Point2i pointAt(boolean param0, float param1) {
        float var3 = 0.0f;
        float var3Lifetime1;
        if (!param0) {
          var3 = param1 * (this.endAngle - this.startAngle) + this.startAngle;
          return new Point2i((int)((double)this.center.x + (double)this.radius * Math.cos((double)var3)), (int)((double)this.center.y - (double)this.radius * Math.sin((double)var3)));
        }
        this.containsAngle(0.47763046622276306f, 120);
        var3Lifetime1 = param1 * (this.endAngle - this.startAngle) + this.startAngle;
        return new Point2i((int)((double)this.center.x + (double)this.radius * Math.cos((double)var3Lifetime1)), (int)((double)this.center.y - (double)this.radius * Math.sin((double)var3Lifetime1)));
    }

    final Point2i getEndPoint(int param0) {
        if (param0 == 0) {
          return new Point2i((int)((double)this.center.x + (double)this.radius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.radius * Math.sin((double)this.endAngle)));
        }
        this.pointAt(false, -0.22441181540489197f);
        return new Point2i((int)((double)this.center.x + (double)this.radius * Math.cos((double)this.endAngle)), (int)((double)this.center.y - (double)this.radius * Math.sin((double)this.endAngle)));
    }

    final Vector2f getStartDirection(int param0) {
        if (param0 != -1) {
          this.length(-99);
          if (!(this.endAngle > this.startAngle)) {
            return new Vector2f((float)Math.sin((double)this.startAngle), (float)Math.cos((double)this.startAngle));
          }
          return new Vector2f((float)(-Math.sin((double)this.startAngle)), (float)(-Math.cos((double)this.startAngle)));
        }
        if (!(this.endAngle > this.startAngle)) {
          return new Vector2f((float)Math.sin((double)this.startAngle), (float)Math.cos((double)this.startAngle));
        }
        return new Vector2f((float)(-Math.sin((double)this.startAngle)), (float)(-Math.cos((double)this.startAngle)));
    }

    public static void clearSharedReferences(boolean param0) {
        field_v = null;
        if (param0) {
          field_s = (LoginMethodPreference) null;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final Vector2f directionAt(byte param0, float param1) {
        float var3 = 0.0f;
        float var3Lifetime1;
        if (param0 > 117) {
          var3 = this.startAngle + param1 * (-this.startAngle + this.endAngle);
          return new Vector2f(var3);
        }
        field_v = (String) null;
        var3Lifetime1 = this.startAngle + param1 * (-this.startAngle + this.endAngle);
        return new Vector2f(var3Lifetime1);
    }

    final static int getCourseAccessStatus(int param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1 >= -5) {
          field_s = (LoginMethodPreference) null;
          var3 = PolarSortVector.getChampionshipAccessStatus((byte) 35, param2);
          if (var3 != 0) {
            return var3;
          }
          if (param2 != BoundaryLoopClipper.field_b) {
            return 0;
          }
          if (RoadControlPathBuilder.field_d < param0) {
            return 1;
          }
          return 0;
        }
        var3Lifetime1 = PolarSortVector.getChampionshipAccessStatus((byte) 35, param2);
        if (var3Lifetime1 != 0) {
          return var3Lifetime1;
        }
        if (param2 != BoundaryLoopClipper.field_b) {
          return 0;
        }
        if (RoadControlPathBuilder.field_d < param0) {
          return 1;
        }
        return 0;
    }

    ArcTrackBoundary(Point2i param0, int param1, float param2, float param3, int param4, boolean param5, boolean param6) {
        try {
          this.field_q = param6 ? true : false;
          this.radius = param1;
          this.center = param0;
          this.startAngle = param2;
          this.field_p = param5 ? true : false;
          this.endAngle = param3;
          this.layer = param4;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean containsAngle(float param0, int param1) {
        int var4;
        boolean stackIn_9_0 = false;
        boolean stackIn_19_0 = false;
        var4 = HoldTheLine.field_D;
        if (param1 != 13012) {
          return false;
        }
        if (this.startAngle > this.endAngle) {
          while (param0 > this.endAngle) {
            param0 = (float)((double)param0 - 6.283185307179586);
          }
          while (this.endAngle > param0) {
            param0 = (float)((double)param0 + 6.283185307179586);
          }
          stackIn_19_0 = !(!(this.startAngle > param0));
          return stackIn_19_0;
        }
        while (this.startAngle < param0) {
          param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (this.startAngle > param0) {
          param0 = (float)((double)param0 + 6.283185307179586);
        }
        stackIn_9_0 = !(!(param0 < this.endAngle));
        return stackIn_9_0;
    }

    final Vector2f getEndDirection(boolean param0) {
        if (param0) {
          return (Vector2f) null;
        }
        if (this.startAngle < this.endAngle) {
          return new Vector2f((float)(-Math.sin((double)this.endAngle)), (float)(-Math.cos((double)this.endAngle)));
        }
        return new Vector2f((float)Math.sin((double)this.endAngle), (float)Math.cos((double)this.endAngle));
    }

    final float length(int param0) {
        if (param0 == 50) {
          return Math.abs(this.endAngle - this.startAngle) * (float)this.radius;
        }
        ArcTrackBoundary.clearSharedReferences(false);
        return Math.abs(this.endAngle - this.startAngle) * (float)this.radius;
    }

    static {
        field_s = new LoginMethodPreference("usename");
        field_v = "Invulnerability";
    }
}
