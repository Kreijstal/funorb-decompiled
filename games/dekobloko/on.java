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
        Object stackIn_5_0 = null;
        nj stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 != null) {
              if (param1 > 7) {
                var2 = new nj(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, mb.field_d, tc.field_Nb);
                oa.a(126);
                stackOut_6_0 = (nj) var2;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (nj) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nj) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("on.A(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, int[] param1, boolean param2, int[] param3, boolean param4, boolean param5, vg param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var30 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            if (param0) {
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
              var12 = param3[5] * var23 + param3[3] * var21 - -(param3[4] * var22) >> 14;
              var15 = param3[6] * var21 - (-(param3[7] * var22) - var23 * param3[8]) >> 14;
              var18 = param3[11] * var23 + param3[10] * var22 + param3[9] * var21 >> 14;
              var19 = var26 * param3[11] + (param3[10] * var25 + var24 * param3[9]) >> 14;
              var14 = var29 * param3[5] + (param3[4] * var28 + param3[3] * var27) >> 14;
              var20 = param3[10] * var28 + (var27 * param3[9] + var29 * param3[11]) >> 14;
              var17 = param3[6] * var27 - -(var28 * param3[7]) + var29 * param3[8] >> 14;
              var16 = param3[7] * var25 + (var24 * param3[6] - -(var26 * param3[8])) >> 14;
              var21 = param3[0] - param1[0];
              var22 = -param1[1] + param3[1];
              var23 = -param1[2] + param3[2];
              var9 = var21 * param1[3] - (-(param1[4] * var22) - param1[5] * var23) >> -me.field_y + 16;
              var10 = param1[6] * var21 - -(param1[7] * var22) + var23 * param1[8] >> 16 + -me.field_y;
              var11 = var23 * param1[11] + param1[10] * var22 + var21 * param1[9] >> 16;
              var21 = qg.field_g;
              var22 = qg.field_c;
              var23 = 0;
              L1: while (true) {
                if (~var23 <= ~param6.field_l) {
                  L2: {
                    if (null == param6.field_q) {
                      break L2;
                    } else {
                      if (param6.field_K == null) {
                        break L2;
                      } else {
                        if (param6.field_m == null) {
                          break L2;
                        } else {
                          if (param6.field_T == null) {
                            break L2;
                          } else {
                            if (null == param6.field_w) {
                              break L2;
                            } else {
                              if (param6.field_S == null) {
                                break L2;
                              } else {
                                if (param6.field_g == null) {
                                  break L2;
                                } else {
                                  if (param6.field_v == null) {
                                    break L2;
                                  } else {
                                    if (param6.field_R != null) {
                                      var23 = 0;
                                      L3: while (true) {
                                        if (~var23 <= ~param6.field_L) {
                                          break L2;
                                        } else {
                                          var24 = param6.field_q[var23];
                                          var25 = param6.field_K[var23];
                                          var26 = param6.field_m[var23];
                                          ec.field_f[var23] = var9 - -(var15 * var25 + (var24 * var12 + var26 * var18) >> 16);
                                          fc.field_d[var23] = var10 - -(var25 * var16 + var24 * var13 + var19 * var26 >> 16);
                                          jg.field_h[var23] = var11 - -(var17 * var25 + (var24 * var14 - -(var20 * var26)) >> 16);
                                          var24 = param6.field_T[var23];
                                          var25 = param6.field_w[var23];
                                          var26 = param6.field_S[var23];
                                          kb.field_a[var23] = (var26 * var18 + var12 * var24 - -(var25 * var15) >> 16) + var9;
                                          cd.field_b[var23] = var10 + (var16 * var25 + var13 * var24 - -(var19 * var26) >> 16);
                                          be.field_t[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 16) + var11;
                                          var24 = param6.field_g[var23];
                                          var25 = param6.field_v[var23];
                                          var26 = param6.field_R[var23];
                                          ke.field_h[var23] = var9 + (var18 * var26 + (var12 * var24 + var25 * var15) >> 16);
                                          b.field_M[var23] = var10 - -(var19 * var26 + var13 * var24 + var25 * var16 >> 16);
                                          d.field_d[var23] = var11 - -(var26 * var20 + var17 * var25 + var14 * var24 >> 16);
                                          var23++;
                                          continue L3;
                                        }
                                      }
                                    } else {
                                      break L2;
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
                  L4: {
                    if (!param4) {
                      break L4;
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
                        if (var18 >= param6.field_D) {
                          break L4;
                        } else {
                          if (id.field_M.length <= var18) {
                            break L4;
                          } else {
                            var19 = param6.field_k[var18];
                            var20 = param6.field_u[var18];
                            var21 = param6.field_O[var18];
                            id.field_M[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> 16;
                            bc.field_I[var18] = var16 * var21 + var10 * var19 - -(var20 * var13) >> 16;
                            sf.field_C[var18] = var20 * var14 + var11 * var19 - -(var21 * var17) >> 16;
                            var18++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  em.a(param6, param2, var8, (byte) 103, var7_int);
                  break L0;
                } else {
                  L6: {
                    var24 = param6.field_J[var23];
                    var25 = param6.field_o[var23];
                    var26 = param6.field_e[var23];
                    var27 = (var25 * var15 + (var24 * var12 - -(var26 * var18)) >> -me.field_y + 16) + var9;
                    var28 = (var19 * var26 + (var24 * var13 + var16 * var25) >> 16 + -me.field_y) + var10;
                    var29 = var11 + (var20 * var26 + var14 * var24 + var17 * var25 >> 16);
                    if (var29 < 50) {
                      vg.field_G[var23] = -2147483648;
                      break L6;
                    } else {
                      L7: {
                        kl.field_n[var23] = var27 / var29 + var21;
                        rn.field_b[var23] = var22 - -(var28 / var29);
                        if (var7_int > var29) {
                          var7_int = var29;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      vg.field_G[var23] = var29;
                      if (var29 > var8) {
                        var8 = var29;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L8: {
                    if (!param5) {
                      break L8;
                    } else {
                      dd.field_a[var23] = var27 >> me.field_y;
                      uk.field_z[var23] = var28 >> me.field_y;
                      vj.field_d[var23] = var29;
                      break L8;
                    }
                  }
                  var23++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("on.G(").append(param0).append(44);
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L9;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L9;
            }
          }
          L10: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44).append(param2).append(44);
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L10;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L10;
            }
          }
          L11: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L11;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L11;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param4.field_q) {
                  break L2;
                } else {
                  if (!param4.a(true)) {
                    stackOut_7_0 = 2188450;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_5_0 = 3249872;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
            var6_int = stackIn_8_0;
            if (param3 <= -60) {
              L3: {
                int discarded$1 = ((on) this).field_j.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_E + "</u>", param4.field_u + param1, param4.field_D + param2, param4.field_t, param4.field_y, var6_int, -1, ((on) this).field_b, ((on) this).field_f, ((on) this).field_j.field_K + ((on) this).field_j.field_R);
                if (!param4.a(true)) {
                  break L3;
                } else {
                  L4: {
                    var7 = ((on) this).field_j.a(param4.field_E);
                    var8 = ((on) this).field_j.field_K + ((on) this).field_j.field_R;
                    var9 = param4.field_u + param1;
                    if (2 == ((on) this).field_b) {
                      var9 = var9 + (-var7 + param4.field_t);
                      break L4;
                    } else {
                      if (((on) this).field_b != 1) {
                        break L4;
                      } else {
                        var9 = var9 + (param4.field_t + -var7 >> 1);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var10 = param2 + param4.field_D;
                    if (((on) this).field_f == 2) {
                      var10 = var10 + (param4.field_y + -var8);
                      break L5;
                    } else {
                      if (((on) this).field_f != 1) {
                        break L5;
                      } else {
                        var10 = var10 + (param4.field_y - var8 >> 1);
                        break L5;
                      }
                    }
                  }
                  kd.a(4 + var7, -2 + var9, (byte) -96, var10 + 2, var8);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6;
            stackOut_25_1 = new StringBuilder().append("on.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
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
            throw dh.a((Throwable) (Object) runtimeException, "on.C(" + param0 + 41);
        }
    }

    public on() {
        try {
            ((on) this).field_j = hh.field_e;
            ((on) this).field_f = 1;
            ((on) this).field_b = 1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "on.<init>()");
        }
    }

    on(mm param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((on) this).field_b = param1;
            ((on) this).field_j = param0;
            ((on) this).field_f = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("on.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static pi[] a(int param0, byte param1, int param2, ji param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        pi[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        pi[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!gb.a(param2, param3, param0, 38)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (pi[]) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param1 == 37) {
                  break L1;
                } else {
                  on.b((byte) 98);
                  break L1;
                }
              }
              stackOut_8_0 = ci.b(-112);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("on.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_9_0;
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
            throw dh.a((Throwable) (Object) runtimeException, "on.D(" + param0 + 41);
        }
    }

    final static void a(ck[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                    if (~var2_int <= ~param0.length) {
                      break L1;
                    } else {
                      param0[var2_int].b();
                      var2_int++;
                      continue L2;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("on.E(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "No options available";
        field_h = "<%0> AT ONCE";
        field_g = new int[]{200, 100, 200, 300, 200, 1000, 200, 1000, 300, 500, 500, 100, 100, 200, 500, 200, 300, 1000, 100, 200, 500, 300, 500, 500, 100, 100, 100, 100, 200, 200, 300};
        field_c = "Return to Options Menu";
        field_a = "Special Item Bonus: ";
    }
}
