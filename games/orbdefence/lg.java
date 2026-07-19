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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              og.field_n[0] = tl.field_f.nextInt();
              og.field_n[1] = tl.field_f.nextInt();
              og.field_n[param0] = (int)tg.field_a;
              og.field_n[2] = (int)(tg.field_a >> 856570144);
              pg.field_c.field_i = 0;
              pg.field_c.b(og.field_n[0], -1);
              pg.field_c.b(og.field_n[1], -1);
              pg.field_c.b(og.field_n[2], -1);
              pg.field_c.b(og.field_n[3], -1);
              kb.a(pg.field_c, false);
              pg.field_c.b((byte) -60, param1);
              param2.a(pg.field_c, 27557);
              uk.field_b.field_i = 0;
              if (param3) {
                uk.field_b.a(18, -55);
                break L1;
              } else {
                uk.field_b.a(16, -10);
                if (!OrbDefence.field_D) {
                  break L1;
                } else {
                  uk.field_b.a(18, -55);
                  break L1;
                }
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
            cg.a(uk.field_b, pc.field_W, 0, nc.field_ab, pg.field_c);
            uk.field_b.d(uk.field_b.field_i - var5_int, -2);
            bh.a(-1, param0 + -4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("lg.E(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static dc a(int param0, boolean param1) {
        dc var2 = new dc();
        mj.field_m.a(-125, var2);
        if (param1) {
            return (dc) null;
        }
        tg.a(-87, param0);
        return var2;
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -14 / ((param0 - 40) / 62);
        field_b = null;
    }

    final static void a(int param0, int param1) {
        se var2 = uk.field_b;
        var2.i(param0, -114);
        var2.a(1, -55);
        var2.a(0, -32);
        int var3 = 56 % ((-11 - param1) / 56);
    }

    final static boolean a(byte param0) {
        if (param0 != -2) {
            return false;
        }
        return ed.field_b.a(param0 + 2);
    }

    static {
        field_a = 0;
    }
}
