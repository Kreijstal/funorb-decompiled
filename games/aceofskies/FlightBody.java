/*
 * Decompiled by CFR-JS 0.4.0.
 */
class FlightBody {
    Vector2 position;
    static ej field_c;
    double heading;
    int headingOffset;
    double speed;
    static SpriteData[] radarSpriteData;

    final void advance(int obfuscationGuard) {
        if (obfuscationGuard == 2) {
          this.moveForward(this.speed, 128);
          return;
        }
        FlightBody.a(-85, -82, 96, -41, -118, -52);
        this.moveForward(this.speed, 128);
    }

    public static void a(boolean param0) {
        radarSpriteData = null;
        field_c = null;
        if (!param0) {
          FlightBody.a(-30, 98, 16, -74, 112, -14);
        }
    }

    final void wrapSquare(double halfExtent, int obfuscationGuard) {
        this.wrapWorld(halfExtent, (byte) 49, halfExtent);
        if (obfuscationGuard >= -77) {
          radarSpriteData = (SpriteData[]) null;
        }
    }

    final void wrapWorld(double halfWidth, byte obfuscationGuard, double halfHeight) {
        if (this.position.x < -halfWidth) {
          this.position.x = this.position.x + halfWidth * 2.0;
          this.position.y = -this.position.y;
          if (!(this.position.x > halfWidth)) {
            this.position.y = -this.position.y;
            this.position.x = -this.position.x;
            if (-halfHeight > this.position.y) {
              this.position.y = this.position.y + 2.0 * halfHeight;
            }
            if (obfuscationGuard != 49) {
              this.speed = 1.33615424320731;
            }
            this.position.x = -this.position.x;
            if (halfHeight < this.position.y) {
              this.position.y = this.position.y - halfHeight * 2.0;
            }
            return;
          }
          this.position.x = this.position.x - 2.0 * halfWidth;
          this.position.y = -this.position.y;
          this.position.x = -this.position.x;
          if (!(-halfHeight > this.position.y)) {
            if (obfuscationGuard != 49) {
              this.speed = 1.33615424320731;
            }
            this.position.x = -this.position.x;
            if (halfHeight < this.position.y) {
              this.position.y = this.position.y - halfHeight * 2.0;
            }
            return;
          }
          this.position.y = this.position.y + 2.0 * halfHeight;
          if (obfuscationGuard == 49) {
            this.position.x = -this.position.x;
            if (halfHeight < this.position.y) {
              this.position.y = this.position.y - halfHeight * 2.0;
            }
            return;
          }
          this.speed = 1.33615424320731;
          this.position.x = -this.position.x;
          if (halfHeight < this.position.y) {
            this.position.y = this.position.y - halfHeight * 2.0;
          }
          return;
        }
        this.position.y = -this.position.y;
        if (this.position.x > halfWidth) {
          this.position.x = this.position.x - 2.0 * halfWidth;
          this.position.y = -this.position.y;
          this.position.x = -this.position.x;
          if (-halfHeight > this.position.y) {
            this.position.y = this.position.y + 2.0 * halfHeight;
            if (obfuscationGuard != 49) {
              this.speed = 1.33615424320731;
              this.position.x = -this.position.x;
              if (halfHeight < this.position.y) {
                this.position.y = this.position.y - halfHeight * 2.0;
              }
              return;
            }
            this.position.x = -this.position.x;
            if (halfHeight < this.position.y) {
              this.position.y = this.position.y - halfHeight * 2.0;
            }
            return;
          }
          if (obfuscationGuard == 49) {
            this.position.x = -this.position.x;
            if (halfHeight < this.position.y) {
              this.position.y = this.position.y - halfHeight * 2.0;
            }
            return;
          }
          this.speed = 1.33615424320731;
          this.position.x = -this.position.x;
          if (halfHeight < this.position.y) {
            this.position.y = this.position.y - halfHeight * 2.0;
          }
          return;
        }
        this.position.y = -this.position.y;
        this.position.x = -this.position.x;
        if (-halfHeight > this.position.y) {
          this.position.y = this.position.y + 2.0 * halfHeight;
          if (obfuscationGuard == 49) {
            this.position.x = -this.position.x;
            if (halfHeight < this.position.y) {
              this.position.y = this.position.y - halfHeight * 2.0;
            }
            return;
          }
          this.speed = 1.33615424320731;
          this.position.x = -this.position.x;
          if (halfHeight < this.position.y) {
            this.position.y = this.position.y - halfHeight * 2.0;
          }
          return;
        }
        if (obfuscationGuard == 49) {
          this.position.x = -this.position.x;
          if (halfHeight < this.position.y) {
            this.position.y = this.position.y - halfHeight * 2.0;
          }
          return;
        }
        this.speed = 1.33615424320731;
        this.position.x = -this.position.x;
        if (halfHeight < this.position.y) {
          this.position.y = this.position.y - halfHeight * 2.0;
        }
    }

