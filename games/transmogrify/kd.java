/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd implements ui {
    static String field_d;
    static oa field_c;
    static int field_a;
    static long[] field_b;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ti var8 = null;
        int var9 = 0;
        try {
          L0: {
            L1: {
              var6_int = param0 - -param4.field_p;
              var7 = param1 - -param4.field_n;
              jl.a(var6_int, var7, 13612, param4.field_l, param4.field_h);
              var8 = ai.field_b[1];
              if (!(param4 instanceof lj)) {
                break L1;
              } else {
                if (!((lj) ((Object) param4)).field_y) {
                  break L1;
                } else {
                  var8.c((param4.field_l + -var8.field_r >> -1696735679) + 1 + var6_int, 1 + (var7 - -(param4.field_h + -var8.field_s >> 1387363361)), 256);
                  break L1;
                }
              }
            }
            L2: {
              var9 = -113 / ((param3 - 51) / 47);
              if (param4.b((byte) -109)) {
                ri.a(param4.field_l + -4, var6_int + 2, var7 + 2, (byte) -86, param4.field_h + -4);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("kd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_55_0 = 0;
        String stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_56_0 = 0;
        String stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_58_4;
        int stackIn_59_4 = 0;
        int stackIn_59_5 = 0;
        int stackIn_102_0;
        int stackIn_102_1;
        int stackIn_102_2;
        int stackIn_102_3;
        int stackIn_102_4;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackIn_103_4 = 0;
        int stackIn_103_5 = 0;
        int stackIn_105_0;
        int stackIn_105_1;
        int stackIn_105_2;
        int stackIn_105_3;
        int stackIn_105_4;
        int stackIn_106_0;
        int stackIn_106_1;
        int stackIn_106_2;
        int stackIn_106_3;
        int stackIn_106_4;
        int stackIn_106_5;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        ti var4 = null;
        Object var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        pi var15 = null;
        ti var16 = null;
        StringBuilder var17 = null;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                dh.field_B.f(0, param1);
                if (qk.field_e == null) {
                  break L2;
                } else {
                  if (qk.field_e.length >= ej.field_p.length()) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              qk.field_e = new int[ej.field_p.length()];
              break L1;
            }
            var2_int = dc.field_a % 750;
            var3 = 0;
            L3: while (true) {
              if (var3 >= qk.field_e.length) {
                L4: {
                  L5: {
                    var3 = hk.field_a.a(ej.field_p);
                    hk.field_a.b(10325023, -1);
                    hk.field_a.a(ej.field_p, 34 - -(12 * wl.field_K.field_n + -var3 >> -1118939903), param1 + ((-hk.field_a.field_y + wl.field_K.field_m - hk.field_a.field_t >> 508904449) + 114 - -hk.field_a.field_y), (int[]) null, qk.field_e);
                    if (0 > jl.field_j) {
                      break L5;
                    } else {
                      if (3 <= jl.field_j) {
                        break L5;
                      } else {
                        L6: {
                          var4_int = 10;
                          var5_ref = null;
                          if (jl.field_j == 0) {
                            var5_ref = sh.field_a + qi.field_c.field_h;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if ((jl.field_j ^ -1) == -2) {
                            ob.a(1, 0, sg.field_p, dc.field_a);
                            var4_int = var4_int + (tj.field_s.field_m - hk.field_a.field_y);
                            var5_ref = ll.field_W;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if ((jl.field_j ^ -1) == -3) {
                            var5_ref = nl.field_g;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (var5_ref == null) {
                          break L4;
                        } else {
                          var6 = 4 + (hk.field_a.field_t + hk.field_a.field_y);
                          var7 = hk.field_a.b((String) (var5_ref), 160) * var6;
                          dk.a(var4_int + 10 + var7, mk.field_B, -28018, 451, o.field_i + 237 - -param1, 180);
                          hk.field_a.a((String) (var5_ref), 461, o.field_i + 247 - -param1, 160, var7, 0, -1, 1, 0, var6);
                          break L4;
                        }
                      }
                    }
                  }
                  if (qe.field_F == null) {
                    break L4;
                  } else {
                    var16 = qe.field_F[rd.field_c[gk.field_e]];
                    var4 = var16;
                    if ((jl.field_j ^ -1) == -4) {
                      var5 = o.field_i + 413;
                      var6 = 30 + -((o.field_i * 30 + -3420) * (o.field_i - 114) / 12996);
                      var4.c(var5, var6 + (-var16.field_l + 480 - (var16.field_m - param1)));
                      break L4;
                    } else {
                      var4.c(413, param1 + (-var16.field_l + 480) - var16.field_m);
                      break L4;
                    }
                  }
                }
                L9: {
                  var17 = new StringBuilder(4);
                  var5 = wk.field_c / 50;
                  if (param0 > 84) {
                    break L9;
                  } else {
                    kd.a(1);
                    break L9;
                  }
                }
                L10: {
                  var6 = var5 / 60;
                  var5 = var5 % 60;
                  if ((var6 ^ -1) >= -100) {
                    discarded$0 = var17.append((char)(48 + var6 / 10));
                    discarded$1 = var17.append((char)(var6 % 10 + 48));
                    discarded$2 = var17.append(':');
                    discarded$3 = var17.append((char)(var5 / 10 + 48));
                    discarded$4 = var17.append((char)(var5 % 10 + 48));
                    break L10;
                  } else {
                    discarded$5 = var17.append("****");
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    wf.field_d.a(var17.toString(), 250, 333 + param1, 255, -1);
                    var7 = ni.a((byte) -111);
                    if (-11 == (n.field_a ^ -1)) {
                      break L12;
                    } else {
                      L13: {
                        if (!mg.field_d) {
                          break L13;
                        } else {
                          if (2 != n.field_a) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (var7 < 0) {
                          break L14;
                        } else {
                          if ((re.field_A ^ -1) > -7) {
                            break L14;
                          } else {
                            L15: {
                              if (!mg.field_d) {
                                break L15;
                              } else {
                                if (n.field_a != 0) {
                                  break L15;
                                } else {
                                  if (var7 <= 0) {
                                    break L15;
                                  } else {
                                    var8_int = 128 - -(int)(Math.sin(3.141592653589793 * (double)dc.field_a / 50.0) * 64.0);
                                    fg.a(param1 + 376, 264, (byte) 98, 164, 13, jk.field_x.a(true) - 10, pj.field_x, var8_int);
                                    break L15;
                                  }
                                }
                              }
                            }
                            pa.a(param1 + 376, tj.field_z + var7, 39935, 16776867, 164, 16710412, 264, -10, 39935);
                            break L11;
                          }
                        }
                      }
                      pa.a(param1 + 376, da.field_z, 39935, 8421504, 164, 8421504, 264, -10, 39935);
                      break L11;
                    }
                  }
                  if (2 <= re.field_A) {
                    pa.a(376 + param1, pd.field_c, 39935, 16776867, 164, 16710412, 264, -10, 39935);
                    break L11;
                  } else {
                    pa.a(376 - -param1, pd.field_c, 39935, 8421504, 164, 8421504, 264, -10, 39935);
                    break L11;
                  }
                }
                L16: {
                  stackIn_55_0 = param1 + 376;

                  stackIn_55_1 = th.field_b;

                  stackIn_55_2 = 16711680;

                  if (re.field_A != 6) {
                    stackIn_56_0 = stackIn_55_0;
                    stackIn_56_1 = (String) ((Object) stackIn_55_1);
                    stackIn_56_2 = stackIn_55_2;
                    stackIn_56_3 = 8421504;
                    break L16;
                  } else {
                    stackIn_56_0 = stackIn_55_0;
                    stackIn_56_1 = (String) ((Object) stackIn_55_1);
                    stackIn_56_2 = stackIn_55_2;
                    stackIn_56_3 = 16776867;
                    break L16;
                  }
                }
                L17: {








                  stackIn_58_4 = 108;

                  if ((re.field_A ^ -1) != -7) {

                    stackIn_56_1 = (String) ((Object) stackIn_56_1);


                    stackIn_59_4 = stackIn_58_4;
                    stackIn_59_5 = 8421504;
                    break L17;
                  } else {

                    stackIn_56_1 = (String) ((Object) stackIn_56_1);


                    stackIn_59_4 = stackIn_58_4;
                    stackIn_59_5 = 16710412;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    pa.a(stackIn_56_0, stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_59_4, stackIn_59_5, 134, -10, 16711680);
                    if (3 == re.field_A) {
                      break L19;
                    } else {
                      if (re.field_A != 4) {
                        L20: {
                          if (-1 == (re.field_A ^ -1)) {
                            var8 = hf.field_f;
                            break L20;
                          } else {
                            if ((re.field_A ^ -1) > -7) {
                              var8 = hd.field_c;
                              break L20;
                            } else {
                              var8 = lb.field_g;
                              break L20;
                            }
                          }
                        }
                        od.field_g.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                        wk.field_a.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                        si.field_i.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                        od.field_g.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                        wk.field_a.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                        si.field_i.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  od.field_g.a(false, dc.field_a, 3, il.field_c, param1);
                  si.field_i.a(false, dc.field_a, 3, wc.field_a, param1);
                  od.field_g.a(true, dc.field_a, 3, il.field_c, param1);
                  si.field_i.a(true, dc.field_a, 3, wc.field_a, param1);
                  break L18;
                }
                L21: {
                  if (0 != n.field_a) {
                    break L21;
                  } else {
                    L22: {
                      var8 = null;
                      if (re.field_A != 1) {
                        break L22;
                      } else {
                        var8 = tb.field_b[0];
                        break L22;
                      }
                    }
                    L23: {
                      if (2 != re.field_A) {
                        break L23;
                      } else {
                        var8 = tb.field_b[1];
                        break L23;
                      }
                    }
                    L24: {
                      if ((re.field_A ^ -1) == -5) {
                        var8 = tb.field_b[2];
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    if (var8 == null) {
                      break L21;
                    } else {
                      if (-51 >= (dc.field_a ^ -1)) {
                        break L21;
                      } else {
                        var9 = ((ti) (var8)).field_n * (100 + -(2 * dc.field_a)) / 50;
                        var10 = ((ti) (var8)).field_m * (-(2 * dc.field_a) + 100) / 50;
                        ((ti) (var8)).b(-var9 + 640 >> -712649855, 480 - var10 >> -743589215, var9, var10);
                        break L21;
                      }
                    }
                  }
                }
                L25: {
                  if (null != sg.field_d) {
                    sg.field_d.a(dc.field_a, param1, 1, 0);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if ((n.field_a ^ -1) < -1) {
                    var8_int = eg.field_b % 58;
                    var9 = 0;
                    L27: while (true) {
                      if (fg.field_i.length <= var9) {
                        break L26;
                      } else {
                        var10 = -var9 + var8_int >> -1653626173;
                        var11 = (fg.field_i[var9] - -(10 * (eg.field_b / 58))) % 187;
                        var12 = var11 - -442;
                        var13 = (n.field_a + -1) * 12 + vl.field_G[var9];
                        if (-1 >= (var10 ^ -1)) {
                          L28: {
                            if (-6 < (var10 ^ -1)) {
                              hf.field_d[cc.field_f[var9] * 5 + var10].c(var12, var13 + param1);
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          var9++;
                          continue L27;
                        } else {
                          var9++;
                          continue L27;
                        }
                      }
                    }
                  } else {
                    break L26;
                  }
                }
                var8_int = 0;
                L29: while (true) {
                  if (n.field_a <= var8_int) {
                    L30: {
                      hk.field_a.b(sg.field_k, 464, param1 + 173, 16711680, -1);
                      hk.field_a.a(Integer.toString(ce.field_c), 627, 173 + param1, 16711680, -1);
                      if ((n.field_a ^ -1) != -11) {
                        break L30;
                      } else {
                        hk.field_a.b(ub.field_e, 464, 185 - -param1, 16711680, -1);
                        hk.field_a.a(Integer.toString(wk.field_d), 627, 185 + param1, 16711680, -1);
                        break L30;
                      }
                    }
                    L31: {
                      hk.field_a.b(ve.field_D, 464, 197 - -param1, 16711680, -1);
                      hk.field_a.a(Integer.toString(eh.field_a), 627, 197 - -param1, 16711680, -1);
                      if (ad.field_e) {
                        L32: {
                          dk.a(136, mk.field_B, -28018, 180, param1 + 88, 280);
                          wf.field_d.a(he.field_g, 190, param1 + 93, 260, 80, 0, -1, 1, 0, wf.field_d.field_y + 3);
                          stackIn_102_0 = 65280;

                          stackIn_102_1 = 80;

                          stackIn_102_2 = 16776867;

                          stackIn_102_3 = 16710412;

                          stackIn_102_4 = param1 + 183;

                          if (0 != a.field_S.field_d) {
                            stackIn_103_0 = stackIn_102_0;
                            stackIn_103_1 = stackIn_102_1;
                            stackIn_103_2 = stackIn_102_2;
                            stackIn_103_3 = stackIn_102_3;
                            stackIn_103_4 = stackIn_102_4;
                            stackIn_103_5 = 0;
                            break L32;
                          } else {
                            stackIn_103_0 = stackIn_102_0;
                            stackIn_103_1 = stackIn_102_1;
                            stackIn_103_2 = stackIn_102_2;
                            stackIn_103_3 = stackIn_102_3;
                            stackIn_103_4 = stackIn_102_4;
                            stackIn_103_5 = 1;
                            break L32;
                          }
                        }
                        L33: {
                          jk.a(stackIn_103_0, stackIn_103_1, stackIn_103_2, stackIn_103_3, stackIn_103_4, stackIn_103_5 != 0, il.field_a, 224, 65280, (byte) -50);
                          stackIn_105_0 = 16711680;

                          stackIn_105_1 = 80;

                          stackIn_105_2 = 16776867;

                          stackIn_105_3 = 16710412;

                          stackIn_105_4 = param1 + 183;

                          if (1 != a.field_S.field_d) {
                            stackIn_106_0 = stackIn_105_0;
                            stackIn_106_1 = stackIn_105_1;
                            stackIn_106_2 = stackIn_105_2;
                            stackIn_106_3 = stackIn_105_3;
                            stackIn_106_4 = stackIn_105_4;
                            stackIn_106_5 = 0;
                            break L33;
                          } else {
                            stackIn_106_0 = stackIn_105_0;
                            stackIn_106_1 = stackIn_105_1;
                            stackIn_106_2 = stackIn_105_2;
                            stackIn_106_3 = stackIn_105_3;
                            stackIn_106_4 = stackIn_105_4;
                            stackIn_106_5 = 1;
                            break L33;
                          }
                        }
                        jk.a(stackIn_106_0, stackIn_106_1, stackIn_106_2, stackIn_106_3, stackIn_106_4, stackIn_106_5 != 0, nh.field_h, 336, 16711680, (byte) 111);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L34: {
                      if (!ll.field_S) {
                        break L34;
                      } else {
                        wf.field_d.a("FPS: " + ub.field_a, 630, 30, 65535, -1);
                        wf.field_d.a("LPS: " + oc.field_y, 630, 60, 65535, -1);
                        break L34;
                      }
                    }
                    L35: {
                      var15 = (pi) ((Object) oj.field_u.a((byte) -95));
                      var8 = var15;
                      if (var8 == null) {
                        break L35;
                      } else {
                        L36: {
                          var10 = da.field_C;
                          if (-81 < (var10 ^ -1)) {
                            var9 = -32 + var10 / 2;
                            break L36;
                          } else {
                            if (var10 >= 230) {
                              var9 = -(var10 / 2) + 123;
                              break L36;
                            } else {
                              var9 = 8;
                              break L36;
                            }
                          }
                        }
                        jk.field_x.a(16776867, var9 - 5, 3, 56 + wf.field_d.a(qj.field_a[var15.field_i]), 0, 16776867);
                        fc.field_h[var15.field_i].e(8, var9);
                        wf.field_d.b(qj.field_a[var15.field_i], 48, var9 - -wf.field_d.field_y, 0, -1);
                        break L35;
                      }
                    }
                    var9 = sb.field_h[(2147483647 & nc.field_t) % sb.field_h.length];
                    vh.field_n = vh.field_n - var9;
                    hf.field_j = hf.field_j - var9;
                    break L0;
                  } else {
                    hk.field_a.a(var8_int + 1 + ". ", 464, 53 + (12 * var8_int + param1), 16711680, -1);
                    hk.field_a.b(vi.field_g[var8_int].toString(), 464, param1 + (12 * var8_int + 53), 16711680, -1);
                    hk.field_a.a(Integer.toString(vi.field_a[var8_int]), 627, param1 + 12 * var8_int + 53, 16711680, -1);
                    var8_int++;
                    continue L29;
                  }
                }
              } else {
                L37: {
                  L38: {
                    if (150 > var2_int) {
                      break L38;
                    } else {
                      if ((var2_int ^ -1) > -251) {
                        qk.field_e[var3] = (int)(5.0 * Math.sin((double)(var2_int + -250) / 5.0));
                        break L37;
                      } else {
                        break L38;
                      }
                    }
                  }
                  qk.field_e[var3] = 0;
                  break L37;
                }
                L39: {
                  var2_int--;
                  if (0 > var2_int) {
                    var2_int += 750;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "kd.E(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 > -58) {
            kd.a(20);
        }
    }

    static {
        field_d = "Names cannot start or end with space or underscore";
        field_b = new long[32];
    }
}
