/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pd extends sd {
    private long field_d;
    static ah field_e;
    static gn field_f;
    static String field_g;
    static go field_h;
    private String field_i;

    kb a(boolean param0) {
        if (!param0) {
            return null;
        }
        return jh.field_d;
    }

    final static int a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_63_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_78_0 = 0;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            dl.field_i = dl.field_i + 65536;
            L1: while (true) {
              int discarded$1 = -100;
              if (on.a(bg.field_c, dl.field_i) < 65536) {
                L2: {
                  var2_int = -1;
                  if (qk.field_y != null) {
                    var2_int = qk.field_y.length;
                    break L2;
                  } else {
                    if (null != lf.field_a) {
                      var2_int = lf.field_a.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2_int != -1) {
                    L4: {
                      if (bg.field_f <= hk.field_e) {
                        break L4;
                      } else {
                        L5: {
                          hk.field_e = hk.field_e + 1;
                          if (hk.field_e <= bg.field_g) {
                            break L5;
                          } else {
                            L6: {
                              if (null == qk.field_y) {
                                break L6;
                              } else {
                                if (null != qk.field_y[va.field_e]) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            hk.field_e = hk.field_e - 1;
                            break L4;
                          }
                        }
                        if (bg.field_f > hk.field_e) {
                          break L4;
                        } else {
                          if (qk.field_y[(1 + va.field_e) % var2_int] == null) {
                            hk.field_e = hk.field_e - 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (hk.field_e >= bg.field_f) {
                        hf.field_i = va.field_e;
                        hk.field_e = hk.field_e - bg.field_f;
                        if (!rg.field_e) {
                          va.field_e = va.field_e - 1;
                          if (va.field_e >= 0) {
                            break L7;
                          } else {
                            va.field_e = va.field_e + var2_int;
                            break L7;
                          }
                        } else {
                          va.field_e = va.field_e + 1;
                          if (va.field_e < var2_int) {
                            break L7;
                          } else {
                            va.field_e = va.field_e - var2_int;
                            break L7;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (bg.field_g >= hk.field_e) {
                      break L3;
                    } else {
                      rg.field_e = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L8: {
                  if (null != nl.field_i) {
                    L9: {
                      var3 = -(nl.field_i.field_v / 2) + 357;
                      var4 = 0;
                      if (gg.field_J == 0) {
                        break L9;
                      } else {
                        if (jb.field_U <= var3) {
                          break L9;
                        } else {
                          if (nl.field_i.field_y + var3 > jb.field_U) {
                            L10: {
                              if (-nl.field_i.field_s + 269 >= lb.field_x) {
                                break L10;
                              } else {
                                if (lb.field_x < 269) {
                                  var4 = 1;
                                  hk.field_e = bg.field_f;
                                  rg.field_e = false;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            if (lb.field_x <= 586) {
                              break L9;
                            } else {
                              if (lb.field_x < nl.field_i.field_s + 586) {
                                hk.field_e = bg.field_f;
                                rg.field_e = true;
                                var4 = 1;
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
                    if (var4 != 0) {
                      break L8;
                    } else {
                      if (hk.field_e <= bg.field_g) {
                        break L8;
                      } else {
                        if (rf.field_X <= var3) {
                          break L8;
                        } else {
                          if (rf.field_X < var3 + nl.field_i.field_y) {
                            L11: {
                              if (-nl.field_i.field_s + 269 >= nc.field_g) {
                                break L11;
                              } else {
                                if (nc.field_g >= 269) {
                                  break L11;
                                } else {
                                  hk.field_e = bg.field_g;
                                  break L11;
                                }
                              }
                            }
                            if (nc.field_g <= 586) {
                              break L8;
                            } else {
                              if (nl.field_i.field_s + 586 > nc.field_g) {
                                hk.field_e = bg.field_g;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                if (param1) {
                  L12: {
                    ln.field_k.a(wa.a(116, jb.field_U, lb.field_x), wa.a(117, rf.field_X, nc.field_g), 4);
                    if (!ln.field_k.a(-1)) {
                      break L12;
                    } else {
                      if (0 != ln.field_k.field_g) {
                        if (1 != ln.field_k.field_g) {
                          break L12;
                        } else {
                          stackOut_63_0 = 2;
                          stackIn_64_0 = stackOut_63_0;
                          return stackIn_64_0;
                        }
                      } else {
                        stackOut_60_0 = 3;
                        stackIn_61_0 = stackOut_60_0;
                        return stackIn_61_0;
                      }
                    }
                  }
                  L13: while (true) {
                    if (!qh.c(-121)) {
                      stackOut_80_0 = 0;
                      stackIn_81_0 = stackOut_80_0;
                      break L0;
                    } else {
                      L14: {
                        ln.field_k.a((byte) -21, 0);
                        if (!ln.field_k.a(-1)) {
                          break L14;
                        } else {
                          if (ln.field_k.field_g == 0) {
                            stackOut_70_0 = 3;
                            stackIn_71_0 = stackOut_70_0;
                            return stackIn_71_0;
                          } else {
                            if (ln.field_k.field_g == 1) {
                              stackOut_74_0 = 1;
                              stackIn_75_0 = stackOut_74_0;
                              return stackIn_75_0;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      if (aa.field_n == 13) {
                        stackOut_78_0 = 1;
                        stackIn_79_0 = stackOut_78_0;
                        return stackIn_79_0;
                      } else {
                        continue L13;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                io.field_b = io.field_b + 1;
                dl.field_i = dl.field_i - bg.field_c;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var2, "pd.B(" + -86 + 44 + param1 + 41);
        }
        return stackIn_81_0;
    }

    final static Boolean b() {
        Boolean var1 = wd.field_u;
        wd.field_u = null;
        return var1;
    }

    final static boolean a(vk param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3_int = 0;
        mg[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        hj[] var5 = null;
        int var6_int = 0;
        hj[] var6 = null;
        int var7 = 0;
        hj var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            int discarded$1 = -65;
            if (mm.a(param0)) {
              var10 = go.field_g[param0.field_p];
              var2_array = var10;
              var3_int = 0;
              L1: while (true) {
                if (var10.length <= var3_int) {
                  if (mc.field_a[9].b((byte) 116)) {
                    if (!mc.field_a[11].b((byte) 124)) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    } else {
                      L2: {
                        if (!kb.a(16616, 0)) {
                          break L2;
                        } else {
                          var3 = wi.field_a.a(16);
                          if (var3 == null) {
                            stackOut_22_0 = 0;
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0 != 0;
                          } else {
                            va.field_d = new mg[4][var3.length];
                            var4 = new int[]{16711680, 16776960, 33023, 16711935};
                            var5_int = 0;
                            L3: while (true) {
                              if (var5_int >= 4) {
                                var5 = tn.field_b.a(180);
                                if (var5 == null) {
                                  stackOut_32_0 = 0;
                                  stackIn_33_0 = stackOut_32_0;
                                  return stackIn_33_0 != 0;
                                } else {
                                  var6 = var5;
                                  var7 = 0;
                                  L4: while (true) {
                                    if (var6.length <= var7) {
                                      break L2;
                                    } else {
                                      var8 = var6[var7];
                                      var8.a();
                                      var7++;
                                      continue L4;
                                    }
                                  }
                                }
                              } else {
                                var6_int = 0;
                                L5: while (true) {
                                  if (var3.length <= var6_int) {
                                    var5_int++;
                                    continue L3;
                                  } else {
                                    va.field_d[var5_int][var6_int] = var3[var6_int].a(-4503, var4[var5_int]);
                                    va.field_d[var5_int][var6_int].a(3072, false);
                                    var6_int++;
                                    continue L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (!nn.a(-74)) {
                        stackOut_39_0 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                } else {
                  if (ge.field_c[var10[var3_int]].field_b.c((byte) 41) == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    if (ge.field_c[var10[var3_int]].field_z.c((byte) -117) != null) {
                      var3_int++;
                      continue L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("pd.G(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L6;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 1 + 41);
        }
        return stackIn_40_0 != 0;
    }

    final void a(int param0, th param1) {
        try {
            param1.a((byte) -84, ((pd) this).field_d);
            param1.b(param0 + param0, ((pd) this).field_i);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "pd.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        if (param0 > -94) {
            return;
        }
        field_f = null;
        field_e = null;
        field_g = null;
        field_h = null;
    }

    final static void a(hj param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            if (param4 != 1024) {
              L1: {
                param3 = param3 - ((param4 + -1024) * param0.field_s >> 11);
                param2 = param2 - ((param4 + -1024) * param0.field_y >> 11);
                var6_int = param4 * param0.field_s >> 10;
                var7 = param4 * param0.field_y >> 10;
                var8 = 0;
                if (param3 < 0) {
                  var6_int = var6_int + param3;
                  var8 = var8 + (-param3 << 20) / param4;
                  param3 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9 = 0;
                if (0 <= param2) {
                  break L2;
                } else {
                  var7 = var7 + param2;
                  var9 = var9 + (-param2 << 20) / param4;
                  param2 = 0;
                  break L2;
                }
              }
              L3: {
                if (param3 - -var6_int > 640) {
                  var6_int = 640 - param3;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var7 + param2 <= 480) {
                  break L4;
                } else {
                  var7 = -param2 + 480;
                  break L4;
                }
              }
              var11 = 0;
              var12 = 0;
              L5: while (true) {
                if (var12 >= var7) {
                  L6: {
                    if (param1 <= -26) {
                      break L6;
                    } else {
                      field_h = null;
                      break L6;
                    }
                  }
                  break L0;
                } else {
                  var10 = (var12 + param2) * tc.field_j + param3;
                  var11 = var8 + ((var9 >> 10) * param0.field_s << 10);
                  var13 = 0;
                  L7: while (true) {
                    if (var6_int <= var13) {
                      var9 = var9 + 1048576 / param4;
                      var12++;
                      continue L5;
                    } else {
                      L8: {
                        if (param0.field_z[var11 >> 10] != 16777215) {
                          if (param0.field_z[var11 >> 10] == 0) {
                            break L8;
                          } else {
                            tc.field_b[var10] = param0.field_z[var11 >> 10];
                            break L8;
                          }
                        } else {
                          tc.field_b[var10] = param5;
                          break L8;
                        }
                      }
                      var10++;
                      var11 = var11 + 1048576 / param4;
                      var13++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              w.a(param5, param0, 109, param2, param3);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("pd.F(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    pd(long param0, String param1) {
        try {
            ((pd) this).field_d = param0;
            ((pd) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "pd.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ah();
        field_g = "One kill remaining.";
    }
}
