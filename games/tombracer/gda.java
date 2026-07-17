/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gda {
    static int field_b;
    static int field_a;
    static int field_c;
    static jpa[] field_d;

    abstract void b(int param0);

    public static void a(int param0) {
        field_d = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            var2 = k.field_A;
        }
        if (param1 != -20011) {
            int discarded$0 = gda.a(-61, -111);
        }
        if (param0 == 1) {
            var2 = nba.field_b;
        }
        if (param0 == 2) {
            var2 = caa.field_i;
        }
        return var2;
    }

    abstract void d(int param0);

    abstract void a(int param0, int param1, int param2);

    final static void a(cn param0, int param1) {
        qg[] var10 = null;
        int var3 = 0;
        qg var4 = null;
        g[] var5 = null;
        int var6 = 0;
        g var7 = null;
        byte[] var14 = null;
        int var9 = TombRacer.field_G ? 1 : 0;
        try {
            hga.a(true, param0.a("", (byte) 124, "roomdata.csv"));
            var10 = cm.field_a;
            for (var3 = 0; var3 < var10.length; var3++) {
                var4 = var10[var3];
                var5 = var4.field_c;
                for (var6 = 0; var6 < var5.length; var6++) {
                    var7 = var5[var6];
                    bt.field_b = bt.field_b + 1;
                    var14 = param0.a(var7.field_g, (byte) 127, var7.field_b);
                    var7.field_c = new kh(var14);
                    var7.field_c.h((byte) -38);
                    var7.field_e = m.a(-1, var7.field_c);
                    var7.field_c.i((byte) 98);
                }
                lva.a(var4.field_c, 0, -1 + var4.field_c.length, -1);
            }
            du.field_e = true;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gda.QA(" + (param0 != null ? "{...}" : "null") + 44 + 17572 + 41);
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        int var3 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        int stackIn_8_0 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var3 = -120 % ((param0 - 65) / 42);
          stackOut_0_0 = mpa.a(false, param1, param2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param2 & 262144) == 0) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            if (stackIn_3_0 | stackIn_3_1 != 0) {
              break L2;
            } else {
              if (!vua.e(param2, param1, 13650)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    abstract void a();

    abstract void c(int param0);

    final static roa a(boolean param0) {
        roa var1 = new roa();
        var1.field_f = new up(0, 5);
        var1.field_f.b(1, 9);
        var1.field_d = 0;
        var1.field_h = 25;
        var1.field_p = -1;
        var1.field_k = 150;
        var1.field_o = 25;
        var1.field_n = 655360;
        var1.field_b = 1;
        return var1;
    }

    static {
    }
}
