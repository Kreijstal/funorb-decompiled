/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements mh {
    static String field_a;
    static qr field_b;

    public static void a(byte param0) {
        if (param0 >= -100) {
            fm.a((byte) -19);
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
              if (param0.field_p < var6_int) {
                var6_int = 1;
                L3: while (true) {
                  if (var6_int > 5) {
                    break L0;
                  } else {
                    L4: {
                      var7 = -(param0.field_q >> 1) + (param0.field_q + (param4 + param0.field_r) + (-5 - -var6_int));
                      var8 = -(2 * var6_int) + (param0.field_q >> 1);
                      var9 = (-4 + param0.field_p >> 1) + (param1 + param0.field_v + var6_int);
                      if (var9 < lk.field_i) {
                        break L4;
                      } else {
                        if (lk.field_e <= var9) {
                          break L4;
                        } else {
                          L5: {
                            if (lk.field_k < var7) {
                              lk.field_a[var9 * lk.field_b - (-var7 - -1)] = eb.a(16711422, lk.field_a[var7 + (var9 * lk.field_b - 1)]) >> 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          if (var7 + var8 < lk.field_j) {
                            lk.field_a[var8 + (var9 * lk.field_b - -var7)] = eb.a(8355711, lk.field_a[var9 * lk.field_b + var7 - -var8] >> 1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    lk.f(var7, var9, var8, 0);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                var7 = 152 - -(48 * var6_int / param0.field_p);
                var8 = var7 << 16 | var7 << 8 | var7;
                lk.f(param4 - -param0.field_r, var6_int + param0.field_v + param1, param0.field_q, var8);
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("fm.A(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Age:";
        field_b = new qr();
    }
}
