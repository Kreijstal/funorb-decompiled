/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends oh {
    static bi[] field_o;
    int field_l;
    int field_m;
    int field_k;
    ql field_h;
    int field_i;
    static pf field_p;
    int field_j;
    static nq field_n;
    static volatile int field_q;

    final static void a(byte param0, String[] param1) {
        RuntimeException var2 = null;
        sq var3 = null;
        int var4 = 0;
        String var5 = null;
        sq var6 = null;
        int var7 = 0;
        int var8 = 0;
        dm var9 = null;
        sq stackIn_17_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        sq stackOut_15_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            vc.field_c = param1;
            if (0 != vc.field_c.length) {
              um.field_k = 0;
              tp.b((byte) 93);
              var9 = new dm();
              var3 = nd.a((byte) -106);
              L1: while (true) {
                if (var3 == null) {
                  mf.field_q = new sq[var9.field_g];
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= var9.field_g) {
                      var8 = 0;
                      var4 = var8;
                      L3: while (true) {
                        if (var9.field_g - 1 <= var8) {
                          break L0;
                        } else {
                          L4: {
                            var5 = mf.field_q[var8].field_d;
                            if (var5 == null) {
                              stackOut_16_0 = null;
                              stackIn_17_0 = (sq) (Object) stackOut_16_0;
                              break L4;
                            } else {
                              stackOut_15_0 = n.a(var5, -21502);
                              stackIn_17_0 = stackOut_15_0;
                              break L4;
                            }
                          }
                          L5: {
                            var6 = stackIn_17_0;
                            if (var6 != null) {
                              break L5;
                            } else {
                              if (!mf.field_q[var8].field_r) {
                                var6 = mf.field_q[var8 - -1];
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          mf.field_q[var8].field_l = var6;
                          var8++;
                          continue L3;
                        }
                      }
                    } else {
                      mf.field_q[var4] = (sq) var9.field_b[var4];
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  var9.a(false, (Object) (Object) var3);
                  var3 = nd.a((byte) 118);
                  continue L1;
                }
              }
            } else {
              mf.field_q = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("ql.C(").append(50).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        gm var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              aj.field_e.e();
              hg.field_q.e();
              dp.field_u = dp.field_u - 1;
              if (dp.field_u == 0) {
                dp.field_u = 200;
                var1 = (gm) (Object) eo.field_ab.d(0);
                L2: while (true) {
                  if (var1 == null) {
                    if (nc.field_v != null) {
                      var1 = (gm) (Object) nc.field_v.d(0);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_n.c(2048)) {
                              var1.b((byte) -84);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (gm) (Object) nc.field_v.a((byte) -71);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (!var1.field_n.c(2048)) {
                        var1.b((byte) -108);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (gm) (Object) eo.field_ab.a((byte) -71);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L6: {
              if (jh.field_B == null) {
                break L6;
              } else {
                if (!jh.field_B.h(5309)) {
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "ql.A(" + -26848 + ')');
        }
    }

    final static void a(java.awt.Frame param0, int param1, qb param2) {
        pb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(param0, (byte) 127);
              L2: while (true) {
                if (var3.field_d != 0) {
                  if (var3.field_d == 1) {
                    break L0;
                  } else {
                    jb.a((byte) -93, 100L);
                    continue L1;
                  }
                } else {
                  jb.a((byte) -94, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ql.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        field_n = null;
    }

    ql(int param0, int param1, int param2, int param3, int param4) {
        ((ql) this).field_m = param2;
        ((ql) this).field_j = param3;
        ((ql) this).field_l = param4;
        ((ql) this).field_i = param0;
        ((ql) this).field_k = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new pf();
        field_q = 0;
    }
}
