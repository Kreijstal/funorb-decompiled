/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ck {
    static String field_b;
    static bi field_a;

    final static void a(int param0, double param1, double param2, double param3) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var11 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1942300510) {
                break L1;
              } else {
                field_a = (bi) null;
                break L1;
              }
            }
            var7_int = (int)(325.94932345220167 * param1);
            var8 = (int)(param2 * 325.94932345220167);
            var9 = (int)(param3 * 325.94932345220167);
            var10 = 1;
            L2: while (true) {
              if (var10 >= 4) {
                break L0;
              } else {
                bh.field_b[-1 + var10] = ti.field_m[va.a(2047, (var10 * 4 + 3) * var7_int)] >> -1942300510;
                bh.field_b[2 + var10] = ti.field_m[va.a((3 + var10 * 4) * var8, 2047)] >> 1534034594;
                bh.field_b[5 + var10] = ti.field_m[va.a(2047, var9 * (3 - -(4 * var10)))] >> -315599422;
                bh.field_b[8 + var10] = ti.field_j[va.a(2047, var7_int * (3 - -(var10 * 4)))] >> 1547589218;
                bh.field_b[var10 - -11] = ti.field_j[va.a(2047, var8 * (var10 * 4 + 3))] >> 85662242;
                bh.field_b[var10 - -14] = ti.field_j[va.a(var9 * (var10 * 4 + 3), 2047)] >> 112668034;
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var7), "ck.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int[] param0, int param1, boolean param2, int[] param3, boolean param4, boolean param5, rm param6) {
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
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
        int var31 = 0;
        var31 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param0[3] >> 831089186;
            var22 = param0[4] >> -255634846;
            var23 = param0[5] >> 876717602;
            var24 = param0[6] >> 1710264162;
            var25 = param0[7] >> 1767739650;
            var26 = param0[8] >> -1498623454;
            var27 = param0[9] >> -1825099998;
            var28 = param0[10] >> -894872638;
            var12 = var22 * param3[4] + (var21 * param3[3] + param3[5] * var23) >> -1529949778;
            var13 = param3[5] * var26 + (var25 * param3[4] + param3[3] * var24) >> -1664230994;
            var29 = param0[11] >> 2031933922;
            var14 = param3[3] * var27 + var28 * param3[4] + var29 * param3[5] >> 885889390;
            var15 = var23 * param3[8] + param3[7] * var22 + var21 * param3[6] >> -992755250;
            var30 = 34 % ((25 - param1) / 62);
            var20 = var29 * param3[11] + var28 * param3[10] + var27 * param3[9] >> 1258914382;
            var19 = param3[11] * var26 + (param3[10] * var25 + var24 * param3[9]) >> 1769444206;
            var16 = var26 * param3[8] + var24 * param3[6] - -(var25 * param3[7]) >> 116244526;
            var18 = var22 * param3[10] + var21 * param3[9] - -(var23 * param3[11]) >> -530633778;
            var17 = var29 * param3[8] + (param3[7] * var28 + var27 * param3[6]) >> 1593627950;
            var21 = param3[0] + -param0[0];
            var22 = -param0[1] + param3[1];
            var23 = -param0[2] + param3[2];
            var9 = var22 * param0[4] + var21 * param0[3] - -(param0[5] * var23) >> 16 + -pc.field_h;
            var10 = var23 * param0[8] + var21 * param0[6] + param0[7] * var22 >> -pc.field_h + 16;
            var11 = param0[10] * var22 + (var21 * param0[9] + param0[11] * var23) >> 762622960;
            var21 = ti.field_k;
            var22 = ti.field_f;
            var23 = 0;
            L1: while (true) {
              L2: {
                if ((param6.field_b ^ -1) >= (var23 ^ -1)) {
                  L3: {
                    if (null == param6.field_d) {
                      break L3;
                    } else {
                      if (null == param6.field_M) {
                        break L3;
                      } else {
                        if (null == param6.field_i) {
                          break L3;
                        } else {
                          if (param6.field_H == null) {
                            break L3;
                          } else {
                            if (null == param6.field_N) {
                              break L3;
                            } else {
                              if (param6.field_Q == null) {
                                break L3;
                              } else {
                                if (param6.field_c == null) {
                                  break L3;
                                } else {
                                  if (param6.field_q == null) {
                                    break L3;
                                  } else {
                                    if (param6.field_n == null) {
                                      break L3;
                                    } else {
                                      var23 = 0;
                                      L4: while (true) {
                                        if (var23 >= param6.field_w) {
                                          break L3;
                                        } else {
                                          var24 = param6.field_d[var23];
                                          var25 = param6.field_M[var23];
                                          var26 = param6.field_i[var23];
                                          jd.field_e[var23] = (var18 * var26 + (var25 * var15 + var12 * var24) >> 531695216) + var9;
                                          gm.field_bb[var23] = (var25 * var16 + (var13 * var24 + var26 * var19) >> 1178841072) + var10;
                                          mi.field_c[var23] = (var26 * var20 + var17 * var25 + var14 * var24 >> -1793134000) + var11;
                                          var24 = param6.field_H[var23];
                                          var25 = param6.field_N[var23];
                                          var26 = param6.field_Q[var23];
                                          lb.field_u[var23] = var9 + (var18 * var26 + var12 * var24 + var25 * var15 >> 1906810640);
                                          oh.field_a[var23] = var10 + (var26 * var19 + (var24 * var13 + var16 * var25) >> 1065697424);
                                          mf.field_g[var23] = var11 - -(var24 * var14 - (-(var17 * var25) - var26 * var20) >> 1491988176);
                                          var24 = param6.field_c[var23];
                                          var25 = param6.field_q[var23];
                                          var26 = param6.field_n[var23];
                                          sc.field_i[var23] = var9 - -(var18 * var26 + (var12 * var24 + var15 * var25) >> 1565797424);
                                          wa.field_d[var23] = (var26 * var19 + var25 * var16 + var24 * var13 >> -928575696) + var10;
                                          ba.field_P[var23] = (var20 * var26 + var25 * var17 + var14 * var24 >> -2120926320) + var11;
                                          var23++;
                                          continue L4;
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
                    }
                  }
                  if (param5) {
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
                      stackIn_57_0 = param6.field_g ^ -1;
                      stackIn_57_1 = var18 ^ -1;
                      if (stackIn_57_0 >= stackIn_57_1) {
                        break L2;
                      } else {
                        stackIn_60_0 = var18 ^ -1;
                        stackIn_60_1 = tf.field_m.length ^ -1;
                        if (stackIn_60_0 <= stackIn_60_1) {
                          break L2;
                        } else {
                          var19 = param6.field_E[var18];
                          var20 = param6.field_y[var18];
                          var21 = param6.field_r[var18];
                          tf.field_m[var18] = var20 * var12 + var9 * var19 - -(var21 * var15) >> 1946160624;
                          sd.field_c[var18] = var19 * var10 + (var20 * var13 + var16 * var21) >> 79426768;
                          w.field_R[var18] = var14 * var20 + (var11 * var19 - -(var17 * var21)) >> -153733648;
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  var24 = param6.field_x[var23];
                  var25 = param6.field_v[var23];
                  var26 = param6.field_F[var23];
                  var27 = (var24 * var12 - (-(var15 * var25) - var26 * var18) >> 16 + -pc.field_h) + var9;
                  var28 = (var26 * var19 + var16 * var25 + var13 * var24 >> -pc.field_h + 16) + var10;
                  var29 = var11 + (var24 * var14 + var25 * var17 - -(var20 * var26) >> 436591664);
                  stackIn_57_0 = -51;

                  stackIn_57_1 = var29 ^ -1;

                  L7: {
                    if (stackIn_57_0 < stackIn_57_1) {
                      cj.field_b[var23] = -2147483648;
                      break L7;
                    } else {
                      L8: {
                        qf.field_a[var23] = var27 / var29 + var21;
                        db.field_x[var23] = var22 - -(var28 / var29);
                        if ((var7_int ^ -1) >= (var29 ^ -1)) {
                          break L8;
                        } else {
                          var7_int = var29;
                          break L8;
                        }
                      }
                      L9: {
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                          var8 = var29;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      cj.field_b[var23] = var29;
                      break L7;
                    }
                  }
                  L10: {
                    if (!param2) {
                      break L10;
                    } else {
                      tg.field_T[var23] = var27 >> pc.field_h;
                      wl.field_d[var23] = var28 >> pc.field_h;
                      nm.field_C[var23] = var29;
                      break L10;
                    }
                  }
                  var23++;
                  continue L1;
                }
              }
              rc.a((byte) -126, var7_int, param4, var8, param6);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackIn_69_0 = (RuntimeException) (var7);

            stackIn_69_1 = new StringBuilder().append("ck.G(");

            if (param0 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L11;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L12;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L13;
            } else {
              stackIn_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L13;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_70_0), stackIn_78_2 + ')');
        }
    }

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(boolean param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (!je.a(0, param0, param1)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if ((var3_int ^ -1) <= (param1.length() ^ -1)) {
                    stackIn_17_0 = param2;
                    break L2;
                  } else {
                    stackIn_17_0 = og.a(-96, param1.charAt(var3_int));

                    if (!stackIn_17_0) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (!stackIn_17_0) {
                    break L3;
                  } else {
                    ck.a((String) null, (byte) -10);
                    break L3;
                  }
                }
                stackIn_21_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3);

            stackIn_25_1 = new StringBuilder().append("ck.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static va a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        va stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                if ((var2_int ^ -1) >= (var3 ^ -1)) {
                  stackIn_14_0 = param1;
                  stackIn_14_1 = 126;
                  break L2;
                } else {
                  var4 = param0.charAt(var3);
                  stackIn_14_0 = var4 ^ -1;

                  stackIn_14_1 = -49;

                  L3: {
                    if (stackIn_14_0 > stackIn_14_1) {
                      break L3;
                    } else {
                      if (var4 <= 57) {
                        var3++;
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_11_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
              L4: {
                if (stackIn_14_0 >= stackIn_14_1) {
                  break L4;
                } else {
                  ck.a(35, (mi) null);
                  break L4;
                }
              }
              stackIn_18_0 = ql.field_k;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("ck.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (va) ((Object) stackIn_11_0);
        } else {
          return stackIn_18_0;
        }
    }

    abstract void a(java.awt.Component param0, byte param1);

    public static void a(byte param0) {
        try {
            int var1_int = -88 % ((param0 - 34) / 37);
            field_b = null;
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ck.H(" + param0 + ')');
        }
    }

    final static void a(int param0, mi param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        rm var5 = null;
        int[] var6 = null;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var2 = new hb(param1.a(param0 ^ -26592, "logo.fo3d", ""));
            var3 = var2.c(param0 ^ 26581);
            var2.i(8);
            im.field_a = ul.a(var2, 31662);
            Confined.field_K = new rm[var3];
            in.field_b = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= (var3 ^ -1)) {
                L2: {
                  if (param0 == 26613) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                }
                var2.j(116);
                var4 = 0;
                L3: while (true) {
                  if (var3 <= var4) {
                    break L0;
                  } else {
                    var5 = Confined.field_K[var4];
                    var5.a(6, 1, 6, (byte) 56, 6);
                    var5.b(27915);
                    var6 = new int[]{var5.field_I + var5.field_O >> 1124990241, var5.field_L + var5.field_e >> 97840641, var5.field_t - -var5.field_s >> -561626207};
                    in.field_b[var4] = var6;
                    var5.a(-var6[1], -var6[2], 117, -var6[0]);
                    var4++;
                    continue L3;
                  }
                }
              } else {
                Confined.field_K[var4] = kc.a(30035, var2);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("ck.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    static {
        field_b = "Hold <%0> to charge, and release to fire";
    }
}
