/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static fj field_b;
    static int field_c;
    static id[] field_a;

    final static void a(bj param0, byte param1, bj param2) {
        uk.field_xb = param2;
        if (param1 <= 68) {
            im.a(-65);
        }
        wk.field_c = param0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6776) {
            return;
        }
        field_b = null;
    }

    final static boolean a(int[] param0, int param1) {
        long var2 = 0L;
        jn var4_ref_jn = null;
        int var4 = 0;
        int var5_int = 0;
        jn var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MinerDisturbance.field_ab;
        if (qd.field_Q != pb.field_c) {
          return false;
        } else {
          L0: {
            var2 = sf.a((byte) 116);
            if (qc.field_f == param1) {
              break L0;
            } else {
              if (-1 < (qh.field_a ^ -1)) {
                var4_ref_jn = (jn) (Object) mc.field_m.b(74);
                if (var4_ref_jn == null) {
                  break L0;
                } else {
                  if (var2 > var4_ref_jn.field_o) {
                    var4_ref_jn.b(34);
                    rj.field_d = var4_ref_jn.field_s.length;
                    kj.field_a.field_o = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (rj.field_d <= var5_int) {
                        lc.field_s = rd.field_a;
                        rd.field_a = ud.field_a;
                        ud.field_a = oj.field_K;
                        oj.field_K = var4_ref_jn.field_q;
                        return true;
                      } else {
                        kj.field_a.field_u[var5_int] = var4_ref_jn.field_s[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  } else {
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: while (true) {
            L3: {
              if (0 <= qh.field_a) {
                break L3;
              } else {
                kj.field_a.field_o = 0;
                if (!ta.a(param1 ^ 0, 1)) {
                  return false;
                } else {
                  qh.field_a = kj.field_a.e((byte) 0);
                  kj.field_a.field_o = 0;
                  rj.field_d = param0[qh.field_a];
                  break L3;
                }
              }
            }
            if (kj.b(-9319)) {
              if (0 == qc.field_f) {
                lc.field_s = rd.field_a;
                rd.field_a = ud.field_a;
                ud.field_a = oj.field_K;
                oj.field_K = qh.field_a;
                qh.field_a = -1;
                return true;
              } else {
                L4: {
                  var4 = qc.field_f;
                  if (ci.field_k == 0.0) {
                    break L4;
                  } else {
                    var4 = (int)((double)var4 + dk.field_a.nextGaussian() * ci.field_k);
                    if (0 <= var4) {
                      break L4;
                    } else {
                      var4 = 0;
                      break L4;
                    }
                  }
                }
                var5 = new jn((long)var4 + var2, qh.field_a, new byte[rj.field_d]);
                var6 = 0;
                L5: while (true) {
                  if (rj.field_d <= var6) {
                    mc.field_m.a((byte) 50, (pi) (Object) var5);
                    qh.field_a = -1;
                    continue L2;
                  } else {
                    var5.field_s[var6] = kj.field_a.field_u[var6];
                    var6++;
                    continue L5;
                  }
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(byte param0) {
        bd.field_c = sl.e(105);
        if (param0 != 79) {
            return;
        }
        mb.field_b = new hm();
        ie.a(true, true, -57);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var3 = re.a(param2, 0);
          if (param0.indexOf(param2) != param1) {
            break L0;
          } else {
            if (0 != param0.indexOf(var3)) {
              break L0;
            } else {
              L1: {
                L2: {
                  if (param0.startsWith(param2)) {
                    break L2;
                  } else {
                    if (param0.startsWith(var3)) {
                      break L2;
                    } else {
                      if (param0.endsWith(param2)) {
                        break L2;
                      } else {
                        if (!param0.endsWith(var3)) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
              return stackIn_11_0 != 0;
            }
          }
        }
        return true;
    }

    final static sj[] b(int param0) {
        if (param0 <= 103) {
          return null;
        } else {
          return new sj[]{ak.field_b, hj.field_e, li.field_d};
        }
    }

    final static void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sb var16 = null;
        sb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = MinerDisturbance.field_ab;
        var16 = new sb(param1);
        var17 = var16;
        var17.field_o = -2 + param1.length;
        sc.field_d = var17.e(-120);
        db.field_b = new byte[sc.field_d][];
        jk.field_gb = new boolean[sc.field_d];
        oc.field_e = new int[sc.field_d];
        bg.field_d = new int[sc.field_d];
        ng.field_e = new int[sc.field_d];
        qk.field_b = new int[sc.field_d];
        ci.field_a = new byte[sc.field_d][];
        var17.field_o = -(8 * sc.field_d) + param1.length - 7;
        pf.field_c = var17.e(-72);
        wd.field_a = var17.e(-68);
        var3 = 1 + (var17.d((byte) -54) & 255);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (sc.field_d <= var4) {
              break L1;
            } else {
              bg.field_d[var4] = var16.e(-89);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= sc.field_d) {
                break L3;
              } else {
                oc.field_e[var4] = var16.e(-43);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 <= -4) {
                break L4;
              } else {
                field_a = null;
                break L4;
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= sc.field_d) {
                  break L6;
                } else {
                  qk.field_b[var4] = var16.e(-120);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (sc.field_d <= var4) {
                    break L8;
                  } else {
                    ng.field_e[var4] = var16.e(-118);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_o = -(var3 * 3) + (3 + (-(sc.field_d * 8) + param1.length) - 7);
                af.field_p = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        af.field_p[var4] = var16.i(71);
                        if (af.field_p[var4] == 0) {
                          af.field_p[var4] = 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_o = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (sc.field_d <= var4) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = qk.field_b[var4];
                            var6 = ng.field_e[var4];
                            var7 = var5 * var6;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            db.field_b[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            ci.field_a[var4] = var25;
                            var10 = 0;
                            var11 = var17.d((byte) -54);
                            if (-1 != (var11 & 1 ^ -1)) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var7 <= var12) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.m(4);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if ((2 & var11) == 0) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var7 <= var12) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.m(4);
                                          var13 = var16.m(4);
                                          stackOut_34_0 = var10;
                                          stackIn_36_0 = stackOut_34_0;
                                          stackIn_35_0 = stackOut_34_0;
                                          if ((var13 ^ -1) == 0) {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 0;
                                            stackIn_37_0 = stackOut_36_0;
                                            stackIn_37_1 = stackOut_36_1;
                                            break L20;
                                          } else {
                                            stackOut_35_0 = stackIn_35_0;
                                            stackOut_35_1 = 1;
                                            stackIn_37_0 = stackOut_35_0;
                                            stackIn_37_1 = stackOut_35_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_37_0 | stackIn_37_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var12 >= var5) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var13 >= var6) {
                                      break L24;
                                    } else {
                                      var8[var12 - -(var5 * var13)] = var16.m(4);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (-1 != (var11 & 2 ^ -1)) {
                              var12 = 0;
                              L25: while (true) {
                                if (var5 <= var12) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var13 >= var6) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var5 * var13 + var12] = var16.m(4);
                                          var14 = var16.m(4);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (var14 == -1) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L28;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        jk.field_gb[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
    }
}
