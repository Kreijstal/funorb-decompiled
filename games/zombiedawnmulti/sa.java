/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends br {
    private int field_o;
    private rl field_i;
    static ip field_n;
    private int field_k;
    static boolean field_f;
    private int field_j;
    private int field_h;
    private int field_l;
    private int field_p;
    private int field_g;
    private int field_m;

    final static String a(String param0, int param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param2.length();
          var6 = param3.length();
          if (param1 <= 53) {
            sa.a((md) null, (int[]) null, false, (int[]) null, (byte) -11, true, true);
          }
          if (0 == var5) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (var8 != 0) {
            var9_int = 0;
            do {
              var9_int = param0.indexOf(param2, var9_int);
              if (0 > var9_int) {
                break;
              }
              var9_int = var9_int + var5;
              var7 = var7 + var8;
            } while (var12 == 0);
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          L4: while (true) {
            var11 = param0.indexOf(param2, var10);
            if (var11 < 0) {
              if (var12 == 0) {
                break L4;
              }
            } else {
              discarded$0 = var9.append(param0.substring(var10, var11));
              discarded$1 = var9.append(param3);
              var10 = var5 + var11;
            }
            if (var12 == 0) {
              continue;
            }
            break;
          }
          discarded$2 = var9.append(param0.substring(var10));
          stackIn_22_0 = var9.toString();
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("sa.G(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a(-16, -55, 69);
          }
          stackIn_10_0 = (this.field_h >= this.field_l) && (this.field_k == 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "sa.A(" + param0 + ')');
        }
    }

    final void d(int param0) {
        this.field_k = 0;
        if (param0 >= -89) {
          return;
        }
        try {
          this.field_h = this.field_l;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sa.B(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0;
        br var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        lm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.b(true)) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          if (fieldTemp$0 > 10) {
            this.field_m = 0;
            var2 = this.field_i.field_u.c(87);
            while (var2 instanceof ek) {
              stackOut_7_0 = var2 instanceof lm;
              stackIn_17_0 = stackOut_7_0 ? 1 : 0;
              stackIn_8_0 = stackOut_7_0;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_8_0) {
                var3 = (lm) (var2);
                var4 = var3.e((byte) -112) - this.field_p;
                var5 = var3.g(1829947600) - this.field_o;
                if (var4 * var4 + var5 * var5 < 66564) {
                  var3.a(-12, this);
                }
              }
              var2 = var2.field_d;
              if (var6 == 0) {
                continue;
              }
              break;
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_g = this.field_g + 7;
            stackIn_17_0 = ~this.field_l;
          }
          boolean decompiledSharedTail0 = !(stackIn_17_0 >= ~this.field_h);
          if (!decompiledSharedTail0) {
            this.field_k = this.field_k - this.field_j;
            decompiledSharedTail0 = (var6 != 0);
          }
          if (decompiledSharedTail0) {
            if (this.field_k < 256) {
              this.field_k = this.field_k + this.field_j;
            }
            this.field_h = this.field_h + 1;
          }
          if (this.field_g > 256) {
            this.field_g = 0;
          }
          var2_int = -106 % ((param0 - 35) / 42);
          if (this.field_k > 256) {
            this.field_k = 256;
          }
          if (this.field_k < 0) {
            this.field_k = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "sa.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 >= -53) {
          return;
        }
        try {
          field_n = null;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sa.H(" + param0 + ')');
        }
    }

    final static void a(md param0, int[] param1, boolean param2, int[] param3, byte param4, boolean param5, boolean param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
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
        var30 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param1[3] >> 2;
          var22 = param1[4] >> 2;
          var23 = param1[5] >> 2;
          var24 = param1[6] >> 2;
          var25 = param1[7] >> 2;
          var26 = param1[8] >> 2;
          var27 = param1[9] >> 2;
          var28 = param1[10] >> 2;
          var13 = var24 * param3[3] + param3[4] * var25 + param3[5] * var26 >> 14;
          var29 = param1[11] >> 2;
          var12 = var21 * param3[3] - (-(param3[4] * var22) - var23 * param3[5]) >> 14;
          var15 = param3[7] * var22 + (param3[6] * var21 + param3[8] * var23) >> 14;
          var20 = var28 * param3[10] + param3[9] * var27 + var29 * param3[11] >> 14;
          var16 = var26 * param3[8] + (param3[6] * var24 + param3[7] * var25) >> 14;
          var19 = var26 * param3[11] + param3[9] * var24 + param3[10] * var25 >> 14;
          var14 = var27 * param3[3] + (var28 * param3[4] + var29 * param3[5]) >> 14;
          var17 = param3[7] * var28 + (var27 * param3[6] + param3[8] * var29) >> 14;
          var18 = var22 * param3[10] + (param3[9] * var21 + param3[11] * var23) >> 14;
          var21 = -param1[0] + param3[0];
          var22 = -param1[1] + param3[1];
          var23 = -param1[2] + param3[2];
          var9 = var23 * param1[5] + (var21 * param1[3] + var22 * param1[4]) >> 16 - eq.field_g;
          var10 = param1[8] * var23 + param1[7] * var22 + var21 * param1[6] >> 16 - eq.field_g;
          var11 = param1[11] * var23 + var22 * param1[10] + var21 * param1[9] >> 16;
          var21 = ep.field_d;
          var22 = ep.field_c;
          if (param4 != -121) {
            field_n = (ip) null;
          }
          var23 = 0;
          L3: while (true) {
            if (param0.field_n > var23) {
              var24 = param0.field_k[var23];
              var25 = param0.field_E[var23];
              var26 = param0.field_v[var23];
              var27 = (var15 * var25 + (var24 * var12 + var18 * var26) >> -eq.field_g + 16) + var9;
              var28 = (var19 * var26 + (var25 * var16 + var24 * var13) >> -eq.field_g + 16) + var10;
              var29 = var11 + (var20 * var26 + (var17 * var25 + var14 * var24) >> 16);
              stackIn_60_0 = -51;
              stackIn_60_1 = ~var29;
              if (var30 != 0) {
                if (stackIn_60_0 < stackIn_60_1) {
                  if (eb.field_J.length <= var18) {
                    break L3;
                  }
                  var19 = param0.field_A[var18];
                  var20 = param0.field_p[var18];
                  var21 = param0.field_b[var18];
                  eb.field_J[var18] = var20 * var12 + (var19 * var9 + var21 * var15) >> 16;
                  bq.field_g[var18] = var21 * var16 + var20 * var13 + var10 * var19 >> 16;
                  wp.field_i[var18] = var19 * var11 + var20 * var14 + var21 * var17 >> 16;
                  var18++;
                  break L3;
                }
                break L3;
              }
              if (stackIn_60_0 < stackIn_60_1) {
                hl.field_f[var23] = -2147483648;
              } else {
                lo.field_j[var23] = var21 + var27 / var29;
                jk.field_k[var23] = var28 / var29 + var22;
                if (var8 < var29) {
                  var8 = var29;
                }
                if (var7_int > var29) {
                  var7_int = var29;
                }
                hl.field_f[var23] = var29;
              }
              if (param5) {
                vi.field_b[var23] = var27 >> eq.field_g;
                ok.field_r[var23] = var28 >> eq.field_g;
                hp.field_s[var23] = var29;
              }
              var23++;
              continue;
            }
            if (param0.field_t != null &&
              param0.field_w != null &&
              param0.field_I != null &&
              null != param0.field_e &&
              param0.field_h != null &&
              param0.field_q != null &&
              null != param0.field_f &&
              null != param0.field_O &&
              param0.field_i != null) {
              var23 = 0;
              while (!(param0.field_B <= var23)) {
                var24 = param0.field_t[var23];
                var25 = param0.field_w[var23];
                var26 = param0.field_I[var23];
                nm.field_m[var23] = var9 + (var25 * var15 + var24 * var12 + var18 * var26 >> 16);
                nh.field_i[var23] = var10 + (var13 * var24 + var25 * var16 + var26 * var19 >> 16);
                cj.field_F[var23] = (var20 * var26 + (var17 * var25 + var24 * var14) >> 16) + var11;
                var24 = param0.field_e[var23];
                var25 = param0.field_h[var23];
                var26 = param0.field_q[var23];
                fk.field_m[var23] = var9 + (var12 * var24 + var15 * var25 + var26 * var18 >> 16);
                bh.field_c[var23] = var10 + (var24 * var13 + (var25 * var16 + var26 * var19) >> 16);
                de.field_c[var23] = var11 + (var20 * var26 + (var17 * var25 + var14 * var24) >> 16);
                var24 = param0.field_f[var23];
                var25 = param0.field_O[var23];
                var26 = param0.field_i[var23];
                fl.field_c[var23] = (var24 * var12 + var15 * var25 + var18 * var26 >> 16) + var9;
                qe.field_o[var23] = (var19 * var26 + (var25 * var16 + var13 * var24) >> 16) + var10;
                ll.field_f[var23] = (var14 * var24 + var17 * var25 + var26 * var20 >> 16) + var11;
                var23++;
                if (var30 != 0) {
                  return;
                }
              }
            }
            if (param2) {
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
                stackIn_60_0 = ~param0.field_o;
                stackIn_60_1 = ~var18;
                if (stackIn_60_0 >= stackIn_60_1) {
                  break;
                }
                if (eb.field_J.length <= var18) {
                  break;
                }
                var19 = param0.field_A[var18];
                var20 = param0.field_p[var18];
                var21 = param0.field_b[var18];
                eb.field_J[var18] = var20 * var12 + (var19 * var9 + var21 * var15) >> 16;
                bq.field_g[var18] = var21 * var16 + var20 * var13 + var10 * var19 >> 16;
                wp.field_i[var18] = var19 * var11 + var20 * var14 + var21 * var17 >> 16;
                var18++;
              } while (var30 == 0);
            }
            break;
          }
          ho.a(param0, var8, var7_int, param6, 16634);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("sa.F(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 121) {
            this.field_h = 67;
          }
          this.field_o = param2;
          this.field_p = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "sa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    sa(ge param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_m = 0;
        try {
          this.field_i = param0.field_A;
          this.field_k = 0;
          this.field_l = param3;
          this.field_p = param1;
          this.field_j = 3;
          this.field_o = param2;
          this.field_g = 0;
          this.field_h = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("sa.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17310) {
            this.c(-105);
          }
          var4_int = -this.field_p + param0;
          var5 = -this.field_o + param2;
          stackIn_7_0 = !(var4_int * var4_int + var5 * var5 >= 66564);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "sa.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_f = false;
        field_n = new ip();
    }
}
