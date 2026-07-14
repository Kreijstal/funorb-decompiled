/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends am {
    static nd field_j;
    byte[] field_h;
    static String field_k;
    static double field_i;

    final static boolean d(int param0) {
        if (param0 < -44) {
          if ((fa.field_c ^ -1) <= -11) {
            if ((pb.field_Kb ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_k = null;
          if ((fa.field_c ^ -1) <= -11) {
            if ((pb.field_Kb ^ -1) > -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_k = null;
        if (param0 != -52) {
            bc.c(79);
        }
    }

    final static void a(oj param0, int param1, int param2, int param3, byte param4, int param5, int param6, boolean[] param7, double param8, double param9, int[] param10, int param11) {
        int var14 = 0;
        oj var15_ref_oj = null;
        int var15 = 0;
        oc var16_ref = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        var23 = HostileSpawn.field_I ? 1 : 0;
        rc.field_e = 0;
        ng.field_u = ng.field_u + 1;
        sg.field_i = sg.field_i + 1;
        var14 = 0;
        L0: while (true) {
          L1: {
            if (el.field_j <= var14) {
              break L1;
            } else {
              L2: {
                var15_ref_oj = mm.field_m[var14];
                var16_ref = var15_ref_oj.field_j;
                var17 = var16_ref.field_e - param3;
                if ((var17 ^ -1) <= -1) {
                  break L2;
                } else {
                  var17 = -var17;
                  break L2;
                }
              }
              L3: {
                var18 = -param6 + var16_ref.field_g;
                if (var18 >= 0) {
                  break L3;
                } else {
                  var18 = -var18;
                  break L3;
                }
              }
              L4: {
                if (var17 > 53) {
                  break L4;
                } else {
                  L5: {
                    if (var15_ref_oj.field_i == 30) {
                      break L5;
                    } else {
                      if (40 < var18) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  re.field_n[rc.field_e] = var15_ref_oj;
                  rc.field_e = rc.field_e + 1;
                  break L4;
                }
              }
              var14++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L6: {
            pc.a(2);
            var14 = (int)(((double)param3 + param9) * 24.0 - 320.0);
            if (param4 == 15) {
              break L6;
            } else {
              bc.a((byte) 30);
              break L6;
            }
          }
          L7: {
            var14 = var14 + (int)((double)(-320 + j.field_c) * 0.5);
            var15 = (int)(((double)param6 + param8) * 24.0 - 240.0);
            uj.field_p.field_e = (9 * uj.field_p.field_e - -var14) / 10;
            var15 = var15 + (int)(0.5 * (double)(rb.field_m + -240));
            uj.field_p.field_g = (var15 + uj.field_p.field_g * 9) / 10;
            if (0 < tb.field_N) {
              tb.field_N = tb.field_N - 1;
              uj.field_p.field_e = uj.field_p.field_e + (int)((-0.5 + Math.random()) * 8.0);
              uj.field_p.field_g = uj.field_p.field_g + (int)(8.0 * (Math.random() - 0.5));
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (jf.field_c == 0) {
              ii.field_d.a((j.field_c - -uj.field_p.field_e) / 24, 8360, (uj.field_p.field_g + rb.field_m) / 24);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var16 = param6 - 25;
            var17 = 25 + param6;
            var18 = -30 + param3;
            if (var17 < param11) {
              break L9;
            } else {
              var17 = param11 + -1;
              break L9;
            }
          }
          L10: {
            var19 = 30 + param3;
            if (var18 < 0) {
              var18 = 0;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (var16 < 0) {
              var16 = 0;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (param1 > var19) {
              break L12;
            } else {
              var19 = -1 + param1;
              break L12;
            }
          }
          var21 = var16;
          L13: while (true) {
            L14: {
              if (var21 >= var17) {
                break L14;
              } else {
                var20 = var18 + param1 * var21;
                var22 = var18;
                L15: while (true) {
                  L16: {
                    if (var19 <= var22) {
                      break L16;
                    } else {
                      L17: {
                        L18: {
                          if (!param7[var20]) {
                            break L18;
                          } else {
                            if (param10[var20] >= 26) {
                              break L17;
                            } else {
                              param10[var20] = param10[var20] + 1;
                              if (0 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        if ((param10[var20] ^ -1) < -11) {
                          param10[var20] = param10[var20] - 1;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var20++;
                      var22++;
                      if (0 == 0) {
                        continue L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var21++;
                  if (0 == 0) {
                    continue L13;
                  } else {
                    break L14;
                  }
                }
              }
            }
            sg.a(true);
            ac.a(param3, param8, param6, param4 + -5176, param9, param5);
            hd.a((byte) 61, ii.field_d);
            hd.a(param3, param6, param0, param5, 0);
            if (null == q.field_g) {
              return;
            } else {
              q.field_g.d(-1);
              return;
            }
          }
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
            if (-1 != (rl.field_c ^ -1)) {
              break L2;
            } else {
              if (bm.field_c == 0) {
                if ((vg.field_e.length ^ -1) >= -1) {
                  vg.field_e = new v[12];
                  var1 = 0;
                  var1++;
                  vg.field_e[var1] = new v(sc.field_h, 1048, 1202, 320, 0);
                  var1++;
                  vg.field_e[var1] = new v(am.field_b, 989, 1151, 256, 1);
                  var1++;
                  vg.field_e[var1] = new v(kh.field_V, 1375, 1225, 192, 2);
                  var1++;
                  vg.field_e[var1] = new v(ki.field_a, 822, 1229, 225, 3, true);
                  var1++;
                  vg.field_e[var1] = new v(ki.field_a, 822, 1229, 225, 4, true);
                  var1++;
                  vg.field_e[var1] = new v(sj.field_d, 1264, 1109, 220, 5, true);
                  var1++;
                  vg.field_e[var1] = new v(jn.field_E, 1352, 500, 180, 10, true);
                  var1++;
                  vg.field_e[var1] = new v(jn.field_E, 1352, 1142, 180, 10);
                  var1++;
                  vg.field_e[var1] = new v(wj.field_G, 1530, 570, 180, 11, true);
                  var1++;
                  vg.field_e[var1] = new v(wj.field_G, 1850, 1104, 200, 12, true);
                  var1++;
                  vg.field_e[var1] = new v(rf.field_q, 2210, 850, 160, 13, true);
                  var1++;
                  vg.field_e[var1] = new v(cl.field_k, 2210, 850, 160, 14, true);
                  vg.field_e[-1 + var1].field_h = Math.max(vg.field_e[var1 - 1].field_h, vg.field_e[var1 - 2].field_h);
                  break L1;
                } else {
                  if (sc.field_h != vg.field_e[0].field_k) {
                    vg.field_e = new v[12];
                    var1 = 0;
                    var1++;
                    vg.field_e[var1] = new v(sc.field_h, 1048, 1202, 320, 0);
                    var1++;
                    vg.field_e[var1] = new v(am.field_b, 989, 1151, 256, 1);
                    var1++;
                    vg.field_e[var1] = new v(kh.field_V, 1375, 1225, 192, 2);
                    var1++;
                    vg.field_e[var1] = new v(ki.field_a, 822, 1229, 225, 3, true);
                    var1++;
                    vg.field_e[var1] = new v(ki.field_a, 822, 1229, 225, 4, true);
                    var1++;
                    vg.field_e[var1] = new v(sj.field_d, 1264, 1109, 220, 5, true);
                    var1++;
                    vg.field_e[var1] = new v(jn.field_E, 1352, 500, 180, 10, true);
                    var1++;
                    vg.field_e[var1] = new v(jn.field_E, 1352, 1142, 180, 10);
                    var1++;
                    vg.field_e[var1] = new v(wj.field_G, 1530, 570, 180, 11, true);
                    var1++;
                    vg.field_e[var1] = new v(wj.field_G, 1850, 1104, 200, 12, true);
                    var1++;
                    vg.field_e[var1] = new v(rf.field_q, 2210, 850, 160, 13, true);
                    var1++;
                    vg.field_e[var1] = new v(cl.field_k, 2210, 850, 160, 14, true);
                    vg.field_e[-1 + var1].field_h = Math.max(vg.field_e[var1 - 1].field_h, vg.field_e[var1 - 2].field_h);
                    if (param0 >= -77) {
                      var3 = null;
                      bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0 != bm.field_c) {
              break L3;
            } else {
              if (rl.field_c == 1) {
                if (-1 <= (vg.field_e.length ^ -1)) {
                  vg.field_e = new v[2];
                  vg.field_e[0] = new v(md.field_l, 600, 650, 200, true);
                  vg.field_e[1] = new v(nm.field_d, 480, 650, 200, true);
                  if (param0 < -77) {
                    return;
                  } else {
                    var3 = null;
                    bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
                    return;
                  }
                } else {
                  if (md.field_l != vg.field_e[0].field_k) {
                    vg.field_e = new v[2];
                    vg.field_e[0] = new v(md.field_l, 600, 650, 200, true);
                    vg.field_e[1] = new v(nm.field_d, 480, 650, 200, true);
                    if (param0 < -77) {
                      return;
                    } else {
                      var3 = null;
                      bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (0 != bm.field_c) {
              break L4;
            } else {
              if (rl.field_c == 3) {
                if (vg.field_e.length > 0) {
                  if (md.field_l == vg.field_e[0].field_k) {
                    return;
                  } else {
                    L5: {
                      vg.field_e = new v[1];
                      vg.field_e[0] = new v(hi.field_m, 1800, 2050, 200, false);
                      if (param0 < -77) {
                        break L5;
                      } else {
                        var3 = null;
                        bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  L6: {
                    vg.field_e = new v[1];
                    vg.field_e[0] = new v(hi.field_m, 1800, 2050, 200, false);
                    if (param0 < -77) {
                      break L6;
                    } else {
                      var3 = null;
                      bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                break L4;
              }
            }
          }
          if (0 < vg.field_e.length) {
            L7: {
              vg.field_e = new v[]{};
              if (param0 < -77) {
                break L7;
              } else {
                var3 = null;
                bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
                break L7;
              }
            }
            return;
          } else {
            break L1;
          }
        }
        if (param0 >= -77) {
          var3 = null;
          bc.a((oj) null, -120, 114, -115, (byte) -25, 124, -115, (boolean[]) null, 0.10071681121268564, -0.6069070466002616, (int[]) null, 49);
          return;
        } else {
          return;
        }
    }

    bc(byte[] param0) {
        ((bc) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new nd(13, 0, 1, 0);
        field_k = "I will need energy weapons or explosives to get past these turrets.";
    }
}
