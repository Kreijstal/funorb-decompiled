/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends vg {
    static String field_f;
    static nh field_g;

    final static int a(int param0, byte param1, int param2, int param3) {
        if (param0 > param3) {
          return param0;
        } else {
          if (param2 >= param3) {
            if (param1 <= 35) {
              field_g = null;
              return param3;
            } else {
              return param3;
            }
          } else {
            return param2;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
    }

    final static int a(int param0) {
        return aa.field_c;
    }

    protected za() {
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
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
        int var26 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = param1;
              var8 = param2 * param2;
              var9 = param1 * param1;
              var10 = var9 << 1;
              var11 = var8 << 1;
              var12 = param1 << 1;
              var13 = var10 + (-var12 + 1) * var8;
              var14 = var9 + -(var11 * (-1 + var12));
              var15 = var8 << 2;
              var16 = var9 << 2;
              var17 = 71 % ((39 - param4) / 61);
              var18 = (3 + (var6_int << 1)) * var10;
              var19 = ((var7 << 1) + -3) * var11;
              var20 = (1 + var6_int) * var16;
              var21 = var15 * (var7 - 1);
              if (gca.field_d > param5) {
                break L1;
              } else {
                if (hc.field_h >= param5) {
                  var22 = rp.a(ss.field_c, -16226, pka.field_b, param0 - -param2);
                  var23 = rp.a(ss.field_c, -16226, pka.field_b, param0 - param2);
                  nra.a((byte) -55, param3, var22, vaa.field_a[param5], var23);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: while (true) {
              if (var7 <= 0) {
                break L0;
              } else {
                L3: {
                  if (0 <= var13) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (var13 >= 0) {
                        break L3;
                      } else {
                        var14 = var14 + var20;
                        var13 = var13 + var18;
                        var6_int++;
                        var20 = var20 + var16;
                        var18 = var18 + var16;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  if (var14 < 0) {
                    var14 = var14 + var20;
                    var13 = var13 + var18;
                    var6_int++;
                    var18 = var18 + var16;
                    var20 = var20 + var16;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var14 = var14 + -var19;
                var13 = var13 + -var21;
                var19 = var19 - var15;
                var7--;
                var21 = var21 - var15;
                var22 = param5 + -var7;
                var23 = var7 + param5;
                if (var23 < gca.field_d) {
                  continue L2;
                } else {
                  if (hc.field_h >= var22) {
                    L6: {
                      var24 = rp.a(ss.field_c, -16226, pka.field_b, param0 + var6_int);
                      var25 = rp.a(ss.field_c, -16226, pka.field_b, -var6_int + param0);
                      if (var22 < gca.field_d) {
                        break L6;
                      } else {
                        nra.a((byte) -55, param3, var24, vaa.field_a[var22], var25);
                        break L6;
                      }
                    }
                    if (var23 <= hc.field_h) {
                      nra.a((byte) -55, param3, var24, vaa.field_a[var23], var25);
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
          throw tba.a((Throwable) (Object) var6, "za.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Player names can be up to 12 letters, numbers and underscores";
    }
}
