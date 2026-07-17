/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static int[][] field_a;
    static int field_d;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static int field_i;
    static int field_b;
    static volatile int field_g;
    static int field_h;

    final static void a(byte param0, ka[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 > 0) {
                break L1;
              } else {
                field_i = 2;
                break L1;
              }
            }
            L2: while (true) {
              if (param1.length <= var2_int) {
                break L0;
              } else {
                param1[var2_int].h();
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("qb.D(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var7 = param3 % 32 - 32 * param0 / 256;
          var8 = -(param3 / 32) + param4;
          var9 = -var7 + 32 * var8;
          var10 = 328;
          if (var9 >= 0) {
            var11 = 1;
            break L0;
          } else {
            var11 = -1;
            break L0;
          }
        }
        L1: {
          var9 = var9 * var11;
          if (var9 <= 1024) {
            break L1;
          } else {
            if (var9 < 2048) {
              var11 = -var11;
              break L1;
            } else {
              break L1;
            }
          }
        }
        if (2048 <= var9) {
          L2: {
            var9 -= 2048;
            if (var9 <= 1024) {
              break L2;
            } else {
              var11 = -var11;
              break L2;
            }
          }
          var12 = 320 + (fj.a(1870096848, wi.field_a[var9], var10 << 16) >> 16) * var11;
          var13 = param5 * 64 / 256 + (param1 * 64 + -param2);
          dl.field_n[1] = var12;
          dl.field_n[0] = var12;
          dl.field_n[2] = var13;
          return;
        } else {
          var12 = 320 + (fj.a(1870096848, wi.field_a[var9], var10 << 16) >> 16) * var11;
          var13 = param5 * 64 / 256 + (param1 * 64 + -param2);
          dl.field_n[1] = var12;
          dl.field_n[0] = var12;
          dl.field_n[2] = var13;
          return;
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (param1) {
          if (param0 >= 48) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          qb.a(-29);
          if (param0 >= 48) {
            if (param0 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 2316) {
          boolean discarded$2 = qb.a('', false);
          field_a = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "That name is not available";
        field_d = 0;
        field_a = new int[][]{new int[2], new int[2], new int[2]};
        field_i = -1;
        field_g = -1;
        field_h = -1;
        field_b = 200;
        field_e = "Retry";
    }
}
