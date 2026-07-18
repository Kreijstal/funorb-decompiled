/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jaa implements noa {
    private int field_g;
    private int field_c;
    private int field_d;
    private int field_h;
    static apa field_b;
    private boolean field_e;
    private int field_f;
    static String field_a;

    final int a(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (param0 != -43946608) {
          L0: {
            var3 = null;
            ((jaa) this).a(8, (kh) null);
            var2 = ((jaa) this).field_d | (((jaa) this).field_g << 16 | ((jaa) this).field_f << 8);
            if (((jaa) this).field_e) {
              var2 = ((jaa) this).field_h << 24 | var2;
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = ((jaa) this).field_d | (((jaa) this).field_g << 16 | ((jaa) this).field_f << 8);
            if (((jaa) this).field_e) {
              var2 = ((jaa) this).field_h << 24 | var2;
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    private final void a(int param0, int param1, kh param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var4_int = 1 << 8 + -((jaa) this).field_c;
              var5 = -1 + var4_int;
              ((jaa) this).field_g = var4_int * param2.b((byte) 44, ((jaa) this).field_c);
              if (0 >= ((jaa) this).field_g) {
                break L1;
              } else {
                ((jaa) this).field_g = ((jaa) this).field_g + var5;
                break L1;
              }
            }
            L2: {
              ((jaa) this).field_f = var4_int * param2.b((byte) 44, ((jaa) this).field_c);
              if (((jaa) this).field_f <= 0) {
                break L2;
              } else {
                ((jaa) this).field_f = ((jaa) this).field_f + var5;
                break L2;
              }
            }
            L3: {
              ((jaa) this).field_d = param2.b((byte) 44, ((jaa) this).field_c) * var4_int;
              if (0 < ((jaa) this).field_d) {
                ((jaa) this).field_d = ((jaa) this).field_d + var5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((jaa) this).field_e) {
                ((jaa) this).field_h = param2.b((byte) 44, ((jaa) this).field_c) * var4_int;
                break L4;
              } else {
                break L4;
              }
            }
            if (0 < ((jaa) this).field_h) {
              ((jaa) this).field_h = ((jaa) this).field_h + var5;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("jaa.E(").append(8).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    final void a(boolean param0, int param1) {
        ((jaa) this).field_g = param1 >> 16 ^ 255;
        ((jaa) this).field_d = 255 ^ param1;
        ((jaa) this).field_h = param1 >> 24 ^ 255;
        if (param0) {
          return;
        } else {
          ((jaa) this).field_f = (65398 ^ param1) >> 8;
          return;
        }
    }

    jaa(boolean param0, int param1) {
        ((jaa) this).field_c = param1;
        ((jaa) this).field_e = param0 ? true : false;
    }

    final void a(int param0, kh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var3_int = 1 << -((jaa) this).field_c + 8;
            var4 = var3_int + -1;
            param1.a((byte) -128, iia.d(param0, -var4 + ((jaa) this).field_g, param0 ^ 2) / var3_int, ((jaa) this).field_c);
            param1.a((byte) 61, iia.d(0, -var4 + ((jaa) this).field_f, 2) / var3_int, ((jaa) this).field_c);
            param1.a((byte) -128, iia.d(0, -var4 + ((jaa) this).field_d, 2) / var3_int, ((jaa) this).field_c);
            if (((jaa) this).field_e) {
              param1.a((byte) -127, iia.d(0, ((jaa) this).field_h - var4, 2) / var3_int, ((jaa) this).field_c);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 > 24) {
              stackOut_3_0 = nia.a(param1, 0, param1.length, 255);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("jaa.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    jaa(boolean param0, int param1, int param2, kh param3) {
        try {
            ((jaa) this).field_e = param0 ? true : false;
            ((jaa) this).field_c = param1;
            this.a(8, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "jaa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Send private message";
    }
}
