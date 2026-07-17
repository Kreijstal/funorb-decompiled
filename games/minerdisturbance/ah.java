/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static gh field_a;
    static int field_h;
    static int field_e;
    static ta field_g;
    static int field_b;
    static int field_f;
    static ea[] field_c;
    static ea field_d;
    static boolean field_i;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
    }

    final static long a(int param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        long stackOut_2_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = MinerDisturbance.field_ab;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            if (param0 == -97) {
              L1: while (true) {
                L2: {
                  if (var5 >= var4) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        var2_long = var2_long * 37L;
                        var6 = param1.charAt(var5);
                        if (var6 < 65) {
                          break L4;
                        } else {
                          if (var6 > 90) {
                            break L4;
                          } else {
                            var2_long = var2_long + (long)(var6 + -64);
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (var6 < 97) {
                          break L5;
                        } else {
                          if (var6 > 122) {
                            break L5;
                          } else {
                            var2_long = var2_long + (long)(-97 + (1 + var6));
                            break L3;
                          }
                        }
                      }
                      if (var6 < 48) {
                        break L3;
                      } else {
                        if (var6 > 57) {
                          break L3;
                        } else {
                          var2_long = var2_long + (long)(27 + var6 - 48);
                          break L3;
                        }
                      }
                    }
                    if (var2_long >= 177917621779460413L) {
                      break L2;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
                L6: while (true) {
                  L7: {
                    if (0L != var2_long % 37L) {
                      break L7;
                    } else {
                      if (var2_long == 0L) {
                        break L7;
                      } else {
                        var2_long = var2_long / 37L;
                        continue L6;
                      }
                    }
                  }
                  stackOut_20_0 = var2_long;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = -72L;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ah.B(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20;
        field_a = new gh();
        field_e = -1;
        field_g = new ta();
    }
}
