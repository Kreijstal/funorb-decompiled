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
        wg var8 = null;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param5 == -8625) {
            break L0;
          } else {
            ng.c(-53);
            break L0;
          }
        }
        if (od.field_I != e.field_q) {
          return false;
        } else {
          var8 = new wg(im.field_e, param0);
          im.field_e.c((ag) (Object) var8, param5 ^ -8686);
          if (!fc.i(-1)) {
            L1: {
              cg.field_e = param4;
              fj.field_Sb = param6;
              qi.field_G = param3;
              od.field_I = ti.field_b;
              wj.field_H = null;
              if (!param2) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            uh.field_o = stackIn_10_0 != 0;
            ia.field_h = param1;
            return true;
          } else {
            var8.r(-104);
            return true;
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 10448) {
            return;
        }
        field_v = null;
        field_i = null;
        field_p = null;
        field_l = null;
        field_s = null;
    }

    final static void a(byte param0, p param1, int param2, int param3, int[] param4) {
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        oj var17 = null;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        double var30 = 0.0;
        int var32 = 0;
        oj var33_ref_oj = null;
        int var33 = 0;
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
        Object var49 = null;
        Object var50 = null;
        int stackIn_4_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_79_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        L0: {
          var48 = HostileSpawn.field_I ? 1 : 0;
          if (param1.field_e != 0) {
            break L0;
          } else {
            L1: {
              var7 = param1.field_l.field_f + (double)param1.field_j.field_e;
              var9 = (double)param1.field_j.field_g + param1.field_l.field_a;
              var11 = 0;
              if (4 != param3) {
                stackOut_3_0 = 64;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 32;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var12 = stackIn_4_0;
            L2: while (true) {
              L3: {
                if (param1.field_e != 0) {
                  break L3;
                } else {
                  L4: {
                    var11++;
                    if (var11 > var12) {
                      param1.field_e = 1;
                      param1.field_i = -1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    param1.field_l.a(2, (byte) 94, param1.field_c);
                    param1.a(8573);
                    param4[param2] = 0;
                    if (param4[param1.field_j.b(-4)] == 2) {
                      param1.field_e = 1;
                      param1.field_i = -1;
                      param1.field_c = 255.0 * Math.random();
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  param4[param2] = 3;
                  if (0 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              var13 = param1.field_l.field_f + (double)param1.field_j.field_e;
              var15 = param1.field_l.field_a + (double)param1.field_j.field_g;
              var17 = null;
              var18 = (-var13 + var7) * (-var13 + var7) + (var9 - var15) * (var9 - var15);
              var32 = 1;
              L6: while (true) {
                L7: {
                  if (rc.field_e <= var32) {
                    break L7;
                  } else {
                    L8: {
                      var33_ref_oj = re.field_n[var32];
                      var17 = var33_ref_oj;
                      var17 = var33_ref_oj;
                      var34 = var33_ref_oj.field_i;
                      if (-1 <= (var33_ref_oj.field_I ^ -1)) {
                        break L8;
                      } else {
                        L9: {
                          if (var34 < 12) {
                            break L9;
                          } else {
                            if (18 <= var34) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L10: {
                          var35 = 1.0;
                          var28 = (double)var33_ref_oj.field_j.field_e + var33_ref_oj.field_l.field_f;
                          if (var34 == 20) {
                            var35 = 0.5;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          L12: {
                            var30 = var33_ref_oj.field_l.field_a + (double)var33_ref_oj.field_j.field_g;
                            if (var34 == 8) {
                              break L12;
                            } else {
                              if (var34 != 27) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var35 = 1.5;
                          var28 = var28 - 0.5;
                          var30 = var30 - 0.5;
                          break L11;
                        }
                        L13: {
                          L14: {
                            var22 = -var35 + var30;
                            var20 = -var35 + var28;
                            var26 = var30 + var35;
                            var24 = var35 + var28;
                            var37 = 0;
                            if (null == var33_ref_oj.field_u) {
                              break L14;
                            } else {
                              var38 = var13 - var7;
                              var40 = -var9 + var15;
                              var42 = -(var33_ref_oj.field_u.field_z >> -1093662591) + (int)(24.0 * var28);
                              var43 = (int)(24.0 * var30) - (var33_ref_oj.field_u.field_A >> -1989081119);
                              var44 = 0.0;
                              L15: while (true) {
                                L16: {
                                  if (1.0 <= var44) {
                                    break L16;
                                  } else {
                                    if (var37 != 0) {
                                      break L16;
                                    } else {
                                      L17: {
                                        var46 = (int)(24.0 * (var38 * var44 + var7));
                                        var47 = (int)(24.0 * (var9 + var44 * var40));
                                        if (!var33_ref_oj.field_u.d(var42, var43, var46, var47)) {
                                          stackOut_32_0 = 0;
                                          stackIn_33_0 = stackOut_32_0;
                                          break L17;
                                        } else {
                                          stackOut_31_0 = 1;
                                          stackIn_33_0 = stackOut_31_0;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        var37 = stackIn_33_0;
                                        if (var37 != 0) {
                                          var9 = var9 + var44 * var40;
                                          var7 = var7 + var38 * var44;
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var44 = var44 + 0.05;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                if (0 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          L19: {
                            if (!fb.a(var22, (byte) 43, var26, var13, var20, var9, var24, var15, var7)) {
                              if (fb.a(var26, (byte) 43, var22, var13, var20, var9, var24, var15, var7)) {
                                stackOut_42_0 = 1;
                                stackIn_44_0 = stackOut_42_0;
                                break L19;
                              } else {
                                stackOut_41_0 = 0;
                                stackIn_44_0 = stackOut_41_0;
                                break L19;
                              }
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_44_0 = stackOut_39_0;
                              break L19;
                            }
                          }
                          var37 = stackIn_44_0;
                          break L13;
                        }
                        if (var37 == 0) {
                          break L8;
                        } else {
                          var5 = (-var30 + var9) * (-var30 + var9) + (-var28 + var7) * (var7 - var28);
                          if (var18 <= var5) {
                            break L8;
                          } else {
                            var17 = var33_ref_oj;
                            var18 = var5;
                            break L8;
                          }
                        }
                      }
                    }
                    var32++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L20: {
                  if (var17 == null) {
                    break L20;
                  } else {
                    L21: {
                      if (param1.field_i == 28) {
                        stackOut_52_0 = 2;
                        stackIn_53_0 = stackOut_52_0;
                        break L21;
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        break L21;
                      }
                    }
                    L22: {
                      var32 = stackIn_53_0;
                      param1.field_i = 4;
                      if (0 >= var17.field_I) {
                        stackOut_55_0 = 0;
                        stackIn_56_0 = stackOut_55_0;
                        break L22;
                      } else {
                        stackOut_54_0 = 1;
                        stackIn_56_0 = stackOut_54_0;
                        break L22;
                      }
                    }
                    L23: {
                      var33 = stackIn_56_0;
                      if (!var17.a(4, -122)) {
                        break L23;
                      } else {
                        L24: {
                          if (-9 == (var17.field_i ^ -1)) {
                            break L24;
                          } else {
                            if ((var17.field_i ^ -1) == -6) {
                              break L23;
                            } else {
                              if (var17.field_i == 22) {
                                break L23;
                              } else {
                                var17.field_I = var17.field_I - 3 * var32;
                                if (0 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                        param1.field_i = -1;
                        var17.field_I = var17.field_I - var32 * 12;
                        break L23;
                      }
                    }
                    L25: {
                      param1.field_i = -1;
                      if ((var17.field_I ^ -1) > -1) {
                        var17.field_I = 0;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      var17.field_F = 255;
                      param1.field_e = 1;
                      param1.field_c = 255.0 * Math.random();
                      param1.field_j.field_g = var17.field_j.field_g;
                      param1.field_j.field_e = var17.field_j.field_e;
                      param1.field_l.field_f = var17.field_l.field_f + Math.random() - 0.5;
                      param1.field_l.field_a = -0.5 + (var17.field_l.field_a + Math.random());
                      if ((var17.field_I ^ -1) < -1) {
                        break L26;
                      } else {
                        param1.field_i = 3;
                        if (var33 == 0) {
                          break L26;
                        } else {
                          if (!var17.field_b) {
                            break L26;
                          } else {
                            if (var17.field_i == 27) {
                              break L26;
                            } else {
                              al.field_U[1] = al.field_U[1] + 1;
                              if (al.field_U[1] + 1 != 30) {
                                break L26;
                              } else {
                                ti.a(249, (byte) 10, 6);
                                break L26;
                              }
                            }
                          }
                        }
                      }
                    }
                    nh.a(var17, param0 ^ -30020);
                    if (0 == 0) {
                      break L0;
                    } else {
                      break L20;
                    }
                  }
                }
                var50 = null;
                nh.a((oj) null, -29966);
                break L0;
              }
            }
          }
        }
        L27: {
          if (param0 == 78) {
            break L27;
          } else {
            var49 = null;
            boolean discarded$1 = ng.a((mk) null, -5, true, (String) null, (String) null, 31, (String) null);
            break L27;
          }
        }
        L28: {
          param1.field_e = param1.field_e + 1;
          if (-29 != (param1.field_i ^ -1)) {
            stackOut_78_0 = 32;
            stackIn_79_0 = stackOut_78_0;
            break L28;
          } else {
            stackOut_77_0 = 64;
            stackIn_79_0 = stackOut_77_0;
            break L28;
          }
        }
        L29: {
          if ((stackIn_79_0 ^ -1) <= (param1.field_e ^ -1)) {
            break L29;
          } else {
            param1.field_i = -1;
            break L29;
          }
        }
    }

    ng() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_l = new int[256];
    }
}
