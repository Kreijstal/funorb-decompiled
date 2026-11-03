/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vf extends WidgetContainer {
    private int field_E;
    boolean field_C;
    private rp field_G;
    static String field_D;
    static UiComponent field_F;

    vf(rp param0, int param1, int param2) {
        super(-param1 + InvincibleAnimation.field_v >> 1, mi.field_k - param2 >> 1, param1, param2, (WidgetRenderer) null);
        try {
          this.field_G = param0;
          this.field_E = 0;
          this.field_C = false;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param0 < -9) {
          this.a(-param2 + InvincibleAnimation.field_v >> 1, param1, (byte) 59, param2, mi.field_k - param1 >> 1);
          return;
        }
        this.field_C = true;
        this.a(-param2 + InvincibleAnimation.field_v >> 1, param1, (byte) 59, param2, mi.field_k - param1 >> 1);
    }

    boolean k(int param0) {
        this.field_E = this.l(79);
        if (param0 >= -59) {
          return true;
        }
        if (this.field_E != 0) {
          return false;
        }
        if (!this.field_C) {
          return true;
        }
        return false;
    }

    private final int l(int param0) {
        int var2 = -53 / ((param0 + 8) / 44);
        return this.field_C ? this != this.field_G.h(0) ? 0 : 256 : 0;
    }

    boolean a(int param0) {
        if (param0 > -32) {
          return true;
        }
        int var2 = this.l(80);
        int var3 = -this.field_E + var2;
        if (var3 > 0) {
          this.field_E = this.field_E + (-1 + (8 + var3)) / 8;
        }
        if (var3 < 0) {
          this.field_E = this.field_E + (-15 + var3) / 16;
          if (this.field_E != 0) {
            return false;
          }
          if (var2 == 0) {
            return !this.field_C ? true : false;
          }
          return false;
        }
        if (this.field_E != 0) {
          return false;
        }
        if (var2 == 0) {
          return !this.field_C ? true : false;
        }
        return false;
    }

    final void draw(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        if (this.field_E == 0) {
          return;
        }
        if (this.field_E >= 256) {
          if (param2 == 0) {
            this.a(this.y + param1, (byte) 89, param3 + this.x);
            super.draw((byte) -85, param1, param2, param3);
            return;
          }
          return;
        }
        if (null == lfa.field_u) {
          lfa.field_u = new Sprite(this.width, this.height);
          bu.a(0, lfa.field_u);
          SoftwareRasterizer.clear();
          var5 = 42 % ((-20 - param0) / 54);
          this.a(0, (byte) -109, 0);
          super.draw((byte) 43, -this.y - param1, param2, -param3 - this.x);
          db.b(110);
          lfa.field_u.a(param3 + this.x, param1 + this.y, this.field_E);
          return;
        }
        if (this.width > lfa.field_u.field_q) {
          lfa.field_u = new Sprite(this.width, this.height);
          bu.a(0, lfa.field_u);
          SoftwareRasterizer.clear();
          var5Lifetime1 = 42 % ((-20 - param0) / 54);
          this.a(0, (byte) -109, 0);
          super.draw((byte) 43, -this.y - param1, param2, -param3 - this.x);
          db.b(110);
          lfa.field_u.a(param3 + this.x, param1 + this.y, this.field_E);
          return;
        }
        if (this.height > lfa.field_u.field_p) {
          lfa.field_u = new Sprite(this.width, this.height);
          bu.a(0, lfa.field_u);
          SoftwareRasterizer.clear();
          var5Lifetime2 = 42 % ((-20 - param0) / 54);
          this.a(0, (byte) -109, 0);
          super.draw((byte) 43, -this.y - param1, param2, -param3 - this.x);
          db.b(110);
          lfa.field_u.a(param3 + this.x, param1 + this.y, this.field_E);
          return;
        }
        bu.a(0, lfa.field_u);
        SoftwareRasterizer.clear();
        var5Lifetime3 = 42 % ((-20 - param0) / 54);
        this.a(0, (byte) -109, 0);
        super.draw((byte) 43, -this.y - param1, param2, -param3 - this.x);
        db.b(110);
        lfa.field_u.a(param3 + this.x, param1 + this.y, this.field_E);
    }

    final static void a(String param0, int param1, int param2, String param3, String param4, int param5) {
        gs var6 = null;
        try {
          var6 = new gs(param5, param0, param1, param3, param4);
          CranberrySpecial.a((byte) 105, var6);
          int var7 = -6 / ((70 - param2) / 45);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "vf.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_D = null;
        int var1 = -123 / ((-26 - param0) / 40);
        field_F = null;
    }

    final UiWidget g(int param0) {
        UiWidget var2 = null;
        UiWidget var2Lifetime1;
        if (param0 > -26) {
          this.draw((byte) 36, -117, 49, -84);
          var2 = super.g(-116);
          if (var2 == null) {
            return (UiWidget) (this);
          }
          return var2;
        }
        var2Lifetime1 = super.g(-116);
        if (var2Lifetime1 == null) {
          return (UiWidget) (this);
        }
        return var2Lifetime1;
    }

    abstract void a(int param0, byte param1, int param2);

    static {
        field_D = "Status effect <%0>";
    }
}
