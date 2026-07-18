/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class od extends cb {
    static r field_k;
    static int field_n;
    static int field_o;
    private String field_l;
    private jg field_j;
    static String field_i;
    private boolean field_m;

    final static boolean e(boolean param0) {
        if (!param0) {
          if (!kj.a(param0)) {
            if (hc.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          od.a(16, -41);
          if (!kj.a(param0)) {
            if (hc.field_D) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void f() {
        field_i = null;
        field_k = null;
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((od) this).field_j.a(param1, 5) != fg.field_d) {
              var3_int = 71 / ((param0 - 49) / 56);
              if (((od) this).a(param1, 5) != fg.field_d) {
                stackOut_6_0 = c.field_b;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = dl.field_a;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ((od) this).field_j.a((byte) 122, param1);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("od.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    od(ui param0, ui param1) {
        super(param0);
        ((od) this).field_m = false;
        ((od) this).field_l = "";
        try {
            ((od) this).field_j = new jg(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ag a(String param0, int param1) {
        jf var3 = null;
        RuntimeException var3_ref = null;
        ag stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        ag stackIn_11_0 = null;
        ag stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_2_0 = null;
        ag stackOut_10_0 = null;
        ag stackOut_15_0 = null;
        ag stackOut_14_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((od) this).field_j.a(param0, param1) == fg.field_d) {
              stackOut_2_0 = fg.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1 == 5) {
                L1: {
                  if (!param0.equals((Object) (Object) ((od) this).field_l)) {
                    var3 = l.a(param0, (byte) -128);
                    if (var3.a(0)) {
                      ((od) this).field_l = param0;
                      ((od) this).field_m = var3.b(-118);
                      break L1;
                    } else {
                      stackOut_10_0 = bm.field_o;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((od) this).field_m) {
                    stackOut_15_0 = sc.field_a;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  } else {
                    stackOut_14_0 = fg.field_d;
                    stackIn_16_0 = stackOut_14_0;
                    break L2;
                  }
                }
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (ag) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("od.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1 != 35) {
                if (36 == param1) {
                  L2: {
                    if (wi.field_v == null) {
                      break L2;
                    } else {
                      if (!wi.field_v.k()) {
                        return;
                      } else {
                        break L2;
                      }
                    }
                  }
                  wi.field_v = rc.b(re.field_a[param1], 100, param2, param0);
                  sa discarded$7 = mg.a(1963987425, wi.field_v);
                  break L1;
                } else {
                  if (param1 != 42) {
                    if (46 != param1) {
                      if (param1 == 47) {
                        var6 = 4;
                        var4_int = var6;
                        L3: while (true) {
                          if (var6 < 0) {
                            break L1;
                          } else {
                            L4: {
                              if (null == si.field_b[var6]) {
                                break L4;
                              } else {
                                if (!si.field_b[var6].k()) {
                                  var6--;
                                  var6--;
                                  continue L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            si.field_b[var6] = rc.b(re.field_a[param1], 100, param2, param0);
                            sa discarded$8 = mg.a(1963987425, si.field_b[var6]);
                            break L1;
                          }
                        }
                      } else {
                        int discarded$9 = 0;
                        sa discarded$10 = ii.a(re.field_a[param1]);
                        break L1;
                      }
                    } else {
                      var4_int = 4;
                      L5: while (true) {
                        if (var4_int < 0) {
                          break L1;
                        } else {
                          L6: {
                            if (mh.field_b[var4_int] == null) {
                              break L6;
                            } else {
                              if (!mh.field_b[var4_int].k()) {
                                var4_int--;
                                var4_int--;
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          mh.field_b[var4_int] = rc.b(re.field_a[param1], 100, param2, param0);
                          sa discarded$11 = mg.a(param3 + 1963987421, mh.field_b[var4_int]);
                          break L1;
                        }
                      }
                    }
                  } else {
                    L7: {
                      if (df.field_a == null) {
                        break L7;
                      } else {
                        if (!df.field_a.k()) {
                          return;
                        } else {
                          break L7;
                        }
                      }
                    }
                    df.field_a = rc.b(re.field_a[param1], 100, param2, param0);
                    sa discarded$12 = mg.a(1963987425, df.field_a);
                    break L1;
                  }
                }
              } else {
                L8: {
                  if (null == qg.field_b) {
                    break L8;
                  } else {
                    if (qg.field_b.k()) {
                      break L8;
                    } else {
                      return;
                    }
                  }
                }
                qg.field_b = rc.b(re.field_a[param1], 100, param2, param0);
                sa discarded$13 = mg.a(param3 + 1963987421, qg.field_b);
                break L1;
              }
            }
            if (param3 == 4) {
              break L0;
            } else {
              od.a(-80, -28, -12, -111);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var4, "od.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1) {
        aa.field_f = oi.field_J[param1];
        ge.field_d = kd.field_k[param1];
        ic.field_g = ra.field_e[param1];
        if (param0 < 77) {
            field_i = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 640;
        field_i = "       ";
        field_o = 250;
        field_k = new r();
    }
}
