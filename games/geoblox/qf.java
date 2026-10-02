/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qf extends oe {
    private int field_db;
    private int field_ab;
    private el field_eb;
    private int field_fb;
    private int field_X;
    private hh field_Z;
    static int[] field_Y;
    static rf field_bb;
    private wj field_W;
    private int field_cb;

    final boolean h(int param0) {
        if (param0 != 229) {
            return false;
        }
        this.b(true);
        return super.h(229);
    }

    qf(ng param0, el param1, int param2, int param3, int param4) {
        super(param0, param1.field_r + 12, 12 + param2 + param1.field_h);
        try {
            this.field_db = param4;
            this.field_ab = param2;
            this.field_cb = param3;
            this.field_fb = param3;
            this.b(-21102, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean f(int param0) {
        int fieldTemp$0 = 0;
        int var3 = Geoblox.field_C;
        if (param0 != -1) {
            return true;
        }
        if (this.field_Z == null) {
            return super.f(-1);
        }
        if (la.field_I == this.field_Z) {
            fieldTemp$0 = this.field_X + 1;
            this.field_X = this.field_X + 1;
            if (fieldTemp$0 == this.field_fb) {
                this.field_Z = la.field_E;
                this.a(12 + this.field_ab + this.field_eb.field_h, this.field_eb.field_r + 12, param0 ^ 5268, this.field_db);
                this.field_X = 0;
                this.field_W.field_D = 0;
                return super.f(-1);
            }
            this.field_W.field_D = 256 - (this.field_X << 8) / this.field_fb;
            return super.f(-1);
        }
        if (qb.field_N != this.field_Z) {
            return super.f(-1);
        }
        int fieldTemp$1 = this.field_X + 1;
        this.field_X = this.field_X + 1;
        if (this.field_cb == fieldTemp$1) {
            this.field_Z = null;
            this.field_W.field_D = 256;
            return super.f(-1);
        }
        this.field_W.field_D = (this.field_X << 8) / this.field_cb;
        return super.f(-1);
    }

    public static void m(int param0) {
        if (param0 != 256) {
            return;
        }
        field_bb = null;
        field_Y = null;
    }

    final void k(int param0) {
        if (la.field_I == this.field_Z) {
            return;
        }
        if (param0 < -20) {
            this.field_X = 0;
            this.field_Z = qb.field_N;
            this.b(-21102, this.field_eb);
            this.field_eb = null;
            this.field_W.field_D = 0;
            return;
        }
        field_Y = (int[]) null;
        this.field_X = 0;
        this.field_Z = qb.field_N;
        this.b(-21102, this.field_eb);
        this.field_eb = null;
        this.field_W.field_D = 0;
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_W != null) {
            if (param0 == 98) {
              this.field_W.a((byte) -92, param3);
            }
            if (param0 == 99) {
              this.field_W.a((byte) -99, param3);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);
          stackIn_13_1 = new StringBuilder().append("qf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void b(int param0, el param1) {
        RuntimeException var3 = null;
        el var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_W != null) {
            this.field_W.a(false);
          }
          if (param1 == null) {
            this.field_W = new wj();
          } else {
            param1.a(param1.field_h, param1.field_r, (byte) -77, this.field_ab + 6, 6);
            this.field_W = new wj(param1);
          }
          this.b((byte) -123, (el) (this.field_W));
          this.field_eb = null;
          if (param0 == -21102) {
            return;
          }
          var4 = (el) null;
          this.a(-67, -54, 'ﾽ', (el) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var3);
          stackIn_11_1 = new StringBuilder().append("qf.SB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static ai a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8) {
        ai var9 = null;
        RuntimeException var9_ref = null;
        ai stackIn_2_0 = null;
        ai stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new ai(param1, param6, param0, param5, param2, param8, param4);
          nf.field_j.a(param3 ^ -25202, var9);
          bm.a(var9, param7, param3 ^ -25169);
          if (param3 == 25134) {
            stackIn_4_0 = (ai) (var9);
            return stackIn_4_0;
          }
          stackIn_2_0 = (ai) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var9_ref);
          stackIn_7_1 = new StringBuilder().append("qf.UB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    void b(el param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_eb = param0;
          if (la.field_E != this.field_Z) {
            if (la.field_I != this.field_Z) {
              this.field_Z = la.field_I;
              this.field_X = 0;
            }
          } else {
            this.a(this.field_ab + (12 + this.field_eb.field_h), this.field_eb.field_r + 12, -5269, this.field_db);
            this.field_X = 0;
          }
          if (param1 < -10) {
            return;
          }
          this.field_W = (wj) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3);
          stackIn_9_1 = new StringBuilder().append("qf.PB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(boolean param0) {
        if (null == this.field_Z) {
            super.b(param0);
            return;
        }
        if (this.field_Z != qb.field_N) {
            this.c(this.field_eb.field_h + (this.field_ab + 12), 106, this.field_eb.field_r + 12);
            this.b(-21102, this.field_eb);
        } else {
            this.field_Z = null;
            this.field_W.field_D = 256;
            super.b(param0);
            return;
        }
        this.field_Z = null;
        this.field_W.field_D = 256;
        super.b(param0);
    }

    static {
        field_Y = new int[8192];
    }
}
