/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends UiContainer {
    static BitmapFont field_x;
    private int field_w;
    static int field_A;
    static String field_y;
    boolean field_z;
    ida field_v;

    private final int c(boolean param0) {
        if (!param0) {
          return this.field_z ? this.field_v.g(0) != this ? 0 : 256 : 0;
        }
        this.c(-88, 94, 112);
        return this.field_z ? this.field_v.g(0) != this ? 0 : 256 : 0;
    }

    final UiComponent getFocusedChild(byte param0) {
        UiComponent var2 = super.getFocusedChild((byte) -123);
        if (param0 > -3) {
          return (UiComponent) null;
        }
        if (var2 != null) {
          return var2;
        }
        return (UiComponent) (this);
    }

    boolean a(int param0) {
        if (param0 != 248) {
          bl.d(true);
        }
        int var2 = this.c(false);
        int var3 = var2 - this.field_w;
        if (0 < var3) {
          this.field_w = this.field_w + (-1 + var3 + 8) / 8;
        }
        if (var3 >= 0) {
          if (this.field_w != 0) {
            return false;
          }
          if (var2 == 0) {
            return !this.field_z ? true : false;
          }
          return false;
        }
        this.field_w = this.field_w + (1 + (var3 - 16)) / 16;
        if (this.field_w != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_z ? true : false;
        }
        return false;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_w == 0) {
          return;
        }
        if (this.field_w >= 256) {
          if (param1 != 0) {
            return;
          }
          this.b(param3 + this.y, 1630174241, param0 + this.x);
          super.drawLayer(param0, param1, 101, param3);
          return;
        }
        if (null == GpuFaceNormal.field_b) {
          GpuFaceNormal.field_b = new Sprite(this.width, this.height);
          SetTorpedoEnergyUsed.a(111, GpuFaceNormal.field_b);
          SoftwareRasterizer2D.clear();
          this.b(0, 1630174241, 0);
          super.drawLayer(-param0 - this.x, param1, 127, -this.y - param3);
          if (param2 > 47) {
            bia.popRasterState((byte) 124);
            GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
            return;
          }
          this.j((byte) 123);
          bia.popRasterState((byte) 124);
          GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
          return;
        }
        if (GpuFaceNormal.field_b.width < this.width) {
          GpuFaceNormal.field_b = new Sprite(this.width, this.height);
          SetTorpedoEnergyUsed.a(111, GpuFaceNormal.field_b);
          SoftwareRasterizer2D.clear();
          this.b(0, 1630174241, 0);
          super.drawLayer(-param0 - this.x, param1, 127, -this.y - param3);
          if (param2 > 47) {
            bia.popRasterState((byte) 124);
            GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
            return;
          }
          this.j((byte) 123);
          bia.popRasterState((byte) 124);
          GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
          return;
        }
        if (this.height > GpuFaceNormal.field_b.height) {
          GpuFaceNormal.field_b = new Sprite(this.width, this.height);
          SetTorpedoEnergyUsed.a(111, GpuFaceNormal.field_b);
          SoftwareRasterizer2D.clear();
          this.b(0, 1630174241, 0);
          super.drawLayer(-param0 - this.x, param1, 127, -this.y - param3);
          if (param2 > 47) {
            bia.popRasterState((byte) 124);
            GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
            return;
          }
          this.j((byte) 123);
          bia.popRasterState((byte) 124);
          GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
          return;
        }
        SetTorpedoEnergyUsed.a(111, GpuFaceNormal.field_b);
        SoftwareRasterizer2D.clear();
        this.b(0, 1630174241, 0);
        super.drawLayer(-param0 - this.x, param1, 127, -this.y - param3);
        if (param2 > 47) {
          bia.popRasterState((byte) 124);
          GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
          return;
        }
        this.j((byte) 123);
        bia.popRasterState((byte) 124);
        GpuFaceNormal.field_b.drawAlpha(param0 + this.x, this.y + param3, this.field_w);
    }

    boolean j(byte param0) {
        this.field_w = this.c(false);
        if (param0 != 55) {
          return false;
        }
        if (0 != this.field_w) {
          return false;
        }
        if (!this.field_z) {
          return true;
        }
        return false;
    }

    abstract void b(int param0, int param1, int param2);

    final void c(int param0, int param1, int param2) {
        this.setBounds(-param0 + ComponentBehaviourFactory.field_a >> 1, param0, param2, 1, GetSniperCannonFiringLeeway.field_p - param2 >> 1);
        if (param1 != -1860440319) {
          this.field_z = false;
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_y = null;
        if (param0 != -17) {
          bl.d(false);
          field_x = null;
          return;
        }
        field_x = null;
    }

    final static void d(boolean param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = GetAngularVelocitySustain.field_q;
          var1 = var5;
          if (param0) {
            bl.clearSharedReferences((byte) 60);
          }
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1_ref), "bl.EA(" + param0 + ')');
        }
    }

    bl(ida param0, int param1, int param2) {
        super(ComponentBehaviourFactory.field_a - param1 >> 1, -param2 + GetSniperCannonFiringLeeway.field_p >> 1, param1, param2, (UiRenderer) null);
        try {
          this.field_w = 0;
          this.field_v = param0;
          this.field_z = false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_y = "Change team of clicked ship";
    }
}
