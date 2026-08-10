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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              var2 = qi.a(param1, (byte) 60);
              var3 = param1.b(16711935);
              stackIn_4_0 = new kt(var2, var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("k.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (pp) ((Object) stackIn_4_0);
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
        if (!this.field_f) {
          this.field_h.a(false);
          this.field_h = null;
          if (param0 == -256) {
            return;
          } else {
            this.field_f = false;
            return;
          }
        } else {
          this.field_j.b(0);
          this.field_j = null;
          if (param0 == -256) {
            return;
          } else {
            this.field_f = false;
            return;
          }
        }
    }

    void d(byte param0) {
        if (param0 != -68) {
            this.field_i = 42;
        }
    }

    final int[] a(int param0, int param1, byte param2) {
        if (param2 > 104) {
          if (!this.field_g[param0].field_f) {
            return this.field_g[param0].a(false, param1)[0];
          } else {
            return this.field_g[param0].a(param1, 0);
          }
        } else {
          this.field_j = (pr) null;
          if (!this.field_g[param0].field_f) {
            return this.field_g[param0].a(false, param1)[0];
          } else {
            return this.field_g[param0].a(param1, 0);
          }
        }
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
        int[] var4;
        int[][] var5;
        int[] var6;
        if (param0 < -57) {
          if (!this.field_g[param1].field_f) {
            return this.field_g[param1].a(false, param2);
          } else {
            var6 = this.field_g[param1].a(param2, 0);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[0] = var6;
            var5[2] = var6;
            return var5;
          }
        } else {
          return (int[][]) null;
        }
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
        int var4;
        int stackIn_5_0 = 0;
        if (param1 < -9) {
          L0: {
            if ((this.field_i ^ -1) != -256) {
              stackIn_5_0 = this.field_i;
              break L0;
            } else {
              stackIn_5_0 = param0;
              break L0;
            }
          }
          var4 = stackIn_5_0;
          if (this.field_f) {
            this.field_j = new pr(var4, param0, param2);
            return;
          } else {
            this.field_h = new eia(var4, param0, param2);
            return;
          }
        } else {
          return;
        }
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
