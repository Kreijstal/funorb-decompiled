/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends bw {
    pr field_j;
    k[] field_g;
    eia field_h;
    int field_i;
    boolean field_f;

    int[] a(int param0, int param1) {
        if (param1 != 0) {
          return (int[]) null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    final static pp a(boolean param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        pp stackIn_2_0 = null;
        kt stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (pp) null;
            return stackIn_2_0;
          }
          var2 = qi.a(param1, (byte) 60);
          var3 = param1.b(16711935);
          stackIn_4_0 = new kt(var2, var3);
          return (pp) ((Object) stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("k.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    int a(int param0) {
        if (param0 != -2359) {
          lu var3 = (lu) null;
          this.a((byte) 23, (lu) null, 74);
          return -1;
        }
        return -1;
    }

    int c(byte param0) {
        if (param0 <= 35) {
          this.field_j = (pr) null;
          return -1;
        }
        return -1;
    }

    void b(int param0) {
        if (this.field_f) {
          this.field_j.b(0);
          this.field_j = null;
          if (param0 != -256) {
            this.field_f = false;
            return;
          }
          return;
        }
        this.field_h.a(false);
        this.field_h = null;
        if (param0 != -256) {
          this.field_f = false;
          return;
        }
    }

    void d(byte param0) {
        if (param0 != -68) {
          this.field_i = 42;
        }
    }

    final int[] a(int param0, int param1, byte param2) {
        if (param2 <= 104) {
          this.field_j = (pr) null;
          if (this.field_g[param0].field_f) {
            return this.field_g[param0].a(param1, 0);
          }
          return this.field_g[param0].a(false, param1)[0];
        }
        if (this.field_g[param0].field_f) {
          return this.field_g[param0].a(param1, 0);
        }
        return this.field_g[param0].a(false, param1)[0];
    }

    int[][] a(boolean param0, int param1) {
        if (param0) {
          this.a((byte) 115, -14, 40);
          throw new IllegalStateException("This operation does not have a colour output");
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    k(int param0, boolean param1) {
        this.field_g = new k[param0];
        this.field_f = param1 ? true : false;
    }

    final int[][] a(byte param0, int param1, int param2) {
        int[] var6 = null;
        int[][] var5 = null;
        if (param0 >= -57) {
          return (int[][]) null;
        }
        if (this.field_g[param1].field_f) {
          var6 = this.field_g[param1].a(param2, 0);
          int[] var4 = var6;
          var5 = new int[3][];
          var5[1] = var6;
          var5[0] = var6;
          var5[2] = var6;
          return var5;
        }
        return this.field_g[param1].a(false, param2);
    }

    void a(byte param0, lu param1, int param2) {
        try {
          if (param0 != -71) {
            lu var5 = (lu) null;
            k.a(false, (lu) null);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "k.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    void a(int param0, byte param1, int param2) {
        if (param1 >= -9) {
          return;
        }
        int var4 = this.field_i == 255 ? param0 : this.field_i;
        if (!this.field_f) {
          this.field_h = new eia(var4, param0, param2);
          return;
        }
        this.field_j = new pr(var4, param0, param2);
    }

    final static void c(int param0) {
        eia.field_d = dg.field_k;
        jf.field_m = dg.field_f;
        tq.field_r = dg.field_h;
        if (param0 != 3685) {
          return;
        }
        mm.field_D = dg.field_j;
    }

    static {
    }
}
