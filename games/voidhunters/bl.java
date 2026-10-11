/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bl extends dqa {
    static no field_x;
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

    final shb g(byte param0) {
        shb var2 = super.g((byte) -123);
        if (param0 > -3) {
          return (shb) null;
        }
        if (var2 != null) {
          return var2;
        }
        return (shb) (this);
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

    final void b(int param0, int param1, int param2, int param3) {
        if (this.field_w == 0) {
          return;
        }
        if (this.field_w >= 256) {
          if (param1 != 0) {
            return;
          }
          this.b(param3 + this.field_r, 1630174241, param0 + this.field_g);
          super.b(param0, param1, 101, param3);
          return;
        }
        if (null == vib.field_b) {
          vib.field_b = new phb(this.field_h, this.field_f);
          de.a(111, vib.field_b);
          dma.a();
          this.b(0, 1630174241, 0);
          super.b(-param0 - this.field_g, param1, 127, -this.field_r - param3);
          if (param2 > 47) {
            bia.a((byte) 124);
            vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
            return;
          }
          this.j((byte) 123);
          bia.a((byte) 124);
          vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
          return;
        }
        if (vib.field_b.field_q < this.field_h) {
          vib.field_b = new phb(this.field_h, this.field_f);
          de.a(111, vib.field_b);
          dma.a();
          this.b(0, 1630174241, 0);
          super.b(-param0 - this.field_g, param1, 127, -this.field_r - param3);
          if (param2 > 47) {
            bia.a((byte) 124);
            vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
            return;
          }
          this.j((byte) 123);
          bia.a((byte) 124);
          vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
          return;
        }
        if (this.field_f > vib.field_b.field_p) {
          vib.field_b = new phb(this.field_h, this.field_f);
          de.a(111, vib.field_b);
          dma.a();
          this.b(0, 1630174241, 0);
          super.b(-param0 - this.field_g, param1, 127, -this.field_r - param3);
          if (param2 > 47) {
            bia.a((byte) 124);
            vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
            return;
          }
          this.j((byte) 123);
          bia.a((byte) 124);
          vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
          return;
        }
        de.a(111, vib.field_b);
        dma.a();
        this.b(0, 1630174241, 0);
        super.b(-param0 - this.field_g, param1, 127, -this.field_r - param3);
        if (param2 > 47) {
          bia.a((byte) 124);
          vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
          return;
        }
        this.j((byte) 123);
        bia.a((byte) 124);
        vib.field_b.d(param0 + this.field_g, this.field_r + param3, this.field_w);
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
        this.a(-param0 + fob.field_a >> 1, param0, param2, 1, vi.field_p - param2 >> 1);
        if (param1 != -1860440319) {
          this.field_z = false;
        }
    }

    public static void i(byte param0) {
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
          var5 = rua.field_q;
          var1 = var5;
          if (param0) {
            bl.i((byte) 60);
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
          throw rta.a((Throwable) ((Object) var1_ref), "bl.EA(" + param0 + ')');
        }
    }

    bl(ida param0, int param1, int param2) {
        super(fob.field_a - param1 >> 1, -param2 + vi.field_p >> 1, param1, param2, (wwa) null);
        try {
          this.field_w = 0;
          this.field_v = param0;
          this.field_z = false;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_y = "Change team of clicked ship";
    }
}
