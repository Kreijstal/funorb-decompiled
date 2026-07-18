/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ld extends hi {
    static String field_r;
    static String field_q;
    static bd field_p;
    static bd field_o;

    final static void a(int param0, byte param1, vm param2, String param3, pm param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            var8 = -125 / (param1 / 54);
            L1: while (true) {
              if (var7 >= param3.length()) {
                break L0;
              } else {
                L2: {
                  var9 = param3.charAt(var7);
                  if (var9 != 60) {
                    break L2;
                  } else {
                    var6 = (var5_int >> 8) - (-param4.field_b[0] + -param2.a(param3.substring(0, var7)));
                    break L2;
                  }
                }
                L3: {
                  if (var6 != -1) {
                    param4.field_b[var7] = var6;
                    break L3;
                  } else {
                    L4: {
                      if (var9 != 32) {
                        break L4;
                      } else {
                        var5_int = var5_int + param0;
                        break L4;
                      }
                    }
                    param4.field_b[var7] = param4.field_b[0] + ((var5_int >> 8) - (-param2.a(param3.substring(0, 1 + var7)) - -param2.a((char) var9)));
                    break L3;
                  }
                }
                L5: {
                  if (var9 != 62) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ld.J(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          L7: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          L8: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, bd param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        try {
            var6_int = param4.field_u << 3;
            param3 = (param3 << 4) + (15 & var6_int);
            var7 = param4.field_r << 3;
            param5 = (param5 << 4) + (var7 & 15);
            ki.a(var7, var6_int, param5, false, param3, 4096, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ld.H(" + 4096 + ',' + -84 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    ld(ig param0) {
        super(param0);
    }

    final bm a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        bm stackIn_3_0 = null;
        bm stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_2_0 = null;
        bm stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param0;
            if (!sf.a((byte) 122, var5)) {
              stackOut_2_0 = bi.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var4 = -7 % ((param1 - 3) / 42);
                var6 = (CharSequence) (Object) param0;
                var3_int = hi.a(-83, var6);
                if (0 >= var3_int) {
                  break L1;
                } else {
                  if (130 < var3_int) {
                    break L1;
                  } else {
                    return nd.field_d;
                  }
                }
              }
              stackOut_7_0 = bi.field_d;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ld.L(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        oj var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        p var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_96_0 = 0;
        int stackOut_98_0 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_ref = mm.field_m[0];
              var3 = 0;
              if (param0 < -5) {
                break L1;
              } else {
                var9 = null;
                ld.a(20, (byte) 120, (vm) null, (String) null, (pm) null);
                break L1;
              }
            }
            L2: {
              var4 = 0;
              if (param1 == 1) {
                if (0 <= jm.field_e) {
                  break L2;
                } else {
                  jm.field_e = (int)(5.0 * Math.random());
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 6) {
                if (0 <= we.field_b) {
                  break L3;
                } else {
                  we.field_b = (int)(Math.random() * 3.0);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (3 != param1) {
                break L4;
              } else {
                if (d.field_u <= 10) {
                  L5: {
                    L6: {
                      if (!fh.field_c[0]) {
                        break L6;
                      } else {
                        if (kh.field_U[0] == 3) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (!fh.field_c[1]) {
                        break L7;
                      } else {
                        if (kh.field_U[1] == 3) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (d.field_u != 0) {
                      break L4;
                    } else {
                      var4 = 1;
                      break L4;
                    }
                  }
                  d.field_u = 35;
                  var3 = 1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L8: {
              if (0 != param1) {
                break L8;
              } else {
                nh.field_M = th.field_Fb[0];
                dn.field_j = dn.field_j + 1;
                break L8;
              }
            }
            L9: {
              if (uj.field_l != 1) {
                break L9;
              } else {
                var5_int = 100;
                var6 = uh.field_i;
                var7 = param1;
                if (0 == var7) {
                  L10: {
                    if (dn.field_j > 2) {
                      dn.field_j = 2;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  eh.field_c.a(sf.field_V[12 - -dn.field_j], var5_int, var6);
                  break L9;
                } else {
                  if (var7 != 1) {
                    if (var7 == 2) {
                      eh.field_c.a(sf.field_V[(int)(5.0 * Math.random()) + 23], var5_int, var6);
                      break L9;
                    } else {
                      if (var7 == 3) {
                        L11: {
                          if (var3 == 0) {
                            break L11;
                          } else {
                            if (null != rc.field_c) {
                              break L11;
                            } else {
                              rc.field_c = b.a(sf.field_V[35], var5_int, var6);
                              rc.field_c.d(120);
                              eh.field_c.b((tj) (Object) rc.field_c);
                              break L11;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L9;
                        } else {
                          int discarded$2 = 119;
                          boolean discarded$3 = f.a();
                          eh.field_c.a(sf.field_V[36], var5_int, var6);
                          break L9;
                        }
                      } else {
                        if (var7 != 4) {
                          if (var7 == 5) {
                            eh.field_c.a(sf.field_V[37], var5_int, var6);
                            break L9;
                          } else {
                            if (var7 != 6) {
                              if (7 != var7) {
                                break L9;
                              } else {
                                eh.field_c.a(sf.field_V[39], var5_int, var6);
                                break L9;
                              }
                            } else {
                              om.field_a = true;
                              eh.field_c.a(sf.field_V[we.field_b + 28], var5_int, var6);
                              break L9;
                            }
                          }
                        } else {
                          om.field_a = true;
                          eh.field_c.a(sf.field_V[(int)(Math.random() * 4.0) + 31], var5_int, var6);
                          break L9;
                        }
                      }
                    }
                  } else {
                    eh.field_c.a(sf.field_V[jm.field_e], var5_int, var6);
                    ag.field_k = ag.field_k + 1;
                    break L9;
                  }
                }
              }
            }
            L12: {
              hf.field_i = param1;
              var5 = jn.field_F[ib.field_c];
              var6 = param1;
              if (0 != var6) {
                if (var6 != 1) {
                  if (var6 == 2) {
                    kh.field_ib[an.field_r[param1]] = kh.field_ib[an.field_r[param1]] - 9;
                    var6 = -17;
                    L13: while (true) {
                      if (17 < var6) {
                        pj.field_v = 4;
                        break L12;
                      } else {
                        var5 = jn.field_F[ib.field_c];
                        r.a(var6, param1, var5, -5, var2_ref);
                        ib.field_c = ib.field_c + 1;
                        var6 += 4;
                        continue L13;
                      }
                    }
                  } else {
                    if (var6 != 3) {
                      if (4 != var6) {
                        if (var6 != 5) {
                          if (var6 != 6) {
                            if (7 == var6) {
                              L14: {
                                r.a(0, param1, var5, -5, var2_ref);
                                if (0.5 > Math.random()) {
                                  var5.field_f = true;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              ib.field_c = ib.field_c + 1;
                              break L12;
                            } else {
                              return 0;
                            }
                          } else {
                            L15: {
                              r.a(0, param1, var5, -5, var2_ref);
                              ib.field_c = ib.field_c + 1;
                              if (10 > pj.field_v) {
                                break L15;
                              } else {
                                if (pj.field_v < 12) {
                                  break L12;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            pj.field_v = 10;
                            break L12;
                          }
                        } else {
                          r.a(0, param1, var5, -5, var2_ref);
                          ib.field_c = ib.field_c + 1;
                          break L12;
                        }
                      } else {
                        kh.field_ib[an.field_r[param1]] = kh.field_ib[an.field_r[param1]] - 4;
                        r.a(0, param1, var5, -5, var2_ref);
                        ib.field_c = ib.field_c + 1;
                        jg.field_l = (int)((0.5 + ((double)var5.field_j.field_g + var5.field_l.field_a)) * 24.0);
                        am.field_e = (int)(24.0 * (0.5 + (var5.field_l.field_f + (double)var5.field_j.field_e)));
                        break L12;
                      }
                    } else {
                      var6 = -1;
                      L16: while (true) {
                        if (var6 > 1) {
                          break L12;
                        } else {
                          var5 = jn.field_F[ib.field_c];
                          r.a(var6, param1, var5, -5, var2_ref);
                          ib.field_c = ib.field_c + 1;
                          var6++;
                          continue L16;
                        }
                      }
                    }
                  }
                } else {
                  L17: {
                    L18: {
                      r.a(0, param1, var5, -5, var2_ref);
                      ib.field_c = ib.field_c + 1;
                      var5 = jn.field_F[ib.field_c];
                      r.a(0, param1, var5, -5, var2_ref);
                      ib.field_c = ib.field_c + 1;
                      if (pj.field_v == -1) {
                        break L18;
                      } else {
                        if (3 > pj.field_v) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    pj.field_v = 0;
                    break L17;
                  }
                  if (var5.field_i == 0) {
                    var5.field_i = 32;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              } else {
                r.a(0, param1, var5, -5, var2_ref);
                ib.field_c = ib.field_c + 1;
                break L12;
              }
            }
            L19: {
              if (0 != param1) {
                break L19;
              } else {
                if (dn.field_j >= 2) {
                  break L19;
                } else {
                  stackOut_96_0 = 8;
                  stackIn_97_0 = stackOut_96_0;
                  return stackIn_97_0;
                }
              }
            }
            stackOut_98_0 = th.field_Fb[param1];
            stackIn_99_0 = stackOut_98_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "ld.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_99_0;
    }

    public static void f() {
        field_p = null;
        field_o = null;
        field_r = null;
        field_q = null;
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        bf var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                var4 = param0;
                break L1;
              } else {
                var8 = new byte[param3];
                var4 = var8;
                var5_int = 0;
                L2: while (true) {
                  if (param3 <= var5_int) {
                    break L1;
                  } else {
                    var8[var5_int] = param0[var5_int + param1];
                    var5_int++;
                    continue L2;
                  }
                }
              }
            }
            L3: {
              var5 = new bf();
              if (param2 >= 92) {
                break L3;
              } else {
                field_p = null;
                break L3;
              }
            }
            var5.a((byte) 30);
            var5.a((byte) 123, var4, (long)(param3 * 8));
            var6 = new byte[64];
            var5.a(var6, 0, -6);
            stackOut_8_0 = (byte[]) var6;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4_ref;
            stackOut_10_1 = new StringBuilder().append("ld.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(boolean param0, int param1) {
        if (p.field_m[param1] == null) {
            int discarded$0 = 1;
            p.field_m[param1] = pi.a(10, 6413, 3, ka.field_p[param1]);
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
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
            var3_int = 96 % ((param0 - -24) / 35);
            if (((ld) this).a(param1, (byte) -70) == bi.field_d) {
              stackOut_2_0 = fg.field_a;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ld.K(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Email address is unavailable";
        field_q = "Locate the entrance to the spawn hive.";
    }
}
