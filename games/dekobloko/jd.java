/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends w {
    private int field_Nb;
    private w field_Sb;
    private w field_Vb;
    static long[] field_Ub;
    private w field_Wb;
    static String field_Xb;
    static boolean field_Qb;
    private w field_Rb;
    static String field_Ob;
    static String field_Zb;
    private w field_Pb;
    private w field_Tb;
    static int field_Yb;

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        if (param1 != 88) {
          return -14;
        }
        int var5 = 0;
        int var6 = -this.field_Tb.field_N + this.field_Pb.field_N;
        if (0 < var6) {
          var7 = this.field_Tb.field_Ib;
          var8 = -param2 + param3;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (param0) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (var5 > -param2 + param3) {
            var5 = -param2 + param3;
            return var5;
          }
          return var5;
        }
        if (var5 > param3 - param2) {
          var5 = param3 - param2;
        }
        if (var5 < 0) {
          var5 = 0;
          return var5;
        }
        return var5;
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.length;
          var3 = new byte[var2_int];
          an.a(param1, 0, var3, param0, var2_int);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("jd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean i(byte param0) {
        if (this.field_Sb.field_ob != 0) {
          this.field_Nb = 20;
          return true;
        }
        if (this.field_Sb.field_gb != 0) {
          if (this.field_Nb > 0) {
            this.field_Nb = this.field_Nb - 1;
          }
          if (this.field_Nb == 0) {
            this.field_Nb = 3;
            return true;
          }
          if (param0 != 7) {
            this.g((byte) -98);
            return false;
          }
          return false;
        }
        if (param0 == 7) {
          return false;
        }
        this.g((byte) -98);
        return false;
    }

    final boolean g(byte param0) {
        if (param0 >= -59) {
          this.field_Tb = (w) null;
        }
        if (this.field_Wb.field_ob != 0) {
          this.field_Nb = 20;
          return true;
        }
        if (this.field_Wb.field_gb == 0) {
          return false;
        }
        if (0 < this.field_Nb) {
          this.field_Nb = this.field_Nb - 1;
        }
        if (this.field_Nb != 0) {
          return false;
        }
        if (this.field_Tb.field_pb + this.field_Tb.field_Mb <= pm.field_f) {
          return false;
        }
        this.field_Nb = 3;
        return true;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_mb = param4;
        this.field_Ib = param7;
        this.field_vb = param0;
        this.field_N = param2;
        int var9 = 91 / ((73 - param1) / 40);
        this.a(param6, param3, -91, param5);
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        tj var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = client.field_A ? 1 : 0;
        try {
          if (param0 <= 4) {
            return;
          }
          fj.field_h = false;
          cd.field_m = null;
          g.field_N = null;
          if (null != i.field_b) {
            i.field_b.c(120);
            i.field_b = null;
          }
          ob.field_i = null;
          if (null != h.field_b) {
            h.field_b.c(118);
            h.field_b = null;
          }
          tg.field_b = null;
          if (oc.field_b != null) {
            oc.field_b.c(113);
            oc.field_b = null;
          }
          hn.field_h = null;
          if (ob.field_i == null) {
            return;
          }
          var3 = (tj) (ob.field_i.c(-9443));
          while (var3 != null) {
            var3.e((byte) 69);
            var3 = (tj) (ob.field_i.b(-123));
          }
          ob.field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "jd.K(" + param0 + ')');
        }
    }

    final boolean h(byte param0) {
        if (0 != this.field_Vb.field_ob) {
          this.field_Nb = 20;
          return true;
        }
        if (this.field_Vb.field_gb == 0) {
          if (param0 >= 67) {
            return false;
          }
          this.field_Wb = (w) null;
          return false;
        }
        if (this.field_Nb > 0) {
          this.field_Nb = this.field_Nb - 1;
        }
        if (this.field_Nb == 0) {
          this.field_Nb = 3;
          return true;
        }
        if (param0 >= 67) {
          return false;
        }
        this.field_Wb = (w) null;
        return false;
    }

    public static void e(int param0) {
        if (param0 != 32) {
          return;
        }
        field_Zb = null;
        field_Ub = null;
        field_Ob = null;
        field_Xb = null;
    }

    jd(long param0, w param1, w param2, w param3, w param4) {
        super(param0, (w) null);
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
        w var9 = null;
        w var10 = null;
        try {
          this.field_Sb = new w(0L, param1);
          this.field_Vb = new w(0L, param2);
          this.a(this.field_Sb, -16834);
          this.a(this.field_Vb, -16834);
          this.field_Pb = new w(0L, (w) null);
          this.a(this.field_Pb, -16834);
          this.field_Wb = new w(0L, param3);
          this.field_Rb = new w(0L, param3);
          var9 = this.field_Wb;
          var10 = var9;
          this.field_Rb.field_Gb = true;
          var10.field_Gb = true;
          this.field_Pb.a(this.field_Wb, -16834);
          this.field_Pb.a(this.field_Rb, -16834);
          this.field_Tb = new w(0L, param4);
          this.field_Tb.field_U = true;
          this.field_Pb.a(this.field_Tb, -16834);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("jd.<init>(").append(param0).append(',');
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
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        w var15 = null;
        int var14 = 0;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        w var19 = null;
        w var20 = null;
        w var15Lifetime1;
        w var16Lifetime1;
        w var17Lifetime1;
        w var18Lifetime1;
        w var19Lifetime1;
        w var20Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        if (this.field_N >= 2 * this.field_mb) {
          var6 = -this.field_mb + this.field_N;
          var5 = this.field_mb;
        } else {
          var6 = this.field_N / 2;
          var5 = this.field_N / 2;
        }
        int var7 = var6 - var5;
        int var8 = var7;
        if (0 < param1) {
          var8 = var8 * param0 / param1;
          if (!(this.field_mb <= var8)) {
            var8 = this.field_mb;
          }
          if (var7 < var8) {
            var8 = var7;
          }
          var9 = param1 - param0;
          var10 = -var8 + var7;
          var11 = 0;
          if (var9 > 0) {
            var11 = (param3 * var10 + var9 / 2) / var9;
          }
          var12 = var11 + var8 / 2;
          var15 = this.field_Sb;
          var15.field_mb = this.field_mb;
          var14 = 103 % ((param2 + 29) / 46);
          var15.field_N = var5;
          var15.field_Ib = 0;
          var15.field_vb = 0;
          var16 = this.field_Vb;
          var16.field_Ib = var6;
          var16.field_mb = this.field_mb;
          var16.field_N = this.field_N - var6;
          var16.field_vb = 0;
          var17 = this.field_Pb;
          var17.field_N = var7;
          var17.field_mb = this.field_mb;
          var17.field_vb = 0;
          var17.field_Ib = var5;
          var18 = this.field_Wb;
          var18.field_vb = 0;
          var18.field_N = var12;
          var18.field_Ib = 0;
          var18.field_mb = this.field_mb;
          var19 = this.field_Rb;
          var19.field_Ib = var12;
          var19.field_vb = 0;
          var19.field_N = -var12 + var7;
          var19.field_mb = this.field_mb;
          var20 = this.field_Tb;
          var20.field_mb = this.field_mb;
          var20.field_N = var8;
          var20.field_Ib = var11;
          this.field_Pb.field_Hb = param1 > param0 ? true : false;
          this.field_Vb.field_Hb = param1 > param0 ? true : false;
          this.field_Sb.field_Hb = param1 > param0 ? true : false;
          var20.field_vb = 0;
          return;
        }
        var9Lifetime1 = param1 - param0;
        var10Lifetime1 = -var8 + var7;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (param3 * var10Lifetime1 + var9Lifetime1 / 2) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var15Lifetime1 = this.field_Sb;
        var15Lifetime1.field_mb = this.field_mb;
        var14Lifetime1 = 103 % ((param2 + 29) / 46);
        var15Lifetime1.field_N = var5;
        var15Lifetime1.field_Ib = 0;
        var15Lifetime1.field_vb = 0;
        var16Lifetime1 = this.field_Vb;
        var16Lifetime1.field_Ib = var6;
        var16Lifetime1.field_mb = this.field_mb;
        var16Lifetime1.field_N = this.field_N - var6;
        var16Lifetime1.field_vb = 0;
        var17Lifetime1 = this.field_Pb;
        var17Lifetime1.field_N = var7;
        var17Lifetime1.field_mb = this.field_mb;
        var17Lifetime1.field_vb = 0;
        var17Lifetime1.field_Ib = var5;
        var18Lifetime1 = this.field_Wb;
        var18Lifetime1.field_vb = 0;
        var18Lifetime1.field_N = var12Lifetime1;
        var18Lifetime1.field_Ib = 0;
        var18Lifetime1.field_mb = this.field_mb;
        var19Lifetime1 = this.field_Rb;
        var19Lifetime1.field_Ib = var12Lifetime1;
        var19Lifetime1.field_vb = 0;
        var19Lifetime1.field_N = -var12Lifetime1 + var7;
        var19Lifetime1.field_mb = this.field_mb;
        var20Lifetime1 = this.field_Tb;
        var20Lifetime1.field_mb = this.field_mb;
        var20Lifetime1.field_N = var8;
        var20Lifetime1.field_Ib = var11Lifetime1;
        this.field_Pb.field_Hb = param1 > param0 ? true : false;
        this.field_Vb.field_Hb = param1 > param0 ? true : false;
        this.field_Sb.field_Hb = param1 > param0 ? true : false;
        var20Lifetime1.field_vb = 0;
    }

    jd(long param0, jd param1) {
        this(param0, param1.field_Sb, param1.field_Vb, param1.field_Wb, param1.field_Tb);
    }

    final boolean f(int param0) {
        if (this.field_Rb.field_ob != param0) {
          this.field_Nb = 20;
          return true;
        }
        if (this.field_Rb.field_gb == 0) {
          return false;
        }
        if (this.field_Nb > 0) {
          this.field_Nb = this.field_Nb - 1;
        }
        if (this.field_Nb != 0) {
          return false;
        }
        if (pm.field_f >= this.field_Tb.field_F + (this.field_Tb.field_N + this.field_Tb.field_Mb + this.field_Tb.field_pb)) {
          this.field_Nb = 3;
          return true;
        }
        return false;
    }

    final boolean j(byte param0) {
        if (param0 == -2) {
          return this.field_Tb.field_gb != 0 ? true : false;
        }
        this.a(58, -105, -107, 34);
        return this.field_Tb.field_gb != 0 ? true : false;
    }

    static {
        field_Zb = "Buying or selling an account";
        field_Ub = new long[32];
        field_Xb = "Orb points: ";
        field_Ob = "To Highscores";
    }
}
