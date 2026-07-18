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
        hn var2 = new hn(1, new int[1]);
        ii.a(var2, 69);
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 == 1) {
          if (!rd.a(-16143, param1)) {
            return sr.field_j[param0];
          } else {
            return 29;
          }
        } else {
          return sr.field_j[param0];
        }
    }

    final static int a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_59_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_73_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            nq.field_I = nq.field_I + 65536;
            L1: while (true) {
              if (bd.a(vp.field_a, false, nq.field_I) < 65536) {
                L2: {
                  var2_int = -1;
                  if (wo.field_n != null) {
                    var2_int = wo.field_n.length;
                    break L2;
                  } else {
                    if (null == sb.field_b) {
                      break L2;
                    } else {
                      var2_int = sb.field_b.length;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 != var2_int) {
                    L4: {
                      if (~vp.field_f >= ~ig.field_g) {
                        break L4;
                      } else {
                        L5: {
                          ig.field_g = ig.field_g + 1;
                          if (~vp.field_c <= ~ig.field_g) {
                            break L5;
                          } else {
                            L6: {
                              if (wo.field_n == null) {
                                break L6;
                              } else {
                                if (wo.field_n[ps.field_e] != null) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            ig.field_g = ig.field_g - 1;
                            break L4;
                          }
                        }
                        if (~ig.field_g > ~vp.field_f) {
                          break L4;
                        } else {
                          if (null != wo.field_n[(ps.field_e - -1) % var2_int]) {
                            break L4;
                          } else {
                            ig.field_g = ig.field_g - 1;
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (~vp.field_f >= ~ig.field_g) {
                        ig.field_g = ig.field_g - vp.field_f;
                        if (sm.field_m) {
                          ps.field_e = ps.field_e + 1;
                          if (~ps.field_e > ~var2_int) {
                            break L7;
                          } else {
                            ps.field_e = ps.field_e - var2_int;
                            break L7;
                          }
                        } else {
                          ps.field_e = ps.field_e - 1;
                          if (ps.field_e >= 0) {
                            break L7;
                          } else {
                            ps.field_e = ps.field_e + var2_int;
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (~vp.field_c <= ~ig.field_g) {
                      break L3;
                    } else {
                      sm.field_m = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L8: {
                  if (null != ga.field_E) {
                    L9: {
                      var3 = -(ga.field_E.field_v / 2) + 357;
                      var4 = 0;
                      if (0 == wj.field_A) {
                        break L9;
                      } else {
                        if (vc.field_y <= var3) {
                          break L9;
                        } else {
                          if (~(ga.field_E.field_w + var3) < ~vc.field_y) {
                            L10: {
                              if (~(269 + -ga.field_E.field_q) <= ~sm.field_q) {
                                break L10;
                              } else {
                                if (sm.field_q >= 269) {
                                  break L10;
                                } else {
                                  sm.field_m = false;
                                  ig.field_g = vp.field_f;
                                  var4 = 1;
                                  break L10;
                                }
                              }
                            }
                            if (sm.field_q <= 586) {
                              break L9;
                            } else {
                              if (sm.field_q >= ga.field_E.field_q + 586) {
                                break L9;
                              } else {
                                ig.field_g = vp.field_f;
                                var4 = 1;
                                sm.field_m = true;
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L8;
                    } else {
                      if (ig.field_g <= vp.field_c) {
                        break L8;
                      } else {
                        if (~var3 <= ~n.field_m) {
                          break L8;
                        } else {
                          if (var3 - -ga.field_E.field_w > n.field_m) {
                            L11: {
                              if (~el.field_A >= ~(269 - ga.field_E.field_q)) {
                                break L11;
                              } else {
                                if (269 > el.field_A) {
                                  ig.field_g = vp.field_c;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (el.field_A <= 586) {
                              break L8;
                            } else {
                              if (el.field_A >= ga.field_E.field_q + 586) {
                                break L8;
                              } else {
                                ig.field_g = vp.field_c;
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                if (param0) {
                  L12: {
                    fp.field_l.a(-21174, vp.a(n.field_m, el.field_A, (byte) 98), vp.a(vc.field_y, sm.field_q, (byte) 69));
                    if (!fp.field_l.c(-1)) {
                      break L12;
                    } else {
                      if (fp.field_l.field_e != 0) {
                        if (fp.field_l.field_e != 1) {
                          break L12;
                        } else {
                          stackOut_59_0 = 2;
                          stackIn_60_0 = stackOut_59_0;
                          return stackIn_60_0;
                        }
                      } else {
                        stackOut_56_0 = 3;
                        stackIn_57_0 = stackOut_56_0;
                        return stackIn_57_0;
                      }
                    }
                  }
                  stackOut_61_0 = -59;
                  stackIn_63_0 = stackOut_61_0;
                  L13: while (true) {
                    if (!nk.b((byte) stackIn_63_0)) {
                      stackOut_75_0 = 0;
                      stackIn_76_0 = stackOut_75_0;
                      break L0;
                    } else {
                      L14: {
                        fp.field_l.a(0, true);
                        if (!fp.field_l.c(-1)) {
                          break L14;
                        } else {
                          if (fp.field_l.field_e == 0) {
                            stackOut_67_0 = 3;
                            stackIn_68_0 = stackOut_67_0;
                            return stackIn_68_0;
                          } else {
                            if (1 != fp.field_l.field_e) {
                              break L14;
                            } else {
                              stackOut_70_0 = 1;
                              stackIn_71_0 = stackOut_70_0;
                              return stackIn_71_0;
                            }
                          }
                        }
                      }
                      if (cc.field_e != 13) {
                        stackOut_62_0 = -59;
                        stackIn_63_0 = stackOut_62_0;
                        continue L13;
                      } else {
                        stackOut_73_0 = 1;
                        stackIn_74_0 = stackOut_73_0;
                        return stackIn_74_0;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                nq.field_I = nq.field_I - vp.field_a;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "rp.BA(" + param0 + ',' + -587 + ')');
        }
        return stackIn_76_0;
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
                field_D = null;
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("rp.AA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static ff[] b(int param0) {
        return new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
    }

    rp(int param0) {
        this(gf.field_a, param0);
    }

    public static void a() {
        field_C = null;
        field_z = null;
        field_y = null;
        field_B = null;
        field_D = null;
        field_x = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{"Timelimit", "Facebook", "Gamemode", "Tournament"};
        field_A = false;
        field_C = "This player did not sell. He remains in your team.";
        field_D = "Computer";
        field_z = new String[][]{new String[4], new String[4]};
    }
}
