/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends mo {
    static ff field_h;
    static int field_j;
    int[] field_k;
    boolean[] field_i;
    static int field_f;
    static String field_g;
    static int field_l;

    final void a(int param0, int param1, int param2) {
        if (((wr) this).field_i[param0]) {
            return;
        }
        if (param2 == 0) {
            // if_icmpne L264
            // if_icmple L264
            ((wr) this).field_k[param0] = ((wr) this).field_k[param0] + 1;
        } else {
            if ((param2 ^ -1) == -2) {
                if (-1 + ws.field_b.length > ((wr) this).field_k[param0]) {
                    ((wr) this).field_k[param0] = ((wr) this).field_k[param0] + 1;
                }
            }
        }
        if (param1 != 1) {
            return;
        }
        if (!((param2 ^ -1) != -3)) {
            ((wr) this).field_i[param0] = true;
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            return;
        }
        field_g = null;
    }

    final static int a(int param0, ml param1, int param2, int param3, int param4, int param5) {
        int var6 = param1.l(param5, 59);
        if (var6 == -1) {
            return -1 >= param3 ? 0 : param1.l(param3, 59);
        }
        if (-2 != (var6 ^ -1)) {
            throw new IllegalStateException();
        }
        return param2 + param1.l(param0, 59);
    }

    final void c(ml param0, int param1) {
        ((wr) this).field_k[0] = param0.l(3, 59);
        if (param1 != 2) {
            Object var4 = null;
            wr.a((java.awt.Canvas) null, 103);
        }
        ((wr) this).field_k[1] = param0.l(3, 59);
        ((wr) this).field_i[0] = mu.a(param0, (byte) -39);
        ((wr) this).field_i[1] = mu.a(param0, (byte) -39);
    }

    final static String[] a(String param0, int param1, char param2) {
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = (CharSequence) (Object) param0;
        int var3 = wn.a(param2, param1 + -2, var9);
        if (param1 != 2) {
            field_f = 25;
        }
        String[] var4 = new String[1 + var3];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param2 != param0.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param0.substring(var6, var8);
            var6 = 1 + var8;
        }
        var4[var3] = param0.substring(var6);
        return var4;
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 76 / ((param0 - 57) / 37);
            if (!((wr) this).field_i[0]) {
              break L1;
            } else {
              if (!((wr) this).field_i[1]) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    public final String toString() {
        return "AgentFormation\tteam0=" + ((wr) this).field_k[0] + "/" + ((wr) this).field_i[0] + "\tteam1=" + ((wr) this).field_k[1] + "/" + ((wr) this).field_i[1];
    }

    final static void a(java.awt.Canvas param0, int param1) {
        if (!((vj.field_c ^ -1) != -12)) {
            dn.a(-127);
        }
        ik.a(hw.field_j, ts.field_b, m.field_h, (byte) 84);
        su.a(param1 ^ -23390, 0, 0, param0);
        if (param1 != -14142) {
            Object var3 = null;
            String[] discarded$0 = wr.a((String) null, -39, 'ￜ');
        }
    }

    final void a(byte param0, mo param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        wr var6 = (wr) (Object) param1;
        wr var3 = var6;
        for (var4 = 0; var4 < 2; var4++) {
            var6.field_k[var4] = var6.field_k[var4];
            var6.field_i[var4] = var6.field_i[var4];
        }
        if (param0 > -52) {
            wr.a(false);
        }
    }

    public wr() {
        ((wr) this).field_k = new int[2];
        ((wr) this).field_i = new boolean[2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 1;
        field_f = 0;
        field_h = new ff(6, 0, 4, 2);
        field_l = -1;
        field_g = "in the Semi-Finals";
    }
}
