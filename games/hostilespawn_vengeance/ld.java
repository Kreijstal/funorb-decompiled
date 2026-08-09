/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends hi {
    static String field_r;
    static String field_q;
    static bd field_p;
    static bd field_o;

    final static void a(int param0, byte param1, vm param2, String param3, pm param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            var8 = -125 / ((param1 - 0) / 54);
            L1: while (true) {
              if (var7 >= param3.length()) {
                break L0;
              } else {
                L2: {
                  var9 = param3.charAt(var7);
                  if (var9 != 60) {
                    break L2;
                  } else {
                    var6 = (var5_int >> 84269544) - (-param4.field_b[0] + -param2.a(param3.substring(0, var7)));
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
                    param4.field_b[var7] = param4.field_b[0] + ((var5_int >> -238248632) - (-param2.a(param3.substring(0, 1 + var7)) - -param2.a((char) var9)));
                    break L3;
                  }
                }
                if (var9 == 62) {
                  var6 = -1;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ld.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), stackIn_23_2 + ')');
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, bd param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        try {
            if (param1 != -84) {
                pm var8 = (pm) null;
                ld.a(-5, (byte) -60, (vm) null, (String) null, (pm) null);
            }
            var6_int = param4.field_u << 371657123;
            param3 = (param3 << 224202596) + (15 & var6_int);
            var7 = param4.field_r << -1580065917;
            param5 = (param5 << -638181724) + (var7 & 15);
            ki.a(var7, var6_int, param5, false, param3, param0, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "ld.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            if (!sf.a((byte) 122, var5)) {
              stackIn_3_0 = bi.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = -7 % ((param1 - 3) / 42);
                var6 = (CharSequence) ((Object) param0);
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
              stackIn_8_0 = bi.field_d;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ld.L(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static int a(int param0, int param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        p var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pm var9 = null;
        p var10 = null;
        oj var11 = null;
        p var12 = null;
        p var13 = null;
        p var14 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = mm.field_m[0];
              var3 = 0;
              if (param0 < -5) {
                break L1;
              } else {
                var9 = (pm) null;
                ld.a(20, (byte) 120, (vm) null, (String) null, (pm) null);
                break L1;
              }
            }
            L2: {
              var4 = 0;
              if (-2 == (param1 ^ -1)) {
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
              if (-7 == (param1 ^ -1)) {
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
                if ((d.field_u ^ -1) >= -11) {
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
              if (-2 != (uj.field_l ^ -1)) {
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
                    if ((var7 ^ -1) == -3) {
                      eh.field_c.a(sf.field_V[(int)(5.0 * Math.random()) + 23], var5_int, var6);
                      break L9;
                    } else {
                      if (-4 == (var7 ^ -1)) {
                        L11: {
                          if (var3 == 0) {
                            break L11;
                          } else {
                            if (null != rc.field_c) {
                              break L11;
                            } else {
                              rc.field_c = b.a(sf.field_V[35], var5_int, var6);
                              rc.field_c.d(120);
                              eh.field_c.b(rc.field_c);
                              break L11;
                            }
                          }
                        }
                        if (var4 == 0) {
                          break L9;
                        } else {
                          f.a((byte) 119);
                          eh.field_c.a(sf.field_V[36], var5_int, var6);
                          break L9;
                        }
                      } else {
                        if ((var7 ^ -1) != -5) {
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
                    eh.field_c.a(sf.field_V[jm.field_e + 0], var5_int, var6);
                    ag.field_k = ag.field_k + 1;
                    break L9;
                  }
                }
              }
            }
            L12: {
              hf.field_i = param1;
              var10 = jn.field_F[ib.field_c];
              var12 = var10;
              var13 = var12;
              var12 = var10;
              var5 = var10;
              var6 = param1;
              if (0 != var6) {
                if ((var6 ^ -1) != -2) {
                  if (var6 == 2) {
                    dupTemp$0 = an.field_r[param1];
                    kh.field_ib[dupTemp$0] = kh.field_ib[dupTemp$0] - 9;
                    var6 = -17;
                    L13: while (true) {
                      if (17 < var6) {
                        pj.field_v = 4;
                        break L12;
                      } else {
                        var13 = jn.field_F[ib.field_c];
                        r.a(var6, param1, var13, -5, var11);
                        ib.field_c = ib.field_c + 1;
                        var6 += 4;
                        continue L13;
                      }
                    }
                  } else {
                    if (var6 != 3) {
                      if (4 != var6) {
                        if (-6 != (var6 ^ -1)) {
                          if (-7 != (var6 ^ -1)) {
                            if (7 == var6) {
                              L14: {
                                r.a(0, param1, var10, -5, var11);
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
                              r.a(0, param1, var10, -5, var11);
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
                          r.a(0, param1, var10, -5, var11);
                          ib.field_c = ib.field_c + 1;
                          break L12;
                        }
                      } else {
                        dupTemp$1 = an.field_r[param1];
                        kh.field_ib[dupTemp$1] = kh.field_ib[dupTemp$1] - 4;
                        r.a(0, param1, var10, -5, var11);
                        ib.field_c = ib.field_c + 1;
                        jg.field_l = (int)((0.5 + ((double)var10.field_j.field_g + var10.field_l.field_a)) * 24.0);
                        am.field_e = (int)(24.0 * (0.5 + (var10.field_l.field_f + (double)var10.field_j.field_e)));
                        break L12;
                      }
                    } else {
                      var6 = -1;
                      L16: while (true) {
                        if ((var6 ^ -1) < -2) {
                          break L12;
                        } else {
                          var14 = jn.field_F[ib.field_c];
                          var5 = var14;
                          r.a(var6, param1, var14, -5, var11);
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
                      r.a(0, param1, var10, -5, var11);
                      ib.field_c = ib.field_c + 1;
                      var12 = jn.field_F[ib.field_c];
                      var13 = var12;
                      var13 = var12;
                      r.a(0, param1, var12, -5, var11);
                      ib.field_c = ib.field_c + 1;
                      if ((pj.field_v ^ -1) == 0) {
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
                  if (var12.field_i == 0) {
                    var12.field_i = 32;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              } else {
                r.a(0, param1, var10, -5, var11);
                ib.field_c = ib.field_c + 1;
                break L12;
              }
            }
            L19: {
              if (0 != param1) {
                break L19;
              } else {
                if (-3 >= (dn.field_j ^ -1)) {
                  break L19;
                } else {
                  stackIn_97_0 = 8;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            stackIn_99_0 = th.field_Fb[param1];
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "ld.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_97_0;
        } else {
          return stackIn_99_0;
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_o = null;
        field_r = null;
        field_q = null;
        if (param0 < 29) {
            ld.a(true, 18);
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        bf var5 = null;
        byte[] var6 = null;
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
                field_p = (bd) null;
                break L3;
              }
            }
            var5.a((byte) 30);
            var5.a((byte) 123, var4, (long)(param3 * 8));
            var6 = new byte[64];
            var5.a(var6, 0, -6);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("ld.G(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(boolean param0, int param1) {
        if (param0) {
            pm var3 = (pm) null;
            ld.a(-17, (byte) 69, (vm) null, (String) null, (pm) null);
        }
        if (p.field_m[param1] == null) {
            p.field_m[param1] = pi.a(10, 6413, 3, ka.field_p[param1], 1);
        }
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 96 % ((param0 - -24) / 35);
            if (this.a(param1, (byte) -70) == bi.field_d) {
              stackIn_3_0 = fg.field_a;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ld.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_r = "Email address is unavailable";
        field_q = "Locate the entrance to the spawn hive.";
    }
}
