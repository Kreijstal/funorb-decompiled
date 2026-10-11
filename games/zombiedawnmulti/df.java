/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class df extends se {
    static ul field_M;
    static volatile boolean field_P;
    private int field_K;
    static String field_G;
    static boolean field_I;
    private vk field_N;
    boolean field_R;
    static String field_J;
    static boolean field_H;
    static String field_L;
    static ja[] field_Q;
    static String field_O;

    boolean h(int param0) {
        this.field_K = this.a((byte) -20);
        if (param0 != -6134) {
          return false;
        }
        if (this.field_K != 0) {
          return false;
        }
        if (!this.field_R) {
          return true;
        }
        return false;
    }

    df(vk param0, int param1, int param2) {
        super(ub.field_wb - param1 >> 1, -param2 + kc.field_a >> 1, param1, param2, (nl) null);
        try {
          this.field_N = param0;
          this.field_R = false;
          this.field_K = 0;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "df.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void a(boolean param0, int param1, int param2);

    public static void g(byte param0) {
        field_Q = null;
        field_G = null;
        field_O = null;
        if (param0 >= 44) {
          field_M = null;
          field_L = null;
          field_J = null;
          return;
        }
        field_M = (ul) null;
        field_M = null;
        field_L = null;
        field_J = null;
    }

    final static void a(int param0, int param1) {
        if (param1 != 0) {
          jh.field_ic = param1;
        }
        io.field_g = qj.field_p;
        if (param0 != -17306) {
          return;
        }
        hg.field_rb = param1;
    }

    final static String a(int param0) {
        int var1 = -20 % ((-50 - param0) / 60);
        if (qj.field_p) {
          return vi.field_a[0];
        }
        return vi.field_a[1];
    }

    boolean i(int param0) {
        boolean stackIn_11_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_32_0 = false;
        boolean stackIn_38_0 = false;
        int var2;
        int var3;
        var2 = this.a((byte) -55);
        var3 = -this.field_K + var2;
        if (param0 != -27388) {
          this.field_N = (vk) null;
          if (0 < var3) {
            this.field_K = this.field_K + (-1 + (8 + var3)) / 8;
          }
          if (var3 >= 0) {
            if (this.field_K != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_11_0 = !(this.field_R);
            return stackIn_11_0;
          }
          this.field_K = this.field_K + (var3 - 15) / 16;
          if (this.field_K != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_20_0 = !(this.field_R);
          return stackIn_20_0;
        }
        if (0 < var3) {
          this.field_K = this.field_K + (-1 + (8 + var3)) / 8;
        }
        if (var3 >= 0) {
          stackIn_32_0 = (this.field_K == 0) && (var2 == 0) && (!this.field_R);
          return stackIn_32_0;
        }
        this.field_K = this.field_K + (var3 - 15) / 16;
        stackIn_38_0 = (this.field_K == 0) && (var2 == 0) && (!this.field_R);
        return stackIn_38_0;
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, int param8, int param9, int param10, boolean param11) {
        ee.a(16777215, true, param7, param10, param4, param0, param2, param5, param11, 16777215, param8, param1, param9, param6);
        int var12 = 115 / ((param3 + 15) / 53);
    }

    final void b(int param0, int param1, int param2) {
        if (param2 >= 48) {
          this.b(ub.field_wb - param0 >> 1, -param1 + kc.field_a >> 1, 28972, param0, param1);
          return;
        }
        df.g((byte) -100);
        this.b(ub.field_wb - param0 >> 1, -param1 + kc.field_a >> 1, 28972, param0, param1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_K == 0) {
          return;
        }
        if (this.field_K >= 256) {
          if (param2 == 0) {
            this.a(true, param3 + this.field_y, param1 + this.field_i);
            super.a(param0 ^ 0, param1, param2, param3);
            return;
          }
          return;
        }
        if (null == ej.field_g) {
          ej.field_g = new ja(this.field_n, this.field_w);
          r.a(0, ej.field_g);
          oo.b();
          this.a(true, 0, 0);
          super.a(param0 ^ 0, -this.field_i - param1, param2, -param3 - this.field_y);
          ql.a(true);
          ej.field_g.c(param3 + this.field_y, param1 + this.field_i, this.field_K);
          if (param0 == -2) {
            return;
          }
          this.g(76);
          return;
        }
        if (ej.field_g.field_x < this.field_n) {
          ej.field_g = new ja(this.field_n, this.field_w);
          r.a(0, ej.field_g);
          oo.b();
          this.a(true, 0, 0);
          super.a(param0 ^ 0, -this.field_i - param1, param2, -param3 - this.field_y);
          ql.a(true);
          ej.field_g.c(param3 + this.field_y, param1 + this.field_i, this.field_K);
          if (param0 == -2) {
            return;
          }
          this.g(76);
          return;
        }
        if (ej.field_g.field_w < this.field_w) {
          ej.field_g = new ja(this.field_n, this.field_w);
          r.a(0, ej.field_g);
          oo.b();
          this.a(true, 0, 0);
          super.a(param0 ^ 0, -this.field_i - param1, param2, -param3 - this.field_y);
          ql.a(true);
          ej.field_g.c(param3 + this.field_y, param1 + this.field_i, this.field_K);
          if (param0 == -2) {
            return;
          }
          this.g(76);
          return;
        }
        r.a(0, ej.field_g);
        oo.b();
        this.a(true, 0, 0);
        super.a(param0 ^ 0, -this.field_i - param1, param2, -param3 - this.field_y);
        ql.a(true);
        ej.field_g.c(param3 + this.field_y, param1 + this.field_i, this.field_K);
        if (param0 == -2) {
          return;
        }
        this.g(76);
    }

    private final int a(byte param0) {
        int var2 = 25 % ((param0 - 19) / 37);
        return this.field_R ? this.field_N.j((byte) -121) != this ? 0 : 256 : 0;
    }

    final cf g(int param0) {
        cf var2 = super.g(110);
        if (var2 != null) {
          return var2;
        }
        if (param0 < 88) {
          return (cf) null;
        }
        return (cf) (this);
    }

    static {
        field_P = true;
        field_G = "Hostile";
        field_J = "Accept";
        field_L = "Graphics: ";
        field_H = false;
        field_O = "And you thought your zombies were hungry before.";
    }
}
