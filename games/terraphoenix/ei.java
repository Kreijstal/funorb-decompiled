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
        if (param0 <= 0) {
            ((ei) this).b(98, param2, param1);
            return;
        }
        ((ei) this).field_S = ((ei) this).field_p;
        if (param3 != -80) {
            return;
        }
        ((ei) this).field_P = param1;
        ((ei) this).field_Q = ((ei) this).field_n;
        ((ei) this).field_U = param2;
        ((ei) this).field_T = param0;
        ((ei) this).field_V = 0;
    }

    ei(d param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ei) this).field_T = 0;
        ((ei) this).field_V = 0;
    }

    void g(byte param0) {
        if (param0 != 109) {
            ((ei) this).field_U = 62;
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
        int stackIn_59_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_62_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_76_0 = 0;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            uj.field_d = uj.field_d + 65536;
            L1: while (true) {
              if (65536 > li.a(uj.field_d, -117, ke.field_e)) {
                L2: {
                  var2_int = -1;
                  if (rk.field_f == null) {
                    if (wg.field_l == null) {
                      break L2;
                    } else {
                      var2_int = wg.field_l.length;
                      break L2;
                    }
                  } else {
                    var2_int = rk.field_f.length;
                    break L2;
                  }
                }
                L3: {
                  if (-1 == var2_int) {
                    break L3;
                  } else {
                    L4: {
                      if (ke.field_f <= vi.field_p) {
                        break L4;
                      } else {
                        L5: {
                          vi.field_p = vi.field_p + 1;
                          if (ke.field_c >= vi.field_p) {
                            break L5;
                          } else {
                            L6: {
                              if (null == rk.field_f) {
                                break L6;
                              } else {
                                if (null != rk.field_f[vi.field_q]) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            vi.field_p = vi.field_p - 1;
                            break L4;
                          }
                        }
                        if (vi.field_p < ke.field_f) {
                          break L4;
                        } else {
                          if (rk.field_f[(1 + vi.field_q) % var2_int] == null) {
                            vi.field_p = vi.field_p - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (ke.field_f > vi.field_p) {
                        break L7;
                      } else {
                        L8: {
                          hd.field_h = vi.field_q;
                          if (ve.field_c) {
                            vi.field_q = vi.field_q + 1;
                            if (var2_int > vi.field_q) {
                              break L8;
                            } else {
                              vi.field_q = vi.field_q - var2_int;
                              break L8;
                            }
                          } else {
                            vi.field_q = vi.field_q - 1;
                            if (vi.field_q < 0) {
                              vi.field_q = vi.field_q + var2_int;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        vi.field_p = vi.field_p - ke.field_f;
                        break L7;
                      }
                    }
                    if (ke.field_c < vi.field_p) {
                      ve.field_c = true;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L9: {
                  if (ig.field_a != null) {
                    L10: {
                      var3 = 357 + -(ig.field_a.field_u / 2);
                      var4 = 0;
                      if (ma.field_I == 0) {
                        break L10;
                      } else {
                        if (lm.field_c <= var3) {
                          break L10;
                        } else {
                          if (lm.field_c >= var3 + ig.field_a.field_t) {
                            break L10;
                          } else {
                            L11: {
                              if (-ig.field_a.field_r + 269 >= mm.field_c) {
                                break L11;
                              } else {
                                if (mm.field_c >= 269) {
                                  break L11;
                                } else {
                                  var4 = 1;
                                  ve.field_c = false;
                                  vi.field_p = ke.field_f;
                                  break L11;
                                }
                              }
                            }
                            if (586 >= mm.field_c) {
                              break L10;
                            } else {
                              if (ig.field_a.field_r + 586 <= mm.field_c) {
                                break L10;
                              } else {
                                ve.field_c = true;
                                vi.field_p = ke.field_f;
                                var4 = 1;
                                break L10;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (ke.field_c >= vi.field_p) {
                        break L9;
                      } else {
                        if (jb.field_b <= var3) {
                          break L9;
                        } else {
                          if (ig.field_a.field_t + var3 > jb.field_b) {
                            L12: {
                              if (ef.field_j <= 269 - ig.field_a.field_r) {
                                break L12;
                              } else {
                                if (269 <= ef.field_j) {
                                  break L12;
                                } else {
                                  vi.field_p = ke.field_c;
                                  break L12;
                                }
                              }
                            }
                            if (586 >= ef.field_j) {
                              break L9;
                            } else {
                              if (ef.field_j < ig.field_a.field_r + 586) {
                                vi.field_p = ke.field_c;
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
                  } else {
                    break L9;
                  }
                }
                if (param1) {
                  L13: {
                    si.field_ob.a(kk.a(10472, ef.field_j, jb.field_b), 127, kk.a(10472, mm.field_c, lm.field_c));
                    if (si.field_ob.c((byte) -121)) {
                      if (0 != si.field_ob.field_h) {
                        if (si.field_ob.field_h == 1) {
                          stackOut_62_0 = 2;
                          stackIn_63_0 = stackOut_62_0;
                          return stackIn_63_0;
                        } else {
                          break L13;
                        }
                      } else {
                        stackOut_58_0 = 3;
                        stackIn_59_0 = stackOut_58_0;
                        return stackIn_59_0;
                      }
                    } else {
                      break L13;
                    }
                  }
                  stackOut_64_0 = 1;
                  stackIn_66_0 = stackOut_64_0;
                  L14: while (true) {
                    if (!fd.d(stackIn_66_0)) {
                      stackOut_78_0 = 0;
                      stackIn_79_0 = stackOut_78_0;
                      break L0;
                    } else {
                      L15: {
                        si.field_ob.a((byte) -125, 0);
                        if (!si.field_ob.c((byte) -121)) {
                          break L15;
                        } else {
                          if (si.field_ob.field_h == 0) {
                            stackOut_70_0 = 3;
                            stackIn_71_0 = stackOut_70_0;
                            return stackIn_71_0;
                          } else {
                            if (si.field_ob.field_h != 1) {
                              break L15;
                            } else {
                              stackOut_73_0 = 1;
                              stackIn_74_0 = stackOut_73_0;
                              return stackIn_74_0;
                            }
                          }
                        }
                      }
                      if (lf.field_c != 13) {
                        stackOut_65_0 = 1;
                        stackIn_66_0 = stackOut_65_0;
                        continue L14;
                      } else {
                        stackOut_76_0 = 1;
                        stackIn_77_0 = stackOut_76_0;
                        return stackIn_77_0;
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
          throw qk.a((Throwable) (Object) var2, "ei.GB(" + -102 + ',' + param1 + ')');
        }
        return stackIn_79_0;
    }

    boolean i(int param0) {
        int var2 = 0;
        ((ei) this).j(-2065096856);
        return super.i(-127);
    }

    void a(int param0, int param1, byte param2) {
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
        l.b(6 + param0, param1 - -35, ((ei) this).field_p + -12, ((ei) this).field_n + -40, 2105376, 0);
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
                var17 = null;
                byte[] discarded$1 = ei.a((Object) null, false, true);
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
                hd.field_o.b(((ei) this).field_p + param0 + -90, 10 + param1);
                gd.a(param1 + 35, e.field_p, 5 + param0, 121, ((ei) this).field_p + -10);
                gd.a(-22 + (((ei) this).field_n + param1), qb.field_f, param0, 126, ((ei) this).field_p);
                var4 = ((ei) this).field_n + -79;
                var5 = 169;
                var6 = 127;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (~var7 <= ~var4) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 16 | var9 << 8);
                    l.d(param0, var8, 6, var9);
                    l.d(-6 + (param0 + ((ei) this).field_p), var8, 6, var9);
                    var8++;
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 8 | var9 << 16);
                l.d(param0, var8, 6, var9);
                l.d(((ei) this).field_p + (param0 - 6), var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            L4: {
              if (~var8 > ~l.field_d) {
                break L4;
              } else {
                if (var8 >= l.field_c) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      L7: {
                        var9 = (var6 - var5) * var7 / var4 + var5;
                        var10 = 0;
                        var11 = ((ei) this).field_p;
                        if (var7 <= 20) {
                          L8: while (true) {
                            if (var10 > 20) {
                              break L7;
                            } else {
                              L9: {
                                var12 = (-var7 + 20) * (20 + -var7) - -((20 - var10) * (20 + -var10));
                                if (var12 <= 462) {
                                  if (var12 >= 420) {
                                    var13 = (-var12 + 462) * var9 / 42;
                                    var13 = var13 | (var13 << 16 | var13 << 8);
                                    l.field_i[param0 + (var8 * l.field_k - -var10)] = var13;
                                    break L9;
                                  } else {
                                    if (var7 <= 20) {
                                      var12 = var11;
                                      var11 -= 21;
                                      var13 = 0;
                                      L10: while (true) {
                                        if (var13 > 20) {
                                          break L6;
                                        } else {
                                          var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                                          if (462 < var14) {
                                            break L6;
                                          } else {
                                            L11: {
                                              if (var14 >= 420) {
                                                var15 = (462 - var14) * var9 / 42;
                                                var15 = var15 | (var15 << 8 | var15 << 16);
                                                l.field_i[l.field_k * var8 + param0 - -var11] = var15;
                                                break L11;
                                              } else {
                                                var12 = 1 + var11;
                                                break L11;
                                              }
                                            }
                                            var13++;
                                            var11++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var10++;
                              continue L8;
                            }
                          }
                        } else {
                          break L7;
                        }
                      }
                      if (var7 <= 20) {
                        var12 = var11;
                        var11 -= 21;
                        var13 = 0;
                        L12: while (true) {
                          if (var13 > 20) {
                            break L6;
                          } else {
                            var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                            if (462 < var14) {
                              break L6;
                            } else {
                              L13: {
                                if (var14 >= 420) {
                                  var15 = (462 - var14) * var9 / 42;
                                  var15 = var15 | (var15 << 8 | var15 << 16);
                                  l.field_i[l.field_k * var8 + param0 - -var11] = var15;
                                  break L13;
                                } else {
                                  var12 = 1 + var11;
                                  break L13;
                                }
                              }
                              var13++;
                              var11++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var11 = var12;
                    break L5;
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  l.d(param0 + var10, var8, -var10 + var11, var9);
                  break L4;
                }
              }
            }
            var7++;
            var8++;
            continue L0;
          }
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener((java.awt.event.MouseListener) (Object) a.field_d);
            if (param1 != -24289) {
                Object var3 = null;
                ec discarded$0 = ei.a(-4, (String) null);
            }
            param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) a.field_d);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) a.field_d);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ei.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void j(int param0) {
        if (param0 != -2065096856) {
            Object var3 = null;
            ei.a((java.awt.Component) null, -28);
        }
        if (0 >= ((ei) this).field_T) {
            return;
        }
        ((ei) this).b(98, ((ei) this).field_U, ((ei) this).field_P);
        ((ei) this).field_T = 0;
        ((ei) this).g((byte) 109);
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (((ei) this).field_T > 0) {
            var2 = ((ei) this).field_P;
            var3 = ((ei) this).field_U;
            int fieldTemp$0 = ((ei) this).field_V + 1;
            ((ei) this).field_V = ((ei) this).field_V + 1;
            if (fieldTemp$0 >= ((ei) this).field_T) {
                ((ei) this).field_T = 0;
                ((ei) this).g((byte) 109);
            } else {
                var4 = ((ei) this).field_V * (((ei) this).field_T * 2 - ((ei) this).field_V);
                var5 = ((ei) this).field_T * ((ei) this).field_T;
                var3 = ((ei) this).field_Q + (((ei) this).field_U + -((ei) this).field_Q) * var4 / var5;
                var2 = var4 * (-((ei) this).field_S + ((ei) this).field_P) / var5 + ((ei) this).field_S;
            }
            ((ei) this).b(98, var3, var2);
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
                if (!param1.equals((Object) (Object) vc.field_a.b(-110))) {
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
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ei.AC(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static byte[] a(Object param0, boolean param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ke var4 = null;
        Object stackIn_2_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_13_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (!param2) {
            if (param0 != null) {
              if (!(param0 instanceof byte[])) {
                if (!(param0 instanceof ke)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (ke) param0;
                  stackOut_13_0 = var4.c(false);
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                var3 = (byte[]) param0;
                if (!param1) {
                  stackOut_10_0 = (byte[]) var3;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  stackOut_8_0 = li.a(0, var3);
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              return null;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ei.CC(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L0;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L0;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = true;
    }
}
