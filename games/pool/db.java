/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vh {
    private vh field_Lb;
    private vh field_Yb;
    private vh field_Xb;
    private vh field_Tb;
    private vh field_Ob;
    static long field_Pb;
    static vh field_Nb;
    private vh field_Rb;
    static nm field_Vb;
    static oh field_Qb;
    static dd field_Wb;
    private int field_Mb;
    static cd field_Ub;
    static nq field_Sb;

    final void b(int param0, int param1, boolean param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vh var14 = null;
        vh var15 = null;
        vh var16 = null;
        vh var17 = null;
        vh var18 = null;
        vh var19 = null;
        vh var14Lifetime1;
        vh var14Lifetime2;
        vh var15Lifetime1;
        vh var15Lifetime2;
        vh var16Lifetime1;
        vh var16Lifetime2;
        vh var17Lifetime1;
        vh var17Lifetime2;
        vh var18Lifetime1;
        vh var18Lifetime2;
        vh var19Lifetime1;
        vh var19Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (this.field_Db >= 2 * this.field_gb) {
          var6 = -this.field_gb + this.field_Db;
          var5 = this.field_gb;
        } else {
          var6 = this.field_Db / 2;
          var5 = this.field_Db / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param0 <= 0) {
          var9 = -param1 + param0;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + param3 * var10) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Ob;
          var14.field_Db = var5;
          var14.field_qb = 0;
          var14.field_gb = this.field_gb;
          var14.field_eb = 0;
          var15 = this.field_Yb;
          var15.field_qb = 0;
          var15.field_Db = -var6 + this.field_Db;
          var15.field_eb = var6;
          var15.field_gb = this.field_gb;
          var16 = this.field_Tb;
          var16.field_qb = 0;
          var16.field_gb = this.field_gb;
          var16.field_eb = var5;
          var16.field_Db = var7;
          var17 = this.field_Xb;
          var17.field_Db = var12;
          var17.field_qb = 0;
          var17.field_gb = this.field_gb;
          var17.field_eb = 0;
          var18 = this.field_Lb;
          var18.field_Db = -var12 + var7;
          var18.field_eb = var12;
          var18.field_gb = this.field_gb;
          var18.field_qb = 0;
          var19 = this.field_Rb;
          var19.field_qb = 0;
          var19.field_Db = var8;
          var19.field_eb = var11;
          var19.field_gb = this.field_gb;
          this.field_Tb.field_pb = param1 < param0 ? true : false;
          this.field_Yb.field_pb = param1 < param0 ? true : false;
          this.field_Ob.field_pb = param1 < param0 ? true : false;
          if (param2) {
            field_Vb = (nm) null;
            return;
          }
          return;
        }
        var8 = param1 * var8 / param0;
        if (!(var8 >= this.field_gb)) {
          var8 = this.field_gb;
        }
        if (var7 >= var8) {
          var9Lifetime1 = -param1 + param0;
          var10Lifetime1 = var7 - var8;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (var9Lifetime1 / 2 + param3 * var10Lifetime1) / var9Lifetime1;
          }
          var12Lifetime1 = var11Lifetime1 + var8 / 2;
          var14Lifetime1 = this.field_Ob;
          var14Lifetime1.field_Db = var5;
          var14Lifetime1.field_qb = 0;
          var14Lifetime1.field_gb = this.field_gb;
          var14Lifetime1.field_eb = 0;
          var15Lifetime1 = this.field_Yb;
          var15Lifetime1.field_qb = 0;
          var15Lifetime1.field_Db = -var6 + this.field_Db;
          var15Lifetime1.field_eb = var6;
          var15Lifetime1.field_gb = this.field_gb;
          var16Lifetime1 = this.field_Tb;
          var16Lifetime1.field_qb = 0;
          var16Lifetime1.field_gb = this.field_gb;
          var16Lifetime1.field_eb = var5;
          var16Lifetime1.field_Db = var7;
          var17Lifetime1 = this.field_Xb;
          var17Lifetime1.field_Db = var12Lifetime1;
          var17Lifetime1.field_qb = 0;
          var17Lifetime1.field_gb = this.field_gb;
          var17Lifetime1.field_eb = 0;
          var18Lifetime1 = this.field_Lb;
          var18Lifetime1.field_Db = -var12Lifetime1 + var7;
          var18Lifetime1.field_eb = var12Lifetime1;
          var18Lifetime1.field_gb = this.field_gb;
          var18Lifetime1.field_qb = 0;
          var19Lifetime1 = this.field_Rb;
          var19Lifetime1.field_qb = 0;
          var19Lifetime1.field_Db = var8;
          var19Lifetime1.field_eb = var11Lifetime1;
          var19Lifetime1.field_gb = this.field_gb;
          this.field_Tb.field_pb = param1 < param0 ? true : false;
          this.field_Yb.field_pb = param1 < param0 ? true : false;
          this.field_Ob.field_pb = param1 < param0 ? true : false;
          if (param2) {
            field_Vb = (nm) null;
            return;
          }
          return;
        }
        var8 = var7;
        var9Lifetime2 = -param1 + param0;
        var10Lifetime2 = var7 - var8;
        var11Lifetime2 = 0;
        if (var9Lifetime2 > 0) {
          var11Lifetime2 = (var9Lifetime2 / 2 + param3 * var10Lifetime2) / var9Lifetime2;
        }
        var12Lifetime2 = var11Lifetime2 + var8 / 2;
        var14Lifetime2 = this.field_Ob;
        var14Lifetime2.field_Db = var5;
        var14Lifetime2.field_qb = 0;
        var14Lifetime2.field_gb = this.field_gb;
        var14Lifetime2.field_eb = 0;
        var15Lifetime2 = this.field_Yb;
        var15Lifetime2.field_qb = 0;
        var15Lifetime2.field_Db = -var6 + this.field_Db;
        var15Lifetime2.field_eb = var6;
        var15Lifetime2.field_gb = this.field_gb;
        var16Lifetime2 = this.field_Tb;
        var16Lifetime2.field_qb = 0;
        var16Lifetime2.field_gb = this.field_gb;
        var16Lifetime2.field_eb = var5;
        var16Lifetime2.field_Db = var7;
        var17Lifetime2 = this.field_Xb;
        var17Lifetime2.field_Db = var12Lifetime2;
        var17Lifetime2.field_qb = 0;
        var17Lifetime2.field_gb = this.field_gb;
        var17Lifetime2.field_eb = 0;
        var18Lifetime2 = this.field_Lb;
        var18Lifetime2.field_Db = -var12Lifetime2 + var7;
        var18Lifetime2.field_eb = var12Lifetime2;
        var18Lifetime2.field_gb = this.field_gb;
        var18Lifetime2.field_qb = 0;
        var19Lifetime2 = this.field_Rb;
        var19Lifetime2.field_qb = 0;
        var19Lifetime2.field_Db = var8;
        var19Lifetime2.field_eb = var11Lifetime2;
        var19Lifetime2.field_gb = this.field_gb;
        this.field_Tb.field_pb = param1 < param0 ? true : false;
        this.field_Yb.field_pb = param1 < param0 ? true : false;
        this.field_Ob.field_pb = param1 < param0 ? true : false;
        if (!param2) {
          return;
        }
        field_Vb = (nm) null;
    }

    public static void h(byte param0) {
        field_Wb = null;
        field_Sb = null;
        field_Nb = null;
        field_Ub = null;
        if (param0 >= 12) {
          field_Qb = null;
          field_Vb = null;
          return;
        }
        eg var2 = (eg) null;
        db.a(-122, (eg) null);
        field_Qb = null;
        field_Vb = null;
    }

    final int a(boolean param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        if (param3 < 6) {
          return -68;
        }
        int var5 = 0;
        int var6 = -this.field_Rb.field_Db + this.field_Tb.field_Db;
        if (var6 > 0) {
          var7 = this.field_Rb.field_eb;
          var8 = -param2 + param1;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (!param0) {
          if (-param2 + param1 < var5) {
            var5 = -param2 + param1;
          }
          if (0 > var5) {
            var5 = 0;
          }
          return var5;
        }
        if (var5 < 0) {
          var5 = 0;
        }
        if (var5 > -param2 + param1) {
          var5 = -param2 + param1;
          return var5;
        }
        return var5;
    }

    db(long param0, db param1) {
        this(param0, param1.field_Ob, param1.field_Yb, param1.field_Xb, param1.field_Rb);
    }

    final boolean g(byte param0) {
        if (param0 < 121) {
          return false;
        }
        if (this.field_Lb.field_R != 0) {
          this.field_Mb = 20;
          return true;
        }
        if (this.field_Lb.field_jb == 0) {
          return false;
        }
        if (this.field_Mb > 0) {
          this.field_Mb = this.field_Mb - 1;
        }
        if (this.field_Mb != 0) {
          return false;
        }
        if (gg.field_f >= this.field_Rb.field_E + (this.field_Rb.field_ib + this.field_Rb.field_Db) + this.field_Rb.field_Cb) {
          this.field_Mb = 3;
          return true;
        }
        return false;
    }

    final static vh f(byte param0) {
        if (param0 != 13) {
          db.h((byte) -72);
          return cp.field_c.field_Mb;
        }
        return cp.field_c.field_Mb;
    }

    final boolean i(byte param0) {
        int var2 = 48 % ((param0 - 13) / 61);
        if (this.field_Yb.field_R != 0) {
          this.field_Mb = 20;
          return true;
        }
        if (this.field_Yb.field_jb == 0) {
          return false;
        }
        if (this.field_Mb > 0) {
          this.field_Mb = this.field_Mb - 1;
          if (this.field_Mb != 0) {
            return false;
          }
          this.field_Mb = 3;
          return true;
        }
        if (this.field_Mb != 0) {
          return false;
        }
        this.field_Mb = 3;
        return true;
    }

    final boolean f(int param0) {
        if (this.field_Ob.field_R != 0) {
          this.field_Mb = 20;
          return true;
        }
        if (param0 != -4779) {
          return false;
        }
        if (this.field_Ob.field_jb == 0) {
          return false;
        }
        if (0 < this.field_Mb) {
          this.field_Mb = this.field_Mb - 1;
          if (this.field_Mb == 0) {
            this.field_Mb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Mb == 0) {
          this.field_Mb = 3;
          return true;
        }
        return false;
    }

    db(long param0, vh param1, vh param2, vh param3, vh param4) {
        super(param0, (vh) null);
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
        vh var9 = null;
        vh var10 = null;
        try {
          this.field_Ob = new vh(0L, param1);
          this.field_Yb = new vh(0L, param2);
          this.a(7, this.field_Ob);
          this.a(-114, this.field_Yb);
          this.field_Tb = new vh(0L, (vh) null);
          this.a(126, this.field_Tb);
          this.field_Xb = new vh(0L, param3);
          this.field_Lb = new vh(0L, param3);
          this.field_Lb.field_J = true;
          var9 = this.field_Xb;
          var10 = var9;
          var10.field_J = true;
          this.field_Tb.a(65, this.field_Xb);
          this.field_Tb.a(110, this.field_Lb);
          this.field_Rb = new vh(0L, param4);
          this.field_Rb.field_Jb = true;
          this.field_Tb.a(-126, this.field_Rb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("db.<init>(").append(param0).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 == 27194) {
          na.field_e = !param1 ? new vn(mm.field_l, cl.field_d) : new vn(je.field_b, v.field_j);
          so.field_k = new vh(0L, (vh) null);
          so.field_k.a(64, na.field_e.field_i);
          so.field_k.a(-96, ok.field_ob);
          de.field_b = new vh(0L, tq.field_m);
          aa.field_b = new vh(0L, (vh) null);
          de.field_b.a(param0 ^ -27208, Pool.field_P);
          de.field_b.a(68, aa.field_b);
          aa.field_b.a(-96, c.field_e);
          aa.field_b.a(90, ba.field_vb);
          al.a(param1, 0);
          return;
        }
        db.f((byte) 19);
        na.field_e = !param1 ? new vn(mm.field_l, cl.field_d) : new vn(je.field_b, v.field_j);
        so.field_k = new vh(0L, (vh) null);
        so.field_k.a(64, na.field_e.field_i);
        so.field_k.a(-96, ok.field_ob);
        de.field_b = new vh(0L, tq.field_m);
        aa.field_b = new vh(0L, (vh) null);
        de.field_b.a(param0 ^ -27208, Pool.field_P);
        de.field_b.a(68, aa.field_b);
        aa.field_b.a(-96, c.field_e);
        aa.field_b.a(90, ba.field_vb);
        al.a(param1, 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_Db = param2;
        this.field_gb = param3;
        if (param5 == 8414) {
          this.field_eb = param1;
          this.field_qb = param6;
          this.b(param0, param7, false, param4);
          return;
        }
        this.g(-62);
        this.field_eb = param1;
        this.field_qb = param6;
        this.b(param0, param7, false, param4);
    }

    final static void a(byte param0, int param1) {
        ma var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        i var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var4 = (i) (ue.field_b.c((byte) 96));
          while (var4 != null) {
            gp.a(param1, var4, -6725);
            var4 = (i) (ue.field_b.f((byte) -5));
          }
          var2 = hb.field_j.c((byte) 87);
          while (var2 != null) {
            kp.a(param0 ^ 59, param1);
            var2 = hb.field_j.f((byte) -5);
          }
          if (param0 == 58) {
            return;
          }
          field_Qb = (oh) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "db.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean g(int param0) {
        if (param0 <= -41) {
          return 0 != this.field_Rb.field_jb ? true : false;
        }
        this.field_Lb = (vh) null;
        return 0 != this.field_Rb.field_jb ? true : false;
    }

    final static void h(int param0) {
        lf.a(4, (byte) 105);
        if (param0 == 15158) {
          return;
        }
        field_Pb = -100L;
    }

    final boolean j(byte param0) {
        if (param0 >= -60) {
          this.field_Yb = (vh) null;
        }
        if (this.field_Xb.field_R != 0) {
          this.field_Mb = 20;
          return true;
        }
        if (this.field_Xb.field_jb == 0) {
          return false;
        }
        if (0 < this.field_Mb) {
          this.field_Mb = this.field_Mb - 1;
        }
        if (this.field_Mb != 0) {
          return false;
        }
        if (gg.field_f >= this.field_Rb.field_E + this.field_Rb.field_ib) {
          return false;
        }
        this.field_Mb = 3;
        return true;
    }

    final static void a(int param0, eg param1) {
        int[] var3 = null;
        try {
          var3 = param1.field_Y;
          int[] var2 = var3;
          param1.field_Y = param1.field_q;
          if (param0 != 0) {
            field_Vb = (nm) null;
          }
          param1.field_q = var3;
          jf.a(param1, (byte) 38);
          param1.a();
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "db.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Qb = new oh();
        field_Ub = new cd();
    }
}
