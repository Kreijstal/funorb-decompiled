/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int field_a;
    static String field_e;
    static qb field_c;
    static int[] field_b;
    private String field_d;

    final static void a(jg param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        jg var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_e) {
              return;
            } else {
              L1: {
                L2: {
                  if (param0.field_d != 0) {
                    break L2;
                  } else {
                    if (param0.field_k == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (gb.field_f <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = g.field_d[var2_int];
                      if (var3.field_m != 2) {
                        break L4;
                      } else {
                        if (var3.field_d != param0.field_d) {
                          break L4;
                        } else {
                          if (param0.field_k != var3.field_k) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param0.field_f == null) {
                  break L5;
                } else {
                  fo.field_h = param0.field_h;
                  ao.field_e = param0.field_f;
                  gd.field_rb = param0.field_m;
                  of.field_c = param0.field_n;
                  break L5;
                }
              }
              vd.a(param0, (byte) -74);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) runtimeException;
            stackOut_21_1 = new StringBuilder().append("ql.E(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 111 + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        qb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (de.field_e == 0) {
                break L1;
              } else {
                if (de.field_j != 0) {
                  L2: {
                    if (640 >= param0) {
                      if (param1 > 480) {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_10_0 = stackOut_7_0;
                        break L2;
                      }
                    } else {
                      stackOut_5_0 = 1;
                      stackIn_10_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                  L3: {
                    var3_int = stackIn_10_0;
                    var4 = 2949191;
                    var5 = 4325449;
                    var6 = sm.field_d;
                    var7 = var6.field_A.length;
                    if (var3_int == 0) {
                      de.c(0, 0, 640, 480, var4, var5);
                      break L3;
                    } else {
                      L4: {
                        var8 = uc.field_a + 480;
                        if (uc.field_a > 1) {
                          var9 = gf.a((uc.field_a * 1024 - -491520) / 480, (byte) 16, var5, var4);
                          de.c(0, 0, param0 / 2, uc.field_a / 2, var9, var4);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      de.c(0, uc.field_a / 2, param0 / 2, 240, var4, var5);
                      if (param1 + -var8 <= 1) {
                        break L3;
                      } else {
                        var9 = gf.a((491520 + (param1 - var8) * 1024) / 480, (byte) 14, var4, var5);
                        de.c(0, var8 / 2, param0 / 2, (param1 + -var8) / 2, var5, var9);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    var8 = 0;
                    var9 = 0;
                    if (param0 > 640) {
                      var8 = (-639 + param0) / 2;
                      var8 = var8 % var7;
                      if (0 < var8) {
                        var8 = var8 - var7;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (480 < param1) {
                      var9 = (param1 - 479) / 2;
                      var9 = var9 % var7;
                      if (var9 <= 0) {
                        break L6;
                      } else {
                        var9 = var9 - var7;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (var3_int != 0) {
                      var10 = var9;
                      L8: while (true) {
                        if (var10 >= param1) {
                          break L7;
                        } else {
                          var11 = var6.field_q * ((-var9 + var10) % var6.field_y);
                          var11 = dh.a(var11, true, var6.field_A.length);
                          var12 = var8;
                          L9: while (true) {
                            if (param0 <= var12) {
                              var10 += 2;
                              continue L8;
                            } else {
                              L10: {
                                de.g(var12 / 2, var10 / 2, 6035051, -(var6.field_A[var11] & 255) + 255 >> 2);
                                var11++;
                                if (var11 < var6.field_A.length) {
                                  break L10;
                                } else {
                                  var11 = 0;
                                  break L10;
                                }
                              }
                              L11: {
                                var11++;
                                if (var6.field_A.length <= var11) {
                                  var11 = 0;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var12 += 2;
                              continue L9;
                            }
                          }
                        }
                      }
                    } else {
                      var10 = var9;
                      L12: while (true) {
                        if (param1 <= var10) {
                          break L7;
                        } else {
                          var11 = (-var9 + var10) % var6.field_y * var6.field_q;
                          var11 = dh.a(var11, true, var6.field_A.length);
                          var12 = var8;
                          L13: while (true) {
                            if (param0 <= var12) {
                              var10++;
                              continue L12;
                            } else {
                              L14: {
                                de.g(var12, var10, 6035051, -(var6.field_A[var11] & 255) + 255 >> 2);
                                var11++;
                                if (var11 >= var6.field_A.length) {
                                  var11 = 0;
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              var12++;
                              continue L13;
                            }
                          }
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "ql.H(" + param0 + 44 + param1 + 44 + 0 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final static kc a(int param0) {
        int discarded$0 = 21;
        return mc.a();
    }

    final static qb[] a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        qb[] var7 = new qb[9];
        qb[] var4 = var7;
        var7[0] = ce.b(1, param3, 21385);
        for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = ce.b(64, param2, 21385);
        return var4;
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
            if (param1 > -3) {
                field_a = 59;
            }
            sm.a(31536000L, "jagex-last-login-method", param0, -15367, ((ql) this).field_d);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ql.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -10) {
              stackOut_3_0 = ((ql) this).field_d.equals((Object) (Object) param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ql.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (de.field_j >= param2 + (param1 + param3)) {
            return param3 + param1;
        }
        if (!(param3 + -param2 < 0)) {
            return param3 + -param2;
        }
        return de.field_j - param2;
    }

    ql(String param0) {
        try {
            ((ql) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ql.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(boolean param0) {
        ah.field_b = df.field_z.l(-1);
        CharSequence var2 = (CharSequence) (Object) ah.field_b;
        nm.field_b = gk.a(var2, -13);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
        field_e = "Searching for an opponent";
    }
}
