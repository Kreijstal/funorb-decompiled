/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tfa extends pp {
    public tfa() {
    }

    final void a(lu param0, byte param1) {
        try {
            super.a(param0, (byte) -57);
            int var3_int = -49 % ((34 - param1) / 58);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tfa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (var3 >= param1.length()) {
                var4 = -97 % ((param0 - -55) / 36);
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (var2_int != param1.charAt(var3)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("tfa.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3_int = 0;
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
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        String[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        String[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_62_2 = null;
        String[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_68_2 = null;
        int stackIn_89_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        String[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        String stackOut_67_2 = null;
        String[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        String stackOut_66_2 = null;
        String[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        String[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        String stackOut_61_2 = null;
        String[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        String stackOut_60_2 = null;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        var9 = BachelorFridge.field_y;
        ub.field_j = param0;
        L0: {
          fr.field_n = true;
          if (ub.field_j == 0) {
            var3_int = ut.a(ec.field_a, wfa.field_s, oa.field_wb, jk.field_o, -125);
            var4 = var3_int + 3;
            fr.field_l = new int[var4];
            mj.field_h = new String[var4];
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                mu.field_l = new int[2];
                var5 = 0;
                L2: while (true) {
                  if (~var5 <= ~var3_int) {
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
            if (ub.field_j == 1) {
              var3_int = ut.a(ec.field_a, wfa.field_s, oa.field_wb, jk.field_o, 125);
              var4 = var3_int + 2;
              fr.field_l = new int[var4];
              mj.field_h = new String[var4];
              var5 = 0;
              L3: while (true) {
                if (~var5 <= ~var4) {
                  mu.field_l = new int[1];
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= var3_int) {
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
                var3_int = ut.a(ec.field_a, wfa.field_s, lga.a(true, new String[1], vv.field_b), jk.field_o, 127);
                var4 = -1;
                var5 = 0;
                L5: while (true) {
                  L6: {
                    if (~var5 <= ~var3_int) {
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
                  if (var4 == -1) {
                    throw new IllegalStateException();
                  } else {
                    vka.field_p = new String[var4];
                    bl.a((Object[]) (Object) ec.field_a, 0, (Object[]) (Object) vka.field_p, 0, var4);
                    wba.field_a = new String[var3_int - var4 + -1];
                    bl.a((Object[]) (Object) ec.field_a, var4 - -1, (Object[]) (Object) wba.field_a, 0, var3_int + -var4 - 1);
                    var3_int = ut.a(ec.field_a, wfa.field_s, lga.a(true, new String[1], sc.field_l), jk.field_o, -54);
                    var4 = -1;
                    var5 = 0;
                    L7: while (true) {
                      L8: {
                        if (var3_int <= var5) {
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
                          ta.field_b = new String[-1 + -var4 + var3_int];
                          bl.a((Object[]) (Object) ec.field_a, 1 + var4, (Object[]) (Object) ta.field_b, 0, -1 + var3_int - var4);
                          if (vka.field_p.length >= mq.field_a.length) {
                            stackOut_50_0 = vka.field_p.length;
                            stackIn_51_0 = stackOut_50_0;
                            break L9;
                          } else {
                            stackOut_49_0 = mq.field_a.length;
                            stackIn_51_0 = stackOut_49_0;
                            break L9;
                          }
                        }
                        L10: {
                          var5 = stackIn_51_0;
                          if (~wba.field_a.length <= ~ta.field_b.length) {
                            stackOut_53_0 = wba.field_a.length;
                            stackIn_54_0 = stackOut_53_0;
                            break L10;
                          } else {
                            stackOut_52_0 = ta.field_b.length;
                            stackIn_54_0 = stackOut_52_0;
                            break L10;
                          }
                        }
                        var6 = stackIn_54_0;
                        var7 = var6 + 7 - -var5;
                        mj.field_h = new String[var7];
                        fr.field_l = new int[var7];
                        var8 = 0;
                        L11: while (true) {
                          if (~var8 <= ~var7) {
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
                                  if (~var8 <= ~var6) {
                                    ph.field_P = f.b((byte) 73);
                                    break L0;
                                  } else {
                                    L14: {
                                      stackOut_65_0 = mj.field_h;
                                      stackOut_65_1 = var8 + 7 + var5;
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      if (ta.field_b.length > var8) {
                                        stackOut_67_0 = (String[]) (Object) stackIn_67_0;
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = ta.field_b[var8];
                                        stackIn_68_0 = stackOut_67_0;
                                        stackIn_68_1 = stackOut_67_1;
                                        stackIn_68_2 = stackOut_67_2;
                                        break L14;
                                      } else {
                                        stackOut_66_0 = (String[]) (Object) stackIn_66_0;
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = "";
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_68_2 = stackOut_66_2;
                                        break L14;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var8++;
                                    continue L13;
                                  }
                                }
                              } else {
                                L15: {
                                  stackOut_59_0 = mj.field_h;
                                  stackOut_59_1 = var8 + 6;
                                  stackIn_61_0 = stackOut_59_0;
                                  stackIn_61_1 = stackOut_59_1;
                                  stackIn_60_0 = stackOut_59_0;
                                  stackIn_60_1 = stackOut_59_1;
                                  if (-var5 + var8 + mq.field_a.length >= 0) {
                                    stackOut_61_0 = (String[]) (Object) stackIn_61_0;
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = mq.field_a[mq.field_a.length + (var8 + -var5)];
                                    stackIn_62_0 = stackOut_61_0;
                                    stackIn_62_1 = stackOut_61_1;
                                    stackIn_62_2 = stackOut_61_2;
                                    break L15;
                                  } else {
                                    stackOut_60_0 = (String[]) (Object) stackIn_60_0;
                                    stackOut_60_1 = stackIn_60_1;
                                    stackOut_60_2 = "";
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_62_1 = stackOut_60_1;
                                    stackIn_62_2 = stackOut_60_2;
                                    break L15;
                                  }
                                }
                                stackIn_62_0[stackIn_62_1] = stackIn_62_2;
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
                    var3_int = ut.a(ec.field_a, wfa.field_s, cn.field_k, jk.field_o, 2);
                    var4 = var3_int + 2;
                    mj.field_h = new String[var4];
                    fr.field_l = new int[var4];
                    var5 = 0;
                    L16: while (true) {
                      if (~var5 <= ~var4) {
                        mu.field_l = new int[1];
                        var5 = 0;
                        L17: while (true) {
                          if (~var5 <= ~var3_int) {
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
                    if (ub.field_j != 5) {
                      throw new IllegalArgumentException();
                    } else {
                      var3_int = ut.a(ec.field_a, wfa.field_s, jia.field_l, jk.field_o, -126);
                      var4 = var3_int + 3;
                      fr.field_l = new int[var4];
                      mj.field_h = new String[var4];
                      var5 = 0;
                      L18: while (true) {
                        if (~var5 <= ~var4) {
                          mu.field_l = new int[2];
                          var5 = 0;
                          L19: while (true) {
                            if (~var5 <= ~var3_int) {
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
                      var3_int = ut.a(ec.field_a, wfa.field_s, qca.field_l, jk.field_o, -10);
                      break L20;
                    } else {
                      var3_int = ut.a(ec.field_a, wfa.field_s, ej.field_o, jk.field_o, -5);
                      break L20;
                    }
                  }
                  var4 = var3_int + 2;
                  fr.field_l = new int[var4];
                  mj.field_h = new String[var4];
                  var5 = 0;
                  L21: while (true) {
                    if (var5 >= var4) {
                      mu.field_l = new int[1];
                      var5 = 0;
                      L22: while (true) {
                        if (var5 >= var3_int) {
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
        var3_int = 0;
        var4 = 0;
        L23: while (true) {
          if (~mj.field_h.length >= ~var4) {
            L24: {
              if (ub.field_j == 2) {
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
                        L27: {
                          var13 = var11[var5];
                          var7 = gg.a(false, -120, var13);
                          if (var7 <= var3_int) {
                            break L27;
                          } else {
                            var3_int = var7;
                            break L27;
                          }
                        }
                        var5++;
                        continue L26;
                      }
                    }
                  } else {
                    L28: {
                      var12 = var10[var5];
                      var7 = gg.a(false, -46, var12);
                      if (var3_int >= var7) {
                        break L28;
                      } else {
                        var3_int = var7;
                        break L28;
                      }
                    }
                    var5++;
                    continue L25;
                  }
                }
              } else {
                break L24;
              }
            }
            io.field_p = mg.field_k - (var3_int >> 1);
            qk.field_l = (um.field_d - -cba.field_d << 1) * dp.field_o.field_e;
            rj.field_i = var3_int + mg.field_k - (var3_int >> 1);
            var4 = 0;
            L29: while (true) {
              if (~mj.field_h.length >= ~var4) {
                ql.field_s = qaa.field_c + -(qk.field_l >> 1);
                a.field_m = new int[mj.field_h.length][];
                var4 = 0;
                var5 = ql.field_s;
                L30: while (true) {
                  if (~mj.field_h.length >= ~var4) {
                    L31: {
                      if (2 == ub.field_j) {
                        dp.field_o.a(param2, 46, -1, -1);
                        break L31;
                      } else {
                        dp.field_o.a(param2, 90, rla.a(mk.field_p, gd.field_m, -127), 0);
                        break L31;
                      }
                    }
                    return;
                  } else {
                    L32: {
                      var6 = fr.field_l[var4];
                      if (0 > var6) {
                        var5 = var5 + mm.field_z;
                        break L32;
                      } else {
                        var7 = gg.a(true, -84, mj.field_h[var4]);
                        var5 = var5 + cba.field_d;
                        var8 = mg.field_k - (var7 >> 1);
                        a.field_m[var4] = new int[4];
                        a.field_m[var4][0] = -vt.field_k + var8;
                        a.field_m[var4][1] = var5;
                        a.field_m[var4][2] = var7 + (vt.field_k << 1);
                        a.field_m[var4][3] = (um.field_d << 1) + hc.field_D;
                        var5 = var5 + (hc.field_D + cba.field_d + (um.field_d << 1));
                        break L32;
                      }
                    }
                    var4++;
                    continue L30;
                  }
                }
              } else {
                L33: {
                  stackOut_106_0 = qk.field_l;
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_107_0 = stackOut_106_0;
                  if (fr.field_l[var4] < 0) {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = mm.field_z;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    break L33;
                  } else {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = hc.field_D;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    break L33;
                  }
                }
                qk.field_l = stackIn_109_0 + stackIn_109_1;
                var4++;
                continue L29;
              }
            }
          } else {
            L34: {
              if (fr.field_l[var4] < 0) {
                stackOut_88_0 = 0;
                stackIn_89_0 = stackOut_88_0;
                break L34;
              } else {
                stackOut_87_0 = 1;
                stackIn_89_0 = stackOut_87_0;
                break L34;
              }
            }
            L35: {
              var5 = gg.a(stackIn_89_0 != 0, -54, mj.field_h[var4]);
              if (var5 <= var3_int) {
                break L35;
              } else {
                var3_int = var5;
                break L35;
              }
            }
            var4++;
            continue L23;
          }
        }
    }

    final void a(aga param0, op param1, int param2) {
        try {
            param1.field_l = true;
            if (param2 != 12) {
                Object var5 = null;
                boolean discarded$0 = tfa.a(-11, (String) null);
            }
            param1.field_F = 0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tfa.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
