/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static long field_c;
    private String field_b;
    static pf field_a;

    final static boolean a(int param0, char param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$2 = bh.a(98, '<');
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 < 48) {
              break L2;
            } else {
              if (param1 > 57) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static String b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = stellarshard.field_B;
        String var1 = "(" + ld.field_E + " " + t.field_e + " " + ig.field_y + ") " + ja.field_t;
        if (param0 >= -94) {
            boolean discarded$0 = bh.a(68, '￑');
        }
        if (ue.field_b > 0) {
            var1 = var1 + ":";
            for (var2 = 0; var2 < ue.field_b; var2++) {
                var1 = var1 + ' ';
                var3 = ae.field_N.field_r[var2] & 255;
                var4 = var3 >> 4;
                var3 = var3 & 15;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var1 = var1 + (char)var4;
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = 5 / ((-61 - param0) / 44);
            stackOut_0_0 = ((bh) this).field_b.equals((Object) (Object) param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("bh.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a() {
        field_a = null;
        int var1 = -51;
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
            if (param1 != 73) {
                field_a = null;
            }
            b.a(((bh) this).field_b, (byte) 38, 31536000L, "jagex-last-login-method", param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "bh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bh(String param0) {
        try {
            ((bh) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
