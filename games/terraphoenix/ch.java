/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    boolean field_b;
    boolean field_a;
    private int field_e;
    static String field_h;
    static fa field_g;
    static volatile int field_d;
    private int field_f;
    int field_i;
    static int field_c;

    private final void a(int param0, int param1, int param2, Terraphoenix param3, boolean param4, int param5) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        Terraphoenix var10 = null;
        int var7_intLifetime1;
        var9 = Terraphoenix.field_V;
        try {
          if (57 + this.field_i <= ef.field_j &&
            ef.field_j < 57 + this.field_i + 266 &&
            jb.field_b >= param5 &&
            param5 + 92 > jb.field_b) {
            param3.field_gb = param0 + 1;
            if (this.field_e != param3.field_gb) {
              this.field_e = param3.field_gb;
              qd.$cfr$intArgs$a$e9dea5688aa5(43, 29);
            }
            l.e(this.field_i + 57, param5, 266, 92, 16777215);
          }
          l.i(57 + (this.field_i + 2), param5 + 2, 321 + this.field_i, 66 + param5);
          if (param0 != 5 &&
            param0 != 11) {
            cc.field_i[param0].a(192, 128, this.field_i + 164, 2 + param5 + 50, (byte) 21);
          } else {
            var7_int = 0;
            var8 = 4;
            if (param0 == 5) {
              var7_int -= 10;
            }
            cc.field_i[param0].a(192, 128, 164 + this.field_i + (-64 + var7_int), var8 + (2 + param5 + 50), (byte) 21);
          }
          l.c(this.field_i + 57, 62, 323 + this.field_i, 415);
          og.field_f.b(od.field_c[param0].field_j, 65 + this.field_i, 82 + param5, param1, -1);
          if (param4) {
            if (param0 == 17) {
              og.field_f.a(of.field_n + "50", 319 + this.field_i, param5 + 16, 0, -1);
            } else {
              if (5 != param0 &&
                param0 != 11 &&
                param0 != 4 &&
                param0 != 15) {
                if (8 != param0 &&
                  param0 != 9 &&
                  param0 != 10) {
                  if (param0 != 1) {
                    og.field_f.a(ab.field_e + od.field_c[param0].field_l, 319 + this.field_i, 16 + param5, param1, -1);
                  } else {
                    og.field_f.a(ab.field_e + od.field_c[param0].field_l * 10, this.field_i + 319, 16 + param5, param1, -1);
                  }
                } else {
                  og.field_f.a(ab.field_e + 3 * od.field_c[param0].field_l, 319 + this.field_i, param5 + 16, param1, -1);
                }
              } else {
                og.field_f.a(ab.field_e + od.field_c[param0].field_l + im.field_a, 319 + this.field_i, 16 + param5, param1, -1);
              }
              if (od.field_c[param0].field_o > 1) {
                og.field_f.a(lm.field_f + od.field_c[param0].field_o, 319 + this.field_i, 16 + (param5 + 14), param1, -1);
              }
              if (param0 != 5 &&
                param0 != 11) {
                var7_intLifetime1 = od.field_c[param0].field_g[0];
                if (param0 == 8 ||
                  param0 == 9) {
                  var7_intLifetime1 = var7_intLifetime1 * 4 / 5;
                }
                if (12 == param0 ||
                  param0 == 13) {
                  var7_intLifetime1 = 3 * var7_intLifetime1 / 4;
                }
                if (param0 == 14) {
                  var7_intLifetime1 = var7_intLifetime1 * 2 / 3;
                }
                og.field_f.a(wh.field_g + var7_intLifetime1 + "%", 319 + this.field_i, 16 + param5 + 28, param1, -1);
                if (0 == od.field_c[param0].field_b[2]) {
                  og.field_f.a(di.field_h[4], this.field_i + 319, 42 + (16 + param5), param1, -1);
                }
                if (od.field_c[param0].field_b[2] > 0 &&
                  od.field_c[param0].field_b[2] <= 5) {
                  og.field_f.a(di.field_h[0], this.field_i + 319, 42 + (param5 + 16), param1, -1);
                }
                if (5 < od.field_c[param0].field_b[2] &&
                  od.field_c[param0].field_b[2] <= 10) {
                  og.field_f.a(di.field_h[1], 319 + this.field_i, 42 + (16 + param5), param1, -1);
                }
                if (od.field_c[param0].field_b[2] > 10 &&
                  od.field_c[param0].field_b[2] <= 20) {
                  og.field_f.a(di.field_h[2], 319 + this.field_i, 16 + param5 + 42, param1, -1);
                }
                if (od.field_c[param0].field_b[2] > 20) {
                  og.field_f.a(di.field_h[3], this.field_i + 319, 42 + param5 + 16, param1, -1);
                }
              }
            }
          }
          if (param2 != 319) {
            var10 = (Terraphoenix) null;
            this.a(110, (Terraphoenix) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("ch.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != -5) {
          return -8;
        }
        return eb.field_F;
    }

    public static void b(int param0) {
        if (param0 != 6195) {
          ch.c(-99);
        }
        field_h = null;
        field_g = null;
    }

    private final ch a(int param0) {
        this.field_i = this.field_i - 8;
        if (param0 >= this.field_i) {
          return null;
        }
        return this;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Terraphoenix.field_V;
        try {
          while (true) {
            param1--;
            if (param1 < 0) {
              if (param2 != 15169) {
                field_d = -12;
              }
              return;
            }
            var9 = param3;
            var5 = var9;
            var6 = param0;
            var7 = param4;
            var9[var6] = var7 + (dg.a(16711422, var9[var6]) >> 1);
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("ch.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final static rh[] c(int param0) {
        if (param0 > -35) {
          return (rh[]) null;
        }
        return new rh[]{vj.field_K, rf.field_z, lf.field_f, rf.field_u, fl.field_e, uc.field_p, uc.field_n, oe.field_d, eh.field_f, fi.field_p, ai.field_b, e.field_l, le.field_n, wg.field_b};
    }

    final void a(int param0, Terraphoenix param1) {
        RuntimeException stackIn_350_0 = null;
        StringBuilder stackIn_350_1 = null;
        String stackIn_351_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        ci var7_ref_ci = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Terraphoenix.field_V;
        try {
          this.field_b = false;
          l.c(0, 0, 640, this.field_i / 4 + 56);
          em.field_c.d(0, this.field_i / 4 + 0);
          l.c(0, 56, 356 + this.field_i, 422);
          em.field_c.d(0 + this.field_i, 0);
          l.c(356 - this.field_i, 56, 640, 422);
          em.field_c.d(0 - this.field_i, 0);
          l.c(0, -this.field_i + 422, 640, 480);
          em.field_c.d(0, -this.field_i + 0);
          l.c();
          qh.field_b.b(-qh.field_b.field_r + 624, -qh.field_b.field_t + (464 - this.field_i));
          if (param1.field_jb > 0) {
            l.d(624 - qh.field_b.field_r, -qh.field_b.field_t + (464 - this.field_i), qh.field_b.field_r, qh.field_b.field_t, 16777215, 0);
          }
          if (ef.field_j >= -qh.field_b.field_r + 624 &&
            ef.field_j <= 624 &&
            -qh.field_b.field_t + (464 - this.field_i) <= jb.field_b &&
            jb.field_b <= -this.field_i + 464 &&
            0 >= param1.field_jb) {
            l.d(624 - qh.field_b.field_r, -qh.field_b.field_t + (464 - this.field_i), qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
          }
          if (0 < param1.field_jb) {
            l.d(-qh.field_b.field_r + 624, -this.field_i + 464 - qh.field_b.field_t, qh.field_b.field_r, qh.field_b.field_t, 0, 128);
          }
          param1.field_gb = 0;
          var3_int = 58;
          var4 = 4;
          if (od.field_c[6].field_t ||
            !(param1.field_Bb <= 2)) {
            var4 = 5;
          }
          if (param0 != -3250) {
            return;
          }
          if (param1.field_Bb > 3) {
            var4 = 6;
          }
          for (var5 = 0; var5 < var4; var5++) {
            qc.field_f[1 + var5].b(this.field_i + 5, var3_int);
            if (var5 == param1.field_hb) {
              qc.field_f[0].b(this.field_i + 5, var3_int);
            }
            if (ef.field_j >= this.field_i + 5 &&
              ef.field_j < qc.field_f[0].field_r + 5 + this.field_i &&
              var3_int <= jb.field_b &&
              qc.field_f[0].field_t + var3_int > jb.field_b) {
              l.e(this.field_i + 5, var3_int, qc.field_f[0].field_r, qc.field_f[0].field_t, 16777215);
              if (var5 != this.field_f) {
                this.field_f = var5;
                qd.$cfr$intArgs$a$e9dea5688aa5(42, 28);
              }
              param1.field_Eb = new String[1];
              param1.field_Eb[0] = lb.field_c[0];
              if (var5 == 1) {
                param1.field_Eb[0] = lb.field_c[1];
              }
              if (var5 == 2) {
                param1.field_Eb[0] = lb.field_c[2];
              }
              if (3 == var5) {
                param1.field_Eb[0] = lb.field_c[3];
              }
              if (var5 == 4) {
                param1.field_Eb[0] = lb.field_c[4];
              }
              if (var5 == 5) {
                param1.field_Eb[0] = lb.field_c[5];
              }
              if (oh.field_f == 1 &&
                param1.field_wb == null) {
                if (param1.field_hb != var5) {
                  this.field_e = -1;
                  param1.field_G = 0;
                  qd.$cfr$intArgs$a$e9dea5688aa5(112, 30);
                }
                param1.field_hb = var5;
              }
            }
            if (0 == var5) {
            }
            var6_int = 0;
            if (1 != var5) {
            }
            if (var5 == 2) {
              if (!od.field_c[17].field_t &&
                param1.field_I.field_a[17] > 0) {
                var6_int = 1;
              }
              if (!sj.field_a[2].field_l &&
                param1.field_Bb > 4) {
                var6_int = 1;
              }
              if (!sj.field_a[3].field_l &&
                sj.field_a[2].field_l &&
                od.field_c[17].field_t) {
                var6_int = 1;
              }
            }
            if (var5 == 3 &&
              !od.field_c[11].field_t &&
              param1.field_I.field_a[11] > 0) {
              var6_int = 1;
            }
            if (var5 == 4) {
              if (!od.field_c[6].field_t) {
                var6_int = 1;
              }
              if (!od.field_c[7].field_t &&
                od.field_c[6].field_t) {
                var6_int = 1;
              }
              if (!od.field_c[10].field_t &&
                od.field_c[9].field_t) {
                var6_int = 1;
              }
              if (!od.field_c[16].field_t &&
                od.field_c[13].field_t) {
                var6_int = 1;
              }
            }
            if (var5 == 5) {
              if (!od.field_c[8].field_t &&
                param1.field_I.field_a[8] > 0) {
                var6_int = 1;
              }
              if (!od.field_c[9].field_t &&
                param1.field_I.field_a[9] > 0) {
                var6_int = 1;
              }
              if (!od.field_c[12].field_t &&
                od.field_c[8].field_t &&
                0 < param1.field_I.field_a[12]) {
                var6_int = 1;
              }
              if (!od.field_c[13].field_t &&
                od.field_c[8].field_t &&
                param1.field_I.field_a[13] > 0) {
                var6_int = 1;
              }
              if (!od.field_c[14].field_t &&
                od.field_c[12].field_t &&
                0 < param1.field_I.field_a[14]) {
                var6_int = 1;
              }
              if (!od.field_c[15].field_t &&
                od.field_c[11].field_t &&
                od.field_c[12].field_t &&
                param1.field_I.field_a[15] > 0) {
                var6_int = 1;
              }
            }
            if (param1.field_jb <= 0) {
              var6_int = 0;
            }
            if (var6_int != 0) {
              var7 = (120 + (int)(Math.sin(mm.field_f) * 120.0)) * 65793;
              l.e(4 + this.field_i, -1 + var3_int, 2 + qc.field_f[0].field_r, 2 + qc.field_f[0].field_t, var7);
            }
            var3_int += 52;
          }
          var5 = 256;
          if (param1.field_jb <= 0) {
            var5 = 128;
          }
          l.c(57 + this.field_i, 62, 323 + this.field_i, 415);
          var3_int = -param1.field_G + 62;
          if (param1.field_hb == 2) {
            if (!od.field_c[17].field_t &&
              param1.field_I.field_a[17] > 0) {
              bj.field_g.c(this.field_i + 57, var3_int, var5);
              this.a(17, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (!sj.field_a[2].field_l &&
              4 < param1.field_Bb) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(false, (byte) 124, 2, var3_int, param1, 16777215);
              var3_int += 92;
            }
            if (0 < param1.field_jb &&
              !sj.field_a[3].field_l &&
              sj.field_a[2].field_l &&
              od.field_c[17].field_t) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(false, (byte) 29, 3, var3_int, param1, 16777215);
              var3_int += 92;
            }
          }
          if (param1.field_hb == 3 &&
            !od.field_c[11].field_t &&
            param1.field_I.field_a[11] > 0) {
            bj.field_g.c(57 + this.field_i, var3_int, var5);
            this.a(11, 16777215, 319, param1, false, var3_int);
            var3_int += 92;
          }
          if (param1.field_hb == 4) {
            if (!od.field_c[6].field_t) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(6, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (param1.field_jb > 0 &&
              !od.field_c[7].field_t &&
              od.field_c[6].field_t) {
              bj.field_g.c(this.field_i + 57, var3_int, var5);
              this.a(7, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (param1.field_jb > 0 &&
              !od.field_c[10].field_t &&
              od.field_c[9].field_t) {
              bj.field_g.c(this.field_i + 57, var3_int, var5);
              this.a(10, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (0 < param1.field_jb &&
              !od.field_c[16].field_t &&
              od.field_c[13].field_t) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(16, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
          }
          if (param1.field_hb == 5) {
            if (!od.field_c[8].field_t &&
              param1.field_I.field_a[8] > 0) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(8, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (!od.field_c[9].field_t &&
              param1.field_I.field_a[9] > 0) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(9, 16777215, param0 + 3569, param1, false, var3_int);
              var3_int += 92;
            }
            if (!od.field_c[12].field_t &&
              od.field_c[8].field_t &&
              param1.field_I.field_a[12] > 0) {
              bj.field_g.c(this.field_i + 57, var3_int, var5);
              this.a(12, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (!od.field_c[13].field_t &&
              od.field_c[8].field_t &&
              0 < param1.field_I.field_a[13]) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(13, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (!od.field_c[14].field_t &&
              od.field_c[12].field_t &&
              param1.field_I.field_a[14] > 0) {
              bj.field_g.c(57 + this.field_i, var3_int, var5);
              this.a(14, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
            if (!od.field_c[15].field_t &&
              od.field_c[11].field_t &&
              od.field_c[12].field_t &&
              param1.field_I.field_a[15] > 0) {
              bj.field_g.c(this.field_i + 57, var3_int, var5);
              this.a(15, 16777215, 319, param1, false, var3_int);
              var3_int += 92;
            }
          }
          for (var6_int = -1 + od.field_c.length; var6_int >= 0; var6_int--) {
            boolean decompiledFrameRemainder0 = true;
            if (od.field_c[var6_int].field_t) {
              L56: {
                if (param1.field_hb == 0) {
                  if (var6_int == 0) {
                    break L56;
                  }
                  if (var6_int == 3) {
                    break L56;
                  }
                }
                if (param1.field_hb == 1) {
                  switch (var6_int) {
                    case 1:
                      break L56;
                    case 2:
                      break L56;
                    case 4:
                      break L56;
                    case 18:
                      break L56;
                    default:
                      break;
                  }
                }
                if (param1.field_hb != 2 ||
                  17 != var6_int) {
                  if (param1.field_hb == 3) {
                    if (var6_int == 5) {
                      break L56;
                    }
                    if (var6_int == 11) {
                      break L56;
                    }
                  }
                  if (4 == param1.field_hb) {
                    switch (var6_int) {
                      case 6:
                        break L56;
                      case 7:
                        break L56;
                      case 10:
                        break L56;
                      case 16:
                        break L56;
                      default:
                        break;
                    }
                  }
                  decompiledFrameRemainder0 = (param1.field_hb == 5);
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder0 = (var6_int == 8 ||
                      9 == var6_int ||
                      var6_int == 11 ||
                      var6_int == 12 ||
                      var6_int == 13 ||
                      var6_int == 14 ||
                      var6_int == 15);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                e.field_g.c(this.field_i + 57, var3_int, 384);
                this.a(var6_int, 16777215, param0 + 3569, param1, true, var3_int);
                var3_int += 92;
              }
            }
          }
          for (var6_int = sj.field_a.length - 1; var6_int >= 0; var6_int--) {
            if (sj.field_a[var6_int].field_l &&
              2 == param1.field_hb) {
              e.field_g.c(57 + this.field_i, var3_int, 384);
              this.a(true, (byte) -128, var6_int, var3_int, param1, 0);
              var3_int += 92;
            }
          }
          l.c();
          var3_int = var3_int + param1.field_G;
          if (1 != oh.field_f) {
            param1.field_J = false;
          }
          var3_int -= 62;
          if (var3_int > 353) {
            var6_int = 116137 / var3_int;
            var7 = param1.field_G * (329 - var6_int) / (var3_int - 353);
            jg.field_hb.b(this.field_i + 337, var7 + 74, jg.field_hb.field_r, var6_int, 7381200);
            if (1 == oh.field_f && (param1.field_J ||
              !(337 + this.field_i > ef.field_j) &&
              !(jg.field_hb.field_r + 337 + this.field_i <= ef.field_j)) && (jb.field_b >= 64 &&
              414 > jb.field_b)) {
              var8 = var6_int / 2 + 74;
              var9 = -(var6_int / 2) + 403;
              if (!param1.field_J) {
                if (var7 + 74 < jb.field_b &&
                  var6_int + (74 + var7) > jb.field_b) {
                  param1.field_J = true;
                  param1.field_rb = var9 - var6_int / 2 + jb.field_b + (-var7 - 74);
                  param1.field_eb = jb.field_b + (var8 - var6_int / 2) - (var7 + 74);
                } else {
                  if (var8 > jb.field_b) {
                    param1.field_G = 0;
                  } else {
                    if (jb.field_b <= var9) {
                      param1.field_G = (-var8 + jb.field_b) * (-353 + var3_int) / (var9 - var8);
                    } else {
                      param1.field_G = -353 + var3_int;
                    }
                  }
                  param1.field_rb = var9;
                  param1.field_J = true;
                  param1.field_eb = var8;
                }
              } else {
                var9 = param1.field_rb;
                var8 = param1.field_eb;
                if (var8 > jb.field_b) {
                  param1.field_G = 0;
                } else {
                  if (var9 >= jb.field_b) {
                    param1.field_G = (-var8 + jb.field_b) * (var3_int - 353) / (-var8 + var9);
                  } else {
                    param1.field_G = var3_int - 353;
                  }
                }
              }
            }
          } else {
            l.f(333 + this.field_i, 58, 19, 360, 0);
          }
          if (param1.field_D == 0) {
            if (ha.field_q >= 1) {
              var6 = jc.field_E;
            } else {
              var6 = r.field_kb;
            }
            var7 = og.field_f.c(var6, 263);
            l.d(-this.field_i + 360, -(14 * var7) + 307 + 8, 268, 14 * var7 + 14 - 10, 0, 96);
            l.g(-this.field_i + 360, 307 - 14 * var7 + 8, 268, 16777215, 192);
            l.g(360 - this.field_i, 318, 268, 16777215, 192);
            ji.a(-this.field_i + 362, 14, 16777215, -60 + (397 - 14 * var7), var6, (byte) 88, -this.field_i + 625);
          } else {
            if (param1.field_D > 0) {
              var6_int = -1 + param1.field_D;
              if (!od.field_c[var6_int].field_t) {
                if (param1.field_jb > 0) {
                  bl.field_b[0].b(-this.field_i + 357, 386);
                  if (ef.field_j >= -this.field_i + 357 &&
                    ef.field_j <= -this.field_i + 631 &&
                    jb.field_b >= 386 &&
                    420 >= jb.field_b) {
                    l.e(-this.field_i + 357, 386, 274, 34, 16777215);
                    this.field_b = true;
                  }
                }
                cc.field_i[var6_int].b(-cc.field_i[var6_int].field_p + (362 - this.field_i), 100 - cc.field_i[var6_int].field_v);
                param1.a(vc.field_f, 124, 0, 16777215, -this.field_i + 493, param0 - 28085, od.field_c[var6_int].field_k);
                var7 = og.field_f.c(od.field_c[var6_int].field_i, 263);
                l.d(360 - this.field_i, -90 + (397 - 14 * var7 + 8), 268, 14 * var7 + 4, 0, 96);
                l.g(360 - this.field_i, 397 + (-(var7 * 14) - 90) + 8, 268, 16777215, 192);
                l.g(360 - this.field_i, 318, 268, 16777215, 192);
                ji.a(362 - this.field_i, 14, 16777215, 397 - (var7 * 14 + 60), od.field_c[var6_int].field_i, (byte) 89, -this.field_i + 625);
              } else {
                bl.field_b[1].b(357 - this.field_i, 386);
                if (var6_int != 5 &&
                  var6_int != 11) {
                  cc.field_i[var6_int].b(362 + (-cc.field_i[var6_int].field_p - this.field_i), 100 - cc.field_i[var6_int].field_v);
                } else {
                  var7_ref_ci = cc.field_i[var6_int].d();
                  var7_ref_ci.b();
                  var7_ref_ci.b(362 - (var7_ref_ci.field_p + this.field_i) + 16, 16 + (-var7_ref_ci.field_v + 100));
                }
                param1.a(vc.field_f, 124, 0, 16777215, -this.field_i + 493, -31335, od.field_c[var6_int].field_j);
                param1.a(vc.field_f, 154, 0, 16777215, 493 - this.field_i + 64, -31335, od.field_c[var6_int].field_r);
                var7 = og.field_f.c(od.field_c[var6_int].field_e, 263);
                l.d(-this.field_i + 360, -(var7 * 14) + 397 - 82, 268, 14 + (var7 * 14 - 10), 0, 96);
                l.g(-this.field_i + 360, 307 - (var7 * 14 - 8), 268, 16777215, 192);
                l.g(360 - this.field_i, 318, 268, 16777215, 192);
                ji.a(362 - this.field_i, 14, 16777215, -60 + (397 - 14 * var7), od.field_c[var6_int].field_e, (byte) 98, 625 - this.field_i);
                if (var6_int != 5 &&
                  var6_int != 11) {
                  if (17 == var6_int) {
                    og.field_f.b(u.field_b, -this.field_i + 362, 332, 0, -1);
                    og.field_f.b(ai.field_e + od.field_c[var6_int].field_s, -this.field_i + 362, 347, 0, -1);
                    return;
                  }
                  if (4 != var6_int &&
                    var6_int != 15) {
                    if (var6_int == 1) {
                      og.field_f.b(ab.field_e + 10 * od.field_c[var6_int].field_l, -this.field_i + 362, 332, 0, -1);
                    } else {
                      if (var6_int != 8 &&
                        var6_int != 9 &&
                        var6_int != 10) {
                        og.field_f.b(ab.field_e + od.field_c[var6_int].field_l, -this.field_i + 362, 332, 0, -1);
                      } else {
                        og.field_f.b(ab.field_e + 3 * od.field_c[var6_int].field_l, -this.field_i + 362, 332, 0, -1);
                      }
                    }
                    if (od.field_c[var6_int].field_o > 0) {
                      og.field_f.b(lm.field_f + od.field_c[var6_int].field_o, -this.field_i + 512, 377, 0, -1);
                    }
                    var8 = od.field_c[var6_int].field_g[0];
                    if (var6_int == 8 ||
                      var6_int == 9) {
                      var8 = 4 * var8 / 5;
                    }
                    if (var6_int == 12 ||
                      13 == var6_int) {
                      var8 = var8 * 3 / 4;
                    }
                    if (var6_int == 14) {
                      var8 = 2 * var8 / 3;
                    }
                    og.field_f.b(ha.field_m + var8 + "%", -this.field_i + 362, 347, 0, -1);
                    if (od.field_c[var6_int].field_b[2] > 0) {
                      if (var6_int != 8 &&
                        var6_int != 9) {
                        og.field_f.b(qk.field_k + od.field_c[var6_int].field_b[1] + "%", -this.field_i + 512, 347, 0, -1);
                      } else {
                        og.field_f.b(qk.field_k + od.field_c[var6_int].field_b[1] * 2 + "%", -this.field_i + 512, 347, 0, -1);
                      }
                    }
                    if (od.field_c[var6_int].field_b[2] <= 0) {
                      og.field_f.b(kh.field_K + od.field_c[var6_int].field_b[1] + "%", -this.field_i + 512, 347, 0, -1);
                    }
                    og.field_f.b(ef.field_c + od.field_c[var6_int].field_g[1] + "%", 362 - this.field_i, 362, 0, -1);
                    if (0 < od.field_c[var6_int].field_b[2]) {
                      og.field_f.b(kh.field_K + od.field_c[var6_int].field_b[2] + "%", 512 - this.field_i, 362, 0, -1);
                    }
                    og.field_f.b(ai.field_e + od.field_c[var6_int].field_s, 362 - this.field_i, 377, 0, -1);
                    return;
                  }
                  og.field_f.b(ab.field_e + od.field_c[var6_int].field_l + rl.field_a, 362 - this.field_i, 332, 0, -1);
                  var8 = od.field_c[var6_int].field_g[0];
                  if (var6_int == 8 ||
                    var6_int == 9) {
                    var8 = 4 * var8 / 5;
                  }
                  if (var6_int == 12 ||
                    13 == var6_int) {
                    var8 = 3 * var8 / 4;
                  }
                  if (var6_int == 14) {
                    var8 = 2 * var8 / 3;
                  }
                  og.field_f.b(wh.field_g + var8 + "%", 362 - this.field_i, 347, 0, -1);
                  og.field_f.b(kh.field_K + od.field_c[var6_int].field_b[0] + "%", -this.field_i + 512, 347, 0, -1);
                  og.field_f.b(ai.field_e + od.field_c[var6_int].field_s, -this.field_i + 362, 362, 0, -1);
                  return;
                }
                og.field_f.b(ab.field_e + od.field_c[var6_int].field_l + rl.field_a, -this.field_i + 362, 332, 0, -1);
                og.field_f.b(bc.field_c + "15", 362 - this.field_i, 347, 0, -1);
                og.field_f.b(ai.field_e + od.field_c[var6_int].field_s, -this.field_i + 362, 362, 0, -1);
              }
            } else {
              var6_int = -1 - param1.field_D;
              if (sj.field_a[var6_int].field_l) {
                bl.field_b[1].b(357 - this.field_i, 386);
                kb.field_a[var6_int].b(-kb.field_a[var6_int].field_p + 362 - this.field_i, 100 - kb.field_a[var6_int].field_v);
                param1.a(vc.field_f, 124, 0, 16777215, -this.field_i + 493, -31335, sj.field_a[var6_int].field_m);
                param1.a(vc.field_f, 154, 0, 16777215, 493 - (this.field_i - 64), -31335, sj.field_a[var6_int].field_i);
                og.field_f.b(of.field_n + sj.field_a[var6_int].field_g, -this.field_i + 362, 362, 0, -1);
                og.field_f.b(ai.field_e + sj.field_a[var6_int].field_f, 362 - this.field_i, 377, 0, -1);
                var7 = og.field_f.c(sj.field_a[var6_int].field_k, 263);
                l.d(360 - this.field_i, -82 + (397 - 14 * var7), 268, 4 + var7 * 14, 0, 96);
                l.g(360 - this.field_i, -90 + (397 - var7 * 14) + 8, 268, 16777215, 192);
                l.g(-this.field_i + 360, 318, 268, 16777215, 192);
                ji.a(362 - this.field_i, 14, 16777215, -60 - var7 * 14 + 397, sj.field_a[var6_int].field_k, (byte) 103, -this.field_i + 625);
              } else {
                if (0 < param1.field_jb) {
                  bl.field_b[0].b(-this.field_i + 357, 386);
                  if (-this.field_i + 357 <= ef.field_j &&
                    -this.field_i + 357 + 274 >= ef.field_j &&
                    386 <= jb.field_b &&
                    jb.field_b <= 420) {
                    l.e(-this.field_i + 357, 386, 274, 34, 16777215);
                    this.field_b = true;
                  }
                }
                kb.field_a[var6_int].b(362 - kb.field_a[var6_int].field_p - this.field_i, 100 - kb.field_a[var6_int].field_v);
                param1.a(vc.field_f, 124, 0, 16777215, -this.field_i + 493, -31335, sj.field_a[var6_int].field_b);
                var7 = og.field_f.c(sj.field_a[var6_int].field_k, 263);
                l.d(360 - this.field_i, -90 + (397 + (-(14 * var7) + 8)), 268, -10 + (14 * var7 + 14), 0, 96);
                l.g(-this.field_i + 360, -90 + (397 - (14 * var7 - 8)), 268, 16777215, 192);
                l.g(-this.field_i + 360, 318, 268, 16777215, 192);
                ji.a(362 - this.field_i, 14, 16777215, 337 - 14 * var7, sj.field_a[var6_int].field_a, (byte) 122, 625 - this.field_i);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_350_0 = var3;
          stackIn_350_1 = new StringBuilder().append("ch.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_351_2 = "null";
          } else {
            stackIn_351_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_350_0), ((StringBuilder) (Object) stackIn_350_1).append(stackIn_351_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Terraphoenix.field_V;
        if (kf.field_f < 0) {
          return;
        }
        var3 = param2 - 135;
        var4 = param1 - 35;
        var5 = 256;
        if (kf.field_f < 75) {
          var5 = (kf.field_f << 8) / 75;
        }
        if (kf.field_f > 200) {
          var5 = (-kf.field_f + 250 << 8) / 50;
        }
        if (param0 != -79) {
          var9 = (int[]) null;
          ch.a(-64, -120, 87, (int[]) null, 24);
        }
        il.a(1, jg.field_ib);
        ob.b();
        l.a();
        af.d(-2766);
        if (256 > var5) {
          l.d(0, 0, l.field_k, l.field_j, 0, 256 - var5);
        }
        ij.a(false);
        if (kf.field_f >= 150) {
          hd.field_l.a(var3 + 15, 10 + var4, var5);
        } else {
          jg.field_ib.f(var3, var4);
        }
        var6 = -125 + kf.field_f;
        if (0 < var6 &&
          50 > var6) {
          if (var6 >= 20) {
            if (var6 >= 30) {
              var7 = (50 - var6) * 256 / 20;
              s.field_a.d(var3, var4, var7);
            } else {
              s.field_a.d(var3, var4, 256);
            }
          } else {
            var7 = var6 * 256 / 20;
            s.field_a.d(var3, var4, var7);
          }
        }
        var6Lifetime1 = -140 + kf.field_f;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          ib.field_Y.a(var3 + 15, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    ch() {
        this.field_e = -1;
        this.field_f = -1;
        this.field_i = -356;
        qd.$cfr$intArgs$a$e9dea5688aa5(37, 26);
        this.field_a = false;
    }

    final ch a(byte param0, Terraphoenix param1) {
        RuntimeException var3 = null;
        Terraphoenix var4 = null;
        ch stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_a) {
            stackIn_3_0 = this.a(-356);
            return stackIn_3_0;
          }
          if (this.field_i >= 0) {
            if (param0 != -29) {
              var4 = (Terraphoenix) null;
              this.a(false, (byte) -11, -60, -33, (Terraphoenix) null, -119);
            }
            return this;
          }
          param1.field_G = 0;
          this.field_i = 9 * this.field_i / 10;
          this.field_i = this.field_i + 1;
          if (this.field_i >= 0) {
            this.field_i = 0;
            ja.field_i = 3;
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ch.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(boolean param0, byte param1, int param2, int param3, Terraphoenix param4, int param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          if (ef.field_j >= this.field_i + 57 &&
            ef.field_j < this.field_i + 323 &&
            jb.field_b >= param3 &&
            92 + param3 > jb.field_b) {
            param4.field_gb = -param2 - 1;
            if (-param4.field_gb != this.field_e) {
              this.field_e = -param4.field_gb;
              qd.$cfr$intArgs$a$e9dea5688aa5(54, 29);
            }
            l.e(this.field_i + 57, param3, 266, 92, 16777215);
          }
          l.i(59 + this.field_i, param3 + 2, this.field_i + 321, 66 + param3);
          kb.field_a[param2].a(0, 128, 190 + this.field_i, param3 + 2 + 32, (byte) 21);
          l.c(this.field_i + 57, 62, this.field_i + 323, 415);
          og.field_f.b(sj.field_a[param2].field_m, 65 + this.field_i, 82 + param3, 0, -1);
          if (param0) {
            og.field_f.a(of.field_n + (sj.field_a[param2].field_g + sj.field_a[param2].field_d), this.field_i + 319, 16 + param3, 0, -1);
          }
          var7_int = -117 / ((-72 - param1) / 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("ch.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_h = "Evacuate with data";
        field_d = -1;
    }
}