    final void turn(double angleDelta, byte obfuscationGuard) {
        if (obfuscationGuard != 25) {
          field_c = (ej) null;
        }
        this.heading = this.heading + angleDelta;
        if (this.heading < 0.0) {
          this.heading = this.heading + 256.0;
        }
        if (this.heading > 256.0) {
          this.heading = this.heading - 256.0;
        }
    }

    final void moveForward(double distance, int angleDivisor) {
        double var4 = 3.141592653589793 * ((double)this.headingOffset + this.heading) / (double)angleDivisor;
        this.position.x = this.position.x - Math.sin(var4) * distance;
        this.position.y = this.position.y - Math.cos(var4) * distance;
        if (this.headingOffset < 0) {
          this.headingOffset = this.headingOffset + 1;
          if (this.headingOffset > 0) {
            this.headingOffset = this.headingOffset - 1;
            return;
          }
          return;
        }
        if (this.headingOffset <= 0) {
          return;
        }
        this.headingOffset = this.headingOffset - 1;
    }

    final void moveSideways(byte obfuscationGuard, double distance) {
        if (obfuscationGuard > 104) {
          double var4 = 3.141592653589793 * this.heading / 128.0;
          this.position.x = this.position.x - Math.cos(var4) * distance;
          this.position.y = this.position.y + Math.sin(var4) * distance;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_10_0 = 0;
        int stackIn_25_0 = 0;
        BitmapFontMetrics.field_b[os.field_w] = param1;
        uf.field_d[os.field_w] = os.field_w;
        js.field_c[os.field_w] = param5;
        if (ft.field_o < param5) {
          fj.field_d = param5;
        }
        if (param2 > 14) {
          if (op.field_a > param5) {
            nh.field_a = param5;
          }
          hg.field_C[os.field_w] = param4;
          qd.field_p[os.field_w] = param0;
          dd.field_c[os.field_w] = param3;
          int var6 = param0 + param4 + param3;
          if (0 == var6) {
            stackIn_25_0 = 0;
          } else {
            stackIn_25_0 = param4 * 1000 / var6;
          }
          int var7 = stackIn_25_0;
          ai.field_a[os.field_w] = var7;
          if (nh.field_a > var7) {
            nh.field_a = var7;
          }
          os.field_w = os.field_w + 1;
          if (fj.field_d >= var7) {
            return;
          }
          fj.field_d = var7;
          return;
        }
        radarSpriteData = (SpriteData[]) null;
        if (op.field_a > param5) {
          nh.field_a = param5;
        }
        hg.field_C[os.field_w] = param4;
        qd.field_p[os.field_w] = param0;
        dd.field_c[os.field_w] = param3;
        int var6Lifetime1 = param0 + param4 + param3;
        if (0 == var6Lifetime1) {
          stackIn_10_0 = 0;
        } else {
          stackIn_10_0 = param4 * 1000 / var6Lifetime1;
        }
        int var7Lifetime1 = stackIn_10_0;
        ai.field_a[os.field_w] = var7Lifetime1;
        if (nh.field_a > var7Lifetime1) {
          nh.field_a = var7Lifetime1;
        }
        os.field_w = os.field_w + 1;
        if (fj.field_d >= var7Lifetime1) {
          return;
        }
        fj.field_d = var7Lifetime1;
    }

    FlightBody(Vector2 position) {
        this.headingOffset = 0;
        this.heading = 0.0;
        this.speed = 0.0;
        try {
          this.position = new Vector2(position);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "o.<init>(" + (position != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new ej(1, 2, 2, 0);
    }
}
