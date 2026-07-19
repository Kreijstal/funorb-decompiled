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
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if ((this.field_f ^ -1) != param2) {
            stackOut_2_0 = this.field_f;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_g) {
          this.field_i = new mv(var4, param1, param0);
          if (TombRacer.field_G) {
            this.field_h = new fk(var4, param1, param0);
            return;
          } else {
            return;
          }
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
        int[] discarded$2 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                discarded$2 = this.c(1, -94);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ci.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final int[][] a(int param0, int param1, int param2) {
        int[] var4 = null;
        int[][] var5 = null;
        int[] var6 = null;
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
        int discarded$0 = 0;
        if (param0 != 116) {
            discarded$0 = this.c((byte) 122);
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
        kg discarded$0 = null;
        field_l = null;
        if (param0 >= -69) {
            byte[] var2 = (byte[]) null;
            discarded$0 = ci.a((byte[]) null, (byte) 54);
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
          if (!TombRacer.field_G) {
            if (param0 >= -32) {
              this.b((byte) 31);
              return;
            } else {
              return;
            }
          } else {
            this.field_h.a(2);
            this.field_h = null;
            if (param0 < -32) {
              return;
            } else {
              this.b((byte) 31);
              return;
            }
          }
        }
    }

    int[] c(int param0, int param1) {
        int[] discarded$0 = null;
        if (param0 != 1) {
            discarded$0 = this.c(-21, -6);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new kg(param0, ak.field_p, pg.field_C, mq.field_b, iga.field_m, mga.field_g, ck.field_c);
              loa.a((byte) -70);
              var3 = -23 % ((-28 - param1) / 37);
              stackOut_3_0 = (kg) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("ci.Q(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
