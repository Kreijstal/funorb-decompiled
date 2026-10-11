/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static int field_a;
    private int field_k;
    static int field_i;
    private rm field_g;
    private int field_h;
    static int[] field_d;
    static String field_l;
    static String[] field_b;
    static String[] field_f;
    static int field_e;
    private int field_c;
    static volatile int field_j;

    private final void e(byte param0) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          if (param0 != -108) {
            field_d = (int[]) null;
          }
          stackIn_8_0 = (this.e(0, param0 + 128)) ? 0 : 1;
          var2_int = stackIn_8_0;
          stackIn_12_0 = (this.e(2, 20)) ? 2 : 1;
          var3 = stackIn_12_0;
          if (!this.field_g.a(0)) {
            if (ei.field_q == 96) {
              if (this.field_g.field_e > var2_int) {
                this.field_g.a(0, this.field_g.field_e - 1);
                if (var5 != 0) {
                  this.field_g.a(0, var3);
                }
              } else {
                this.field_g.a(0, var3);
              }
            }
            if (97 == ei.field_q) {
              if (!(this.field_g.field_e >= 0) ||
                !(var3 > this.field_g.field_e)) {
                this.field_g.a(0, var2_int);
                if (var5 != 0) {
                  this.field_g.a(0, this.field_g.field_e + 1);
                }
              } else {
                this.field_g.a(0, this.field_g.field_e + 1);
              }
            }
          }
          if (nf.field_a != null &&
            null != nf.field_a.field_Ub) {
            var4 = ei.field_q;
            if (var4 == 105 &&
              var5 == 0 ||
              104 == var4 &&
              var5 == 0 ||
              (var4 == 98 ||
              var4 == 99)) {
              ef.field_c = ei.field_q;
            }
          }
          this.field_g.e((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.V(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if ((this.field_c == 14 ||
            13 == this.field_c ||
            this.field_c == 7 ||
            this.field_c == 17 ||
            this.field_c == 6 ||
            this.field_c == 5 ||
            this.field_c == 8 ||
            19 == this.field_c ||
            20 == this.field_c) &&
            (-4 + uc.field_e[this.field_c].length) <= param1) {
            stackIn_31_0 = param1 - uc.field_e[this.field_c].length + 4;
            return stackIn_31_0;
          }
          if (param0 >= -59) {
            this.i(-28);
          }
          stackIn_36_0 = -1;
          return stackIn_36_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void i(int param0) {
        if (va.field_c == null) {
          return;
        }
        try {
          va.field_c.a(60);
          if (param0 != 21003) {
            this.a((byte) -45, -31, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.RA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean stackIn_19_2 = false;
        int stackIn_32_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        boolean stackIn_248_0 = false;
        int stackIn_387_0 = 0;
        int stackIn_387_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        int var3_intLifetime3Lifetime1;
        var6 = SteelSentinels.field_G;
        try {
          if (nk.field_J > 0) {
            nk.field_J = nk.field_J - 1;
          }
          if (gh.field_J &&
            !ni.b(11)) {
            gh.field_J = false;
            km.field_a = null;
          }
          if (this.field_c == 21) {
            var2 = eh.field_c;
            stackIn_18_0 = var2;
            stackIn_18_1 = 4540749;
            stackIn_19_2 = (!mm.a(false)) && (~this.field_c == ~vb.field_g);
            var3_int = ((ng) stackIn_18_0).a(stackIn_18_1, stackIn_19_2);
            if (var3_int != 3 && (var3_int == 1 ||
              2 == var3_int)) {
              stackIn_32_0 = (var3_int != 2) ? 0 : 1;
              var4 = stackIn_32_0;
              var5 = vb.field_g;
              if (var5 == 5 ||
                6 == var5 ||
                var5 == 8) {
                var5 = gh.field_Jb;
              }
              q.a(0, var4 != 0, -1, var5);
            }
          }
          boolean decompiledFrameCompleted0 = true;
          if (!this.a(-2)) {
            if (sn.field_q != -1 &&
              lb.field_gc == 1) {
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted2 = true;
              if (jl.field_p == 0 &&
                !ni.b(47)) {
                if (128 > sn.field_q) {
                  mm.field_g.a(66, (byte) -117);
                  mm.field_g.a((byte) 111, 1);
                  mm.field_g.a((byte) 124, sn.field_q);
                  var2_int = 0;
                  while (true) {
                    if (var2_int < va.field_k.length) {
                      va.field_k[var2_int] = 0;
                      var2_int++;
                      if (var6 == 0) {
                        continue;
                      }
                    } else {
                      vn.d(-65);
                    }
                    break;
                  }
                  decompiledFrameRemainder1 = (var6 != 0);
                }
                if (decompiledFrameRemainder1) {
                  mm.field_g.a(66, (byte) -117);
                  mm.field_g.a((byte) 108, 0);
                  mm.field_g.a((byte) 119, sn.field_q - 128);
                  var2_int = 0;
                  while (va.field_k.length > var2_int) {
                    va.field_k[var2_int] = 0;
                    var2_int++;
                    if (var6 != 0) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted2) {
                    vn.d(-78);
                  }
                }
              }
              if (jl.field_p >= 0) {
                ee.c(-2483, 95);
                lg.field_l = true;
                kf.field_s = true;
                sn.field_q = -1;
                lb.field_gc = 0;
                jl.field_p = -1;
                ln.field_c = null;
                km.field_a = null;
              }
            }
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameCompleted1 = true;
            if (gh.field_J &&
              lb.field_gc == 1) {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              var2_int = ln.field_g;
              if ((0 != var2_int ||
                var6 != 0) &&
                (decompiledFrameRemainder2 = (var2_int != 1 ||
                var6 != 0)) &&
                (decompiledFrameRemainder4 = (var2_int == 2))) {
                decompiledFrameRemainder3 = (var6 != 0);
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2)) {
                ee.c(-2483, 95);
                var2_int = vb.field_g;
                if (var2_int == 5 ||
                  var2_int == 6 ||
                  var2_int == 8) {
                  var2_int = gh.field_Jb;
                }
                q.a(0, true, -1, var2_int);
                km.field_a = null;
                gh.field_J = false;
                lg.field_l = true;
                kf.field_s = true;
                var2_int = 0;
                do {
                  if (3 <= var2_int) {
                    jc.field_f = 0;
                    jb.field_P = 0;
                    break;
                  }
                  fm.field_f[var2_int] = 0;
                  var2_int++;
                } while (var6 == 0);
                var2_int = 0;
                do {
                  if (!(var2_int < rn.field_D.length)) {
                    var2_int = 0;
                    break;
                  }
                  rn.field_D[var2_int] = 0;
                  var2_int++;
                } while (var6 == 0);
                while (fe.field_D.length > var2_int) {
                  fe.field_D[var2_int] = 0;
                  var2_int++;
                  if (var6 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder4 = (var6 != 0);
                }
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameCompleted1)) {
                ee.c(-2483, 95);
                v.a(20, (String) null, 10);
                decompiledFrameRemainder4 = (var6 != 0);
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameCompleted1)) {
                ee.c(-2483, 95);
                gh.field_J = false;
                kf.field_s = true;
                km.field_a = null;
                lg.field_l = true;
              }
            }
            if (gd.field_ub &&
              null == km.field_a) {
              gd.field_ub = false;
            }
            if (gd.field_ub &&
              lb.field_gc == 1) {
              lb.field_gc = 0;
              km.field_a = null;
              kf.field_s = true;
              ln.field_c = null;
              lg.field_l = true;
              gd.field_ub = false;
            }
            if ((km.field_a == td.field_ac ||
              km.field_a == ra.field_b) &&
              !ni.b(11)) {
              km.field_a = null;
              lg.field_l = true;
              kf.field_s = true;
            }
            if ((km.field_a == td.field_ac ||
              ra.field_b == km.field_a) &&
              (lb.field_gc == 1 &&
              ln.field_g == 0)) {
              ee.c(-2483, 95);
              v.a(20, (String) null, 10);
            }
            if (null != km.field_a) {
              while (dl.f(22759)) {
                if (ei.field_q != 13 &&
                  ei.field_q != 84 &&
                  ei.field_q != 83) {
                  continue;
                }
                km.field_a = null;
                lg.field_l = true;
                ln.field_c = null;
                kf.field_s = true;
                if (var6 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                break;
              }
              if ((decompiledFrameCompleted0) &&
                (null != km.field_a)) {
                return;
              }
            }
          }
          var2 = null;
          if (dc.field_g >= 0) {
            var2 = pa.field_d[dc.field_g];
          }
          if (null != var2) {
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (dl.f(22759)) {
                if (13 != ei.field_q) {
                  if (ei.field_q != 84) {
                    continue;
                  }
                  stackIn_219_0 = 7;
                  stackIn_219_1 = this.field_g.field_e;
                  decompiledFrameRemainder0 = (var6 == 0);
                  if ((decompiledFrameRemainder0) && (stackIn_219_0 != stackIn_219_1 &&
                    8 != this.field_g.field_e)) {
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  dc.field_g = -1;
                  ((sf) (var2)).a((byte) 92);
                  var3_intLifetime1 = vb.field_g;
                  if (var3_intLifetime1 == 5 ||
                    var3_intLifetime1 == 6 ||
                    8 == var3_intLifetime1) {
                    var3_intLifetime1 = gh.field_Jb;
                  }
                  q.a(0, false, -1, var3_intLifetime1);
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_219_0 = ~lb.field_gc;
                stackIn_219_1 = -3;
              }
              if (stackIn_219_0 == stackIn_219_1 &&
                !((sf) (var2)).c(21)) {
                lb.field_gc = 0;
              }
              if (lb.field_gc != 1) {
                break;
              }
              if (((sf) (var2)).a(this.field_g, 23123)) {
                break;
              }
              lb.field_gc = 0;
              break;
            }
          }
          if (wb.field_c != null) {
            wb.field_c.setCursor((java.awt.Cursor) null);
            if (var6 != 0) {
              sl.field_n.setCursor((java.awt.Cursor) null);
            }
          } else {
            sl.field_n.setCursor((java.awt.Cursor) null);
          }
          if (!param0) {
            field_a = -33;
          }
          if (12 == this.field_c) {
            stackIn_248_0 = !(mm.a(false));
            var3_intLifetime2 = c.a(stackIn_248_0, 269);
            if (var3_intLifetime2 == 3) {
              if (null != wb.field_c) {
                ub.c(0);
              }
              re.a(wl.d((byte) -21), 9268);
            }
            if (var3_intLifetime2 == 1) {
              var4 = vb.field_g;
              if (5 == var4 ||
                var4 == 6 ||
                var4 == 8) {
                var4 = gh.field_Jb;
              }
              q.a(0, false, -1, var4);
            }
            if (var3_intLifetime2 == 2) {
              var4 = vb.field_g;
              if (5 == var4 ||
                var4 == 6 ||
                8 == var4) {
                var4 = gh.field_Jb;
              }
              q.a(0, true, -1, var4);
            }
            return;
          }
          if (!rc.field_n &&
            !da.field_d) {
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!dl.f(22759)))) {
              stackIn_387_0 = 13;
              stackIn_387_1 = ei.field_q;
              if (var6 == 0) {
                if (stackIn_387_0 != stackIn_387_1) {
                  this.a((byte) -120);
                  if (this.field_g.field_e == -1) {
                    continue;
                  }
                  this.a((byte) -32, this.field_g.field_e, false);
                  continue;
                }
                if (this.field_c == 7 &&
                  gh.field_Jb != 0) {
                  ea.field_k = true;
                }
                if (this.field_c != 20 ||
                  !(fm.field_f[0] > 0) ||
                  !ni.b(49)) {
                  if (this.field_c != 18) {
                    if (this.field_c != 1 &&
                      this.field_c != 2 &&
                      this.field_c != 3 &&
                      this.field_c != 4) {
                      if (pm.field_T == 10) {
                        continue;
                      }
                      if (pm.field_T == 0) {
                        continue;
                      }
                      if (pm.field_T == 14) {
                        gh.field_Jb = 0;
                      } else if (pm.field_T != 20) {
                        if (~gh.field_Jb == ~this.field_c && (this.field_c == 14 ||
                          13 == this.field_c)) {
                          gh.field_Jb = 0;
                        }
                      } else if (!(10 <= fm.field_f[0]) ||
                        ni.b(36)) {
                        gh.field_Jb = 0;
                      } else {
                        gh.field_Jb = 19;
                      }
                      if (pm.field_T == 19) {
                        gh.field_Jb = 0;
                      }
                      q.a(gh.field_Jb, false, -1, gh.field_Jb);
                      continue;
                    }
                    ee.c(-2483, 85);
                    q.a(-1, false, -1, 0);
                    continue;
                  }
                  var3_intLifetime3 = 0;
                  while (var3_intLifetime3 < va.field_k.length) {
                    va.field_k[var3_intLifetime3] = 0;
                    var3_intLifetime3++;
                  }
                  vn.d(-66);
                  var3_intLifetime3Lifetime1 = vb.field_g;
                  if (var3_intLifetime3Lifetime1 == 5 ||
                    var3_intLifetime3Lifetime1 == 6 ||
                    var3_intLifetime3Lifetime1 == 8) {
                    var3_intLifetime3Lifetime1 = gh.field_Jb;
                  }
                  q.a(0, false, -1, var3_intLifetime3Lifetime1);
                  continue;
                }
                gh.field_J = true;
                ln.field_g = -1;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              this.field_g.a(124, this.a(oh.field_f, pi.field_c, 70), this.a(oa.field_S, rj.field_j, 125));
              stackIn_387_0 = this.field_g.field_e;
              stackIn_387_1 = -1;
            }
            if ((stackIn_387_0 ^ stackIn_387_1) != 0) {
              this.a((byte) -110, this.field_g.field_e, true);
            }
          }
          if (0 == this.field_c &&
            hg.field_h &&
            lb.field_gc == 1) {
            ee.c(-2483, 95);
            var3_intLifetime4 = vb.field_g;
            if (var3_intLifetime4 == 5 ||
              var3_intLifetime4 == 6 ||
              var3_intLifetime4 == 8) {
              var3_intLifetime4 = gh.field_Jb;
            }
            q.a(18, true, -1, var3_intLifetime4);
            if (var6 == 0) {
              return;
            }
          }
          if (this.field_c != 18) {
            if (this.field_c == 8) {
              this.a(true, false);
              if (var6 == 0) {
                return;
              }
            }
            if (9 == this.field_c ||
              pm.field_T == 10) {
              this.a(true, true);
              if (var6 == 0) {
                return;
              }
            }
            if (this.field_c == 14) {
              try {
                rj.d(6993661);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = decompiledCaughtException;
                System.err.println("Update constr: " + var3);
                var3.printStackTrace();
                vn.d(-58);
                var4 = 0;
                while (true) {
                  if (va.field_k.length > var4) {
                    va.field_k[var4] = 0;
                    var4++;
                    if (var6 == 0) {
                      continue;
                    }
                  } else {
                    hl.field_v = ji.a(ua.field_x, (byte) 108, di.field_c);
                    uc.field_b = cj.a(-94, di.field_c, hl.field_v);
                  }
                  if (var6 == 0) {
                    decompiledRegionSelector0 = 0;
                    break;
                  }
                  decompiledRegionSelector0 = 1;
                  break;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            if (this.field_c == 13) {
              return;
            }
            if (this.field_c == 7) {
              this.g((byte) -40);
              if (var6 == 0) {
                return;
              }
            }
            if (this.field_c != 16) {
              return;
            }
            this.i(21003);
            if (var6 == 0) {
              return;
            }
          }
          this.o(-29628);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "ji.IB(" + param0 + ')');
        }
    }

    private final int g(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        try {
          var3_int = this.b(-106, param1);
          if (var3_int >= 0) {
            stackIn_4_0 = 159 * var3_int + 1;
            return stackIn_4_0;
          }
          if (this.field_c == 5 &&
            !ni.b(52)) {
            if (param1 >= 3) {
              stackIn_15_0 = 260;
            } else {
              stackIn_15_0 = 100 + param1 * 150;
            }
            return stackIn_15_0;
          }
          if (this.field_c == 17) {
            stackIn_18_0 = 195;
            return stackIn_18_0;
          }
          if (this.a(-2)) {
            stackIn_21_0 = 195;
            return stackIn_21_0;
          }
          if (this.field_c == 6 &&
            !ni.b(54)) {
            if (2 <= param1) {
              stackIn_32_0 = 260;
            } else {
              stackIn_32_0 = 170 * param1 + 155;
            }
            return stackIn_32_0;
          }
          if (this.field_c == 7) {
            stackIn_37_0 = uc.field_k[this.field_c] + 180 * param1;
            return stackIn_37_0;
          }
          if (this.field_c == 13) {
            if (ni.b(82)) {
              stackIn_45_0 = 320 + (800 * param1 - 1200) / 5;
              return stackIn_45_0;
            }
            stackIn_43_0 = (-800 + 800 * param1) / 5 + 320;
            return stackIn_43_0;
          }
          if (this.field_c == 14) {
            if (ni.b(114)) {
              stackIn_53_0 = 240 + (-1200 + 800 * param1) / 5;
              return stackIn_53_0;
            }
            stackIn_51_0 = (param1 * 800 - 800) / 5 + 240;
            return stackIn_51_0;
          }
          if (this.field_c == 0) {
            var4 = uc.field_e[this.field_c][param1];
            if (var4 == 34) {
              stackIn_61_0 = 19;
              return stackIn_61_0;
            }
            stackIn_63_0 = 190;
            return stackIn_63_0;
          }
          if (this.field_c == 15) {
            stackIn_66_0 = 350;
            return stackIn_66_0;
          }
          if (param0 <= 123) {
            stackIn_69_0 = -50;
            return stackIn_69_0;
          }
          if (this.field_c == 19) {
            if (fa.field_c == uc.field_e[this.field_c]) {
              if (param1 >= 0 &&
                param1 < 10) {
                stackIn_95_0 = 30;
                return stackIn_95_0;
              }
              if (10 <= param1 &&
                param1 < 20) {
                stackIn_103_0 = 230;
                return stackIn_103_0;
              }
              if (param1 >= 20 &&
                param1 < 30) {
                stackIn_111_0 = 430;
                return stackIn_111_0;
              }
            } else {
              if (param1 >= 0 &&
                param1 < 10) {
                stackIn_81_0 = 50;
                return stackIn_81_0;
              }
              if (param1 >= 10 &&
                param1 < 20) {
                stackIn_87_0 = 330;
                return stackIn_87_0;
              }
            }
          }
          if (20 == this.field_c) {
            var4 = uc.field_e[this.field_c][param1];
            switch (var4) {
              case 26:
                stackIn_126_0 = 540;
                return stackIn_126_0;
              default:
                break;
              case 39:
                if (SteelSentinels.field_G == 0) {
                  stackIn_128_0 = 196;
                  return stackIn_128_0;
                }
              case 25:
                stackIn_124_0 = 40;
                return stackIn_124_0;
            }
          }
          stackIn_130_0 = uc.field_k[this.field_c];
          return stackIn_130_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.JB(" + param0 + ',' + param1 + ')');
        }
    }

    private final int c(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (this.field_c == 17 &&
            param1 < (uc.field_e[this.field_c].length - 4)) {
            stackIn_7_0 = 25;
            return stackIn_7_0;
          }
          if (this.a(-2)) {
            stackIn_12_0 = 25;
            return stackIn_12_0;
          }
          if (this.field_c == 0 &&
            uc.field_e[this.field_c][param1] == 34) {
            stackIn_18_0 = 65;
            return stackIn_18_0;
          }
          if (param0 != 25) {
            ji.h((byte) -119);
          }
          if (this.field_c == 19 &&
            uc.field_e[this.field_c][param1] == 38) {
            stackIn_27_0 = 24;
            return stackIn_27_0;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_c == 20) {
            var3_int = uc.field_e[this.field_c][param1];
            if ((25 != var3_int && (var3_int != 26 ||
              SteelSentinels.field_G != 0)) &&
              (decompiledFrameRemainder0 = (var3_int == 39))) {
              stackIn_44_0 = 26;
              return stackIn_44_0;
            }
            if (decompiledFrameRemainder0) {
              stackIn_42_0 = 24;
              return stackIn_42_0;
            }
          }
          if (this.field_c == 5 &&
            !ni.b(87) &&
            param1 < 3) {
            stackIn_55_0 = 25;
            return stackIn_55_0;
          }
          if (this.field_c == 6 &&
            !ni.b(param0 ^ 127) &&
            param1 < 2) {
            stackIn_66_0 = 25;
            return stackIn_66_0;
          }
          stackIn_68_0 = 30;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static nk a(int[] param0, byte param1, int[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 54 % ((49 - param1) / 47);
          stackIn_1_0 = hj.a(-24809, true, param2, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("ji.WA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        int[] stackIn_50_0 = null;
        boolean stackIn_56_0 = false;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackIn_138_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_226_0 = 0;
        String stackIn_233_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_55_0;
        boolean stackOut_74_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[][] var11_ref_int____ = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var12_ref_int____ = null;
        int[] var13 = null;
        int var13_int = 0;
        wk var13_ref = null;
        int var14_int = 0;
        int[] var14 = null;
        wk var14_ref = null;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        int[] var16_ref_int__ = null;
        String var16_ref_String = null;
        int var17 = 0;
        int[] var17_ref_int__ = null;
        int var18 = 0;
        int var19_int = 0;
        String var19 = null;
        Object var20_ref = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        String var19Lifetime1;
        int stackIn_64_0Lifetime1;
        int stackIn_82_0Lifetime1;
        int stackIn_135_0Lifetime1;
        int stackIn_135_1Lifetime1;
        int var8Lifetime1;
        int var12Lifetime1;
        int var13_intLifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19_intLifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var18Lifetime3;
        int var13_intLifetime1Lifetime1;
        int var14_intLifetime1Lifetime1;
        int var14_intLifetime1Lifetime2;
        int var20Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        var24 = SteelSentinels.field_G;
        try {
          pb.h(30, 70, 580, 350, 5789784);
          pb.h(34, 74, 60, 342, 930889);
          pb.h(546, 74, 60, 342, 930889);
          pb.h(98, 74, 61, 23, 930889);
          pb.h(481, 74, 61, 23, 930889);
          var3_int = 930889;
          var4 = q.field_i;
          q.field_i = 0;
          if (hd.field_i > 0) {
            if (oh.field_f >= 98 &&
              oh.field_f < 159 &&
              74 <= pi.field_c &&
              pi.field_c < 97) {
              var3_int = 0;
              jm.a(73, 24, wc.field_d, 1, 98, 61);
              q.field_i = -1;
              if (var24 != 0) {
                var3_int = 1146810;
              }
            } else {
              var3_int = 1146810;
            }
          }
          var5 = 930889;
          if (hd.field_i < -1 + dh.field_C.length) {
            if (oh.field_f >= 481 &&
              542 > oh.field_f &&
              74 <= pi.field_c &&
              97 > pi.field_c) {
              var5 = 0;
              jm.a(73, 24, wc.field_d, param0 - 47, 481, 61);
              q.field_i = 1;
              if (var24 != 0) {
                var5 = 1146810;
              }
            } else {
              var5 = 1146810;
            }
          }
          if (var4 != q.field_i &&
            q.field_i != 0) {
            ee.c(-2483, 97);
          }
          el.field_Ub.c((61 - el.field_Ub.field_A) / 2 + 98, 74 + (-el.field_Ub.field_F + 23) / 2, var3_int);
          gm.field_b.c(481 + (-gm.field_b.field_A + 61) / 2, 74 + (-gm.field_b.field_F + 23) / 2, var5);
          if (param0 != 48) {
            return;
          }
          pb.h(163, 74, 314, 23, 930889);
          pl.field_U.a(db.a(am.field_e, -63, new String[]{Integer.toString(1 + hd.field_i), Integer.toString(dh.field_C.length)}), 320, 74 + (pl.field_U.field_U + 23) / 2, 1021128, -1);
          pb.h(98, 101, 444, 154, 5789784);
          pb.d(262, 259, 157, 930889);
          pb.h(98, 259, 444, 157, 1130327);
          pb.h(266, 263, 272, 23, 1130327);
          pb.h(266, 290, 272, 122, 2697513);
          var6 = 78;
          var7 = 0;
          do {
            if (var7 >= 16) {
              var7 = 120;
              break;
            }
            pb.h(37, var6, 54, 18, 2697513);
            pb.h(549, var6, 54, 18, 2697513);
            var6 += 21;
            var7++;
          } while (var24 == 0);
          var8 = 106;
          ao.field_C = -1;
          if (param1) {
            stackIn_50_0 = ce.field_t;
          } else {
            stackIn_50_0 = ge.field_m;
          }
          var9 = stackIn_50_0;
          var10 = 0;
          var11_ref_int____ = dh.field_C[hd.field_i];
          var12 = 0;
          L9: while (true) {
            if (var11_ref_int____.length > var12) {
              var13 = var11_ref_int____[var12];
              var14_int = 0;
              var15_ref_int__ = var13;
              stackIn_69_0 = 0;
              if (var24 != 0) {
                break L9;
              }
              var16 = stackIn_69_0;
              while (var15_ref_int__.length > var16) {
                var17 = var15_ref_int__[var16];
                stackOut_55_0 = this.f(var17, 111);
                stackIn_64_0 = stackOut_55_0 ? 1 : 0;
                stackIn_56_0 = stackOut_55_0;
                if (stackIn_56_0) {
                  var14_int = 1;
                } else {
                  var16++;
                  continue;
                }
                break;
              }
              stackIn_64_0Lifetime1 = var14_int;
              if (stackIn_64_0Lifetime1 != 0) {
                var10++;
              }
              var12++;
              continue L9;
            }
            stackIn_69_0 = (-(var10 * 30) + 154) / (1 + var10) + 30;
            break;
          }
          var11 = stackIn_69_0;
          var8Lifetime1 = var11 + 101 - 30;
          var12_ref_int____ = dh.field_C[hd.field_i];
          var13_int = 0;
          L17: while (true) {
            if (var13_int < var12_ref_int____.length) {
              var14 = var12_ref_int____[var13_int];
              var15 = 0;
              var16_ref_int__ = var14;
              stackIn_138_0 = 0;
              if (var24 != 0) {
                break L17;
              }
              var17Lifetime1 = stackIn_138_0;
              while (var16_ref_int__.length > var17Lifetime1) {
                var18 = var16_ref_int__[var17Lifetime1];
                stackOut_74_0 = this.f(var18, 111);
                stackIn_82_0 = stackOut_74_0 ? 1 : 0;
                stackIn_75_0 = stackOut_74_0;
                if (stackIn_75_0) {
                  var15++;
                }
                var17Lifetime1++;
              }
              stackIn_82_0Lifetime1 = 0;
              if (stackIn_82_0Lifetime1 != var15) {
                var16Lifetime1 = (-(var15 * 30) + 444) / (var15 + 1) + 30;
                var7 = var16Lifetime1 + 98 - 30;
                var17_ref_int__ = var14;
                var18Lifetime3 = 0;
                while (true) {
                  if (var17_ref_int__.length > var18Lifetime3) {
                    var19_int = var17_ref_int__[var18Lifetime3];
                    stackIn_135_0 = ~oh.field_f;
                    stackIn_135_1 = ~var7;
                    if (stackIn_135_0 <= stackIn_135_1 &&
                      (30 + var7) > oh.field_f &&
                      pi.field_c >= var8Lifetime1 &&
                      pi.field_c < (30 + var8Lifetime1)) {
                      ao.field_C = var19_int;
                    }
                    var20_ref = ff.field_tb;
                    if (ve.a(var9, 1, var19_int)) {
                      var20_ref = od.field_c[var19_int];
                    } else {
                      if (ve.a(ao.field_A, 1, var19_int)) {
                        var20_ref = null;
                      } else {
                        if (ve.a(ao.field_E, param0 ^ 49, var19_int) && (ni.b(72) ||
                          !(rd.field_b > 0))) {
                          var20_ref = null;
                        }
                      }
                    }
                    if (var20_ref == null) {
                      if (~ao.field_C == ~var19_int) {
                        ao.field_C = -1;
                      }
                    } else {
                      var21 = 0;
                      if (in.field_k != var19_int) {
                        if (~var19_int == ~ao.field_C) {
                          var21 = 2;
                        }
                      } else {
                        var21 = 4;
                      }
                      ((wk) (var20_ref)).d(var7 + var21, var8Lifetime1 - var21);
                      var7 = var7 + var16Lifetime1;
                    }
                    var18Lifetime3++;
                    continue;
                  }
                  break;
                }
                stackIn_135_0Lifetime1 = var8Lifetime1;
                stackIn_135_1Lifetime1 = var11;
                var8Lifetime1 = stackIn_135_0Lifetime1 + stackIn_135_1Lifetime1;
              }
              var13_int++;
              continue L17;
            }
            stackIn_138_0 = in.field_k;
            break;
          }
          if (stackIn_138_0 != -1) {
            stackIn_142_0 = in.field_k;
          } else {
            stackIn_142_0 = ao.field_C;
          }
          var12Lifetime1 = stackIn_142_0;
          if (var12Lifetime1 != -1) {
            var13_intLifetime1 = 402;
            var14_intLifetime1 = (23 + ui.field_U.field_U) / 2 + 263;
            ui.field_U.a(ke.a(42, jg.field_t[var12Lifetime1]), var13_intLifetime1, var14_intLifetime1, 1021128, -1);
            var14_intLifetime1Lifetime1 = 306;
            var15Lifetime1 = ve.a(var9, param0 - 47, var12Lifetime1) ? 1 : 0;
            if (var15Lifetime1 == 0) {
              pl.field_U.a(ol.field_Zb, var13_intLifetime1, var14_intLifetime1Lifetime1, 8421504, -1);
            }
            if (var15Lifetime1 != 0 ||
              var24 != 0) {
              pl.field_U.a(sf.field_p, var13_intLifetime1, var14_intLifetime1Lifetime1, 16777215, -1);
            }
            if (var15Lifetime1 != 0) {
              od.field_c[var12Lifetime1].a(120, 277);
            }
            if (var15Lifetime1 == 0 ||
              var24 != 0) {
              ff.field_tb.a(120, 277);
            }
            if (var15Lifetime1 != 0 ||
              !ve.a(ao.field_B, param0 - 47, var12Lifetime1)) {
              var16_ref_String = oe.field_a[var12Lifetime1].toUpperCase();
              var17Lifetime2 = 330;
              var18Lifetime1 = var17Lifetime2 + fk.field_d.a(var16_ref_String, 252, 0);
              if (var18Lifetime1 <= 382) {
                if (!(362 >= var18Lifetime1)) {
                  var17Lifetime2 -= 8;
                  if (var24 != 0) {
                    var17Lifetime2 -= 18;
                  }
                }
              } else {
                var17Lifetime2 -= 18;
              }
              var13_intLifetime1Lifetime1 = 276;
              var14_intLifetime1Lifetime2 = 392;
              fk.field_d.a(var16_ref_String, 276, var17Lifetime2, 252, 122, 1021128, -1, 1, 0, 0);
              if (var18Lifetime1 > 382) {
                var14_intLifetime1Lifetime2 += 10;
              }
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder0 = true;
              fk.field_d.b(ke.a(param0 - 6, sh.field_c + "<col=ffffff>" + 100 * wb.field_h[var12Lifetime1] + "</col>"), 276, var14_intLifetime1Lifetime2, 1021128, -1);
              var13_intLifetime1Lifetime1 += 130;
              var19_intLifetime1 = 528 - bc.field_sb.field_A;
              var20 = -bc.field_sb.field_F + 10 + var14_intLifetime1Lifetime2;
              if (wb.field_h[var12Lifetime1] == 10) {
                var20 -= 10;
                var21Lifetime1 = 0;
                while (5 > var21Lifetime1) {
                  bc.field_sb.a(var19_intLifetime1, var20);
                  bc.field_sb.a(var19_intLifetime1, var20 + 20);
                  var19_intLifetime1 = var19_intLifetime1 - bc.field_sb.field_A / 3;
                  var21Lifetime1++;
                  if (var24 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = (var24 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1)) {
                var21Lifetime1Lifetime1 = 0;
                while (!(var21Lifetime1Lifetime1 >= wb.field_h[var12Lifetime1])) {
                  bc.field_sb.a(var19_intLifetime1, var20);
                  var19_intLifetime1 = var19_intLifetime1 - bc.field_sb.field_A / 3;
                  var21Lifetime1Lifetime1++;
                  if (var24 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                fk.field_d.c(ke.a(42, v.field_d), bc.field_sb.field_A / 3 + var19_intLifetime1, var14_intLifetime1Lifetime2, 1021128, -1);
              }
              if (var24 != 0) {
                pl.field_U.a(gj.field_c, 276, 345, 252, 122, 1021128, -1, 1, 0, 0);
              }
            } else {
              pl.field_U.a(gj.field_c, 276, 345, 252, 122, 1021128, -1, 1, 0, 0);
            }
          }
          if (var12Lifetime1 == -1 ||
            var24 != 0) {
            pl.field_U.a(na.field_q, 276, 300, 252, 102, 1021128, -1, 1, 1, 0);
          }
          if (ee.field_S != null) {
            var13_ref = uh.field_k;
            var14_ref = var13_ref.a();
            var15Lifetime2 = 38;
            var6 = 79;
            var16Lifetime2 = 0;
            while (32 > var16Lifetime2) {
              if (var24 != 0) {
                return;
              }
              if (var16Lifetime2 < ee.field_S.length &&
                ee.field_S[var16Lifetime2] > 0) {
                if (var15Lifetime2 < 320) {
                  var14_ref.a(-1 + var15Lifetime2, -1 + var6);
                } else {
                  var13_ref.a(var15Lifetime2, var6 - 1);
                }
                pd.field_Z[var16Lifetime2].a(var15Lifetime2, var6 - 1);
                if (var15Lifetime2 <= oh.field_f &&
                  (28 + var15Lifetime2) > oh.field_f &&
                  pi.field_c >= var6 &&
                  18 + var6 > pi.field_c) {
                  stackIn_226_0 = 1;
                } else {
                  stackIn_226_0 = 0;
                }
                var17Lifetime3 = stackIn_226_0;
                var18Lifetime2 = ee.field_S[var16Lifetime2];
                if (var18Lifetime2 > 0) {
                  if (var18Lifetime2 < 250) {
                    stackIn_233_0 = Integer.toString(var18Lifetime2);
                  } else {
                    stackIn_233_0 = ll.field_m;
                  }
                  var19 = stackIn_233_0;
                  var20Lifetime1 = 24736 + Math.min(var18Lifetime2, 255) / 6 * 262657;
                  if (var18Lifetime2 >= 250) {
                    var20Lifetime1 = 16777215;
                  }
                  if (var15Lifetime2 < 320) {
                    fk.field_d.c(var19, 88, var6 + 12, var20Lifetime1, -1);
                  } else {
                    fk.field_d.b(var19, 553, 12 + var6, var20Lifetime1, -1);
                  }
                }
                if (var17Lifetime3 != 0) {
                  var19Lifetime1 = bj.field_l[var16Lifetime2 * 2];
                  var20Lifetime1Lifetime1 = 8 + fk.field_d.c(var19Lifetime1);
                  var21Lifetime2 = -(var20Lifetime1Lifetime1 / 2) + var15Lifetime2 + 8;
                  if (var15Lifetime2 >= 320) {
                    var21Lifetime2 = Math.min(var21Lifetime2, -var20Lifetime1Lifetime1 + 630);
                  } else {
                    var21Lifetime2 = Math.max(var21Lifetime2, 10);
                  }
                  var22 = 15;
                  var23 = var6 - var22;
                  pb.h(var21Lifetime2, var23, var20Lifetime1Lifetime1, var22, 16777215, 192);
                  pb.c(var21Lifetime2, var23, var20Lifetime1Lifetime1, var22, 0, 192);
                  fk.field_d.b(var19Lifetime1, 4 + var21Lifetime2, 11 + var23, 16777215, -1);
                }
                if (var15Lifetime2 < 320) {
                  var15Lifetime2 = 575;
                } else {
                  var6 += 21;
                  var15Lifetime2 = 38;
                }
              }
              var16Lifetime2++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var6 = SteelSentinels.field_G;
        try {
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(uc.field_e[this.field_c].length > var4_int)))) {
            var5 = this.b(var4_int, (byte) -106);
            stackOut_3_0 = this.e(var4_int, 20);
            stackIn_23_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var6 == 0) {
              if (stackIn_4_0 &&
                param0 >= this.g(126, var4_int) &&
                param0 < this.a(var4_int, (byte) 121) &&
                var5 <= param1 &&
                param1 < this.c(25, var4_int) + var5) {
                stackIn_20_0 = var4_int;
                return stackIn_20_0;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_23_0 = param2;
          }
          if (stackIn_23_0 <= 68) {
            ji.a((String) null, -71);
          }
          stackIn_27_0 = -1;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int g(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_123_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2_intLifetime1;
        var6 = SteelSentinels.field_G;
        try {
          if (7 == this.field_c) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var3 = 76 % ((80 - param0) / 42);
          var2_int = this.field_g.field_e;
          var4 = this.b(-78, var2_int);
          if (var2_int >= 0 &&
            uc.field_e[this.field_c].length > var2_int &&
            uc.field_e[this.field_c][var2_int] != -1) {
            if (this.field_c == 20) {
              if (0 <= var2_int &&
                2 > var2_int) {
                stackIn_34_0 = 2;
                return stackIn_34_0;
              }
              if (var4 >= 0) {
                if (!this.a(117, 0)) {
                  stackIn_42_0 = 1;
                  return stackIn_42_0;
                }
                stackIn_40_0 = 0;
                return stackIn_40_0;
              }
            }
            if (this.field_c == 0) {
              if (uc.field_e[this.field_c][var2_int] == 34) {
                stackIn_50_0 = var2_int;
                return stackIn_50_0;
              }
              if (uc.field_e[this.field_c][var2_int] != 19 &&
                (var2_int + 1) < uc.field_e[this.field_c].length) {
                stackIn_60_0 = 1 + var2_int;
                return stackIn_60_0;
              }
              stackIn_58_0 = 0;
              return stackIn_58_0;
            }
            if (this.field_c == 17) {
              if (var2_int == -5 + uc.field_e[this.field_c].length) {
                stackIn_66_0 = -1 + uc.field_e[this.field_c].length;
                return stackIn_66_0;
              }
              if (-5 + uc.field_e[this.field_c].length > var2_int) {
                stackIn_71_0 = 1 + var2_int;
                return stackIn_71_0;
              }
              stackIn_73_0 = 0;
              return stackIn_73_0;
            }
            if (this.field_c == 5 &&
              var4 == -1) {
              if (0 == var2_int) {
                stackIn_84_0 = 3;
                return stackIn_84_0;
              }
              if (var2_int == 1) {
                stackIn_87_0 = 4;
                return stackIn_87_0;
              }
              if (var2_int == 2) {
                stackIn_92_0 = 6;
                return stackIn_92_0;
              }
            }
            if (this.field_c == 6 &&
              var4 == -1) {
              if (var2_int == 0) {
                stackIn_103_0 = 2;
                return stackIn_103_0;
              }
              if (var2_int == 1) {
                stackIn_106_0 = 5;
                return stackIn_106_0;
              }
            }
            if (19 == this.field_c) {
              if (var4 >= 0) {
                stackIn_112_0 = 0;
                return stackIn_112_0;
              }
              stackIn_117_0 = (fa.field_c != uc.field_e[this.field_c]) ? 20 : 30;
              var5 = stackIn_117_0;
              if (~var2_int == ~(var5 - 1)) {
                stackIn_121_0 = -1 + uc.field_e[this.field_c].length;
                return stackIn_121_0;
              }
            }
            stackIn_123_0 = -1;
            return stackIn_123_0;
          }
          var2_intLifetime1 = 0;
          L9: while (true) {
            if (var2_intLifetime1 < uc.field_e[this.field_c].length) {
              stackIn_21_0 = 0;
              stackIn_21_1 = ~uc.field_e[this.field_c][var2_intLifetime1];
              if (var6 != 0) {
                break L9;
              }
              if (stackIn_21_0 == stackIn_21_1) {
                var2_intLifetime1++;
                continue;
              }
            }
            stackIn_21_0 = uc.field_e[this.field_c].length;
            stackIn_21_1 = var2_intLifetime1;
            break;
          }
          if (stackIn_21_0 != stackIn_21_1) {
            stackIn_25_0 = var2_intLifetime1;
            return stackIn_25_0;
          }
          stackIn_23_0 = -1;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.EA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        boolean stackIn_6_0 = false;
        int stackIn_12_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_32_0 = 0;
        boolean stackIn_46_0 = false;
        int stackIn_53_0 = 0;
        String stackIn_106_0 = null;
        String stackIn_110_0 = null;
        boolean stackIn_124_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        boolean stackOut_25_0;
        boolean stackOut_45_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        String var8 = null;
        int var9_int = 0;
        String var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var8Lifetime1;
        String var8Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var9_intLifetime1;
        int var9_intLifetime2;
        var12 = SteelSentinels.field_G;
        try {
          var2_int = va.field_d;
          va.field_d = -1;
          pb.a(0, 50, 640, 430, 0);
          if (param0 <= 112) {
            return;
          }
          var3 = 100;
          var4 = 55;
          var5 = 200;
          var6 = 30;
          var7 = ff.field_lb;
          var8 = "";
          var9_int = 0;
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (var9_int >= 3))) {
            stackOut_5_0 = t.a(rn.field_D, n.field_z[var9_int], -20370);
            stackIn_12_0 = stackOut_5_0 ? 1 : 0;
            stackIn_6_0 = stackOut_5_0;
            if (var12 == 0) {
              if (stackIn_6_0) {
                var8 = var8 + ", " + cd.field_c[var9_int];
              }
              var9_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_12_0 = var8.length();
          }
          if (stackIn_12_0 == 0) {
            var8 = "none";
          }
          if (stackIn_12_0 != 0 ||
            var12 != 0) {
            var8 = var8.substring(2);
          }
          var4 = var4 + ((mi) ((Object) var7)).field_G;
          var8 = "Currently unlocked: " + var8;
          ((mi) ((Object) var7)).a(var8, 320, var4, 16777215, -1);
          var4 += 5;
          if (nm.a(var4, var3, 126, "Lock mechs 1,2,3", var6, var5)) {
            va.field_d = 0;
          }
          var3 = var3 + (var5 + 20);
          if (nm.a(var4, var3, 124, "Unlock mechs 1,2,3", var6, var5)) {
            va.field_d = 1;
          }
          var3 = var3 - (20 + var5);
          var8Lifetime1 = "";
          var4 = var4 + (var6 + 5);
          var9_intLifetime1 = 3;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var9_intLifetime1 >= 6))) {
            stackOut_25_0 = t.a(rn.field_D, n.field_z[var9_intLifetime1], -20370);
            stackIn_32_0 = stackOut_25_0 ? 1 : 0;
            stackIn_26_0 = stackOut_25_0;
            if (var12 == 0) {
              if (stackIn_26_0) {
                var8Lifetime1 = var8Lifetime1 + ", " + cd.field_c[var9_intLifetime1];
              }
              var9_intLifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_32_0 = -1;
          }
          if (stackIn_32_0 == ~var8Lifetime1.length()) {
            var8Lifetime1 = "none";
            if (var12 != 0) {
              var8Lifetime1 = var8Lifetime1.substring(2);
            }
          } else {
            var8Lifetime1 = var8Lifetime1.substring(2);
          }
          var8Lifetime1 = "Currently unlocked: " + var8Lifetime1;
          var4 = var4 + ((mi) ((Object) var7)).field_G;
          ((mi) ((Object) var7)).a(var8Lifetime1, 320, var4, 16777215, -1);
          var4 += 5;
          if (nm.a(var4, var3, 116, "Lock mechs 4,5,6", var6, var5)) {
            va.field_d = 2;
          }
          var3 = var3 + (var5 + 20);
          if (nm.a(var4, var3, 118, "Unlock mechs 4,5,6", var6, var5)) {
            va.field_d = 3;
          }
          var4 = var4 + (5 + var6);
          var8Lifetime2 = "";
          var3 = var3 - (20 + var5);
          var9_intLifetime2 = 6;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9_intLifetime2 >= 12))) {
            stackOut_45_0 = t.a(rn.field_D, n.field_z[var9_intLifetime2], -20370);
            stackIn_53_0 = stackOut_45_0 ? 1 : 0;
            stackIn_46_0 = stackOut_45_0;
            if (var12 == 0) {
              if (stackIn_46_0) {
                var8Lifetime2 = var8Lifetime2 + ", " + cd.field_c[var9_intLifetime2];
              }
              var9_intLifetime2++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_53_0 = 0;
          }
          if (stackIn_53_0 != var8Lifetime2.length()) {
            var8Lifetime2 = var8Lifetime2.substring(2);
            if (var12 != 0) {
              var8Lifetime2 = "none";
            }
          } else {
            var8Lifetime2 = "none";
          }
          var4 = var4 + ((mi) ((Object) var7)).field_G;
          var8Lifetime2 = "Currently unlocked: " + var8Lifetime2;
          ((mi) ((Object) var7)).a(var8Lifetime2, 320, var4, 16777215, -1);
          var4 += 5;
          if (nm.a(var4, var3, 116, "Lock mechs 7-12", var6, var5)) {
            va.field_d = 4;
          }
          var3 = var3 + (20 + var5);
          if (nm.a(var4, var3, 123, "Unlock mechs 7-12", var6, var5)) {
            va.field_d = 5;
          }
          var4 = var4 + (var6 + 5);
          var3 = var3 - (20 + var5);
          var4 = var4 + ((mi) ((Object) var7)).field_G;
          ((mi) ((Object) var7)).a("Solarite: " + li.field_v, 320, var4, 16777215, -1);
          var4 += 5;
          if (nm.a(var4, var3, 127, "Revoke 100 Solarite", var6, var5)) {
            va.field_d = 6;
          }
          var3 = var3 + (var5 + 20);
          if (nm.a(var4, var3, 119, "Get 100 Solarite", var6, var5)) {
            va.field_d = 7;
          }
          var4 = var4 + (10 + var6);
          var3 = var3 - (var5 + 20);
          var4 = var4 + ((mi) ((Object) var7)).field_G;
          ((mi) ((Object) var7)).a("Total items engineered: " + pc.e(126), 320, var4, 16777215, -1);
          var4 += 5;
          if (nm.a(var4, var3, 127, "Unengineer all", var6, var5)) {
            va.field_d = 8;
          }
          var3 = var3 + (20 + var5);
          if (nm.a(var4, var3, 127, "Engineer all", var6, var5)) {
            va.field_d = 9;
          }
          var4 = var4 + (10 + var6);
          var3Lifetime1 = 200;
          var4 += 10;
          var5Lifetime1 = 80;
          var6Lifetime1 = 30;
          ((mi) ((Object) var7)).b("COMPLETE CAMPAIGN:", 50, 20 + var4, 1021128, -1);
          if (nm.a(var4, var3Lifetime1, 124, "Training", var6Lifetime1, var5Lifetime1)) {
            va.field_d = 24;
          }
          ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[0]), var5Lifetime1 / 2 + var3Lifetime1, var4 - 2, 16777215, -1);
          var3Lifetime1 = var3Lifetime1 + (10 + var5Lifetime1);
          if (nm.a(var4, var3Lifetime1, 124, "Free", var6Lifetime1, var5Lifetime1)) {
            va.field_d = 25;
          }
          ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[1]), var5Lifetime1 / 2 + var3Lifetime1, var4 - 2, 16777215, -1);
          var3Lifetime1 = var3Lifetime1 + (10 + var5Lifetime1);
          if (nm.a(var4, var3Lifetime1, 117, "Member", var6Lifetime1, var5Lifetime1)) {
            va.field_d = 26;
          }
          ((mi) ((Object) var7)).a(Integer.toString(fm.field_f[2]), var5Lifetime1 / 2 + var3Lifetime1, -2 + var4, 16777215, -1);
          var3Lifetime2 = 170;
          var6Lifetime2 = 30;
          var4 += 34;
          var3Lifetime3 = 30;
          var4 = var4 + (((mi) ((Object) var7)).field_G + 5);
          ((mi) ((Object) var7)).b("SET STATE:", var3Lifetime3, 20 + var4, 1021128, -1);
          var5Lifetime2 = 60;
          var3Lifetime3 += 70;
          if (nm.a(var4, var3Lifetime3, 120, "Noob", var6Lifetime2, var5Lifetime2)) {
            va.field_d = 10;
          }
          var3Lifetime3 = var3Lifetime3 + (10 + var5Lifetime2);
          if (nm.a(var4, var3Lifetime3, 124, "Basic", var6Lifetime2, var5Lifetime2)) {
            va.field_d = 11;
          }
          var3Lifetime3 = var3Lifetime3 + (var5Lifetime2 + 10);
          var5Lifetime3 = 90;
          if (nm.a(var4, var3Lifetime3, 118, "Advanced", var6Lifetime2, var5Lifetime3)) {
            va.field_d = 12;
          }
          var3Lifetime3 = var3Lifetime3 + (var5Lifetime3 + 10);
          var5Lifetime4 = 90;
          if (nm.a(var4, var3Lifetime3, 122, "Mighty God", var6Lifetime2, var5Lifetime4)) {
            va.field_d = 13;
          }
          var3Lifetime3 = var3Lifetime3 + (40 + var5Lifetime4);
          var5Lifetime5 = 100;
          if ((8 & dm.field_a) == 0) {
            stackIn_106_0 = "Config tutorial <col=00ff00>pending</col>";
          } else {
            stackIn_106_0 = "Config tutorial viewed";
          }
          var9 = stackIn_106_0;
          ((mi) ((Object) var7)).b(var9, -10 + var3Lifetime3, -3 + var4, 16777215, -1);
          if ((dm.field_a & 8) == 0) {
            stackIn_110_0 = "Skip";
          } else {
            stackIn_110_0 = "Reset";
          }
          var10 = stackIn_110_0;
          if (nm.a(var4, var3Lifetime3, 125, var10, var6Lifetime2, var5Lifetime5)) {
            va.field_d = 16;
          }
          var4 += 46;
          ((mi) ((Object) var7)).a("MUSIC", 122, -3 + var4, 1021128, -1);
          var3Lifetime4 = 20;
          var5Lifetime6 = 30;
          var11 = 0;
          while (true) {
            if (var11 > 5) {
              var6Lifetime2 = 30;
              var5Lifetime6 = 100;
              var3Lifetime4 = (-var5Lifetime6 + 640) / 2;
              stackIn_124_0 = nm.a(var4, var3Lifetime4, 118, "MAIN MENU", var6Lifetime2, var5Lifetime6);
              break;
            }
            stackIn_124_0 = nm.a(var4, var3Lifetime4, 127, "" + var11, var6Lifetime2, var5Lifetime6);
            if (var12 == 0) {
              if (stackIn_124_0) {
                va.field_d = var11 + 17;
              }
              var3Lifetime4 = var3Lifetime4 + (5 + var5Lifetime6);
              var11++;
              continue;
            }
            break;
          }
          if (stackIn_124_0) {
            va.field_d = 14;
          }
          var3Lifetime4 = var3Lifetime4 + (var5Lifetime6 + 40);
          var5Lifetime7 = 140;
          if (nm.a(var4, var3Lifetime4, 116, "Update server", var6Lifetime2, var5Lifetime7)) {
            va.field_d = 15;
            if ((var12 != 0) && (jg.field_j &&
              0 == (a.field_c & 16))) {
              pb.h(var3Lifetime4, var4, var5Lifetime7, var6Lifetime2, 32896);
            }
          } else {
            if (jg.field_j &&
              0 == (a.field_c & 16)) {
              pb.h(var3Lifetime4, var4, var5Lifetime7, var6Lifetime2, 32896);
            }
          }
          if (va.field_d != -1 &&
            ~var2_int != ~va.field_d) {
            ee.c(-2483, 97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.FA(" + param0 + ')');
        }
    }

    private final boolean b(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_d = (int[]) null;
          }
          if (param2 >= 0 &&
            param2 < 10) {
            if (0 <= param1 &&
              param1 < 3) {
              if (param1 == 2 &&
                rd.field_b <= 0) {
                return false;
              }
              if (param1 > 0 &&
                3 > fm.field_f[0]) {
                return false;
              }
              if (fm.field_f[param1] >= param2) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        boolean stackIn_243_0 = false;
        String[] stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        String stackIn_247_2 = null;
        int stackIn_737_0 = 0;
        boolean stackIn_856_0 = false;
        String[] stackIn_859_0 = null;
        int stackIn_859_1 = 0;
        String stackIn_860_2 = null;
        boolean stackIn_876_0 = false;
        String[] stackIn_879_0 = null;
        int stackIn_879_1 = 0;
        String stackIn_880_2 = null;
        boolean stackIn_897_0 = false;
        String[] stackIn_900_0 = null;
        int stackIn_900_1 = 0;
        String stackIn_901_2 = null;
        boolean stackIn_919_0 = false;
        String[] stackIn_922_0 = null;
        int stackIn_922_1 = 0;
        String stackIn_923_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var6Lifetime2;
        int var7Lifetime2;
        int var8Lifetime2;
        var10 = SteelSentinels.field_G;
        try {
          if (this.field_c == 18) {
            return;
          }
          var4_int = this.field_g.c(0) ? 1 : 0;
          var5 = uc.field_e[this.field_c][param1];
          if (param0 >= -1) {
            return;
          }
          if (var5 != -1 &&
            this.field_g.field_c &&
            this.a(121, param1)) {
            ee.c(-2483, 97);
          }
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              L19: {
                                                L20: {
                                                  L21: {
                                                    L22: {
                                                      L23: {
                                                        L24: {
                                                          L25: {
                                                            L26: {
                                                              L27: {
                                                                L28: {
                                                                  boolean decompiledFrameRemainder14 = true;
                                                                  boolean decompiledFrameRemainder13 = true;
                                                                  boolean decompiledFrameRemainder12 = true;
                                                                  boolean decompiledFrameRemainder11 = true;
                                                                  boolean decompiledFrameRemainder10 = true;
                                                                  boolean decompiledFrameRemainder9 = true;
                                                                  boolean decompiledFrameRemainder8 = true;
                                                                  boolean decompiledFrameRemainder7 = true;
                                                                  boolean decompiledFrameRemainder6 = true;
                                                                  boolean decompiledFrameRemainder5 = true;
                                                                  boolean decompiledFrameRemainder4 = true;
                                                                  boolean decompiledFrameRemainder3 = true;
                                                                  boolean decompiledFrameRemainder2 = true;
                                                                  boolean decompiledFrameRemainder1 = true;
                                                                  boolean decompiledFrameRemainder0 = true;
                                                                  var6 = var5;
                                                                  if (-1 == var6 &&
                                                                    var10 == 0) {
                                                                    var4_int = 0;
                                                                    break L1;
                                                                  } else {
                                                                    if ((var6 != 38) &&
                                                                      (decompiledFrameRemainder0 = (var6 != 39)) &&
                                                                      (decompiledFrameRemainder1 = (var6 != 37 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder2 = (var6 != 41)) &&
                                                                      (decompiledFrameRemainder3 = (0 != var6)) &&
                                                                      (decompiledFrameRemainder4 = (var6 != 46 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder5 = (var6 != 33)) &&
                                                                      (decompiledFrameRemainder6 = (var6 != 1)) &&
                                                                      (decompiledFrameRemainder7 = (var6 != 2 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder8 = (var6 != 7 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder9 = (var6 != 24 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder10 = (22 != var6 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder11 = (var6 != 27)) &&
                                                                      (decompiledFrameRemainder12 = (28 != var6 ||
                                                                      var10 != 0)) &&
                                                                      (decompiledFrameRemainder13 = (var6 != 5)) &&
                                                                      (decompiledFrameRemainder14 = (8 != var6))) {
                                                                      if (var6 == 4) {
                                                                        break L28;
                                                                      }
                                                                      if (var6 == 3 &&
                                                                        var10 == 0) {
                                                                        break L27;
                                                                      }
                                                                      if (var6 == 20 &&
                                                                        var10 == 0) {
                                                                        break L26;
                                                                      }
                                                                      if (var6 == 21 &&
                                                                        var10 == 0) {
                                                                        break L25;
                                                                      }
                                                                      if (6 == var6) {
                                                                        break L24;
                                                                      }
                                                                      if (var6 == 9 &&
                                                                        var10 == 0) {
                                                                        break L23;
                                                                      }
                                                                      if (10 == var6 &&
                                                                        var10 == 0) {
                                                                        break L22;
                                                                      }
                                                                      if (var6 == 11) {
                                                                        break L21;
                                                                      }
                                                                      if (var6 == 12 &&
                                                                        var10 == 0) {
                                                                        break L20;
                                                                      }
                                                                      if (var6 == 13 &&
                                                                        var10 == 0) {
                                                                        break L19;
                                                                      }
                                                                      if (14 == var6 &&
                                                                        var10 == 0) {
                                                                        break L18;
                                                                      }
                                                                      if (var6 == 15 &&
                                                                        var10 == 0) {
                                                                        break L17;
                                                                      }
                                                                      if (16 == var6 &&
                                                                        var10 == 0) {
                                                                        break L16;
                                                                      }
                                                                      if (17 == var6 &&
                                                                        var10 == 0) {
                                                                        break L15;
                                                                      }
                                                                      if (var6 == 18) {
                                                                        break L14;
                                                                      }
                                                                      if (23 == var6 &&
                                                                        var10 == 0) {
                                                                        break L13;
                                                                      }
                                                                      if (var6 == 25) {
                                                                        break L12;
                                                                      }
                                                                      if (var6 == 26 &&
                                                                        var10 == 0) {
                                                                        break L11;
                                                                      }
                                                                      if (var6 == 19 &&
                                                                        var10 == 0) {
                                                                        break L10;
                                                                      }
                                                                      if (var6 == 34 &&
                                                                        var10 == 0) {
                                                                        break L9;
                                                                      }
                                                                      if (var6 == 40) {
                                                                        break L8;
                                                                      }
                                                                      if (var6 == 35) {
                                                                        break L7;
                                                                      }
                                                                      if (var6 == 45) {
                                                                        break L6;
                                                                      }
                                                                      if (var6 == 42) {
                                                                        break L5;
                                                                      }
                                                                      if (43 == var6) {
                                                                        break L4;
                                                                      }
                                                                      if (44 == var6 &&
                                                                        var10 == 0) {
                                                                        break L3;
                                                                      }
                                                                      if (var6 == 47) {
                                                                        break L2;
                                                                      }
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6) &&
                                                                    (decompiledFrameRemainder5) &&
                                                                    (decompiledFrameRemainder4) &&
                                                                    (decompiledFrameRemainder3) &&
                                                                    (decompiledFrameRemainder2) &&
                                                                    (decompiledFrameRemainder1) &&
                                                                    (decompiledFrameRemainder0)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    if (this.field_c == 19) {
                                                                      ge.field_j = param1 / 10;
                                                                    }
                                                                    if (!this.b(false, ge.field_j, param1 % 10)) {
                                                                      break L1;
                                                                    }
                                                                    nk.field_J = 500;
                                                                    ol.field_Ub = param1 % 10;
                                                                    var6 = param2 ? 1 : 0;
                                                                    q.a(20, var6 != 0, -1, 0);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6) &&
                                                                    (decompiledFrameRemainder5) &&
                                                                    (decompiledFrameRemainder4) &&
                                                                    (decompiledFrameRemainder3) &&
                                                                    (decompiledFrameRemainder2) &&
                                                                    (decompiledFrameRemainder1)) {
                                                                    sh.a(-23, param2, this.field_g.c(0));
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6) &&
                                                                    (decompiledFrameRemainder5) &&
                                                                    (decompiledFrameRemainder4) &&
                                                                    (decompiledFrameRemainder3) &&
                                                                    (decompiledFrameRemainder2)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    stackIn_243_0 = !(ka.field_V);
                                                                    ka.field_V = stackIn_243_0;
                                                                    stackIn_246_0 = ti.field_A;
                                                                    stackIn_246_1 = 37;
                                                                    if (!ka.field_V) {
                                                                      stackIn_247_2 = fg.field_Vb;
                                                                    } else {
                                                                      stackIn_247_2 = ge.field_i;
                                                                    }
                                                                    stackIn_246_0[stackIn_246_1] = stackIn_247_2;
                                                                    if (ni.b(22)) {
                                                                      break L1;
                                                                    }
                                                                    um.f((byte) 3);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6) &&
                                                                    (decompiledFrameRemainder5) &&
                                                                    (decompiledFrameRemainder4) &&
                                                                    (decompiledFrameRemainder3)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    bg.c((byte) 120);
                                                                    if (ni.b(51)) {
                                                                      break L1;
                                                                    }
                                                                    um.f((byte) 3);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6) &&
                                                                    (decompiledFrameRemainder5) &&
                                                                    (decompiledFrameRemainder4)) {
                                                                    if (this.a(124, param1)) {
                                                                      if (!this.field_g.c(0)) {
                                                                        break L1;
                                                                      }
                                                                      if (this.b(false, 1, 0) ||
                                                                        this.field_c == 20) {
                                                                        var6 = param2 ? 1 : 0;
                                                                        q.a(19, var6 != 0, -1, 0);
                                                                        if (var10 == 0) {
                                                                          break L1;
                                                                        }
                                                                      }
                                                                      ol.field_Ub = fm.field_f[0];
                                                                      ge.field_j = 0;
                                                                      var6 = param2 ? 1 : 0;
                                                                      var7 = vb.field_g;
                                                                      if (5 == var7 ||
                                                                        var7 == 6 ||
                                                                        var7 == 8) {
                                                                        var7 = gh.field_Jb;
                                                                      }
                                                                      q.a(20, var6 != 0, -1, var7);
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    var4_int = 0;
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6) &&
                                                                    (decompiledFrameRemainder5)) {
                                                                    if (!this.a(118, param1)) {
                                                                      var4_int = 0;
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    nl.g(127);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7) &&
                                                                    (decompiledFrameRemainder6)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    dc.field_g = -1;
                                                                    if (!ib.a(-99)) {
                                                                      km.field_a = dg.field_e;
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    qh.field_Yb = 0;
                                                                    di.field_g = 4;
                                                                    if (this.field_c == 14) {
                                                                      uc.field_b = cj.a(-107, di.field_c, hl.field_v);
                                                                      hl.field_v = ji.a(uc.field_b, (byte) -25, di.field_c);
                                                                    }
                                                                    var6 = param2 ? 1 : 0;
                                                                    q.a(-3, var6 != 0, -1, 0);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8) &&
                                                                    (decompiledFrameRemainder7)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    if (ni.b(111)) {
                                                                      si.field_y = false;
                                                                      var6 = 0;
                                                                      oc.a(99, var6, ql.field_dc, param2, true);
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    if (this.a(127, param1)) {
                                                                      if (ib.a(-47)) {
                                                                        var6 = param2 ? 1 : 0;
                                                                        var7 = vb.field_g;
                                                                        if (var7 == 5 ||
                                                                          var7 == 6 ||
                                                                          var7 == 8) {
                                                                          var7 = gh.field_Jb;
                                                                        }
                                                                        q.a(-4, var6 != 0, -1, var7);
                                                                        if (var10 == 0) {
                                                                          break L1;
                                                                        }
                                                                      }
                                                                      km.field_a = dg.field_e;
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    var4_int = 0;
                                                                    km.field_a = b.field_l;
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9) &&
                                                                    (decompiledFrameRemainder8)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    var6 = param2 ? 1 : 0;
                                                                    q.a(-1, var6 != 0, -1, 0);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10) &&
                                                                    (decompiledFrameRemainder9)) {
                                                                    ub.a(false, -1);
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    if (14 == pm.field_T) {
                                                                      uc.field_b = cj.a(-109, di.field_c, hl.field_v);
                                                                    }
                                                                    if (pm.field_T == 20 &&
                                                                      ni.b(28) &&
                                                                      0 < fm.field_f[0]) {
                                                                      ln.field_g = -1;
                                                                      gh.field_J = true;
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    var6 = param2 ? 1 : 0;
                                                                    var7 = vb.field_g;
                                                                    if (var7 == 5 ||
                                                                      var7 == 6 ||
                                                                      8 == var7) {
                                                                      var7 = gh.field_Jb;
                                                                    }
                                                                    q.a(0, var6 != 0, -1, var7);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11) &&
                                                                    (decompiledFrameRemainder10)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    var6 = param2 ? 1 : 0;
                                                                    var7 = vb.field_g;
                                                                    if (5 == var7 ||
                                                                      6 == var7 ||
                                                                      8 == var7) {
                                                                      var7 = gh.field_Jb;
                                                                    }
                                                                    q.a(12, var6 != 0, -1, var7);
                                                                    td.field_Sb = true;
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12) &&
                                                                    (decompiledFrameRemainder11)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    var6 = param2 ? 1 : 0;
                                                                    var7 = vb.field_g;
                                                                    if (var7 == 5 ||
                                                                      6 == var7 ||
                                                                      var7 == 8) {
                                                                      var7 = gh.field_Jb;
                                                                    }
                                                                    q.a(8, var6 != 0, -1, var7);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13) &&
                                                                    (decompiledFrameRemainder12)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    var6 = param2 ? 1 : 0;
                                                                    var7 = vb.field_g;
                                                                    if (var7 == 5 ||
                                                                      var7 == 6 ||
                                                                      8 == var7) {
                                                                      var7 = gh.field_Jb;
                                                                    }
                                                                    q.a(13, var6 != 0, -1, var7);
                                                                    if (pm.field_T != 14) {
                                                                      break L1;
                                                                    }
                                                                    uc.field_b = cj.a(-100, di.field_c, hl.field_v);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if ((decompiledFrameRemainder14) &&
                                                                    (decompiledFrameRemainder13)) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    if (!this.a(124, param1)) {
                                                                      var4_int = 0;
                                                                      km.field_a = sj.field_C + "<br>" + b.field_l;
                                                                      if (var10 == 0) {
                                                                        break L1;
                                                                      }
                                                                    }
                                                                    if (gi.h((byte) -79)) {
                                                                      ij.field_Y = -1;
                                                                      fg.field_Ob = 1;
                                                                      f.field_A = null;
                                                                      ti.field_B = null;
                                                                      vn.d(-52);
                                                                      var6 = 0;
                                                                      while (true) {
                                                                        if (var6 < va.field_k.length) {
                                                                          va.field_k[var6] = 0;
                                                                          var6++;
                                                                          if (var10 == 0) {
                                                                            continue;
                                                                          }
                                                                        } else {
                                                                          param2 = true;
                                                                        }
                                                                        break;
                                                                      }
                                                                      dc.field_g = 0;
                                                                    }
                                                                    re.field_eb = -1;
                                                                    var6 = param2 ? 1 : 0;
                                                                    var7 = vb.field_g;
                                                                    if (5 == var7 ||
                                                                      var7 == 6 ||
                                                                      var7 == 8) {
                                                                      var7 = gh.field_Jb;
                                                                    }
                                                                    q.a(14, var6 != 0, -1, var7);
                                                                    hl.field_v = ji.a(uc.field_b, (byte) -67, di.field_c);
                                                                    hl.field_v.b(6993661, -110);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if (decompiledFrameRemainder14) {
                                                                    if (!this.field_g.c(0)) {
                                                                      break L1;
                                                                    }
                                                                    ea.field_k = false;
                                                                    var6 = param2 ? 1 : 0;
                                                                    var7 = vb.field_g;
                                                                    if (var7 == 5 ||
                                                                      var7 == 6 ||
                                                                      var7 == 8) {
                                                                      var7 = gh.field_Jb;
                                                                    }
                                                                    q.a(7, var6 != 0, -1, var7);
                                                                    if (var10 == 0) {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                  if (this.field_c == 19) {
                                                                    gh.field_Jb = 0;
                                                                  }
                                                                  if (!this.field_g.c(0)) {
                                                                    break L1;
                                                                  }
                                                                  if (this.field_c == 7 &&
                                                                    gh.field_Jb != 0) {
                                                                    ea.field_k = true;
                                                                  }
                                                                  var6 = gh.field_Jb;
                                                                  var7 = param2 ? 1 : 0;
                                                                  var8 = vb.field_g;
                                                                  if (var8 == 5 ||
                                                                    var8 == 6 ||
                                                                    var8 == 8) {
                                                                    var8 = gh.field_Jb;
                                                                  }
                                                                  q.a(var6, var7 != 0, -1, var8);
                                                                  if (var10 == 0) {
                                                                    break L1;
                                                                  }
                                                                }
                                                                if (!this.field_g.c(0)) {
                                                                  break L1;
                                                                }
                                                                var6 = param2 ? 1 : 0;
                                                                var7 = vb.field_g;
                                                                if (var7 == 5 ||
                                                                  var7 == 6 ||
                                                                  var7 == 8) {
                                                                  var7 = gh.field_Jb;
                                                                }
                                                                q.a(6, var6 != 0, -1, var7);
                                                                if (var10 == 0) {
                                                                  break L1;
                                                                }
                                                              }
                                                              if (!this.field_g.c(0)) {
                                                                break L1;
                                                              }
                                                              if (this.field_c == 9) {
                                                                var6 = param2 ? 1 : 0;
                                                                q.a(5, var6 != 0, -1, 0);
                                                                if (var10 == 0) {
                                                                  break L1;
                                                                }
                                                              }
                                                              var6 = param2 ? 1 : 0;
                                                              var7 = vb.field_g;
                                                              if (var7 == 5 ||
                                                                6 == var7 ||
                                                                8 == var7) {
                                                                var7 = gh.field_Jb;
                                                              }
                                                              q.a(5, var6 != 0, -1, var7);
                                                              if (var10 == 0) {
                                                                break L1;
                                                              }
                                                            }
                                                            var4_int = 0;
                                                            var6 = 0;
                                                            if (this.field_g.b(117) &&
                                                              lb.field_ac > 0) {
                                                              bb.a(0, (byte) 64);
                                                              var6 = 1;
                                                            }
                                                            if (this.field_g.a((byte) 105) &&
                                                              lb.field_ac < 256) {
                                                              var6 = 1;
                                                              bb.a(256, (byte) 64);
                                                            }
                                                            if (this.field_g.a(0)) {
                                                              var7 = this.g(125, param1) + this.a(param1, (byte) 118) + le.field_K - 170 >> 1;
                                                              var8Lifetime2 = oh.field_f - var7 + 2;
                                                              var9 = 256 * var8Lifetime2 / 170;
                                                              if (0 >= var9) {
                                                                bb.a(0, (byte) 64);
                                                                if (var10 != 0) {
                                                                  if (var9 < 256) {
                                                                    bb.a(var9, (byte) 64);
                                                                    bb.a(256, (byte) 64);
                                                                  } else {
                                                                    bb.a(256, (byte) 64);
                                                                  }
                                                                }
                                                              } else {
                                                                if (var9 < 256) {
                                                                  bb.a(var9, (byte) 64);
                                                                  if (var10 != 0) {
                                                                    bb.a(256, (byte) 64);
                                                                  }
                                                                } else {
                                                                  bb.a(256, (byte) 64);
                                                                }
                                                              }
                                                              var6 = 1;
                                                            }
                                                            if (this.field_g.d(-97) &&
                                                              lb.field_ac > 0) {
                                                              var6 = 1;
                                                              ij.k(-44);
                                                            }
                                                            if (this.field_g.c((byte) 51) &&
                                                              lb.field_ac < 256) {
                                                              r.b((byte) 46);
                                                              var6 = 1;
                                                            }
                                                            if (var6 != 0 && (!this.field_g.a(0) ||
                                                              !(a.field_c <= gb.field_a))) {
                                                              ee.c(-2483, 0);
                                                              gb.field_a = a.field_c + 20;
                                                            }
                                                            if (var10 == 0) {
                                                              break L1;
                                                            }
                                                          }
                                                          if (this.field_g.b(126)) {
                                                            ef.a(1, 0);
                                                          }
                                                          var4_int = 0;
                                                          if (this.field_g.a((byte) -120)) {
                                                            ef.a(1, 256);
                                                          }
                                                          if (this.field_g.a(0)) {
                                                            var6 = -170 + (this.g(125, param1) + this.a(param1, (byte) 110)) + le.field_K >> 1;
                                                            var7 = -var6 + oh.field_f + 2;
                                                            var8Lifetime1 = var7 * 256 / 170;
                                                            if (var8Lifetime1 <= 0) {
                                                              ef.a(1, 0);
                                                              if (var10 != 0) {
                                                                if (var8Lifetime1 < 256) {
                                                                  ef.a(1, var8Lifetime1);
                                                                  ef.a(1, 256);
                                                                } else {
                                                                  ef.a(1, 256);
                                                                }
                                                              }
                                                            } else {
                                                              if (var8Lifetime1 < 256) {
                                                                ef.a(1, var8Lifetime1);
                                                                if (var10 != 0) {
                                                                  ef.a(1, 256);
                                                                }
                                                              } else {
                                                                ef.a(1, 256);
                                                              }
                                                            }
                                                          }
                                                          if (this.field_g.d(-97)) {
                                                            s.b(125);
                                                          }
                                                          if (!this.field_g.c((byte) 51)) {
                                                            break L1;
                                                          }
                                                          un.a((byte) 125);
                                                          if (var10 == 0) {
                                                            break L1;
                                                          }
                                                        }
                                                        if (!this.field_g.c(0)) {
                                                          break L1;
                                                        }
                                                        if (wb.field_c != null) {
                                                          ub.c(0);
                                                          if (var10 == 0) {
                                                            break L1;
                                                          }
                                                        }
                                                        var6 = param2 ? 1 : 0;
                                                        si.field_y = false;
                                                        ag.a(-4, var6 != 0);
                                                        if (var10 == 0) {
                                                          break L1;
                                                        }
                                                      }
                                                      if (!this.field_g.c(0)) {
                                                        break L1;
                                                      }
                                                      var6 = 0;
                                                      var7 = di.field_g;
                                                      if (0 == var7 || var7 == 1 &&
                                                        var10 == 0 || 7 == var7 &&
                                                        var10 == 0 || var7 == 3 &&
                                                        var10 == 0 || var7 == 5 || 9 == var7 &&
                                                        var10 == 0 || var7 == 10) {
                                                        var6 = 1;
                                                      }
                                                      if (var6 != 0) {
                                                        fk.field_i.i(77);
                                                      }
                                                      if (var6 == 0 ||
                                                        var10 != 0) {
                                                        boolean decompiledSharedTail0 = (di.field_g != 4);
                                                        if (!decompiledSharedTail0) {
                                                          hl.field_v = ji.a(uc.field_b, (byte) 109, di.field_c);
                                                          lc.field_e = true;
                                                          ea.field_k = false;
                                                          var7 = vb.field_g;
                                                          if (var7 == 5 ||
                                                            var7 == 6 ||
                                                            var7 == 8) {
                                                            var7 = gh.field_Jb;
                                                          }
                                                          q.a(14, false, -1, var7);
                                                          decompiledSharedTail0 = (var10 != 0);
                                                        }
                                                        if (decompiledSharedTail0) {
                                                          fk.field_i.a((byte) 30, param2);
                                                          ea.field_k = false;
                                                          lc.field_e = true;
                                                        }
                                                      }
                                                      if (var10 == 0) {
                                                        break L1;
                                                      }
                                                    }
                                                    if (!this.field_g.c(0)) {
                                                      break L1;
                                                    }
                                                    fk.field_i.m(1125);
                                                    var6 = param2 ? 1 : 0;
                                                    q.a(-1, var6 != 0, -1, 0);
                                                    if (var10 == 0) {
                                                      break L1;
                                                    }
                                                  }
                                                  if (!this.field_g.c(0)) {
                                                    break L1;
                                                  }
                                                  fk.field_i.c(126);
                                                  var6 = param2 ? 1 : 0;
                                                  q.a(-1, var6 != 0, -1, 0);
                                                  if (var10 == 0) {
                                                    break L1;
                                                  }
                                                }
                                                if (!this.field_g.c(0)) {
                                                  break L1;
                                                }
                                                fk.field_i.a(false);
                                                var6 = param2 ? 1 : 0;
                                                q.a(-1, var6 != 0, -1, 0);
                                                if (var10 == 0) {
                                                  break L1;
                                                }
                                              }
                                              if (!this.field_g.c(0)) {
                                                break L1;
                                              }
                                              if (ob.field_y) {
                                                var6 = param2 ? 1 : 0;
                                                var7 = vb.field_g;
                                                if (var7 == 5 ||
                                                  6 == var7 ||
                                                  var7 == 8) {
                                                  var7 = gh.field_Jb;
                                                }
                                                q.a(-5, var6 != 0, -1, var7);
                                              }
                                              if (!ee.field_G) {
                                                break L1;
                                              }
                                              ei.a(0, (byte) -23, 11);
                                              if (var10 == 0) {
                                                break L1;
                                              }
                                            }
                                            if (!this.field_g.c(0)) {
                                              break L1;
                                            }
                                            d.field_R = 0;
                                            if (var10 == 0) {
                                              break L1;
                                            }
                                          }
                                          if (!this.field_g.c(0)) {
                                            break L1;
                                          }
                                          d.field_R = 1;
                                          if (var10 == 0) {
                                            break L1;
                                          }
                                        }
                                        if (!this.field_g.c(0)) {
                                          break L1;
                                        }
                                        d.field_R = 2;
                                        if (var10 == 0) {
                                          break L1;
                                        }
                                      }
                                      if (!this.field_g.c(0)) {
                                        break L1;
                                      }
                                      on.field_j = 0;
                                      if (var10 == 0) {
                                        break L1;
                                      }
                                    }
                                    if (!this.field_g.c(0)) {
                                      break L1;
                                    }
                                    on.field_j = 1;
                                    if (var10 == 0) {
                                      break L1;
                                    }
                                  }
                                  if (!this.field_g.c(0)) {
                                    break L1;
                                  }
                                  si.field_y = false;
                                  if (20 == this.field_c ||
                                    this.field_c == 19) {
                                    stackIn_737_0 = (fm.field_f[0] < 3) ? 20 : 19;
                                    v.a(stackIn_737_0, (String) null, 10);
                                    if (var10 == 0) {
                                      break L1;
                                    }
                                  }
                                  if (this.field_c == 10) {
                                    v.a(9, (String) null, 10);
                                    if (var10 == 0) {
                                      break L1;
                                    }
                                  }
                                  if (8 != this.field_c &&
                                    5 != pm.field_T &&
                                    pm.field_T != 6 &&
                                    14 != pm.field_T) {
                                    break L1;
                                  }
                                  v.a(this.field_c, pl.field_Q, 10);
                                  if (var10 == 0) {
                                    break L1;
                                  }
                                }
                                if (this.field_g.c(0) &&
                                  this.a(121, param1)) {
                                  nk.field_J = 500;
                                  ol.field_Ub = ol.field_Ub - 1;
                                  if (var10 == 0) {
                                    break L1;
                                  }
                                }
                                var4_int = 0;
                                if (var10 == 0) {
                                  break L1;
                                }
                              }
                              if (this.field_g.c(0) &&
                                this.a(126, param1)) {
                                ol.field_Ub = ol.field_Ub + 1;
                                nk.field_J = 500;
                                if (var10 == 0) {
                                  break L1;
                                }
                              }
                              var4_int = 0;
                              if (var10 == 0) {
                                break L1;
                              }
                            }
                            if (!this.field_g.c(0)) {
                              break L1;
                            }
                            t.a(true, wl.d((byte) -21));
                            if (var10 == 0) {
                              break L1;
                            }
                          }
                          if (!this.field_g.c(0)) {
                            break L1;
                          }
                          if (nk.f((byte) -28)) {
                            break L1;
                          }
                          var6 = param2 ? 1 : 0;
                          var7 = vb.field_g;
                          if (var7 == 5 ||
                            6 == var7 ||
                            8 == var7) {
                            var7 = gh.field_Jb;
                          }
                          q.a(21, var6 != 0, -1, var7);
                          if (var10 == 0) {
                            break L1;
                          }
                        }
                        if (!this.field_g.c(0)) {
                          break L1;
                        }
                        ve.a((byte) 122);
                        ij.field_Y = -1;
                        f.field_A = null;
                        ti.field_B = null;
                        fg.field_Ob = 1;
                        vn.d(-68);
                        var6 = 0;
                        while (true) {
                          if (var6 < va.field_k.length) {
                            va.field_k[var6] = 0;
                            var6++;
                            if (var10 == 0) {
                              continue;
                            }
                          } else {
                            dc.field_g = 0;
                          }
                          break;
                        }
                        if (var10 == 0) {
                          break L1;
                        }
                      }
                      if (!this.field_g.c(0)) {
                        break L1;
                      }
                      var6Lifetime2 = param2 ? 1 : 0;
                      var7Lifetime2 = vb.field_g;
                      if (5 == var7Lifetime2 ||
                        var7Lifetime2 == 6 ||
                        8 == var7Lifetime2) {
                        var7Lifetime2 = gh.field_Jb;
                      }
                      q.a(17, var6Lifetime2 != 0, -1, var7Lifetime2);
                      if (var10 == 0) {
                        break L1;
                      }
                    }
                    if (!this.field_g.c(0)) {
                      break L1;
                    }
                    var6Lifetime1 = param2 ? 1 : 0;
                    var7Lifetime1 = vb.field_g;
                    if (var7Lifetime1 == 5 ||
                      var7Lifetime1 == 6 ||
                      var7Lifetime1 == 8) {
                      var7Lifetime1 = gh.field_Jb;
                    }
                    q.a(22, var6Lifetime1 != 0, -1, var7Lifetime1);
                    if (var10 == 0) {
                      break L1;
                    }
                  }
                  if (!this.field_g.c(0)) {
                    break L1;
                  }
                  stackIn_856_0 = !(dm.field_c);
                  dm.field_c = stackIn_856_0;
                  gd.field_sb = null;
                  stackIn_859_0 = ti.field_A;
                  stackIn_859_1 = 42;
                  if (!dm.field_c) {
                    stackIn_860_2 = od.field_j;
                  } else {
                    stackIn_860_2 = qm.field_c;
                  }
                  stackIn_859_0[stackIn_859_1] = stackIn_860_2;
                  if (ni.b(81)) {
                    break L1;
                  }
                  um.f((byte) 3);
                  if (var10 == 0) {
                    break L1;
                  }
                }
                if (this.a(125, param1) &&
                  this.field_g.c(0)) {
                  stackIn_876_0 = !(ui.field_G);
                  ui.field_G = stackIn_876_0;
                  stackIn_879_0 = ti.field_A;
                  stackIn_879_1 = 43;
                  if (!ui.field_G) {
                    stackIn_880_2 = fj.field_i;
                  } else {
                    stackIn_880_2 = tm.field_f;
                  }
                  stackIn_879_0[stackIn_879_1] = stackIn_880_2;
                  if (ni.b(45)) {
                    break L1;
                  }
                  um.f((byte) 3);
                  if (var10 == 0) {
                    break L1;
                  }
                }
                var4_int = 0;
                if (var10 == 0) {
                  break L1;
                }
              }
              if (this.a(125, param1) &&
                this.field_g.c(0)) {
                stackIn_897_0 = !(ik.field_h);
                ik.field_h = stackIn_897_0;
                stackIn_900_0 = ti.field_A;
                stackIn_900_1 = 44;
                if (!ik.field_h) {
                  stackIn_901_2 = sa.field_b;
                } else {
                  stackIn_901_2 = o.field_a;
                }
                stackIn_900_0[stackIn_900_1] = stackIn_901_2;
                if (ni.b(12)) {
                  break L1;
                }
                um.f((byte) 3);
                if (var10 == 0) {
                  break L1;
                }
              }
              var4_int = 0;
              if (var10 == 0) {
                break L1;
              }
            }
            if (!this.a(127, param1) ||
              !this.field_g.c(0)) {
              var4_int = 0;
              if (var10 == 0) {
                break L1;
              }
            }
            gd.field_sb = null;
            stackIn_919_0 = !(tj.field_a);
            tj.field_a = stackIn_919_0;
            stackIn_922_0 = ti.field_A;
            stackIn_922_1 = 47;
            if (!tj.field_a) {
              stackIn_923_2 = he.field_d;
            } else {
              stackIn_923_2 = qj.field_u;
            }
            stackIn_922_0[stackIn_922_1] = stackIn_923_2;
            if (!ni.b(75)) {
              um.f((byte) 3);
            }
          }
          if (var4_int != 0) {
            ee.c(-2483, 95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0) {
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        try {
          var2_int = -1;
          if (param0 != -120) {
            this.b(false);
          }
          var3 = ei.field_q;
          switch ((var4 == 0
            || var3 == 98
            ) ? var3 : -1) {
            case 96:
              var2_int = this.b((byte) -20);
              if (var4 == 0) {
                break;
              }
            case 97:
              var2_int = this.f((byte) 32);
              if (var4 == 0) {
                break;
              }
            case 99:
              var2_int = this.g(param0 + 83);
              if (var4 == 0) {
                break;
              }
            case 98:
              var2_int = this.d(-119);
            default:
              break;
          }
          if (var2_int != -1) {
            this.field_g.a(param0 ^ -120, var2_int);
            return;
          }
          if (7 != pm.field_T) {
            if (5 == pm.field_T &&
              !ni.b(param0 ^ -100)) {
              this.l(-1);
              if (var4 == 0) {
                return;
              }
            }
            if (6 == pm.field_T &&
              !ni.b(86)) {
              this.c((byte) 116);
              if (var4 == 0) {
                return;
              }
            }
            if (pm.field_T != 14) {
              if (pm.field_T != 13) {
                if (16 != pm.field_T) {
                  if (0 == pm.field_T) {
                    if (this.field_g.field_e >= 0 &&
                      uc.field_e[pm.field_T].length > this.field_g.field_e &&
                      uc.field_e[pm.field_T][this.field_g.field_e] != 34) {
                      dh.field_F = this.field_g.field_e;
                    }
                    boolean decompiledFrameCompleted0 = true;
                    if (ei.field_q == 96 &&
                      0 >= rd.field_b) {
                      var3 = 0;
                      while (!(uc.field_e[pm.field_T].length <= var3)) {
                        stackIn_90_0 = -35;
                        stackIn_90_1 = ~uc.field_e[pm.field_T][var3];
                        if (var4 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        if (stackIn_90_0 == stackIn_90_1) {
                          dh.field_F = this.field_g.field_e;
                          this.field_g.field_e = var3;
                          return;
                        }
                        var3++;
                      }
                    }
                    if (decompiledFrameCompleted0) {
                      stackIn_90_0 = ei.field_q;
                      stackIn_90_1 = 97;
                    }
                    if (stackIn_90_0 == stackIn_90_1) {
                      var3 = this.field_g.field_e;
                      if (var3 >= 0 &&
                        var3 < uc.field_e[pm.field_T].length &&
                        34 == uc.field_e[pm.field_T][var3]) {
                        this.field_g.field_e = dh.field_F;
                        return;
                      }
                    }
                    this.field_g.a(true);
                    if (var4 == 0) {
                      return;
                    }
                  }
                  this.field_g.a(true);
                  if (var4 == 0) {
                    return;
                  }
                }
                this.q(param0 - 30628);
                if (var4 == 0) {
                  return;
                }
              }
              this.k(-112);
              if (var4 == 0) {
                return;
              }
            }
            this.b(16383);
            if (var4 == 0) {
              return;
            }
          }
          this.e((byte) -108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.I(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + ee.a("%0a", param0, "\n", param1 ^ -29743));
        if (param1 != -29771) {
          field_e = -33;
        }
    }

    private final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_19_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.a((byte) -79);
          }
          stackIn_19_0 = (this.field_c == 1) || (2 == this.field_c) || (this.field_c == 3) || (this.field_c == 4) || (this.field_c == 22);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.E(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        u var3 = null;
        String var4 = null;
        try {
          int var2_int = 73 % ((param0 + 34) / 34);
          var3 = pl.field_U;
          var4 = lb.field_hc;
          ((mi) ((Object) var3)).a(var4, 320, 240, 1021128, -1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.OA(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        if (null == va.field_c) {
          return;
        }
        try {
          va.field_c.d(-1);
          if (param0 != 7165) {
            this.h(-118);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.B(" + param0 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -55) {
            return;
          }
          pb.h(40, 80, 560, 330, 3487029);
          pb.h(41, 81, 558, 328, 3487029);
          if (ni.b(25)) {
            this.j(60);
            if (SteelSentinels.field_G == 0) {
              return;
            }
          }
          this.j((byte) 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.HA(" + param0 + ')');
        }
    }

    private final void i(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SteelSentinels.field_G;
        try {
          if (gd.field_sb != null) {
            if (dm.field_c) {
              ff.field_lb.a(lc.field_a, pg.field_w);
              if (var3 != 0) {
                ff.field_lb.a(ub.field_a, pg.field_w);
              }
            } else {
              ff.field_lb.a(ub.field_a, pg.field_w);
            }
            boolean decompiledSharedTail0 = (od.field_e ||
              pm.field_U != 0);
            if (!decompiledSharedTail0) {
              pb.a(jj.field_a.field_Rb, jj.field_a.field_cb, jj.field_a.field_zb, jj.field_a.field_Lb, 0);
              jj.field_a.a(true, (byte) 127);
              decompiledSharedTail0 = (var3 != 0);
            }
            if (decompiledSharedTail0) {
              gd.field_sb.a(true, (byte) 126);
              ff.field_lb.a(jc.field_c, bb.field_X);
            }
          }
          var2_int = -33 % ((-71 - param0) / 55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.BB(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int[] stackIn_30_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        try {
          boolean decompiledSharedTail0 = (lb.field_gc != 1 ||
            !(q.field_i > 0) ||
            !(hd.field_i < (dh.field_C.length - 1)));
          if (!decompiledSharedTail0) {
            ee.c(-2483, 95);
            hd.field_i = hd.field_i + 1;
            in.field_k = -1;
            decompiledSharedTail0 = (var4 != 0);
          }
          if ((decompiledSharedTail0) && (lb.field_gc == 1 &&
            q.field_i < 0 &&
            0 < hd.field_i)) {
            ee.c(-2483, 95);
            in.field_k = -1;
            hd.field_i = hd.field_i - 1;
          }
          if (!param0) {
            this.field_g = (rm) null;
          }
          vn.field_o = 4;
          if (param1) {
            stackIn_30_0 = ce.field_t;
          } else {
            stackIn_30_0 = ge.field_m;
          }
          var3 = stackIn_30_0;
          if (0 <= ao.field_C &&
            ol.a(var3, ao.field_C, 31) &&
            ve.a(ao.field_A, 1, ao.field_C)) {
            ao.field_C = -1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((lb.field_gc != 1) &&
            (decompiledFrameRemainder0 = !(ao.field_C < 0)) &&
            (decompiledFrameRemainder0 = (~ao.field_C != ~un.field_i)) &&
            (decompiledFrameRemainder0 = (ao.field_C != in.field_k))) {
            ee.c(-2483, 97);
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ao.field_C != -1) {
              ee.c(-2483, 0);
            }
            if (~ao.field_C == ~in.field_k) {
              in.field_k = -1;
              if ((var4 != 0) &&
                (-1 != ao.field_C)) {
                in.field_k = ao.field_C;
              }
            } else {
              if (-1 != ao.field_C) {
                in.field_k = ao.field_C;
              }
            }
          }
          un.field_i = ao.field_C;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "ji.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int stackIn_14_0 = 0;
        String stackIn_40_0 = null;
        u stackIn_179_0 = null;
        int stackIn_233_0 = 0;
        wk[] stackIn_275_0 = null;
        int stackIn_279_0 = 0;
        wk stackIn_351_0 = null;
        int stackIn_351_1 = 0;
        int stackIn_351_2 = 0;
        int stackIn_352_3 = 0;
        wk stackIn_355_0 = null;
        int stackIn_355_1 = 0;
        int stackIn_355_2 = 0;
        int stackIn_356_3;
        int stackIn_367_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        u var10 = null;
        int var11 = 0;
        Object var12_ref = null;
        int var12 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        wk[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        wk[] var20Lifetime1;
        wk[] var20Lifetime2;
        wk[] var20Lifetime3;
        int var9Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        var24 = SteelSentinels.field_G;
        try {
          var4_int = uc.field_e[this.field_c][param0];
          var5 = 0;
          var6 = 0;
          if (1 == var4_int ||
            var4_int == 33 ||
            39 == var4_int) {
            stackIn_14_0 = (ib.a(param2 ^ -30230)) ? 0 : 1;
            var6 = stackIn_14_0;
          }
          if (var4_int == 28 &&
            gi.h((byte) -72) &&
            0 != (32 & a.field_c)) {
            var5 = 13548069;
          }
          if (var6 == 0 &&
            var4_int == 0 &&
            !vb.b(106) &&
            (a.field_c & 32) == 0) {
            var5 = 13696896;
          }
          if (var4_int < 0) {
            stackIn_40_0 = null;
          } else {
            stackIn_40_0 = ti.field_A[var4_int];
          }
          var7 = stackIn_40_0;
          var8 = 0;
          if (param2 != 30241) {
            return;
          }
          var9 = di.field_g;
          if (var9 == 0 ||
            var9 == 1 ||
            var9 == 7 ||
            (var9 == 3 &&
            var24 == 0 ||
            5 == var9 &&
            var24 == 0 ||
            var9 == 9 &&
            var24 == 0) ||
            var9 == 10) {
            var8 = 1;
          }
          if (var4_int == 9 &&
            var8 != 0) {
            var7 = ec.field_f;
          }
          if ((var4_int != 9 ||
            var8 == 0 || var24 != 0) && (var4_int == 9 &&
            di.field_g == 4)) {
            var7 = lb.field_fc;
          }
          if (var6 != 0) {
            var7 = var7 + " " + (33 * al.field_g / ua.field_r + 33 * cb.field_l) + "%";
          }
          boolean decompiledFrameRemainder0 = true;
          if (var4_int == 8) {
            if (gh.field_Jb != 0 &&
              vb.field_g != 0 &&
              gh.field_Jb != 12 &&
              vb.field_g != 12) {
              if (gh.field_Jb == 1 ||
                vb.field_g == 1) {
                var7 = un.field_d;
                decompiledFrameRemainder0 = (var24 != 0);
              }
              if ((decompiledFrameRemainder0) && (gh.field_Jb == 2 ||
                2 == vb.field_g ||
                3 == gh.field_Jb ||
                vb.field_g == 3 ||
                4 == gh.field_Jb ||
                4 == vb.field_g)) {
                var7 = fb.field_k;
                if (var24 != 0) {
                  var7 = ti.field_A[7];
                }
              }
            } else {
              var7 = ti.field_A[7];
            }
          }
          var9Lifetime1 = -1;
          if (var4_int == 38) {
            boolean decompiledFrameRemainder1 = true;
            var7 = oe.field_j;
            var10_int = param0 / 10;
            var11 = param0 % 10;
            var12_ref = null;
            var13_ref_String = "0f94c8";
            var14_ref_String = var13_ref_String;
            var15 = 0;
            var16 = -1;
            var5 = 0;
            if (var11 < fm.field_f[var10_int]) {
              var17 = var10_int;
              if (var17 != 0 ||
                var24 != 0) {
                if (1 == var17) {
                  var12_ref = qa.a(-1, jh.field_a[var11]);
                  var16 = ed.field_c[1][var11];
                  var15 = jh.field_a[var11];
                  decompiledFrameRemainder1 = false;
                }
                if (((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (var17 == 2))) && (var24 == 0)) {
                  var12_ref = qa.a(param2 ^ -30242, jh.field_a[10 + var11]);
                  var15 = jh.field_a[var11 + 10];
                  var16 = ed.field_c[2][var11];
                  decompiledFrameRemainder1 = false;
                }
              }
              if (decompiledFrameRemainder1) {
                var12_ref = gh.field_jb[5];
              }
            } else {
              if (this.b(false, var10_int, var11)) {
                var14_ref_String = "8fdfff";
                var12_ref = gh.field_jb[6];
              } else {
                var14_ref_String = "194761";
                var12_ref = gh.field_jb[4];
              }
            }
            if (param1) {
              var13_ref_String = "000000";
              var14_ref_String = var13_ref_String;
            }
            var7 = db.a(var7, -27, new String[]{Integer.toString(var11 + 1), (String) (var12_ref), var13_ref_String, var14_ref_String});
            if (-1 != var16) {
              if (var15 <= var16) {
                var9Lifetime1 = 8;
                if (var24 != 0 &&
                  (3 * var16 / 2) >= var15) {
                  var9Lifetime1 = 25;
                }
              } else {
                if ((3 * var16 / 2) >= var15) {
                  var9Lifetime1 = 25;
                }
              }
            }
            if (param1 &&
              var11 <= fm.field_f[var10_int]) {
              var9Lifetime1 = -1;
              var7 = um.field_cb[var11 + var10_int * 10];
            }
          }
          var7 = ke.a(42, var7);
          var10 = pl.field_U;
          var11 = 0;
          if (this.field_c == 0) {
            var10 = ui.field_U;
          }
          if (var4_int == 39) {
            var11 = 1;
            if (var6 == 0) {
              stackIn_179_0 = ui.field_U;
            } else {
              stackIn_179_0 = pl.field_U;
            }
            var10 = stackIn_179_0;
          }
          var12 = ((mi) ((Object) var10)).c(var7);
          var13 = this.g(127, param0);
          var14 = this.a(param0, (byte) 109);
          var15Lifetime1 = this.b(param0, (byte) 27);
          if (var4_int == 20 ||
            var4_int == 21) {
            var12 = 170 + le.field_K;
          }
          var16Lifetime1 = var14 - (-var13 + var12) >> 1;
          var17Lifetime1 = this.c(25, param0);
          var18 = var14 - var13;
          var19 = this.c(25, param0);
          var20 = ag.field_o;
          if (param1) {
            var20Lifetime1 = vk.field_l;
          }
          if (var4_int == 14 &&
            d.field_R == 0 ||
            var4_int == 15 &&
            1 == d.field_R ||
            var4_int == 16 &&
            d.field_R == 0 ||
            var4_int == 17 &&
            on.field_j == 0 ||
            var4_int == 18 &&
            on.field_j == 1) {
            var20Lifetime2 = ja.field_e;
          }
          var20Lifetime3 = pl.field_T;
          if (var4_int == 38 ||
            var4_int == 25 ||
            var4_int == 26 ||
            var4_int == 39) {
            var20Lifetime3 = sa.field_e;
          }
          stackIn_233_0 = (param1) ? 1044724 : 1021128;
          var21 = stackIn_233_0;
          if ((var4_int == 38 ||
            25 == var4_int ||
            var4_int == 26) && (this.a(param2 - 30122, param0) &&
            param1)) {
            var20Lifetime3 = wc.field_d;
            var21 = 0;
          }
          if (!this.a(-2) && (this.field_c != 17 ||
            !(0 > this.b(-125, param0))) && var4_int != 39 && (this.field_c != 5 ||
            !(this.b(-73, param0) < 0))) {
            if ((this.field_c == 6) &&
              (!(this.b(-81, param0) >= 0))) {
              if (param1) {
                stackIn_275_0 = wc.field_d;
              } else {
                stackIn_275_0 = hk.field_Tb;
              }
              var20Lifetime3 = stackIn_275_0;
              stackIn_279_0 = (param1) ? 0 : 1146810;
              var21 = stackIn_279_0;
            }
          } else {
            if (param1) {
              stackIn_275_0 = wc.field_d;
            } else {
              stackIn_275_0 = hk.field_Tb;
            }
            var20Lifetime3 = stackIn_275_0;
            stackIn_279_0 = (param1) ? 0 : 1146810;
            var21 = stackIn_279_0;
          }
          if (var5 != 0) {
            var21 = var5;
            if (param1) {
              var21 = var21 | 8978312;
            }
          }
          if (var4_int == 20 ||
            var4_int == 21) {
            jm.a(var15Lifetime1, var19, var20Lifetime3, 1, -3 + le.field_K + var13, 176);
          }
          if (var4_int != 20 &&
            var4_int != 21 || var24 != 0) {
            jm.a(var15Lifetime1, var19, var20Lifetime3, 1, var13, var18);
          }
          if (!this.a(param2 ^ 30292, param0)) {
            var21 = 7829367;
            if (param1 &&
              25 != var4_int &&
              var4_int != 26) {
              var21 = 11184895;
            }
          }
          if (25 == var4_int) {
            var22 = var13 + (-el.field_Ub.field_A + (var14 - var13)) / 2;
            var23 = var15Lifetime1 + (-el.field_Ub.field_F + var19) / 2;
            var7 = "";
            if (var21 == 1021128) {
              var21 = 2061990;
            }
            if (var21 == 7829367) {
              var21 = 930889;
            }
            el.field_Ub.c(var22, var23, var21);
          }
          if (25 != var4_int ||
            var24 != 0) {
            if (var4_int == 26) {
              var22Lifetime1 = (var14 - var13 - gm.field_b.field_A) / 2 + var13;
              if (1021128 == var21) {
                var21 = 2061990;
              }
              var23Lifetime1 = var15Lifetime1 + (var19 - gm.field_b.field_F) / 2;
              var7 = "";
              if (var21 == 7829367) {
                var21 = 930889;
              }
              gm.field_b.c(var22Lifetime1, var23Lifetime1, var21);
            }
            if (var4_int != 26 ||
              var24 != 0) {
              if (var4_int == 20 ||
                21 == var4_int) {
                ((mi) ((Object) var10)).b(var7, 14 + var13, var17Lifetime1 / 5 + var15Lifetime1 + ((mi) ((Object) var10)).field_G, 1146810, -1);
              }
              if (var4_int != 20 &&
                21 != var4_int || var24 != 0) {
                if (var12 > (-var13 + var14) ||
                  var11 != 0) {
                  if (var6 != 0) {
                    var21 = 11417637;
                  }
                  ((mi) ((Object) var10)).a(var7, var13, var15Lifetime1, var18, var17Lifetime1, var21, -1, 1, 1, 0);
                }
                if (!(var12 > (-var13 + var14)) &&
                  var11 == 0 || var24 != 0) {
                  if (var6 != 0) {
                    var21 = 11417637;
                  }
                  ((mi) ((Object) var10)).b(var7, var16Lifetime1, ((mi) ((Object) var10)).field_G + (var15Lifetime1 + var17Lifetime1 / 5), var21, -1);
                  if (var9Lifetime1 != -1) {
                    pb.a(var13 + 2, 0, var14 - 2, 480);
                    stackIn_351_0 = pd.field_Z[var9Lifetime1];
                    stackIn_351_1 = var16Lifetime1 + var12;
                    stackIn_351_2 = var15Lifetime1 + 2;
                    if (var9Lifetime1 != 8) {
                      stackIn_352_3 = 150;
                    } else {
                      stackIn_352_3 = 192;
                    }
                    ((wk) (Object) stackIn_351_0).a(stackIn_351_1, stackIn_351_2, stackIn_352_3);
                    stackIn_355_0 = pd.field_Z[var9Lifetime1];
                    stackIn_355_1 = -28 + var16Lifetime1;
                    stackIn_355_2 = var15Lifetime1 + 2;
                    if (8 == var9Lifetime1) {
                      stackIn_356_3 = 192;
                    } else {
                      stackIn_356_3 = 150;
                    }
                    ((wk) (Object) stackIn_355_0).a(stackIn_355_1, stackIn_355_2, stackIn_356_3);
                    pb.c();
                  }
                }}}}
          if (var4_int != 20 &&
            var4_int != 21) {
            return;
          }
          var16Lifetime1 = var16Lifetime1 + le.field_K;
          if (var4_int != 20) {
            stackIn_367_0 = 170 * ll.field_q / 256;
          } else {
            stackIn_367_0 = lb.field_ac * 170 / 256;
          }
          var22Lifetime2 = stackIn_367_0;
          pb.a(-1 + (var22Lifetime2 + var16Lifetime1), 3 + var15Lifetime1, 170 + (-var22Lifetime2 + 1), -6 + var17Lifetime1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void q(int param0) {
        if (va.field_c == null) {
          return;
        }
        if (param0 != -30748) {
          return;
        }
        try {
          va.field_c.b(-12986);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.FB(" + param0 + ')');
        }
    }

    private final void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException runtimeException = null;
        u var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var13Lifetime1;
        String var13Lifetime2;
        String var13Lifetime3;
        String var13Lifetime4;
        String var13Lifetime5;
        var18 = SteelSentinels.field_G;
        try {
          var10 = pl.field_U;
          var11 = 1021128;
          var12 = param7 + (param4 + param6);
          if (var12 != 0) {
            param6 = (var12 + param6 * 200) / (var12 * 2);
            param4 = (200 * param4 + var12) / (var12 * 2);
            param7 = (200 * param7 + var12) / (var12 * 2);
          }
          if (param3) {
            var13_int = -11 + param2;
            var14 = 13;
            var15 = 0;
            while (!(var15 >= oe.field_h.length - 1)) {
              var16 = oe.field_h[var15];
              var17 = oe.field_h[var15 + 1];
              pb.a(var16 + 3, var13_int, var17 - (var16 + 5), var14, 12105);
              var15++;
              if (var18 == 0) {
                continue;
              }
              break;
            }
          }
          var13 = param0;
          ((mi) ((Object) var10)).b(var13, 5 + oe.field_h[0], param2, var11, -1);
          var13Lifetime1 = Integer.toString(param5);
          ((mi) ((Object) var10)).c(var13Lifetime1, -1 + oe.field_h[2] - 5, param2, var11, -1);
          var13Lifetime2 = Integer.toString(var12);
          ((mi) ((Object) var10)).c(var13Lifetime2, oe.field_h[3] - 5 - 1, param2, var11, -1);
          var13Lifetime3 = param7 + "%";
          ((mi) ((Object) var10)).c(var13Lifetime3, -6 + oe.field_h[4], param2, var11, -1);
          var13Lifetime4 = param6 + "%";
          if (param8 > -125) {
            this.a(-34, false, -5);
          }
          ((mi) ((Object) var10)).c(var13Lifetime4, -6 + oe.field_h[5], param2, var11, -1);
          var13Lifetime5 = param4 + "%";
          ((mi) ((Object) var10)).c(var13Lifetime5, oe.field_h[6] - 5 - 1, param2, var11, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ji.CB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = ql.a(ce.field_t, 18286) ? 1 : 0;
          if (param0 <= 63) {
            this.field_k = -30;
          }
          stackIn_7_0 = (lc.field_c == null) ? 0 : 1;
          var3 = stackIn_7_0;
          var4 = na.field_v;
          var4 = var4 + " " + hk.a('#', "<br><br>", true, db.a(ag.a(var2_int != 0, true, var3 != 0, false), -48, new String[]{sn.field_h}));
          va.field_j.a(var4, 10, 70, 620, 180, 1021128, -1, 1, 0, 18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "ji.IA(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        boolean stackIn_48_1 = false;
        RuntimeException decompiledCaughtException = null;
        u var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int[] var10 = null;
        int var11_int = 0;
        String var11 = null;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var11_intLifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1Lifetime1;
        var16 = SteelSentinels.field_G;
        try {
          if (param0 < 49) {
            return;
          }
          var2 = pl.field_U;
          var3 = 1;
          if (qi.field_d == null ||
            ~qi.field_d.field_C != ~var3) {
            qi.field_d = bf.a((byte) 122, 1, var3, 3, 10);
          }
          var4 = d.field_R;
          var5 = ib.a(lc.field_c, 7047, var4, qi.field_d);
          if (null != lc.field_c &&
            ~lc.field_c.field_y != ~var3) {
            var5 = 100;
          }
          if (lc.field_c != null &&
            0 <= var5) {
          }
          boolean decompiledFrameRemainder0 = true;
          if (!qi.field_d.field_q) {
            var6 = lg.field_a;
            decompiledFrameRemainder0 = (var16 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != qi.field_d.field_x &&
              null != qi.field_d.field_z) {
              var8 = 1021128;
              var9 = qi.field_d.field_x[var4];
              var10 = qi.field_d.field_z[var4];
              pb.h(48, 88, 544, 286, 1130327);
              var11_int = 1;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (!(var11_int < nm.field_v.length)))) {
                stackIn_34_0 = nm.field_v[var11_int];
                stackIn_34_1 = 88;
                if (var16 == 0) {
                  pb.d(stackIn_34_0, stackIn_34_1, 265, 1130327);
                  var11_int++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_34_0 = (21 + ((mi) ((Object) var2)).field_G) / 2;
                stackIn_34_1 = 88;
              }
              var7 = stackIn_34_0 + stackIn_34_1;
              ((mi) ((Object) var2)).b(k.field_Ib[0], nm.field_v[0] + 5, var7, var8, -1);
              ((mi) ((Object) var2)).b(k.field_Ib[1], 5 + nm.field_v[1], var7, var8, -1);
              ((mi) ((Object) var2)).c(k.field_Ib[2], -1 + nm.field_v[3] - 5, var7, var8, -1);
              ((mi) ((Object) var2)).c(k.field_Ib[3], -5 + nm.field_v[4] - 1, var7, var8, -1);
              pb.g(48, 109, 544, 1130327);
              pb.g(48, 353, 544, 1130327);
              var7Lifetime2 = 126;
              var6 = im.field_d;
              var11_intLifetime1 = 0;
              while (true) {
                if (var11_intLifetime1 >= 10) {
                  if (lc.field_c != null &&
                    var5 < 0) {
                    var7Lifetime2 = 345;
                    var10 = lc.field_c.field_q;
                    var11 = g.field_l;
                    var12 = 0;
                    var13 = uh.a(false, var10[var12], 12);
                    var14 = uh.a(false, ad.a(126, var10[var12], 12), 43);
                    var15 = ad.a(113, var10[var12], 516);
                    this.a(true, false, var7Lifetime2, var14, var11, var13, var15, 0);
                  }
                  break;
                }
                if (var16 == 0) {
                  if (null != var9[var11_intLifetime1]) {
                    var12_ref_String = var9[var11_intLifetime1];
                    var8Lifetime1 = 1021128;
                    if (var5 == var11_intLifetime1) {
                      var8Lifetime1Lifetime1 = 1044724;
                    }
                    var13Lifetime1 = uh.a(false, var10[var11_intLifetime1], 12);
                    var14Lifetime1 = uh.a(false, ad.a(119, var10[var11_intLifetime1], 12), 43);
                    var15Lifetime1 = ad.a(122, var10[var11_intLifetime1], 516);
                    stackIn_48_1 = (~var5 == ~var11_intLifetime1);
                    this.a(stackIn_48_1, false, var7Lifetime2, var14Lifetime1, var12_ref_String, var13Lifetime1, var15Lifetime1, 1 + var11_intLifetime1);
                    var6 = k.field_Fb;
                  }
                  var7Lifetime2 += 17;
                  var11_intLifetime1++;
                  continue;
                }
                break;
              }
              if (var16 != 0) {
                var6 = dj.field_h;
              }
            } else {
              var6 = dj.field_h;
            }
          }
          var7Lifetime1 = 368;
          pl.field_U.b(var6, 5 + nm.field_v[0], var7Lifetime1, 1130327, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ji.MA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_18_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wk[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = SteelSentinels.field_G;
        try {
          var4_int = uc.field_e[this.field_c][param1];
          if (-1 == var4_int) {
            param2 = false;
          }
          var5 = 0;
          if (var4_int == 1 ||
            var4_int == 33 ||
            var4_int == 39) {
            stackIn_18_0 = (ib.a(-107)) ? 0 : 1;
            var5 = stackIn_18_0;
          }
          var6 = -107 % ((-50 - param0) / 53);
          var7 = pl.field_T;
          var8 = this.g(127, param1);
          var9 = this.b(param1, (byte) 95);
          var10 = this.a(param1, (byte) 108) - var8;
          var11 = this.c(25, param1);
          jm.a(var9, var11, var7, 1, var8, var10);
          if (var4_int < 0) {
            ac.field_bb.a(3 + var8, 2 + var9);
            if (var15 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var12 = ti.field_A[var4_int];
          if (8 == var4_int) {
            if (gh.field_Jb == 0 ||
              vb.field_g == 0 ||
              gh.field_Jb == 12 ||
              12 == vb.field_g) {
              var12 = ti.field_A[7];
              decompiledFrameRemainder0 = (var15 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = (gh.field_Jb != 1 &&
                vb.field_g != 1);
              if (!decompiledSharedTail0) {
                var12 = un.field_d;
                decompiledSharedTail0 = (var15 != 0);
              }
              if ((decompiledSharedTail0) && (gh.field_Jb == 2 ||
                vb.field_g == 2 ||
                gh.field_Jb == 3 ||
                vb.field_g == 3 ||
                4 == gh.field_Jb ||
                vb.field_g == 4)) {
                var12 = fb.field_k;
              }
            }
          }
          if (var4_int == 0 &&
            this.field_c == 20) {
            var12 = fk.field_f;
          }
          var12 = ke.a(42, var12);
          if (var5 != 0) {
            var12 = var12 + " " + (al.field_g * 33 / ua.field_r + cb.field_l * 33) + "%";
          }
          stackIn_80_0 = (param2) ? 1044724 : 1021128;
          var13 = stackIn_80_0;
          if (!this.a(119, param1)) {
            if (param2 &&
              var4_int != 26 &&
              var4_int != 25) {
              stackIn_93_0 = 11184895;
            } else {
              stackIn_93_0 = 7829367;
            }
            var13 = stackIn_93_0;
          }
          var14 = pl.field_U.c(var12);
          if (var5 != 0) {
            var13 = 11417637;
          }
          if (var7[0] != null) {
            var8 = var8 + var7[0].field_z;
            var10 = var10 - 2 * var7[0].field_z;
          }
          if ((var4_int == 33 ||
            var4_int == 40) &&
            (dc.field_g == 16 &&
            !param2 &&
            0 == (32 & a.field_c))) {
            var13 = 13696896;
          }
          if (var14 <= var10) {
            pl.field_U.a(var12, var8 + var10 / 2, var9 + var11 / 2 + 4, var13, -1);
            if (var15 == 0) {
              return;
            }
          }
          pl.field_U.a(var12, var8, -pl.field_U.field_G + var11 / 2 + var9, var10, var11, var13, -1, 1, 0, 10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void n(int param0) {
        String stackIn_24_0 = null;
        wk[] stackIn_34_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        String stackIn_70_0 = null;
        int stackIn_75_0 = 0;
        fh stackIn_78_0;
        String stackIn_78_1;
        int stackIn_78_2;
        int stackIn_78_3;
        int stackIn_78_4;
        int stackIn_78_5;
        int stackIn_78_6;
        int stackIn_78_7;
        int stackIn_78_8;
        int stackIn_78_9;
        int stackIn_79_10 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wk var17_ref_wk = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var24_ref_String = null;
        int var25_int = 0;
        wk[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        wk var28 = null;
        int var29 = 0;
        int var2_intLifetime1;
        int var5Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var24Lifetime1;
        var29 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder1 = true;
          var2_int = this.b(0, (byte) 29);
          var3 = this.g(126, 0);
          var4 = this.a(1, (byte) 114);
          var5 = this.b(2, (byte) -103) + this.c(25, 2);
          var2_int -= 8;
          var3 -= 8;
          var4 += 8;
          var5 += 8;
          pb.h(var3, var2_int, -var3 + var4, -var2_int + var5, 6316128);
          var6 = this.a(0, (byte) 108) + 4;
          var7 = -var6 + (-4 + this.g(127, 1));
          var8 = this.b(0, (byte) -125);
          var9 = this.c(25, 0);
          var10 = 1064792;
          var11 = gh.field_jb[0];
          if ((ol.field_Ub >= fm.field_f[ge.field_j]) &&
            (decompiledFrameRemainder1 = !(!this.b(false, ge.field_j, ol.field_Ub)))) {
            var11 = gh.field_jb[3];
            decompiledFrameRemainder1 = (var29 != 0);
          }
          if (decompiledFrameRemainder1) {
            boolean decompiledFrameRemainder0 = true;
            var12_int = ge.field_j;
            if (0 == var12_int) {
              var11 = gh.field_jb[1];
              decompiledFrameRemainder1 = (var29 != 0);
            } else {
              if (var12_int != 1) {
                decompiledFrameRemainder0 = (var12_int != 2);
                decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              var11 = db.a(gh.field_jb[2], -45, new String[]{qa.a(param0 ^ -21346, jh.field_a[ol.field_Ub])});
              decompiledFrameRemainder1 = (var29 != 0);
            }
            if (decompiledFrameRemainder1) {
              var11 = db.a(gh.field_jb[2], -84, new String[]{qa.a(param0 ^ -21346, jh.field_a[10 + ol.field_Ub])});
            }
          }
          if (ge.field_j != 0) {
            stackIn_24_0 = v.field_f;
          } else {
            stackIn_24_0 = ul.field_h;
          }
          var12 = db.a(stackIn_24_0, -88, new String[]{Integer.toString(ol.field_Ub + 1), var11});
          pl.field_U.a(var12, var7 / 2 + var6, var8 + 16, 1021128, -1);
          if (0 < ge.field_j &&
            ol.field_Ub < fm.field_f[ge.field_j]) {
            var13 = ed.field_c[ge.field_j][ol.field_Ub];
            var14 = 3 * var13 / 2;
            var15 = jh.field_a[(-1 + ge.field_j) * 10 + ol.field_Ub];
            if (var14 >= var15) {
              var16 = 20 + pl.field_U.c(var12) / 2;
              stackIn_34_0 = pd.field_Z;
              if (var13 >= var15) {
                stackIn_35_1 = 8;
              } else {
                stackIn_35_1 = 25;
              }
              var17_ref_wk = stackIn_34_0[stackIn_35_1];
              stackIn_39_0 = (var15 > var13) ? 150 : 192;
              var18 = stackIn_39_0;
              var19 = var7 / 2 + var6;
              var20 = var8 + 2;
              var17_ref_wk.a(var19 + var16, var20, var18);
              var17_ref_wk.a(-var16 + (var19 - var17_ref_wk.field_z), var20, var18);
            }
          }
          var3 += 8;
          var2_intLifetime1 = 6 + (var8 + var9);
          var4 -= 8;
          pb.h(var6, var8, var7, var9, var10);
          var5Lifetime1 = -8 + this.b(2, (byte) -109);
          pb.h(var3, var2_intLifetime1, var4 - var3, -var2_intLifetime1 + var5Lifetime1, 2061990);
          var13Lifetime1 = 100;
          var14Lifetime1 = 110;
          var15Lifetime1 = var2_intLifetime1 + 20;
          var16Lifetime1 = 10 + var3;
          pb.h(var16Lifetime1, var15Lifetime1, var13Lifetime1, var14Lifetime1, var10);
          var17 = var13Lifetime1 + var16Lifetime1 + 10;
          if (param0 != 21345) {
            return;
          }
          var18Lifetime1 = var15Lifetime1 - 10;
          var19Lifetime1 = var4 - 10 - var17;
          var20Lifetime1 = -var18Lifetime1 + var5Lifetime1;
          var21 = 0;
          var22 = n.field_z;
          var23 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var22.length <= var23))) {
            var24 = var22[var23];
            var25_int = nl.a(var24, param0 ^ 21371);
            stackIn_55_0 = 0;
            stackIn_55_1 = var25_int;
            if (var29 == 0) {
              if (stackIn_55_0 <= stackIn_55_1 &&
                fm.field_f[var25_int / 10] > (var25_int % 10)) {
                var21++;
              }
              var23++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_55_0 = fm.field_f[2];
            stackIn_55_1 = 10;
          }
          if (stackIn_55_0 == stackIn_55_1) {
            var21++;
          }
          if (ba.a((byte) -57)) {
            var21++;
          }
          var22_ref = db.a(c.field_s[10 * ge.field_j + ol.field_Ub], param0 ^ -21265, new String[]{qf.field_a[var21], id.a(qf.field_a[var21], 0)});
          var23 = this.a((byte) -128, ol.field_Ub, ge.field_j);
          if ((15 & fm.field_f[0]) < var23 &&
            fm.field_f[ge.field_j] <= ol.field_Ub) {
            if (var23 == 10) {
              stackIn_70_0 = uj.field_l;
            } else {
              stackIn_70_0 = db.a(lg.field_b, -26, new String[]{Integer.toString(var23), um.field_cb[var23 - 1]});
            }
            var24_ref_String = stackIn_70_0;
            var22_ref = var22_ref + "<br><br><col=ff0000>" + var24_ref_String + "</col>";
          }
          stackIn_75_0 = ((30 + var18Lifetime1 + ff.field_lb.a(var22_ref, var19Lifetime1, 16)) < var5Lifetime1) ? 0 : 1;
          var24Lifetime1 = stackIn_75_0;
          pl.field_U.b(um.field_cb[ol.field_Ub + ge.field_j * 10].toUpperCase(), var17, var18Lifetime1 + 20, 16777215, -1);
          stackIn_78_0 = ff.field_lb;
          stackIn_78_1 = var22_ref;
          stackIn_78_2 = var17;
          stackIn_78_3 = 30 + var18Lifetime1;
          stackIn_78_4 = var19Lifetime1;
          stackIn_78_5 = var20Lifetime1;
          stackIn_78_6 = 1021128;
          stackIn_78_7 = -1;
          stackIn_78_8 = 0;
          stackIn_78_9 = 0;
          if (var24Lifetime1 != 0) {
            stackIn_79_10 = 15;
          } else {
            stackIn_79_10 = 16;
          }
          ((fh) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2, stackIn_78_3, stackIn_78_4, stackIn_78_5, stackIn_78_6, stackIn_78_7, stackIn_78_8, stackIn_78_9, stackIn_79_10);
          var25 = bg.field_C;
          if (0 == nk.field_J) {
            var25 = pd.field_Q;
          }
          var26 = 8;
          var27 = a.field_c * var26 / 50 % var25.length;
          var28 = var25[var27];
          var15Lifetime1 = var15Lifetime1 + (-2 + (var14Lifetime1 - var28.field_B));
          var25[var27].f(var16Lifetime1 + 2, var15Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.GB(" + param0 + ')');
        }
    }

    private final int b(int param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        var6 = SteelSentinels.field_G;
        try {
          var3_int = this.b(-117, param0);
          if (0 <= var3_int) {
            stackIn_3_0 = 448;
            return stackIn_3_0;
          }
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      boolean decompiledFrameRemainder0 = true;
                      var3_intLifetime1 = 0;
                      var5 = this.field_c;
                      if (var5 != 5 && (var5 != 6 ||
                        var6 != 0)) {
                        if (var5 == 8) {
                          break L5;
                        }
                        if (7 == var5) {
                          break L4;
                        }
                        if (14 == var5 &&
                          var6 == 0) {
                          break L4;
                        }
                        if (var5 == 13) {
                          break L4;
                        }
                        if (var5 == 0) {
                          break L3;
                        }
                        if (var5 == 17) {
                          break L2;
                        }
                        if (19 == var5 &&
                          var6 == 0) {
                          break L1;
                        }
                        if (var5 == 20) {
                          var5 = uc.field_e[this.field_c][param0];
                          if (((var5 != 25 ||
                            var6 != 0) && (var5 != 26 ||
                            var6 != 0)) && (var5 != 39)) {
                            break L0;
                          }
                          if (var5 == 25 &&
                            var6 == 0 || var5 == 26 &&
                            var6 == 0 || var6 != 0) {
                            var3_intLifetime1 = 95;
                            if (var6 == 0) {
                              break L0;
                            }
                          }
                          var3_intLifetime1 = 376;
                          if (var6 == 0) {
                            break L0;
                          }
                        } else {
                          if (var5 != 22) {
                            break L0;
                          }
                          decompiledFrameRemainder0 = (var6 == 0);
                        }
                        if (decompiledFrameRemainder0) {
                          stackIn_92_0 = param0 * 30 + 150;
                          return stackIn_92_0;
                        }
                      }
                      if (ni.b(99)) {
                        break L0;
                      }
                      var3_intLifetime1 = 379;
                      if (var6 == 0) {
                        break L0;
                      }
                    }
                    if (ni.b(92)) {
                      break L0;
                    }
                    var3_intLifetime1 = 448;
                    if (var6 == 0) {
                      break L0;
                    }
                  }
                  var3_intLifetime1 = 448;
                  if (var6 == 0) {
                    break L0;
                  }
                }
                var3_intLifetime1 = uc.field_f[this.field_c] * param0 + 175;
                if (!nk.f((byte) -15)) {
                  var3_intLifetime1 = var3_intLifetime1 + 4 * param0;
                }
                var4 = uc.field_e[this.field_c][param0];
                if (34 != var4) {
                  break L0;
                }
                var3_intLifetime1 = 350;
                if (var6 == 0) {
                  break L0;
                }
              }
              var3_intLifetime1 = 130;
              if (param0 <= 0) {
                break L0;
              }
              if (param0 >= uc.field_e[this.field_c].length - 4) {
                break L0;
              }
              var3_intLifetime1 = var3_intLifetime1 + 30 * param0;
              if (var6 == 0) {
                break L0;
              }
            }
            stackIn_72_0 = 29 * (param0 % 10) + 111;
            return stackIn_72_0;
          }
          if (this.a(-2)) {
            if (uc.field_e[this.field_c].length < 8) {
              stackIn_100_0 = 120 + param0 * 30;
              return stackIn_100_0;
            }
            stackIn_98_0 = 30 * param0 + 90;
            return stackIn_98_0;
          }
          if (var3_intLifetime1 == 0) {
            var3_intLifetime1 = param0 * uc.field_f[this.field_c] + uc.field_c[this.field_c];
          }
          var4Lifetime1 = 23 / ((-41 - param1) / 62);
          stackIn_104_0 = this.field_k + var3_intLifetime1;
          return stackIn_104_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final int f(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_106_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (this.field_c == 16) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param0 != 32) {
            stackIn_8_0 = 18;
            return stackIn_8_0;
          }
          var2_int = this.field_g.field_e;
          var3 = this.b(-107, var2_int);
          if (0 <= var2_int &&
            var2_int < uc.field_e[this.field_c].length &&
            uc.field_e[this.field_c][var2_int] != -1) {
            if (this.field_c == 20 &&
              var2_int >= 0 &&
              var2_int < 3) {
              stackIn_39_0 = 1;
              return stackIn_39_0;
            }
            if (this.field_c == 0) {
              if (34 == uc.field_e[this.field_c][var2_int]) {
                stackIn_47_0 = dh.field_F;
                return stackIn_47_0;
              }
              stackIn_49_0 = var2_int;
              return stackIn_49_0;
            }
            if (var3 >= 0) {
              var3++;
              var2_int++;
              if (4 == var3) {
                var2_int -= 4;
                var3 = 0;
              }
              do {
                if (uc.field_e[this.field_c][var2_int] != -1) {
                  stackIn_65_0 = var2_int;
                  decompiledRegionSelector0 = 1;
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var3++;
                var2_int++;
                if (var3 == 4) {
                  var2_int -= 4;
                  var3 = 0;
                }
              } while (~this.field_g.field_e != ~var2_int);
              if (decompiledFrameCompleted0) {
                stackIn_62_0 = var2_int;
                decompiledRegionSelector0 = 0;
                decompiledFrameRemainder0 = false;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              if (this.field_c == 5 &&
                var2_int < 3) {
                var2_int++;
                if (3 <= var2_int) {
                  var2_int -= 3;
                }
                stackIn_77_0 = var2_int;
                return stackIn_77_0;
              }
              if (6 == this.field_c &&
                var2_int < 2) {
                var2_int++;
                if (2 <= var2_int) {
                  var2_int -= 2;
                }
                stackIn_88_0 = var2_int;
                return stackIn_88_0;
              }
              if (this.field_c == 19 &&
                19 == this.field_c) {
                stackIn_99_0 = (uc.field_e[this.field_c] != fa.field_c) ? 20 : 30;
                var4 = stackIn_99_0;
                if (var2_int >= 0 &&
                  var2_int < -10 + var4) {
                  stackIn_104_0 = 10 + var2_int;
                  return stackIn_104_0;
                }
              }
              stackIn_106_0 = -1;
              return stackIn_106_0;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            var2_int = 0;
            L13: while (true) {
              if (uc.field_e[this.field_c].length > var2_int) {
                stackIn_26_0 = -1;
                stackIn_26_1 = uc.field_e[this.field_c][var2_int];
                if (var5 != 0) {
                  break L13;
                }
                if (stackIn_26_0 == stackIn_26_1) {
                  var2_int++;
                  continue;
                }
              }
              stackIn_26_0 = uc.field_e[this.field_c].length;
              stackIn_26_1 = var2_int;
              break;
            }
            if (stackIn_26_0 != stackIn_26_1) {
              stackIn_30_0 = var2_int;
              return stackIn_30_0;
            }
            stackIn_28_0 = -1;
            return stackIn_28_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          stackIn_65_0 = stackIn_62_0;
          if (var5 == 0) {
            return stackIn_62_0;
          }
        }
        return stackIn_65_0;
    }

    private final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 114) {
            stackIn_2_0 = -69;
            return stackIn_2_0;
          }
          if (this.field_c != 0) {
            stackIn_7_0 = 37;
            return stackIn_7_0;
          }
          stackIn_5_0 = ob.field_z.field_B;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.TA(" + param0 + ')');
        }
    }

    private final int d(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = SteelSentinels.field_G;
        try {
          if (7 == this.field_c) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var2_int = this.field_g.field_e;
          if (param0 >= -41) {
            this.a(true);
          }
          var3 = this.b(-102, var2_int);
          if (var2_int >= 0 &&
            var2_int < uc.field_e[this.field_c].length &&
            uc.field_e[this.field_c][var2_int] != -1) {
            if (this.field_c == 19 &&
              0 <= var3) {
              stackIn_45_0 = (uc.field_e[this.field_c] != fa.field_c) ? 19 : 29;
              return stackIn_45_0;
            }
            if (this.field_c == 20) {
              if (var3 >= 0) {
                stackIn_51_0 = 2;
                return stackIn_51_0;
              }
              if (var2_int == 1 &&
                !this.a(117, 0)) {
                stackIn_59_0 = -1 + uc.field_e[this.field_c].length;
                return stackIn_59_0;
              }
            }
            boolean decompiledFrameRemainder1 = true;
            if (this.field_c == 5 &&
              var2_int > var3) {
              if (0 == var3) {
                stackIn_70_0 = 0;
                return stackIn_70_0;
              }
              if ((var3 != 1 &&
                2 != var3) &&
                (decompiledFrameRemainder1 = (var3 == 3))) {
                stackIn_81_0 = 2;
                return stackIn_81_0;
              }
              if (decompiledFrameRemainder1) {
                stackIn_76_0 = 1;
                return stackIn_76_0;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_c == 6 &&
              var2_int > var3) {
              if ((var3 != 0 &&
                var3 != 1) &&
                (decompiledFrameRemainder0 = (2 == var3 ||
                var3 == 3))) {
                stackIn_101_0 = 1;
                return stackIn_101_0;
              }
              if (decompiledFrameRemainder0) {
                stackIn_95_0 = 0;
                return stackIn_95_0;
              }
            }
            if (this.field_c == 0) {
              if (uc.field_e[this.field_c][var2_int] != 34) {
                var2_int--;
                if (var2_int >= 0) {
                  stackIn_110_0 = var2_int;
                  return stackIn_110_0;
                }
                var2_int = var2_int + uc.field_e[this.field_c].length;
                if (34 == uc.field_e[this.field_c][var2_int]) {
                  var2_int--;
                }
              }
              stackIn_115_0 = var2_int;
              return stackIn_115_0;
            }
            if (this.field_c != 17) {
              stackIn_130_0 = -1;
              return stackIn_130_0;
            }
            if (var2_int == 0) {
              stackIn_121_0 = uc.field_e[this.field_c].length - 1;
              return stackIn_121_0;
            }
            if (var2_int < (uc.field_e[this.field_c].length - 4)) {
              stackIn_126_0 = var2_int - 1;
              return stackIn_126_0;
            }
            stackIn_128_0 = uc.field_e[this.field_c].length - 5;
            return stackIn_128_0;
          }
          var2_intLifetime1 = uc.field_e[this.field_c].length - 1;
          L12: while (true) {
            if (var2_intLifetime1 >= 0) {
              stackIn_26_0 = 0;
              stackIn_26_1 = ~uc.field_e[this.field_c][var2_intLifetime1];
              if (var4 != 0) {
                break L12;
              }
              if (stackIn_26_0 == stackIn_26_1) {
                var2_intLifetime1--;
                continue;
              }
            }
            stackIn_26_0 = 0;
            stackIn_26_1 = var2_intLifetime1;
            break;
          }
          if (stackIn_26_0 <= stackIn_26_1 &&
            uc.field_e[this.field_c][var2_intLifetime1] == 34) {
            var2_intLifetime1--;
          }
          stackIn_34_0 = var2_intLifetime1;
          return stackIn_34_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.AB(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        u var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6_int = 0;
        String[] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var7_intLifetime1;
        var12 = SteelSentinels.field_G;
        try {
          var2 = pl.field_U;
          pb.h(40, 80, 560, 330, 3487029);
          pb.h(41, 81, 558, 328, 3487029);
          if (ni.b(25)) {
            this.e(1021128);
            return;
          }
          if (qi.field_j == null) {
            qi.field_j = ol.a(7, true, 0, 10);
          }
          if (param0 > -87) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          var3 = 1021128;
          if (oe.field_h[5] == 0) {
            var5_int = ((mi) ((Object) var2)).c("10000%");
            var6_int = 5;
            while (var6_int > 0) {
              var7_int = ((mi) ((Object) var2)).c(pe.field_h[var6_int]) + 8;
              stackIn_19_0 = Math.max(var7_int, var5_int);
              if (var12 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var7_intLifetime1 = stackIn_19_0;
              oe.field_h[var6_int] = -var7_intLifetime1 + oe.field_h[var6_int + 1];
              var6_int--;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_19_0 = 105;
          }
          boolean decompiledFrameRemainder0 = true;
          var4 = stackIn_19_0;
          if (qi.field_j.field_r) {
            if (null == qi.field_j.field_z) {
              var5 = dj.field_h;
              decompiledFrameRemainder0 = (var12 != 0);
            }
            if (decompiledFrameRemainder0) {
              var5 = wb.field_d;
              var6 = qi.field_j.field_z[on.field_j];
              var7 = qi.field_j.field_x[on.field_j];
              pb.h(48, 88, 544, 286, 1130327);
              pb.g(48, 109, 544, 1130327);
              var8 = 1;
              do {
                if (!(oe.field_h.length - 1 > var8)) {
                  ((mi) ((Object) var2)).b(pe.field_h[0], 2 + oe.field_h[0], var4, var3, -1);
                  ((mi) ((Object) var2)).c(pe.field_h[1], -2 + (oe.field_h[2] - 1), var4, var3, -1);
                  ((mi) ((Object) var2)).c(pe.field_h[2], -1 + oe.field_h[3] - 2, var4, var3, -1);
                  ((mi) ((Object) var2)).c(pe.field_h[3], -1 + (-2 + oe.field_h[4]), var4, var3, -1);
                  ((mi) ((Object) var2)).c(pe.field_h[4], -2 + (oe.field_h[5] - 1), var4, var3, -1);
                  ((mi) ((Object) var2)).c(pe.field_h[5], -1 + (-2 + oe.field_h[6]), var4, var3, -1);
                  var4 = 126;
                  var8 = 0;
                  break;
                }
                pb.d(oe.field_h[var8], 88, 286, 1130327);
                var8++;
              } while (var12 == 0);
              var9 = 0;
              L11: while (true) {
                if (10 > var9) {
                  if (var12 == 0) {
                    if (var6[var9] != null) {
                      var3 = 1021128;
                      var10 = var6[var9];
                      var11 = wl.a(50, var10) ? 1 : 0;
                      var5 = "";
                      this.a(var10, var9, var4, var11 != 0, var7[3 + var9 * 4], var7[var9 * 4], var7[4 * var9 + 2], var7[4 * var9 + 1], -128);
                      if (var11 != 0) {
                        var3 = 1044724;
                        var8 = 1;
                      }
                    }
                    var4 += 17;
                    var9++;
                    continue;
                  }
                } else {
                  if (var8 != 0) {
                    break L11;
                  }
                  var4 = 369;
                  var3 = 1021128;
                }
                this.a(g.field_l, -1, var4, true, qi.field_j.field_B, qi.field_j.field_p, qi.field_j.field_o, qi.field_j.field_s, -126);
                break;
              }
              if (var12 != 0) {
                var5 = lg.field_a;
              }
            }
          } else {
            var5 = lg.field_a;
          }
          var4 = 231;
          ((mi) ((Object) var2)).a(var5, 320, var4, 1021128, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "ji.QA(" + param0 + ')');
        }
    }

    private final int a(int param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = SteelSentinels.field_G;
        try {
          var3_int = this.b(-72, param0);
          if (0 <= var3_int) {
            stackIn_3_0 = var3_int * 159 + 159;
            return stackIn_3_0;
          }
          if (this.field_c == 5 &&
            !ni.b(79)) {
            if (3 > param0) {
              stackIn_14_0 = this.g(126, param0) + 144;
            } else {
              stackIn_14_0 = 380;
            }
            return stackIn_14_0;
          }
          if (param1 <= 107) {
            stackIn_17_0 = 79;
            return stackIn_17_0;
          }
          if (this.field_c == 6 &&
            !ni.b(30)) {
            if (param0 < 2) {
              stackIn_28_0 = this.g(127, param0) + 160;
            } else {
              stackIn_28_0 = 380;
            }
            return stackIn_28_0;
          }
          if (this.field_c == 7) {
            stackIn_33_0 = 140 + this.g(125, param0);
            return stackIn_33_0;
          }
          if (this.field_c != 14 &&
            this.field_c != 13) {
            if (0 == this.field_c) {
              var4 = uc.field_e[this.field_c][param0];
              if (34 != var4) {
                stackIn_47_0 = 450;
                return stackIn_47_0;
              }
              stackIn_45_0 = 150;
              return stackIn_45_0;
            }
            if (this.field_c == 17) {
              stackIn_52_0 = -this.g(127, param0) + 640;
              return stackIn_52_0;
            }
            if (this.a(-2)) {
              stackIn_55_0 = 640 - this.g(126, param0);
              return stackIn_55_0;
            }
            if (15 == this.field_c) {
              stackIn_60_0 = 600;
              return stackIn_60_0;
            }
            if (this.field_c == 19) {
              stackIn_67_0 = this.g(126, param0);
              if (uc.field_e[this.field_c] != fa.field_c) {
                stackIn_68_1 = 260;
              } else {
                stackIn_68_1 = 180;
              }
              stackIn_69_0 = stackIn_67_0 + stackIn_68_1;
              return stackIn_69_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_c == 20) {
              var4Lifetime1 = uc.field_e[this.field_c][param0];
              if ((25 != var4Lifetime1 ||
                var5 != 0) && var4Lifetime1 != 26) {
                decompiledFrameRemainder0 = (39 == var4Lifetime1);
                if ((decompiledFrameRemainder0) &&
                  (var5 == 0)) {
                  stackIn_89_0 = -this.g(125, param0) + 640;
                  return stackIn_89_0;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_87_0 = 60 + this.g(127, param0);
                return stackIn_87_0;
              }
            }
            stackIn_91_0 = uc.field_d[this.field_c];
            return stackIn_91_0;
          }
          stackIn_39_0 = 160 + this.g(125, param0);
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.KA(" + param0 + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 50) {
            ji.a(-98, (CharSequence) null);
          }
          stackIn_4_0 = sj.field_y.a(param1, -742, "");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ji.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final boolean f(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 111) {
            this.a(18, false);
          }
          if (ve.a(ge.field_m, 1, param0)) {
            return true;
          }
          if (ve.a(ao.field_A, param1 - 110, param0)) {
            return false;
          }
          if (ve.a(ao.field_E, 1, param0) && (ni.b(param1 ^ 54) ||
            !(0 < rd.field_b))) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0) {
        u var2 = null;
        String var3 = null;
        try {
          var2 = pl.field_U;
          var3 = lb.field_hc;
          ((mi) ((Object) var2)).a(var3, 320, 240, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.CA(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_385_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        nk var11_ref_nk = null;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.field_G;
        try {
          if (param0 != -29628) {
            field_f = (String[]) null;
          }
          if (lb.field_gc == 1) {
            var2_int = -17 + va.field_d;
            if (var2_int < 0 ||
              5 < var2_int) {
              var2_int = va.field_d - 24;
              if (var2_int < 0 ||
                var2_int >= 3) {
                var2_int = 0;
              }
            }
            L5: {
              L6: {
                L7: {
                  L8: {
                    L9: {
                      boolean decompiledFrameRemainder13 = true;
                      boolean decompiledFrameRemainder12 = true;
                      var3 = 0;
                      var4 = 0;
                      var5 = va.field_d;
                      if ((0 != var5 ||
                        var12 != 0) &&
                        (decompiledFrameRemainder12 = (2 != var5 ||
                        var12 != 0)) &&
                        (decompiledFrameRemainder13 = (4 != var5 ||
                        var12 != 0))) {
                        switch (var5) {
                          case 1:
                            break L9;
                          case 3:
                            break L8;
                          case 5:
                            break L7;
                          case 9:
                            break L6;
                          default:
                            break L5;
                          case 13:
                            if (var12 == 0) {
                              break L6;
                            }
                            break;
                        }
                      }
                      if ((decompiledFrameRemainder13) &&
                        (decompiledFrameRemainder12)) {
                        var2_int = 0;
                        var3 = 0;
                        var4 = 3;
                        if (var12 == 0) {
                          break L5;
                        }
                      }
                      if (decompiledFrameRemainder13) {
                        var4 = 6;
                        var2_int = 2;
                        var3 = 3;
                        if (var12 == 0) {
                          break L5;
                        }
                      }
                      var3 = 6;
                      var4 = 12;
                      var2_int = 4;
                      if (var12 == 0) {
                        break L5;
                      }
                    }
                    var4 = 3;
                    var3 = 0;
                    var2_int = 0;
                    if (var12 == 0) {
                      break L5;
                    }
                  }
                  var4 = 6;
                  var3 = 3;
                  var2_int = 2;
                  if (var12 == 0) {
                    break L5;
                  }
                }
                var3 = 6;
                var2_int = 4;
                var4 = 12;
                if (var12 == 0) {
                  break L5;
                }
              }
              var4 = 12;
              var2_int = -1 + va.field_d;
              fe.field_D[0] = vn.a(fe.field_D[0], 67108864);
              var3 = 0;
              fe.field_D[1] = vn.a(fe.field_D[1], 1);
              fe.field_D[0] = vn.a(fe.field_D[0], 1073741824);
              rn.field_D[1] = vn.a(rn.field_D[1], 131072);
              fe.field_D[0] = vn.a(fe.field_D[0], 16777216);
            }
            if (va.field_d == 13) {
              jc.field_f = 2;
              li.field_v = 1000;
              fm.field_f[0] = 10;
              dm.field_a = 8;
              h.field_G = 1000;
              fm.field_f[1] = 10;
              fm.field_f[2] = 10;
            }
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted0 = true;
            L18: {
              boolean decompiledFrameCompleted1 = true;
              L19: {
                L20: {
                  boolean decompiledFrameRemainder11 = true;
                  boolean decompiledFrameRemainder10 = true;
                  boolean decompiledFrameRemainder9 = true;
                  boolean decompiledFrameRemainder8 = true;
                  boolean decompiledFrameRemainder7 = true;
                  boolean decompiledFrameRemainder6 = true;
                  boolean decompiledFrameRemainder5 = true;
                  var5 = va.field_d - var2_int;
                  if (var5 == 0 &&
                    var12 == 0) {
                    jg.field_j = true;
                    var5 = var3;
                    while (true) {
                      stackIn_121_0 = ~var4;
                      stackIn_121_1 = ~var5;
                      if (stackIn_121_0 < stackIn_121_1) {
                        var6 = n.field_z[var5];
                        rn.field_D[var6 >> 5] = ec.a(rn.field_D[var6 >> 5], ~(1 << ec.a(var6, 31)));
                        var7 = ne.a(var6, (byte) 28);
                        var8 = var7;
                        stackIn_385_0 = 0;
                        var9_int = stackIn_385_0;
                        while (var8.length > var9_int) {
                          var10 = var8[var9_int];
                          var11_ref_nk = ul.a(var10, (byte) 67);
                          stackIn_121_0 = -1;
                          stackIn_121_1 = ~(var11_ref_nk.field_Q & 2055);
                          if (stackIn_121_0 != stackIn_121_1) {
                            rn.field_D[var10 >> 5] = ec.a(rn.field_D[var10 >> 5], ~(1 << ec.a(var10, 31)));
                          }
                          var9_int++;
                        }
                        var5++;
                        continue;
                      }
                      break;
                    }
                    break L18;
                  }
                  if (1 != var5) {
                    if ((var5 != 8) &&
                      (decompiledFrameRemainder5 = (var5 != 7 ||
                      var12 != 0)) &&
                      (decompiledFrameRemainder6 = (6 != var5 ||
                      var12 != 0)) &&
                      (decompiledFrameRemainder7 = (10 != var5 ||
                      var12 != 0)) &&
                      (decompiledFrameRemainder8 = (11 != var5 ||
                      var12 != 0)) &&
                      (decompiledFrameRemainder9 = (var5 != 12)) &&
                      (decompiledFrameRemainder10 = (var5 != 16)) &&
                      (decompiledFrameRemainder11 = (var5 != 15 ||
                      var12 != 0))) {
                      switch (var5) {
                        case 14:
                          break L20;
                        case 17:
                          break L19;
                        case 24:
                          jg.field_j = true;
                          if (fm.field_f[var2_int] != 10) {
                            fm.field_f[var2_int] = 10;
                            if (var2_int != 0) {
                              break L18;
                            }
                            if (jc.field_f != 0) {
                              break L18;
                            }
                            jc.field_f = 1;
                            if (var12 == 0) {
                              break L18;
                            }
                          }
                          fm.field_f[var2_int] = 0;
                          if (0 != var2_int) {
                            break L18;
                          }
                          if (jc.field_f <= 0) {
                            break L18;
                          }
                          jc.field_f = 0;
                          if (var12 == 0) {
                            break L18;
                          }
                        default:
                          return;
                      }
                    }
                  } else {
                    jg.field_j = true;
                    var5 = var3;
                    while (var5 < var4) {
                      var6 = n.field_z[var5];
                      rn.field_D[var6 >> 5] = vn.a(rn.field_D[var6 >> 5], 1 << ec.a(var6, 31));
                      var7 = ne.a(var6, (byte) 28);
                      var8 = var7;
                      stackIn_385_0 = 0;
                      if (var12 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                      var9_int = stackIn_385_0;
                      while (var9_int < var8.length) {
                        var10 = var8[var9_int];
                        rn.field_D[var10 >> 5] = vn.a(rn.field_D[var10 >> 5], 1 << ec.a(31, var10));
                        var9_int++;
                      }
                      var8 = ki.b(var6, (byte) -110);
                      var9 = var8;
                      var10 = 0;
                      while (var9.length > var10) {
                        var11 = var9[var10];
                        fe.field_D[var11 >> 5] = vn.a(fe.field_D[var11 >> 5], 1 << ec.a(var11, 31));
                        var10++;
                      }
                      var5++;
                    }
                    if ((decompiledFrameCompleted2) &&
                      (var12 == 0)) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6) &&
                    (decompiledFrameRemainder5) &&
                    (decompiledFrameCompleted2)) {
                    jg.field_j = true;
                    var5 = 0;
                    while (true) {
                      if (var5 < rn.field_D.length) {
                        rn.field_D[var5] = 0;
                        var5++;
                        if (var12 == 0) {
                          continue;
                        }
                      } else {
                        var5 = 0;
                      }
                      break;
                    }
                    while (fe.field_D.length > var5) {
                      fe.field_D[var5] = 0;
                      var5++;
                      if (var12 != 0) {
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                    }
                    if ((decompiledFrameCompleted1) &&
                      (var12 == 0)) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    jg.field_j = true;
                    li.field_v = Math.min(100 + li.field_v, 1000);
                    h.field_G = h.field_G + 100;
                    if (var12 == 0) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    jg.field_j = true;
                    li.field_v = Math.max(li.field_v - 100, 0);
                    h.field_G = Math.max(h.field_G - 100, 0);
                    if (var12 == 0) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    jg.field_j = true;
                    jc.field_f = 0;
                    var5 = 0;
                    do {
                      if (!(rn.field_D.length > var5)) {
                        var5 = 0;
                        break;
                      }
                      rn.field_D[var5] = 0;
                      var5++;
                    } while (var12 == 0);
                    do {
                      if (!(var5 < fe.field_D.length)) {
                        dm.field_a = 0;
                        fm.field_f[0] = 0;
                        li.field_v = 0;
                        h.field_G = 0;
                        fm.field_f[1] = 0;
                        fm.field_f[2] = 0;
                        break;
                      }
                      fe.field_D[var5] = 0;
                      var5++;
                    } while (var12 == 0);
                    if (var12 == 0) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    dm.field_a = 0;
                    jg.field_j = true;
                    jc.field_f = 1;
                    var5 = 0;
                    do {
                      if (!(rn.field_D.length > var5)) {
                        var5 = 0;
                        break;
                      }
                      rn.field_D[var5] = 0;
                      var5++;
                    } while (var12 == 0);
                    do {
                      if (!(var5 < fe.field_D.length)) {
                        h.field_G = 0;
                        li.field_v = 0;
                        var5 = 55;
                        rn.field_D[var5 >> 5] = vn.a(rn.field_D[var5 >> 5], 1 << ec.a(var5, 31));
                        break;
                      }
                      fe.field_D[var5] = 0;
                      var5++;
                    } while (var12 == 0);
                    var6_ref_int__ = ne.a(var5, (byte) 28);
                    var7 = var6_ref_int__;
                    var8_int = 0;
                    do {
                      if (var8_int >= var7.length) {
                        var7 = ki.b(var5, (byte) -103);
                        break;
                      }
                      var9_int = var7[var8_int];
                      rn.field_D[var9_int >> 5] = vn.a(rn.field_D[var9_int >> 5], 1 << ec.a(31, var9_int));
                      h.field_G = h.field_G + sj.field_v[var9_int];
                      var8_int++;
                    } while (var12 == 0);
                    var8 = var7;
                    var9_int = 0;
                    do {
                      if (var9_int >= var8.length) {
                        fm.field_f[0] = 3;
                        fm.field_f[1] = 0;
                        fm.field_f[2] = 0;
                        break;
                      }
                      var10 = var8[var9_int];
                      fe.field_D[var10 >> 5] = vn.a(fe.field_D[var10 >> 5], 1 << ec.a(31, var10));
                      h.field_G = h.field_G + qf.field_h[var10];
                      var9_int++;
                    } while (var12 == 0);
                    if (var12 == 0) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    jc.field_f = 2;
                    dm.field_a = 8;
                    jg.field_j = true;
                    var5 = 0;
                    do {
                      if (!(rn.field_D.length > var5)) {
                        var5 = 0;
                        break;
                      }
                      rn.field_D[var5] = 0;
                      var5++;
                    } while (var12 == 0);
                    do {
                      if (!(var5 < fe.field_D.length)) {
                        h.field_G = 0;
                        li.field_v = 0;
                        break;
                      }
                      fe.field_D[var5] = 0;
                      var5++;
                    } while (var12 == 0);
                    var5 = 0;
                    while (var5 < 3) {
                      var6 = n.field_z[var5];
                      rn.field_D[var6 >> 5] = vn.a(rn.field_D[var6 >> 5], 1 << ec.a(31, var6));
                      var7 = ne.a(var6, (byte) 28);
                      var8 = var7;
                      stackIn_385_0 = 0;
                      if (var12 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      var9_int = stackIn_385_0;
                      while (var9_int < var8.length) {
                        var10 = var8[var9_int];
                        rn.field_D[var10 >> 5] = vn.a(rn.field_D[var10 >> 5], 1 << ec.a(31, var10));
                        h.field_G = h.field_G + sj.field_v[var10];
                        var9_int++;
                      }
                      var8 = ki.b(var6, (byte) -93);
                      var9 = var8;
                      var10 = 0;
                      while (var9.length > var10) {
                        var11 = var9[var10];
                        fe.field_D[var11 >> 5] = vn.a(fe.field_D[var11 >> 5], 1 << ec.a(31, var11));
                        h.field_G = h.field_G + qf.field_h[var11];
                        var10++;
                      }
                      var5++;
                    }
                    if (decompiledFrameCompleted0) {
                      fm.field_f[2] = 0;
                      fm.field_f[0] = 10;
                      fm.field_f[1] = 0;
                      if (var12 == 0) {
                        break L18;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder11) &&
                    (decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0)) {
                    if ((8 & dm.field_a) != 0) {
                      dm.field_a = dm.field_a & -9;
                      if (var12 == 0) {
                        break L18;
                      }
                    }
                    dm.field_a = dm.field_a | 8;
                    if (var12 == 0) {
                      break L18;
                    }
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1) &&
                    (decompiledFrameCompleted0)) {
                    if (ni.b(46)) {
                      km.field_a = "Not logged in.";
                      if (var12 == 0) {
                        break L18;
                      }
                    }
                    jg.field_j = false;
                    mm.field_g.a(69, (byte) -117);
                    mm.field_g.b(true, li.field_v);
                    mm.field_g.b(true, h.field_G);
                    var5 = 0;
                    do {
                      if (var5 >= 4) {
                        var5 = 0;
                        break;
                      }
                      mm.field_g.b(true, rn.field_D[var5]);
                      var5++;
                    } while (var12 == 0);
                    do {
                      if (var5 >= 2) {
                        var5 = 0;
                        break;
                      }
                      mm.field_g.b(true, fe.field_D[var5]);
                      var5++;
                    } while (var12 == 0);
                    do {
                      if (var5 >= 3) {
                        mm.field_g.a((byte) 126, jc.field_f);
                        km.field_a = "Data sent.";
                        break;
                      }
                      mm.field_g.a((byte) 115, fm.field_f[var5]);
                      var5++;
                    } while (var12 == 0);
                    if (ul.field_d >= 2) {
                      break L18;
                    }
                    km.field_a = km.field_a + " (Expect it to be ignored.)";
                    if (var12 == 0) {
                      break L18;
                    }
                  }
                }
                if ((decompiledFrameCompleted2) &&
                  (decompiledFrameCompleted1) &&
                  (decompiledFrameCompleted0)) {
                  vn.d(-57);
                  var5 = 0;
                  while (true) {
                    if (va.field_k.length > var5) {
                      va.field_k[var5] = 0;
                      var5++;
                      if (var12 == 0) {
                        continue;
                      }
                    } else {
                      var5 = vb.field_g;
                    }
                    break;
                  }
                  if (var5 == 5 ||
                    var5 == 6 ||
                    var5 == 8) {
                    var5 = gh.field_Jb;
                  }
                  q.a(0, true, param0 + 29627, var5);
                  if (var12 == 0) {
                    break L18;
                  }
                }
              }
              if ((decompiledFrameCompleted2) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                boolean decompiledFrameRemainder4 = true;
                boolean decompiledFrameRemainder3 = true;
                boolean decompiledFrameRemainder2 = true;
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                var5 = var2_int;
                if ((var5 != 0 ||
                  var12 != 0) &&
                  (decompiledFrameRemainder0 = (var5 != 1 ||
                  var12 != 0)) &&
                  (decompiledFrameRemainder1 = (var5 != 2 ||
                  var12 != 0)) &&
                  (decompiledFrameRemainder2 = (var5 != 3 ||
                  var12 != 0)) &&
                  (decompiledFrameRemainder3 = (var5 != 4 ||
                  var12 != 0))) {
                  if (var5 != 5) {
                    return;
                  }
                  decompiledFrameRemainder4 = (var12 != 0);
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  jn.a(true, (byte) 114, 200, me.field_f);
                  if (var12 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  jn.a(true, (byte) 108, 200, l.field_i);
                  if (var12 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  jn.a(true, (byte) 77, 200, gb.field_e);
                  if (var12 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3)) {
                  jn.a(true, (byte) 91, 200, kj.field_z);
                  if (var12 == 0) {
                    return;
                  }
                }
                if (decompiledFrameRemainder4) {
                  jn.a(true, (byte) 96, 200, ue.field_e);
                  if (var12 == 0) {
                    return;
                  }
                }
                jn.a(true, (byte) 122, 200, db.field_a);
                return;
              }
            }
            if ((decompiledFrameCompleted2) &&
              (decompiledFrameCompleted0)) {
              stackIn_385_0 = param0 ^ 31241;
            }
            ee.c(stackIn_385_0, 95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.BA(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        try {
          if (ei.field_q == 96) {
            if (this.field_g.field_e > 0) {
              if (this.field_g.field_e != 3) {
                this.field_g.a(0, -1 + this.field_g.field_e);
                if (var3 != 0) {
                  this.field_g.a(0, 2);
                }
              }
            } else {
              this.field_g.a(0, 2);
            }
          }
          if (97 == ei.field_q) {
            if (2 <= this.field_g.field_e) {
              if (2 == this.field_g.field_e) {
                this.field_g.a(0, 0);
                if (var3 != 0) {
                  this.field_g.a(0, 1 + this.field_g.field_e);
                }
              }
            } else {
              this.field_g.a(0, 1 + this.field_g.field_e);
            }
          }
          if (99 == ei.field_q) {
            if (!(this.field_g.field_e >= 0) ||
              !(this.field_g.field_e <= 2)) {
              this.field_g.a(0, d.field_R);
              if (var3 != 0) {
                this.field_g.a(param0 + 1, 3);
              }
            } else {
              this.field_g.a(param0 + 1, 3);
            }
          }
          if (98 == ei.field_q) {
            if (this.field_g.field_e != 3) {
              this.field_g.a(0, 3);
              if (var3 != 0) {
                this.field_g.a(0, d.field_R);
              }
            } else {
              this.field_g.a(0, d.field_R);
            }
          }
          if (param0 != -1) {
            ji.a(12, (String) null);
          }
          this.field_g.e((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.P(" + param0 + ')');
        }
    }

    final void r(int param0) {
        int stackIn_59_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_68_0 = 0;
        int stackIn_93_0 = 0;
        boolean stackIn_275_0 = false;
        int stackIn_285_1 = 0;
        int stackIn_285_2 = 0;
        boolean stackIn_286_3 = false;
        int stackIn_292_1 = 0;
        boolean stackIn_293_2 = false;
        int stackIn_296_0 = 0;
        int stackIn_417_0 = 0;
        int stackIn_419_0 = 0;
        int stackIn_419_1 = 0;
        int stackIn_426_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_460_0 = 0;
        int stackIn_465_0 = 0;
        int stackIn_465_1 = 0;
        int stackIn_469_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_274_0;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        fh var5_ref2 = null;
        String var5_ref3 = null;
        int var6_int = 0;
        gh var6 = null;
        fh var6_ref = null;
        int var7 = 0;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = SteelSentinels.field_G;
        try {
          if (fm.field_f[0] < 3) {
            ti.field_A[0] = qg.field_p;
            if (var19 != 0) {
              ti.field_A[0] = fk.field_f;
            }
          } else {
            ti.field_A[0] = fk.field_f;
          }
          this.a(false);
          if (12 == this.field_c) {
            if (ej.f(-127)) {
              la.a(35);
            }
            return;
          }
          if (this.field_c == 21) {
            if (!tm.field_h &&
              tm.field_d != null &&
              tm.field_d.a(true) &&
              tm.field_d.a("members_expansion_screen", (byte) 90) &&
              tm.field_d.a("arialish12", (byte) 90) &&
              tm.field_d.a("pump32", (byte) 90) &&
              ej.field_t != null &&
              ej.field_t.a(true) &&
              ej.field_t.a("arialish12", (byte) 90) &&
              ej.field_t.a("pump32", (byte) 90)) {
              tm.field_h = true;
            }
            if (tm.field_h) {
              eh.field_c.a(true);
            }
            return;
          }
          if (this.field_c == param0) {
            ma.field_eb.a(0, -this.field_h + 0);
            ob.field_z.a(0, 60 + this.field_k);
            var2_int = 0;
            var2_int = var2_int + pc.e(param0 + 127);
            var2_int = var2_int + 10 * (fm.field_f[2] + fm.field_f[0] + fm.field_f[1]);
            var2_int = var2_int + uf.a(param0 ^ 118, ge.field_m) * 10;
            stackIn_59_0 = var2_int;
            if (ve.a(ge.field_m, param0 + 1, 25)) {
              stackIn_60_1 = 10;
            } else {
              stackIn_60_1 = 0;
            }
            var2_int = stackIn_59_0 + stackIn_60_1;
            var3 = 811;
            var4 = -1 + 10 * var2_int / var3;
            if (var4 > 9) {
              var4 = 9;
            }
            var5_int = 2 + (var3 - var2_int) * 30 / var3;
            stackIn_68_0 = (var2_int != var3) ? 0 : 1;
            var6_int = stackIn_68_0;
            var2_int = var2_int * 279 / var3;
            if (var6_int != 0) {
              var5_int = 0;
            }
            var7 = 14419;
            var8 = -var2_int + (450 + this.field_k);
            pb.a(550, this.field_k + 171, 560, 450 + this.field_k);
            ta.a(10, var7, 0, 0, var7, 192, 550, var8, var5_int);
            if (var8 + var5_int < 450 + this.field_k) {
              pb.c(550, var8 + var5_int, 10, this.field_k + 450 - (var8 + var5_int), var7, 192);
            }
            pb.c();
            fa.field_b.a((-fa.field_b.field_z + 640) / 2, -this.field_h + 15);
            if (!ni.b(param0 + 98) &&
              ul.field_d >= 2) {
              var9 = 520;
              var10 = this.field_k + 100;
              var11_int = 100;
              var12 = 34;
              if (var9 <= oh.field_f &&
                oh.field_f < (var9 + var11_int) &&
                var10 <= pi.field_c &&
                var12 + var10 > pi.field_c) {
                stackIn_93_0 = 1;
              } else {
                stackIn_93_0 = 0;
              }
              var13 = stackIn_93_0;
              fb.a(var12, var10, "TESTING", var11_int, var9, param0 + 12490);
              if (var13 != 0 &&
                !hg.field_h) {
                ee.c(-2483, 97);
              }
              hg.field_h = var13 != 0;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          var2 = null;
          var3 = 0;
          var4 = 0;
          var5_int = this.field_c;
          if (var5_int != 0) {
            boolean decompiledFrameRemainder1 = true;
            if (var5_int != 14) {
              if (var5_int == 13) {
                var2 = ti.field_A[27];
                decompiledFrameRemainder2 = false;
              }
              else {
                if (var5_int == 7 &&
                  var19 == 0) {
                  var2 = ti.field_A[5];
                  decompiledFrameRemainder2 = false;
                }
                else {
                  if (6 == var5_int &&
                    var19 == 0) {
                    var2 = ti.field_A[4];
                    decompiledFrameRemainder2 = false;
                  }
                  else {
                    if (var5_int == 5 &&
                      var19 == 0) {
                      var2 = pa.field_j;
                      decompiledFrameRemainder2 = false;
                    }
                    else {
                      if (var5_int == 8 &&
                        var19 == 0) {
                        var2 = ti.field_A[22];
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        if (var5_int == 19 &&
                          var19 == 0) {
                          var2 = ti.field_A[0];
                          decompiledFrameRemainder2 = false;
                        }
                        else {
                          if (20 == var5_int) {
                            var2 = cc.field_ic[ge.field_j];
                            decompiledFrameRemainder2 = false;
                          }
                          else {
                            if (var5_int != 1 && ((var5_int != 2 ||
                              var19 != 0) &&
                              (var5_int != 3 ||
                              var19 != 0) &&
                              (4 != var5_int ||
                              var19 != 0))) {
                              if (var5_int == 22 &&
                                var19 == 0) {
                                var4 = 1;
                                var2 = un.field_e;
                                var3 = 1;
                                decompiledFrameRemainder2 = false;
                              }
                              else {
                                if (var5_int == 17) {
                                  var2 = jd.field_pb;
                                  decompiledFrameRemainder2 = false;
                                }
                                if (((decompiledFrameRemainder2) &&
                                  (decompiledFrameRemainder2 = (var5_int == 18))) &&
                                  (decompiledFrameRemainder1 = (var19 == 0))) {
                                  var2 = "TESTING ONLY";
                                  decompiledFrameRemainder2 = false;
                                }
                              }
                            }
                            if ((decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1)) {
                              var4 = 1;
                              var2 = un.field_d;
                              var3 = 1;
                              decompiledFrameRemainder2 = false;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if (decompiledFrameRemainder2) {
              var2 = ti.field_A[28];
            }
          }
          if (var4 != 0) {
            var5_int = 60;
            var5_int = var5_int + 30 * uc.field_e[this.field_c].length;
            var6_int = -30 + this.b(0, (byte) 126);
            var7 = -25 + this.g(param0 + 125, 0);
            var8 = 640 - var7 * 2;
            jm.a(var6_int, var5_int, eb.field_p, 1, var7, var8);
          }
          if (this.field_c != 0) {
            var5_int = this.d((byte) 114);
            fi.field_j.a(0, -5, 80, 7);
            fi.field_j.a(0, 474 - var5_int, 80, 2 + var5_int / 8);
            si.c(103);
            if (var3 != 0 ||
              this.field_c == 7 &&
              !od.field_e &&
              pm.field_U == 0 ||
              this.field_c == 14 &&
              0 == pm.field_U &&
              (!kf.field_s ||
              !lg.field_l)) {
              if (14 == this.field_c) {
                var6 = bl.field_c;
                var7_ref = kk.field_a;
                if (fg.field_Ob == 1) {
                  var7_ref = null;
                }
                if (null != var6) {
                  pb.a(0, 50, var6.field_Rb, -var5_int + 430, 0);
                  if (var6.field_cb > 50) {
                    pb.a(var6.field_Rb, 50, var6.field_zb, var6.field_cb - 50, 0);
                  }
                  if ((var6.field_Lb + var6.field_cb) < (430 - var5_int)) {
                    pb.a(var6.field_Rb, var6.field_cb + var6.field_Lb, var6.field_zb, 430 + (-var5_int - var6.field_cb) - var6.field_Lb, 0);
                  }
                  boolean decompiledSharedTail0 = (null != var7_ref);
                  if (!decompiledSharedTail0) {
                    pb.a(var6.field_zb + var6.field_Rb, 50, -var6.field_zb - var6.field_Rb + 640, -var5_int + 430, 0);
                    decompiledSharedTail0 = (var19 != 0);
                  }
                  if (decompiledSharedTail0) {
                    pb.a(var6.field_zb + var6.field_Rb, 50, -var6.field_Rb + (((gh) (var7_ref)).field_Rb - var6.field_zb), 430 - var5_int, 0);
                  }
                }
                if (null != var7_ref) {
                  if (null == var6) {
                    pb.a(0, 50, ((gh) (var7_ref)).field_Rb, 430 - var5_int, 0);
                  }
                  if (((gh) (var7_ref)).field_cb > 50) {
                    pb.a(((gh) (var7_ref)).field_Rb, 0, ((gh) (var7_ref)).field_zb, ((gh) (var7_ref)).field_cb, 0);
                  }
                  if (((gh) (var7_ref)).field_Lb + ((gh) (var7_ref)).field_cb < -var5_int + 430) {
                    pb.a(((gh) (var7_ref)).field_Rb, ((gh) (var7_ref)).field_Lb + ((gh) (var7_ref)).field_cb, ((gh) (var7_ref)).field_zb, -((gh) (var7_ref)).field_cb + 480 - ((gh) (var7_ref)).field_Lb, 0);
                  }
                  pb.a(((gh) (var7_ref)).field_zb + ((gh) (var7_ref)).field_Rb, 50, 640 - ((gh) (var7_ref)).field_Rb - ((gh) (var7_ref)).field_zb, -var5_int + 430, 0);
                }
                if (var6 == null &&
                  null == var7_ref) {
                  pb.a(0, 50, 640, 630 - var5_int, 0);
                }
                if (var19 != 0) {
                  pb.a(0, 50, 640, -var5_int + 430, 0);
                }
              }
            } else {
              pb.a(0, 50, 640, -var5_int + 430, 0);
            }
            hb.a((byte) -95, oa.field_U, 640, 49, 0, 431 - var5_int);
            var6_int = 50 - ic.field_db.field_B;
            ic.field_db.a(0, var6_int - this.field_h);
            pb.c(0, -this.field_h + 49, 640, 0, 128);
            sh.a(-16088, 640, var5_int, 480 - var5_int + this.field_k, 0);
          }
          if (this.field_c == 17) {
            var5_int = this.b(0, (byte) 87) - 30;
            var6_int = 30 + this.b(uc.field_e[this.field_c].length - 5, (byte) -113) + this.c(25, -5 + uc.field_e[this.field_c].length);
            jm.a(var5_int, var6_int - var5_int, eb.field_p, 1, 170, 300);
          }
          if (null != var2) {
            ql.field_Tb.a(ke.a(42, (String) (var2)), 320, 18 + (ql.field_Tb.field_G / 2 - this.field_h), 0, -1);
          }
          var5_int = 0;
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (!(var5_int < this.field_g.field_m)))) {
            stackOut_274_0 = this.e(var5_int, param0 + 20);
            stackIn_296_0 = stackOut_274_0 ? 1 : 0;
            stackIn_275_0 = stackOut_274_0;
            if (var19 == 0) {
              if (stackIn_275_0) {
                if (this.b(param0 - 103, var5_int) >= 0) {
                  stackIn_285_1 = -124;
                  stackIn_285_2 = var5_int;
                  stackIn_286_3 = (~var5_int == ~this.field_g.field_e);
                  this.a(stackIn_285_1, stackIn_285_2, stackIn_286_3);
                } else {
                  stackIn_292_1 = var5_int;
                  stackIn_293_2 = (this.field_g.field_e == var5_int);
                  this.a(stackIn_292_1, stackIn_293_2, 30241);
                }
              }
              var5_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            var5_int = this.field_c;
            stackIn_296_0 = var5_int;
          }
          L48: {
            L49: {
              L50: {
                L51: {
                  L52: {
                    L53: {
                      if (stackIn_296_0 == 5 &&
                        var19 == 0) {
                        this.c(-87);
                        break L48;
                      } else if (var5_int != 6 ||
                        var19 != 0) {
                        if (7 == var5_int) {
                          break L53;
                        }
                        if (var5_int == 8 &&
                          var19 == 0) {
                          break L52;
                        }
                        if (var5_int == 9 &&
                          var19 == 0) {
                          break L51;
                        }
                        if (10 == var5_int) {
                          break L50;
                        }
                        if ((var5_int != 13 ||
                          var19 != 0)) {
                          if (var5_int == 14 &&
                            var19 == 0) {
                            break L49;
                          }
                          L61: switch ((var19 == 0
                            || var5_int == 17
                            || var5_int == 19
                            || var5_int == 20
                            ) ? var5_int : -1) {
                            case 11:
                              va.field_j.a(ll.field_s, 40, 150, 600, 1000, 1021128, -1, 0, 0, 0);
                              if (var19 == 0) {
                                break L48;
                              }
                            case 16:
                              this.h(7165);
                              if (var19 == 0) {
                                break L48;
                              }
                            case 18:
                              this.m(param0 + 126);
                              if (var19 == 0) {
                                break L48;
                              }
                            case 19:
                              if (uc.field_e[this.field_c] != fa.field_c) {
                                ui.field_U.a(ke.a(42, cc.field_ic[0]), 180, 98, 1021128, -1);
                                ui.field_U.a(ke.a(42, cc.field_ic[1]), 460, 98, 1021128, -1);
                                var5_int = 0;
                                boolean decompiledNaturalLoopExit1 = false;
                                while (!(decompiledNaturalLoopExit1 = (var5_int >= 20))) {
                                  stackIn_465_0 = var5_int;
                                  stackIn_465_1 = 10;
                                  if (var19 == 0) {
                                    if (stackIn_465_0 >= stackIn_465_1 &&
                                      fm.field_f[var5_int / 10] > 0) {
                                      stackIn_460_0 = 21;
                                    } else {
                                      stackIn_460_0 = 0;
                                    }
                                    var6_int = stackIn_460_0;
                                    var7 = 74;
                                    pb.h(-4 + this.g(127, var5_int + 0), var7, this.a(var5_int - 0, (byte) 115) - (this.g(126, 0 + var5_int) - 8), -var7 + (4 + this.b(9 + var5_int, (byte) -103)) + (this.c(25, var5_int + 9) + var6_int), 3158064);
                                    var5_int += 10;
                                    continue;
                                  }
                                  break;
                                }
                                if (decompiledNaturalLoopExit1) {
                                  if (fm.field_f[1] <= 0) {
                                    break L48;
                                  }
                                  stackIn_465_0 = ~fm.field_f[1];
                                  stackIn_465_1 = -11;
                                }
                                stackIn_469_0 = (stackIn_465_0 != stackIn_465_1) ? 1656673 : 1021128;
                                var5_int = stackIn_469_0;
                                var6_int = 0;
                                var7 = 0;
                                do {
                                  if (!(fm.field_f[1] > var7)) {
                                    pl.field_U.a(ic.field_E + qa.a(param0 - 1, var6_int), (this.g(127, 19) + this.a(19, (byte) 120)) / 2, this.b(19, (byte) 76) - (-this.c(25, 19) - 17), var5_int, -1);
                                    break;
                                  }
                                  var6_int = var6_int + jh.field_a[var7];
                                  var7++;
                                } while (var19 == 0);
                                if (var19 == 0) {
                                  break L48;
                                }
                                break L61;
                              }
                              var5 = new int[3];
                              var6_int = 0;
                              {
                                do {
                                  if (var6_int >= 3) {
                                    var6_int = 0;
                                    break;
                                  }
                                  var5[var6_int] = (this.g(127, var6_int * 10) + this.a(10 * var6_int, (byte) 110)) / 2;
                                  ui.field_U.a(ke.a(42, cc.field_ic[var6_int]), var5[var6_int], 98, 1021128, -1);
                                  var6_int++;
                                } while (var19 == 0);
                                boolean decompiledNaturalLoopExit0 = false;
                                while (!(decompiledNaturalLoopExit0 = (30 <= var6_int))) {
                                  stackIn_419_0 = ~var6_int;
                                  stackIn_419_1 = -11;
                                  if (var19 == 0) {
                                    if (stackIn_419_0 <= stackIn_419_1 &&
                                      0 < fm.field_f[var6_int / 10]) {
                                      stackIn_417_0 = 21;
                                    } else {
                                      stackIn_417_0 = 0;
                                    }
                                    var7 = stackIn_417_0;
                                    var8 = 74;
                                    pb.h(this.g(126, var6_int + 0) - 4, var8, this.a(0 + var6_int, (byte) 112) - (this.g(126, 0 + var6_int) - 8), this.b(9 + var6_int, (byte) 32) - (-this.c(25, 9 + var6_int) - 4) + (-var8 + var7), 3158064);
                                    var6_int += 10;
                                    continue;
                                  }
                                  break;
                                }
                                if (decompiledNaturalLoopExit0) {
                                  stackIn_419_0 = 0;
                                  stackIn_419_1 = fm.field_f[1];
                                }
                                boolean decompiledFrameCompleted1 = true;
                                if (stackIn_419_0 < stackIn_419_1) {
                                  stackIn_426_0 = (fm.field_f[1] == 10) ? 1021128 : 1656673;
                                  var6_int = stackIn_426_0;
                                  var7 = 0;
                                  var8 = 0;
                                  while (var8 < fm.field_f[1]) {
                                    var7 = var7 + jh.field_a[var8];
                                    var8++;
                                    if (var19 != 0) {
                                      decompiledFrameCompleted1 = false;
                                      break;
                                    }
                                  }
                                  if (decompiledFrameCompleted1) {
                                    pl.field_U.a(ic.field_E + qa.a(-1, var7), var5[1], this.b(19, (byte) -125) + (this.c(param0 + 25, 19) + 17), var6_int, -1);
                                  }
                                }
                                boolean decompiledFrameCompleted0 = true;
                                if (0 < fm.field_f[2]) {
                                  stackIn_440_0 = (fm.field_f[2] == 10) ? 1021128 : 1656673;
                                  var6_int = stackIn_440_0;
                                  var7 = 0;
                                  var8 = 0;
                                  while (var8 < fm.field_f[2]) {
                                    var7 = var7 + jh.field_a[var8 + 10];
                                    var8++;
                                    if (var19 != 0) {
                                      decompiledFrameCompleted0 = false;
                                      break;
                                    }
                                  }
                                  if (decompiledFrameCompleted0) {
                                    pl.field_U.a(ic.field_E + qa.a(~param0, var7), var5[2], 17 + (this.b(29, (byte) 108) + this.c(25, 29)), var6_int, -1);
                                  }
                                }
                                break L48;
                              }
                            case 20:
                              break;
                            case 17:
                            default:
                              break L48;
                          }
                          this.n(21345);
                        }
                        break L48;
                      }
                      this.p(-119);
                      break L48;
                    }
                    this.i((byte) -127);
                    if (var19 == 0) {
                      break L48;
                    }
                  }
                  this.a(48, false);
                  if (var19 == 0) {
                    break L48;
                  }
                }
                this.a(48, true);
                if (var19 == 0) {
                  break L48;
                }
              }
              this.f(param0 ^ 126);
              if (var19 == 0) {
                break L48;
              }
            }
            try {
              ff.g((byte) 35);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref = decompiledCaughtException;
              hl.field_v = ji.a(ua.field_x, (byte) 118, di.field_c);
              uc.field_b = cj.a(param0 ^ 95, di.field_c, hl.field_v);
              vn.d(param0 - 119);
              System.err.println("Draw config: " + var5_ref);
              var5_ref.printStackTrace();
            }
          }
          if (14 != this.field_c) {
            sn.field_q = -1;
          }
          if (!(sn.field_q >= 0) ||
            var4 != 0) {
            if (gh.field_J &&
              var4 == 0) {
              km.field_a = ee.field_I;
              pb.c(0, 0, 640, 480, 0, 128);
              var5_ref2 = ff.field_lb;
              var6_int = ((mi) ((Object) var5_ref2)).a(ee.field_I, 424, 0);
              var6_int += 54;
              var7 = (480 - var6_int) / 2;
              ak.a((wk) null, var7, km.field_a, 440, 100, -2, var6_int, 1071146, (String[]) null, true);
              var8 = 30;
              var9 = 100;
              var10 = 110;
              var11_int = -var8 - 8 + (var7 + var6_int);
              var12 = ln.field_g;
              ln.field_g = -1;
              if (nm.a(var11_int, var10, 123, sn.field_h, var8, var9)) {
                ln.field_g = 0;
              }
              var10 = var10 + (var9 + 10);
              var9 = 200;
              if (nm.a(var11_int, var10, 126, cf.field_v, var8, var9)) {
                ln.field_g = 1;
              }
              var10 = var10 + (var9 + 10);
              var9 = 100;
              if (nm.a(var11_int, var10, 116, tj.field_b, var8, var9)) {
                ln.field_g = 2;
              }
              if (ln.field_g != var12 &&
                ln.field_g != -1) {
                ee.c(-2483, 97);
              }
              if (var19 == 0) {
                return;
              }
            }
            if (null == km.field_a) {
              return;
            }
            if (var4 != 0) {
              return;
            }
            var5_int = 300;
            if (km.field_a == td.field_ac ||
              ra.field_b == km.field_a) {
              var5_int = 330;
            }
            var6_int = (-var5_int + 640) / 2;
            pb.c(0, 0, 640, 480, 0, 128);
            var7_ref = ff.field_lb;
            var8 = ((mi) (var7_ref)).a(km.field_a, var5_int - 16, 0);
            var9 = 0;
            if (null != ln.field_c) {
              var9 = ln.field_c.field_F + 4;
            }
            var8 = var8 + (var9 + 52);
            var10 = (-var8 + 480) / 2;
            var11 = al.field_f;
            if (td.field_ac == km.field_a ||
              km.field_a == ra.field_b) {
              var11 = null;
            }
            boolean decompiledFrameRemainder0 = true;
            var12 = ak.a(ln.field_c, var10, km.field_a, var5_int, var6_int, param0 - 2, var8, 1071146, var11, true);
            var13 = 30;
            var14 = 100;
            var15 = (-var14 + 640) / 2;
            var16 = -8 + (var8 + var10) - var13;
            if (td.field_ac != km.field_a &&
              ra.field_b != km.field_a) {
              if (var12 >= 0 &&
                !gd.field_ub) {
                ee.c(-2483, 97);
              }
              gd.field_ub = !(var12 < 0);
              decompiledFrameRemainder0 = (var19 != 0);
            }
            if (decompiledFrameRemainder0) {
              var17 = ln.field_g;
              var14 = 100;
              ln.field_g = -1;
              var15 = 165;
              var18 = nm.a(var16, var15, 124, ma.field_Z, var13, var14) ? 1 : 0;
              if (var18 != 0 &&
                !gd.field_ub) {
                ee.c(-2483, 97);
              }
              var15 = var15 + (10 + var14);
              gd.field_ub = var18 != 0;
              var14 = 200;
              var18 = nm.a(var16, var15, 121, cf.field_v, var13, var14) ? 1 : 0;
              if (var18 != 0) {
                ln.field_g = 0;
                if (var17 != 0) {
                  ee.c(param0 - 2483, 97);
                }
              }
            }
            if (var19 == 0) {
              return;
            }
          }
          ln.field_c = b.field_q[1];
          km.field_a = pg.field_y;
          var5 = null;
          if ((sn.field_q & 128) != 0) {
            var5_ref3 = t.field_e[-128 + sn.field_q];
          } else {
            if (sn.field_q == 34) {
              var5_ref3 = "GODULE";
            }
            var5_ref3 = rj.field_m[sn.field_q];
          }
          km.field_a = db.a(km.field_a, -22, new String[]{var5_ref3, Integer.toString(f.field_v), Integer.toString(li.field_v)});
          pb.c(0, 0, 640, 480, 0, 128);
          var6_ref = ff.field_lb;
          var7 = ln.field_c.field_F;
          var8 = ((mi) ((Object) var6_ref)).a(km.field_a, 284, 16);
          var8 = var8 + (50 + var7);
          var9 = (-var8 + 480) / 2;
          var10 = ak.a(ln.field_c, var9, km.field_a, 300, 170, -2, var8, 1071146, el.field_Vb, true);
          if (0 <= var10 &&
            jl.field_p != var10) {
            ee.c(-2483, 97);
          }
          jl.field_p = var10;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "ji.A(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (-1 != this.field_g.field_e) {
          param1 = this.field_g.field_e;
        }
        this.field_g.a(param0, param1, 0, this.a(oh.field_f, pi.field_c, 77));
        gb.field_a = a.field_c;
        if (param2 >= -56) {
          return;
        }
        try {
          in.field_k = -1;
          ao.field_C = -1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_149_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var4_intLifetime1;
        var5 = SteelSentinels.field_G;
        try {
          if (param2 >= 1 &&
            param2 <= 2) {
            boolean decompiledFrameRemainder0 = true;
            if (1 != param2) {
              var4_int = param1;
              if (var4_int != 0 ||
                var5 != 0) {
                if (var4_int == 1 &&
                  var5 == 0) {
                  stackIn_60_0 = 7;
                  return stackIn_60_0;
                }
                if (2 == var4_int &&
                  var5 == 0) {
                  stackIn_62_0 = 7;
                  return stackIn_62_0;
                }
                if (3 == var4_int) {
                  stackIn_64_0 = 7;
                  return stackIn_64_0;
                }
                if (var4_int == 4 &&
                  var5 == 0) {
                  stackIn_66_0 = 7;
                  return stackIn_66_0;
                }
                if (var4_int == 5) {
                  stackIn_68_0 = 7;
                  return stackIn_68_0;
                }
                if (var4_int == 6) {
                  stackIn_70_0 = 10;
                  return stackIn_70_0;
                }
                if (7 == var4_int &&
                  var5 == 0) {
                  stackIn_72_0 = 7;
                  return stackIn_72_0;
                }
                if (var4_int == 8 &&
                  var5 == 0) {
                  stackIn_74_0 = 10;
                  return stackIn_74_0;
                }
                decompiledFrameRemainder0 = (var4_int == 9);
                if ((decompiledFrameRemainder0) &&
                  (var5 == 0)) {
                  stackIn_76_0 = 7;
                  return stackIn_76_0;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_58_0 = 5;
                return stackIn_58_0;
              }
            }
            if (decompiledFrameRemainder0) {
              var4_intLifetime1 = param1;
              if (var4_intLifetime1 == 0 &&
                var5 == 0) {
                stackIn_126_0 = 3;
                return stackIn_126_0;
              }
              if (var4_intLifetime1 == 1) {
                stackIn_128_0 = 6;
                return stackIn_128_0;
              }
              if (var4_intLifetime1 == 2 &&
                var5 == 0) {
                stackIn_130_0 = 9;
                return stackIn_130_0;
              }
              if (var4_intLifetime1 == 3 &&
                var5 == 0) {
                stackIn_132_0 = 9;
                return stackIn_132_0;
              }
              if (var4_intLifetime1 == 4 &&
                var5 == 0) {
                stackIn_134_0 = 3;
                return stackIn_134_0;
              }
              if (var4_intLifetime1 == 5) {
                stackIn_136_0 = 5;
                return stackIn_136_0;
              }
              if (var4_intLifetime1 == 6) {
                stackIn_138_0 = 5;
                return stackIn_138_0;
              }
              if (var4_intLifetime1 == 7 &&
                var5 == 0) {
                stackIn_140_0 = 9;
                return stackIn_140_0;
              }
              if (var4_intLifetime1 == 8 &&
                var5 == 0) {
                stackIn_142_0 = 5;
                return stackIn_142_0;
              }
              if (9 == var4_intLifetime1) {
                stackIn_144_0 = 7;
                return stackIn_144_0;
              }
            }
            if (param0 < -66) {
              stackIn_149_0 = 0;
              return stackIn_149_0;
            }
            stackIn_147_0 = -100;
            return stackIn_147_0;
          }
          stackIn_6_0 = -1;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var4), "ji.UA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 16383) {
            this.a(53, false);
          }
          this.field_g.e((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.Q(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        boolean stackIn_113_0 = false;
        boolean stackIn_135_0 = false;
        int stackIn_241_0 = 0;
        gh stackIn_304_0 = null;
        int stackIn_305_0 = 0;
        int stackIn_312_0 = 0;
        gh stackIn_314_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_112_0;
        boolean stackOut_134_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        kg var3 = null;
        gh var3_ref = null;
        int var4_int = 0;
        gh var4 = null;
        int var5_int = 0;
        gh var5 = null;
        int var6_int = 0;
        gh var6 = null;
        Object var7 = null;
        int var7_int = 0;
        int var8_int = 0;
        gh var8 = null;
        int var9_int = 0;
        gh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        gh var13 = null;
        String[] var14 = null;
        gh var14_ref = null;
        int var15_int = 0;
        gh var15 = null;
        int var16_int = 0;
        gh var16 = null;
        int var17_int = 0;
        lb var17 = null;
        gh[] var18 = null;
        kg var18_ref = null;
        int var19_int = 0;
        gh var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        gh var22 = null;
        int var23 = 0;
        int var24 = 0;
        String var25_ref_String = null;
        int var25 = 0;
        int var26 = 0;
        gh var26_ref_gh = null;
        gh var27 = null;
        int var27_int = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        gh stackIn_304_0Lifetime1;
        gh var6Lifetime1;
        Object var7Lifetime1;
        gh var14_refLifetime1;
        gh var27Lifetime1;
        int stackIn_241_0Lifetime1;
        int var5_intLifetime1;
        int var13_intLifetime1;
        int var15_intLifetime1;
        int var16_intLifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27_intLifetime1;
        int var28Lifetime1;
        int var28Lifetime2;
        int var29Lifetime1;
        int var27_intLifetime1Lifetime1;
        var31 = SteelSentinels.field_G;
        try {
          if (param0 > -28) {
            this.q(-72);
          }
          var2_int = ha.field_V;
          ha.field_V = -1;
          od.field_e = false;
          if (0 != pm.field_U) {
            od.field_e = true;
          }
          if (null != gd.field_sb) {
            boolean decompiledFrameRemainder1 = true;
            var3 = nf.field_a;
            var4_int = var3.field_Ub.field_eb;
            var5_int = ef.field_c;
            if (var5_int == 104 &&
              var31 == 0) {
              var3.field_Ub.field_gb = var3.field_Ub.field_gb + Math.min(-20 + var3.field_Lb, -var3.field_Ub.field_eb);
              decompiledFrameRemainder1 = false;
            } else {
              decompiledFrameRemainder1 = (var5_int == 105);
            }
            if (decompiledFrameRemainder1) {
              var3.field_Ub.field_gb = var3.field_Ub.field_gb - Math.min(var3.field_Lb - 20, var3.field_Ub.field_Lb - var3.field_Lb + var3.field_Ub.field_eb);
            }
            gd.field_sb.a((byte) -44, true);
            var5_intLifetime1 = -1;
            if (null != var3) {
              var3.a((byte) 96, jj.field_d * 32, 128, false, 32);
              var6_int = var3.field_Ub.field_eb;
              var7 = null;
              var8_int = 0;
              while (var8_int < 32) {
                if (null != ck.field_f[var8_int]) {
                  boolean decompiledFrameRemainder2 = true;
                  var9_int = hc.field_R[var8_int] + (10 + ff.field_lb.field_W / 2);
                  if (var9_int < -var6_int) {
                    var7 = ck.field_f[var8_int];
                    if (98 == ef.field_c) {
                      var5_intLifetime1 = var8_int;
                    }
                    ck.field_f[var8_int].field_nb = 2061990;
                    decompiledFrameRemainder2 = !(!ck.field_f[var8_int].field_kb);
                    if (decompiledFrameRemainder2) {
                      ck.field_f[var8_int].field_nb = 0;
                    }
                  }
                  if ((decompiledFrameRemainder2) &&
                    (!(var9_int < -var6_int) ||
                    var31 != 0)) {
                    if (-var6_int + var3.field_Tb.field_Lb <= var9_int) {
                      ck.field_f[var8_int].field_nb = 2061990;
                      if (ck.field_f[var8_int].field_kb) {
                        ck.field_f[var8_int].field_nb = 0;
                        if (var31 != 0) {
                          var7 = null;
                          ck.field_f[var8_int].field_nb = 10526880;
                        }
                      }
                    } else {
                      var7 = null;
                      ck.field_f[var8_int].field_nb = 10526880;
                    }
                  }
                  if (ef.field_c == 99 &&
                    var5_intLifetime1 < 0 &&
                    var9_int > -var6_int + 20) {
                    var5_intLifetime1 = var8_int;
                  }
                  var8_int++;
                  if (var31 == 0) {
                    continue;
                  }
                }
                break;
              }
              if (var7 != null) {
                ((gh) (var7)).field_nb = 10526880;
              }
            }
            ef.field_c = 0;
            if (0 <= var5_intLifetime1) {
              var3.field_Ub.field_gb = -4 + (-var3.field_Ub.field_eb - hc.field_R[var5_intLifetime1]);
              if (-var3.field_Ub.field_eb < var3.field_Ub.field_gb) {
                var3.field_Ub.field_gb = -var3.field_Ub.field_eb;
              }
              if (-var3.field_Ub.field_Lb - (var3.field_Ub.field_lb + (-var3.field_Tb.field_Lb + var3.field_Ub.field_eb)) > var3.field_Ub.field_gb) {
                var3.field_Ub.field_gb = -var3.field_Ub.field_eb + (-var3.field_Ub.field_lb - var3.field_Ub.field_Lb + var3.field_Tb.field_Lb);
              }
            }
            var6 = gd.field_sb.a("HeadingsPane", false);
            if (null != var6 &&
              null != var3 &&
              var6.field_kb) {
              var7_int = 0;
              while (var7_int < 32) {
                if (null == ck.field_f[var7_int]) {
                  break;
                }
                boolean decompiledFrameRemainder0 = true;
                if (ck.field_f[var7_int].field_kb) {
                  ha.field_V = var7_int;
                  if ((lb.field_gc != 1) &&
                    (decompiledFrameRemainder0 = (var2_int != var7_int))) {
                    var2_int = var7_int;
                    ee.c(-2483, 97);
                    decompiledFrameRemainder0 = (var31 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    ee.c(-2483, 95);
                    var3.field_Ub.field_gb = -hc.field_R[var7_int] - var3.field_Ub.field_eb - 4;
                    if (var3.field_Ub.field_gb > -var3.field_Ub.field_eb) {
                      var3.field_Ub.field_gb = -var3.field_Ub.field_eb;
                    }
                    if (-var3.field_Ub.field_eb + (-var3.field_Ub.field_lb - var3.field_Ub.field_Lb + var3.field_Tb.field_Lb) <= var3.field_Ub.field_gb) {
                      break;
                    }
                    var3.field_Ub.field_gb = -var3.field_Ub.field_eb + (-var3.field_Ub.field_lb + (-var3.field_Ub.field_Lb + var3.field_Tb.field_Lb));
                    if (var31 == 0) {
                      break;
                    }
                  }
                }
                var7_int++;
                if (var31 == 0) {
                  continue;
                }
                break;
              }
            }
            if (var3.field_Ub.field_eb != var4_int) {
              od.field_e = true;
            }
          }
          if (gd.field_sb != null) {
            return;
          }
          od.field_e = true;
          gd.field_sb = new gh();
          gd.field_sb.a(0, 0, 480, 0, 640);
          var3_ref = new gh("DataView", (gh) null);
          pf.field_n = 4;
          bg.field_y = 4;
          bi.field_d = 15;
          var4 = new gh();
          var4.field_nb = 10526880;
          var4.field_L = (mi) ((Object) ff.field_lb);
          var5 = new gh(-1L, var4);
          var5.field_I = gf.field_c;
          var5.field_nb = 0;
          var6Lifetime1 = new gh();
          var6Lifetime1.field_Kb = 1;
          var6Lifetime1.field_Fb = 1;
          var6Lifetime1.field_I = pd.field_T;
          var7Lifetime1 = new gh(-1L, var5);
          ((gh) (var7Lifetime1)).field_ub = 3;
          ((gh) (var7Lifetime1)).field_Ib = 10;
          ((gh) (var7Lifetime1)).field_I = sa.field_e;
          ((gh) (var7Lifetime1)).field_nb = 2061990;
          ((gh) (var7Lifetime1)).field_Ab = wc.field_d;
          ((gh) (var7Lifetime1)).field_Kb = 1;
          ((gh) (var7Lifetime1)).field_L = (mi) ((Object) fk.field_d);
          ((gh) (var7Lifetime1)).field_sb = 0;
          var5.field_Kb = 1;
          var5.field_L = (mi) ((Object) pl.field_U);
          var8 = new gh();
          var8.field_I = tk.field_t;
          var4.field_Fb = 1;
          var9 = new gh("HeadingsPane", (gh) null);
          jj.field_a = var9;
          var9.a(0, 60, 370, 16, 106);
          var10 = 4;
          var11 = 0;
          var12 = -5;
          var13_int = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(var13_int < wc.field_g.length)))) {
            var14 = wc.field_g[var13_int];
            var15_int = 0;
            stackOut_112_0 = nk.f((byte) -96);
            stackIn_305_0 = stackOut_112_0 ? 1 : 0;
            stackIn_113_0 = stackOut_112_0;
            if (var31 == 0) {
              if (stackIn_113_0 ||
                (var13_int < 62 ||
                63 < var13_int) &&
                (65 > var13_int ||
                var13_int > 67)) {
                var16_int = 0;
                if (var14 != null &&
                  0 != var14.length) {
                  var17_int = 0;
                  var18 = new gh[var14.length];
                  var19_int = 0;
                  var20 = 0;
                  var21 = 0;
                  var22_int = 0;
                  var23 = 0;
                  while (true) {
                    if (var23 < var14.length) {
                      var24 = -1;
                      var25_ref_String = var14[var23];
                      var26 = 0;
                      stackOut_134_0 = var25_ref_String.startsWith("<lock>");
                      stackIn_241_0 = stackOut_134_0 ? 1 : 0;
                      stackIn_135_0 = stackOut_134_0;
                      if (stackIn_135_0) {
                        var25_ref_String = var25_ref_String.substring(6);
                        if (!nk.f((byte) -20)) {
                          var26 = 1;
                        }
                      }
                      if (!var25_ref_String.startsWith("<top>")) {
                        if (var25_ref_String.startsWith("<centre>")) {
                          var25_ref_String = var25_ref_String.substring(8);
                          var24 = 1;
                        } else if (var25_ref_String.startsWith("<bottom>")) {
                          var25_ref_String = var25_ref_String.substring(8);
                          var24 = 2;
                        }
                      } else {
                        var24 = 0;
                        var25_ref_String = var25_ref_String.substring(5);
                      }
                      if (!var25_ref_String.equals("<lockpic>")) {
                        if (!var25_ref_String.startsWith("<pic") ||
                          !var14[var23].endsWith(">")) {
                          if (var25_ref_String.startsWith("<h>")) {
                            var18[var23] = new gh((long)var11, var5);
                            if (var16_int == 0) {
                              var16_int = 1;
                              var12 += 10;
                            }
                            var18[var23].field_S = var25_ref_String.substring(3);
                            var27 = new gh((long)var11, (gh) (var7Lifetime1));
                            var27.field_S = ke.a(42, var18[var23].field_S);
                            var28 = var27.field_L.a(var27.field_S, -(var27.field_ub * 2) + 106, var27.field_Ib) + 3;
                            var27.a(0, var10, var28, 0, 106);
                            var10 = var10 + (var28 + 4);
                            var9.a(var27, 125);
                            ck.field_f[var11] = var27;
                            hc.field_R[var11] = -10 + var12;
                            var11++;
                            var21++;
                          } else {
                            if (dm.field_c) {
                              var25_ref_String = ln.a(" <img=13> <img=14> <img=15>", (byte) 11, "", var25_ref_String);
                            }
                            if (tj.field_a) {
                              var25_ref_String = ln.a("<rmbcancelonoff>", (byte) 11, bc.field_yb, var25_ref_String);
                            } else {
                              var25_ref_String = ln.a("<rmbcancelonoff>", (byte) 11, i.field_a, var25_ref_String);
                            }
                            var18[var23] = new gh(-1L, var4);
                            var18[var23].field_S = var25_ref_String;
                            if (var19_int != 0) {
                              var18[var23].field_Ib = 19;
                            }
                            if (var15_int != 0) {
                              var18[var23].field_I = pd.field_T;
                              var18[var23].field_ub = 8;
                              var18[var23].field_sb = 6;
                            }
                            var21++;
                            if (var26 != 0) {
                              var18[var23].field_Pb = sj.field_F;
                            }
                          }
                        } else {
                          var18[var23] = new gh(-1L, var6Lifetime1);
                          var27_int = Integer.parseInt(var25_ref_String.substring(4, var25_ref_String.length() - 1));
                          var18[var23].field_Pb = ja.b(var27_int, true);
                          var28 = 0;
                          if (var27_int >= 100 &&
                            var27_int < 200) {
                            var18[var23].field_I = null;
                          }
                          var29 = 4;
                          if (200 <= var27_int ||
                            5 == var27_int ||
                            7 == var27_int ||
                            9 <= var27_int &&
                            12 >= var27_int ||
                            var27_int == 22) {
                            var29 = 12;
                            var20 = var20 | 1 << var23;
                            var28 = 48;
                          }
                          if (3 == var27_int) {
                            var19_int = 1;
                          }
                          if (var18[var23].field_Pb == null) {
                            var18[var23].field_Pb = g.field_d;
                          }
                          if (var26 != 0) {
                            var18[var23].field_Pb = ug.field_P;
                          }
                          if (var28 == 0) {
                            var28 = var29 + var18[var23].field_Pb.field_A;
                          }
                          var22_int = var22_int + var28;
                        }
                      } else if (!nk.f((byte) -87)) {
                        var18[var23] = new gh(-1L, var6Lifetime1);
                        var18[var23].field_Pb = sj.field_F;
                        var22_int = var22_int + (var18[var23].field_Pb.field_A + 4);
                      } else {
                        var17_int++;
                      }
                      if (-1 != var24 &&
                        var18[var23] != null) {
                        var18[var23].field_Fb = var24;
                      }
                      var23++;
                      continue;
                    }
                    break;
                  }
                  var22_int = var22_int + (var14.length + (1 - var17_int)) * 8;
                  var23Lifetime1 = 0;
                  stackIn_241_0Lifetime1 = -1;
                  if (stackIn_241_0Lifetime1 > ~var21) {
                    var23Lifetime1 = (470 - var22_int) / var21;
                  }
                  if (var16_int != 0) {
                    var23Lifetime1 = 464;
                  }
                  var24Lifetime1 = 0;
                  var25 = 0;
                  while (var25 < var18.length) {
                    var26_ref_gh = var18[var25];
                    stackIn_304_0Lifetime1 = var26_ref_gh;
                    if (stackIn_304_0Lifetime1 != null) {
                      var27_intLifetime1 = 0;
                      if (var26_ref_gh.field_Pb == null) {
                        var28Lifetime1 = var23Lifetime1;
                        if (var15_int != 0) {
                          var28Lifetime1 -= 16;
                        }
                        var27_intLifetime1Lifetime1 = var26_ref_gh.field_L.a(var26_ref_gh.field_S, var28Lifetime1, var26_ref_gh.field_Ib);
                        if (var15_int != 0) {
                          var27_intLifetime1Lifetime1 += 16;
                        }
                      } else if ((1 << var25 & var20) == 0) {
                        var27_intLifetime1Lifetime1 = var26_ref_gh.field_Pb.field_F + 4;
                      } else {
                        var27_intLifetime1Lifetime1 = 12 + var26_ref_gh.field_Pb.field_F;
                      }
                      if (var27_intLifetime1Lifetime1 > var24Lifetime1) {
                        var24Lifetime1 = var27_intLifetime1Lifetime1;
                      }
                    }
                    var25++;
                  }
                  var25Lifetime1 = 8;
                  if (var16_int == 0) {
                    var25Lifetime1 += 4;
                  }
                  if (var18.length == 1 &&
                    var18[0] != null &&
                    var18[0].field_Pb != null) {
                    var25Lifetime1 = (-var18[0].field_Pb.field_A + 480) / 2;
                  }
                  var26Lifetime1 = 0;
                  while (var26Lifetime1 < var18.length) {
                    var27Lifetime1 = var18[var26Lifetime1];
                    if (null != var27Lifetime1) {
                      var28Lifetime2 = var23Lifetime1;
                      var29Lifetime1 = var24Lifetime1;
                      if (var27Lifetime1.field_Pb != null) {
                        var30 = 4;
                        var29Lifetime1 = var30 + var27Lifetime1.field_Pb.field_F;
                        var28Lifetime2 = var27Lifetime1.field_Pb.field_A + var30;
                        if (0 != (1 << var26Lifetime1 & var20)) {
                          var28Lifetime2 = 48;
                          var29Lifetime1 = 48;
                        }
                      }
                      var27Lifetime1.a(0, (-var29Lifetime1 + var24Lifetime1) / 2 + var12, var29Lifetime1, var25Lifetime1, var28Lifetime2);
                      var3_ref.a(var27Lifetime1, 124);
                      var25Lifetime1 = var25Lifetime1 + (8 + var28Lifetime2);
                    }
                    var26Lifetime1++;
                  }
                  var12 = var12 + (4 + var24Lifetime1);
                }
              }
              var13_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_304_0 = var3_ref;
            ((gh) (Object) stackIn_304_0).a(0, 0, var12, 0, 480);
            stackIn_305_0 = 0;
          }
          var13_intLifetime1 = stackIn_305_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var11 <= var13_intLifetime1))) {
            stackIn_314_0 = new gh(-1L, var8);
            if (var31 == 0) {
              var14_ref = stackIn_314_0;
              var15_intLifetime1 = -10 + (5 + (hc.field_R[var13_intLifetime1] + 10));
              if (var11 <= (1 + var13_intLifetime1)) {
                stackIn_312_0 = var12;
              } else {
                stackIn_312_0 = hc.field_R[1 + var13_intLifetime1];
              }
              var16_intLifetime1 = stackIn_312_0;
              var14_ref.a(0, var15_intLifetime1, -var15_intLifetime1 + var16_intLifetime1, 4, 472);
              var3_ref.a(var14_ref, 121);
              var13_intLifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_314_0 = new gh();
          }
          var13 = stackIn_314_0;
          var13.field_db = sj.field_x[1];
          var13.field_Pb = sj.field_x[0];
          var14_refLifetime1 = new gh();
          var14_refLifetime1.field_Pb = ah.field_Zb[0];
          var14_refLifetime1.field_db = ah.field_Zb[1];
          var15 = new gh();
          var15.field_I = qi.field_a;
          var16 = new gh();
          var16.field_I = jn.field_f;
          var17 = new lb("", var13, var14_refLifetime1, var15, var16);
          var18_ref = new kg("Scrollingview", var3_ref, (gh) null, var17);
          nf.field_a = var18_ref;
          var18_ref.a(bi.field_d + 480, -2048, bi.field_d, 358, bg.field_y, 0, 4);
          var18_ref.field_I = null;
          var19 = new gh(-1L, (gh) null);
          var19.field_I = pd.field_T;
          var19.a(var18_ref, 119);
          var19.a(0, 64, 366, 126, 4 + bi.field_d + 480);
          gd.field_sb.a(var19, 125);
          gd.field_sb.a(var9, 119);
          var20Lifetime1 = -2 + var11 + (var9.field_Lb - var10);
          if (var11 > 1) {
            var20Lifetime1 = var20Lifetime1 / (-1 + var11);
            var21Lifetime1 = 0;
            var22 = (gh) (var9.field_M.e(13058));
            while (null != var22) {
              var22.a(0, var21Lifetime1 + var22.field_eb, var22.field_Lb, var22.field_Y, var22.field_zb);
              var21Lifetime1 = var21Lifetime1 + var20Lifetime1;
              var22 = (gh) (var9.field_M.a((byte) -55));
              if (var31 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.K(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        var5 = SteelSentinels.field_G;
        try {
          if (0 == pm.field_U &&
            this.field_c == pm.field_T) {
            this.field_h = 0;
            this.field_k = 0;
            return;
          }
          if (this.field_c != 0 && (0 == pm.field_T ||
            vb.field_g == 0)) {
            this.field_h = 0;
            this.field_k = 0;
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          this.field_k = 480;
          this.field_h = 480;
          var2_int = 0;
          if (2 * pm.field_U < 20) {
            if (this.field_c != 0 &&
              this.field_c != pm.field_T) {
              return;
            }
            var2_int = pm.field_U;
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.field_c != 0 &&
              ~this.field_c != ~vb.field_g) {
              return;
            }
            var2_int = -pm.field_U + 20;
          }
          var3 = 0;
          if (this.field_c == 1 ||
            this.field_c == 2 ||
            this.field_c == 3 ||
            this.field_c == 4) {
            var3Lifetime1 = 200;
            if (var5 != 0) {
              var3Lifetime1 = this.d((byte) 114);
            }
          } else {
            var3Lifetime1 = this.d((byte) 114);
          }
          var4 = 50;
          if (this.field_c == 0) {
            var4 = ma.field_eb.field_B;
          }
          if (param0) {
            return;
          }
          this.field_h = var4 * var2_int / 10;
          if (this.field_c == 0) {
            if (pm.field_U < 10) {
              this.field_k = pm.field_U * (-50 + var3Lifetime1) / 10;
              if (var5 != 0) {
                this.field_k = -50 + (var3Lifetime1 + (pm.field_U * 50 - 500) / 10);
              }
            } else {
              this.field_k = -50 + (var3Lifetime1 + (pm.field_U * 50 - 500) / 10);
            }
            this.field_h = pm.field_U * var4 / 20;
            if (this.field_c != pm.field_T) {
              this.field_k = var3Lifetime1 - this.field_k;
              this.field_h = -this.field_h + var4;
            }
            return;
          }
          if (this.field_c == 0) {
            if (!(2 * pm.field_U >= 20) ||
              ~vb.field_g != ~this.field_c) {
              if (var2_int < 9) {
                this.field_k = var2_int * (var3Lifetime1 - 60) / 9;
                if (var5 == 0) {
                  return;
                }
              }
              this.field_k = (var2_int * 37 - 333) / 1 + var3Lifetime1 - 60;
              if (var5 == 0) {
                return;
              }
            }
            if (var2_int < 1) {
              this.field_k = var2_int * 60 / 1;
              if (var5 == 0) {
                return;
              }
            }
            this.field_k = 60 + (9 + (var2_int - 10)) * (var3Lifetime1 - 60) / 9;
            if (var5 == 0) {
              return;
            }
          }
          this.field_k = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.U(" + param0 + ')');
        }
    }

    final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_c == 6) {
            qi.field_j = null;
          }
          if (this.field_c == 5) {
            qi.field_d = null;
          }
          if (param0 <= 125) {
            this.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.LA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 != 44) {
            ji.d(-110, -20);
          }
          da.a(param0, 25104);
          r.a(false, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.EB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean e(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20) {
            field_d = (int[]) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.PA(" + param0 + ',' + param1 + ')');
        }
    }

    ji(int param0) {
        this.field_k = 0;
        this.field_h = 0;
        try {
          this.field_c = param0;
          this.field_g = new rm(uc.field_e[this.field_c].length);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        String stackIn_24_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        u var10 = null;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = SteelSentinels.field_G;
        try {
          if (param1) {
            field_a = -81;
          }
          boolean decompiledFrameCompleted0 = true;
          var9_int = 1021128;
          var10 = pl.field_U;
          if (param0) {
            var11_int = -11 + param2;
            var12 = 13;
            var13 = 0;
            while (var13 < 4) {
              var14 = nm.field_v[var13];
              var15 = nm.field_v[1 + var13];
              pb.a(var14 + 3, var11_int, -var14 + var15 - 5, var12, 12105);
              var13++;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            ((mi) ((Object) var10)).b(param4, nm.field_v[0] + 5, param2, var9_int, -1);
            param3++;
            ((mi) ((Object) var10)).b(cd.field_c[param5], 5 + nm.field_v[1], param2, var9_int, -1);
          }
          if (param3 != 43) {
            if (param3 != 42) {
              if (param3 != 41) {
                stackIn_24_0 = Integer.toString(param3);
              } else {
                stackIn_24_0 = "40+";
              }
            } else {
              stackIn_24_0 = ob.field_x;
            }
          } else {
            stackIn_24_0 = of.field_a;
          }
          var11 = stackIn_24_0;
          ((mi) ((Object) var10)).c(var11, -1 + nm.field_v[3] - 5, param2, var9_int, -1);
          ((mi) ((Object) var10)).c(Integer.toString(param6), nm.field_v[4] - 6, param2, var9_int, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("ji.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void h(byte param0) {
        try {
          field_d = null;
          field_l = null;
          field_f = null;
          field_b = null;
          if (param0 != -104) {
            field_f = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.S(" + param0 + ')');
        }
    }

    final static void d(int param0, int param1) {
        try {
          nb.b(param1, false);
          if (param0 != 0) {
            ji.a(true, (byte) 17);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ji.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final int b(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        var5 = SteelSentinels.field_G;
        try {
          if (this.field_c == 16) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          var2_int = this.field_g.field_e;
          if (var2_int >= 0 &&
            var2_int >= uc.field_e[this.field_c].length) {
          }
          var3 = this.b(param0 ^ 105, var2_int);
          if (var2_int >= 0 &&
            uc.field_e[this.field_c].length > var2_int &&
            uc.field_e[this.field_c][var2_int] != -1) {
            if (0 == this.field_c) {
              if (uc.field_e[this.field_c][var2_int] != 34 &&
                uc.field_e[this.field_c][-1 + uc.field_e[this.field_c].length] == 34) {
                dh.field_F = var2_int;
                stackIn_38_0 = -1 + uc.field_e[this.field_c].length;
                return stackIn_38_0;
              }
              stackIn_40_0 = var2_int;
              return stackIn_40_0;
            }
            if (this.field_c == 20 &&
              var2_int >= 0 &&
              3 > var2_int) {
              stackIn_49_0 = 0;
              return stackIn_49_0;
            }
            if (var3 >= 0) {
              var3--;
              var2_int--;
              if (0 > var3) {
                var3 += 4;
                var2_int += 4;
              }
              while (true) {
                if (-1 == uc.field_e[this.field_c][var2_int]) {
                  var2_int--;
                  var3--;
                  stackIn_72_0 = var3;
                  if (var5 == 0) {
                    if (stackIn_72_0 < 0) {
                      var2_int += 4;
                      var3 += 4;
                    }
                    if (~var2_int != ~this.field_g.field_e) {
                      continue;
                    }
                    stackIn_70_0 = var2_int;
                    return stackIn_70_0;
                  }
                  break;
                }
                stackIn_72_0 = var2_int;
                break;
              }
              return stackIn_72_0;
            }
            if (5 == this.field_c &&
              var2_int < 3) {
              var2_int--;
              if (0 > var2_int) {
                var2_int += 3;
              }
              stackIn_83_0 = var2_int;
              return stackIn_83_0;
            }
            if (this.field_c == 6 &&
              2 > var2_int) {
              var2_int--;
              if (0 > var2_int) {
                var2_int += 2;
              }
              stackIn_95_0 = var2_int;
              return stackIn_95_0;
            }
            if (this.field_c == 19) {
              stackIn_103_0 = (uc.field_e[this.field_c] == fa.field_c) ? 30 : 20;
              var4 = stackIn_103_0;
              if (var2_int >= 10 &&
                var2_int < var4) {
                stackIn_110_0 = var2_int - 10;
                return stackIn_110_0;
              }
            }
            if (param0 != -20) {
              this.r(1);
            }
            stackIn_115_0 = -1;
            return stackIn_115_0;
          }
          var2_intLifetime1 = uc.field_e[this.field_c].length - 1;
          L16: while (true) {
            if (var2_intLifetime1 >= 0) {
              stackIn_29_0 = -1;
              if (var5 != 0) {
                break L16;
              }
              if (stackIn_29_0 == uc.field_e[this.field_c][var2_intLifetime1]) {
                var2_intLifetime1--;
                continue;
              }
            }
            stackIn_29_0 = var2_intLifetime1;
            break;
          }
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.GA(" + param0 + ')');
        }
    }

    final static long a(int param0, CharSequence param1) {
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        long stackIn_40_0 = 0L;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        try {
          var2_long = 0L;
          var4 = param1.length();
          var5 = 0;
          L1: while (true) {
            if (var5 < var4) {
              var2_long = var2_long * 37L;
              var6 = param1.charAt(var5);
              stackIn_30_0 = var6;
              stackIn_30_1 = 65;
              if (var7 != 0) {
                break L1;
              }
              if (stackIn_30_0 >= stackIn_30_1 &&
                90 >= var6) {
                var2_long = var2_long + (long)(var6 + 1 - 65);
              } else if (var6 >= 97 &&
                var6 <= 122) {
                var2_long = var2_long + (long)(-97 + var6 + 1);
              } else {
                if (var6 >= 48 &&
                  57 >= var6) {
                  var2_long = var2_long + (long)(-48 + var6 + 27);
                }
              }
              if (var2_long < 177917621779460413L) {
                var5++;
                continue;
              }
            }
            stackIn_30_0 = param0;
            stackIn_30_1 = -53;
            break;
          }
          if (stackIn_30_0 >= stackIn_30_1) {
            ji.h((byte) -101);
          }
          L8: while (true) {
            if (var2_long % 37L == 0L) {
              stackIn_40_0 = var2_long;
              if (var7 != 0) {
                break L8;
              }
              if (stackIn_40_0 != 0L) {
                var2_long = var2_long / 37L;
                continue;
              }
            }
            stackIn_40_0 = var2_long;
            break;
          }
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_44_0 = var2;
          stackIn_44_1 = new StringBuilder().append("ji.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1) {
        boolean stackIn_47_0 = false;
        boolean stackIn_61_0 = false;
        boolean stackIn_75_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 < 116) {
            this.p(-101);
          }
          var3_int = uc.field_e[this.field_c][param1];
          if ((43 == var3_int ||
            var3_int == 44) && !dm.field_c) {
            return false;
          }
          if (var3_int == 40 &&
            dc.field_g >= 0) {
            return false;
          }
          if (-1 == var3_int) {
            return false;
          }
          if (28 == var3_int &&
            !vb.b(116)) {
            return false;
          }
          if (var3_int == 1 &&
            !vb.b(122)) {
            return false;
          }
          if (var3_int == 25 &&
            20 == this.field_c) {
            stackIn_47_0 = !(ol.field_Ub <= 0);
            return stackIn_47_0;
          }
          if (var3_int == 26 &&
            this.field_c == 20) {
            stackIn_61_0 = (ol.field_Ub < 9) && (ol.field_Ub < fm.field_f[ge.field_j]);
            return stackIn_61_0;
          }
          if (var3_int == 0 &&
            this.field_c == 20) {
            stackIn_75_0 = (vb.b(114)) && (!ni.b(111));
            return stackIn_75_0;
          }
          if (14 == this.field_c &&
            var3_int == 46 &&
            0 <= dc.field_g) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "ji.HB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 > -90) {
            this.a((String) null, -9, 98, true, 4, -58, 114, -36, 75);
          }
          this.field_g.e((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.G(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        try {
          if (96 == ei.field_q) {
            if (0 < this.field_g.field_e) {
              if (2 != this.field_g.field_e) {
                this.field_g.a(0, 0);
                if (var3 != 0) {
                  this.field_g.a(0, 1);
                }
              }
            } else {
              this.field_g.a(0, 1);
            }
          }
          if (ei.field_q == 97) {
            if (this.field_g.field_e == 1) {
              this.field_g.a(0, 0);
              if ((var3 != 0) &&
                (this.field_g.field_e != 2)) {
                this.field_g.a(0, 1);
              }
            } else {
              if (this.field_g.field_e != 2) {
                this.field_g.a(0, 1);
              }
            }
          }
          if (ei.field_q == 99) {
            if (!(this.field_g.field_e >= 0) ||
              !(this.field_g.field_e <= 1)) {
              this.field_g.a(0, on.field_j);
              if (var3 != 0) {
                this.field_g.a(0, 2);
              }
            } else {
              this.field_g.a(0, 2);
            }
          }
          if (ei.field_q == 98) {
            if (this.field_g.field_e != 2) {
              this.field_g.a(0, 2);
              if (var3 != 0) {
                this.field_g.a(0, on.field_j);
              }
            } else {
              this.field_g.a(0, on.field_j);
            }
          }
          var2_int = -16 / ((44 - param0) / 62);
          this.field_g.e((byte) 22);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "ji.H(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
        field_f = new String[]{"More sentinels and weapons", "More battlefields", "More missions"};
        field_b = new String[]{"<col=ff0000>This sentinel has no weapons.</col>", "Having multiple <%0> modules is redundant.", "The energised armour only works in combination with energy shields.", "The gravity pods are of no use on a sentinel that cannot jump.", "The air stabilisers are of no use on a sentinel that cannot thrust.", "This sentinel has no weapons compatible with AMARDS.", "This sentinel has no weapons compatible with its targeting system.", "The speed-loader only works with rockets or missiles.", "The coolant array only works with plasma weapons.", "The high-energy amplifier only works with laser weapons.", "The emergency displacement deployment requires 5<nbsp>TJ of energy capacity.", "The fusion blade close-combat attack requires 10<nbsp>TJ of energy capacity."};
        field_l = "Username: ";
        field_j = -1;
        field_d = new int[]{3, 4, -1, 8};
    }
}
