/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static fj field_b;
    static int field_c;
    static id[] field_a;

    final static void a(bj param0, byte param1, bj param2) {
        try {
            uk.field_xb = param2;
            if (param1 <= 68) {
                im.a(-65);
            }
            wk.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "im.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6776) {
            return;
        }
        field_b = null;
    }

    final static boolean a(int[] param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        jn var4_ref_jn = null;
        int var4 = 0;
        int var5_int = 0;
        jn var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (qd.field_Q != pb.field_c) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var2_long = sf.a((byte) 116);
                if (qc.field_f == 0) {
                  break L1;
                } else {
                  if (qh.field_a < 0) {
                    var4_ref_jn = (jn) (Object) mc.field_m.b(74);
                    if (var4_ref_jn == null) {
                      break L1;
                    } else {
                      if (var2_long > var4_ref_jn.field_o) {
                        var4_ref_jn.b(34);
                        rj.field_d = var4_ref_jn.field_s.length;
                        kj.field_a.field_o = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (rj.field_d <= var5_int) {
                            lc.field_s = rd.field_a;
                            rd.field_a = ud.field_a;
                            ud.field_a = oj.field_K;
                            oj.field_K = var4_ref_jn.field_q;
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          } else {
                            kj.field_a.field_u[var5_int] = var4_ref_jn.field_s[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (0 <= qh.field_a) {
                    break L4;
                  } else {
                    kj.field_a.field_o = 0;
                    if (!ta.a(0, 1)) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    } else {
                      qh.field_a = kj.field_a.e((byte) 0);
                      kj.field_a.field_o = 0;
                      rj.field_d = param0[qh.field_a];
                      break L4;
                    }
                  }
                }
                if (kj.b(-9319)) {
                  if (0 == qc.field_f) {
                    lc.field_s = rd.field_a;
                    rd.field_a = ud.field_a;
                    ud.field_a = oj.field_K;
                    oj.field_K = qh.field_a;
                    qh.field_a = -1;
                    stackOut_33_0 = 1;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    L5: {
                      var4 = qc.field_f;
                      if (ci.field_k == 0.0) {
                        break L5;
                      } else {
                        var4 = (int)((double)var4 + dk.field_a.nextGaussian() * ci.field_k);
                        if (0 <= var4) {
                          break L5;
                        } else {
                          var4 = 0;
                          break L5;
                        }
                      }
                    }
                    var5 = new jn((long)var4 + var2_long, qh.field_a, new byte[rj.field_d]);
                    var6 = 0;
                    L6: while (true) {
                      if (rj.field_d <= var6) {
                        mc.field_m.a((byte) 50, (pi) (Object) var5);
                        qh.field_a = -1;
                        continue L3;
                      } else {
                        var5.field_s[var6] = kj.field_a.field_u[var6];
                        var6++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("im.G(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + 0 + 41);
        }
        return stackIn_34_0 != 0;
    }

    final static void a(byte param0) {
        bd.field_c = sl.e(105);
        mb.field_b = new hm();
        ie.a(true, true, -57);
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            L1: {
              var3 = re.a(param2, 0);
              if (param0.indexOf(param2) != param1) {
                break L1;
              } else {
                if (0 != param0.indexOf(var3)) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0.startsWith(param2)) {
                        break L3;
                      } else {
                        if (param0.startsWith(var3)) {
                          break L3;
                        } else {
                          if (param0.endsWith(param2)) {
                            break L3;
                          } else {
                            if (!param0.endsWith(var3)) {
                              stackOut_11_0 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                  break L0;
                }
              }
            }
            stackOut_3_0 = 1;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("im.B(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final static sj[] b(int param0) {
        return new sj[]{ak.field_b, hj.field_e, li.field_d};
    }

    final static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        sb var16 = null;
        sb var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var15 = MinerDisturbance.field_ab;
        try {
          L0: {
            var16 = new sb(param1);
            var17 = var16;
            var17.field_o = -2 + param1.length;
            sc.field_d = var17.e(-120);
            db.field_b = new byte[sc.field_d][];
            jk.field_gb = new boolean[sc.field_d];
            oc.field_e = new int[sc.field_d];
            bg.field_d = new int[sc.field_d];
            ng.field_e = new int[sc.field_d];
            qk.field_b = new int[sc.field_d];
            ci.field_a = new byte[sc.field_d][];
            var17.field_o = -(8 * sc.field_d) + param1.length - 7;
            pf.field_c = var17.e(-72);
            wd.field_a = var17.e(-68);
            var3 = 1 + (var17.d((byte) -54) & 255);
            var4 = 0;
            L1: while (true) {
              if (sc.field_d <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= sc.field_d) {
                    L3: {
                      if (param0 <= -4) {
                        break L3;
                      } else {
                        field_a = null;
                        break L3;
                      }
                    }
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= sc.field_d) {
                        var4 = 0;
                        L5: while (true) {
                          if (sc.field_d <= var4) {
                            var17.field_o = -(var3 * 3) + (3 + (-(sc.field_d * 8) + param1.length) - 7);
                            af.field_p = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var17.field_o = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (sc.field_d <= var4) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = qk.field_b[var4];
                                      var6 = ng.field_e[var4];
                                      var7 = var5 * var6;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      db.field_b[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ci.field_a[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.d((byte) -54);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var5) {
                                            if ((var11 & 2) != 0) {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var5 <= var12) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        byte dupTemp$2 = var17.m(4);
                                                        var9[var5 * var13 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_46_0 = var10;
                                                        stackIn_48_0 = stackOut_46_0;
                                                        stackIn_47_0 = stackOut_46_0;
                                                        if (var14 == -1) {
                                                          stackOut_48_0 = stackIn_48_0;
                                                          stackOut_48_1 = 0;
                                                          stackIn_49_0 = stackOut_48_0;
                                                          stackIn_49_1 = stackOut_48_1;
                                                          break L12;
                                                        } else {
                                                          stackOut_47_0 = stackIn_47_0;
                                                          stackOut_47_1 = 1;
                                                          stackIn_49_0 = stackOut_47_0;
                                                          stackIn_49_1 = stackOut_47_1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_49_0 | stackIn_49_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var13 >= var6) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var12 - -(var5 * var13)] = var17.m(4);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var7 <= var12) {
                                            if ((2 & var11) == 0) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var7 <= var12) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    byte dupTemp$3 = var17.m(4);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_30_0 = var10;
                                                    stackIn_32_0 = stackOut_30_0;
                                                    stackIn_31_0 = stackOut_30_0;
                                                    if (var13 == -1) {
                                                      stackOut_32_0 = stackIn_32_0;
                                                      stackOut_32_1 = 0;
                                                      stackIn_33_0 = stackOut_32_0;
                                                      stackIn_33_1 = stackOut_32_1;
                                                      break L16;
                                                    } else {
                                                      stackOut_31_0 = stackIn_31_0;
                                                      stackOut_31_1 = 1;
                                                      stackIn_33_0 = stackOut_31_0;
                                                      stackIn_33_1 = stackOut_31_1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_33_0 | stackIn_33_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.m(4);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    jk.field_gb[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  af.field_p[var4] = var17.i(71);
                                  if (af.field_p[var4] == 0) {
                                    af.field_p[var4] = 1;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            ng.field_e[var4] = var17.e(-118);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        qk.field_b[var4] = var17.e(-120);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    oc.field_e[var4] = var17.e(-43);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                bg.field_d[var4] = var16.e(-89);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var2;
            stackOut_53_1 = new StringBuilder().append("im.E(").append(param0).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param1 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L18;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L18;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
    }
}
