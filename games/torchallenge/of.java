/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class of {
    static rl field_c;
    static ka field_b;
    static boolean[][][] field_a;
    static int field_d;
    static int field_f;
    static int field_e;

    abstract void a(int param0, byte[] param1);

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        of var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_12_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          if (param2 != null) {
            if (param2 instanceof byte[]) {
              var3 = (byte[]) param2;
              if (param1) {
                stackOut_8_0 = ek.a(var3, -43);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                stackOut_6_0 = (byte[]) var3;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            } else {
              if (param2 instanceof of) {
                var4 = (of) param2;
                stackOut_12_0 = var4.c(2);
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0;
              } else {
                var3_int = -55 / ((65 - param0) / 60);
                throw new IllegalArgumentException();
              }
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
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("of.D(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L0;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L0;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static dk b(int param0) {
        if (!(pf.field_f != null)) {
            pf.field_f = new dk();
            pf.field_f.a(oe.field_g, -22373);
            pf.field_f.field_e = 7697781;
            pf.field_f.field_r = 5;
            pf.field_f.field_o = 4;
            pf.field_f.field_h = 0;
            pf.field_f.field_t = ug.field_f;
            pf.field_f.field_k = 6;
            pf.field_f.field_n = 14;
            pf.field_f.field_p = 2763306;
        }
        int var1 = 0;
        return pf.field_f;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, byte param2, boolean param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        qe var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        String var29 = null;
        String var30 = null;
        int stackIn_11_0 = 0;
        int[][] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int[][] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        int[][] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        int[][] stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int[][] stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int[][] stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        int[][] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        int[][] stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int[][] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int[][] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int[][] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int[][] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int[][] stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int[][] stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        int[][] stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        int[][] stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        int[][] stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        int[][] stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        L0: {
          L1: {
            var28 = TorChallenge.field_F ? 1 : 0;
            var5_int = gh.field_x ? 1 : 0;
            var6 = bc.field_o;
            var7 = bb.field_h;
            if (var5_int == 0) {
              break L1;
            } else {
              L2: {
                if (-1 == var6) {
                  break L2;
                } else {
                  if (var6 == 13) {
                    break L2;
                  } else {
                    L3: {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        if (var7 == -1) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var6 != 1) {
                      break L1;
                    } else {
                      if (var7 != 13) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          stackOut_10_0 = 0;
          stackIn_11_0 = stackOut_10_0;
          break L0;
        }
        L4: {
          var8 = stackIn_11_0;
          if (var8 == 0) {
            break L4;
          } else {
            qg.a(sh.field_w);
            qg.a(0, 0, 320, 240);
            break L4;
          }
        }
        L5: {
          od.a(param0, param1, 1, 7, 6, lj.field_o[0]);
          if (var8 != 0) {
            qg.b(sh.field_w);
            break L5;
          } else {
            break L5;
          }
        }
        od.a(param0, param1 + (479 - lj.field_o[1].field_v), 1, 7, 6, lj.field_o[1]);
        uk.field_N.g(param0, param1);
        if (param2 >= 32) {
          L6: {
            L7: {
              var10 = 5 + nh.field_db[0];
              var11 = nh.field_db[1] - -5;
              var12 = (-8 + nh.field_db[2]) / 5;
              var14 = 0;
              var15 = 0;
              var16 = -1;
              var17 = 0;
              var18 = 24;
              if (!param3) {
                break L7;
              } else {
                L8: {
                  if (param4 == 0) {
                    break L8;
                  } else {
                    if (param4 == 2) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                var20 = 0;
                L9: while (true) {
                  if (var20 >= 5) {
                    break L6;
                  } else {
                    L10: {
                      if (0 < (1 << var20 & vi.field_a)) {
                        L11: {
                          var19 = ea.field_g[mh.field_d[var20]];
                          if (wa.field_pb[-(ea.field_e * 5) + var19.field_V]) {
                            break L11;
                          } else {
                            if (var15 != 0) {
                              break L11;
                            } else {
                              var17 = var19.field_D;
                              var16 = var20;
                              var15 = 1;
                              break L11;
                            }
                          }
                        }
                        var14++;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var20++;
                    continue L9;
                  }
                }
              }
            }
            if (param3) {
              break L6;
            } else {
              var14 = ef.field_k % 300;
              var14 = var14 / 50;
              var17 = ef.field_k % 50;
              var15 = 1;
              break L6;
            }
          }
          L12: {
            L13: {
              if (!param3) {
                break L13;
              } else {
                L14: {
                  if (param4 == 0) {
                    break L14;
                  } else {
                    if (param4 != 2) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                }
                var20 = 0;
                L15: while (true) {
                  if (var20 >= 5) {
                    break L12;
                  } else {
                    L16: {
                      if ((vi.field_a & 1 << var20) > 0) {
                        L17: {
                          if (var15 == 0) {
                            break L17;
                          } else {
                            if (var16 == var20) {
                              dl.field_j.a(var10 - -param0, param1 + var11, -(5 * var17) + 255, 16777215);
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        dl.field_j.g(param0 + var10, param1 + var11);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    var10 = var10 + var12;
                    var20++;
                    continue L15;
                  }
                }
              }
            }
            if (!param3) {
              var20 = 0;
              L18: while (true) {
                if (var20 >= var14 + -1) {
                  L19: {
                    if (var15 == 0) {
                      break L19;
                    } else {
                      if (0 < var14) {
                        dl.field_j.a(var10 - -param0, var11 + param1, 255 + -(5 * var17), 16777215);
                        break L12;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (var14 <= 0) {
                    break L12;
                  } else {
                    dl.field_j.g(param0 + var10, param1 + var11);
                    break L12;
                  }
                } else {
                  dl.field_j.g(var10 + param0, var11 + param1);
                  var10 = var10 + var12;
                  var20++;
                  continue L18;
                }
              }
            } else {
              break L12;
            }
          }
          L20: {
            L21: {
              if (0 == param4) {
                break L21;
              } else {
                if (param4 == 1) {
                  break L21;
                } else {
                  break L20;
                }
              }
            }
            L22: {
              var20 = 0;
              var21 = 0;
              var22 = 0;
              var23 = -1;
              if (param3) {
                var21 = wb.field_p.field_d;
                var20 = wb.field_p.field_db;
                var22 = jj.a(255);
                if (ii.field_i <= 0) {
                  break L22;
                } else {
                  var23 = 255 * ii.field_i / 50;
                  break L22;
                }
              } else {
                var21 = 5;
                var20 = ef.field_k % 250 / 50;
                var22 = ef.field_k % 300 / 50;
                var20 = var21 - var20;
                break L22;
              }
            }
            var10 = 10 + ob.field_b[0];
            var11 = 10 + ob.field_b[1];
            var12 = (-8 + ob.field_b[2] + -20) / 9;
            var10 = var10 + (-(9 * var12) + (-28 + ob.field_b[2])) / 2;
            var13 = ob.field_b[3] - 20;
            var24 = 0;
            L23: while (true) {
              L24: {
                if (var24 >= var20) {
                  break L24;
                } else {
                  if (~ad.field_b.length < ~var24) {
                    L25: {
                      L26: {
                        if (0 >= var23) {
                          break L26;
                        } else {
                          if (var24 >= be.field_d) {
                            mb.field_d[0].a(var10 - -param0, param1 + var11, var23, 16777215);
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      mb.field_d[0].g(var10 + param0, var11 - -param1);
                      break L25;
                    }
                    L27: {
                      stackOut_74_0 = ad.field_b[var24];
                      stackOut_74_1 = var11 + param1;
                      stackOut_74_2 = mb.field_d[0].field_v;
                      stackOut_74_3 = 4;
                      stackIn_76_0 = stackOut_74_0;
                      stackIn_76_1 = stackOut_74_1;
                      stackIn_76_2 = stackOut_74_2;
                      stackIn_76_3 = stackOut_74_3;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      stackIn_75_2 = stackOut_74_2;
                      stackIn_75_3 = stackOut_74_3;
                      if (0 != de.field_d % 8) {
                        stackOut_76_0 = (int[][]) (Object) stackIn_76_0;
                        stackOut_76_1 = stackIn_76_1;
                        stackOut_76_2 = stackIn_76_2;
                        stackOut_76_3 = stackIn_76_3;
                        stackOut_76_4 = 0;
                        stackIn_77_0 = stackOut_76_0;
                        stackIn_77_1 = stackOut_76_1;
                        stackIn_77_2 = stackOut_76_2;
                        stackIn_77_3 = stackOut_76_3;
                        stackIn_77_4 = stackOut_76_4;
                        break L27;
                      } else {
                        stackOut_75_0 = (int[][]) (Object) stackIn_75_0;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = stackIn_75_2;
                        stackOut_75_3 = stackIn_75_3;
                        stackOut_75_4 = 1;
                        stackIn_77_0 = stackOut_75_0;
                        stackIn_77_1 = stackOut_75_1;
                        stackIn_77_2 = stackOut_75_2;
                        stackIn_77_3 = stackOut_75_3;
                        stackIn_77_4 = stackOut_75_4;
                        break L27;
                      }
                    }
                    rd.a(stackIn_77_0, stackIn_77_1, stackIn_77_2, stackIn_77_3, stackIn_77_4 != 0, 4, -1012815519, mb.field_d[0].field_q, param0 + var10, 2);
                    var10 = var10 + (1 + var12);
                    var24++;
                    continue L23;
                  } else {
                    break L24;
                  }
                }
              }
              var24 = var20;
              L28: while (true) {
                L29: {
                  if (~var21 >= ~var24) {
                    break L29;
                  } else {
                    if (~ad.field_b.length < ~var24) {
                      mb.field_d[2].g(param0 + var10, param1 + var11);
                      var10 = var10 + (1 + var12);
                      var24++;
                      continue L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var24 = 5 - var22 % 5;
                var13 = mb.field_d[0].field_v;
                var12 = mb.field_d[0].field_q;
                if (var22 % 5 > 0) {
                  mb.field_d[0].c(-var12 + (-10 + ob.field_b[2] + (ob.field_b[0] - (-param0 + -var24))), var24 + (var11 - -param1), -(2 * var24) + var12, -(var24 * 2) + var13);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
          }
          L30: {
            if (param4 == 2) {
              if (o.field_l > 0) {
                var11 = ed.field_i[1] - -4 - (ec.field_a[1].field_q >> 2);
                var12 = ed.field_i[2];
                var10 = -(ec.field_a[1].field_q >> 2) + ed.field_i[0] + 1;
                var20 = 0;
                L31: while (true) {
                  if (10 <= var20) {
                    break L30;
                  } else {
                    L32: {
                      if (db.field_B <= var20) {
                        ec.field_a[2].g(var10, var11);
                        break L32;
                      } else {
                        L33: {
                          ec.field_a[1].g(var10, var11);
                          stackOut_93_0 = p.field_f[var20];
                          stackOut_93_1 = (ec.field_a[1].field_q >> 2) + var11;
                          stackOut_93_2 = ec.field_a[1].field_v >> 1;
                          stackOut_93_3 = 4;
                          stackIn_95_0 = stackOut_93_0;
                          stackIn_95_1 = stackOut_93_1;
                          stackIn_95_2 = stackOut_93_2;
                          stackIn_95_3 = stackOut_93_3;
                          stackIn_94_0 = stackOut_93_0;
                          stackIn_94_1 = stackOut_93_1;
                          stackIn_94_2 = stackOut_93_2;
                          stackIn_94_3 = stackOut_93_3;
                          if (0 != de.field_d % 8) {
                            stackOut_95_0 = (int[][]) (Object) stackIn_95_0;
                            stackOut_95_1 = stackIn_95_1;
                            stackOut_95_2 = stackIn_95_2;
                            stackOut_95_3 = stackIn_95_3;
                            stackOut_95_4 = 0;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            stackIn_96_2 = stackOut_95_2;
                            stackIn_96_3 = stackOut_95_3;
                            stackIn_96_4 = stackOut_95_4;
                            break L33;
                          } else {
                            stackOut_94_0 = (int[][]) (Object) stackIn_94_0;
                            stackOut_94_1 = stackIn_94_1;
                            stackOut_94_2 = stackIn_94_2;
                            stackOut_94_3 = stackIn_94_3;
                            stackOut_94_4 = 1;
                            stackIn_96_0 = stackOut_94_0;
                            stackIn_96_1 = stackOut_94_1;
                            stackIn_96_2 = stackOut_94_2;
                            stackIn_96_3 = stackOut_94_3;
                            stackIn_96_4 = stackOut_94_4;
                            break L33;
                          }
                        }
                        rd.a(stackIn_96_0, stackIn_96_1, stackIn_96_2, stackIn_96_3, stackIn_96_4 != 0, 4, -1012815519, ec.field_a[1].field_q >> 1, var10 + (ec.field_a[1].field_q >> 2), 2);
                        break L32;
                      }
                    }
                    var10 = var10 + (ec.field_a[1].field_u - -1);
                    var20++;
                    continue L31;
                  }
                }
              } else {
                break L30;
              }
            } else {
              break L30;
            }
          }
          L34: {
            if (1 == param4) {
              L35: {
                var11 = 6 + oa.field_a[1];
                var20 = 8;
                var10 = oa.field_a[0] - -7;
                if (null != cj.field_f) {
                  rl.field_h[fh.field_e].g(var10, var11);
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                var11 = oa.field_a[1] + (oa.field_a[3] - mb.field_d[1].field_v >> 1);
                var10 = oa.field_a[0] - (-10 - rl.field_h[fh.field_e].field_q);
                var13 = oa.field_a[3];
                var12 = -rl.field_h[fh.field_e].field_q + (oa.field_a[2] + -20 + -var20 + 1);
                var21 = var12 / var20;
                var22 = (-(var21 * var20) + var12) / 2 + var10;
                var12 = var21 * var20;
                var23 = 0;
                var24 = 0;
                if (cj.field_f == null) {
                  break L36;
                } else {
                  var23 = cj.field_f.field_db;
                  var24 = cj.field_f.field_d;
                  if (var23 <= 0) {
                    var23 = 0;
                    break L36;
                  } else {
                    break L36;
                  }
                }
              }
              var25 = var10;
              qg.a(sh.field_w);
              var26 = var22 - -((var20 + -1 + var12) * var23 / var24);
              qg.a(var25, var11, var26, var11 + var13);
              var27 = 0;
              L37: while (true) {
                if (~var27 <= ~var20) {
                  var25 = var26;
                  qg.b(sh.field_w);
                  var26 = var20 + -1 + (var12 + var22);
                  qg.a(sh.field_w);
                  qg.a(var25, var11, var26, var13 + var11);
                  var22 = var10 + 1;
                  var27 = 0;
                  L38: while (true) {
                    if (~var27 <= ~var20) {
                      qg.b(sh.field_w);
                      break L34;
                    } else {
                      mb.field_d[2].g(var22, var11);
                      var22 = var22 + (var21 - -1);
                      var27++;
                      continue L38;
                    }
                  }
                } else {
                  L39: {
                    mb.field_d[1].g(var22, var11);
                    stackOut_110_0 = ad.field_b[var27];
                    stackOut_110_1 = var11;
                    stackOut_110_2 = mb.field_d[1].field_v;
                    stackOut_110_3 = 4;
                    stackIn_112_0 = stackOut_110_0;
                    stackIn_112_1 = stackOut_110_1;
                    stackIn_112_2 = stackOut_110_2;
                    stackIn_112_3 = stackOut_110_3;
                    stackIn_111_0 = stackOut_110_0;
                    stackIn_111_1 = stackOut_110_1;
                    stackIn_111_2 = stackOut_110_2;
                    stackIn_111_3 = stackOut_110_3;
                    if (de.field_d % 8 != 0) {
                      stackOut_112_0 = (int[][]) (Object) stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = stackIn_112_2;
                      stackOut_112_3 = stackIn_112_3;
                      stackOut_112_4 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      stackIn_113_3 = stackOut_112_3;
                      stackIn_113_4 = stackOut_112_4;
                      break L39;
                    } else {
                      stackOut_111_0 = (int[][]) (Object) stackIn_111_0;
                      stackOut_111_1 = stackIn_111_1;
                      stackOut_111_2 = stackIn_111_2;
                      stackOut_111_3 = stackIn_111_3;
                      stackOut_111_4 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      stackIn_113_1 = stackOut_111_1;
                      stackIn_113_2 = stackOut_111_2;
                      stackIn_113_3 = stackOut_111_3;
                      stackIn_113_4 = stackOut_111_4;
                      break L39;
                    }
                  }
                  rd.a(stackIn_113_0, stackIn_113_1, stackIn_113_2, stackIn_113_3, stackIn_113_4 != 0, 4, -1012815519, mb.field_d[1].field_q, var22, 2);
                  var22 = var22 + (1 + var21);
                  var27++;
                  continue L37;
                }
              }
            } else {
              break L34;
            }
          }
          L40: {
            var12 = oj.field_e[2];
            var11 = oj.field_e[1];
            var10 = oj.field_e[0];
            var13 = oj.field_e[3];
            var10 = 2 + (var10 + (var12 >> 1) - -12);
            var18 = 24;
            var20 = 0;
            if (!param3) {
              var20 = ef.field_k % 300;
              var20 = var20 / 100;
              var20 = 3 - var20;
              break L40;
            } else {
              var20 = gl.field_k;
              break L40;
            }
          }
          L41: {
            L42: {
              tf.field_x.a(Integer.toString(var20), var10 + param0, param1 + var11 + ((var13 - var18 >> 1) + 18), 0, -1);
              if (param4 == 0) {
                break L42;
              } else {
                if (param4 != 1) {
                  if (param4 != 2) {
                    break L41;
                  } else {
                    var11 = af.field_f[1];
                    var12 = af.field_f[2];
                    var30 = w.field_j + (o.field_l / 50 + 1);
                    var10 = af.field_f[0];
                    var13 = af.field_f[3];
                    tf.field_x.c(var30, 13 + var10, (var13 - var18 >> 1) + (var11 + 18), 0, -1);
                    break L41;
                  }
                } else {
                  break L42;
                }
              }
            }
            L43: {
              var21 = 0;
              var22 = 0;
              if (!param3) {
                var21 = 100 * (ef.field_k % 1000);
                var22 = ef.field_k % 500 / 200;
                break L43;
              } else {
                var21 = tf.field_o;
                var22 = ab.field_d;
                break L43;
              }
            }
            var10 = af.field_f[0];
            var9 = oi.field_h + var21;
            var11 = af.field_f[1];
            var13 = af.field_f[3];
            var12 = af.field_f[2];
            tf.field_x.c(var9, 13 + var10 - -param0, param1 + var11 - -(var13 - var18 >> 1) - -18, 0, -1);
            if (1 < var22) {
              var11 = ag.field_e.field_x + ((var13 - ag.field_e.field_K - ag.field_e.field_x >> 1) + var11);
              var29 = vj.field_b + var22;
              var10 = var12 + var10;
              ag.field_e.b(var29, var10 + (param0 - 13), param1 + var11, 0, -1);
              break L41;
            } else {
              break L41;
            }
          }
          L44: {
            L45: {
              L46: {
                if (0 == param4) {
                  break L46;
                } else {
                  if (param4 != 2) {
                    break L45;
                  } else {
                    break L46;
                  }
                }
              }
              if (!param3) {
                break L45;
              } else {
                TorChallenge.field_E = be.a(mj.field_b, dk.field_a, vj.field_c, param1 + rf.field_eb[vj.field_c][1], rf.field_eb[vj.field_c][0] + param0, 25, TorChallenge.field_E, hf.field_c);
                break L44;
              }
            }
            break L44;
          }
          return;
        } else {
          return;
        }
    }

    abstract byte[] c(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ka(160, 160);
        field_a = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_d = 65;
    }
}
