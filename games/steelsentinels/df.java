/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends fe {
    rc field_G;
    static String field_J;
    static boolean field_K;
    static boolean field_I;
    int field_H;
    byte[] field_L;

    final byte[] d(byte param0) {
        if (param0 < -49) {
          if (((df) this).field_z) {
            throw new RuntimeException();
          } else {
            return ((df) this).field_L;
          }
        } else {
          int discarded$5 = df.h(-48);
          if (((df) this).field_z) {
            throw new RuntimeException();
          } else {
            return ((df) this).field_L;
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (nj.field_Q < 10) {
                L2: {
                  var3_int = 0;
                  if (dd.field_e) {
                    dd.field_e = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                int discarded$11 = 118;
                kc.a(sa.b(), fi.a(true), var3_int != 0, 300, d.field_S);
                break L1;
              } else {
                if (!km.a(-124)) {
                  pb.b();
                  int discarded$12 = 320;
                  int discarded$13 = 240;
                  int discarded$14 = 17;
                  ff.a();
                  kg.a(0, 0, 28594, param1);
                  break L1;
                } else {
                  if (0 != uj.field_d) {
                    int discarded$15 = -28003;
                    en.a(param1);
                    break L1;
                  } else {
                    fa.a(false, (byte) 88, param2);
                    kg.a(0, 0, 28594, param1);
                    break L1;
                  }
                }
              }
            }
            var3_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("df.B(").append(-111).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final static int h(int param0) {
        int var1 = 68 % ((param0 - 3) / 63);
        return wi.field_y;
    }

    final static int a(int param0, int param1) {
        if (param1 < 0) {
          if (-65536 > param1) {
            return vn.field_m[134217728 / -param1] + -2048;
          } else {
            return -vn.field_m[-param1 >> 5];
          }
        } else {
          if (param1 <= 65536) {
            return vn.field_m[param1 >> 5];
          } else {
            return 2048 + -vn.field_m[134217728 / param1];
          }
        }
    }

    final int g(int param0) {
        if (param0 == 16) {
          if (((df) this).field_z) {
            return 0;
          } else {
            return 100;
          }
        } else {
          int discarded$6 = ((df) this).g(65);
          if (((df) this).field_z) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    public static void i() {
        field_J = null;
    }

    df() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = false;
        field_J = "You have <%0> unread messages!";
    }
}
