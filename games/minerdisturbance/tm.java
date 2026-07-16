/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends pi {
    private int field_F;
    private int field_y;
    private int field_n;
    private int field_H;
    static int field_v;
    private int field_A;
    private int field_z;
    private String[] field_t;
    private int field_r;
    private int field_C;
    private int field_J;
    private int field_o;
    private int field_p;
    private int field_w;
    private int field_E;
    int field_s;
    static byte[][] field_u;
    private int field_D;
    private int field_q;
    static int field_I;
    private int field_G;
    private boolean field_B;
    private float field_x;

    public static void a(byte param0) {
        try {
            field_u = null;
            if (param0 >= -60) {
                field_I = 32;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tm.F(" + param0 + 41);
        }
    }

    final boolean a(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                ((tm) this).field_B = true;
                break L1;
              }
            }
            L2: {
              if (1.0f > ((tm) this).field_x) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "tm.A(" + param0 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final void a(boolean param0) {
        try {
            ((tm) this).field_p = db.field_d;
            ((tm) this).field_E = li.field_c;
            if (param0) {
                ((tm) this).field_A = -66;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "tm.E(" + param0 + 41);
        }
    }

    final static void a(pb param0, int param1, int[] param2, int[] param3, boolean param4, boolean param5, boolean param6) {
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
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var30 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param2[3] >> -1438759454;
              var22 = param2[4] >> -2123204094;
              var23 = param2[5] >> -1260355742;
              var24 = param2[6] >> 1488546242;
              var25 = param2[7] >> 1260932258;
              var26 = param2[8] >> -1178665982;
              var27 = param2[9] >> -820210558;
              var28 = param2[10] >> 654968706;
              var13 = var26 * param3[5] + (var24 * param3[3] + param3[4] * var25) >> 1072901006;
              var12 = param3[3] * var21 + (param3[4] * var22 + param3[5] * var23) >> -520637138;
              var29 = param2[11] >> -136854494;
              var17 = param3[6] * var27 + param3[7] * var28 + var29 * param3[8] >> -1198368530;
              var18 = var23 * param3[11] + (var21 * param3[9] + param3[10] * var22) >> 349265294;
              var19 = var24 * param3[9] - (-(var25 * param3[10]) - param3[11] * var26) >> 668381006;
              var15 = param3[7] * var22 + param3[6] * var21 - -(param3[8] * var23) >> -1539282514;
              var20 = var29 * param3[11] + var27 * param3[9] + param3[10] * var28 >> 1382583758;
              var14 = param3[3] * var27 + var28 * param3[4] + param3[5] * var29 >> 761327406;
              var16 = var26 * param3[8] + (param3[6] * var24 + var25 * param3[7]) >> 745049038;
              var21 = -param2[0] + param3[0];
              var22 = param3[1] - param2[1];
              var23 = param3[2] - param2[2];
              var9 = var23 * param2[5] + (var22 * param2[4] + param2[3] * var21) >> -ml.field_d + 16;
              var11 = param2[10] * var22 + var21 * param2[9] + var23 * param2[11] >> -145897456;
              var10 = var22 * param2[7] + var21 * param2[6] - -(param2[8] * var23) >> -ml.field_d + 16;
              var21 = dj.field_d;
              var22 = dj.field_c;
              if (param1 == -363953584) {
                break L1;
              } else {
                field_I = 80;
                break L1;
              }
            }
            var23 = 0;
            L2: while (true) {
              if ((param0.field_y ^ -1) >= (var23 ^ -1)) {
                L3: {
                  if (param0.field_b == null) {
                    break L3;
                  } else {
                    if (null == param0.field_D) {
                      break L3;
                    } else {
                      if (null == param0.field_o) {
                        break L3;
                      } else {
                        if (null == param0.field_p) {
                          break L3;
                        } else {
                          if (null == param0.field_N) {
                            break L3;
                          } else {
                            if (null == param0.field_S) {
                              break L3;
                            } else {
                              if (param0.field_m == null) {
                                break L3;
                              } else {
                                if (null == param0.field_L) {
                                  break L3;
                                } else {
                                  if (param0.field_k != null) {
                                    var23 = 0;
                                    L4: while (true) {
                                      if ((var23 ^ -1) <= (param0.field_I ^ -1)) {
                                        break L3;
                                      } else {
                                        var24 = param0.field_b[var23];
                                        var25 = param0.field_D[var23];
                                        var26 = param0.field_o[var23];
                                        sd.field_g[var23] = var9 - -(var25 * var15 + var24 * var12 + var18 * var26 >> -1613428336);
                                        kk.field_c[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> -585034512) + var10;
                                        mj.field_n[var23] = (var24 * var14 + (var17 * var25 - -(var20 * var26)) >> -410258832) + var11;
                                        var24 = param0.field_p[var23];
                                        var25 = param0.field_N[var23];
                                        var26 = param0.field_S[var23];
                                        bl.field_z[var23] = (var24 * var12 + (var25 * var15 + var18 * var26) >> 1183260560) + var9;
                                        jc.field_F[var23] = var10 + (var13 * var24 + var25 * var16 - -(var19 * var26) >> 591515536);
                                        id.field_b[var23] = var11 + (var14 * var24 + var17 * var25 + var20 * var26 >> 1079038224);
                                        var24 = param0.field_m[var23];
                                        var25 = param0.field_L[var23];
                                        var26 = param0.field_k[var23];
                                        qg.field_n[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> -226410736);
                                        pk.field_f[var23] = (var25 * var16 + var13 * var24 + var26 * var19 >> -363953584) + var10;
                                        wc.field_a[var23] = (var20 * var26 + var25 * var17 + var24 * var14 >> -34052304) + var11;
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
                L5: {
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
                    L6: while (true) {
                      if (var18 >= param0.field_g) {
                        break L5;
                      } else {
                        stackOut_58_0 = fb.field_b.length;
                        stackOut_58_1 = var18;
                        stackIn_60_0 = stackOut_58_0;
                        stackIn_60_1 = stackOut_58_1;
                        if (stackIn_60_0 <= stackIn_60_1) {
                          break L5;
                        } else {
                          var19 = param0.field_C[var18];
                          var20 = param0.field_q[var18];
                          var21 = param0.field_B[var18];
                          fb.field_b[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> -1577322032;
                          sf.field_a[var18] = var10 * var19 + (var20 * var13 + var16 * var21) >> 315659824;
                          h.field_a[var18] = var17 * var21 + (var14 * var20 + var19 * var11) >> -254115120;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                ri.a(param6, var7_int, var8, param0, 0);
                break L0;
              } else {
                L7: {
                  var24 = param0.field_n[var23];
                  var25 = param0.field_M[var23];
                  var26 = param0.field_Q[var23];
                  var27 = var9 + (var26 * var18 + var24 * var12 + var25 * var15 >> 16 - ml.field_d);
                  var28 = var10 - -(var19 * var26 + var24 * var13 - -(var25 * var16) >> 16 - ml.field_d);
                  var29 = (var17 * var25 + var14 * var24 + var20 * var26 >> -563390512) + var11;
                  if (var29 < 50) {
                    oc.field_l[var23] = -2147483648;
                    break L7;
                  } else {
                    L8: {
                      wa.field_d[var23] = var27 / var29 + var21;
                      ti.field_O[var23] = var28 / var29 + var22;
                      if (var29 <= var8) {
                        break L8;
                      } else {
                        var8 = var29;
                        break L8;
                      }
                    }
                    oc.field_l[var23] = var29;
                    if ((var29 ^ -1) <= (var7_int ^ -1)) {
                      break L7;
                    } else {
                      var7_int = var29;
                      break L7;
                    }
                  }
                }
                L9: {
                  if (!param5) {
                    break L9;
                  } else {
                    kk.field_b[var23] = var27 >> ml.field_d;
                    dm.field_d[var23] = var28 >> ml.field_d;
                    nf.field_d[var23] = var29;
                    break L9;
                  }
                }
                var23++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("tm.D(");
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L10;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L10;
            }
          }
          L11: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(44).append(param1).append(44);
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L11;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L11;
            }
          }
          L12: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44);
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L12;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L12;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final boolean e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 3) {
              L1: {
                L2: {
                  L3: {
                    var2_int = -li.field_c + ((tm) this).field_E;
                    var3 = -db.field_d + ((tm) this).field_p;
                    var4 = var2_int + ((tm) this).field_z;
                    var5 = ((tm) this).field_C + var3;
                    if ((((tm) this).field_q ^ -1) <= -1) {
                      break L3;
                    } else {
                      if (!((tm) this).field_B) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (((tm) this).field_x < 1.0f) {
                      break L4;
                    } else {
                      if (404 < (var4 ^ -1)) {
                        break L2;
                      } else {
                        if ((var4 ^ -1) < -641) {
                          break L2;
                        } else {
                          if (var5 > 480) {
                            break L2;
                          } else {
                            if (var5 >= -40 + -((tm) this).field_A) {
                              break L4;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L1;
                }
                stackOut_22_0 = 1;
                stackIn_25_0 = stackOut_22_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "tm.C(" + param0 + 41);
        }
        return stackIn_25_0 != 0;
    }

    final void a(boolean param0, byte param1) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_float = 1.0f - ((tm) this).field_x;
              var4 = var3_float * var3_float;
              ((tm) this).field_z = (int)(0.5f + (((tm) this).field_x * 2.0f * var3_float * (float)((tm) this).field_w + var4 * (float)((tm) this).field_y + ((tm) this).field_x * ((tm) this).field_x * (float)((tm) this).field_o));
              ((tm) this).field_C = (int)(0.5f + ((float)((tm) this).field_r * (((tm) this).field_x * ((tm) this).field_x) + (var4 * (float)((tm) this).field_H + (float)((tm) this).field_n * (((tm) this).field_x * 2.0f * var3_float))));
              ((tm) this).field_x = ((tm) this).field_x + 0.019999999552965164f;
              ((tm) this).field_G = ((tm) this).field_G + ((tm) this).field_F;
              if (param1 >= 21) {
                break L1;
              } else {
                tm.a((pb) null, 112, (int[]) null, (int[]) null, true, false, true);
                break L1;
              }
            }
            L2: {
              ((tm) this).field_q = ((tm) this).field_q - 1;
              if (1.0f >= ((tm) this).field_x) {
                break L2;
              } else {
                ((tm) this).field_x = 1.0f;
                break L2;
              }
            }
            L3: {
              if (1 > ((tm) this).field_G) {
                ((tm) this).field_F = 10;
                ((tm) this).field_G = 0;
                break L3;
              } else {
                if (((tm) this).field_G >= 255) {
                  ((tm) this).field_F = -10;
                  ((tm) this).field_G = 255;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "tm.B(" + param0 + 44 + param1 + 41);
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        var28 = MinerDisturbance.field_ab;
        if (d.field_b) {
          L0: {
            var2_int = ce.field_d.field_I + (ce.field_d.field_E - 2);
            if (-471 > (350 + ((tm) this).field_A ^ -1)) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 <= (((tm) this).field_D ^ -1)) {
              break L1;
            } else {
              if ((((tm) this).field_J ^ -1) >= -1) {
                break L1;
              } else {
                ef.field_b[3].a(-li.field_c + (((tm) this).field_D + -ef.field_b[3].field_x), (ef.field_b[3].field_A >> 1179547202) + (((tm) this).field_J - db.field_d), ((tm) this).field_G ^ -1 | ((tm) this).field_G << 1972890860);
                break L1;
              }
            }
          }
          L2: {
            L3: {
              var3 = -li.field_c + ((tm) this).field_E;
              var4 = -db.field_d + ((tm) this).field_p;
              var5 = ca.field_k * 32 + -li.field_c + sk.field_d / 10;
              var6 = -db.field_d + 32 * hf.field_t - -(mf.field_i / 10);
              var7 = 360;
              if ((var5 ^ -1) >= (-96 + (((tm) this).field_z - -var3) - 32 ^ -1)) {
                break L3;
              } else {
                if ((45 + (((tm) this).field_z - -var3 - (-var7 - 96)) ^ -1) >= (var5 ^ -1)) {
                  break L3;
                } else {
                  if (var6 <= -128 + (var4 + ((tm) this).field_C)) {
                    break L3;
                  } else {
                    if (40 + ((tm) this).field_A + (((tm) this).field_C - -var4 + 96) <= var6) {
                      break L3;
                    } else {
                      L4: {
                        if (!((tm) this).field_B) {
                          break L4;
                        } else {
                          if (((tm) this).field_x >= 1.0f) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_18_0 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L2;
          }
          L5: {
            var8 = stackIn_20_0;
            if (var8 != 0) {
              L6: {
                var9 = 0;
                var10 = a.field_a[0].field_x >> 671904225;
                var11 = a.field_a[0].field_A >> 1802860673;
                var12 = var10 + var5 + 96;
                var13 = var11 + var6 + 96;
                var14 = var11 + var6 + -96;
                var15 = var10 + var5 - 96;
                var16 = 0;
                if (-1 >= (var15 ^ -1)) {
                  break L6;
                } else {
                  var16 = var15 * -1;
                  var15 = 0;
                  break L6;
                }
              }
              L7: {
                var17 = 0;
                if (var14 >= 0) {
                  break L7;
                } else {
                  var14 = 0;
                  break L7;
                }
              }
              L8: {
                if (eh.field_g + -1 < var12) {
                  var17 = var12 - -1 - eh.field_g;
                  var12 = -1 + eh.field_g;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var14 <= -1 + eh.field_c) {
                  break L9;
                } else {
                  var14 = eh.field_c - 1;
                  break L9;
                }
              }
              L10: while (true) {
                if ((var14 ^ -1) <= (var13 ^ -1)) {
                  break L5;
                } else {
                  var9 = var9 + var16;
                  var18 = var15;
                  L11: while (true) {
                    if (var18 >= var12) {
                      var9 = var9 + var17;
                      var14++;
                      continue L10;
                    } else {
                      int incrementValue$3 = var9;
                      var9++;
                      m.field_j[incrementValue$3] = eh.field_f[var14 * eh.field_g + var18];
                      var18++;
                      continue L11;
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
          L12: {
            if (!((tm) this).field_B) {
              g.a(var4 + ((tm) this).field_C, 60 + ((tm) this).field_A, var3 + ((tm) this).field_z, var7 + 60, (byte) 93, hd.field_d);
              break L12;
            } else {
              L13: {
                var9 = var7 - -60;
                var9 = var9 - (ah.field_c[2].field_x + ah.field_c[0].field_x);
                var10 = ((tm) this).field_A + 60;
                var9 = var9 / ah.field_c[1].field_x * ah.field_c[1].field_x;
                var9 = var9 + (ah.field_c[2].field_x + ah.field_c[0].field_x);
                var10 = var10 - (ah.field_c[0].field_A - -ah.field_c[6].field_A);
                var10 = (var10 / ah.field_c[3].field_A + 1) * ah.field_c[3].field_A;
                if ((var7 - -60 ^ -1) < (var9 ^ -1)) {
                  var9 = var9 + ah.field_c[1].field_x;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var10 = var10 + (ah.field_c[0].field_A + ah.field_c[6].field_A);
                if (((tm) this).field_A + 60 > var10) {
                  var10 = var10 + ah.field_c[1].field_A;
                  break L14;
                } else {
                  break L14;
                }
              }
              var11 = 60 + var7 - var9;
              var12 = -var10 + 60 + ((tm) this).field_A;
              g.a(((tm) this).field_C + var4 - -(var12 / 2), var10, var3 + (((tm) this).field_z + var11 / 2), var9, (byte) 31, ah.field_c);
              break L12;
            }
          }
          L15: {
            var9 = 0;
            var10 = 30 + ((tm) this).field_z + var3;
            var11 = var4 + (40 + ((tm) this).field_C);
            var12 = 0;
            if (!((tm) this).field_B) {
              break L15;
            } else {
              var12 = mm.field_a.field_I - -mm.field_a.field_E;
              mm.field_a.a(oe.field_f, var10, var11, 1, 8063303);
              break L15;
            }
          }
          var13 = 0;
          if (param0 == 94) {
            L16: while (true) {
              if ((((tm) this).field_t.length ^ -1) >= (var13 ^ -1)) {
                L17: {
                  var13 = 0;
                  if (-4 != (((tm) this).field_s ^ -1)) {
                    if (((tm) this).field_s != 9) {
                      if (-3 == (((tm) this).field_s ^ -1)) {
                        fl.field_j[8].c(var10, var11);
                        var13 = fl.field_j[8].field_j;
                        break L17;
                      } else {
                        L18: {
                          if (0 == ((tm) this).field_s) {
                            break L18;
                          } else {
                            if (16 != ((tm) this).field_s) {
                              if (((tm) this).field_s != 13) {
                                break L17;
                              } else {
                                fl.field_j[9].c(var10, 15 + var11);
                                var13 = fl.field_j[9].field_j;
                                break L17;
                              }
                            } else {
                              break L18;
                            }
                          }
                        }
                        fl.field_j[5].c(var10, var11 + 20);
                        var13 = fl.field_j[5].field_j;
                        break L17;
                      }
                    } else {
                      fl.field_j[3].c(var10, 35 + var11);
                      var13 = fl.field_j[3].field_j;
                      break L17;
                    }
                  } else {
                    fl.field_j[7].c(var10, var11 + 35);
                    break L17;
                  }
                }
                L19: {
                  if (!((tm) this).field_B) {
                    ce.field_d.a(aj.field_a, var10, var12 + (var11 - -(var2_int * (var9 - -1))), 1, -1);
                    ce.field_d.c(qe.field_d, -15 + (var10 - -var7 + var13), var11 - (-(var2_int * (var9 - -1)) + -var12), 1, -1);
                    ce.field_d.c(Integer.toString(((tm) this).field_q / 100), var13 + (var7 + var10), var11 - (-(var2_int * (1 + var9)) - var12), 1, -1);
                    break L19;
                  } else {
                    ce.field_d.a(ni.field_b, var10, (1 + var9) * var2_int + var11 - -var12, 1, -1);
                    break L19;
                  }
                }
                L20: {
                  if (var8 == 0) {
                    break L20;
                  } else {
                    L21: {
                      var14 = 0;
                      var15 = a.field_a[0].field_x >> 675825793;
                      var16 = a.field_a[0].field_A >> 1248886913;
                      var17 = var15 + (var5 + 96);
                      var18 = var16 + (var6 + 96);
                      var19 = var16 + (-96 + var6);
                      var20 = var15 + var5 - 96;
                      var21 = 0;
                      if (-1 >= (var20 ^ -1)) {
                        break L21;
                      } else {
                        var21 = var20 * -1;
                        var20 = 0;
                        break L21;
                      }
                    }
                    L22: {
                      var22 = 0;
                      if (-1 + eh.field_g >= var17) {
                        break L22;
                      } else {
                        var22 = -eh.field_g - -1 + var17;
                        var17 = -1 + eh.field_g;
                        break L22;
                      }
                    }
                    L23: {
                      if (0 > var19) {
                        var19 = 0;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (eh.field_c - 1 >= var19) {
                        break L24;
                      } else {
                        var19 = -1 + eh.field_c;
                        break L24;
                      }
                    }
                    L25: while (true) {
                      if (var19 >= var18) {
                        break L20;
                      } else {
                        var14 = var14 + var21;
                        var23 = var20;
                        L26: while (true) {
                          if (var17 <= var23) {
                            var14 = var14 + var22;
                            var19++;
                            continue L25;
                          } else {
                            var24 = ec.field_b[var14];
                            var25 = -var24 + 256;
                            var26 = eh.field_f[eh.field_g * var19 - -var23];
                            int incrementValue$4 = var14;
                            var14++;
                            var27 = m.field_j[incrementValue$4];
                            eh.field_f[var23 + eh.field_g * var19] = c.a(16711680, var24 * c.a(var27, 65280) - -(c.a(var26, 65280) * var25)) + c.a(-16711936, var25 * c.a(var26, 16711935) + c.a(var27, 16711935) * var24) >> 1964181640;
                            var23++;
                            continue L26;
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                L27: {
                  L28: {
                    L29: {
                      if (3 != ((tm) this).field_s) {
                        break L29;
                      } else {
                        if (1 >= var13) {
                          break L29;
                        } else {
                          if (5 > var13) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    if (16 == ((tm) this).field_s) {
                      break L28;
                    } else {
                      if ((((tm) this).field_s ^ -1) == -14) {
                        break L28;
                      } else {
                        if ((((tm) this).field_s ^ -1) == -1) {
                          break L28;
                        } else {
                          if (2 == ((tm) this).field_s) {
                            break L28;
                          } else {
                            if ((((tm) this).field_s ^ -1) != -10) {
                              var7 = 360;
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                  }
                  var7 = 313;
                  break L27;
                }
                int discarded$5 = ce.field_d.a(((tm) this).field_t[var13], -var7 + 360 + var10, var12 + var9 * var2_int + var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var2_int);
                var9 = var9 + ce.field_d.a(((tm) this).field_t[var13], var7);
                var13++;
                continue L16;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    tm(int param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (e.field_i[param0].length != 1) {
                ((tm) this).field_t = e.field_i[param0][cm.field_o];
                break L1;
              } else {
                ((tm) this).field_t = e.field_i[param0][0];
                break L1;
              }
            }
            if (null != ((tm) this).field_t) {
              L2: {
                L3: {
                  ((tm) this).field_J = param2;
                  ((tm) this).field_q = 2000;
                  ((tm) this).field_x = 0.0f;
                  ((tm) this).field_s = param0;
                  ((tm) this).field_D = param1;
                  ((tm) this).field_B = param3;
                  var5_int = ce.field_d.field_I + (ce.field_d.field_E + -2);
                  var6 = 360;
                  if (-10 == (((tm) this).field_s ^ -1)) {
                    break L3;
                  } else {
                    if (((tm) this).field_s == 2) {
                      break L3;
                    } else {
                      if (-1 == (((tm) this).field_s ^ -1)) {
                        break L3;
                      } else {
                        if (((tm) this).field_s == 16) {
                          break L3;
                        } else {
                          if (((tm) this).field_s != 13) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = 313;
                break L2;
              }
              var7 = 0;
              L4: while (true) {
                if (var7 >= ((tm) this).field_t.length) {
                  L5: {
                    ((tm) this).field_A = ((tm) this).field_A + ce.field_d.a(uf.field_v, var6);
                    ((tm) this).field_A = ((tm) this).field_A * var5_int;
                    ((tm) this).field_A = ((tm) this).field_A + 10;
                    if (((tm) this).field_B) {
                      ((tm) this).field_A = ((tm) this).field_A + (mm.field_a.field_E + mm.field_a.field_I);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var7 = 380;
                    if (0 < param1) {
                      param1 = param1 - li.field_c;
                      break L6;
                    } else {
                      param1 = 320;
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      var8 = 20 + ((tm) this).field_A;
                      var9 = -var8 + (-64 + 32 * hf.field_t) - db.field_d;
                      ((tm) this).field_o = 32 * ca.field_k - li.field_c + -180;
                      if ((db.field_d + var9 ^ -1) > -33) {
                        break L8;
                      } else {
                        if (((tm) this).field_B) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 = 64 + (32 * hf.field_t + -db.field_d);
                    break L7;
                  }
                  L9: {
                    ((tm) this).field_z = -var7;
                    ((tm) this).field_C = 480 + var8;
                    if (-1 >= (((tm) this).field_o ^ -1)) {
                      if ((((tm) this).field_o ^ -1) >= (1024 + -li.field_c - 405 ^ -1)) {
                        break L9;
                      } else {
                        ((tm) this).field_o = -li.field_c + 555;
                        break L9;
                      }
                    } else {
                      ((tm) this).field_o = 64;
                      break L9;
                    }
                  }
                  ((tm) this).field_H = ((tm) this).field_C;
                  ((tm) this).field_y = ((tm) this).field_z;
                  ((tm) this).field_r = var9;
                  ((tm) this).field_w = 180 + (((tm) this).field_r + ((tm) this).field_z);
                  ((tm) this).field_E = li.field_c;
                  ((tm) this).field_p = db.field_d;
                  ((tm) this).field_n = ((tm) this).field_C - -((tm) this).field_o + ((tm) this).field_A / 2;
                  break L0;
                } else {
                  L10: {
                    if (((tm) this).field_s != 3) {
                      break L10;
                    } else {
                      if ((var7 ^ -1) >= -2) {
                        break L10;
                      } else {
                        var6 = 320;
                        break L10;
                      }
                    }
                  }
                  ((tm) this).field_A = ((tm) this).field_A + ce.field_d.a(((tm) this).field_t[var7], var6);
                  var7++;
                  continue L4;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var5, "tm.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new byte[250][];
    }
}
