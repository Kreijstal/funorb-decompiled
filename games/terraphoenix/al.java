/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al extends ei {
    static java.awt.Frame field_W;
    private int field_X;
    private jl field_Z;
    private int field_ab;
    private gl field_Y;
    private int field_eb;
    private int field_db;
    private rj field_fb;
    private int field_cb;
    static int[] field_bb;

    final boolean i(int param0) {
        this.j(-2065096856);
        int var2 = -40 / ((param0 + 2) / 63);
        return super.i(61);
    }

    final static ci[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 == -123) {
          return oh.a(param2, 1, 1, 3, param1, 1, 1, param0, param3);
        }
        field_bb = (int[]) null;
        return oh.a(param2, 1, 1, 3, param1, 1, 1, param0, param3);
    }

    private final void b(gl param0, byte param1) {
        if (param1 != -68) {
          return;
        }
        try {
          if (this.field_Z != null) {
            this.field_Z.b((byte) 12);
          }
          if (param0 == null) {
            this.field_Z = new jl();
          } else {
            param0.a(6 + this.field_cb, (byte) 53, param0.field_p, 6, param0.field_n);
            this.field_Z = new jl(param0);
          }
          this.b((byte) 95, this.field_Z);
          this.field_Y = null;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "al.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(gl param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_Y = param0;
          if (param1 >= -21) {
            field_bb = (int[]) null;
          }
          if (qb.field_h == this.field_fb) {
            this.a(this.field_eb, this.field_Y.field_p + 12, 12 + this.field_cb + this.field_Y.field_n, (byte) -80);
            this.field_ab = 0;
            return;
          }
          if (this.field_fb == hl.field_b) {
            return;
          }
          this.field_ab = 0;
          this.field_fb = hl.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("al.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(byte param0) {
        if (hl.field_b == this.field_fb) {
          return;
        }
        this.field_fb = dc.field_n;
        if (param0 == 109) {
          this.field_ab = 0;
          this.b(this.field_Y, (byte) -68);
          this.field_Y = null;
          this.field_Z.field_J = 0;
          return;
        }
        this.field_ab = 3;
        this.field_ab = 0;
        this.b(this.field_Y, (byte) -68);
        this.field_Y = null;
        this.field_Z.field_J = 0;
    }

    al(d param0, gl param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_p, param1.field_n + (param2 + 12));
        try {
          this.field_cb = param2;
          this.field_db = param3;
          this.field_X = param3;
          this.field_eb = param4;
          this.b(param1, (byte) -68);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void j(int param0) {
        if (null != this.field_fb) {
          if (this.field_fb != dc.field_n) {
            this.b(98, this.field_cb + 12 + this.field_Y.field_n, 12 + this.field_Y.field_p);
            this.b(this.field_Y, (byte) -68);
          }
          this.field_fb = null;
          this.field_Z.field_J = 256;
        }
        super.j(param0);
    }

    public static void k(int param0) {
        if (param0 > -1) {
          field_bb = (int[]) null;
          field_bb = null;
          field_W = null;
          return;
        }
        field_bb = null;
        field_W = null;
    }

    boolean f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var3 = Terraphoenix.field_V;
        if (null == this.field_fb) {
          if (param0 != -121) {
            this.field_db = -55;
            return super.f((byte) -121);
          }
          return super.f((byte) -121);
        }
        if (hl.field_b == this.field_fb) {
          fieldTemp$0 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (fieldTemp$0 != this.field_X) {
            this.field_Z.field_J = -((this.field_ab << 8) / this.field_X) + 256;
            if (param0 != -121) {
              this.field_db = -55;
              return super.f((byte) -121);
            }
            return super.f((byte) -121);
          }
          this.field_fb = qb.field_h;
          this.a(this.field_eb, 12 + this.field_Y.field_p, 12 - (-this.field_cb - this.field_Y.field_n), (byte) -80);
          this.field_Z.field_J = 0;
          this.field_ab = 0;
          if (param0 == -121) {
            return super.f((byte) -121);
          }
          this.field_db = -55;
          return super.f((byte) -121);
        }
        if (dc.field_n == this.field_fb) {
          fieldTemp$1 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (fieldTemp$1 != this.field_db) {
            this.field_Z.field_J = (this.field_ab << 8) / this.field_db;
            if (param0 == -121) {
              return super.f((byte) -121);
            }
            this.field_db = -55;
            return super.f((byte) -121);
          }
          this.field_fb = null;
          this.field_Z.field_J = 256;
          if (param0 == -121) {
            return super.f((byte) -121);
          }
          this.field_db = -55;
          return super.f((byte) -121);
        }
        if (param0 == -121) {
          return super.f((byte) -121);
        }
        this.field_db = -55;
        return super.f((byte) -121);
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2 + 0, param3)) {
            return true;
          }
          if (null != this.field_Z) {
            if (98 == param3) {
              this.field_Z.a((byte) 80, param1);
            }
            if (99 == param3) {
              this.field_Z.a((byte) 73, param1);
            }
          }
          if (param2 == 30) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("al.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
