/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends bo implements Cloneable {
    static am field_q;
    static char field_p;

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_2_0 = null;
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
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                field_p = 'ﾡ';
                break L1;
              }
            }
            stackOut_2_0 = ng.a(eb.field_m, param1, (f) (Object) new c((f) (Object) new kp(-1)), (byte) -83, kd.field_m);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("c.V(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    c(f param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        L0: {
          L1: {
            var7 = -38 % ((param0 - 74) / 41);
            if (param1 != 24) {
              break L1;
            } else {
              if (param2 == 24) {
                qb.field_b.a(param4, param5 + -param2);
                break L0;
              } else {
                break L1;
              }
            }
          }
          qb.field_b.b(param4, param5 - param2, param1 * 2, param2 * 3);
          break L0;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_q = null;
            return 0;
        }
        return 0;
    }

    final static void a(int param0, uf param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        uf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (null != param1.field_h) {
              L1: {
                L2: {
                  if (~param1.field_d != param0) {
                    break L2;
                  } else {
                    if (param1.field_l == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= jl.field_d) {
                    break L1;
                  } else {
                    L4: {
                      var3 = ol.field_D[var2_int];
                      if (var3.field_f != 2) {
                        break L4;
                      } else {
                        if (param1.field_d != var3.field_d) {
                          break L4;
                        } else {
                          if (param1.field_l != var3.field_l) {
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
                if (null != param1.field_k) {
                  break L5;
                } else {
                  break L5;
                }
              }
              kj.a(param1, (byte) 36);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("c.I(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static lb b(boolean param0) {
        if (sa.field_lb == null) {
            sa.field_lb = new lb(ba.field_i, 20, 0, 0, 0, 11579568, -1, 0, 0, ba.field_i.field_o, -1, 2147483647, true);
        }
        return sa.field_lb;
    }

    public static void g(int param0) {
        if (param0 != -1) {
            return;
        }
        field_q = null;
    }

    static {
    }
}
