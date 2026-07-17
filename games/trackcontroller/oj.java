/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static java.security.SecureRandom field_b;
    static ja field_d;
    static String field_c;
    static aa field_a;

    final static void a(int param0, boolean param1, boolean param2, pf param3, int[] param4, int[] param5) {
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
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var30 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var21 = param5[3] >> 2;
            var22 = param5[4] >> 2;
            var23 = param5[5] >> 2;
            var24 = param5[6] >> 2;
            var25 = param5[7] >> 2;
            var26 = param5[8] >> 2;
            var27 = param5[9] >> 2;
            var28 = param5[10] >> 2;
            var29 = param5[11] >> 2;
            var13 = param4[4] * var25 + (param4[3] * var24 + var26 * param4[5]) >> 14;
            var12 = param4[3] * var21 + (var22 * param4[4] + var23 * param4[5]) >> 14;
            var17 = param4[6] * var27 - -(param4[7] * var28) - -(var29 * param4[8]) >> 14;
            var20 = var29 * param4[11] + var27 * param4[9] + var28 * param4[10] >> 14;
            var15 = var23 * param4[8] + param4[7] * var22 + param4[6] * var21 >> 14;
            var14 = var29 * param4[5] + (param4[4] * var28 + param4[3] * var27) >> 14;
            var16 = param4[7] * var25 + (var24 * param4[6] - -(var26 * param4[8])) >> 14;
            var19 = param4[9] * var24 - -(var25 * param4[10]) - -(var26 * param4[11]) >> 14;
            var18 = param4[11] * var23 + param4[10] * var22 + var21 * param4[9] >> 14;
            var21 = param4[0] - param5[0];
            var22 = param4[1] - param5[1];
            var23 = param4[2] + -param5[2];
            var9 = var21 * param5[3] + (var22 * param5[4] + var23 * param5[5]) >> 16 + -wi.field_b;
            var11 = var23 * param5[11] + param5[9] * var21 - -(param5[10] * var22) >> 16;
            var10 = var21 * param5[6] + (var22 * param5[7] - -(var23 * param5[8])) >> -wi.field_b + 16;
            var21 = ig.field_h;
            var22 = ig.field_a;
            var23 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (param3.field_q <= var23) {
                      break L4;
                    } else {
                      var24 = param3.field_y[var23];
                      var25 = param3.field_o[var23];
                      var26 = param3.field_S[var23];
                      var27 = var9 + (var18 * var26 + (var15 * var25 + var24 * var12) >> 16 + -wi.field_b);
                      var28 = var10 + (var26 * var19 + (var24 * var13 - -(var16 * var25)) >> 16 - wi.field_b);
                      var29 = (var20 * var26 + var24 * var14 + var25 * var17 >> 16) + var11;
                      stackOut_3_0 = ~var29;
                      stackOut_3_1 = -51;
                      stackIn_61_0 = stackOut_3_0;
                      stackIn_61_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var30 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (stackIn_4_0 <= stackIn_4_1) {
                              break L6;
                            } else {
                              od.field_c[var23] = -2147483648;
                              if (var30 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            qa.field_b[var23] = var21 - -(var27 / var29);
                            ui.field_r[var23] = var28 / var29 + var22;
                            if (~var8 > ~var29) {
                              var8 = var29;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          od.field_c[var23] = var29;
                          if (var7_int <= var29) {
                            break L5;
                          } else {
                            var7_int = var29;
                            break L5;
                          }
                        }
                        var23++;
                        if (var30 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: {
                    if (null == param3.field_L) {
                      break L8;
                    } else {
                      if (param3.field_h == null) {
                        break L8;
                      } else {
                        if (param3.field_t == null) {
                          break L8;
                        } else {
                          if (param3.field_f == null) {
                            break L8;
                          } else {
                            if (param3.field_D == null) {
                              break L8;
                            } else {
                              if (param3.field_B == null) {
                                break L8;
                              } else {
                                if (null == param3.field_v) {
                                  break L8;
                                } else {
                                  if (param3.field_z == null) {
                                    break L8;
                                  } else {
                                    if (null == param3.field_s) {
                                      break L8;
                                    } else {
                                      var23 = 0;
                                      L9: while (true) {
                                        if (param3.field_E <= var23) {
                                          break L8;
                                        } else {
                                          var24 = param3.field_L[var23];
                                          var25 = param3.field_h[var23];
                                          var26 = param3.field_t[var23];
                                          vj.field_c[var23] = (var25 * var15 + var24 * var12 + var26 * var18 >> 16) + var9;
                                          id.field_k[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> 16) + var10;
                                          sd.field_d[var23] = (var14 * var24 - (-(var17 * var25) - var20 * var26) >> 16) + var11;
                                          var24 = param3.field_f[var23];
                                          var25 = param3.field_D[var23];
                                          var26 = param3.field_B[var23];
                                          u.field_l[var23] = (var26 * var18 + (var25 * var15 + var24 * var12) >> 16) + var9;
                                          rd.field_s[var23] = (var26 * var19 + (var16 * var25 + var13 * var24) >> 16) + var10;
                                          lf.field_X[var23] = (var25 * var17 + (var14 * var24 - -(var26 * var20)) >> 16) + var11;
                                          var24 = param3.field_v[var23];
                                          var25 = param3.field_z[var23];
                                          var26 = param3.field_s[var23];
                                          nb.field_s[var23] = (var18 * var26 + var12 * var24 - -(var25 * var15) >> 16) + var9;
                                          jb.field_b[var23] = var10 + (var25 * var16 + (var13 * var24 + var26 * var19) >> 16);
                                          ri.field_B[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 16) + var11;
                                          var23++;
                                          if (var30 != 0) {
                                            break L2;
                                          } else {
                                            if (var30 == 0) {
                                              continue L9;
                                            } else {
                                              break L8;
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
                    }
                  }
                  var9 = param4[3];
                  var10 = param4[4];
                  var11 = param4[5];
                  var12 = param4[6];
                  var13 = param4[7];
                  var14 = param4[8];
                  var15 = param4[9];
                  var16 = param4[10];
                  var17 = param4[11];
                  var18 = 0;
                  L10: while (true) {
                    L11: {
                      if (var18 >= param3.field_l) {
                        break L11;
                      } else {
                        stackOut_55_0 = wf.field_c.length;
                        stackOut_55_1 = var18;
                        stackIn_61_0 = stackOut_55_0;
                        stackIn_61_1 = stackOut_55_1;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        if (var30 != 0) {
                          break L3;
                        } else {
                          if (stackIn_56_0 <= stackIn_56_1) {
                            break L11;
                          } else {
                            var19 = param3.field_j[var18];
                            var20 = param3.field_R[var18];
                            var21 = param3.field_b[var18];
                            wf.field_c[var18] = var15 * var21 + (var9 * var19 + var20 * var12) >> 16;
                            ch.field_y[var18] = var21 * var16 + var10 * var19 - -(var20 * var13) >> 16;
                            ea.field_w[var18] = var21 * var17 + var20 * var14 + var11 * var19 >> 16;
                            var18++;
                            if (var30 == 0) {
                              continue L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    stackOut_60_0 = -106;
                    stackOut_60_1 = var7_int;
                    stackIn_61_0 = stackOut_60_0;
                    stackIn_61_1 = stackOut_60_1;
                    break L3;
                  }
                }
                int discarded$1 = 0;
                ve.a(stackIn_61_0, stackIn_61_1, var8, param3);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("oj.A(").append(9).append(44).append(1).append(44).append(0).append(44);
            stackIn_66_0 = stackOut_63_0;
            stackIn_66_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param3 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L12;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_67_0 = stackOut_64_0;
              stackIn_67_1 = stackOut_64_1;
              stackIn_67_2 = stackOut_64_2;
              break L12;
            }
          }
          L13: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44);
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L13;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L13;
            }
          }
          L14: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44);
            stackIn_74_0 = stackOut_71_0;
            stackIn_74_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param5 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L14;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_75_0 = stackOut_72_0;
              stackIn_75_1 = stackOut_72_1;
              stackIn_75_2 = stackOut_72_2;
              break L14;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + 0 + 41);
        }
    }

    final static hk a(String param0, int param1) {
        qc var3 = null;
        RuntimeException var3_ref = null;
        qc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        qc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3 = new qc();
            ((hk) (Object) var3).field_b = param0;
            ((hk) (Object) var3).field_c = param1;
            stackOut_3_0 = (qc) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("oj.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + 0 + 41);
        }
        return (hk) (Object) stackIn_4_0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == og.field_rb) {
              return;
            } else {
              L1: {
                r.a(-32652, (java.awt.Canvas) (Object) og.field_rb);
                og.field_rb.a(rg.field_c, 5474);
                og.field_rb = null;
                if (param0 <= -74) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              L2: {
                if (tk.field_u != null) {
                  tk.field_u.b(6391);
                  break L2;
                } else {
                  break L2;
                }
              }
              ki.field_f.requestFocus();
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "oj.D(" + param0 + 41);
        }
    }

    public static void a() {
        try {
            field_c = null;
            field_a = null;
            field_b = null;
            int var1_int = 0;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "oj.B(" + -116 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Connection lost - attempting to reconnect";
        field_a = new aa(15, 0, 1, 0);
    }
}
