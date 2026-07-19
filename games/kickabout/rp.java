/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends ri {
    static String[] field_y;
    static volatile boolean field_A;
    static int field_w;
    static String field_C;
    static String field_D;
    static tf field_B;
    static byte[] field_x;
    static String[][] field_z;

    final static void a(int param0, int param1) {
        int discarded$2 = 0;
        hn var2 = null;
        if (param0 != 65536) {
          discarded$2 = rp.a(false, -70);
          var2 = new hn(1, new int[]{param1});
          ii.a(var2, 69);
          return;
        } else {
          var2 = new hn(1, new int[]{param1});
          ii.a(var2, 69);
          return;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if ((param0 ^ -1) != -2) {
          if (param2 > -123) {
            return -2;
          } else {
            return sr.field_j[param0];
          }
        } else {
          if (!rd.a(-16143, param1)) {
            if (param2 > -123) {
              return -2;
            } else {
              return sr.field_j[param0];
            }
          } else {
            return 29;
          }
        }
    }

    final static int a(boolean param0, int param1) {
        ff[] discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_60_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_74_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              nq.field_I = nq.field_I + 65536;
              if (param1 == -587) {
                break L1;
              } else {
                discarded$1 = rp.b(-111);
                break L1;
              }
            }
            L2: while (true) {
              if (-65537 < (bd.a(vp.field_a, false, nq.field_I) ^ -1)) {
                L3: {
                  var2_int = -1;
                  if (wo.field_n != null) {
                    var2_int = wo.field_n.length;
                    break L3;
                  } else {
                    if (null == sb.field_b) {
                      break L3;
                    } else {
                      var2_int = sb.field_b.length;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (-1 != var2_int) {
                    L5: {
                      if (vp.field_f <= ig.field_g) {
                        break L5;
                      } else {
                        L6: {
                          ig.field_g = ig.field_g + 1;
                          if (vp.field_c >= ig.field_g) {
                            break L6;
                          } else {
                            L7: {
                              if (wo.field_n == null) {
                                break L7;
                              } else {
                                if (wo.field_n[ps.field_e] != null) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ig.field_g = ig.field_g - 1;
                            break L5;
                          }
                        }
                        if (ig.field_g < vp.field_f) {
                          break L5;
                        } else {
                          if (null != wo.field_n[(ps.field_e - -1) % var2_int]) {
                            break L5;
                          } else {
                            ig.field_g = ig.field_g - 1;
                            break L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (vp.field_f <= ig.field_g) {
                        ig.field_g = ig.field_g - vp.field_f;
                        if (sm.field_m) {
                          ps.field_e = ps.field_e + 1;
                          if (ps.field_e < var2_int) {
                            break L8;
                          } else {
                            ps.field_e = ps.field_e - var2_int;
                            break L8;
                          }
                        } else {
                          ps.field_e = ps.field_e - 1;
                          if (ps.field_e >= 0) {
                            break L8;
                          } else {
                            ps.field_e = ps.field_e + var2_int;
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    if (vp.field_c >= ig.field_g) {
                      break L4;
                    } else {
                      sm.field_m = true;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L9: {
                  if (null != ga.field_E) {
                    L10: {
                      var3 = -(ga.field_E.field_v / 2) + 357;
                      var4 = 0;
                      if (0 == wj.field_A) {
                        break L10;
                      } else {
                        if (vc.field_y <= var3) {
                          break L10;
                        } else {
                          if (ga.field_E.field_w + var3 > vc.field_y) {
                            L11: {
                              if (269 + -ga.field_E.field_q >= sm.field_q) {
                                break L11;
                              } else {
                                if ((sm.field_q ^ -1) <= -270) {
                                  break L11;
                                } else {
                                  sm.field_m = false;
                                  ig.field_g = vp.field_f;
                                  var4 = 1;
                                  break L11;
                                }
                              }
                            }
                            if (-587 <= (sm.field_q ^ -1)) {
                              break L10;
                            } else {
                              if (sm.field_q >= ga.field_E.field_q + 586) {
                                break L10;
                              } else {
                                ig.field_g = vp.field_f;
                                var4 = 1;
                                sm.field_m = true;
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (ig.field_g <= vp.field_c) {
                        break L9;
                      } else {
                        if (var3 >= n.field_m) {
                          break L9;
                        } else {
                          if (var3 - -ga.field_E.field_w > n.field_m) {
                            L12: {
                              if (el.field_A <= 269 - ga.field_E.field_q) {
                                break L12;
                              } else {
                                if (269 > el.field_A) {
                                  ig.field_g = vp.field_c;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if ((el.field_A ^ -1) >= -587) {
                              break L9;
                            } else {
                              if (el.field_A >= ga.field_E.field_q + 586) {
                                break L9;
                              } else {
                                ig.field_g = vp.field_c;
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                if (param0) {
                  L13: {
                    fp.field_l.a(-21174, vp.a(n.field_m, el.field_A, (byte) 98), vp.a(vc.field_y, sm.field_q, (byte) 69));
                    if (!fp.field_l.c(-1)) {
                      break L13;
                    } else {
                      if (fp.field_l.field_e != 0) {
                        if ((fp.field_l.field_e ^ -1) != -2) {
                          break L13;
                        } else {
                          stackOut_60_0 = 2;
                          stackIn_61_0 = stackOut_60_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackOut_57_0 = 3;
                        stackIn_58_0 = stackOut_57_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  stackOut_62_0 = -59;
                  stackIn_64_0 = stackOut_62_0;
                  L14: while (true) {
                    if (!nk.b((byte) stackIn_64_0)) {
                      stackOut_76_0 = 0;
                      stackIn_77_0 = stackOut_76_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L15: {
                        fp.field_l.a(0, true);
                        if (!fp.field_l.c(param1 ^ 586)) {
                          break L15;
                        } else {
                          if (fp.field_l.field_e == 0) {
                            stackOut_68_0 = 3;
                            stackIn_69_0 = stackOut_68_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            if (1 != fp.field_l.field_e) {
                              break L15;
                            } else {
                              stackOut_71_0 = 1;
                              stackIn_72_0 = stackOut_71_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      if (cc.field_e != 13) {
                        stackOut_63_0 = -59;
                        stackIn_64_0 = stackOut_63_0;
                        continue L14;
                      } else {
                        stackOut_74_0 = 1;
                        stackIn_75_0 = stackOut_74_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                nq.field_I = nq.field_I - vp.field_a;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "rp.BA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_58_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_61_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_69_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_72_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_75_0;
                } else {
                  return stackIn_77_0;
                }
              }
            }
          }
        }
    }

    private rp(hu param0, int param1) {
        super(param0, param1);
    }

    final String b(byte param0, fd param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -38) {
                break L1;
              } else {
                field_D = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = ce.a('*', (byte) 48, param1.field_q.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("rp.AA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static ff[] b(int param0) {
        if (param0 != -27666) {
          field_A = true;
          return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
        } else {
          return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
        }
    }

    rp(int param0) {
        this(gf.field_a, param0);
    }

    public static void a(int param0) {
        int discarded$2 = 0;
        field_C = null;
        field_z = (String[][]) null;
        field_y = null;
        field_B = null;
        field_D = null;
        field_x = null;
        if (param0 >= 84) {
          return;
        } else {
          discarded$2 = rp.a(114, -72, -26);
          return;
        }
    }

    static {
        field_y = new String[]{"Timelimit", "Facebook", "Gamemode", "Tournament"};
        field_A = false;
        field_C = "This player did not sell. He remains in your team.";
        field_D = "Computer";
        field_z = new String[][]{new String[]{"000000000000000cf00102040800f300000000000000000000000000000000000", "000000000000000000e1800e1800e100000000000000000000000000000000000", "000000000000000000e1840e18002000000000000000000000000000000000000", "00000000000000000021840e18402100000000000000000000000000000000000"}, new String[]{"000000000000000cf0c0030c0030f300000000000000000000000000000000000", "000000000000000000e1840e18402100000000000000000000000000000000000", "000000000000000000e1030c0030e100000000000000000000000000000000000", "00000000000000000022890a28c02200000000000000000000000000000000000"}};
    }
}
