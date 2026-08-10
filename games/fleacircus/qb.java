/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static int field_a;

    final static void a(int param0, byte param1, ql param2) {
        ih var5 = ud.field_b;
        var5.e(8, param0);
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        var5.a(-11, 1);
        var5.a(-11, param2.field_i);
        if (param1 < 43) {
            return;
        }
        try {
            var5.b(-24213, param2.field_m);
            var5.a(param2.field_r, (byte) -24);
            var5.a(param2.field_n, (byte) -120);
            var5.a(param2.field_p, (byte) -18);
            var5.a(param2.field_q, (byte) -60);
            var5.c(var4, -30532);
            var5.c((byte) -111, -var4 + var5.field_i);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "qb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_6_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            if (param1 < -13) {
              var4 = 0;
              L2: while (true) {
                if (var2_int <= var4) {
                  stackIn_24_0 = new String(var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 < 65) {
                        break L4;
                      } else {
                        if (var5 <= 90) {
                          var3[var4] = (char)(var5 + 32);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        if (var5 < 97) {
                          break L6;
                        } else {
                          if (var5 <= 122) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (48 > var5) {
                          break L7;
                        } else {
                          if (var5 <= 57) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3[var4] = (char)95;
                      break L3;
                    }
                    var3[var4] = (char)var5;
                    break L3;
                  }
                  var4++;
                  continue L2;
                }
              }
            } else {
              stackIn_6_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("qb.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_24_0;
        }
    }

    final static void a(int param0, int param1) {
        if (param1 < 90) {
            return;
        }
        na.field_f = 1000000000L / (long)param0;
    }

    static {
    }
}
