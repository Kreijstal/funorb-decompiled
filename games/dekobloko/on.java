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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 > 7) {
                var2 = new nj(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, mb.field_d, tc.field_Nb);
                oa.a(126);
                stackIn_7_0 = (nj) (var2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (nj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
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
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("on.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nj) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(boolean param0, int[] param1, boolean param2, int[] param3, boolean param4, boolean param5, vg param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        int decompiledRegionSelector0 = 0;
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
          L0: {
            var7_int = 2147483647;
            if (param0) {
              var8 = -2147483648;
              var21 = param1[3] >> -271266366;
              var22 = param1[4] >> -1473161854;
              var23 = param1[5] >> -1133877790;
              var24 = param1[6] >> -142707454;
              var25 = param1[7] >> 1029153442;
              var26 = param1[8] >> -2000365214;
              var27 = param1[9] >> 1213195106;
              var28 = param1[10] >> 1851497538;
              var29 = param1[11] >> -1209643166;
              var13 = var26 * param3[5] + var24 * param3[3] + var25 * param3[4] >> -855007538;
              var12 = param3[5] * var23 + param3[3] * var21 - -(param3[4] * var22) >> 416957870;
              var15 = param3[6] * var21 - (-(param3[7] * var22) - var23 * param3[8]) >> 1706468014;
              var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> -896953074;
              var19 = var26 * param3[11] + (param3[10] * var25 + var24 * param3[9]) >> 699680526;
              var14 = var29 * param3[5] + (param3[4] * var28 + param3[3] * var27) >> -1719218162;
              var20 = param3[10] * var28 + (var27 * param3[9] + var29 * param3[11]) >> 323688910;
              var17 = param3[6] * var27 - -(var28 * param3[7]) + var29 * param3[8] >> 1880148654;
              var16 = param3[7] * var25 + (var24 * param3[6] - -(var26 * param3[8])) >> -1690955026;
              var21 = param3[0] - param1[0];
              var22 = -param1[1] + param3[1];
              var23 = -param1[2] + param3[2];
              var9 = var21 * param1[3] - (-(param1[4] * var22) - param1[5] * var23) >> -me.field_y + 16;
              var10 = param1[6] * var21 - -(param1[7] * var22) + var23 * param1[8] >> 16 + -me.field_y;
              var11 = var23 * param1[11] + param1[10] * var22 + var21 * param1[9] >> -1661035472;
              var21 = qg.field_g;
              var22 = qg.field_c;
              var23 = 0;
              L1: while (true) {
                L2: {
                  if ((var23 ^ -1) <= (param6.field_l ^ -1)) {
                    L3: {
                      if (null == param6.field_q) {
                        break L3;
                      } else {
                        if (param6.field_K == null) {
                          break L3;
                        } else {
                          if (param6.field_m == null) {
                            break L3;
                          } else {
                            if (param6.field_T == null) {
                              break L3;
                            } else {
                              if (null == param6.field_w) {
                                break L3;
                              } else {
                                if (param6.field_S == null) {
                                  break L3;
                                } else {
                                  if (param6.field_g == null) {
                                    break L3;
                                  } else {
                                    if (param6.field_v == null) {
                                      break L3;
                                    } else {
                                      if (param6.field_R != null) {
                                        var23 = 0;
                                        L4: while (true) {
                                          if ((var23 ^ -1) <= (param6.field_L ^ -1)) {
                                            break L3;
                                          } else {
                                            var24 = param6.field_q[var23];
                                            var25 = param6.field_K[var23];
                                            var26 = param6.field_m[var23];
                                            ec.field_f[var23] = var9 - -(var15 * var25 + (var24 * var12 + var26 * var18) >> -10040400);
                                            fc.field_d[var23] = var10 - -(var25 * var16 + var24 * var13 + var19 * var26 >> -1882097328);
                                            jg.field_h[var23] = var11 - -(var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 244466000);
                                            var24 = param6.field_T[var23];
                                            var25 = param6.field_w[var23];
                                            var26 = param6.field_S[var23];
                                            kb.field_a[var23] = (var26 * var18 + var12 * var24 - -(var25 * var15) >> -509058384) + var9;
                                            cd.field_b[var23] = var10 + (var16 * var25 + var13 * var24 - -(var19 * var26) >> 1942215600);
                                            be.field_t[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 394422448) + var11;
                                            var24 = param6.field_g[var23];
                                            var25 = param6.field_v[var23];
                                            var26 = param6.field_R[var23];
                                            ke.field_h[var23] = var9 + (var18 * var26 + (var12 * var24 + var25 * var15) >> -1054127888);
                                            b.field_M[var23] = var10 - -(var19 * var26 + var13 * var24 + var25 * var16 >> -580391568);
                                            d.field_d[var23] = var11 - -(var26 * var20 + var17 * var25 + var14 * var24 >> -222955856);
                                            var23++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (!param4) {
                      break L2;
                    } else {
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
                      L5: while (true) {
                        stackIn_60_0 = var18;
                        stackIn_60_1 = param6.field_D;
                        if (stackIn_60_0 >= stackIn_60_1) {
                          break L2;
                        } else {
                          if (id.field_M.length <= var18) {
                            break L2;
                          } else {
                            var19 = param6.field_k[var18];
                            var20 = param6.field_u[var18];
                            var21 = param6.field_O[var18];
                            id.field_M[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> -1950371088;
                            bc.field_I[var18] = var16 * var21 + var10 * var19 - -(var20 * var13) >> 1478870704;
                            sf.field_C[var18] = var20 * var14 + var11 * var19 - -(var21 * var17) >> 862528240;
                            var18++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    var24 = param6.field_J[var23];
                    var25 = param6.field_o[var23];
                    var26 = param6.field_e[var23];
                    var27 = (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> -me.field_y + 16) + var9;
                    var28 = (var19 * var26 + (var24 * var13 + var16 * var25) >> 16 + -me.field_y) + var10;
                    var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> -1758160208);
                    stackIn_60_0 = -51;

                    stackIn_60_1 = var29 ^ -1;

                    L7: {
                      if (stackIn_60_0 < stackIn_60_1) {
                        vg.field_G[var23] = -2147483648;
                        break L7;
                      } else {
                        L8: {
                          kl.field_n[var23] = var27 / var29 + var21;
                          rn.field_b[var23] = var22 - -(var28 / var29);
                          if (var7_int > var29) {
                            var7_int = var29;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        vg.field_G[var23] = var29;
                        if (var29 > var8) {
                          var8 = var29;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L9: {
                      if (!param5) {
                        break L9;
                      } else {
                        dd.field_a[var23] = var27 >> me.field_y;
                        uk.field_z[var23] = var28 >> me.field_y;
                        vj.field_d[var23] = var29;
                        break L9;
                      }
                    }
                    var23++;
                    continue L1;
                  }
                }
                em.a(param6, param2, var8, (byte) 103, var7_int);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var7);

            stackIn_70_1 = new StringBuilder().append("on.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L10;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L11;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "null";
              break L12;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_79_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackIn_79_2 = "{...}";
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_71_0), stackIn_79_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
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
          L0: {
            L1: {
              L2: {
                if (param4.field_q) {
                  break L2;
                } else {
                  if (!param4.a(true)) {
                    stackIn_8_0 = 2188450;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_8_0 = 3249872;
              break L1;
            }
            var6_int = stackIn_8_0;
            if (param3 <= -60) {
              L3: {
                this.field_j.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_E + "</u>", param4.field_u + param1, param4.field_D + param2, param4.field_t, param4.field_y, var6_int, -1, this.field_b, this.field_f, this.field_j.field_K + this.field_j.field_R);
                if (!param4.a(true)) {
                  break L3;
                } else {
                  L4: {
                    var7 = this.field_j.a(param4.field_E);
                    var8 = this.field_j.field_K + this.field_j.field_R;
                    var9 = param4.field_u + param1;
                    if (2 == this.field_b) {
                      var9 = var9 + (-var7 + param4.field_t);
                      break L4;
                    } else {
                      if (-2 != (this.field_b ^ -1)) {
                        break L4;
                      } else {
                        var9 = var9 + (param4.field_t + -var7 >> -1342247295);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var10 = param2 + param4.field_D;
                    if ((this.field_f ^ -1) == -3) {
                      var10 = var10 + (param4.field_y + -var8);
                      break L5;
                    } else {
                      if (-2 != (this.field_f ^ -1)) {
                        break L5;
                      } else {
                        var10 = var10 + (param4.field_y - var8 >> -254285407);
                        break L5;
                      }
                    }
                  }
                  kd.a(4 + var7, -2 + var9, (byte) -96, var10 + 2, var8);
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var6);

            stackIn_28_1 = new StringBuilder().append("on.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            var3 = qc.field_Y - -((ac.field_B - qc.field_Y) * var2 / var1_int);
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_b = param1;
            this.field_j = param0;
            this.field_f = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("on.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static pi[] a(int param0, byte param1, int param2, ji param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        pi[] stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!gb.a(param2, param3, param0, 38)) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 37) {
                  break L1;
                } else {
                  on.b((byte) 98);
                  break L1;
                }
              }
              stackIn_9_0 = ci.b(-112);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("on.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (pi[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_9_0;
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
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 19264) {
              L1: {
                if (null == param0) {
                  break L1;
                } else {
                  var2_int = 0;
                  L2: while (true) {
                    if ((var2_int ^ -1) <= (param0.length ^ -1)) {
                      break L1;
                    } else {
                      param0[var2_int].b();
                      var2_int++;
                      continue L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("on.E(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
