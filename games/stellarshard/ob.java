/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static fh field_b;
    static String field_d;
    static long field_a;
    static int[] field_c;

    public static void a() {
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1 < ti.field_e) {
                param3 = param3 - (ti.field_e + -param1);
                param1 = ti.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param5 >= ti.field_f) {
                break L2;
              } else {
                param4 = param4 - (-param5 + ti.field_f);
                param5 = ti.field_f;
                break L2;
              }
            }
            L3: {
              if (param1 + param3 <= ti.field_c) {
                break L3;
              } else {
                param3 = -param1 + ti.field_c;
                break L3;
              }
            }
            L4: {
              if (param5 - -param4 > ti.field_l) {
                param4 = -param5 + ti.field_l;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param0 >= 93) {
                break L5;
              } else {
                field_b = null;
                break L5;
              }
            }
            L6: {
              if (param3 <= 0) {
                break L6;
              } else {
                if (0 >= param4) {
                  break L6;
                } else {
                  var6_int = param1 - -(param5 * ti.field_i);
                  var7 = -param3 + ti.field_i;
                  param5 = -param4;
                  L7: while (true) {
                    if (param5 >= 0) {
                      break L0;
                    } else {
                      param1 = -param3;
                      L8: while (true) {
                        if (param1 >= 0) {
                          var6_int = var6_int + var7;
                          param5++;
                          continue L7;
                        } else {
                          L9: {
                            var8 = ti.field_a[var6_int];
                            if ((255 & var8 >> 8) <= 64) {
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6_int++;
                          param1++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var6, "ob.A(" + param0 + ',' + param1 + ',' + 64 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new int[128];
    }
}
