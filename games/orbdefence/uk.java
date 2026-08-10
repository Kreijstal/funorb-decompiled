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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                      stackIn_14_0 = sg.a(-1326, var4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_12_0 = (e) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_7_0 = oc.field_M;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackIn_4_0 = oh.field_e;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("uk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
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
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        byte stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        gj var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        vg var6_ref_vg = null;
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
        var26 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 == 68) {
              L1: {
                var27 = cd.field_t;
                var2 = var27.b((byte) 90);
                if (var2 == 0) {
                  var3 = var27.j(98203176);
                  var4 = (gj) ((Object) cb.field_b.b((byte) -126));
                  L2: while (true) {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var4.field_o != var3) {
                          var4 = (gj) ((Object) cb.field_b.d(param0 + 785));
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var4 != null) {
                      L4: {
                        var5 = var27.b((byte) 90);
                        if (var5 != 0) {
                          var6 = var4.field_m;
                          ce.field_e[0].field_a = null;
                          ce.field_e[0].field_c = false;
                          var7 = var4.field_n;
                          ce.field_e[0].field_d = gb.field_h;
                          var8_int = 1;
                          L5: while (true) {
                            if (var8_int >= var5) {
                              dupTemp$0 = new String[3][var6];
                              var4.field_i = dupTemp$0;
                              var8 = dupTemp$0;
                              var9 = new String[3][var6];
                              dupTemp$1 = new long[3][var6];
                              var4.field_p = dupTemp$1;
                              var10 = dupTemp$1;
                              dupTemp$2 = new int[3][var7 * var6];
                              var4.field_l = dupTemp$2;
                              var11 = dupTemp$2;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              var17 = 0;
                              var18 = var27.b((byte) 90);
                              if (-1 <= (var18 ^ -1)) {
                                break L4;
                              } else {
                                var19 = 0;
                                L6: while (true) {
                                  if (var18 <= var19) {
                                    break L4;
                                  } else {
                                    L7: {
                                      var20 = var27.b((byte) 90);
                                      var21 = ce.field_e[var20].field_d;
                                      var22 = var27.c((byte) -89);
                                      var24 = var27.field_i;
                                      if (var6 > var19) {
                                        var8[0][var12] = var21;
                                        var9[0][var12] = ce.field_e[var20].field_a;
                                        var10[0][var12] = var22;
                                        var12++;
                                        var25 = 0;
                                        L8: while (true) {
                                          if (var7 <= var25) {
                                            break L7;
                                          } else {
                                            incrementValue$3 = var15;
                                            var15++;
                                            var11[0][incrementValue$3] = var27.l(0);
                                            var25++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        break L7;
                                      }
                                    }
                                    L9: {
                                      if (var21 == null) {
                                        break L9;
                                      } else {
                                        if (!fc.a((byte) -127, var21)) {
                                          break L9;
                                        } else {
                                          var8[1][var13] = gb.field_h;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var27.field_i = var24;
                                          var13++;
                                          var25 = 0;
                                          L10: while (true) {
                                            if (var25 >= var7) {
                                              break L9;
                                            } else {
                                              incrementValue$4 = var16;
                                              var16++;
                                              var11[1][incrementValue$4] = var27.l(0);
                                              var25++;
                                              continue L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var6 <= var14) {
                                        break L11;
                                      } else {
                                        if (ce.field_e[var20].field_c) {
                                          break L11;
                                        } else {
                                          ce.field_e[var20].field_c = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = ce.field_e[var20].field_a;
                                          var10[2][var14] = var22;
                                          var14++;
                                          var27.field_i = var24;
                                          var25 = 0;
                                          L12: while (true) {
                                            if (var25 >= var7) {
                                              break L11;
                                            } else {
                                              incrementValue$5 = var17;
                                              var17++;
                                              var11[2][incrementValue$5] = var27.l(0);
                                              var25++;
                                              continue L12;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var19++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                ce.field_e[var8_int].field_d = var27.g(2);
                                ce.field_e[var8_int].field_c = false;
                                if (-2 == (var27.b((byte) 90) ^ -1)) {
                                  ce.field_e[var8_int].field_a = var27.g(2);
                                  break L13;
                                } else {
                                  ce.field_e[var8_int].field_a = null;
                                  break L13;
                                }
                              }
                              var8_int++;
                              continue L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      var4.field_h = true;
                      var4.b(param0 ^ 125);
                      break L1;
                    } else {
                      th.a(120);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  if ((var2 ^ -1) != -2) {
                    pe.a((byte) -13, (Throwable) null, "HS1: " + sj.b(true));
                    th.a(param0 + 48);
                    break L1;
                  } else {
                    var3 = var27.j(98203176);
                    var4_long = var27.c((byte) -89);
                    var6_ref_vg = (vg) ((Object) kk.field_X.b((byte) 124));
                    L14: while (true) {
                      L15: {
                        if (var6_ref_vg == null) {
                          break L15;
                        } else {
                          if ((var3 ^ -1) != (var6_ref_vg.field_t ^ -1)) {
                            var6_ref_vg = (vg) ((Object) kk.field_X.d(853));
                            continue L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      if (var6_ref_vg != null) {
                        var6_ref_vg.field_h = var4_long;
                        var6_ref_vg.b(param0 + -11);
                        break L1;
                      } else {
                        stackIn_12_0 = param0;
                        stackIn_12_1 = 58;
                        th.a(stackIn_12_0 + stackIn_12_1);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
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
