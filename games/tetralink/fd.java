/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends ll {
    static int field_I;
    int field_L;
    static int field_F;
    sk field_K;
    static int field_H;
    static String field_J;
    byte[] field_G;

    final static al g(int param0) {
        if (param0 == -1) {
          if (null == pg.field_d) {
            pg.field_d = new al(dh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, dh.field_d.field_N, -1, 2147483647, true);
            return pg.field_d;
          } else {
            return pg.field_d;
          }
        } else {
          fd.h(43);
          if (null != pg.field_d) {
            return pg.field_d;
          } else {
            pg.field_d = new al(dh.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, dh.field_d.field_N, -1, 2147483647, true);
            return pg.field_d;
          }
        }
    }

    public static void h(int param0) {
        if (param0 != -1) {
            return;
        }
        field_J = null;
    }

    final static void a(int param0, int param1, v param2) {
        bc var3 = null;
        try {
            var3 = nd.field_Lb;
            var3.f(7, (byte) -92);
            int var4 = 76 % ((12 - param0) / 62);
            var3.a(param2.field_n, false);
            var3.a(param2.field_q, false);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "fd.M(" + param0 + ',' + 7 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static kh[] a(boolean param0, int param1, int param2, ah param3) {
        RuntimeException var4 = null;
        kh[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh[] stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (ia.a(param1, param3, param2, -93)) {
              field_J = null;
              stackOut_3_0 = e.a((byte) 123);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fd.K(").append(false).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, byte param1) {
        if (param1 <= 72) {
            return true;
        }
        if (param0 < 48) {
            return false;
        }
        if (param0 > 57) {
            return false;
        }
        return true;
    }

    final static boolean a(int param0, byte param1) {
        if (!qb.a(param0, (byte) 114)) {
            return false;
        }
        if (param0 == -2) {
            return false;
        }
        return true;
    }

    final int a(boolean param0) {
        if (!param0) {
          if (((fd) this).field_v) {
            return 0;
          } else {
            return 100;
          }
        } else {
          ((fd) this).field_G = null;
          if (((fd) this).field_v) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    fd() {
    }

    final byte[] c(boolean param0) {
        if (param0) {
          if (((fd) this).field_v) {
            throw new RuntimeException();
          } else {
            return ((fd) this).field_G;
          }
        } else {
          al discarded$5 = fd.g(-4);
          if (((fd) this).field_v) {
            throw new RuntimeException();
          } else {
            return ((fd) this).field_G;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 0;
    }
}
