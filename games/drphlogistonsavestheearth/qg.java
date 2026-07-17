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
        field_W = null;
    }

    qg(String param0, fd param1, int param2) {
        super(param0, param1, param2);
    }

    public final qi a(byte param0) {
        int var2 = 90 % ((param0 - -80) / 39);
        return ((qg) this).field_X;
    }

    final void a(qi param0, byte param1) {
        if (param1 != -57) {
            return;
        }
        try {
            ((qg) this).field_X = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "qg.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static int n(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
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
                      if (wg.field_k.field_f >= 0) {
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
                    if (re.field_g == 2) {
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
                    field_U = null;
                    break L6;
                  }
                }
                L7: {
                  if (var3 != 0) {
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
                stackOut_27_0 = var3;
                stackIn_28_0 = stackOut_27_0;
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
          throw ie.a((Throwable) (Object) var1, "qg.B(" + param0 + 41);
        }
        return stackIn_28_0;
    }

    final static bm a(vj param0, String param1, String param2, vj param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        bm stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
            var6 = -127 / ((param4 - 40) / 53);
            var5_int = param3.a(param2, (byte) -104);
            var7 = param3.a((byte) -66, param1, var5_int);
            stackOut_0_0 = tc.a(var7, param3, var5_int, param0, 65245);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("qg.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        try {
            qf.field_c = param1;
            nd.field_K = param2;
            if (param3 != -11) {
                Object var5 = null;
                String discarded$0 = qg.a((String) null, (String) null, 112, (String) null, (vj) null);
            }
            nc.a(j.field_Y, param0, (byte) 77);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "qg.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
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
                    field_W = null;
                    break L2;
                  }
                }
                stackOut_13_0 = -1;
                stackIn_14_0 = stackOut_13_0;
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
                    var7 = -(var6 >> 1) + ji.field_f;
                    if (g.a((dg.field_d << 1) + var6, (byte) -108, ni.field_p + (wa.field_N << 1), var4, var7 - dg.field_d, param0, param2)) {
                      stackOut_6_0 = var5;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    } else {
                      var4 = var4 + (ni.field_p + ig.field_h + (wa.field_N << 1));
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
          throw ie.a((Throwable) (Object) var3, "qg.F(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_14_0;
    }

    final static og l(int param0) {
        if (fk.field_q == pj.field_D) {
            throw new IllegalStateException();
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
            ah.field_K = param0.j(-788751192) << 5;
            var2_int = param0.l(31760);
            ah.field_K = ah.field_K + (var2_int >> 3);
            d.field_b = (7 & var2_int) << 18;
            d.field_b = d.field_b + (param0.j(-788751192) << 2);
            var2_int = param0.l(31760);
            oh.field_d = (63 & var2_int) << 15;
            d.field_b = d.field_b + (var2_int >> 6);
            oh.field_d = oh.field_d + (param0.l(31760) << 7);
            var2_int = param0.l(31760);
            oh.field_d = oh.field_d + (var2_int >> 1);
            j.field_e = var2_int << 16 & 65536;
            j.field_e = j.field_e + param0.j(-788751192);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "qg.G(" + (param0 != null ? "{...}" : "null") + 44 + 104 + 41);
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, (byte) -128);
              ((qg) this).field_I = -param1 + -((qg) this).field_o + ck.field_c;
              if (param3 <= -127) {
                break L1;
              } else {
                var6 = null;
                ((qg) this).a((qi) null, (byte) -8);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qg.I(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static String a(String param0, String param1, int param2, String param3, vj param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
        try {
          L0: {
            if (param2 == 34) {
              if (param4.a(0)) {
                stackOut_6_0 = param1 + " - " + param4.b(10461, param3) + "%";
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = (String) param0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("qg.MA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_7_0;
    }

    final static vi b(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        vi stackIn_6_0 = null;
        vi stackIn_10_0 = null;
        vi stackIn_16_0 = null;
        int stackIn_24_0 = 0;
        vi stackIn_29_0 = null;
        vi stackIn_42_0 = null;
        vi stackIn_47_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_5_0 = null;
        vi stackOut_9_0 = null;
        vi stackOut_15_0 = null;
        vi stackOut_28_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        vi stackOut_46_0 = null;
        vi stackOut_41_0 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 > 66) {
              break L0;
            } else {
              field_U = null;
              break L0;
            }
          }
          var2_int = param1.length();
          if (var2_int == 0) {
            stackOut_5_0 = qj.field_e;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } else {
            if (var2_int > 64) {
              stackOut_9_0 = ej.field_f;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              if (param1.charAt(0) == 34) {
                if (param1.charAt(var2_int - 1) != 34) {
                  stackOut_15_0 = dh.field_H;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L1: while (true) {
                    if (~(var2_int - 1) < ~var4) {
                      L2: {
                        var5 = param1.charAt(var4);
                        if (var5 != 92) {
                          L3: {
                            if (var5 != 34) {
                              break L3;
                            } else {
                              if (var3 == 0) {
                                stackOut_28_0 = dh.field_H;
                                stackIn_29_0 = stackOut_28_0;
                                return stackIn_29_0;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var3 = 0;
                          break L2;
                        } else {
                          L4: {
                            if (var3 != 0) {
                              stackOut_23_0 = 0;
                              stackIn_24_0 = stackOut_23_0;
                              break L4;
                            } else {
                              stackOut_22_0 = 1;
                              stackIn_24_0 = stackOut_22_0;
                              break L4;
                            }
                          }
                          var3 = stackIn_24_0;
                          break L2;
                        }
                      }
                      var4++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4 = 0;
                L5: while (true) {
                  if (var4 < var2_int) {
                    L6: {
                      var5 = param1.charAt(var4);
                      if (46 != var5) {
                        if (m.field_b.indexOf(var5) == -1) {
                          stackOut_46_0 = dh.field_H;
                          stackIn_47_0 = stackOut_46_0;
                          return stackIn_47_0;
                        } else {
                          var3 = 0;
                          break L6;
                        }
                      } else {
                        L7: {
                          if (var4 == 0) {
                            break L7;
                          } else {
                            if (~(var2_int - 1) == ~var4) {
                              break L7;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_41_0 = dh.field_H;
                        stackIn_42_0 = stackOut_41_0;
                        return stackIn_42_0;
                      }
                    }
                    var4++;
                    continue L5;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var2;
            stackOut_51_1 = new StringBuilder().append("qg.O(").append(param0).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L8;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
    }

    final static int m(int param0) {
        return th.field_e;
    }

    final void m(byte param0) {
        super.m((byte) 103);
        if (((qg) this).field_X != null) {
            ((qg) this).field_X.a((byte) 87);
        }
        int var2 = -108 % ((param0 - 35) / 33);
    }

    final String e(int param0) {
        if (!((qg) this).field_n) {
            return null;
        }
        if (((qg) this).field_v == null) {
            return null;
        }
        oh.a(26500, ob.field_g, ((qg) this).field_w + -((qg) this).field_I + ck.field_c);
        if (param0 >= -39) {
            Object var3 = null;
            qg.a(false, (String) null, (String) null, (byte) 23);
        }
        return ((qg) this).field_v;
    }

    static {
    }
}
