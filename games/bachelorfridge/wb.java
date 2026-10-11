/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends lw {
    static vr field_l;

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        if (null != ms.field_u &&
          ms.field_u.a(true)) {
          di.c(-87);
          return true;
        }
        if (null != wt.field_n &&
          wt.field_n.f((byte) -116)) {
          wt.field_n = null;
          di.c(96);
          return true;
        }
        if (lk.d(2)) {
          return true;
        }
        if (tc.a(param1, param0, param3, param2)) {
          return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 != 10046) {
          field_l = (vr) null;
        }
    }

    wb() {
        super(false, new String[]{wg.field_h, sk.field_n, sk.field_m, qh.field_g, paa.field_h, uba.field_p}, jm.field_h);
        this.field_c = new int[][]{new int[]{180, 20}, new int[]{110, 190}, new int[]{70, 30}, new int[]{190, 310}, new int[]{30, 90}, new int[]{160, 350}, new int[]{200, 190}};
    }

    final void a(int param0, byte param1) {
        int var4;
        var4 = BachelorFridge.field_y;
        if (param0 != 1) {
          if (param0 != 2) {
            if (param0 != 3) {
              if (param0 == 4) {
                this.field_a = 4;
                this.b(1);
                this.c(94);
              } else {
                if (param0 != 5) {
                  if (param0 == 6) {
                    this.field_a = 6;
                    this.b(param1 - 72);
                    this.c(116);
                  } else {
                    if (34 == param0 &&
                      this.c((byte) 95)) {
                      fla.b(23621);
                    }
                  }
                } else {
                  this.field_a = 5;
                  this.b(1);
                  this.c(74);
                }
              }
            } else {
              this.field_a = 3;
              this.b(1);
              this.c(param1 + 17);
            }
          } else {
            this.field_a = 2;
            this.b(1);
            this.c(70);
          }
        } else {
          this.field_a = 1;
          this.b(1);
          this.c(param1 ^ 39);
        }
        if (param1 != 73) {
          wb.a(false, 111, 23);
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        sga stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        sna stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        eaa var4 = null;
        int var5 = 0;
        Object var6 = null;
        nea var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ik var17 = null;
        ik var18 = null;
        var16 = BachelorFridge.field_y;
        try {
          stackIn_3_0 = nr.field_w.field_xb;
          stackIn_3_1 = 2 + rg.field_h;
          stackIn_3_2 = 2;
          stackIn_3_3 = (6 + 3 * rg.field_h) * param1;
          stackIn_4_4 = (nr.field_w.field_xb == bga.field_m);
          var3_int = ((sga) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param0, true) ? 1 : 0;
          var4 = nr.field_w.field_wb.field_z;
          var5 = -98 / ((-4 - param2) / 42);
          if (2 != um.field_c &&
            um.field_c != 1) {
            nr.field_w.field_u = false;
            nr.field_w.field_xb.field_wb.field_Z = ema.field_Ab;
            nn.a((byte) -126, nr.field_w.field_wb);
            return;
          }
          nr.field_w.field_u = true;
          nr.field_w.field_xb.field_wb.field_Z = null;
          var6 = null;
          var7 = (nea) (var4.b((byte) 90));
          while (var7 != null) {
            var8 = 0;
            if (var7.field_z == null) {
              var7.field_Db = new sna(0L, gi.field_c);
              var7.a(-1, var7.field_Db);
              var7.field_zb = new sna(0L, gi.field_c);
              var7.a(-1, var7.field_zb);
              var7.d((byte) 116);
              var8 = 1;
            }
            var7.field_sb = nr.field_w.field_wb.field_sb;
            var7.field_Db.a(rg.field_h, 31407, var7.field_sb, 0, 0);
            var9 = 0;
            if (var7.field_Ab != null &&
              !var7.field_Ab.equals("")) {
              var7.field_zb.field_v = ln.field_x;
              var7.field_zb.field_ab = 16737894;
              var7.field_zb.a(rg.field_h, 31407, ln.field_x.field_n + 3, 0, 0);
              var9 = 1;
            }
            var10 = 0;
            var11 = var7.field_sb;
            if (var9 != 0) {
              var10 = 3 + ln.field_x.field_n;
              var11 = var11 - var10;
            }
            stackIn_20_0 = var7.field_Db;
            if (var11 > 0) {
              stackIn_21_1 = po.a(var7.field_Db.field_jb, var7.field_xb, var11);
            } else {
              stackIn_21_1 = var7.field_xb;
            }
            stackIn_20_0.field_Z = stackIn_21_1;
            stackIn_24_0 = (var7.field_Db.field_Z.equals(var7.field_xb)) ? 0 : 1;
            var12 = stackIn_24_0;
            var7.field_Db.a(rg.field_h, 31407, var11, var10, 0);
            if (var3_int == 0) {
              var7.field_hb = rg.field_h - var7.field_p;
            }
            if (var8 != 0) {
              nr.field_w.field_wb.a(false, var7, (sna) (var6), 2);
            }
            if (null != var7.field_zb &&
              var7.field_zb.field_T) {
              jja.field_m = var7.field_Ab;
            } else {
              if (var7.field_Db.field_T &&
                var12 != 0) {
                jja.field_m = var7.field_xb;
              }
            }
            if (var7.field_R != 0) {
              mna.a(-1, (int[]) null, 0L, var7.field_xb, var7.field_Cb, -1, -113, nr.field_w.field_xb, var7);
              var17 = ms.field_u;
              var14_ref_String = mna.field_r;
              var17.field_a.a(var14_ref_String, true, 7);
              var18 = ms.field_u;
              var14 = nfa.field_a;
              var15 = jc.field_r;
              var18.field_a.a(0, false, var14, 0, var15);
            }
            var6 = var7;
            var7 = (nea) (var4.c(0));
          }
          if (nr.field_w.field_Ab.field_R != 0) {
            wh.field_p = new oa(nr.field_w.field_Ab.field_D, nr.field_w.field_Ab.field_M, nr.field_w.field_Ab.field_sb, nr.field_w.field_Ab.field_p, nh.field_p, kha.field_i, qs.field_m, qs.field_m);
            vaa.field_f = 2;
          }
          if (nr.field_w.field_yb.field_R == 0) {
            return;
          }
          wh.field_p = new oa(nr.field_w.field_yb.field_D, nr.field_w.field_yb.field_M, nr.field_w.field_yb.field_sb, nr.field_w.field_yb.field_p, kma.field_p, kha.field_i, qs.field_m, qs.field_m);
          vaa.field_f = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "wb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static pp a(lu param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tfa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -61 / ((param1 - 52) / 43);
          stackIn_1_0 = new tfa();
          return (pp) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("wb.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 52) {
            field_l = (vr) null;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_3_0 = tca.field_a.equals(fq.a(param0 ^ 52, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static k b(lu param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        k var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        k stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param1 <= 45) {
            wb.a(false, -57, -18);
          }
          param0.b(16711935);
          var2_int = param0.b(16711935);
          var3 = ffa.a(-16, var2_int);
          var3.field_i = param0.b(16711935);
          var4 = param0.b(16711935);
          for (var5 = 0; var4 > var5; var5++) {
            var6 = param0.b(16711935);
            var3.a((byte) -71, param0, var6);
          }
          var3.d((byte) -68);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("wb.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2 = (int)((-Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 200.0) + 1.0) * 32.0);
        if (0 == (this.field_e & 2)) {
          wa.field_n.a(520, 12, var2);
        }
        if ((4 & this.field_e) == 0) {
          lfa.field_s.a(419, 149, var2);
        }
        if ((this.field_e & 8) == 0) {
          bn.field_i.a(419, 42, var2);
        }
        if ((this.field_e & 16) == 0) {
          rj.field_l.a(522, 318, var2);
        }
        if (param0 <= 103) {
          wb.a(-31, 72, false, 62);
        }
        if ((this.field_e & 32) == 0) {
          ada.field_m.a(10, 7, var2);
        }
        if ((this.field_e & 64) == 0) {
          ew.field_q.a(36, 330, var2);
        }
    }

    static {
    }
}
