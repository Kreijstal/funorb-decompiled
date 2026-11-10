/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt implements Renderable {
    private boolean field_g;
    static int field_b;
    SnakePitModel field_a;
    private boolean field_f;
    private bua field_d;
    PitSnake field_e;
    static jea[] field_c;
    static int[] field_h;

    public final int getRenderY(byte param0) {
        if (param0 <= 91) {
          return 125;
        }
        return this.field_a.getRenderY((byte) 112) + this.field_e.f(0);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        field_h = null;
        field_c = null;
    }

    public final void render(int param0, iq param1) {
        int var3_int = 0;
        int var4 = 0;
        ka var5 = null;
        try {
          var3_int = this.field_e.d(2);
          var4 = GameScreen.a(-(PortalBehaviour.directionToAngle(ne.field_f[var3_int][1], ne.field_f[var3_int][0], 1) >> 2) + 512, 2048, 73);
          if (param0 < 103) {
            bt.a((byte) 44, -55, -63, 37);
          }
          var5 = this.field_d.b((byte) 74);
          gqa.a(var4, -83584144, this.getRenderY((byte) 120), this.getRenderX((byte) -89), var5, this.getRenderZ((byte) -95));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bt.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void f(int param0) {
        if (this.field_e.b(180)) {
          if (!this.field_g) {
            this.field_d.a(1, false, (byte) -85, 9);
            this.field_d.a(6, this.field_d.c((byte) 50), 1, -1);
          }
          this.field_f = false;
          this.field_g = true;
        } else {
          if (!this.field_f) {
            this.field_d.a(1, false, (byte) 120, 8);
            this.field_d.a(7, this.field_d.c((byte) -97), 1, -1);
          }
          this.field_f = true;
          this.field_g = false;
        }
        if (param0 != -4366) {
          field_h = (int[]) null;
        } else {
          this.field_d.a(0);
          return;
        }
        this.field_d.a(0);
    }

    public final int getRenderX(byte param0) {
        int var2 = -13 / ((-23 - param0) / 53);
        return this.field_a.getRenderX((byte) 101) + this.field_e.a((byte) 84);
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        if (SoftwareRasterizer.field_g >= param3 + param1) {
          return param3;
        }
        if (param0 != -8) {
          bt.a((byte) 51, -70, 71, 100);
          if (-param1 + param3 + param2 < 0) {
            return -param1 + SoftwareRasterizer.field_g;
          }
          return -param1 + param2 + param3;
        }
        if (-param1 + param3 + param2 < 0) {
          return -param1 + SoftwareRasterizer.field_g;
        }
        return -param1 + param2 + param3;
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          this.field_e = (PitSnake) null;
          return this.field_a.isRenderExpired((byte) 48);
        }
        return this.field_a.isRenderExpired((byte) 48);
    }

    bt() {
        this.field_d = new bua(6, 4, 1);
        this.field_d.a(1, true, (byte) -102, 7);
        this.field_f = true;
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          bt.releaseStatics(-6);
          return this.field_a.getRenderZ((byte) -94);
        }
        return this.field_a.getRenderZ((byte) -94);
    }

    static {
    }
}
