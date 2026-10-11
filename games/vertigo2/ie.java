/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends cr {
    static String field_Rb;
    static fe field_Hb;
    private cr field_Mb;
    static String field_Sb;
    private cr field_Ib;
    private cr field_Lb;
    static int field_Kb;
    private cr field_Ob;
    static long field_Nb;
    private cr field_Qb;
    private cr field_Pb;
    private int field_Jb;

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        this.field_Fb = param1;
        this.field_db = param0;
        this.field_N = param2;
        if (param3 >= 99) {
          this.field_wb = param6;
          this.a(param5, param4, (byte) -52, param7);
          return;
        }
        this.field_Lb = (cr) null;
        this.field_wb = param6;
        this.a(param5, param4, (byte) -52, param7);
    }

    ie(long param0, ie param1) {
        this(param0, param1.field_Lb, param1.field_Qb, param1.field_Ib, param1.field_Pb);
    }

    public static void o(int param0) {
        field_Hb = null;
        if (param0 > -14) {
          return;
        }
        field_Sb = null;
        field_Rb = null;
    }

    final boolean p(int param0) {
        if (this.field_Lb.field_tb != 0) {
          this.field_Jb = 20;
          return true;
        }
        if (0 == this.field_Lb.field_xb) {
          if (param0 < -42) {
            return false;
          }
          this.m(13);
          return false;
        }
        if (0 < this.field_Jb) {
          this.field_Jb = this.field_Jb - 1;
        }
        if (0 == this.field_Jb) {
          this.field_Jb = 3;
          return true;
        }
        if (param0 < -42) {
          return false;
        }
        this.m(13);
        return false;
    }

    final boolean k(int param0) {
        if (param0 != 0) {
          return false;
        }
        return this.field_Pb.field_xb != 0 ? true : false;
    }

    final int a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = -this.field_Pb.field_db + this.field_Mb.field_db;
        if (var6 > 0) {
          var7 = this.field_Pb.field_N;
          var8 = -param3 + param0;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (param2) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (param0 - param3 < var5) {
            var5 = param0 - param3;
          }
        } else {
          if (var5 > param0 - param3) {
            var5 = param0 - param3;
          }
          if (var5 < 0) {
            var5 = 0;
          }
        }
        if (param1) {
          return var5;
        }
        field_Sb = (String) null;
        return var5;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cr var14 = null;
        cr var15 = null;
        cr var16 = null;
        cr var17 = null;
        cr var18 = null;
        cr var19 = null;
        cr var14Lifetime1;
        cr var14Lifetime2;
        cr var14Lifetime3;
        cr var15Lifetime1;
        cr var15Lifetime2;
        cr var15Lifetime3;
        cr var16Lifetime1;
        cr var16Lifetime2;
        cr var16Lifetime3;
        cr var17Lifetime1;
        cr var17Lifetime2;
        cr var17Lifetime3;
        cr var18Lifetime1;
        cr var18Lifetime2;
        cr var18Lifetime3;
        cr var19Lifetime1;
        cr var19Lifetime2;
        cr var19Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        if (this.field_db < this.field_Fb * 2) {
          var6 = this.field_db / 2;
          var5 = this.field_db / 2;
        } else {
          var5 = this.field_Fb;
          var6 = this.field_db - this.field_Fb;
        }
        int var7 = var6 - var5;
        if (param2 >= -43) {
          this.l(109);
          var8 = var7;
          if (0 < param0) {
            var8 = var8 * param3 / param0;
            if (var8 < this.field_Fb) {
              var8 = this.field_Fb;
            }
            if (var8 > var7) {
              var8 = var7;
            }
          }
          var9 = param0 - param3;
          var10 = -var8 + var7;
          var11 = 0;
          if (var9 > 0) {
            var11 = (param1 * var10 + var9 / 2) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Lb;
          var14.field_N = 0;
          var14.field_wb = 0;
          var14.field_Fb = this.field_Fb;
          var14.field_db = var5;
          var15 = this.field_Qb;
          var15.field_wb = 0;
          var15.field_db = -var6 + this.field_db;
          var15.field_Fb = this.field_Fb;
          var15.field_N = var6;
          var16 = this.field_Mb;
          var16.field_wb = 0;
          var16.field_N = var5;
          var16.field_Fb = this.field_Fb;
          var16.field_db = var7;
          var17 = this.field_Ib;
          var17.field_Fb = this.field_Fb;
          var17.field_wb = 0;
          var17.field_db = var12;
          var17.field_N = 0;
          var18 = this.field_Ob;
          var18.field_N = var12;
          var18.field_Fb = this.field_Fb;
          var18.field_db = var7 - var12;
          var18.field_wb = 0;
          var19 = this.field_Pb;
          var19.field_db = var8;
          var19.field_Fb = this.field_Fb;
          var19.field_N = var11;
          this.field_Mb.field_lb = param0 > param3 ? true : false;
          this.field_Qb.field_lb = param0 > param3 ? true : false;
          this.field_Lb.field_lb = param0 > param3 ? true : false;
          var19.field_wb = 0;
          return;
        }
        var8Lifetime1 = var7;
        if (0 >= param0) {
          var9Lifetime1 = param0 - param3;
          var10Lifetime1 = -var8Lifetime1 + var7;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (param1 * var10Lifetime1 + var9Lifetime1 / 2) / var9Lifetime1;
          }
          var12Lifetime1 = var11Lifetime1 + var8Lifetime1 / 2;
          var14Lifetime1 = this.field_Lb;
          var14Lifetime1.field_N = 0;
          var14Lifetime1.field_wb = 0;
          var14Lifetime1.field_Fb = this.field_Fb;
          var14Lifetime1.field_db = var5;
          var15Lifetime1 = this.field_Qb;
          var15Lifetime1.field_wb = 0;
          var15Lifetime1.field_db = -var6 + this.field_db;
          var15Lifetime1.field_Fb = this.field_Fb;
          var15Lifetime1.field_N = var6;
          var16Lifetime1 = this.field_Mb;
          var16Lifetime1.field_wb = 0;
          var16Lifetime1.field_N = var5;
          var16Lifetime1.field_Fb = this.field_Fb;
          var16Lifetime1.field_db = var7;
          var17Lifetime1 = this.field_Ib;
          var17Lifetime1.field_Fb = this.field_Fb;
          var17Lifetime1.field_wb = 0;
          var17Lifetime1.field_db = var12Lifetime1;
          var17Lifetime1.field_N = 0;
          var18Lifetime1 = this.field_Ob;
          var18Lifetime1.field_N = var12Lifetime1;
          var18Lifetime1.field_Fb = this.field_Fb;
          var18Lifetime1.field_db = var7 - var12Lifetime1;
          var18Lifetime1.field_wb = 0;
          var19Lifetime1 = this.field_Pb;
          var19Lifetime1.field_db = var8Lifetime1;
          var19Lifetime1.field_Fb = this.field_Fb;
          var19Lifetime1.field_N = var11Lifetime1;
          this.field_Mb.field_lb = param0 > param3 ? true : false;
          this.field_Qb.field_lb = param0 > param3 ? true : false;
          this.field_Lb.field_lb = param0 > param3 ? true : false;
          var19Lifetime1.field_wb = 0;
          return;
        }
        var8Lifetime1 = var8Lifetime1 * param3 / param0;
        if (var8Lifetime1 < this.field_Fb) {
          var8Lifetime1 = this.field_Fb;
        }
        if (var8Lifetime1 <= var7) {
          var9Lifetime2 = param0 - param3;
          var10Lifetime2 = -var8Lifetime1 + var7;
          var11Lifetime2 = 0;
          if (var9Lifetime2 > 0) {
            var11Lifetime2 = (param1 * var10Lifetime2 + var9Lifetime2 / 2) / var9Lifetime2;
          }
          var12Lifetime2 = var11Lifetime2 + var8Lifetime1 / 2;
          var14Lifetime2 = this.field_Lb;
          var14Lifetime2.field_N = 0;
          var14Lifetime2.field_wb = 0;
          var14Lifetime2.field_Fb = this.field_Fb;
          var14Lifetime2.field_db = var5;
          var15Lifetime2 = this.field_Qb;
          var15Lifetime2.field_wb = 0;
          var15Lifetime2.field_db = -var6 + this.field_db;
          var15Lifetime2.field_Fb = this.field_Fb;
          var15Lifetime2.field_N = var6;
          var16Lifetime2 = this.field_Mb;
          var16Lifetime2.field_wb = 0;
          var16Lifetime2.field_N = var5;
          var16Lifetime2.field_Fb = this.field_Fb;
          var16Lifetime2.field_db = var7;
          var17Lifetime2 = this.field_Ib;
          var17Lifetime2.field_Fb = this.field_Fb;
          var17Lifetime2.field_wb = 0;
          var17Lifetime2.field_db = var12Lifetime2;
          var17Lifetime2.field_N = 0;
          var18Lifetime2 = this.field_Ob;
          var18Lifetime2.field_N = var12Lifetime2;
          var18Lifetime2.field_Fb = this.field_Fb;
          var18Lifetime2.field_db = var7 - var12Lifetime2;
          var18Lifetime2.field_wb = 0;
          var19Lifetime2 = this.field_Pb;
          var19Lifetime2.field_db = var8Lifetime1;
          var19Lifetime2.field_Fb = this.field_Fb;
          var19Lifetime2.field_N = var11Lifetime2;
          this.field_Mb.field_lb = param0 > param3 ? true : false;
          this.field_Qb.field_lb = param0 > param3 ? true : false;
          this.field_Lb.field_lb = param0 > param3 ? true : false;
          var19Lifetime2.field_wb = 0;
          return;
        }
        var8Lifetime2 = var7;
        var9Lifetime3 = param0 - param3;
        var10Lifetime3 = -var8Lifetime2 + var7;
        var11Lifetime3 = 0;
        if (var9Lifetime3 > 0) {
          var11Lifetime3 = (param1 * var10Lifetime3 + var9Lifetime3 / 2) / var9Lifetime3;
        }
        var12Lifetime3 = var11Lifetime3 + var8Lifetime2 / 2;
        var14Lifetime3 = this.field_Lb;
        var14Lifetime3.field_N = 0;
        var14Lifetime3.field_wb = 0;
        var14Lifetime3.field_Fb = this.field_Fb;
        var14Lifetime3.field_db = var5;
        var15Lifetime3 = this.field_Qb;
        var15Lifetime3.field_wb = 0;
        var15Lifetime3.field_db = -var6 + this.field_db;
        var15Lifetime3.field_Fb = this.field_Fb;
        var15Lifetime3.field_N = var6;
        var16Lifetime3 = this.field_Mb;
        var16Lifetime3.field_wb = 0;
        var16Lifetime3.field_N = var5;
        var16Lifetime3.field_Fb = this.field_Fb;
        var16Lifetime3.field_db = var7;
        var17Lifetime3 = this.field_Ib;
        var17Lifetime3.field_Fb = this.field_Fb;
        var17Lifetime3.field_wb = 0;
        var17Lifetime3.field_db = var12Lifetime3;
        var17Lifetime3.field_N = 0;
        var18Lifetime3 = this.field_Ob;
        var18Lifetime3.field_N = var12Lifetime3;
        var18Lifetime3.field_Fb = this.field_Fb;
        var18Lifetime3.field_db = var7 - var12Lifetime3;
        var18Lifetime3.field_wb = 0;
        var19Lifetime3 = this.field_Pb;
        var19Lifetime3.field_db = var8Lifetime2;
        var19Lifetime3.field_Fb = this.field_Fb;
        var19Lifetime3.field_N = var11Lifetime3;
        this.field_Mb.field_lb = param0 > param3 ? true : false;
        this.field_Qb.field_lb = param0 > param3 ? true : false;
        this.field_Lb.field_lb = param0 > param3 ? true : false;
        var19Lifetime3.field_wb = 0;
    }

    final static qj q(int param0) {
        if (param0 == 20) {
          return new qj(eb.a(-1), ln.c(132199140));
        }
        ie.o(-87);
        return new qj(eb.a(-1), ln.c(132199140));
    }

    final static void b(int param0, boolean param1) {
        if (param0 != 20983) {
          return;
        }
        e.a(param1, (byte) -128);
        if (null != ko.field_S) {
          oh.a(ko.field_S, false);
        }
    }

    final boolean m(int param0) {
        if (0 != this.field_Qb.field_tb) {
          this.field_Jb = 20;
          return true;
        }
        if (this.field_Qb.field_xb != 0) {
          if (this.field_Jb > 0) {
            this.field_Jb = this.field_Jb - 1;
            if (this.field_Jb == 0) {
              this.field_Jb = 3;
              return true;
            }
            if (param0 < 20) {
              this.l(30);
              return false;
            }
            return false;
          }
          if (this.field_Jb == 0) {
            this.field_Jb = 3;
            return true;
          }
          if (param0 < 20) {
            this.l(30);
            return false;
          }
          return false;
        }
        if (param0 >= 20) {
          return false;
        }
        this.l(30);
        return false;
    }

    ie(long param0, cr param1, cr param2, cr param3, cr param4) {
        super(param0, (cr) null);
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
        cr var9 = null;
        cr var10 = null;
        try {
          this.field_Lb = new cr(0L, param1);
          this.field_Qb = new cr(0L, param2);
          this.b(this.field_Lb, 126);
          this.b(this.field_Qb, 125);
          this.field_Mb = new cr(0L, (cr) null);
          this.b(this.field_Mb, 125);
          this.field_Ib = new cr(0L, param3);
          this.field_Ob = new cr(0L, param3);
          var9 = this.field_Ib;
          var10 = var9;
          this.field_Ob.field_jb = true;
          var10.field_jb = true;
          this.field_Mb.b(this.field_Ib, 123);
          this.field_Mb.b(this.field_Ob, 118);
          this.field_Pb = new cr(0L, param4);
          this.field_Pb.field_X = true;
          this.field_Mb.b(this.field_Pb, 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ie.<init>(").append(param0).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean n(int param0) {
        if (param0 != -22155) {
          ie.q(-71);
        }
        if (this.field_Ob.field_tb != 0) {
          this.field_Jb = 20;
          return true;
        }
        if (this.field_Ob.field_xb == 0) {
          return false;
        }
        if (this.field_Jb > 0) {
          this.field_Jb = this.field_Jb - 1;
        }
        if (0 != this.field_Jb) {
          return false;
        }
        if (gb.field_d < this.field_Pb.field_kb + (this.field_Pb.field_db + this.field_Pb.field_L + this.field_Pb.field_C)) {
          return false;
        }
        this.field_Jb = 3;
        return true;
    }

    final boolean l(int param0) {
        if (this.field_Ib.field_tb != 0) {
          this.field_Jb = 20;
          return true;
        }
        if (param0 >= -59) {
          return false;
        }
        if (this.field_Ib.field_xb == 0) {
          return false;
        }
        if (this.field_Jb > 0) {
          this.field_Jb = this.field_Jb - 1;
          if (this.field_Jb != 0) {
            return false;
          }
          if (this.field_Pb.field_L + this.field_Pb.field_C > gb.field_d) {
            this.field_Jb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Jb != 0) {
          return false;
        }
        if (this.field_Pb.field_L + this.field_Pb.field_C > gb.field_d) {
          this.field_Jb = 3;
          return true;
        }
        return false;
    }

    static {
        field_Rb = "<%0>'s game";
        field_Sb = "Advertising websites";
        field_Kb = 0;
    }
}
