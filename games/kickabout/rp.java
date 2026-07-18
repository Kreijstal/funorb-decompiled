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
        hn var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 65536) {
                break L1;
              } else {
                int discarded$2 = rp.a(false, -70);
                break L1;
              }
            }
            var2 = new hn(1, new int[1]);
            ii.a(var2, 69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "rp.T(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 != 1) {
                break L1;
              } else {
                if (rd.a(-16143, param1)) {
                  stackOut_6_0 = 29;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (param2 <= -123) {
              stackOut_11_0 = sr.field_j[param0];
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_9_0 = -2;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "rp.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final static int a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_133_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              nq.field_I = nq.field_I + 65536;
              if (param1 == -587) {
                break L1;
              } else {
                ff[] discarded$1 = rp.b(-111);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (bd.a(vp.field_a, false, nq.field_I) < 65536) {
                    break L4;
                  } else {
                    stackOut_5_0 = nq.field_I - vp.field_a;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      nq.field_I = stackIn_6_0;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              }
              L5: {
                L6: {
                  var2_int = stackIn_10_0;
                  if (wo.field_n != null) {
                    break L6;
                  } else {
                    if (null == sb.field_b) {
                      break L5;
                    } else {
                      var2_int = sb.field_b.length;
                      if (var5 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var2_int = wo.field_n.length;
                break L5;
              }
              L7: {
                if (-1 != var2_int) {
                  L8: {
                    if (~vp.field_f >= ~ig.field_g) {
                      break L8;
                    } else {
                      L9: {
                        ig.field_g = ig.field_g + 1;
                        if (~vp.field_c <= ~ig.field_g) {
                          break L9;
                        } else {
                          L10: {
                            if (wo.field_n == null) {
                              break L10;
                            } else {
                              if (wo.field_n[ps.field_e] != null) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          ig.field_g = ig.field_g - 1;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      if (~ig.field_g > ~vp.field_f) {
                        break L8;
                      } else {
                        if (null != wo.field_n[(ps.field_e - -1) % var2_int]) {
                          break L8;
                        } else {
                          ig.field_g = ig.field_g - 1;
                          break L8;
                        }
                      }
                    }
                  }
                  L11: {
                    if (~vp.field_f >= ~ig.field_g) {
                      L12: {
                        ig.field_g = ig.field_g - vp.field_f;
                        if (sm.field_m) {
                          break L12;
                        } else {
                          ps.field_e = ps.field_e - 1;
                          if (ps.field_e >= 0) {
                            break L11;
                          } else {
                            ps.field_e = ps.field_e + var2_int;
                            if (var5 == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      ps.field_e = ps.field_e + 1;
                      if (~ps.field_e > ~var2_int) {
                        break L11;
                      } else {
                        ps.field_e = ps.field_e - var2_int;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (~vp.field_c <= ~ig.field_g) {
                    break L7;
                  } else {
                    sm.field_m = true;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null != ga.field_E) {
                  L14: {
                    var3 = -(ga.field_E.field_v / 2) + 357;
                    var4 = 0;
                    if (0 == wj.field_A) {
                      break L14;
                    } else {
                      if (vc.field_y <= var3) {
                        break L14;
                      } else {
                        if (~(ga.field_E.field_w + var3) < ~vc.field_y) {
                          L15: {
                            if (~(269 + -ga.field_E.field_q) <= ~sm.field_q) {
                              break L15;
                            } else {
                              if (sm.field_q >= 269) {
                                break L15;
                              } else {
                                sm.field_m = false;
                                ig.field_g = vp.field_f;
                                var4 = 1;
                                break L15;
                              }
                            }
                          }
                          if (sm.field_q <= 586) {
                            break L14;
                          } else {
                            if (sm.field_q >= ga.field_E.field_q + 586) {
                              break L14;
                            } else {
                              ig.field_g = vp.field_f;
                              var4 = 1;
                              sm.field_m = true;
                              break L14;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (var4 != 0) {
                    break L13;
                  } else {
                    if (ig.field_g <= vp.field_c) {
                      break L13;
                    } else {
                      if (~var3 <= ~n.field_m) {
                        break L13;
                      } else {
                        if (var3 - -ga.field_E.field_w > n.field_m) {
                          L16: {
                            if (~el.field_A >= ~(269 - ga.field_E.field_q)) {
                              break L16;
                            } else {
                              if (269 > el.field_A) {
                                ig.field_g = vp.field_c;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (el.field_A <= 586) {
                            break L13;
                          } else {
                            if (el.field_A >= ga.field_E.field_q + 586) {
                              break L13;
                            } else {
                              ig.field_g = vp.field_c;
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                } else {
                  break L13;
                }
              }
              L17: {
                L18: {
                  if (param0) {
                    L19: {
                      fp.field_l.a(-21174, vp.a(n.field_m, el.field_A, (byte) 98), vp.a(vc.field_y, sm.field_q, (byte) 69));
                      if (!fp.field_l.c(-1)) {
                        break L19;
                      } else {
                        if (fp.field_l.field_e != 0) {
                          if (fp.field_l.field_e != 1) {
                            break L19;
                          } else {
                            stackOut_115_0 = 2;
                            stackIn_116_0 = stackOut_115_0;
                            return stackIn_116_0;
                          }
                        } else {
                          stackOut_112_0 = 3;
                          stackIn_113_0 = stackOut_112_0;
                          return stackIn_113_0;
                        }
                      }
                    }
                    L20: while (true) {
                      if (!nk.b((byte) -59)) {
                        break L18;
                      } else {
                        L21: {
                          fp.field_l.a(0, true);
                          if (!fp.field_l.c(param1 ^ 586)) {
                            break L21;
                          } else {
                            if (fp.field_l.field_e == 0) {
                              stackOut_124_0 = 3;
                              stackIn_125_0 = stackOut_124_0;
                              return stackIn_125_0;
                            } else {
                              if (1 != fp.field_l.field_e) {
                                break L21;
                              } else {
                                stackOut_127_0 = 1;
                                stackIn_128_0 = stackOut_127_0;
                                return stackIn_128_0;
                              }
                            }
                          }
                        }
                        if (cc.field_e != 13) {
                          continue L20;
                        } else {
                          stackOut_130_0 = 1;
                          stackIn_131_0 = stackOut_130_0;
                          stackOut_131_0 = stackIn_131_0;
                          stackIn_134_0 = stackOut_131_0;
                          stackIn_132_0 = stackOut_131_0;
                          if (var5 != 0) {
                            break L17;
                          } else {
                            return stackIn_132_0;
                          }
                        }
                      }
                    }
                  } else {
                    break L18;
                  }
                }
                stackOut_133_0 = 0;
                stackIn_134_0 = stackOut_133_0;
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "rp.BA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_134_0;
    }

    private rp(hu param0, int param1) {
        super(param0, param1);
    }

    final String b(byte param0, fd param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_3_0 = ce.a('*', (byte) 48, param1.field_q.length());
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rp.AA(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final static ff[] b(int param0) {
        RuntimeException var1 = null;
        ff[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ff[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -27666) {
                break L1;
              } else {
                field_A = true;
                break L1;
              }
            }
            stackOut_3_0 = new ff[]{eb.field_c, om.field_yb, um.field_c, tb.field_t, wr.field_h, fi.field_e, vp.field_o, ge.field_j, kd.field_r, mn.field_e, cr.field_b, uq.field_d, tj.field_z, k.field_l};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "rp.V(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    rp(int param0) {
        this(gf.field_a, param0);
    }

    public static void a(int param0) {
        try {
            field_C = null;
            field_z = null;
            field_y = null;
            field_B = null;
            field_D = null;
            field_x = null;
            if (param0 < 84) {
                int discarded$0 = rp.a(114, -72, -26);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "rp.U(" + param0 + ')');
        }
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
