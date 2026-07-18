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
            throw lj.a((Throwable) (Object) runtimeException, "tm.F(" + param0 + ')');
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
          throw lj.a((Throwable) (Object) var2, "tm.A(" + param0 + ')');
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
            throw lj.a((Throwable) (Object) runtimeException, "tm.E(" + param0 + ')');
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
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_60_0 = 0;
        short stackOut_60_1 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_69_1 = 0;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var30 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param2[3] >> 2;
              var22 = param2[4] >> 2;
              var23 = param2[5] >> 2;
              var24 = param2[6] >> 2;
              var25 = param2[7] >> 2;
              var26 = param2[8] >> 2;
              var27 = param2[9] >> 2;
              var28 = param2[10] >> 2;
              var13 = var26 * param3[5] + (var24 * param3[3] + param3[4] * var25) >> 14;
              var12 = param3[3] * var21 + (param3[4] * var22 + param3[5] * var23) >> 14;
              var29 = param2[11] >> 2;
              var17 = param3[6] * var27 + param3[7] * var28 + var29 * param3[8] >> 14;
              var18 = var23 * param3[11] + (var21 * param3[9] + param3[10] * var22) >> 14;
              var19 = var24 * param3[9] - (-(var25 * param3[10]) - param3[11] * var26) >> 14;
              var15 = param3[7] * var22 + param3[6] * var21 - -(param3[8] * var23) >> 14;
              var20 = var29 * param3[11] + var27 * param3[9] + param3[10] * var28 >> 14;
              var14 = param3[3] * var27 + var28 * param3[4] + param3[5] * var29 >> 14;
              var16 = var26 * param3[8] + (param3[6] * var24 + var25 * param3[7]) >> 14;
              var21 = -param2[0] + param3[0];
              var22 = param3[1] - param2[1];
              var23 = param3[2] - param2[2];
              var9 = var23 * param2[5] + (var22 * param2[4] + param2[3] * var21) >> -ml.field_d + 16;
              var11 = param2[10] * var22 + var21 * param2[9] + var23 * param2[11] >> 16;
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
              L3: {
                L4: {
                  L5: {
                    if (~param0.field_y >= ~var23) {
                      break L5;
                    } else {
                      var24 = param0.field_n[var23];
                      var25 = param0.field_M[var23];
                      var26 = param0.field_Q[var23];
                      var27 = var9 + (var26 * var18 + var24 * var12 + var25 * var15 >> 16 - ml.field_d);
                      var28 = var10 - -(var19 * var26 + var24 * var13 - -(var25 * var16) >> 16 - ml.field_d);
                      var29 = (var17 * var25 + var14 * var24 + var20 * var26 >> 16) + var11;
                      stackOut_6_0 = var29;
                      stackOut_6_1 = 50;
                      stackIn_61_0 = stackOut_6_0;
                      stackIn_61_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var30 != 0) {
                        L6: while (true) {
                          if (stackIn_61_0 >= stackIn_61_1) {
                            break L4;
                          } else {
                            stackOut_62_0 = fb.field_b.length;
                            stackOut_62_1 = var18;
                            stackIn_70_0 = stackOut_62_0;
                            stackIn_70_1 = stackOut_62_1;
                            stackIn_63_0 = stackOut_62_0;
                            stackIn_63_1 = stackOut_62_1;
                            if (var30 != 0) {
                              break L3;
                            } else {
                              stackOut_63_0 = stackIn_63_0;
                              stackOut_63_1 = stackIn_63_1;
                              stackIn_65_0 = stackOut_63_0;
                              stackIn_65_1 = stackOut_63_1;
                              if (stackIn_65_0 <= stackIn_65_1) {
                                break L4;
                              } else {
                                var19 = param0.field_C[var18];
                                var20 = param0.field_q[var18];
                                var21 = param0.field_B[var18];
                                fb.field_b[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> 16;
                                sf.field_a[var18] = var10 * var19 + (var20 * var13 + var16 * var21) >> 16;
                                h.field_a[var18] = var17 * var21 + (var14 * var20 + var19 * var11) >> 16;
                                var18++;
                                if (var30 == 0) {
                                  stackOut_60_0 = var18;
                                  stackOut_60_1 = param0.field_g;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L7: {
                          L8: {
                            if (stackIn_7_0 < stackIn_7_1) {
                              break L8;
                            } else {
                              L9: {
                                wa.field_d[var23] = var27 / var29 + var21;
                                ti.field_O[var23] = var28 / var29 + var22;
                                if (var29 <= var8) {
                                  break L9;
                                } else {
                                  var8 = var29;
                                  break L9;
                                }
                              }
                              oc.field_l[var23] = var29;
                              if (~var29 <= ~var7_int) {
                                break L7;
                              } else {
                                var7_int = var29;
                                if (var30 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          oc.field_l[var23] = -2147483648;
                          break L7;
                        }
                        L10: {
                          if (!param5) {
                            break L10;
                          } else {
                            kk.field_b[var23] = var27 >> ml.field_d;
                            dm.field_d[var23] = var28 >> ml.field_d;
                            nf.field_d[var23] = var29;
                            break L10;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (param0.field_b == null) {
                        break L12;
                      } else {
                        if (null == param0.field_D) {
                          break L12;
                        } else {
                          if (null == param0.field_o) {
                            break L12;
                          } else {
                            if (null == param0.field_p) {
                              break L12;
                            } else {
                              if (null == param0.field_N) {
                                break L12;
                              } else {
                                if (null == param0.field_S) {
                                  break L12;
                                } else {
                                  if (param0.field_m == null) {
                                    break L12;
                                  } else {
                                    if (null == param0.field_L) {
                                      break L12;
                                    } else {
                                      if (param0.field_k != null) {
                                        var23 = 0;
                                        L13: while (true) {
                                          if (~var23 <= ~param0.field_I) {
                                            break L12;
                                          } else {
                                            var24 = param0.field_b[var23];
                                            var25 = param0.field_D[var23];
                                            var26 = param0.field_o[var23];
                                            sd.field_g[var23] = var9 - -(var25 * var15 + var24 * var12 + var18 * var26 >> 16);
                                            kk.field_c[var23] = (var16 * var25 + (var24 * var13 + var19 * var26) >> 16) + var10;
                                            mj.field_n[var23] = (var24 * var14 + (var17 * var25 - -(var20 * var26)) >> 16) + var11;
                                            var24 = param0.field_p[var23];
                                            var25 = param0.field_N[var23];
                                            var26 = param0.field_S[var23];
                                            bl.field_z[var23] = (var24 * var12 + (var25 * var15 + var18 * var26) >> 16) + var9;
                                            jc.field_F[var23] = var10 + (var13 * var24 + var25 * var16 - -(var19 * var26) >> 16);
                                            id.field_b[var23] = var11 + (var14 * var24 + var17 * var25 + var20 * var26 >> 16);
                                            var24 = param0.field_m[var23];
                                            var25 = param0.field_L[var23];
                                            var26 = param0.field_k[var23];
                                            qg.field_n[var23] = var9 + (var15 * var25 + var24 * var12 + var18 * var26 >> 16);
                                            pk.field_f[var23] = (var25 * var16 + var13 * var24 + var26 * var19 >> 16) + var10;
                                            wc.field_a[var23] = (var20 * var26 + var25 * var17 + var24 * var14 >> 16) + var11;
                                            var23++;
                                            if (var30 != 0) {
                                              break L11;
                                            } else {
                                              if (var30 == 0) {
                                                continue L13;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L12;
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
                      break L11;
                    } else {
                      break L4;
                    }
                  }
                  var18 = 0;
                  L14: while (true) {
                    stackOut_60_0 = var18;
                    stackOut_60_1 = param0.field_g;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    if (stackIn_61_0 >= stackIn_61_1) {
                      break L4;
                    } else {
                      stackOut_62_0 = fb.field_b.length;
                      stackOut_62_1 = var18;
                      stackIn_70_0 = stackOut_62_0;
                      stackIn_70_1 = stackOut_62_1;
                      stackIn_63_0 = stackOut_62_0;
                      stackIn_63_1 = stackOut_62_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        stackOut_63_0 = stackIn_63_0;
                        stackOut_63_1 = stackIn_63_1;
                        stackIn_65_0 = stackOut_63_0;
                        stackIn_65_1 = stackOut_63_1;
                        if (stackIn_65_0 <= stackIn_65_1) {
                          break L4;
                        } else {
                          var19 = param0.field_C[var18];
                          var20 = param0.field_q[var18];
                          var21 = param0.field_B[var18];
                          fb.field_b[var18] = var15 * var21 + (var20 * var12 + var9 * var19) >> 16;
                          sf.field_a[var18] = var10 * var19 + (var20 * var13 + var16 * var21) >> 16;
                          h.field_a[var18] = var17 * var21 + (var14 * var20 + var19 * var11) >> 16;
                          var18++;
                          if (var30 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_69_0 = param6;
                stackOut_69_1 = var7_int;
                stackIn_70_0 = stackOut_69_0 ? 1 : 0;
                stackIn_70_1 = stackOut_69_1;
                break L3;
              }
              ri.a(stackIn_70_0 != 0, stackIn_70_1, var8, param0, 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_72_0 = (RuntimeException) var7;
            stackOut_72_1 = new StringBuilder().append("tm.D(");
            stackIn_75_0 = stackOut_72_0;
            stackIn_75_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param0 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L15;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_76_0 = stackOut_73_0;
              stackIn_76_1 = stackOut_73_1;
              stackIn_76_2 = stackOut_73_2;
              break L15;
            }
          }
          L16: {
            stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
            stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',').append(param1).append(',');
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L16;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L16;
            }
          }
          L17: {
            stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L17;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L17;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
                    if (((tm) this).field_q >= 0) {
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
                      if (var4 < -405) {
                        break L2;
                      } else {
                        if (var4 > 640) {
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
          throw lj.a((Throwable) (Object) var2, "tm.C(" + param0 + ')');
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
              L4: {
                if (1 > ((tm) this).field_G) {
                  break L4;
                } else {
                  if (((tm) this).field_G >= 255) {
                    ((tm) this).field_F = -10;
                    ((tm) this).field_G = 255;
                    if (MinerDisturbance.field_ab == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              ((tm) this).field_F = 10;
              ((tm) this).field_G = 0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "tm.B(" + param0 + ',' + param1 + ')');
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
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_32_0 = 0;
        boolean stackOut_40_0 = false;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        var28 = MinerDisturbance.field_ab;
        if (d.field_b) {
          L0: {
            var2_int = ce.field_d.field_I + (ce.field_d.field_E - 2);
            if (350 + ((tm) this).field_A > 470) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((tm) this).field_D <= 0) {
              break L1;
            } else {
              if (((tm) this).field_J <= 0) {
                break L1;
              } else {
                ef.field_b[3].a(-li.field_c + (((tm) this).field_D + -ef.field_b[3].field_x), (ef.field_b[3].field_A >> 2) + (((tm) this).field_J - db.field_d), ~((tm) this).field_G | ((tm) this).field_G << 12);
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
              if (~var5 >= ~(-96 + (((tm) this).field_z - -var3) - 32)) {
                break L3;
              } else {
                if (~(45 + (((tm) this).field_z - -var3 - (-var7 - 96))) >= ~var5) {
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
            L6: {
              var8 = stackIn_20_0;
              if (var8 != 0) {
                L7: {
                  var9 = 0;
                  var10 = a.field_a[0].field_x >> 1;
                  var11 = a.field_a[0].field_A >> 1;
                  var12 = var10 + var5 + 96;
                  var13 = var11 + var6 + 96;
                  var14 = var11 + var6 + -96;
                  var15 = var10 + var5 - 96;
                  var16 = 0;
                  if (var15 >= 0) {
                    break L7;
                  } else {
                    var16 = var15 * -1;
                    var15 = 0;
                    break L7;
                  }
                }
                L8: {
                  var17 = 0;
                  if (var14 >= 0) {
                    break L8;
                  } else {
                    var14 = 0;
                    break L8;
                  }
                }
                L9: {
                  if (eh.field_g + -1 < var12) {
                    var17 = var12 - -1 - eh.field_g;
                    var12 = -1 + eh.field_g;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var14 <= -1 + eh.field_c) {
                    break L10;
                  } else {
                    var14 = eh.field_c - 1;
                    break L10;
                  }
                }
                L11: while (true) {
                  if (~var14 <= ~var13) {
                    break L6;
                  } else {
                    var9 = var9 + var16;
                    stackOut_32_0 = var15;
                    stackIn_41_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var28 != 0) {
                      break L5;
                    } else {
                      var18 = stackIn_33_0;
                      L12: while (true) {
                        L13: {
                          L14: {
                            if (var18 >= var12) {
                              break L14;
                            } else {
                              int incrementValue$3 = var9;
                              var9++;
                              m.field_j[incrementValue$3] = eh.field_f[var14 * eh.field_g + var18];
                              var18++;
                              if (var28 != 0) {
                                break L13;
                              } else {
                                if (var28 == 0) {
                                  continue L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var9 = var9 + var17;
                          var14++;
                          break L13;
                        }
                        if (var28 == 0) {
                          continue L11;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            stackOut_40_0 = ((tm) this).field_B;
            stackIn_41_0 = stackOut_40_0 ? 1 : 0;
            break L5;
          }
          L15: {
            L16: {
              if (stackIn_41_0 == 0) {
                break L16;
              } else {
                L17: {
                  var9 = var7 - -60;
                  var9 = var9 - (ah.field_c[2].field_x + ah.field_c[0].field_x);
                  var10 = ((tm) this).field_A + 60;
                  var9 = var9 / ah.field_c[1].field_x * ah.field_c[1].field_x;
                  var9 = var9 + (ah.field_c[2].field_x + ah.field_c[0].field_x);
                  var10 = var10 - (ah.field_c[0].field_A - -ah.field_c[6].field_A);
                  var10 = (var10 / ah.field_c[3].field_A + 1) * ah.field_c[3].field_A;
                  if (~(var7 - -60) < ~var9) {
                    var9 = var9 + ah.field_c[1].field_x;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  var10 = var10 + (ah.field_c[0].field_A + ah.field_c[6].field_A);
                  if (((tm) this).field_A + 60 > var10) {
                    var10 = var10 + ah.field_c[1].field_A;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var11 = 60 + var7 - var9;
                var12 = -var10 + 60 + ((tm) this).field_A;
                g.a(((tm) this).field_C + var4 - -(var12 / 2), var10, var3 + (((tm) this).field_z + var11 / 2), var9, (byte) 31, ah.field_c);
                if (var28 == 0) {
                  break L15;
                } else {
                  break L16;
                }
              }
            }
            g.a(var4 + ((tm) this).field_C, 60 + ((tm) this).field_A, var3 + ((tm) this).field_z, var7 + 60, (byte) 93, hd.field_d);
            break L15;
          }
          L19: {
            var9 = 0;
            var10 = 30 + ((tm) this).field_z + var3;
            var11 = var4 + (40 + ((tm) this).field_C);
            var12 = 0;
            if (!((tm) this).field_B) {
              break L19;
            } else {
              var12 = mm.field_a.field_I - -mm.field_a.field_E;
              mm.field_a.a(oe.field_f, var10, var11, 1, 8063303);
              break L19;
            }
          }
          var13 = 0;
          if (param0 == 94) {
            L20: while (true) {
              L21: {
                L22: {
                  if (~((tm) this).field_t.length >= ~var13) {
                    break L22;
                  } else {
                    stackOut_55_0 = 3;
                    stackOut_55_1 = ((tm) this).field_s;
                    stackIn_76_0 = stackOut_55_0;
                    stackIn_76_1 = stackOut_55_1;
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    if (var28 != 0) {
                      break L21;
                    } else {
                      L23: {
                        L24: {
                          L25: {
                            L26: {
                              if (stackIn_56_0 != stackIn_56_1) {
                                break L26;
                              } else {
                                if (1 >= var13) {
                                  break L26;
                                } else {
                                  if (5 > var13) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            if (16 == ((tm) this).field_s) {
                              break L25;
                            } else {
                              if (((tm) this).field_s == 13) {
                                break L25;
                              } else {
                                if (((tm) this).field_s == 0) {
                                  break L25;
                                } else {
                                  if (2 == ((tm) this).field_s) {
                                    break L25;
                                  } else {
                                    if (((tm) this).field_s != 9) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = 313;
                          if (var28 == 0) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                        var7 = 360;
                        break L23;
                      }
                      int discarded$4 = ce.field_d.a(((tm) this).field_t[var13], -var7 + 360 + var10, var12 + var9 * var2_int + var11 + -ce.field_d.field_I, var7, 480, 1, -1, 0, 0, var2_int);
                      var9 = var9 + ce.field_d.a(((tm) this).field_t[var13], var7);
                      var13++;
                      if (var28 == 0) {
                        continue L20;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
                var13 = 0;
                stackOut_75_0 = -4;
                stackOut_75_1 = ~((tm) this).field_s;
                stackIn_76_0 = stackOut_75_0;
                stackIn_76_1 = stackOut_75_1;
                break L21;
              }
              L27: {
                L28: {
                  if (stackIn_76_0 != stackIn_76_1) {
                    break L28;
                  } else {
                    fl.field_j[7].c(var10, var11 + 35);
                    if (var28 == 0) {
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                L29: {
                  if (((tm) this).field_s != 9) {
                    break L29;
                  } else {
                    fl.field_j[3].c(var10, 35 + var11);
                    var13 = fl.field_j[3].field_j;
                    if (var28 == 0) {
                      break L27;
                    } else {
                      break L29;
                    }
                  }
                }
                L30: {
                  if (((tm) this).field_s == 2) {
                    break L30;
                  } else {
                    L31: {
                      L32: {
                        if (0 == ((tm) this).field_s) {
                          break L32;
                        } else {
                          if (16 != ((tm) this).field_s) {
                            break L31;
                          } else {
                            break L32;
                          }
                        }
                      }
                      fl.field_j[5].c(var10, var11 + 20);
                      var13 = fl.field_j[5].field_j;
                      if (var28 == 0) {
                        break L27;
                      } else {
                        break L31;
                      }
                    }
                    if (((tm) this).field_s != 13) {
                      break L27;
                    } else {
                      fl.field_j[9].c(var10, 15 + var11);
                      var13 = fl.field_j[9].field_j;
                      if (var28 == 0) {
                        break L27;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                fl.field_j[8].c(var10, var11);
                var13 = fl.field_j[8].field_j;
                break L27;
              }
              L33: {
                L34: {
                  if (!((tm) this).field_B) {
                    break L34;
                  } else {
                    ce.field_d.a(ni.field_b, var10, (1 + var9) * var2_int + var11 - -var12, 1, -1);
                    if (var28 == 0) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
                ce.field_d.a(aj.field_a, var10, var12 + (var11 - -(var2_int * (var9 - -1))), 1, -1);
                ce.field_d.c(qe.field_d, -15 + (var10 - -var7 + var13), var11 - (-(var2_int * (var9 - -1)) + -var12), 1, -1);
                ce.field_d.c(Integer.toString(((tm) this).field_q / 100), var13 + (var7 + var10), var11 - (-(var2_int * (1 + var9)) - var12), 1, -1);
                break L33;
              }
              L35: {
                L36: {
                  if (var8 == 0) {
                    break L36;
                  } else {
                    L37: {
                      var14 = 0;
                      var15 = a.field_a[0].field_x >> 1;
                      var16 = a.field_a[0].field_A >> 1;
                      var17 = var15 + (var5 + 96);
                      var18 = var16 + (var6 + 96);
                      var19 = var16 + (-96 + var6);
                      var20 = var15 + var5 - 96;
                      var21 = 0;
                      if (var20 >= 0) {
                        break L37;
                      } else {
                        var21 = var20 * -1;
                        var20 = 0;
                        break L37;
                      }
                    }
                    L38: {
                      var22 = 0;
                      if (-1 + eh.field_g >= var17) {
                        break L38;
                      } else {
                        var22 = -eh.field_g - -1 + var17;
                        var17 = -1 + eh.field_g;
                        break L38;
                      }
                    }
                    L39: {
                      if (0 > var19) {
                        var19 = 0;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    L40: {
                      if (eh.field_c - 1 >= var19) {
                        break L40;
                      } else {
                        var19 = -1 + eh.field_c;
                        break L40;
                      }
                    }
                    L41: while (true) {
                      if (var19 >= var18) {
                        break L36;
                      } else {
                        var14 = var14 + var21;
                        if (var28 != 0) {
                          break L35;
                        } else {
                          var23 = var20;
                          L42: while (true) {
                            L43: {
                              L44: {
                                if (var17 <= var23) {
                                  break L44;
                                } else {
                                  var24 = ec.field_b[var14];
                                  var25 = -var24 + 256;
                                  var26 = eh.field_f[eh.field_g * var19 - -var23];
                                  int incrementValue$5 = var14;
                                  var14++;
                                  var27 = m.field_j[incrementValue$5];
                                  eh.field_f[var23 + eh.field_g * var19] = c.a(16711680, var24 * c.a(var27, 65280) - -(c.a(var26, 65280) * var25)) + c.a(-16711936, var25 * c.a(var26, 16711935) + c.a(var27, 16711935) * var24) >> 8;
                                  var23++;
                                  if (var28 != 0) {
                                    break L43;
                                  } else {
                                    if (var28 == 0) {
                                      continue L42;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              var14 = var14 + var22;
                              var19++;
                              break L43;
                            }
                            if (var28 == 0) {
                              continue L41;
                            } else {
                              break L36;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L35;
              }
              return;
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
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                if (e.field_i[param0].length != 1) {
                  break L2;
                } else {
                  ((tm) this).field_t = e.field_i[param0][0];
                  if (var10 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((tm) this).field_t = e.field_i[param0][cm.field_o];
              break L1;
            }
            if (null != ((tm) this).field_t) {
              L3: {
                L4: {
                  ((tm) this).field_J = param2;
                  ((tm) this).field_q = 2000;
                  ((tm) this).field_x = 0.0f;
                  ((tm) this).field_s = param0;
                  ((tm) this).field_D = param1;
                  ((tm) this).field_B = param3;
                  var5_int = ce.field_d.field_I + (ce.field_d.field_E + -2);
                  var6 = 360;
                  if (((tm) this).field_s == 9) {
                    break L4;
                  } else {
                    if (((tm) this).field_s == 2) {
                      break L4;
                    } else {
                      if (((tm) this).field_s == 0) {
                        break L4;
                      } else {
                        if (((tm) this).field_s == 16) {
                          break L4;
                        } else {
                          if (((tm) this).field_s != 13) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                var6 = 313;
                break L3;
              }
              var7 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var7 >= ((tm) this).field_t.length) {
                      break L7;
                    } else {
                      stackOut_23_0 = ((tm) this).field_s;
                      stackOut_23_1 = 3;
                      stackIn_37_0 = stackOut_23_0;
                      stackIn_37_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (var10 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_24_0 != stackIn_24_1) {
                            break L8;
                          } else {
                            if (var7 <= 1) {
                              break L8;
                            } else {
                              var6 = 320;
                              break L8;
                            }
                          }
                        }
                        ((tm) this).field_A = ((tm) this).field_A + ce.field_d.a(((tm) this).field_t[var7], var6);
                        var7++;
                        if (var10 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L9: {
                    ((tm) this).field_A = ((tm) this).field_A + ce.field_d.a(uf.field_v, var6);
                    ((tm) this).field_A = ((tm) this).field_A * var5_int;
                    ((tm) this).field_A = ((tm) this).field_A + 10;
                    if (((tm) this).field_B) {
                      ((tm) this).field_A = ((tm) this).field_A + (mm.field_a.field_E + mm.field_a.field_I);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var7 = 380;
                  stackOut_36_0 = 0;
                  stackOut_36_1 = param1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  break L6;
                }
                L10: {
                  L11: {
                    if (stackIn_37_0 < stackIn_37_1) {
                      break L11;
                    } else {
                      param1 = 320;
                      if (var10 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param1 = param1 - li.field_c;
                  break L10;
                }
                L12: {
                  L13: {
                    var8 = 20 + ((tm) this).field_A;
                    var9 = -var8 + (-64 + 32 * hf.field_t) - db.field_d;
                    ((tm) this).field_o = 32 * ca.field_k - li.field_c + -180;
                    if (db.field_d + var9 < 32) {
                      break L13;
                    } else {
                      if (((tm) this).field_B) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var9 = 64 + (32 * hf.field_t + -db.field_d);
                  break L12;
                }
                L14: {
                  L15: {
                    ((tm) this).field_z = -var7;
                    ((tm) this).field_C = 480 + var8;
                    if (((tm) this).field_o >= 0) {
                      break L15;
                    } else {
                      ((tm) this).field_o = 64;
                      if (var10 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (~((tm) this).field_o >= ~(1024 + -li.field_c - 405)) {
                    break L14;
                  } else {
                    ((tm) this).field_o = -li.field_c + 555;
                    break L14;
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
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var5, "tm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new byte[250][];
    }
}
