/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private int field_h;
    private boolean field_i;
    private int field_g;
    private int field_d;
    static of field_c;
    dd[] field_j;
    private int field_f;
    dd field_b;
    private int field_l;
    static hj field_e;
    static int field_k;
    static String field_a;

    final void a(int param0, pf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.field_d = this.field_d;
          if (param0 != 288) {
            pf.b(85, -110);
          }
          param1.field_i = this.field_i;
          param1.field_l = this.field_l;
          param1.field_f = this.field_f;
          param1.field_j = this.field_j;
          param1.field_h = this.field_h;
          param1.field_g = this.field_g;
          param1.field_b = this.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static float b(int param0, int param1) {
        RuntimeException var2 = null;
        float stackIn_3_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 125) {
            pf.b(3, -70);
          }
          stackIn_3_0 = de.a(-1, 16, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "pf.P(" + param0 + ',' + param1 + ')');
        }
    }

    final pf b(boolean param0, int param1) {
        RuntimeException var3 = null;
        pf stackIn_2_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h = param1;
          if (param0) {
            return this;
          }
          stackIn_2_0 = (pf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.D(" + param0 + ',' + param1 + ')');
        }
    }

    final pf a(int param0, int param1) {
        RuntimeException var3 = null;
        pf stackIn_2_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param0;
          if (param1 == -1) {
            return this;
          }
          stackIn_2_0 = (pf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, lr param3, String param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = param3.b(param4);
          var6 = param3.field_w + param3.field_L;
          var7 = pa.field_H;
          if (6 + var7 + var5_int > qh.field_l) {
            var7 = -var5_int + qh.field_l - 6;
          }
          var8 = 32 + (-param3.field_L + pm.field_p);
          if (qh.field_f < var8 + var6 + 6) {
            var8 = -6 - var6 + qh.field_f;
          }
          qh.b(var7, var8, var5_int + 6, var6 + 6, param1);
          qh.f(1 + var7, var8 + 1, var5_int + param2, 4 + var6, param0);
          param3.d(param4, var7 + 3, param3.field_L + (var8 + 3), param1, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("pf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_11_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_11_0;
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pool.field_O;
        try {
          if (param0 ||
            em.field_L == null) {
            nr.field_bb = false;
          }
          var2_int = 110 % ((74 - param1) / 32);
          if (param0) {
            if (hb.field_a > 0) {
              hb.field_a = hb.field_a - 1;
              return;
            }
            if (uf.field_z > 0) {
              uf.field_z = uf.field_z - 1;
              return;
            }
            if (0 >= nj.field_b) {
              return;
            }
            nj.field_b = nj.field_b - 1;
            return;
          }
          if (em.field_L != null) {
            if (hb.field_a > 0) {
              hb.field_a = hb.field_a - 1;
              return;
            }
            if (uf.field_z > 0) {
              uf.field_z = uf.field_z - 1;
              return;
            }
            if (ir.field_h > nj.field_b) {
              if (nj.field_b == 0) {
                db.a(27194, false);
              }
              nj.field_b = nj.field_b + 1;
              return;
            }
          } else {
            if (tp.field_e == null) {
              nr.field_bb = false;
              if (0 < uf.field_z) {
                uf.field_z = uf.field_z - 1;
                return;
              }
              if (nj.field_b > 0) {
                nj.field_b = nj.field_b - 1;
                return;
              }
              if (hb.field_a >= ir.field_h) {
                return;
              }
              if (hb.field_a == 0) {
                cn.a(-128);
              }
              hb.field_a = hb.field_a + 1;
              return;
            }
            if (hb.field_a > 0) {
              hb.field_a = hb.field_a - 1;
              return;
            }
            if (nj.field_b > 0) {
              nj.field_b = nj.field_b - 1;
              return;
            }
            if (uf.field_z < ir.field_h) {
              if (uf.field_z == 0) {
                db.a(27194, true);
              }
              uf.field_z = uf.field_z + 1;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "pf.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        try {
          this.field_f = 0;
          this.field_d = 256;
          this.field_g = 0;
          int var2_int = -73 / ((param0 + 15) / 36);
          this.field_h = -1;
          this.field_b = null;
          this.field_j = null;
          this.field_l = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "pf.A(" + param0 + ')');
        }
    }

    final void a(lg param0, int param1, pf param2, int param3, ei param4, int param5) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_i) {
            param2.a(param1, param5, param4, param0, 117);
            param2.a(23);
          }
          if (this.field_l >= -1) {
            param2.field_l = this.field_l;
          }
          if (param3 >= -95) {
            pf.b(-95, 89);
          }
          if (this.field_h >= -1) {
            param2.field_h = this.field_h;
          }
          if (null != this.field_j) {
            param2.field_j = this.field_j;
          }
          if (this.field_f != -2147483648) {
            param2.field_f = this.field_f;
          }
          if (null != this.field_b) {
            param2.field_b = this.field_b;
          }
          if (-2147483648 != this.field_g) {
            param2.field_g = this.field_g;
          }
          if (-2147483648 == this.field_d) {
            return;
          }
          param2.field_d = this.field_d;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("pf.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_0 = stackIn_28_0;
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_0 = stackIn_32_0;
            stackIn_33_2 = "null";
          } else {
            stackIn_33_0 = stackIn_28_0;
            stackIn_33_2 = "{...}";
          }
          stackIn_36_0 = stackIn_33_0;
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_37_0 = stackIn_36_0;
            stackIn_37_2 = "null";
          } else {
            stackIn_37_0 = stackIn_33_0;
            stackIn_37_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param5).append(')').toString());
        }
    }

    final pf a(dd[] param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 54) {
            this.field_l = -118;
          }
          this.field_j = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pf.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final pf c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = param0;
          if (param1 <= 3) {
            field_e = (hj) null;
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static dd a(String param0, byte param1, String param2, di param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.b(param0, -1);
          if (param1 <= 29) {
            field_e = (hj) null;
          }
          var5 = param3.a(var4_int, 0, param2);
          stackIn_3_0 = vh.a(var4_int, param3, -55, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("pf.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_12_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_12_0;
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final pf a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 90) {
            this.field_j = (dd[]) null;
          }
          this.field_f = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        try {
          rg.field_p = param0;
          hn.field_b = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "pf.I(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 7) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "pf.G(" + param0 + ')');
        }
    }

    final pf a(int param0, boolean param1) {
        RuntimeException var3 = null;
        pf stackIn_2_0 = null;
        boolean stackIn_6_1 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15359) {
            stackIn_2_0 = (pf) null;
            return stackIn_2_0;
          }
          stackIn_6_1 = (param1);
          this.field_i = stackIn_6_1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "pf.M(" + param0 + ',' + param1 + ')');
        }
    }

    pf() {
        this.field_h = -2;
        this.field_j = null;
        this.field_g = -2147483648;
        this.field_d = -2147483648;
        this.field_b = null;
        this.field_f = -2147483648;
        this.field_i = false;
        this.field_l = -2;
    }

    final void a(int param0, int param1, ei param2, lg param3, int param4) {
        lr stackIn_25_0 = null;
        String stackIn_25_1 = null;
        int stackIn_26_2 = 0;
        lr stackIn_29_0;
        String stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        lr stackIn_30_0 = null;
        String stackIn_30_1 = null;
        int stackIn_30_4 = 0;
        lr stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        int stackIn_33_4;
        int stackIn_33_5;
        int stackIn_33_6;
        int stackIn_33_7;
        lr stackIn_34_0;
        String stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_8;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          nj.a(this.field_j, (byte) -112, param2.field_l, param1 + param2.field_C, param0 + param2.field_D, param2.field_y);
          if (null != this.field_b) {
            var6_int = param2.field_C + param1 + this.field_g;
            if (param3.field_m == 1) {
              var6_int = var6_int + (param2.field_l - this.field_b.field_w) / 2;
            }
            var7 = param0 + (param2.field_D + this.field_f);
            if (param3.field_p == 1) {
              var7 = var7 + (param2.field_y - this.field_b.field_y) / 2;
            }
            if (2 == param3.field_m) {
              var6_int = var6_int + (param2.field_l - this.field_b.field_w);
            }
            if (2 == param3.field_p) {
              var7 = var7 + (-this.field_b.field_y + param2.field_y);
            }
            this.field_b.c(var6_int, var7);
          }
          var6 = param3.c(-1, param2);
          if (param4 <= 96) {
            this.field_h = 108;
          }
          if (var6 != null &&
            param3.field_a != null) {
            if (this.field_l < 0) {
              return;
            }
            stackIn_25_0 = param3.field_a;
            stackIn_25_1 = var6;
            if (this.field_g != -2147483648) {
              stackIn_26_2 = this.field_g;
            } else {
              stackIn_26_2 = 0;
            }
            stackIn_29_0 = stackIn_25_0;
            stackIn_29_1 = stackIn_25_1;
            stackIn_29_2 = stackIn_26_2 + param3.field_i + (param2.field_C + param1);
            stackIn_29_3 = param3.field_f + param2.field_D + param0;
            if (-2147483648 != this.field_f) {
              stackIn_30_0 = stackIn_29_0;
              stackIn_30_1 = stackIn_29_1;
              stackIn_30_4 = this.field_f;
            } else {
              stackIn_30_0 = stackIn_25_0;
              stackIn_30_1 = stackIn_25_1;
              stackIn_30_4 = 0;
            }
            stackIn_33_0 = stackIn_30_0;
            stackIn_33_1 = stackIn_30_1;
            stackIn_33_2 = stackIn_29_2;
            stackIn_33_3 = stackIn_29_3 + stackIn_30_4;
            stackIn_33_4 = -param3.field_i + (param2.field_l - param3.field_g);
            stackIn_33_5 = -param3.field_j + param2.field_y - param3.field_f;
            stackIn_33_6 = this.field_l;
            stackIn_33_7 = this.field_h;
            if (this.field_d != -2147483648) {
              stackIn_34_0 = stackIn_33_0;
              stackIn_34_1 = stackIn_33_1;
              stackIn_34_2 = stackIn_33_2;
              stackIn_34_8 = this.field_d;
            } else {
              stackIn_34_0 = stackIn_30_0;
              stackIn_34_1 = stackIn_30_1;
              stackIn_34_2 = stackIn_29_2;
              stackIn_34_8 = 256;
            }
            ((lr) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_33_3, stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_33_7, stackIn_34_8, param3.field_m, param3.field_p, param3.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_39_0 = var6_ref;
          stackIn_39_1 = new StringBuilder().append("pf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_0 = stackIn_39_0;
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param3 == null) {
            stackIn_44_0 = stackIn_43_0;
            stackIn_44_2 = "null";
          } else {
            stackIn_44_0 = stackIn_39_0;
            stackIn_44_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_e = new hj(11, 0, 1, 2);
        field_a = "Nine-ball";
    }
}
