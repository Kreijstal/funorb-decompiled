/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hca {
    private int field_d;
    private String field_a;
    sna field_c;
    private int field_b;

    final static kv a(String param0, vr param1, int param2, String param3) {
        int var5 = 18 % ((param2 - 27) / 43);
        int var4 = param1.a(param0, false);
        int var6 = param1.a((byte) 6, var4, param3);
        return jha.a(param1, (byte) 4, var4, var6);
    }

    final void a(byte param0) {
        if (param0 != 19) {
          return;
        } else {
          hp.a(((hca) this).field_c.field_sb, ((hca) this).field_c.field_kb, (byte) 102, ((hca) this).field_c.field_p, uq.field_zb, ((hca) this).field_c.field_rb);
          int discarded$2 = g.field_g.a(((hca) this).field_a, ((hca) this).field_d, ((hca) this).field_b, 300, 200, 16777215, -1, 0, 0, 14);
          return;
        }
    }

    final void a(int param0) {
        ((hca) this).field_c.a(19842, true);
        if (!(((hca) this).field_c.field_R != 1)) {
            uca.a(34, (byte) -46);
        }
        int var2 = 74 % ((82 - param0) / 32);
    }

    final static ee[] b(int param0) {
        ee[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        var1 = new ee[ok.field_vb];
        var2 = 0;
        L0: while (true) {
          if (ok.field_vb <= var2) {
            if (param0 != 200) {
              return null;
            } else {
              al.b(-18073);
              return var1;
            }
          } else {
            var1[var2] = new ee(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], baa.field_P[var2], hk.field_f);
            var2++;
            continue L0;
          }
        }
    }

    hca(int param0, int param1, String param2) {
        ((hca) this).field_a = param2;
        ((hca) this).field_d = param0;
        ((hca) this).field_b = param1;
        ((hca) this).field_c = new sna();
        ((hca) this).field_c.field_kb = ((hca) this).field_d - 15;
        ((hca) this).field_c.field_rb = -10 + ((hca) this).field_b;
        ((hca) this).field_c.field_sb = 30 + g.field_g.c(((hca) this).field_a, 300);
        ((hca) this).field_c.field_p = g.field_g.a(((hca) this).field_a, 300, 14) + 20;
    }

    static {
    }
}
