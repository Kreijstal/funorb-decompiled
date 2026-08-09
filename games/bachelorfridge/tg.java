/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends td {
    static java.math.BigInteger field_p;

    final static boolean c(int param0) {
        fka var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        fka var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (fka) ((Object) fd.field_z.b((byte) 90));
            var1 = var4;
            if (var1 != null) {
              if (param0 <= -38) {
                var2 = 0;
                L1: while (true) {
                  if (var1.field_k <= var2) {
                    stackIn_22_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L2: {
                      if (var4.field_i[var2] != null) {
                        if (var4.field_i[var2].field_f == 0) {
                          stackIn_14_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (var4.field_j[var2] != null) {
                        if (0 != var4.field_j[var2].field_f) {
                          break L3;
                        } else {
                          stackIn_19_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "tg.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        jl var4 = null;
        jl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_h.a(param1 ^ 104, param0);
              var4 = new jl(this.field_g, new nq(var3));
              if (param1 == 3) {
                break L1;
              } else {
                tg.c(-1);
                break L1;
              }
            }
            var4.field_o.a(new iv(new nq(var3), false, 1, 0, 28), true);
            stackIn_3_0 = (jl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("tg.A(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_3_0);
    }

    public static void b(int param0) {
        field_p = null;
        if (param0 != 1) {
            tg.c(-2);
        }
    }

    tg(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
