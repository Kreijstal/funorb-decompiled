/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn extends le {
    private int field_l;
    private int field_k;
    private ej field_i;
    private vn field_r;
    private int field_p;
    private int field_q;
    private ra field_n;
    private int field_o;
    private int field_j;
    private int field_h;
    private int field_m;

    private final void d(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        on stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        int var2Lifetime1;
        var4 = ZombieDawn.field_J;
        for (var2 = this.field_j; this.field_p >= var2; var2++) {
          for (var3 = this.field_q; var3 <= this.field_m; var3++) {
            stackIn_6_0 = this.field_i.field_A;
            stackIn_7_1 = (this.field_k == 0);
            ((on) (Object) stackIn_6_0).a(stackIn_7_1, 14365, var2, true, var3);
            if (this.field_k == 0) {
              this.field_i.field_b[var2][var3] = true;
            }
          }
        }
        var2Lifetime1 = -48 % ((19 - param0) / 63);
        dj.field_e.b(true);
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          if (param1 != -516) {
            this.field_q = 34;
          }
          var3_int = param0.a(24 * this.field_q, (byte) -118);
          var4 = param0.a(24 * this.field_j, 0);
          var5 = 50;
          if (this.field_l == 0) {
            var5 = this.field_h - this.field_o;
          } else {
            if (2 == this.field_l) {
              var5 = this.field_o;
            }
          }
          var6 = 0;
          var7 = 0;
          if (0 == this.field_k) {
            var8 = 47;
            var9 = var8 + (50 - var5) * (-var8 + 255) / 50;
            this.field_r.e(var6 + var3_int, var4 + var7, var9);
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "mn.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        if (this.field_l != 0) {
          this.d((byte) -123);
        }
        if (param0 != 76) {
          this.field_i = (ej) null;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        for (var2 = this.field_j; this.field_p >= var2; var2++) {
          for (var3 = this.field_q; this.field_m >= var3; var3++) {
            this.field_i.field_A.a((1 & this.field_i.field_A.field_t[var2][var3]) != 0 ? true : false, 14365, var2, true, var3);
          }
        }
        if (param0 != 0) {
          this.c((byte) 18);
        }
    }

    final boolean b(boolean param0) {
        int var2_int;
        nb var2;
        nb var3;
        int var4;
        String var5;
        var4 = ZombieDawn.field_J;
        this.field_o = this.field_o - 1;
        if (!param0) {
          var5 = (String) null;
          mn.a(80, (String) null, true);
        }
        var2_int = this.field_l;
        if (var2_int == 0) {
          if (null != this.field_r &&
            0 == this.field_k) {
            this.field_r.f(0, 1, 0);
          }
          if (this.field_h - 50 < this.field_o) {
            return false;
          }
          if (this.field_k == 0) {
            this.d((byte) -116);
          }
          this.field_l = 1;
          return true;
        }
        if (var2_int != 1) {
          if (var2_int == 2) {
            if (null != this.field_r &&
              this.field_k == 0) {
              this.field_r.f(0, -1, 0);
            }
            if (this.field_n != null) {
              var3 = this.field_n.c((byte) 34);
              while (var3 != null) {
                var2 = this.field_n.a((byte) 127);
                ((ek) (var3)).field_M = 1;
                if (((ek) (var3)).field_G) {
                  ((ek) (var3)).j(-18475);
                }
                var3 = var2;
              }
            }
            if (this.field_o <= 0) {
              this.a(0);
              this.b(-27598);
              return true;
            }
          }
        } else {
          if (this.field_o <= 50) {
            this.field_l = 2;
          }
        }
        return false;
    }

    private final void a(boolean param0, ej param1) {
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        wk var5 = null;
        ek var6_ref_ek = null;
        le var7 = null;
        int var10 = 0;
        vo var11 = null;
        var10 = ZombieDawn.field_J;
        try {
          this.field_i = param1;
          this.field_p = -1 + (this.field_j + 2 * je.field_a);
          if (this.field_i.field_A.field_r <= this.field_p) {
            this.field_p = -1 + this.field_i.field_A.field_r;
          }
          this.field_m = 2 * je.field_a + (this.field_q - 1);
          if (this.field_m >= this.field_i.field_A.field_k) {
            this.field_m = -1 + this.field_i.field_A.field_k;
          }
          this.field_l = 0;
          this.field_n = new ra();
          if (this.field_k == 1) {
            for (var3_int = this.field_j; this.field_p >= var3_int; var3_int++) {
              for (var4 = this.field_q; this.field_m >= var4; var4++) {
                if (0 != (this.field_i.field_A.field_t[var3_int][var4] & 1) ||
                  this.field_i.field_b[var3_int][var4]) {
                  for (var5_int = 0; 2 > var5_int; var5_int++) {
                    var6_ref_ek = ip.a(var4 * 24, 24 * var3_int, 100, true);
                    this.field_n.a(var6_ref_ek, (byte) -116);
                    dj.field_e.field_R.a(var6_ref_ek, -122);
                  }
                }
              }
            }
            this.d((byte) 108);
          } else {
            var3_int = 48 * je.field_a;
            var4 = 48 * je.field_a;
            this.field_r = new vn(var3_int, var4);
            for (var5_int = this.field_j; this.field_p >= var5_int; var5_int++) {
              for (var6 = this.field_q; this.field_m >= var6; var6++) {
                this.field_i.field_b[var5_int][var6] = false;
              }
            }
            ki.a((byte) -120, this.field_r);
            var5 = new wk(this.field_i.field_u, this.field_i.field_p);
            var5.field_u = bd.field_d + this.field_q * 24;
            var5.field_c = this.field_j * 24 + nh.field_G;
            this.field_i.a(var5, false);
            if (0 == this.field_k) {
              bi.d();
            }
            this.field_i.a(var5, 1, true, false);
            var11 = dj.field_e.field_R;
            var7 = var11.b((byte) 26);
            while (var7 != null) {
              if (var7 instanceof id &&
                !(var7 instanceof kc)) {
                ((fb) (var7)).a((byte) -93, var5);
              }
              var7 = var11.a(false);
            }
            this.field_i.a(var5, 2, true, false);
            pa.a(-21189);
            for (var8 = this.field_j; this.field_p >= var8; var8++) {
              for (var9 = this.field_q; this.field_m >= var9; var9++) {
                this.field_i.field_b[var8][var9] = true;
              }
            }
          }
          if (param0) {
            this.field_p = -128;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_47_0 = var3;
          stackIn_47_1 = new StringBuilder().append("mn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ZombieDawn.field_J;
        rc.field_u = new int[]{};
        oo.field_U = new int[]{};
        if (param0) {
          return;
        }
        try {
          tl.field_g = new int[]{};
          for (var1_int = 0; bm.field_a.length > var1_int; var1_int++) {
            bm.field_a[var1_int] = 0;
            hg.field_a[var1_int] = 0;
            si.field_Qb[var1_int] = 0;
            hd.field_u[var1_int] = 0;
          }
          rg.field_J.b(97);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "mn.I(" + param0 + ')');
        }
    }

    final static void a(dj param0, boolean param1) {
        vn var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          var2 = new vn(param0.a("", -116, "final_frame.jpg"), (java.awt.Component) ((Object) cj.field_d));
          if (!param1) {
            dj var5 = (dj) null;
            mn.a((dj) null, false);
          }
          var3 = var2.field_w;
          var4 = var2.field_t;
          hk.i(1584);
          kh.field_a = new vn(var3, 3 * var4 / 4);
          kh.field_a.a();
          var2.e(0, 0);
          bh.field_j = new vn(var3, -kh.field_a.field_t + var4);
          bh.field_j.a();
          var2.e(0, -kh.field_a.field_t);
          bh.field_j.field_x = kh.field_a.field_t;
          pa.a(-21189);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "mn.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        try {
          sc.field_a = param2;
          if (param0 != -1) {
            dj var4 = (dj) null;
            mn.a((dj) null, true);
          }
          rc.field_p = f.field_k;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "mn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    mn(ej param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1 = param1 / 24;
          this.field_i = param0;
          param2 = param2 / 24;
          this.field_k = param3;
          if (this.field_k == 0) {
            stackIn_4_2 = 2147483647;
          } else {
            stackIn_4_2 = 1000;
          }
          this.field_o = stackIn_4_2;
          this.field_h = stackIn_4_2;
          this.field_j = param2 - je.field_a;
          if (this.field_j < 0) {
            this.field_j = 0;
          }
          this.field_q = -je.field_a + param1;
          if (0 > this.field_q) {
            this.field_q = 0;
          }
          if (this.field_i != null) {
            this.a(false, this.field_i);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("mn.<init>(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
