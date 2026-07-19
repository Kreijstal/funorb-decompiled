/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ei extends kh {
    private int field_P;
    private int field_T;
    private int field_S;
    static boolean field_R;
    private int field_Q;
    private int field_V;
    private int field_U;

    final void a(int param0, int param1, int param2, byte param3) {
        if (-1 <= (param0 ^ -1)) {
            this.b(98, param2, param1);
            return;
        }
        this.field_S = this.field_p;
        if (param3 != -80) {
            return;
        }
        this.field_P = param1;
        this.field_Q = this.field_n;
        this.field_U = param2;
        this.field_T = param0;
        this.field_V = 0;
    }

    ei(d param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_T = 0;
        this.field_V = 0;
    }

    void g(byte param0) {
        if (param0 != 109) {
            this.field_U = 62;
        }
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    final static int a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_64_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_78_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            uj.field_d = uj.field_d + 65536;
            L1: while (true) {
              if (65536 > li.a(uj.field_d, -117, ke.field_e)) {
                L2: {
                  if (param0 <= -100) {
                    break L2;
                  } else {
                    field_R = false;
                    break L2;
                  }
                }
                L3: {
                  var2_int = -1;
                  if (rk.field_f == null) {
                    if (wg.field_l == null) {
                      break L3;
                    } else {
                      var2_int = wg.field_l.length;
                      break L3;
                    }
                  } else {
                    var2_int = rk.field_f.length;
                    break L3;
                  }
                }
                L4: {
                  if (-1 == var2_int) {
                    break L4;
                  } else {
                    L5: {
                      if (ke.field_f <= vi.field_p) {
                        break L5;
                      } else {
                        L6: {
                          vi.field_p = vi.field_p + 1;
                          if (ke.field_c >= vi.field_p) {
                            break L6;
                          } else {
                            L7: {
                              if (null == rk.field_f) {
                                break L7;
                              } else {
                                if (null != rk.field_f[vi.field_q]) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            vi.field_p = vi.field_p - 1;
                            break L5;
                          }
                        }
                        if (vi.field_p < ke.field_f) {
                          break L5;
                        } else {
                          if (rk.field_f[(1 + vi.field_q) % var2_int] == null) {
                            vi.field_p = vi.field_p - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (ke.field_f > vi.field_p) {
                        break L8;
                      } else {
                        L9: {
                          hd.field_h = vi.field_q;
                          if (ve.field_c) {
                            vi.field_q = vi.field_q + 1;
                            if (var2_int > vi.field_q) {
                              break L9;
                            } else {
                              vi.field_q = vi.field_q - var2_int;
                              break L9;
                            }
                          } else {
                            vi.field_q = vi.field_q - 1;
                            if ((vi.field_q ^ -1) > -1) {
                              vi.field_q = vi.field_q + var2_int;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        vi.field_p = vi.field_p - ke.field_f;
                        break L8;
                      }
                    }
                    if (ke.field_c < vi.field_p) {
                      ve.field_c = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (ig.field_a != null) {
                    L11: {
                      var3 = 357 + -(ig.field_a.field_u / 2);
                      var4 = 0;
                      if (ma.field_I == 0) {
                        break L11;
                      } else {
                        if (lm.field_c <= var3) {
                          break L11;
                        } else {
                          if (lm.field_c >= var3 + ig.field_a.field_t) {
                            break L11;
                          } else {
                            L12: {
                              if (-ig.field_a.field_r + 269 >= mm.field_c) {
                                break L12;
                              } else {
                                if (mm.field_c >= 269) {
                                  break L12;
                                } else {
                                  var4 = 1;
                                  ve.field_c = false;
                                  vi.field_p = ke.field_f;
                                  break L12;
                                }
                              }
                            }
                            if (586 >= mm.field_c) {
                              break L11;
                            } else {
                              if (ig.field_a.field_r + 586 <= mm.field_c) {
                                break L11;
                              } else {
                                ve.field_c = true;
                                vi.field_p = ke.field_f;
                                var4 = 1;
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L10;
                    } else {
                      if (ke.field_c >= vi.field_p) {
                        break L10;
                      } else {
                        if (jb.field_b <= var3) {
                          break L10;
                        } else {
                          if (ig.field_a.field_t + var3 > jb.field_b) {
                            L13: {
                              if (ef.field_j <= 269 - ig.field_a.field_r) {
                                break L13;
                              } else {
                                if (269 <= ef.field_j) {
                                  break L13;
                                } else {
                                  vi.field_p = ke.field_c;
                                  break L13;
                                }
                              }
                            }
                            if (586 >= ef.field_j) {
                              break L10;
                            } else {
                              if (ef.field_j < ig.field_a.field_r + 586) {
                                vi.field_p = ke.field_c;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                if (param1) {
                  L14: {
                    si.field_ob.a(kk.a(10472, ef.field_j, jb.field_b), 127, kk.a(10472, mm.field_c, lm.field_c));
                    if (si.field_ob.c((byte) -121)) {
                      if (0 != si.field_ob.field_h) {
                        if (si.field_ob.field_h == 1) {
                          stackOut_64_0 = 2;
                          stackIn_65_0 = stackOut_64_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L14;
                        }
                      } else {
                        stackOut_60_0 = 3;
                        stackIn_61_0 = stackOut_60_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L14;
                    }
                  }
                  stackOut_66_0 = 1;
                  stackIn_68_0 = stackOut_66_0;
                  L15: while (true) {
                    if (!fd.d(stackIn_68_0)) {
                      stackOut_80_0 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L16: {
                        si.field_ob.a((byte) -125, 0);
                        if (!si.field_ob.c((byte) -121)) {
                          break L16;
                        } else {
                          if (-1 == (si.field_ob.field_h ^ -1)) {
                            stackOut_72_0 = 3;
                            stackIn_73_0 = stackOut_72_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            if ((si.field_ob.field_h ^ -1) != -2) {
                              break L16;
                            } else {
                              stackOut_75_0 = 1;
                              stackIn_76_0 = stackOut_75_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      if (lf.field_c != 13) {
                        stackOut_67_0 = 1;
                        stackIn_68_0 = stackOut_67_0;
                        continue L15;
                      } else {
                        stackOut_78_0 = 1;
                        stackIn_79_0 = stackOut_78_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                el.field_e = el.field_e + 1;
                uj.field_d = uj.field_d - ke.field_e;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ei.GB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_61_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_65_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_73_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_76_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_79_0;
                } else {
                  return stackIn_81_0;
                }
              }
            }
          }
        }
    }

    boolean i(int param0) {
        int var2 = -90 % ((param0 - -2) / 63);
        this.j(-2065096856);
        return super.i(-127);
    }

    void a(int param0, int param1, byte param2) {
        byte[] discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        var16 = Terraphoenix.field_V;
        l.b(6 + param0, param1 - -35, this.field_p + -12, this.field_n + -40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            L1: {
              if (param2 == 82) {
                break L1;
              } else {
                var17 = (Object) null;
                discarded$1 = ei.a((Object) null, false, true);
                break L1;
              }
            }
            var6 = 169;
            var5 = 194;
            var4 = 22;
            var7 = 0;
            var8 = 35 + param1;
            L2: while (true) {
              if (var4 <= var7) {
                hd.field_o.b(this.field_p + param0 + -90, 10 + param1);
                gd.a(param1 + 35, e.field_p, 5 + param0, 121, this.field_p + -10);
                gd.a(-22 + (this.field_n + param1), qb.field_f, param0, 126, this.field_p);
                var4 = this.field_n + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 1704355984 | var9 << -12255800);
                    l.d(param0, var8, 6, var9);
                    l.d(-6 + (param0 + this.field_p), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 1098736648 | var9 << -2040424976);
                l.d(param0, var8, 6, var9);
                l.d(this.field_p + (param0 - 6), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= l.field_d) {
              if (var8 < l.field_c) {
                L4: {
                  L5: {
                    L6: {
                      var9 = (var6 - var5) * var7 / var4 + var5;
                      var10 = 0;
                      var11 = this.field_p;
                      if ((var7 ^ -1) >= -21) {
                        L7: while (true) {
                          if (-21 > (var10 ^ -1)) {
                            break L6;
                          } else {
                            var12 = (-var7 + 20) * (20 + -var7) - -((20 - var10) * (20 + -var10));
                            if (var12 <= 462) {
                              if (var12 >= 420) {
                                var13 = (-var12 + 462) * var9 / 42;
                                var13 = var13 | (var13 << -1022660080 | var13 << 591567624);
                                l.field_i[param0 + (var8 * l.field_k - -var10)] = var13;
                                var10++;
                                continue L7;
                              } else {
                                if (-21 <= (var7 ^ -1)) {
                                  var12 = var11;
                                  var11 -= 21;
                                  var13 = 0;
                                  L8: while (true) {
                                    if ((var13 ^ -1) < -21) {
                                      break L5;
                                    } else {
                                      var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                                      if (462 < var14) {
                                        break L5;
                                      } else {
                                        if (var14 >= 420) {
                                          var15 = (462 - var14) * var9 / 42;
                                          var15 = var15 | (var15 << -1159819960 | var15 << 1196367952);
                                          l.field_i[l.field_k * var8 + param0 - -var11] = var15;
                                          var13++;
                                          var11++;
                                          continue L8;
                                        } else {
                                          var12 = 1 + var11;
                                          var13++;
                                          var11++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var10++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                    if (-21 <= (var7 ^ -1)) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L9: while (true) {
                        if ((var13 ^ -1) < -21) {
                          break L5;
                        } else {
                          var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                          if (462 < var14) {
                            break L5;
                          } else {
                            if (var14 >= 420) {
                              var15 = (462 - var14) * var9 / 42;
                              var15 = var15 | (var15 << -1159819960 | var15 << 1196367952);
                              l.field_i[l.field_k * var8 + param0 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L9;
                            } else {
                              var12 = 1 + var11;
                              var13++;
                              var11++;
                              continue L9;
                            }
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  var11 = var12;
                  break L4;
                }
                var9 = var9 | (var9 << 851199856 | var9 << -2065096856);
                l.d(param0 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        ec discarded$0 = null;
        try {
            param0.addMouseListener(a.field_d);
            if (param1 != -24289) {
                String var3 = (String) null;
                discarded$0 = ei.a(-4, (String) null);
            }
            param0.addMouseMotionListener(a.field_d);
            param0.addFocusListener(a.field_d);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "ei.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void j(int param0) {
        if (param0 != -2065096856) {
            java.awt.Component var3 = (java.awt.Component) null;
            ei.a((java.awt.Component) null, -28);
        }
        if (0 >= this.field_T) {
            return;
        }
        this.b(98, this.field_U, this.field_P);
        this.field_T = 0;
        this.g((byte) 109);
    }

    boolean f(byte param0) {
        byte[] discarded$0 = null;
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$1 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -121) {
            Object var6 = (Object) null;
            discarded$0 = ei.a((Object) null, true, false);
        }
        if (-1 > (this.field_T ^ -1)) {
            var2 = this.field_P;
            var3 = this.field_U;
            fieldTemp$1 = this.field_V + 1;
            this.field_V = this.field_V + 1;
            if (fieldTemp$1 >= this.field_T) {
                this.field_T = 0;
                this.g((byte) 109);
            } else {
                var4 = this.field_V * (this.field_T * 2 - this.field_V);
                var5 = this.field_T * this.field_T;
                var3 = this.field_Q + (this.field_U + -this.field_Q) * var4 / var5;
                var2 = var4 * (-this.field_S + this.field_P) / var5 + this.field_S;
            }
            this.b(98, var3, var2);
        }
        return super.f((byte) -121);
    }

    final static ec a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ec stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        ec stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2_int = -124 % ((param0 - 26) / 49);
              if (!vc.field_a.a(-71)) {
                break L1;
              } else {
                if (!param1.equals(vc.field_a.b(-110))) {
                  vc.field_a = gl.b(param1, 20);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = vc.field_a;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("ei.AC(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static byte[] a(Object param0, boolean param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ke var4 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!param2) {
              if (param0 != null) {
                if (!(param0 instanceof byte[])) {
                  if (!(param0 instanceof ke)) {
                    throw new IllegalArgumentException();
                  } else {
                    var4 = (ke) (param0);
                    stackOut_13_0 = var4.c(false);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  var3 = (byte[]) (param0);
                  if (!param1) {
                    stackOut_10_0 = (byte[]) (var3);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_8_0 = li.a(0, var3);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("ei.CC(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    static {
        field_R = true;
    }
}
