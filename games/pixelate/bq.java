/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq {
    static bb field_a;
    static bb field_b;
    static int field_d;
    static int field_c;

    final static void a(boolean param0, byte param1, int param2) {
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        String[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        String stackIn_34_2 = null;
        String[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        String stackIn_41_2 = null;
        int stackIn_89_0 = 0;
        String stackIn_89_1 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              sm.field_l = true;
              ha.field_h = param2;
              if (-1 == (ha.field_h ^ -1)) {
                var3_int = qn.a(l.field_t, wb.field_c, kc.field_p, -128, bg.field_j);
                var4 = var3_int + 3;
                fo.field_a = new int[var4];
                vm.field_e = new String[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    jj.field_h = new int[2];
                    var5 = 0;
                    L3: while (true) {
                      if (var3_int <= var5) {
                        vm.field_e[-3 + var4] = "";
                        vm.field_e[var4 + -2] = ln.field_k;
                        fo.field_a[-2 + var4] = 0;
                        jj.field_h[0] = 4;
                        vm.field_e[-1 + var4] = od.field_Hb;
                        fo.field_a[-1 + var4] = 1;
                        jj.field_h[1] = 5;
                        break L1;
                      } else {
                        vm.field_e[var5] = kc.field_p[var5];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    fo.field_a[var5] = -1;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                if (-2 == (ha.field_h ^ -1)) {
                  var3_int = qn.a(l.field_t, wb.field_c, kc.field_p, -102, bg.field_j);
                  var4 = 2 - -var3_int;
                  fo.field_a = new int[var4];
                  vm.field_e = new String[var4];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var4) {
                      jj.field_h = new int[1];
                      var5 = 0;
                      L5: while (true) {
                        if (var5 >= var3_int) {
                          vm.field_e[-2 + var4] = "";
                          vm.field_e[-1 + var4] = od.field_Hb;
                          fo.field_a[-1 + var4] = 0;
                          jj.field_h[0] = 5;
                          break L1;
                        } else {
                          vm.field_e[var5] = kc.field_p[var5];
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      fo.field_a[var5] = -1;
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  if ((ha.field_h ^ -1) != -3) {
                    if (3 == ha.field_h) {
                      L6: {
                        if (!mc.field_k.field_x) {
                          var3_int = qn.a(mn.field_a, wb.field_c, kc.field_p, -120, bg.field_j);
                          break L6;
                        } else {
                          var3_int = qn.a(el.field_c, wb.field_c, kc.field_p, -115, bg.field_j);
                          break L6;
                        }
                      }
                      var4 = 2 - -var3_int;
                      fo.field_a = new int[var4];
                      vm.field_e = new String[var4];
                      var5 = 0;
                      L7: while (true) {
                        if (var5 >= var4) {
                          jj.field_h = new int[1];
                          var5 = 0;
                          L8: while (true) {
                            if (var5 >= var3_int) {
                              vm.field_e[var4 - 2] = "";
                              vm.field_e[var4 - 1] = od.field_Hb;
                              fo.field_a[var4 - 1] = 0;
                              jj.field_h[0] = 5;
                              break L1;
                            } else {
                              vm.field_e[var5] = kc.field_p[var5];
                              var5++;
                              continue L8;
                            }
                          }
                        } else {
                          fo.field_a[var5] = -1;
                          var5++;
                          continue L7;
                        }
                      }
                    } else {
                      if ((ha.field_h ^ -1) == -5) {
                        var3_int = qn.a(l.field_o, wb.field_c, kc.field_p, -118, bg.field_j);
                        var4 = 2 + var3_int;
                        vm.field_e = new String[var4];
                        fo.field_a = new int[var4];
                        var5 = 0;
                        L9: while (true) {
                          if (var4 <= var5) {
                            jj.field_h = new int[1];
                            var5 = 0;
                            L10: while (true) {
                              if (var5 >= var3_int) {
                                vm.field_e[-2 + var4] = "";
                                vm.field_e[-1 + var4] = od.field_Hb;
                                fo.field_a[var4 - 1] = 0;
                                jj.field_h[0] = 5;
                                break L1;
                              } else {
                                vm.field_e[var5] = kc.field_p[var5];
                                var5++;
                                continue L10;
                              }
                            }
                          } else {
                            fo.field_a[var5] = -1;
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        if ((ha.field_h ^ -1) != -6) {
                          throw new IllegalArgumentException();
                        } else {
                          var3_int = qn.a(ha.field_k, wb.field_c, kc.field_p, -118, bg.field_j);
                          var4 = var3_int + 3;
                          fo.field_a = new int[var4];
                          vm.field_e = new String[var4];
                          var5 = 0;
                          L11: while (true) {
                            if (var4 <= var5) {
                              jj.field_h = new int[2];
                              var5 = 0;
                              L12: while (true) {
                                if (var5 >= var3_int) {
                                  vm.field_e[var4 + -3] = "";
                                  vm.field_e[var4 + -2] = bg.field_b;
                                  fo.field_a[var4 + -2] = 0;
                                  jj.field_h[0] = 3;
                                  vm.field_e[var4 - 1] = od.field_Hb;
                                  fo.field_a[-1 + var4] = 1;
                                  jj.field_h[1] = 5;
                                  break L1;
                                } else {
                                  vm.field_e[var5] = kc.field_p[var5];
                                  var5++;
                                  continue L12;
                                }
                              }
                            } else {
                              fo.field_a[var5] = -1;
                              var5++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3_int = qn.a(sd.a(lm.field_n, 84, new String[]{"<br><%0><br>"}), wb.field_c, kc.field_p, -128, bg.field_j);
                    var4 = -1;
                    var5 = 0;
                    L13: while (true) {
                      L14: {
                        if (var5 >= var3_int) {
                          break L14;
                        } else {
                          if ("<%0>".equals(kc.field_p[var5])) {
                            var4 = var5;
                            break L14;
                          } else {
                            var5++;
                            continue L13;
                          }
                        }
                      }
                      if (var4 != -1) {
                        df.field_r = new String[var4];
                        qb.a(kc.field_p, 0, df.field_r, 0, var4);
                        uk.field_r = new String[-1 + (var3_int - var4)];
                        qb.a(kc.field_p, var4 - -1, uk.field_r, 0, var3_int + (-var4 - 1));
                        var3_int = qn.a(sd.a(oj.field_R, 44, new String[]{"<br><%0><br>"}), wb.field_c, kc.field_p, -106, bg.field_j);
                        var4 = -1;
                        var5 = 0;
                        L15: while (true) {
                          L16: {
                            if (var5 >= var3_int) {
                              break L16;
                            } else {
                              if (!"<%0>".equals(kc.field_p[var5])) {
                                var5++;
                                continue L15;
                              } else {
                                var4 = var5;
                                break L16;
                              }
                            }
                          }
                          if (0 == (var4 ^ -1)) {
                            throw new IllegalStateException();
                          } else {
                            L17: {
                              jk.field_d = new String[var4];
                              qb.a(kc.field_p, 0, jk.field_d, 0, var4);
                              hb.field_jb = new String[-var4 + (var3_int - 1)];
                              qb.a(kc.field_p, 1 + var4, hb.field_jb, 0, -1 + (-var4 + var3_int));
                              if (df.field_r.length < jk.field_d.length) {
                                stackIn_23_0 = jk.field_d.length;
                                break L17;
                              } else {
                                stackIn_23_0 = df.field_r.length;
                                break L17;
                              }
                            }
                            L18: {
                              var5 = stackIn_23_0;
                              if (uk.field_r.length >= hb.field_jb.length) {
                                stackIn_26_0 = uk.field_r.length;
                                break L18;
                              } else {
                                stackIn_26_0 = hb.field_jb.length;
                                break L18;
                              }
                            }
                            var6 = stackIn_26_0;
                            var7 = var5 + (7 + var6);
                            fo.field_a = new int[var7];
                            vm.field_e = new String[var7];
                            var8 = 0;
                            L19: while (true) {
                              if (var7 <= var8) {
                                fo.field_a[1] = 0;
                                vm.field_e[0] = vf.field_c;
                                vm.field_e[1] = sn.field_q;
                                jj.field_h = new int[2];
                                vm.field_e[4] = bh.field_m;
                                vm.field_e[5] = "";
                                fo.field_a[3] = 1;
                                vm.field_e[3] = vm.field_g;
                                vm.field_e[2] = u.field_n;
                                jj.field_h[1] = 2;
                                jj.field_h[0] = 5;
                                var8 = 0;
                                L20: while (true) {
                                  if (var8 >= var5) {
                                    vm.field_e[6 + var5] = null;
                                    fo.field_a[6 - -var5] = -2;
                                    var8 = 0;
                                    L21: while (true) {
                                      if (var6 <= var8) {
                                        pk.field_g = hm.a(64);
                                        break L1;
                                      } else {
                                        stackIn_38_0 = vm.field_e;
                                        stackIn_38_1 = var8 + var5 + 7;
                                        stackIn_38_2 = hb.field_jb.length ^ -1;
                                        stackIn_38_3 = var8 ^ -1;
                                        L22: {




                                          if (stackIn_38_2 >= stackIn_38_3) {
                                            stackIn_38_0 = (String[]) ((Object) stackIn_38_0);

                                            stackIn_41_2 = "";
                                            break L22;
                                          } else {
                                            stackIn_38_0 = (String[]) ((Object) stackIn_38_0);

                                            stackIn_41_2 = hb.field_jb[var8];
                                            break L22;
                                          }
                                        }
                                        stackIn_38_0[stackIn_38_1] = stackIn_41_2;
                                        var8++;
                                        continue L21;
                                      }
                                    }
                                  } else {
                                    L23: {
                                      stackIn_33_0 = vm.field_e;

                                      stackIn_33_1 = 6 + var8;

                                      if ((-var5 + var8 + jk.field_d.length ^ -1) <= -1) {
                                        stackIn_34_0 = (String[]) ((Object) stackIn_33_0);
                                        stackIn_34_1 = stackIn_33_1;
                                        stackIn_34_2 = jk.field_d[-var5 + (jk.field_d.length + var8)];
                                        break L23;
                                      } else {
                                        stackIn_34_0 = (String[]) ((Object) stackIn_33_0);
                                        stackIn_34_1 = stackIn_33_1;
                                        stackIn_34_2 = "";
                                        break L23;
                                      }
                                    }
                                    stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                                    var8++;
                                    continue L20;
                                  }
                                }
                              } else {
                                fo.field_a[var8] = -1;
                                var8++;
                                continue L19;
                              }
                            }
                          }
                        }
                      } else {
                        throw new IllegalStateException();
                      }
                    }
                  }
                }
              }
            }
            mj.field_c.field_h = jj.field_h.length;
            var3_int = 0;
            var4 = 0;
            L24: while (true) {
              if (var4 >= vm.field_e.length) {
                L25: {
                  if (-3 != (ha.field_h ^ -1)) {
                    break L25;
                  } else {
                    var10 = df.field_r;
                    var4_ref_String__ = var10;
                    var5 = 0;
                    L26: while (true) {
                      if (var5 >= var10.length) {
                        var4_ref_String__ = uk.field_r;
                        var5 = 0;
                        L27: while (true) {
                          if (var4_ref_String__.length <= var5) {
                            break L25;
                          } else {
                            var12 = var4_ref_String__[var5];
                            var7 = sb.a(3, var12, false);
                            if ((var3_int ^ -1) > (var7 ^ -1)) {
                              var3_int = var7;
                              var5++;
                              continue L27;
                            } else {
                              var5++;
                              continue L27;
                            }
                          }
                        }
                      } else {
                        var11 = var10[var5];
                        var7 = sb.a(3, var11, false);
                        if (var7 > var3_int) {
                          var3_int = var7;
                          var5++;
                          continue L26;
                        } else {
                          var5++;
                          continue L26;
                        }
                      }
                    }
                  }
                }
                if (param1 < -64) {
                  ib.field_g = -(var3_int >> 108480865) + var3_int + qe.field_u;
                  wb.field_b = (ko.field_fb + bd.field_c << 1764655297) * mj.field_c.field_h;
                  ko.field_cb = -(var3_int >> -1223192575) + qe.field_u;
                  var4 = 0;
                  L28: while (true) {
                    if (var4 >= vm.field_e.length) {
                      de.field_h = bb.field_b + -(wb.field_b >> 2114782401);
                      so.field_c = new int[vm.field_e.length][];
                      var4 = 0;
                      var5 = de.field_h;
                      L29: while (true) {
                        if (var4 >= vm.field_e.length) {
                          L30: {
                            if (-3 != (ha.field_h ^ -1)) {
                              mj.field_c.a(param0, mi.a(uf.field_d, bg.field_k, (byte) -97), 17068, 0);
                              break L30;
                            } else {
                              mj.field_c.a(param0, -1, 17068, -1);
                              break L30;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L31: {
                            var6 = fo.field_a[var4];
                            if (var6 < 0) {
                              var5 = var5 + hq.field_r;
                              break L31;
                            } else {
                              var7 = sb.a(3, vm.field_e[var4], true);
                              var8 = -(var7 >> 1032852001) + qe.field_u;
                              var5 = var5 + ko.field_fb;
                              so.field_c[var4] = new int[4];
                              so.field_c[var4][0] = var8 - hc.field_J;
                              so.field_c[var4][1] = var5;
                              so.field_c[var4][2] = (hc.field_J << -1545818943) + var7;
                              var5 = var5 + (gk.field_fb + (bd.field_c << 1198797921) + ko.field_fb);
                              so.field_c[var4][3] = (bd.field_c << -125118111) + gk.field_fb;
                              break L31;
                            }
                          }
                          var4++;
                          continue L29;
                        }
                      }
                    } else {
                      L32: {
                        stackIn_111_0 = wb.field_b;

                        if (-1 < (fo.field_a[var4] ^ -1)) {
                          stackIn_112_0 = stackIn_111_0;
                          stackIn_112_1 = hq.field_r;
                          break L32;
                        } else {
                          stackIn_112_0 = stackIn_111_0;
                          stackIn_112_1 = gk.field_fb;
                          break L32;
                        }
                      }
                      wb.field_b = stackIn_112_0 + stackIn_112_1;
                      var4++;
                      continue L28;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L33: {
                  stackIn_89_0 = 3;

                  stackIn_89_1 = vm.field_e[var4];

                  if ((fo.field_a[var4] ^ -1) > -1) {
                    stackIn_90_0 = stackIn_89_0;
                    stackIn_90_1 = (String) ((Object) stackIn_89_1);
                    stackIn_90_2 = 0;
                    break L33;
                  } else {
                    stackIn_90_0 = stackIn_89_0;
                    stackIn_90_1 = (String) ((Object) stackIn_89_1);
                    stackIn_90_2 = 1;
                    break L33;
                  }
                }
                L34: {
                  var5 = sb.a(stackIn_90_0, stackIn_90_1, stackIn_90_2 != 0);
                  if (var3_int < var5) {
                    var3_int = var5;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                var4++;
                continue L24;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "bq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (param0 != -124) {
            bq.a((byte) -16);
        }
        if (!(!tm.a((byte) 117))) {
            vd.a(param3, param1, param4, (byte) -86);
            if (null != eg.field_n) {
                if (!(!eg.field_n.a(param4, param6, false, param5, param3))) {
                    jp.a(71);
                    param3 = false;
                }
            }
            sm.a(param4, param3, 0);
            gb.a((byte) 120, param3, param2);
            param3 = false;
        }
        return param3;
    }

    public static void a(byte param0) {
        int var1 = 60 % ((param0 - 61) / 61);
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new bb();
    }
}
