/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements mh {
    static String field_a;
    static qr field_b;

    public static void a(byte param0) {
        if (param0 >= -100) {
            fm.a((byte) -19);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 5592405) {
                break L1;
              } else {
                fm.a((byte) 119);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param0.field_p < var6_int) {
                    break L4;
                  } else {
                    var7 = 152 - -(48 * var6_int / param0.field_p);
                    var8 = var7 << -779123760 | var7 << -1695338296 | var7;
                    lk.f(param4 - -param0.field_r, var6_int + param0.field_v + param1, param0.field_q, var8);
                    var6_int++;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6_int = 1;
                break L3;
              }
              L5: while (true) {
                if (var6_int > 5) {
                  break L0;
                } else {
                  var7 = -(param0.field_q >> -790897375) + (param0.field_q + (param4 + param0.field_r) + (-5 - -var6_int));
                  var8 = -(2 * var6_int) + (param0.field_q >> 1987058209);
                  var9 = (-4 + param0.field_p >> 984733729) + (param1 + param0.field_v + var6_int);
                  if (var10 == 0) {
                    L6: {
                      if (var9 < lk.field_i) {
                        break L6;
                      } else {
                        if (lk.field_e <= var9) {
                          break L6;
                        } else {
                          L7: {
                            if (lk.field_k < var7) {
                              lk.field_a[var9 * lk.field_b - (-var7 - -1)] = eb.a(16711422, lk.field_a[var7 + (var9 * lk.field_b - 1)]) >> -753764543;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (var7 + var8 < lk.field_j) {
                            lk.field_a[var8 + (var9 * lk.field_b - -var7)] = eb.a(8355711, lk.field_a[var9 * lk.field_b + var7 - -var8] >> -1558945407);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    lk.f(var7, var9, var8, 0);
                    var6_int++;
                    continue L5;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("fm.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Age:";
        field_b = new qr();
    }
}
