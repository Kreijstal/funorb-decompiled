/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends SceneWidget {
    private int field_ic;
    static String field_fc;
    static String field_Ub;
    private SceneWidget field_ec;
    static String field_cc;
    static IndexedSprite[] field_Zb;
    private SceneWidget field_bc;
    static int field_ac;
    static int field_Tb;
    private SceneWidget field_dc;
    static String field_hc;
    static String field_kc;
    private SceneWidget field_jc;
    static byte[][][] field_Wb;
    static String field_Yb;
    static String field_Vb;
    private SceneWidget field_Sb;
    private SceneWidget field_Xb;
    static int field_gc;

    public static void j(int param0) {
        field_Vb = null;
        field_fc = null;
        field_Wb = (byte[][][]) null;
        field_kc = null;
        field_Zb = null;
        field_Ub = null;
        field_cc = null;
        if (param0 == 0) {
          field_Yb = null;
          field_hc = null;
          return;
        }
    }

    final static void a(byte param0, ResourceArchive param1) {
        SceneWidget var5 = null;
        SceneWidget var6 = null;
        SceneWidget var3 = null;
        try {
          ce.field_p = rl.a(param1, "basic", "display_name_changed", false);
          km.field_j = new ql(0L, l.field_e, qg.field_i, cb.field_d);
          vi.field_W = new ql(0L, l.field_e, ge.field_k, sa.field_a);
          ig.field_m = new SceneWidget(0L, (SceneWidget) null);
          vc.field_h = new SceneWidget(0L, bd.field_f);
          vc.field_h.field_Kb = 1;
          mm.field_a = new SceneWidget(0L, sj.field_J, uj.field_g);
          dh.field_E = new SceneWidget(0L, kb.field_b, rm.field_i);
          si.field_v = new SceneWidget(0L, ParticleEffect.field_K);
          ig.field_m.a(vc.field_h, 121);
          ig.field_m.a(mm.field_a, 123);
          ig.field_m.a(dh.field_E, 121);
          if (param0 != 109) {
            lb.j(-84);
          }
          ig.field_m.a(km.field_j, 118);
          ig.field_m.a(si.field_v, 120);
          km.field_j.field_Xb.field_Tb.b(bd.field_f, 6402);
          var5 = km.field_j.field_Xb.field_Tb;
          var6 = var5;
          km.field_j.field_Xb.field_Tb.field_Fb = 1;
          var6.field_Kb = 1;
          vi.field_W.field_Xb.field_Tb.b(bd.field_f, 6402);
          var3 = vi.field_W.field_Xb.field_Tb;
          vi.field_W.field_Xb.field_Tb.field_Fb = 1;
          var3.field_Kb = 1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "lb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(boolean param0) {
        if (param0) {
          this.field_jc = (SceneWidget) null;
        }
        if (this.field_bc.field_Eb != 0) {
          this.field_ic = 20;
          return true;
        }
        if (this.field_bc.field_W == 0) {
          return false;
        }
        if (this.field_ic > 0) {
          this.field_ic = this.field_ic - 1;
        }
        if (0 != this.field_ic) {
          return false;
        }
        this.field_ic = 3;
        return true;
    }

    final int a(int param0, boolean param1, int param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        int var7 = 69 % ((param3 + 9) / 34);
        int var5 = 0;
        int var6 = this.field_Sb.field_Lb - this.field_ec.field_Lb;
        if (var6 > 0) {
          var8 = this.field_ec.field_eb;
          var9 = -param0 + param2;
          var5 = (var6 / 2 + var9 * var8) / var6;
        }
        if (!param1) {
          if (-param0 + param2 < var5) {
            var5 = param2 - param0;
          }
          if (var5 < 0) {
            var5 = 0;
          }
          return var5;
        }
        if (0 > var5) {
          var5 = 0;
        }
        if (var5 > -param0 + param2) {
          var5 = param2 - param0;
          return var5;
        }
        return var5;
    }

    lb(long param0, lb param1) {
        this(param0, param1.field_bc, param1.field_jc, param1.field_dc, param1.field_ec);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_zb = param5;
        this.field_eb = param4;
        this.field_Lb = param6;
        if (param7 == 4454) {
          this.field_Y = param3;
          this.a(param0, param1, param2, -1);
          return;
        }
    }

    final boolean k(int param0) {
        if (param0 >= -87) {
          return false;
        }
        return this.field_ec.field_W != 0 ? true : false;
    }

    lb(long param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, SceneWidget param4) {
        super(param0, (SceneWidget) null);
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
        SceneWidget var9 = null;
        SceneWidget var10 = null;
        try {
          this.field_bc = new SceneWidget(0L, param1);
          this.field_jc = new SceneWidget(0L, param2);
          this.a(this.field_bc, 121);
          this.a(this.field_jc, 121);
          this.field_Sb = new SceneWidget(0L, (SceneWidget) null);
          this.a(this.field_Sb, 126);
          this.field_dc = new SceneWidget(0L, param3);
          this.field_Xb = new SceneWidget(0L, param3);
          var9 = this.field_dc;
          var10 = var9;
          this.field_Xb.field_P = true;
          var10.field_P = true;
          this.field_Sb.a(this.field_dc, 122);
          this.field_Sb.a(this.field_Xb, 123);
          this.field_ec = new SceneWidget(0L, param4);
          this.field_ec.field_U = true;
          this.field_Sb.a(this.field_ec, 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("lb.<init>(").append(param0).append(',');
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
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        if (param0 != 29) {
          return false;
        }
        if (0 != this.field_dc.field_Eb) {
          this.field_ic = 20;
          return true;
        }
        if (this.field_dc.field_W == 0) {
          return false;
        }
        if (0 < this.field_ic) {
          this.field_ic = this.field_ic - 1;
          if (this.field_ic != 0) {
            return false;
          }
          if (this.field_ec.field_gb + this.field_ec.field_cb > pi.field_c) {
            this.field_ic = 3;
            return true;
          }
          return false;
        }
        if (this.field_ic != 0) {
          return false;
        }
        if (this.field_ec.field_gb + this.field_ec.field_cb > pi.field_c) {
          this.field_ic = 3;
          return true;
        }
        return false;
    }

    final boolean f(byte param0) {
        int var2 = -114 / ((-39 - param0) / 39);
        if (this.field_Xb.field_Eb != 0) {
          this.field_ic = 20;
          return true;
        }
        if (0 == this.field_Xb.field_W) {
          return false;
        }
        if (this.field_ic > 0) {
          this.field_ic = this.field_ic - 1;
        }
        if (this.field_ic != 0) {
          return false;
        }
        if (pi.field_c >= this.field_ec.field_lb + this.field_ec.field_Lb + (this.field_ec.field_cb + this.field_ec.field_gb)) {
          this.field_ic = 3;
          return true;
        }
        return false;
    }

    final boolean e(byte param0) {
        if (this.field_jc.field_Eb != 0) {
          this.field_ic = 20;
          return true;
        }
        if (param0 <= 56) {
          this.field_jc = (SceneWidget) null;
          if (this.field_jc.field_W == 0) {
            return false;
          }
          if (this.field_ic > 0) {
            this.field_ic = this.field_ic - 1;
          }
          if (this.field_ic == 0) {
            this.field_ic = 3;
            return true;
          }
          return false;
        }
        if (this.field_jc.field_W == 0) {
          return false;
        }
        if (this.field_ic > 0) {
          this.field_ic = this.field_ic - 1;
        }
        if (this.field_ic == 0) {
          this.field_ic = 3;
          return true;
        }
        return false;
    }

    lb(String param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, SceneWidget param4) {
        this(ke.a((CharSequence) ((Object) param0), (byte) -48), param1, param2, param3, param4);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        SceneWidget var14 = null;
        SceneWidget var15 = null;
        SceneWidget var16 = null;
        SceneWidget var17 = null;
        SceneWidget var18 = null;
        SceneWidget var19 = null;
        SceneWidget var14Lifetime1;
        SceneWidget var15Lifetime1;
        SceneWidget var16Lifetime1;
        SceneWidget var17Lifetime1;
        SceneWidget var18Lifetime1;
        SceneWidget var19Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        if (this.field_zb * 2 > this.field_Lb) {
          var6 = this.field_Lb / 2;
          var5 = this.field_Lb / 2;
        } else {
          var6 = this.field_Lb - this.field_zb;
          var5 = this.field_zb;
        }
        int var7 = var6 - var5;
        int var8 = var7;
        if (param3 > ~param2) {
          var8 = var8 * param0 / param2;
          if (!(this.field_zb <= var8)) {
            var8 = this.field_zb;
          }
          if (var7 >= var8) {
            var9 = param2 - param0;
            var10 = var7 - var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param1 * var10) / var9;
            }
            var12 = var8 / 2 + var11;
            var14 = this.field_bc;
            var14.field_Lb = var5;
            var14.field_eb = 0;
            var14.field_Y = 0;
            var14.field_zb = this.field_zb;
            var15 = this.field_jc;
            var15.field_Lb = -var6 + this.field_Lb;
            var15.field_zb = this.field_zb;
            var15.field_Y = 0;
            var15.field_eb = var6;
            var16 = this.field_Sb;
            var16.field_eb = var5;
            var16.field_Y = 0;
            var16.field_Lb = var7;
            var16.field_zb = this.field_zb;
            var17 = this.field_dc;
            var17.field_eb = 0;
            var17.field_zb = this.field_zb;
            var17.field_Y = 0;
            var17.field_Lb = var12;
            var18 = this.field_Xb;
            var18.field_eb = var12;
            var18.field_zb = this.field_zb;
            var18.field_Lb = var7 - var12;
            var18.field_Y = 0;
            var19 = this.field_ec;
            var19.field_eb = var11;
            var19.field_zb = this.field_zb;
            this.field_Sb.field_T = param0 < param2 ? true : false;
            this.field_jc.field_T = param0 < param2 ? true : false;
            this.field_bc.field_T = param0 < param2 ? true : false;
            var19.field_Y = 0;
            var19.field_Lb = var8;
            return;
          }
          var8 = var7;
        }
        var9Lifetime1 = param2 - param0;
        var10Lifetime1 = var7 - var8;
        var11Lifetime1 = 0;
        if (0 < var9Lifetime1) {
          var11Lifetime1 = (var9Lifetime1 / 2 + param1 * var10Lifetime1) / var9Lifetime1;
        }
        var12Lifetime1 = var8 / 2 + var11Lifetime1;
        var14Lifetime1 = this.field_bc;
        var14Lifetime1.field_Lb = var5;
        var14Lifetime1.field_eb = 0;
        var14Lifetime1.field_Y = 0;
        var14Lifetime1.field_zb = this.field_zb;
        var15Lifetime1 = this.field_jc;
        var15Lifetime1.field_Lb = -var6 + this.field_Lb;
        var15Lifetime1.field_zb = this.field_zb;
        var15Lifetime1.field_Y = 0;
        var15Lifetime1.field_eb = var6;
        var16Lifetime1 = this.field_Sb;
        var16Lifetime1.field_eb = var5;
        var16Lifetime1.field_Y = 0;
        var16Lifetime1.field_Lb = var7;
        var16Lifetime1.field_zb = this.field_zb;
        var17Lifetime1 = this.field_dc;
        var17Lifetime1.field_eb = 0;
        var17Lifetime1.field_zb = this.field_zb;
        var17Lifetime1.field_Y = 0;
        var17Lifetime1.field_Lb = var12Lifetime1;
        var18Lifetime1 = this.field_Xb;
        var18Lifetime1.field_eb = var12Lifetime1;
        var18Lifetime1.field_zb = this.field_zb;
        var18Lifetime1.field_Lb = var7 - var12Lifetime1;
        var18Lifetime1.field_Y = 0;
        var19Lifetime1 = this.field_ec;
        var19Lifetime1.field_eb = var11Lifetime1;
        var19Lifetime1.field_zb = this.field_zb;
        this.field_Sb.field_T = param0 < param2 ? true : false;
        this.field_jc.field_T = param0 < param2 ? true : false;
        this.field_bc.field_T = param0 < param2 ? true : false;
        var19Lifetime1.field_Y = 0;
        var19Lifetime1.field_Lb = var8;
    }

    static {
        field_Ub = "<%0> has declined the invitation.";
        field_fc = "Leave test field";
        field_cc = "Log in";
        field_kc = "You have declined the invitation.";
        field_gc = 0;
        field_hc = "Create a free account to start using this feature";
        field_Vb = "<%1> was obliterated in <%0>'s nuclear fireball";
        field_ac = 256;
        field_Yb = "Become a member to get this expansion and...";
    }
}
