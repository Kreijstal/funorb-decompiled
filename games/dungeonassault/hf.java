/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends sj {
    static nh field_pb;
    private int field_jb;
    private lm field_xb;
    private int field_lb;
    static String field_ub;
    static md field_ob;
    static int field_sb;
    private int field_qb;
    private int field_tb;
    private sd field_rb;
    private fb field_kb;
    static ad field_wb;
    static ed field_nb;
    static eh field_ib;
    static cn field_Ab;
    private int field_vb;
    static int[] field_yb;
    static String field_zb;
    static pp field_mb;

    private final void b(lm param0, byte param1) {
        try {
          if (this.field_rb != null) {
            this.field_rb.a(false);
          }
          int var3_int = -47 / ((param1 - 32) / 42);
          if (param0 != null) {
            param0.b(0, param0.field_x, this.field_tb + 6, 6, param0.field_s);
            this.field_rb = new sd(param0);
          } else {
            this.field_rb = new sd();
          }
          this.b((byte) -57, (lm) (this.field_rb));
          this.field_xb = null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hf(ji param0, lm param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_x, param1.field_s + (param2 + 12));
        try {
          this.field_qb = param3;
          this.field_jb = param3;
          this.field_tb = param2;
          this.field_vb = param4;
          this.b(param1, (byte) 98);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "hf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void i(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null != in.field_C) {
          var1 = in.field_C;
          synchronized (var1) {
            in.field_C = null;
          }
        }
        if (param0 > -5) {
          field_ib = (eh) null;
        }
    }

    final boolean i(int param0) {
        this.h((byte) 99);
        if (param0 != 462) {
          return true;
        }
        return super.i(param0 ^ 0);
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 55) {
            this.field_rb = (sd) null;
          }
          if (super.a(param0, param1, param2, (byte) 124)) {
            return true;
          }
          if (this.field_rb != null) {
            if (98 == param2) {
              this.field_rb.a(34, param0);
            }
            if (param2 != 99) {
              return false;
            }
            this.field_rb.a(34, param0);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("hf.W(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void h(byte param0) {
        int var2 = -105 % ((22 - param0) / 35);
        if (this.field_kb != null) {
          if (this.field_kb != lp.field_o) {
            this.b(-30, this.field_xb.field_s + (12 + this.field_tb), this.field_xb.field_x + 12);
            this.b(this.field_xb, (byte) -74);
          }
          this.field_rb.field_H = 256;
          this.field_kb = null;
        }
        super.h((byte) -89);
    }

    final void k(int param0) {
        if (hi.field_b == this.field_kb) {
          return;
        }
        this.field_lb = 0;
        this.field_kb = lp.field_o;
        this.b(this.field_xb, (byte) 100);
        this.field_rb.field_H = param0;
        this.field_xb = null;
    }

    void b(int param0, lm param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_xb = param1;
          if (ec.field_i == this.field_kb) {
            this.b(12 + this.field_xb.field_x, this.field_vb, this.field_xb.field_s + this.field_tb + 12, 22284);
            this.field_lb = 0;
          } else {
            if (hi.field_b != this.field_kb) {
              this.field_kb = hi.field_b;
              this.field_lb = 0;
            }
          }
          if (param0 == 1) {
            return;
          }
          this.field_xb = (lm) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hf.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void m(int param0) {
        field_pb = null;
        field_Ab = null;
        field_zb = null;
        field_wb = null;
        field_mb = null;
        field_yb = null;
        field_nb = null;
        field_ub = null;
        field_ob = null;
        field_ib = null;
        if (param0 != 0) {
          field_Ab = (cn) null;
        }
    }

    boolean f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3;
        var3 = DungeonAssault.field_K;
        if (this.field_kb == null) {
          if (param0 != -90) {
            return false;
          }
          return super.f((byte) -90);
        }
        if (this.field_kb == hi.field_b) {
          fieldTemp$0 = this.field_lb + 1;
          this.field_lb = this.field_lb + 1;
          if (fieldTemp$0 != this.field_jb) {
            this.field_rb.field_H = 256 - (this.field_lb << 8) / this.field_jb;
          } else {
            this.field_kb = ec.field_i;
            this.b(12 + this.field_xb.field_x, this.field_vb, this.field_tb + 12 + this.field_xb.field_s, param0 ^ -22358);
            this.field_lb = 0;
            this.field_rb.field_H = 0;
          }
          if (param0 != -90) {
            return false;
          }
          return super.f((byte) -90);
        }
        if (lp.field_o != this.field_kb) {
          if (param0 != -90) {
            return false;
          }
          return super.f((byte) -90);
        }
        fieldTemp$1 = this.field_lb + 1;
        this.field_lb = this.field_lb + 1;
        if (fieldTemp$1 != this.field_qb) {
          this.field_rb.field_H = (this.field_lb << 8) / this.field_qb;
        } else {
          this.field_kb = null;
          this.field_rb.field_H = 256;
        }
        if (param0 != -90) {
          return false;
        }
        return super.f((byte) -90);
    }

    static {
        field_ub = "Username: ";
        field_ob = new md();
        field_zb = "Names should contain a maximum of 12 characters";
        field_yb = new int[16384];
        field_wb = new ad(13, 0, 1, 0);
    }
}
