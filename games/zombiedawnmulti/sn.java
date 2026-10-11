/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends cj {
    private int field_Qb;
    static String field_Yb;
    static String field_Zb;
    private int field_Pb;
    static String field_Ib;
    static String field_Mb;
    private int field_Wb;
    private int field_Ob;
    private cj field_Rb;
    static boolean field_Hb;
    static String field_Sb;
    private ja[] field_Ub;
    static int field_Lb;
    private int field_Kb;
    private cj field_Fb;
    private int[] field_Xb;
    private int field_Jb;
    static ja[] field_Nb;
    static String field_Gb;
    private int field_Vb;
    private mo[] field_Tb;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var10 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 == this.field_Vb) {
          this.field_Tb[this.field_Vb] = new mo(0L, (cj) null, (cj) null, this.field_Fb, (ja) null, bg.field_a);
          this.field_Tb[this.field_Vb].field_lb = 1;
          this.a((byte) 50, this.field_Tb[this.field_Vb]);
          this.field_Xb[this.field_Vb] = -1;
          this.field_Vb = this.field_Vb + 1;
        }
        var6 = 0;
        for (var7 = 0; var7 < this.field_Vb; var7++) {
          var8 = this.field_Tb[var7].a(this.field_Pb, false, this.field_Kb);
          if (var8 > var6) {
            var6 = var8;
          }
        }
        var6 = var6 + this.field_Jb * 2;
        var7Lifetime1 = this.field_Qb + this.field_Qb + this.field_Vb * this.field_Wb;
        if (param0 != 4542) {
          return;
        }
        var8Lifetime1 = qp.a(param1, (byte) 30, var6, param4);
        var9 = br.a(true, param3, param2, var7Lifetime1);
        this.a(var7Lifetime1, var9, var6, var8Lifetime1, -3344);
        for (var10 = 0; this.field_Vb > var10; var10++) {
          this.field_Tb[var10].a(this.field_Kb, param0 - 4540, this.field_Wb, var6 - this.field_Jb * 2, this.field_Jb, this.field_Wb * var10 + this.field_Qb, this.field_Pb);
        }
        return;
    }

    final int e(boolean param0, int param1) {
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.a(-11838, param0);
        if (!param0) {
          return -2;
        }
        for (var3 = 0; this.field_Vb > var3; var3++) {
          if (0 != this.field_Tb[var3].field_T) {
            return this.field_Xb[var3];
          }
        }
        if (param1 != -1839469055) {
          String var5 = (String) null;
          this.a((byte) 97, (String) null, -128);
        }
        if (kd.field_b != 0) {
          return -1;
        }
        return this.field_Ob;
    }

    sn(sn param0) {
        this(param0, param0.field_Ub, param0.field_Fb, param0.field_Rb, param0.field_Jb, param0.field_Pb, param0.field_Kb, param0.field_Qb, param0.field_Wb);
    }

    final boolean d(byte param0) {
        if (param0 < 71) {
          k var3 = (k) null;
          sn.a(3, (k) null);
        }
        if (this.field_Ob != -2) {
          return false;
        }
        if (sj.field_p == 13) {
          this.field_Ob = -1;
          return true;
        }
        return true;
    }

    public static void c(byte param0) {
        field_Zb = null;
        field_Sb = null;
        field_Gb = null;
        field_Yb = null;
        field_Mb = null;
        if (param0 < 112) {
          field_Nb = (ja[]) null;
        }
        field_Ib = null;
        field_Nb = null;
    }

    final static void a(int param0, k param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          vn.field_e = param1.d((byte) 69) << 5;
          var2_int = param1.g(param0 + 27315);
          ao.field_c = (var2_int & 7) << 18;
          vn.field_e = vn.field_e + (var2_int >> 3);
          ao.field_c = ao.field_c + (param1.d((byte) 69) << 2);
          var2_intLifetime1 = param1.g(31365);
          ao.field_c = ao.field_c + (var2_intLifetime1 >> 6);
          jq.field_a = var2_intLifetime1 << 15 & 2064384;
          if (param0 != 4050) {
            sn.c((byte) 16);
          }
          jq.field_a = jq.field_a + (param1.g(31365) << 7);
          var2_intLifetime2 = param1.g(31365);
          qc.field_q = var2_intLifetime2 << 16 & 65536;
          jq.field_a = jq.field_a + (var2_intLifetime2 >> 1);
          qc.field_q = qc.field_q + param1.d((byte) 69);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sn.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sn(cj param0, ja[] param1, cj param2, cj param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Ob = -2;
        this.field_Xb = new int[256];
        this.field_Tb = new mo[256];
        try {
          this.field_Rb = param3;
          this.field_Ub = param1;
          this.field_Qb = param7;
          this.field_Pb = param5;
          this.field_Wb = param8;
          this.field_Jb = param4;
          this.field_Fb = param2;
          this.field_Kb = param6;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        try {
          this.field_Tb[this.field_Vb] = new mo(0L, (cj) null, (cj) null, this.field_Rb, (ja) null, param1);
          this.field_Tb[this.field_Vb].field_X = this.field_Ub;
          this.field_Tb[this.field_Vb].field_ib = true;
          this.field_Tb[this.field_Vb].field_lb = 1;
          this.a((byte) 50, this.field_Tb[this.field_Vb]);
          this.field_Xb[this.field_Vb] = param2;
          this.field_Vb = this.field_Vb + 1;
          if (param0 != -118) {
            this.d((byte) 122);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sn.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(ja param0, int param1, String param2, boolean param3) {
        try {
          this.field_Tb[this.field_Vb] = new mo(0L, (cj) null, (cj) null, this.field_Rb, param0, param2);
          this.field_Tb[this.field_Vb].field_X = this.field_Ub;
          this.field_Tb[this.field_Vb].field_ib = param3 ? true : false;
          this.field_Tb[this.field_Vb].field_lb = 1;
          this.a((byte) 50, this.field_Tb[this.field_Vb]);
          this.field_Xb[this.field_Vb] = param1;
          this.field_Vb = this.field_Vb + 1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "sn.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_Sb = "You know what you want, they should too.";
        field_Yb = "EXCLUSIVE";
        field_Mb = "Achievements this game:";
        field_Gb = "Play rated game";
        field_Zb = "Back";
    }
}
