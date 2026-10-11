/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vl {
    int field_f;
    private int field_d;
    boolean field_b;
    static jj field_i;
    static int[] field_a;
    private int field_g;
    static int field_h;
    static int[] field_e;
    static ci field_c;

    final vl a(Terraphoenix param0, int param1) {
        RuntimeException var3 = null;
        vl stackIn_2_0 = null;
        vl stackIn_6_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 11803) {
            stackIn_2_0 = (vl) null;
            return stackIn_2_0;
          }
          if (this.field_b) {
            stackIn_6_0 = this.a((byte) -19);
            return stackIn_6_0;
          }
          if (this.field_f >= 0) {
            return this;
          }
          param0.field_G = 0;
          this.field_f = 9 * this.field_f / 10;
          this.field_f = this.field_f + 1;
          if (this.field_f >= 0) {
            this.field_f = 0;
            ja.field_i = 4;
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("vl.D(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
          return;
        }
        field_c = null;
        field_i = null;
        field_e = null;
    }

    final static byte[] a(int param0, File param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 21) {
            vl.b(48);
          }
          stackIn_3_0 = og.a(19758, param1, (int)param1.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (param0 != 3) {
          field_c = (ci) null;
        }
        if (ua.field_d == qe.field_f) {
          return oe.field_a;
        }
        if (!vc.field_a.a(-113)) {
          return vc.field_a.b(-123);
        }
        if (pe.field_a == ua.field_d) {
          return vc.field_a.b(-121);
        }
        return ol.field_Hb;
    }

    private final vl a(byte param0) {
        this.field_f = this.field_f - 8;
        if (this.field_f <= -356) {
          return null;
        }
        int var2 = 18 / ((param0 - 41) / 55);
        return this;
    }

    final void a(int param0, Terraphoenix param1) {
        RuntimeException stackIn_403_0 = null;
        StringBuilder stackIn_403_1 = null;
        String stackIn_404_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        ci var9_ref_ci = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        ci var16 = null;
        ci var17 = null;
        ci var18 = null;
        var13 = Terraphoenix.field_V;
        try {
          param1.field_yb = false;
          l.c(0, 0, 640, 56 + this.field_f / 4);
          vk.field_d.d(0, this.field_f / 4 + 0);
          l.c(0, 56, 356 + this.field_f, 369);
          vk.field_d.d(0 + this.field_f, 0);
          l.c(0, 369, 356 + this.field_f, 480);
          l.f(0, 0, 640, 480, 0);
          l.c(356 - this.field_f, 56, 640, 369);
          vk.field_d.d(0 - this.field_f, 0);
          l.c(-this.field_f + 356, 369, 640, 480);
          l.f(0, 0, 640, 480, 0);
          l.c(0, -this.field_f + 369, 640, 480);
          vk.field_d.d(0, -this.field_f + 0);
          l.c();
          qh.field_b.b(624 - qh.field_b.field_r, -qh.field_b.field_t + 464 - this.field_f);
          if (param1.field_wb == null) {
            if (ef.field_j >= 624 - qh.field_b.field_r &&
              ef.field_j <= 624 &&
              -this.field_f + (464 - qh.field_b.field_t) <= jb.field_b &&
              464 - this.field_f >= jb.field_b) {
              l.d(624 - qh.field_b.field_r, 464 - this.field_f - qh.field_b.field_t, qh.field_b.field_r, qh.field_b.field_t, 16777215, 128);
            }
          } else {
            l.d(-qh.field_b.field_r + 624, -this.field_f + 464 - qh.field_b.field_t, qh.field_b.field_r, qh.field_b.field_t, 0, 192);
          }
          param1.field_I.field_a[0] = 100;
          var3_int = param1.field_Bb;
          param1.field_I.field_a[1] = 100;
          param1.field_I.field_d[0] = 100;
          od.field_c[1].field_q = true;
          sj.field_a[2].field_e = true;
          param1.field_gb = 0;
          if (var3_int >= 7) {
            sj.field_a[1].field_e = false;
            param1.field_I.field_d[1] = 100;
          }
          if (var3_int >= 3) {
            param1.field_I.field_a[2] = 100;
            od.field_c[2].field_q = false;
          }
          var4 = 58;
          var5 = 4;
          if (od.field_c[6].field_t) {
            var5 = 5;
          }
          if (od.field_c[8].field_t ||
            od.field_c[12].field_t) {
            var5 = 6;
          }
          for (var6 = 0; var6 < var5; var6++) {
            qc.field_f[var6 + 1].b(5 + this.field_f, var4);
            if (var6 == param1.field_hb) {
              qc.field_f[0].b(5 + this.field_f, var4);
            }
            if (ef.field_j >= this.field_f + 5 &&
              5 + (-this.field_f + qc.field_f[0].field_r) > ef.field_j &&
              var4 <= jb.field_b &&
              jb.field_b < var4 + qc.field_f[0].field_t) {
              param1.field_Eb = new String[1];
              param1.field_Eb[0] = lb.field_c[0];
              if (var6 == 1) {
                param1.field_Eb[0] = lb.field_c[1];
              }
              if (var6 == 2) {
                param1.field_Eb[0] = lb.field_c[2];
              }
              if (var6 == 3) {
                param1.field_Eb[0] = lb.field_c[3];
              }
              if (var6 == 4) {
                param1.field_Eb[0] = lb.field_c[4];
              }
              if (var6 == 5) {
                param1.field_Eb[0] = lb.field_c[5];
              }
              l.e(5 + this.field_f, var4, qc.field_f[0].field_r, qc.field_f[0].field_t, 16777215);
              if (var6 != this.field_d) {
                this.field_d = var6;
                qd.$cfr$intArgs$a$e9dea5688aa5(67, 28);
              }
              if (oh.field_f == 1 &&
                param1.field_wb == null) {
                if (param1.field_hb != var6) {
                  param1.field_G = 0;
                  this.field_g = -1;
                  qd.$cfr$intArgs$a$e9dea5688aa5(119, 30);
                }
                param1.field_hb = var6;
              }
            }
            var4 += 52;
          }
          if (param1.field_hb == 0) {
            og.field_f.c(lb.field_c[0], this.field_f + 189, 79, 65280, -1);
          }
          if (param1.field_hb == 1) {
            og.field_f.c(lb.field_c[1], this.field_f + 189, 79, 65280, -1);
          }
          if (param1.field_hb == 2) {
            og.field_f.c(lb.field_c[2], 189 + this.field_f, 79, 65280, -1);
          }
          if (param1.field_hb == 3) {
            og.field_f.c(lb.field_c[3], this.field_f + 189, 79, 65280, -1);
          }
          if (param1.field_hb == 4) {
            og.field_f.c(lb.field_c[4], this.field_f + 189, 79, 65280, -1);
          }
          if (param1.field_hb == 5) {
            og.field_f.c(lb.field_c[5], this.field_f + 189, 79, 65280, -1);
          }
          l.c(this.field_f + 57, 84, 323 + this.field_f, 364);
          var4 = 84 - param1.field_G;
          for (var6 = -1 + od.field_c.length; var6 >= 0; var6--) {
            boolean decompiledFrameRemainder0 = true;
            if (od.field_c[var6].field_t) {
              L58: {
                if (param1.field_hb == 0) {
                  switch (var6) {
                    case 0:
                      break L58;
                    case 3:
                      break L58;
                    case 8:
                      break L58;
                    case 12:
                      break L58;
                    default:
                      break;
                  }
                }
                if (param1.field_hb == 1) {
                  switch (var6) {
                    case 1:
                      break L58;
                    case 2:
                      break L58;
                    case 4:
                      break L58;
                    case 18:
                      break L58;
                    default:
                      break;
                  }
                }
                if (2 != param1.field_hb ||
                  var6 != 17) {
                  if (param1.field_hb == 3) {
                    if (var6 == 5) {
                      break L58;
                    }
                    if (11 == var6) {
                      break L58;
                    }
                  }
                  if (4 == param1.field_hb) {
                    switch (var6) {
                      case 6:
                        break L58;
                      case 7:
                        break L58;
                      case 10:
                        break L58;
                      case 16:
                        break L58;
                      default:
                        break;
                    }
                  }
                  decompiledFrameRemainder0 = (param1.field_hb == 5);
                  if (decompiledFrameRemainder0) {
                    decompiledFrameRemainder0 = (var6 == 8 ||
                      var6 == 9 ||
                      12 == var6 ||
                      var6 == 13 ||
                      var6 == 14 ||
                      15 == var6);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                boolean decompiledFrameRemainder3 = true;
                if (0 < param1.field_I.field_a[var6]) {
                  if (jb.field_b > 84 &&
                    364 > jb.field_b &&
                    ef.field_j >= 57 + this.field_f &&
                    ef.field_j < e.field_g.field_r + (57 + this.field_f) &&
                    jb.field_b >= var4 &&
                    jb.field_b < var4 + e.field_g.field_t) {
                    e.field_g.c(57 + this.field_f, var4, 384);
                    param1.field_gb = 1 + var6;
                    if ((this.field_g != param1.field_gb)) {
                      this.field_g = param1.field_gb;
                      qd.$cfr$intArgs$a$e9dea5688aa5(101, 29);
                    }
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    e.field_g.b(57 + this.field_f, var4);
                  }
                } else {
                  e.field_g.c(this.field_f + 57, var4, 128);
                }
                l.i(59 + this.field_f, 2 + var4, this.field_f + 321, var4 + 66);
                if (var6 != 5 &&
                  11 != var6) {
                  cc.field_i[var6].a(192, 128, 164 + this.field_f, 50 + (var4 + 2), (byte) 21);
                } else {
                  var7 = 0;
                  if (var6 == 5) {
                    var7 -= 10;
                  }
                  var8 = 4;
                  cc.field_i[var6].a(192, 128, var7 + (this.field_f + 164) - 64, 50 + (var4 + 2 + var8), (byte) 21);
                }
                l.c(this.field_f + 57, 84, this.field_f + 323, 364);
                if (param1.field_I.field_a[var6] > 50) {
                  param1.field_I.field_a[var6] = 55;
                }
                if (!od.field_c[var6].field_q &&
                  !od.field_c[var6].field_f) {
                  param1.field_I.field_a[var6] = 55;
                }
                if (od.field_c[var6].field_q &&
                  param1.field_Fb > 0 &&
                  param1.field_I.field_a[var6] < 50) {
                  qc.field_f[7].c(59 + this.field_f, 2 + var4, (int)(120.0 * Math.cos(mm.field_f)) + 120);
                  var7 = 1;
                  if (var6 == 3) {
                    var7 = 2;
                  }
                  if (var6 == 5) {
                    var7 = 4;
                  }
                  if (var6 == 5 &&
                    od.field_c[11].field_t) {
                    var7 = 8;
                  }
                  if (var6 == 2 &&
                    od.field_c[10].field_t) {
                    var7 = 2;
                  }
                  if (var6 == 18 &&
                    od.field_c[10].field_t) {
                    var7 = 2;
                  }
                  if (var6 == 7 &&
                    od.field_c[16].field_t) {
                    var7 = 2;
                  }
                  if (6 == var6 &&
                    od.field_c[16].field_t) {
                    var7 = 2;
                  }
                  if (var6 == 2 &&
                    od.field_c[16].field_t) {
                    var7 = 4;
                  }
                  if (var6 == 18 &&
                    od.field_c[16].field_t) {
                    var7 = 4;
                  }
                  if (!(1 >= param1.field_Fb) ||
                    var7 > 1) {
                    var14 = Integer.toString(param1.field_Fb);
                    var8_ref_String = var14;
                    if (var7 > 1) {
                      var8_ref_String = var14 + "*" + var7;
                    }
                    og.field_f.c(var8_ref_String, this.field_f + 90, 32 + var4 + 8, 0, -1);
                    og.field_f.c(var8_ref_String, this.field_f + 88, var4 + 32 + 8, 0, -1);
                    og.field_f.c(var8_ref_String, 89 + this.field_f, 32 + (var4 + 9), 0, -1);
                    og.field_f.c(var8_ref_String, this.field_f + 89, 7 + (var4 + 32), 0, -1);
                    og.field_f.c(var8_ref_String, this.field_f + 89, 8 + var4 + 32, 16777215, -1);
                  }
                  if (ef.field_j >= 59 + this.field_f &&
                    ef.field_j < 103 + this.field_f &&
                    var4 + 2 <= jb.field_b &&
                    jb.field_b < 2 + (var4 + 44)) {
                    param1.field_yb = true;
                    param1.field_gb = 1 + var6;
                    l.e(this.field_f + 59, 2 + var4, 44, 44, 16777215);
                  }
                }
                var7 = 65280;
                if (param1.field_I.field_a[var6] <= 0) {
                  var7 = 16711680;
                  og.field_f.b(od.field_c[var6].field_j, this.field_f + 65, 82 + var4, var7, -1);
                  og.field_f.a(bh.field_j, this.field_f + 313, 82 + var4, var7, -1);
                } else {
                  og.field_f.b(od.field_c[var6].field_j, 65 + this.field_f, 82 + var4, var7, -1);
                  if (param1.field_I.field_a[var6] < 50) {
                    og.field_f.a(hk.field_c + param1.field_I.field_a[var6], this.field_f + 313, var4 + 82, var7, -1);
                  }
                }
                if (var6 != 17) {
                  if (var6 != 5 &&
                    var6 != 11 &&
                    4 != var6 &&
                    var6 != 15) {
                    if (8 != var6 &&
                      var6 != 9 &&
                      var6 != 10) {
                      if (1 == var6) {
                        og.field_f.a(ab.field_e + 10 * od.field_c[var6].field_l, this.field_f + 319, 16 + var4, var7, -1);
                      } else {
                        og.field_f.a(ab.field_e + od.field_c[var6].field_l, this.field_f + 319, 16 + var4, var7, -1);
                      }
                    } else {
                      og.field_f.a(ab.field_e + od.field_c[var6].field_l * 3, 319 + this.field_f, 16 + var4, var7, -1);
                    }
                  } else {
                    og.field_f.a(ab.field_e + od.field_c[var6].field_l + im.field_a, 319 + this.field_f, 16 + var4, var7, -1);
                  }
                  if (od.field_c[var6].field_o > 1) {
                    og.field_f.a(lm.field_f + od.field_c[var6].field_o, 319 + this.field_f, 30 + var4, var7, -1);
                  }
                  if (var6 != 5 &&
                    11 != var6) {
                    var8 = od.field_c[var6].field_g[0];
                    if (8 == var6 ||
                      var6 == 9) {
                      var8 = var8 * 4 / 5;
                    }
                    if (var6 == 12 ||
                      var6 == 13) {
                      var8 = 3 * var8 / 4;
                    }
                    if (var6 == 14) {
                      var8 = var8 * 2 / 3;
                    }
                    og.field_f.a(wh.field_g + var8 + "%", 319 + this.field_f, var4 + 16 + 28, var7, -1);
                    if (0 < od.field_c[var6].field_b[2] &&
                      5 >= od.field_c[var6].field_b[2]) {
                      og.field_f.a(di.field_h[0], 319 + this.field_f, 16 + var4 + 42, var7, -1);
                    }
                    if (od.field_c[var6].field_b[2] > 5 &&
                      10 >= od.field_c[var6].field_b[2]) {
                      og.field_f.a(di.field_h[1], this.field_f + 319, 16 + (var4 + 42), var7, -1);
                    }
                    if (od.field_c[var6].field_b[2] > 10 &&
                      od.field_c[var6].field_b[2] <= 20) {
                      og.field_f.a(di.field_h[2], 319 + this.field_f, 16 + (var4 + 42), var7, -1);
                    }
                    if (od.field_c[var6].field_b[2] > 20) {
                      og.field_f.a(di.field_h[3], 319 + this.field_f, 16 + (var4 + 42), var7, -1);
                    }
                    if (0 == od.field_c[var6].field_b[2]) {
                      og.field_f.a(di.field_h[4], 319 + this.field_f, var4 + 58, var7, -1);
                    }
                  }
                } else {
                  og.field_f.a(of.field_n + 50, this.field_f + 319, 16 + var4, var7, -1);
                }
                var4 += 92;
              }
            }
          }
          for (var6 = sj.field_a.length - 1; var6 >= 0; var6--) {
            if (sj.field_a[var6].field_l &&
              param1.field_hb == 2) {
              boolean decompiledFrameRemainder2 = true;
              if (param1.field_I.field_d[var6] > 0) {
                if (jb.field_b > 84 &&
                  jb.field_b < 364 &&
                  57 + this.field_f <= ef.field_j &&
                  ef.field_j < this.field_f + (57 + e.field_g.field_r) &&
                  jb.field_b >= var4 &&
                  e.field_g.field_t + var4 > jb.field_b) {
                  e.field_g.c(57 + this.field_f, var4, 384);
                  param1.field_gb = -1 - var6;
                  if ((this.field_g != -param1.field_gb)) {
                    this.field_g = -param1.field_gb;
                    qd.$cfr$intArgs$a$e9dea5688aa5(77, 29);
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  e.field_g.b(this.field_f + 57, var4);
                }
              } else {
                e.field_g.c(57 + this.field_f, var4, 128);
              }
              l.i(this.field_f + 59, 2 + var4, this.field_f + 321, var4 + 66);
              kb.field_a[var6].a(0, 128, this.field_f + 190, 32 + (var4 + 2), (byte) 21);
              l.c(this.field_f + 57, 84, 323 + this.field_f, 364);
              if (param1.field_I.field_d[var6] > 50) {
                param1.field_I.field_d[var6] = 55;
              }
              if (sj.field_a[var6].field_e &&
                param1.field_Fb > 0 &&
                50 > param1.field_I.field_d[var6]) {
                qc.field_f[7].c(this.field_f + 59, var4 + 2, 120 + (int)(120.0 * Math.cos(mm.field_f)));
                var7 = 1;
                if (var6 == 1 &&
                  sj.field_a[2].field_l) {
                  var7 = 2;
                }
                if (1 == var6 &&
                  sj.field_a[3].field_l) {
                  var7 = 4;
                }
                if (var6 == 2 &&
                  sj.field_a[3].field_l) {
                  var7 = 2;
                }
                if (!(param1.field_Fb <= 1) ||
                  var7 > 1) {
                  var15 = Integer.toString(param1.field_Fb);
                  var8_ref_String = var15;
                  if (1 < var7) {
                    var8_ref_String = var15 + "*" + var7;
                  }
                  og.field_f.c(var8_ref_String, 90 + this.field_f, 8 + var4 + 32, 0, -1);
                  og.field_f.c(var8_ref_String, 88 + this.field_f, var4 + 32 + 8, 0, -1);
                  og.field_f.c(var8_ref_String, this.field_f + 89, 32 + (var4 + 9), 0, -1);
                  og.field_f.c(var8_ref_String, 89 + this.field_f, 7 + var4 + 32, 0, -1);
                  og.field_f.c(var8_ref_String, 89 + this.field_f, 8 + var4 + 32, 16777215, -1);
                }
                if (59 + this.field_f <= ef.field_j &&
                  ef.field_j < 103 + this.field_f &&
                  2 + var4 <= jb.field_b &&
                  jb.field_b < 44 + var4 + 2) {
                  param1.field_gb = -var6 - 1;
                  param1.field_yb = true;
                  l.e(this.field_f + 59, 2 + var4, 44, 44, 16777215);
                }
              }
              if (0 >= param1.field_I.field_d[var6]) {
                og.field_f.b(sj.field_a[var6].field_m, 65 + this.field_f, var4 + 82, 16711680, -1);
                og.field_f.a(bh.field_j, this.field_f + 313, 82 + var4, 16711680, -1);
                og.field_f.a(of.field_n + (sj.field_a[var6].field_g + sj.field_a[var6].field_d), this.field_f + 319, var4 + 16, 16711680, -1);
              } else {
                og.field_f.b(sj.field_a[var6].field_m, 65 + this.field_f, 82 + var4, 65280, -1);
                if (50 > param1.field_I.field_d[var6]) {
                  og.field_f.a(hk.field_c + param1.field_I.field_d[var6], this.field_f + 313, var4 + 82, 65280, -1);
                }
                og.field_f.a(of.field_n + (sj.field_a[var6].field_g + sj.field_a[var6].field_d), this.field_f + 319, 16 + var4, 65280, -1);
              }
              var4 += 92;
            }
          }
          l.c();
          var4 = var4 + param1.field_G;
          var4 -= 84;
          if (oh.field_f != 1) {
            param1.field_J = false;
          }
          boolean decompiledFrameRemainder1 = true;
          if (var4 > 280) {
            var6 = 78120 / var4;
            var7 = param1.field_G * (-var6 + 279) / (var4 - 280);
            jg.field_hb.a(this.field_f + 337, var7 + 73, jg.field_hb.field_r, var6);
            if ((!param1.field_J) &&
              (decompiledFrameRemainder1 = !(337 + this.field_f > ef.field_j))) {
              decompiledFrameRemainder1 = !(this.field_f + (337 + jg.field_hb.field_r) <= ef.field_j);
            }
            if ((decompiledFrameRemainder1) && (62 <= jb.field_b &&
              363 > jb.field_b &&
              oh.field_f == 1)) {
              var8 = var6 / 2 + 73;
              var9 = -(var6 / 2) + 352;
              if (param1.field_J &&
                param1.field_wb == null) {
                var9 = param1.field_rb;
                var8 = param1.field_eb;
                if (var8 > jb.field_b) {
                  param1.field_G = 0;
                } else {
                  if (var9 < jb.field_b) {
                    param1.field_G = -280 + var4;
                  } else {
                    param1.field_G = (var4 - 280) * (-var8 + jb.field_b) / (var9 - var8);
                  }
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (73 + var7 < jb.field_b &&
                  var7 + (73 + var6) > jb.field_b) {
                  param1.field_rb = var9 - var6 / 2 + (jb.field_b - var7) - 73;
                  param1.field_J = true;
                  param1.field_eb = -var7 + (-73 + var8) + (-(var6 / 2) + jb.field_b);
                } else {
                  if (param1.field_wb == null) {
                    if (var8 > jb.field_b) {
                      param1.field_G = 0;
                    } else {
                      if (var9 >= jb.field_b) {
                        param1.field_G = (var4 - 280) * (-var8 + jb.field_b) / (var9 - var8);
                      } else {
                        param1.field_G = var4 - 280;
                      }
                    }
                    param1.field_eb = var8;
                    param1.field_rb = var9;
                    param1.field_J = true;
                  }
                }
              }
            }
          } else {
            l.f(this.field_f + 333, 58, 19, 309, 0);
          }
          var6 = 4;
          if (var3_int > 0) {
            var6 = 8;
          }
          if (var3_int > 3) {
            var6 = 12;
          }
          if (var3_int > 12) {
            var6 = 0;
          }
          var7 = 0;
          for (var8 = 0; 12 > var8; var8++) {
            if (param1.field_nb[var8] != null) {
              if (param1.field_nb[param1.field_qb] == null) {
                param1.field_qb = var8;
              }
              var7++;
            }
          }
          if (var6 > var7) {
            var7 = var6;
          }
          if (var7 > 1) {
            var8 = 550 / (-1 + var7);
          } else {
            var8 = 90;
          }
          if (param0 > -93) {
            return;
          }
          if (var8 > 90) {
            var8 = 90;
          }
          for (var9 = var7 - 1; var9 >= 0; var9--) {
            var10 = var8;
            if (param1.field_qb == var9) {
              var10 = 90;
            }
            var11 = var8 * var9;
            var4 = 384;
            if (var9 > param1.field_qb) {
              var11 = var11 + (-var8 + 90);
            }
            if (param1.field_nb[var9] == null) {
              th.field_i.b(var10 + (var11 - th.field_i.field_r), -this.field_f + 370);
              var12 = (120 + (int)(Math.sin(mm.field_f) * 120.0)) * 65793;
              if (og.field_f.b(pj.field_v) <= -5 + var8) {
                og.field_f.b(pj.field_v, var11 + 5, -this.field_f + var4, var12, -1);
              } else {
                og.field_f.b(pd.field_e, 5 + var11, -this.field_f + var4, var12, -1);
              }
            } else {
              if (var9 != param1.field_qb) {
                th.field_i.b(-th.field_i.field_r + (var11 + var10), 370 - this.field_f);
                og.field_f.b(param1.field_nb[var9].a(-1426, -8 + var10), var11, -this.field_f + var4, 52224, -1);
              } else {
                field_c.b(var10 + var11 - field_c.field_r, -this.field_f + 370);
                og.field_f.b(param1.field_nb[var9].a(-1426, -8 + var10), var11, -this.field_f + var4, 65280, -1);
              }
            }
          }
          if (null != param1.field_nb[param1.field_qb]) {
            nf.field_g[param1.field_nb[param1.field_qb].field_d].b(10, -this.field_f + 9 + var4);
            kb.a(120, 24, -this.field_f + 630, param1.field_nb[param1.field_qb].b(1), -this.field_f + 362, 88, 65280);
            if (param1.field_nb[param1.field_qb].field_b != null) {
              var16 = cc.field_i[param1.field_nb[param1.field_qb].field_b.field_g];
              var9_ref_ci = var16;
              var10 = -(3 * var16.field_p / 4) + (-(3 * var16.field_r / 8) + 398);
              var11 = -(var16.field_v * 3 / 4) + 213 - 3 * var16.field_t / 8;
              var9_ref_ci.a(-this.field_f + var10, var11, 75, 150);
            }
            if (param1.field_nb[param1.field_qb].field_A != null) {
              var17 = cc.field_i[param1.field_nb[param1.field_qb].field_A.field_g];
              var9_ref_ci = var17;
              var10 = -(var17.field_p * 3 / 4) + (-(3 * var17.field_r / 8) + 593);
              var11 = 194 - var17.field_t * 3 / 8 - 3 * var17.field_v / 4;
              var9_ref_ci.a(-this.field_f + var10, var11, 75, 150);
              og.field_f.c(param1.field_nb[param1.field_qb].field_A.field_d + " / " + od.field_c[param1.field_nb[param1.field_qb].field_A.field_g].field_o, -this.field_f + 593, 264, 65280, -1);
            }
            if (null != param1.field_nb[param1.field_qb].field_m) {
              kb.field_a[param1.field_nb[param1.field_qb].field_m.field_f].a(-this.field_f + 453, 139, 87, 87);
            }
            if (null != param1.field_nb[param1.field_qb].field_i) {
              var18 = cc.field_i[param1.field_nb[param1.field_qb].field_i.field_g].d();
              var18.b();
              var10 = -(var18.field_p * 3 / 4) + (597 - 3 * var18.field_r / 8);
              var11 = -(var18.field_v * 3 / 4) - 3 * var18.field_t / 8 + 297;
              var18.a(-this.field_f + var10, var11, 150, 75);
              og.field_f.c(Integer.toString(param1.field_nb[param1.field_qb].field_i.field_d), 602 - this.field_f, 335, 65280, -1);
              if (!(7 >= param1.field_nb[param1.field_qb].field_i.field_d) ||
                !(param1.field_I.field_a[param1.field_nb[param1.field_qb].field_i.field_g] > 0)) {
                l.f(618 - this.field_f, 325, 6, 11, 6052956);
              }
            } else {
              l.f(582 - this.field_f, 325, 6, 11, 6052956);
              l.f(618 - this.field_f, 325, 6, 11, 6052956);
            }
            var9 = 171;
            var10 = 171;
            if (ph.field_o == 1) {
              var10 += 6;
              var9 += 23;
            }
            param1.field_nb[param1.field_qb].d((byte) 37);
            og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_e), var9, 406 - this.field_f, 16777215, -1);
            l.c(var9, 0, param1.field_nb[param1.field_qb].field_t * 3 + var9, 640);
            tg.field_e.f(var10, 416 - this.field_f, 16711680);
            l.c();
            og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9 + 1, -this.field_f + 426, 0, -1);
            og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9 - 1, 416 + (-this.field_f + 10), 0, -1);
            og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9, 10 + (-this.field_f + 416 + 1), 0, -1);
            og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9, 10 + (-this.field_f + 416 - 1), 0, -1);
            og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_t), var9, 10 + (416 - this.field_f), 16711680, -1);
            var11 = 65793 * (int)(Math.sin(mm.field_f) * 120.0) + 7895160;
            l.c(var9, 0, param1.field_nb[param1.field_qb].field_w * 3 + var9, 640);
            tg.field_e.f(var10, 432 - this.field_f, 255);
            if (param1.field_nb[param1.field_qb].field_w != param1.field_nb[param1.field_qb].field_s) {
              l.d(var9, 432 - this.field_f, param1.field_nb[param1.field_qb].field_s * 3, 9, var11, 192);
              l.d(3 * param1.field_nb[param1.field_qb].field_s + var9, 432 - this.field_f, 3 * (-param1.field_nb[param1.field_qb].field_s + param1.field_nb[param1.field_qb].field_w), 9, var11 & 16711680, 192);
              l.c();
              og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9 + 1, 10 + (432 - this.field_f), 0, -1);
              og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9 - 1, -this.field_f + 442, 0, -1);
              og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9, 442 - this.field_f + 1, 0, -1);
              og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9, 432 - this.field_f + 9, 0, -1);
              og.field_f.b(param1.field_nb[param1.field_qb].field_s + og.field_b, var9, 10 + (-this.field_f + 432), var11, -1);
            } else {
              l.c();
              og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9 + 1, 432 - this.field_f + 10, 0, -1);
              og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9 - 1, 10 - this.field_f + 432, 0, -1);
              og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9, 1 + (442 - this.field_f), 0, -1);
              og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9, 10 + (432 - (this.field_f + 1)), 0, -1);
              og.field_f.b(Integer.toString(param1.field_nb[param1.field_qb].field_s), var9, 432 - (this.field_f - 10), 8421631, -1);
            }
            l.c(var9, 0, param1.field_nb[param1.field_qb].field_u * 3 + var9, 640);
            tg.field_e.f(var10, 448 - this.field_f, 16776960);
            if (param1.field_nb[param1.field_qb].field_w != param1.field_nb[param1.field_qb].field_s) {
              l.d(var9, 448 - this.field_f, param1.field_nb[param1.field_qb].field_v * 3, 9, var11, 192);
              l.d(param1.field_nb[param1.field_qb].field_v * 3 + var9, -this.field_f + 448, (param1.field_nb[param1.field_qb].field_u - param1.field_nb[param1.field_qb].field_v) * 3, 9, 16711680 & var11, 192);
            }
            l.c();
            og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, 1 + var9, 448 - this.field_f + 10, 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, -1 + var9, -this.field_f + 448 + 10, 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, 458 - (this.field_f - 1), 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, -1 - this.field_f + 448 + 10, 0, -1);
            if (param1.field_nb[param1.field_qb].field_s == param1.field_nb[param1.field_qb].field_w) {
              og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, 10 + (-this.field_f + 448), 16776960, -1);
            } else {
              og.field_f.b(param1.field_nb[param1.field_qb].field_x + "/" + param1.field_nb[param1.field_qb].field_v, var9, 10 + (448 - this.field_f), var11, -1);
            }
            l.c(var9, 0, 3 * param1.field_nb[param1.field_qb].field_B + var9, 640);
            tg.field_e.f(var10, 464 - this.field_f, 16777215);
            l.c();
            og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", 1 + var9, 10 + (-this.field_f + 464), 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9 - 1, 10 + (464 - this.field_f), 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9, 10 + (-this.field_f + 464 + 1), 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9, -1 + (10 + (464 - this.field_f)), 0, -1);
            og.field_f.b(param1.field_nb[param1.field_qb].field_B + "%", var9, 474 - this.field_f, 16777215, -1);
          }
          l.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_403_0 = var3;
          stackIn_403_1 = new StringBuilder().append("vl.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_404_2 = "null";
          } else {
            stackIn_404_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_403_0), ((StringBuilder) (Object) stackIn_403_1).append(stackIn_404_2).append(')').toString());
        }
    }

    vl() {
        this.field_d = -1;
        this.field_g = -1;
        qd.$cfr$intArgs$a$e9dea5688aa5(94, 26);
        this.field_b = false;
        this.field_f = -356;
    }

    static {
        field_i = new jj();
        field_h = 0;
        field_e = new int[4];
    }
}
