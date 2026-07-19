/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements lv {
    static tu field_f;
    static String field_b;
    static String[] field_a;
    private jd[] field_c;
    static String field_e;
    static int field_d;
    static int[][] field_h;
    static int field_i;
    static String field_g;

    final static d a(byte[] param0, int param1) {
        d var2 = null;
        RuntimeException var2_ref = null;
        d stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        d stackOut_5_0 = null;
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
            if (param0 != null) {
              L1: {
                if (param1 >= 71) {
                  break L1;
                } else {
                  field_f = (tu) null;
                  break L1;
                }
              }
              var2 = new d(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
              rj.d((byte) 107);
              stackOut_5_0 = (d) (var2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("gm.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final static int f(int param0) {
        if (param0 != 3) {
            field_i = -52;
        }
        return (va.field_D << 1609583458) + (ol.field_B << -459892476) - -cd.field_c;
    }

    public final boolean b(int param0) {
        jd[] var2 = null;
        int var3 = 0;
        jd var4 = null;
        int var5 = 0;
        jd[] var6 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        boolean stackOut_3_0 = false;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = this.field_c;
        var2 = var6;
        var3 = param0;
        L0: while (true) {
          if (var3 < var6.length) {
            var4 = var6[var3];
            stackOut_3_0 = var4.field_G;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (!stackIn_5_0) {
                return false;
              } else {
                var3++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return true;
          }
        }
    }

    gm(int param0, jd[] param1) {
        try {
            this.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "gm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, int param1, String param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_9_0 = null;
        String stackOut_22_0 = null;
        String stackOut_26_0 = null;
        String stackOut_18_0 = null;
        String stackOut_15_0 = null;
        String stackOut_12_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (param0 == 3) {
              stackOut_2_0 = vf.field_e;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != param0) {
                if (-8 == (param0 ^ -1)) {
                  stackOut_9_0 = qm.field_H;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (8 != param0) {
                    if (9 != param0) {
                      if (-11 != (param0 ^ -1)) {
                        if (11 == param0) {
                          stackOut_22_0 = qt.field_b;
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if ((param0 ^ -1) == -15) {
                            stackOut_26_0 = fo.a(param1 ^ 4806, ra.field_i, new String[]{param2});
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            return null;
                          }
                        }
                      } else {
                        stackOut_18_0 = wh.field_h;
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackOut_15_0 = ke.field_d;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_12_0 = cd.field_b;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_5_0 = mo.field_l;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("gm.E(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L1;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      return stackIn_27_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        int discarded$0 = 0;
        field_a = null;
        field_b = null;
        field_h = (int[][]) null;
        field_e = null;
        field_f = null;
        field_g = null;
        if (param0 != 25931) {
            discarded$0 = gm.f(-9);
        }
    }

    final static void d(int param0) {
        String[][] dupTemp$5 = null;
        int[][] dupTemp$6 = null;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        wj var4 = null;
        aj var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        bv var27 = null;
        bv var28 = null;
        long[][] var32 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_64_0 = 0;
        var26 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = mg.field_e;
              var28 = var27;
              if (param0 == 9) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var2 = var28.k(0);
                if (0 != var2) {
                  break L3;
                } else {
                  var3 = var28.e((byte) -104);
                  var4 = (wj) ((Object) lf.field_c.e((byte) 100));
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var4 == null) {
                          break L6;
                        } else {
                          stackOut_6_0 = var4.field_r;
                          stackIn_12_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var26 != 0) {
                            break L5;
                          } else {
                            if (stackIn_7_0 == var3) {
                              break L6;
                            } else {
                              var4 = (wj) ((Object) lf.field_c.a((byte) 123));
                              if (var26 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      if (var4 == null) {
                        stackOut_11_0 = -126;
                        stackIn_12_0 = stackOut_11_0;
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            var5 = var28.k(param0 + -9);
                            if (0 == var5) {
                              break L8;
                            } else {
                              var6 = var4.field_k;
                              th.field_b[0].field_d = false;
                              var7 = var4.field_p;
                              th.field_b[0].field_f = mv.field_d;
                              th.field_b[0].field_c = null;
                              var8_int = 1;
                              L9: while (true) {
                                L10: {
                                  if (var8_int >= var5) {
                                    break L10;
                                  } else {
                                    th.field_b[var8_int].field_f = var28.g(param0 ^ 8);
                                    th.field_b[var8_int].field_d = false;
                                    if (var26 != 0) {
                                      break L7;
                                    } else {
                                      L11: {
                                        L12: {
                                          if (var28.k(0) == 1) {
                                            break L12;
                                          } else {
                                            th.field_b[var8_int].field_c = null;
                                            if (var26 == 0) {
                                              break L11;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        th.field_b[var8_int].field_c = var28.g(1);
                                        break L11;
                                      }
                                      var8_int++;
                                      if (var26 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                dupTemp$5 = new String[3][var6];
                                var4.field_s = dupTemp$5;
                                var8 = dupTemp$5;
                                var9 = new String[3][var6];
                                var32 = new long[3][var6];
                                dupTemp$6 = new int[3][var7 * var6];
                                var4.field_m = dupTemp$6;
                                var11 = dupTemp$6;
                                var12 = 0;
                                var13 = 0;
                                var14 = 0;
                                var15 = 0;
                                var16 = 0;
                                var17 = 0;
                                var18 = var28.k(0);
                                if (-1 <= (var18 ^ -1)) {
                                  break L8;
                                } else {
                                  var19 = 0;
                                  L13: while (true) {
                                    if (var19 >= var18) {
                                      break L8;
                                    } else {
                                      var20 = var27.k(0);
                                      var21 = th.field_b[var20].field_f;
                                      var22 = var28.j((byte) -2);
                                      var24 = var28.field_q;
                                      if (var26 != 0) {
                                        break L7;
                                      } else {
                                        L14: {
                                          L15: {
                                            L16: {
                                              if (var19 < var6) {
                                                var8[0][var12] = var21;
                                                var9[0][var12] = th.field_b[var20].field_c;
                                                var32[0][var12] = var22;
                                                var12++;
                                                var25 = 0;
                                                L17: while (true) {
                                                  if (var7 <= var25) {
                                                    break L16;
                                                  } else {
                                                    incrementValue$7 = var15;
                                                    var15++;
                                                    var11[0][incrementValue$7] = var27.i(1);
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L15;
                                                    } else {
                                                      continue L17;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L16;
                                              }
                                            }
                                            if (var21 == null) {
                                              break L15;
                                            } else {
                                              if (gt.a(var21, (byte) 125)) {
                                                var8[1][var13] = mv.field_d;
                                                var9[1][var13] = null;
                                                var32[1][var13] = var22;
                                                var13++;
                                                var28.field_q = var24;
                                                var25 = 0;
                                                L18: while (true) {
                                                  if (var7 <= var25) {
                                                    break L15;
                                                  } else {
                                                    incrementValue$8 = var16;
                                                    var16++;
                                                    var11[1][incrementValue$8] = var27.i(kf.b(param0, 8));
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L14;
                                                    } else {
                                                      continue L18;
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var6 <= var14) {
                                              break L19;
                                            } else {
                                              if (th.field_b[var20].field_d) {
                                                break L19;
                                              } else {
                                                th.field_b[var20].field_d = true;
                                                var8[2][var14] = var21;
                                                var9[2][var14] = th.field_b[var20].field_c;
                                                var32[2][var14] = var22;
                                                var14++;
                                                var28.field_q = var24;
                                                var25 = 0;
                                                L20: while (true) {
                                                  if (var7 <= var25) {
                                                    break L19;
                                                  } else {
                                                    incrementValue$9 = var17;
                                                    var17++;
                                                    var11[2][incrementValue$9] = var27.i(param0 + -8);
                                                    var25++;
                                                    if (var26 != 0) {
                                                      break L14;
                                                    } else {
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var19++;
                                          break L14;
                                        }
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4.field_o = true;
                          var4.d(86);
                          break L7;
                        }
                        if (var26 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    dj.a((byte) stackIn_12_0);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L21: {
                if ((var2 ^ -1) == -2) {
                  break L21;
                } else {
                  af.a((Throwable) null, 76, "HS1: " + cm.b(false));
                  dj.a((byte) -127);
                  if (var26 == 0) {
                    break L2;
                  } else {
                    break L21;
                  }
                }
              }
              var3 = var28.e((byte) -104);
              var4_ref = (aj) ((Object) oj.field_r.e((byte) 99));
              L22: while (true) {
                L23: {
                  L24: {
                    if (var4_ref == null) {
                      break L24;
                    } else {
                      stackOut_58_0 = var4_ref.field_s;
                      stackIn_65_0 = stackOut_58_0;
                      stackIn_59_0 = stackOut_58_0;
                      if (var26 != 0) {
                        break L23;
                      } else {
                        L25: {
                          if (stackIn_59_0 != var3) {
                            break L25;
                          } else {
                            if (var26 == 0) {
                              break L24;
                            } else {
                              break L25;
                            }
                          }
                        }
                        var4_ref = (aj) ((Object) oj.field_r.a((byte) 123));
                        if (var26 == 0) {
                          continue L22;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  if (var4_ref != null) {
                    var4_ref.d(param0 ^ -103);
                    break L2;
                  } else {
                    stackOut_64_0 = -126;
                    stackIn_65_0 = stackOut_64_0;
                    break L23;
                  }
                }
                dj.a((byte) stackIn_65_0);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "gm.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final String a(int param0) {
        if (param0 > -122) {
            return (String) null;
        }
        return "Win: Leader Escort";
    }

    public final boolean c(int param0) {
        if (param0 >= -121) {
            gm.d(68);
        }
        return false;
    }

    static {
        field_a = new String[255];
        field_d = 1;
        field_b = "Loads more Achievements in Rated games.";
        field_e = "No";
        field_g = "Accept";
        field_h = new int[][]{new int[]{3, 2, -1, 6, 9, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new int[]{3, 2, -1, 6, -1, 9, -1, 3, 3, 3, 2, 3, -1, 3, 3, -1}, new int[]{3, 3, -1, 3, -1, 3, -1, 3, 3, 3, 3, 3, -1, 3, 3, -1}, new int[]{3, 3, -1, 3, 3, 3, -1, 3, 3, 3, 3, 3, -1, 3, 3, -1}};
    }
}
