/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    private int field_h;
    static String field_k;
    static bl field_f;
    private int field_d;
    static int[] field_b;
    private boolean field_j;
    qj[] field_i;
    qj field_g;
    private int field_a;
    private int field_e;
    private int field_l;
    static Boolean field_c;

    final void a(int param0, int param1, al param2, int param3, gi param4) {
        oh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_22_5 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          cl.a(this.field_i, param0 + param2.field_p, param2.field_u, param2.field_m + param1, param2.field_x, 4);
          if (null != this.field_g) {
            var6_int = this.field_h + param0 + param2.field_p;
            if (1 == param4.field_f) {
              var6_int = var6_int + (-this.field_g.field_s + param2.field_x) / 2;
            }
            var7 = param1 + (param2.field_m + this.field_l);
            if (param4.field_f == 2) {
              var6_int = var6_int + (param2.field_x - this.field_g.field_s);
            }
            if (param4.field_l == 1) {
              var7 = var7 + (-this.field_g.field_v + param2.field_u) / 2;
            }
            if (param4.field_l == 2) {
              var7 = var7 + (param2.field_u - this.field_g.field_v);
            }
            this.field_g.e(var6_int, var7);
          }
          var6 = param4.c((byte) 56, param2);
          if (param3 != -16711924) {
            this.a(74, true);
          }
          if (var6 != null &&
            param4.field_k != null &&
            this.field_e >= 0) {
            stackIn_18_0 = param4.field_k;
            stackIn_18_1 = var6;
            if (-2147483648 != this.field_h) {
              stackIn_19_2 = this.field_h;
            } else {
              stackIn_19_2 = 0;
            }
            stackIn_21_2 = stackIn_19_2 + (param2.field_p + (param0 + param4.field_e));
            stackIn_21_3 = param1 + param2.field_m;
            stackIn_21_4 = -param4.field_h;
            if (this.field_l == -2147483648) {
              stackIn_22_5 = 0;
            } else {
              stackIn_22_5 = this.field_l;
            }
            stackIn_24_3 = stackIn_21_3 - (stackIn_21_4 - stackIn_22_5);
            stackIn_24_4 = -param4.field_b + param2.field_x - param4.field_e;
            stackIn_24_5 = -param4.field_h + param2.field_u - param4.field_d;
            stackIn_24_6 = this.field_e;
            stackIn_24_7 = this.field_d;
            if (this.field_a == -2147483648) {
              stackIn_25_8 = 256;
            } else {
              stackIn_25_8 = this.field_a;
            }
            ((oh) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param4.field_f, param4.field_l, param4.field_n);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("qi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(boolean param0, qi param1) {
        try {
          param1.field_e = this.field_e;
          param1.field_d = this.field_d;
          param1.field_l = this.field_l;
          if (param0) {
            this.field_j = false;
          }
          param1.field_g = this.field_g;
          param1.field_i = this.field_i;
          param1.field_h = this.field_h;
          param1.field_j = this.field_j;
          param1.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "qi.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, pf param7) {
        int stackIn_15_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        cg stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        cg var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        pf var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = TrackController.field_F ? 1 : 0;
        try {
          var45 = param7;
          if (var45.field_x != null &&
            1 < var45.field_a) {
            var61 = var45.field_x;
            pl.a(ok.field_F, 1240830180, 0, 0, var61);
          } else {
            sa.j(75);
          }
          var55 = new int[param7.field_l];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param7.field_l];
          var62 = wf.field_c;
          var63 = ch.field_y;
          var64 = ea.field_w;
          for (var13 = 0; var13 < param7.field_l; var13++) {
            var14 = param1 * var62[var13] - (-(var63[var13] * param5) - param3 * var64[var13]) >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 < 128) {
                stackIn_15_0 = 128 + var14;
              } else {
                stackIn_15_0 = 256;
              }
            } else {
              stackIn_15_0 = 128;
            }
            var14Lifetime2 = stackIn_15_0;
            var15 = var64[var13] * param4 + (param6 * var62[var13] + param0 * var63[var13]) >> 8;
            stackIn_17_0 = ec.field_d;
            if (var15 < 0) {
              stackIn_18_1 = -var15;
            } else {
              stackIn_18_1 = var15;
            }
            var15Lifetime2 = stackIn_17_0[stackIn_18_1];
            var14Lifetime2 = (256 - var15Lifetime2) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          if (param2 <= 2) {
            field_k = (String) null;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (ug.field_Q > var44) {
            var14Lifetime1 = gk.field_b[var44];
            var15Lifetime1 = param7.field_O[var14Lifetime1];
            var16 = param7.field_g[var14Lifetime1];
            var17 = param7.field_d[var14Lifetime1];
            if (wf.field_c.length <= param7.field_G[var14Lifetime1]) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param7.field_G[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (param7.field_r[var14Lifetime1] < wf.field_c.length) {
              stackIn_29_0 = param7.field_r[var14Lifetime1];
            } else {
              stackIn_29_0 = -1;
            }
            var19 = stackIn_29_0;
            if (wf.field_c.length > param7.field_J[var14Lifetime1]) {
              stackIn_32_0 = param7.field_J[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (lg.field_d != null &&
              null != param7.field_e &&
              param7.field_e.length > var14Lifetime1 &&
              param7.field_e[var14Lifetime1] != -1 &&
              param7.field_e[var14Lifetime1] < lg.field_d.length) {
              stackIn_39_0 = lg.field_d[param7.field_e[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = qa.field_b[var15Lifetime1];
            var23 = ui.field_r[var15Lifetime1];
            var24 = qa.field_b[var16];
            var25 = ui.field_r[var16];
            var26 = qa.field_b[var17];
            var27 = ui.field_r[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_49_0 = var21.field_a;
              } else {
                stackIn_49_0 = 8355711;
              }
              var30 = stackIn_49_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = var31 * var28 >>> 8 & 553582847 | (16711832 & var32 * var28) >>> 8;
              var33 = var33 + 65793 * var29;
              nd.a(1, var27, var22, var23, var25, (16711422 & var33) >> 1, var26, var24);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_45_0 = var21.field_a;
              } else {
                stackIn_45_0 = 8355711;
              }
              var34 = stackIn_45_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = (16711899 & var28 * var36) >>> 8 | (var28 * var35 & -16711709) >>> 8;
              var38 = (16711720 & var36 * var29) >>> 8 | -620822273 & var35 * var29 >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + var32 * 65793;
              var39 = (var30 * var35 & -16711924) >>> 8 | var36 * var30 >>> 8 & -738132224;
              var39 = var39 + var33 * 65793;
              dc.a(var27, 1581360577, 255 & var39, var23, var22, var39 >> 16, var38 >> 16, var26, 255 & var37 >> 8, var24, var37 & 255, (65487 & var39) >> 8, var38 >> 8 & 255, var37 >> 16, 255 & var38, var25);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("qi.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final qi a(byte param0, int param1) {
        this.field_l = param1;
        if (param0 < 68) {
          qi.a(-25);
        }
        return this;
    }

    final qi a(boolean param0, int param1) {
        this.field_j = param0 ? true : false;
        if (param1 != 19749) {
          this.field_d = -64;
        }
        return this;
    }

    final static void b(int param0) {
        try {
          if (param0 != 8770) {
            qi.d(77);
          }
          if (pl.field_b != null) {
            try {
              pl.field_b.a(0L, true);
              pl.field_b.a(24, param0 ^ -8771, ne.field_a.field_j, ne.field_a.field_k);
            } catch (Exception exception) {
            }
          }
          ne.field_a.field_k = ne.field_a.field_k + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qi b(int param0, int param1) {
        this.field_d = param0;
        int var3 = -68 % ((28 - param1) / 38);
        return this;
    }

    final static bl[] c(int param0) {
        if (param0 != 19664) {
          qi.a(-67, -64, (byte) 51, -120, 50);
        }
        return new bl[]{rd.field_o, field_f, oi.field_a};
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 != 0) {
            qi.b(-93);
          }
          bf.a((byte) -26, param0);
          nb.a(rk.field_Z, false, -16257);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "qi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final qi a(int param0, qj[] param1) {
        RuntimeException var3 = null;
        qi stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 108) {
            stackIn_2_0 = (qi) null;
            return stackIn_2_0;
          }
          this.field_i = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qi.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = TrackController.field_F ? 1 : 0;
        int var2Lifetime1;
        try {
          int var1_int = -103 % ((-24 - param0) / 34);
          wl.field_i.b(-19635);
          for (var2 = 0; var2 < 32; var2++) {
            bc.field_a[var2] = 0L;
          }
          for (var2Lifetime1 = 0; var2Lifetime1 < 32; var2Lifetime1++) {
            ai.field_g[var2Lifetime1] = 0L;
          }
          v.field_f = 0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "qi.D(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        this.field_h = 0;
        this.field_e = 0;
        this.field_l = 0;
        if (param0 < 53) {
          return;
        }
        this.field_g = null;
        this.field_a = 256;
        this.field_d = -1;
        this.field_i = null;
    }

    final qi a(int param0, boolean param1) {
        this.field_e = param0;
        if (param1) {
          return (qi) null;
        }
        return this;
    }

    final void a(gi param0, int param1, al param2, int param3, qi param4, int param5) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_j) {
            param4.a(param5, param1, param2, -16711924, param0);
            param4.a((byte) 58);
          }
          if (this.field_h != -2147483648) {
            param4.field_h = this.field_h;
          }
          if (this.field_i != null) {
            param4.field_i = this.field_i;
          }
          if (this.field_d >= param3) {
            param4.field_d = this.field_d;
          }
          if (this.field_e >= -1) {
            param4.field_e = this.field_e;
          }
          if (-2147483648 != this.field_a) {
            param4.field_a = this.field_a;
          }
          if (this.field_l != -2147483648) {
            param4.field_l = this.field_l;
          }
          if (this.field_g != null) {
            param4.field_g = this.field_g;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("qi.H(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(')').toString());
        }
    }

    final static qj[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 < 114) {
          pf var6 = (pf) null;
          qi.a(-47, 76, (byte) -78, -114, -61, 88, -14, (pf) null);
        }
        return g.a(param4, 1, 1, param3, param1, param0, 1, 3, -119);
    }

    final qi a(int param0, int param1) {
        this.field_h = param1;
        if (param0 != 255) {
          this.field_a = 9;
        }
        return this;
    }

    qi() {
        this.field_j = false;
        this.field_g = null;
        this.field_a = -2147483648;
        this.field_i = null;
        this.field_d = -2;
        this.field_e = -2;
        this.field_h = -2147483648;
        this.field_l = -2147483648;
    }

    public static void a(int param0) {
        field_f = null;
        field_b = null;
        field_k = null;
        if (param0 != 0) {
          field_k = (String) null;
        }
        field_c = null;
    }

    static {
        field_f = new bl("usename");
    }
}
