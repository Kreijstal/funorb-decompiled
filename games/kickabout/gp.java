/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gp extends ps {
    private String field_f;
    static int[] field_g;
    private String field_h;
    static int field_i;

    final kj a(byte param0) {
        if (param0 > -77) {
            Object var3 = null;
            ((gp) this).a((iw) null, -96);
        }
        return qq.field_K;
    }

    public static void c() {
        int var1 = -1;
        field_g = null;
    }

    final static void b() {
        ag var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              cb.field_d.d();
              pg.field_d.d();
              ri.field_r = ri.field_r - 1;
              if (ri.field_r != 0) {
                break L1;
              } else {
                ri.field_r = 200;
                var1 = (ag) (Object) ps.field_a.g(24009);
                L2: while (true) {
                  if (var1 == null) {
                    if (null != qd.field_c) {
                      var1 = (ag) (Object) qd.field_c.g(24009);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_k.e((byte) -113)) {
                              var1.c((byte) -109);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (ag) (Object) qd.field_c.c(33);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (!var1.field_k.e((byte) -113)) {
                        var1.c((byte) -109);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (ag) (Object) ps.field_a.c(33);
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1_ref, "gp.M(" + -28 + 41);
        }
    }

    final static void a(boolean param0) {
        g.field_a.a(97, param0);
        ib var2 = la.field_a;
        if (!(var2 == null)) {
            var2.a(g.field_a.field_T, g.field_a.field_F, (byte) -120);
        }
    }

    final static ld a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ld stackIn_4_0 = null;
        ld stackIn_8_0 = null;
        ld stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        ld stackIn_26_0 = null;
        ld stackIn_39_0 = null;
        ld stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_3_0 = null;
        ld stackOut_7_0 = null;
        ld stackOut_13_0 = null;
        ld stackOut_25_0 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        ld stackOut_43_0 = null;
        ld stackOut_38_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var7 = Kickabout.field_G;
        try {
          var3 = 0;
          var2_int = param1.length();
          if (0 == var2_int) {
            stackOut_3_0 = ld.field_b;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = st.field_j;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param1.charAt(0) == 34) {
                if (param1.charAt(-1 + var2_int) != 34) {
                  stackOut_13_0 = lm.field_F;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  var4 = 0;
                  var5 = 1;
                  L0: while (true) {
                    if (var5 < -1 + var2_int) {
                      L1: {
                        var6 = param1.charAt(var5);
                        if (var6 != 92) {
                          L2: {
                            if (var6 != 34) {
                              break L2;
                            } else {
                              if (var4 != 0) {
                                break L2;
                              } else {
                                stackOut_25_0 = lm.field_F;
                                stackIn_26_0 = stackOut_25_0;
                                return stackIn_26_0;
                              }
                            }
                          }
                          var4 = 0;
                          break L1;
                        } else {
                          L3: {
                            if (var4 != 0) {
                              stackOut_21_0 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              break L3;
                            } else {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L3;
                            }
                          }
                          var4 = stackIn_22_0;
                          break L1;
                        }
                      }
                      var5++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var4 = 0;
                var5 = 0;
                L4: while (true) {
                  if (var2_int > var5) {
                    L5: {
                      var6 = param1.charAt(var5);
                      if (var6 != 46) {
                        if (ua.field_i.indexOf(var6) == -1) {
                          stackOut_43_0 = lm.field_F;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        } else {
                          var4 = 0;
                          break L5;
                        }
                      } else {
                        L6: {
                          if (var5 == 0) {
                            break L6;
                          } else {
                            if (var5 == var2_int + -1) {
                              break L6;
                            } else {
                              if (var4 != 0) {
                                break L6;
                              } else {
                                var4 = 1;
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_38_0 = lm.field_F;
                        stackIn_39_0 = stackOut_38_0;
                        return stackIn_39_0;
                      }
                    }
                    var5++;
                    continue L4;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("gp.J(").append(-25).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param1 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L7;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 41);
        }
    }

    final static boolean a(byte param0, String param1, boolean param2, String param3, ae param4, int param5, String param6) {
        RuntimeException var7 = null;
        jn var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (wk.field_f != vj.field_a) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var8 = new jn(wd.field_l, param4);
              wd.field_l.a((fd) (Object) var8, false);
              int discarded$16 = 59;
              if (!wq.c()) {
                L1: {
                  kl.field_a = null;
                  if (!param2) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                n.field_c = stackIn_9_0 != 0;
                tn.field_b = param5;
                wn.field_i = param6;
                wk.field_f = nr.field_f;
                ld.field_a = param1;
                qr.field_f = param3;
                return true;
              } else {
                var8.t(17);
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7;
            stackOut_12_1 = new StringBuilder().append("gp.B(").append(117).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44).append(param5).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param6 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ml var9 = null;
        int var7 = 0;
        try {
            var9 = or.field_d;
            ml var6 = var9;
            var9.b(param3, (byte) 104);
            var9.field_n = var9.field_n + 1;
            int var8 = 39 / ((param1 - 14) / 61);
            var7 = var9.field_n;
            var9.a(113, param2);
            if (!(param2 != 2)) {
                var9.a(14190, param4);
            }
            if (param5 == null) {
                var9.g(-1207444472, param0);
            } else {
                int discarded$0 = cu.a((byte) 104, param5, (iw) (Object) var9);
            }
            var9.c(62, -var7 + var9.field_n);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gp.I(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(iw param0, int param1) {
        param0.a(((gp) this).field_f, (byte) -126);
        if (param1 != 17053) {
            return;
        }
        try {
            param0.a((byte) 124, ((gp) this).field_h);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gp.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static int a(up param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fn var5 = null;
        int var6 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (param0.field_h.length <= var3) {
                L2: {
                  var3 = p.a(928, param0);
                  if (15 > var3) {
                    break L2;
                  } else {
                    var2_int = (452 * ((var3 + -15) * (var3 + -15)) >> 5) + 10;
                    var4 = 0;
                    L3: while (true) {
                      if (param0.field_h.length <= var4) {
                        break L2;
                      } else {
                        var5 = pa.field_g[param0.field_h[var4]];
                        var2_int = var2_int + fn.field_g[var5.field_k];
                        var2_int = var2_int + (var5.field_e >> 2);
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
                stackOut_8_0 = var2_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var2_int = var2_int + (pa.field_g[param0.field_h[var3]].field_e >> 1);
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("gp.K(");
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
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + -576054046 + 41);
        }
        return stackIn_9_0;
    }

    gp(String param0, String param1) {
        try {
            ((gp) this).field_h = param1;
            ((gp) this).field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "gp.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new int[8192];
    }
}
