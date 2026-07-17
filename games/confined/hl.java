/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements de {
    static String[] field_h;
    static String field_b;
    private ma[] field_e;
    private mn field_f;
    private mi field_a;
    private int field_g;
    private int field_c;
    private int field_d;

    public final int[] a(float param0, int param1, int param2) {
        ma var8 = null;
        int var4 = -107 / ((param1 - -35) / 50);
        ma var5 = ((hl) this).field_e[param2];
        ma var7 = var5;
        var7 = var5;
        if (var5 == null) {
            return null;
        }
        if (var5.field_t != null) {
            if (!(param0 != var5.field_o)) {
                ((hl) this).field_f.a((rk) (Object) var5, -1);
                return var5.field_t;
            }
            var5.a(true);
            var5.a();
            ((hl) this).field_c = ((hl) this).field_c + 1;
        }
        if (!var5.a(param0, ((hl) this).field_g, ((hl) this).field_a)) {
            return null;
        }
        if (((hl) this).field_c == 0) {
            var8 = (ma) (Object) ((hl) this).field_f.b((byte) 101);
            var8.a();
            ((hl) this).field_f.a((rk) (Object) var5, -1);
            return var5.field_t;
        }
        ((hl) this).field_c = ((hl) this).field_c - 1;
        ((hl) this).field_f.a((rk) (Object) var5, -1);
        return var5.field_t;
    }

    final static void a(int param0) {
        g var1 = (g) (Object) fc.field_a.a(-115);
        if (!(var1 != null)) {
            dc.d(120);
            return;
        }
        hb var2 = e.field_c;
        int discarded$0 = var2.f((byte) 72);
        int discarded$1 = var2.f((byte) 40);
        int discarded$2 = var2.f((byte) 100);
        int discarded$3 = var2.f((byte) 80);
        var1.a(true);
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 1) {
            ((hl) this).field_d = -103;
            return true;
        }
        return true;
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == tf.field_p) {
          return;
        } else {
          var1 = (Object) (Object) tf.field_p;
          synchronized (var1) {
            L0: {
              tf.field_p = null;
              break L0;
            }
          }
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 27) {
            field_b = null;
            return tg.field_H > 250 ? true : false;
        }
        return tg.field_H > 250 ? true : false;
    }

    public final boolean a(boolean param0, int param1) {
        if (param0) {
            boolean discarded$10 = ((hl) this).a(51, -31);
            return -65 == ((hl) this).field_g ? true : false;
        }
        return -65 == ((hl) this).field_g ? true : false;
    }

    public final int b(int param0, int param1) {
        if (param0 != 0) {
            ((hl) this).field_a = null;
            if (((hl) this).field_e[param1] != null) {
                return ((hl) this).field_e[param1].field_s;
            }
            return 0;
        }
        if (((hl) this).field_e[param1] != null) {
            return ((hl) this).field_e[param1].field_s;
        }
        return 0;
    }

    public final int a(int param0, byte param1) {
        if (param1 != -85) {
            return 80;
        }
        if (((hl) this).field_e[param0].field_r) {
            return 0;
        }
        return 1;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_b = null;
            field_h = null;
            field_b = null;
            return;
        }
        field_h = null;
        field_b = null;
    }

    hl(mi param0, mi param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        kg var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((hl) this).field_f = new mn();
        ((hl) this).field_g = 128;
        ((hl) this).field_c = 0;
        try {
          L0: {
            ((hl) this).field_a = param1;
            ((hl) this).field_d = param2;
            ((hl) this).field_c = ((hl) this).field_d;
            ((hl) this).field_g = param3;
            var14 = param0.a((byte) -65, 0);
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var5 = var10;
            var6 = var14.length;
            ((hl) this).field_e = new ma[param0.d(0, (byte) -73)];
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = new kg(param0.a((byte) -2, 0, var14[var7]));
                ((hl) this).field_e[var14[var7]] = new ma(var8);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("hl.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This page will be unlocked when you get the following achievement:";
        field_h = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
