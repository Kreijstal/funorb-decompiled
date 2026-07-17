/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class og {
    static String field_b;
    static int field_a;

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!kj.e((byte) 118)) {
                L2: {
                  ui.field_c.a((byte) 124, ha.a(ph.field_d, kc.field_u, -37), ha.a(ci.field_m, ik.field_a, -39));
                  if (ui.field_c.c((byte) 92)) {
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
                      if (0 > ui.field_c.field_j) {
                        break L4;
                      } else {
                        L5: {
                          var3 = pe.field_db[ui.field_c.field_j];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (var3 != 5) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        fj.b((byte) -103);
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (nd.field_c == 2) {
                      break L3;
                    } else {
                      fj.b((byte) -105);
                      break L3;
                    }
                  }
                }
                L6: {
                  if (var3 != 0) {
                    break L6;
                  } else {
                    if (nd.field_c != 2) {
                      break L6;
                    } else {
                      var4 = -fd.field_e + ol.a(256);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        gj.a(-1, 5, true);
                        var3 = 2;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_23_0 = var3;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L7: {
                  ui.field_c.b(15275);
                  if (!ui.field_c.c((byte) 40)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if (b.field_J != 13) {
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
          throw oj.a((Throwable) (Object) var1, "og.E(" + 0 + 41);
        }
        return stackIn_24_0;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(java.awt.Component param0, byte param1);

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param2 <= 0) {
                var4 = 75 % ((-57 - param1) / 42);
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param0;
                param0 = param0 >>> 1;
                param2--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "og.F(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_5_0;
    }

    final static vh a(String param0, boolean param1) {
        RuntimeException var2 = null;
        vh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vh stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = new vh(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("og.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 1 + 41);
        }
        return stackIn_3_0;
    }

    abstract int a(byte param0);

    public static void a(int param0) {
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        RuntimeException decompiledCaughtException = null;
        var27 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 1024;
            var4 = 512;
            var5 = param0;
            var5 = var5 % var3_int;
            var5 = -var5 + var3_int;
            var6 = param1;
            var6 = var6 % var4;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            var10 = 0;
            var11 = 0;
            var12 = 0;
            var17 = lj.field_h[0].field_q;
            var18 = lj.field_h[0].field_v;
            var20 = 0;
            var21 = 480;
            var22 = 32;
            var23 = 608;
            var24 = 0;
            L1: while (true) {
              if (4 <= var24) {
                break L0;
              } else {
                L2: {
                  if (var24 == 0) {
                    var9 = var5;
                    var12 = var4;
                    var8 = -var6;
                    var7 = -var5;
                    var11 = var6;
                    var10 = var3_int;
                    break L2;
                  } else {
                    if (1 != var24) {
                      if (var24 == 2) {
                        var8 = var4 + -var6;
                        var9 = 0;
                        var11 = 0;
                        var7 = -var5 + var3_int;
                        var12 = var6;
                        var10 = var5;
                        break L2;
                      } else {
                        if (var24 != 3) {
                          break L2;
                        } else {
                          var8 = -var6;
                          var9 = 0;
                          var12 = var4;
                          var11 = var6;
                          var10 = var5;
                          var7 = -var5 + var3_int;
                          break L2;
                        }
                      }
                    } else {
                      var12 = var6;
                      var8 = -var6 + var4;
                      var7 = -var5;
                      var9 = var5;
                      var10 = var3_int;
                      var11 = 0;
                      break L2;
                    }
                  }
                }
                var25 = 0;
                L3: while (true) {
                  if (var25 >= da.field_e) {
                    var24++;
                    continue L1;
                  } else {
                    L4: {
                      if (wc.field_e[var25] == null) {
                        break L4;
                      } else {
                        var26 = 0;
                        L5: while (true) {
                          if (wc.field_e[var25].length <= var26) {
                            break L4;
                          } else {
                            L6: {
                              var15 = wc.field_e[var25][var26][1];
                              var13 = wc.field_e[var25][var26][0];
                              var16 = var18 + var15;
                              var14 = var17 + var13;
                              if (~var16 > ~var11) {
                                break L6;
                              } else {
                                if (~var15 > ~var12) {
                                  if (var9 > var14) {
                                    break L6;
                                  } else {
                                    if (var13 >= var10) {
                                      break L6;
                                    } else {
                                      var16 = var16 + var8;
                                      var14 = var14 + var7;
                                      var15 = var15 + var8;
                                      var13 = var13 + var7;
                                      if (~var16 > ~var20) {
                                        break L6;
                                      } else {
                                        if (var21 > var15) {
                                          L7: {
                                            if (var13 < var22) {
                                              break L7;
                                            } else {
                                              if (var23 <= var14) {
                                                break L7;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                          var19 = wc.field_e[var25][var26][2];
                                          lj.field_h[var19].g(var13, var15);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var26++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var25++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "og.G(" + param0 + 44 + param1 + 44 + -15516 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Fullscreen";
    }
}
