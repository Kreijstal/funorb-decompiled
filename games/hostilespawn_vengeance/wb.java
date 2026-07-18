/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb extends ul {
    private int field_U;
    private int field_Q;
    static bd field_W;
    static int field_S;
    static boolean field_Z;
    private int field_Y;
    static int field_R;
    private int field_T;
    private int field_V;
    private int field_X;

    void m(int param0) {
        if (param0 >= 0) {
            return;
        }
        if (((wb) this).field_U <= 0) {
            return;
        }
        ((wb) this).a(((wb) this).field_Q, 15767, ((wb) this).field_Y);
        ((wb) this).field_U = 0;
        ((wb) this).o(20);
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((wb) this).field_U <= 0) {
        } else {
            var2 = ((wb) this).field_Q;
            var3 = ((wb) this).field_Y;
            int fieldTemp$0 = ((wb) this).field_T + 1;
            ((wb) this).field_T = ((wb) this).field_T + 1;
            if (((wb) this).field_U > fieldTemp$0) {
                var4 = (-((wb) this).field_T + 2 * ((wb) this).field_U) * ((wb) this).field_T;
                var5 = ((wb) this).field_U * ((wb) this).field_U;
                var3 = ((wb) this).field_X + var4 * (-((wb) this).field_X + ((wb) this).field_Y) / var5;
                var2 = ((wb) this).field_V - -(var4 * (-((wb) this).field_V + ((wb) this).field_Q) / var5);
            } else {
                ((wb) this).field_U = 0;
                ((wb) this).o(20);
            }
            ((wb) this).a(var2, 15767, var3);
        }
        return super.l(65393);
    }

    void b(int param0, int param1, int param2) {
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
        var16 = HostileSpawn.field_I ? 1 : 0;
        si.c(6 + param2, param0 + 35, -12 + ((wb) this).field_s, -40 + ((wb) this).field_x, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        if (param1 == -238948511) {
          var7 = 0;
          var8 = param0;
          L0: while (true) {
            if (var7 >= var4) {
              var4 = 22;
              var5 = 194;
              var6 = 169;
              var7 = 0;
              var8 = 35 + param0;
              L1: while (true) {
                if (var7 >= var4) {
                  sf.field_ab.e(-90 + (((wb) this).field_s + param2), 10 + param0);
                  tg.a(110, bh.field_a, -10 + ((wb) this).field_s, 35 + param0, param2 + 5);
                  tg.a(108, g.field_G, ((wb) this).field_s, param0 - -((wb) this).field_x - 22, param2);
                  var6 = 127;
                  var5 = 169;
                  var4 = -79 + ((wb) this).field_x;
                  var7 = 0;
                  var8 = param0 + 57;
                  L2: while (true) {
                    if (var7 >= var4) {
                      return;
                    } else {
                      var9 = (var6 - var5) * var7 / var4 + var5;
                      var9 = var9 | (var9 << 8 | var9 << 16);
                      si.a(param2, var8, 6, var9);
                      si.a(-6 + ((wb) this).field_s + param2, var8, 6, var9);
                      var8++;
                      var7++;
                      continue L2;
                    }
                  }
                } else {
                  var9 = (-var5 + var6) * var7 / var4 + var5;
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  si.a(param2, var8, 6, var9);
                  si.a(((wb) this).field_s + (param2 - 6), var8, 6, var9);
                  var7++;
                  var8++;
                  continue L1;
                }
              }
            } else {
              if (var8 >= si.field_j) {
                if (var8 < si.field_a) {
                  L3: {
                    L4: {
                      L5: {
                        var9 = var5 - -(var7 * (-var5 + var6) / var4);
                        var10 = 0;
                        var11 = ((wb) this).field_s;
                        if (var7 > 20) {
                          break L5;
                        } else {
                          L6: while (true) {
                            if (var10 > 20) {
                              break L5;
                            } else {
                              var12 = (-var10 + 20) * (20 - var10) + (20 - var7) * (20 + -var7);
                              if (var12 <= 462) {
                                if (420 <= var12) {
                                  var13 = (462 - var12) * var9 / 42;
                                  var13 = var13 | (var13 << 8 | var13 << 16);
                                  si.field_i[var10 + si.field_e * var8 - -param2] = var13;
                                  var10++;
                                  continue L6;
                                } else {
                                  if (var7 <= 20) {
                                    var12 = var11;
                                    var11 -= 21;
                                    var13 = 0;
                                    L7: while (true) {
                                      if (var13 > 20) {
                                        break L4;
                                      } else {
                                        var14 = var13 * var13 + (20 + -var7) * (20 - var7);
                                        if (462 >= var14) {
                                          if (var14 >= 420) {
                                            var15 = (-var14 + 462) * var9 / 42;
                                            var15 = var15 | (var15 << 8 | var15 << 16);
                                            si.field_i[var8 * si.field_e + (param2 + var11)] = var15;
                                            var13++;
                                            var11++;
                                            continue L7;
                                          } else {
                                            var12 = var11 - -1;
                                            var13++;
                                            var11++;
                                            continue L7;
                                          }
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                              } else {
                                var10++;
                                continue L6;
                              }
                            }
                          }
                        }
                      }
                      if (var7 <= 20) {
                        var12 = var11;
                        var11 -= 21;
                        var13 = 0;
                        L8: while (true) {
                          if (var13 > 20) {
                            break L4;
                          } else {
                            var14 = var13 * var13 + (20 + -var7) * (20 - var7);
                            if (462 >= var14) {
                              if (var14 >= 420) {
                                var15 = (-var14 + 462) * var9 / 42;
                                var15 = var15 | (var15 << 8 | var15 << 16);
                                si.field_i[var8 * si.field_e + (param2 + var11)] = var15;
                                var13++;
                                var11++;
                                continue L8;
                              } else {
                                var12 = var11 - -1;
                                var13++;
                                var11++;
                                continue L8;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    var11 = var12;
                    break L3;
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  si.a(var10 + param2, var8, -var10 + var11, var9);
                  var8++;
                  var7++;
                  continue L0;
                } else {
                  var8++;
                  var7++;
                  continue L0;
                }
              } else {
                var8++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param0 > 0)) {
            ((wb) this).a(param1, 15767, param3);
            return;
        }
        ((wb) this).field_Q = param1;
        ((wb) this).field_V = ((wb) this).field_s;
        ((wb) this).field_Y = param3;
        ((wb) this).field_T = 0;
        ((wb) this).field_X = ((wb) this).field_x;
        int var5 = -90 / (param2 / 63);
        ((wb) this).field_U = param0;
    }

    public static void n(int param0) {
        if (param0 != 420) {
            return;
        }
        field_W = null;
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        if (param2) {
            String discarded$0 = wb.a(true, false, true, false);
        }
        int var4 = 0;
        if (param3) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param1) {
            var4++;
        }
        return ti.field_a[var4];
    }

    final static int a(int param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
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
            L1: {
              if (param0 >= 79) {
                break L1;
              } else {
                wb.n(119);
                break L1;
              }
            }
            if (!param1) {
              stackOut_5_0 = lj.field_u.a(param2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = na.field_c.a(param2);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("wb.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    boolean j(int param0) {
        ((wb) this).m(-76);
        return super.j(-15953);
    }

    wb(gg param0, int param1, int param2) {
        super(param0, param1, param2);
        ((wb) this).field_U = 0;
        ((wb) this).field_T = 0;
    }

    void o(int param0) {
        if (param0 != 20) {
            ((wb) this).o(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Z = false;
        field_R = 0;
    }
}
