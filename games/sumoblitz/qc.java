/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    private int field_d;
    static bs field_e;
    static fs field_c;
    private boolean field_f;
    private int field_b;
    static int field_a;

    final static String a(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var4 = -114 % ((-29 - param1) / 39);
        var3 = qv.a(param2, 97, param0);
        if (var3 != null) {
          return var3;
        } else {
          var5 = 0;
          L0: while (true) {
            if (var5 < param0.length()) {
              if (!jl.a((byte) 110, param0.charAt(var5))) {
                return fu.field_F;
              } else {
                var5++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void a(ha param0, int param1) {
        String var11 = null;
        int var7 = 0;
        int var8 = 0;
        wo.a(hf.field_H, 160, 140, -16777216, 3, param0, 360, 170, 1, true);
        if (!(Sumoblitz.field_J.length <= ((qc) this).field_d)) {
            wo.a(up.field_c, Sumoblitz.field_J[((qc) this).field_d].a() + 6, 167, -16777216, 3, param0, Sumoblitz.field_J[((qc) this).field_d].c() + 6, 187, 1, true);
            Sumoblitz.field_J[((qc) this).field_d].a(170, 190);
        }
        int var3 = Sumoblitz.field_J.length > ((qc) this).field_d ? 380 : 320;
        int var4 = 200;
        int var5 = 160;
        String var9 = sr.field_j[((qc) this).field_d * 2];
        qv.field_k.a(var9, -11753985, -1, var4, var3, 0);
        uq.field_a.a(var9, -1, -1, var4, var3, 0);
        if (param1 != -4475) {
            return;
        }
        String var10 = sr.field_j[2 * ((qc) this).field_d - -1];
        var3 -= 10;
        int discarded$62 = gt.field_db.a(480, -11753985, 0, 20 + var5, -(var5 / 2) + var3, (int[]) null, (hr[]) null, var4 + 8, -1, 0, g.field_a.field_i, param1 + -4312, var10, (aa) null, 1, 0);
        int discarded$92 = bq.field_c.a(480, -1, 0, var5 + 20, -(var5 / 2) + var3, (int[]) null, (hr[]) null, var4 + 8, -1, 0, g.field_a.field_i, -8787, var10, (aa) null, 1, 0);
        if (((qc) this).field_b <= 0) {
            var4 += 115;
            var3 -= 50;
            var11 = ge.field_l;
            var7 = -((qc) this).field_b << -666450237;
            var8 = var7 % 510 <= 255 ? var7 % 255 : 510 + -(var7 % 255);
            qv.field_k.a(var11, 5023231 | var8 << 704582776, -1, var4, var3, 0);
            uq.field_a.a(var11, -1, -1, var4, var3, 0);
        }
    }

    final void b(int param0) {
        if (hk.field_c != 1) {
            // ifeq L35
        }
        if (((qc) this).field_b <= 0) {
            ((qc) this).a(-127);
        }
        if (param0 != 0) {
            field_a = -33;
        }
        ((qc) this).field_b = ((qc) this).field_b - 1;
    }

    final boolean a(byte param0) {
        if (param0 != 91) {
            boolean discarded$0 = ((qc) this).a((byte) -1);
        }
        return ((qc) this).field_f;
    }

    private final void b(int param0, int param1) {
        if (param1 > -11) {
            field_e = null;
        }
        ((qc) this).field_d = param0;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (!vs.b((byte) 9)) {
            ph.field_b.e(-113);
            mr.field_f = null;
        } else {
            if (0 < te.field_c) {
                av.a(-7753, param0, 6);
            } else {
                av.a(-7753, param0, 0);
            }
        }
        dr.o(250);
        ph.field_b.a(66);
        if (!param1) {
            return;
        }
        ld.field_N.b((byte) -128);
        ut.field_j = 0;
    }

    public static void b(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = 85 / ((param0 - 13) / 43);
    }

    final void a(int param0) {
        if (param0 > -41) {
            return;
        }
        ((qc) this).field_f = false;
    }

    final static ha a(int param0, int param1, int param2, java.awt.Canvas param3, d param4) {
        if (param2 != -1) {
            qc.b((byte) 64);
        }
        return (ha) (Object) new oa(param3, param4, param1, param0);
    }

    qc() {
        ((qc) this).field_b = 200;
    }

    final void a(int param0, int param1) {
        ((qc) this).field_f = true;
        this.b(param1, -119);
        ((qc) this).field_b = 200;
        if (param0 != -3388) {
            qc.b((byte) 117);
        }
    }

    static {
    }
}
