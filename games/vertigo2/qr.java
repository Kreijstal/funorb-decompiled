/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qr extends jq {
    private int field_i;
    private int field_s;
    static rp field_l;
    static int field_n;
    static String field_o;
    static er field_q;
    static er field_h;
    static cr field_m;
    private int field_r;
    static String[] field_k;
    private int field_p;
    static int field_j;

    qr(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_i = param0;
        this.field_s = param2;
        this.field_r = param3;
        this.field_p = param1;
    }

    final static tn a(int param0, int param1, int param2, int param3) {
        Object stackIn_40_0 = null;
        cr stackIn_40_1 = null;
        boolean stackIn_48_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        tn var8_ref_tn;
        int var9;
        tn var9_ref_tn;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Vertigo2.field_L ? 1 : 0;
        mg.field_R.field_Nb.field_M.c(0);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = no.field_d - 1; 0 <= var7; var7--) {
          var8_ref_tn = eo.field_l[var7];
          var9 = 0;
          if (!pe.field_r &&
            ll.field_b > var5) {
            var10_int = ab.a(0, var8_ref_tn.field_s);
            if (var8_ref_tn.a((byte) 44) >= var10_int && (var8_ref_tn.field_n ||
              !iq.b(var8_ref_tn.field_a, 113))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_tn.field_e = null;
          } else {
            var5++;
            if (var8_ref_tn.field_e == null ||
              dc.field_B) {
              if (var8_ref_tn.field_e == null) {
                wg.field_g = wg.field_g + 1;
              }
              var10 = nb.a(var8_ref_tn, 106);
              var11 = var10 + cc.b(var8_ref_tn.field_d);
              var12 = mm.a(var8_ref_tn, 0);
              var8_ref_tn.field_e = new cr(0L, np.field_Ib, var11);
              var8_ref_tn.field_e.field_A = var12;
              var8_ref_tn.field_e.field_B = (np.field_Ib.field_B >> 1 & 8355711) + var12 - (8355711 & var12 >> 1);
              var8_ref_tn.field_e.field_z = cg.field_f;
              var8_ref_tn.field_e.field_H = var12 + (-((var12 & 16711423) >> 1) + (8355711 & np.field_Ib.field_H >> 1));
              var6 = var6 + param3;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; var8 < no.field_d; var8++) {
          var9_ref_tn = eo.field_l[var8];
          if (null != var9_ref_tn.field_e) {
            mg.field_R.field_Nb.b(var9_ref_tn.field_e, 127);
            var9_ref_tn.field_e.a(73, var9_ref_tn.field_e.j(-21391), param3, var7Lifetime1, param0);
            var7Lifetime1 = var7Lifetime1 + param3;
            if (var9_ref_tn.field_e.field_tb != 0) {
              var4 = var9_ref_tn;
            }
          }
        }
        var8Lifetime1 = -var7Lifetime1 - (-var6 - mg.field_R.field_Nb.field_kb - mg.field_R.field_Nb.field_db);
        if (param1 < 4) {
          return (tn) null;
        }
        mg.field_R.field_Nb.field_db = mg.field_R.field_Nb.field_db - var8Lifetime1;
        mg.field_R.field_Nb.field_N = mg.field_R.field_Nb.field_N + var8Lifetime1;
        if (dc.field_B) {
          mg.field_R.field_Nb.field_db = var7Lifetime1;
        }
        if (dc.field_B) {
          dc.field_B = false;
          mg.field_R.field_Nb.field_L = 0;
          nb.field_z = true;
          mg.field_R.field_Nb.field_N = mg.field_R.field_Lb.field_db - mg.field_R.field_Nb.field_db;
        }
        mg.field_R.field_Nb.field_kb = var7Lifetime1 - mg.field_R.field_Nb.field_db;
        if (il.field_a) {
          stackIn_40_0 = null;
          stackIn_40_1 = gk.field_c;
          if (stackIn_40_0 != stackIn_40_1) {
            nb.field_z = true;
          }
        }
        var9Lifetime1 = -mg.field_R.field_Nb.field_db + (-mg.field_R.field_Nb.field_kb + mg.field_R.field_Lb.field_db);
        if (nb.field_z) {
          mg.field_R.field_Nb.field_L = -mg.field_R.field_Nb.field_N + var9Lifetime1;
        }
        mg.field_R.a(param3, true, -1, param2 * 2 * param3);
        stackIn_48_0 = (mg.field_R.field_Nb.field_L + mg.field_R.field_Nb.field_N == var9Lifetime1);
        nb.field_z = stackIn_48_0;
        return (tn) (var4);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = this.field_i * param1 >> 12;
        int var5 = this.field_s * param1 >> 12;
        int var6 = this.field_p * param0 >> 12;
        int var7 = param0 * this.field_r >> 12;
        if (param2 != 45) {
          this.field_p = 90;
        }
        ng.a(this.field_a, var4, var7, var5, this.field_f, param2 - 131, var6);
    }

    public static void a(boolean param0) {
        field_k = null;
        field_l = null;
        field_q = null;
        if (param0) {
          field_h = (er) null;
        }
        field_o = null;
        field_m = null;
        field_h = null;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = this.field_i * param2 >> 12;
        int var5 = this.field_s * param2 >> 12;
        if (param1 >= -31) {
          this.field_p = -29;
        }
        int var6 = param0 * this.field_p >> 12;
        int var7 = this.field_r * param0 >> 12;
        ml.a(this.field_g, var4, var7, var6, var5, -109);
    }

    final void b(int param0, byte param1, int param2) {
        int var4 = this.field_i * param0 >> 12;
        int var5 = this.field_s * param0 >> 12;
        if (param1 < 26) {
          return;
        }
        int var6 = param2 * this.field_p >> 12;
        int var7 = this.field_r * param2 >> 12;
        aq.a(var5, this.field_f, this.field_g, this.field_a, var7, var4, 0, var6);
    }

    static {
        field_n = 4;
        field_o = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_k = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
