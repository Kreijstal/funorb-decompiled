/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends ka {
    static int field_w;
    static String field_v;
    static int field_t;
    static String field_x;
    private int field_s;
    private na field_u;

    public static void i(int param0) {
        field_x = null;
        int var1 = 85 % ((param0 - 44) / 60);
        field_v = null;
    }

    final int h(byte param0) {
        if (param0 != -9) {
          field_x = null;
          int fieldTemp$4 = ((ha) this).field_k;
          ((ha) this).field_k = ((ha) this).field_k + 1;
          return 255 & ((ha) this).field_r[fieldTemp$4] + -((ha) this).field_u.a(-609392408);
        } else {
          int fieldTemp$5 = ((ha) this).field_k;
          ((ha) this).field_k = ((ha) this).field_k + 1;
          return 255 & ((ha) this).field_r[fieldTemp$5] + -((ha) this).field_u.a(-609392408);
        }
    }

    final void a(byte[] param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((ha) this).field_u = null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param3 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((ha) this).field_k;
                ((ha) this).field_k = ((ha) this).field_k + 1;
                param0[param2 + var5_int] = (byte)(((ha) this).field_r[fieldTemp$5] + -((ha) this).field_u.a(-609392408));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("ha.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = ((ha) this).field_k;
        ((ha) this).field_k = ((ha) this).field_k + 1;
        ((ha) this).field_r[fieldTemp$0] = (byte)(((ha) this).field_u.a(param1 + -609393358) + param0);
        if (param1 != 950) {
            ((ha) this).f(-75, 25);
        }
    }

    final void a(int[] param0, int param1) {
        try {
            if (param1 != -1001) {
                field_w = -27;
            }
            ((ha) this).field_u = new na(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ha.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.math.BigInteger param0, ka param1, ka param2, int param3, java.math.BigInteger param4) {
        try {
            if (param3 >= -94) {
                int discarded$0 = ha.k(109);
            }
            int discarded$1 = 0;
            rl.a(-13791, param1, param0, param4, param2.field_r, param2.field_k);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ha.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static int k(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var2 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 == -1001) {
                break L1;
              } else {
                int discarded$2 = ha.k(28);
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (var1_int >= 1000) {
                stackOut_10_0 = -1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (null == hf.field_e[var1_int]) {
                  stackOut_7_0 = var1_int;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  var1_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "ha.F(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    final int e(int param0, int param1) {
        int var6 = stellarshard.field_B;
        int var3 = ((ha) this).field_s >> 3;
        int var4 = -(((ha) this).field_s & 7) + param1;
        ((ha) this).field_s = ((ha) this).field_s + param0;
        int var5 = 0;
        while (param0 > var4) {
            int incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((hd.field_d[var4] & ((ha) this).field_r[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 == var4) {
            var5 = var5 + (hd.field_d[var4] & ((ha) this).field_r[var3]);
        } else {
            var5 = var5 + (((ha) this).field_r[var3] >> var4 - param0 & hd.field_d[param0]);
        }
        return var5;
    }

    ha(byte[] param0) {
        super(param0);
    }

    final void g(byte param0) {
        int var2 = 47 % ((-50 - param0) / 57);
        ((ha) this).field_k = (((ha) this).field_s - -7) / 8;
    }

    ha(int param0) {
        super(param0);
    }

    final void j(int param0) {
        ((ha) this).field_s = param0 * ((ha) this).field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Phase shield";
        field_v = "Try again";
    }
}
