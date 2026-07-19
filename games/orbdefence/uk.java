/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static int field_c;
    static int field_a;
    static se field_b;

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static e a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        e var5 = null;
        e stackIn_4_0 = null;
        e stackIn_7_0 = null;
        e stackIn_12_0 = null;
        e stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        e stackOut_13_0 = null;
        e stackOut_11_0 = null;
        e stackOut_6_0 = null;
        e stackOut_3_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (0 != (var2_int ^ -1)) {
                    L2: {
                      var3 = param1.substring(0, var2_int);
                      var4 = param1.substring(1 + var2_int);
                      if (!param0) {
                        break L2;
                      } else {
                        uk.a((byte) -20);
                        break L2;
                      }
                    }
                    var5 = gk.a(var3, (byte) -127);
                    if (var5 == null) {
                      stackOut_13_0 = sg.a(-1326, var4);
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackOut_11_0 = (e) (var5);
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_6_0 = oc.field_M;
                    stackIn_7_0 = stackOut_6_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = oh.field_e;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var2);
            stackOut_15_1 = new StringBuilder().append("uk.B(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    final static void a(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        gj var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        vg var6_ref_vg = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
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
        se var27 = null;
        se var28 = null;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        byte stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_29_0 = 0;
        var26 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 68) {
              L1: {
                L2: {
                  var27 = cd.field_t;
                  var28 = var27;
                  var2 = var28.b((byte) 90);
                  if (var2 == 0) {
                    break L2;
                  } else {
                    L3: {
                      if ((var2 ^ -1) != -2) {
                        break L3;
                      } else {
                        var3 = var28.j(98203176);
                        var4_long = var28.c((byte) -89);
                        var6_ref_vg = (vg) ((Object) kk.field_X.b((byte) 124));
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var6_ref_vg == null) {
                                break L6;
                              } else {
                                stackOut_7_0 = var3 ^ -1;
                                stackOut_7_1 = var6_ref_vg.field_t ^ -1;
                                stackIn_14_0 = stackOut_7_0;
                                stackIn_14_1 = stackOut_7_1;
                                stackIn_8_0 = stackOut_7_0;
                                stackIn_8_1 = stackOut_7_1;
                                if (var26 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (stackIn_8_0 != stackIn_8_1) {
                                      break L7;
                                    } else {
                                      if (var26 == 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var6_ref_vg = (vg) ((Object) kk.field_X.d(853));
                                  if (var26 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (var6_ref_vg != null) {
                              var6_ref_vg.field_h = var4_long;
                              var6_ref_vg.b(param0 + -11);
                              if (var26 == 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            } else {
                              stackOut_13_0 = param0;
                              stackOut_13_1 = 58;
                              stackIn_14_0 = stackOut_13_0;
                              stackIn_14_1 = stackOut_13_1;
                              break L5;
                            }
                          }
                          th.a(stackIn_14_0 + stackIn_14_1);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                    pe.a((byte) -13, (Throwable) null, "HS1: " + sj.b(true));
                    th.a(param0 + 48);
                    if (var26 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = var28.j(98203176);
                var4 = (gj) ((Object) cb.field_b.b((byte) -126));
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var4 == null) {
                        break L10;
                      } else {
                        stackOut_21_0 = var4.field_o;
                        stackIn_30_0 = stackOut_21_0;
                        stackIn_22_0 = stackOut_21_0;
                        if (var26 != 0) {
                          break L9;
                        } else {
                          L11: {
                            if (stackIn_22_0 != var3) {
                              break L11;
                            } else {
                              if (var26 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          var4 = (gj) ((Object) cb.field_b.d(param0 + 785));
                          if (var26 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != null) {
                      stackOut_29_0 = var28.b((byte) 90);
                      stackIn_30_0 = stackOut_29_0;
                      break L9;
                    } else {
                      th.a(120);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                  var5 = stackIn_30_0;
                  if (var5 != 0) {
                    var6 = var4.field_m;
                    ce.field_e[0].field_a = null;
                    ce.field_e[0].field_c = false;
                    var7 = var4.field_n;
                    ce.field_e[0].field_d = gb.field_h;
                    var8_int = 1;
                    L12: while (true) {
                      L13: {
                        L14: {
                          if (var8_int >= var5) {
                            break L14;
                          } else {
                            ce.field_e[var8_int].field_d = var27.g(2);
                            ce.field_e[var8_int].field_c = false;
                            if (var26 != 0) {
                              break L13;
                            } else {
                              L15: {
                                L16: {
                                  if (-2 == (var28.b((byte) 90) ^ -1)) {
                                    break L16;
                                  } else {
                                    ce.field_e[var8_int].field_a = null;
                                    if (var26 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                ce.field_e[var8_int].field_a = var28.g(2);
                                break L15;
                              }
                              var8_int++;
                              if (var26 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L17: {
                          dupTemp$6 = new String[3][var6];
                          var4.field_i = dupTemp$6;
                          var8 = dupTemp$6;
                          var9 = new String[3][var6];
                          dupTemp$7 = new long[3][var6];
                          var4.field_p = dupTemp$7;
                          var10 = dupTemp$7;
                          dupTemp$8 = new int[3][var7 * var6];
                          var4.field_l = dupTemp$8;
                          var11 = dupTemp$8;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var28.b((byte) 90);
                          if (-1 <= (var18 ^ -1)) {
                            break L17;
                          } else {
                            var19 = 0;
                            L18: while (true) {
                              if (var18 <= var19) {
                                break L17;
                              } else {
                                var20 = var27.b((byte) 90);
                                var21 = ce.field_e[var20].field_d;
                                var22 = var28.c((byte) -89);
                                var24 = var28.field_i;
                                if (var26 != 0) {
                                  break L13;
                                } else {
                                  L19: {
                                    L20: {
                                      L21: {
                                        if (var6 > var19) {
                                          var8[0][var12] = var21;
                                          var9[0][var12] = ce.field_e[var20].field_a;
                                          var10[0][var12] = var22;
                                          var12++;
                                          var25 = 0;
                                          L22: while (true) {
                                            if (var7 <= var25) {
                                              break L21;
                                            } else {
                                              incrementValue$9 = var15;
                                              var15++;
                                              var11[0][incrementValue$9] = var27.l(0);
                                              var25++;
                                              if (var26 != 0) {
                                                break L20;
                                              } else {
                                                continue L22;
                                              }
                                            }
                                          }
                                        } else {
                                          break L21;
                                        }
                                      }
                                      if (var21 == null) {
                                        break L20;
                                      } else {
                                        if (!fc.a((byte) -127, var21)) {
                                          break L20;
                                        } else {
                                          var8[1][var13] = gb.field_h;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var28.field_i = var24;
                                          var13++;
                                          var25 = 0;
                                          L23: while (true) {
                                            if (var25 >= var7) {
                                              break L20;
                                            } else {
                                              incrementValue$10 = var16;
                                              var16++;
                                              var11[1][incrementValue$10] = var27.l(0);
                                              var25++;
                                              if (var26 != 0) {
                                                break L19;
                                              } else {
                                                continue L23;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L24: {
                                      if (var6 <= var14) {
                                        break L24;
                                      } else {
                                        if (ce.field_e[var20].field_c) {
                                          break L24;
                                        } else {
                                          ce.field_e[var20].field_c = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = ce.field_e[var20].field_a;
                                          var10[2][var14] = var22;
                                          var14++;
                                          var28.field_i = var24;
                                          var25 = 0;
                                          L25: while (true) {
                                            if (var25 >= var7) {
                                              break L24;
                                            } else {
                                              incrementValue$11 = var17;
                                              var17++;
                                              var11[2][incrementValue$11] = var27.l(0);
                                              var25++;
                                              if (var26 != 0) {
                                                break L19;
                                              } else {
                                                continue L25;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var19++;
                                    break L19;
                                  }
                                  continue L18;
                                }
                              }
                            }
                          }
                        }
                        var4.field_h = true;
                        break L13;
                      }
                      var4.b(param0 ^ 125);
                      break L1;
                    }
                  } else {
                    var4.field_h = true;
                    var4.b(param0 ^ 125);
                    break L1;
                  }
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
          throw dd.a((Throwable) ((Object) var1), "uk.C(" + param0 + ')');
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
        field_c = -1;
    }
}
