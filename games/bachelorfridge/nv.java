/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nv extends sna {
    private nv field_Eb;
    static ee field_wb;
    private int field_Ib;
    private int[] field_yb;
    private int field_Ab;
    private nv[] field_Hb;
    private int field_Bb;
    private gna[] field_vb;
    private char[] field_Db;
    private int field_Gb;
    private int field_xb;
    private int field_Fb;
    private int field_Cb;
    private int field_zb;

    public static void f(int param0) {
        field_wb = null;
        if (param0 != 20038) {
          field_wb = (ee) null;
        }
    }

    final int b(boolean param0) {
        if (param0) {
          this.field_Db = (char[]) null;
        }
        return this.field_Fb + (this.field_Eb != null ? this.field_Eb.b(param0) : 0);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = BachelorFridge.field_y;
        if (param0 >= -91) {
          nv.f(-20);
        }
        this.field_Fb = 2 * param4 + this.field_Gb;
        this.a(this.field_Ib, 31407, this.field_Fb, param3, param2 - this.field_Ib);
        if (param1 != this.field_zb) {
          this.field_zb = param1;
          this.b(this.field_Bb, false);
        }
        for (var7 = 0; this.field_Cb > var7; var7++) {
          this.field_vb[var7].a(this.field_Fb, param4, this.field_Ab, 0, param5, (byte) -88, this.field_vb[var7].field_rb);
        }
        if (-1 != this.field_xb &&
          this.field_Hb[this.field_xb] != null) {
          var7Lifetime1 = this.field_Hb[this.field_xb].field_Cb;
          for (var8 = (this.field_xb + var7Lifetime1) * this.field_Ab + this.field_rb; var8 > param2; var8 = var8 - this.field_Ab) {
          }
          this.field_Hb[this.field_xb].a((byte) -97, this.field_vb[this.field_xb].field_M, var8, this.field_Fb + param3, param4, param5);
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        var7 = BachelorFridge.field_y;
        if (!param3) {
          this.a(-125, -33, -91);
        }
        if (this.field_xb == param1) {
          this.f((byte) -128);
          this.b(0, false);
        } else {
          if (this.field_Hb[param1] == null) {
            if (this.field_yb[param1] == -1) {
              js.a(121);
              ki.g(-26);
            } else {
              var5 = 32768 | this.field_yb[param1];
              var6 = gk.field_d;
              if (0 == var6 &&
                null != pw.field_w) {
                var6 = 1;
              }
              if (af.a(var6, 26291) == 2) {
                fk.a(113, var6, param0, 1);
              }
              var8 = (String) null;
              no.a(var5, gk.field_d, 110, (String) null, bd.field_k, param2);
              ob.a(eaa.field_a, (byte) -47, gk.field_d, var5, bd.field_k);
              ki.g(-26);
              vca.c(true);
            }
          } else {
            this.f((byte) -98);
            this.b(0, false);
            this.field_xb = param1;
            this.field_Eb = this.field_Hb[this.field_xb];
            dka.a(this.field_Eb, (byte) 59);
            this.field_Eb.b(12, false);
          }
        }
    }

    private final void b(int param0, boolean param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = BachelorFridge.field_y;
        this.field_Bb = param0;
        if (param1) {
          this.b(false);
        }
        for (var5 = 0; this.field_Cb > var5; var5++) {
          var3 = var5 * this.field_Ab;
          var4 = this.field_Bb * this.field_Bb;
          this.field_vb[var5].field_rb = (var4 * (this.field_zb - this.field_M) + var3 * (-var4 + 144)) / 144;
        }
    }

    final void f(byte param0) {
        int var3 = 0;
        gna var4 = null;
        int var5 = BachelorFridge.field_y;
        gna[] var6 = this.field_vb;
        gna[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_t = false;
          var4.field_R = 0;
        }
        if (param0 > -90) {
          this.b(false);
        }
        if (this.field_Eb != null) {
          this.field_Eb.f((byte) -97);
          this.field_Eb.a(false);
        }
        this.field_Eb = null;
        this.field_xb = -1;
        this.b(12, false);
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param2 >= -82) {
          field_wb = (ee) null;
        }
        if (jea.field_c != null &&
          13 == gf.field_k) {
          jea.field_c = null;
          return true;
        }
        if (!lna.field_q) {
          if (gm.field_k ||
            gf.field_k == 9 ||
            gf.field_k == 10 ||
            11 == gf.field_k) {
            return wi.a(103, param0, param1);
          }
          if (gf.field_k == 80) {
            if (!cn.d((byte) 23)) {
              return false;
            }
            lna.field_q = true;
            return true;
          }
          return false;
        }
        if (!cn.d((byte) 64)) {
          return false;
        }
        int var4 = vaa.a(param3, 1, param0) ? 1 : 0;
        if (gf.field_k == 80 ||
          gf.field_k == 84) {
          var4 = 1;
          lna.field_q = false;
        }
        if (gf.field_k == 13) {
          bea.d(-125);
          var4 = 1;
          lna.field_q = false;
        }
        return var4 != 0;
    }

    nv(long param0, sna param1, sna param2, sna param3, nv[] param4, int[] param5, String[] param6, char[] param7) {
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
        po var17 = null;
        po var18 = null;
        this.field_xb = -1;
        try {
          this.field_Db = param7;
          this.field_yb = param5;
          this.field_Hb = param4;
          this.field_Cb = this.field_yb.length;
          var17 = param3.field_jb;
          var18 = var17;
          this.field_Ab = var18.field_B + (2 + var18.field_u);
          this.field_vb = new gna[this.field_Cb];
          this.field_Gb = 0;
          this.field_Ib = this.field_Cb * this.field_Ab;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Cb > var13; var13++) {
            if (0 < this.field_Db[var13]) {
              param6[var13] = var11 + oja.a((byte) -113, this.field_Db[var13]).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (null != this.field_Hb[var13] ||
              this.field_yb[var13] == -1) {
              var14 = kga.field_a;
            }
            this.field_vb[var13] = new gna(0L, param2, (sna) null, param3, (kv) (var14), param6[var13]);
            this.a(-1, this.field_vb[var13]);
            var15 = var17.a(param6[var13]);
            if (var15 > this.field_Gb) {
              this.field_Gb = var15;
            }
          }
          this.field_Gb = this.field_Gb + (10 + kga.field_a.field_n);
          this.b(12, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("nv.<init>(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_3_0 = 0;
        var7 = BachelorFridge.field_y;
        stackIn_3_0 = (gf.field_k != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (null != this.field_Eb) {
          if (var4 != 0 &&
            -1 == this.field_Eb.field_xb) {
            this.f((byte) -107);
            this.b(0, false);
            return true;
          }
          return this.field_Eb.b(param0, param1 ^ 0, param2);
        }
        if (this.field_Eb == null &&
          this == da.field_d &&
          var4 != 0) {
          ki.g(-26);
          return true;
        }
        var5 = dla.field_j;
        if (param1 != -19044) {
          this.field_zb = -75;
        }
        if (var5 > 0) {
          if (var5 == gja.field_l) {
            var5 = 63;
          }
          var6 = 0;
          while (var6 < this.field_Db.length) {
            if (var5 != this.field_Db[var6]) {
              var6++;
              continue;
            }
            this.a(param2, var6, param0, true);
            return true;
          }
        }
        return false;
    }

    final boolean g(int param0) {
        int var2;
        gna[] var3;
        int var4;
        gna var5;
        int var6;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_1 = 0;
        int stackIn_18_0 = 0;
        var6 = BachelorFridge.field_y;
        var2 = 0;
        if (param0 != -16360) {
          this.field_Bb = -67;
        }
        var3 = this.field_vb;
        var4 = 0;
        while (var4 < var3.length) {
          var5 = var3[var4];
          stackIn_7_0 = var2;
          stackIn_7_1 = var5.field_R;
          if (stackIn_7_1 == 0) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          var2 = stackIn_7_0 | stackIn_10_1;
          var4++;
        }
        if (var2 == 0 &&
          this.field_xb != -1 &&
          null != this.field_Hb[this.field_xb]) {
          stackIn_18_0 = (!this.field_Hb[this.field_xb].g(-16360)) ? 0 : 1;
          var2 = stackIn_18_0;
        }
        return var2 != 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4_int = 0;
        gna var5;
        int var6;
        gna stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        nv var4;
        nv var7;
        var6 = BachelorFridge.field_y;
        for (var4_int = 0; var4_int < this.field_vb.length; var4_int++) {
          var5 = this.field_vb[var4_int];
          if (var5.field_R == 1) {
            this.a(param0, var4_int, param2, true);
            stackIn_7_0 = var5;
            stackIn_8_1 = (this.field_xb == var4_int);
            stackIn_7_0.field_t = stackIn_8_1;
          }
        }
        if (param1 != 30091) {
          return;
        }
        if (this.field_xb != -1) {
          var7 = this.field_Hb[this.field_xb];
          var4 = var7;
          if (var4 != null) {
            var7.a(param0, param1 ^ 0, param2);
          }
        }
        if (this.field_Bb > 0) {
          this.b(-1 + this.field_Bb, false);
        }
    }

    static {
    }
}
