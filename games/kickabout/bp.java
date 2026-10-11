/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bp extends hd {
    int field_Db;
    static int field_Gb;
    sr[] field_zb;
    static String field_yb;
    private im[] field_Fb;
    private int field_Eb;
    private hd field_Ab;
    private tk field_Cb;
    private hd[] field_Bb;

    final void a(boolean param0, boolean param1) {
        int var3_int = 0;
        int var4 = 0;
        int var6;
        im[] var3;
        im var5;
        im[] var7;
        var6 = Kickabout.field_G;
        this.field_Cb.a(32 * id.field_v, param1, (byte) -108, 32);
        for (var3_int = 0; var3_int < this.field_Bb.length; var3_int++) {
          if (this.field_Bb[var3_int].field_sb == 1) {
            sp.c(45, 81);
            this.b(var3_int, 99);
          }
        }
        var7 = this.field_Fb;
        var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          var5.c(0, param0);
        }
    }

    final static byte[] a(int param0, ml param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Kickabout.field_G;
        try {
          if (param0 != 2280703) {
            field_Gb = 6;
          }
          var4_int = param1.l(param3, 59);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new byte[var4_int];
          }
          var5 = param1.l(3, 59);
          var6 = (byte)param1.l(8, 59);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)(var6 + param1.l(var5, 59));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (byte)var6;
            }
          }
          stackIn_18_0 = (byte[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("bp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          return;
        }
        this.field_Ab.field_J = param1;
    }

    final void a(im[] param0, int param1) {
        try {
          this.a(param1, (byte) -47, param0, param0.length);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "bp.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, im[] param2, int param3) {
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        im[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        im[] var6_ref_im__ = null;
        int var7_int = 0;
        im[] var7 = null;
        im var7_ref = null;
        im var8_ref_im = null;
        im var9 = null;
        int var10 = 0;
        im[] var11 = null;
        im[] var12 = null;
        int var13 = 0;
        int var6Lifetime1;
        int var7_intLifetime1;
        var10 = Kickabout.field_G;
        try {
          this.field_Fb = param2;
          this.field_Ab.field_jb = new tf();
          this.field_Ab.field_J = 0;
          var11 = this.field_Fb;
          var5 = var11;
          for (var6 = 0; var6 < var11.length; var6++) {
            var7_ref = var11[var6];
            this.field_Ab.a((byte) -124, (hd) (var7_ref));
          }
          var5_int = 5 + param0 * (5 + this.field_Eb);
          var6_ref_im__ = this.field_Fb;
          for (var7_int = 0; var7_int < var6_ref_im__.length; var7_int++) {
            var8_ref_im = var6_ref_im__[var7_int];
            ((hd) ((Object) var8_ref_im)).field_J = var5_int;
            var5_int = var5_int + (5 + this.field_Eb);
          }
          var6Lifetime1 = 0;
          var13 = 0;
          var7_intLifetime1 = var13;
          while (this.field_Bb.length > var13) {
            var6Lifetime1 = var6Lifetime1 + this.field_Bb[var13].field_q;
            var13++;
          }
          if (param1 != -47) {
            this.j((byte) -4);
          }
          var12 = this.field_Fb;
          var7 = this.field_Fb;
          for (var8 = 0; var8 < var12.length; var8++) {
            var9 = var12[var8];
            ((hd) ((Object) var9)).field_q = var6Lifetime1;
          }
          if (this.field_Fb.length == 0) {
            this.field_Ab.field_mb = 0;
          } else {
            this.field_Ab.field_mb = param3 * (this.field_Eb + 5) + 5;
          }
          this.a(this.field_mb, (byte) -126, this.field_J, this.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("bp.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          field_yb = (String) null;
        }
        field_yb = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        this.a(true, this.field_q, param3, param2, param0);
        if (param1 > -108) {
          this.field_Fb = (im[]) null;
        }
        this.field_Ab.a(true, this.field_q - 25, 0, 0, this.field_Ab.field_mb);
        this.field_Cb.a(15, 5, 0, (byte) -103, -20 + param0, 15 + this.field_Ab.field_q, 20);
        this.field_Cb.field_Eb.a(true, 15, -15 + this.field_Cb.field_q, 5, this.field_Cb.field_mb - 10);
        this.field_Cb.field_Eb.b(-this.field_Cb.field_Db.field_J, this.field_Cb.field_Db.field_mb, 100, this.field_Cb.field_Gb.field_mb);
    }

    final int h(byte param0) {
        int var2 = -111 / ((70 - param0) / 52);
        return this.field_Ab.field_J;
    }

    final int b(int param0) {
        if (param0 < 30) {
          field_yb = (String) null;
        }
        return this.field_Db;
    }

    final void a(sr param0, int param1) {
        int var5 = 0;
        int var4 = 0;
        int var3_int = 0;
        im[] var4_ref_im__ = null;
        im var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = Kickabout.field_G;
        try {
          ql.a(this.field_Fb, param0, (byte) 124);
          var3_int = 5;
          var4_ref_im__ = this.field_Fb;
          for (var5 = 0; var5 < var4_ref_im__.length; var5++) {
            var6 = var4_ref_im__[var5];
            ((hd) ((Object) var6)).field_J = var3_int;
            var3_int = var3_int + (5 + this.field_Eb);
          }
          if (param1 <= 30) {
            this.field_Fb = (im[]) null;
          }
          this.field_Db = -1;
          for (var4 = 0; this.field_zb.length > var4; var4++) {
            if (this.field_zb[var4] == param0) {
              this.field_Db = var4;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bp.L(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    void b(int param0, int param1) {
        if (param1 < 97) {
          return;
        }
        sr var3 = this.field_zb[param0];
        if (var3 != null) {
          var3.a(param0 == this.field_Db ? true : false, 93);
          this.a(var3, 57);
        }
    }

    final void a(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_35_0 = 0;
        ji var2_ref_ji;
        int var2;
        int var4;
        im var5;
        int var5_int;
        int var6;
        int var7;
        int var8;
        int var9;
        sr var10;
        ut var11;
        int var12;
        hd var13;
        im[] var14;
        int var2Lifetime1;
        int var4Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        var12 = Kickabout.field_G;
        on.a(this.field_F, this.field_T + 20, this.field_q, this.field_mb - 20, 16777215, 60);
        if (this.field_Cb.field_Eb.e((byte) -113)) {
          var2_ref_ji = this.field_Cb.field_Eb;
          on.g(3 + ((hd) ((Object) var2_ref_ji)).field_F, ((hd) ((Object) var2_ref_ji)).field_T, ((hd) ((Object) var2_ref_ji)).field_q - 6, ((hd) ((Object) var2_ref_ji)).field_mb);
        }
        for (var2 = 0; var2 < this.field_Bb.length; var2++) {
          var13 = this.field_Bb[var2];
          if (!var13.field_gb) {
            stackIn_10_0 = (var13.field_qb != 0) ? 1 : 0;
          } else {
            stackIn_10_0 = 1;
          }
          var4 = stackIn_10_0;
          pt.a(var13.field_F + var13.field_q, -22914, var13.field_F, var13.field_T - (-var13.field_mb + 1), var13.field_T);
          stackIn_13_0 = (var4 != 0) ? 65793 : 5592405;
          var5_int = stackIn_13_0;
          on.a(1 + var13.field_F, var13.field_T, -1 + var13.field_q, 40, 10, 16777215, 60);
          if (var4 != 0) {
            on.a(var13.field_F + 1, var13.field_T, -1 + var13.field_q, 40, 10, 2280703, 90);
          }
          ta.e(118);
          var6 = (var13.field_q >> 1) + var13.field_F;
          var7 = -5 + (20 + var13.field_T);
          if (this.field_Db == var2) {
            var6 -= 4;
            var8 = (q.field_d.a(var13.field_E) >> 1) + (4 + var6);
            var9 = -10 + var7;
            var10 = this.field_zb[this.field_Db];
            if (var10.a(-113) == 2) {
              if (1 == var10.field_i) {
                eo.field_b.c(var8, var9 - 1);
              } else {
                eo.field_b.b(var8, var9);
              }
            } else {
              var11 = eo.field_l[var10.field_i % 3];
              if (var10.field_i >= 3) {
                var11.b(var8, -1 + var9);
              } else {
                var11.c(var8, var9);
              }
            }
          }
          q.field_d.d(var13.field_E, var6, var7, 16777215, var5_int);
        }
        pt.a(this.field_Cb.field_q + this.field_Cb.field_F, -22914, this.field_Cb.field_F, this.field_Cb.field_mb + this.field_Cb.field_T, this.field_Cb.field_T);
        var2Lifetime1 = 103 % ((param0 - 33) / 56);
        var14 = this.field_Fb;
        for (var4Lifetime1 = 0; var14.length > var4Lifetime1; var4Lifetime1++) {
          var5 = var14[var4Lifetime1];
          var6Lifetime1 = -1;
          if (!var5.b(15377)) {
            var7Lifetime1 = var5.field_F;
            if (!var5.field_gb) {
              for (var8Lifetime1 = 0; var8Lifetime1 < this.field_Bb.length; var8Lifetime1++) {
                if (!this.field_Bb[var8Lifetime1].field_gb) {
                  on.g(var7Lifetime1, var5.field_T, this.field_Bb[var8Lifetime1].field_q, var5.field_mb);
                } else {
                  on.a(var7Lifetime1, var5.field_T, this.field_Bb[var8Lifetime1].field_q, var5.field_mb, 2280703, 90);
                  stackIn_35_0 = (var8Lifetime1 == this.field_Bb.length - 1) ? 0 : 1;
                  var9Lifetime1 = stackIn_35_0;
                  on.e(var7Lifetime1, var5.field_T, var9Lifetime1 + this.field_Bb[var8Lifetime1].field_q, var5.field_mb, 65793);
                }
                var7Lifetime1 = var7Lifetime1 + this.field_Bb[var8Lifetime1].field_q;
              }
            } else {
              on.a(var5.field_F, var5.field_T, var5.field_q, var5.field_mb, 2280703, 90);
            }
            on.e(var5.field_F, var5.field_T, var5.field_q, var5.field_mb, 65793);
            for (var8Lifetime1Lifetime1 = 0; var8Lifetime1Lifetime1 < 4; var8Lifetime1Lifetime1++) {
              on.h(-var8Lifetime1Lifetime1 + (var5.field_F + 3), -var8Lifetime1Lifetime1 + 3 + var5.field_T, var8Lifetime1Lifetime1 - 6 + (var5.field_q + var8Lifetime1Lifetime1), var5.field_mb + (-6 + var8Lifetime1Lifetime1 + var8Lifetime1Lifetime1), 65793, var8Lifetime1Lifetime1 << 4);
            }
            for (var8Lifetime1Lifetime2 = 0; var8Lifetime1Lifetime2 < this.field_Bb.length; var8Lifetime1Lifetime2++) {
              if (this.field_Bb[var8Lifetime1Lifetime2].field_gb) {
                var6Lifetime1 = var8Lifetime1Lifetime2;
              }
            }
          }
          var5.b(0, var6Lifetime1);
        }
        ta.e(127);
    }

    final int j(byte param0) {
        int stackIn_6_0 = 0;
        if (param0 != 34) {
          this.field_Eb = 0;
        }
        if (this.field_Db != -1 &&
          null != this.field_zb[this.field_Db]) {
          stackIn_6_0 = this.field_zb[this.field_Db].field_i;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int i(byte param0) {
        if (param0 != -124) {
          this.field_Ab = (hd) null;
        }
        return Math.abs(this.field_Ab.field_J / (5 + this.field_Eb));
    }

    bp(int[] param0, String[] param1, sr[] param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        hd[] var6 = null;
        hd var8 = null;
        this.field_Db = -1;
        try {
          this.field_Eb = param3;
          this.field_zb = param2;
          this.field_Bb = new hd[param0.length];
          var5_int = 5;
          for (var6_int = 0; var6_int < this.field_Bb.length; var6_int++) {
            this.field_Bb[var6_int] = new hd();
            this.field_Bb[var6_int].a(true, param0[var6_int], var5_int, 0, 20);
            this.field_Bb[var6_int].field_E = param1[var6_int];
            var5_int = var5_int + param0[var6_int];
          }
          var6 = this.field_Bb;
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            this.a((byte) -106, var8);
          }
          this.field_Ab = new hd();
          this.field_Cb = new tk(0L, this.field_Ab, new hd(), rr.field_b);
          this.a((byte) -110, (hd) (this.field_Cb));
          this.field_q = 15 + (var5_int + 10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("bp.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_Gb = 2;
        field_yb = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
