/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ifa extends td {
    static String field_p;

    final ii a(op param0, int param1) {
        ii stackIn_3_0 = null;
        ju stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ju var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wia var16 = null;
        aga var17 = null;
        int var18 = 0;
        aga var19 = null;
        int[][] var23 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var19 = this.field_h.a(34, param0);
            if (param1 == 3) {
              var4 = new ju(this.field_g, new nq(var19));
              var5 = 17;
              var6 = 17;
              var7 = -1 + var5 >> 1807565089;
              var8 = var6 - 1 >> 1715139553;
              var23 = var4.d((byte) 27);
              var10 = var19.field_x;
              var11 = var19.field_J;
              var12 = 0;
              L1: while (true) {
                if (var5 <= var12) {
                  stackIn_20_0 = (ju) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var13 = 0;
                  L2: while (true) {
                    if (var13 >= var6) {
                      var12++;
                      continue L1;
                    } else {
                      L3: {
                        if (-2 == (var23[var12][var13] ^ -1)) {
                          var14 = var12 - (var7 - var10);
                          var15 = var13 + -var8 + var11;
                          if ((var14 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (var14 >= param0.field_z) {
                              break L3;
                            } else {
                              if (var15 < 0) {
                                break L3;
                              } else {
                                if (var15 >= param0.field_B) {
                                  break L3;
                                } else {
                                  var16 = param0.field_a[var14][var15];
                                  var17 = var16.field_l;
                                  if (var17 != null) {
                                    var4.field_o.a(new iv(new nq(var17), false, 1, 40, 0), true);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      var13++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ii) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("ifa.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_20_0);
        }
    }

    public static void b(int param0) {
        field_p = null;
        int var1 = 9 / ((param0 - -60) / 39);
    }

    final static vr a(int param0, boolean param1, boolean param2, int param3, boolean param4) {
        int var5 = 76 / ((param3 - 1) / 56);
        return qma.a(param2, 2097152, false, param4 ? 1 : 0, param1, param0);
    }

    ifa(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        field_p = "Try again";
    }
}
