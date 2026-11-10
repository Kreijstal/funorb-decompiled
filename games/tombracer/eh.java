/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh implements Renderable {
    int field_f;
    static byte[][] field_i;
    PlatformModel field_e;
    int field_h;
    int field_a;
    bua field_g;
    int field_c;
    int field_d;
    int field_b;

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return this.field_e.isRenderExpired((byte) 48);
    }

    final void a(int param0) {
        int var3;
        iq var4;
        iq var4Lifetime1;
        iq var4Lifetime2;
        var3 = TombRacer.field_G ? 1 : 0;
        this.field_g = new bua(1, this.field_f);
        if (this.field_e.n((byte) 87) == 4) {
          if (this.field_b < 33) {
            this.field_g.a(3, false, (byte) -96, 10);
          } else {
            if (66 <= this.field_b) {
              this.field_g.a(3, false, (byte) -98, 12);
            } else {
              this.field_g.a(3, false, (byte) 24, 11);
            }
          }
          return;
        }
        if (this.field_e.n((byte) 87) != 0) {
          return;
        }
        if (this.field_b < 33) {
          this.field_g.a(3, false, (byte) 94, 3);
          if (param0 > 27) {
            return;
          }
          var4 = (iq) null;
          this.render(-82, (iq) null);
          return;
        }
        if (this.field_b >= 66) {
          this.field_g.a(3, false, (byte) 48, 5);
          if (param0 > 27) {
            return;
          }
          var4Lifetime1 = (iq) null;
          this.render(-82, (iq) null);
          return;
        }
        this.field_g.a(3, false, (byte) 34, 4);
        if (param0 > 27) {
          return;
        }
        var4Lifetime2 = (iq) null;
        this.render(-82, (iq) null);
        return;
    }

    public static void releaseStatics(byte param0) {
        int var1 = -71 % ((-17 - param0) / 49);
        field_i = (byte[][]) null;
    }

    public final void render(int param0, iq param1) {
        try {
          gqa.a(this.field_a, -83584144, this.getRenderY((byte) 123), this.getRenderX((byte) 122), this.field_g.b((byte) 74), this.getRenderZ((byte) -88));
          if (param0 < 103) {
            this.updateAnimation(-75);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "eh.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getRenderY(byte param0) {
        if (param0 >= 91) {
          return this.field_e.getRenderY((byte) 112) + this.field_c + this.field_e.i(1024);
        }
        this.isRenderExpired((byte) 85);
        return this.field_e.getRenderY((byte) 112) + this.field_c + this.field_e.i(1024);
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          iq var3 = (iq) null;
          this.render(-33, (iq) null);
        }
    }

    public final int getRenderX(byte param0) {
        int var2 = 116 % ((-23 - param0) / 53);
        return this.field_e.getRenderX((byte) -89) + this.field_d + this.field_e.k(-13019);
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          return 121;
        }
        if (this.field_e.n((byte) 87) != 1) {
          return this.field_e.getRenderZ((byte) -88) - 655360;
        }
        return this.field_e.getRenderZ((byte) -121);
    }

    static {
        field_i = new byte[1000][];
    }
}
