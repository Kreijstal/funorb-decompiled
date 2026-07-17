/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends am {
    static nd field_j;
    byte[] field_h;
    static String field_k;
    static double field_i;

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -44) {
            break L0;
          } else {
            field_k = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (fa.field_c < 10) {
              break L2;
            } else {
              if (pb.field_Kb < 13) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public static void a(byte param0) {
        field_j = null;
        field_k = null;
        if (param0 != -52) {
            bc.c(79);
        }
    }

    final static void a(oj param0, int param1, int param2, int param3, byte param4, int param5, int param6, boolean[] param7, double param8, double param9, int[] param10, int param11) {
        RuntimeException var14 = null;
        int var14_int = 0;
        oj var15_ref_oj = null;
        int var15 = 0;
        oc var16_ref_oc = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var23 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            rc.field_e = 0;
            ng.field_u = ng.field_u + 1;
            sg.field_i = sg.field_i + 1;
            var14_int = 0;
            L1: while (true) {
              if (~el.field_j >= ~var14_int) {
                L2: {
                  int discarded$3 = 2;
                  pc.a();
                  var14_int = (int)(((double)param3 + param9) * 24.0 - 320.0);
                  if (param4 == 15) {
                    break L2;
                  } else {
                    bc.a((byte) 30);
                    break L2;
                  }
                }
                L3: {
                  var14_int = var14_int + (int)((double)(-320 + j.field_c) * 0.5);
                  var15 = (int)(((double)param6 + param8) * 24.0 - 240.0);
                  uj.field_p.field_e = (9 * uj.field_p.field_e - -var14_int) / 10;
                  var15 = var15 + (int)(0.5 * (double)(rb.field_m + -240));
                  uj.field_p.field_g = (var15 + uj.field_p.field_g * 9) / 10;
                  if (0 < tb.field_N) {
                    tb.field_N = tb.field_N - 1;
                    uj.field_p.field_e = uj.field_p.field_e + (int)((-0.5 + Math.random()) * 8.0);
                    uj.field_p.field_g = uj.field_p.field_g + (int)(8.0 * (Math.random() - 0.5));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (jf.field_c == 0) {
                    ii.field_d.a((j.field_c - -uj.field_p.field_e) / 24, 8360, (uj.field_p.field_g + rb.field_m) / 24);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var16 = param6 - 25;
                  var17 = 25 + param6;
                  var18 = -30 + param3;
                  if (~var17 > ~param11) {
                    break L5;
                  } else {
                    var17 = param11 + -1;
                    break L5;
                  }
                }
                L6: {
                  var19 = 30 + param3;
                  if (var18 < 0) {
                    var18 = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var16 < 0) {
                    var16 = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1 > var19) {
                    break L8;
                  } else {
                    var19 = -1 + param1;
                    break L8;
                  }
                }
                var21 = var16;
                L9: while (true) {
                  if (var21 >= var17) {
                    L10: {
                      int discarded$4 = 1;
                      sg.a();
                      ac.a(param3, param8, param6, param4 + -5176, param9, param5);
                      hd.a((byte) 61, ii.field_d);
                      int discarded$5 = 0;
                      hd.a(param3, param6, param0, param5);
                      if (null == q.field_g) {
                        break L10;
                      } else {
                        q.field_g.d(-1);
                        break L10;
                      }
                    }
                    break L0;
                  } else {
                    var20 = var18 + param1 * var21;
                    var22 = var18;
                    L11: while (true) {
                      if (~var19 >= ~var22) {
                        var21++;
                        continue L9;
                      } else {
                        L12: {
                          if (!param7[var20]) {
                            if (param10[var20] > 10) {
                              param10[var20] = param10[var20] - 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (param10[var20] >= 26) {
                              break L12;
                            } else {
                              param10[var20] = param10[var20] + 1;
                              break L12;
                            }
                          }
                        }
                        var20++;
                        var22++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                L13: {
                  var15_ref_oj = mm.field_m[var14_int];
                  var16_ref_oc = var15_ref_oj.field_j;
                  var17 = var16_ref_oc.field_e - param3;
                  if (var17 >= 0) {
                    break L13;
                  } else {
                    var17 = -var17;
                    break L13;
                  }
                }
                L14: {
                  var18 = -param6 + var16_ref_oc.field_g;
                  if (var18 >= 0) {
                    break L14;
                  } else {
                    var18 = -var18;
                    break L14;
                  }
                }
                L15: {
                  if (var17 > 53) {
                    break L15;
                  } else {
                    L16: {
                      if (var15_ref_oj.field_i == 30) {
                        break L16;
                      } else {
                        if (40 < var18) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    re.field_n[rc.field_e] = var15_ref_oj;
                    rc.field_e = rc.field_e + 1;
                    break L15;
                  }
                }
                var14_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var14 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var14;
            stackOut_46_1 = new StringBuilder().append("bc.B(");
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L17;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L17;
            }
          }
          L18: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param7 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L18;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L18;
            }
          }
          L19: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44).append(param8).append(44).append(param9).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param10 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L19;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L19;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param11 + 41);
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = HostileSpawn.field_I ? 1 : 0;
          if (vg.field_e != null) {
            break L0;
          } else {
            vg.field_e = new v[]{};
            break L0;
          }
        }
        L1: {
          L2: {
            if (rl.field_c != 0) {
              break L2;
            } else {
              if (bm.field_c == 0) {
                L3: {
                  if (vg.field_e.length <= 0) {
                    break L3;
                  } else {
                    if (sc.field_h == vg.field_e[0].field_k) {
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
                vg.field_e = new v[12];
                var1 = 0;
                int incrementValue$12 = var1;
                var1++;
                vg.field_e[incrementValue$12] = new v(sc.field_h, 1048, 1202, 320, 0);
                int incrementValue$13 = var1;
                var1++;
                vg.field_e[incrementValue$13] = new v(am.field_b, 989, 1151, 256, 1);
                int incrementValue$14 = var1;
                var1++;
                vg.field_e[incrementValue$14] = new v(kh.field_V, 1375, 1225, 192, 2);
                int incrementValue$15 = var1;
                var1++;
                vg.field_e[incrementValue$15] = new v(ki.field_a, 822, 1229, 225, 3, true);
                int incrementValue$16 = var1;
                var1++;
                vg.field_e[incrementValue$16] = new v(ki.field_a, 822, 1229, 225, 4, true);
                int incrementValue$17 = var1;
                var1++;
                vg.field_e[incrementValue$17] = new v(sj.field_d, 1264, 1109, 220, 5, true);
                int incrementValue$18 = var1;
                var1++;
                vg.field_e[incrementValue$18] = new v(jn.field_E, 1352, 500, 180, 10, true);
                int incrementValue$19 = var1;
                var1++;
                vg.field_e[incrementValue$19] = new v(jn.field_E, 1352, 1142, 180, 10);
                int incrementValue$20 = var1;
                var1++;
                vg.field_e[incrementValue$20] = new v(wj.field_G, 1530, 570, 180, 11, true);
                int incrementValue$21 = var1;
                var1++;
                vg.field_e[incrementValue$21] = new v(wj.field_G, 1850, 1104, 200, 12, true);
                int incrementValue$22 = var1;
                var1++;
                vg.field_e[incrementValue$22] = new v(rf.field_q, 2210, 850, 160, 13, true);
                int incrementValue$23 = var1;
                var1++;
                vg.field_e[incrementValue$23] = new v(cl.field_k, 2210, 850, 160, 14, true);
                vg.field_e[-1 + var1].field_h = Math.max(vg.field_e[var1 - 1].field_h, vg.field_e[var1 - 2].field_h);
                break L1;
              } else {
                break L2;
              }
            }
          }
          L4: {
            if (0 != bm.field_c) {
              break L4;
            } else {
              if (rl.field_c == 1) {
                L5: {
                  if (vg.field_e.length <= 0) {
                    break L5;
                  } else {
                    if (md.field_l == vg.field_e[0].field_k) {
                      return;
                    } else {
                      break L5;
                    }
                  }
                }
                vg.field_e = new v[2];
                vg.field_e[0] = new v(md.field_l, 600, 650, 200, true);
                vg.field_e[1] = new v(nm.field_d, 480, 650, 200, true);
                break L1;
              } else {
                break L4;
              }
            }
          }
          L6: {
            if (0 != bm.field_c) {
              break L6;
            } else {
              if (rl.field_c == 3) {
                L7: {
                  if (vg.field_e.length <= 0) {
                    break L7;
                  } else {
                    if (md.field_l != vg.field_e[0].field_k) {
                      break L7;
                    } else {
                      return;
                    }
                  }
                }
                vg.field_e = new v[1];
                vg.field_e[0] = new v(hi.field_m, 1800, 2050, 200, false);
                break L1;
              } else {
                break L6;
              }
            }
          }
          if (0 < vg.field_e.length) {
            vg.field_e = new v[]{};
            break L1;
          } else {
            break L1;
          }
        }
        L8: {
          if (param0 < -77) {
            break L8;
          } else {
            var3 = null;
            bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
            break L8;
          }
        }
    }

    bc(byte[] param0) {
        try {
            ((bc) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "bc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new nd(13, 0, 1, 0);
        field_k = "I will need energy weapons or explosives to get past these turrets.";
    }
}
