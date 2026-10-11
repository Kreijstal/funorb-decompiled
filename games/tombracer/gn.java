/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gn extends b {
    static cha field_C;
    static String field_y;
    private int field_x;
    jta field_z;
    static String[] field_w;
    boolean field_B;
    static String field_A;

    private final int b(boolean param0) {
        if (!param0) {
          return this.field_B ? this == this.field_z.a((byte) -76) ? 256 : 0 : 0;
        }
        return 84;
    }

    public static void c(int param0) {
        field_w = null;
        if (param0 == 0) {
          field_C = null;
          field_y = null;
          field_A = null;
          return;
        }
        field_A = (String) null;
        field_C = null;
        field_y = null;
        field_A = null;
    }

    final ae g(byte param0) {
        ae var2 = super.g(param0);
        if (var2 != null) {
          return var2;
        }
        return (ae) (this);
    }

    boolean a(int param0) {
        int var2;
        int var3;
        boolean stackIn_11_0 = false;
        boolean stackIn_21_0 = false;
        if (param0 < 126) {
          this.c(-76, -128, 127);
        }
        var2 = this.b(false);
        var3 = -this.field_x + var2;
        if (var3 <= 0) {
          if (0 > var3) {
            this.field_x = this.field_x + (-16 + var3 + 1) / 16;
          }
          if (0 != this.field_x) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_21_0 = !(this.field_B);
          return stackIn_21_0;
        }
        this.field_x = this.field_x + (7 + var3) / 8;
        if (0 > var3) {
          this.field_x = this.field_x + (-16 + var3 + 1) / 16;
        }
        stackIn_11_0 = (0 == this.field_x) && (var2 == 0) && (!this.field_B);
        return stackIn_11_0;
    }

    boolean a(byte param0) {
        if (param0 > -53) {
          return true;
        }
        this.field_x = this.b(false);
        if (this.field_x != 0) {
          return false;
        }
        if (!this.field_B) {
          return true;
        }
        return false;
    }

    final static iu[] b(int param0, int param1, int param2, int param3) {
        if (param1 == 1) {
          return ura.a(param2, param0, false, 1, param3);
        }
        gn.c(91);
        return ura.a(param2, param0, false, 1, param3);
    }

    gn(jta param0, int param1, int param2) {
        super(bb.field_m - param1 >> 1, -param2 + qba.field_a >> 1, param1, param2, (isa) null);
        try {
          this.field_x = 0;
          this.field_z = param0;
          this.field_B = false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_x == 0) {
          return;
        }
        if (this.field_x >= 256) {
          if (param3 == 0) {
            this.a(param1 + this.field_n, (byte) -67, this.field_i + param0);
            super.a(param0, param1, 0, param3);
            return;
          }
          return;
        }
        if (fta.field_a == null) {
          fta.field_a = new iu(this.field_m, this.field_p);
          nm.a(fta.field_a, (byte) 118);
          bea.a();
          this.a(0, (byte) -67, 0);
          super.a(-this.field_i - param0, -param1 - this.field_n, param2, param3);
          pfa.a(param2 ^ 1);
          fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
          return;
        }
        if (fta.field_a.field_m < this.field_m) {
          fta.field_a = new iu(this.field_m, this.field_p);
          nm.a(fta.field_a, (byte) 118);
          bea.a();
          this.a(0, (byte) -67, 0);
          super.a(-this.field_i - param0, -param1 - this.field_n, param2, param3);
          pfa.a(param2 ^ 1);
          fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
          return;
        }
        if (fta.field_a.field_q >= this.field_p) {
          nm.a(fta.field_a, (byte) 118);
          bea.a();
          this.a(0, (byte) -67, 0);
          super.a(-this.field_i - param0, -param1 - this.field_n, param2, param3);
          pfa.a(param2 ^ 1);
          fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
          return;
        }
        fta.field_a = new iu(this.field_m, this.field_p);
        nm.a(fta.field_a, (byte) 118);
        bea.a();
        this.a(0, (byte) -67, 0);
        super.a(-this.field_i - param0, -param1 - this.field_n, param2, param3);
        pfa.a(param2 ^ 1);
        fta.field_a.c(param0 + this.field_i, this.field_n + param1, this.field_x);
    }

    abstract void a(int param0, byte param1, int param2);

    final void c(int param0, int param1, int param2) {
        if (param0 == -11560) {
          this.a((byte) -31, param2, param1, -param2 + bb.field_m >> 1, qba.field_a - param1 >> 1);
          return;
        }
        this.field_B = false;
        this.a((byte) -31, param2, param1, -param2 + bb.field_m >> 1, qba.field_a - param1 >> 1);
    }

    static {
        field_A = "Macroing or use of bots";
        field_y = "I've heard that stepping on cracks can bring bad luck. It does here, especially if you hang around too long.";
    }
}
