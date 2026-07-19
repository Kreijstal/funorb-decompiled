/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    int field_a;
    int field_f;
    String field_g;
    int field_h;
    static String field_i;
    boolean field_d;
    kh field_c;
    String field_b;
    fq field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
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
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param1 != param6) {
                    break L3;
                  } else {
                    if (param7 != param9) {
                      break L3;
                    } else {
                      if (param0 != param2) {
                        break L3;
                      } else {
                        if (param5 == param3) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var10_int = param6;
                var11 = param9;
                var12 = 3 * param6;
                var13 = 3 * param9;
                var14 = 3 * param1;
                var15 = param7 * 3;
                var16 = 3 * param0;
                var17 = 3 * param3;
                var18 = var14 + -var16 + (param2 + -param6);
                var19 = -param9 + -var17 + (param5 + var15);
                var20 = -var14 + (-var14 + var16 + var12);
                var21 = var13 + -var15 + (-var15 + var17);
                var22 = -var12 + var14;
                var23 = -var13 + var15;
                var24 = 128;
                L4: while (true) {
                  L5: {
                    if ((var24 ^ -1) < -4097) {
                      break L5;
                    } else {
                      var25 = var24 * var24 >> 2043618156;
                      var26 = var25 * var24 >> -104346676;
                      var27 = var26 * var18;
                      var28 = var26 * var19;
                      var29 = var20 * var25;
                      var30 = var25 * var21;
                      var31 = var24 * var22;
                      var32 = var23 * var24;
                      var33 = (var31 + var27 - -var29 >> -1387134516) + param6;
                      var34 = param9 - -(var32 + var30 + var28 >> 1200050796);
                      ara.a(0, param8, var10_int, var33, var11, var34);
                      var11 = var34;
                      var10_int = var33;
                      var24 += 128;
                      if (var35 != 0) {
                        break L1;
                      } else {
                        if (var35 == 0) {
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var35 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ara.a(0, param8, param6, param2, param9, param5);
              break L1;
            }
            if (param4 < -17) {
              break L0;
            } else {
              g.a(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var10), "g.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_i = null;
    }

    g(String param0, String param1, int param2, int param3, boolean param4, int param5) {
        try {
            if (-1 == param1.indexOf(".trlev")) {
                param1 = param1 + ".trlev";
            }
            this.field_a = param3;
            this.field_b = param1;
            this.field_h = param5;
            this.field_d = param4 ? true : false;
            this.field_f = param2;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_i = "Waiting";
    }
}
