/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static int field_a;
    static ki field_c;
    static String field_b;

    final static void a(int param0, int param1, sh param2, boolean param3, boolean param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              og.field_n[0] = tl.field_f.nextInt();
              og.field_n[1] = tl.field_f.nextInt();
              og.field_n[3] = (int)tg.field_a;
              og.field_n[2] = (int)(tg.field_a >> 32);
              pg.field_c.field_i = 0;
              pg.field_c.b(og.field_n[0], -1);
              pg.field_c.b(og.field_n[1], -1);
              pg.field_c.b(og.field_n[2], -1);
              pg.field_c.b(og.field_n[3], -1);
              int discarded$1 = 0;
              kb.a(pg.field_c);
              pg.field_c.b((byte) -60, param1);
              param2.a(pg.field_c, 27557);
              uk.field_b.field_i = 0;
              if (param3) {
                uk.field_b.a(18, -55);
                break L1;
              } else {
                uk.field_b.a(16, -10);
                break L1;
              }
            }
            L2: {
              uk.field_b.field_i = uk.field_b.field_i + 2;
              var5_int = uk.field_b.field_i;
              uk.field_b.b(j.field_e, -1);
              uk.field_b.a(el.field_G, -16943);
              var6 = 0;
              if (!jc.field_b) {
                break L2;
              } else {
                var6 = var6 | 1;
                break L2;
              }
            }
            L3: {
              if (!mg.field_g) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (param4) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (ug.field_r == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              uk.field_b.a(var6, -37);
              var7 = tc.a((byte) -41, uj.b((byte) -120));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              uk.field_b.a(var7, -6528);
              if (null == ug.field_r) {
                break L7;
              } else {
                uk.field_b.a(false, ug.field_r);
                break L7;
              }
            }
            cg.a((mg) (Object) uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
            uk.field_b.d(uk.field_b.field_i - var5_int, -2);
            bh.a(-1, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("lg.E(").append(3).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static dc a(int param0, boolean param1) {
        dc var2 = new dc();
        mj.field_m.a(-125, (ca) (Object) var2);
        tg.a(-87, 4);
        return var2;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -14;
        field_b = null;
    }

    final static void a(int param0, int param1) {
        se var2 = uk.field_b;
        var2.i(param0, -114);
        var2.a(1, -55);
        var2.a(0, -32);
        int var3 = 0;
    }

    final static boolean a() {
        return ed.field_b.a(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
