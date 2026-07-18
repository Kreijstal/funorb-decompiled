/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv extends cj {
    static uha field_n;
    eaa field_m;
    static kv[] field_k;
    static sna field_l;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        jma stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jma stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 == 5) {
              stackOut_3_0 = new jma(param1, (rv) this);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (at) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("rv.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return (at) (Object) stackIn_4_0;
    }

    final void a(boolean param0, pp param1) {
        try {
            ((rv) this).field_m.a((bw) (Object) param1, param0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "rv.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        var8 = 15 % ((-53 - param3) / 36);
        if (param2 == param4) {
          int discarded$1 = 512;
          ur.a(param4, param7, param5, param0, param1, param6);
          return;
        } else {
          if (param7 - param4 >= eo.field_l) {
            if (pw.field_x >= param4 + param7) {
              if (param5 - param2 >= an.field_q) {
                if (param2 + param5 <= ha.field_n) {
                  pw.a(true, param4, param1, param6, param5, param2, param0, param7);
                  return;
                } else {
                  eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
                  return;
                }
              } else {
                eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
                return;
              }
            } else {
              eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
              return;
            }
          } else {
            eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
            return;
          }
        }
    }

    final void a(op param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        pp var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                rv.a(120, 93, 90, -30, -60, 118, -97, -20);
                break L1;
              }
            }
            var5 = (pp) (Object) ((rv) this).field_m.b((byte) 90);
            L2: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                var5.a((aga) null, param0, 12);
                var5 = (pp) (Object) ((rv) this).field_m.c(0);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("rv.K(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
    }

    rv(lu param0) {
        super(5);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            ((rv) this).field_m = new eaa();
            var2_int = param0.b(16711935);
            L1: while (true) {
              var2_int--;
              if (var2_int < 0) {
                break L0;
              } else {
                var3 = param0.b(16711935);
                if (var3 != 1) {
                  if (var3 == 2) {
                    int discarded$2 = 95;
                    ((rv) this).field_m.a((bw) (Object) db.a(param0), true);
                    continue L1;
                  } else {
                    if (var3 == 3) {
                      ((rv) this).field_m.a((bw) (Object) hea.b(16866, param0), true);
                      continue L1;
                    } else {
                      if (var3 == 4) {
                        ((rv) this).field_m.a((bw) (Object) uha.b(param0, -7), true);
                        continue L1;
                      } else {
                        if (5 != var3) {
                          if (var3 == 6) {
                            int discarded$3 = -4479;
                            ((rv) this).field_m.a((bw) (Object) eo.a(param0), true);
                            continue L1;
                          } else {
                            if (var3 == 7) {
                              ((rv) this).field_m.a((bw) (Object) bea.a(-1547040176, param0), true);
                              continue L1;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        } else {
                          ((rv) this).field_m.a((bw) (Object) k.a(false, param0), true);
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  ((rv) this).field_m.a((bw) (Object) vo.a(-44, param0), true);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("rv.<init>(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final void a(lu param0, int param1) {
        pp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            param0.d(((rv) this).field_m.g(0), 0);
            if (param1 == -9) {
              var3 = (pp) (Object) ((rv) this).field_m.b((byte) 90);
              L1: while (true) {
                if (var3 == null) {
                  break L0;
                } else {
                  L2: {
                    if (!(var3 instanceof lia)) {
                      if (!(var3 instanceof qq)) {
                        if (var3 instanceof ks) {
                          param0.d(3, 0);
                          break L2;
                        } else {
                          if (!(var3 instanceof mh)) {
                            if (var3 instanceof kt) {
                              param0.d(5, 0);
                              break L2;
                            } else {
                              if (var3 instanceof fda) {
                                param0.d(6, param1 ^ -9);
                                break L2;
                              } else {
                                if (var3 instanceof ic) {
                                  param0.d(7, 0);
                                  break L2;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                          } else {
                            param0.d(4, 0);
                            break L2;
                          }
                        }
                      } else {
                        param0.d(2, param1 ^ -9);
                        break L2;
                      }
                    } else {
                      param0.d(1, 0);
                      break L2;
                    }
                  }
                  var3.a(param0, (byte) -56);
                  var3 = (pp) (Object) ((rv) this).field_m.c(param1 ^ -9);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3_ref;
            stackOut_22_1 = new StringBuilder().append("rv.O(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
    }

    public rv() {
        super(5);
        ((rv) this).field_m = new eaa();
    }

    static {
    }
}
