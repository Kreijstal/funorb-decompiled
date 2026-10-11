/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    int field_b;
    boolean field_t;
    int field_c;
    bd[] field_h;
    boolean field_i;
    boolean field_m;
    boolean field_n;
    int field_k;
    private qn field_f;
    boolean field_a;
    int field_l;
    private int field_g;
    static String field_r;
    qi field_p;
    int field_s;
    int field_e;
    private int field_j;
    private qn field_d;
    private int field_q;
    static String field_o;

    final void a(boolean param0, int param1, int param2) {
        if (param1 != 26206) {
          this.g((byte) 95);
        }
        this.field_p.a(param0, 0, param2, this.a((byte) -118, ld.field_l, jh.field_R));
    }

    final void d(byte param0) {
        this.j(0);
        this.f(120);
        if (param0 > -47) {
          this.a(108);
        }
    }

    final void g(byte param0) {
        boolean discarded$2 = false;
        int discarded$3 = 0;
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        ec.a(this, 0);
        while (nm.e((byte) -96)) {
          if (13 == gk.field_r) {
            this.e((byte) -126);
            kc.field_o = false;
            ei.a(param0 - 238, false);
            return;
          }
          this.field_p.c(param0 ^ -119);
          if (!this.b(-91, false)) {
            continue;
          }
          return;
        }
        this.field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
        var2 = this.b(param0 ^ -22, true) ? 1 : 0;
        if (param0 != 118) {
          discarded$2 = this.d(-22, true);
        }
        if (var2 != 0) {
          return;
        }
        if (0 != rh.field_X) {
          discarded$3 = this.a(true, (byte) 116);
        }
        return;
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        int var3;
        boolean stackIn_16_0 = false;
        var3 = Confined.field_J ? 1 : 0;
        if (param0) {
          this.a(104);
        }
        for (var2 = 0; var2 < 2; var2++) {
          if (this.field_e != 0) {
            if (this.field_e >= 14) {
              this.field_e = (this.field_e + 1) % 28;
            } else {
              this.field_e = this.field_e - 1;
            }
          }
        }
        stackIn_16_0 = (this.field_e == 0);
        return stackIn_16_0;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        ec.a(this, param0 ^ 68);
        while (nm.e((byte) -96)) {
          this.field_p.c(-1);
          var2 = this.d(-98, false) ? 1 : 0;
          if (var2 != 0) {
            return;
          }
        }
        if (param0 != 68) {
          this.field_q = -126;
        }
        this.field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
        if (!this.d(param0 - 150, true)) {
        }
    }

    private final void k(int param0) {
        if (this.field_q < param0) {
          this.field_q = this.field_q + 1;
          this.e((byte) -124);
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        bd var5;
        int var6;
        var6 = Confined.field_J ? 1 : 0;
        if (param0 != -118) {
          this.g((byte) 99);
        }
        param1 += 0;
        for (var4 = 0; this.field_p.field_k > var4; var4++) {
          var5 = this.field_h[var4];
          if (param1 >= var5.field_j &&
            param1 < var5.field_f + var5.field_j &&
            var5.field_b <= param2 &&
            param2 < var5.field_b + var5.field_i) {
            return var4;
          }
        }
        return -1;
    }

    private final void j(int param0) {
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int var2;
        int var3;
        int var5;
        bd var6;
        String var7;
        int var8;
        var8 = Confined.field_J ? 1 : 0;
        if (this.field_e != 14) {
          return;
        }
        stackIn_5_0 = (this.field_q > 0) ? 0 : 1;
        var2 = stackIn_5_0;
        if (8 <= this.field_q) {
          stackIn_8_0 = this.field_p.field_k - 1;
        } else {
          stackIn_8_0 = this.field_p.field_k;
        }
        var3 = stackIn_8_0;
        if (param0 != 0) {
          this.field_h = (bd[]) null;
        }
        for (var4 = var2; var4 < var3; var4++) {
          var5 = 9805732;
          if (this.field_p.field_i != var4) {
            dn.a(this.field_h[var4].field_f, 0 + this.field_h[var4].field_j, this.field_h[var4].field_b, ah.field_T, 208, -7992, this.field_h[var4].field_i);
          } else {
            dn.a(this.field_h[var4].field_f, 0 + this.field_h[var4].field_j, this.field_h[var4].field_b, lh.field_c, 208, param0 ^ -7992, this.field_h[var4].field_i);
            var5 = 16777215;
          }
          var6 = this.field_h[var4];
          var7 = var6.field_a;
          pn.field_a.a(var7, var6.field_j - 0, var6.field_b, var6.field_f, var6.field_i, var5, -1, 1, 1, 1);
        }
        return;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (this.field_e < 14) {
          var2 = this.field_e;
          if (var2 <= 0) {
            return;
          }
          var3 = (1 + var2) * this.field_b * (var2 + 1) / 225;
          var4 = this.field_k * 18 / (4 + var2);
          var5 = (-var4 + this.field_k) / 2 + this.field_s;
          var6 = (-var3 + this.field_b) / 2 + this.field_c;
          fn.b(var5 + 4, 4 + var6, -8 + var4, -8 + var3, 0, 150);
          di.a(var3, cj.field_a, (byte) -56, var5, var4, var6);
          return;
        }
        if (14 < this.field_e) {
          var2Lifetime1 = 28 - this.field_e;
          if (var2Lifetime1 <= 0) {
            return;
          }
          var3Lifetime1 = this.field_b * 18 / (var2Lifetime1 + 4);
          var4Lifetime1 = (1 + var2Lifetime1) * (var2Lifetime1 + 1) * this.field_k / 225;
          var5Lifetime1 = this.field_s + (-var4Lifetime1 + this.field_k) / 2;
          var6Lifetime1 = (this.field_b - var3Lifetime1) / 2 + this.field_c;
          fn.b(var5Lifetime1 + 4, 4 + var6Lifetime1, var4Lifetime1 - 8, var3Lifetime1 - 8, 0, 150);
          di.a(var3Lifetime1, cj.field_a, (byte) -94, var5Lifetime1, var4Lifetime1, var6Lifetime1);
          return;
        }
        var2Lifetime2 = -5 / ((param0 + 48) / 34);
        fn.b(0 + (this.field_s + 4), this.field_c + 4, this.field_k - 8, -8 + this.field_b, 0, 150);
        di.a(this.field_b, cj.field_a, (byte) -49, this.field_s - 0, this.field_k, this.field_c);
    }

    private final void f(int param0) {
        this.e(-5);
        if (this.field_e != 14) {
          return;
        }
        pn.field_a.a(1 + this.field_q + "/" + 9, 560, 312, 16777215, -1);
        if (param0 < 76) {
          return;
        }
        fj.a(this.field_q, -126);
    }

    final void f(byte param0) {
        int var4_int = 0;
        ce stackIn_33_0 = null;
        String stackIn_34_1 = null;
        ce stackIn_41_0 = null;
        String stackIn_42_1 = null;
        qn var2;
        int var3;
        Object var4;
        int var5;
        String[] var6_ref_String__;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int[] var17;
        int var5Lifetime1;
        int var8Lifetime1;
        var13 = Confined.field_J ? 1 : 0;
        this.a((byte) -120);
        if (param0 != 62) {
          this.b(20);
        }
        if (this.field_e != 14) {
          return;
        }
        if (al.field_d != 1) {
          if (null == this.field_f &&
            !tj.a(true)) {
            this.field_f = om.a(0, 1, 3, 10, (byte) -30);
          }
          var2 = this.field_f;
        } else {
          if (null == this.field_d &&
            !tj.a(true)) {
            this.field_d = om.a(1, 1, 3, 10, (byte) -30);
          }
          var2 = this.field_d;
        }
        var3 = pc.a(h.field_W, var2, 113, lc.field_J);
        pn.field_a.c(gh.field_b, 125, 29 + this.field_c, 4243584, -1);
        pn.field_a.a(tk.field_d, 400, 29 + this.field_c, 4243584, -1);
        pn.field_a.a(e.field_d, 545, this.field_c + 29, 4243584, -1);
        for (var4_int = 0; var4_int < 10; var4_int++) {
          var5 = 4243584;
          if (var3 == var4_int) {
            var5 = 16777215;
          }
          pn.field_a.a(var4_int + 1 + ".", 115, this.field_c + var4_int * 20 + 54, var5, -1);
        }
        var4 = km.field_b;
        var5Lifetime1 = 1;
        if (var2 != null) {
          if (!var2.field_t) {
            var4 = hm.field_W;
          } else {
            if (var2.field_u != null) {
              var6_ref_String__ = var2.field_u[h.field_W];
              var17 = var2.field_q[h.field_W];
              for (var8 = 0; var8 < 10; var8++) {
                if (var6_ref_String__[var8] != null) {
                  var4 = null;
                  var9 = 9805732;
                  var10 = var17[var8];
                  var11 = var10 / 25;
                  var12 = 1 + var10 % 25;
                  if (var8 == var3) {
                    var9 = 16777215;
                  }
                  pn.field_a.c(ok.a(var6_ref_String__[var8]), 125, 54 + (this.field_c + var8 * 20), var9, -1);
                  stackIn_33_0 = pn.field_a;
                  if (var12 != 25) {
                    stackIn_34_1 = Integer.toString(var12);
                  } else {
                    stackIn_34_1 = kc.field_q;
                  }
                  ((ce) (Object) stackIn_33_0).a(stackIn_34_1, 400, this.field_c + 54 + 20 * var8, var9, -1);
                  pn.field_a.a(Integer.toString(var11), 545, 20 * var8 + this.field_c + 54, var9, -1);
                }
              }
            } else {
              var4 = kl.field_H;
            }
            if (var3 < 0 &&
              null != lc.field_J &&
              var2.field_w == lc.field_J.field_r) {
              pn.field_a.c(ok.a(qc.field_m), 125, 259 + this.field_c, 16777215, -1);
              var6 = lc.field_J.field_s[0];
              var7 = var6 / 25;
              var8Lifetime1 = var6 % 25 + 1;
              stackIn_41_0 = pn.field_a;
              if (25 == var8Lifetime1) {
                stackIn_42_1 = kc.field_q;
              } else {
                stackIn_42_1 = Integer.toString(var8Lifetime1);
              }
              ((ce) (Object) stackIn_41_0).a(stackIn_42_1, 400, this.field_c + 259, 16777215, -1);
              pn.field_a.a(Integer.toString(var7), 545, this.field_c + 259, 16777215, -1);
              var5Lifetime1 = 0;
            }
          }
        }
        if (var4 != null) {
          pn.field_a.b((String) (var4), 320, 144 + this.field_c, 4243584, -1);
        }
        if (tj.a(true)) {
          pn.field_a.b(oc.field_b, 320, this.field_c + 259, 4243584, -1);
        } else {
          if (var5Lifetime1 != 0) {
            pn.field_a.b(sg.field_s, 320, 259 + this.field_c, 4243584, -1);
          }
        }
        return;
    }

    final void i(int param0) {
        int discarded$2 = 0;
        boolean discarded$3 = false;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        ec.a(this, param0 + 1);
        do {
          if (!nm.e((byte) -96)) {
            if (param0 != -1) {
              discarded$2 = this.a(true, (byte) -54);
            }
            this.field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
            discarded$3 = this.a(0, true);
            return;
          }
          if (gk.field_r == 13 &&
            this.field_a) {
            this.e((byte) -128);
            ac.a(false);
            return;
          }
          this.field_p.c(-1);
        } while (!this.a(0, false));
        return;
    }

    final void b(boolean param0, byte param1) {
        int discarded$0 = 0;
        if (param1 >= -114) {
          discarded$0 = this.a(false, (byte) -46);
        }
        this.field_p.a(this.a((byte) -118, ld.field_l, jh.field_R), param0, -110);
    }

    private final void b(int param0) {
        if (param0 != 320) {
          return;
        }
        if (this.field_q > 0) {
          this.field_q = this.field_q - 1;
          this.e((byte) -124);
        }
    }

    final void h(int param0) {
        boolean discarded$0 = false;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        if (param0 != 3678) {
          return;
        }
        ec.a(this, 0);
        do {
          if (!nm.e((byte) -96)) {
            this.field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
            discarded$0 = this.c(param0 - 3795, true);
            return;
          }
          if (gk.field_r == 13) {
            this.e((byte) -126);
            bj.field_m = false;
            ei.a(param0 ^ -3649, false);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!tj.a(true)) {
            this.field_p.h((byte) -128);
            if (this.field_p.field_i != 0 &&
              1 != this.field_p.field_i) {
              if (96 == gk.field_r) {
                h.field_W = (3 + (h.field_W - 1)) % 3;
                this.field_p.a(h.field_W + 2, -1);
                this.e((byte) -123);
                this.field_p.field_b = false;
              }
              if (gk.field_r == 97) {
                h.field_W = (1 + h.field_W) % 3;
                this.field_p.a(2 + h.field_W, param0 - 3679);
                this.e((byte) -125);
                this.field_p.field_b = false;
              }
            } else if (96 == gk.field_r ||
              gk.field_r == 97) {
              al.field_d = al.field_d ^ 1;
              this.field_p.a(al.field_d, param0 - 3679);
              this.e((byte) -128);
              this.field_p.field_b = false;
            }
            if (gk.field_r == 98) {
              if (2 <= this.field_p.field_i) {
                if (this.field_p.field_i < 5) {
                  this.field_p.a(al.field_d, -1);
                } else {
                  if (this.field_p.field_i == 5) {
                    this.field_p.a(h.field_W + 2, -1);
                  } else {
                    this.field_p.a(-1 + this.field_p.field_i, -1);
                  }
                }
              } else {
                this.field_p.a(this.field_p.field_k - 1, param0 - 3679);
              }
            }
            if (gk.field_r == 99) {
              if (this.field_p.field_i >= 0 &&
                this.field_p.field_k - 1 != this.field_p.field_i) {
                if (this.field_p.field_i < 2) {
                  this.field_p.a(2 + h.field_W, param0 - 3679);
                } else {
                  if (this.field_p.field_i >= 5) {
                    this.field_p.a(1 + this.field_p.field_i, -1);
                  } else {
                    this.field_p.a(5, param0 - 3679);
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_p.a(al.field_d, param0 - 3679);
              }
            }
          } else {
            this.field_p.c(-1);
          }
        } while (!this.c(-117, false));
        return;
    }

    private final void a(byte param0) {
        boolean discarded$0 = false;
        this.e(-82);
        if (param0 >= -113) {
          discarded$0 = this.a(19, false);
        }
        if (this.field_e != 14) {
          return;
        }
        this.d(36);
    }

    private final void c(byte param0) {
        int var2 = 0;
        if (param0 <= 124) {
          this.e((byte) -109);
        }
        if (this.field_p.field_b) {
          var2 = 128;
          if (!(this.field_p.field_i < 0)) {
            var2 = 256 * (this.field_h[this.field_p.field_i].field_f / 2 + this.field_h[this.field_p.field_i].field_j) / 640;
          }
          cj.a(12, 50, 2, ae.field_f, var2);
        }
    }

    private final boolean a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        var3 = -1;
        if (0 <= this.field_p.field_i) {
          var3 = this.field_h[this.field_p.field_i].field_d;
        }
        stackIn_5_0 = (this.field_q > 0) ? 0 : 1;
        var4 = stackIn_5_0;
        if (this.field_q < 8) {
          stackIn_8_0 = this.field_p.field_k;
        } else {
          stackIn_8_0 = this.field_p.field_k - 1;
        }
        var5 = stackIn_8_0;
        if (this.field_p.field_i >= var4 &&
          var5 > this.field_p.field_i) {
          this.c((byte) 126);
        }
        if ((var3 == 14 ||
          !param0) &&
          this.field_p.d((byte) 55)) {
          gh.field_k = false;
          da.field_e.b(param0, (byte) -123);
          this.e((byte) -120);
          return true;
        }
        if (param1 <= 17) {
          this.field_k = -19;
        }
        if (var3 == 20 &&
          this.field_p.d((byte) 55)) {
          this.b(320);
        }
        if (var3 == 21 &&
          this.field_p.d((byte) 55)) {
          this.k(8);
        }
        return false;
    }

    private final boolean c(int param0, boolean param1) {
        int var3;
        this.c((byte) 125);
        var3 = -1;
        if (0 <= this.field_p.field_i) {
          var3 = this.field_h[this.field_p.field_i].field_d;
        }
        if (var3 == 16 &&
          this.field_p.d((byte) 55)) {
          ol.a(4, (byte) 107, false);
          this.e((byte) -126);
          return true;
        }
        if ((var3 == 14 ||
          !param1) &&
          this.field_p.d((byte) 55)) {
          bj.field_m = false;
          ei.a(-46, param1);
          this.e((byte) -120);
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 &&
          0 != rh.field_X &&
          this.field_p.field_i != -1) {
          if ((this.field_p.field_i != 0 &&
            this.field_p.field_i != 1) &&
            (decompiledFrameRemainder0 = !(2 > this.field_p.field_i)) &&
            (decompiledFrameRemainder0 = !(5 <= this.field_p.field_i))) {
            h.field_W = this.field_p.field_i - 2;
            this.field_p.a(h.field_W + 2, -1);
            this.e((byte) -122);
            return true;
          }
          if (decompiledFrameRemainder0) {
            al.field_d = this.field_p.field_i;
            this.field_p.a(al.field_d, -1);
            this.e((byte) -127);
            return true;
          }
        }
        if (param0 < -114) {
        }
        return false;
    }

    final void h(byte param0) {
        this.a((byte) -117);
        if (param0 <= 79) {
          this.field_d = (qn) null;
        }
        if (this.field_e != 14) {
          return;
        }
        int var2 = this.a(false, (byte) 121);
        if (var2 >= 0) {
          tf.a((byte) 59, var2, this.field_c, this.field_l);
        } else {
          pn.field_a.b(rg.field_J, 320, this.field_c + 36, 4243584, -1);
        }
        if (tj.a(true)) {
          pn.field_a.b(oc.field_b, 320, 190 + this.field_c, 4243584, -1);
        }
        if (var2 == 5 &&
          0 != (32 & this.field_l)) {
          pn.field_a.b(lk.field_a, 320, this.field_c + 190, 4243584, -1);
        }
    }

    final void i(byte param0) {
        this.a((byte) -124);
        if (param0 != 126) {
          this.field_g = -27;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        bd var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        var11 = Confined.field_J ? 1 : 0;
        var5 = 0;
        for (var6 = 0; var6 < this.field_p.field_k; var6++) {
          var7 = this.field_h[var6];
          var8 = var7.field_f;
          if (var7.field_d == 7 ||
            var7.field_d == 8 ||
            var7.field_d == 9) {
            var8 += 133;
          }
          if (var7.field_d == 4) {
            var9 = pn.field_a.c(uc.field_Z);
            var10 = pn.field_a.c(sj.field_pb);
            if (var9 < var10) {
              var9 = var10;
            }
            var8 = var8 + var9;
          }
          if (var7.field_d == 5 ||
            var7.field_d == 6) {
            var9Lifetime1 = pn.field_a.c(pc.field_k);
            var10Lifetime1 = pn.field_a.c(ie.field_c);
            if (var10Lifetime1 > var9Lifetime1) {
              var9Lifetime1 = var10Lifetime1;
            }
            var10Lifetime1Lifetime1 = pn.field_a.c(al.field_a.toUpperCase());
            if (var9Lifetime1 < var10Lifetime1Lifetime1) {
              var9Lifetime1 = var10Lifetime1Lifetime1;
            }
            var10Lifetime1Lifetime2 = pn.field_a.c(di.field_c.toUpperCase());
            if (var9Lifetime1 < var10Lifetime1Lifetime2) {
              var9Lifetime1 = var10Lifetime1Lifetime2;
            }
            var8 = var8 + var9Lifetime1;
          }
          var7.field_b = param0 + param1 * var6;
          if (var5 < var8) {
            var5 = var8;
          }
        }
        if (param2 <= 27) {
          jb.l(-8);
        }
        var12 = 0;
        var6Lifetime1 = var12;
        while (this.field_p.field_k > var12) {
          this.field_h[var12].field_f = var5;
          this.field_h[var12].field_j = param3 - var5 / 2;
          var12++;
        }
    }

    private final int a(boolean param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var7Lifetime1;
        var9 = Confined.field_J ? 1 : 0;
        var3 = -1;
        if (param1 <= 108) {
          this.field_p = (qi) null;
        }
        var4 = ~this.field_l & 525312;
        var5 = 133;
        var6 = -76 + this.field_c;
        if (this.field_m) {
          var7 = 1023 & this.field_l;
          var5 = 304 - (-19 + vf.a(var7, -29047) * 19);
          if (0 == var7) {
            var6 -= 19;
          }
          if (var7 == this.field_l) {
            var6 += 19;
          }
        }
        var5 += 0;
        var10 = 0;
        var7Lifetime1 = var10;
        while (var10 < 20) {
          if (10 == var10) {
            var5 = 133;
            var6 += 38;
            if (this.field_m) {
              var8 = this.field_l & 1047552;
              var5 = 304 - (vf.a(var8, -29047) * 19 - 19);
            }
            var5 += 0;
          }
          if (!this.field_m ||
            0 != (this.field_l & 1 << var10)) {
            boolean decompiledFrameRemainder0 = true;
            if ((var4 & 1 << var10) == 0) {
              if (!param0) {
                if (this.field_j == var10) {
                  if ((1 << var10 & this.field_l) != 0) {
                    db.field_w[var10].c(var5 - 4, -4 + var6, 40, 40);
                  } else {
                    kn.field_g.c(var5 - 4, -4 + var6, 40, 40);
                  }
                } else {
                  if (ld.field_l >= var5 &&
                    var5 + 32 > ld.field_l &&
                    var6 <= jh.field_R &&
                    jh.field_R < var6 + 32) {
                    var3 = var10;
                    if ((1 << var10 & this.field_l) == 0) {
                      kn.field_g.c(var5 - 2, -2 + var6, 36, 36);
                    } else {
                      db.field_w[var10].c(var5 - 2, -2 + var6, 36, 36);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (0 != (this.field_l & 1 << var10)) {
                      db.field_w[var10].c(var5, var6, 32, 32);
                    } else {
                      kn.field_g.c(var5, var6, 32, 32);
                    }
                  }
                }
              } else {
                if (wm.field_hb >= var5 &&
                  32 + var5 > wm.field_hb &&
                  var6 <= m.field_a &&
                  var6 + 32 > m.field_a) {
                  if (var10 != this.field_j) {
                    this.field_j = var10;
                  } else {
                    this.field_j = -1;
                  }
                }
              }
            }
            var5 += 38;
          }
          var10++;
        }
        if (this.field_j >= 0) {
          var3 = this.field_j;
        }
        return var3;
    }

    private final boolean b(int param0, boolean param1) {
        this.c((byte) 126);
        int var3 = -1;
        int var4 = 111 / ((param0 + 36) / 38);
        if (0 <= this.field_p.field_i) {
          var3 = this.field_h[this.field_p.field_i].field_d;
        }
        if (var3 == 16 &&
          this.field_p.d((byte) 55)) {
          ol.a(3, (byte) 118, false);
          this.e((byte) -121);
          return true;
        }
        if ((var3 == 11 || 14 == var3 || !param1) &&
          this.field_p.d((byte) 55)) {
          kc.field_o = false;
          if (var3 == 14) {
            bj.field_m = false;
          }
          ei.a(-103, param1);
          this.e((byte) -122);
          return true;
        }
        return false;
    }

    final void a(byte param0, bd param1) {
        int fieldTemp$0 = 0;
        if (param0 >= -50) {
          return;
        }
        try {
          fieldTemp$0 = this.field_p.field_k;
          this.field_p.field_k = this.field_p.field_k + 1;
          this.field_h[fieldTemp$0] = param1;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jb.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void l(int param0) {
        field_r = null;
        field_o = null;
        if (param0 != 320) {
          double[] var2 = (double[]) null;
          jb.a((byte) 25, 2.354534812504287, (double[]) null);
        }
    }

    private final void d(int param0) {
        String stackIn_37_0 = null;
        String stackIn_43_0 = null;
        String stackIn_48_0 = null;
        int var2;
        bd var3;
        String var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        String var11_ref_String;
        int var11;
        int var12;
        var12 = Confined.field_J ? 1 : 0;
        var2 = 0;
        if (param0 != 36) {
          this.f((byte) 95);
        }
        while (var2 < this.field_p.field_k) {
          var3 = this.field_h[var2];
          var4 = var3.field_a;
          var5 = var3.field_b;
          var6 = var3.field_i;
          var7 = 9805732;
          if (var2 == this.field_p.field_i) {
            var7 = 16777215;
            dn.a(var3.field_f, 0 + var3.field_j, var5, lh.field_c, 208, param0 - 8028, var6);
          } else {
            dn.a(var3.field_f, var3.field_j + 0, var5, ah.field_T, 208, -7992, var6);
          }
          if (7 != var3.field_d &&
            var3.field_d != 8 &&
            var3.field_d != 9) {
            if (var3.field_d != 4 &&
              var3.field_d != 5 &&
              var3.field_d != 6) {
              if (var3.field_d == 18 &&
                var2 == al.field_d) {
                var7 = 16777215;
              }
              if (var3.field_d == 19 &&
                h.field_W == -2 + var2) {
                var7 = 16777215;
              }
              pn.field_a.a(var4, 0 + var3.field_j, var5, var3.field_f, var6, var7, -1, 1, 1, 20);
            } else {
              if (4 == var3.field_d) {
                var8 = pn.field_a.c(ef.field_ub);
                var9 = pn.field_a.c(uc.field_Z);
                var10 = pn.field_a.c(sj.field_pb);
                if (var10 > var9) {
                  var9 = var10;
                }
              } else {
                var8 = pn.field_a.c(qa.field_e);
                var10 = pn.field_a.c(cc.field_p);
                var9 = pn.field_a.c(pc.field_k);
                if (var10 > var8) {
                  var8 = var10;
                }
                var10 = pn.field_a.c(ie.field_c);
                if (var9 < var10) {
                  var9 = var10;
                }
                var10 = pn.field_a.c(al.field_a.toUpperCase());
                if (var10 > var9) {
                  var9 = var10;
                }
                var10 = pn.field_a.c(di.field_c.toUpperCase());
                if (var10 > var9) {
                  var9 = var10;
                }
              }
              var10 = (var8 - var9 + var3.field_f) / 2;
              pn.field_a.a(var4, 0 + var3.field_j, var5, var10, var6, var7, -1, 2, 1, 20);
              if (var3.field_d != 4) {
                if (var3.field_d == 5) {
                  if (qc.field_n) {
                    stackIn_48_0 = pc.field_k;
                  } else {
                    stackIn_48_0 = ie.field_c;
                  }
                  var11_ref_String = stackIn_48_0;
                } else {
                  if (6 != var3.field_d) {
                    throw new IllegalStateException();
                  }
                  if (mk.field_l) {
                    stackIn_43_0 = al.field_a;
                  } else {
                    stackIn_43_0 = di.field_c;
                  }
                  var11_ref_String = ((String) (Object) stackIn_43_0).toUpperCase();
                }
              } else {
                if (!pa.field_c) {
                  stackIn_37_0 = uc.field_Z;
                } else {
                  stackIn_37_0 = sj.field_pb;
                }
                var11_ref_String = stackIn_37_0;
              }
              pn.field_a.a(var11_ref_String, var10 + (var3.field_j - 0), var5, -var10 + var3.field_f, var6, var7, -1, 0, 1, 20);
            }
          } else {
            var8 = pn.field_a.c(rb.field_h);
            var9 = pn.field_a.c(mg.field_d);
            if (var8 < var9) {
              var8 = var9;
            }
            var9 = pn.field_a.c(pm.field_u);
            if (var8 < var9) {
              var8 = var9;
            }
            var10 = var3.field_j + (var8 + (var3.field_f - 128 + 5)) / 2;
            if (this.field_p.field_i == var2) {
              fn.d(-1 + var10, var5 + 14, 2, 12384);
              fn.d(128 + var10, var5 + 14, 2, 12384);
              fn.b(var10 + 0, 13 + var5, 128, 12384);
              fn.b(0 + var10, 16 + var5, 128, 12384);
              fn.e(0 + var10, var5 + 14, 128, 2, 3178608);
            } else {
              fn.e(0 + var10, 14 + var5, 128, 2, 2121792);
            }
            if (7 != var3.field_d) {
              if (var3.field_d != 8) {
                if (var3.field_d != 9) {
                  throw new IllegalStateException();
                }
                var11 = 128 * m.field_l / 128;
              } else {
                var11 = 128 * hd.field_f / 128;
              }
            } else {
              var11 = fa.field_S * 128 / 128;
            }
            pn.field_a.a(var4, var3.field_j + 0, var5, -5 + (var10 - var3.field_j), var6, var7, -1, 2, 1, 20);
            fn.e(var11 - 2 + var10 - 0, var5 + 7, 3, 8, var7);
            fn.e(-2 + (var10 + var11), 8 + (7 + var5), 4, 2, var7);
            fn.e(0 + var11 + (var10 - 2), var5 + 7 + 10, 5, 6, var7);
          }
          var2++;
        }
        fn.c();
    }

    final static void a(byte param0, double param1, double[] param2) {
        int var4_int = 0;
        int var5 = 0;
        double[] var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          for (var4_int = 0; var4_int < param2.length; var4_int++) {
            param2[var4_int] = param2[var4_int] * param1;
          }
          if (param0 >= -79) {
            var6 = (double[]) null;
            jb.a((byte) 115, 0.45560042226598313, (double[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("jb.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void g(int param0) {
        boolean discarded$1 = false;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        ec.a(this, param0);
        do {
          if (!nm.e((byte) -96)) {
            this.field_p.a(true, this.a((byte) -118, wm.field_hb, m.field_a), this.a((byte) -118, ld.field_l, jh.field_R));
            discarded$1 = this.a(true, 34);
            return;
          }
          this.field_p.h((byte) -128);
          if (gk.field_r == 13) {
            this.e((byte) -125);
            gh.field_k = false;
            da.field_e.b(false, (byte) -126);
            return;
          }
          if ((gk.field_r == 96 ||
            gk.field_r == 98) &&
            this.field_q > 0) {
            this.b(320);
            this.field_p.a(1, -1);
            this.field_p.field_b = false;
          }
          if ((gk.field_r == 97 ||
            99 == gk.field_r) &&
            this.field_q < 8) {
            this.k(8);
            this.field_p.a(1, -1);
            this.field_p.field_b = false;
          }
        } while (!this.a(false, param0 + 84));
        return;
    }

    final void a(int param0) {
        this.a((byte) -116);
        if (this.field_e != 14) {
          return;
        }
        pn.field_a.b(p.field_b, 320, 120, 4243584, -1);
        pn.field_a.b(fb.a(this.field_t, this.field_n, 0, this.field_i), 320, 140, 4243584, -1);
        pn.field_a.b(qc.a(this.field_n, this.field_i, 2, this.field_t), 320, 240, 4243584, -1);
        pn.field_a.b(ah.a(this.field_i, this.field_n, -125, this.field_t), 320, 300, param0, -1);
    }

    final void c(int param0) {
        int var6 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        var7 = Confined.field_J ? 1 : 0;
        if (param0 <= 71) {
          field_o = (String) null;
        }
        var2 = 2147483647;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = -2147483648;
        for (var6 = 0; this.field_p.field_k > var6; var6++) {
          if (this.field_h[var6].field_j < var2) {
            var2 = this.field_h[var6].field_j;
          }
          if (this.field_h[var6].field_b < var3) {
            var3 = this.field_h[var6].field_b;
          }
          if (this.field_h[var6].field_j + this.field_h[var6].field_f > var4) {
            var4 = this.field_h[var6].field_j + this.field_h[var6].field_f;
          }
          if (var5 < this.field_h[var6].field_b + this.field_h[var6].field_i) {
            var5 = this.field_h[var6].field_i + this.field_h[var6].field_b;
          }
        }
        this.field_s = -30 + var2;
        this.field_c = -20 + var3;
        this.field_b = var5 + (20 - this.field_c);
        this.field_k = var4 + (30 - this.field_s);
    }

    private final void e(byte param0) {
        if (param0 > -119) {
          return;
        }
        int var2 = 128;
        if (!(this.field_p.field_i < 0)) {
          var2 = 256 * (this.field_h[this.field_p.field_i].field_j + this.field_h[this.field_p.field_i].field_f / 2) / 640;
        }
        cj.a(16, 50, 4, da.field_j, var2);
    }

    private final boolean a(int param0, boolean param1) {
        boolean stackIn_20_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_36_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var5Lifetime3;
        int var5Lifetime1Lifetime1;
        int var5Lifetime2Lifetime1;
        var9 = Confined.field_J ? 1 : 0;
        this.c((byte) 126);
        var3 = -1;
        if (this.field_p.field_i >= 0) {
          var3 = this.field_h[this.field_p.field_i].field_d;
        }
        if (var3 == 1 &&
          this.field_p.d((byte) 55)) {
          this.e((byte) -125);
          h.a((byte) -6, param1);
          return true;
        }
        if (2 == var3 &&
          this.field_p.d((byte) 55)) {
          gh.field_k = true;
          va.field_b = nj.a(param1, this.field_a, (byte) -119);
          this.e((byte) -124);
          return true;
        }
        if (3 == var3 &&
          this.field_p.d((byte) 55)) {
          md.d(-124);
          this.e((byte) -128);
          return true;
        }
        if (4 == var3 && (this.field_p.g((byte) -121) ||
          this.field_p.b((byte) 36))) {
          stackIn_20_0 = !(pa.field_c);
          pa.field_c = stackIn_20_0;
          this.e((byte) -127);
        }
        if (var3 == 5 && (this.field_p.g((byte) 4) ||
          this.field_p.b((byte) 36))) {
          stackIn_28_0 = !(qc.field_n);
          qc.field_n = stackIn_28_0;
          this.e((byte) -122);
        }
        if (6 == var3 && (this.field_p.g((byte) 14) ||
          this.field_p.b((byte) 36))) {
          stackIn_36_0 = !(mk.field_l);
          mk.field_l = stackIn_36_0;
          this.e((byte) -126);
        }
        if (var3 == 7) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_p.f((byte) -79)) {
            var4 = pn.field_a.c(rb.field_h);
            var5 = pn.field_a.c(mg.field_d);
            if (var4 < var5) {
              var4 = var5;
            }
            var5Lifetime3 = pn.field_a.c(pm.field_u);
            if (var5Lifetime3 > var4) {
              var4 = var5Lifetime3;
            }
            var6 = this.field_h[this.field_p.field_i].field_j + (var4 + (5 + (this.field_h[this.field_p.field_i].field_f - 128))) / 2;
            var7 = ld.field_l - var6;
            var8 = var7 * 128 / 128;
            if (var8 >= 0) {
              if (var8 <= 128) {
                if ((var8 != fa.field_S)) {
                  fa.field_S = var8;
                  if (!(5 > -this.field_g + qn.field_r)) {
                    ab.a(2026);
                    this.field_g = qn.field_r;
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var8 = 128;
              }
            } else {
              var8 = 0;
            }
            if ((decompiledFrameRemainder0) &&
              (var8 != fa.field_S)) {
              fa.field_S = var8;
              if (5 <= -this.field_g + qn.field_r) {
                ab.a(2026);
                this.field_g = qn.field_r;
              }
            }
          } else {
            if (this.field_p.d((byte) 55)) {
              ab.a(2026);
            }
          }
          if (this.field_p.a(0)) {
            fa.field_S = 0;
            ab.a(param0 ^ 2026);
          }
          if (this.field_p.c((byte) 61)) {
            fa.field_S = 128;
            ab.a(2026);
          }
          if (this.field_p.e((byte) 105)) {
            if (fa.field_S > 0) {
              fa.field_S = -1 + fa.field_S & -16;
            }
            ab.a(2026);
          }
          if (this.field_p.b(-80)) {
            if (fa.field_S < 128) {
              fa.field_S = fa.field_S + 16 & -16;
            }
            ab.a(param0 + 2026);
          }
        }
        if (var3 == 8) {
          if (this.field_p.f((byte) -57)) {
            if (this.field_p.d((byte) 55)) {
              this.e((byte) -128);
            }
            var4Lifetime1 = pn.field_a.c(rb.field_h);
            var5Lifetime1 = pn.field_a.c(mg.field_d);
            if (var5Lifetime1 > var4Lifetime1) {
              var4Lifetime1 = var5Lifetime1;
            }
            var5Lifetime1Lifetime1 = pn.field_a.c(pm.field_u);
            if (var4Lifetime1 < var5Lifetime1Lifetime1) {
              var4Lifetime1 = var5Lifetime1Lifetime1;
            }
            var6Lifetime1 = this.field_h[this.field_p.field_i].field_j + (-128 + this.field_h[this.field_p.field_i].field_f + (5 + var4Lifetime1)) / 2;
            var7Lifetime1 = -var6Lifetime1 + ld.field_l;
            var8Lifetime1 = var7Lifetime1 * 128 / 128;
            if (0 <= var8Lifetime1) {
              if (var8Lifetime1 > 128) {
                hd.field_f = 128;
              } else {
                hd.field_f = var8Lifetime1;
              }
            } else {
              hd.field_f = 0;
            }
            h.field_R.b(hd.field_f * 64 >> 7);
          }
          if (this.field_p.a(0)) {
            hd.field_f = 0;
            h.field_R.b(hd.field_f * 64 >> 7);
            this.e((byte) -126);
          }
          if (this.field_p.c((byte) -128)) {
            hd.field_f = 128;
            h.field_R.b(64 * hd.field_f >> 7);
            this.e((byte) -128);
          }
          if (this.field_p.e((byte) 105)) {
            hd.field_f = -16 & -1 + hd.field_f;
            if (0 > hd.field_f) {
              hd.field_f = 0;
            }
            h.field_R.b(64 * hd.field_f >> 7);
            this.e((byte) -124);
          }
          if (this.field_p.b(114)) {
            hd.field_f = 16 + hd.field_f & -16;
            if (128 < hd.field_f) {
              hd.field_f = 128;
            }
            h.field_R.b(64 * hd.field_f >> 7);
            this.e((byte) -128);
          }
        }
        if (var3 == 9) {
          if (this.field_p.f((byte) -55)) {
            if (this.field_p.d((byte) 55)) {
              this.e((byte) -122);
            }
            var4Lifetime2 = pn.field_a.c(rb.field_h);
            var5Lifetime2 = pn.field_a.c(mg.field_d);
            if (var5Lifetime2 > var4Lifetime2) {
              var4Lifetime2 = var5Lifetime2;
            }
            var5Lifetime2Lifetime1 = pn.field_a.c(pm.field_u);
            if (var5Lifetime2Lifetime1 > var4Lifetime2) {
              var4Lifetime2 = var5Lifetime2Lifetime1;
            }
            var6Lifetime2 = (-128 + (this.field_h[this.field_p.field_i].field_f + 5) + var4Lifetime2) / 2 + this.field_h[this.field_p.field_i].field_j;
            var7Lifetime2 = ld.field_l - var6Lifetime2;
            var8Lifetime2 = 128 * var7Lifetime2 / 128;
            if (var8Lifetime2 < 0) {
              var8Lifetime2 = 0;
            } else {
              if (var8Lifetime2 > 128) {
                var8Lifetime2 = 128;
              }
            }
            if (var8Lifetime2 != m.field_l) {
              m.field_l = var8Lifetime2;
              o.b((byte) -106);
            }
          }
          if (this.field_p.a(0)) {
            if (m.field_l != 0) {
              m.field_l = 0;
              o.b((byte) -123);
            }
            this.e((byte) -127);
          }
          if (this.field_p.c((byte) -120)) {
            if (m.field_l != 128) {
              m.field_l = 128;
              o.b((byte) -125);
            }
            this.e((byte) -122);
          }
          if (this.field_p.e((byte) 105)) {
            if (m.field_l > 0) {
              m.field_l = -16 & m.field_l - 1;
              o.b((byte) -117);
            }
            this.e((byte) -127);
          }
          if (this.field_p.b(124)) {
            if (m.field_l < 128) {
              m.field_l = -16 & 16 + m.field_l;
              o.b((byte) -127);
            }
            this.e((byte) -121);
          }
        }
        if (var3 == 10 &&
          this.field_p.d((byte) 55)) {
          if (null != dn.field_d) {
            qh.c(param0 + 4);
          } else {
            tj.a(param1, 480);
          }
          this.e((byte) -128);
          return true;
        }
        if (var3 == 11 &&
          this.field_p.d((byte) 55)) {
          bj.field_m = true;
          ji.field_e = qh.a(param1, (byte) 104);
          this.e((byte) -127);
          return true;
        }
        if (var3 == 12 &&
          this.field_p.d((byte) 55)) {
          kc.field_o = true;
          bg.field_a = bk.a(320, false, param1, i.field_o);
          this.e((byte) -128);
          return true;
        }
        if (var3 == 13 &&
          this.field_p.d((byte) 55)) {
          this.e((byte) -125);
          qh.c(4);
          jn.a(false, ii.b(false));
        }
        if (var3 == 14 &&
          this.field_p.d((byte) 55)) {
          this.e((byte) -127);
          ac.a(false);
          return true;
        }
        if (param0 != 0) {
          this.a(99);
        }
        if (var3 != 15) {
          return false;
        }
        if (!this.field_p.d((byte) 55)) {
          return false;
        }
        this.e((byte) -123);
        kg.c(false);
        return true;
    }

    private final boolean d(int param0, boolean param1) {
        this.c((byte) 127);
        if (param0 > -9) {
          return true;
        }
        int var3 = -1;
        if (!(this.field_p.field_i < 0)) {
          var3 = this.field_h[this.field_p.field_i].field_d;
        }
        if (var3 == 16 &&
          this.field_p.d((byte) 55)) {
          ol.a(2, (byte) 102, false);
          this.e((byte) -127);
          return true;
        }
        if (17 == var3 &&
          this.field_p.d((byte) 55)) {
          rk.d((byte) -61);
          qf.field_e = false;
          ei.a(-54, param1);
          this.e((byte) -121);
          return true;
        }
        return false;
    }

    jb(int param0) {
        this.field_j = -1;
        this.field_h = new bd[param0];
        this.field_p = new qi();
    }

    static {
        field_r = "Unpacking sound effects";
    }
}
