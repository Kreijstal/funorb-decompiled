/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends vj {
    int field_u;
    float field_w;
    float field_r;
    Point2i field_t;
    static mf field_s;
    static String field_v;

    final float b(float param0, int param1) {
        int var4;
        var4 = HoldTheLine.field_D;
        if (param1 != -7517) {
          this.b(-0.6634728908538818f, -120);
        }
        if (this.field_w < this.field_r) {
          while (this.field_w > param0) {
            param0 = (float)((double)param0 + 6.283185307179586);
          }
          while (this.field_r < param0) {
            param0 = (float)((double)param0 - 6.283185307179586);
          }
          return (-this.field_r + param0) / (this.field_w - this.field_r);
        }
        while (this.field_w < param0) {
          param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (this.field_r > param0) {
          param0 = (float)((double)param0 + 6.283185307179586);
        }
        return (param0 - this.field_r) / (-this.field_r + this.field_w);
    }

    final vj c(boolean param0) {
        if (!param0) {
          return (vj) ((Object) new gj(this.field_t, this.field_u, this.field_w, this.field_r, this.field_k, this.field_p, this.field_q));
        }
        return (vj) null;
    }

    final Point2i a(boolean param0, float param1) {
        float var3 = 0.0f;
        float var3Lifetime1;
        if (!param0) {
          var3 = param1 * (this.field_w - this.field_r) + this.field_r;
          return new Point2i((int)((double)this.field_t.x + (double)this.field_u * Math.cos((double)var3)), (int)((double)this.field_t.y - (double)this.field_u * Math.sin((double)var3)));
        }
        this.a(0.47763046622276306f, 120);
        var3Lifetime1 = param1 * (this.field_w - this.field_r) + this.field_r;
        return new Point2i((int)((double)this.field_t.x + (double)this.field_u * Math.cos((double)var3Lifetime1)), (int)((double)this.field_t.y - (double)this.field_u * Math.sin((double)var3Lifetime1)));
    }

    final Point2i a(int param0) {
        if (param0 == 0) {
          return new Point2i((int)((double)this.field_t.x + (double)this.field_u * Math.cos((double)this.field_w)), (int)((double)this.field_t.y - (double)this.field_u * Math.sin((double)this.field_w)));
        }
        this.a(false, -0.22441181540489197f);
        return new Point2i((int)((double)this.field_t.x + (double)this.field_u * Math.cos((double)this.field_w)), (int)((double)this.field_t.y - (double)this.field_u * Math.sin((double)this.field_w)));
    }

    final Vector2f g(int param0) {
        if (param0 != -1) {
          this.f(-99);
          if (!(this.field_w > this.field_r)) {
            return new Vector2f((float)Math.sin((double)this.field_r), (float)Math.cos((double)this.field_r));
          }
          return new Vector2f((float)(-Math.sin((double)this.field_r)), (float)(-Math.cos((double)this.field_r)));
        }
        if (!(this.field_w > this.field_r)) {
          return new Vector2f((float)Math.sin((double)this.field_r), (float)Math.cos((double)this.field_r));
        }
        return new Vector2f((float)(-Math.sin((double)this.field_r)), (float)(-Math.cos((double)this.field_r)));
    }

    public static void clearSharedReferences(boolean param0) {
        field_v = null;
        if (param0) {
          field_s = (mf) null;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final Vector2f a(byte param0, float param1) {
        float var3 = 0.0f;
        float var3Lifetime1;
        if (param0 > 117) {
          var3 = this.field_r + param1 * (-this.field_r + this.field_w);
          return new Vector2f(var3);
        }
        field_v = (String) null;
        var3Lifetime1 = this.field_r + param1 * (-this.field_r + this.field_w);
        return new Vector2f(var3Lifetime1);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1 >= -5) {
          field_s = (mf) null;
          var3 = pf.a((byte) 35, param2);
          if (var3 != 0) {
            return var3;
          }
          if (param2 != ao.field_b) {
            return 0;
          }
          if (hk.field_d < param0) {
            return 1;
          }
          return 0;
        }
        var3Lifetime1 = pf.a((byte) 35, param2);
        if (var3Lifetime1 != 0) {
          return var3Lifetime1;
        }
        if (param2 != ao.field_b) {
          return 0;
        }
        if (hk.field_d < param0) {
          return 1;
        }
        return 0;
    }

    gj(Point2i param0, int param1, float param2, float param3, int param4, boolean param5, boolean param6) {
        try {
          this.field_q = param6 ? true : false;
          this.field_u = param1;
          this.field_t = param0;
          this.field_r = param2;
          this.field_p = param5 ? true : false;
          this.field_w = param3;
          this.field_k = param4;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final boolean a(float param0, int param1) {
        int var4;
        boolean stackIn_9_0 = false;
        boolean stackIn_19_0 = false;
        var4 = HoldTheLine.field_D;
        if (param1 != 13012) {
          return false;
        }
        if (this.field_r > this.field_w) {
          while (param0 > this.field_w) {
            param0 = (float)((double)param0 - 6.283185307179586);
          }
          while (this.field_w > param0) {
            param0 = (float)((double)param0 + 6.283185307179586);
          }
          stackIn_19_0 = !(!(this.field_r > param0));
          return stackIn_19_0;
        }
        while (this.field_r < param0) {
          param0 = (float)((double)param0 - 6.283185307179586);
        }
        while (this.field_r > param0) {
          param0 = (float)((double)param0 + 6.283185307179586);
        }
        stackIn_9_0 = !(!(param0 < this.field_w));
        return stackIn_9_0;
    }

    final Vector2f a(boolean param0) {
        if (param0) {
          return (Vector2f) null;
        }
        if (this.field_r < this.field_w) {
          return new Vector2f((float)(-Math.sin((double)this.field_w)), (float)(-Math.cos((double)this.field_w)));
        }
        return new Vector2f((float)Math.sin((double)this.field_w), (float)Math.cos((double)this.field_w));
    }

    final float f(int param0) {
        if (param0 == 50) {
          return Math.abs(this.field_w - this.field_r) * (float)this.field_u;
        }
        gj.clearSharedReferences(false);
        return Math.abs(this.field_w - this.field_r) * (float)this.field_u;
    }

    static {
        field_s = new mf("usename");
        field_v = "Invulnerability";
    }
}
