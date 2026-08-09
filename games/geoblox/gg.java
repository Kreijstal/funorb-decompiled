/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg {
    static String field_a;
    static String field_d;
    static String field_c;
    static int field_b;

    final static boolean a(byte param0, char param1) {
        int var2;
        int stackIn_7_0 = 0;
        var2 = 87 / ((param0 - 25) / 53);
        if (param1 != 160) {
          if (param1 != 32) {
            if (param1 != 95) {
              if (param1 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackIn_7_0 = 1;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 56) {
                break L1;
              } else {
                var4 = (byte[]) null;
                gg.a((byte[]) null, -123, -57);
                break L1;
              }
            }
            stackIn_3_0 = oe.a(param2, param0, -40, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gg.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        byte[] var2;
        if (param0 != 45) {
          var2 = (byte[]) null;
          gg.a((byte[]) null, 124, 46);
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -11455) {
              stackIn_4_0 = mj.a(0, param1.length, param1, (byte) 96);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("gg.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_b = 0;
        field_d = "Names should contain a maximum of 12 characters";
    }
}
