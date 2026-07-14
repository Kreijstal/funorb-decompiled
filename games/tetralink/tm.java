/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends um {
    private boolean field_s;
    static String[] field_r;
    private String field_q;
    static int field_t;

    public static void g(int param0) {
        if (param0 >= -23) {
            tm.g(-116);
        }
        field_r = null;
    }

    final void d(byte param0) {
        ((tm) this).field_q = null;
        if (param0 > -92) {
            ((tm) this).field_s = true;
        }
    }

    final jk a(int param0, String param1) {
        sj var3 = null;
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!(fl.a((byte) 123, var4))) {
            return db.field_h;
        }
        if (param0 != 0) {
            ((tm) this).d((byte) -30);
        }
        if (param1.equals((Object) (Object) ((tm) this).field_q)) {
        } else {
            var3 = hi.a(param1, (byte) -80);
            if (var3 != null) {
                // if_acmpne L75
            } else {
                return ug.field_cb;
            }
            ((tm) this).field_q = param1;
            ((tm) this).field_s = var3.field_f;
        }
        return !((tm) this).field_s ? db.field_h : pf.field_a;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static gd a(long param0, int param1) {
        if (param1 != -26778) {
            field_t = -16;
        }
        return (gd) (Object) db.field_a.a(param0, 1);
    }

    final String a(String param0, int param1) {
        sj var4 = null;
        if (param1 != 26202) {
            return null;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        String var3 = tl.a(35, var5);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param0.equals((Object) (Object) ((tm) this).field_q)) {
            var4 = hi.a(param0, (byte) -80);
            if (var4 == null) {
                return null;
            }
            if (null != var4.field_i) {
                return null;
            }
            ((tm) this).field_s = var4.field_f;
            ((tm) this).field_q = param0;
        }
        if (!((tm) this).field_s) {
            return qc.field_fb;
        }
        return a.field_e;
    }

    final static void a(byte param0, int param1, hl param2, int param3, int param4, hl param5, byte[] param6, hl param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TetraLink.field_J;
        nn.field_Y = param6;
        kn.field_a = param4;
        oj.field_c = -1L;
        hg.field_k = param6.length;
        kl.field_a = false;
        km.field_o = new byte[(kn.field_a - -7) / 8];
        qb.field_N = null;
        qe.field_a = null;
        var10 = 0;
        var11 = 0;
        L0: while (true) {
          if (var11 >= nn.field_Y.length) {
            L1: {
              var10 = (7 + var10) / 8;
              lo.field_a = new byte[var10];
              if (param5.field_fb != null) {
                break L1;
              } else {
                param5.field_fb = new je();
                break L1;
              }
            }
            L2: {
              if (param0 == -58) {
                break L2;
              } else {
                tm.g(71);
                break L2;
              }
            }
            L3: {
              gl.field_p = param5.field_fb;
              gl.field_p.b(1);
              db.field_a = new kd(param9);
              aa.field_Pb = -1;
              nd.field_Nb = 0;
              ja.field_g = 0;
              mc.field_l = -1;
              if (null != param7.field_fb) {
                break L3;
              } else {
                param7.field_fb = new je();
                break L3;
              }
            }
            L4: {
              jl.field_a = param7.field_fb;
              jl.field_a.b(1);
              db.field_e = new kd(param1);
              if (null == param2.field_fb) {
                param2.field_fb = new je();
                break L4;
              } else {
                break L4;
              }
            }
            ui.field_d = param2.field_fb;
            ui.field_d.b(1);
            dg.field_g = new kd(param3);
            un.field_f = 0L;
            u.field_a = param8;
            return;
          } else {
            var10 = var10 + (255 & nn.field_Y[var11]);
            var11++;
            continue L0;
          }
        }
    }

    tm(nn param0) {
        super(param0);
        ((tm) this).field_s = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_t = 0;
    }
}
