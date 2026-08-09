/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci extends vg {
    fk field_h;
    boolean field_g;
    static int field_k;
    mv field_i;
    static ij field_l;
    int field_f;
    ci[] field_j;

    void b(int param0, int param1, int param2) {
        int var4;
        int stackIn_3_0 = 0;
        L0: {
          if ((this.field_f ^ -1) != param2) {
            stackIn_3_0 = this.field_f;
            break L0;
          } else {
            stackIn_3_0 = param1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_g) {
          this.field_i = new mv(var4, param1, param0);
          return;
        } else {
          this.field_h = new fk(var4, param1, param0);
          return;
        }
    }

    final int[] c(int param0, int param1, int param2) {
        if (param1 <= -3) {
          if (this.field_j[param0].field_g) {
            return this.field_j[param0].c(1, param2);
          } else {
            return this.field_j[param0].b(param2, -1)[0];
          }
        } else {
          this.field_f = 54;
          if (this.field_j[param0].field_g) {
            return this.field_j[param0].c(1, param2);
          } else {
            return this.field_j[param0].b(param2, -1)[0];
          }
        }
    }

    void a(byte param0, uia param1, int param2) {
        try {
            if (param0 != 107) {
                this.c(1, -94);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ci.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int[][] a(int param0, int param1, int param2) {
        int[] var4;
        int[][] var5;
        int[] var6;
        if (param2 == -1) {
          if (this.field_j[param1].field_g) {
            var6 = this.field_j[param1].c(1, param0);
            var4 = var6;
            var5 = new int[3][];
            var5[1] = var6;
            var5[2] = var6;
            var5[0] = var6;
            return var5;
          } else {
            return this.field_j[param1].b(param0, -1);
          }
        } else {
          return (int[][]) null;
        }
    }

    final static roa a(int param0, int param1) {
        roa var2 = tt.a(param1, param0);
        var2.field_r = param0;
        var2.field_q = var2.field_p;
        return var2;
    }

    void b(byte param0) {
        if (param0 != 116) {
            this.c((byte) 122);
        }
    }

    int[][] b(int param0, int param1) {
        if (param1 != -1) {
            return (int[][]) null;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    int a(int param0) {
        if (param0 <= 96) {
            this.field_h = (fk) null;
            return -1;
        }
        return -1;
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 >= -69) {
            byte[] var2 = (byte[]) null;
            ci.a((byte[]) null, (byte) 54);
        }
    }

    void b(int param0) {
        if (!this.field_g) {
          this.field_h.a(2);
          this.field_h = null;
          if (param0 < -32) {
            return;
          } else {
            this.b((byte) 31);
            return;
          }
        } else {
          this.field_i.a(false);
          this.field_i = null;
          if (param0 < -32) {
            return;
          } else {
            this.b((byte) 31);
            return;
          }
        }
    }

    int[] c(int param0, int param1) {
        if (param0 != 1) {
            this.c(-21, -6);
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    ci(int param0, boolean param1) {
        this.field_j = new ci[param0];
        this.field_g = param1 ? true : false;
    }

    final static kg a(byte[] param0, byte param1) {
        kg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        kg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new kg(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, mga.field_g, ck.field_c);
              loa.a((byte) -70);
              var3 = -23 % ((-28 - param1) / 37);
              stackIn_4_0 = (kg) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("ci.Q(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kg) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    int c(byte param0) {
        if (param0 != -117) {
            this.b((byte) -6);
            return -1;
        }
        return -1;
    }

    static {
    }
}
