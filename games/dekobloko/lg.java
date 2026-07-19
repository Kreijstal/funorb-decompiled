/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg extends kf implements vn {
    static se field_Y;
    private ek field_V;
    private ek field_S;
    private ek field_X;
    static int field_W;
    static String field_T;
    static int field_U;

    public lg() {
        super(0, 0, 476, 225, (gl) null);
        this.field_X = new ek(i.field_f, (kg) null);
        this.field_S = new ek(ec.field_q, (kg) null);
        this.field_V = new ek(ic.field_b, (kg) null);
        fk var1 = new fk();
        this.field_X.field_p = (gl) ((Object) var1);
        this.field_S.field_p = (gl) ((Object) var1);
        this.field_V.field_p = (gl) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -176982079;
        this.field_S.b(30, var4, -var3 + this.field_t >> 389726337, -var2 + (this.field_y - 48), -16555);
        this.field_V.b(30, var4, var4 + ((-var3 + this.field_t >> 485816257) + var2), -48 + (this.field_y - var2), -16555);
        this.field_X.b(30, var3, this.field_t + -var3 >> -18885599, -(2 * var2) + -78 + this.field_y, -16555);
        this.field_S.field_v = (kg) (this);
        this.field_X.field_v = (kg) (this);
        this.field_X.field_B = tm.field_h;
        this.field_V.field_v = (kg) (this);
        this.field_V.field_B = kh.field_c;
        this.b(this.field_S, (byte) -55);
        this.b(this.field_X, (byte) -55);
        this.b(this.field_V, (byte) -55);
    }

    public static void f(byte param0) {
        if (param0 != 1) {
            field_T = (String) null;
            field_T = null;
            field_Y = null;
            return;
        }
        field_T = null;
        field_Y = null;
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_85_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_82_0 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            sc.field_n = sc.field_n + 65536;
            L1: while (true) {
              L2: {
                L3: {
                  if (um.a(dk.field_c, sc.field_n, param0 + 11469) < 65536) {
                    break L3;
                  } else {
                    sc.field_n = sc.field_n - dk.field_c;
                    stackOut_3_0 = rb.field_b + 1;
                    stackIn_7_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      rb.field_b = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              }
              L4: {
                L5: {
                  var2_int = stackIn_7_0;
                  if (null != d.field_h) {
                    break L5;
                  } else {
                    if (vi.field_z == null) {
                      break L4;
                    } else {
                      var2_int = vi.field_z.length;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var2_int = d.field_h.length;
                break L4;
              }
              L6: {
                if (-1 == var2_int) {
                  break L6;
                } else {
                  L7: {
                    if (ac.field_F >= dk.field_g) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          ac.field_F = ac.field_F + 1;
                          if (dk.field_i >= ac.field_F) {
                            break L9;
                          } else {
                            if (null == d.field_h) {
                              break L8;
                            } else {
                              if (d.field_h[wh.field_a] == null) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (ac.field_F < dk.field_g) {
                          break L7;
                        } else {
                          if (d.field_h[(1 + wh.field_a) % var2_int] == null) {
                            ac.field_F = ac.field_F - 1;
                            if (var5 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      ac.field_F = ac.field_F - 1;
                      break L7;
                    }
                  }
                  L10: {
                    if (dk.field_g > ac.field_F) {
                      break L10;
                    } else {
                      L11: {
                        L12: {
                          bh.field_m = wh.field_a;
                          if (lb.field_b) {
                            break L12;
                          } else {
                            wh.field_a = wh.field_a - 1;
                            if (wh.field_a >= 0) {
                              break L11;
                            } else {
                              wh.field_a = wh.field_a + var2_int;
                              if (var5 == 0) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        wh.field_a = wh.field_a + 1;
                        if (wh.field_a < var2_int) {
                          break L11;
                        } else {
                          wh.field_a = wh.field_a - var2_int;
                          break L11;
                        }
                      }
                      ac.field_F = ac.field_F - dk.field_g;
                      break L10;
                    }
                  }
                  if (dk.field_i < ac.field_F) {
                    lb.field_b = true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L13: {
                if (ge.field_h == null) {
                  break L13;
                } else {
                  L14: {
                    var3 = -(ge.field_h.field_C / 2) + 357;
                    var4 = 0;
                    if (ig.field_Yb == 0) {
                      break L14;
                    } else {
                      if (nf.field_h <= var3) {
                        break L14;
                      } else {
                        if (nf.field_h < ge.field_h.field_H + var3) {
                          L15: {
                            if (he.field_S <= 269 + -ge.field_h.field_I) {
                              break L15;
                            } else {
                              if (he.field_S >= 269) {
                                break L15;
                              } else {
                                lb.field_b = false;
                                var4 = 1;
                                ac.field_F = dk.field_g;
                                break L15;
                              }
                            }
                          }
                          if (-587 <= (he.field_S ^ -1)) {
                            break L14;
                          } else {
                            if (he.field_S >= ge.field_h.field_I + 586) {
                              break L14;
                            } else {
                              lb.field_b = true;
                              var4 = 1;
                              ac.field_F = dk.field_g;
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
                    if (ac.field_F <= dk.field_i) {
                      break L13;
                    } else {
                      if (var3 >= pm.field_f) {
                        break L13;
                      } else {
                        if (pm.field_f < ge.field_h.field_H + var3) {
                          L16: {
                            if (269 - ge.field_h.field_I >= bh.field_g) {
                              break L16;
                            } else {
                              if (bh.field_g >= 269) {
                                break L16;
                              } else {
                                ac.field_F = dk.field_i;
                                break L16;
                              }
                            }
                          }
                          if (-587 <= (bh.field_g ^ -1)) {
                            break L13;
                          } else {
                            if (bh.field_g < 586 - -ge.field_h.field_I) {
                              ac.field_F = dk.field_i;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 == 0) {
                L17: {
                  if (!param1) {
                    break L17;
                  } else {
                    L18: {
                      rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                      if (rg.field_a.b((byte) 114)) {
                        if (-1 == (rg.field_a.field_h ^ -1)) {
                          stackOut_64_0 = 3;
                          stackIn_65_0 = stackOut_64_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          if ((rg.field_a.field_h ^ -1) == -2) {
                            stackOut_68_0 = 2;
                            stackIn_69_0 = stackOut_68_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            break L18;
                          }
                        }
                      } else {
                        break L18;
                      }
                    }
                    stackOut_70_0 = -125;
                    stackIn_72_0 = stackOut_70_0;
                    L19: while (true) {
                      if (!ab.c((byte) stackIn_72_0)) {
                        break L17;
                      } else {
                        L20: {
                          rg.field_a.a((byte) 58, 0);
                          if (!rg.field_a.b((byte) 114)) {
                            break L20;
                          } else {
                            if (rg.field_a.field_h != 0) {
                              if (1 != rg.field_a.field_h) {
                                break L20;
                              } else {
                                stackOut_78_0 = 1;
                                stackIn_79_0 = stackOut_78_0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            } else {
                              stackOut_75_0 = 3;
                              stackIn_76_0 = stackOut_75_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        if (wh.field_c != 13) {
                          stackOut_71_0 = -125;
                          stackIn_72_0 = stackOut_71_0;
                          continue L19;
                        } else {
                          stackOut_81_0 = 1;
                          stackIn_82_0 = stackOut_81_0;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackOut_84_0 = 0;
                stackIn_85_0 = stackOut_84_0;
                decompiledRegionSelector0 = 6;
                break L0;
              } else {
                stackOut_57_0 = 81;
                stackIn_58_0 = stackOut_57_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "lg.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_58_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_65_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_69_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_76_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_79_0;
                } else {
                  L21: {
                    if (decompiledRegionSelector0 == 5) {
                      stackOut_82_0 = stackIn_82_0;
                      stackIn_85_0 = stackOut_82_0;
                      stackIn_83_0 = stackOut_82_0;
                      if (var5 != 0) {
                        break L21;
                      } else {
                        return stackIn_83_0;
                      }
                    } else {
                      break L21;
                    }
                  }
                  return stackIn_85_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 8927) {
            field_Y = (se) null;
            hm.a(4, (byte) -111);
            return;
        }
        hm.a(4, (byte) -111);
    }

    final static void a(boolean param0, int param1) {
        if (param1 <= -101) {
          if (null == kb.field_i) {
            return;
          } else {
            hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
            kb.field_i.a(1141039778, param0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 >= -103) {
          field_W = 48;
          var5 = param0 + this.field_u;
          var6 = this.field_D - -param3;
          discarded$2 = hh.field_e.a(hh.field_c, var5 - -20, var6 + 20, this.field_t - 40, this.field_y + -50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        } else {
          var5 = param0 + this.field_u;
          var6 = this.field_D - -param3;
          discarded$3 = hh.field_e.a(hh.field_c, var5 - -20, var6 + 20, this.field_t - 40, this.field_y + -50, 16777215, -1, 1, 0, hh.field_e.field_R);
          super.a(param0, -109, param2, param3);
          return;
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_S == param2) {
                  break L2;
                } else {
                  L3: {
                    if (param2 != this.field_X) {
                      break L3;
                    } else {
                      ha.e(0);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (this.field_V != param2) {
                    break L1;
                  } else {
                    rk.c(false);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              vb.g((byte) 105);
              break L1;
            }
            if (param0 == 67) {
              break L0;
            } else {
              field_T = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var6);
            stackOut_12_1 = new StringBuilder().append("lg.H(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!super.a(95, param1, param2, param3)) {
              if ((param1 ^ -1) != -99) {
                if (-100 != (param1 ^ -1)) {
                  var5_int = 86 / ((param0 - -22) / 49);
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.a(32, param2);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.a(param2, (byte) -74);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("lg.QA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
    }

    static {
        field_T = "Discard";
        field_U = -1;
    }
}
