/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_b;
    static int[] field_d;
    static String field_a;
    static java.awt.Image field_e;
    static String[] field_c;

    final static ri a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_11_0 = null;
        ri stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ri stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                if (param0 == -58) {
                  stackOut_12_0 = n.field_b;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = null;
                  stackIn_11_0 = stackOut_10_0;
                  return (ri) (Object) stackIn_11_0;
                }
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("ik.A(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0;
    }

    final static void a(boolean param0, int param1) {
        tn.field_Ob = !param0 ? new i(ec.field_b, bk.field_M) : new i(ab.field_r, vc.field_c);
        hl.field_m = new kc(0L, (kc) null);
        hl.field_m.a((kc) (Object) tn.field_Ob.field_c, 89);
        int var2 = 34 / ((param1 - 24) / 48);
        hl.field_m.a(mo.field_o, 55);
        nl.field_Fb = new kc(0L, mf.field_d);
        gk.field_g = new kc(0L, (kc) null);
        nl.field_Fb.a(hf.field_t, 61);
        nl.field_Fb.a(gk.field_g, 89);
        gk.field_g.a(mj.field_s, 25);
        gk.field_g.a(gj.field_d, 43);
        io.a(125, param0);
    }

    final static void a(int param0, int param1) {
        ab var2 = he.field_e;
        var2.b((byte) -66, param0);
        var2.f(1, (byte) -127);
        var2.f(0, (byte) -44);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (mj.field_p < 6) {
            rk.field_O.c(-4207, -1);
        }
    }

    final static void a(byte param0) {
        se.field_H = new kc(0L, (kc) null);
        if (fc.field_a) {
            se.field_H.a(kg.field_c, 14);
        }
        se.field_H.a(mj.field_s, 39);
        aj.field_h = new i(lj.field_p, se.field_H);
        k.field_d = new kc(0L, (kc) null);
        k.field_d.a((kc) (Object) aj.field_h.field_c, 29);
        k.field_d.a(ii.field_b, 97);
        ao.a((byte) -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Gives you and your minions extra damage resistance";
        field_d = new int[8192];
    }
}
