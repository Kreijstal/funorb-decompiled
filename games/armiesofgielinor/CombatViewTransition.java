/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CombatViewTransition {
    private int[] field_g;
    private int field_o;
    private int[] field_a;
    int transitionFactor;
    private int field_e;
    private int[] field_b;
    private int field_c;
    private int field_m;
    private int[] field_i;
    private boolean field_h;
    static je field_p;
    private int field_l;
    BattleCamera camera;
    private int field_j;
    private int[] field_d;
    private int[] field_f;

    final static int a(int param0, int param1, int param2, byte param3) {
        if (param0 < 0) {
          return param2;
        }
        if (0 > param1) {
          return param2;
        }
        if (ResourceRequest.field_y <= param0) {
          return param2;
        }
        if (param1 >= ef.field_c) {
          return param2;
        }
        if (param3 < -91) {
          return CampaignMenuEntry.field_u[param0 + ResourceRequest.field_y * param1];
        }
        return -54;
    }

    final boolean isExpanded(byte obfuscationGuard) {
        int var2 = -78 / ((obfuscationGuard - 41) / 62);
        return this.transitionFactor == 256 ? true : false;
    }

    final void a(int param0, int param1) {
        this.field_e = 256;
        this.field_i[0] = 16;
        this.field_i[1] = 16;
        this.field_j = -this.field_j + this.field_o;
        this.field_m = 0;
        this.field_g[1] = this.field_l;
        this.field_g[0] = this.field_c;
        this.camera.projectTile(1, param1);
        this.field_a[0] = this.camera.screenPosition[0];
        this.field_a[1] = this.camera.screenPosition[1];
        this.field_b[0] = so.field_b.field_a >> 1;
        this.field_b[1] = so.field_b.field_g >> 1;
        this.field_h = false;
        if (param0 > -59) {
          this.isExpanded((byte) -51);
        }
    }

    final void a(int param0, RgbSprite param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3_ref = null;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        try {
          try {
            var7 = this.transitionFactor;
            var6 = param1.canvasHeight;
            var5 = param1.canvasWidth;
            var5Lifetime1 = this.field_d[0];
            var6Lifetime1 = this.field_d[1];
            var4 = -(var6Lifetime1 >> 1) + (this.field_l >> 1);
            var8 = -55 / ((param0 + 18) / 37);
            var3_int = (this.field_c >> 1) - (var5Lifetime1 >> 1);
            var4Lifetime1 = this.field_f[1];
            var3_intLifetime1 = this.field_f[0];
            var4Lifetime1 = var4Lifetime1 - (var6Lifetime1 >> 1);
            var3_intLifetime1 = var3_intLifetime1 - (var5Lifetime1 >> 1);
            if (256 == var7) {
              param1.c(var3_intLifetime1, var4Lifetime1, var5Lifetime1, var6Lifetime1);
            } else {
              param1.c(var3_intLifetime1, var4Lifetime1, var5Lifetime1, var6Lifetime1, var7);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            var3_ref.printStackTrace();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sr.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 == 1) {
          if (param3 <= 0) {
            param3 = 1;
          }
          var6 = param4 - param2;
          var7 = var6 * param1 / param3 + param2;
          return var7;
        }
        this.a(9, -1);
        if (param3 <= 0) {
          param3 = 1;
        }
        var6Lifetime1 = param4 - param2;
        var7Lifetime1 = var6Lifetime1 * param1 / param3 + param2;
        return var7Lifetime1;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var3Lifetime3;
        if (this.field_o == this.field_j) {
          this.field_f[1] = so.field_b.field_g >> 1;
          this.field_f[0] = so.field_b.field_a >> 1;
          return;
        }
        if (param0 != 1959107777) {
          return;
        }
        if (this.field_h) {
          this.field_a[0] = so.field_b.field_a >> 1;
          this.field_a[1] = so.field_b.field_g >> 1;
          this.a(-120);
          this.transitionFactor = this.a(param0 - 1959107776, this.field_j, this.field_e, this.field_o, this.field_m);
          var2 = this.field_i[0] - this.field_g[0];
          var3 = this.a((byte) -71, var2);
          var2 = var3 * var2;
          var4 = -this.field_g[0] + this.field_d[0];
          var3Lifetime3 = this.a((byte) -71, var4);
          var4 = var3Lifetime3 * var4;
          this.field_f[0] = this.a(1, var4, this.field_b[0], var2, this.field_a[0]);
          this.field_f[1] = this.a(1, var4, this.field_b[1], var2, this.field_a[1]);
          if (this.field_o > this.field_j) {
            this.field_j = this.field_j + 1;
          }
          if (this.field_o == this.field_j) {
            this.b(-85);
          }
          return;
        }
        this.field_b[1] = so.field_b.field_g >> 1;
        this.field_b[0] = so.field_b.field_a >> 1;
        this.a(-120);
        this.transitionFactor = this.a(param0 - 1959107776, this.field_j, this.field_e, this.field_o, this.field_m);
        var2Lifetime1 = this.field_i[0] - this.field_g[0];
        var3Lifetime1 = this.a((byte) -71, var2Lifetime1);
        var2Lifetime1 = var3Lifetime1 * var2Lifetime1;
        var4Lifetime1 = -this.field_g[0] + this.field_d[0];
        var3Lifetime2 = this.a((byte) -71, var4Lifetime1);
        var4Lifetime1 = var3Lifetime2 * var4Lifetime1;
        this.field_f[0] = this.a(1, var4Lifetime1, this.field_b[0], var2Lifetime1, this.field_a[0]);
        this.field_f[1] = this.a(1, var4Lifetime1, this.field_b[1], var2Lifetime1, this.field_a[1]);
        if (this.field_o > this.field_j) {
          this.field_j = this.field_j + 1;
        }
        if (this.field_o == this.field_j) {
          this.b(-85);
        }
    }

    private final void a(int param0) {
        int var2 = -77 / ((param0 + 64) / 53);
        this.field_d[0] = (this.field_i[0] * this.field_j + (-this.field_j + this.field_o) * this.field_g[0]) / this.field_o;
        this.field_d[1] = (this.field_i[1] * this.field_j + this.field_g[1] * (-this.field_j + this.field_o)) / this.field_o;
    }

    private final int a(byte param0, int param1) {
        if (param0 == -71) {
          return param1 >= 0 ? 1 : -1;
        }
        this.a(-4, 101);
        return param1 >= 0 ? 1 : -1;
    }

    final void b(int param0, int param1) {
        this.field_j = 0;
        this.field_g[1] = 16;
        this.field_e = 0;
        this.field_m = 256;
        this.field_g[0] = 16;
        this.field_i[0] = this.field_c;
        this.field_i[1] = this.field_l;
        this.camera.projectTile(1, param0);
        this.field_b[1] = this.camera.screenPosition[1];
        this.field_b[0] = this.camera.screenPosition[0];
        this.field_h = true;
        int var3 = -107 / ((74 - param1) / 42);
        this.field_a[0] = so.field_b.field_a >> 1;
        this.field_a[1] = so.field_b.field_g >> 1;
    }

    private final void b(int param0) {
        this.field_d[0] = this.field_i[0];
        this.transitionFactor = this.field_m;
        this.field_d[1] = this.field_i[1];
        if (param0 <= -41) {
          this.field_f[1] = this.field_a[1];
          this.field_f[0] = this.field_a[0];
          return;
        }
        this.field_g = (int[]) null;
        this.field_f[1] = this.field_a[1];
        this.field_f[0] = this.field_a[0];
    }

    final static int c(int param0, int param1) {
        if (param1 < 67) {
          return 4;
        }
        return TriangleRasterizer.sineTable[param0 & 2047];
    }

    public static void b(byte param0) {
        field_p = null;
        if (param0 != 120) {
          CombatViewTransition.a(51, -118, -11, (byte) 113);
        }
    }

    CombatViewTransition(int param0, int param1, BattleCamera param2) {
        this.field_o = 60;
        try {
          this.field_a = new int[2];
          this.camera = param2;
          this.field_d = new int[2];
          this.field_i = new int[2];
          this.field_f = new int[2];
          this.field_g = new int[2];
          this.field_l = param1;
          this.field_c = param0;
          this.field_b = new int[2];
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sr.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
