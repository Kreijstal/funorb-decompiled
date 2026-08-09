/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static cr field_a;
    static char[] field_b;
    static String field_c;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 91) {
            uc.a(12);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        ie.b(20983, param1);
        if (param0 >= 97) {
            return;
        }
        field_a = (cr) null;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_a = (cr) null;
                break L1;
              }
            }
            if (!param1) {
              stackIn_6_0 = mf.field_c.c(param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = gb.field_b.c(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("uc.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static void a(byte param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              oo.c();
              bl.field_r = new int[260];
              hi.field_j = 11;
              if (param0 == 73) {
                break L1;
              } else {
                uc.a((byte) 69, true);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (-257 >= (var1_int ^ -1)) {
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (var5 >= bl.field_r.length) {
                    break L0;
                  } else {
                    bl.field_r[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                bl.field_r[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "uc.B(" + param0 + ')');
        }
    }

    static {
        field_b = new char[]{(char)91, (char)93, (char)35};
        field_c = "Password: ";
    }
}
