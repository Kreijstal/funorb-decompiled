/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb extends k {
    static int[] field_m;
    static vr field_l;
    int field_o;
    int[] field_n;
    int field_p;
    private int field_k;

    public qb() {
        super(0, false);
        this.field_k = -1;
    }

    public static void d(int param0) {
        field_l = null;
        int var1 = -31 % ((74 - param0) / 46);
        field_m = null;
    }

    final boolean e(byte param0) {
        uh var2 = null;
        if (null != this.field_n) {
          return true;
        }
        if (this.field_k >= 0) {
          var2 = sp.field_l >= 0 ? uh.a(l.field_r, sp.field_l, this.field_k) : uh.a(l.field_r, this.field_k);
          var2.c();
          this.field_n = var2.a();
          this.field_o = var2.field_i;
          this.field_p = var2.field_a;
          return true;
        }
        if (param0 >= -63) {
          return false;
        }
        return false;
    }

    int[][] a(boolean param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_1 = 0;
        int[][] var3;
        int[] var4;
        int[] var5;
        int[] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        int[][] var14Lifetime1;
        var11 = BachelorFridge.field_y;
        var14 = this.field_h.a(param1, -858);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param0) {
          return (int[][]) null;
        }
        if (this.field_h.field_b &&
          this.e((byte) -70)) {
          var14Lifetime1 = var13;
          var4 = var14Lifetime1[0];
          var5 = var14Lifetime1[1];
          var6 = var14Lifetime1[2];
          stackIn_8_0 = this.field_o;
          if (bi.field_g == this.field_p) {
            stackIn_9_1 = param1;
          } else {
            stackIn_9_1 = param1 * this.field_p / bi.field_g;
          }
          var7 = stackIn_8_0 * stackIn_9_1;
          if (hh.field_d != this.field_o) {
            for (var8 = 0; hh.field_d > var8; var8++) {
              var9 = var8 * this.field_o / hh.field_d;
              var10 = this.field_n[var9 + var7];
              var6[var8] = dda.a(255, var10) << 4;
              var5[var8] = dda.a(var10, 65280) >> 4;
              var4[var8] = dda.a(16711680, var10) >> 12;
            }
          } else {
            for (var8 = 0; var8 < hh.field_d; var8++) {
              incrementValue$0 = var7;
              var7++;
              var9 = this.field_n[incrementValue$0];
              var6[var8] = dda.a(255, var9) << 4;
              var5[var8] = dda.a(var9 >> 4, 4080);
              var4[var8] = dda.a(16711680, var9) >> 12;
            }
          }
        }
        return var3;
    }

    final int a(int param0) {
        if (param0 != -2359) {
          return -12;
        }
        return this.field_k;
    }

    final void b(int param0) {
        super.b(param0);
        this.field_n = null;
    }

    final static void a(int param0, boolean param1, String param2, int param3, boolean param4) {
        String stackIn_4_0 = null;
        boolean stackIn_25_0 = false;
        boolean stackIn_26_1 = false;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = BachelorFridge.field_y;
        try {
          fv.field_w = param0;
          nla.field_f = true;
          var11 = param2;
          if (!param1) {
            stackIn_4_0 = ko.field_h;
          } else {
            stackIn_4_0 = maa.field_x;
          }
          var6 = stackIn_4_0;
          if (~fv.field_w == param3) {
            var7 = ut.a(db.field_b, 480, var11, qm.field_a, 127);
            var8 = var7 + 3;
            gn.field_l = new int[var8];
            pt.field_a = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              gn.field_l[var9] = -1;
            }
            st.field_a = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              pt.field_a[var9] = db.field_b[var9];
            }
            pt.field_a[-3 + var8] = "";
            pt.field_a[var8 - 2] = var6;
            gn.field_l[var8 - 2] = 0;
            st.field_a[0] = 1;
            pt.field_a[-1 + var8] = ala.field_d;
            gn.field_l[-1 + var8] = 1;
            st.field_a[1] = 2;
          } else {
            if (1 != fv.field_w) {
              throw new IllegalArgumentException();
            }
            var7 = ut.a(db.field_b, 480, var11, qm.field_a, -118);
            var8 = var7 + 2;
            gn.field_l = new int[var8];
            pt.field_a = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              gn.field_l[var9] = -1;
            }
            st.field_a = new int[1];
            for (var9 = 0; var9 < var7; var9++) {
              pt.field_a[var9] = db.field_b[var9];
            }
            pt.field_a[-2 + var8] = "";
            pt.field_a[-1 + var8] = ala.field_d;
            gn.field_l[-1 + var8] = 0;
            st.field_a[0] = 2;
          }
          fw.field_i.field_e = st.field_a.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < pt.field_a.length; var8Lifetime1++) {
            stackIn_25_0 = true;
            stackIn_26_1 = !(gn.field_l[var8Lifetime1] < 0);
            var9Lifetime1 = hka.a(stackIn_25_0, stackIn_26_1, pt.field_a[var8Lifetime1]);
            if (gn.field_l[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + 2 * hna.field_k;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          dfa.field_b = -(var7Lifetime1 >> 1) + (var7Lifetime1 + sd.field_a);
          ula.field_f = (pba.field_r + raa.field_J << 1) * fw.field_i.field_e;
          rs.field_a = sd.field_a - (var7Lifetime1 >> 1);
          for (var8Lifetime2 = 0; var8Lifetime2 < pt.field_a.length; var8Lifetime2++) {
            stackIn_37_0 = ula.field_f;
            if (gn.field_l[var8Lifetime2] >= 0) {
              stackIn_38_1 = jo.field_t;
            } else {
              stackIn_38_1 = un.field_i;
            }
            ula.field_f = stackIn_37_0 + stackIn_38_1;
          }
          vka.field_q = jfa.field_w - (ula.field_f >> 1);
          fw.field_i.a(param4, param3 ^ -86, rh.a(mk.field_p, (byte) -126, gd.field_m), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_43_0 = var5;
          stackIn_43_1 = new StringBuilder().append("qb.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == 0) {
            this.field_k = param1.e((byte) 108);
          }
          if (param0 != -71) {
            this.a(66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("qb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_m = new int[4];
    }
}
