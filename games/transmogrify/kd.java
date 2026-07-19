/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd implements ui {
    static String field_d;
    static oa field_c;
    static int field_a;
    static long[] field_b;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ti var8 = null;
        int var9 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            stackOut_7_0 = (RuntimeException) (var6);
            stackOut_7_1 = new StringBuilder().append("kd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int discarded$8 = 0;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        int discarded$15 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ti var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object var5_ref = null;
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
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_62_0 = 0;
        String stackIn_62_1 = null;
        int stackIn_62_2 = 0;
        int stackIn_63_0 = 0;
        String stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int stackIn_64_0 = 0;
        String stackIn_64_1 = null;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_65_0 = 0;
        String stackIn_65_1 = null;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_66_0 = 0;
        String stackIn_66_1 = null;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        int stackIn_66_4 = 0;
        int stackIn_67_0 = 0;
        String stackIn_67_1 = null;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int stackIn_67_4 = 0;
        int stackIn_67_5 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        int stackIn_114_4 = 0;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_116_5 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        int stackIn_119_5 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_61_0 = 0;
        String stackOut_61_1 = null;
        int stackOut_61_2 = 0;
        int stackOut_63_0 = 0;
        String stackOut_63_1 = null;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_62_0 = 0;
        String stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_64_0 = 0;
        String stackOut_64_1 = null;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        int stackOut_66_0 = 0;
        String stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        int stackOut_66_4 = 0;
        int stackOut_66_5 = 0;
        int stackOut_65_0 = 0;
        String stackOut_65_1 = null;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        int stackOut_65_4 = 0;
        int stackOut_65_5 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        int stackOut_115_5 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        int stackOut_114_5 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        int stackOut_118_5 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_117_5 = 0;
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
              L4: {
                L5: {
                  if ((var3 ^ -1) <= (qk.field_e.length ^ -1)) {
                    break L5;
                  } else {
                    stackOut_7_0 = 150;
                    stackOut_7_1 = var2_int;
                    stackIn_19_0 = stackOut_7_0;
                    stackIn_19_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var14 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          L8: {
                            if (stackIn_8_0 > stackIn_8_1) {
                              break L8;
                            } else {
                              if ((var2_int ^ -1) > -251) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          qk.field_e[var3] = 0;
                          if (var14 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                        qk.field_e[var3] = (int)(5.0 * Math.sin((double)(var2_int + -250) / 5.0));
                        break L6;
                      }
                      L9: {
                        var2_int--;
                        if (0 > var2_int) {
                          var2_int += 750;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var3++;
                      if (var14 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var3 = hk.field_a.a(ej.field_p);
                hk.field_a.b(10325023, -1);
                hk.field_a.a(ej.field_p, 34 - -(12 * wl.field_K.field_n + -var3 >> -1118939903), param1 + ((-hk.field_a.field_y + wl.field_K.field_m - hk.field_a.field_t >> 508904449) + 114 - -hk.field_a.field_y), (int[]) null, qk.field_e);
                stackOut_18_0 = 0;
                stackOut_18_1 = jl.field_j;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L4;
              }
              L10: {
                L11: {
                  if (stackIn_19_0 > stackIn_19_1) {
                    break L11;
                  } else {
                    if (3 <= jl.field_j) {
                      break L11;
                    } else {
                      L12: {
                        var4_int = 10;
                        var5_ref = null;
                        if (jl.field_j == 0) {
                          var5_ref = sh.field_a + qi.field_c.field_h;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if ((jl.field_j ^ -1) == -2) {
                          ob.a(1, 0, sg.field_p, dc.field_a);
                          var4_int = var4_int + (tj.field_s.field_m - hk.field_a.field_y);
                          var5_ref = ll.field_W;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        if ((jl.field_j ^ -1) == -3) {
                          var5_ref = nl.field_g;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        if (var5_ref == null) {
                          break L15;
                        } else {
                          var6 = 4 + (hk.field_a.field_t + hk.field_a.field_y);
                          var7 = hk.field_a.b((String) (var5_ref), 160) * var6;
                          dk.a(var4_int + 10 + var7, mk.field_B, -28018, 451, o.field_i + 237 - -param1, 180);
                          discarded$8 = hk.field_a.a((String) (var5_ref), 461, o.field_i + 247 - -param1, 160, var7, 0, -1, 1, 0, var6);
                          break L15;
                        }
                      }
                      if (var14 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                if (qe.field_F == null) {
                  break L10;
                } else {
                  L16: {
                    var16 = qe.field_F[rd.field_c[gk.field_e]];
                    var4 = var16;
                    if ((jl.field_j ^ -1) == -4) {
                      break L16;
                    } else {
                      var4.c(413, param1 + (-var16.field_l + 480) - var16.field_m);
                      if (var14 == 0) {
                        break L10;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var5 = o.field_i + 413;
                  var6 = 30 + -((o.field_i * 30 + -3420) * (o.field_i - 114) / 12996);
                  var4.c(var5, var6 + (-var16.field_l + 480 - (var16.field_m - param1)));
                  break L10;
                }
              }
              L17: {
                var17 = new StringBuilder(4);
                var5 = wk.field_c / 50;
                if (param0 > 84) {
                  break L17;
                } else {
                  kd.a(1);
                  break L17;
                }
              }
              L18: {
                L19: {
                  var6 = var5 / 60;
                  var5 = var5 % 60;
                  if ((var6 ^ -1) >= -100) {
                    break L19;
                  } else {
                    discarded$9 = var17.append("****");
                    if (var14 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                discarded$10 = var17.append((char)(48 + var6 / 10));
                discarded$11 = var17.append((char)(var6 % 10 + 48));
                discarded$12 = var17.append(':');
                discarded$13 = var17.append((char)(var5 / 10 + 48));
                discarded$14 = var17.append((char)(var5 % 10 + 48));
                break L18;
              }
              L20: {
                L21: {
                  L22: {
                    wf.field_d.a(var17.toString(), 250, 333 + param1, 255, -1);
                    var7 = ni.a((byte) -111);
                    if (-11 == (n.field_a ^ -1)) {
                      break L22;
                    } else {
                      if (!mg.field_d) {
                        break L21;
                      } else {
                        if (2 != n.field_a) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  L23: {
                    if (2 <= re.field_A) {
                      break L23;
                    } else {
                      pa.a(376 - -param1, pd.field_c, 39935, 8421504, 164, 8421504, 264, -10, 39935);
                      if (var14 == 0) {
                        break L20;
                      } else {
                        break L23;
                      }
                    }
                  }
                  pa.a(376 + param1, pd.field_c, 39935, 16776867, 164, 16710412, 264, -10, 39935);
                  if (var14 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
                L24: {
                  if (var7 < 0) {
                    break L24;
                  } else {
                    if ((re.field_A ^ -1) > -7) {
                      break L24;
                    } else {
                      L25: {
                        if (!mg.field_d) {
                          break L25;
                        } else {
                          if (n.field_a != 0) {
                            break L25;
                          } else {
                            if (var7 <= 0) {
                              break L25;
                            } else {
                              var8_int = 128 - -(int)(Math.sin(3.141592653589793 * (double)dc.field_a / 50.0) * 64.0);
                              fg.a(param1 + 376, 264, (byte) 98, 164, 13, jk.field_x.a(true) - 10, pj.field_x, var8_int);
                              break L25;
                            }
                          }
                        }
                      }
                      pa.a(param1 + 376, tj.field_z + var7, 39935, 16776867, 164, 16710412, 264, -10, 39935);
                      if (var14 == 0) {
                        break L20;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                pa.a(param1 + 376, da.field_z, 39935, 8421504, 164, 8421504, 264, -10, 39935);
                break L20;
              }
              L26: {
                stackOut_61_0 = param1 + 376;
                stackOut_61_1 = th.field_b;
                stackOut_61_2 = 16711680;
                stackIn_63_0 = stackOut_61_0;
                stackIn_63_1 = stackOut_61_1;
                stackIn_63_2 = stackOut_61_2;
                stackIn_62_0 = stackOut_61_0;
                stackIn_62_1 = stackOut_61_1;
                stackIn_62_2 = stackOut_61_2;
                if (re.field_A != 6) {
                  stackOut_63_0 = stackIn_63_0;
                  stackOut_63_1 = (String) ((Object) stackIn_63_1);
                  stackOut_63_2 = stackIn_63_2;
                  stackOut_63_3 = 8421504;
                  stackIn_64_0 = stackOut_63_0;
                  stackIn_64_1 = stackOut_63_1;
                  stackIn_64_2 = stackOut_63_2;
                  stackIn_64_3 = stackOut_63_3;
                  break L26;
                } else {
                  stackOut_62_0 = stackIn_62_0;
                  stackOut_62_1 = (String) ((Object) stackIn_62_1);
                  stackOut_62_2 = stackIn_62_2;
                  stackOut_62_3 = 16776867;
                  stackIn_64_0 = stackOut_62_0;
                  stackIn_64_1 = stackOut_62_1;
                  stackIn_64_2 = stackOut_62_2;
                  stackIn_64_3 = stackOut_62_3;
                  break L26;
                }
              }
              L27: {
                stackOut_64_0 = stackIn_64_0;
                stackOut_64_1 = (String) ((Object) stackIn_64_1);
                stackOut_64_2 = stackIn_64_2;
                stackOut_64_3 = stackIn_64_3;
                stackOut_64_4 = 108;
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_66_2 = stackOut_64_2;
                stackIn_66_3 = stackOut_64_3;
                stackIn_66_4 = stackOut_64_4;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                stackIn_65_2 = stackOut_64_2;
                stackIn_65_3 = stackOut_64_3;
                stackIn_65_4 = stackOut_64_4;
                if ((re.field_A ^ -1) != -7) {
                  stackOut_66_0 = stackIn_66_0;
                  stackOut_66_1 = (String) ((Object) stackIn_66_1);
                  stackOut_66_2 = stackIn_66_2;
                  stackOut_66_3 = stackIn_66_3;
                  stackOut_66_4 = stackIn_66_4;
                  stackOut_66_5 = 8421504;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  stackIn_67_3 = stackOut_66_3;
                  stackIn_67_4 = stackOut_66_4;
                  stackIn_67_5 = stackOut_66_5;
                  break L27;
                } else {
                  stackOut_65_0 = stackIn_65_0;
                  stackOut_65_1 = (String) ((Object) stackIn_65_1);
                  stackOut_65_2 = stackIn_65_2;
                  stackOut_65_3 = stackIn_65_3;
                  stackOut_65_4 = stackIn_65_4;
                  stackOut_65_5 = 16710412;
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_67_1 = stackOut_65_1;
                  stackIn_67_2 = stackOut_65_2;
                  stackIn_67_3 = stackOut_65_3;
                  stackIn_67_4 = stackOut_65_4;
                  stackIn_67_5 = stackOut_65_5;
                  break L27;
                }
              }
              L28: {
                L29: {
                  L30: {
                    pa.a(stackIn_67_0, stackIn_67_1, stackIn_67_2, stackIn_67_3, stackIn_67_4, stackIn_67_5, 134, -10, 16711680);
                    if (3 == re.field_A) {
                      break L30;
                    } else {
                      if (re.field_A != 4) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  od.field_g.a(false, dc.field_a, 3, il.field_c, param1);
                  si.field_i.a(false, dc.field_a, 3, wc.field_a, param1);
                  od.field_g.a(true, dc.field_a, 3, il.field_c, param1);
                  si.field_i.a(true, dc.field_a, 3, wc.field_a, param1);
                  if (var14 == 0) {
                    break L28;
                  } else {
                    break L29;
                  }
                }
                L31: {
                  L32: {
                    if (-1 == (re.field_A ^ -1)) {
                      break L32;
                    } else {
                      L33: {
                        if ((re.field_A ^ -1) > -7) {
                          break L33;
                        } else {
                          var8 = lb.field_g;
                          if (var14 == 0) {
                            break L31;
                          } else {
                            break L33;
                          }
                        }
                      }
                      var8 = hd.field_c;
                      if (var14 == 0) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  var8 = hf.field_f;
                  break L31;
                }
                od.field_g.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                wk.field_a.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                si.field_i.a(false, dc.field_a, 3, (int[][]) (var8), param1);
                od.field_g.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                wk.field_a.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                si.field_i.a(true, dc.field_a, 3, (int[][]) (var8), param1);
                break L28;
              }
              L34: {
                if (0 != n.field_a) {
                  break L34;
                } else {
                  L35: {
                    var8 = null;
                    if (re.field_A != 1) {
                      break L35;
                    } else {
                      var8 = tb.field_b[0];
                      break L35;
                    }
                  }
                  L36: {
                    if (2 != re.field_A) {
                      break L36;
                    } else {
                      var8 = tb.field_b[1];
                      break L36;
                    }
                  }
                  L37: {
                    if ((re.field_A ^ -1) == -5) {
                      var8 = tb.field_b[2];
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  if (var8 == null) {
                    break L34;
                  } else {
                    if (-51 >= (dc.field_a ^ -1)) {
                      break L34;
                    } else {
                      var9 = ((ti) (var8)).field_n * (100 + -(2 * dc.field_a)) / 50;
                      var10 = ((ti) (var8)).field_m * (-(2 * dc.field_a) + 100) / 50;
                      ((ti) (var8)).b(-var9 + 640 >> -712649855, 480 - var10 >> -743589215, var9, var10);
                      break L34;
                    }
                  }
                }
              }
              L38: {
                if (null != sg.field_d) {
                  sg.field_d.a(dc.field_a, param1, 1, 0);
                  break L38;
                } else {
                  break L38;
                }
              }
              L39: {
                L40: {
                  L41: {
                    L42: {
                      if ((n.field_a ^ -1) < -1) {
                        var8_int = eg.field_b % 58;
                        var9 = 0;
                        L43: while (true) {
                          if ((fg.field_i.length ^ -1) >= (var9 ^ -1)) {
                            break L42;
                          } else {
                            var10 = -var9 + var8_int >> -1653626173;
                            var11 = (fg.field_i[var9] - -(10 * (eg.field_b / 58))) % 187;
                            var12 = var11 - -442;
                            var13 = (n.field_a + -1) * 12 + vl.field_G[var9];
                            stackOut_96_0 = -1;
                            stackOut_96_1 = var10 ^ -1;
                            stackIn_104_0 = stackOut_96_0;
                            stackIn_104_1 = stackOut_96_1;
                            stackIn_97_0 = stackOut_96_0;
                            stackIn_97_1 = stackOut_96_1;
                            if (var14 != 0) {
                              L44: while (true) {
                                if (stackIn_104_0 <= stackIn_104_1) {
                                  break L40;
                                } else {
                                  hk.field_a.a(var8_int + 1 + ". ", 464, 53 + (12 * var8_int + param1), 16711680, -1);
                                  hk.field_a.b(vi.field_g[var8_int].toString(), 464, param1 + (12 * var8_int + 53), 16711680, -1);
                                  hk.field_a.a(Integer.toString(vi.field_a[var8_int]), 627, param1 + 12 * var8_int + 53, 16711680, -1);
                                  var8_int++;
                                  if (var14 != 0) {
                                    break L39;
                                  } else {
                                    if (var14 == 0) {
                                      stackOut_103_0 = n.field_a;
                                      stackOut_103_1 = var8_int;
                                      stackIn_104_0 = stackOut_103_0;
                                      stackIn_104_1 = stackOut_103_1;
                                      continue L44;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              }
                            } else {
                              L45: {
                                if (stackIn_97_0 < stackIn_97_1) {
                                  break L45;
                                } else {
                                  if (-6 < (var10 ^ -1)) {
                                    hf.field_d[cc.field_f[var9] * 5 + var10].c(var12, var13 + param1);
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              var9++;
                              if (var14 == 0) {
                                continue L43;
                              } else {
                                break L42;
                              }
                            }
                          }
                        }
                      } else {
                        break L42;
                      }
                    }
                    var8_int = 0;
                    L46: while (true) {
                      stackOut_103_0 = n.field_a;
                      stackOut_103_1 = var8_int;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      if (stackIn_104_0 <= stackIn_104_1) {
                        break L40;
                      } else {
                        hk.field_a.a(var8_int + 1 + ". ", 464, 53 + (12 * var8_int + param1), 16711680, -1);
                        hk.field_a.b(vi.field_g[var8_int].toString(), 464, param1 + (12 * var8_int + 53), 16711680, -1);
                        hk.field_a.a(Integer.toString(vi.field_a[var8_int]), 627, param1 + 12 * var8_int + 53, 16711680, -1);
                        var8_int++;
                        if (var14 != 0) {
                          break L39;
                        } else {
                          if (var14 == 0) {
                            continue L46;
                          } else {
                            break L41;
                          }
                        }
                      }
                    }
                  }
                  break L40;
                }
                hk.field_a.b(sg.field_k, 464, param1 + 173, 16711680, -1);
                hk.field_a.a(Integer.toString(ce.field_c), 627, 173 + param1, 16711680, -1);
                break L39;
              }
              L47: {
                if ((n.field_a ^ -1) != -11) {
                  break L47;
                } else {
                  hk.field_a.b(ub.field_e, 464, 185 - -param1, 16711680, -1);
                  hk.field_a.a(Integer.toString(wk.field_d), 627, 185 + param1, 16711680, -1);
                  break L47;
                }
              }
              L48: {
                hk.field_a.b(ve.field_D, 464, 197 - -param1, 16711680, -1);
                hk.field_a.a(Integer.toString(eh.field_a), 627, 197 - -param1, 16711680, -1);
                if (ad.field_e) {
                  L49: {
                    dk.a(136, mk.field_B, -28018, 180, param1 + 88, 280);
                    discarded$15 = wf.field_d.a(he.field_g, 190, param1 + 93, 260, 80, 0, -1, 1, 0, wf.field_d.field_y + 3);
                    stackOut_113_0 = 65280;
                    stackOut_113_1 = 80;
                    stackOut_113_2 = 16776867;
                    stackOut_113_3 = 16710412;
                    stackOut_113_4 = param1 + 183;
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    stackIn_115_2 = stackOut_113_2;
                    stackIn_115_3 = stackOut_113_3;
                    stackIn_115_4 = stackOut_113_4;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    stackIn_114_2 = stackOut_113_2;
                    stackIn_114_3 = stackOut_113_3;
                    stackIn_114_4 = stackOut_113_4;
                    if (0 != a.field_S.field_d) {
                      stackOut_115_0 = stackIn_115_0;
                      stackOut_115_1 = stackIn_115_1;
                      stackOut_115_2 = stackIn_115_2;
                      stackOut_115_3 = stackIn_115_3;
                      stackOut_115_4 = stackIn_115_4;
                      stackOut_115_5 = 0;
                      stackIn_116_0 = stackOut_115_0;
                      stackIn_116_1 = stackOut_115_1;
                      stackIn_116_2 = stackOut_115_2;
                      stackIn_116_3 = stackOut_115_3;
                      stackIn_116_4 = stackOut_115_4;
                      stackIn_116_5 = stackOut_115_5;
                      break L49;
                    } else {
                      stackOut_114_0 = stackIn_114_0;
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = stackIn_114_2;
                      stackOut_114_3 = stackIn_114_3;
                      stackOut_114_4 = stackIn_114_4;
                      stackOut_114_5 = 1;
                      stackIn_116_0 = stackOut_114_0;
                      stackIn_116_1 = stackOut_114_1;
                      stackIn_116_2 = stackOut_114_2;
                      stackIn_116_3 = stackOut_114_3;
                      stackIn_116_4 = stackOut_114_4;
                      stackIn_116_5 = stackOut_114_5;
                      break L49;
                    }
                  }
                  L50: {
                    jk.a(stackIn_116_0, stackIn_116_1, stackIn_116_2, stackIn_116_3, stackIn_116_4, stackIn_116_5 != 0, il.field_a, 224, 65280, (byte) -50);
                    stackOut_116_0 = 16711680;
                    stackOut_116_1 = 80;
                    stackOut_116_2 = 16776867;
                    stackOut_116_3 = 16710412;
                    stackOut_116_4 = param1 + 183;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    stackIn_118_2 = stackOut_116_2;
                    stackIn_118_3 = stackOut_116_3;
                    stackIn_118_4 = stackOut_116_4;
                    stackIn_117_0 = stackOut_116_0;
                    stackIn_117_1 = stackOut_116_1;
                    stackIn_117_2 = stackOut_116_2;
                    stackIn_117_3 = stackOut_116_3;
                    stackIn_117_4 = stackOut_116_4;
                    if (1 != a.field_S.field_d) {
                      stackOut_118_0 = stackIn_118_0;
                      stackOut_118_1 = stackIn_118_1;
                      stackOut_118_2 = stackIn_118_2;
                      stackOut_118_3 = stackIn_118_3;
                      stackOut_118_4 = stackIn_118_4;
                      stackOut_118_5 = 0;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      stackIn_119_2 = stackOut_118_2;
                      stackIn_119_3 = stackOut_118_3;
                      stackIn_119_4 = stackOut_118_4;
                      stackIn_119_5 = stackOut_118_5;
                      break L50;
                    } else {
                      stackOut_117_0 = stackIn_117_0;
                      stackOut_117_1 = stackIn_117_1;
                      stackOut_117_2 = stackIn_117_2;
                      stackOut_117_3 = stackIn_117_3;
                      stackOut_117_4 = stackIn_117_4;
                      stackOut_117_5 = 1;
                      stackIn_119_0 = stackOut_117_0;
                      stackIn_119_1 = stackOut_117_1;
                      stackIn_119_2 = stackOut_117_2;
                      stackIn_119_3 = stackOut_117_3;
                      stackIn_119_4 = stackOut_117_4;
                      stackIn_119_5 = stackOut_117_5;
                      break L50;
                    }
                  }
                  jk.a(stackIn_119_0, stackIn_119_1, stackIn_119_2, stackIn_119_3, stackIn_119_4, stackIn_119_5 != 0, nh.field_h, 336, 16711680, (byte) 111);
                  break L48;
                } else {
                  break L48;
                }
              }
              L51: {
                if (!ll.field_S) {
                  break L51;
                } else {
                  wf.field_d.a("FPS: " + ub.field_a, 630, 30, 65535, -1);
                  wf.field_d.a("LPS: " + oc.field_y, 630, 60, 65535, -1);
                  break L51;
                }
              }
              L52: {
                var15 = (pi) ((Object) oj.field_u.a((byte) -95));
                var8 = var15;
                if (var8 == null) {
                  break L52;
                } else {
                  L53: {
                    L54: {
                      var10 = da.field_C;
                      if (-81 < (var10 ^ -1)) {
                        break L54;
                      } else {
                        L55: {
                          if (var10 >= 230) {
                            break L55;
                          } else {
                            var9 = 8;
                            if (var14 == 0) {
                              break L53;
                            } else {
                              break L55;
                            }
                          }
                        }
                        var9 = -(var10 / 2) + 123;
                        if (var14 == 0) {
                          break L53;
                        } else {
                          break L54;
                        }
                      }
                    }
                    var9 = -32 + var10 / 2;
                    break L53;
                  }
                  jk.field_x.a(16776867, var9 - 5, 3, 56 + wf.field_d.a(qj.field_a[var15.field_i]), 0, 16776867);
                  fc.field_h[var15.field_i].e(8, var9);
                  wf.field_d.b(qj.field_a[var15.field_i], 48, var9 - -wf.field_d.field_y, 0, -1);
                  break L52;
                }
              }
              var9 = sb.field_h[(2147483647 & nc.field_t) % sb.field_h.length];
              vh.field_n = vh.field_n - var9;
              hf.field_j = hf.field_j - var9;
              break L0;
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
