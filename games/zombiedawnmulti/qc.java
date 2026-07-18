/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends qa {
    static ul field_s;
    boolean field_x;
    boolean field_r;
    static int field_q;
    static cj field_u;
    static int field_v;
    static String field_w;
    volatile boolean field_t;

    final static void a(int param0, byte param1, ja[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              g.c();
              if (0 != param4) {
                if (1 == param4) {
                  param2[param3].a();
                  param2[param0].c(0, 0);
                  var5_int = 0;
                  L2: while (true) {
                    if (var5_int >= 24) {
                      break L1;
                    } else {
                      oo.b(var5_int, 0, 24, 0, var5_int * 5);
                      var5_int++;
                      continue L2;
                    }
                  }
                } else {
                  if (param4 != 2) {
                    if (3 != param4) {
                      if (param4 != 4) {
                        if (param4 != 6) {
                          if (param4 != 8) {
                            if (7 != param4) {
                              if (param4 != 5) {
                                break L1;
                              } else {
                                param2[param3].a();
                                param2[param0].c(0, 0);
                                var5_int = 0;
                                L3: while (true) {
                                  if (var5_int >= 24) {
                                    break L1;
                                  } else {
                                    oo.c(-var5_int + 24, var5_int, var5_int, 0, -(5 * var5_int) + 120);
                                    oo.b(var5_int, 0, 24 - var5_int, 0, var5_int * 5);
                                    var5_int++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              param2[param3].a();
                              param2[param0].c(0, 0);
                              var5_int = 0;
                              L4: while (true) {
                                if (var5_int >= 24) {
                                  break L1;
                                } else {
                                  oo.c(0, var5_int, 24 - var5_int, 0, 5 * var5_int);
                                  oo.b(var5_int, -var5_int + 24, var5_int, 0, -(5 * var5_int) + 120);
                                  var5_int++;
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            param2[param3].a();
                            param2[param0].c(0, 0);
                            var5_int = 0;
                            L5: while (true) {
                              if (24 <= var5_int) {
                                break L1;
                              } else {
                                oo.c(0, var5_int, var5_int - -1, 0, -(var5_int * 5) + 120);
                                oo.b(var5_int, 0, var5_int, 0, -(5 * var5_int) + 120);
                                var5_int++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          param2[param3].a();
                          param2[param0].c(0, 0);
                          var5_int = 0;
                          L6: while (true) {
                            if (24 <= var5_int) {
                              break L1;
                            } else {
                              oo.c(var5_int + 1, var5_int, 24 + -var5_int, 0, 5 * var5_int);
                              oo.b(var5_int, var5_int, -var5_int + 24, 0, var5_int * 5);
                              var5_int++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        L7: while (true) {
                          if (var5_int >= 24) {
                            break L1;
                          } else {
                            oo.c(0, var5_int, 24, 0, -(5 * var5_int) + 120);
                            var5_int++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      param2[param3].a();
                      param2[param0].c(0, 0);
                      var5_int = 0;
                      L8: while (true) {
                        if (var5_int >= 24) {
                          break L1;
                        } else {
                          oo.c(0, var5_int, 24, 0, var5_int * 5);
                          var5_int++;
                          continue L8;
                        }
                      }
                    }
                  } else {
                    param2[param3].a();
                    param2[param0].c(0, 0);
                    var5_int = 0;
                    L9: while (true) {
                      if (var5_int >= 24) {
                        break L1;
                      } else {
                        oo.b(var5_int, 0, 24, 0, -(5 * var5_int) + 120);
                        var5_int++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                param2[param3].a();
                param2[param0].c(0, 0);
                oo.f(0, 0, 24, 24, 0, 128);
                break L1;
              }
            }
            g.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("qc.P(").append(param0).append(',').append(-126).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract byte[] e(int param0);

    final static void a(br param0, br param1) {
        try {
            if (param0.field_b != null) {
                param0.a(true);
            }
            param0.field_b = param1;
            param0.field_d = param1.field_d;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "qc.O(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    public static void c(byte param0) {
        field_u = null;
        field_s = null;
        field_w = null;
        if (param0 < 97) {
            qc.c((byte) 22);
        }
    }

    final static String b(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[-var4 + -1 + var2_int] = param1.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("qc.M(").append(-32).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    abstract int f(int param0);

    qc() {
        ((qc) this).field_t = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Hungry";
    }
}
