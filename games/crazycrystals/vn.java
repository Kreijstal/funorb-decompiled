/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends ue {
    static int field_f;
    private m field_t;
    private int field_j;
    private boolean field_r;
    private boolean field_p;
    private int field_h;
    private boolean field_k;
    private boolean field_n;
    private int field_l;
    private re field_g;
    private int field_q;
    private int field_v;
    private int field_e;
    private boolean field_u;
    private boolean field_s;
    private int field_o;
    static String field_i;
    static String field_m;

    final void b(int param0) {
        int var15 = 0;
        int stackIn_5_0 = 0;
        re stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_74_0 = 0;
        String stackIn_77_0 = null;
        ef stackIn_79_0 = null;
        String stackIn_80_1 = null;
        int stackIn_82_2;
        int stackIn_82_3;
        int stackIn_83_4 = 0;
        ef stackIn_85_0 = null;
        String stackIn_86_1 = null;
        ik stackIn_106_0 = null;
        boolean stackIn_107_1 = false;
        int stackIn_110_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        dl var11;
        int var12;
        String var13;
        int var14;
        int var16;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1Lifetime1;
        dl var11Lifetime1;
        dl var11Lifetime2;
        var16 = CrazyCrystals.field_B;
        this.field_g.e(41);
        if (param0 != 8) {
          this.b(-19);
        }
        var2 = 580 * qb.field_a * qb.field_a / 400 + 30;
        if (!this.field_n) {
          stackIn_5_0 = this.field_v;
        } else {
          stackIn_5_0 = this.field_v - 30;
        }
        var3 = stackIn_5_0;
        var4 = this.field_l;
        wi.a(30, jn.field_o, var3, var4 - var3, (byte) -71, -30 + var2);
        kh.d(38, var3 + 8, -46 + var2, -16 + (var4 - var3), 0, 192);
        if (this.field_g.field_f != 0) {
          return;
        }
        stackIn_9_0 = this.field_g;
        stackIn_10_1 = (this.field_u) ? -1 : 10;
        ((re) (Object) stackIn_9_0).a(stackIn_10_1, false);
        if (qb.field_a != 20) {
          return;
        }
        if (this.field_n) {
          go.field_l.c(rp.field_a, 320, this.field_v - 5, 16777215, -1);
        }
        var5 = this.field_o;
        var6 = fk.field_s;
        var7 = this.c((byte) -55);
        var8 = 304 - 20 * (-1 + var7 / 2);
        if (this.field_n) {
          var6 = pc.field_y;
          var8 = 324 - 20 * mm.a(var6, (byte) -37);
        }
        var9 = this.field_q;
        for (var10 = 0; 17 > var10; var10++) {
          if (this.a(var10, (byte) -92) && (!this.field_n ||
            0 != (var6 & 1 << var10))) {
            L26: {
              if (this.field_o != var10 && (!(var8 <= qh.field_i) ||
                !(32 + var8 > qh.field_i) ||
                !(bm.field_h >= var9) ||
                !(bm.field_h < var9 + 32))) {
                var11 = oj.field_B;
                if (mo.field_l <= 0 &&
                  (1 << var10 & 769) == 0) {
                  var11 = p.field_k;
                }
                if ((1 << var10 & var6) != 0) {
                  var11 = cn.field_c[var10];
                }
                var11.a(var8, var9);
                break L26;
              }
              var11Lifetime2 = ro.field_q;
              if (mo.field_l <= 0 &&
                (1 << var10 & 769) == 0) {
                var11Lifetime2 = ah.field_b;
              }
              if (0 != (var6 & 1 << var10)) {
                var11Lifetime2 = d.field_c[var10];
              }
              if (this.field_o != var10) {
                var11Lifetime2.d(var8 - 2, -2 + var9, 36, 36);
                var5 = var10;
              } else {
                var11Lifetime2.d(var8 - 4, -4 + var9, 40, 40);
              }
            }
            var8 += 40;
            if (!this.field_n &&
              var10 == var7 / 2 - 1) {
              var8 = var8 - var7 * 40 / 2;
              var9 += 40;
            }
          }
        }
        if (0 <= this.field_o) {
          var5 = this.field_o;
        }
        if (0 > var5) {
          if (!this.field_n ||
            0 != var6) {
            go.field_l.c(cd.field_A, 320, -5 + this.field_h, 8438015, -1);
          }
        } else {
          stackIn_63_0 = ((var6 & 1 << var5) == 0) ? 0 : 1;
          var10Lifetime1 = stackIn_63_0;
          go.field_l.c(jm.field_e[var5], 320, -5 + this.field_h, 16760896, -1);
          var11Lifetime1 = ro.field_q;
          if (mo.field_l <= 0 &&
            (1 << var5 & 769) == 0) {
            var11Lifetime1 = ah.field_b;
          }
          if (var10Lifetime1 != 0) {
            var11Lifetime1 = d.field_c[var5];
          }
          var8Lifetime1 = 256;
          var9Lifetime1 = this.field_h;
          var11Lifetime1.a(var8Lifetime1, var9Lifetime1);
          if (var10Lifetime1 == 0) {
            stackIn_74_0 = ((16 & 1 << var5) != 0) ? 1 : 0;
          } else {
            stackIn_74_0 = 0;
          }
          var12 = stackIn_74_0;
          if (var12 != 0) {
            stackIn_77_0 = vh.field_n;
          } else {
            stackIn_77_0 = an.field_o[var5];
          }
          var13 = stackIn_77_0;
          var14 = 1 + go.field_l.a(var13, 191);
          var9Lifetime1Lifetime1 = -(var14 * 20 / 2) + (15 + this.field_h) + 64;
          var9Lifetime1Lifetime1 = var9Lifetime1Lifetime1 + 20 * go.field_l.a(var13, 50, -go.field_l.field_o + var9Lifetime1Lifetime1, 191, 1000, 8438015, -1, 2, 0, 20);
          stackIn_79_0 = go.field_l;
          if (var10Lifetime1 == 0) {
            stackIn_80_1 = fl.field_l;
          } else {
            stackIn_80_1 = bm.field_j;
          }
          stackIn_82_2 = 241;
          stackIn_82_3 = var9Lifetime1Lifetime1;
          if (var10Lifetime1 != 0) {
            stackIn_83_4 = 16760896;
          } else {
            stackIn_83_4 = 16728064;
          }
          ((ef) (Object) stackIn_79_0).b(stackIn_80_1, stackIn_82_2, stackIn_82_3, stackIn_83_4, -1);
          go.field_l.b(ih.field_d, 510, -5 + (64 + this.field_h), 8438015, -1);
          stackIn_85_0 = go.field_l;
          if (var12 == 0) {
            stackIn_86_1 = Integer.toString(tm.field_a[var5]);
          } else {
            stackIn_86_1 = "?";
          }
          ((ef) (Object) stackIn_85_0).a(stackIn_86_1, 510, -5 + (64 + this.field_h), 16760896, -1);
          go.field_l.b(lc.field_b, 510, this.field_h + 64 + 15, 8438015, -1);
          if (var12 == 0) {
            for (var15 = 0; var15 < eq.field_l[var5]; var15++) {
              ne.field_i.a(5 * var15 + 510, this.field_h + 64);
            }
          } else {
            go.field_l.a("?", 510, 15 + this.field_h + 64, 16760896, -1);
          }
        }
        if ((var6 & 4096) != 0) {
          an.field_q.c(pp.field_i, 320, this.field_j, 8438015, -1);
        }
        if (rc.a(param0 - 110)) {
          go.field_l.c(el.field_f, 320, this.field_e, 16760896, -1);
        }
        for (var10Lifetime2 = 0; var10Lifetime2 < this.field_d.length; var10Lifetime2++) {
          if (null != this.field_d[var10Lifetime2]) {
            stackIn_106_0 = this.field_d[var10Lifetime2];
            stackIn_107_1 = (var10Lifetime2 == this.field_b.field_c);
            if (this.field_b.field_c == var10Lifetime2) {
              stackIn_110_2 = 16777215;
            } else {
              stackIn_110_2 = 12640511;
            }
            ((ik) (Object) stackIn_106_0).a(stackIn_107_1, stackIn_110_2, 1);
          }
        }
        return;
    }

    public static void c(int param0) {
        field_i = null;
        field_m = null;
        if (param0 != -100) {
          field_i = (String) null;
        }
    }

    final boolean a(int param0) {
        if (this.field_b.field_c == 0 &&
          this.field_b.a(true) &&
          rc.a(-70)) {
          this.field_s = true;
          return true;
        }
        if (this.field_b.field_c == 1 &&
          this.field_b.a(true) &&
          this.field_t != null) {
          this.field_p = true;
          return true;
        }
        if (param0 <= 99) {
          this.field_s = true;
        }
        if (this.field_b.field_c != 2) {
          return false;
        }
        if (!this.field_b.a(true)) {
          return false;
        }
        if (this.field_n &&
          mo.field_l == 0 &&
          dk.field_h < uo.field_o) {
          this.field_r = true;
        } else {
          this.field_u = true;
        }
        return true;
    }

    private final int c(byte param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = CrazyCrystals.field_B;
        var2 = 0;
        if (param0 > -32) {
          this.a(10);
        }
        for (var3 = 0; var3 < 17; var3++) {
          if (this.a(var3, (byte) -92)) {
            var2++;
          }
        }
        return var2;
    }

    private final void b(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        this.field_v = 100;
        var2 = 115;
        this.field_q = var2;
        if (!this.field_n) {
          var2 += 40;
        }
        var2 += 65;
        this.field_h = var2;
        var2 += 145;
        if (rc.a(-77)) {
          this.field_e = var2;
          var2 += 25;
        }
        var3 = fk.field_s;
        if (this.field_n) {
          var3 = pc.field_y;
        }
        if ((4096 & var3) != 0) {
          this.field_j = var2;
          var2 += 20;
        }
        this.field_l = -3 + var2;
        var2 += 10;
        var4 = var2;
        if (rc.a(-121)) {
          var2 += 35;
        }
        var5 = var2;
        if (this.field_t != null) {
          var2 += 35;
        }
        var6 = var2;
        var2 += 20;
        if (param0) {
          return;
        }
        var7 = (-var2 + 480) / 2;
        this.field_h = this.field_h + var7;
        var4 = var4 + var7;
        this.field_v = this.field_v + var7;
        this.field_j = this.field_j + var7;
        this.field_q = this.field_q + var7;
        this.field_e = this.field_e + var7;
        var6 = var6 + var7;
        this.field_l = this.field_l + var7;
        var5 = var5 + var7;
        if (!this.field_n) {
          var8 = (-110 + this.field_v) / 2;
          this.field_v = 110;
          this.field_e = this.field_e - var8;
          this.field_j = this.field_j - var8;
          this.field_h = this.field_h - var8;
          this.field_q = this.field_q - var8;
        }
        this.field_d = new ik[3];
        if (rc.a(-29)) {
          this.field_d[0] = (ik) ((Object) new mh(200, var4, 240, si.field_a, 2));
        }
        if (null != this.field_t) {
          this.field_d[1] = (ik) ((Object) new mh(200, var5, 240, gm.field_b, 2));
        }
        this.field_d[2] = (ik) ((Object) new mh(200, var6, 240, ag.field_a, 2));
        return;
    }

    final void a(boolean param0) {
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        var7 = CrazyCrystals.field_B;
        if (this.field_u) {
          if (qb.field_a > 0) {
            qb.field_a = qb.field_a - 1;
          }
          if (0 == qb.field_a) {
            a.field_b = (ue) ((Object) this.field_g);
            this.field_g.a(this.field_b.field_i, -13880);
          }
          this.field_g.a(param0);
          return;
        }
        if (!this.field_n) {
          this.field_g.f(-96);
          this.field_g.c((byte) 65);
          this.field_g.a((byte) 20, 10);
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.field_p &&
          !this.field_r) {
          if (this.field_s) {
            if (0 < qb.field_a) {
              qb.field_a = qb.field_a - 1;
            }
            this.field_g.c(2, 40, 180);
            if (this.field_g.field_f < 40) {
              return;
            }
            if (!this.field_k) {
              rk.a(0);
              this.field_b.a(-1, true, -1);
              this.field_k = true;
              return;
            }
            this.field_k = false;
            this.field_s = false;
            if (!rc.a(-46)) {
              this.b(false);
              if (this.field_t != null) {
                this.field_t.d(136);
              }
            }
          }
          if (qb.field_a < 20) {
            qb.field_a = qb.field_a + 1;
          }
          this.field_g.c(-1);
          if (param0) {
            return;
          }
          do {
            if (!ge.b(-26)) {
              this.a((byte) 95);
              if (0 != pj.field_v) {
                var2 = fk.field_s;
                var3 = this.c((byte) -117);
                var4 = 304 - var3 / 2 * 20 + 20;
                if (this.field_n) {
                  var2 = pc.field_y;
                  var4 = 324 - 20 * mm.a(var2, (byte) -43);
                }
                var5 = this.field_q;
                for (var6 = 0; var6 < 17; var6++) {
                  if (this.a(var6, (byte) -92) && (!this.field_n ||
                    (1 << var6 & var2) != 0)) {
                    if (to.field_a >= var4 &&
                      to.field_a < var4 + 32 &&
                      var5 <= dp.field_h &&
                      dp.field_h < 32 + var5) {
                      if (var6 != this.field_o) {
                        this.field_o = var6;
                      } else {
                        this.field_o = -1;
                      }
                    }
                    var4 += 40;
                    if (!this.field_n &&
                      var6 == -1 + var3 / 2) {
                      var5 += 40;
                      var4 = var4 - 40 * var3 / 2;
                    }
                  }
                }
                return;
              }
              return;
            }
            if (pj.field_q == 98) {
              while (true) {
                if (0 >= this.field_b.field_c) {
                  this.field_b.field_c = 3;
                }
                this.field_b.field_c = this.field_b.field_c - 1;
                if (null == this.field_d[this.field_b.field_c]) {
                  continue;
                }
                break;
              }
              this.field_b.field_i = false;
            }
            if (pj.field_q == 99) {
              while (true) {
                this.field_b.field_c = this.field_b.field_c + 1;
                if (3 <= this.field_b.field_c) {
                  this.field_b.field_c = 0;
                }
                if (this.field_d[this.field_b.field_c] == null) {
                  continue;
                }
                break;
              }
              this.field_b.field_i = false;
            }
            this.field_b.a((byte) -124);
            if (this.a(112)) {
              return;
            }
          } while (pj.field_q != 13 &&
            !this.field_b.a(true));
          this.field_b.field_i = false;
          if (null != this.field_t) {
            this.field_p = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_n &&
              mo.field_l == 0 &&
              dk.field_h < uo.field_o) {
              this.field_r = true;
              return;
            }
            this.field_u = true;
            return;
          }
        }
        if (decompiledFrameRemainder0) {
          if (qb.field_a > 0) {
            qb.field_a = qb.field_a - 1;
          }
          if (qb.field_a == 0) {
            if (!this.field_r) {
              a.field_b = (ue) ((Object) this.field_t);
              this.field_t.a(this.field_b.field_i, -13880);
              decompiledFrameRemainder0 = false;
            }
            else {
              a.field_b = (ue) ((Object) new rb(this.field_g, this.field_b.field_i));
            }
          }
          if (decompiledFrameRemainder0) {
            return;
          }
        }

    }

    vn(m param0, re param1, boolean param2) {
        super(3);
        this.field_o = -1;
        try {
          if (!(a.field_b instanceof vn)) {
            qb.field_a = 0;
          }
          this.field_g = param1;
          this.field_n = param2 ? true : false;
          this.field_t = param0;
          this.field_b.field_c = -1;
          this.b(false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          int var3 = 0;
          RuntimeException stackIn_6_0 = null;
          StringBuilder stackIn_6_1 = null;
          String stackIn_7_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              var3 = 103 % ((-66 - param1) / 56);
              param0.getAppletContext().showDocument(gh.a(param0, var2, (byte) 67), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_6_0 = var2_ref2;
            stackIn_6_1 = new StringBuilder().append("vn.E(");
            if (param0 == null) {
              stackIn_7_2 = "null";
            } else {
              stackIn_7_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, byte param1) {
        int discarded$0 = 0;
        if (param1 != -92) {
          discarded$0 = this.c((byte) 0);
        }
        if ((fk.field_s & 1 << param0) != 0) {
          return true;
        }
        if (kf.field_e[param0] == -1) {
          return true;
        }
        if (!ai.a(100, kf.field_e[param0])) {
          return false;
        }
        return true;
    }

    static {
        field_i = "Creating your account";
        field_m = "From Level";
    }
}
