/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ifa extends td {
    static String field_p;

    final ii a(op param0, int param1) {
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
        Object stackIn_3_0 = null;
        ju stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ju stackOut_19_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var18 = BachelorFridge.field_y;
        try {
          L0: {
            var19 = ((ifa) this).field_h.a(34, param0);
            if (param1 == 3) {
              var4 = new ju(((ifa) this).field_g, new nq(var19));
              var5 = 17;
              var6 = 17;
              var7 = -1 + var5 >> 1;
              var8 = var6 - 1 >> 1;
              var23 = var4.d((byte) 27);
              var10 = var19.field_x;
              var11 = var19.field_J;
              var12 = 0;
              L1: while (true) {
                if (var5 <= var12) {
                  stackOut_19_0 = (ju) var4;
                  stackIn_20_0 = stackOut_19_0;
                  break L0;
                } else {
                  var13 = 0;
                  L2: while (true) {
                    if (var13 >= var6) {
                      var12++;
                      continue L1;
                    } else {
                      L3: {
                        if (var23[var12][var13] == 1) {
                          var14 = var12 - (var7 - var10);
                          var15 = var13 + -var8 + var11;
                          if (var14 < 0) {
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
                                    var4.field_o.a((bw) (Object) new iv(new nq(var17), false, 1, 40, 0), true);
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
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("ifa.A(");
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
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_20_0;
    }

    public static void b() {
        field_p = null;
        int var1 = 3;
    }

    final static vr a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 76 / ((param3 - 1) / 56);
        return qma.a(false, 2097152, false, 0, false, param0);
    }

    ifa(int param0, aga param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Try again";
    }
}
