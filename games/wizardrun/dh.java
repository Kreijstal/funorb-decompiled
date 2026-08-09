/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static int field_b;
    static String field_c;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
            field_b = 47;
        }
        field_c = null;
    }

    final static ae a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ae var7 = null;
        int var8 = 0;
        ae stackIn_4_0 = null;
        ae stackIn_7_0 = null;
        ae stackIn_10_0 = null;
        ae stackIn_18_0 = null;
        ae stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = ok.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 >= var2_int) {
                var3 = tj.a(param1, -22710, '.');
                if (var3.length >= 2) {
                  L1: {
                    if (param0 == -27602) {
                      break L1;
                    } else {
                      field_a = -52;
                      break L1;
                    }
                  }
                  var4 = var3;
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      stackIn_21_0 = u.b(var3[var3.length + -1], (byte) -125);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = he.a(param0 ^ -27522, var6);
                      if (var7 != null) {
                        stackIn_18_0 = (ae) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = ok.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = kj.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("dh.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    final static gb a(int param0, int param1, byte param2, kl param3, kl param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        gb stackIn_5_0 = null;
        gb stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (h.a(param1, param0, param4, -118)) {
              if (param2 <= -62) {
                stackIn_7_0 = dc.a(param3.a(param0, param1, 1), 0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (gb) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("dh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gb) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
            return true;
        }
        return null == ki.field_E ? jg.field_n : true;
    }

    static {
        field_a = 640;
        field_b = 0;
        field_c = null;
    }
}
