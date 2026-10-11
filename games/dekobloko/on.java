/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on implements gl {
    private int field_b;
    private mm field_j;
    static String field_i;
    static ck[] field_e;
    static boolean field_d;
    private int field_f;
    static String field_h;
    static String field_c;
    static String field_a;
    static int[] field_g;

    final static nj a(byte[] param0, byte param1) {
        nj var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        nj stackIn_5_0 = null;
        nj stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (nj) (stackIn_2_0);
          }
          if (param1 <= 7) {
            stackIn_5_0 = (nj) null;
            return stackIn_5_0;
          }
          var2 = new nj(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, mb.field_d, tc.field_Nb);
          oa.a(126);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("on.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, int[] param1, boolean param2, int[] param3, boolean param4, boolean param5, vg param6) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = client.field_A ? 1 : 0;
        try {
          var7_int = 2147483647;
          if (!param0) {
            return;
          }
          var8 = -2147483648;
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var29 = param1[11] >> 2;
          var13 = var26 * param3[5] + var24 * param3[3] + var25 * param3[4] >> 14;
          var12 = param3[5] * var23 + param3[3] * var21 + param3[4] * var22 >> 14;
          var15 = param3[6] * var21 - (-(param3[7] * var22) - var23 * param3[8]) >> 14;
          var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> 14;
          var19 = var26 * param3[11] + (param3[10] * var25 + var24 * param3[9]) >> 14;
          var14 = var29 * param3[5] + (param3[4] * var28 + param3[3] * var27) >> 14;
          var20 = param3[10] * var28 + (var27 * param3[9] + var29 * param3[11]) >> 14;
          var17 = param3[6] * var27 + var28 * param3[7] + var29 * param3[8] >> 14;
          var16 = param3[7] * var25 + (var24 * param3[6] + var26 * param3[8]) >> 14;
          var21 = param3[0] - param1[0];
          var22 = -param1[1] + param3[1];
          var23 = -param1[2] + param3[2];
          var9 = var21 * param1[3] - (-(param1[4] * var22) - param1[5] * var23) >> -me.field_y + 16;
          var10 = param1[6] * var21 + param1[7] * var22 + var23 * param1[8] >> 16 - me.field_y;
          var11 = var23 * param1[11] + param1[10] * var22 + var21 * param1[9] >> 16;
          var21 = qg.field_g;
          var22 = qg.field_c;
          var23 = 0;
          L2: while (true) {
            if (var23 < param6.field_l) {
              var24 = param6.field_J[var23];
              var25 = param6.field_o[var23];
              var26 = param6.field_e[var23];
              var27 = (var25 * var15 + (var24 * var12 + var26 * var18) >> -me.field_y + 16) + var9;
              var28 = (var19 * var26 + (var24 * var13 + var16 * var25) >> 16 - me.field_y) + var10;
              var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> 16);
              stackIn_61_0 = -51;
              stackIn_61_1 = ~var29;
              if (var30 != 0) {
                if (stackIn_61_0 < stackIn_61_1) {
                  if (id.field_M.length <= var18) {
                    break L2;
                  }
                  var19 = param6.field_k[var18];
                  var20 = param6.field_u[var18];
                  var21 = param6.field_O[var18];
                  id.field_M[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> 16;
                  bc.field_I[var18] = var16 * var21 + var10 * var19 + var20 * var13 >> 16;
                  sf.field_C[var18] = var20 * var14 + var11 * var19 + var21 * var17 >> 16;
                  var18++;
                  break L2;
                }
                break L2;
              }
              if (stackIn_61_0 >= stackIn_61_1) {
                kl.field_n[var23] = var27 / var29 + var21;
                rn.field_b[var23] = var22 + var28 / var29;
                if (var7_int > var29) {
                  var7_int = var29;
                }
                vg.field_G[var23] = var29;
                if (var29 > var8) {
                  var8 = var29;
                }
              } else {
                vg.field_G[var23] = -2147483648;
              }
              if (param5) {
                dd.field_a[var23] = var27 >> me.field_y;
                uk.field_z[var23] = var28 >> me.field_y;
                vj.field_d[var23] = var29;
              }
              var23++;
              continue;
            }
            if (null != param6.field_q &&
              param6.field_K != null &&
              param6.field_m != null &&
              param6.field_T != null &&
              null != param6.field_w &&
              param6.field_S != null &&
              param6.field_g != null &&
              param6.field_v != null &&
              param6.field_R != null) {
              var23 = 0;
              while (!(var23 >= param6.field_L)) {
                var24 = param6.field_q[var23];
                var25 = param6.field_K[var23];
                var26 = param6.field_m[var23];
                ec.field_f[var23] = var9 + (var15 * var25 + (var24 * var12 + var26 * var18) >> 16);
                fc.field_d[var23] = var10 + (var25 * var16 + var24 * var13 + var19 * var26 >> 16);
                jg.field_h[var23] = var11 + (var17 * var25 + (var24 * var14 + var20 * var26) >> 16);
                var24 = param6.field_T[var23];
                var25 = param6.field_w[var23];
                var26 = param6.field_S[var23];
                kb.field_a[var23] = (var26 * var18 + var12 * var24 + var25 * var15 >> 16) + var9;
                cd.field_b[var23] = var10 + (var16 * var25 + var13 * var24 + var19 * var26 >> 16);
                be.field_t[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 16) + var11;
                var24 = param6.field_g[var23];
                var25 = param6.field_v[var23];
                var26 = param6.field_R[var23];
                ke.field_h[var23] = var9 + (var18 * var26 + (var12 * var24 + var25 * var15) >> 16);
                b.field_M[var23] = var10 + (var19 * var26 + var13 * var24 + var25 * var16 >> 16);
                d.field_d[var23] = var11 + (var26 * var20 + var17 * var25 + var14 * var24 >> 16);
                var23++;
                if (var30 != 0) {
                  return;
                }
              }
            }
            if (param4) {
              var9 = param3[3];
              var10 = param3[4];
              var11 = param3[5];
              var12 = param3[6];
              var13 = param3[7];
              var14 = param3[8];
              var15 = param3[9];
              var16 = param3[10];
              var17 = param3[11];
              var18 = 0;
              do {
                stackIn_61_0 = var18;
                stackIn_61_1 = param6.field_D;
                if (stackIn_61_0 >= stackIn_61_1) {
                  break;
                }
                if (id.field_M.length <= var18) {
                  break;
                }
                var19 = param6.field_k[var18];
                var20 = param6.field_u[var18];
                var21 = param6.field_O[var18];
                id.field_M[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> 16;
                bc.field_I[var18] = var16 * var21 + var10 * var19 + var20 * var13 >> 16;
                sf.field_C[var18] = var20 * var14 + var11 * var19 + var21 * var17 >> 16;
                var18++;
              } while (var30 == 0);
            }
            break;
          }
          em.a(param6, param2, var8, (byte) 103, var7_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("on.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          if (!param4.field_q &&
            !param4.a(true)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          if (param3 > -60) {
            return;
          }
          this.field_j.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_E + "</u>", param4.field_u + param1, param4.field_D + param2, param4.field_t, param4.field_y, var6_int, -1, this.field_b, this.field_f, this.field_j.field_K + this.field_j.field_R);
          if (param4.a(true)) {
            var7 = this.field_j.a(param4.field_E);
            var8 = this.field_j.field_K + this.field_j.field_R;
            var9 = param4.field_u + param1;
            if (2 != this.field_b) {
              if (this.field_b == 1) {
                var9 = var9 + (param4.field_t - var7 >> 1);
                if (var11 != 0) {
                  var9 = var9 + (-var7 + param4.field_t);
                }
              }
            } else {
              var9 = var9 + (-var7 + param4.field_t);
            }
            var10 = param2 + param4.field_D;
            if (this.field_f != 2) {
              if (this.field_f == 1) {
                var10 = var10 + (param4.field_y - var8 >> 1);
                if (var11 != 0) {
                  var10 = var10 + (param4.field_y - var8);
                }
              }
            } else {
              var10 = var10 + (param4.field_y - var8);
            }
            kd.a(4 + var7, -2 + var9, (byte) -96, var10 + 2, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_28_0 = var6;
          stackIn_28_1 = new StringBuilder().append("on.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var1_int = dl.field_M * dl.field_M;
        if (param0 != -100) {
          return;
        }
        try {
          var2 = var1_int - bl.field_T * bl.field_T;
          var3 = qc.field_Y + (ac.field_B - qc.field_Y) * var2 / var1_int;
          ea.field_D.a(640, param0 + 100, var3, 120, vh.field_g);
          gi.a(ac.field_B - 24, j.field_c, 640, nk.field_b, 0, 5, (byte) -107);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "on.C(" + param0 + ')');
        }
    }

    public on() {
        try {
          this.field_j = hh.field_e;
          this.field_f = 1;
          this.field_b = 1;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "on.<init>()");
        }
    }

    on(mm param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param1;
          this.field_j = param0;
          this.field_f = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("on.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static pi[] a(int param0, byte param1, int param2, ji param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        pi[] stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gb.a(param2, param3, param0, 38)) {
            stackIn_4_0 = null;
            return (pi[]) (stackIn_4_0);
          }
          if (param1 != 37) {
            on.b((byte) 98);
          }
          stackIn_9_0 = ci.b(-112);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("on.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_e = null;
        field_i = null;
        if (param0 != 6) {
          return;
        }
        try {
          field_c = null;
          field_a = null;
          field_g = null;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "on.D(" + param0 + ')');
        }
    }

    final static void a(ck[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          if (param1 != 19264) {
            return;
          }
          if (null != param0) {
            var2_int = 0;
            while (var2_int < param0.length) {
              param0[var2_int].b();
              var2_int++;
              if (var3 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("on.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_i = "No options available";
        field_h = "<%0> AT ONCE";
        field_g = new int[]{200, 100, 200, 300, 200, 1000, 200, 1000, 300, 500, 500, 100, 100, 200, 500, 200, 300, 1000, 100, 200, 500, 300, 500, 500, 100, 100, 100, 100, 200, 200, 300};
        field_c = "Return to Options Menu";
        field_a = "Special Item Bonus: ";
    }
}
