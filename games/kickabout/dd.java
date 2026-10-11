/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    int field_b;
    private int field_j;
    private nm field_e;
    private nm[] field_d;
    private int field_a;
    static int field_f;
    private int[] field_g;
    private int field_h;
    static long field_c;
    private int field_i;

    final boolean a(int param0) {
        int dupTemp$0 = 0;
        int var2;
        if (null == this.field_d) {
          if (param0 < 121) {
            return true;
          }
          if (null == this.field_e) {
            return true;
          }
          this.field_h = this.field_h - 1;
          if (this.field_h > 0) {
            return false;
          }
          return this.c(0);
        }
        if (0 > this.field_i) {
          if (param0 < 121) {
            return true;
          }
          if (null == this.field_e) {
            return true;
          }
          this.field_h = this.field_h - 1;
          if (this.field_h <= 0) {
            return this.c(0);
          }
          return false;
        }
        dupTemp$0 = this.field_g[this.field_i];
        this.field_g[this.field_i] = dupTemp$0 - 1;
        if (dupTemp$0 < 0) {
          var2 = this.field_i;
          this.a(this.field_d[this.field_i], (byte) -107);
          this.field_i = var2;
          this.field_d[this.field_i] = null;
          this.field_i = this.field_i + 1;
          if (this.field_i == this.field_d.length) {
            this.field_i = 0;
          }
          if (this.field_d[this.field_i] != null) {
            if (param0 < 121) {
              return true;
            }
            if (null == this.field_e) {
              return true;
            }
            this.field_h = this.field_h - 1;
            if (this.field_h <= 0) {
              return this.c(0);
            }
            return false;
          }
          this.field_i = -1;
        }
        if (param0 < 121) {
          return true;
        }
        if (null == this.field_e) {
          return true;
        }
        this.field_h = this.field_h - 1;
        if (this.field_h <= 0) {
          return this.c(0);
        }
        return false;
    }

    private final void b(boolean param0) {
        this.field_h = 0;
        this.field_j = 0;
        this.field_a = 0;
        if (param0) {
          this.field_b = 0;
          return;
        }
        this.field_h = -23;
        this.field_b = 0;
    }

    final static hd b(int param0) {
        if (param0 > -108) {
          return (hd) null;
        }
        return bs.field_c.field_Ab;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = Kickabout.field_G;
        int var1_intLifetime1;
        try {
          e.field_k.b(-1);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            mi.field_b[var1_int] = 0L;
          }
          if (param0 <= 40) {
            dd.a((byte) 120);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            cp.field_d[var1_intLifetime1] = 0L;
          }
          qh.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dd.F(" + param0 + ')');
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          return -113;
        }
        return this.field_e.field_e.length;
    }

    private final boolean c(int param0) {
        this.field_b = this.field_b + 1;
        if (this.field_e.field_e.length <= this.field_b) {
          this.field_a = this.field_a + 1;
          if (!this.field_e.field_j &&
            this.field_e.field_f <= this.field_a) {
            return true;
          }
          if (this.field_e.field_h < 0) {
            this.field_b = 0;
          } else {
            if (this.field_e.field_h < this.field_e.field_e.length) {
              this.field_b = this.field_e.field_h;
            } else {
              this.field_b = 0;
            }
          }
        }
        this.field_j = this.field_e.field_e[this.field_b];
        if (param0 != 0) {
          dd.b(-93);
        }
        this.field_h = this.field_e.field_c[this.field_b];
        return false;
    }

    final void a(int param0, int param1) {
        this.field_b = param0;
        int var3 = 124 % ((28 - param1) / 60);
        this.field_j = this.field_e.field_e[this.field_b];
        this.field_h = 0;
    }

    final void a(nm param0, byte param1) {
        try {
          this.b(true);
          this.field_e = param0;
          if (param1 != -107) {
            this.field_h = -20;
          }
          this.field_j = this.field_e.field_e[this.field_b];
          this.field_h = this.field_e.field_c[this.field_b];
          this.field_i = -1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "dd.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final qc a(qc param0, boolean param1, boolean param2, boolean param3) {
        qc var5 = null;
        RuntimeException var5_ref = null;
        qc stackIn_2_0 = null;
        qc stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        boolean stackIn_5_2 = false;
        boolean stackIn_6_3;
        qc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            stackIn_2_0 = (qc) null;
            return stackIn_2_0;
          }
          stackIn_5_0 = (qc) (param0);
          stackIn_5_1 = param2;
          stackIn_5_2 = false;
          stackIn_6_3 = !(param1);
          var5 = ((qc) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_6_3);
          var5.a(se.field_C, this.field_j, (ef) null, -1, 0, 0, param1);
          stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("dd.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public dd() {
    }

    dd(int param0) {
        this.field_i = -1;
        this.field_d = new nm[param0];
        this.field_g = new int[param0];
    }

    static {
        field_f = 0;
    }
}
