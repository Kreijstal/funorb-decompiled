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
        int var4 = var3 + -var2 >> 1;
        this.field_S.b(30, var4, -var3 + this.field_t >> 1, -var2 + (this.field_y - 48), -16555);
        this.field_V.b(30, var4, var4 + ((-var3 + this.field_t >> 1) + var2), -48 + (this.field_y - var2), -16555);
        this.field_X.b(30, var3, this.field_t + -var3 >> 1, -(2 * var2) + -78 + this.field_y, -16555);
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
        field_T = null;
        field_Y = null;
    }

    final static int a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_74_0 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            sc.field_n = sc.field_n + 65536;
            L1: while (true) {
              if (um.a(dk.field_c, sc.field_n, 11469) < 65536) {
                L2: {
                  var2_int = -1;
                  if (null != d.field_h) {
                    var2_int = d.field_h.length;
                    break L2;
                  } else {
                    if (vi.field_z == null) {
                      break L2;
                    } else {
                      var2_int = vi.field_z.length;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 == var2_int) {
                    break L3;
                  } else {
                    L4: {
                      if (ac.field_F >= dk.field_g) {
                        break L4;
                      } else {
                        L5: {
                          ac.field_F = ac.field_F + 1;
                          if (dk.field_i >= ac.field_F) {
                            break L5;
                          } else {
                            L6: {
                              if (null == d.field_h) {
                                break L6;
                              } else {
                                if (d.field_h[wh.field_a] == null) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            ac.field_F = ac.field_F - 1;
                            break L4;
                          }
                        }
                        if (ac.field_F < dk.field_g) {
                          break L4;
                        } else {
                          if (d.field_h[(1 + wh.field_a) % var2_int] == null) {
                            ac.field_F = ac.field_F - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (~dk.field_g < ~ac.field_F) {
                        break L7;
                      } else {
                        L8: {
                          bh.field_m = wh.field_a;
                          if (lb.field_b) {
                            wh.field_a = wh.field_a + 1;
                            if (wh.field_a < var2_int) {
                              break L8;
                            } else {
                              wh.field_a = wh.field_a - var2_int;
                              break L8;
                            }
                          } else {
                            wh.field_a = wh.field_a - 1;
                            if (wh.field_a >= 0) {
                              break L8;
                            } else {
                              wh.field_a = wh.field_a + var2_int;
                              break L8;
                            }
                          }
                        }
                        ac.field_F = ac.field_F - dk.field_g;
                        break L7;
                      }
                    }
                    if (~dk.field_i > ~ac.field_F) {
                      lb.field_b = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L9: {
                  if (ge.field_h == null) {
                    break L9;
                  } else {
                    L10: {
                      var3 = -(ge.field_h.field_C / 2) + 357;
                      var4 = 0;
                      if (ig.field_Yb == 0) {
                        break L10;
                      } else {
                        if (~nf.field_h >= ~var3) {
                          break L10;
                        } else {
                          if (nf.field_h < ge.field_h.field_H + var3) {
                            L11: {
                              if (~he.field_S >= ~(269 + -ge.field_h.field_I)) {
                                break L11;
                              } else {
                                if (he.field_S >= 269) {
                                  break L11;
                                } else {
                                  lb.field_b = false;
                                  var4 = 1;
                                  ac.field_F = dk.field_g;
                                  break L11;
                                }
                              }
                            }
                            if (he.field_S <= 586) {
                              break L10;
                            } else {
                              if (~he.field_S <= ~(ge.field_h.field_I + 586)) {
                                break L10;
                              } else {
                                lb.field_b = true;
                                var4 = 1;
                                ac.field_F = dk.field_g;
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
                      if (~ac.field_F >= ~dk.field_i) {
                        break L9;
                      } else {
                        if (var3 >= pm.field_f) {
                          break L9;
                        } else {
                          if (pm.field_f < ge.field_h.field_H + var3) {
                            L12: {
                              if (269 - ge.field_h.field_I >= bh.field_g) {
                                break L12;
                              } else {
                                if (bh.field_g >= 269) {
                                  break L12;
                                } else {
                                  ac.field_F = dk.field_i;
                                  break L12;
                                }
                              }
                            }
                            if (bh.field_g <= 586) {
                              break L9;
                            } else {
                              if (bh.field_g < 586 - -ge.field_h.field_I) {
                                ac.field_F = dk.field_i;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
                L13: {
                  rg.field_a.a(ak.a(bh.field_g, pm.field_f, (byte) 7), -20563, ak.a(he.field_S, nf.field_h, (byte) 7));
                  if (rg.field_a.b((byte) 114)) {
                    if (rg.field_a.field_h == 0) {
                      stackOut_57_0 = 3;
                      stackIn_58_0 = stackOut_57_0;
                      return stackIn_58_0;
                    } else {
                      if (rg.field_a.field_h == 1) {
                        stackOut_61_0 = 2;
                        stackIn_62_0 = stackOut_61_0;
                        return stackIn_62_0;
                      } else {
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
                stackOut_63_0 = -125;
                stackIn_65_0 = stackOut_63_0;
                L14: while (true) {
                  if (!ab.c((byte) stackIn_65_0)) {
                    stackOut_76_0 = 0;
                    stackIn_77_0 = stackOut_76_0;
                    break L0;
                  } else {
                    L15: {
                      rg.field_a.a((byte) 58, 0);
                      if (!rg.field_a.b((byte) 114)) {
                        break L15;
                      } else {
                        if (rg.field_a.field_h != 0) {
                          if (1 != rg.field_a.field_h) {
                            break L15;
                          } else {
                            stackOut_71_0 = 1;
                            stackIn_72_0 = stackOut_71_0;
                            return stackIn_72_0;
                          }
                        } else {
                          stackOut_68_0 = 3;
                          stackIn_69_0 = stackOut_68_0;
                          return stackIn_69_0;
                        }
                      }
                    }
                    if (wh.field_c != 13) {
                      stackOut_64_0 = -125;
                      stackIn_65_0 = stackOut_64_0;
                      continue L14;
                    } else {
                      stackOut_74_0 = 1;
                      stackIn_75_0 = stackOut_74_0;
                      return stackIn_75_0;
                    }
                  }
                }
              } else {
                sc.field_n = sc.field_n - dk.field_c;
                rb.field_b = rb.field_b + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "lg.F(" + 0 + ',' + true + ')');
        }
        return stackIn_77_0;
    }

    final static void a(int param0) {
        hm.a(4, (byte) -111);
    }

    final static void a(boolean param0, int param1) {
        if (null == kb.field_i) {
          return;
        } else {
          hk.d(hk.field_c, hk.field_h, hk.field_g + -hk.field_c, hk.field_b - hk.field_h);
          kb.field_i.a(1141039778, param0);
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_S == param2) {
                vb.g((byte) 105);
                break L1;
              } else {
                if (param2 != this.field_X) {
                  if (this.field_V != param2) {
                    break L1;
                  } else {
                    rk.c(false);
                    break L1;
                  }
                } else {
                  ha.e(0);
                  break L1;
                }
              }
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
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6);
            stackOut_10_1 = new StringBuilder().append("lg.H(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
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
              if (param1 != 98) {
                if (param1 != 99) {
                  var5_int = 86 / ((param0 - -22) / 49);
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = this.a(32, param2);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = this.a(param2, (byte) -74);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
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
        return stackIn_10_0 != 0;
    }

    static {
        field_T = "Discard";
        field_U = -1;
    }
}
