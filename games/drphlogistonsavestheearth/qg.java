/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends kl implements ud {
    private int field_I;
    private qi field_X;
    static he[] field_W;
    static he[] field_U;

    public static void n(int param0) {
        field_U = null;
        if (param0 != -1) {
            qg.n((byte) 59);
        }
        field_W = null;
    }

    qg(String param0, fd param1, int param2) {
        super(param0, param1, param2);
    }

    public final qi a(byte param0) {
        int var2 = 90 % ((param0 - -80) / 39);
        return this.field_X;
    }

    final void a(qi param0, byte param1) {
        if (param1 != -57) {
            return;
        }
        try {
            this.field_X = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int n(byte param0) {
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!th.a(46)) {
                L2: {
                  wg.field_k.a(0, qg.a(ob.field_g, (byte) -112, ck.field_c), qg.a(ih.field_R, (byte) -112, ae.field_gb));
                  if (wg.field_k.c((byte) -82)) {
                    var1_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if ((wg.field_k.field_f ^ -1) <= -1) {
                        L5: {
                          var3 = mi.field_g[wg.field_k.field_f];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (5 != var3) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        ch.c(3);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (-3 == (re.field_g ^ -1)) {
                      break L3;
                    } else {
                      ch.c(3);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (param0 == 46) {
                    break L6;
                  } else {
                    field_U = (he[]) null;
                    break L6;
                  }
                }
                L7: {
                  if (-1 != (var3 ^ -1)) {
                    break L7;
                  } else {
                    if (2 != re.field_g) {
                      break L7;
                    } else {
                      var4 = -aa.field_d + la.a(false);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        var3 = 2;
                        jk.a((byte) 49, true, 5);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                stackIn_28_0 = var3;
                break L0;
              } else {
                L8: {
                  wg.field_k.c(param0 + -5);
                  if (!wg.field_k.c((byte) -82)) {
                    break L8;
                  } else {
                    var1_int = 1;
                    break L8;
                  }
                }
                if (di.field_c != 13) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "qg.B(" + param0 + ')');
        }
        return stackIn_28_0;
    }

    final static bm a(vj param0, String param1, String param2, vj param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        bm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = -127 / ((param4 - 40) / 53);
            var5_int = param3.a(param2, (byte) -104);
            var7 = param3.a((byte) -66, param1, var5_int);
            stackIn_1_0 = tc.a(var7, param3, var5_int, param0, 65245);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("qg.E(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        try {
            qf.field_c = param1;
            nd.field_K = param2;
            if (param3 != -11) {
                vj var5 = (vj) null;
                qg.a((String) null, (String) null, 112, (String) null, (vj) null);
            }
            nc.a(j.field_Y, param0, (byte) 77);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qg.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = jd.field_N;
            L1: while (true) {
              if (var3_int >= sg.field_f.length) {
                L2: {
                  if (param1 == -112) {
                    break L2;
                  } else {
                    field_W = (he[]) null;
                    break L2;
                  }
                }
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = lg.field_a[var3_int];
                  if (0 > var5) {
                    var4 = var4 + s.field_g;
                    break L3;
                  } else {
                    var6 = u.a(sg.field_f[var3_int], true, true);
                    var4 = var4 + ig.field_h;
                    var7 = -(var6 >> 166003809) + ji.field_f;
                    if (g.a((dg.field_d << -1769105727) + var6, (byte) -108, ni.field_p + (wa.field_N << -1371097599), var4, var7 - dg.field_d, param0, param2)) {
                      stackIn_7_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (ni.field_p + ig.field_h + (wa.field_N << -1164920351));
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "qg.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static og l(int param0) {
        if (fk.field_q == pj.field_D) {
            throw new IllegalStateException();
        }
        if (param0 != 19860) {
            return (og) null;
        }
        if (fk.field_q != wg.field_u) {
            return null;
        }
        fk.field_q = pj.field_D;
        return jj.field_d;
    }

    final static void a(od param0, byte param1) {
        int var2_int = 0;
        try {
            ah.field_K = param0.j(-788751192) << 1858275077;
            var2_int = param0.l(31760);
            ah.field_K = ah.field_K + (var2_int >> 464758499);
            d.field_b = (7 & var2_int) << 2106993010;
            d.field_b = d.field_b + (param0.j(-788751192) << 328831970);
            var2_int = param0.l(31760);
            oh.field_d = (63 & var2_int) << 455532303;
            d.field_b = d.field_b + (var2_int >> 240440934);
            oh.field_d = oh.field_d + (param0.l(31760) << 617323527);
            var2_int = param0.l(31760);
            oh.field_d = oh.field_d + (var2_int >> 959710753);
            if (param1 <= 51) {
                field_W = (he[]) null;
            }
            j.field_e = var2_int << 85565264 & 65536;
            j.field_e = j.field_e + param0.j(-788751192);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "qg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        qi var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -128);
              this.field_I = -param1 + -this.field_o + ck.field_c;
              if (param3 <= -127) {
                break L1;
              } else {
                var6 = (qi) null;
                this.a((qi) null, (byte) -8);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("qg.I(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, String param1, int param2, String param3, vj param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 34) {
              if (param4.a(0)) {
                stackIn_7_0 = param1 + " - " + param4.b(10461, param3) + "%";
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (String) (param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qg.MA(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static vi b(byte param0, String param1) {
        vi stackIn_6_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_16_0 = null;
        int stackIn_24_0 = 0;
        vi stackIn_29_0 = null;
        vi stackIn_42_0 = null;
        vi stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 66) {
                break L1;
              } else {
                field_U = (he[]) null;
                break L1;
              }
            }
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_6_0 = qj.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackIn_10_0 = ej.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(var2_int - 1) != 34) {
                    stackIn_16_0 = dh.field_H;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var3 = 0;
                    var4 = 1;
                    L2: while (true) {
                      if (var2_int - 1 > var4) {
                        L3: {
                          var5 = param1.charAt(var4);
                          if (var5 != 92) {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 == 0) {
                                  stackIn_29_0 = dh.field_H;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var3 = 0;
                            break L3;
                          } else {
                            L5: {
                              if (var3 != 0) {
                                stackIn_24_0 = 0;
                                break L5;
                              } else {
                                stackIn_24_0 = 1;
                                break L5;
                              }
                            }
                            var3 = stackIn_24_0;
                            break L3;
                          }
                        }
                        var4++;
                        continue L2;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L6: while (true) {
                    if (var4 < var2_int) {
                      L7: {
                        var5 = param1.charAt(var4);
                        if (46 != var5) {
                          if (0 == (m.field_b.indexOf(var5) ^ -1)) {
                            stackIn_47_0 = dh.field_H;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            var3 = 0;
                            break L7;
                          }
                        } else {
                          L8: {
                            if (-1 == (var4 ^ -1)) {
                              break L8;
                            } else {
                              if (var2_int - 1 == var4) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackIn_42_0 = dh.field_H;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var2);

            stackIn_53_1 = new StringBuilder().append("qg.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L9;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0;
                } else {
                  return stackIn_47_0;
                }
              }
            }
          }
        }
    }

    final static int m(int param0) {
        if (param0 != 12484) {
            field_W = (he[]) null;
        }
        return th.field_e;
    }

    final void m(byte param0) {
        super.m((byte) 103);
        if (this.field_X != null) {
            this.field_X.a((byte) 87);
        }
        int var2 = -108 % ((param0 - 35) / 33);
    }

    final String e(int param0) {
        if (!this.field_n) {
            return null;
        }
        if (this.field_v == null) {
            return null;
        }
        oh.a(26500, ob.field_g, this.field_w + -this.field_I + ck.field_c);
        if (param0 >= -39) {
            String var3 = (String) null;
            qg.a(false, (String) null, (String) null, (byte) 23);
        }
        return this.field_v;
    }

    static {
    }
}
