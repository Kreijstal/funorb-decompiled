/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends nt {
    private int field_z;
    private int field_s;
    static String field_x;
    private int field_t;
    static int[] field_y;
    static pl field_v;
    private int field_u;
    static ns field_w;

    final static void f() {
        ct var1 = null;
        byte[] var3 = null;
        ks var1_ref = null;
        byte[] var4 = null;
        if (null == pd.field_n) {
            var1 = new ct();
            var3 = var1.a(128, 128, false, 16);
            int discarded$0 = 0;
            pd.field_n = aj.a((byte) -125, var3);
        }
        if (!(mk.field_d != null)) {
            var1_ref = new ks();
            var4 = var1_ref.b(1, 128, 128, 16);
            int discarded$1 = 0;
            mk.field_d = aj.a((byte) -120, var4);
        }
    }

    public static void e(int param0) {
        field_x = null;
        field_y = null;
        field_w = null;
        field_v = null;
        int var1 = -34 % ((param0 - -2) / 42);
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (param1 <= -121) {
                break L1;
              } else {
                boolean discarded$2 = ((as) this).a(-59);
                break L1;
              }
            }
            L2: {
              if (0 != ((as) this).field_t) {
                im.field_a.a((float)(((as) this).field_k >> 8), (float)(((as) this).field_o >> 8), 4096, 0, 0, (((as) this).field_p * (128 / ((as) this).field_s) << 24) + ((as) this).field_q, 1);
                break L2;
              } else {
                uc.field_a.a((float)(((as) this).field_k >> 8), (float)(((as) this).field_o >> 8), 1024, 0, 0, (((as) this).field_p * (128 / ((as) this).field_s) << 24) + ((as) this).field_q, 1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("as.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    as(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        ((as) this).field_z = param5;
        ((as) this).field_t = param6;
        ((as) this).field_s = param0;
        ((as) this).field_u = param4;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (ce.field_o == null) {
                break L1;
              } else {
                ce.field_o.field_B.a(param1, false);
                break L1;
              }
            }
            L2: {
              if (ro.field_a == null) {
                break L2;
              } else {
                ro.field_a.field_E.a(param1, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("as.E(").append(256).append(',');
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((as) this).field_s > ((as) this).field_p) {
            ((as) this).field_k = ((as) this).field_k + ((as) this).field_u;
            ((as) this).field_o = ((as) this).field_o + ((as) this).field_z;
            ((as) this).field_u = ((as) this).field_u * 251 / 285;
            ((as) this).field_z = ((as) this).field_z * 251 / 285;
            if (((as) this).field_u < 0) {
                ((as) this).field_u = ((as) this).field_u - 1;
            } else {
                ((as) this).field_u = ((as) this).field_u + 1;
            }
            if (((as) this).field_z < 0) {
                ((as) this).field_z = ((as) this).field_z - 1;
            } else {
                ((as) this).field_z = ((as) this).field_z + 1;
            }
        }
        if (param0 != -2567) {
            as.e(-88);
        }
        return super.a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_x = "lives: ";
        field_y = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_y[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) == 1) {
                  var0 = var0 >>> 1 ^ -306674912;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
