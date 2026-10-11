/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qka extends qra {
    private int[] field_r;
    static jpa[] field_o;
    private int field_n;
    static long[] field_m;
    static String field_s;
    private boolean field_q;
    private fna[] field_p;

    public static void b(byte param0) {
        field_m = null;
        if (param0 <= 28) {
          field_m = (long[]) null;
        }
        field_o = null;
        field_s = null;
    }

    qka(qh param0, v param1) {
        super(param0, param1);
        int var5 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        this.field_n = -1;
        try {
          this.field_r = new int[this.field_c.field_k];
          for (var3_int = 0; this.field_c.field_k > var3_int; var3_int++) {
            var4 = 0;
            for (var5 = 0; this.field_c.field_v.length > var5; var5++) {
              if (~var5 != ~var3_int &&
                this.field_c.field_v[var5] > this.field_c.field_v[var3_int] &&
                !this.field_c.f((byte) -96, var5)) {
                var4++;
              }
            }
            if (this.field_c.f((byte) -117, var3_int)) {
              var4 = this.field_c.field_k - 1;
            }
            if (this.field_c.field_z == -2) {
              var4 = 0;
            }
            this.field_r[var3_int] = var4;
          }
          if (this.field_h.d((byte) 116)) {
            er.b(1, 0);
          } else {
            if (0 == this.field_r[this.field_h.field_x] &&
              this.field_c.field_z >= 0) {
              er.b(1, 2);
            } else {
              er.b(1, 3);
            }
          }
          if (this.field_h.field_D &&
            !this.field_h.d((byte) 82)) {
            this.field_p = new fna[2];
            this.field_p[0] = new fna(33, wba.field_q[33], 1, false);
            this.field_p[0].field_b = aaa.a(false) - 110;
            this.field_p[0].field_i = koa.b(0) - 25;
            this.field_p[0].a(false);
            this.field_p[1] = new fna(34, wba.field_q[34], 1, false);
            this.field_p[1].field_b = 100;
            this.field_p[1].field_i = koa.b(0) - 25;
            this.field_p[1].a(false);
            return;
          }
          this.field_p = new fna[1];
          stackIn_26_0 = (this.field_h.field_D) ? 33 : 16;
          var3_intLifetime1 = stackIn_26_0;
          this.field_p[0] = new fna(var3_intLifetime1, wba.field_q[var3_intLifetime1], 0, false);
          this.field_p[0].field_b = -100 + aaa.a(false);
          this.field_p[0].field_i = koa.b(0) - 25;
          this.field_p[0].a(false);
          if (!this.field_h.field_D &&
            !vpa.a(43)) {
            this.field_p[0].field_e = aua.field_d.toUpperCase();
            pt.field_p = uta.a(3, this.field_h.m(-1), 0, 10, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("qka.<init>(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
          return false;
        }
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param2 == 13) {
          this.a(127, 0);
        } else {
          if (param2 == 34) {
            this.a(127, 0);
          } else {
            if (param2 == 83) {
              this.a(127, 0);
            }
          }
        }
        if (param1 != 25) {
          return false;
        }
        return true;
    }

    final void b(int param0, boolean param1) {
        int var19 = 0;
        int stackIn_4_0 = 0;
        fna stackIn_62_0;
        boolean stackIn_62_1;
        boolean stackIn_62_2;
        int stackIn_62_3;
        boolean stackIn_63_4;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var10_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        Object var12_ref = null;
        Exception var13_ref_Exception = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        String var23 = null;
        String var24 = null;
        var21 = TombRacer.field_G ? 1 : 0;
        ura.a(-10985);
        la.field_j.a(0, 0);
        if (this.field_h.field_D) {
          var3 = aaa.a(false) >> 1;
          var4 = (aaa.a(false) >> 1) / 3 + 37;
          var5 = 56;
          var6 = this.field_c.field_k;
          var22 = 0;
          var7 = var22;
          while (var22 < var6) {
            var8 = this.field_r[var22];
            var9 = -var8 + var6;
            var10 = -(var5 * var9) + koa.b(0);
            var11 = var4 * var22 + (var3 - (var4 >> 1) * (-1 + var6));
            this.field_c.field_H[var22].n((byte) -120).a(-1, var11, 800, 0, var10);
            vna.field_c.a(var11 - (vna.field_c.a() >> 1) + 1, var10 - 8);
            if (var8 == 0) {
              sta.field_y[-1 + sta.field_y.length].a(-(sta.field_y[sta.field_y.length - 1].a() >> 1) + var11 - 1, var10 - 12);
            }
            var12 = 150;
            cha.a(-60 + var11, 2, tga.field_a, 4, var10 - 250, 120, 65793 | var12 << 24, 1, 100);
            oka.a(this.field_h.a(var22, false).toUpperCase(), wga.field_a[var22], kn.field_p, -1, var10 - 230, var11, 0);
            try {
              tga.field_a.a(var11, var10 - 140, 10 + var11, -151 + var10, var11, var10 - 151, 65793 | var12 << 24, var12 << 24 | 65793, var12 << 24 | 65793, 1);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
            }
            if (!this.field_c.f((byte) -102, var22)) {
              var13 = 7829367;
              if (-2 != this.field_c.field_z) {
                be.a(gl.$cfr$intArgs$a$53ce4ab4c593(93, ga.field_K.toUpperCase(), new String[]{Integer.toString(this.field_c.field_v[var22])}).toUpperCase(), 1, kn.field_p, var13, 16, 60, 1, var10 - 243, -50 + var11, 0, (byte) 60, 100);
              } else {
                be.a(paa.field_y.toUpperCase(), 1, kn.field_p, var13, 16, 70, 1, var10 - 243, -50 + var11, 0, (byte) 60, 100);
              }
              if (this.field_c.g(69, var22)) {
                be.a(w.field_d.toUpperCase(), 1, kn.field_p, 3385907, 16, 40, 1, var10 - 203, -50 + var11, 0, (byte) 60, 100);
              }
            } else {
              oka.a(id.field_i.toUpperCase(), 11141120, kn.field_p, -1, var10 - 190, var11, 0);
            }
            var22++;
          }
        } else {
          var3 = aaa.a(false) >> 1;
          var4 = koa.b(0) >> 1;
          gg.field_f.a(-(gg.field_f.a() >> 1) + var3, -(gg.field_f.c() >> 1) + var4);
          var5 = 260;
          var6 = 40;
          var7 = var3;
          var8 = var4 - 80;
          kq.field_a.a(var7 - (kq.field_a.a() >> 1), var8 - (kq.field_a.c() >> 1));
          var9 = this.field_h.m(-1);
          stackIn_4_0 = (pl.a((byte) 64) != var9) ? 0 : 1;
          var11 = stackIn_4_0;
          if (var11 != 0) {
            var10_ref_String = id.field_k.toUpperCase();
          } else {
            var10_ref_String = vj.field_d[var9].toUpperCase();
          }
          be.a(var10_ref_String, 1, eda.field_f, 2431750, 8 + o.field_d.field_m, var6, 1, -(var6 >> 1) + var8, var7 - (var5 >> 1), -1, (byte) 60, var5);
          oka.a(this.field_h.a(this.field_h.field_x, false).toUpperCase(), wga.field_a[this.field_h.field_x], eda.field_f, -1, -15 + var4, var3, -1);
          if (this.field_c.field_z < 0) {
            oka.a(wpa.field_K.toUpperCase(), 2431750, eda.field_f, -1, var4 - 40, var3, -1);
            oka.a(sg.field_n.toUpperCase(), 2431750, kn.field_p, -1, 45 + var4, var3, -1);
          } else {
            oka.a(iaa.field_a.toUpperCase(), 2431750, eda.field_f, -1, -40 + var4, var3, -1);
            if (var9 == uca.field_a) {
              var12_ref = null;
              var13_ref_String = hb.field_v;
              if (ea.field_j == 3) {
                var12_ref = za.field_g;
                var13_ref_String = uaa.field_d;
              }
              if (ea.field_j == 2) {
                var13_ref_String = qna.field_c;
                var12_ref = bca.field_d;
              }
              if (ea.field_j == 1) {
                var13_ref_String = ps.field_P;
                var12_ref = rm.field_c;
              }
              if (var12_ref != null) {
                ((nh) (var12_ref)).a(var3 - (120 + ((nh) (var12_ref)).d() / 2), var4 - 10);
              }
              oka.a(var13_ref_String, 65793, kn.field_p, -1, 35 + var4, var3 - 120, -1);
            }
          }
          if (var11 != 0) {
            var24 = dea.a(this.field_c.c((byte) 115, this.field_h.field_x), (byte) -8);
            oka.a(cc.field_l.toUpperCase() + " " + var24.toUpperCase(), 2431750, kn.field_p, -1, 20 + var4, -120 + var3, -1);
            oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, var4, 120 + var3, -1);
            var13 = this.field_h.field_k.field_G[this.field_h.field_x].field_g.v(74);
            oka.a(Integer.toString(var13), 2431750, eda.field_f, -1, 20 + var4, 120 + var3, -1);
          } else {
            var23 = dea.a(this.field_c.c((byte) 115, this.field_h.field_x), (byte) -8);
            oka.a(cc.field_l.toUpperCase() + " " + var23.toUpperCase(), 2431750, kn.field_p, -1, 48 + var4, var3 - 120, -1);
            za.field_g.a(-200 + var3, var4 + 60);
            var13 = as.a(var9, 0);
            ts.a(-1, -36, var4 + 79, dea.a(var13, (byte) -8), -200 + (var3 + za.field_g.d()) + 5, kn.field_p, 2431750);
            bca.field_d.a(var3 - 110, 60 + var4);
            ts.a(-1, -92, 79 + var4, dea.a(var13 + var13 / 2, (byte) -8), bca.field_d.d() + (var3 - 110) + 5, kn.field_p, 2431750);
            oka.a(lc.field_L.toUpperCase(), 2431750, eda.field_f, -1, 5 + var4, 120 + var3, -1);
            var14 = this.field_h.field_k.field_G[this.field_h.field_x].field_g.v(110);
            oka.a(Integer.toString(var14), 2431750, eda.field_f, -1, var4 + 22, var3 + 120, -1);
            if (pt.field_p != null &&
              pt.field_p.field_p != null &&
              pt.field_p.field_h) {
              var15 = pt.field_p.field_p[1][0];
              var16 = -var15 + var14;
              if (var15 != 0) {
                oka.a(gl.$cfr$intArgs$a$53ce4ab4c593(103, lea.field_F, new String[]{Integer.toString(var15).toUpperCase() + " " + qu.a(var16, -1)}), 2431750, kn.field_p, -1, 50 + var4, 120 + var3, -1);
              }
              var17 = 0;
              var18 = null;
              for (var19 = 0; pt.field_p.field_k[2].length > var19; var19++) {
                var20 = pt.field_p.field_k[2][var19];
                if (ue.a(var20, 0)) {
                  continue;
                }
                var17 = pt.field_p.field_p[2][var19];
                var18 = var20;
                break;
              }
              if (var18 != null) {
                var16 = var14 - var17;
                be.a(gl.$cfr$intArgs$a$53ce4ab4c593(121, qw.field_g, new String[]{Integer.toString(var17).toUpperCase() + " " + qu.a(var16, -1), (String) (var18)}), 0, kn.field_p, 2431750, 13, 50, 1, var4 + 60, var3, -1, (byte) 60, 240);
              }
            }
          }
        }
        se.f((byte) -6);
        for (var3 = 0; var3 < this.field_p.length; var3++) {
          stackIn_62_0 = this.field_p[var3];
          stackIn_62_1 = false;
          stackIn_62_2 = true;
          stackIn_62_3 = 1;
          stackIn_63_4 = (this.field_n == var3);
          ((fna) (Object) stackIn_62_0).a(stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_63_4);
        }
        if (param0 >= -50) {
          field_m = (long[]) null;
        }
    }

    private final void a(int param0, int param1) {
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          return;
        }
        if (param0 <= 114) {
          this.b(-124, false);
        }
        if (param1 == 0) {
          this.field_h.b(false, true, 0);
          if (this.field_h.field_D) {
            r.a(0, this.field_h.d((byte) 120));
          } else {
            ea.field_j = -1;
          }
        } else {
          if (param1 == 1) {
            ql.field_k.k(67, -2988);
          }
        }
    }

    final void a(int param0, boolean param1) {
        hf stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_24_0 = 0;
        fna stackIn_29_0 = null;
        boolean stackIn_29_1 = false;
        boolean stackIn_30_2 = false;
        int var3;
        int var4;
        hf var4_ref_hf;
        int var5;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = 0; var3 < this.field_c.field_H.length; var3++) {
          var4_ref_hf = (hf) (this.field_c.field_H[var3].n((byte) -67));
          if (!this.field_q) {
            stackIn_5_0 = var4_ref_hf;
            stackIn_5_1 = 26;
            if (var3 != this.field_c.field_z) {
              stackIn_6_2 = 0;
            } else {
              stackIn_6_2 = 23;
            }
            ((hf) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_6_2, false);
          }
          var4_ref_hf.a(21463);
          var4_ref_hf.f(-4366);
        }
        this.field_n = -1;
        this.field_q = true;
        if (param0 != 80) {
          this.b(12, true);
        }
        for (var3Lifetime1 = 0; this.field_p.length > var3Lifetime1; var3Lifetime1++) {
          if (param1) {
            if (this.field_p[var3Lifetime1].field_b - 80 <= jba.field_j) {
              if (jba.field_j < 80 + this.field_p[var3Lifetime1].field_b) {
                if (-25 + this.field_p[var3Lifetime1].field_i <= sta.field_B) {
                  stackIn_24_0 = (this.field_p[var3Lifetime1].field_i + 25 > sta.field_B) ? 1 : 0;
                } else {
                  stackIn_24_0 = 0;
                }
              } else {
                stackIn_24_0 = 0;
              }
            } else {
              stackIn_24_0 = 0;
            }
          } else {
            stackIn_24_0 = 0;
          }
          var4 = stackIn_24_0;
          if (var4 != 0) {
            this.field_n = var3Lifetime1;
          }
          stackIn_29_0 = this.field_p[var3Lifetime1];
          stackIn_29_1 = true;
          stackIn_30_2 = (this.field_n == var3Lifetime1);
          ((fna) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_30_2, true, 6);
          if (param1 &&
            var4 != 0 &&
            0 != hf.field_b) {
            this.a(120, var3Lifetime1);
          }
        }
        if (this.field_h.field_D &&
          !this.field_h.d((byte) 69)) {
          var3Lifetime2 = this.field_h.field_k.field_t;
          if ((var3Lifetime2 >> this.field_h.field_x & 1) == 1) {
            this.field_p[1].field_e = df.field_I.toUpperCase();
          } else {
            if (var3Lifetime2 != 0) {
              this.field_p[1].field_e = ot.field_t.toUpperCase();
            } else {
              if (this.field_h.field_k.a(this.field_h.field_x, true)) {
                this.field_p[1].field_e = sl.field_g.toUpperCase();
              } else {
                this.field_p[1].field_e = kna.field_E.toUpperCase();
              }
            }
          }
        }
    }

    static {
        field_s = "Solo Adventure";
    }
}
