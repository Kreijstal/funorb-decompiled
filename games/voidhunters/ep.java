/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends rqa {
    static kb field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
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
              si.a(199, 62, param0[0].a(45));
              if (param1 < -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ep.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ep(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        RuntimeException decompiledCaughtException = null;
        var25 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = param4;
              var8 = param3 * param3;
              var9 = param4 * param4;
              var10 = var9 << 1;
              var11 = var8 << 1;
              var12 = param4 << 1;
              var13 = var10 + var8 * (-var12 + 1);
              var14 = var9 + -((var12 - 1) * var11);
              var15 = var8 << 2;
              var16 = var9 << 2;
              var17 = var10 * ((var6_int << 1) - -3);
              var18 = var11 * ((var7 << 1) + -3);
              var19 = var16 * (1 + var6_int);
              if (lua.field_c > param1) {
                break L1;
              } else {
                if (hab.field_i < param1) {
                  break L1;
                } else {
                  var21 = ksa.a(31123, ob.field_j, mt.field_o, param3 + param5);
                  var22 = ksa.a(31123, ob.field_j, mt.field_o, -param3 + param5);
                  ww.a(param2, var21, rba.field_b[param1], (byte) 75, var22);
                  break L1;
                }
              }
            }
            var20 = (var7 + -1) * var15;
            L2: while (true) {
              if (var7 <= 0) {
                break L0;
              } else {
                L3: {
                  if (0 > var13) {
                    L4: while (true) {
                      if (var13 >= 0) {
                        break L3;
                      } else {
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var6_int++;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var14 < 0) {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var19 = var19 + var16;
                    var17 = var17 + var16;
                    var6_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var14 = var14 + -var18;
                var13 = var13 + -var20;
                var7--;
                var20 = var20 - var15;
                var18 = var18 - var15;
                var21 = param1 - var7;
                var22 = var7 + param1;
                if (var22 < lua.field_c) {
                  continue L2;
                } else {
                  if (hab.field_i >= var21) {
                    L6: {
                      var23 = ksa.a(31123, ob.field_j, mt.field_o, param5 + var6_int);
                      var24 = ksa.a(31123, ob.field_j, mt.field_o, -var6_int + param5);
                      if (lua.field_c <= var21) {
                        ww.a(param2, var23, rba.field_b[var21], (byte) 75, var24);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (hab.field_i >= var22) {
                      ww.a(param2, var23, rba.field_b[var22], (byte) 75, var24);
                      continue L2;
                    } else {
                      continue L2;
                    }
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6, "ep.B(" + -126 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void e(byte param0) {
        int var1 = 1;
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new kb(3);
    }
}
