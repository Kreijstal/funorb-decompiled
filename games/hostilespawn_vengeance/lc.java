/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static int[] field_c;
    static volatile int field_d;
    static bd field_a;
    static bd field_b;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 <= 24) {
            field_d = -17;
        }
    }

    final static void a(oj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = -50;
            if (param0.field_i == 125) {
              L1: {
                param0.field_I = 1;
                param0.field_i = 126;
                param0.field_u = ia.field_l[129];
                if (uj.field_l != 1) {
                  break L1;
                } else {
                  if (!ej.d((byte) 115)) {
                    break L1;
                  } else {
                    eh.field_c.a(lm.field_A[17], 100, uh.field_i);
                    break L1;
                  }
                }
              }
              L2: {
                am.a(param0.field_j.b(-4), (byte) 125);
                var3 = ln.field_a.field_g[param0.field_j.b(-4)];
                if (var3 <= 0) {
                  break L2;
                } else {
                  var4 = 0;
                  L3: while (true) {
                    if (el.field_j <= var4) {
                      break L2;
                    } else {
                      L4: {
                        if (!mm.field_m[var4].field_b) {
                          var4++;
                          break L4;
                        } else {
                          if (mm.field_m[var4].field_i == 8) {
                            var4++;
                            break L4;
                          } else {
                            if (var3 != ln.field_a.field_g[mm.field_m[var4].field_j.b(-4)]) {
                              break L4;
                            } else {
                              if (mm.field_m[var4].field_i == 27) {
                                L5: {
                                  n.field_o = false;
                                  if (bm.field_c != 1) {
                                    break L5;
                                  } else {
                                    if (rl.field_c == 3) {
                                      ti.a(231, (byte) -113, 24);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                mm.field_m[var4].c((byte) -99);
                                break L4;
                              } else {
                                mm.field_m[var4].field_I = 0;
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var4++;
                      continue L3;
                    }
                  }
                }
              }
              L6: {
                if (q.field_g != null) {
                  q.field_g.a(-45, param0);
                  break L6;
                } else {
                  break L6;
                }
              }
              if (100 > tb.field_N) {
                tb.field_N = 100;
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("lc.C(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 19 + 41);
        }
    }

    final static void a(boolean param0, gb param1, gb param2, int param3, gb param4) {
        c.field_a = ta.a(false, "");
        c.field_a.a(25957, false);
        ab.a(0, param4, param1, param2);
        int discarded$0 = 0;
        qm.a();
        ki.field_f = e.field_q;
        try {
            od.field_I = e.field_q;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "lc.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + 12789 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = -1;
    }
}
