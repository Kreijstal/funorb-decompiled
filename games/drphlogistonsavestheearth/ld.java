/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private int field_a;
    ql field_e;
    private int field_c;
    static long field_b;
    static he[] field_f;
    static int[] field_h;
    private int field_g;
    static he[] field_d;

    private final void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var2;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
        v.field_O.a(0, var2 / 2 + 200);
        this.c(200 + var2 / 2, param0 ^ -66);
        oi.field_f.d(0, 200 + var2 / 2);
        this.a(jk.field_L, 220, var2, -50);
        dj.a(re.field_e, 75, lf.field_b, false, 380);
        for (var3 = 0; var3 < 3; var3++) {
          for (var4 = 0; var4 < 3; var4++) {
            var5 = 40 + var4 * 70;
            var6 = var3 * 70 + 122 + var2;
            var7 = 3 * var3 + var4;
            if (var7 >= 3 &&
              hb.field_g <= 0) {
              wi.field_a.a(var5, var6);
            } else {
              if (var7 > gf.field_D) {
                md.field_f.a(var5, var6);
              } else {
                eb.field_e[var7].a(var5, var6);
              }
            }
          }
        }
        cb.field_b.a(aj.field_f, 285, -cb.field_b.field_x + 122 + (var2 + 64), 200, 140, 0, -1, param0, 0, cb.field_b.field_x);
    }

    private final void f(byte param0) {
        int var3 = 0;
        int[] var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < 22) {
          field_f = (he[]) null;
        }
        var9 = new int[v.field_W.length];
        var8 = var9;
        var2 = var8;
        for (var3 = -1 + v.field_W.length; var3 >= 0; var3--) {
          var4 = l.field_n[sd.field_a.field_q][var3];
          var5 = kc.field_o[sd.field_a.field_q][var3];
          if (ul.field_d > var4) {
            var2[var3] = -var4 + ul.field_d;
          }
          if (var5 < ul.field_d) {
            var2[var3] = 100 - (ul.field_d - var5);
          }
          if (var9[var3] >= 0) {
            if (100 < var9[var3]) {
              var9[var3] = 100;
            }
          } else {
            var9[var3] = 0;
          }
          var6 = (int)(2.55 * (double)var9[var3]);
          if (0 < var6) {
            v.field_W[var3].a(-50 + var9[var3] / 2, var9[var3] / 2 - 50, var6);
            cb.field_b.a(mg.field_a[sd.field_a.field_q][var3], 225, kj.field_f[sd.field_a.field_q][var3], 405, 640, var6 * 65793, -1, 0, 0, cb.field_b.field_x);
          }
        }
    }

    private final void a(he param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          ph.field_h.a(0, param2);
          param0.a(0, param2);
          if (param3 != -50) {
            this.d((byte) 68);
          }
          wj.f(17, 116 + param2, 606, param1, 16249576);
          wj.c(16, param2 + 116, param1, 0);
          for (var5_int = 0; 4 > var5_int; var5_int++) {
            wj.c(623 + var5_int, param2 + 116, param1, 0);
          }
          wj.f(0, param1 + (116 + param2), 640, 480);
          ph.field_h.a(0, param2 + param1);
          wj.a();
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "ld.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void d(int param0) {
        int var3 = 0;
        int[] var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[] var10;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var10 = new int[mk.field_g.length];
        var9 = var10;
        var8 = var9;
        var2 = var8;
        for (var3 = mk.field_g.length + param0; var3 >= 0; var3--) {
          var4 = l.field_n[sd.field_a.field_q][var3];
          var5 = kc.field_o[sd.field_a.field_q][var3];
          if (var4 < ul.field_d) {
            var8[var3] = -var4 + ul.field_d;
          }
          if (var5 < ul.field_d) {
            var10 = var9;
            var8[var3] = 100 - ul.field_d + var5;
          }
          var10 = var9;
          if (0 > var10[var3]) {
            var10[var3] = 0;
          } else {
            if (var10[var3] > 100) {
              var10[var3] = 100;
            }
          }
          var6 = (int)((double)var10[var3] * 2.55);
          if (var6 > 0) {
            mk.field_g[var3].a(-50 + var10[var3] / 2, var10[var3] / 2 - 50, var6);
            cb.field_b.a(mg.field_a[sd.field_a.field_q][var3], 225, kj.field_f[sd.field_a.field_q][var3], 405, 640, var6 * 65793, -1, 0, 0, cb.field_b.field_x);
          }
        }
        if (l.field_n[sd.field_a.field_q][7] < ul.field_d &&
          kc.field_o[sd.field_a.field_q][7] > ul.field_d) {
          wj.d(0, 0, 640, 480, 16777215, 255 - (int)(2.5 * (double)var10[7]));
        }
    }

    private final int a(int param0, byte param1) {
        if (param1 < 15) {
          return -37;
        }
        int var3 = ul.field_j[this.field_c][param0];
        if (this.field_c == 2) {
          return this.b(param0, true) + cb.field_b.b(hg.field_ob[var3]);
        }
        if (10 == this.field_c &&
          ul.field_j[this.field_c][param0] != 5 &&
          13 != ul.field_j[this.field_c][param0]) {
          return 70 + this.b(param0, true);
        }
        return ul.field_i[this.field_c];
    }

    private final int b(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
          field_f = (he[]) null;
        }
        var3 = ul.field_j[this.field_c][param0];
        if (this.field_c == 2 &&
          !oh.a(0)) {
          if (param0 >= 3) {
            return 320 - cb.field_b.b(hg.field_ob[var3]) / 2;
          }
          return 140 * (param0 - 1) + 320 - cb.field_b.b(hg.field_ob[var3]) / 2;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_c == 10 &&
          var3 != 5) {
          var4 = var3;
          if (var4 != 26 &&
            var4 != 29 &&
            var4 != 32) {
            if ((27 != var4 &&
              var4 != 30 &&
              var4 != 33) &&
              (decompiledFrameRemainder0 = (var4 == 28 ||
              var4 == 31 ||
              var4 == 34))) {
              return 180;
            }
            if (decompiledFrameRemainder0) {
              return 110;
            }
          }
          if (decompiledFrameRemainder0) {
            return 40;
          }
        }
        return ul.field_b[this.field_c];
    }

    private final void a(boolean param0, he[] param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          if (param0) {
            return;
          }
          var3_int = 255;
          var4 = td.field_g[sd.field_a.field_q];
          if (ul.field_d < 100) {
            var3_int = (int)(2.55 * (double)ul.field_d);
          } else {
            if (-ul.field_d + var4 < 100) {
              var3_int = (int)(2.55 * (double)(-ul.field_d + var4));
            }
          }
          if (var3_int < 0) {
            var3_int = 0;
          }
          var5 = ul.field_d / 2 - 50;
          if (0 < var5) {
            var5 = 0;
          }
          var6 = -ul.field_d + 100;
          if (var6 < 0) {
            var6 = 0;
          }
          param1[0].a(var5, var6, var3_int);
          cb.field_b.a(mg.field_a[sd.field_a.field_q][0], 225, kj.field_f[sd.field_a.field_q][0], 405, 640, var3_int * 65793, -1, 0, 0, cb.field_b.field_x);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final int b(int param0, byte param1) {
        if (param1 != -59) {
          return -123;
        }
        if (this.field_c == 10 &&
          ul.field_j[this.field_c][param0] != 5) {
          return 70;
        }
        return 30;
    }

    private final void c(int param0, boolean param1) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        tc.field_d = 0;
        var3 = -111 % ((18 - param0) / 61);
        if (qk.field_c &&
          hb.field_g <= 0 && (this.field_c == 2 ||
          this.field_c == 4 ||
          9 == this.field_c)) {
          qk.field_c = false;
          ek.a(-95, param1, 11);
          decompiledFrameRemainder0 = false;
        }
        else {
          ek.a(-74, param1, 0);
        }

    }

    private final void k(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = -122 / ((param0 + 76) / 50);
        if (8 == sd.field_a.field_q) {
          sc.a(-1, true, ml.field_l);
        }
        var3 = 0;
        if (r.field_d != this.field_c) {
          var3Lifetime1 = -1 + sd.field_a.field_q;
        } else {
          var3Lifetime1 = sd.field_a.field_q;
        }
        if (hh.field_d[var3Lifetime1] == null) {
          if (sd.field_a.field_q != 8) {
            mf.h(-8372);
          }
        } else {
          if (var3Lifetime1 == 2 &&
            sd.field_e == 2) {
            be.a(rh.field_h, 360, (double)lf.field_b / 6.0);
            var4 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -200.0);
            this.a(cj.field_g, 0, var4, -50);
          } else {
            hh.field_d[var3Lifetime1].e(0, 0);
            var4 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -200.0);
            this.a(cj.field_g, 0, var4, -50);
          }
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ul.field_d = ul.field_d + 1;
        var2 = sd.field_a.field_q;
        if (var2 == 0) {
          this.b((byte) -114);
        } else {
          if (1 != var2) {
            if (var2 == 2) {
              this.b(-9180);
            } else {
              if (var2 == 3) {
                this.a(true);
              } else {
                if (var2 == 4) {
                  this.b(-9180);
                } else {
                  if (var2 == 5) {
                    this.b(-9180);
                  } else {
                    if (var2 != 6) {
                      if (var2 == 7) {
                        this.b(-9180);
                      } else {
                        if (var2 == 8) {
                          this.b(-9180);
                        }
                      }
                    } else {
                      this.h(119);
                    }
                  }
                }
              }
            }
          } else {
            this.b(-9180);
          }
        }
        var2Lifetime1 = 50 % ((24 - param0) / 57);
    }

    final void f(int param0) {
        int discarded$0 = 0;
        boolean stackIn_36_1 = false;
        boolean stackIn_49_1 = false;
        boolean stackIn_50_2 = false;
        int var2;
        int var3;
        int var4;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_c != -1) {
          wj.c();
        }
        if (param0 != -8448) {
          discarded$0 = this.a((byte) 16, 0);
        }
        lg.field_f = kj.field_b[this.field_c];
        re.field_e = ih.field_O[this.field_c];
        var3 = this.field_c;
        switch (var3) {
          case 0:
            v.field_O.a(0, 0);
            this.c(0, param0 + 8367);
            ph.field_h.a(0, 0);
            uk.field_h.d(-43, 35);
            dj.a(re.field_e, 311, lf.field_b, false, 155);
            qj.field_f.a(0, 0);
            break;
          case 5:
          case 6:
          case 7:
          case 8:
          case 10:
          case 11:
          default:
            if (var3 != 4 &&
              var3 != 9) {
              if (var3 == 5) {
                this.b(false);
                break;
              }
              if (var3 == 6) {
                this.c((byte) 101);
                break;
              }
              if (var3 == 7) {
                this.c((byte) 101);
                break;
              }
              if (var3 == 8) {
                this.k(-128);
                dj.a(re.field_e, 70, lf.field_b, false, 370);
                break;
              }
              if (var3 == 10) {
                this.a(0);
                break;
              }
              if (11 != var3) {
                break;
              }
              v.field_O.a(0, 0);
              this.c(0, -93);
              uk.field_h.d(-120, 35);
              bg.d(param0 ^ 2947);
              return;
            }
            stackIn_36_1 = (9 == this.field_c);
            this.b(stackIn_36_1, (byte) -106);
            break;
          case 3:
            this.c(param0 ^ 8331);
            break;
          case 2:
            this.d((byte) -74);
            dj.a(re.field_e + 20, 80, lf.field_b, false, 375);
            break;
          case 1:
            rh.field_b.d(0, 0);
            var2 = 241;
            ph.field_h.a(0, 0);
            if (oh.a(param0 + 8448) ||
              !(hb.field_g > 0)) {
              var2 -= 30;
            }
            dj.a(re.field_e, var2, lf.field_b, false, 190);
            break;
        }
        for (var2 = 0; this.field_e.field_e > var2; var2++) {
          if (this.a(var2, false)) {
            stackIn_49_1 = true;
            stackIn_50_2 = (this.field_e.field_f == var2);
            this.a(stackIn_49_1, stackIn_50_2, var2);
          }
        }
    }

    private final void h(int param0) {
        if (param0 < 61) {
          he var3 = (he) null;
          this.a((he) null, 32, 19, -17);
        }
        if (hl.field_d ||
          td.field_g[sd.field_a.field_q] < ul.field_d) {
          ek.a(-80, false, -1);
          ul.field_d = 0;
        }
    }

    private final void b(boolean param0) {
        boolean stackIn_3_0 = false;
        boolean stackIn_6_1 = false;
        int stackIn_8_2 = 0;
        boolean stackIn_9_3 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_22_2 = false;
        boolean stackIn_25_3 = false;
        int var2;
        jb var3;
        String var4;
        String var5;
        String var6;
        int var7;
        String var4Lifetime1;
        var2 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
        var3 = ni.field_q;
        v.field_O.a(0, var2 / 2 + 200);
        this.c(200 + var2 / 2, -96);
        oi.field_f.d(0, 200 + var2 / 2);
        this.a(oj.field_d, 170, var2, -50);
        stackIn_3_0 = (ej.field_h != 0);
        stackIn_6_1 = (sd.field_a.field_H == 0) ? false : true;
        stackIn_8_2 = -125;
        stackIn_9_3 = (sd.field_a.field_q == 0) ? false : true;
        var4 = nj.a(stackIn_3_0, stackIn_6_1, stackIn_8_2, stackIn_9_3);
        if (var4 == null) {
          var4 = tf.field_nb[7];
        }
        var5 = ab.field_c + " " + var4 + " " + ph.field_i;
        if (param0) {
          return;
        }
        stackIn_16_0 = (0 != ej.field_h);
        stackIn_19_1 = (0 == sd.field_a.field_q) ? false : true;
        stackIn_22_2 = (sd.field_a.field_H == 0) ? false : true;
        stackIn_25_3 = (param0) ? false : true;
        var4Lifetime1 = jl.a(stackIn_16_0, stackIn_19_1, stackIn_22_2, stackIn_25_3);
        if (var4Lifetime1 == null) {
          var4Lifetime1 = kk.field_d[7];
        }
        var6 = "<br><br>" + gd.field_e + " " + ih.field_P + " " + var4Lifetime1;
        var3.a(var5 + " " + var6, 50, 130 + var2, 540, 480, 0, -1, 1, 0, var3.field_E);
        var7 = re.field_e;
        dj.a(var7, 75, lf.field_b, param0, 385);
        return;
    }

    private final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_c == 2 &&
          !oh.a(0)) {
          if (param1 < 3) {
            return ul.field_e[this.field_c];
          }
          return ul.field_f[this.field_c] + ul.field_e[this.field_c];
        }
        boolean decompiledFrameRemainder0 = true;
        var3 = ul.field_j[this.field_c][param1];
        if (10 == this.field_c &&
          var3 != 5) {
          var4 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
          var5 = var3;
          if (var5 != 26 &&
            var5 != 27 &&
            var5 != 28) {
            if ((var5 != 29 &&
              30 != var5 &&
              var5 != 31) &&
              (decompiledFrameRemainder0 = (var5 == 32 ||
              var5 == 33 ||
              34 == var5))) {
              return 70 + (var4 + 122 + 70);
            }
            if (decompiledFrameRemainder0) {
              return 70 + var4 + 122;
            }
          }
          if (decompiledFrameRemainder0) {
            return 122 + var4;
          }
        }
        if (param0 >= -62) {
          field_f = (he[]) null;
        }
        return param1 * ul.field_f[this.field_c] + ul.field_e[this.field_c];
    }

    private final void c(byte param0) {
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 <= 71) {
          this.field_a = 105;
        }
        var2 = sd.field_a.field_q;
        if (var2 != 0) {
          if (var2 == 1) {
            this.a(false, wb.field_a);
          } else {
            if (2 == var2) {
              this.a(false, gl.field_b);
            } else {
              if (3 == var2) {
                this.c(true);
              } else {
                if (var2 == 4) {
                  this.a(false, ge.field_p);
                } else {
                  if (5 == var2) {
                    this.a(false, th.field_b);
                  } else {
                    if (var2 == 6) {
                      this.f((byte) 35);
                    } else {
                      if (var2 != 7) {
                        if (var2 == 8) {
                          this.a(false, rg.field_c);
                        }
                      } else {
                        this.a(false, ie.field_x);
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          this.d(-1);
        }
    }

    private final void j(int param0) {
        if (param0 != 13) {
          this.b(-103);
        }
        we.a(false, nl.field_r[0]);
    }

    private final void i(int param0) {
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (2 == this.field_c &&
          !oh.a(param0 ^ -97)) {
          if (di.field_c == 96) {
            if (this.field_e.field_f > 0) {
              if (3 != this.field_e.field_f) {
                this.field_e.a(this.field_e.field_f - 1, 100);
              }
            } else {
              this.field_e.a(2, 100);
            }
          }
          if (97 == di.field_c) {
            if (2 > this.field_e.field_f) {
              this.field_e.a(1 + this.field_e.field_f, param0 + 197);
            } else {
              if (this.field_e.field_f == 2) {
                this.field_e.a(0, 100);
              }
            }
          }
          if (di.field_c == 99) {
            if (this.field_e.field_f >= 0 &&
              this.field_e.field_f <= 2) {
              this.field_e.a(3, 100);
            } else {
              this.field_e.a(pa.field_d, 100);
            }
          }
          if (di.field_c == 98) {
            if (this.field_e.field_f == 3) {
              this.field_e.a(pa.field_d, 100);
            } else {
              this.field_e.a(3, 100);
            }
          }
          this.field_e.f(50);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_c != 11) {
          if (this.field_c != 10) {
            this.field_e.c(38);
          } else {
            if (this.field_e.field_f != -1) {
              this.field_e.d(-1);
              if (0 > this.field_e.field_f) {
                this.field_e.field_f = 0;
              }
              if (ul.field_j[this.field_c].length < this.field_e.field_f) {
                this.field_e.field_f = ul.field_j[this.field_c].length;
              }
              var2 = ul.field_j[this.field_c][this.field_e.field_f];
              stackIn_43_0 = (oh.a(0)) ? 13 : 5;
              var3 = stackIn_43_0;
              stackIn_46_0 = (!oh.a(0)) ? 1 : 0;
              L11: {
                var4 = stackIn_46_0;
                var5 = var2;
                if (var5 == 5) {
                  if (di.field_c == 98) {
                    this.field_e.field_f = -var4 + (8 + this.field_g);
                  }
                  if (di.field_c == 99) {
                    if (var3 != var2) {
                      this.field_e.field_f = 1;
                    } else {
                      this.field_e.field_f = this.field_e.field_f + (var4 + (1 + this.field_g));
                    }
                  }
                } else {
                  if (var5 == 13) {
                    if (98 == di.field_c) {
                      this.field_e.field_f = 0;
                    }
                    if (99 == di.field_c) {
                      this.field_e.field_f = this.field_e.field_f + (this.field_g + (1 + var4));
                    }
                  } else {
                    L14: {
                      switch (var5) {
                        case 28:
                          break L14;
                        default:
                          if (var5 != 29 &&
                            var5 != 30 &&
                            var5 != 31) {
                            switch (var5) {
                              default:
                                break L11;
                              case 34:
                                break;
                              case 32:
                                this.field_g = 0;
                              case 33:
                                if (var2 == 33) {
                                  this.field_g = 1;
                                }
                                break;
                            }
                            if (di.field_c == 98) {
                              this.field_e.field_f = this.field_e.field_f - 3;
                            }
                            if (var2 == 34) {
                              this.field_g = 2;
                            }
                            if ((di.field_c == 99)) {
                              this.field_e.field_f = 0;
                            }
                            break L11;
                          }
                          if (di.field_c == 98) {
                            this.field_e.field_f = this.field_e.field_f - 3;
                          }
                          if (di.field_c != 99) {
                            break L11;
                          }
                          this.field_e.field_f = this.field_e.field_f + 3;
                          break L11;
                        case 26:
                          this.field_g = 0;
                        case 27:
                          if (var2 == 27) {
                            this.field_g = 1;
                          }
                          break;
                      }
                    }
                    if (98 == di.field_c) {
                      this.field_e.field_f = -var4 + 1;
                    }
                    if (var2 == 28) {
                      this.field_g = 2;
                    }
                    if (di.field_c == 99) {
                      this.field_e.field_f = this.field_e.field_f + 3;
                    }
                  }
                }
              }
              if (this.field_e.field_f <= 0) {
                this.field_e.field_f = this.field_e.field_e;
              }
              if (this.field_e.field_e <= this.field_e.field_f) {
                this.field_e.field_f = 0;
              }
            } else {
              if (98 != di.field_c &&
                di.field_c != 96) {
                if ((di.field_c == 99 ||
                  di.field_c == 97)) {
                  this.field_e.field_g = false;
                  this.field_e.field_f = 1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_e.field_g = false;
                this.field_e.field_f = 0;
              }
            }
          }
        } else {
          this.field_e.d(param0 ^ 96);
        }
        if (param0 != -97) {
          this.c(true);
        }
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        if (11 == this.field_c) {
          var3 = -1;
        }
        if (this.field_c == 0 &&
          -1 != this.field_e.field_f) {
          var3 = this.field_e.field_f;
        }
        if (this.field_c == 1 &&
          this.field_e.field_f != -1 &&
          hl.field_f != -1) {
          var3 = this.field_e.field_f;
        }
        if (this.field_c == 3) {
          var3 = 1;
        }
        this.field_e.a(var3, this.a(ob.field_g, false, ck.field_c), param0, 113);
        if (param1 < 83) {
          field_b = -113L;
        }
        ie.field_y = -1;
        if (this.field_c == 11) {
          ti.a(param0, 0);
        }
    }

    private final void a(int param0, int param1) {
        th.field_a[param1].field_e.field_f = -1;
        if (0 >= hb.field_g &&
          param0 >= 3) {
          ek.a(-126, true, 11);
        } else {
          bf.field_h = null;
          ob.field_b = null;
          sd.field_a = new j(param0);
          mf.h(-8372);
        }
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var13;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var11Lifetime1;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        v.field_O.a(0, 0);
        oi.field_f.d(0, 90);
        if (lf.field_b >= 100) {
          stackIn_3_0 = 100;
        } else {
          stackIn_3_0 = lf.field_b;
        }
        var3 = stackIn_3_0;
        if (gf.field_b == 0) {
          var2 = 0;
        } else {
          if (gf.field_b != 1) {
            var2 = -240 + (int)(Math.cos((double)(var3 + 100) * 0.031415926535897934) * -240.0);
          } else {
            var2 = (int)(-240.0 * Math.cos((double)var3 * 0.031415926535897934)) - 240;
          }
        }
        var2 = var2 + kc.field_r;
        this.a(we.field_g, 701, var2, -50);
        var4 = var2 + 125;
        var5 = 198;
        var6 = (31 + cb.field_b.field_x) / 2;
        na.field_c.a(50, var4);
        cb.field_b.c(hd.field_O, var5, var4 + var6, 4210752, -1);
        wj.e(50, var4 + 33, 540, 0, 25);
        var4 += 40;
        ul.field_h.a(50, var4);
        qb.field_d.a(83, var4);
        lk.field_k.a(116, var4);
        lb.field_D.a(149, var4);
        cb.field_b.c(ch.field_w, var5, var6 + var4, 4210752, -1);
        wj.e(50, var4 + 33, 540, 0, 25);
        var4 += 40;
        if (param0 >= -9) {
          this.b(false);
        }
        jl.field_h.a(50, var4);
        cb.field_b.c(mk.field_a, var5, var4 + var6, 4210752, -1);
        wj.e(50, var4 + 33, 540, 0, 25);
        var4 += 40;
        wg.field_c.a(50, var4);
        cb.field_b.c(hj.field_c, var5, var4 + var6, 4210752, -1);
        wj.e(50, var4 + 33, 540, 0, 25);
        var4 += 56;
        lc.field_s.a(50, var4);
        ki.field_b.a(83, var4 - 16);
        fk.field_l.a(83, 17 + var4);
        si.field_D.a(116, var4);
        cb.field_b.c(fm.field_c, var5, var4 + var6, 4210752, -1);
        var7 = di.field_e[0];
        var8 = 480 + (30 + var2);
        var9 = 50;
        var10 = 60 + var8;
        ri.field_b.a(var9, var10);
        var9 += 34;
        of.field_x.a(var9, var10);
        var9 += 34;
        re.field_d.a(var9, var10);
        var9 += 102;
        od.field_k.a(var9, var10);
        var9 += 34;
        qc.field_a.a(var9, var10);
        var9 += 34;
        p.field_e.a(var9, var10);
        var9 += 68;
        for (var11 = 0; var11 < 5; var11++) {
          var9 += 34;
          c.field_a[var11].a(var9, var10);
        }
        var11Lifetime1 = (int)((double)ni.field_q.field_x * 14.5);
        ni.field_q.a(var7, 50, var8, 540, var11Lifetime1, 0, 16777215, 0, 0, ni.field_q.field_x);
        wj.d(40, var8, 560, var11Lifetime1, 1);
        if (0 == gf.field_b) {
          stackIn_16_0 = lf.field_b;
        } else {
          stackIn_16_0 = 56;
        }
        var12 = stackIn_16_0;
        dj.a(56, 80, var12, false, -10 + ul.field_e[this.field_c]);
    }

    private final void a(boolean param0, int param1) {
        this.field_e.a(this.a(ob.field_g, false, ck.field_c), (byte) 3, param0);
        if (param1 != 0) {
          this.field_c = 106;
        }
    }

    private final void a(boolean param0) {
        if (!param0) {
          field_f = (he[]) null;
        }
        if (0 == (!hl.field_d ? 1 : 0) ||
          td.field_g[sd.field_a.field_q] < ul.field_d) {
          ek.a(-63, false, -1);
          ul.field_d = 0;
        }
    }

    private final int g(int param0) {
        if (param0 != 0) {
          this.field_a = -108;
        }
        return -4 > kh.field_c % 12 ? 16711680 : 0;
    }

    private final void c(boolean param0) {
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var9 = new int[pc.field_b.length];
        var8 = var9;
        var2 = var8;
        var3 = pc.field_b.length - 1;
        if (!param0) {
          return;
        }
        while (var3 >= 0) {
          var4 = l.field_n[sd.field_a.field_q][var3];
          var5 = kc.field_o[sd.field_a.field_q][var3];
          if (ul.field_d > var4) {
            var2[var3] = ul.field_d - var4;
          }
          if (var5 < ul.field_d) {
            var2[var3] = 100 - (-var5 + ul.field_d);
          }
          if (var9[var3] >= 0) {
            if (var9[var3] > 100) {
              var9[var3] = 100;
            }
          } else {
            var9[var3] = 0;
          }
          var6 = (int)((double)var9[var3] * 2.55);
          if (var6 > 0) {
            pc.field_b[var3].a(-50 + var9[var3] / 2, -50 + var9[var3] / 2, var6);
            cb.field_b.a(mg.field_a[sd.field_a.field_q][var3], 225, kj.field_f[sd.field_a.field_q][var3], 405, 640, var6 * 65793, -1, 0, 0, cb.field_b.field_x);
          }
          var3--;
        }
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int var18_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_63_0 = 0;
        String stackIn_82_0 = null;
        int var4;
        int var5;
        int var6;
        jb var7;
        int var8;
        Object var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        String[] var15_ref_String__;
        int var16;
        int var17;
        nh var18;
        int var19;
        int var20;
        int var21;
        String var22;
        int var14Lifetime1;
        int var17Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var17Lifetime2;
        int var19Lifetime1;
        Object var9Lifetime1;
        Object var9Lifetime1Lifetime1;
        Object var9Lifetime1Lifetime2;
        var21 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = this.a((byte) -94, param2);
        var5 = this.b(param2, param0);
        var6 = ul.field_f[this.field_c];
        var7 = cb.field_b;
        if (!param0) {
          field_f = (he[]) null;
        }
        var8 = ul.field_j[this.field_c][param2];
        var22 = hg.field_ob[var8];
        var9 = var22;
        stackIn_5_0 = (param1) ? 16711680 : 4210752;
        var10 = stackIn_5_0;
        var11 = var5;
        var12 = lf.field_b * 5;
        if (this.field_c == 3) {
          stackIn_11_0 = (0 != gf.field_b) ? 1 : 0;
        } else {
          stackIn_11_0 = 0;
        }
        var13 = stackIn_11_0;
        if (!(re.field_e >= var12) ||
          var13 != 0) {
          var14 = (int)((0.0 + (double)(-re.field_e + var12)) * 256.0 / (0.0 + (double)(lg.field_f - re.field_e)));
          if (var13 != 0) {
            var14 = 256;
          }
          stackIn_19_0 = (var14 < 0) ? 0 : var14;
          var14Lifetime2 = stackIn_19_0;
          stackIn_22_0 = (var14Lifetime2 <= 256) ? var14Lifetime2 : 256;
          var14Lifetime3 = stackIn_22_0;
          if (8 == var8) {
            var15_ref_String__ = new String[]{hg.field_ob[20], hg.field_ob[21], hg.field_ob[22]};
            var16 = var7.b(var15_ref_String__[1]) / 2 + 15;
            for (var18_int = 0; 3 > var18_int; var18_int++) {
              if (pj.field_H) {
                if (ck.field_c >= -var16 + 320) {
                  var17 = (ck.field_c <= 320 + var16) ? 1 : 2;
                } else {
                  var17 = 0;
                }
              } else {
                var17 = pa.field_d;
              }
              if (param1 &&
                var17 == var18_int) {
                var10 = 16711680;
              } else {
                var10 = 4210752;
              }
              if (pa.field_d != var18_int) {
                if (param1 &&
                  var18_int == var17) {
                  var15_ref_String__[var18_int] = "{" + var15_ref_String__[var18_int] + "}";
                }
              } else {
                var15_ref_String__[var18_int] = "<lt>" + var15_ref_String__[var18_int] + "<gt>";
              }
              var7.b(var15_ref_String__[var18_int], (var18_int - 1) * 2 * var16 + 320, var7.field_x + var4, var10, -1, var14Lifetime3);
            }
            return;
          }
          if (var8 == 19) {
            var9 = var22 + kk.field_c[sd.field_e];
          } else {
            if (18 == var8) {
              var9 = var22 + s.field_d[hc.field_G];
            }
          }
          if (var9 == null) {
            var9 = "ERROR: missing text";
          }
          var7.c((String) (var9), var11, var4 + var7.field_x, var10, -1, var14Lifetime3);
          if (param1 &&
            ((String) (var9)).length() != 0) {
            var7.a("{", var11, var7.field_x + var4, var10, -1, var14Lifetime3);
            var7.c("}", var7.b((String) (var9)) + var11, var7.field_x + var4, var10, -1, var14Lifetime3);
          }
          if (var8 == 10 ||
            11 == var8) {
            n.field_c = cb.field_b.b(hg.field_ob[10]);
            var15 = cb.field_b.b(hg.field_ob[11]);
            if (var15 > n.field_c) {
              n.field_c = var15;
            }
            var16 = n.field_c + ul.field_b[this.field_c] + cb.field_b.b(" ");
            if (var8 != 10) {
              stackIn_63_0 = oa.field_b;
            } else {
              stackIn_63_0 = dg.field_e;
            }
            var17Lifetime2 = stackIn_63_0;
            rk.field_a.a(var16, -1 + (var4 + var6 / 4), var14Lifetime3);
            oi.field_h.a(-(oi.field_h.field_h / 4) + (var17Lifetime2 + var16), var6 / 4 + var4 - 1, var14Lifetime3);
          }
        }
        if (26 <= var8 &&
          var8 <= 34 &&
          param1) {
          var14Lifetime1 = -26 + var8;
          var15 = var14Lifetime1 / 3;
          var16 = var14Lifetime1 % 3;
          var17Lifetime1 = (int)(-400.0 * Math.exp((double)(-lf.field_b) / 25.0));
          wj.f(285, 122 + var17Lifetime1 + 40, 300, 110, 16249576);
          if (var14Lifetime1 >= 0) {
            if (var14Lifetime1 >= 3 &&
              hb.field_g <= 0) {
              var18 = wi.field_a;
            } else {
              if (var14Lifetime1 <= gf.field_D) {
                var18 = eb.field_e[var14Lifetime1];
              } else {
                var18 = md.field_f;
              }
            }
            for (var19 = 0; var19 < 4; var19++) {
              wj.a(this.b(param2, true) - var19, this.a((byte) -113, param2) - var19, var19 * 2 + var18.field_y, var18.field_w + var19 * 2, 128, 255 - 64 * var19);
            }
            var19Lifetime1 = 5;
            wj.a(this.b(param2, true) - var19Lifetime1, -var19Lifetime1 + this.a((byte) -90, param2), var18.field_y + 10, 2 * var19Lifetime1 + var18.field_w, 4227327, (int)(ji.a(65535, (double)lf.field_b / 10.0) * 128.0 + 128.0));
            var18.b(this.b(param2, true), this.a((byte) -74, param2), (int)(224.0 - 32.0 * ji.a(65535, (double)lf.field_b / 10.0)), 16777215);
            if (gf.field_D >= var14Lifetime1) {
              stackIn_82_0 = tc.field_b[var14Lifetime1];
            } else {
              stackIn_82_0 = s.field_f;
            }
            var9Lifetime1 = stackIn_82_0;
            if (var14Lifetime1 >= 3 &&
              hb.field_g <= 0) {
              var9Lifetime1 = s.field_f;
            }
            cb.field_b.c((String) (var9Lifetime1), 285, 64 + (var17Lifetime1 + 122), 0, -1);
            var20 = 0;
            if (hb.field_g <= 0 &&
              var14Lifetime1 >= 3) {
              var20 = this.g(0);
              var9Lifetime1Lifetime1 = s.field_h;
            } else {
              if (gf.field_D >= var14Lifetime1) {
                var9Lifetime1Lifetime1 = le.field_a[var14Lifetime1];
              } else {
                var20 = this.g(0);
                var9Lifetime1Lifetime1 = pe.field_i;
              }
            }
            cb.field_b.a((String) (var9Lifetime1Lifetime1), 285, var17Lifetime1 + 122 + 94, 320, 240, var20, -1, 0, 0, cb.field_b.field_x);
            if (!(var14Lifetime1 > gf.field_D)) {
              if (hb.field_g <= 0 &&
                var14Lifetime1 >= 3) {
                var9Lifetime1Lifetime2 = null;
              } else {
                var9Lifetime1Lifetime2 = af.field_a;
              }
              cb.field_b.c((String) (var9Lifetime1Lifetime2), 285, 94 + (122 + var17Lifetime1) + 100, 0, -1);
            }
          }
          if (var15 != -1 &&
            -1 != var16) {
            cb.field_b.c(a.a(5044, ek.field_q, new String[]{Integer.toString(var15 + 1), Integer.toString(1 + var16)}), 285, var17Lifetime1 + 122 + 20, 0, -1);
          }
        }
    }

    final void l(int param0) {
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        int stackIn_47_0 = 0;
        int var2;
        int var3;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_c == 8 &&
          9 == gf.field_D) {
          tc.field_d = 5;
        }
        if (11 == this.field_c) {
          stackIn_6_0 = 21;
          stackIn_7_1 = (eh.a(-875)) ? false : true;
          var2 = wa.$cfr$intArgs$a$b925f3f4834c(stackIn_6_0, stackIn_7_1);
          if (var2 == 3) {
            if (null != df.field_l) {
              qk.a(true);
            }
            p.a(-161, nb.a(97));
          }
          if (var2 == 1) {
            ek.a(-73, false, 0);
          }
          if (2 == var2) {
            ek.a(-112, true, 0);
          }
          return;
        }
        if (this.field_c == 0 ||
          -2 == this.field_c) {
          tc.field_d = this.field_c;
          qk.field_c = false;
        }
        if (this.field_a == 0) {
          this.field_a = mh.field_f;
        }
        kh.field_c = kh.field_c + 1;
        if (param0 != -14689) {
          field_b = -52L;
        }
        if (this.field_c == 3 &&
          jc.field_g > 0) {
          kc.field_r = kc.field_r - jc.field_g / 2;
          if (0 != (lf.field_b & 1)) {
            kc.field_r = kc.field_r - 1;
            jc.field_g = jc.field_g - 1;
          }
        }
        if (this.field_c != 6) {
          if (7 == this.field_c) {
            this.e(110);
          }
        } else {
          this.e(110);
        }
        while (th.a(24)) {
          if (di.field_c != 13) {
            this.i(-97);
            if (this.field_e.field_f == -1) {
              continue;
            }
            this.a(this.field_e.field_f, 80, false);
            continue;
          }
          if (this.field_c == 1) {
            r.field_d = -1;
            stackIn_47_0 = (hb.field_g <= 0) ? 11 : 0;
            tc.field_d = stackIn_47_0;
            continue;
          }
          if (this.field_c == 5) {
            continue;
          }
          r.field_d = tc.field_d;
        }
        this.field_e.a(0, this.a(ob.field_g, false, ck.field_c), this.a(ih.field_R, false, ae.field_gb));
        if (-1 != this.field_e.field_f) {
          this.a(this.field_e.field_f, 80, true);
        }
        jk.field_J = ob.field_g;
        pa.field_b = ck.field_c;
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1) {
          field_b = -6L;
        }
        for (var4 = 0; ul.field_j[this.field_c].length > var4; var4++) {
          var5 = this.a((byte) -109, var4);
          if (this.a(var4, false) &&
            param2 >= this.b(var4, true) &&
            param2 < this.a(var4, (byte) 36) &&
            var5 <= param0 &&
            param0 < this.b(var4, (byte) -59) + var5) {
            return var4;
          }
        }
        return -1;
    }

    private final void a(byte param0) {
        if (100 <= lf.field_b) {
          lf.field_b = 0;
        } else {
          lf.field_b = -lf.field_b + 100;
        }
        if (param0 > -17) {
          this.e(121);
        }
    }

    private final void b(byte param0) {
        boolean stackIn_5_0 = false;
        if (param0 > -93) {
          return;
        }
        stackIn_5_0 = !(hl.field_d);
        if (!stackIn_5_0 ||
          !(ul.field_d <= td.field_g[sd.field_a.field_q])) {
          ek.a(-125, true, -1);
          ul.field_d = 0;
        }
    }

    private final void b(int param0) {
        if (param0 != -9180) {
          this.field_g = -103;
        }
        if (hl.field_d ||
          ul.field_d > td.field_g[sd.field_a.field_q]) {
          ek.a(-79, false, -1);
          ul.field_d = 0;
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var11 = 0;
        int stackIn_71_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_217_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        jb var7_ref_jb;
        int var8;
        String[] var8_ref_String__;
        int var9;
        int var10;
        int var12;
        int var13;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var4 = r.field_d;
        var5 = ul.field_j[this.field_c][param0];
        if (var5 != 10 &&
          11 != var5 &&
          this.field_e.e(param1 - 828)) {
          this.j(13);
        }
        boolean decompiledFrameRemainder0 = true;
        var7 = var5;
        if (var7 == 0) {
          if (this.field_e.e(-748)) {
            if (nj.field_j >= 2 &&
              ck.field_f[82]) {
              if (null == nb.field_a) {
                nb.field_a = vj.a((byte) 74);
              }
              sd.field_a = new j(7);
              sd.field_a.field_G = nb.field_a;
              ek.a(-57, param2, -1);
            } else {
              bf.field_h = null;
              ob.field_b = null;
              ek.a(-126, param2, 10);
              tc.field_d = 0;
            }
          }
        } else {
          if (1 != var7) {
            if (var7 != 2) {
              if (var7 != 12) {
                if (var7 != 3) {
                  if (4 != var7) {
                    if (var7 == 5) {
                      if (this.field_e.e(-748)) {
                        this.c(-109, param2);
                      }
                    } else {
                      if (var7 == 14) {
                        if (this.field_e.e(-748)) {
                          ek.a(param1 ^ -48, param2, 11);
                          ej.field_h = 0;
                          gf.field_D = 0;
                          hi.field_j = 0;
                          nf.field_x.g(255);
                        }
                      } else {
                        if (var7 == 6) {
                          if (this.field_e.e(param1 ^ -700)) {
                            if (tc.field_d == 5) {
                              this.c(79, param2);
                            } else {
                              ek.a(-48, param2, tc.field_d);
                            }
                          }
                        } else {
                          if (var7 != 7) {
                            if (var7 != 8) {
                              if (var7 == 35) {
                                if (this.field_e.e(-748)) {
                                  pa.field_d = 0;
                                }
                              } else {
                                if (var7 != 36) {
                                  if (37 == var7) {
                                    if (this.field_e.e(-748)) {
                                      pa.field_d = 2;
                                    }
                                  } else {
                                    if (13 != var7) {
                                      if (9 == var7) {
                                        if (this.field_e.e(param1 - 828)) {
                                          DrPhlogistonSavesTheEarth.a(nb.a(118), -119);
                                        }
                                      } else {
                                        if (var7 != 15) {
                                          if (var7 == 16) {
                                            if (this.field_e.e(-748)) {
                                              var7 = sd.field_a.field_q;
                                              var8 = l.field_n[var7].length;
                                              if (this.field_c == 6) {
                                                if (l.field_n[var7][-1 + var8] >= ul.field_d) {
                                                  var13 = 0;
                                                  var9 = var13;
                                                  while (-1 + var8 > var13) {
                                                    if (ul.field_d > l.field_n[var7][var13] &&
                                                      ul.field_d < l.field_n[var7][1 + var13]) {
                                                      ul.field_d = l.field_n[var7][var13 + 1];
                                                    }
                                                    var13++;
                                                  }
                                                } else {
                                                  hl.field_d = true;
                                                }
                                              }
                                            }
                                          } else {
                                            if (var7 != 17) {
                                              if (var7 != 18) {
                                                if (19 == var7) {
                                                  if (this.field_e.b((byte) 59)) {
                                                    sd.field_e = sd.field_e + 1;
                                                    if (2 < sd.field_e) {
                                                      sd.field_e = 0;
                                                    }
                                                  }
                                                  if (this.field_e.g(-85)) {
                                                    sd.field_e = sd.field_e - 1;
                                                    if (sd.field_e < 0) {
                                                      sd.field_e = 2;
                                                    }
                                                  }
                                                } else {
                                                  if (var7 == 23) {
                                                    if (this.field_e.e(param1 ^ -700)) {
                                                      gf.field_b = 1;
                                                      al.a((byte) -40);
                                                      this.a((byte) -86);
                                                    }
                                                  } else {
                                                    if (var7 != 24) {
                                                      if (var7 == 10) {
                                                        var6 = 0;
                                                        if (this.field_e.a(false)) {
                                                          lc.a(0, (byte) 24);
                                                          var6 = 1;
                                                        }
                                                        if (this.field_e.i(-113)) {
                                                          lc.a(80, (byte) 24);
                                                          var6 = 1;
                                                        }
                                                        if (this.field_e.a(-14164)) {
                                                          var7 = ck.field_c - 284;
                                                          if (var7 <= 0) {
                                                            lc.a(0, (byte) 24);
                                                          } else {
                                                            if (var7 < 80) {
                                                              lc.a(var7, (byte) 24);
                                                            } else {
                                                              lc.a(80, (byte) 24);
                                                            }
                                                          }
                                                          var6 = 1;
                                                        }
                                                        if (this.field_e.h(-62)) {
                                                          var7 = dg.field_e;
                                                          rd.h(param1 + 220);
                                                          stackIn_212_0 = (!this.b(var7, -90)) ? 0 : 1;
                                                          var6 = stackIn_212_0;
                                                        }
                                                        if (this.field_e.b(param1 ^ 43)) {
                                                          var7 = dg.field_e;
                                                          dg.a((byte) 34);
                                                          stackIn_217_0 = (!this.b(var7, -59)) ? 0 : 1;
                                                          var6 = stackIn_217_0;
                                                        }
                                                        if (var6 != 0) {
                                                          eg.field_a.j(dg.field_e);
                                                          if (eg.field_a.m()) {
                                                            eg.field_a.i(-1);
                                                            od.a(param1 - 1630758088, eg.field_a);
                                                          }
                                                        }
                                                      } else {
                                                        if (var7 != 11) {
                                                          switch (var7) {
                                                            case 26:
                                                              if (this.field_e.e(-748)) {
                                                                this.a(0, param1 ^ 81);
                                                              }
                                                              break;
                                                            case 29:
                                                              if (this.field_e.e(-748)) {
                                                                if (gf.field_D >= 3 &&
                                                                  0 < hb.field_g) {
                                                                  this.a(3, 1);
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            case 31:
                                                              if (this.field_e.e(-748)) {
                                                                if (gf.field_D >= 5 &&
                                                                  hb.field_g > 0) {
                                                                  this.a(5, 1);
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            case 33:
                                                              if (this.field_e.e(-748)) {
                                                                if (gf.field_D >= 7) {
                                                                  if (hb.field_g > 0) {
                                                                    this.a(7, param1 ^ 81);
                                                                  } else {
                                                                    kh.field_c = -50;
                                                                  }
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            default:
                                                              if (34 == var7 &&
                                                                this.field_e.e(-748)) {
                                                                if (gf.field_D >= 8 &&
                                                                  hb.field_g > 0) {
                                                                  this.a(8, 1);
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            case 32:
                                                              if (this.field_e.e(param1 - 828)) {
                                                                if (gf.field_D >= 6) {
                                                                  if (hb.field_g > 0) {
                                                                    this.a(6, 1);
                                                                  } else {
                                                                    kh.field_c = -50;
                                                                  }
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            case 30:
                                                              if (this.field_e.e(-748)) {
                                                                if (gf.field_D >= 4 &&
                                                                  0 < hb.field_g) {
                                                                  this.a(4, param1 - 79);
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            case 28:
                                                              if (this.field_e.e(-748)) {
                                                                if (gf.field_D >= 2) {
                                                                  this.a(2, 1);
                                                                } else {
                                                                  kh.field_c = -50;
                                                                }
                                                              }
                                                              break;
                                                            case 27:
                                                              if (this.field_e.e(-748)) {
                                                                if (gf.field_D < 1) {
                                                                  kh.field_c = -50;
                                                                } else {
                                                                  this.a(1, 1);
                                                                }
                                                              }
                                                              break;
                                                          }
                                                        } else {
                                                          if (this.field_e.a(false)) {
                                                            wk.a(80, 0);
                                                          }
                                                          if (this.field_e.i(param1 + 33)) {
                                                            wk.a(80, 80);
                                                          }
                                                          if (this.field_e.a(param1 ^ -14084)) {
                                                            var7 = -284 + ck.field_c;
                                                            if (var7 <= 0) {
                                                              wk.a(param1 + 0, 0);
                                                            } else {
                                                              if (var7 >= 80) {
                                                                wk.a(param1 + 0, 80);
                                                              } else {
                                                                wk.a(param1 + 0, var7);
                                                              }
                                                            }
                                                          }
                                                          if (this.field_e.h(76)) {
                                                            jd.g((byte) -104);
                                                          }
                                                          if (this.field_e.b(93)) {
                                                            pk.e(60);
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      if (this.field_e.e(-748)) {
                                                        gf.field_b = 2;
                                                        al.a((byte) -99);
                                                        this.a((byte) -82);
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (this.field_e.b((byte) 86)) {
                                                  hc.field_G = hc.field_G + 1;
                                                  if (2 < hc.field_G) {
                                                    hc.field_G = 0;
                                                  }
                                                }
                                                if (this.field_e.g(-85)) {
                                                  hc.field_G = hc.field_G - 1;
                                                  if (hc.field_G < 0) {
                                                    hc.field_G = 2;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (this.field_e.e(-748)) {
                                                hl.field_d = true;
                                              }
                                            }
                                          }
                                        } else {
                                          if (this.field_e.e(-748)) {
                                            if (8 == sd.field_a.field_q) {
                                              sd.field_a.field_q = sd.field_a.field_q + 1;
                                              ek.a(-72, param2, 2);
                                            } else {
                                              mf.h(param1 - 8452);
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_e.e(-748) &&
                                        oh.a(0)) {
                                        if (this.field_c != 4 &&
                                          this.field_c != 2 &&
                                          10 != this.field_c) {
                                          if (this.field_c == 5) {
                                            wl.a(9, 5, 123);
                                          } else {
                                            if ((11 == this.field_c)) {
                                              p.a(-161, nb.a(param1 + 43));
                                            }
                                          }
                                          decompiledFrameRemainder0 = false;
                                        }
                                        else {
                                          wl.a(this.field_c, this.field_c, 57);
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (this.field_e.e(-748)) {
                                    pa.field_d = 1;
                                  }
                                }
                              }
                            } else {
                              if (this.field_e.e(-748)) {
                                var7_ref_jb = cb.field_b;
                                var8_ref_String__ = new String[]{hg.field_ob[20], hg.field_ob[21], hg.field_ob[22]};
                                var9 = var7_ref_jb.b(var8_ref_String__[1]);
                                var10 = -1;
                                for (var11 = 0; var11 < 3; var11++) {
                                  if ((320 - var9) > ck.field_c) {
                                    var10 = 0;
                                  } else {
                                    var10 = (ck.field_c > var9 + 320) ? 2 : 1;
                                  }
                                }
                                if (param2 &&
                                  var10 != -1) {
                                  pa.field_d = var10;
                                  pj.field_H = true;
                                }
                              }
                              if (pa.field_b != ck.field_c ||
                                ob.field_g != jk.field_J) {
                                pj.field_H = true;
                              }
                              if (this.field_e.h(116)) {
                                pj.field_H = false;
                                pa.field_d = pa.field_d - 1;
                              }
                              if (this.field_e.b(param1 + 15)) {
                                pa.field_d = pa.field_d + 1;
                                pj.field_H = false;
                              }
                              if (pa.field_d >= 0) {
                                if (pa.field_d > 2) {
                                  pa.field_d = 0;
                                }
                              } else {
                                pa.field_d = 2;
                              }
                            }
                          } else {
                            if (this.field_e.e(-748)) {
                              if (!sd.field_a.C(31578)) {
                                sd.field_a.d((byte) 120);
                              } else {
                                ek.a(param1 - 190, param2, 5);
                              }
                              stackIn_100_0 = (hb.field_g <= 0) ? 11 : 0;
                              tc.field_d = stackIn_100_0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (this.field_e.e(-748)) {
                      if (null != df.field_l) {
                        qk.a(true);
                      } else {
                        s.a(param2, (byte) -121);
                      }
                    }
                  }
                } else {
                  if (this.field_e.e(-748)) {
                    jc.field_g = 31;
                    lf.field_b = 0;
                    gf.field_b = 0;
                    kc.field_r = jc.field_g * (1 + jc.field_g) / 2;
                    al.a((byte) -43);
                    ek.a(param1 ^ -57, param2, 3);
                    tc.field_d = this.field_c;
                  }
                }
              } else {
                if (this.field_e.e(-748)) {
                  ek.a(param1 ^ -127, param2, 4);
                  tc.field_d = this.field_c;
                }
              }
            } else {
              if (this.field_e.e(-748)) {
                ek.a(-85, param2, 2);
              }
            }
          } else {
            if (this.field_e.e(-748)) {
              ek.a(-112, param2, -1);
              stackIn_71_0 = (hb.field_g > 0) ? 0 : 11;
              tc.field_d = stackIn_71_0;
            }
          }
        }
        if (param1 != 80) {
          field_h = (int[]) null;
        }
        if (var4 != r.field_d &&
          r.field_d != -1) {
          th.field_a[r.field_d].a(param2, 0);
        }
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        if (dg.field_e != param0) {
          eg.field_a.j(dg.field_e);
          eg.field_a.i(-1);
          od.a(-1630758008, eg.field_a);
        }
        if (param1 >= -21) {
          this.field_g = -38;
        }
        return var3 != 0;
    }

    private final void b(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        he stackIn_8_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        he stackIn_67_0 = null;
        int var4;
        int var5;
        int var6;
        he var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        Object var16;
        String var16_ref;
        he var17_ref_he;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        jb var25;
        int var14Lifetime1;
        int var19Lifetime1;
        var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var25 = cb.field_b;
        if (param1 >= -95) {
          return;
        }
        var4 = (int)(-400.0 * Math.exp((double)(-lf.field_b) / 25.0));
        v.field_O.a(0, var4 / 2 + 200);
        this.c(200 + var4 / 2, 62);
        oi.field_f.d(0, var4 / 2 + 200);
        stackIn_5_0 = (!oh.a(0)) ? 0 : 20;
        var5 = stackIn_5_0;
        var6 = var5 + 220;
        if (!param0) {
          stackIn_8_0 = qe.field_k;
        } else {
          stackIn_8_0 = el.field_ub;
        }
        var7 = stackIn_8_0;
        this.a(var7, var6, var4, -50);
        var8 = re.field_e;
        if (5 == this.field_c) {
          var8 += 140;
        }
        dj.a(var8, 75, lf.field_b, false, 385);
        var9 = 34;
        var10 = 133 + var4;
        if (!param0) {
          stackIn_13_0 = hi.field_j;
        } else {
          stackIn_13_0 = ej.field_h;
        }
        var11 = stackIn_13_0;
        var12 = 0;
        var13 = -1;
        for (var14 = 0; sc.field_b.length > var14; var14++) {
          L15: {
            if ((1 << var14 & var11) != 0) {
              di.field_b[var14].b(var9, var10);
            } else {
              if (param0) {
                break L15;
              }
              if (!ie.field_u[var14]) {
                if (hb.field_g <= 0) {
                  ge.field_d.b(var9, var10);
                } else {
                  tl.field_P.b(var9, var10);
                }
              } else {
                tl.field_P.b(var9, var10);
              }
            }
            if (ck.field_c >= var9 &&
              40 + var9 > ck.field_c &&
              ob.field_g >= var10 &&
              ob.field_g < var10 + 40) {
              var13 = var14;
              if (this.field_a == 1) {
                this.field_a = 0;
                if (ie.field_y != var13) {
                  ie.field_y = var13;
                } else {
                  ie.field_y = -1;
                }
              }
            }
            if (var13 == var14) {
              wj.a(var9, var10, 32, 32, 0, 64);
            }
            if (var14 == ie.field_y) {
              wj.d(var9, var10, 32, 32, 0);
            }
            var12++;
            if (var12 % 3 != 0) {
              var9 += 40;
            } else {
              var10 += 40;
              var9 = 34;
            }
          }
        }
        if (var13 == -1) {
          this.field_a = 0;
        }
        wj.d(30, -4 + var4 + 133, 120, 200, 0);
        if (ie.field_y != -1) {
          stackIn_51_0 = ie.field_y;
        } else {
          stackIn_51_0 = var13;
        }
        var14Lifetime1 = stackIn_51_0;
        if (var14Lifetime1 != -1) {
          if (oh.a(0)) {
            ni.field_q.b(gl.field_f, 320, 116 + (var4 + var6), 1, -1);
          }
          wj.d(166, 163 + (var25.field_E + var4), 128, 128, 0);
          var25.c("<u>" + sc.field_b[var14Lifetime1] + "</u>", 166, var4 + 150, 0, -1);
          stackIn_60_0 = ((var11 & 1 << var14Lifetime1) == 0) ? 0 : 1;
          var15 = stackIn_60_0;
          var16 = null;
          if (var15 == 0) {
            if (!ie.field_u[var14Lifetime1] &&
              hb.field_g <= 0) {
              stackIn_67_0 = ge.field_d;
            } else {
              stackIn_67_0 = tl.field_P;
            }
            var17_ref_he = stackIn_67_0;
            var17_ref_he.a(166, 163 + var4 + var25.field_E);
            var16_ref = cl.field_q;
          } else {
            di.field_b[var14Lifetime1].a(166, var25.field_E + (var4 + 163));
            var16_ref = vc.field_d;
          }
          var25.c(var16_ref, 166, 150 + var4 + var25.field_E, 0, -1);
          var25.c(rc.field_f + rd.field_J[var14Lifetime1], 390, 150 + var4 + var25.field_E, 0, -1);
          var25.c(bj.field_d, 390, var25.field_x + var4 - (-150 - var25.field_E), 0, -1);
          var17 = 7 + (-(ce.field_b.field_c / 4) + var25.field_x + (var25.field_E + var4) + 150);
          var18 = var25.b(bj.field_d) + 390;
          for (var19 = 0; qh.field_a[var14Lifetime1] > var19; var19++) {
            ce.field_b.b(5 * var19 + var18, var17);
          }
          var19Lifetime1 = var25.field_x - 3;
          var20 = 310;
          var21 = 185 + var4 + var25.field_E;
          var22 = 297;
          var23 = var19Lifetime1 * 5;
          var25.a(jk.field_K[var14Lifetime1], var20, var21, var22, var23, 0, -1, 0, 1, var19Lifetime1);
        } else {
          var25.a(re.field_j, 166, -var25.field_x + var4 + 150, 500, 200, 0, -1, 0, 0, var25.field_x);
          if (oh.a(0)) {
            ni.field_q.a(gl.field_f, 213, 116 + (var4 + var6 / 2), 300, 200, 1, -1, 1, 0, ni.field_q.field_x);
          }
        }
        if (5 == this.field_c) {
          var25.c(ge.field_i + ": " + sd.field_a.field_H, 310, var25.field_E + (150 + var4), 4210752, -1);
        }
        return;
    }

    ld(int param0) {
        this.field_a = mh.field_f;
        this.field_g = 2;
        this.field_c = param0;
        this.field_e = new ql(ul.field_j[param0].length);
        if (eg.field_a == null) {
          eg.field_a = ag.a(nl.field_r[0], 256, 256);
          eg.field_a.i(-1);
        }
    }

    private final void d(byte param0) {
        int var18 = 0;
        int stackIn_3_0 = 0;
        String stackIn_38_0 = null;
        int var2;
        String var3;
        jb var4;
        int var5;
        int var6;
        int var7;
        he var8;
        nh var9;
        int var10;
        vb var11_ref_vb;
        int var11;
        int var12;
        int var13;
        String[] var14;
        int var17;
        int var19;
        int var20;
        String var21;
        int var22;
        int[] var29;
        long[] var30;
        int var7Lifetime1;
        int var11Lifetime1;
        String var3Lifetime1;
        var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = -113 / ((65 - param0) / 50);
        var3 = bc.field_g;
        var4 = a.field_g;
        var5 = var4.field_x + var4.field_S;
        var6 = 0;
        var7 = 0;
        stackIn_3_0 = (!tc.field_i) ? 0 : 1;
        var7Lifetime1 = stackIn_3_0;
        if (null != sd.field_a) {
          var6 = sd.field_a.field_q;
        }
        if (l.field_f.length > var6) {
          var9 = rc.field_a[var6][var7Lifetime1];
          var8 = l.field_f[var6][var7Lifetime1];
        } else {
          var8 = al.field_c;
          var9 = dc.field_a;
        }
        boolean decompiledFrameRemainder0 = true;
        var8.e(0, 0);
        var10 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
        this.a(gg.field_d, 223, var10, -50);
        var9.a(115, var5 + (140 + var10));
        wj.d(115, 140 + var5 + var10, 160, 120, 0);
        wj.d(85, var10 + 140 - var5, 465, 14 * var5, 0);
        if (!oh.a(0)) {
          if (ob.field_b == null) {
            ob.field_b = bg.a(10, 21, 3, (byte) -105, 1);
          }
          var11_ref_vb = ob.field_b;
          var12 = pa.field_d;
          if (!var11_ref_vb.field_r) {
            var3 = qk.field_e;
            for (var13 = 0; var13 < lf.field_b / 25 % 4; var13++) {
              var3 = var3 + ".";
            }
          } else {
            if (null != var11_ref_vb.field_p) {
              var13 = 0;
              var14 = var11_ref_vb.field_p[var12];
              var30 = var11_ref_vb.field_j[var12];
              var29 = var11_ref_vb.field_t[var12];
              var17 = var10 + (140 + var4.field_x);
              for (var18 = 0; var18 < 10; var18++) {
                if (var14[var18] != null) {
                  var19 = 4210752;
                  var20 = var29[var18];
                  var21 = var14[var18];
                  if (ta.a(6, var21) &&
                    var13 == 0 &&
                    null != bf.field_h &&
                    bf.field_h.field_n == var30[var18] &&
                    null != sd.field_a &&
                    sd.field_a.field_H == var20) {
                    wj.a(300, -var4.field_x + var17, 241, var5, 0, (int)(64.0 * ji.a(65535, (double)ul.field_d / 30.0)) + 128);
                    var13 = 1;
                    var19 = 16711680;
                    wj.d(300, var17 - var4.field_x, 241, var5, 33023, (int)(32.0 * ji.a(65535, (double)ul.field_d / 30.0)) + 64);
                  }
                  var4.a(var18 + 1 + ". ", 325, var17, var19, -1);
                  var4.c(var21, 325, var17, var19, -1);
                  var4.a(Integer.toString(var20), 535, var17, var19, -1);
                  var3 = "";
                }
                var17 = var17 + var5;
              }
              if (((null != sd.field_a)) &&
                ((var13 == 0))) {
                var4.c(oa.field_d, 325, var17, 16711680, -1);
                var4.a(Integer.toString(sd.field_a.field_H), 535, var17, 16711680, -1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var3 = dd.field_o;
            }
          }
        }
        var11 = var4.field_x + var10 + (140 + var5 * 9 / 2);
        ni.field_q.b(var3, 430, var11, 4210752, -1);
        if (!oh.a(0)) {
          stackIn_38_0 = mi.field_h;
        } else {
          stackIn_38_0 = gl.field_f;
        }
        var3Lifetime1 = stackIn_38_0;
        var11Lifetime1 = var4.field_x + (140 + var10) + var5 * 10;
        var4.a(var3Lifetime1, 85, var5 / 2 + var11Lifetime1, 465, 100, 4210752, -1, 1, 0, ni.field_q.field_x);
    }

    private final void c(int param0, int param1) {
        double var3;
        double var5;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int var8Lifetime1;
        int var10Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1Lifetime1;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (sd.field_e == 0) {
          return;
        }
        var3 = ji.a(65535, (double)lf.field_b / 100.0) * 0.75;
        var5 = pj.a((double)lf.field_b / 99.0, 32768) * 0.75;
        var13 = new int[93];
        var12 = var13;
        var7 = var12;
        for (var8 = 0; var8 < 93; var8++) {
          var7[var8] = (int)(2.7 * (double)var8) * 65793;
        }
        for (var10 = 0; 480 > var10; var10++) {
          var8Lifetime1 = 100 + (int)(Math.tan(var3) * (double)(430 + (param0 - var10)));
          var9 = 100 + (int)((double)(430 + (param0 - var10)) * Math.tan(var3 + 0.25));
          wj.f(var8Lifetime1, var10, var9, 1 + var10);
          if (2 == sd.field_e) {
            wj.a(1600, 430 + param0 << 4, 4800, 92, var13);
          } else {
            wj.c(100, 430 + param0, 300, 16777215, 128);
          }
          var8Lifetime1Lifetime1 = (int)((double)(430 + (param0 - var10)) * Math.tan(var5)) + 540;
          var9Lifetime1 = 540 + (int)((double)(430 + param0 - var10) * Math.tan(var5 + 0.25));
          wj.f(var8Lifetime1Lifetime1, var10, var9Lifetime1, 1 + var10);
          if (2 == sd.field_e) {
            wj.a(8640, 430 + param0 << 4, 4800, 92, var13);
          } else {
            wj.c(540, param0 + 430, 300, 16777215, 128);
          }
        }
        var10Lifetime1 = 50 / ((-30 - param1) / 35);
        wj.a();
        return;
    }

    private final boolean a(int param0, boolean param1) {
        if (param1) {
          field_b = -54L;
          return true;
        }
        return true;
    }

    public static void e(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != 39) {
          field_d = (he[]) null;
        }
        field_h = null;
    }

    static {
        field_h = new int[]{0, 0, 5, 12, 12, 0, 0, 0, 0, 0, 0, 5, 4, 3, 4, 3, 0, 5, 11, 11, 1, 0, 1, 1, 11, 11, 0, 0, 0, 0};
    }
}
