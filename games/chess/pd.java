/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ci {
    static String field_Ob;
    private ci field_Kb;
    static String field_Jb;
    static int field_Tb;
    static ln field_Rb;
    static jc field_Sb;
    private ci field_Ib;
    static volatile int field_Eb;
    private ci field_Hb;
    private ci field_Qb;
    private int field_Pb;
    static int field_Fb;
    static long[] field_Nb;
    static un field_Lb;
    private ci field_Mb;
    private ci field_Gb;

    final static boolean a(byte param0, ve param1, ve param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          if (param0 != -15) {
            return true;
          }
          var3_int = -param2.field_Ib + param1.field_Ib;
          if (f.field_a == param1.field_Lb) {
            var3_int -= 200;
          } else {
            if (null == param1.field_Lb) {
              var3_int += 200;
            }
          }
          if (param2.field_Lb == f.field_a) {
            var3_int += 200;
          } else {
            if (null == param2.field_Lb) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("pd.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          var2_int = param0.charAt(0);
          if (param1 < 81) {
            var5 = (String) null;
            pd.a((String) null, (byte) -8);
          }
          var3 = 1;
          while (true) {
            if (param0.length() <= var3) {
              return true;
            }
            if (param0.charAt(var3) == var2_int) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("pd.M(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Chess.field_G;
        try {
          dc.a(nj.field_t, param0, true, (byte) -123, bj.field_gb, ed.field_b, 0);
          for (var2_int = 0; var2_int < ed.field_b; var2_int++) {
            vn.field_Ab[var2_int + param0] = var2_int;
          }
          dc.a(bh.field_F, param0 + param0, false, (byte) -118, eb.field_y, ed.field_b + param0, param0);
          if (param1 >= -102) {
            pd.a(-89, -57, 110);
          }
          if (ed.field_b > param0) {
            ed.field_b = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "pd.K(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        this.field_M = param7;
        this.field_V = param5;
        this.field_mb = param4;
        this.field_pb = param0;
        this.a(true, param3, param2, param1);
        if (param6 > -32) {
          field_Lb = (un) null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = ib.field_d != null ? 1 : 0;
        if (9 == vg.field_a &&
          ph.a(hn.field_s, (byte) -43, v.field_b, a.field_f, ca.field_i)) {
          if (hn.field_s != 2 &&
            var3 != 0) {
            return false;
          }
          return fl.a(ca.field_i, a.field_f, hn.field_s, v.field_b, (byte) 105);
        }
        if (vg.field_a == 10) {
          if (var3 != 0) {
            return false;
          }
          sh.a(false);
          return true;
        }
        if (vg.field_a == 11 &&
          dc.field_m) {
          if (vg.field_f == 2 &&
            !kn.a(hd.field_e, tj.field_m, 29712)) {
            return false;
          }
          if (vg.field_f != 2 &&
            var3 != 0) {
            return false;
          }
          if (dk.c(false)) {
            ke.a(param0 ^ -17303, vg.field_f, hd.field_e, param1, ja.field_i, (String) null);
          }
          return true;
        }
        if (param0 != -26057) {
          field_Fb = 32;
          return false;
        }
        return false;
    }

    public static void n(int param0) {
        field_Ob = null;
        field_Lb = null;
        field_Nb = null;
        field_Jb = null;
        field_Sb = null;
        if (param0 != 0) {
          return;
        }
        field_Rb = null;
    }

    final boolean o(int param0) {
        if (param0 != 25708) {
          return true;
        }
        if (0 != this.field_Kb.field_L) {
          this.field_Pb = 20;
          return true;
        }
        if (this.field_Kb.field_kb != 0) {
          if (this.field_Pb > 0) {
            this.field_Pb = this.field_Pb - 1;
          }
          if (this.field_Pb == 0 &&
            rf.field_b < this.field_Qb.field_wb + this.field_Qb.field_vb) {
            this.field_Pb = 3;
            return true;
          }
        }
        return false;
    }

    final boolean m(int param0) {
        if (param0 != 2) {
          this.m(12);
        }
        return this.field_Qb.field_kb != 0 ? true : false;
    }

    pd(long param0, pd param1) {
        this(param0, param1.field_Hb, param1.field_Ib, param1.field_Kb, param1.field_Qb);
    }

    final boolean l(int param0) {
        if (this.field_Mb.field_L != 0) {
          this.field_Pb = 20;
          return true;
        }
        if (this.field_Mb.field_kb == param0) {
          return false;
        }
        if (this.field_Pb > 0) {
          this.field_Pb = this.field_Pb - 1;
        }
        if (this.field_Pb == 0 &&
          this.field_Qb.field_pb + this.field_Qb.field_vb + (this.field_Qb.field_wb + this.field_Qb.field_N) <= rf.field_b) {
          this.field_Pb = 3;
          return true;
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        ci stackIn_14_0 = null;
        ci stackIn_14_1 = null;
        ci stackIn_14_2 = null;
        boolean stackIn_15_3 = false;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        ci var14;
        ci var15;
        ci var16;
        ci var17;
        ci var18;
        ci var19;
        if (this.field_M * 2 > this.field_pb) {
          var6 = this.field_pb / 2;
          var5 = this.field_pb / 2;
        } else {
          var6 = this.field_pb - this.field_M;
          var5 = this.field_M;
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (0 < param3) {
          var8 = var8 * param1 / param3;
          if (var8 < this.field_M) {
            var8 = this.field_M;
          }
          if (var7 < var8) {
            var8 = var7;
          }
        }
        var9 = -param1 + param3;
        var10 = -var8 + var7;
        var11 = 0;
        if (var9 > 0) {
          var11 = (var9 / 2 + var10 * param2) / var9;
        }
        var12 = var11 + var8 / 2;
        var14 = this.field_Hb;
        var14.field_V = 0;
        var14.field_M = this.field_M;
        var14.field_mb = 0;
        var14.field_pb = var5;
        var15 = this.field_Ib;
        var15.field_M = this.field_M;
        var15.field_V = var6;
        var15.field_mb = 0;
        var15.field_pb = -var6 + this.field_pb;
        var16 = this.field_Gb;
        var16.field_M = this.field_M;
        var16.field_mb = 0;
        var16.field_pb = var7;
        var16.field_V = var5;
        var17 = this.field_Kb;
        var17.field_M = this.field_M;
        var17.field_mb = 0;
        var17.field_V = 0;
        var17.field_pb = var12;
        var18 = this.field_Mb;
        var18.field_mb = 0;
        var18.field_V = var12;
        var18.field_pb = -var12 + var7;
        var18.field_M = this.field_M;
        var19 = this.field_Qb;
        var19.field_M = this.field_M;
        var19.field_pb = var8;
        stackIn_14_0 = this.field_Hb;
        stackIn_14_1 = this.field_Ib;
        stackIn_14_2 = this.field_Gb;
        stackIn_15_3 = (param3 <= param1) ? false : true;
        stackIn_14_2.field_tb = stackIn_15_3;
        stackIn_14_1.field_tb = stackIn_15_3;
        stackIn_14_0.field_tb = stackIn_15_3;
        var19.field_V = var11;
        if (!param0) {
          this.field_Gb = (ci) null;
        }
        var19.field_mb = 0;
    }

    final boolean k(int param0) {
        if (param0 != 3384) {
          return true;
        }
        if (0 != this.field_Hb.field_L) {
          this.field_Pb = 20;
          return true;
        }
        if (0 == this.field_Hb.field_kb) {
          return false;
        }
        if (this.field_Pb > 0) {
          this.field_Pb = this.field_Pb - 1;
        }
        if (this.field_Pb == 0) {
          this.field_Pb = 3;
          return true;
        }
        return false;
    }

    pd(long param0, ci param1, ci param2, ci param3, ci param4) {
        super(param0, (ci) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ci var9 = null;
        ci var10 = null;
        try {
          this.field_Hb = new ci(0L, param1);
          this.field_Ib = new ci(0L, param2);
          this.a((byte) 127, this.field_Hb);
          this.a((byte) 123, this.field_Ib);
          this.field_Gb = new ci(0L, (ci) null);
          this.a((byte) 124, this.field_Gb);
          this.field_Kb = new ci(0L, param3);
          this.field_Mb = new ci(0L, param3);
          this.field_Mb.field_w = true;
          var9 = this.field_Kb;
          var10 = var9;
          var10.field_w = true;
          this.field_Gb.a((byte) 127, this.field_Kb);
          this.field_Gb.a((byte) 124, this.field_Mb);
          this.field_Qb = new ci(0L, param4);
          this.field_Qb.field_rb = true;
          this.field_Gb.a((byte) 124, this.field_Qb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("pd.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int b(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = -this.field_Qb.field_pb + this.field_Gb.field_pb;
        if (0 < var6) {
          var7 = this.field_Qb.field_V;
          var8 = -param3 + param1;
          var5 = (var8 * var7 + var6 / 2) / var6;
        }
        if (param0 != -1) {
          this.m(52);
        }
        if (param2) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 > param1 - param3) {
            var5 = param1 - param3;
          }
        } else {
          if (var5 > -param3 + param1) {
            var5 = -param3 + param1;
          }
          if (var5 < 0) {
            var5 = 0;
          }
        }
        return var5;
    }

    final boolean f(byte param0) {
        if (0 != this.field_Ib.field_L) {
          this.field_Pb = 20;
          return true;
        }
        if (0 != this.field_Ib.field_kb) {
          if (0 < this.field_Pb) {
            this.field_Pb = this.field_Pb - 1;
          }
          if (this.field_Pb == 0) {
            this.field_Pb = 3;
            return true;
          }
        }
        if (param0 != -38) {
          this.field_Ib = (ci) null;
          return false;
        }
        return false;
    }

    static {
        field_Ob = "Orb points: ";
        field_Tb = 9;
        field_Jb = "Invite only";
        field_Eb = 0;
        field_Nb = new long[1000];
    }
}
