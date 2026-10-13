/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends mh {
    private int field_Vb;
    private int field_dc;
    private RgbSprite[] field_Tb;
    private int field_Yb;
    private int field_Sb;
    private int field_Zb;
    static int[][] field_bc;
    private int field_Qb;
    private rk[] field_Xb;
    static String field_ac;
    private int field_Wb;
    private int[] field_cc;
    static String field_Ub;
    static String field_Rb;
    private mh field_ec;
    private mh field_Pb;

    final static void a(int param0, byte param1, int param2) {
        om var6 = null;
        om var7 = null;
        BitPacketBuffer var4 = null;
        if (MenuSelection.field_i != param2) {
          var6 = (om) (pn.field_i.a((long)MenuSelection.field_i, -1));
          var7 = var6;
          if (var7 != null) {
            var7.field_Qb = null;
          }
          MenuSelection.field_i = param2;
          var4 = k.field_h;
          var4.writeCipheredOpcode(-13413, param0);
          var4.writeByte(-29, 3);
          var4.writeByte(-127, 11);
          var4.writeShort((byte) 121, param2);
        }
        int var3 = 20 / ((55 - param1) / 62);
    }

    final void a(String param0, int param1, byte param2) {
        try {
          this.field_Xb[this.field_Wb] = new rk(0L, (mh) null, (mh) null, this.field_ec, (RgbSprite) null, param0);
          this.field_Xb[this.field_Wb].field_Gb = this.field_Tb;
          this.field_Xb[this.field_Wb].field_Lb = true;
          this.field_Xb[this.field_Wb].field_Q = 1;
          this.a(this.field_Xb[this.field_Wb], 0);
          if (param2 < 70) {
            this.field_Xb = (rk[]) null;
          }
          this.field_cc[this.field_Wb] = param1;
          this.field_Wb = this.field_Wb + 1;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "br.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        this.a(param1, -15211);
        if (!param1) {
          return -2;
        }
        int var3 = -36 / ((param0 - 13) / 63);
        for (var4 = 0; this.field_Wb > var4; var4++) {
          if (this.field_Xb[var4].field_L != 0) {
            return this.field_cc[var4];
          }
        }
        if (ki.pressedButton != 0) {
          return -1;
        }
        return this.field_dc;
    }

    final void a(String param0, int param1, int param2, RgbSprite param3) {
        try {
          this.field_Xb[this.field_Wb] = new rk(0L, (mh) null, (mh) null, this.field_ec, param3, param0);
          this.field_Xb[this.field_Wb].field_Gb = this.field_Tb;
          this.field_Xb[this.field_Wb].field_Lb = true;
          this.field_Xb[this.field_Wb].field_Q = 1;
          this.a(this.field_Xb[this.field_Wb], 0);
          this.field_cc[this.field_Wb] = param2;
          this.field_Wb = this.field_Wb + 1;
          if (param1 < 62) {
            this.field_Vb = -95;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "br.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    br(br param0) {
        this(param0, param0.field_Tb, param0.field_Pb, param0.field_ec, param0.field_Vb, param0.field_Qb, param0.field_Yb, param0.field_Sb, param0.field_Zb);
    }

    public static void h(int param0) {
        field_Ub = null;
        if (param0 < 20) {
          return;
        }
        field_bc = (int[][]) null;
        field_Rb = null;
        field_ac = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 33 % ((param3 - 75) / 45);
        if (Rasterizer2D.height >= param1 + param2 + param0) {
          return param1 + param2;
        }
        if (0 <= param1 - param0) {
          return param1 - param0;
        }
        return Rasterizer2D.height - param0;
    }

    br(mh param0, RgbSprite[] param1, mh param2, mh param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Xb = new rk[256];
        this.field_dc = -2;
        this.field_cc = new int[256];
        try {
          this.field_Pb = param2;
          this.field_Qb = param5;
          this.field_Zb = param8;
          this.field_Sb = param7;
          this.field_ec = param3;
          this.field_Tb = param1;
          this.field_Yb = param6;
          this.field_Vb = param4;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "br.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean i(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (-2 != this.field_dc) {
          return false;
        }
        if (dc.currentKeyCode == 13) {
          this.field_dc = -1;
          var2 = -81 % ((-25 - param0) / 41);
          return true;
        }
        var2Lifetime1 = -81 % ((-25 - param0) / 41);
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        int var8;
        int var11;
        int var9;
        int var10;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime2;
        int var10Lifetime2;
        int var7Lifetime4;
        int var8Lifetime4;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (this.field_Wb != 0) {
          var6 = 0;
          if (param1 < -49) {
            for (var7 = 0; this.field_Wb > var7; var7++) {
              var8 = this.field_Xb[var7].a(this.field_Yb, 24, this.field_Qb);
              if (var6 < var8) {
                var6 = var8;
              }
            }
            var6 = var6 + this.field_Vb * 2;
            var7Lifetime4 = this.field_Zb * this.field_Wb + this.field_Sb + this.field_Sb;
            var8Lifetime4 = fp.a(-1, var6, param4, param3);
            var9 = br.a(var7Lifetime4, param0, param2, 122);
            this.a(var7Lifetime4, var9, var8Lifetime4, var6, (byte) 64);
            for (var10 = 0; var10 < this.field_Wb; var10++) {
              this.field_Xb[var10].a(-10411, this.field_Zb * var10 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6 - 2 * this.field_Vb);
            }
            return;
          }
          this.field_Zb = -94;
          for (var7Lifetime2 = 0; this.field_Wb > var7Lifetime2; var7Lifetime2++) {
            var8Lifetime2 = this.field_Xb[var7Lifetime2].a(this.field_Yb, 24, this.field_Qb);
            if (var6 < var8Lifetime2) {
              var6 = var8Lifetime2;
            }
          }
          var6 = var6 + this.field_Vb * 2;
          var7Lifetime3 = this.field_Zb * this.field_Wb + this.field_Sb + this.field_Sb;
          var8Lifetime3 = fp.a(-1, var6, param4, param3);
          var9Lifetime2 = br.a(var7Lifetime3, param0, param2, 122);
          this.a(var7Lifetime3, var9Lifetime2, var8Lifetime3, var6, (byte) 64);
          for (var10Lifetime2 = 0; var10Lifetime2 < this.field_Wb; var10Lifetime2++) {
            this.field_Xb[var10Lifetime2].a(-10411, this.field_Zb * var10Lifetime2 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6 - 2 * this.field_Vb);
          }
          return;
        }
        this.field_Xb[this.field_Wb] = new rk(0L, (mh) null, (mh) null, this.field_Pb, (RgbSprite) null, gg.field_m);
        this.field_Xb[this.field_Wb].field_Q = 1;
        this.a(this.field_Xb[this.field_Wb], 0);
        this.field_cc[this.field_Wb] = -1;
        this.field_Wb = this.field_Wb + 1;
        var6Lifetime1 = 0;
        if (param1 < -49) {
          for (var7Lifetime1 = 0; this.field_Wb > var7Lifetime1; var7Lifetime1++) {
            var8Lifetime1 = this.field_Xb[var7Lifetime1].a(this.field_Yb, 24, this.field_Qb);
            if (var6Lifetime1 < var8Lifetime1) {
              var6Lifetime1 = var8Lifetime1;
            }
          }
          var6Lifetime1 = var6Lifetime1 + this.field_Vb * 2;
          var7Lifetime1 = this.field_Zb * this.field_Wb + this.field_Sb + this.field_Sb;
          var8Lifetime1 = fp.a(-1, var6Lifetime1, param4, param3);
          var9Lifetime1 = br.a(var7Lifetime1, param0, param2, 122);
          this.a(var7Lifetime1, var9Lifetime1, var8Lifetime1, var6Lifetime1, (byte) 64);
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_Wb; var10Lifetime1++) {
            this.field_Xb[var10Lifetime1].a(-10411, this.field_Zb * var10Lifetime1 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6Lifetime1 - 2 * this.field_Vb);
          }
        } else {
          this.field_Zb = -94;
          for (var7Lifetime1 = 0; this.field_Wb > var7Lifetime1; var7Lifetime1++) {
            var8Lifetime1 = this.field_Xb[var7Lifetime1].a(this.field_Yb, 24, this.field_Qb);
            if (var6Lifetime1 < var8Lifetime1) {
              var6Lifetime1 = var8Lifetime1;
            }
          }
          var6Lifetime1 = var6Lifetime1 + this.field_Vb * 2;
          var7Lifetime1 = this.field_Zb * this.field_Wb + this.field_Sb + this.field_Sb;
          var8Lifetime1 = fp.a(-1, var6Lifetime1, param4, param3);
          var9Lifetime1 = br.a(var7Lifetime1, param0, param2, 122);
          this.a(var7Lifetime1, var9Lifetime1, var8Lifetime1, var6Lifetime1, (byte) 64);
          for (var10Lifetime1 = 0; var10Lifetime1 < this.field_Wb; var10Lifetime1++) {
            this.field_Xb[var10Lifetime1].a(-10411, this.field_Zb * var10Lifetime1 + this.field_Sb, this.field_Qb, this.field_Yb, this.field_Vb, this.field_Zb, var6Lifetime1 - 2 * this.field_Vb);
          }
        }
    }

    static {
        field_ac = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Ub = "To report a player, right-click on their name and select the option to report abuse.";
        field_Rb = "Breaking real-world laws";
    }
}
