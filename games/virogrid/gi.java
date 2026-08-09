/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static boolean field_a;
    static String field_b;
    static int field_c;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -18340) {
                break L1;
              } else {
                field_c = 105;
                break L1;
              }
            }
            var4_int = param0.length();
            param0.setLength(param2);
            var5 = var4_int;
            L2: while (true) {
              if (param2 <= var5) {
                stackIn_7_0 = (StringBuilder) (param0);
                break L0;
              } else {
                param0.setCharAt(var5, param3);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("gi.C(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -1) {
            StringBuilder var2 = (StringBuilder) null;
            gi.a((StringBuilder) null, -34, -45, '￰');
        }
    }

    final static pe a(ml param0, int param1, int param2) {
        RuntimeException var3 = null;
        pe stackIn_2_0 = null;
        pe stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 100) {
              stackIn_4_0 = tm.a(jh.a(param0, 100, param2), param1 + -172);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pe) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gi.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static byte[] a(Object param0, boolean param1, byte param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        wh var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              if (!(param0 instanceof byte[])) {
                if (!(param0 instanceof wh)) {
                  if (param2 < -123) {
                    throw new IllegalArgumentException();
                  } else {
                    stackIn_14_0 = (byte[]) null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  var4 = (wh) (param0);
                  stackIn_11_0 = var4.b(94);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                var3 = (byte[]) (param0);
                if (!param1) {
                  stackIn_8_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_6_0 = va.a(var3, 0);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
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
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("gi.D(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L1;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    static {
        field_a = true;
        field_b = "<%0> must play 1 more rated game before playing with the current options.";
    }
}
