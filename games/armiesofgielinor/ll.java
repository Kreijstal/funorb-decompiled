/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends je {
    private je field_Ub;
    static CombatSandbox field_Rb;
    static String field_Jb;
    static char[] field_Nb;
    static String field_Kb;
    private je field_Pb;
    static String[][] field_Mb;
    static String field_Tb;
    static tu field_Sb;
    private je field_Ib;
    private je field_Vb;
    private je field_Lb;
    private int field_Ob;
    private je field_Qb;

    ll(long param0, je param1, je param2, je param3, je param4) {
        super(param0, (je) null);
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
        je var9 = null;
        je var10 = null;
        try {
          this.field_Ib = new je(0L, param1);
          this.field_Qb = new je(0L, param2);
          this.a(this.field_Ib, 42);
          this.a(this.field_Qb, 59);
          this.field_Lb = new je(0L, (je) null);
          this.a(this.field_Lb, 101);
          this.field_Vb = new je(0L, param3);
          this.field_Pb = new je(0L, param3);
          this.field_Pb.field_ub = true;
          var9 = this.field_Vb;
          var10 = var9;
          var10.field_ub = true;
          this.field_Lb.a(this.field_Vb, 81);
          this.field_Lb.a(this.field_Pb, 53);
          this.field_Ub = new je(0L, param4);
          this.field_Ub.field_Gb = true;
          this.field_Lb.a(this.field_Ub, 47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ll.<init>(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void k(int param0) {
        field_Nb = null;
        field_Tb = null;
        field_Kb = null;
        field_Mb = (String[][]) null;
        field_Jb = null;
        if (param0 == -1) {
          field_Rb = null;
          field_Sb = null;
          return;
        }
    }

    ll(long param0, ll param1) {
        this(param0, param1.field_Ib, param1.field_Qb, param1.field_Vb, param1.field_Ub);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_ob = param2;
        if (param0 == 201) {
          this.field_S = param6;
          this.field_gb = param1;
          this.field_ab = param3;
          this.a(param0 - 201, param4, param5, param7);
          return;
        }
        this.a(30, false, 45, -68);
        this.field_S = param6;
        this.field_gb = param1;
        this.field_ab = param3;
        this.a(param0 - 201, param4, param5, param7);
    }

    final boolean n(int param0) {
        if (this.field_Qb.field_yb != 0) {
          this.field_Ob = 20;
          return true;
        }
        int var2 = -103 % ((param0 + 72) / 45);
        if (0 == this.field_Qb.field_hb) {
          return false;
        }
        if (this.field_Ob > 0) {
          this.field_Ob = this.field_Ob - 1;
        }
        if (0 == this.field_Ob) {
          this.field_Ob = 3;
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        je var14 = null;
        je var15 = null;
        je var16 = null;
        je var17 = null;
        je var18 = null;
        je var19 = null;
        je var14Lifetime1;
        je var15Lifetime1;
        je var16Lifetime1;
        je var17Lifetime1;
        je var18Lifetime1;
        je var19Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (2 * this.field_gb <= this.field_ob) {
          var5 = this.field_gb;
          var6 = this.field_ob - this.field_gb;
        } else {
          var6 = this.field_ob / 2;
          var5 = this.field_ob / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param1 <= 0) {
          var9 = -param2 + param1;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (var9 / 2 + param3 * var10) / var9;
          }
          var12 = var11 + var8 / 2;
          var14 = this.field_Ib;
          var14.field_ob = var5;
          var14.field_ab = 0;
          var14.field_S = 0;
          var14.field_gb = this.field_gb;
          var15 = this.field_Qb;
          var15.field_S = 0;
          var15.field_gb = this.field_gb;
          var15.field_ab = var6;
          var15.field_ob = this.field_ob - var6;
          var16 = this.field_Lb;
          var16.field_ob = var7;
          var16.field_ab = var5;
          var16.field_S = 0;
          var16.field_gb = this.field_gb;
          var17 = this.field_Vb;
          var17.field_ab = 0;
          var17.field_ob = var12;
          var17.field_gb = this.field_gb;
          var17.field_S = 0;
          var18 = this.field_Pb;
          var18.field_S = param0;
          var18.field_ab = var12;
          var18.field_ob = var7 - var12;
          var18.field_gb = this.field_gb;
          var19 = this.field_Ub;
          this.field_Lb.field_xb = param1 > param2 ? true : false;
          this.field_Qb.field_xb = param1 > param2 ? true : false;
          this.field_Ib.field_xb = param1 > param2 ? true : false;
          var19.field_S = 0;
          var19.field_ab = var11;
          var19.field_ob = var8;
          var19.field_gb = this.field_gb;
          return;
        }
        var8 = var8 * param2 / param1;
        if (!(var8 >= this.field_gb)) {
          var8 = this.field_gb;
        }
        if (var7 < var8) {
          var8 = var7;
        }
        var9Lifetime1 = -param2 + param1;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (var9Lifetime1 > 0) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param3 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var11Lifetime1 + var8 / 2;
        var14Lifetime1 = this.field_Ib;
        var14Lifetime1.field_ob = var5;
        var14Lifetime1.field_ab = 0;
        var14Lifetime1.field_S = 0;
        var14Lifetime1.field_gb = this.field_gb;
        var15Lifetime1 = this.field_Qb;
        var15Lifetime1.field_S = 0;
        var15Lifetime1.field_gb = this.field_gb;
        var15Lifetime1.field_ab = var6;
        var15Lifetime1.field_ob = this.field_ob - var6;
        var16Lifetime1 = this.field_Lb;
        var16Lifetime1.field_ob = var7;
        var16Lifetime1.field_ab = var5;
        var16Lifetime1.field_S = 0;
        var16Lifetime1.field_gb = this.field_gb;
        var17Lifetime1 = this.field_Vb;
        var17Lifetime1.field_ab = 0;
        var17Lifetime1.field_ob = var12Lifetime1;
        var17Lifetime1.field_gb = this.field_gb;
        var17Lifetime1.field_S = 0;
        var18Lifetime1 = this.field_Pb;
        var18Lifetime1.field_S = param0;
        var18Lifetime1.field_ab = var12Lifetime1;
        var18Lifetime1.field_ob = var7 - var12Lifetime1;
        var18Lifetime1.field_gb = this.field_gb;
        var19Lifetime1 = this.field_Ub;
        this.field_Lb.field_xb = param1 > param2 ? true : false;
        this.field_Qb.field_xb = param1 > param2 ? true : false;
        this.field_Ib.field_xb = param1 > param2 ? true : false;
        var19Lifetime1.field_S = 0;
        var19Lifetime1.field_ab = var11Lifetime1;
        var19Lifetime1.field_ob = var8;
        var19Lifetime1.field_gb = this.field_gb;
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return this.field_Ub.field_hb != 0 ? true : false;
        }
        ll.k(-78);
        return this.field_Ub.field_hb != 0 ? true : false;
    }

    final boolean m(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_Ib.field_yb != 0) {
          this.field_Ob = 20;
          return true;
        }
        if (this.field_Ib.field_hb == 0) {
          var2 = 33 % ((18 - param0) / 47);
          return false;
        }
        if (this.field_Ob > 0) {
          this.field_Ob = this.field_Ob - 1;
          if (this.field_Ob == 0) {
            this.field_Ob = 3;
            return true;
          }
          var2Lifetime1 = 33 % ((18 - param0) / 47);
          return false;
        }
        if (this.field_Ob == 0) {
          this.field_Ob = 3;
          return true;
        }
        var2Lifetime2 = 33 % ((18 - param0) / 47);
        return false;
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = 0;
        var6 = this.field_Lb.field_ob - this.field_Ub.field_ob;
        if (var6 > 0) {
          var7 = this.field_Ub.field_ab;
          var8 = -param0 + param2;
          var5 = (var7 * var8 + var6 / 2) / var6;
        }
        if (param1) {
          if (var5 < 0) {
            var5 = 0;
          }
          if (-param0 + param2 < var5) {
            var5 = param2 - param0;
          }
        } else {
          if (param2 - param0 < var5) {
            var5 = -param0 + param2;
          }
          if (0 > var5) {
            var5 = 0;
          }
        }
        if (param3 > 102) {
          return var5;
        }
        this.field_Pb = (je) null;
        return var5;
    }

    final static java.awt.Canvas p(int param0) {
        if (param0 != 0) {
          field_Jb = (String) null;
          return wq.field_a == null ? si.field_b : (java.awt.Canvas) ((Object) wq.field_a);
        }
        return wq.field_a == null ? si.field_b : (java.awt.Canvas) ((Object) wq.field_a);
    }

    final boolean o(int param0) {
        if (this.field_Vb.field_yb != 0) {
          this.field_Ob = 20;
          return true;
        }
        if (param0 > -31) {
          this.n(109);
        }
        if (this.field_Vb.field_hb == 0) {
          return false;
        }
        if (this.field_Ob > 0) {
          this.field_Ob = this.field_Ob - 1;
        }
        if (this.field_Ob != 0) {
          return false;
        }
        if (this.field_Ub.field_db + this.field_Ub.field_D <= ko.field_b) {
          return false;
        }
        this.field_Ob = 3;
        return true;
    }

    final boolean l(int param0) {
        if (this.field_Pb.field_yb != 0) {
          this.field_Ob = 20;
          return true;
        }
        if (this.field_Pb.field_hb == 0) {
          if (param0 == 28809) {
            return false;
          }
          this.field_Lb = (je) null;
          return false;
        }
        if (this.field_Ob > 0) {
          this.field_Ob = this.field_Ob - 1;
        }
        if (0 == this.field_Ob) {
          if (ko.field_b >= this.field_Ub.field_nb + (this.field_Ub.field_ob + this.field_Ub.field_db + this.field_Ub.field_D)) {
            this.field_Ob = 3;
            return true;
          }
          if (param0 == 28809) {
            return false;
          }
          this.field_Lb = (je) null;
          return false;
        }
        if (param0 == 28809) {
          return false;
        }
        this.field_Lb = (je) null;
        return false;
    }

    static {
        field_Nb = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_Jb = "level <%0> prestige";
        field_Kb = "Runite is a wondrous material, creating armours that help to protect well from all different types of damage.";
        field_Tb = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
