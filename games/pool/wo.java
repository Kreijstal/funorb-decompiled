/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo {
    static String[] field_b;
    static boolean field_c;
    private rg field_d;
    private rg field_e;
    static of field_f;
    static int field_a;
    static nl field_g;

    final rg a(byte param0) {
        rg var2 = null;
        int var3 = 0;
        var3 = -47 % ((param0 - 25) / 39);
        var2 = ((wo) this).field_d.field_q;
        if (((wo) this).field_d == var2) {
          ((wo) this).field_e = null;
          return null;
        } else {
          ((wo) this).field_e = var2.field_q;
          return var2;
        }
    }

    final int b(int param0) {
        int var4 = Pool.field_O;
        int var2 = param0;
        rg var3 = ((wo) this).field_d.field_q;
        while (((wo) this).field_d != var3) {
            var2++;
            var3 = var3.field_q;
        }
        return var2;
    }

    final void a(rg param0, boolean param1) {
        try {
            if (param1) {
                ((wo) this).field_e = null;
            }
            if (!(param0.field_n == null)) {
                param0.a(param1);
            }
            param0.field_q = ((wo) this).field_d;
            param0.field_n = ((wo) this).field_d.field_n;
            param0.field_n.field_q = param0;
            param0.field_q.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "wo.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, di param1) {
        RuntimeException var2 = null;
        vh var3 = null;
        vh var5 = null;
        vh var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            oi.field_o = pf.a("basic", (byte) 54, "display_name_changed", param1);
            aj.field_Mb = new ao(0L, em.field_J, wg.field_Rb, ge.field_m);
            cp.field_c = new ao(0L, em.field_J, ag.field_d, tp.field_f);
            ud.field_J = new vh(0L, (vh) null);
            ba.field_sb = new vh(0L, uo.field_Lb);
            ba.field_sb.field_Fb = param0;
            qk.field_e = new vh(0L, lf.field_d, jh.field_g);
            mb.field_f = new vh(0L, sd.field_Q, f.field_d);
            rc.field_b = new vh(0L, ei.field_A);
            ud.field_J.a(param0 + -103, ba.field_sb);
            ud.field_J.a(92, qk.field_e);
            ud.field_J.a(14, mb.field_f);
            ud.field_J.a(127, (vh) (Object) aj.field_Mb);
            ud.field_J.a(param0 ^ -107, rc.field_b);
            aj.field_Mb.field_Sb.field_Sb.a((byte) -87, uo.field_Lb);
            aj.field_Mb.field_Sb.field_Sb.field_cb = 1;
            var5 = aj.field_Mb.field_Sb.field_Sb;
            var6 = var5;
            var6.field_Fb = 1;
            cp.field_c.field_Sb.field_Sb.a((byte) -87, uo.field_Lb);
            var3 = cp.field_c.field_Sb.field_Sb;
            cp.field_c.field_Sb.field_Sb.field_cb = 1;
            var3.field_Fb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("wo.D(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    final rg a(int param0) {
        rg var2 = null;
        var2 = ((wo) this).field_d.field_q;
        if (((wo) this).field_d != var2) {
          var2.a(false);
          if (param0 != 0) {
            rg discarded$2 = ((wo) this).a((byte) -4);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public wo() {
        ((wo) this).field_d = new rg();
        ((wo) this).field_d.field_q = ((wo) this).field_d;
        ((wo) this).field_d.field_n = ((wo) this).field_d;
    }

    final rg b(byte param0) {
        if (param0 > -66) {
            return null;
        }
        rg var2 = ((wo) this).field_e;
        if (!(var2 != ((wo) this).field_d)) {
            ((wo) this).field_e = null;
            return null;
        }
        ((wo) this).field_e = var2.field_q;
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Awesome shot!", "Pure skill!"};
        field_a = 5;
        field_g = new nl();
    }
}
