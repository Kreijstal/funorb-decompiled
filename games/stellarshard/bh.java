/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static long field_c;
    private String field_b;
    static pf field_a;

    final static boolean a(int param0, char param1) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            bh.a(98, '<');
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static String b(byte param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = stellarshard.field_B;
        String var6 = "(" + ld.field_E + " " + t.field_e + " " + ig.field_y + ") " + ja.field_t;
        String var1 = var6;
        if (param0 >= -94) {
            bh.a(68, '￑');
        }
        if (-1 > (ue.field_b ^ -1)) {
            var1 = var6 + ":";
            for (var2 = 0; var2 < ue.field_b; var2++) {
                var7 = var1 + ' ';
                var3 = ae.field_N.field_r[var2] & 255;
                var4 = var3 >> -769738108;
                var3 = var3 & 15;
                if (-11 < (var4 ^ -1)) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                if (var3 >= 10) {
                    var3 += 55;
                } else {
                    var3 += 48;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 5 / ((-61 - param0) / 44);
            stackIn_1_0 = this.field_b.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("bh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 103 / ((param0 - -26) / 44);
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
            if (param1 != 73) {
                field_a = (pf) null;
            }
            b.a(this.field_b, (byte) 38, 31536000L, "jagex-last-login-method", param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bh(String param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "bh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
