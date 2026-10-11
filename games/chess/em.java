/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    short[] field_J;
    short[] field_l;
    static String field_M;
    int field_n;
    static String[] field_m;
    int field_K;
    short[] field_B;
    short[] field_N;
    byte field_j;
    int[] field_D;
    static km[] field_r;
    int field_x;
    int[] field_h;
    short field_d;
    byte[] field_y;
    short field_t;
    int[] field_p;
    short[] field_H;
    private boolean field_c;
    int[] field_q;
    int[] field_s;
    short field_e;
    short[] field_f;
    short[] field_o;
    int field_I;
    short[] field_C;
    short[] field_z;
    short[] field_a;
    int[] field_u;
    short[] field_R;
    short[] field_b;
    short[] field_i;
    static int field_O;
    static String field_k;
    int[] field_Q;
    short[] field_G;
    short[] field_E;
    short[] field_F;
    int[] field_w;
    int field_P;
    short[] field_A;
    int field_v;
    int[] field_L;
    short[] field_g;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Chess.field_G;
        if (param2 != -70) {
          return;
        }
        for (var6 = 0; var6 < this.field_d; var6++) {
          this.field_z[var6] = (short)(param0 * this.field_z[var6] / param4);
          this.field_a[var6] = (short)(param1 * this.field_a[var6] / param4);
          this.field_H[var6] = (short)(param3 * this.field_H[var6] / param4);
        }
        this.a(true);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = Chess.field_G;
        for (var5 = 0; var5 < this.field_d; var5++) {
          this.field_z[var5] = (short)(this.field_z[var5] + param1);
          this.field_a[var5] = (short)(this.field_a[var5] + param0);
          this.field_H[var5] = (short)(this.field_H[var5] + param2);
        }
        if (param3 != -81) {
          this.a(-105, 51, -27, (byte) -74);
        }
        this.a(true);
    }

    private final void a(boolean param0) {
        if (!param0) {
          this.a(121, 113, -33, (byte) 80);
        }
        this.field_c = false;
    }

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = Chess.field_G;
        try {
          var1_int = 0;
          if (param0) {
            field_m = (String[]) null;
          }
          while (qf.field_c > var1_int) {
            ik.field_i[var1_int] = null;
            var1_int++;
          }
          qf.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "em.G(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_m = null;
        field_M = null;
        if (param0 != 3) {
          field_O = 75;
        }
        field_r = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, boolean param5, boolean param6, int param7, boolean param8, boolean param9) {
        int var11;
        var11 = Chess.field_G;
        if (!param2 && (wb.field_h != vi.field_d ||
          fn.field_c != wb.field_c) && (wb.field_c == ph.field_j.field_i &&
          wb.field_h == ph.field_j.field_e)) {
          if (pd.field_Rb != null) {
            cf.a(127, false);
          } else {
            if (ib.field_d != null) {
              cf.a(122, true);
            } else {
              e.g((byte) -127);
            }
          }
        }
        if (param2) {
          fl.field_x = ln.field_rc;
        } else {
          fl.field_x = (vi.field_d - 640) / 2;
        }
        ge.a(false, param2);
        if (param1 != 2) {
          field_m = (String[]) null;
        }
        if (an.field_e > 0) {
          tb.a(param7, param2, param5, (byte) -120);
        }
        tn.field_j.field_fb = 1;
        tn.field_j.field_z = ic.field_c.field_z;
        if (aj.field_c > 0) {
          vg.a(param2, param7, (byte) -84, param5);
        }
        if (0 < ed.field_c) {
          pc.a(param5, -91, param6, param2, param7);
        }
        if (jh.field_a &&
          pd.field_Rb.field_hc <= pd.field_Rb.field_Xb) {
          bh.field_G.field_tb = false;
          ib.field_c.field_Jb.field_db = oj.field_b;
          fm.a(ib.field_c.field_Kb, -128);
        } else {
          ib.field_c.field_Jb.field_db = null;
          bh.field_G.field_tb = true;
          s.a(21487, ib.field_c, param9, param7, param3);
        }
        mk.a(param7, param4, param9, (byte) -68, param0, param3, param8);
        s.a(param1 + 21485, se.field_S, param9, param7, param3);
        g.field_c = g.field_c + 1;
    }

    final void a(int param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = Chess.field_G;
        if (this.field_c) {
          return;
        }
        this.field_c = true;
        var2 = param0;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_d; var8++) {
          var9 = this.field_z[var8];
          var10 = this.field_a[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          var11 = this.field_H[var8];
          if (var3 > var10) {
            var3 = var10;
          }
          if (var11 < var4) {
            var4 = var11;
          }
          if (var11 > var7) {
            var7 = var11;
          }
        }
        this.field_x = var7;
        this.field_I = var3;
        this.field_n = var4;
        this.field_K = var5;
        this.field_P = var2;
        this.field_v = var6;
    }

    final static void a(int param0, km[] param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Chess.field_G;
        try {
          if (param1 == null) {
            return;
          }
          if (0 < param2 &&
            param5 > 0) {
            if (null != param1[3]) {
              stackIn_10_0 = param1[3].field_v;
            } else {
              stackIn_10_0 = 0;
            }
            var6_int = stackIn_10_0;
            if (param1[5] == null) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param1[5].field_v;
            }
            var7 = stackIn_13_0;
            if (param1[1] != null) {
              stackIn_16_0 = param1[1].field_u;
            } else {
              stackIn_16_0 = 0;
            }
            var8 = stackIn_16_0;
            if (param4 != 24599) {
              return;
            }
            if (null == param1[7]) {
              stackIn_21_0 = 0;
            } else {
              stackIn_21_0 = param1[7].field_u;
            }
            var9 = stackIn_21_0;
            var10 = param2 + param3;
            var11 = param5 + param0;
            var12 = var6_int + param3;
            var13 = var10 - var7;
            var14 = param0 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param3 + param2 * var6_int / (var7 + var6_int);
              var16 = param3 + param2 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            wb.b(fa.field_d);
            if (var19 < var18) {
              var19 = param5 * var8 / (var9 + var8) + param0;
              var18 = param5 * var8 / (var9 + var8) + param0;
            }
            if (null != param1[0]) {
              wb.e(param3, param0, var16, var18);
              param1[0].b(param3, param0);
              wb.a(fa.field_d);
            }
            if (param1[2] != null) {
              wb.e(var17, param0, var10, var18);
              param1[2].b(var13, param0);
              wb.a(fa.field_d);
            }
            if (param1[6] != null) {
              wb.e(param3, var19, var16, var11);
              param1[6].b(param3, var15);
              wb.a(fa.field_d);
            }
            if (param1[8] != null) {
              wb.e(var17, var19, var10, var11);
              param1[8].b(var13, var15);
              wb.a(fa.field_d);
            }
            if (null != param1[1] &&
              param1[1].field_v != 0) {
              wb.e(var16, param0, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param1[1].field_v) {
                param1[1].b(var20, param0);
              }
              wb.a(fa.field_d);
            }
            if (param1[7] != null &&
              0 != param1[7].field_v) {
              wb.e(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param1[7].field_v) {
                param1[7].b(var20Lifetime1, var15);
              }
              wb.a(fa.field_d);
            }
            if (null != param1[3] &&
              param1[3].field_u != 0) {
              wb.e(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param1[3].field_u) {
                param1[3].b(param3, var20Lifetime2);
              }
              wb.a(fa.field_d);
            }
            if (null != param1[5] &&
              param1[5].field_u != 0) {
              wb.e(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param1[5].field_u) {
                param1[5].b(var13, var20Lifetime3);
              }
              wb.a(fa.field_d);
            }
            if (null != param1[4] &&
              0 != param1[4].field_v) {
              if (param1[4].field_u == 0) {
                return;
              }
              wb.e(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param1[4].field_u) {
                for (var21 = var12; var21 < var13; var21 = var21 + param1[4].field_v) {
                  param1[4].b(var21, var20Lifetime4);
                }
              }
              wb.a(fa.field_d);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("em.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    em() {
        this.field_c = false;
        this.field_j = (byte) 0;
    }

    static {
        field_k = "Email: ";
        field_M = "All games";
    }
}
