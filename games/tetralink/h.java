/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static oh field_c;
    static int field_b;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        if (param0 > -38) {
            field_c = (oh) null;
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
        String stackIn_5_0 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if ((var2_int ^ -1) >= -21) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            if (param1 == 56) {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              var4 = 0;
              L2: while (true) {
                if (var2_int <= var4) {
                  stackIn_22_0 = new String(var8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 < 65) {
                        break L4;
                      } else {
                        if (var5 > 90) {
                          break L4;
                        } else {
                          var3[var4] = (char)(-65 + (var5 - -97));
                          break L3;
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
                        if (var5 < 48) {
                          break L7;
                        } else {
                          if (var5 > 57) {
                            break L7;
                          } else {
                            break L5;
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
              stackIn_5_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("h.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_22_0;
        }
    }

    final static oh[] a(int param0, int param1, boolean param2, ah param3) {
        RuntimeException var4 = null;
        oh[] stackIn_5_0 = null;
        oh[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ia.a(param1, param3, param0, -63)) {
              if (!param2) {
                stackIn_7_0 = ci.d(-1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (oh[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("h.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(byte param0, boolean param1) {
        oj.field_a.a(param1, 256);
        int var3 = 72 % ((param0 - 58) / 42);
        lb var2 = bk.field_e;
        if (!(var2 == null)) {
            var2.a(oj.field_a.field_z, oj.field_a.field_eb, -23452);
        }
    }

    static {
    }
}
