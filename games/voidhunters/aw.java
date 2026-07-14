/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends llb {
    private llb field_Fb;
    private int field_yb;
    private phb[] field_xb;
    private llb field_Cb;
    private int field_wb;
    static gl field_Bb;
    private int field_Ab;
    private int field_zb;
    private int[] field_Eb;
    private int field_Hb;
    private int field_vb;
    private int field_Ib;
    private cna[] field_Gb;
    static String field_Db;

    final boolean e(byte param0) {
        if (!(((aw) this).field_Ab == -2)) {
            return false;
        }
        if (-14 == (pma.field_o ^ -1)) {
            ((aw) this).field_Ab = -1;
        }
        int var2 = 108 % ((-69 - param0) / 48);
        return true;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var5 = VoidHunters.field_G;
        ((aw) this).a(param1, 1332);
        if (!(param1)) {
            return -2;
        }
        for (var3 = 0; var3 < ((aw) this).field_Ib; var3++) {
            if (-1 != (((aw) this).field_Gb[var3].field_o ^ -1)) {
                return ((aw) this).field_Eb[var3];
            }
        }
        int var4 = -115 / ((param0 - -87) / 37);
        if (0 != pba.field_o) {
            return -1;
        }
        return ((aw) this).field_Ab;
    }

    final void a(String param0, byte param1, int param2) {
        ((aw) this).field_Gb[((aw) this).field_Ib] = new cna(0L, (llb) null, (llb) null, ((aw) this).field_Cb, (phb) null, param0);
        ((aw) this).field_Gb[((aw) this).field_Ib].field_mb = ((aw) this).field_xb;
        ((aw) this).field_Gb[((aw) this).field_Ib].field_S = true;
        ((aw) this).field_Gb[((aw) this).field_Ib].field_B = 1;
        ((aw) this).b(-561, (llb) (Object) ((aw) this).field_Gb[((aw) this).field_Ib]);
        ((aw) this).field_Eb[((aw) this).field_Ib] = param2;
        ((aw) this).field_Ib = ((aw) this).field_Ib + 1;
        if (param1 != -53) {
            Object var5 = null;
            ((aw) this).a((String) null, (byte) -31, -41);
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = VoidHunters.field_G;
          if (0 != ((aw) this).field_Ib) {
            break L0;
          } else {
            ((aw) this).field_Gb[((aw) this).field_Ib] = new cna(0L, (llb) null, (llb) null, ((aw) this).field_Fb, (phb) null, fc.field_o);
            ((aw) this).field_Gb[((aw) this).field_Ib].field_B = 1;
            ((aw) this).b(-561, (llb) (Object) ((aw) this).field_Gb[((aw) this).field_Ib]);
            ((aw) this).field_Eb[((aw) this).field_Ib] = -1;
            ((aw) this).field_Ib = ((aw) this).field_Ib + 1;
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (var7 >= ((aw) this).field_Ib) {
            var6 = var6 + ((aw) this).field_zb * 2;
            if (param1 == -29060) {
              var7 = ((aw) this).field_yb + (((aw) this).field_yb - -(((aw) this).field_wb * ((aw) this).field_Ib));
              var8 = jv.a((byte) -109, param0, param3, var6);
              var9 = lma.a(param4, param2, var7, (byte) -16);
              ((aw) this).a(var8, 32, var6, var9, var7);
              var10 = 0;
              L2: while (true) {
                if (((aw) this).field_Ib <= var10) {
                  return;
                } else {
                  ((aw) this).field_Gb[var10].a(((aw) this).field_yb - -(((aw) this).field_wb * var10), ((aw) this).field_zb, -124, ((aw) this).field_vb, ((aw) this).field_Hb, -(2 * ((aw) this).field_zb) + var6, ((aw) this).field_wb);
                  var10++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            var8 = ((aw) this).field_Gb[var7].a(((aw) this).field_Hb, ((aw) this).field_vb, -66);
            if (var8 > var6) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void a(boolean param0) {
        rma.field_b = 0;
        tkb.field_p = 1;
        bta.field_q = 1;
        ki.field_o = 1;
        via.field_b = 1;
        wkb.field_c = 1;
        if (param0) {
            return;
        }
        jnb.field_o = 1;
        if ((jha.field_p ^ -1) != -3) {
            // if_icmpne L96
            tkb.field_p = 0;
            ki.field_o = 0;
            jnb.field_o = 0;
            bta.field_q = 0;
        } else {
            ki.field_o = 0;
            bta.field_q = 0;
            jnb.field_o = 0;
            via.field_b = 0;
            wkb.field_c = 0;
            tkb.field_p = 0;
        }
    }

    final void a(int param0, int param1, phb param2, String param3) {
        if (param0 != -1) {
            return;
        }
        ((aw) this).field_Gb[((aw) this).field_Ib] = new cna(0L, (llb) null, (llb) null, ((aw) this).field_Cb, param2, param3);
        ((aw) this).field_Gb[((aw) this).field_Ib].field_mb = ((aw) this).field_xb;
        ((aw) this).field_Gb[((aw) this).field_Ib].field_S = true;
        ((aw) this).field_Gb[((aw) this).field_Ib].field_B = 1;
        ((aw) this).b(param0 ^ 560, (llb) (Object) ((aw) this).field_Gb[((aw) this).field_Ib]);
        ((aw) this).field_Eb[((aw) this).field_Ib] = param1;
        ((aw) this).field_Ib = ((aw) this).field_Ib + 1;
    }

    public static void h(int param0) {
        field_Db = null;
        field_Bb = null;
        if (param0 != 0) {
            field_Bb = null;
        }
    }

    aw(aw param0) {
        this((llb) (Object) param0, param0.field_xb, param0.field_Fb, param0.field_Cb, param0.field_zb, param0.field_vb, param0.field_Hb, param0.field_yb, param0.field_wb);
    }

    aw(llb param0, phb[] param1, llb param2, llb param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((aw) this).field_Eb = new int[256];
        ((aw) this).field_Ab = -2;
        ((aw) this).field_Gb = new cna[256];
        ((aw) this).field_wb = param8;
        ((aw) this).field_Cb = param3;
        ((aw) this).field_Fb = param2;
        ((aw) this).field_xb = param1;
        ((aw) this).field_zb = param4;
        ((aw) this).field_vb = param5;
        ((aw) this).field_Hb = param6;
        ((aw) this).field_yb = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new gl(7);
        field_Db = "You must be a member to play with the current options.";
    }
}
