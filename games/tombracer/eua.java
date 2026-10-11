/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eua extends jea {
    private eua field_Eb;
    private int field_vb;
    private int field_Fb;
    private char[] field_xb;
    private tv[] field_Gb;
    private int field_Db;
    private eua[] field_zb;
    private int field_Bb;
    private int field_wb;
    private int field_Cb;
    static String field_Ab;
    private int field_yb;
    private int field_tb;
    private int[] field_ub;

    final int g(int param0) {
        if (param0 != 22514) {
          this.field_Cb = -14;
        }
        return this.field_Fb + (null != this.field_Eb ? this.field_Eb.g(22514) : 0);
    }

    final void a(boolean param0) {
        int var3 = 0;
        tv var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        tv[] var6 = this.field_Gb;
        tv[] var2 = var6;
        if (!param0) {
          this.a(33, (byte) -9, 44);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_cb = false;
          var4.field_y = 0;
        }
        if (null != this.field_Eb) {
          this.field_Eb.a(param0);
          this.field_Eb.p(1);
        }
        this.field_Eb = null;
        this.field_tb = -1;
        this.a(12, 6);
    }

    public static void f(int param0) {
        field_Ab = null;
        if (param0 <= 52) {
          field_Ab = (String) null;
        }
    }

    final boolean h(int param0) {
        int var4 = 0;
        tv var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var2 = 0;
        tv[] var3 = this.field_Gb;
        for (var4 = param0; var3.length > var4; var4++) {
          var5 = var3[var4];
          var2 = var2 | (0 != var5.field_y ? 1 : 0);
        }
        if (var2 == 0 &&
          (this.field_tb != -1 && null != this.field_zb[this.field_tb])) {
          var2 = this.field_zb[this.field_tb].h(param0 ^ 0) ? 1 : 0;
        }
        return var2 != 0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        this.field_Cb = param0;
        if (param1 <= 3) {
          return;
        }
        for (var5 = 0; this.field_Bb > var5; var5++) {
          var4 = this.field_Cb * this.field_Cb;
          var3 = this.field_wb * var5;
          this.field_Gb[var5].field_T = (var3 * (144 - var4) + (this.field_Db - this.field_A) * var4) / 144;
        }
    }

    eua(long param0, jea param1, jea param2, jea param3, eua[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        int var13 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        Object var14 = null;
        int var15 = 0;
        il var17 = null;
        il var18 = null;
        this.field_tb = -1;
        try {
          this.field_zb = param4;
          this.field_ub = param5;
          this.field_xb = param7;
          this.field_Bb = this.field_ub.length;
          var17 = param3.field_H;
          var18 = var17;
          this.field_wb = var18.field_k + (var18.field_w + 2);
          this.field_Gb = new tv[this.field_Bb];
          this.field_vb = 0;
          this.field_yb = this.field_Bb * this.field_wb;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; var13 < this.field_Bb; var13++) {
            if (this.field_xb[var13] > 0) {
              param6[var13] = var11 + no.a((byte) 67, this.field_xb[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_zb[var13] ||
              -1 == this.field_ub[var13]) {
              var14 = gfa.field_j;
            }
            this.field_Gb[var13] = new tv(0L, param2, (jea) null, param3, (iu) (var14), param6[var13]);
            this.b(-123, this.field_Gb[var13]);
            var15 = var17.b(param6[var13]);
            if (this.field_vb < var15) {
              this.field_vb = var15;
            }
          }
          this.field_vb = this.field_vb + (10 + gfa.field_j.field_n);
          this.a(12, 93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("eua.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param7 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param3 != -62) {
          this.field_vb = 1;
        }
        if (param2 != this.field_tb) {
          if (this.field_zb[param2] != null) {
            this.a(true);
            this.a(0, 60);
            this.field_tb = param2;
            this.field_Eb = this.field_zb[this.field_tb];
            hj.a(this.field_Eb, (byte) 122);
            this.field_Eb.a(12, 116);
          } else {
            if (this.field_ub[param2] != -1) {
              var5 = this.field_ub[param2] | 32768;
              var6 = bta.field_q;
              if (var6 == 0 &&
                uu.field_a != null) {
                var6 = 1;
              }
              if (gda.a(var6, -20011) == 2) {
                loa.a(var6, param0, (byte) 108, 1);
              }
              var8 = (String) null;
              opa.a(bta.field_q, (String) null, param1, 32371, wp.field_a, var5);
              oi.a(ica.field_b, var5, 4, wp.field_a, bta.field_q);
              f.b(param3 - 48);
              jq.c((byte) -25);
            } else {
              kra.a(false);
              f.b(param3 + 7);
            }
          }
        } else {
          this.a(true);
          this.a(0, 70);
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var4;
        int var5;
        int var7;
        int stackIn_3_0 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        stackIn_3_0 = (fna.field_h != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (this.field_Eb != null) {
          if (var4 != 0 &&
            this.field_Eb.field_tb == -1) {
            this.a(true);
            this.a(0, 124);
            return true;
          }
          return this.field_Eb.a(param0, (byte) -105, param2);
        }
        if (null == this.field_Eb &&
          this == kga.field_n &&
          var4 != 0) {
          f.b(param1 ^ 48);
          return true;
        }
        var5 = kda.field_td;
        if (param1 != -105) {
          return false;
        }
        if (0 >= var5) {
          return false;
        }
        if (var5 == tqa.field_o) {
          var5 = 63;
        }
        for (var6 = 0; var6 < this.field_xb.length; var6++) {
          if (this.field_xb[var6] == var5) {
            this.a(param2, param0, var6, (byte) -62);
            return true;
          }
        }
        return false;
    }

    final void a(int param0, int param1, byte param2) {
        int var4_int = 0;
        tv var5;
        int var6;
        tv stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        eua var4;
        eua var7;
        var6 = TombRacer.field_G ? 1 : 0;
        for (var4_int = 0; var4_int < this.field_Gb.length; var4_int++) {
          var5 = this.field_Gb[var4_int];
          if (var5.field_y == 1) {
            this.a(param1, param0, var4_int, (byte) -62);
            stackIn_7_0 = var5;
            stackIn_8_1 = (var4_int == this.field_tb);
            stackIn_7_0.field_cb = stackIn_8_1;
          }
        }
        if (param2 > -52) {
          eua.f(-120);
        }
        if (this.field_tb != -1) {
          var7 = this.field_zb[this.field_tb];
          var4 = var7;
          if (var4 != null) {
            var7.a(param0, param1, (byte) -79);
          }
        }
        if (this.field_Cb > 0) {
          this.a(this.field_Cb - 1, 66);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        this.field_Fb = this.field_vb + 2 * param5;
        this.a(this.field_Fb, this.field_yb, -23776, -this.field_yb + param4, param1);
        if (param3 != this.field_Db) {
          this.field_Db = param3;
          this.a(this.field_Cb, 77);
        }
        for (var7 = 0; this.field_Bb > var7; var7++) {
          this.field_Gb[var7].a(this.field_Fb, 0, param0, this.field_wb, 0, param5, this.field_Gb[var7].field_T);
        }
        if (param2 != -3269) {
          field_Ab = (String) null;
        }
        if (this.field_tb != -1 &&
          null != this.field_zb[this.field_tb]) {
          var7Lifetime1 = this.field_zb[this.field_tb].field_Bb;
          for (var8 = (this.field_tb + var7Lifetime1) * this.field_wb + this.field_T; param4 < var8; var8 = var8 - this.field_wb) {
          }
          this.field_zb[this.field_tb].a(param0, this.field_Fb + param1, param2 + 0, this.field_Gb[this.field_tb].field_A, var8, param5);
        }
    }

    static {
        field_Ab = "Lindemann totems";
    }
}
