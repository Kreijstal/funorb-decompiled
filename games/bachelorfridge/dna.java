/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dna extends sna {
    private sna field_vb;
    private sna[] field_xb;
    int field_yb;
    private sna[] field_wb;

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((dna) this).field_xb.length) {
            L1: {
              if (param0 == 18632) {
                break L1;
              } else {
                dna.f((byte) 59);
                break L1;
              }
            }
            return;
          } else {
            if (var2 != ((dna) this).field_yb) {
              if (0 != ((dna) this).field_xb[var2].field_R) {
                ((dna) this).field_xb[((dna) this).field_yb].field_t = false;
                ((dna) this).field_wb[((dna) this).field_yb].field_kb = ((dna) this).field_wb[((dna) this).field_yb].field_kb + 10000;
                ((dna) this).field_yb = var2;
                ((dna) this).field_xb[var2].field_t = true;
                ((dna) this).field_wb[var2].field_kb = ((dna) this).field_wb[var2].field_kb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    dna(long param0, sna param1, String[] param2, sna param3, sna[] param4, int param5) {
        super(param0, (sna) null);
        int var8 = 0;
        sna var9 = null;
        ((dna) this).field_xb = new sna[param2.length];
        ((dna) this).field_vb = new sna(0L, param3);
        ((dna) this).field_wb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new sna(0L, param1);
            var9.field_Z = param2[var8];
            ((dna) this).field_xb[var8] = var9;
            ((dna) this).a(-1, var9);
        }
        ((dna) this).a(-1, ((dna) this).field_vb);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((dna) this).field_vb.a(-1, param4[var11]);
            var11++;
        }
        ((dna) this).field_yb = param5;
        ((dna) this).field_xb[param5].field_t = true;
    }

    final static void c(int param0, boolean param1) {
        int var2 = (kg.field_b - 640) / 2;
        int var3 = saa.field_b * saa.field_b;
        int var4 = var3 + -(param0 * param0);
        ela.field_i.a(dg.field_c - 124 + -90, 31407, 199, -(199 * var4 / var3) + var2, 90);
        if (param1) {
            dna.f((byte) 74);
        }
        ho.field_g.a(-4 + dg.field_c - 120, 31407, 438, var4 * 438 / var3 + (var2 + 202), 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((dna) this).field_kb = param1;
        ((dna) this).field_rb = param5;
        ((dna) this).field_p = param3;
        if (param2 != 0) {
            dna.f((byte) -76);
        }
        ((dna) this).field_sb = param4;
        this.a(false, param0, param6);
    }

    final static void f(byte param0) {
        if (param0 != -12) {
            return;
        }
        dda.c(param0 + -31021);
    }

    final static int b(int param0, boolean param1) {
        String var2 = lka.field_E[param0][4];
        String var2_ref = var2.trim();
        if (param1) {
            return 84;
        }
        var2_ref = var2_ref.toLowerCase();
        return ((ji) (Object) cw.field_zb.a(!param1 ? true : false, (long)var2_ref.hashCode())).field_h;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = BachelorFridge.field_y;
        var4 = 0;
        L0: while (true) {
          if (((dna) this).field_xb.length <= var4) {
            ((dna) this).field_vb.a(-param2 + ((dna) this).field_p, 31407, ((dna) this).field_sb, 0, param2);
            var8 = 0;
            var4 = var8;
            if (!param0) {
              L1: while (true) {
                if (((dna) this).field_wb.length <= var8) {
                  return;
                } else {
                  ((dna) this).field_wb[var8].a(((dna) this).field_vb.field_p - param1 * 2, 31407, -(param1 * 2) + ((dna) this).field_vb.field_sb, param1, param1);
                  if (((dna) this).field_yb != var8) {
                    ((dna) this).field_wb[var8].field_kb = ((dna) this).field_wb[var8].field_kb + 10000;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var5 = ((dna) this).field_sb * var4 / ((dna) this).field_xb.length;
            var6 = ((dna) this).field_sb * (var4 + 1) / ((dna) this).field_xb.length;
            ((dna) this).field_xb[var4].field_kb = var5;
            ((dna) this).field_xb[var4].field_rb = 0;
            ((dna) this).field_xb[var4].field_sb = var6 + -var5;
            ((dna) this).field_xb[var4].field_p = param2;
            var4++;
            continue L0;
          }
        }
    }

    static {
    }
}
