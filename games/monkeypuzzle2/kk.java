/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kk {
    private le field_a;
    private int field_g;
    private le[] field_f;
    private boolean field_d;
    int field_e;
    static int field_b;
    static String field_h;
    private int field_i;
    private sg field_c;

    final static byte[] a(int param0, hb param1, byte[] param2, byte param3) {
        byte[] stackIn_3_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 != 99) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var4_int = param1.f(8, param0);
          if (var4_int == 0) {
            return null;
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new byte[var4_int];
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          var5 = param1.f(8, 3);
          var6 = (byte)param1.f(8, 8);
          if (var5 <= 0) {
            var7 = 0;
            while (var4_int > var7) {
              param2[var7] = (byte)var6;
              var7++;
              if (var8 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (!(var5 <= 0) ||
            var8 != 0)) {
            var7Lifetime1 = 0;
            while (var7Lifetime1 < var4_int) {
              stackIn_24_0 = (byte[]) (param2);
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_24_0[var7Lifetime1] = (byte)(var6 + param1.f(param3 - 91, var5));
              var7Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_24_0 = (byte[]) (param2);
          }
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("kk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(byte param0) {
        int discarded$0 = 0;
        int stackIn_23_0 = 0;
        vk stackIn_60_0 = null;
        boolean stackIn_61_1 = false;
        boolean stackIn_63_2;
        int stackIn_63_3;
        boolean stackIn_64_4 = false;
        vk stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        boolean stackIn_67_2 = false;
        boolean stackIn_70_3 = false;
        vk stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        int stackIn_75_2 = 0;
        boolean stackIn_76_3 = false;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        boolean stackIn_94_3 = false;
        int var2_int = 0;
        le var2 = null;
        int var3 = 0;
        vk var3_ref_vk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        ke.field_i.a(0, 0);
        var2_int = 0;
        do {
          if (480 <= var2_int) {
            df.field_q[bc.field_a].c(-(df.field_q[0].field_m >> 1) + 80, ne.field_b);
            break;
          }
          kj.field_F.c(-(kj.field_F.field_m >> 1) + 80, var2_int);
          var2_int = var2_int + kj.field_F.field_n;
        } while (var6 == 0);
        var2_int = 0;
        do {
          if (var2_int >= 480) {
            df.field_q[ob.field_r].f(-(df.field_q[0].field_m >> 1) + 560, dd.field_e);
            break;
          }
          kj.field_F.c(560 - (kj.field_F.field_m >> 1), var2_int);
          var2_int = var2_int + kj.field_F.field_n;
        } while (var6 == 0);
        var2_int = 0;
        L6: while (true) {
          if (var2_int < dk.field_j) {
            stackIn_23_0 = 0;
            if (var6 != 0) {
              break L6;
            }
            var3 = stackIn_23_0;
            while (var3 < 5) {
              ge.g(pf.a((byte) 25, 640), pf.a((byte) -100, 100), pf.a((byte) 19, 500), 9283525, 60);
              var3++;
            }
            ma.a(ve.field_x[var2_int][0] << 4, ve.field_x[var2_int][1] << 4, 128, 40000);
            var2_int++;
            continue L6;
          }
          stackIn_23_0 = param0;
          break;
        }
        if (stackIn_23_0 < 119) {
          discarded$0 = this.a((byte) 24, -74);
        }
        if (this.field_g != 8 &&
          10 != this.field_g) {
          if (this.field_g == 9) {
            var2 = kb.field_a[2];
          } else if (this.field_g != 4) {
            var2 = kb.field_a[this.field_g];
          } else {
            var2 = kb.field_a[3];
          }
        } else {
          var2 = kb.field_a[5];
        }
        if (!ad.a(false) &&
          !ek.a((byte) -125) &&
          !this.field_d &&
          20 >= this.field_i ||
          this.field_d &&
          this.field_i >= 0) {
          var3Lifetime1 = var2.field_n;
          var4 = this.field_i * 255 / 20;
          if (var4 > 255) {
            var4 = 255;
          }
          var5 = var4 - 40;
          if (0 > var5) {
            var5 = 0;
          }
          ma.a(var2, 320 - (var2.field_m >> 1), 0, var3Lifetime1, var4, var5);
          if (var6 != 0) {
            var2.c(-(var2.field_m >> 1) + 320, 0);
          }
        } else {
          var2.c(-(var2.field_m >> 1) + 320, 0);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_g != 2) {
          if (this.field_g == 3) {
            this.a((byte) 1, true);
            decompiledFrameRemainder0 = (var6 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_g == 4) {
              this.a((byte) 1, false);
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_g != 5) {
                if (6 != this.field_g &&
                  this.field_g != 10) {
                  if (this.field_g == 7) {
                    lb.a(120, 400, (byte) -119, wc.field_e, 180, 185);
                    var3_ref_vk = pl.field_e;
                    var4Lifetime1 = var3_ref_vk.field_C + 200;
                    var5Lifetime1 = 4 + (var3_ref_vk.field_j + var3_ref_vk.field_D);
                    var3_ref_vk.a(f.field_f, 320, var4Lifetime1, 1, -1);
                    stackIn_60_0 = var3_ref_vk;
                    stackIn_61_1 = (fg.field_b != 0);
                    stackIn_63_2 = false;
                    stackIn_63_3 = 22890;
                    stackIn_64_4 = (hf.field_f.field_A != 0);
                    ((vk) (Object) stackIn_60_0).a(wa.a(stackIn_61_1, stackIn_63_2, stackIn_63_3, stackIn_64_4), 320, var4Lifetime1 + var5Lifetime1, 1, -1);
                    stackIn_66_0 = var3_ref_vk;
                    stackIn_66_1 = -88;
                    stackIn_67_2 = (0 != fg.field_b);
                    stackIn_70_3 = (hf.field_f.field_A != 0);
                    ((vk) (Object) stackIn_66_0).a(lk.a(stackIn_66_1, stackIn_67_2, stackIn_70_3, false), 320, 20 + (var4Lifetime1 + var5Lifetime1 * 3), 1, -1);
                    stackIn_72_0 = var3_ref_vk;
                    stackIn_73_1 = (hf.field_f.field_A != 0);
                    stackIn_75_2 = 122;
                    stackIn_76_3 = (fg.field_b != 0);
                    ((vk) (Object) stackIn_72_0).a(ma.$cfr$intArgs$a$feb7e63b59d8(stackIn_73_1, stackIn_75_2, stackIn_76_3, false), 320, 20 + (var5Lifetime1 * 4 + var4Lifetime1 + 40), 1, -1);
                    decompiledFrameRemainder0 = (var6 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (this.field_g == 9) {
                      this.c(119);
                      decompiledFrameRemainder0 = (var6 != 0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (this.field_g == 8)) {
                      ri.a((byte) -122, this.field_i, false);
                      if (var6 != 0) {
                        ri.a((byte) -101, this.field_i, true);
                        ri.a((byte) -100, this.field_i, false);
                        this.b(69);
                      }
                    }
                  }
                } else {
                  ri.a((byte) -101, this.field_i, true);
                  if (var6 != 0) {
                    ri.a((byte) -100, this.field_i, false);
                    this.b(69);
                  }
                }
              } else {
                ri.a((byte) -100, this.field_i, false);
                if (var6 != 0) {
                  this.b(69);
                }
              }
            }
          }
        } else {
          this.b(69);
        }
        var3Lifetime2 = 0;
        while (true) {
          if (!(this.field_c.field_i > var3Lifetime2)) {
            if (!ad.a(false)) {
              return;
            }
            var3Lifetime2 = hl.field_a;
            break;
          }
          if (var6 == 0) {
            stackIn_93_1 = -1;
            stackIn_93_2 = var3Lifetime2;
            stackIn_94_3 = (this.field_c.field_a == var3Lifetime2);
            this.a(stackIn_93_1, stackIn_93_2, stackIn_94_3);
            var3Lifetime2++;
            continue;
          }
          break;
        }
        if (32 < var3Lifetime2) {
          var3Lifetime2 = 32;
        }
        var4Lifetime2 = hl.field_a * 3;
        if (var4Lifetime2 > 128) {
          var4Lifetime2 = 128;
        }
        this.a(var3Lifetime2, (byte) 110, 0, var4Lifetime2, 0, 0, 0, 0);
        return;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != -104) {
          field_h = (String) null;
        }
    }

    private final void a(byte param0, boolean param1) {
        String stackIn_12_0 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int var3;
        int var4;
        vk var5;
        int var6;
        int var7_int;
        String var7;
        int var8;
        int var9;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_a.e();
        var3 = 380;
        var4 = 263;
        ge.d(3, 3, var3 - 6, -6 + var4, 16249775);
        lb.a(0, var3, (byte) -124, wc.field_e, 0, var4);
        var5 = pl.field_e;
        var6 = 0;
        var7_int = si.field_r / 8;
        if (param0 != 1) {
          return;
        }
        while (true) {
          if (var6 >= 8) {
            if (param1) {
              var5.a(mk.field_j, 15, 53, -30 + var3, var4, 1, -1, 0, 0, 14);
            } else {
              var6 = hb.a(false);
              if (qb.field_b) {
                stackIn_12_0 = gg.a(new String[]{Integer.toString(var6), Integer.toString(5)}, jg.field_kb, true);
              } else {
                stackIn_12_0 = lg.field_I;
              }
              var7 = stackIn_12_0;
              var5.a(gg.a(new String[]{var7}, je.field_a, true), 14, 53, var3 - 30, var4, 1, -1, 0, 0, 14);
            }
            ac.field_a.a((byte) 118);
            var6 = this.field_i * var4 / 20;
            stackIn_15_0 = ~var6;
            stackIn_15_1 = ~var4;
            break;
          }
          var8 = 0;
          stackIn_15_0 = -33;
          stackIn_15_1 = ~(si.field_r + var7_int * 6 & 63);
          if (var9 == 0) {
            if (stackIn_15_0 <= stackIn_15_1) {
              var8 = var7_int % 4;
            }
            nh.field_f[0][var6 % 5][var8].c(-160 + 40 * var6 + (var3 >> 1), 15);
            var6++;
            var7_int++;
            continue;
          }
          break;
        }
        if (stackIn_15_0 < stackIn_15_1) {
          var6 = var4;
        }
        this.field_a.b(130, (-var6 + var4 >> 1) + 104, var3, var6);
        return;
    }

    private final int a(int param0, byte param1) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        if (2 != this.field_g) {
          if ((3 == this.field_g ||
            this.field_g == 4) &&
            param0 >= 2) {
            var3 = b.field_j[this.field_g][param0];
            if (19 == var3) {
              return 30 + (this.field_f[param0].field_m + fl.field_a[this.field_g]);
            }
            decompiledFrameRemainder0 = (var3 == 18);
            if (decompiledFrameRemainder0) {
              return fl.field_a[this.field_g] - 10 + (-this.field_f[param0].field_m - 20);
            }
          }
          if (decompiledFrameRemainder0) {
            return fl.field_a[this.field_g];
          }
        }
        if (param1 != 52) {
          return -100;
        }
        if (3 > param0) {
          return fl.field_a[this.field_g] + (20 + this.field_f[param0].field_m) * param0;
        }
        return 20 + this.field_f[param0].field_m + fl.field_a[this.field_g];
    }

    final void a(boolean param0, boolean param1) {
        if (param1) {
          this.b((byte) -56);
        }
        this.field_c.a((byte) 60, this.a(-6, p.field_a, ei.field_a), param0);
    }

    private final void b(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        vk var4;
        de var5;
        String var6;
        String[] var7_ref_String__;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Throwable var15;
        int[] var19;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (s.field_S == null) {
          s.field_S = o.a(41, 10, 3, 1, -114);
        }
        if (param0 < 39) {
          var15 = (Throwable) null;
          kk.a((String) null, (byte) -126, (Throwable) null);
        }
        L2: {
          this.field_a.e();
          var2 = 380;
          var3 = 275;
          ge.d(3, 3, var2 - 6, var3 - 6, 16249775);
          lb.a(0, var2, (byte) -12, wc.field_e, 0, var3);
          sb.field_r.a(bg.field_B[ef.field_b], var2 >> 1, 30, 9330743, -1);
          var4 = pl.field_e;
          var5 = s.field_S;
          if (var5.field_l) {
            if (var5.field_g == null) {
              var6 = re.field_b;
              if (var14 == 0) {
                break L2;
              }
            }
            var6 = qc.field_O;
            var7_ref_String__ = var5.field_g[ef.field_b];
            var19 = var5.field_i[ef.field_b];
            var9 = ti.a(0, var5, ef.field_b, pg.field_b);
            var10 = var4.field_C + 40;
            var11 = 0;
            L6: while (true) {
              if (var11 < 10) {
                stackIn_23_0 = ~(1 & var11);
                stackIn_23_1 = -1;
                if (var14 == 0) {
                  if (stackIn_23_0 == stackIn_23_1) {
                    ge.c(13, -2 - var4.field_C + var10, 354, 18, 12303291, 80);
                  } else {
                    ge.c(13, -2 + (-var4.field_C + var10), 354, 18, 14540253, 40);
                  }
                  if (null != var7_ref_String__[var11]) {
                    var12 = 1;
                    var13 = var19[var11];
                    if (~var9 == ~var11) {
                      var12 = 5683782;
                    }
                    var4.c(var11 + 1 + ". ", 30, var10, var12, -1);
                    var4.b(var7_ref_String__[var11], 30, var10, var12, -1);
                    var4.c(Integer.toString(var13), 360, var10, var12, -1);
                    var6 = "";
                  }
                  var10 += 18;
                  var11++;
                  continue;
                }
              } else {
                if (hf.field_f == null) {
                  break L6;
                }
                stackIn_23_0 = var9;
                stackIn_23_1 = -1;
              }
              if (stackIn_23_0 == stackIn_23_1 &&
                0 != hf.field_f.field_A) {
                var4.b(cl.field_e, 30, var10, 5683782, -1);
                var4.c(Integer.toString(hf.field_f.field_A), 360, var10, 5683782, -1);
              }
              break;
            }
            if (var14 != 0) {
              var6 = eg.field_h;
            }
          } else {
            var6 = eg.field_h;
          }
        }
        pl.field_e.a(nc.field_c, 30, var3 - 37, -60 + var2, 40, 1, -1, 1, 0, 12);
        var7 = 137;
        sb.field_r.a(var6, var2 / 2, var7, 9330743, -1);
        ac.field_a.a((byte) 116);
        var8 = var3 * this.field_i / 20;
        if (var8 > var3) {
          var8 = var3;
        }
        this.field_a.b(130, (-var8 + var3 >> 1) + 90, var2, var8);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = -53 / ((param0 - 15) / 33);
        if (this.field_d) {
          this.field_i = this.field_i - 1;
          if (this.field_i <= 0) {
            if (-1 == this.field_e) {
              ej.field_b = 50;
              l.field_f = this.field_e;
              if (var4 == 0) {
                return;
              }
            }
            if (this.field_g == 5 ||
              this.field_g == 6 ||
              this.field_g == 8) {
              ee.field_F = -1;
            }
            pg.field_d[this.field_e].c((byte) -122);
            if (this.field_e == 2) {
              s.field_S = null;
            }
            var3 = qh.field_b;
            if (this.field_g != 1 ||
              this.field_e == 6 ||
              this.field_e == 10 ||
              2 == this.field_e) {
              if (1 == var3) {
                vl.field_g = 1;
              }
              if ((1 != var3 ||
                var4 != 0) &&
                (var3 == 0)) {
                vl.field_g = 0;
                if (var4 != 0) {
                  vl.field_g = this.field_g;
                }
              }} else {
              vl.field_g = this.field_g;
            }
            l.field_f = this.field_e;
            qh.field_b = this.field_e;
          }
          return;
        }
        this.field_i = this.field_i + 1;
        if (20 > this.field_i) {
          return;
        }
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!ba.a(-1)))) {
          if (13 == oa.field_H &&
            this.field_g != 0) {
            if (this.field_g == 7) {
              continue;
            }
            this.field_e = vl.field_g;
            if (1 == this.field_g) {
              this.field_e = -1;
              h.a(0, true);
            }
            if (-1 == this.field_e) {
              continue;
            }
            pg.field_d[this.field_e].c((byte) -89);
            if (var4 == 0) {
              continue;
            }
          }
          if (this.field_g == 2 ||
            this.field_g == 3 ||
            this.field_g == 4) {
            if (this.field_g != 2) {
              if (3 != this.field_g) {
                if (this.field_g == 4) {
                  this.field_c.b((byte) 119);
                  this.field_c.a(this.d(122), 83);
                  if (var4 != 0) {
                    this.field_c.b((byte) 113);
                    this.field_c.a(this.d(122), -58);
                    this.field_c.b((byte) 107);
                    this.field_c.a(this.a(-99, 3), -117);
                    this.field_c.e(0);
                  }
                }
              } else {
                this.field_c.b((byte) 113);
                this.field_c.a(this.d(122), -58);
                if (var4 != 0) {
                  this.field_c.b((byte) 107);
                  this.field_c.a(this.a(-99, 3), -117);
                  this.field_c.e(0);
                }
              }
            } else {
              this.field_c.b((byte) 107);
              this.field_c.a(this.a(-99, 3), -117);
              if (var4 != 0) {
                this.field_c.e(0);
              }
            }
          } else {
            this.field_c.e(0);
          }
          if (this.field_c.field_a == -1) {
            continue;
          }
          this.a(this.field_c.field_a, false, 77);
          if (var4 == 0) {
            continue;
          }
          break;
        }
        if ((decompiledNaturalLoopExit0) &&
          (~this.field_e == ~this.field_g)) {
          this.field_c.a(this.a(-6, p.field_a, ei.field_a), this.a(-6, ab.field_e, qg.field_c), true);
          if (this.field_c.field_a != -1) {
            this.a(this.field_c.field_a, true, 59);
          }
          if (this.field_e != qh.field_b) {
            this.field_i = 20;
            if (this.field_e != -1) {
              pg.field_d[this.field_e].a(true, false);
            }
            this.field_d = true;
          }
          return;
        }
        if (this.field_e != -1) {
          pg.field_d[this.field_e].a(false, false);
        }
        this.field_d = true;
        this.field_i = 20;
        return;
    }

    final static void a(String param0, byte param1, Throwable param2) {
        try {
          md stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          ic var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = id.a(param2, (byte) 37);
            }
            if (param0 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            ke.a(var3, (byte) 80);
            var7 = eg.a("%3a", 4, ":", var3);
            var8 = eg.a("%40", 4, "@", var7);
            var9 = eg.a("%26", 4, "&", var8);
            var10 = eg.a("%23", 4, "#", var9);
            if (ni.field_e == null) {
              return;
            }
            stackIn_14_0 = fk.field_c;
            stackIn_14_1 = 101;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = ni.field_e.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(kd.field_c).append("&u=");
            if (null == ck.field_f) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + cc.field_b;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = ck.field_f;
            }
            var4 = ((md) (Object) stackIn_14_0).a((byte) stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(md.field_l).append("&v2=").append(md.field_m).append("&e=").append(var10).toString()));
            L6: while (true) {
              if (0 == var4.field_g) {
                em.a(1L, false);
                if (var6 == 0) {
                  continue;
                }
              } else {
                if (var4.field_g != 1) {
                  break L6;
                }
              }
              var5 = (DataInputStream) (var4.field_b);
              var5.read();
              var5.close();
              break;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
          if (param1 < 56) {
            field_h = (String) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        String[] array$0 = null;
        String[] stackIn_6_0 = null;
        String[] stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        String stackIn_7_3 = null;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        vk var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var11Lifetime1;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = this.a((byte) -128, param1);
        var5 = this.a(param1, (byte) 52);
        var6 = b.field_j[this.field_g][param1];
        var7 = ma.field_a[var6];
        if (var7 == null) {
          var7 = "ERROR: missing text";
        }
        if (var6 == 16) {
          array$0 = new String[1];
          stackIn_6_0 = array$0;
          stackIn_6_1 = array$0;
          stackIn_6_2 = 0;
          if (qb.field_b) {
            stackIn_7_3 = ie.field_d;
          } else {
            stackIn_7_3 = qg.field_b;
          }
          stackIn_6_1[stackIn_6_2] = stackIn_7_3;
          var7 = gg.a(stackIn_6_0, var7, true);
        }
        if ((var6 != 16 || var14 != 0) && (var6 == 5 &&
          this.field_g == 2)) {
          var7 = pl.field_c;
        }
        var8 = this.field_f[param1].field_m;
        if (param0 != -1) {
          return;
        }
        this.field_f[param1].e();
        stackIn_17_0 = (param2) ? 5683782 : 1;
        var9 = stackIn_17_0;
        if (this.field_g != 7) {
          lb.a(0, var8, (byte) -33, wc.field_e, 0, 40);
        }
        var10 = sb.field_r;
        if (var6 == 11 ||
          var6 == 12) {
          var11 = lh.field_b + 137;
          var12 = -var11 + var8 >> 1;
          var12 = var12 + (lh.field_b + 13);
          var10.c(var7, var12, var10.field_C, var9, -1);
          sd.field_f.c(var12, -6 + mc.field_b[this.field_g] / 2);
          if (var6 == 11) {
            stackIn_25_0 = re.field_e;
          } else {
            stackIn_25_0 = ol.field_e;
          }
          var13 = stackIn_25_0;
          de.field_f.c(146 * var13 / 256 - 2 + var12, 14);
        }
        if (var6 != 11 &&
          var6 != 12 || var14 != 0) {
          var10.a(var7, var8 >> 1, var10.field_C, var9, -1);
        }
        ac.field_a.a((byte) 114);
        var11Lifetime1 = 40 * this.field_i / 20;
        if (var11Lifetime1 > 40 ||
          ad.a(false)) {
          var11Lifetime1 = 40;
        }
        this.field_f[param1].b(var5, var4 + (40 - var11Lifetime1 >> 1), var8, var11Lifetime1);
        return;
    }

    private final int a(int param0, boolean param1) {
        if (!param1) {
          return -16;
        }
        return 40;
    }

    private final void c(int param0) {
        this.field_a.e();
        int var2 = 380;
        int var3 = 275;
        ge.d(3, 3, -6 + var2, -6 + var3, 16249775);
        lb.a(0, var2, (byte) 64, wc.field_e, 0, var3);
        int var5 = 86 % ((53 - param0) / 61);
        int var4 = 90;
        sb.field_r.a(el.field_c, 20, var4, -40 + var2, 200, 9330743, -1, 1, 0, 0);
        ac.field_a.a((byte) 127);
        int var6 = this.field_i * var3 / 20;
        if (var3 < var6) {
          var6 = var3;
        }
        this.field_a.b(130, 90 + (var3 - var6 >> 1), var2, var6);
    }

    private final int d(int param0) {
        int var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 93) {
          this.a(121, true, 108);
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = this.field_c.field_a;
        if (!this.field_c.a((byte) 10) &&
          oa.field_H == 96) {
          this.field_c.field_b = false;
          if (var2 < 0) {
            var2 = 0;
            decompiledFrameRemainder0 = (var3 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (var2 != 1) {
              if (var2 != 0) {
                var2 = 1;
                if (var3 != 0) {
                  var2 = 2;
                }
              }
            } else {
              var2 = 2;
            }
          }
        }
        if (!this.field_c.a((byte) 10) &&
          oa.field_H == 97) {
          this.field_c.field_b = false;
          if (0 <= var2) {
            if (1 != var2) {
              if (0 != var2) {
                var2 = 1;
                if (var3 != 0) {
                  var2 = 2;
                  var2 = 0;
                }
              }
            } else {
              var2 = 2;
              if (var3 != 0) {
                var2 = 0;
              }
            }
          } else {
            var2 = 0;
          }
        }
        L7: {
          if (!this.field_c.a((byte) 10) &&
            oa.field_H == 98) {
            this.field_c.field_b = false;
            if (var2 < 0) {
              var2 = 2;
              if (var3 == 0) {
                break L7;
              }
            }
            if (var2 < 2) {
              if (var2 == 0) {
                var2 = 1;
                if (var3 != 0) {
                  var2--;
                }
              } else {
                var2--;
              }
            }
          }
        }
        if (!this.field_c.a((byte) 10) &&
          oa.field_H == 99) {
          this.field_c.field_b = false;
          if (var2 != -1) {
            if (var2 >= 1) {
              if (var2 == 1) {
                var2 = 0;
                if (var3 != 0) {
                  var2++;
                  var2 = 2;
                }
              }
            } else {
              var2++;
              if (var3 != 0) {
                var2 = 2;
              }
            }
          } else {
            var2 = 2;
          }
        }
        return var2;
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -6) {
          return 122;
        }
        var4 = 0;
        while (b.field_j[this.field_g].length > var4) {
          var5 = this.a((byte) -128, var4);
          stackIn_12_0 = this.a(var4, (byte) 52);
          if (var6 != 0) {
            return stackIn_12_0;
          }
          if (stackIn_12_0 <= param2 &&
            param2 < this.b(-6162, var4) &&
            param1 >= var5 &&
            param1 < this.a(var4, true) + var5) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    private final void a(int param0, boolean param1, int param2) {
        int fieldTemp$0 = 0;
        boolean stackIn_61_0 = false;
        boolean stackIn_201_0 = false;
        int var4;
        int var5;
        String[] var5_ref_String__;
        int var6;
        int var7;
        int var8;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_c.c((byte) -104)) {
          cj.a((byte) -47, ke.field_h[0]);
        }
        if (param2 < 15) {
          field_b = 52;
        }
        boolean decompiledFrameRemainder0 = true;
        var4 = b.field_j[this.field_g][param0];
        var5 = var4;
        if (var5 == 0) {
          if (this.field_c.g(0)) {
            boolean decompiledFrameRemainder1 = true;
            if (!qb.field_b) {
              if (ok.a(false) &&
                lg.field_w == 0) {
                qb.field_b = true;
                decompiledFrameRemainder1 = (var8 != 0);
              }
              if ((decompiledFrameRemainder1) &&
                (s.field_S != null)) {
                if (!s.field_S.field_l) {
                  s.field_S = null;
                  lg.field_w = lg.field_w + 1;
                  pg.field_b = null;
                  hf.field_f = new hj();
                  this.field_e = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (null != s.field_S.field_g) {
                    var5_ref_String__ = s.field_S.field_g[1];
                    stackIn_61_0 = (null == var5_ref_String__[0]);
                    qb.field_b = stackIn_61_0;
                  }
                }
              }
            }
            if (decompiledFrameRemainder0) {
              s.field_S = null;
              lg.field_w = lg.field_w + 1;
              pg.field_b = null;
              hf.field_f = new hj();
              this.field_e = -1;
            }
          }
        } else {
          switch ((var8 == 0
            || var5 == 3
            || var5 == 7
            || var5 == 8
            || var5 == 9
            || var5 == 10
            || var5 == 11
            || var5 == 13
            || var5 == 16
            || var5 == 19
            ) ? var5 : -1) {
            case 1:
              if (!this.field_c.g(0)) {
                break;
              }
              h.a(0, true);
              this.field_e = -1;
              if (var8 == 0) {
                break;
              }
            case 15:
              if (this.field_c.g(0)) {
                kg.field_c = 0;
              }
            case 5:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = 0;
              if (var8 == 0) {
                break;
              }
            case 13:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = 5;
              if (!ok.a(false)) {
                break;
              }
              this.field_e = 8;
              if (var8 == 0) {
                break;
              }
            case 3:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = 3;
              if (var8 == 0) {
                break;
              }
            case 2:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = 2;
              if (!ok.a(false)) {
                break;
              }
              this.field_e = 9;
              if (var8 == 0) {
                break;
              }
            case 11:
              if (this.field_c.c(102)) {
                cj.a((byte) -37, ke.field_h[0]);
                qb.a(256, 0);
              }
              if (this.field_c.b(-29996)) {
                cj.a((byte) 102, ke.field_h[0]);
                qb.a(256, 256);
              }
              if (this.field_c.a((byte) 10)) {
                var5 = lh.field_b + 137;
                var6 = (-var5 + (this.a(param0, (byte) 52) + this.b(-6162, param0)) >> 1) - (-lh.field_b - 30);
                var7 = ((-var6 + ei.field_a) * 256 + 4608) / 146;
                if (var7 <= 0) {
                  qb.a(256, 0);
                  if (var8 != 0) {
                    if (var7 >= 256) {
                      qb.a(256, 256);
                      qb.a(256, var7);
                    } else {
                      qb.a(256, var7);
                    }
                  }
                } else {
                  if (var7 >= 256) {
                    qb.a(256, 256);
                    if (var8 != 0) {
                      qb.a(256, var7);
                    }
                  } else {
                    qb.a(256, var7);
                  }
                }
                fieldTemp$0 = we.field_j + 1;
                we.field_j = we.field_j + 1;
                if (fieldTemp$0 > 25) {
                  we.field_j = 0;
                  cj.a((byte) 109, ke.field_h[0]);
                }
              }
              if (this.field_c.f(0)) {
                cj.a((byte) -126, ke.field_h[0]);
                jc.b(-42);
              }
              if (!this.field_c.d(25149)) {
                break;
              }
              cj.a((byte) -18, ke.field_h[0]);
              wc.a(-17076);
              if (var8 == 0) {
                break;
              }
            case 12:
              if (this.field_c.c(102)) {
                w.a(-1, 0);
              }
              if (this.field_c.b(-29996)) {
                w.a(-1, 256);
              }
              {
                if (this.field_c.a((byte) 10)) {
                  var5 = lh.field_b + 128 + 9;
                  var6 = 30 + (this.a(param0, (byte) 52) - (-this.b(-6162, param0) + var5) >> 1) + lh.field_b;
                  var7 = 256 * (ei.field_a - (var6 - 18)) / 146;
                  if (var7 <= 0) {
                    w.a(-1, 0);
                    if (var8 != 0) {
                      if (var7 >= 256) {
                        w.a(-1, 256);
                        w.a(-1, var7);
                      } else {
                        w.a(-1, var7);
                      }
                    }
                  } else {
                    if (var7 >= 256) {
                      w.a(-1, 256);
                      if (var8 != 0) {
                        w.a(-1, var7);
                      }
                    } else {
                      w.a(-1, var7);
                    }
                  }
                }
              }
              if (this.field_c.f(0)) {
                cj.a((byte) 103, ke.field_h[0]);
                vg.a(124);
              }
              if (!this.field_c.d(25149)) {
                break;
              }
              cj.a((byte) -51, ke.field_h[0]);
              fl.a(-225);
              if (var8 == 0) {
                break;
              }
            case 4:
              if (!this.field_c.g(0)) {
                break;
              }
              hl.field_a = 0;
              if (null != ba.field_f) {
                rb.h(3591);
                if (var8 == 0) {
                  break;
                }
              }
              ue.a((byte) 122, param1);
              if (var8 == 0) {
                break;
              }
            case 17:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = vl.field_g;
              if (var8 == 0) {
                break;
              }
            case 6:
              if (!this.field_c.g(0)) {
                break;
              }
              if (hf.field_f.field_I > 0) {
                hf.field_f.field_A = hf.field_f.field_A + (10000 + hf.field_f.field_I);
                var5 = 10000 + hf.field_f.field_I;
                var6 = ej.field_b % 3;
                if (var6 != 0) {
                  if (var6 != 1) {
                    var7 = var5 / 3;
                    cl.field_d = cl.field_d + var7;
                    nj.field_b = nj.field_b - (-var7 + var5);
                    if (var8 != 0) {
                      nj.field_b = nj.field_b - var5;
                      cl.field_d = cl.field_d + var5;
                    }
                  } else {
                    nj.field_b = nj.field_b - var5;
                    if (var8 != 0) {
                      cl.field_d = cl.field_d + var5;
                    }
                  }
                } else {
                  cl.field_d = cl.field_d + var5;
                }
                hf.field_f.a(-19921);
                hf.field_f.field_I = -1;
              }
              L53: {
                if (ok.a(false)) {
                  if (hf.field_f.field_A <= 0 &&
                    0 >= fg.field_b) {
                    this.field_e = 0;
                    if (var8 == 0) {
                      break L53;
                    }
                  }
                  this.field_e = 7;
                  if (var8 == 0) {
                    break L53;
                  }
                }
                hf.field_f.c((byte) -108);
                s.field_S = null;
                if (fg.field_b != 0) {
                  if (0 >= hf.field_f.field_A) {
                    this.field_e = 10;
                    if (var8 == 0) {
                      break L53;
                    }
                  }
                  this.field_e = 6;
                  if (var8 != 0) {
                    if (hf.field_f.field_A > 0) {
                      this.field_e = 2;
                      this.field_e = 0;
                    } else {
                      this.field_e = 0;
                    }
                  }
                } else {
                  if (hf.field_f.field_A > 0) {
                    this.field_e = 2;
                    if (var8 != 0) {
                      this.field_e = 0;
                    }
                  } else {
                    this.field_e = 0;
                  }
                }
              }
              bl.a(50, uh.field_e);
              if (var8 == 0) {
                break;
              }
            case 7:
              if (!this.field_c.g(0)) {
                break;
              }
              ef.field_b = 0;
              if (var8 == 0) {
                break;
              }
            case 8:
              if (!this.field_c.g(0)) {
                break;
              }
              ef.field_b = 1;
              if (var8 == 0) {
                break;
              }
            case 9:
              if (!this.field_c.g(0)) {
                break;
              }
              ef.field_b = 2;
              if (var8 == 0) {
                break;
              }
            case 18:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = 3;
              if (var8 == 0) {
                break;
              }
            case 19:
              if (!this.field_c.g(0)) {
                break;
              }
              this.field_e = 4;
              if (var8 == 0) {
                break;
              }
            case 14:
              if (!this.field_c.g(0)) {
                break;
              }
              if (8 == this.field_g) {
                gj.a(0, 8, 5);
                if (var8 == 0) {
                  break;
                }
              }
              if (7 == this.field_g) {
                if (fg.field_b > 0) {
                  if (hf.field_f.field_A <= 0) {
                    var5 = 10;
                    if (var8 != 0) {
                      var5 = 6;
                      var5 = 2;
                    }
                  } else {
                    var5 = 6;
                    if (var8 != 0) {
                      var5 = 2;
                    }
                  }
                } else {
                  var5 = 2;
                }
                gj.a(0, 7, var5);
                if (var8 == 0) {
                  break;
                }
              }
              if (this.field_g != 9) {
                break;
              }
              gj.a(0, 9, 2);
              if (var8 == 0) {
                break;
              }
            case 10:
              if (!this.field_c.g(0)) {
                break;
              }
              if (ba.field_f != null) {
                rb.h(3591);
              }
              hd.a(true, ii.a(false));
              if (var8 == 0) {
                break;
              }
            case 16:
              if (this.field_c.g(0)) {
                tl.a(-32663, false);
                stackIn_201_0 = !(qb.field_b);
                qb.field_b = stackIn_201_0;
              }
              break;
            default:
              break;
          }
        }

    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -99) {
          this.field_d = true;
        }
        var3 = this.field_c.field_a;
        if (!this.field_c.a((byte) 10) &&
          oa.field_H == 96) {
          if (var3 >= 0) {
            if (0 == var3 % param1) {
              var3 = var3 + param1;
              if (var4 != 0) {
                var3 = param1;
              }
            }
          } else {
            var3 = param1;
          }
          if (var3 > this.field_c.field_i) {
            var3 = this.field_c.field_i;
          }
          this.field_c.field_b = false;
          var3--;
        }
        if (!this.field_c.a((byte) 10) &&
          97 == oa.field_H) {
          if (var3 < 0) {
            var3 = 0;
            if (var4 != 0) {
              var3++;
              if (var3 % param1 == 0) {
                var3 = var3 - param1;
              }
              if (this.field_c.field_i <= var3) {
                var3 = var3 - this.field_c.field_i % param1;
              }
            }
          } else {
            var3++;
            if (var3 % param1 == 0) {
              var3 = var3 - param1;
            }
            if (this.field_c.field_i <= var3) {
              var3 = var3 - this.field_c.field_i % param1;
            }
          }
          this.field_c.field_b = false;
        }
        if (!this.field_c.a((byte) 10) &&
          oa.field_H == 98) {
          if (param1 <= var3) {
            var3 = 1;
            if (var4 != 0) {
              var3 = var3 - param1;
            }
          } else {
            var3 = var3 - param1;
          }
          this.field_c.field_b = false;
          if (var3 < 0) {
            var3 = 3;
          }
        }
        if (!this.field_c.a((byte) 10) &&
          oa.field_H == 99) {
          var3 = var3 + param1;
          if (var3 >= this.field_c.field_i) {
            if ((this.field_c.field_i + this.field_c.field_i % param1) < var3) {
              var3 = 1;
              if (var4 != 0) {
                var3 = 3;
              }
            } else {
              var3 = 3;
            }
          }
          this.field_c.field_b = false;
        }
        return var3;
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        int var10;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        var9 = 101 / ((58 - param1) / 33);
        param4 = ge.field_i.length - 1;
        while (param4 >= 0) {
          param5 = ge.field_i[param4];
          param7 = 255 & param5;
          param2 = 255 & param5 >> 16;
          param6 = param5 >> 8 & 255;
          if (var10 == 0) {
            if (119 > param6) {
              param2 = param2 - param3;
              param7 = param7 - param3;
              param6 = param6 - param3;
            } else {
              param6 = param6 - param0;
              param7 = param7 - param0;
              param2 = param2 - param0;
            }
            if (param7 < 0) {
              param7 = 0;
            }
            if (0 > param2) {
              param2 = 0;
            }
            if (param6 < 0) {
              param6 = 0;
            }
            ge.field_i[param4] = bd.a(param7, bd.a(param2 << 16, param6 << 8));
            param4--;
            continue;
          }
          break;
        }
    }

    final void c(byte param0) {
        this.field_d = false;
        this.field_i = 0;
        int var2 = -55 % ((param0 + 6) / 62);
        this.field_e = this.field_g;
    }

    kk(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.field_g = param0;
        this.field_c = new sg(b.field_j[param0].length);
        this.field_f = new le[b.field_j[param0].length];
        if (param0 != 2) {
          if (param0 != 3 &&
            param0 != 4) {
            if (param0 == 9) {
              this.field_a = new le(380, 275);
              if (var3 != 0) {
                this.field_a = new le(380, 263);
              }
            }
          } else {
            this.field_a = new le(380, 263);
          }
          var2 = 0;
          while (b.field_j[param0].length > var2) {
            this.field_f[var2] = new le(tj.field_c[param0] - fl.field_a[param0], 40);
            var2++;
            if (var3 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
          }
        }
        if (decompiledFrameCompleted1) {
          if (param0 == 2 ||
            var3 != 0) {
            var2Lifetime1 = 0;
            while (var2Lifetime1 < b.field_j[param0].length) {
              this.field_f[var2Lifetime1] = new le((-fl.field_a[param0] + tj.field_c[param0] - 30) / 3, 40);
              var2Lifetime1++;
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.field_a = new le(380, 275);
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_d = false;
            this.field_i = 0;
            this.field_e = this.field_g;
          }
        }

    }

    private final int b(int param0, int param1) {
        if (this.field_g != 2 && (3 != this.field_g &&
          this.field_g != 4 ||
          param1 < 2)) {
          return tj.field_c[this.field_g];
        }
        if (param0 != -6162) {
          this.a(false, true);
        }
        return this.a(param1, (byte) 52) + this.field_f[param1].field_m;
    }

    private final int a(byte param0, int param1) {
        if (this.field_g == 2) {
          if (param1 < 3) {
            return i.field_r[this.field_g];
          }
          if (param0 > -127) {
            this.a(false, false);
          }
          return mc.field_b[this.field_g] + i.field_r[this.field_g];
        }
        if ((this.field_g == 3 ||
          this.field_g == 4) &&
          param1 >= 2) {
          return mc.field_b[this.field_g] + i.field_r[this.field_g];
        }
        return mc.field_b[this.field_g] * param1 + i.field_r[this.field_g];
    }

    static {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
