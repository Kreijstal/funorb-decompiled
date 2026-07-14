/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tfa extends pp {
    public tfa() {
    }

    final void a(lu param0, byte param1) {
        this.a(param0, (byte) -57);
        int var3 = -49 % ((34 - param1) / 58);
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var5 = BachelorFridge.field_y;
        int var2 = param1.charAt(0);
        for (var3 = 1; var3 < param1.length(); var3++) {
            if (!(var2 == param1.charAt(var3))) {
                return false;
            }
        }
        int var4 = -97 % ((param0 - -55) / 36);
        return true;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        String stackIn_63_2 = null;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        String stackIn_69_2 = null;
        int stackIn_90_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        String stackOut_68_2 = null;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        String stackOut_62_2 = null;
        String[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        String stackOut_61_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        var9 = BachelorFridge.field_y;
        ub.field_j = param0;
        if (param1 == 1) {
          L0: {
            fr.field_n = true;
            if (ub.field_j == -1) {
              var3 = ut.a(ec.field_a, wfa.field_s, oa.field_wb, jk.field_o, -125);
              var4 = var3 + 3;
              fr.field_l = new int[var4];
              mj.field_h = new String[var4];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4) {
                  mu.field_l = new int[2];
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var3) {
                      mj.field_h[-3 + var4] = "";
                      mj.field_h[-2 + var4] = ko.field_h;
                      fr.field_l[var4 - 2] = 0;
                      mu.field_l[0] = 4;
                      mj.field_h[-1 + var4] = ala.field_d;
                      fr.field_l[-1 + var4] = 1;
                      mu.field_l[1] = 5;
                      break L0;
                    } else {
                      mj.field_h[var5] = ec.field_a[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  fr.field_l[var5] = -1;
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (-2 == ub.field_j) {
                var3 = ut.a(ec.field_a, wfa.field_s, oa.field_wb, jk.field_o, 125);
                var4 = var3 + 2;
                fr.field_l = new int[var4];
                mj.field_h = new String[var4];
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var4) {
                    mu.field_l = new int[1];
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var3) {
                        mj.field_h[-2 + var4] = "";
                        mj.field_h[-1 + var4] = ala.field_d;
                        fr.field_l[-1 + var4] = 0;
                        mu.field_l[0] = 5;
                        break L0;
                      } else {
                        mj.field_h[var5] = ec.field_a[var5];
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    fr.field_l[var5] = -1;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if (2 == ub.field_j) {
                  var3 = ut.a(ec.field_a, wfa.field_s, lga.a(true, new String[1], vv.field_b), jk.field_o, param1 ^ 126);
                  var4 = -1;
                  var5 = 0;
                  L5: while (true) {
                    L6: {
                      if (var5 >= var3) {
                        break L6;
                      } else {
                        if ("<%0>".equals((Object) (Object) ec.field_a[var5])) {
                          var4 = var5;
                          break L6;
                        } else {
                          var5++;
                          continue L5;
                        }
                      }
                    }
                    if ((var4 ^ -1) == 0) {
                      throw new IllegalStateException();
                    } else {
                      vka.field_p = new String[var4];
                      bl.a((Object[]) (Object) ec.field_a, 0, (Object[]) (Object) vka.field_p, 0, var4);
                      wba.field_a = new String[var3 - var4 + -1];
                      bl.a((Object[]) (Object) ec.field_a, var4 - -1, (Object[]) (Object) wba.field_a, 0, var3 + -var4 - 1);
                      var3 = ut.a(ec.field_a, wfa.field_s, lga.a(true, new String[1], sc.field_l), jk.field_o, -54);
                      var4 = -1;
                      var5 = 0;
                      L7: while (true) {
                        L8: {
                          if (var3 <= var5) {
                            break L8;
                          } else {
                            if (!"<%0>".equals((Object) (Object) ec.field_a[var5])) {
                              var5++;
                              continue L7;
                            } else {
                              var4 = var5;
                              break L8;
                            }
                          }
                        }
                        if (var4 != -1) {
                          L9: {
                            mq.field_a = new String[var4];
                            bl.a((Object[]) (Object) ec.field_a, 0, (Object[]) (Object) mq.field_a, 0, var4);
                            ta.field_b = new String[-1 + -var4 + var3];
                            bl.a((Object[]) (Object) ec.field_a, 1 + var4, (Object[]) (Object) ta.field_b, 0, -1 + var3 - var4);
                            if (vka.field_p.length >= mq.field_a.length) {
                              stackOut_51_0 = vka.field_p.length;
                              stackIn_52_0 = stackOut_51_0;
                              break L9;
                            } else {
                              stackOut_50_0 = mq.field_a.length;
                              stackIn_52_0 = stackOut_50_0;
                              break L9;
                            }
                          }
                          L10: {
                            var5 = stackIn_52_0;
                            if (wba.field_a.length >= ta.field_b.length) {
                              stackOut_54_0 = wba.field_a.length;
                              stackIn_55_0 = stackOut_54_0;
                              break L10;
                            } else {
                              stackOut_53_0 = ta.field_b.length;
                              stackIn_55_0 = stackOut_53_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_55_0;
                          var7 = var6 + 7 - -var5;
                          mj.field_h = new String[var7];
                          fr.field_l = new int[var7];
                          var8 = 0;
                          L11: while (true) {
                            if (var8 >= var7) {
                              mj.field_h[0] = tla.field_s;
                              fr.field_l[1] = 0;
                              mj.field_h[1] = mja.field_r;
                              mu.field_l = new int[2];
                              mj.field_h[2] = cj.field_g;
                              mu.field_l[0] = 5;
                              mj.field_h[5] = "";
                              fr.field_l[3] = 1;
                              mj.field_h[4] = ck.field_e;
                              mu.field_l[1] = 2;
                              mj.field_h[3] = hk.field_b;
                              var8 = 0;
                              L12: while (true) {
                                if (var5 <= var8) {
                                  mj.field_h[6 + var5] = null;
                                  fr.field_l[6 + var5] = -2;
                                  var8 = 0;
                                  L13: while (true) {
                                    if (var8 >= var6) {
                                      ph.field_P = f.b((byte) 73);
                                      break L0;
                                    } else {
                                      L14: {
                                        stackOut_66_0 = mj.field_h;
                                        stackOut_66_1 = var8 + 7 + var5;
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_67_0 = stackOut_66_0;
                                        stackIn_67_1 = stackOut_66_1;
                                        if (ta.field_b.length > var8) {
                                          stackOut_68_0 = (String[]) (Object) stackIn_68_0;
                                          stackOut_68_1 = stackIn_68_1;
                                          stackOut_68_2 = ta.field_b[var8];
                                          stackIn_69_0 = stackOut_68_0;
                                          stackIn_69_1 = stackOut_68_1;
                                          stackIn_69_2 = stackOut_68_2;
                                          break L14;
                                        } else {
                                          stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                          stackOut_67_1 = stackIn_67_1;
                                          stackOut_67_2 = "";
                                          stackIn_69_0 = stackOut_67_0;
                                          stackIn_69_1 = stackOut_67_1;
                                          stackIn_69_2 = stackOut_67_2;
                                          break L14;
                                        }
                                      }
                                      stackIn_69_0[stackIn_69_1] = (String) (Object) stackIn_69_2;
                                      var8++;
                                      continue L13;
                                    }
                                  }
                                } else {
                                  L15: {
                                    stackOut_60_0 = mj.field_h;
                                    stackOut_60_1 = var8 + 6;
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_62_1 = stackOut_60_1;
                                    stackIn_61_0 = stackOut_60_0;
                                    stackIn_61_1 = stackOut_60_1;
                                    if (-var5 + var8 + mq.field_a.length >= 0) {
                                      stackOut_62_0 = (String[]) (Object) stackIn_62_0;
                                      stackOut_62_1 = stackIn_62_1;
                                      stackOut_62_2 = mq.field_a[mq.field_a.length + (var8 + -var5)];
                                      stackIn_63_0 = stackOut_62_0;
                                      stackIn_63_1 = stackOut_62_1;
                                      stackIn_63_2 = stackOut_62_2;
                                      break L15;
                                    } else {
                                      stackOut_61_0 = (String[]) (Object) stackIn_61_0;
                                      stackOut_61_1 = stackIn_61_1;
                                      stackOut_61_2 = "";
                                      stackIn_63_0 = stackOut_61_0;
                                      stackIn_63_1 = stackOut_61_1;
                                      stackIn_63_2 = stackOut_61_2;
                                      break L15;
                                    }
                                  }
                                  stackIn_63_0[stackIn_63_1] = (String) (Object) stackIn_63_2;
                                  var8++;
                                  continue L12;
                                }
                              }
                            } else {
                              fr.field_l[var8] = -1;
                              var8++;
                              continue L11;
                            }
                          }
                        } else {
                          throw new IllegalStateException();
                        }
                      }
                    }
                  }
                } else {
                  if (ub.field_j != 3) {
                    if (ub.field_j == 4) {
                      var3 = ut.a(ec.field_a, wfa.field_s, cn.field_k, jk.field_o, 2);
                      var4 = var3 + 2;
                      mj.field_h = new String[var4];
                      fr.field_l = new int[var4];
                      var5 = 0;
                      L16: while (true) {
                        if (var5 >= var4) {
                          mu.field_l = new int[1];
                          var5 = 0;
                          L17: while (true) {
                            if (var5 >= var3) {
                              mj.field_h[var4 - 2] = "";
                              mj.field_h[-1 + var4] = ala.field_d;
                              fr.field_l[-1 + var4] = 0;
                              mu.field_l[0] = 5;
                              break L0;
                            } else {
                              mj.field_h[var5] = ec.field_a[var5];
                              var5++;
                              continue L17;
                            }
                          }
                        } else {
                          fr.field_l[var5] = -1;
                          var5++;
                          continue L16;
                        }
                      }
                    } else {
                      if ((ub.field_j ^ -1) != -6) {
                        throw new IllegalArgumentException();
                      } else {
                        var3 = ut.a(ec.field_a, wfa.field_s, jia.field_l, jk.field_o, -126);
                        var4 = var3 + 3;
                        fr.field_l = new int[var4];
                        mj.field_h = new String[var4];
                        var5 = 0;
                        L18: while (true) {
                          if (var5 >= var4) {
                            mu.field_l = new int[2];
                            var5 = 0;
                            L19: while (true) {
                              if (var5 >= var3) {
                                mj.field_h[var4 - 3] = "";
                                mj.field_h[var4 - 2] = ifa.field_p;
                                fr.field_l[-2 + var4] = 0;
                                mu.field_l[0] = 3;
                                mj.field_h[-1 + var4] = ala.field_d;
                                fr.field_l[-1 + var4] = 1;
                                mu.field_l[1] = 5;
                                break L0;
                              } else {
                                mj.field_h[var5] = ec.field_a[var5];
                                var5++;
                                continue L19;
                              }
                            }
                          } else {
                            fr.field_l[var5] = -1;
                            var5++;
                            continue L18;
                          }
                        }
                      }
                    }
                  } else {
                    L20: {
                      if (!ju.field_r.field_k) {
                        var3 = ut.a(ec.field_a, wfa.field_s, qca.field_l, jk.field_o, -10);
                        break L20;
                      } else {
                        var3 = ut.a(ec.field_a, wfa.field_s, ej.field_o, jk.field_o, -5);
                        break L20;
                      }
                    }
                    var4 = var3 + 2;
                    fr.field_l = new int[var4];
                    mj.field_h = new String[var4];
                    var5 = 0;
                    L21: while (true) {
                      if (var5 >= var4) {
                        mu.field_l = new int[1];
                        var5 = 0;
                        L22: while (true) {
                          if (var5 >= var3) {
                            mj.field_h[var4 - 2] = "";
                            mj.field_h[-1 + var4] = ala.field_d;
                            fr.field_l[var4 + -1] = 0;
                            mu.field_l[0] = 5;
                            break L0;
                          } else {
                            mj.field_h[var5] = ec.field_a[var5];
                            var5++;
                            continue L22;
                          }
                        }
                      } else {
                        fr.field_l[var5] = -1;
                        var5++;
                        continue L21;
                      }
                    }
                  }
                }
              }
            }
          }
          dp.field_o.field_e = mu.field_l.length;
          var3 = 0;
          var4 = 0;
          L23: while (true) {
            if (mj.field_h.length <= var4) {
              L24: {
                if (-3 == (ub.field_j ^ -1)) {
                  var10 = vka.field_p;
                  var5 = 0;
                  L25: while (true) {
                    if (var5 >= var10.length) {
                      var11 = wba.field_a;
                      var5 = 0;
                      L26: while (true) {
                        if (var11.length <= var5) {
                          break L24;
                        } else {
                          var13 = var11[var5];
                          var7 = gg.a(false, -120, var13);
                          if (var7 > var3) {
                            var3 = var7;
                            var5++;
                            continue L26;
                          } else {
                            var5++;
                            continue L26;
                          }
                        }
                      }
                    } else {
                      var12 = var10[var5];
                      var7 = gg.a(false, -46, var12);
                      if (var3 < var7) {
                        var3 = var7;
                        var5++;
                        continue L25;
                      } else {
                        var5++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  break L24;
                }
              }
              io.field_p = mg.field_k - (var3 >> 1207557569);
              qk.field_l = (um.field_d - -cba.field_d << -1413306943) * dp.field_o.field_e;
              rj.field_i = var3 + mg.field_k - (var3 >> 1852205729);
              var4 = 0;
              L27: while (true) {
                if (mj.field_h.length <= var4) {
                  ql.field_s = qaa.field_c + -(qk.field_l >> 1075244961);
                  a.field_m = new int[mj.field_h.length][];
                  var4 = 0;
                  var5 = ql.field_s;
                  L28: while (true) {
                    if (mj.field_h.length <= var4) {
                      L29: {
                        if (2 == ub.field_j) {
                          dp.field_o.a(param2, 46, -1, -1);
                          break L29;
                        } else {
                          dp.field_o.a(param2, 90, rla.a(mk.field_p, gd.field_m, param1 ^ -128), 0);
                          break L29;
                        }
                      }
                      return;
                    } else {
                      var6 = fr.field_l[var4];
                      if (0 > var6) {
                        var5 = var5 + mm.field_z;
                        var4++;
                        continue L28;
                      } else {
                        var7 = gg.a(true, -84, mj.field_h[var4]);
                        var5 = var5 + cba.field_d;
                        var8 = mg.field_k - (var7 >> 222605505);
                        a.field_m[var4] = new int[4];
                        a.field_m[var4][0] = -vt.field_k + var8;
                        a.field_m[var4][1] = var5;
                        a.field_m[var4][2] = var7 + (vt.field_k << -1216963487);
                        a.field_m[var4][3] = (um.field_d << -134638847) + hc.field_D;
                        var5 = var5 + (hc.field_D + cba.field_d + (um.field_d << -1593852575));
                        var4++;
                        continue L28;
                      }
                    }
                  }
                } else {
                  L30: {
                    stackOut_107_0 = qk.field_l;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_108_0 = stackOut_107_0;
                    if (-1 < (fr.field_l[var4] ^ -1)) {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = mm.field_z;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      break L30;
                    } else {
                      stackOut_108_0 = stackIn_108_0;
                      stackOut_108_1 = hc.field_D;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      break L30;
                    }
                  }
                  qk.field_l = stackIn_110_0 + stackIn_110_1;
                  var4++;
                  continue L27;
                }
              }
            } else {
              L31: {
                if (-1 < (fr.field_l[var4] ^ -1)) {
                  stackOut_89_0 = 0;
                  stackIn_90_0 = stackOut_89_0;
                  break L31;
                } else {
                  stackOut_88_0 = 1;
                  stackIn_90_0 = stackOut_88_0;
                  break L31;
                }
              }
              var5 = gg.a(stackIn_90_0 != 0, -54, mj.field_h[var4]);
              if (var5 > var3) {
                var3 = var5;
                var4++;
                continue L23;
              } else {
                var4++;
                continue L23;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(aga param0, op param1, int param2) {
        param1.field_l = true;
        if (param2 != 12) {
            Object var5 = null;
            boolean discarded$0 = tfa.a(-11, (String) null);
        }
        param1.field_F = 0;
    }

    static {
    }
}
