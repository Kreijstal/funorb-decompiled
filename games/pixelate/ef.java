/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static String field_c;
    static cb field_e;
    static boolean field_a;
    static int field_b;
    static int field_g;
    static String field_d;
    static int field_f;

    final static void a(int param0) {
        m var1 = (m) ((Object) on.field_nb.c(1504642273));
        if (var1 == null) {
            na.a(true);
            return;
        }
        pc var2 = vi.field_o;
        int discarded$20 = var2.k(0);
        int discarded$36 = var2.k(0);
        int discarded$47 = var2.k(0);
        int discarded$53 = var2.k(0);
        var1.c(2779);
        if (param0 != -14439) {
            ef.b(false);
        }
    }

    final static void b(boolean param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ue var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        rh var6_ref_rh = null;
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
        pc var28 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var26 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var28 = vi.field_o;
              var2 = var28.f(255);
              if (var2 == 0) {
                var3 = var28.a((byte) 86);
                var4 = (ue) ((Object) f.field_c.c(1504642273));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_o == var3) {
                        break L3;
                      } else {
                        var4 = (ue) ((Object) f.field_c.f(1504642273));
                        continue L2;
                      }
                    }
                  }
                  if (var4 == null) {
                    na.a(true);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      var5 = var28.f(255);
                      if (0 == var5) {
                        break L4;
                      } else {
                        var6 = var4.field_m;
                        rh.field_u[0].field_e = kn.field_J;
                        rh.field_u[0].field_f = null;
                        var7 = var4.field_s;
                        rh.field_u[0].field_c = false;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            dupTemp$6 = new String[3][var6];
                            var4.field_r = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            dupTemp$7 = new long[3][var6];
                            var4.field_k = dupTemp$7;
                            var10 = dupTemp$7;
                            dupTemp$8 = new int[3][var6 * var7];
                            var4.field_l = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.f(255);
                            if (-1 > (var18 ^ -1)) {
                              var19 = 0;
                              L6: while (true) {
                                if (var19 >= var18) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.f(255);
                                    var21 = rh.field_u[var20].field_e;
                                    var22 = var28.a(false);
                                    var24 = var28.field_m;
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = rh.field_u[var20].field_f;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          break L7;
                                        } else {
                                          incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.k(0);
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
                                      if (!sm.a(var21, -1)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = kn.field_J;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var28.field_m = var24;
                                        var13++;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var7 <= var25) {
                                            break L9;
                                          } else {
                                            incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var28.k(0);
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
                                      if (rh.field_u[var20].field_c) {
                                        break L11;
                                      } else {
                                        rh.field_u[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = rh.field_u[var20].field_f;
                                        var10[2][var14] = var22;
                                        var28.field_m = var24;
                                        var14++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var28.k(0);
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
                            } else {
                              break L4;
                            }
                          } else {
                            L13: {
                              rh.field_u[var8_int].field_e = var28.h(5);
                              rh.field_u[var8_int].field_c = false;
                              if (1 == var28.f(255)) {
                                rh.field_u[var8_int].field_f = var28.h(5);
                                break L13;
                              } else {
                                rh.field_u[var8_int].field_f = null;
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.field_n = true;
                    var4.c(2779);
                    break L1;
                  }
                }
              } else {
                if ((var2 ^ -1) == -2) {
                  var3 = var28.a((byte) -125);
                  var4_long = var28.a(false);
                  var6_ref_rh = (rh) ((Object) de.field_b.c(1504642273));
                  L14: while (true) {
                    L15: {
                      if (var6_ref_rh == null) {
                        break L15;
                      } else {
                        if (var3 == var6_ref_rh.field_o) {
                          break L15;
                        } else {
                          var6_ref_rh = (rh) ((Object) de.field_b.f(1504642273));
                          continue L14;
                        }
                      }
                    }
                    if (var6_ref_rh == null) {
                      L16: {
                        if (param0) {
                          stackOut_15_0 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          break L16;
                        } else {
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L16;
                        }
                      }
                      na.a(stackIn_16_0 != 0);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var6_ref_rh.field_q = var4_long;
                      var6_ref_rh.c(2779);
                      break L1;
                    }
                  }
                } else {
                  L17: {
                    jo.a(1, "HS1: " + jm.b(-63), (Throwable) null);
                    if (param0) {
                      stackOut_5_0 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      break L17;
                    } else {
                      stackOut_4_0 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      break L17;
                    }
                  }
                  na.a(stackIn_6_0 != 0);
                  break L1;
                }
              }
            }
            L18: {
              if (!param0) {
                break L18;
              } else {
                ef.a(false);
                break L18;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ef.C(" + param0 + ')');
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

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_b = 0;
        field_c = "GFX: Low Detail";
        field_d = "Chat is currently disabled.";
        field_f = 1;
    }
}
