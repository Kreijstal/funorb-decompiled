/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends bo implements Cloneable {
    static am field_q;
    static char field_p;

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = ng.a(eb.field_m, param1, new c(new kp(-1)), (byte) -83, kd.field_m);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("c.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    c(f param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        L0: {
          L1: {
            var7 = -38 % ((param0 - 74) / 41);
            if (param1 != 24) {
              break L1;
            } else {
              if (-25 == (param2 ^ -1)) {
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
            field_q = (am) null;
            return 0;
        }
        return 0;
    }

    final static void a(int param0, uf param1) {
        int var2_int = 0;
        uf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            if (null != param1.field_h) {
              L1: {
                L2: {
                  if ((param1.field_d ^ -1) != param0) {
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
                            decompiledRegionSelector0 = 1;
                            break L0;
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
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("c.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
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

    final static lb b(boolean param0) {
        if (param0) {
            c.g(83);
        }
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
