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
        L0: {
          if (param0 < -44) {
            break L0;
          } else {
            field_k = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((fa.field_c ^ -1) > -11) {
              break L2;
            } else {
              if ((pb.field_Kb ^ -1) > -14) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
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
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var14_int = 0;
        RuntimeException var14 = null;
        int var15 = 0;
        oj var15_ref_oj = null;
        int var16 = 0;
        oc var16_ref_oc = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            rc.field_e = 0;
            ng.field_u = ng.field_u + 1;
            sg.field_i = sg.field_i + 1;
            var14_int = 0;
            L1: while (true) {
              if (el.field_j <= var14_int) {
                L2: {
                  pc.a(2);
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
                  if (-1 == (jf.field_c ^ -1)) {
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
                  if (var17 < param11) {
                    break L5;
                  } else {
                    var17 = param11 + -1;
                    break L5;
                  }
                }
                L6: {
                  var19 = 30 + param3;
                  if (-1 < (var18 ^ -1)) {
                    var18 = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 < (var16 ^ -1)) {
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
                      sg.a(true);
                      ac.a(param3, param8, param6, param4 + -5176, param9, param5);
                      hd.a((byte) 61, ii.field_d);
                      hd.a(param3, param6, param0, param5, 0);
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
                      if (var19 <= var22) {
                        var21++;
                        continue L9;
                      } else {
                        L12: {
                          if (!param7[var20]) {
                            if ((param10[var20] ^ -1) < -11) {
                              param10[var20] = param10[var20] - 1;
                              break L12;
                            } else {
                              break L12;
                            }
                          } else {
                            if (param10[var20] < 26) {
                              param10[var20] = param10[var20] + 1;
                              break L12;
                            } else {
                              var20++;
                              var22++;
                              continue L11;
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
                  if ((var17 ^ -1) <= -1) {
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
                  if ((var17 ^ -1) < -54) {
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
            stackIn_49_0 = (RuntimeException) (var14);

            stackIn_49_1 = new StringBuilder().append("bc.B(");

            if (param0 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "null";
              break L17;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackIn_50_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L18;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L19;
            } else {
              stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L19;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_50_0), stackIn_56_2 + ',' + param11 + ')');
        }
    }

    final static void c(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int var1;
        int var2;
        int[] var3;
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
            if (-1 != (rl.field_c ^ -1)) {
              break L2;
            } else {
              if (bm.field_c == 0) {
                L3: {
                  if ((vg.field_e.length ^ -1) >= -1) {
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
                incrementValue$0 = var1;
                var1++;
                vg.field_e[incrementValue$0] = new v(sc.field_h, 1048, 1202, 320, 0);
                incrementValue$1 = var1;
                var1++;
                vg.field_e[incrementValue$1] = new v(am.field_b, 989, 1151, 256, 1);
                incrementValue$2 = var1;
                var1++;
                vg.field_e[incrementValue$2] = new v(kh.field_V, 1375, 1225, 192, 2);
                incrementValue$3 = var1;
                var1++;
                vg.field_e[incrementValue$3] = new v(ki.field_a, 822, 1229, 225, 3, true);
                incrementValue$4 = var1;
                var1++;
                vg.field_e[incrementValue$4] = new v(ki.field_a, 822, 1229, 225, 4, true);
                incrementValue$5 = var1;
                var1++;
                vg.field_e[incrementValue$5] = new v(sj.field_d, 1264, 1109, 220, 5, true);
                incrementValue$6 = var1;
                var1++;
                vg.field_e[incrementValue$6] = new v(jn.field_E, 1352, 500, 180, 10, true);
                incrementValue$7 = var1;
                var1++;
                vg.field_e[incrementValue$7] = new v(jn.field_E, 1352, 1142, 180, 10);
                incrementValue$8 = var1;
                var1++;
                vg.field_e[incrementValue$8] = new v(wj.field_G, 1530, 570, 180, 11, true);
                incrementValue$9 = var1;
                var1++;
                vg.field_e[incrementValue$9] = new v(wj.field_G, 1850, 1104, 200, 12, true);
                incrementValue$10 = var1;
                var1++;
                vg.field_e[incrementValue$10] = new v(rf.field_q, 2210, 850, 160, 13, true);
                incrementValue$11 = var1;
                var1++;
                vg.field_e[incrementValue$11] = new v(cl.field_k, 2210, 850, 160, 14, true);
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
                  if (-1 <= (vg.field_e.length ^ -1)) {
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
            var3 = (int[]) null;
            bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
            break L8;
          }
        }
    }

    bc(byte[] param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new nd(13, 0, 1, 0);
        field_k = "I will need energy weapons or explosives to get past these turrets.";
    }
}
