/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static sa field_b;
    static int[][][] field_a;

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        ms var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            vl.field_p = null;
            dj.field_a = 0;
            vg.field_p = 0;
            wh.field_c.b(126);
            ot.field_E.b(81);
            var1 = nh.field_K.a((byte) 66);
            L1: while (true) {
              L2: {
                L3: {
                  if (var1 == null) {
                    break L3;
                  } else {
                    var1.c((byte) -76);
                    var1 = nh.field_K.c(1);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -112) {
                  break L2;
                } else {
                  da.a(89, true);
                  break L2;
                }
              }
              var1 = bk.field_a.a((byte) 66);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var1 == null) {
                      break L6;
                    } else {
                      var1.c((byte) -76);
                      var1 = bk.field_a.c(1);
                      if (var2 != 0) {
                        break L5;
                      } else {
                        if (var2 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  th.field_a = 0;
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "da.I(" + param0 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        te discarded$8 = null;
        L0: {
          if (null == vi.field_a) {
            break L0;
          } else {
            if (0 != vi.field_a.length) {
              if (-1 >= (param1 ^ -1)) {
                if (param1 >= vi.field_a.length) {
                  return;
                } else {
                  L1: {
                    discarded$8 = ub.a((byte) 106, vi.field_a[param1]);
                    if (param0 <= -22) {
                      break L1;
                    } else {
                      da.b(0);
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0) {
        String[] var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        mv.field_d = mg.field_e.g(1);
        if (param0 <= 10) {
          var2 = (String[]) null;
          da.a(70, 41, (String[][]) null, (String[]) null, 94);
          var3 = (CharSequence) ((Object) mv.field_d);
          ft.field_p = k.a(var3, false);
          return;
        } else {
          var4 = (CharSequence) ((Object) mv.field_d);
          ft.field_p = k.a(var4, false);
          return;
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_21_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_19_0 = 0;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                if (at.field_a) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        var8 = "tuhstatbut";
                        var3 = (String) (lj.a("getcookies", (byte) 81, param1));
                        var4 = dj.a(29, ';', var3);
                        if (param0 == 23660) {
                          break L2;
                        } else {
                          field_a = (int[][][]) null;
                          break L2;
                        }
                      }
                      var5 = 0;
                      L3: while (true) {
                        L4: {
                          if (var5 >= var4.length) {
                            break L4;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackOut_9_0 = -1;
                            stackIn_21_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var7 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              L5: {
                                if (stackIn_10_0 < (var6 ^ -1)) {
                                  break L5;
                                } else {
                                  if (var4[var5].substring(0, var6).trim().equals(var8)) {
                                    stackOut_13_0 = 1;
                                    stackIn_14_0 = stackOut_13_0;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L6: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L6;
                    }
                  }
                  L7: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L7;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L7;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L7;
                      } else {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) (var2);
                stackOut_22_1 = new StringBuilder().append("da.E(").append(param0).append(',');
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param1 == null) {
                  stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
                  stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L8;
                } else {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L8;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_21_0 != 0;
              } else {
                return stackIn_14_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = (int[][][]) null;
            field_a = (int[][][]) null;
            field_b = null;
            return;
        }
        field_a = (int[][][]) null;
        field_b = null;
    }

    final static void a(int param0, int param1, String[][] param2, String[] param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = ha.b(param0, param4, -4);
            var5_int = param2[param0].length;
            var6 = param1;
            L1: while (true) {
              L2: {
                if (var6 >= var5_int) {
                  break L2;
                } else {
                  var7 = var6;
                  var8 = jj.a((byte) 103, var7, param2, param0);
                  var9 = t.a(var8, param3, (byte) 118);
                  aw.field_j[param4][param0][var7] = var9;
                  var6++;
                  if (var10 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("da.B(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -10820) {
          L0: {
            field_b = (sa) null;
            if (!jj.b((byte) -73)) {
              break L0;
            } else {
              param1 = false;
              break L0;
            }
          }
          ca.a(5295, param1);
          jg.a((byte) 102);
          return;
        } else {
          L1: {
            if (!jj.b((byte) -73)) {
              break L1;
            } else {
              param1 = false;
              break L1;
            }
          }
          ca.a(5295, param1);
          jg.a((byte) 102);
          return;
        }
    }

    final static void b(int param0) {
        boolean discarded$2 = false;
        java.applet.Applet var2 = null;
        t.field_c = kv.k(5);
        rl.field_C = new gk();
        if (param0 != -2) {
          var2 = (java.applet.Applet) null;
          discarded$2 = da.a(43, (java.applet.Applet) null);
          td.a(true, true, param0 + 25);
          return;
        } else {
          td.a(true, true, param0 + 25);
          return;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        on var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rs var5_ref_rs = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        bv var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var9 = mg.field_e;
            var2 = var9.k(0);
            if (param0 < -77) {
              L1: {
                L2: {
                  var3 = var9.k(0);
                  if (0 == var2) {
                    break L2;
                  } else {
                    L3: {
                      if (1 != var2) {
                        break L3;
                      } else {
                        var4_int = var9.a(100);
                        var5_ref_rs = (rs) ((Object) gg.field_F.e((byte) 107));
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var5_ref_rs == null) {
                                break L6;
                              } else {
                                stackOut_7_0 = var5_ref_rs.field_r;
                                stackIn_15_0 = stackOut_7_0;
                                stackIn_8_0 = stackOut_7_0;
                                if (var8 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (stackIn_8_0 != var3) {
                                      break L7;
                                    } else {
                                      if (var4_int != var5_ref_rs.field_l) {
                                        break L7;
                                      } else {
                                        if (var8 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  var5_ref_rs = (rs) ((Object) gg.field_F.a((byte) 123));
                                  if (var8 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (var5_ref_rs != null) {
                              var5_ref_rs.d(-105);
                              if (var8 == 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            } else {
                              stackOut_14_0 = -125;
                              stackIn_15_0 = stackOut_14_0;
                              break L5;
                            }
                          }
                          dj.a((byte) stackIn_15_0);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                    af.a((Throwable) null, 70, "LR1: " + cm.b(false));
                    dj.a((byte) -127);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = (on) ((Object) ss.field_t.e((byte) 96));
                if (var4 != null) {
                  L8: {
                    var5 = fk.field_b + -var9.field_q;
                    var11 = var4.field_m;
                    var10 = var11;
                    var6 = var10;
                    if (var5 <= var11.length << -1591929918) {
                      break L8;
                    } else {
                      var5 = var11.length << -14358366;
                      break L8;
                    }
                  }
                  var7 = 0;
                  L9: while (true) {
                    if (var5 > var7) {
                      var6[var7 >> 1247296610] = var6[var7 >> 1247296610] + (var9.k(0) << rn.a(var7 << -39351256, 768));
                      var7++;
                      if (var8 != 0) {
                        break L1;
                      } else {
                        continue L9;
                      }
                    } else {
                      var4.d(-116);
                      break L1;
                    }
                  }
                } else {
                  dj.a((byte) -124);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "da.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_b = new sa();
        field_a = new int[][][]{new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -1, 0, 3}}, new int[][]{new int[]{-2, -1, 0, 3, -2, -2}}, new int[][]{new int[]{-2, -1, 0, 3, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -1, 3, -1, 3}, new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2, -2, -2}}, new int[][]{new int[]{-2, -1, 0, 3, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}, new int[][]{new int[]{-2, -2, -2, -2}}};
    }
}
