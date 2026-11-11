/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FollowCamera implements Camera {
    private int field_c;
    private int field_j;
    private int x;
    private int stillFrames;
    private int field_b;
    private int maxY;
    private int minY;
    private CameraTarget target;
    private int y;
    private int maxX;
    private int field_k;
    private int minX;
    private int field_e;

    final int a(int param0) {
        if (param0 != -862393232) {
          this.field_c = -119;
        }
        return this.field_e;
    }

    final int getX(int param0) {
        if (param0 != -30661) {
          this.maxX = -50;
        }
        return this.x;
    }

    final static void openLoginForm(boolean param0, boolean param1, boolean param2, String param3) {
        try {
          LegacyOpenGlPostProcessEffect.a(param2);
          ej.field_a.e(true);
          vn.field_b = new LoginForm(ScrollControlWidget.field_E, (String) null, LoadProfileCommand.field_r, param1, param0);
          um.field_l = new mpa(ej.field_a, vn.field_b);
          ej.field_a.c(um.field_l, 114);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ag.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void setTarget(CameraTarget param0, int param1) {
        int discarded$0 = 0;
        try {
          this.target = param0;
          if (param1 != -1) {
            discarded$0 = this.clampAxis(-111, 10, 84, 17, 71);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ag.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void update(byte param0) {
        float var2;
        float var3;
        float var4;
        float var5;
        float var6;
        float var7;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        if (this.target == null) {
          this.applyBounds(12052);
          return;
        }
        var2 = (float)((this.target.getRenderX((byte) -103) >> 16) - this.x);
        if (param0 < 84) {
          this.field_b = -28;
        }
        var3 = (float)((this.target.getRenderY((byte) 124) >> 16) - this.y);
        var4 = var3 * var3 + var2 * var2;
        if (!(var4 > 576.0f)) {
          this.stillFrames = this.stillFrames + 1;
          if (50.0f < (float)this.stillFrames) {
            if (!(4.0f < var4)) {
              this.stillFrames = 0;
            } else {
              var5 = 2.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
              this.y = this.y + (int)(var5 * var3);
              this.x = this.x + (int)(var5 * var2);
            }
          }
        } else {
          var5 = 24.0f / (float)Math.sqrt((double)(var3 * var3 + var2 * var2));
          var6 = var2 * var5;
          var7 = var5 * var3;
          this.x = this.x + (int)(var2 - var6);
          this.y = this.y + (int)(-var7 + var3);
          this.stillFrames = 0;
        }
        this.applyBounds(12052);
        return;
    }

    public final void clampToBounds(boolean param0) {
        if (param0) {
          this.maxY = 75;
        }
        this.applyBounds(12052);
    }

    public final void setBounds(int param0, byte param1, int param2, int param3, int param4) {
        this.minY = param0;
        this.minX = param3;
        if (param1 != -3) {
          return;
        }
        this.maxY = param2;
        this.maxX = param4;
    }

    final static boolean hasFlag2048(int param0, int param1, int param2) {
        if (param0 != -1) {
          return true;
        }
        return (2048 & param1) != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -30023) {
          this.setBounds(46, (byte) 61, 4, -69, -91);
        }
    }

    final void setViewport(int param0, int param1, int param2, int param3, int param4) {
        this.field_c = param2;
        this.field_j = param4;
        this.field_b = param1;
        this.field_k = param3;
        if (param0 <= 30) {
          this.field_j = -66;
        }
    }

    public final void nudge(int param0, int param1, int param2, int param3) {
        this.x = this.x + param2;
        this.y = this.y + param0;
        if (param3 != 26768) {
          this.maxX = -105;
        }
    }

    final static void a(int param0, Sprite[] param1, int param2, int param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != null &&
            param4 > 0) {
            var5_int = param1[0].field_n;
            var6 = param1[2].field_n;
            var7 = param1[1].field_n;
            param1[0].drawTransparent(param3, param0);
            param1[2].drawTransparent(-var6 + param4 + param3, param0);
            SoftwareRasterizer.saveClip(ic.field_d);
            SoftwareRasterizer.intersectClip(param3 + var5_int, param0, -var6 + (param3 + param4), param0 + param1[1].field_k);
            var8 = param3 + var5_int;
            var9 = -var6 + (param3 + param4);
            param3 = var8;
            if (param2 >= -21) {
              return;
            }
            while (param3 < var9) {
              param1[1].drawTransparent(param3, param0);
              param3 = param3 + var7;
            }
            SoftwareRasterizer.restoreClip(ic.field_d);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ag.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int getY(byte param0) {
        int var2 = -96 % ((param0 - 3) / 58);
        return this.y;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          this.nudge(-41, -19, 59, 15);
        }
    }

    final void a(int param0, byte param1) {
        this.field_e = param0;
        if (param1 != -88) {
          this.maxX = 40;
        }
    }

    private final void applyBounds(int param0) {
        int var2 = this.field_b - this.field_c;
        int var3 = this.field_j - this.field_k;
        this.x = this.clampAxis(this.minX, this.maxX, var2, this.x, param0 ^ 12052);
        this.y = this.clampAxis(this.minY, this.maxY, var3, this.y, param0 ^ param0);
    }

    private final int clampAxis(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        var8 = TombRacer.field_G ? 1 : 0;
        var6 = param1 - param0;
        if (var6 <= 0) {
          return param3;
        }
        if (param4 != 0) {
          this.y = -110;
        }
        var7 = param3;
        if (param2 <= var6) {
          if (param0 > param3 - param2 / 2) {
            var7 = param2 / 2 + param0;
          } else {
            if (param3 + param2 / 2 > param1) {
              var7 = param1 - param2 / 2;
            }
          }
        } else {
          var7 = (param1 - param0) / 2 + param0;
        }
        return var7;
    }

    final static void sortDisplayModes(int param0, dh[] param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        dh var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param1.length;
          for (var3 = 1; var3 < var2_int; var3++) {
            var4 = param1[var3];
            for (var5 = var3 - 1; var5 >= 0; var5--) {
              if (ComponentMount.compareDisplayModes(var4, 13, param1[var5])) {
                param1[1 + var5] = param1[var5];
                continue;
              }
              break;
            }
            param1[1 + var5] = var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ag.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
    }
}
