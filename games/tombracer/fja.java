/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fja extends qra {
    private boolean field_p;
    private qa[] field_n;
    private boolean field_o;
    private int field_q;
    private boolean field_m;

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != 80) {
          fja.a(59, 38, (byte) -62, 36, 61, 1);
        }
        var3 = this.field_h.l(115);
        if (this.field_o &&
          this.field_c.g(0)) {
          this.g(param0 - 208);
        }
        if (this.field_q > 0) {
          this.field_q = this.field_q - 1;
        }
        if (!this.field_h.field_D &&
          this.field_h.e(118)) {
          return;
        }
        if (this.field_c.e(2) == -1) {
          this.field_h.h(110);
        }
        for (var4 = 0; this.field_n.length > var4; var4++) {
          if (!this.field_n[var4].c(1727002282) &&
            this.field_c.f((byte) -127, var4)) {
            this.field_n[var4].a(60, true);
            this.field_n[var4].a(0, (byte) 108, 2 * aaa.a(false));
          }
        }
        if (this.field_h.d((byte) 95)) {
          if (!this.field_h.g(0, 0)) {
            if (this.field_h.g(param0 - 80, 1)) {
              this.field_h.e(1, 17219);
            }
          } else {
            this.field_h.e(-1, 17219);
          }
        } else {
          if (this.field_c.b((byte) 90, var3) &&
            !this.field_m) {
            this.field_m = true;
            if (this.field_h.c(false)) {
              this.field_h.a(new ova(this.field_h), 680);
            } else {
              this.field_h.a(new gi(this.field_h), param0 + 600);
            }
          }
        }
        this.b((byte) 101);
        var6 = 0;
        var4Lifetime1 = var6;
        while (var6 < this.field_n.length) {
          this.field_n[var6].a((byte) 111);
          var6++;
        }
        if (!this.field_h.field_D) {
          this.i(0);
        }
    }

    final void b(int param0, boolean param1) {
        int var3;
        int var4_int;
        String var4;
        int var5_int;
        la var5;
        int var6;
        int[][] var6_ref_int____;
        int var7_int;
        g var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        int var13;
        int var14;
        int[][] var15;
        hca var16;
        String var17;
        String var18;
        int[][] var19;
        int var4_intLifetime1;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var11Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var7_intLifetime1Lifetime1;
        String var12Lifetime1;
        String var12Lifetime2;
        String var12Lifetime3;
        String var12Lifetime4;
        String var12Lifetime4Lifetime1;
        String var12Lifetime4Lifetime2;
        int var7_intLifetime1Lifetime2;
        int var5_intLifetime1;
        int var5_intLifetime1Lifetime1;
        var14 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_h.l(81);
        this.field_n[var3].b(23479);
        if (!this.field_h.f((byte) 33)) {
          var4_int = 0;
          for (var5_int = 0; this.field_c.field_c.field_e.length > var5_int; var5_int++) {
            if (this.field_c.field_c.field_e[var5_int] == var3) {
              var4_int = var5_int;
            }
          }
          var5_int = 0;
          for (var6 = 0; var6 < this.field_c.field_H.length; var6++) {
            if (!this.field_c.f((byte) -81, var6)) {
              var5_int++;
            }
          }
          if (var5_int == 2) {
            var6Lifetime2 = 0;
            for (var7_int = 0; this.field_c.field_H.length > var7_int; var7_int++) {
              if (!this.field_c.f((byte) -85, var7_int) &&
                var3 != var7_int) {
                var6Lifetime2 = var7_int;
              }
            }
            this.field_n[var6Lifetime2].a(0, qu.field_e, -20186);
            this.field_n[var6Lifetime2].b(23479);
          } else {
            if (var5_int > 2) {
              var19 = new int[var5_int][2];
              var15 = var19;
              var6_ref_int____ = var15;
              var6_ref_int____[1] = new int[]{0, 2};
              if (var5_int == 4) {
                var6_ref_int____[2] = new int[]{1, 3};
                var6_ref_int____[3] = new int[]{1, 2};
              } else {
                var6_ref_int____[2] = new int[]{0, 1};
              }
              var6_ref_int____[0] = new int[]{1, 2};
              for (var7_int = 0; var19[var4_int].length > var7_int; var7_int++) {
                var8 = this.field_c.field_c.field_e[var19[var4_int][var7_int]];
                if (var8 != -1 &&
                  var3 != var8) {
                  this.field_n[var8].a(var7_int, mma.field_c, -20186);
                  this.field_n[var8].b(23479);
                }
              }
            }
          }
        }
        if (!this.field_h.f((byte) 33) &&
          !this.field_h.field_A) {
          if (this.field_h.d((byte) 78)) {
            var4_intLifetime1 = 16;
            var5_intLifetime1 = 16;
            var6Lifetime1 = 256;
            var7_intLifetime1 = 64;
            qa.a(var7_intLifetime1, var6Lifetime1, (byte) 109, var4_intLifetime1, aq.field_a, var5_intLifetime1);
            be.a(dpa.field_c, 0, qr.field_v, 11903361, 40, var7_intLifetime1, 1, var5_intLifetime1, var4_intLifetime1, 0, (byte) 60, var6Lifetime1);
            be.a(voa.field_q + ": " + this.field_h.j(var3, 9), 2, eda.field_f, 11903361, 40, var7_intLifetime1, 1, var5_intLifetime1, var4_intLifetime1, 1, (byte) 60, var6Lifetime1);
            var5_intLifetime1 = var5_intLifetime1 + (var7_intLifetime1 + 16);
            var7_intLifetime1Lifetime2 = 32;
            qa.a(var7_intLifetime1Lifetime2, var6Lifetime1, (byte) 80, var4_intLifetime1, aq.field_a, var5_intLifetime1);
            kn.field_p.a((aa) null, var6Lifetime1, 40, 0, var5_intLifetime1 + 2, fm.a(false, 0), wca.field_l, 1, fm.a(false, 11903361), tp.field_J, (byte) 116, var7_intLifetime1Lifetime2, 0, id.field_h, var4_intLifetime1, 1);
          }
          if (!param1) {
            return;
          }
          if (param0 >= -50) {
            this.field_o = true;
          }
          if (this.field_q > 0) {
            if (50 >= this.field_q) {
              var4 = jh.field_J;
            } else {
              var4 = hua.field_b.toUpperCase();
            }
            var5_intLifetime1Lifetime1 = 40 + ds.field_n.a(var4, (byte) 41);
            var6Lifetime1Lifetime1 = aaa.a(false) / 2;
            var7_intLifetime1Lifetime1 = koa.b(0) / 2;
            qa.a(64, var5_intLifetime1Lifetime1, (byte) 74, -(var5_intLifetime1Lifetime1 / 2) + var6Lifetime1Lifetime1, aq.field_a, -ds.field_n.field_d + (var7_intLifetime1Lifetime1 - 32));
            if (this.field_q > 50) {
              if (0 != this.field_c.field_K) {
                oka.a(var4, 16777215, eda.field_f, -1, var7_intLifetime1Lifetime1, var6Lifetime1Lifetime1, 0);
              } else {
                oka.a(uqa.field_z + " " + (1 + this.field_c.field_A), 16777215, eda.field_f, -1, 225, var6Lifetime1Lifetime1, 0);
                oka.a(var4, 16777215, eda.field_f, -1, 255, var6Lifetime1Lifetime1, 0);
              }
            } else {
              oka.a(var4, 16777215, eda.field_f, -1, var7_intLifetime1Lifetime1, var6Lifetime1Lifetime1, 0);
            }
          }
          if (this.field_p) {
            ua.a(4, kn.field_p, "Debug", 565, 0, 48, 16777215);
            ua.a(4, kn.field_p, "FPS: " + oea.field_f, 565, 0, 64, 16777215);
            if (this.field_h.field_D) {
              this.field_f.c(16);
            }
            if (var3 >= 0 &&
              this.field_h.f(-12963, var3)) {
              var16 = this.field_h.field_k.field_H[var3];
              var5 = var16.f((byte) 87);
              var6Lifetime1Lifetime2 = var5.q((byte) -82);
              if (this.field_c.field_K != 3) {
                if (this.field_c.i(0) != -1) {
                  var7 = doa.b(var6Lifetime1Lifetime2, 0, this.field_c.i(0));
                } else {
                  if (var5.j(0)) {
                    var7 = mna.a(0, var6Lifetime1Lifetime2);
                  } else {
                    var7 = kq.a(-111, var6Lifetime1Lifetime2);
                  }
                }
              } else {
                var7 = doa.b(var6Lifetime1Lifetime2, 0, pl.a((byte) 64));
              }
              var8Lifetime1 = 64;
              var9 = -64 + koa.b(0);
              var10 = var5.p((byte) 69);
              var11 = 16777215;
              ts.a(0, -34, -16 + var9, "Par Time: " + dea.a(var7.field_h, (byte) -8), var8Lifetime1, kn.field_p, 16777215);
              var17 = "Room total: " + dea.a(var10, (byte) -8);
              var12 = var17;
              var12Lifetime1 = var17;
              var12Lifetime2 = var17;
              if (9000 < var10) {
                var12Lifetime2 = var17 + " !!! :(";
                var11 = 16711680;
              } else {
                if (var10 > 3000) {
                  var12Lifetime2 = var17 + " :(";
                  var11 = 16776960;
                }
              }
              ts.a(0, -73, var9, var12Lifetime2, var8Lifetime1, kn.field_p, var11);
              var12Lifetime3 = "Member Only: " + kq.a(-112, var5.q((byte) -82)).field_d;
              ts.a(0, -80, 16 + var9, var12Lifetime3, var8Lifetime1, kn.field_p, 16777215);
              var13 = var16.L(2158);
              if (var13 > 0) {
                var11Lifetime1 = 16777215;
                var18 = "Last room total: " + dea.a(var13, (byte) -8);
                var12Lifetime4 = var18;
                var12Lifetime4Lifetime1 = var18;
                var12Lifetime4Lifetime2 = var18;
                if (var13 <= 9000) {
                  if (var13 > 3000) {
                    var11Lifetime1 = 16776960;
                    var12Lifetime4Lifetime2 = var18 + " :(";
                  }
                } else {
                  var12Lifetime4Lifetime2 = var18 + " !!! :(";
                  var11Lifetime1 = 16711680;
                }
                ts.a(0, -62, var9 + 32, var12Lifetime4Lifetime2, var8Lifetime1, kn.field_p, var11Lifetime1);
              }
              ts.a(0, -96, var9 + 46, "Room: " + var7.field_b + " (multi " + var7.field_a + ") (single  " + var6Lifetime1Lifetime2 + ")", var8Lifetime1, kn.field_p, 16777215);
              ts.a(0, -33, var9 + 62, "Group: " + var7.field_g, var8Lifetime1, kn.field_p, 16777215);
            }
          }
          return;
        }
    }

    final boolean a(char param0, int param1, int param2) {
        boolean stackIn_14_0 = false;
        boolean stackIn_23_1 = false;
        dl var5;
        dt var6;
        if (rda.d(20125)) {
          if (param2 == 28) {
            this.a(-1, (byte) -109);
            ica.field_a = true;
            return true;
          }
          if (param2 == 16) {
            this.a(0, (byte) -109);
            return true;
          }
          if (param2 == 17) {
            this.a(1, (byte) -109);
            return true;
          }
          if (18 == param2) {
            this.a(2, (byte) -109);
            return true;
          }
          if (19 == param2) {
            this.a(3, (byte) -109);
            return true;
          }
          if (param2 == 20) {
            this.a(4, (byte) -109);
            return true;
          }
          if (param2 == 21) {
            stackIn_14_0 = !(ica.field_a);
            ica.field_a = stackIn_14_0;
            return true;
          }
          if (param2 == 40) {
            stackIn_23_1 = !(this.field_p);
            this.field_p = stackIn_23_1;
            return true;
          }
          if (this.field_h.field_D) {
            return false;
          }
          var6 = this.field_c.f(this.field_h.field_x, param1 - 25);
          if (param2 == 25) {
            var6.a((byte) -114).b(7, true);
            return true;
          }
          if (param2 == 24) {
            if (!this.field_h.d(0)) {
              var5 = new dl(this.field_h, (ms) null);
              var5.a("TITLE!", "Lalala here is some text to test with", "Press fire to continue. Or not.", (byte) 125);
              this.field_h.a(var5, param1 + 655);
              return true;
            }
          } else {
            if (param2 == 22) {
              var6.field_g.a(1, (byte) 113);
              this.field_h.l((byte) -38);
            }
          }
          if (param2 == 41) {
            var6.b((byte) 114);
          }
        }
        if (param1 == 25) {
          return false;
        }
        this.field_m = true;
        return false;
    }

    private final void f(int param0) {
        this.field_o = false;
        if (param0 != 16) {
          this.a('ﾝ', -29, -124);
        }
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
          return true;
        }
        return true;
    }

    private final void a(int param0, int param1) {
        this.field_h.i(param1, param0 ^ 62);
        if (param0 != 0) {
          this.field_o = true;
        }
    }

    private final void b(byte param0) {
        int var2 = this.field_h.l(89);
        if (this.field_c.field_P <= 1) {
          this.field_n[var2].a(0, mf.field_d, -20186);
        } else {
          this.field_n[var2].a(0, dp.field_j, -20186);
        }
        if (param0 < 52) {
          this.field_p = false;
        }
    }

    private final void g(int param0) {
        this.field_o = false;
        this.field_q = 75;
        if (param0 >= -67) {
          this.field_m = true;
        }
    }

    private final void i(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5;
        int[][] var7;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!this.field_h.c(false) &&
          this.field_c.b(0)) {
          if (this.field_c.field_G[0].e(-31170)) {
            this.a(0, -2);
          } else {
            if (this.field_c.field_L > 1) {
              var7 = new int[this.field_c.field_k][3];
              for (var3 = 0; var3 < this.field_c.field_k; var3++) {
                for (var4 = 0; 3 > var4; var4++) {
                  var7[var3][var4] = this.field_c.field_H[var3].c(196608, var4);
                }
              }
              this.field_h.a((byte) 101, var7, this.field_h.field_x);
            } else {
              this.a(0, this.field_h.field_x);
            }
          }
        }
        if (param0 != 0) {
          this.field_q = 7;
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (4 <= param0) {
          this.field_h.field_A = true;
        }
        for (var3 = 0; var3 < this.field_n.length; var3++) {
          if (~this.field_h.l(112) == ~var3 ||
            this.field_h.d((byte) 102)) {
            this.field_n[var3].a((byte) -115, param0);
          }
        }
        if (param1 != -109) {
          this.field_q = 52;
        }
    }

    final static boolean h(int param0) {
        if (param0 <= 83) {
          fja.a(-107, -110, (byte) -67, -77, -33, 57);
        }
        fpa.field_c = true;
        oga.field_f = 15000L + bva.b((byte) -107);
        return gda.field_c == 11 ? true : false;
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        if (param2 < 122) {
          return;
        }
        tga.field_a.za(param0, param5, param4, jg.a(param3, (byte) -115, param1), 2);
    }

    final static int a(goa param0, String param1, boolean param2, int param3, goa param4, int param5, int param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        uia stackIn_14_0 = null;
        String stackIn_15_1 = null;
        uia stackIn_17_0 = null;
        String stackIn_18_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5 < 77) {
            stackIn_3_0 = 113;
            return stackIn_3_0;
          }
          var14 = param4.a(-12851);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param0.a(-12851);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (oba.field_e == null &&
            !joa.a(false, (byte) -58)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (km.field_p == sua.field_G) {
            ql.field_k.field_h = 0;
            kia.field_b = null;
            if (param1 != null) {
              var9 = 0;
              jg.field_a.field_h = 0;
              if (param2) {
                var9 = var9 | 1;
              }
              jg.field_a.a(lpa.field_p.nextInt(), (byte) 91);
              jg.field_a.a(lpa.field_p.nextInt(), (byte) 92);
              jg.field_a.a(var14, (byte) 0);
              jg.field_a.a(var8, (byte) 0);
              var15 = (CharSequence) ((Object) param1);
              jg.field_a.a(fl.a((byte) 126, var15), (byte) 0);
              jg.field_a.f(-1477662136, param6);
              jg.field_a.i(param3, 0);
              jg.field_a.i(var9, 0);
              ql.field_k.i(18, 0);
              ql.field_k.field_h = ql.field_k.field_h + 2;
              var10 = ql.field_k.field_h;
              var11_ref_StringLifetime4 = qla.a(0, di.a(62));
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              ql.field_k.a(var11_ref_StringLifetime4, false);
              bna.a(oca.field_a, false, c.field_f, ql.field_k, jg.field_a);
              ql.field_k.b(ql.field_k.field_h - var10, (byte) -35);
            } else {
              jg.field_a.field_h = 0;
              jg.field_a.a(lpa.field_p.nextInt(), (byte) -106);
              jg.field_a.a(lpa.field_p.nextInt(), (byte) 92);
              stackIn_14_0 = jg.field_a;
              if (!param4.a((byte) 29)) {
                stackIn_15_1 = "";
              } else {
                stackIn_15_1 = var14;
              }
              ((uia) (Object) stackIn_14_0).a(stackIn_15_1, (byte) 0);
              stackIn_17_0 = jg.field_a;
              if (param0.a((byte) 29)) {
                stackIn_18_1 = var8;
              } else {
                stackIn_18_1 = "";
              }
              ((uia) (Object) stackIn_17_0).a(stackIn_18_1, (byte) 0);
              ql.field_k.i(16, 0);
              ql.field_k.field_h = ql.field_k.field_h + 1;
              var9 = ql.field_k.field_h;
              bna.a(oca.field_a, false, c.field_f, ql.field_k, jg.field_a);
              ql.field_k.d(ql.field_k.field_h - var9, (byte) -115);
            }
            bl.a(-1, -1);
            km.field_p = hca.field_p;
          }
          if (hca.field_p == km.field_p &&
            ama.a(1, -1)) {
            var9Lifetime1 = vc.field_q.h(255);
            vc.field_q.field_h = 0;
            if (var9Lifetime1 >= 100 &&
              var9Lifetime1 <= 105) {
              km.field_p = ne.field_c;
              dja.field_s = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                pu.a(di.a(21), 255);
                io.field_b = qda.field_f;
                dea.a(60);
                uc.field_L = false;
                stackIn_33_0 = var9Lifetime1;
                return stackIn_33_0;
              }
              if (99 == var9Lifetime1) {
                ama.a(bha.f(1), -1);
                kia.field_b = new Boolean(di.a(vc.field_q, (byte) 107));
                vc.field_q.field_h = 0;
              } else {
                oka.field_z = var9Lifetime1;
                km.field_p = pe.field_m;
                uca.field_d = -1;
              }
            }
          }
          if (km.field_p == ne.field_c) {
            var9Lifetime2 = 2;
            if (ama.a(var9Lifetime2, -1)) {
              var10Lifetime1 = vc.field_q.d(124);
              vc.field_q.field_h = 0;
              if (ama.a(var10Lifetime1, -1)) {
                var11 = dja.field_s.length;
                for (var12 = 0; var11 > var12; var12++) {
                  dja.field_s[var12] = vc.field_q.f(121);
                }
                dea.a(60);
                uc.field_L = false;
                stackIn_46_0 = var11 + 100;
                return stackIn_46_0;
              }
            }
          }
          if (pe.field_m == km.field_p &&
            cla.g(0)) {
            if (oka.field_z == 255) {
              var9_ref_String = vc.field_q.c(-28690);
              if (var9_ref_String != null) {
                mp.a(var9_ref_String, di.a(82), -21407);
              }
            } else {
              io.field_b = vc.field_q.e((byte) -76);
            }
            dea.a(60);
            uc.field_L = false;
            stackIn_57_0 = oka.field_z;
            return stackIn_57_0;
          }
          if (null == oba.field_e) {
            if (uc.field_L) {
              if (rf.b((byte) -121) > 30000L) {
                io.field_b = hb.field_u;
              } else {
                io.field_b = sq.field_x;
              }
              uc.field_L = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = nn.field_b;
            nn.field_b = uq.field_a;
            uq.field_a = var9Lifetime3;
            uc.field_L = true;
          }
          stackIn_68_0 = -1;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("fja.S(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        vh var5 = null;
        byte[] var6 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 > 0) {
            var8 = new byte[param0];
            var4 = var8;
            for (var5_int = 0; var5_int < param0; var5_int++) {
              var8[var5_int] = param1[param2 + var5_int];
            }
          } else {
            var4 = param1;
          }
          var5 = new vh();
          var5.b((byte) -6);
          var5.a(var4, (long)(param3 * param0), (byte) -59);
          var6 = new byte[64];
          var5.a(0, param3 ^ 40, var6);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("fja.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    fja(qh param0, v param1) {
        super(param0, param1);
        int var3_int = 0;
        int var4 = 0;
        this.field_p = false;
        this.field_o = true;
        this.field_m = false;
        try {
          var3_int = this.field_h.field_k.field_H.length;
          this.field_n = new qa[var3_int];
          for (var4 = 0; var4 < var3_int; var4++) {
            this.field_n[var4] = new qa(this.field_h, var4);
          }
          if (!this.field_h.f((byte) 33)) {
            if (this.field_h.c(false)) {
              this.f(16);
            }
            if (this.field_h.field_D) {
              this.field_h.a(new dua(this.field_h), 680);
            }
            er.b(1, 1);
          }
          this.field_h.field_r = -1;
          this.b((byte) 122);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
