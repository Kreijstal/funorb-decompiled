/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends hd {
    private vu[] field_Eb;
    private bb[] field_Ob;
    private char[] field_Hb;
    static java.math.BigInteger field_Nb;
    private int field_zb;
    private int field_Bb;
    private int field_yb;
    private int field_Gb;
    private int[] field_Jb;
    private bb field_Kb;
    private int field_Cb;
    static String field_Ib;
    static int[] field_Mb;
    static String field_Db;
    private int field_Fb;
    private int field_Ab;
    private int field_Lb;

    final int h(byte param0) {
        int var2 = 22 % ((-56 - param0) / 60);
        return this.field_Bb + (null == this.field_Kb ? 0 : this.field_Kb.h((byte) 107));
    }

    final boolean h(int param0) {
        int var2;
        vu[] var3;
        int var4;
        vu var5;
        int var6;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_17_0 = 0;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = this.field_Eb;
        var4 = 0;
        while (var3.length > var4) {
          var5 = var3[var4];
          stackIn_5_0 = var2;
          stackIn_5_1 = var5.field_sb;
          if (stackIn_5_1 == 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          var2 = stackIn_5_0 | stackIn_8_1;
          var4++;
        }
        if (param0 > -95) {
          this.field_Fb = -119;
        }
        if (var2 == 0 &&
          -1 != this.field_Cb &&
          null != this.field_Ob[this.field_Cb]) {
          stackIn_17_0 = (!this.field_Ob[this.field_Cb].h(-128)) ? 0 : 1;
          var2 = stackIn_17_0;
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, byte param2) {
        int var4_int = 0;
        vu var5;
        int var6;
        vu stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        bb var4;
        bb var7;
        var6 = Kickabout.field_G;
        for (var4_int = 0; this.field_Eb.length > var4_int; var4_int++) {
          var5 = this.field_Eb[var4_int];
          if (1 == var5.field_sb) {
            this.a(var4_int, (byte) -51, param1, param0);
            stackIn_7_0 = var5;
            stackIn_8_1 = (var4_int == this.field_Cb);
            stackIn_7_0.field_I = stackIn_8_1;
          }
        }
        if (this.field_Cb != -1) {
          var7 = this.field_Ob[this.field_Cb];
          var4 = var7;
          if (var4 != null) {
            var7.b(param0, param1, (byte) -127);
          }
        }
        if (this.field_zb > 0) {
          this.b(param2 ^ 4, this.field_zb - 1);
        }
        if (param2 != -127) {
          field_Nb = (java.math.BigInteger) null;
        }
    }

    public static void b(int param0) {
        field_Db = null;
        field_Nb = null;
        field_Mb = null;
        if (param0 < 26) {
          bb.a((byte) 45, 76);
        }
        field_Ib = null;
    }

    bb(long param0, hd param1, hd param2, hd param3, bb[] param4, int[] param5, String[] param6, char[] param7) {
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
        hu var17 = null;
        hu var18 = null;
        this.field_Cb = -1;
        try {
          this.field_Ob = param4;
          this.field_Jb = param5;
          this.field_Hb = param7;
          this.field_Fb = this.field_Jb.length;
          var17 = param3.field_X;
          var18 = var17;
          this.field_Ab = var18.field_p + (2 + var18.field_G);
          this.field_Gb = 0;
          this.field_Eb = new vu[this.field_Fb];
          this.field_yb = this.field_Fb * this.field_Ab;
          var11 = "<col=999999>";
          var12 = "</col>";
          for (var13 = 0; this.field_Fb > var13; var13++) {
            if (this.field_Hb[var13] > 0) {
              param6[var13] = var11 + bn.a(this.field_Hb[var13], (byte) -83).toUpperCase() + ": " + var12 + param6[var13];
            }
            var14 = null;
            if (this.field_Ob[var13] != null ||
              this.field_Jb[var13] == -1) {
              var14 = ci.field_g;
            }
            this.field_Eb[var13] = new vu(0L, param2, (hd) null, param3, (ut) (var14), param6[var13]);
            this.a((byte) -112, (hd) (this.field_Eb[var13]));
            var15 = var17.a(param6[var13]);
            if (var15 > this.field_Gb) {
              this.field_Gb = var15;
            }
          }
          this.field_Gb = this.field_Gb + (ci.field_g.field_o + 10);
          this.b(-88, 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("bb.<init>(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var3 = 0;
        vu var4 = null;
        int var5 = Kickabout.field_G;
        vu[] var6 = this.field_Eb;
        vu[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          var4.field_sb = 0;
          var4.field_I = false;
        }
        if (param0 != 5075) {
          this.b(-73, 28);
        }
        if (null != this.field_Kb) {
          this.field_Kb.a(5075);
          this.field_Kb.c((byte) -109);
        }
        this.field_Cb = -1;
        this.field_Kb = null;
        this.b(param0 ^ -5005, 12);
    }

    final static ff a(byte param0, int param1) {
        int var4 = 0;
        int var2;
        ff[] var3;
        int var5;
        var5 = Kickabout.field_G;
        var2 = -45 % ((param0 - 92) / 32);
        var3 = rp.b(-27666);
        for (var4 = 0; var3.length > var4; var4++) {
          if (param1 == var3[var4].field_a) {
            return var3[var4];
          }
        }
        return null;
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3 = 0;
        int var6 = Kickabout.field_G;
        this.field_zb = param1;
        if (param0 >= -84) {
          return;
        }
        for (var5 = 0; var5 < this.field_Fb; var5++) {
          var4 = this.field_zb * this.field_zb;
          var3 = this.field_Ab * var5;
          this.field_Eb[var5].field_J = (var4 * (this.field_Lb - this.field_T) + var3 * (-var4 + 144)) / 144;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var7 = Kickabout.field_G;
        if (this.field_Cb == param0) {
          this.a(5075);
          this.b(-90, 0);
        } else {
          if (this.field_Ob[param0] != null) {
            this.a(5075);
            this.b(-117, 0);
            this.field_Cb = param0;
            this.field_Kb = this.field_Ob[this.field_Cb];
            ds.a(-1, this.field_Kb);
            this.field_Kb.b(-94, 12);
          } else {
            if (this.field_Jb[param0] != -1) {
              var5 = this.field_Jb[param0] | 32768;
              var6 = ov.field_b;
              if (var6 == 0 &&
                uv.field_i != null) {
                var6 = 1;
              }
              if (r.a(0, var6) == 2) {
                gd.a(21, 1, var6, param2);
              }
              String var8 = (String) null;
              gp.a(var5, -128, ov.field_b, param3, at.field_Kb, (String) null);
              gk.a(at.field_Kb, var5, ik.field_A, ov.field_b, (byte) -51);
              fa.b(125);
              jm.b(68);
            } else {
              gw.a(8);
              fa.b(-123);
            }
          }
        }
        if (param1 > -20) {
          this.h(-11);
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int var7 = 0;
        int var4;
        int var5;
        int var6;
        int var8;
        int stackIn_3_0 = 0;
        var8 = Kickabout.field_G;
        stackIn_3_0 = (cc.field_e != 85) ? 0 : 1;
        var4 = stackIn_3_0;
        if (null != this.field_Kb) {
          if (var4 != 0 &&
            -1 == this.field_Kb.field_Cb) {
            this.a(5075);
            this.b(-105, 0);
            return true;
          }
          return this.field_Kb.a(param0, param1, (byte) -18);
        }
        if (null == this.field_Kb &&
          dr.field_g == this &&
          var4 != 0) {
          fa.b(98);
          return true;
        }
        var5 = il.field_c;
        var6 = -4 / ((param2 - 25) / 38);
        if (var5 <= 0) {
          return false;
        }
        if (var5 == ml.field_v) {
          var5 = 63;
        }
        for (var7 = 0; this.field_Hb.length > var7; var7++) {
          if (var5 == this.field_Hb[var7]) {
            this.a(var7, (byte) -115, param1, param0);
            return true;
          }
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        var9 = Kickabout.field_G;
        this.field_Bb = param1 * 2 + this.field_Gb;
        this.a(true, this.field_Bb, param2, param4 - this.field_yb, this.field_yb);
        if (this.field_Lb != param5) {
          this.field_Lb = param5;
          this.b(-119, this.field_zb);
        }
        var7 = 0;
        if (param0) {
          this.field_Jb = (int[]) null;
        }
        while (this.field_Fb > var7) {
          this.field_Eb[var7].a(param3, param1, this.field_Bb, this.field_Eb[var7].field_J, 0, 15114, this.field_Ab);
          var7++;
        }
        if (-1 != this.field_Cb &&
          this.field_Ob[this.field_Cb] != null) {
          var7Lifetime1 = this.field_Ob[this.field_Cb].field_Fb;
          for (var8 = (var7Lifetime1 + this.field_Cb) * this.field_Ab + this.field_J; param4 < var8; var8 = var8 - this.field_Ab) {
          }
          this.field_Ob[this.field_Cb].a(param0, param1, this.field_Bb + param2, param3, var8, this.field_Eb[this.field_Cb].field_T);
        }
    }

    static {
        field_Nb = new java.math.BigInteger("65537");
        field_Ib = "Loading extra data (2/2)";
        field_Db = "to the Quarter-Finals";
    }
}
