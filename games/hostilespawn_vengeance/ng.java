/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng extends am {
    byte[][][] field_o;
    static int field_u;
    static boolean field_k;
    int[] field_n;
    static int[] field_l;
    static bd field_v;
    int[] field_q;
    kk[] field_j;
    static bd field_s;
    static bd field_i;
    static bd[][] field_p;
    kk[] field_r;
    int[] field_m;
    int field_t;
    int field_h;

    final static boolean a(mk param0, int param1, boolean param2, String param3, String param4, int param5, String param6) {
        RuntimeException var7 = null;
        wg var8 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param5 == -8625) {
                break L1;
              } else {
                ng.c(-53);
                break L1;
              }
            }
            if (od.field_I != e.field_q) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = new wg(im.field_e, param0);
              im.field_e.c(var8, param5 ^ -8686);
              if (fc.i(-1)) {
                var8.r(-104);
                stackIn_12_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  cg.field_e = param4;
                  fj.field_Sb = param6;
                  qi.field_G = param3;
                  od.field_I = ti.field_b;
                  wj.field_H = null;
                  if (!param2) {
                    stackIn_10_0 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = 1;
                    break L2;
                  }
                }
                uh.field_o = stackIn_10_0 != 0;
                ia.field_h = param1;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var7);

            stackIn_15_1 = new StringBuilder().append("ng.A(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void c(int param0) {
        if (param0 != 10448) {
            return;
        }
        field_v = null;
        field_i = null;
        field_p = (bd[][]) null;
        field_l = null;
        field_s = null;
    }

    final static void a(byte param0, p param1, int param2, int param3, int[] param4) {
        int dupTemp$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        StringBuilder stackIn_90_1 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        Object var17 = null;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        int var32 = 0;
        int var33 = 0;
        oj var33_ref_oj = null;
        int var34 = 0;
        double var35 = 0.0;
        int var37 = 0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int var43 = 0;
        double var44 = 0.0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        String var49 = null;
        oj var50 = null;
        var48 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1.field_e != 0) {
                break L1;
              } else {
                L2: {
                  var7 = param1.field_l.field_f + (double)param1.field_j.field_e;
                  var9 = (double)param1.field_j.field_g + param1.field_l.field_a;
                  var11 = 0;
                  if (4 != param3) {
                    stackIn_5_0 = 64;
                    break L2;
                  } else {
                    stackIn_5_0 = 32;
                    break L2;
                  }
                }
                var12 = stackIn_5_0;
                L3: while (true) {
                  if (param1.field_e != 0) {
                    var13 = param1.field_l.field_f + (double)param1.field_j.field_e;
                    var15 = param1.field_l.field_a + (double)param1.field_j.field_g;
                    var17 = null;
                    var18 = (-var13 + var7) * (-var13 + var7) + (var9 - var15) * (var9 - var15);
                    var32 = 1;
                    L4: while (true) {
                      if (rc.field_e <= var32) {
                        if (var17 == null) {
                          var50 = (oj) null;
                          nh.a((oj) null, -29966);
                          break L1;
                        } else {
                          L5: {
                            if (param1.field_i == 28) {
                              stackIn_57_0 = 2;
                              break L5;
                            } else {
                              stackIn_57_0 = 1;
                              break L5;
                            }
                          }
                          L6: {
                            var32 = stackIn_57_0;
                            param1.field_i = 4;
                            if (0 >= ((oj) (var17)).field_I) {
                              stackIn_60_0 = 0;
                              break L6;
                            } else {
                              stackIn_60_0 = 1;
                              break L6;
                            }
                          }
                          L7: {
                            var33 = stackIn_60_0;
                            if (!((oj) (var17)).a(4, -122)) {
                              break L7;
                            } else {
                              if (-9 == (((oj) (var17)).field_i ^ -1)) {
                                param1.field_i = -1;
                                ((oj) (var17)).field_I = ((oj) (var17)).field_I - var32 * 12;
                                break L7;
                              } else {
                                if ((((oj) (var17)).field_i ^ -1) == -6) {
                                  break L7;
                                } else {
                                  if (((oj) (var17)).field_i == 22) {
                                    break L7;
                                  } else {
                                    ((oj) (var17)).field_I = ((oj) (var17)).field_I - 3 * var32;
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          L8: {
                            param1.field_i = -1;
                            if ((((oj) (var17)).field_I ^ -1) > -1) {
                              ((oj) (var17)).field_I = 0;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            ((oj) (var17)).field_F = 255;
                            param1.field_e = 1;
                            param1.field_c = 255.0 * Math.random();
                            param1.field_j.field_g = ((oj) (var17)).field_j.field_g;
                            param1.field_j.field_e = ((oj) (var17)).field_j.field_e;
                            param1.field_l.field_f = ((oj) (var17)).field_l.field_f + Math.random() - 0.5;
                            param1.field_l.field_a = -0.5 + (((oj) (var17)).field_l.field_a + Math.random());
                            if ((((oj) (var17)).field_I ^ -1) < -1) {
                              break L9;
                            } else {
                              param1.field_i = 3;
                              if (var33 == 0) {
                                break L9;
                              } else {
                                if (!((oj) (var17)).field_b) {
                                  break L9;
                                } else {
                                  if (((oj) (var17)).field_i == 27) {
                                    break L9;
                                  } else {
                                    dupTemp$0 = al.field_U[1] + 1;
                                    al.field_U[1] = dupTemp$0;
                                    if (dupTemp$0 != 30) {
                                      break L9;
                                    } else {
                                      ti.a(249, (byte) 10, 6);
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          nh.a((oj) (var17), param0 ^ -30020);
                          break L1;
                        }
                      } else {
                        var33_ref_oj = re.field_n[var32];
                        var17 = var33_ref_oj;
                        var17 = var33_ref_oj;
                        var34 = var33_ref_oj.field_i;
                        if (-1 > (var33_ref_oj.field_I ^ -1)) {
                          L10: {
                            L11: {
                              if (-13 < (var34 ^ -1)) {
                                break L11;
                              } else {
                                if (18 <= var34) {
                                  break L11;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L12: {
                              var35 = 1.0;
                              var28 = (double)var33_ref_oj.field_j.field_e + var33_ref_oj.field_l.field_f;
                              if ((var34 ^ -1) == -21) {
                                var35 = 0.5;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            L13: {
                              L14: {
                                var30 = var33_ref_oj.field_l.field_a + (double)var33_ref_oj.field_j.field_g;
                                if (-9 == (var34 ^ -1)) {
                                  break L14;
                                } else {
                                  if (var34 != 27) {
                                    break L13;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var35 = 1.5;
                              var28 = var28 - 0.5;
                              var30 = var30 - 0.5;
                              break L13;
                            }
                            L15: {
                              var22 = -var35 + var30;
                              var20 = -var35 + var28;
                              var26 = var30 + var35;
                              var24 = var35 + var28;
                              var37 = 0;
                              if (null == var33_ref_oj.field_u) {
                                L16: {
                                  if (!fb.a(var22, (byte) 43, var26, var13, var20, var9, var24, var15, var7)) {
                                    if (fb.a(var26, (byte) 43, var22, var13, var20, var9, var24, var15, var7)) {
                                      stackIn_46_0 = 1;
                                      break L16;
                                    } else {
                                      stackIn_46_0 = 0;
                                      break L16;
                                    }
                                  } else {
                                    stackIn_46_0 = 1;
                                    break L16;
                                  }
                                }
                                var37 = stackIn_46_0;
                                break L15;
                              } else {
                                var38 = var13 - var7;
                                var40 = -var9 + var15;
                                var42 = -(var33_ref_oj.field_u.field_z >> -1093662591) + (int)(24.0 * var28);
                                var43 = (int)(24.0 * var30) - (var33_ref_oj.field_u.field_A >> -1989081119);
                                var44 = 0.0;
                                L17: while (true) {
                                  if (1.0 <= var44) {
                                    break L15;
                                  } else {
                                    if (var37 != 0) {
                                      break L15;
                                    } else {
                                      L18: {
                                        var46 = (int)(24.0 * (var38 * var44 + var7));
                                        var47 = (int)(24.0 * (var9 + var44 * var40));
                                        if (!var33_ref_oj.field_u.d(var42, var43, var46, var47)) {
                                          stackIn_35_0 = 0;
                                          break L18;
                                        } else {
                                          stackIn_35_0 = 1;
                                          break L18;
                                        }
                                      }
                                      L19: {
                                        var37 = stackIn_35_0;
                                        if (var37 != 0) {
                                          var9 = var9 + var44 * var40;
                                          var7 = var7 + var38 * var44;
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                      var44 = var44 + 0.05;
                                      continue L17;
                                    }
                                  }
                                }
                              }
                            }
                            if (var37 != 0) {
                              var5_double = (-var30 + var9) * (-var30 + var9) + (-var28 + var7) * (var7 - var28);
                              if (var18 > var5_double) {
                                var17 = var33_ref_oj;
                                var18 = var5_double;
                                break L10;
                              } else {
                                var32++;
                                continue L4;
                              }
                            } else {
                              var32++;
                              continue L4;
                            }
                          }
                          var32++;
                          continue L4;
                        } else {
                          var32++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L20: {
                      var11++;
                      if (var11 > var12) {
                        param1.field_e = 1;
                        param1.field_i = -1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      param1.field_l.a(2, (byte) 94, param1.field_c);
                      param1.a(8573);
                      param4[param2] = 0;
                      if (param4[param1.field_j.b(-4)] == 2) {
                        param1.field_e = 1;
                        param1.field_i = -1;
                        param1.field_c = 255.0 * Math.random();
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    param4[param2] = 3;
                    continue L3;
                  }
                }
              }
            }
            L22: {
              if (param0 == 78) {
                break L22;
              } else {
                var49 = (String) null;
                ng.a((mk) null, -5, true, (String) null, (String) null, 31, (String) null);
                break L22;
              }
            }
            L23: {
              param1.field_e = param1.field_e + 1;
              if (-29 != (param1.field_i ^ -1)) {
                stackIn_82_0 = 32;
                break L23;
              } else {
                stackIn_82_0 = 64;
                break L23;
              }
            }
            L24: {
              if ((stackIn_82_0 ^ -1) <= (param1.field_e ^ -1)) {
                break L24;
              } else {
                param1.field_i = -1;
                break L24;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var5 = decompiledCaughtException;
            stackIn_87_0 = (RuntimeException) (var5);

            stackIn_87_1 = new StringBuilder().append("ng.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "null";
              break L25;
            } else {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackIn_88_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackIn_88_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_90_1 = ((StringBuilder) (Object) stackIn_88_1).append(stackIn_88_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "null";
              break L26;
            } else {
              stackIn_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackIn_91_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackIn_91_2 = "{...}";
              break L26;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_88_0), stackIn_91_2 + ')');
        }
    }

    ng() {
    }

    static {
        field_k = false;
        field_l = new int[256];
    }
}
