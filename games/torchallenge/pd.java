/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    private int field_j;
    static int field_c;
    private int field_g;
    static ef field_h;
    static String field_a;
    static ka field_i;
    private int field_e;
    private int field_b;
    static int[] field_f;
    static String field_d;
    private rl field_k;

    final void a(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          if (param0 != 3) {
            this.a((ka) null, -82, 70, true, 62, (ge) null);
          }
          if (this.field_e == 7) {
            var3_int = -1;
          }
          if (this.field_e == 0 &&
            this.field_k.field_j != -1) {
            var3_int = this.field_k.field_j;
          }
          if (this.field_e == 1 &&
            this.field_k.field_j != -1 &&
            bc.field_o != -1) {
            var3_int = this.field_k.field_j;
          }
          if (this.field_e == 3) {
            var3_int = 2;
          }
          this.field_k.a((byte) -121, param1, var3_int, this.a(param0 ^ -29803, ph.field_d, kc.field_u));
          this.field_b = -1;
          if (this.field_e == 7) {
            sh.a(param0 + 84, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "pd.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(qa param0, int param1, String param2, boolean param3, int param4, int param5, qa param6) {
        int stackIn_9_0 = 0;
        uf stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        String stackIn_27_2 = null;
        uf stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        String stackIn_31_2 = null;
        int stackIn_56_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var7 = null;
        RuntimeException var7_ref = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var7 = param6.a((byte) 97);
          if (param5 != -1) {
            pd.a((qa) null, -61, (String) null, false, -53, 47, (qa) null);
          }
          var8 = param0.a((byte) 46);
          if (null == qf.field_a) {
            var9 = s.a(false, false) ? 1 : 0;
            if (var9 == 0) {
              stackIn_9_0 = -1;
              return stackIn_9_0;
            }
          }
          if (aj.field_c == ng.field_A) {
            boolean decompiledFrameRemainder1 = true;
            bd.field_k = null;
            dk.field_s.field_q = 0;
            if (null != param2) {
              var9 = 0;
              if (param3) {
                var9 = var9 | 1;
              }
              pk.field_e.field_q = 0;
              pk.field_e.a(id.field_a.nextInt(), false);
              pk.field_e.a(id.field_a.nextInt(), false);
              pk.field_e.a((byte) 15, var7);
              pk.field_e.a((byte) 70, var8);
              pk.field_e.a((byte) 73, cd.a(-98, (CharSequence) ((Object) param2)));
              pk.field_e.a(param4, (byte) 106);
              pk.field_e.d(param1, (byte) 122);
              pk.field_e.d(var9, (byte) 122);
              dk.field_s.d(18, (byte) 122);
              dk.field_s.field_q = dk.field_s.field_q + 2;
              var10 = dk.field_s.field_q;
              var11_ref_String = mj.a(gi.b(12476), 104);
              if (null == var11_ref_String) {
                var11_ref_String = "";
              }
              dk.field_s.a(var11_ref_String, (byte) 97);
              ac.a(mb.field_a, (byte) -105, pk.field_e, jl.field_f, dk.field_s);
              dk.field_s.b(dk.field_s.field_q - var10, (byte) -40);
              decompiledFrameRemainder1 = (var13 != 0);
            }
            if (decompiledFrameRemainder1) {
              pk.field_e.field_q = 0;
              pk.field_e.a(id.field_a.nextInt(), false);
              pk.field_e.a(id.field_a.nextInt(), false);
              stackIn_26_0 = pk.field_e;
              stackIn_26_1 = 105;
              if (param6.b((byte) -29)) {
                stackIn_27_2 = var7;
              } else {
                stackIn_27_2 = "";
              }
              ((uf) (Object) stackIn_26_0).a((byte) stackIn_26_1, stackIn_27_2);
              stackIn_30_0 = pk.field_e;
              stackIn_30_1 = 26;
              if (!param0.b((byte) -29)) {
                stackIn_31_2 = "";
              } else {
                stackIn_31_2 = var8;
              }
              ((uf) (Object) stackIn_30_0).a((byte) stackIn_30_1, stackIn_31_2);
              dk.field_s.d(16, (byte) 122);
              dk.field_s.field_q = dk.field_s.field_q + 1;
              var9 = dk.field_s.field_q;
              ac.a(mb.field_a, (byte) -105, pk.field_e, jl.field_f, dk.field_s);
              dk.field_s.a(-var9 + dk.field_s.field_q, -111);
            }
            nb.a(-1, -1);
            aj.field_c = sh.field_t;
          }
          boolean decompiledFrameRemainder0 = true;
          if (aj.field_c == sh.field_t &&
            pe.a((byte) 117, 1)) {
            var9 = id.field_b.j(-89);
            id.field_b.field_q = 0;
            if (var9 >= 100 &&
              var9 <= 105) {
              aj.field_c = lj.field_r;
              ra.field_d = new String[var9 - 100];
            } else {
              if (var9 != 248) {
                if (var9 != 99) {
                  aj.field_c = fc.field_q;
                  cb.field_g = var9;
                  bb.field_i = -1;
                  decompiledFrameRemainder0 = (var13 != 0);
                }
                if (decompiledFrameRemainder0) {
                  pe.a((byte) 99, ra.c(-2));
                  bd.field_k = new Boolean(jh.a((byte) 58, id.field_b));
                  id.field_b.field_q = 0;
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var9 == 248 ||
                var13 != 0)) {
                cj.a((byte) 117, gi.b(12476));
                ag.field_c = ga.field_u;
                ob.b(-103);
                ck.field_b = false;
                stackIn_56_0 = var9;
                return stackIn_56_0;
              }
            }
          }
          if (aj.field_c == lj.field_r) {
            var9 = 2;
            if (pe.a((byte) 113, var9)) {
              var10 = id.field_b.c(false);
              id.field_b.field_q = 0;
              if (pe.a((byte) 111, var10)) {
                var11 = ra.field_d.length;
                var12 = 0;
                do {
                  if (var12 >= var11) {
                    ob.b(-90);
                    ck.field_b = false;
                    break;
                  }
                  ra.field_d[var12] = id.field_b.c((byte) 110);
                  var12++;
                } while (var13 == 0);
                stackIn_69_0 = 100 + var11;
                return stackIn_69_0;
              }
            }
          }
          if (fc.field_q == aj.field_c &&
            md.a((byte) 113)) {
            boolean decompiledSharedTail0 = (255 == cb.field_g);
            if (!decompiledSharedTail0) {
              ag.field_c = id.field_b.b(false);
              decompiledSharedTail0 = (var13 != 0);
            }
            if (decompiledSharedTail0) {
              var9_ref_String = id.field_b.a(-29648475);
              if (var9_ref_String != null) {
                hl.a(param5 ^ -116, gi.b(12476), var9_ref_String);
              }
            }
            ob.b(-86);
            ck.field_b = false;
            stackIn_85_0 = cb.field_g;
            return stackIn_85_0;
          }
          if (qf.field_a == null) {
            if (ck.field_b) {
              if (fc.e(86) <= 30000L) {
                ag.field_c = nh.field_ib;
                if (var13 != 0) {
                  ag.field_c = aj.field_d;
                }
              } else {
                ag.field_c = aj.field_d;
              }
              ck.field_b = false;
              stackIn_99_0 = 249;
              return stackIn_99_0;
            }
            var9 = ae.field_x;
            ae.field_x = sd.field_h;
            sd.field_h = var9;
            ck.field_b = true;
          }
          stackIn_102_0 = -1;
          return stackIn_102_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_106_0 = var7_ref;
          stackIn_106_1 = new StringBuilder().append("pd.P(");
          if (param0 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          stackIn_114_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        boolean[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = s.field_q.length;
          var6 = 200;
          var7 = hl.field_c;
          var8 = 0;
          var9 = (ef.field_k + param3) % param1;
          var10 = 0;
          if (param2 != -27) {
            stackIn_3_0 = -5;
            return stackIn_3_0;
          }
          while (true) {
            stackIn_5_0 = 3;
            if (stackIn_5_0 > var10) {
              stackIn_27_0 = 0;
              if (var12 == 0) {
                var11 = stackIn_27_0;
                while (var5_int > var11) {
                  stackOut_9_0 = var7[var11][var10];
                  stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                  stackIn_10_0 = stackOut_9_0;
                  if (stackIn_10_0) {
                    var8 = var8 + var6;
                  }
                  if (var9 < var8) {
                    if (param0 == 0) {
                      stackIn_20_0 = var10;
                      return stackIn_20_0;
                    }
                    if (param0 == 1) {
                      stackIn_23_0 = var11;
                      return stackIn_23_0;
                    }
                  }
                  var11++;
                }
                var10++;
                continue;
              }
            } else {
              stackIn_27_0 = -1;
            }
            return stackIn_27_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "pd.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0) {
        int stackIn_48_0 = 0;
        boolean stackIn_49_1 = false;
        int stackIn_89_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int stackIn_230_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (oe.field_f >= 0) {
            oe.field_f = oe.field_f - 1;
          }
          if (220 < nk.field_h) {
            nk.field_h = 220;
          }
          if (sh.field_r > 256) {
            sh.field_r = 256;
          }
          sf.a(-49);
          if (vc.field_e) {
            if (this.field_e != 9 &&
              this.field_e != 11) {
              wl.d(param0 - 9169);
              return;
            }
            return;
          }
          if (0 == this.field_e &&
            cd.field_o) {
            cd.field_o = false;
          }
          if (this.field_e == 13) {
            if (rj.field_g == -1) {
              be.a(0, (byte) -121, false);
            }
            this.c(-22310);
          }
          if (this.field_e != 12) {
            ai.b(0);
          }
          if (this.field_e == 7) {
            if (cd.field_o) {
              cd.field_o = false;
            }
            stackIn_48_0 = 76;
            stackIn_49_1 = !(v.f((byte) -105));
            var2_int = ik.$cfr$intArgs$a$b925f3f4834c(stackIn_48_0, stackIn_49_1);
            if (3 == var2_int) {
              if (null != gi.field_d) {
                ij.c((byte) -126);
              }
              re.a(gi.b(12476), param0 - 2320);
            }
            if (var2_int == 1) {
              be.a(0, (byte) -102, false);
            }
            if (var2_int == 2) {
              be.a(0, (byte) -106, true);
            }
            return;
          }
          if (this.field_e == 12) {
            nd.field_e = nd.field_e + 1;
            if (nd.field_e >= gh.field_n[rf.field_ib]) {
              rf.field_ib = rf.field_ib + 1;
              nd.field_e = 0;
            }
            if (rf.field_ib == 5) {
              be.a(0, (byte) -127, false);
            }
          }
          if (this.field_e == 10 ||
            this.field_e == 8) {
            ec.field_d = -1;
          }
          L18: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (kj.e((byte) -109)) {
              pk.field_f = true;
              stackIn_167_0 = ~fa.field_g;
              stackIn_167_1 = -3;
              if (var4 != 0) {
                break L18;
              }
              stackIn_89_0 = (stackIn_167_0 > stackIn_167_1) ? 0 : 1;
              var2_intLifetime1 = stackIn_89_0;
              if (var2_intLifetime1 != 0 &&
                nj.field_c[1]) {
                bh.field_p = true;
                ac.field_d = ac.field_d + 128;
                if (aj.field_h) {
                  aj.field_h = false;
                } else {
                  aj.field_h = true;
                }
                pi.field_f = pi.field_f - 32;
              }
              if (13 != b.field_J) {
                this.b(false);
                if (10 == this.field_e) {
                  c.a(94);
                  if (this.field_k.field_j >= 0 &&
                    !pa.field_s[ok.field_b][this.field_k.field_j]) {
                    this.field_k.field_j = -1;
                  }
                }
                if (this.field_k.field_j != -1) {
                  this.a(false, this.field_k.field_j, 3);
                }
              } else if (this.field_e != 1) {
                if (13 != this.field_e) {
                  if (this.field_e != 6) {
                    if (!cd.field_o) {
                      be.a(kc.field_v, (byte) -109, false);
                    } else {
                      if (d.p(-91)) {
                        be.a(6, (byte) -127, false);
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        cd.field_o = false;
                        be.a(7, (byte) -118, false);
                        if (d.p(-81)) {
                          this.g((byte) -97);
                        }
                      }
                    }
                  }
                } else {
                  this.a(false);
                }
              } else {
                ad.field_j = false;
                if (rj.field_g == -1) {
                  ug.field_o = 0;
                  df.field_O = true;
                  if (0 <= ea.field_e - 6) {
                    ug.field_o = 1;
                  }
                  be.a(-1, (byte) -106, false);
                } else {
                  be.a(13, (byte) -104, false);
                }
                stackIn_164_0 = (ee.field_o > 0) ? 0 : 7;
                kc.field_v = stackIn_164_0;
              }
              if (decompiledFrameRemainder0) {
                continue;
              }
            }
            stackIn_167_0 = -12;
            stackIn_167_1 = ~this.field_e;
            break;
          }
          if ((stackIn_167_0 == stackIn_167_1 ||
            this.field_e == 9) &&
            ec.field_d >= 0) {
            if (this.field_e == 11) {
              c.a(110);
            }
            this.b(false);
            if (-1 != this.field_k.field_j) {
              this.a(false, this.field_k.field_j, param0 ^ 9507);
            }
          }
          var2_intLifetime2 = this.field_k.field_j;
          this.field_k.a((byte) 2, this.a(-29802, ph.field_d, kc.field_u), this.a(param0 - 39306, ci.field_m, ik.field_a));
          if (this.field_k.field_j >= 0 &&
            var2_intLifetime2 != this.field_k.field_j) {
            pk.field_f = false;
          }
          if (this.field_e == 10) {
            c.a(param0 - 9377);
            if (this.field_k.field_j >= 0 &&
              !pa.field_s[ok.field_b][this.field_k.field_j]) {
              this.field_k.field_j = -1;
            }
          }
          if (param0 != 9504) {
            pd.k(108);
          }
          if (this.field_k.field_j != -1) {
            this.a(true, this.field_k.field_j, 3);
          }
          if (this.field_e == 8 &&
            vc.field_a < 32) {
            vc.field_a = vc.field_a + 1;
          }
          if (0 != vb.field_n) {
            this.field_j = ci.field_m;
            this.field_g = ik.field_a;
            pk.field_f = false;
          }
          if (this.field_e == 3 ||
            this.field_e == 8 ||
            this.field_e == 10) {
            ef.field_k = ef.field_k + 1;
          }
          stackIn_230_0 = (bc.field_o == bb.field_h) ? 0 : 1;
          var3 = stackIn_230_0;
          if (this.field_e == 10) {
            if (0 <= this.field_k.field_j &&
              ~db.field_z != ~this.field_k.field_j) {
              of.field_e = 50;
              db.field_z = this.field_k.field_j;
            }
            if (~db.field_z != ~qb.field_h) {
              if (of.field_e > 0) {
                of.field_e = of.field_e - 1;
              }
              if (of.field_e <= 0) {
                of.field_e = 0;
                fa.field_j = 25;
                qb.field_h = db.field_z;
              }
            }
            if (0 < fa.field_j) {
              fa.field_j = fa.field_j - 1;
              if (0 >= fa.field_j) {
                fa.field_j = 0;
              }
            }
            if (fa.field_j < 0) {
              fa.field_j = fa.field_j + 1;
              if (fa.field_j >= 0) {
                fa.field_j = 0;
              }
            }
            if (fa.field_j == 0 &&
              rl.field_c != qb.field_h &&
              qb.field_h >= 0 &&
              qb.field_h < 6) {
              rl.field_c = qb.field_h;
              of.field_e = 50;
              fa.field_j = -25;
              ug.field_p = true;
            }
          }
          if (1 == this.field_e &&
            var3 == 0 &&
            oi.field_g) {
            if (!(dj.field_Q >= 0) ||
              ~dj.field_Q == ~n.field_jb) {
              n.field_jb = 0;
              if (var4 != 0) {
                n.field_jb = dj.field_Q;
              }
            } else {
              n.field_jb = dj.field_Q;
            }
            oi.field_g = false;
            if (kj.field_A >= 0 &&
              kj.field_A != i.field_r) {
              i.field_r = kj.field_A;
              if (var4 == 0) {
                return;
              }
            }
            i.field_r = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.L(" + param0 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 1) {
          return;
        }
        try {
          field_a = null;
          field_d = null;
          field_f = null;
          field_h = null;
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "pd.AB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_40_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        ka[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28_int = 0;
        ka var28 = null;
        int var29 = 0;
        ka[] var22Lifetime1;
        int stackIn_40_0Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var27Lifetime1;
        var29 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = lg.field_d[this.field_e][1];
          var6 = lg.field_d[this.field_e][3];
          var7 = lg.field_d[this.field_e][7];
          var8 = lg.field_d[this.field_e][8];
          var9 = lg.field_d[this.field_e][6];
          var11 = 5;
          var12 = fg.field_M[0];
          var13 = fg.field_M[1];
          var14 = fg.field_M[2];
          var15 = fg.field_M[3];
          var16 = fg.field_M[4];
          var18 = ch.field_c[0];
          var19 = ch.field_c[1];
          var20 = ch.field_c[2];
          var21 = ch.field_c[3];
          var22 = ui.field_i;
          var23 = 0;
          var24 = 7;
          if (param1 < 0) {
            if (param2 > param0) {
              var23 = var21 * param0 / param2 - var21;
              if (var29 != 0) {
                var23 = 0;
              }
            } else {
              var23 = 0;
            }
          }
          qg.a(pf.field_g);
          qg.a(0, var19, 640, 480);
          hd.a(var22, var22[0].field_v + var21, var20 + 3, (byte) -74, var23 + (-var22[0].field_v + var19), var18);
          qg.b(pf.field_g);
          if (!vc.field_e) {
            ba.a(this.field_e, kk.field_d, param1, -128, cj.field_g);
          }
          qg.a(pf.field_g);
          qg.a(0, var19, 640, 480);
          var27 = 0;
          L3: while (true) {
            if (6 > var27) {
              stackIn_51_0 = ~this.field_k.field_j;
              stackIn_51_1 = ~var27;
              if (var29 != 0) {
                break L3;
              }
              if (stackIn_51_0 != stackIn_51_1) {
                var17 = 0;
                var10 = 0;
              } else {
                var17 = 1;
                var10 = 1;
              }
              qf.field_c[var10].g(var5_int, var6 + var23);
              if (kj.field_I[var27]) {
                hb.field_c.h(var5_int + var15, var16 + var6 + var23);
              } else if (pa.field_s[ok.field_b][var27]) {
                ib.field_M[2].g(var5_int, var23 + var6);
                tf.field_x.a(Integer.toString(1 + var27), var5_int + (ib.field_M[2].field_q >> 1), var23 - 2 + (9 + (ib.field_M[2].field_v >> 1)) + var6, var17, -1);
              } else {
                je.field_b.h(-1 + (var5_int + var15), var23 + (var6 + var16));
              }
              var26 = 0;
              var28_int = 0;
              while (var11 > var28_int) {
                stackIn_40_0 = pi.field_d[ok.field_b][var27] & 1 << var28_int;
                if (stackIn_40_0 > 0) {
                  od.a(dl.field_j, var28_int * var14 + (var5_int + var12), var23 + (var13 + var6));
                }
                var28_int++;
              }
              var26 = var26 | 1 << var27;
              stackIn_40_0Lifetime1 = ~(k.field_b[ok.field_b] & var26);
              if (stackIn_40_0Lifetime1 < -1) {
                var25 = 1;
              } else {
                var25 = 0;
              }
              if (var25 != 0) {
                ib.field_M[3].g(var7 + var5_int - ib.field_M[var10].field_q, var6 + var23);
              } else {
                ib.field_M[var10].g(var7 + var5_int - ib.field_M[var10].field_q, var23 + var6);
              }
              var6 = var6 + (var9 + var8);
              var27++;
              continue L3;
            }
            qg.b(pf.field_g);
            var5_int = ue.field_j[0];
            stackIn_51_0 = 47;
            stackIn_51_1 = (-66 - param3) / 48;
            break;
          }
          var27Lifetime1 = stackIn_51_0 / stackIn_51_1;
          var8Lifetime1 = ue.field_j[3];
          var22Lifetime1 = dh.field_cb[0];
          var6Lifetime1 = ue.field_j[1];
          var7Lifetime1 = ue.field_j[2];
          hd.a(var22Lifetime1, var8Lifetime1, var7Lifetime1, (byte) 68, var6Lifetime1, var5_int);
          var5_intLifetime1 = ue.field_j[0];
          var8Lifetime2 = ue.field_j[3];
          var6Lifetime2 = ue.field_j[1];
          var7Lifetime2 = ue.field_j[2];
          var28 = we.field_m[ok.field_b + 1];
          qg.a(pf.field_g);
          qg.f(var24 + var5_intLifetime1, var24 + var6Lifetime2, -var24 + (var7Lifetime2 + var5_intLifetime1), -var24 + var8Lifetime2 + var6Lifetime2);
          var5_intLifetime1 = var5_intLifetime1 + (var7Lifetime2 - var28.field_q >> 1);
          var6Lifetime2 = (var8Lifetime2 - var28.field_v >> 1) + var6Lifetime2;
          if (ok.field_b == 0) {
            var5_intLifetime1 -= 32;
            var6Lifetime2 += 96;
          }
          var28.g(var5_intLifetime1, var6Lifetime2);
          qg.b(pf.field_g);
          var5_intLifetime2 = ue.field_j[0];
          var6Lifetime3 = ue.field_j[1];
          var22Lifetime1[0].g(var5_intLifetime2, var6Lifetime3);
          var22Lifetime1[2].g(var5_intLifetime2 + var7Lifetime2 - var22Lifetime1[2].field_q, var6Lifetime3);
          var22Lifetime1[6].g(var5_intLifetime2, var6Lifetime3 + (var8Lifetime2 - var22Lifetime1[6].field_v));
          var22Lifetime1[8].g(-var22Lifetime1[2].field_q + var7Lifetime2 + var5_intLifetime2, -var22Lifetime1[6].field_v + var8Lifetime2 + var6Lifetime3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "pd.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0) {
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (ji.field_m != null) {
            ji.field_m.a((byte) 88);
          }
          if (!d.p(-94) &&
            ee.field_o > 0) {
            stackIn_12_0 = 0;
          } else {
            stackIn_12_0 = 1;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          var2_int = stackIn_12_0;
          nd.field_e = nd.field_e + 1;
          if (rj.field_g != 0) {
            if (2 == rj.field_g) {
              if (nd.field_e <= 450 &&
                !md.field_a) {
                boolean decompiledFrameRemainder0 = true;
                var3 = uk.field_J;
                if (var3 < 6) {
                  if ((nd.field_e == m.field_c[1][var3]) &&
                    (decompiledFrameRemainder0 = !(6 <= var3))) {
                    h.a(8, 4);
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (~(25 + m.field_c[1][var3]) == ~nd.field_e)) {
                    var4 = -1;
                    if (0 == var3) {
                      var4 = 9;
                    }
                    if (var3 == 1) {
                      var4 = 10;
                    }
                    if (2 == var3) {
                      var4 = 11;
                    }
                    if (3 == var3) {
                      var4 = 12;
                    }
                    if (4 == var3) {
                      var4 = 13;
                    }
                    if (var3 == 5) {
                      var4 = 14;
                    }
                    if (var4 >= 0) {
                      h.a(var4, 4);
                    }
                  }
                }
                decompiledFrameRemainder2 = (var5 != 0);
                if (decompiledFrameRemainder2) {
                  decompiledFrameRemainder1 = false;
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                md.field_a = false;
                o.a(4, true);
                bc.field_o = -1;
                bb.field_h = -1;
                cj.field_b = true;
                this.h(30122);
                return;
              }
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              if (rj.field_g == 4) {
                if (nd.field_e <= bi.field_a[0][0] &&
                  !md.field_a) {
                  decompiledFrameRemainder2 = (~nd.field_e == ~m.field_c[0][0]);
                  if (decompiledFrameRemainder2) {
                    h.a(15, 4);
                    decompiledFrameRemainder2 = (var5 != 0);
                  }
                } else {
                  md.field_a = false;
                  o.a(-1, true);
                  df.field_O = true;
                  bb.field_h = -1;
                  bc.field_o = -1;
                  if (gh.field_x) {
                    ug.field_o = 1;
                    if (var5 == 0) {
                      return;
                    }
                  }
                  ug.field_o = 0;
                  return;
                }
              }
              if (decompiledFrameRemainder2) {
                if (rj.field_g == 1) {
                  if (nd.field_e <= 450 &&
                    !md.field_a) {
                    var3Lifetime1 = ea.field_e;
                    if (var3Lifetime1 < 6) {
                      var3Lifetime1++;
                      if (var5 != 0) {
                        var3Lifetime1 = (1 + (var3Lifetime1 - 6)) * 2;
                      }
                    } else {
                      var3Lifetime1 = (1 + (var3Lifetime1 - 6)) * 2;
                    }
                    if (var3Lifetime1 < 6) {
                      if (nd.field_e != m.field_c[1][var3Lifetime1]) {
                        if (~nd.field_e == ~(m.field_c[1][var3Lifetime1] + 25)) {
                          var4Lifetime1 = -1;
                          if (var3Lifetime1 == 0) {
                            var4Lifetime1 = 9;
                          }
                          if (var3Lifetime1 == 1) {
                            var4Lifetime1 = 10;
                          }
                          if (var3Lifetime1 == 2) {
                            var4Lifetime1 = 11;
                          }
                          if (var3Lifetime1 == 3) {
                            var4Lifetime1 = 12;
                          }
                          if (var3Lifetime1 == 4) {
                            var4Lifetime1 = 13;
                          }
                          if (var3Lifetime1 == 5) {
                            var4Lifetime1 = 14;
                          }
                          if (var4Lifetime1 >= 0) {
                            h.a(var4Lifetime1, 4);
                          }
                          if (var5 != 0) {
                            h.a(8, 4);
                          }
                        }
                      } else {
                        h.a(8, 4);
                      }
                    }
                    decompiledFrameRemainder2 = (var5 != 0);
                  } else {
                    md.field_a = false;
                    o.a(4, true);
                    bc.field_o = -1;
                    cj.field_b = true;
                    bb.field_h = -1;
                    dd.c(127);
                    return;
                  }
                }
                if (decompiledFrameRemainder2) {
                  if ((3 == rj.field_g) &&
                    (decompiledFrameRemainder2 = (!(nd.field_e <= 350) ||
                    md.field_a))) {
                    md.field_a = false;
                    o.a(4, true);
                    bb.field_h = -1;
                    bc.field_o = -1;
                    cj.field_b = true;
                    dd.c(123);
                    return;
                  }
                  if (decompiledFrameRemainder2) {
                    if ((rj.field_g == 5) &&
                      (decompiledFrameRemainder2 = (!(nd.field_e <= bi.field_a[2][0]) ||
                      md.field_a))) {
                      md.field_a = false;
                      if (!bh.field_p &&
                        var2_int != 0 &&
                        gh.field_x) {
                        o.a(7, true);
                        if (ee.field_o > 0) {
                          cd.field_o = false;
                          if (var5 == 0) {
                            return;
                          }
                        }
                        cd.field_o = true;
                        if (var5 == 0) {
                          return;
                        }
                      }
                      if (!gh.field_x ||
                        8 != ea.field_e) {
                        if ((ea.field_e + 1) % 2 != 0 ||
                          !(ea.field_e < 6)) {
                          ii.field_d = true;
                          o.a(1, true);
                          if (var5 == 0) {
                            return;
                          }
                        }
                        ii.field_d = true;
                        o.a(3, true);
                        if (var5 == 0) {
                          return;
                        }
                      }
                      o.a(7, true);
                      return;
                    }
                    if (decompiledFrameRemainder2) {
                      if (rj.field_g == 6) {
                        if (nd.field_e <= 450 &&
                          !md.field_a) {
                          decompiledFrameRemainder2 = (m.field_c[4][0] == nd.field_e);
                          if (decompiledFrameRemainder2) {
                            h.a(16, param0 + 22314);
                            decompiledFrameRemainder2 = (var5 != 0);
                          }
                        } else {
                          md.field_a = false;
                          o.a(-1, true);
                          if (ee.field_o <= 0) {
                            cd.field_o = true;
                            if (var5 != 0) {
                              cd.field_o = false;
                            }
                          } else {
                            cd.field_o = false;
                          }
                          if (!d.p(-93) &&
                            eh.field_l != 0) {
                            be.a(5, (byte) -113, false);
                            if (var5 == 0) {
                              return;
                            }
                          }
                          if (!d.p(-76)) {
                            be.a(2, (byte) -128, false);
                            if (var5 == 0) {
                              return;
                            }
                          }
                          if (d.p(-105)) {
                            be.a(6, (byte) -122, false);
                          }
                          return;
                        }
                      }
                      if ((decompiledFrameRemainder2) &&
                        (decompiledFrameRemainder2 = (rj.field_g == 7))) {
                        if (nd.field_e == 750) {
                          bc.field_o = 15;
                          bb.field_h = 15;
                          ug.field_i[bb.field_h].a(param0 + 22313, true);
                          return;
                        }
                        decompiledFrameRemainder2 = (!(nd.field_e <= 800) ||
                          md.field_a);
                        if (decompiledFrameRemainder2) {
                          md.field_a = false;
                          o.a(-1, true);
                          o.a(-1, true);
                          if (ee.field_o > 0) {
                            cd.field_o = false;
                            if (var5 != 0) {
                              cd.field_o = true;
                            }
                          } else {
                            cd.field_o = true;
                          }
                          if (!d.p(-116) &&
                            0 != eh.field_l) {
                            be.a(5, (byte) -120, false);
                            if (var5 == 0) {
                              return;
                            }
                          }
                          if (d.p(-115)) {
                            if (!d.p(-78)) {
                              return;
                            }
                            be.a(6, (byte) -109, false);
                            if (var5 == 0) {
                              return;
                            }
                          }
                          be.a(2, (byte) -105, false);
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder2) {
            if (nd.field_e <= 250 &&
              !md.field_a) {
              if (nd.field_e == 50) {
                h.a(7, 4);
              }
              if ((nd.field_e == 100)) {
                wh.a(ok.field_b, 8, param0 ^ 22364);
              }
              decompiledFrameRemainder2 = false;
            }
            else {
              md.field_a = false;
              o.a(2, true);
              vd.b(0);
              return;
            }
          }
          if (param0 != -22310) {
            field_c = -101;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.BA(" + param0 + ')');
        }
    }

    private final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder8 = true;
          boolean decompiledFrameRemainder7 = true;
          boolean decompiledFrameRemainder6 = true;
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var3 = rj.field_g;
          if ((var3 != 0) &&
            (decompiledFrameRemainder0 = (var3 != 2 ||
            var4 != 0)) &&
            (decompiledFrameRemainder1 = (var3 != 4)) &&
            (decompiledFrameRemainder2 = (var3 != 1 ||
            var4 != 0)) &&
            (decompiledFrameRemainder3 = (3 != var3 ||
            var4 != 0)) &&
            (decompiledFrameRemainder4 = (var3 != 5 ||
            var4 != 0)) &&
            (decompiledFrameRemainder5 = (var3 != 6 ||
            var4 != 0)) &&
            (decompiledFrameRemainder7 = (7 == var3))) {
            decompiledFrameRemainder6 = (var4 != 0);
          }
          if ((decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var2_int = 1;
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var2_int = 1;
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var2_int = 1;
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            var2_int = 1;
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            var2_int = 1;
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6) &&
            (decompiledFrameRemainder5)) {
            var2_int = 1;
            decompiledFrameRemainder8 = (var4 != 0);
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7) &&
            (decompiledFrameRemainder6)) {
            var2_int = 7;
            if (d.p(-85)) {
              var2_int = 6;
            }
            decompiledFrameRemainder8 = !(ee.field_o <= 0);
            if (decompiledFrameRemainder8) {
              var2_int = 0;
              decompiledFrameRemainder8 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder8) &&
            (decompiledFrameRemainder7)) {
            var2_int = 7;
            if (d.p(-88)) {
              var2_int = 6;
            }
            decompiledFrameRemainder8 = !(ee.field_o <= 0);
            if (decompiledFrameRemainder8) {
              var2_int = 0;
              decompiledFrameRemainder8 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder8) {
            var2_int = 1;
          }
          if (var2_int != 1) {
            o.a(-1, true);
          }
          qg.f(0, 0, 640, 480);
          be.a(var2_int, (byte) -119, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.B(" + param0 + ')');
        }
    }

    private final void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, byte param7, ka param8, ka param9, int[] param10, int param11, int param12, ge param13, int param14, boolean param15) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        var26 = TorChallenge.field_F ? 1 : 0;
        try {
          var19 = 0;
          var20 = 60;
          var21 = var20;
          qg.a(pf.field_g);
          if (param12 <= param5) {
            if (param5 > (param6 - param12)) {
              var21 = (-param5 + param6) * var20 / param12;
              var19Lifetime1 = 256 * (-param5 + param6) / param12;
              if (var26 != 0) {
                var19Lifetime1 = -1;
                var19Lifetime1 = param5 * 256 / param12;
                var21 = var20 * param5 / param12;
              }
            } else {
              var19Lifetime1 = -1;
              if (var26 != 0) {
                var19Lifetime1 = param5 * 256 / param12;
                var21 = var20 * param5 / param12;
              }
            }
          } else {
            var19Lifetime1 = param5 * 256 / param12;
            var21 = var20 * param5 / param12;
          }
          qg.f(0, 0, 640, var21, 1);
          qg.f(0, 479 - var21, 640, var21, 1);
          var22 = 35 / ((param7 + 3) / 59);
          qg.f(0, var21, 640, -var21 + 480);
          var18 = -param0[1];
          var17_int = -param0[0];
          if (var19Lifetime1 < 0) {
            param13.a(var17_int, var18);
          }
          if (var19Lifetime1 >= 0 ||
            var26 != 0) {
            param13.a(var17_int, var18, var19Lifetime1, 1);
          }
          if (param8 != null) {
            var17_intLifetime1 = param1[0];
            var18Lifetime1 = param1[1];
            if (var19Lifetime1 >= 0) {
              param8.a(var17_intLifetime1, var18Lifetime1, var19Lifetime1, 1);
              if (var26 != 0) {
                param8.g(var17_intLifetime1, var18Lifetime1);
              }
            } else {
              param8.g(var17_intLifetime1, var18Lifetime1);
            }
          }
          var23 = 0;
          if (param15) {
            var24 = 2048 * (param5 % param3) / param3;
            var23 = fj.a(1870096848, wi.field_a[var24], param14 << 16) >> 16;
          }
          var18Lifetime2 = param10[1] + var23;
          var17_intLifetime2 = param10[0];
          var24Lifetime1 = -1;
          var25 = 8;
          if (param11 <= param5 &&
            param5 <= param4 + param11) {
            var24Lifetime2 = (-param11 + param5) * 256 / param4;
            if (rj.field_g == 0) {
              if (vj.field_d == null) {
                e.a((byte) -36, var25);
                qg.f(0, var21, 640, 480 - var21);
              }
              vj.field_d[ok.field_b].b(-8 + var17_intLifetime2, var18Lifetime2 - 8, 256);
            }
            param9.a(var17_intLifetime2, var18Lifetime2, var24Lifetime2, 16777215);
          }
          if ((!(param11 <= param5) ||
            !(param5 <= param4 + param11) || var26 != 0) && (param11 <= param5)) {
            if (var19Lifetime1 < 0) {
              if (0 == rj.field_g) {
                if (null == vj.field_d) {
                  e.a((byte) -101, var25);
                  qg.f(0, var21, 640, 480 - var21);
                }
                vj.field_d[ok.field_b].b(-8 + var17_intLifetime2, var18Lifetime2 - 8, 256);
              }
              param9.g(var17_intLifetime2, var18Lifetime2);
              if (var26 != 0) {
                if (0 == rj.field_g) {
                  if (vj.field_d == null) {
                    e.a((byte) -116, var25);
                    qg.f(0, var21, 640, -var21 + 480);
                  }
                  vj.field_d[ok.field_b].b(-8 + var17_intLifetime2, var18Lifetime2 - 8, var19Lifetime1);
                }
                param9.e(var17_intLifetime2, var18Lifetime2, var19Lifetime1);
              }
            } else {
              if (0 == rj.field_g) {
                if (vj.field_d == null) {
                  e.a((byte) -116, var25);
                  qg.f(0, var21, 640, -var21 + 480);
                }
                vj.field_d[ok.field_b].b(-8 + var17_intLifetime2, var18Lifetime2 - 8, var19Lifetime1);
              }
              param9.e(var17_intLifetime2, var18Lifetime2, var19Lifetime1);
            }
          }
          qg.b(pf.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_67_0 = var17;
          stackIn_67_1 = new StringBuilder().append("pd.CB(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',');
          if (param9 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param10 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param14).append(',').append(param15).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        ka[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 > -57) {
            this.a(false, -74);
          }
          var8 = 7;
          var9 = 0;
          while (3 > var9) {
            var4 = bg.field_I[var9][2];
            var5 = bg.field_I[var9][3];
            var2_int = bg.field_I[var9][0];
            var3 = bg.field_I[var9][1];
            if (var10 != 0) {
              return;
            }
            if (this.field_k.field_j != var9) {
              var7 = dh.field_cb[0];
            } else {
              var7 = dh.field_cb[1];
            }
            hd.a(var7, var5, var4, (byte) 106, var3, var2_int);
            var6 = we.field_m[var9 + 1];
            qg.a(pf.field_g);
            var2_int = var2_int + var8;
            var3 = var8 + var3;
            qg.a(var2_int, var3, var2_int + var4 - 2 * var8, -var8 + (var5 >> 1) + var3);
            var2_intLifetime1 = bg.field_I[var9][0];
            var2_intLifetime1 = (-(var6.field_q >> 1) + var4 >> 1) + var2_intLifetime1;
            var3Lifetime1 = bg.field_I[var9][1];
            var3Lifetime1 = ((var5 >> 1) - (var6.field_v >> 1) >> 1) + var3Lifetime1 + 32;
            if (var9 == 0) {
              var3Lifetime1 += 48;
              var2_intLifetime1 -= 16;
            }
            od.a(var6, var2_intLifetime1, var3Lifetime1);
            qg.b(pf.field_g);
            var3Lifetime2 = bg.field_I[var9][1];
            var2_intLifetime2 = bg.field_I[var9][0];
            var7[0].g(var2_intLifetime2, var3Lifetime2);
            var2_intLifetime2 = -var7[0].field_q + var4 + var2_intLifetime2;
            var7[2].g(var2_intLifetime2, var3Lifetime2);
            var2_intLifetime3 = bg.field_I[var9][0];
            var3Lifetime3 = lg.field_d[this.field_e][3] + lg.field_d[this.field_e][8];
            var5Lifetime1 = -var3Lifetime3 + (bg.field_I[var9][1] + bg.field_I[var9][3]);
            this.a((byte) 42, var4, var2_intLifetime3, var5Lifetime1, var9, true, var3Lifetime3);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.V(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ka var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        ka var3Lifetime1;
        try {
          qg.f(0, 0, 640, 480);
          var2_int = 8;
          if (vj.field_d == null) {
            e.a((byte) -24, var2_int);
          }
          var3 = vj.field_d[ok.field_b];
          var4 = 320 + (320 - var3.field_q) / 2;
          var5 = lg.field_d[1][param0];
          var3.b(var4 - 8, -8 + var5, 256);
          var3Lifetime1 = we.field_m[ok.field_b + 1];
          var3Lifetime1.g(var4, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.M(" + param0 + ')');
        }
    }

    private final void a(byte param0, int[][] param1, int param2, ge param3, int param4, int param5, int[] param6, int[][] param7, int param8, ka param9, int param10, int[] param11, int param12, int param13, ka param14) {
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var16_int = 0;
        RuntimeException var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var16_intLifetime1;
        int var17Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var25Lifetime1;
        var27 = TorChallenge.field_F ? 1 : 0;
        try {
          var18 = 0;
          var19 = 39 / ((param0 + 31) / 60);
          var20 = 0;
          var21 = 0;
          var22 = 0;
          var23 = -1;
          if (param13 < param2 &&
            param2 < param4 + param13) {
            var22Lifetime1 = (-param13 + param2) * 256 / param4;
            if (var27 != 0) {
              if (param2 <= (param12 - param4) ||
                param12 <= param2) {
                var22Lifetime1 = -1;
                var22Lifetime1 = 256 * (param12 - param2) / param4;
              } else {
                var22Lifetime1 = 256 * (param12 - param2) / param4;
              }
            }
          } else {
            if (param2 <= (param12 - param4) ||
              param12 <= param2) {
              var22Lifetime1 = -1;
              if (var27 != 0) {
                var22Lifetime1 = 256 * (param12 - param2) / param4;
              }
            } else {
              var22Lifetime1 = 256 * (param12 - param2) / param4;
            }
          }
          if (param2 >= param4) {
            if (param2 > (param10 - param4)) {
              var21Lifetime1 = (param10 - param2) * 256 / param4;
              if (var27 != 0) {
                var21Lifetime1 = -1;
                var21Lifetime1 = param2 * 256 / param4;
              }
            } else {
              var21Lifetime1 = -1;
              if (var27 != 0) {
                var21Lifetime1 = param2 * 256 / param4;
              }
            }
          } else {
            var21Lifetime1 = param2 * 256 / param4;
          }
          var26 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (-1 + param8 <= var26))) {
            stackIn_33_0 = param2;
            stackIn_33_1 = param11[var26];
            if (var27 == 0) {
              if (stackIn_33_0 >= stackIn_33_1 &&
                param11[1 + var26] > param2) {
                var23 = var26;
              }
              var26++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_33_0 = -1;
            stackIn_33_1 = ~var23;
          }
          if (stackIn_33_0 < stackIn_33_1) {
            var23 = -1 + param8;
          }
          if (-1 + param8 <= var23) {
            var24 = param10 - param11[param8 - 1];
          }
          if (-1 + param8 > var23 ||
            var27 != 0) {
            var24 = param11[1 + var23] - param11[var23];
          }
          var17 = -param7[var23][1];
          var16_int = -param7[var23][0];
          var25 = param2 - param11[var23];
          if (var23 < param8 - 1) {
            var20 = -param7[var23 + 1][1] - var17;
            var18 = -param7[var23 + 1][0] - var16_int;
          }
          if (var24 > 0) {
            var17 = var25 * var20 / var24 + var17;
            var16_int = var18 * var25 / var24 + var16_int;
          }
          if (var24 <= 0 ||
            var27 != 0) {
            var17 = param7[var23][1];
            var16_int = param7[var23][0];
          }
          if (param3 == null) {
            if (var21Lifetime1 < 0) {
              param14.g(var16_int, var17);
            }
            if (!(var21Lifetime1 < 0) ||
              var27 != 0) {
              param14.e(var16_int, var17, var21Lifetime1);
              if (var27 != 0) {
                if (var21Lifetime1 >= 0) {
                  param3.a(var16_int, var17, var21Lifetime1, 1);
                  param3.a(var16_int, var17);
                } else {
                  param3.a(var16_int, var17);
                }
              }
            }} else {
            if (var21Lifetime1 >= 0) {
              param3.a(var16_int, var17, var21Lifetime1, 1);
              if (var27 != 0) {
                param3.a(var16_int, var17);
              }
            } else {
              param3.a(var16_int, var17);
            }
          }
          var17Lifetime1 = -param1[var23][1];
          var16_intLifetime1 = -param1[var23][0];
          var25Lifetime1 = -param11[var23] + param2;
          if ((-1 + param8) > var23) {
            var20 = -var17Lifetime1 - param1[1 + var23][1];
            var18 = -var16_intLifetime1 - param1[var23 + 1][0];
          }
          if (var24 <= 0) {
            var16_intLifetime1 = param1[var23][0];
            var17Lifetime1 = param1[var23][1];
          }
          if (var24 > 0 ||
            var27 != 0) {
            var17Lifetime1 = var17Lifetime1 + var20 * var25Lifetime1 / var24;
            var16_intLifetime1 = var16_intLifetime1 + var25Lifetime1 * var18 / var24;
          }
          var17Lifetime1 = var17Lifetime1 + param6[1];
          var16_intLifetime1 = var16_intLifetime1 + param6[0];
          if (param2 > param13 &&
            param2 < param12) {
            if (0 > var22Lifetime1) {
              param9.g(var16_intLifetime1, var17Lifetime1);
              if (var27 == 0) {
                return;
              }
            }
            param9.e(var16_intLifetime1, var17Lifetime1, var22Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          stackIn_83_0 = var16;
          stackIn_83_1 = new StringBuilder().append("pd.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',');
          if (param7 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_99_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          stackIn_103_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(')').toString());
        }
    }

    private final void a(boolean param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_104_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        String[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var12Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        var28 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = g.a(104, 0) ? 1 : 0;
          var4 = wb.field_n.length;
          if (var3_int == 0) {
            var4 = var4 - ci.g(25);
          }
          var5 = ui.field_i[0].field_q;
          var6 = 32;
          var7 = ui.field_i[0].field_v;
          var8 = 32;
          var9 = var4 / 2 + var4 % 2;
          var10 = 2;
          var11 = 2;
          var12 = 24;
          var13 = var5 * 2 + var9 * (2 * var11 + var6);
          var14 = var7 * 2 + var10 * (var8 + 2 * var11) + var12 + var11;
          var15 = -var13 + 640 >> 1;
          var16 = 124 - (var7 - 4);
          hd.a(ui.field_i, var14, var13, (byte) 93, var16, var15);
          var15 = var15 + (var11 + var5);
          var16 = var16 + (var11 + var7);
          if (param0) {
            stackIn_7_0 = eh.field_l;
          } else {
            stackIn_7_0 = jj.field_c;
          }
          var17 = stackIn_7_0;
          var18 = 0;
          var19 = -1;
          var20 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 <= var20))) {
            stackIn_84_0 = var17 & 1 << var20;
            if (var28 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_84_0 == 0) {
                decompiledFrameRemainder0 = !(param0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = (!(nb.a(var20, (byte) 119)) ||
                  var3_int != 0))) {
                  if (v.a(var20, 5)) {
                    je.field_b.h(var15, var16);
                  } else if (0 < ee.field_o) {
                    je.field_b.h(var15, var16);
                  } else {
                    hb.field_c.h(var15, var16);
                  }
                }
              } else {
                tf.field_j[var20].h(var15, var16);
              }
              if (decompiledFrameRemainder0) {
                if (var15 <= kc.field_u &&
                  36 + var15 >= kc.field_u &&
                  ph.field_d >= var16 &&
                  var16 + 36 >= ph.field_d) {
                  var19 = var20;
                  qg.e(var15 - 2, -2 + var16, 36, 36, 6, 8421504);
                }
                if (this.field_g >= var15 &&
                  var15 + 32 >= this.field_g &&
                  var16 <= this.field_j &&
                  this.field_j <= 32 + var16) {
                  this.field_g = -1;
                  if (~var20 != ~this.field_b) {
                    this.field_b = var20;
                  } else {
                    this.field_b = -1;
                  }
                }
                if (~var20 == ~this.field_b) {
                  qg.e(-2 + var15, var16 - 2, 36, 36, 6, 1);
                }
                var18++;
                if (var18 != var9) {
                  var15 = var15 + (2 * var11 + var6);
                } else {
                  var16 = var16 + (var11 * 2 + var8);
                  var15 = var11 + (640 - var13 >> 1) + var5;
                  if (var4 % 2 == 1) {
                    var15 = var15 + (var6 / 2 + var11);
                  }
                }
              }
              var20++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var20 = 2 + var12;
            stackIn_84_0 = param1 ? 1 : 0;
          }
          if (stackIn_84_0 != 1) {
            return;
          }
          var21 = 227 + (var20 << 1);
          var6Lifetime1 = 128;
          var22 = 8;
          var8Lifetime1 = 128;
          var13 = var22 + (3 * var6Lifetime1 + var5 * 2);
          var14Lifetime1 = var8Lifetime1 + var7 * 2;
          if (kf.field_b == 3) {
            var13 += 10;
          }
          var16 = var21 - var7;
          var15 = -var13 + 640 >> 1;
          hd.a(ui.field_i, var14Lifetime1, var13, (byte) -66, var16, var15);
          if (0 <= this.field_b) {
            var19 = this.field_b;
          }
          if (var19 == -1) {
            tf.field_x.a(kk.field_c, 320, -var7 + (var14Lifetime1 / 2 + var21 - (var20 - 18)), 0, -1);
            if (!d.p(-99)) {
              return;
            }
            ag.field_e.a(gb.field_e, 320, ag.field_e.field_x + (var21 - (-(var14Lifetime1 / 2) + var7) + 2), 0, -1);
            if (var28 == 0) {
              return;
            }
          }
          stackIn_104_0 = (0 == (1 << var19 & var17)) ? 0 : 1;
          var23 = stackIn_104_0;
          var8Lifetime2 = 32;
          var15 = 640 - var13 >> 1;
          var6Lifetime2 = 32;
          var16 = 124 - var7;
          var14Lifetime2 = var11 + 18 + var10 * (2 * var11 + var8Lifetime2) + var7;
          var13 = 2 * var5 + var9 * (2 * var11 + var6Lifetime2);
          var6Lifetime3 = 128;
          if (var23 == 0) {
            tf.field_x.a(da.field_a, 320, 4 + (var14Lifetime2 + var16), 0, -1);
          }
          if (var23 != 0 ||
            var28 != 0) {
            tf.field_x.a(cd.field_p, 320, var14Lifetime2 + var16 + 4, 0, -1);
          }
          var15 = var15 + var5;
          var8Lifetime3 = 128;
          var16 = var21;
          var21 += 18;
          if (var23 == 0) {
            if (!v.a(var19, 5)) {
              if (ee.field_o > 0) {
                je.field_b.g(var15, var16);
                if (var28 != 0) {
                  hb.field_c.g(var15, var16);
                  je.field_b.g(var15, var16);
                  tf.field_j[var19].g(var15, var16);
                }
              } else {
                hb.field_c.g(var15, var16);
                if (var28 != 0) {
                  je.field_b.g(var15, var16);
                  tf.field_j[var19].g(var15, var16);
                }
              }
            } else {
              je.field_b.g(var15, var16);
              if (var28 != 0) {
                tf.field_j[var19].g(var15, var16);
              }
            }
          } else {
            tf.field_j[var19].g(var15, var16);
          }
          var24 = new String[16];
          var13 = 2 * var6Lifetime3;
          if (kf.field_b == 3) {
            var13 += 10;
          }
          var25 = ag.field_e.a(jc.field_j[var19], new int[]{var13}, var24);
          var15 = var22 + (var6Lifetime3 + var15);
          tf.field_x.c(wb.field_n[var19], var15, var21, 0, -1);
          var21 = var21 + var20;
          var12Lifetime1 = ag.field_e.field_x + ag.field_e.field_K;
          var20 = var12Lifetime1 + 2;
          var26 = 0;
          do {
            if (var26 >= var25) {
              var26 = 2;
              break;
            }
            ag.field_e.c(var24[var26], var15, var21, 0, -1);
            var21 = var21 + var20;
            var26++;
          } while (var28 == 0);
          var27 = var25;
          do {
            if (var26 <= var27) {
              var21 = var21 + (var20 >> 1);
              ag.field_e.c(vj.field_a + 100 * re.field_w[var19], var15, var21, 0, -1);
              var21 = var21 + (var20 + (var20 >> 1));
              ag.field_e.c(ca.field_c, var15, var21, 0, -1);
              var15 = var15 + ag.field_e.a(ca.field_c);
              var16 = -(hh.field_b.field_v - ag.field_e.field_x >> 1) - ag.field_e.field_x + var21;
              break;
            }
            var21 = var21 + var20;
            var27++;
          } while (var28 == 0);
          var27 = 0;
          while (true) {
            if (var27 >= re.field_w[var19]) {
              return;
            }
            hh.field_b.g(var15, var16);
            var15 = var15 + hh.field_b.field_u / 3;
            var27++;
            if (var28 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          var2_int = vj.field_c;
          if (!na.field_f) {
            lj.field_n = new qe[3];
            na.field_f = true;
            jj.field_a = new ka[3];
            var3 = 0;
            while (var3 < 3) {
              vj.field_c = var3;
              lj.field_n[var3] = new qe(0, 0, 0, 0);
              jj.field_a[var3] = new ka(192, 192);
              var3++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              vj.field_c = var2_int;
            }
          }
          if (param0) {
            this.a(false, 56, 88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.W(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = ef.field_k % 1050;
          var3 = var2_int / 350;
          cj.field_j = -var3 + a.field_c;
          if (cj.field_j < 0) {
            cj.field_j = 3 + cj.field_j;
          }
          var3Lifetime1 = 0;
          while (var3Lifetime1 < 3) {
            if (var4 != 0) {
              return;
            }
            if (null != lj.field_n[var3Lifetime1]) {
              lj.field_n[var3Lifetime1].field_kb = 0;
            }
            var3Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.JA(" + param0 + ')');
        }
    }

    final static String f(byte param0) {
        String var1 = null;
        RuntimeException var1_ref = null;
        String stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 6) {
            pd.f((byte) 117);
          }
          var1 = "";
          if (null != kb.field_O) {
            var1 = kb.field_O.g((byte) -39);
          }
          if (0 == var1.length()) {
            var1 = lj.a((byte) -116);
          }
          if (var1.length() == 0) {
            var1 = wc.field_i;
          }
          stackIn_16_0 = var1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1_ref), "pd.S(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = this.a((byte) 37);
          var3 = this.b(0, (byte) 25);
          var4 = this.a(0, var2_int, (byte) -27, var3);
          cj.field_j = -var4 + a.field_c;
          if (0 > cj.field_j) {
            cj.field_j = 3 + cj.field_j;
          }
          var4Lifetime1 = 0;
          var5 = -77 % ((param0 - 15) / 35);
          while (3 > var4Lifetime1) {
            if (null != lj.field_n[var4Lifetime1]) {
              lj.field_n[var4Lifetime1].field_kb = 0;
            }
            var4Lifetime1++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.DB(" + param0 + ')');
        }
    }

    private final void b(boolean param0) {
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_e == 2 &&
            !d.p(-91)) {
            if (b.field_J == 96) {
              boolean decompiledSharedTail0 = !(this.field_k.field_j <= 0);
              if (!decompiledSharedTail0) {
                this.field_k.b(-127, 2);
                decompiledSharedTail0 = (var6 != 0);
              }
              if ((decompiledSharedTail0) &&
                (3 != this.field_k.field_j)) {
                this.field_k.b(-124, -1 + this.field_k.field_j);
              }
            }
            if (97 == b.field_J) {
              if (this.field_k.field_j >= 2) {
                if (this.field_k.field_j == 2) {
                  this.field_k.b(-127, 0);
                  if (var6 != 0) {
                    this.field_k.b(-123, 1 + this.field_k.field_j);
                  }
                }
              } else {
                this.field_k.b(-123, 1 + this.field_k.field_j);
              }
            }
            if (b.field_J == 99) {
              if (!(this.field_k.field_j >= 0) ||
                !(this.field_k.field_j <= 2)) {
                this.field_k.b(-121, tj.field_b);
                if (var6 != 0) {
                  this.field_k.b(-121, 3);
                }
              } else {
                this.field_k.b(-121, 3);
              }
            }
            if (b.field_J == 98) {
              if (this.field_k.field_j == 3) {
                this.field_k.b(-121, tj.field_b);
                if (var6 != 0) {
                  this.field_k.b(-124, 3);
                }
              } else {
                this.field_k.b(-124, 3);
              }
            }
            this.field_k.e(0);
            return;
          }
          if (3 == this.field_e) {
            stackIn_61_0 = (ma.field_j != 0) ? 0 : 1;
            var2_int = stackIn_61_0;
            stackIn_65_0 = (~ma.field_j != ~(ol.field_b.length - 1)) ? 0 : 1;
            var3 = stackIn_65_0;
            if ((var2_int != 0 ||
              var3 != 0) && (b.field_J == 96 ||
              b.field_J == 97)) {
              this.field_k.a(0);
              if (var2_int == 0 ||
                this.field_k.field_j != 0) {
                if (var3 == 0 ||
                  2 != this.field_k.field_j) {
                  this.field_k.e(0);
                  if (var6 == 0) {
                    return;
                  }
                }
                this.field_k.a(0);
                if (var6 == 0) {
                  return;
                }
              }
              this.field_k.a(0);
              return;
            }
            this.field_k.a(0);
            return;
          }
          var2_int = lg.field_d[this.field_e][20];
          if (var2_int >= 0) {
            var2_int = lg.field_d[cf.field_b][20];
          }
          if (var2_int < 0) {
            if (param0) {
              this.b(-105, false);
            }
            var3 = lg.field_d[this.field_e][0];
            if (var3 == 1) {
              this.field_k.a(0);
              if (ec.field_d != 96 &&
                ec.field_d != 97) {
                return;
              }
              do {
                if (this.c(this.field_k.field_j, (byte) -115)) {
                  return;
                }
                this.field_k.a(0);
              } while (var6 == 0);
              return;
            }
            if (0 != var3) {
              this.field_k.b(15275);
              if (b.field_J != 98 &&
                99 != b.field_J) {
                return;
              }
              do {
                if (this.c(this.field_k.field_j, (byte) 25)) {
                  return;
                }
                this.field_k.b(15275);
              } while (var6 == 0);
              return;
            }
            this.field_k.b(15275);
            if (ec.field_d != 98 &&
              ec.field_d != 99) {
              return;
            }
            do {
              if (this.c(this.field_k.field_j, (byte) -9)) {
                return;
              }
              this.field_k.b(15275);
            } while (var6 == 0);
            return;
          }
          if (b.field_J >= 0 && (this.field_e == 10 ||
            this.field_e == 8)) {
            ec.field_d = b.field_J;
          }
          if ((8 == this.field_e ||
            9 == this.field_e) &&
            cf.field_b != this.field_e) {
            return;
          }
          if (this.field_e == 10) {
            if (~cf.field_b != ~this.field_e) {
              return;
            }
            if (ec.field_d == 96 ||
              97 == ec.field_d) {
              cf.field_b = var2_int;
              return;
            }
          }
          if (11 == this.field_e) {
            if (~cf.field_b != ~this.field_e) {
              return;
            }
            if (ec.field_d == 98 ||
              ec.field_d == 99) {
              cf.field_b = var2_int;
              ug.field_i[10].field_k.b(15275);
              if (ug.field_i[10].field_k.field_j >= 0 &&
                !pa.field_s[ok.field_b][ug.field_i[10].field_k.field_j]) {
                var3 = cj.a(94);
                ug.field_i[10].field_k.field_j = var3;
              }
              ec.field_d = -1;
              return;
            }
          }
          var3 = 0;
          if (ec.field_d == 80) {
            var3 = 1;
          }
          if (this.field_e == 8 &&
            ec.field_d == 99) {
            var3 = 1;
          }
          if (this.field_e == 9 &&
            ec.field_d == 98) {
            var3 = 1;
          }
          if (this.field_e == 10) {
            var4 = cj.a(110);
            if (ec.field_d == 99 &&
              ~var4 == ~this.field_k.field_j) {
              var3 = 1;
            }
          }
          if (var3 != 0) {
            ec.field_d = -1;
            cf.field_b = var2_int;
            return;
          }
          var4Lifetime1 = lg.field_d[cf.field_b][0];
          if (var4Lifetime1 == 1 && (ec.field_d == 96 ||
            ec.field_d == 97)) {
            this.field_k.a(0);
            ec.field_d = -1;
          }
          if (var4Lifetime1 == 0 && (98 == ec.field_d ||
            ec.field_d == 99)) {
            this.field_k.b(15275);
            ec.field_d = -1;
          }
          if (cf.field_b == 10 &&
            this.field_k.field_j >= 0 &&
            !pa.field_s[ok.field_b][this.field_k.field_j]) {
            var5 = cj.a(93);
            this.field_k.field_j = var5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.EB(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ge var3 = null;
        ka var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        ka var23 = null;
        int[] var24 = null;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int[][] var30 = null;
        int var31 = 0;
        int var32 = 0;
        ge var3Lifetime1;
        ka var6Lifetime1;
        int[] var12Lifetime1;
        int[] var13Lifetime1;
        int[][] var16Lifetime1;
        int[] var17Lifetime1;
        ge var3Lifetime2;
        ge var3Lifetime3;
        ka var6Lifetime2;
        int[] var12Lifetime2;
        int[] var12Lifetime3;
        int[] var13Lifetime2;
        int[][] var16Lifetime2;
        int[] var17Lifetime2;
        int var2_intLifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var15Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var2_intLifetime2;
        int var5Lifetime2;
        int var7Lifetime2;
        int var8Lifetime2;
        int var9Lifetime2;
        int var10Lifetime2;
        int var11Lifetime2;
        var32 = TorChallenge.field_F ? 1 : 0;
        try {
          var14 = -99 / ((param0 + 30) / 59);
          if (nd.field_e <= 0) {
            qg.b();
            return;
          }
          if (rj.field_g != 0) {
            if (rj.field_g != 2 &&
              rj.field_g != 1) {
              if (rj.field_g != 4) {
                if (rj.field_g == 3) {
                  var2_int = 1 + ea.field_e;
                  var18 = var2_int / 2 - 1;
                  var5 = 15245826;
                  var3 = ad.field_e;
                  var9 = 50;
                  var6 = pl.field_f[var18 + 1];
                  var8 = 50;
                  var10 = 100;
                  var11 = nd.field_e;
                  var13 = qb.field_a[var18];
                  var12 = d.field_y;
                  var7 = 350;
                  this.a(var12, (int[]) null, var5, 0, var10, var11, var7, (byte) 110, (ka) null, var6, var13, var9, var8, var3, 0, false);
                  this.a(var2_int, (byte) -10, false, 5);
                  if (var32 == 0) {
                    return;
                  }
                }
                if (rj.field_g == 5) {
                  var2_int = ea.field_e;
                  this.a(var2_int, (byte) 88, true, 2);
                  if (var32 == 0) {
                    return;
                  }
                }
                if (rj.field_g != 6) {
                  if (rj.field_g != 7) {
                    return;
                  }
                  var3Lifetime2 = mb.field_b;
                  var5 = 6831816;
                  var31 = vj.field_c;
                  var7 = 800;
                  var12Lifetime2 = lc.field_n;
                  var24 = qc.field_g;
                  var13 = hf.field_f[var31];
                  var11 = nd.field_e;
                  var6 = pf.field_a[var31 + 1];
                  var21 = 25;
                  var22 = 200;
                  var23 = pf.field_a[4];
                  var8 = 50;
                  var9Lifetime2 = 50;
                  var10Lifetime2 = 50;
                  this.a(var12Lifetime2, var24, var5, var22, var10Lifetime2, var11, var7, (byte) 127, var23, var6, var13, var9Lifetime2, var8, var3Lifetime2, var21, true);
                  var27 = 200;
                  var28 = 600;
                  var29 = 50;
                  this.a(var27, var29, (byte) 85, var11, var28);
                  if (var32 == 0) {
                    return;
                  }
                }
                var2_int = ea.field_e;
                var6 = ei.field_w[1 + ok.field_b];
                var12Lifetime3 = mg.field_a;
                var25 = 0;
                var17 = oj.field_a;
                var3Lifetime3 = lb.field_t;
                var13 = ii.field_j[ok.field_b];
                var7 = 450;
                var20 = 425;
                var11 = nd.field_e;
                var26 = 350;
                var16 = td.field_j;
                var5 = 6831816;
                var19 = 25;
                var8 = 50;
                this.a((ka) null, var12Lifetime3, var25, var8, var3Lifetime3, var5, (int[]) null, var7, var6, 0, var11, var13, (byte) -116, false, 0, var26);
                this.a(var2_int, (byte) 126, false, 4);
                if (var32 == 0) {
                  return;
                }
              }
              var2_int = ea.field_e;
              this.a(var2_int, (byte) -66, true, 0);
              if (var32 == 0) {
                return;
              }
            }
            var2_intLifetime2 = ea.field_e + 1;
            if (rj.field_g == 2) {
              var2_intLifetime2 = uk.field_J;
            }
            var19Lifetime1 = 0;
            var7Lifetime2 = 450;
            var13Lifetime2 = wf.field_d;
            var16Lifetime2 = wf.field_h;
            var4 = eb.field_p[1];
            var8Lifetime2 = 50;
            var6Lifetime2 = eb.field_p[0];
            var20Lifetime1 = 450;
            var5Lifetime2 = -1;
            var30 = p.field_a;
            var17Lifetime2 = u.field_c;
            var15 = 2;
            if (gh.field_x) {
              var2_intLifetime2 = var2_intLifetime2 - 6 << 1;
            }
            var11Lifetime2 = nd.field_e;
            this.a((byte) 68, var30, var11Lifetime2, (ge) null, var8Lifetime2, var5Lifetime2, var13Lifetime2, var16Lifetime2, var15, var6Lifetime2, var7Lifetime2, var17Lifetime2, var20Lifetime1, var19Lifetime1, var4);
            this.a(var2_intLifetime2, (byte) 0, false, 1);
            if (var32 == 0) {
              return;
            }
          }
          var2_intLifetime1 = ea.field_e;
          var8Lifetime1 = 50;
          var9Lifetime1 = 50;
          var11Lifetime1 = nd.field_e;
          var13Lifetime1 = je.field_h[ok.field_b];
          var17Lifetime1 = u.field_c;
          var12Lifetime1 = sh.field_q;
          var10Lifetime1 = 100;
          var6Lifetime1 = we.field_m[ok.field_b + 1];
          var5Lifetime1 = 15245826;
          var15Lifetime1 = 2;
          var3Lifetime1 = qc.field_c;
          var16Lifetime1 = wf.field_h;
          var7Lifetime1 = 250;
          this.a(var12Lifetime1, (int[]) null, var5Lifetime1, 0, var10Lifetime1, var11Lifetime1, var7Lifetime1, (byte) -64, (ka) null, var6Lifetime1, var13Lifetime1, var9Lifetime1, var8Lifetime1, var3Lifetime1, 0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.K(" + param0 + ')');
        }
    }

    final void e(int param0) {
        eg stackIn_85_0 = null;
        boolean stackIn_85_1 = false;
        int stackIn_85_2 = 0;
        boolean stackIn_86_3 = false;
        boolean stackIn_90_4 = false;
        eg stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        boolean stackIn_98_2 = false;
        boolean stackIn_102_3 = false;
        eg stackIn_109_0 = null;
        boolean stackIn_109_1 = false;
        boolean stackIn_110_2 = false;
        boolean stackIn_114_3 = false;
        eg stackIn_121_0 = null;
        boolean stackIn_121_1 = false;
        int stackIn_121_2 = 0;
        boolean stackIn_122_3 = false;
        boolean stackIn_126_4 = false;
        eg stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        boolean stackIn_130_2 = false;
        boolean stackIn_134_3 = false;
        eg stackIn_137_0 = null;
        boolean stackIn_137_1 = false;
        boolean stackIn_138_2 = false;
        boolean stackIn_142_3 = false;
        int stackIn_165_0 = 0;
        boolean stackIn_178_0 = false;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        Object stackIn_187_0;
        boolean stackIn_187_3;
        boolean stackIn_201_0 = false;
        int stackIn_211_1 = 0;
        int stackIn_211_2 = 0;
        boolean stackIn_212_3 = false;
        int stackIn_218_1 = 0;
        int stackIn_218_2 = 0;
        Object stackIn_219_0;
        boolean stackIn_219_3;
        int stackIn_222_0 = 0;
        int stackIn_224_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_177_0;
        boolean stackOut_200_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        String var3 = null;
        int var4_int = 0;
        long var4 = 0L;
        int var5 = 0;
        int var6_int = 0;
        long var6 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var2_intLifetime1;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var2_intLifetime2;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        int var3_intLifetime1Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          this.a(false, this.field_e);
          if (this.field_e != 10 ||
            this.field_e == 10 &&
            vc.field_e) {
            ba.a(this.field_e, kk.field_d, fh.field_b, -111, cj.field_g);
          }
          boolean decompiledFrameRemainder1 = true;
          if (!vc.field_e) {
            if (this.field_e != 2) {
              if (this.field_e == 3) {
                this.b(10);
                decompiledFrameRemainder1 = (var11 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (this.field_e == 4) {
                  this.a(false, true);
                  decompiledFrameRemainder1 = (var11 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (this.field_e != 5) {
                    if (6 != this.field_e) {
                      if (this.field_e != 7) {
                        if (this.field_e != 10) {
                          if (this.field_e == 8) {
                            this.i(-96);
                            decompiledFrameRemainder1 = (var11 != 0);
                          }
                          if (decompiledFrameRemainder1) {
                            if (this.field_e == 0) {
                              wk.c(true);
                              this.a(323, 151, -1, 348, 148, false, hd.field_a);
                              decompiledFrameRemainder1 = (var11 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              if (this.field_e != 1) {
                                if ((12 != this.field_e) &&
                                  (decompiledFrameRemainder1 = (13 == this.field_e ||
                                  15 == this.field_e))) {
                                  this.b((byte) -119);
                                  decompiledFrameRemainder1 = (ji.field_m != null);
                                  if (decompiledFrameRemainder1) {
                                    ji.field_m.b((byte) -118);
                                    decompiledFrameRemainder1 = (var11 != 0);
                                  }
                                }
                                if (decompiledFrameRemainder1) {
                                  jd.a((byte) 68);
                                  decompiledFrameRemainder1 = (var11 != 0);
                                }
                              }
                              if (decompiledFrameRemainder1) {
                                var2_int = lg.field_d[1][1];
                                var3_int = lg.field_d[1][3];
                                var4_int = -var2_int + lg.field_d[1][2];
                                var5 = -var3_int + lg.field_d[1][4];
                                if (ee.field_o > 0 &&
                                  ol.a((byte) -119, sh.field_u)) {
                                  var5 = var5 * 7 / 6;
                                }
                                var3_int = -hd.field_a[0].field_v + var3_int;
                                var2_int = var2_int - hd.field_a[0].field_q;
                                var5 = 2 * hd.field_a[0].field_v + var5;
                                var4_int = var4_int + hd.field_a[0].field_q * 2;
                                this.a(var5, var2_int, 192, var4_int, var3_int, false, hd.field_a);
                                decompiledFrameRemainder1 = (var11 != 0);
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          this.a(0, 0, 0, param0 ^ -1014667189);
                          decompiledFrameRemainder1 = (var11 != 0);
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        sl.a(false);
                        return;
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      var2_intLifetime2 = tf.field_x.a(qc.field_e);
                      stackIn_85_0 = tf.field_x;
                      stackIn_85_1 = false;
                      stackIn_85_2 = 8586514;
                      stackIn_86_3 = (tf.field_o != 0);
                      stackIn_90_4 = (eh.field_l != 0);
                      var3_intLifetime2 = ((eg) (Object) stackIn_85_0).a(si.a(stackIn_85_1, stackIn_85_2, stackIn_86_3, stackIn_90_4));
                      if (var3_intLifetime2 > var2_intLifetime2) {
                        var2_intLifetime2 = var3_intLifetime2;
                      }
                      stackIn_97_0 = tf.field_x;
                      stackIn_97_1 = 96;
                      stackIn_98_2 = (eh.field_l != 0);
                      stackIn_102_3 = (tf.field_o != 0);
                      var3_intLifetime3 = ((eg) (Object) stackIn_97_0).a(qf.$cfr$intArgs$a$c7de0d339b2a(stackIn_97_1, stackIn_98_2, stackIn_102_3, false));
                      if (var3_intLifetime3 > var2_intLifetime2) {
                        var2_intLifetime2 = var3_intLifetime3;
                      }
                      stackIn_109_0 = tf.field_x;
                      stackIn_109_1 = false;
                      stackIn_110_2 = (0 != tf.field_o);
                      stackIn_114_3 = (eh.field_l != 0);
                      var3_intLifetime4 = ((eg) (Object) stackIn_109_0).a(vb.a(stackIn_109_1, stackIn_110_2, stackIn_114_3, false));
                      if (var3_intLifetime4 > var2_intLifetime2) {
                        var2_intLifetime2 = var3_intLifetime4;
                      }
                      var4_intLifetime1 = 73;
                      var5Lifetime1 = 148;
                      var6_int = 504;
                      if (var2_intLifetime2 > var6_int) {
                        var6_int = 8 + var2_intLifetime2 + hd.field_a[0].field_q * 2;
                        var4_intLifetime1 = 640 - var6_int >> 1;
                      }
                      var7 = 259;
                      this.a(var7, var4_intLifetime1, -1, var6_int, var5Lifetime1, false, hd.field_a);
                      var8 = 208;
                      var9 = 28;
                      var10 = 0;
                      tf.field_x.a(qc.field_e, 320, var8, var10, -1);
                      stackIn_121_0 = tf.field_x;
                      stackIn_121_1 = false;
                      stackIn_121_2 = 8586514;
                      stackIn_122_3 = (tf.field_o != 0);
                      stackIn_126_4 = (eh.field_l != 0);
                      ((eg) (Object) stackIn_121_0).a(si.a(stackIn_121_1, stackIn_121_2, stackIn_122_3, stackIn_126_4), 320, var9 + var8, var10, -1);
                      stackIn_129_0 = tf.field_x;
                      stackIn_129_1 = -15;
                      stackIn_130_2 = (eh.field_l != 0);
                      stackIn_134_3 = (tf.field_o != 0);
                      ((eg) (Object) stackIn_129_0).a(qf.$cfr$intArgs$a$c7de0d339b2a(stackIn_129_1, stackIn_130_2, stackIn_134_3, false), 320, -18 + 2 * var9 + (var8 + 63), var10, -1);
                      stackIn_137_0 = tf.field_x;
                      stackIn_137_1 = false;
                      stackIn_138_2 = (tf.field_o != 0);
                      stackIn_142_3 = (0 != eh.field_l);
                      ((eg) (Object) stackIn_137_0).a(vb.a(stackIn_137_1, stackIn_138_2, stackIn_142_3, false), 320, 108 + var9 * 2 + (var8 + 18), var10, -1);
                      decompiledFrameRemainder1 = (var11 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    this.a(true, true);
                    if (var11 != 0) {
                      this.g(param0 - 1014667111);
                      if (this.field_e == 8 ||
                        this.field_e == 10) {
                        this.c((byte) -105);
                      }
                    }
                  }
                }
              }
            } else {
              this.g(param0 - 1014667111);
              if ((var11 != 0) && (this.field_e == 8 ||
                this.field_e == 10)) {
                this.c((byte) -105);
              }
            }
          } else {
            if (this.field_e == 8 ||
              this.field_e == 10) {
              this.c((byte) -105);
            }
          }
          if (param0 != 1014667201) {
            field_d = (String) null;
          }
          stackIn_165_0 = (lg.field_d[this.field_e][19] != 0) ? 0 : 1;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var2_intLifetime1 = stackIn_165_0;
          if (var2_intLifetime1 != 0) {
            if (!vc.field_e ||
              this.field_e != 10 &&
              8 != this.field_e) {
              var3_intLifetime1 = 0;
              while (this.field_k.field_b > var3_intLifetime1) {
                stackOut_177_0 = this.c(var3_intLifetime1, (byte) -120);
                stackIn_224_0 = stackOut_177_0 ? 1 : 0;
                stackIn_178_0 = stackOut_177_0;
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_178_0) {
                  stackIn_186_1 = -93;
                  stackIn_186_2 = var3_intLifetime1;
                  if (~var3_intLifetime1 != ~this.field_k.field_j) {
                    stackIn_187_0 = this;
                    stackIn_187_3 = false;
                  } else {
                    stackIn_187_0 = this;
                    stackIn_187_3 = true;
                  }
                  this.a(stackIn_186_1, stackIn_186_2, stackIn_187_3, (ka) null);
                }
                var3_intLifetime1++;
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (var11 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              if (cd.field_b >= aa.field_f >> 1) {
                return;
              }
              if (null == oj.field_d) {
                oj.field_d = new ka(640, 480);
              }
              oj.field_d.d();
              qg.b();
              var3_intLifetime1Lifetime1 = 0;
              while (true) {
                if (var3_intLifetime1Lifetime1 < this.field_k.field_b) {
                  stackOut_200_0 = this.c(var3_intLifetime1Lifetime1, (byte) -10);
                  stackIn_222_0 = stackOut_200_0 ? 1 : 0;
                  stackIn_201_0 = stackOut_200_0;
                  if (var11 == 0) {
                    if (stackIn_201_0) {
                      if (vc.field_e) {
                        stackIn_211_1 = -110;
                        stackIn_211_2 = var3_intLifetime1Lifetime1;
                        stackIn_212_3 = (var3_intLifetime1Lifetime1 == this.field_k.field_j);
                        this.a(stackIn_211_1, stackIn_211_2, stackIn_212_3, oj.field_d);
                      } else {
                        stackIn_218_1 = -97;
                        stackIn_218_2 = var3_intLifetime1Lifetime1;
                        if (var3_intLifetime1Lifetime1 != this.field_k.field_j) {
                          stackIn_219_0 = this;
                          stackIn_219_3 = false;
                        } else {
                          stackIn_219_0 = this;
                          stackIn_219_3 = true;
                        }
                        this.a(stackIn_218_1, stackIn_218_2, stackIn_219_3, (ka) null);
                      }
                    }
                    var3_intLifetime1Lifetime1++;
                    continue;
                  }
                } else {
                  stackIn_222_0 = (-cd.field_b + (aa.field_f >> 1)) * 255 / (aa.field_f >> 1);
                }
                break;
              }
              var3_intLifetime1Lifetime1 = stackIn_222_0;
              oj.field_d.d(0, 0, var3_intLifetime1Lifetime1);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_224_0 = 0;
          }
          if (stackIn_224_0 != this.field_e &&
            this.field_e == 1) {
            this.d(param0 - 1014667198);
          }
          if (ii.field_h == null) {
            ue.b((byte) 123);
          }
          ag.a(116);
          if (2 <= fa.field_g) {
            var3 = "FPS:" + oh.field_e;
            tf.field_x.b(var3, 636, 80, 0, -1);
            var4 = Runtime.getRuntime().totalMemory();
            var6 = Runtime.getRuntime().freeMemory();
            tf.field_x.b((var4 - var6) / 1024L + " kB / " + var4 / 1024L + " kB", 636, 100, 0, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.R(" + param0 + ')');
        }
    }

    private final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        boolean[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = s.field_q.length;
          var3 = 200;
          var4 = hl.field_c;
          var5 = 0;
          if (param0 != 37) {
            field_a = (String) null;
          }
          var6 = 0;
          while (true) {
            stackIn_6_0 = -4;
            if (stackIn_6_0 < ~var6) {
              stackIn_17_0 = 0;
              if (var8 == 0) {
                var7 = stackIn_17_0;
                while (var7 < var2_int) {
                  stackOut_10_0 = var4[var7][var6];
                  stackIn_6_0 = stackOut_10_0 ? 1 : 0;
                  stackIn_11_0 = stackOut_10_0;
                  if (stackIn_11_0) {
                    var5 = var5 + var3;
                  }
                  var7++;
                }
                var6++;
                continue;
              }
            } else {
              stackIn_17_0 = var5;
            }
            return stackIn_17_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.RA(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e == 2 &&
            !d.p(-67)) {
            stackIn_5_0 = this.a(param1 - 5933, param0) + 180;
            return stackIn_5_0;
          }
          if (param1 != 5826) {
            stackIn_8_0 = -120;
            return stackIn_8_0;
          }
          var3_int = lg.field_d[this.field_e][0];
          if (var3_int == 1) {
            var4 = lg.field_d[this.field_e][7];
            var5 = lg.field_d[this.field_e][5] + var4;
            stackIn_11_0 = var4 + (var5 * param0 + ne.field_b[this.field_e]);
            return stackIn_11_0;
          }
          if (0 == var3_int) {
            stackIn_16_0 = bd.field_m[this.field_e];
            return stackIn_16_0;
          }
          stackIn_18_0 = bd.field_m[this.field_e];
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.VA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          kf.field_a = null;
          if (param0 != 30122) {
            field_c = -98;
          }
          rc.field_r = null;
          ji.field_m = new wl(uk.field_J, ok.field_b, bl.field_U);
          bc.field_o = -1;
          stackIn_7_0 = (0 < ee.field_o) ? 0 : 7;
          kc.field_v = stackIn_7_0;
          bb.field_h = -1;
          ch.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.KA(" + param0 + ')');
        }
    }

    private final int c(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = lg.field_d[this.field_e][param0];
          stackIn_1_0 = var3_int;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = ef.field_k % param0;
          var4 = -1;
          var5 = param0 >> 1;
          if (var5 > var3_int) {
            var4 = var3_int * 255 / var5;
          }
          if (var5 < var3_int) {
            var4 = -(255 * (-var5 + var3_int) / var5) + 255;
          }
          if (var4 < 0) {
            return;
          }
          if (255 < var4) {
            var4 = 255;
          }
          var10 = 65025 - var4 * 255 >>> 8;
          if (!param1) {
            this.field_k = (rl) null;
          }
          var11 = 0;
          while (var11 < qf.field_e.length) {
            boolean decompiledFrameCompleted0 = true;
            if (var11 == 0 ||
              var11 == 5 ||
              var13 != 0) {
              var12 = 0;
              while (!(var12 >= qf.field_e[var11].field_l.length)) {
                var6 = qf.field_e[var11].field_l[var12];
                var8 = var6 >>> 8 & 255;
                var9 = 255 & var6;
                var7 = var6 >>> 16 & 255;
                var8 = (var4 * var8 >>> 8) + var10;
                var7 = (var4 * var7 >>> 8) + var10;
                var9 = (var9 * var4 >>> 8) + var10;
                var8 = var8 << 8 & 65386;
                var9 = var9 & 255;
                var7 = 16729654 & var7 << 16;
                var6Lifetime1 = var7 | var8 | var9;
                qf.field_e[var11].field_l[var12] = var6Lifetime1;
                var12++;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var11++;
            }
            if (var13 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param6 >= 0) {
            if (param2 == 0) {
              this.a(di.field_t[param6], param7, param0, false, param4, (ge) null);
              if (var10 != 0) {
                di.field_t[param6].g(param0, param7);
              }
            } else {
              di.field_t[param6].g(param0, param7);
            }
          }
          if (param3 != 13) {
            return;
          }
          param0 += 30;
          if (param5 >= 0) {
            boolean decompiledSharedTail0 = (1 == param2);
            if (!decompiledSharedTail0) {
              di.field_t[param5].g(param0, param7);
              decompiledSharedTail0 = (var10 != 0);
            }
            if (decompiledSharedTail0) {
              this.a(di.field_t[param5], param7, param0, false, param4, (ge) null);
            }
          }
          param0 += 30;
          if (0 <= param1) {
            if (param2 != 2) {
              di.field_t[param1].g(param0, param7);
              if (var10 == 0) {
                return;
              }
            }
            this.a(di.field_t[param1], param7, param0, false, param4, (ge) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var9), "pd.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void a(int param0, byte param1, boolean param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        ka var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ka var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var16Lifetime1;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          var14 = 76 / ((param1 - 40) / 40);
          var7 = bi.field_a[param3][0];
          var6 = ci.field_p[param3][0];
          if (1 == param3) {
            var6 = ci.field_p[param3][param0];
            var7 = bi.field_a[param3][param0];
          }
          if (param3 > 1) {
            this.a(0, nd.field_e, var7, param3 + 6, var6, true, param2);
          }
          if (param3 <= 1 ||
            var17 != 0) {
            this.a(0, nd.field_e, var7, param3, var6, true, param2);
          }
          var5 = pe.field_eb[param3];
          if (param3 > 1) {
            var5 = pe.field_eb[6 + param3];
          }
          var16 = 0;
          var13 = hd.field_f[param3][0];
          var12 = m.field_c[param3][0];
          if (param3 == 1) {
            var12 = m.field_c[1][param0];
            var13 = hd.field_f[1][param0];
          }
          var15 = nd.field_e - var12;
          if (nd.field_e <= var12) {
            return;
          }
          if (nd.field_e >= var13) {
            return;
          }
          if (nd.field_e >= var7) {
            return;
          }
          var8 = m.field_g[0];
          var9 = m.field_g[1];
          var11 = m.field_g[3];
          if (var15 > 0 &&
            var6 > var15) {
            var16Lifetime1 = var15 * 256 / var6;
            if (var17 != 0) {
              if (-var6 + var13 >= nd.field_e) {
                var16Lifetime1 = -1;
                var16Lifetime1 = (-nd.field_e + var13) * 256 / var6;
              } else {
                var16Lifetime1 = (-nd.field_e + var13) * 256 / var6;
              }
            }
          } else {
            if (-var6 + var13 >= nd.field_e) {
              var16Lifetime1 = -1;
              if (var17 != 0) {
                var16Lifetime1 = (-nd.field_e + var13) * 256 / var6;
              }
            } else {
              var16Lifetime1 = (-nd.field_e + var13) * 256 / var6;
            }
          }
          var10 = m.field_g[2];
          if (qe.field_E == null) {
            qe.field_E = new ka(var10, var11);
          }
          if (0 <= var16Lifetime1) {
            qe.field_E.d();
            var8 = 0;
            qg.b();
            var9 = 0;
          }
          hd.a(ui.field_i, var11, var10, (byte) -74, var9, var8);
          var8 = bb.field_j[param3] + var8;
          var9 = var9 + 20;
          var5.g(var8, var9);
          if (param3 == 1) {
            var5Lifetime1 = pe.field_eb[param0 + 2];
            var8 = 269 + (-bb.field_j[param3] + var8);
            var5Lifetime1.g(var8, var9);
          }
          if (var16Lifetime1 >= 0) {
            var9Lifetime1 = m.field_g[1];
            var8Lifetime1 = m.field_g[0];
            la.field_f.a(-54);
            qe.field_E.d(var8Lifetime1, var9Lifetime1, var16Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5_ref), "pd.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int stackIn_212_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_414_0 = 0;
        int stackIn_589_0 = 0;
        int stackIn_600_0 = 0;
        int stackIn_610_0 = 0;
        int stackIn_621_0 = 0;
        int stackIn_631_0 = 0;
        int stackIn_642_0 = 0;
        boolean stackIn_652_0 = false;
        boolean stackIn_669_0 = false;
        int stackIn_694_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var6Lifetime1Lifetime1;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          var4_int = ia.field_p[this.field_e][param1];
          var5 = this.field_k.c((byte) 117) ? 1 : 0;
          if (param2 != 3) {
            this.a(98, -95, 10, 73, -4, true, (ka[]) null);
          }
          var6 = 0;
          var7 = 220;
          if (var4_int != 28 ||
            var5 == 0) {
            if (var4_int != 29 ||
              var5 == 0) {
              if (30 == var4_int &&
                var5 != 0) {
                h.a(5, 4);
              }
              if ((30 != var4_int ||
                var5 == 0 || var12 != 0) && (var5 != 0) && (var4_int != 12) && (param1 != 13)) {
                h.a(0, 4);
                if (var12 != 0) {
                  h.a(4, 4);
                  h.a(3, param2 + 1);
                }
              }} else {
              h.a(4, 4);
              if (var12 != 0) {
                h.a(3, param2 + 1);
              }
            }
          } else {
            h.a(3, param2 + 1);
          }
          var8 = 256;
          var9 = var4_int;
          if (var9 != -1) {
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
                                            boolean decompiledFrameRemainder18 = true;
                                            boolean decompiledFrameRemainder17 = true;
                                            boolean decompiledFrameRemainder16 = true;
                                            boolean decompiledFrameRemainder15 = true;
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
                                            if (var9 != 20) {
                                              if ((var9 != 1 ||
                                                var12 != 0) &&
                                                (decompiledFrameRemainder1 = (5 != var9 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder2 = (var9 != 16 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder3 = (var9 != 14 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder4 = (var9 != 3 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder5 = (6 != var9)) &&
                                                (decompiledFrameRemainder6 = (var9 != 2 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder7 = (var9 != 12)) &&
                                                (decompiledFrameRemainder8 = (var9 != 13)) &&
                                                (decompiledFrameRemainder9 = (var9 != 4 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder10 = (7 != var9)) &&
                                                (decompiledFrameRemainder11 = (var9 != 8 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder12 = (var9 != 9)) &&
                                                (decompiledFrameRemainder13 = (var9 != 10 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder14 = (var9 != 15 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder15 = (var9 != 17)) &&
                                                (decompiledFrameRemainder16 = (var9 != 18 ||
                                                var12 != 0)) &&
                                                (decompiledFrameRemainder17 = (var9 != 11)) &&
                                                (decompiledFrameRemainder18 = (var9 != 22))) {
                                                if (var9 == 23) {
                                                  break L23;
                                                }
                                                if (var9 == 24 &&
                                                  var12 == 0) {
                                                  break L22;
                                                }
                                                if (var9 == 25 &&
                                                  var12 == 0) {
                                                  break L21;
                                                }
                                                if (26 == var9) {
                                                  break L20;
                                                }
                                                if (var9 == 27) {
                                                  break L19;
                                                }
                                                if (28 == var9) {
                                                  break L18;
                                                }
                                                if (var9 == 29 &&
                                                  var12 == 0) {
                                                  break L17;
                                                }
                                                if (var9 == 30) {
                                                  break L16;
                                                }
                                                if (var9 == 31) {
                                                  break L15;
                                                }
                                                if (var9 == 19 &&
                                                  var12 == 0) {
                                                  break L14;
                                                }
                                                if (var9 == 32 &&
                                                  var12 == 0) {
                                                  break L13;
                                                }
                                                if (21 == var9) {
                                                  break L12;
                                                }
                                                if (var9 == 33 &&
                                                  var12 == 0) {
                                                  break L11;
                                                }
                                                if (34 == var9) {
                                                  break L10;
                                                }
                                                if (var9 == 35 &&
                                                  var12 == 0) {
                                                  break L9;
                                                }
                                                if (var9 == 36) {
                                                  break L8;
                                                }
                                                return;
                                              }
                                            } else {
                                              if (this.field_k.c((byte) 90)) {
                                                be.a(8, (byte) -125, param0);
                                                ug.field_i[9].a(param2 + 0, param0);
                                                stackIn_212_0 = (ee.field_o > 0) ? 0 : 7;
                                                kc.field_v = stackIn_212_0;
                                              }
                                              if (ec.field_d != 84) {
                                                return;
                                              }
                                              if (cf.field_b != 11) {
                                                return;
                                              }
                                              be.a(8, (byte) -125, param0);
                                              ug.field_i[9].a(3, param0);
                                              stackIn_223_0 = (ee.field_o <= 0) ? 7 : 0;
                                              kc.field_v = stackIn_223_0;
                                              ec.field_d = -1;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
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
                                              if (!this.field_k.c((byte) 64)) {
                                                return;
                                              }
                                              boolean decompiledSharedTail0 = (rj.field_g == -1);
                                              if (!decompiledSharedTail0) {
                                                be.a(13, (byte) -121, false);
                                                decompiledSharedTail0 = (var12 != 0);
                                              }
                                              if (decompiledSharedTail0) {
                                                ug.field_o = 0;
                                                df.field_O = true;
                                                if (ea.field_e - 6 >= 0) {
                                                  ug.field_o = 1;
                                                }
                                                be.a(-1, (byte) -126, param0);
                                              }
                                              stackIn_243_0 = (0 >= ee.field_o) ? 7 : 0;
                                              kc.field_v = stackIn_243_0;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
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
                                              if (this.field_k.c((byte) 74)) {
                                                if (cd.field_o) {
                                                  if (d.p(-69)) {
                                                    be.a(6, (byte) -110, param0);
                                                    if (var12 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  cd.field_o = false;
                                                  be.a(7, (byte) -115, param0);
                                                  if (var12 == 0) {
                                                    return;
                                                  }
                                                }
                                                be.a(0, (byte) -109, param0);
                                              }
                                              if (ec.field_d != 84) {
                                                return;
                                              }
                                              if (cf.field_b != 9) {
                                                return;
                                              }
                                              be.a(0, (byte) -115, param0);
                                              ec.field_d = -1;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
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
                                              if (!this.field_k.c((byte) 117)) {
                                                return;
                                              }
                                              be.a(7, (byte) -118, param0);
                                              this.g((byte) -87);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
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
                                              if (!this.field_k.c((byte) 109)) {
                                                return;
                                              }
                                              be.a(4, (byte) -127, param0);
                                              kc.field_v = this.field_e;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11) &&
                                              (decompiledFrameRemainder10) &&
                                              (decompiledFrameRemainder9) &&
                                              (decompiledFrameRemainder8) &&
                                              (decompiledFrameRemainder7) &&
                                              (decompiledFrameRemainder6) &&
                                              (decompiledFrameRemainder5)) {
                                              if (!this.field_k.c((byte) 122)) {
                                                return;
                                              }
                                              ma.field_j = 0;
                                              be.a(3, (byte) -103, param0);
                                              kc.field_v = this.field_e;
                                              oi.field_g = true;
                                              kj.field_A = i.field_r;
                                              dj.field_Q = n.field_jb;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11) &&
                                              (decompiledFrameRemainder10) &&
                                              (decompiledFrameRemainder9) &&
                                              (decompiledFrameRemainder8) &&
                                              (decompiledFrameRemainder7) &&
                                              (decompiledFrameRemainder6)) {
                                              if (!this.field_k.c((byte) 65)) {
                                                return;
                                              }
                                              be.a(kc.field_v, (byte) -104, param0);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11) &&
                                              (decompiledFrameRemainder10) &&
                                              (decompiledFrameRemainder9) &&
                                              (decompiledFrameRemainder8) &&
                                              (decompiledFrameRemainder7)) {
                                              if (!this.field_k.c((byte) 41)) {
                                                return;
                                              }
                                              be.a(2, (byte) -120, param0);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11) &&
                                              (decompiledFrameRemainder10) &&
                                              (decompiledFrameRemainder9) &&
                                              (decompiledFrameRemainder8)) {
                                              var6Lifetime1 = 0;
                                              if (this.field_k.f(param2 ^ 8540)) {
                                                var6Lifetime1 = 1;
                                                vk.a(0, (byte) 126);
                                              }
                                              if (this.field_k.d(-120)) {
                                                vk.a(var8, (byte) 78);
                                                var6Lifetime1 = 1;
                                              }
                                              if (this.field_k.a((byte) -79)) {
                                                var9 = 9 + (128 + ee.field_s);
                                                var10 = (this.a(23, param1) - (-this.b(param1, 5826) + var9) >> 1) + ee.field_s + 8;
                                                var11 = var8 * (kc.field_u - var10 << 1) / 256;
                                                if (var11 <= 0) {
                                                  vk.a(0, (byte) 96);
                                                  if (var12 != 0) {
                                                    if (var8 > var11) {
                                                      vk.a(var11, (byte) 121);
                                                      vk.a(var8, (byte) 93);
                                                    } else {
                                                      vk.a(var8, (byte) 93);
                                                    }
                                                  }
                                                } else {
                                                  if (var8 > var11) {
                                                    vk.a(var11, (byte) 121);
                                                    if (var12 != 0) {
                                                      vk.a(var8, (byte) 93);
                                                    }
                                                  } else {
                                                    vk.a(var8, (byte) 93);
                                                  }
                                                }
                                                var6Lifetime1 = 1;
                                              }
                                              if (this.field_k.a(false)) {
                                                bf.a(var8, 0, (byte) 15);
                                                var6Lifetime1 = 1;
                                              }
                                              if (this.field_k.g(-110)) {
                                                ve.a(106, 0, var8);
                                                var6Lifetime1 = 1;
                                              }
                                              if (var6Lifetime1 == 0) {
                                                return;
                                              }
                                              rb.a(-86, 10, 2);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11) &&
                                              (decompiledFrameRemainder10) &&
                                              (decompiledFrameRemainder9)) {
                                              var6Lifetime1Lifetime1 = 0;
                                              if (this.field_k.f(8543)) {
                                                nb.b(0, -1);
                                                var6Lifetime1Lifetime1 = 1;
                                              }
                                              if (this.field_k.d(-85)) {
                                                nb.b(var7, -1);
                                                var6Lifetime1Lifetime1 = 1;
                                              }
                                              if (this.field_k.a((byte) -105)) {
                                                var9 = 137 + ee.field_s;
                                                var10Lifetime1 = (this.a(-113, param1) + this.b(param1, param2 + 5823) - var9 >> 1) + (ee.field_s + 8);
                                                var11Lifetime1 = var7 * (kc.field_u - var10Lifetime1 << 1) / 256;
                                                var6Lifetime1Lifetime1 = 1;
                                                if (var11Lifetime1 > 0) {
                                                  if (var7 > var11Lifetime1) {
                                                    nb.b(var11Lifetime1, -1);
                                                    if (var12 != 0) {
                                                      nb.b(var7, -1);
                                                      nb.b(0, -1);
                                                    }
                                                  } else {
                                                    nb.b(var7, -1);
                                                    if (var12 != 0) {
                                                      nb.b(0, -1);
                                                    }
                                                  }
                                                } else {
                                                  nb.b(0, -1);
                                                }
                                              }
                                              if (this.field_k.a(false)) {
                                                bf.a(var7, 1, (byte) -78);
                                                var6Lifetime1Lifetime1 = 1;
                                              }
                                              if (this.field_k.g(param2 - 114)) {
                                                ve.a(param2 ^ 100, 1, var7);
                                                var6Lifetime1Lifetime1 = 1;
                                              }
                                              if (var6Lifetime1Lifetime1 == 0) {
                                                return;
                                              }
                                              rb.a(-104, 10, 2);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11) &&
                                              (decompiledFrameRemainder10)) {
                                              if (!this.field_k.c((byte) 98)) {
                                                return;
                                              }
                                              if (null == gi.field_d) {
                                                il.a(param0, 0);
                                                if (var12 == 0) {
                                                  return;
                                                }
                                              }
                                              ij.c((byte) -107);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12) &&
                                              (decompiledFrameRemainder11)) {
                                              if (!this.field_k.c((byte) 42)) {
                                                return;
                                              }
                                              boolean decompiledFrameRemainder0 = true;
                                              qh.d(true);
                                              sd.a(125);
                                              sd.b(106);
                                              if (d.p(param2 - 86)) {
                                                be.a(6, (byte) -120, param0);
                                                decompiledFrameRemainder0 = (var12 != 0);
                                              }
                                              if (decompiledFrameRemainder0) {
                                                if (!d.p(-105) &&
                                                  null != ji.field_m) {
                                                  ji.field_m.c((byte) 107);
                                                }
                                                oi.a(true, true, true);
                                                rc.c((byte) -82);
                                                if (ee.field_o > 0) {
                                                  cd.field_o = false;
                                                  if (var12 != 0) {
                                                    cd.field_o = true;
                                                  }
                                                } else {
                                                  cd.field_o = true;
                                                }
                                                rc.field_r = null;
                                                if (!d.p(-73) &&
                                                  eh.field_l != 0) {
                                                  be.a(5, (byte) -126, param0);
                                                  if (var12 != 0) {
                                                    if (d.p(-103)) {
                                                      be.a(6, (byte) -112, param0);
                                                      be.a(2, (byte) -109, param0);
                                                    } else {
                                                      be.a(2, (byte) -109, param0);
                                                    }
                                                  }
                                                } else {
                                                  if (d.p(-103)) {
                                                    be.a(6, (byte) -112, param0);
                                                    if (var12 != 0) {
                                                      be.a(2, (byte) -109, param0);
                                                    }
                                                  } else {
                                                    be.a(2, (byte) -109, param0);
                                                  }
                                                }
                                              }
                                              stackIn_414_0 = (0 < ee.field_o) ? 0 : 7;
                                              kc.field_v = stackIn_414_0;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13) &&
                                              (decompiledFrameRemainder12)) {
                                              if (!this.field_k.c((byte) 106)) {
                                                return;
                                              }
                                              tj.field_b = 0;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14) &&
                                              (decompiledFrameRemainder13)) {
                                              if (!this.field_k.c((byte) 119)) {
                                                return;
                                              }
                                              tj.field_b = 1;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15) &&
                                              (decompiledFrameRemainder14)) {
                                              if (!this.field_k.c((byte) 104)) {
                                                return;
                                              }
                                              tj.field_b = 2;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16) &&
                                              (decompiledFrameRemainder15)) {
                                              if (!this.field_k.c((byte) 37)) {
                                                return;
                                              }
                                              if (this.field_e != 4 &&
                                                this.field_e != 2) {
                                                if (6 != this.field_e) {
                                                  return;
                                                }
                                                fh.a(6, param2 ^ 7287, 5);
                                                if (var12 == 0) {
                                                  return;
                                                }
                                              }
                                              fh.a(this.field_e, 7284, this.field_e);
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17) &&
                                              (decompiledFrameRemainder16)) {
                                              if (!this.field_k.c((byte) 67)) {
                                                return;
                                              }
                                              if (!this.c(param1, (byte) -122)) {
                                                return;
                                              }
                                              if (ma.field_j > 0) {
                                                cj.field_j = 0;
                                                ma.field_j = ma.field_j - 1;
                                                if (ma.field_j == 4) {
                                                  fd.field_h = null;
                                                }
                                                if (ma.field_j == 5) {
                                                  qh.a(3, true);
                                                }
                                                this.d(false);
                                              }
                                              if (0 != ma.field_j) {
                                                return;
                                              }
                                              this.field_k.field_j = 1;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if ((decompiledFrameRemainder18) &&
                                              (decompiledFrameRemainder17)) {
                                              if (!this.field_k.c((byte) 86)) {
                                                return;
                                              }
                                              if (!this.c(param1, (byte) -127)) {
                                                return;
                                              }
                                              if (ma.field_j < 9) {
                                                ma.field_j = ma.field_j + 1;
                                                cj.field_j = 0;
                                                if (4 == ma.field_j) {
                                                  fd.field_h = null;
                                                }
                                                if (5 == ma.field_j) {
                                                  qh.a(3, true);
                                                }
                                                this.d(false);
                                              }
                                              if (ma.field_j != 9) {
                                                return;
                                              }
                                              this.field_k.field_j = 1;
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if (decompiledFrameRemainder18) {
                                              if (!this.field_k.c((byte) 125)) {
                                                return;
                                              }
                                              if (gi.field_d != null) {
                                                ij.c((byte) -98);
                                              }
                                              ef.a((byte) -93, gi.b(param2 + 12473));
                                              if (var12 == 0) {
                                                return;
                                              }
                                            }
                                            if (this.field_k.c((byte) 99)) {
                                              uk.field_J = 0;
                                              o.a(0, true);
                                            }
                                            if (ec.field_d != 84) {
                                              return;
                                            }
                                            if (cf.field_b != 10) {
                                              return;
                                            }
                                            uk.field_J = 0;
                                            o.a(0, true);
                                            if (var12 == 0) {
                                              return;
                                            }
                                          }
                                          if (this.field_k.c((byte) 50)) {
                                            uk.field_J = 1;
                                            o.a(0, true);
                                          }
                                          if (ec.field_d != 84) {
                                            return;
                                          }
                                          if (cf.field_b != 10) {
                                            return;
                                          }
                                          uk.field_J = 1;
                                          o.a(0, true);
                                          if (var12 == 0) {
                                            return;
                                          }
                                        }
                                        if (this.field_k.c((byte) 110)) {
                                          uk.field_J = 2;
                                          o.a(0, true);
                                        }
                                        if (ec.field_d != 84) {
                                          return;
                                        }
                                        if (cf.field_b != 10) {
                                          return;
                                        }
                                        uk.field_J = 2;
                                        o.a(0, true);
                                        if (var12 == 0) {
                                          return;
                                        }
                                      }
                                      if (this.field_k.c((byte) 79)) {
                                        uk.field_J = 3;
                                        o.a(0, true);
                                      }
                                      if (84 != ec.field_d) {
                                        return;
                                      }
                                      if (cf.field_b != 10) {
                                        return;
                                      }
                                      uk.field_J = 3;
                                      o.a(0, true);
                                      if (var12 == 0) {
                                        return;
                                      }
                                    }
                                    if (this.field_k.c((byte) 43)) {
                                      uk.field_J = 4;
                                      o.a(0, true);
                                    }
                                    if (ec.field_d != 84) {
                                      return;
                                    }
                                    if (10 != cf.field_b) {
                                      return;
                                    }
                                    uk.field_J = 4;
                                    o.a(0, true);
                                    if (var12 == 0) {
                                      return;
                                    }
                                  }
                                  if (this.field_k.c((byte) 38)) {
                                    uk.field_J = 5;
                                    o.a(0, true);
                                  }
                                  if (ec.field_d != 84) {
                                    return;
                                  }
                                  if (cf.field_b != 10) {
                                    return;
                                  }
                                  uk.field_J = 5;
                                  o.a(0, true);
                                  if (var12 == 0) {
                                    return;
                                  }
                                }
                                if (this.field_k.c((byte) 42)) {
                                  cf.field_b = 10;
                                  ok.field_b = 0;
                                  wl.d(335);
                                  ug.field_i[10].a(param2 + 0, param0);
                                  ug.field_i[11].a(param2 ^ 0, param0);
                                  stackIn_589_0 = (ee.field_o > 0) ? 0 : 7;
                                  kc.field_v = stackIn_589_0;
                                }
                                if (ec.field_d != 84) {
                                  return;
                                }
                                if (cf.field_b != 8) {
                                  return;
                                }
                                ok.field_b = 0;
                                cf.field_b = 10;
                                wl.d(335);
                                ug.field_i[10].a(3, param0);
                                ug.field_i[11].a(param2 + 0, param0);
                                stackIn_600_0 = (ee.field_o <= 0) ? 7 : 0;
                                kc.field_v = stackIn_600_0;
                                ec.field_d = -1;
                                if (var12 == 0) {
                                  return;
                                }
                              }
                              if (this.field_k.c((byte) 84)) {
                                cf.field_b = 10;
                                ok.field_b = 1;
                                wl.d(param2 + 332);
                                ug.field_i[10].a(3, param0);
                                ug.field_i[11].a(param2 + 0, param0);
                                stackIn_610_0 = (0 >= ee.field_o) ? 7 : 0;
                                kc.field_v = stackIn_610_0;
                              }
                              if (ec.field_d != 84) {
                                return;
                              }
                              if (cf.field_b != 8) {
                                return;
                              }
                              cf.field_b = 10;
                              ok.field_b = 1;
                              wl.d(335);
                              ug.field_i[10].a(3, param0);
                              ug.field_i[11].a(3, param0);
                              stackIn_621_0 = (ee.field_o > 0) ? 0 : 7;
                              kc.field_v = stackIn_621_0;
                              ec.field_d = -1;
                              if (var12 == 0) {
                                return;
                              }
                            }
                            if (this.field_k.c((byte) 73)) {
                              ok.field_b = 2;
                              cf.field_b = 10;
                              wl.d(335);
                              ug.field_i[10].a(3, param0);
                              ug.field_i[11].a(3, param0);
                              stackIn_631_0 = (0 >= ee.field_o) ? 7 : 0;
                              kc.field_v = stackIn_631_0;
                            }
                            if (84 != ec.field_d) {
                              return;
                            }
                            if (8 != cf.field_b) {
                              return;
                            }
                            ok.field_b = 2;
                            cf.field_b = 10;
                            wl.d(335);
                            ug.field_i[10].a(3, param0);
                            ug.field_i[11].a(3, param0);
                            ec.field_d = -1;
                            stackIn_642_0 = (ee.field_o > 0) ? 0 : 7;
                            kc.field_v = stackIn_642_0;
                            if (var12 == 0) {
                              return;
                            }
                          }
                          if (this.field_k.c((byte) 41)) {
                            stackIn_652_0 = !(bl.field_U);
                            bl.field_U = stackIn_652_0;
                            if (null != ji.field_m) {
                              ui.field_b = bl.field_U;
                            }
                          }
                          if (ec.field_d != 84) {
                            return;
                          }
                          if (9 != cf.field_b &&
                            11 != cf.field_b) {
                            return;
                          }
                          stackIn_669_0 = !(bl.field_U);
                          bl.field_U = stackIn_669_0;
                          if (null != ji.field_m) {
                            ui.field_b = bl.field_U;
                          }
                          ec.field_d = -1;
                          if (var12 == 0) {
                            return;
                          }
                        }
                        if (!this.field_k.c((byte) 94)) {
                          return;
                        }
                        be.a(0, (byte) -113, param0);
                        if (var12 == 0) {
                          return;
                        }
                      }
                      if (!this.field_k.c((byte) 92)) {
                        return;
                      }
                      md.field_a = true;
                      if (var12 == 0) {
                        return;
                      }
                    }
                    if (!this.field_k.c((byte) 80)) {
                      return;
                    }
                    be.a(10, (byte) -124, param0);
                    stackIn_694_0 = (ee.field_o <= 0) ? 7 : 0;
                    kc.field_v = stackIn_694_0;
                    if (var12 == 0) {
                      return;
                    }
                  }
                  if (!this.field_k.c((byte) 49)) {
                    return;
                  }
                  a.field_c = 0;
                  if (ma.field_j != 2) {
                    if (ma.field_j == 3) {
                      this.j(param2 ^ 75);
                      if (var12 == 0) {
                        return;
                      }
                    }
                    if (4 != ma.field_j) {
                      return;
                    }
                    this.e((byte) 70);
                    if (var12 == 0) {
                      return;
                    }
                  }
                  de.b(param2 ^ -131076);
                  if (var12 == 0) {
                    return;
                  }
                }
                if (!this.field_k.c((byte) 86)) {
                  return;
                }
                a.field_c = 1;
                if (2 == ma.field_j) {
                  de.b(-131073);
                  if (var12 == 0) {
                    return;
                  }
                }
                if (3 == ma.field_j) {
                  this.j(125);
                  if (var12 == 0) {
                    return;
                  }
                }
                if (ma.field_j != 4) {
                  return;
                }
                this.e((byte) 118);
                if (var12 == 0) {
                  return;
                }
              }
              if (!this.field_k.c((byte) 84)) {
                return;
              }
              a.field_c = 2;
              if (ma.field_j != 2) {
                if (ma.field_j == 3) {
                  this.j(83);
                  if (var12 == 0) {
                    return;
                  }
                }
                if (4 != ma.field_j) {
                  return;
                }
                this.e((byte) 67);
                if (var12 == 0) {
                  return;
                }
              }
              de.b(param2 ^ -131076);
              if (var12 == 0) {
                return;
              }
            }
            if (this.field_k.c((byte) 48)) {
              bc.field_o = 13;
              bb.field_h = 13;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "pd.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(ka param0, int[] param1, int param2, int param3, ge param4, int param5, int[] param6, int param7, ka param8, int param9, int param10, int[] param11, byte param12, boolean param13, int param14, int param15) {
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var21Lifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        var24 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param12 > -35) {
            field_h = (ef) null;
          }
          var21 = 0;
          var18 = -param1[1];
          if (param10 >= param3) {
            if (param7 - param3 < param10) {
              var21Lifetime1 = 256 * (-param10 + param7) / param3;
              if (var24 != 0) {
                var21Lifetime1 = -1;
                var21Lifetime1 = param10 * 256 / param3;
              }
            } else {
              var21Lifetime1 = -1;
              if (var24 != 0) {
                var21Lifetime1 = param10 * 256 / param3;
              }
            }
          } else {
            var21Lifetime1 = param10 * 256 / param3;
          }
          var17_int = -param1[0];
          if (0 > var21Lifetime1) {
            param4.a(var17_int, var18);
          }
          if (0 <= var21Lifetime1 ||
            var24 != 0) {
            param4.a(var17_int, var18, var21Lifetime1, 1);
          }
          if (null != param0) {
            var17_intLifetime1 = param6[0];
            var18Lifetime1 = param6[1];
            if (0 <= var21Lifetime1) {
              param0.a(var17_intLifetime1, var18Lifetime1, var21Lifetime1, 1);
              if (var24 != 0) {
                param0.g(var17_intLifetime1, var18Lifetime1);
              }
            } else {
              param0.g(var17_intLifetime1, var18Lifetime1);
            }
          }
          var22 = 0;
          if (param13) {
            var23 = param10 % param14 * 2048 / param14;
            var22 = fj.a(1870096848, wi.field_a[var23], param9 << 16) >> 16;
          }
          var18Lifetime2 = param11[1] + var22;
          var17_intLifetime2 = param11[0];
          var23Lifetime1 = -1;
          if (param2 > param10 ||
            param10 > param15 + param2) {
            if (param10 >= param2) {
              return;
            }
            if (var21Lifetime1 < 0) {
              param8.g(var17_intLifetime2, var18Lifetime2);
              if (var24 == 0) {
                return;
              }
            }
            param8.e(var17_intLifetime2, var18Lifetime2, var21Lifetime1);
            if (var24 == 0) {
              return;
            }
          }
          var23Lifetime2 = 256 - 256 * (-param2 + param10) / param15;
          if (0 > var23Lifetime2 ||
            var23Lifetime2 > 256) {
            var23Lifetime2 = 256;
          }
          var20 = param8.field_v * var23Lifetime2 >> 8;
          var19 = var23Lifetime2 * param8.field_q >> 8;
          var18Lifetime2 = var18Lifetime2 + (-var20 + param8.field_v >> 1);
          var17_intLifetime2 = var17_intLifetime2 + (-var19 + param8.field_q >> 1);
          if (var21Lifetime1 < 0) {
            param8.d(var17_intLifetime2, var18Lifetime2, var19, var20);
            if (var24 == 0) {
              return;
            }
          }
          param8.a(var17_intLifetime2, var18Lifetime2, var19, var20, var21Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_57_0 = var17;
          stackIn_57_1 = new StringBuilder().append("pd.GA(");
          if (param0 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(')').toString());
        }
    }

    private final boolean c(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == this.field_e) {
            if (0 == param0 &&
              ma.field_j == 0) {
              return false;
            }
            if (param0 == 2 &&
              ~ma.field_j == ~(-1 + ol.field_b.length)) {
              return false;
            }
          }
          var3_int = -37 / ((-68 - param1) / 38);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        qe dupTemp$0 = null;
        qe dupTemp$1 = null;
        qe dupTemp$2 = null;
        qe dupTemp$3 = null;
        qe dupTemp$4 = null;
        int stackIn_8_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var16 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param5) {
            qg.a(ui.field_f);
          }
          this.c(false);
          var8_int = ja.a((byte) 109, lj.field_n[param4].field_L) ? 1 : 0;
          stackIn_8_0 = (lj.field_n[param4].field_L != 17) ? 0 : 1;
          var9 = stackIn_8_0;
          var10 = 0;
          var10Lifetime1 = bd.field_l ? 1 : 0;
          bd.field_l = false;
          if (var8_int == 0 &&
            var9 == 0) {
            lj.field_n[param4].field_L = 3;
            lj.field_n[param4].field_kb = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var9 == 0) {
            vj.field_c = param4;
            lj.field_n[param4].b(false, false);
            lj.field_n[param4].a(jj.field_a[param4], 32, 128, (int[]) null, 0, -20861, 64, 0);
            if (db.field_x[i.field_r][param4] - 1 <= lj.field_n[param4].field_kb) {
              lj.field_n[param4].field_kb = db.field_x[i.field_r][param4] - 1;
            }
            var11 = pl.field_e[lj.field_n[param4].field_L];
            var12 = a.field_d[param4][var11][lj.field_n[param4].field_kb][0];
            var13 = 2 * ae.field_u[param4][var11][lj.field_n[param4].field_kb] - 1;
            stackIn_25_0 = (var13 > -lj.field_n[param4].field_p + ef.field_k) ? 0 : 1;
            var14 = stackIn_25_0;
            var15 = ll.field_j[param4][var11][lj.field_n[param4].field_kb] ? 1 : 0;
            if (var14 != 0 &&
              var15 != 0) {
              if (lj.field_n[param4].field_L != 10 ||
                var12 == 17) {
                if (lj.field_n[param4].field_L == 9 &&
                  var12 != 17) {
                  dupTemp$0 = lj.field_n[param4];
                  dupTemp$0.field_kb = dupTemp$0.field_kb + 1;
                  lj.field_n[param4].field_p = ef.field_k;
                  decompiledFrameRemainder0 = (var16 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (lj.field_n[param4].field_L == 7) {
                    var12 = 17;
                  }
                  lj.field_n[param4].field_L = var12;
                  lj.field_n[param4].field_kb = 0;
                  dupTemp$1 = lj.field_n[param4];
                  dupTemp$1.field_p = dupTemp$1.field_p + (1 + var13);
                  if (var16 != 0) {
                    dupTemp$2 = lj.field_n[param4];
                    dupTemp$2.field_kb = dupTemp$2.field_kb + 1;
                    lj.field_n[param4].field_p = ef.field_k;
                    if (var14 != 0) {
                      dupTemp$3 = lj.field_n[param4];
                      dupTemp$3.field_kb = dupTemp$3.field_kb + 1;
                      dupTemp$4 = lj.field_n[param4];
                      dupTemp$4.field_p = dupTemp$4.field_p + (1 + var13);
                    }
                  }
                }
              } else {
                dupTemp$2 = lj.field_n[param4];
                dupTemp$2.field_kb = dupTemp$2.field_kb + 1;
                lj.field_n[param4].field_p = ef.field_k;
                if ((var16 != 0) &&
                  (var14 != 0)) {
                  dupTemp$3 = lj.field_n[param4];
                  dupTemp$3.field_kb = dupTemp$3.field_kb + 1;
                  dupTemp$4 = lj.field_n[param4];
                  dupTemp$4.field_p = dupTemp$4.field_p + (1 + var13);
                }
              }
            } else {
              if (var14 != 0) {
                dupTemp$3 = lj.field_n[param4];
                dupTemp$3.field_kb = dupTemp$3.field_kb + 1;
                dupTemp$4 = lj.field_n[param4];
                dupTemp$4.field_p = dupTemp$4.field_p + (1 + var13);
              }
            }
          }
          if (!param5) {
            bd.field_l = var10Lifetime1 != 0;
            return;
          }
          la.field_f.a(-98);
          qg.b(ui.field_f);
          var11Lifetime1 = jj.field_a[param4].field_q;
          var12Lifetime1 = jj.field_a[param4].field_v;
          if (param0 != 42) {
            field_h = (ef) null;
          }
          var13Lifetime1 = param3 - var12Lifetime1 >> 1;
          var14Lifetime1 = param1 - var11Lifetime1 >> 1;
          param2 = var14Lifetime1 + param2;
          param6 = var13Lifetime1 + param6;
          jj.field_a[param4].g(param2, param6);
          bd.field_l = var10Lifetime1 != 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var8), "pd.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var37 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        int var3 = 0;
        int var9 = 0;
        int var10 = 0;
        ka var11 = null;
        ka[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        var37 = TorChallenge.field_F ? 1 : 0;
        try {
          var6 = -1;
          if (param0 != -105) {
            return;
          }
          var7 = -1;
          var8 = 7;
          var4 = lg.field_d[8][7];
          var5 = lg.field_d[8][8];
          rj.a(2, 8, var5, ba.field_b, var4);
          ll.field_b = -1;
          if (aa.field_f >> 2 <= cd.field_b) {
            if (!(cd.field_b >= (aa.field_f >> 2)) ||
              !(cd.field_b < aa.field_f >> 1)) {
              if (!(aa.field_f >> 1 <= cd.field_b) ||
                !(cd.field_b < (aa.field_f >> 2) * 3)) {
                if (3 * (aa.field_f >> 2) > cd.field_b) {
                  return;
                }
                this.a(-(3 * (aa.field_f >> 2)) + cd.field_b, -1, aa.field_f >> 2, -124);
                if (var37 == 0) {
                  return;
                }
              }
              var12 = dh.field_cb[0];
              var4 = ue.field_j[2];
              var3 = ue.field_j[1];
              var7 = 255 * (-(aa.field_f >> 1) + cd.field_b) / (aa.field_f >> 2);
              var5 = ue.field_j[3];
              var2_int = ue.field_j[0];
              hd.a(var12, var5, var4, (byte) -67, var3, var2_int);
              var13 = ue.field_j[0];
              var14 = ue.field_j[1];
              var15 = ue.field_j[2];
              var13 = var13 + var8;
              var15 = -(var8 * 2) + var15;
              var11 = we.field_m[1 + ok.field_b];
              var14 = var8 + var14;
              var16_int = ue.field_j[3];
              var16_int = var16_int - var8 * 2;
              qg.a(pf.field_g);
              qg.f(var13, var14, var15 + var13, var16_int + var14);
              var15 = ue.field_j[2];
              var14 = ue.field_j[1];
              var13 = ue.field_j[0];
              var16_int = ue.field_j[3];
              var13 = (var15 - var11.field_q >> 1) + var13;
              var14 = (-var11.field_v + var16_int >> 1) + var14;
              if (ok.field_b == 0) {
                var14 += 96;
                var13 -= 32;
              }
              var11.g(var13, var14);
              qg.b(pf.field_g);
              var12[0].g(var2_int, var3);
              var12[2].g(var4 + var2_int - var12[2].field_q, var3);
              var12[6].g(var2_int, -var12[6].field_v + var5 + var3);
              var12[8].g(var4 + var2_int - var12[2].field_q, -var12[6].field_v + var5 + var3);
              if (var37 == 0) {
                return;
              }
            }
            var13 = bg.field_I[ok.field_b][0];
            var14 = bg.field_I[ok.field_b][1];
            var15 = bg.field_I[ok.field_b][2];
            var16_int = bg.field_I[ok.field_b][3];
            var17 = ue.field_j[0];
            var18 = ue.field_j[1];
            var19 = ue.field_j[2];
            var20 = ue.field_j[3];
            var21 = var13;
            var22 = var14;
            var23 = var15;
            var24 = var16_int;
            var25 = var17;
            var26 = var18;
            var27 = var19;
            var28 = var20;
            var11 = we.field_m[ok.field_b + 1];
            var14 = 32 + (var14 + ((var16_int >> 1) - (var11.field_v >> 1) >> 1));
            var13 = (-(var11.field_q >> 1) + var15 >> 1) + var13;
            var16_int = var11.field_v >> 1;
            var17 = (-var11.field_q + var19 >> 1) + var17;
            var18 = (-var11.field_v + var20 >> 1) + var18;
            var15 = var11.field_q >> 1;
            if (ok.field_b == 0) {
              var14 += 48;
              var18 += 96;
              var17 -= 32;
              var13 -= 16;
            }
            var20 = var11.field_v;
            var19 = var11.field_q;
            var29 = (cd.field_b - (aa.field_f >> 2)) * (var17 - var13) / (aa.field_f >> 2) + var13;
            var30 = (-(aa.field_f >> 2) + cd.field_b) * (-var14 + var18) / (aa.field_f >> 2) + var14;
            var31 = (cd.field_b - (aa.field_f >> 2)) * (-var15 + var19) / (aa.field_f >> 2) + var15;
            var32 = var16_int + (-(aa.field_f >> 2) + cd.field_b) * (-var16_int + var20) / (aa.field_f >> 2);
            var35 = var23 - (-((-(aa.field_f >> 2) + cd.field_b) * (var27 - var23) / (aa.field_f >> 2)) + 2 * var8);
            var34 = var8 + (cd.field_b - (aa.field_f >> 2)) * (var26 - var22) / (aa.field_f >> 2) + var22;
            var33 = var8 + (cd.field_b - (aa.field_f >> 2)) * (var25 - var21) / (aa.field_f >> 2) + var21;
            var12 = dh.field_cb[0];
            var36 = -(2 * var8) + (var24 + (var28 - var24) * (-(aa.field_f >> 2) + cd.field_b) / (aa.field_f >> 2));
            hd.a(var12, var36 + 2 * var8, var8 * 2 + var35, (byte) 55, -var8 + var34, -var8 + var33);
            qg.a(pf.field_g);
            qg.f(var33, var34, var35 + var33, var36 + var34);
            var11.d(var29, var30, var31, var32);
            qg.b(pf.field_g);
            var12[0].g(var33 - var8, var34 - var8);
            var12[2].g(var8 + var33 + var35 - var12[2].field_q, -var8 + var34);
            var12[6].g(var33 - var8, var36 + var34 + var8 - var12[6].field_v);
            var12[8].g(-var12[2].field_q + var8 + (var33 + var35), -var12[6].field_v + var8 + (var36 + var34));
            if (var37 == 0) {
              return;
            }
          }
          var13 = 0;
          while (var13 < 3) {
            stackIn_71_0 = ~ok.field_b;
            stackIn_71_1 = ~var13;
            if (var37 != 0) {
              return;
            }
            if (stackIn_71_0 != stackIn_71_1 ||
              var37 != 0) {
              var6 = -1;
              var7 = -1;
              var4 = bg.field_I[var13][2];
              var2_int = bg.field_I[var13][0];
              var3 = bg.field_I[var13][1];
              var5 = bg.field_I[var13][3];
              var9 = var3 + var5;
              var12 = dh.field_cb[0];
              var11 = we.field_m[var13 + 1];
              var10 = (-var3 + var9) * cd.field_b / (aa.field_f >> 2);
              var3 = var3 + var10;
              var7 = 255 * (-cd.field_b + (aa.field_f >> 2)) / (aa.field_f >> 2);
              if (oj.field_d == null) {
                oj.field_d = new ka(640, 480);
              }
              oj.field_d.d();
              qg.b();
              hd.a(var12, var5, var4, (byte) -55, var3, var2_int);
              var3 = var8 + var3;
              qg.a(pf.field_g);
              var2_int = var8 + var2_int;
              qg.a(var2_int, var3, -(2 * var8) + var4 + var2_int, (var5 >> 1) + (var3 - var8));
              var2_int = bg.field_I[var13][0];
              var3 = bg.field_I[var13][1];
              var2_int = (var4 - (var11.field_q >> 1) >> 1) + var2_int;
              var3 = (-(var11.field_v >> 1) + (var5 >> 1) >> 1) + (var3 + 32);
              var3 = var3 + var10;
              if (var13 == 0) {
                var2_int -= 16;
                var3 += 48;
              }
              od.a(var11, var2_int, var3);
              qg.b(pf.field_g);
              var14 = ef.field_j[0];
              var2_int = lg.field_d[8][1] + (lg.field_d[8][7] + lg.field_d[8][5]) * var13;
              var3 = lg.field_d[8][3];
              var4 = lg.field_d[8][7];
              var5 = lg.field_d[8][8];
              var15 = ef.field_j[1];
              var2_int = -(-var4 + var14 >> 1) + var2_int;
              var3 = var3 - (-var5 + var15 >> 1);
              qg.a(pf.field_g);
              var3 = var3 + var10;
              qg.a(0, var3, 640, var9 - var12[7].field_v);
              de.field_a.g(var2_int, var3);
              var17 = var13;
              switch ((var37 == 0
                || var17 == 2
                ) ? var17 : -1) {
                case 0:
                  var16 = we.field_c[28][0];
                  {
                    break;
                  }
                case 1:
                  var16 = we.field_c[29][0];
                  {
                    break;
                  }
                case 2:
                  var16 = we.field_c[30][0];
                  {
                    break;
                  }
                default:
                  var16 = we.field_c[28][0];
              }
              var17 = 24;
              tf.field_x.a(var16, (var14 >> 1) + var2_int, 18 + (var3 + (-var17 + var5 >> 1)), 0, -1);
              var3 = lg.field_d[8][3] + lg.field_d[8][8];
              var2_int = bg.field_I[var13][0];
              var4 = bg.field_I[var13][2];
              var5 = jj.field_a[ok.field_b].field_v;
              var3 = var3 + var10;
              this.a((byte) 42, var4, 0, var5, var13, false, 0);
              oj.field_d.d();
              jj.field_a[ok.field_b].g(var2_int, var3);
              la.field_f.a(113);
              oj.field_d.d(0, 0, var7);
            }
            var13++;
          }
          var13 = 0;
          while (true) {
            stackIn_71_0 = 3;
            stackIn_71_1 = var13;
            if (stackIn_71_0 <= stackIn_71_1) {
              break;
            }
            if (var37 != 0) {
              return;
            }
            if (~var13 == ~ok.field_b) {
              var5 = bg.field_I[var13][3];
              var4 = bg.field_I[var13][2];
              var2_int = bg.field_I[var13][0];
              var3 = bg.field_I[var13][1];
              var6 = -1;
              var6 = cd.field_b * 255 / (aa.field_f >> 2);
              var9 = var3 + var5;
              var12 = dh.field_cb[0];
              var11 = we.field_m[var13 + 1];
              if (oj.field_d == null) {
                oj.field_d = new ka(640, 480);
              }
              hd.a(var12, var5, var4, (byte) 69, var3, var2_int);
              var14 = ef.field_j[0];
              var3 = lg.field_d[8][3];
              var5 = lg.field_d[8][8];
              var15 = ef.field_j[1];
              var2_int = lg.field_d[8][1] + var13 * (lg.field_d[8][5] + lg.field_d[8][7]);
              var4 = lg.field_d[8][7];
              var2_int = var2_int - (-var4 + var14 >> 1);
              var10 = (-var3 + var9) * cd.field_b / (aa.field_f >> 2);
              var3 = var3 - (var15 - var5 >> 1);
              qg.a(pf.field_g);
              var3 = var3 + var10;
              qg.a(0, var3, 640, -var12[7].field_v + var9);
              de.field_a.g(var2_int, var3);
              var17 = var13;
              switch (var17) {
                case 0:
                  var16 = we.field_c[28][0];
                  {
                    break;
                  }
                case 1:
                  var16 = we.field_c[29][0];
                  {
                    break;
                  }
                case 2:
                  var16 = we.field_c[30][0];
                  {
                    break;
                  }
                default:
                  var16 = we.field_c[28][0];
              }
              var17 = 24;
              tf.field_x.a(var16, var2_int + (var14 >> 1), var3 + ((var5 - var17 >> 1) + 18), 0, -1);
              var3 = lg.field_d[8][8] + lg.field_d[8][3];
              var2_int = bg.field_I[var13][0];
              var5 = jj.field_a[ok.field_b].field_v;
              var4 = bg.field_I[var13][2];
              var3 = var10 + var3;
              this.a((byte) 42, var4, var2_int, var5, var13, true, var3);
              qg.b(pf.field_g);
              oj.field_d.d();
              qg.b();
              var4 = bg.field_I[var13][2];
              var5 = bg.field_I[var13][3];
              var2_int = bg.field_I[var13][0];
              var3 = bg.field_I[var13][1];
              var2_int = var8 + var2_int;
              qg.a(pf.field_g);
              var3 = var8 + var3;
              qg.a(var2_int, var3, -(2 * var8) + (var2_int + var4), -lg.field_d[8][8] + ((var5 >> 1) + var3) + var10 - var8);
              var2_int = bg.field_I[var13][0];
              var2_int = (var4 - (var11.field_q >> 1) >> 1) + var2_int;
              var3 = bg.field_I[var13][1];
              var3 = var3 + ((-(var11.field_v >> 1) + (var5 >> 1) >> 1) + 32);
              if (var13 == 0) {
                var2_int -= 16;
                var3 += 48;
              }
              od.a(var11, var2_int, var3);
              la.field_f.a(122);
              oj.field_d.a(0, 0, var6, 16777215);
            }
            var13++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "pd.PA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        String[] var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 <= 54) {
            this.a(false, false, 104, true, false, (ka) null);
          }
          if (!d.p(-88) &&
            ee.field_o > 0) {
            stackIn_11_0 = 0;
          } else {
            stackIn_11_0 = 1;
          }
          var6_int = stackIn_11_0;
          if (var6_int != 0) {
            var7 = vg.field_b[0];
          }
          if (var6_int == 0 ||
            var20 != 0) {
            var7 = vg.field_b[1];
          }
          var8 = var7[0] + me.field_a[ok.field_b] + var7[1];
          var9 = 384;
          var10 = tf.field_x.a(var8, var9);
          var11 = 26;
          var12 = var11 * var10;
          var13 = -var9 + 640 >> 1;
          var14 = 120;
          var15 = ph.field_m[0].field_q;
          var16 = ph.field_m[0].field_v;
          var18 = -1;
          var19 = -param1 + param4;
          if (param0 > param3) {
            return;
          }
          var17 = param3 - param0;
          if (param4 < var17) {
            return;
          }
          if (var17 < param1) {
            var18 = var17 * 256 / param1;
          }
          if (var19 < var17) {
            var17 = param4 - var17;
            var18 = var17 * 256 / param1;
          }
          if (var18 >= 0) {
            ch.a(var18, -(2 * var15) + var13, -(2 * var16) + var14, var12 + 4 * var16, true, var9 + 4 * var15, ph.field_m);
            tf.field_x.a(var8, var13, var14, var9, var12, 0, -1, var18, 0, 0, 26);
            if (var20 == 0) {
              return;
            }
          }
          hd.a(ph.field_m, var16 * 4 + var12, 4 * var15 + var9, (byte) -66, -(var16 * 2) + var14, var13 - var15 * 2);
          tf.field_x.a(var8, var13, var14, var9, var12, 0, -1, 0, 0, 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var6), "pd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, ka param5) {
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        try {
          var7_int = 0;
          if (param2 != -15318) {
            field_i = (ka) null;
          }
          var8 = 0;
          var9 = 0;
          var10 = 0;
          var11 = 1568 + ak.field_h * 256 - 1;
          var12 = 0;
          var13 = ak.field_h;
          if (!param0) {
            var12 = ub.field_i ? 1 : 0;
            ub.field_i = false;
          }
          var14 = -1;
          if (this.field_e == 10) {
            if (ug.field_p) {
              ug.field_p = false;
              if (rl.field_c >= 0 &&
                6 > rl.field_c) {
                var13 = rl.field_c;
              }
              if (var13 < 0 ||
                var13 >= 6) {
                var13 = 0;
              }
              ah.b(var13, -22081);
            }
            if (0 < fa.field_j) {
              var14 = fa.field_j * 255 / 25;
            }
            if (fa.field_j < 0) {
              var14 = (25 + fa.field_j) * 255 / 25;
            }
          }
          if (!vb.field_q) {
            if (null != ba.field_i) {
              kd.field_m = ba.field_i;
              if (TorChallenge.field_F) {
                ah.b(var13, -22081);
                vb.field_q = true;
              }
            } else {
              ah.b(var13, -22081);
              vb.field_q = true;
            }
          }
          sj.field_N = sj.field_N + 1;
          if (param3) {
            eh.field_n = eh.field_n + qb.field_i;
          }
          if (sj.field_N >= 2048) {
            sj.field_N = 0;
          }
          if (eh.field_n < 0) {
            qb.field_i = 1;
            eh.field_n = 0;
          }
          if (var11 <= eh.field_n) {
            qb.field_i = -1;
            eh.field_n = var11 - 1;
          }
          var7_intLifetime1 = sj.field_N;
          var8Lifetime1 = eh.field_n;
          if (ub.field_i) {
            ub.field_i = false;
          }
          if (param1) {
            kd.field_m.a(false, 18, false, param5, 3, var7_intLifetime1, var8Lifetime1, var9, var10);
          }
          if (param4) {
            kd.field_m.a(false, 18, false, param5, 6, var7_intLifetime1, var8Lifetime1, var9, var10);
          }
          if (var14 >= 0 &&
            var14 < 256) {
            dg.a(var14, true);
          }
          if (!param0) {
            ub.field_i = var12 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_76_0 = var7;
          stackIn_76_1 = new StringBuilder().append("pd.SA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    private final String a(int param0, int param1, byte param2, nf param3) {
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = ak.field_b;
          var6 = (param3.a("10. ") >> 1) + ui.field_i[0].field_q;
          hd.a(ui.field_i, ui.field_i[6].field_v + param0 * param1 + ui.field_i[0].field_v, var6 * 2 + 315, (byte) -81, 123 - ui.field_i[0].field_v, -var6 + 162);
          if (param2 == 6) {
            stackIn_4_0 = var5;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("pd.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, ka[] param6) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param5) {
            this.a((ka) null, (int[]) null, -42, 68, (ge) null, -99, (int[]) null, 94, (ka) null, -113, 77, (int[]) null, (byte) -56, false, 38, 44);
          }
          if (param2 >= 0) {
            ch.a(param2, param1, param4, param0, true, param3, param6);
            if (!TorChallenge.field_F) {
              return;
            }
          }
          hd.a(param6, param0, param3, (byte) 84, param4, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("pd.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void d(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null == lj.field_n) {
            return;
          }
          if (param0) {
            this.field_g = 91;
          }
          var2_int = 0;
          while (var2_int < 3) {
            lj.field_n[var2_int].field_L = 0;
            lj.field_n[var2_int].field_p = ef.field_k;
            lj.field_n[var2_int].field_kb = 0;
            var2_int++;
            if (var3 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.NA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (lg.field_d[param1][17] == 2) {
            return;
          }
          if (lg.field_d[param1][17] == 0) {
            qg.c(0, 0, 25, 2048, 14022908, 10533565);
            qg.c(615, 0, 25, 2048, 14022908, 10533565);
            if (null != kd.field_m) {
              og.a(sj.field_N, eh.field_n, -15516);
            }
            this.a(false, true, -15318, true, true, (ka) null);
          }
          if (lg.field_d[param1][17] == 1) {
            if (-1 != rj.field_g &&
              rj.field_g != 4 &&
              rj.field_g != 5) {
              this.b((byte) 46);
              qg.a();
              if (TorChallenge.field_F) {
                cd.a(-1, -1, true, 119, false);
              }
            } else {
              cd.a(-1, -1, true, 119, false);
            }
          }
          if (param0) {
            this.field_j = -41;
          }
          if (lg.field_d[param1][17] == 3) {
            la.field_f.a(112);
            hd.a(aa.field_k, nk.field_f[3], nk.field_f[2], (byte) 121, nk.field_f[1], nk.field_f[0]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_169_0 = 0;
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
        String var10 = null;
        String[] var11_ref_String__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        int var15_int = 0;
        boolean[][] var15_array = null;
        int var16_int = 0;
        String var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var16_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var11Lifetime2Lifetime2;
        int var11Lifetime2Lifetime3;
        int var11Lifetime2Lifetime4;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var14Lifetime1Lifetime1;
        int var14Lifetime1Lifetime2;
        int var18Lifetime1Lifetime1;
        var21 = TorChallenge.field_F ? 1 : 0;
        try {
          var8 = ag.field_e.field_K + ag.field_e.field_x;
          var9 = (-(ui.field_i[0].field_q * 2) + 557) / 3;
          if (qf.field_e == null) {
            ui.c(-123);
          }
          boolean decompiledFrameCompleted1 = true;
          hd.a(dg.field_J, 298, 640, (byte) -98, 112, 0);
          hd.a(ui.field_i, 262, 557, (byte) -80, 129, 47);
          var5 = 26;
          var10 = oe.field_j[ma.field_j];
          var2_int = ui.field_i[0].field_q + 63;
          var3 = 129 - (-var5 + 6) + (ui.field_i[0].field_v + 8);
          tf.field_x.c(var10, var2_int, var3, 0, -1);
          if (ol.field_b[ma.field_j] != null) {
            var11_ref_String__ = new String[16];
            var12 = ag.field_e.a(ol.field_b[ma.field_j], new int[]{-32 - ui.field_i[2].field_q + (-ui.field_i[0].field_q + 557)}, var11_ref_String__);
            var13 = 0;
            var14 = var3 + (var5 + 4);
            while (var13 < var12) {
              var3 = var14;
              ag.field_e.c(var11_ref_String__[var13], var2_int, var14, 0, -1);
              var14 = var14 + var5 * 2 / 3;
              var13++;
              if (var21 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              var3 = var3 + ag.field_e.field_K;
            }
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var4 = -ui.field_i[0].field_q + 557 + (-ui.field_i[2].field_q - 32);
          var2_intLifetime1 = (525 + (-ui.field_i[0].field_q - ui.field_i[2].field_q)) / 2 + 47 + ui.field_i[0].field_q + 16;
          if (0 == ma.field_j) {
            var3 = -(2 * var5 / 3) + (-ec.field_a[3].field_v + (-ui.field_i[7].field_v + 391 - var3)) / 2 + var3;
            var2_intLifetime1 = -(ec.field_a[3].field_q / 2) + var2_intLifetime1;
            ec.field_a[3].g(var2_intLifetime1, var3);
            var3 = var3 + (ec.field_a[3].field_v + 18 + 4);
            var2_intLifetime1 = ec.field_a[3].field_q / 2 + var2_intLifetime1;
            fc.field_p.a(gh.field_y, var2_intLifetime1, var3, 8015912, -1);
            decompiledFrameRemainder0 = (var21 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ma.field_j == 1) {
              var2_intLifetime1 = ui.field_i[0].field_q + 47;
              var2_intLifetime1 = var2_intLifetime1 + (-64 + var9 >> 1);
              var3 = 4 + var3;
              var11 = 0;
              while (var11 < 3) {
                var6 = 32 + var2_intLifetime1;
                var7 = var8 + 4 + var3 + 96;
                this.a(-1, var3, 0, 0, var2_intLifetime1, 22158, 50, var11);
                var2_intLifetime1 = var2_intLifetime1 + var9;
                fc.field_p.a(me.field_a[var11], var6, var7, 8015912, -1);
                var11++;
                if (var21 != 0) {
                  return;
                }
              }
              decompiledFrameRemainder0 = (var21 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (ma.field_j == 2) {
                var12Lifetime1 = ef.field_k % 800 / 200;
                var13Lifetime1 = ef.field_k % 2400 / 800;
                var14Lifetime1 = nh.field_hb[ma.field_j];
                var13Lifetime1 = (cj.field_j + var13Lifetime1) % var14Lifetime1;
                var16_int = 0;
                while (true) {
                  if (jf.field_ob.length > var16_int) {
                    var2_intLifetime1 = 16 + ui.field_i[0].field_q + 47;
                    var3 = 38 * var16_int + (40 + ui.field_i[0].field_v) + (ag.field_e.field_x + 129) + 16;
                    stackIn_48_0 = var16_int;
                    stackIn_48_1 = var12Lifetime1;
                    if (var21 == 0) {
                      if (stackIn_48_0 == stackIn_48_1) {
                        this.b(50, true);
                      }
                      var11Lifetime1 = ag.field_e.b(p.field_d[0][var16_int], var9, 0);
                      ag.field_e.a(p.field_d[0][var16_int], var2_intLifetime1, var3 - ag.field_e.field_x, var9, var11Lifetime1, 0, -1, 0, 0, 0);
                      if (1 == jf.field_ob[var16_int].length) {
                        var15 = jf.field_ob[var16_int][0];
                      } else if (var13Lifetime1 != 2) {
                        var15 = jf.field_ob[var16_int][0];
                      } else {
                        var15 = jf.field_ob[var16_int][1];
                      }
                      var2_intLifetime1 = ui.field_i[0].field_q + (47 + var9);
                      var3 = 129 + (ag.field_e.field_x + (ui.field_i[0].field_v + 40)) - (-(var16_int * 38) - 14);
                      var11Lifetime1Lifetime1 = ag.field_e.b(var15, var9, 0);
                      ag.field_e.a(var15, var2_intLifetime1, -ag.field_e.field_x + var3, var9, var11Lifetime1Lifetime1, 0, -1, 0, 0, 0);
                      if (var16_int == var12Lifetime1) {
                        this.a(97);
                      }
                      var16_int++;
                      continue;
                    }
                  } else {
                    var16_int = vj.field_c;
                    var3 = ui.field_i[0].field_v + ag.field_e.field_x + 169;
                    vj.field_c = var13Lifetime1;
                    var2_intLifetime1 = -var9 + (-ui.field_i[0].field_q + 604) + (-64 + var9 >> 1);
                    stackIn_48_0 = ef.field_k;
                    stackIn_48_1 = 200;
                  }
                  break;
                }
                var17 = stackIn_48_0 % stackIn_48_1;
                var18 = 0;
                var19 = 0;
                if (0 == var12Lifetime1) {
                  var19 = 1;
                  var18 = 0;
                  if (var17 > 100) {
                    var19 = -1;
                  }
                }
                if (1 == var12Lifetime1) {
                  if (var17 < 100) {
                    var18 = 1;
                    if (var21 != 0) {
                      var18 = 2;
                    }
                  } else {
                    var18 = 2;
                  }
                }
                if (var12Lifetime1 == 2) {
                  var18 = 3;
                }
                if (var12Lifetime1 == 3) {
                  var18 = 0;
                  cl.field_z = true;
                }
                this.a(200, var3, var19, var18, var2_intLifetime1, 22158, 50, var13Lifetime1);
                var3 = 10 + ui.field_i[0].field_v + 129;
                var2_intLifetime1 = -16 - ui.field_i[0].field_q + 604 - 90;
                if (var12Lifetime1 == 3) {
                  cl.field_z = false;
                }
                this.a(var2_intLifetime1, 2, var13Lifetime1, (byte) 13, 50, 1, 0, var3);
                vj.field_c = var16_int;
                decompiledFrameRemainder0 = (var21 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (ma.field_j != 3) {
                  if (ma.field_j == 4) {
                    var11Lifetime2 = ef.field_k % 1050;
                    var12Lifetime1Lifetime1 = var11Lifetime2 % 350;
                    var13Lifetime1Lifetime1 = var11Lifetime2 / 350;
                    var13Lifetime1Lifetime1 = var13Lifetime1Lifetime1 + cj.field_j;
                    var13Lifetime1Lifetime1 = var13Lifetime1Lifetime1 % 3;
                    var14Lifetime1Lifetime1 = var13Lifetime1Lifetime1;
                    var3 = 391 - (ui.field_i[0].field_v + 30);
                    var2_intLifetime1 = (-(ui.field_i[0].field_q * 2) + 557 >> 1) + ui.field_i[0].field_q + 47;
                    var15_int = 0;
                    var16_intLifetime1 = 0;
                    var17Lifetime1 = 0;
                    if (~var13Lifetime1Lifetime1 != ~uk.field_G ||
                      fd.field_h == null) {
                      fd.field_h = new ka(ie.field_f[var13Lifetime1Lifetime1][1].field_q, ie.field_f[var13Lifetime1Lifetime1][1].field_v);
                      ac.field_a = new ka(ie.field_f[var13Lifetime1Lifetime1][1].field_q, ie.field_f[var13Lifetime1Lifetime1][1].field_v);
                      fd.field_h.d();
                      ie.field_f[var13Lifetime1Lifetime1][1].a(0, 0, 0, 47211);
                      la.field_f.a(105);
                      uk.field_G = var13Lifetime1Lifetime1;
                    }
                    var3 = var3 - fd.field_h.field_v;
                    if (var12Lifetime1Lifetime1 >= 100) {
                      var17Lifetime1 = 1;
                      var15_int = 4;
                      var16_intLifetime1 = 100 + (-var12Lifetime1Lifetime1 + 250);
                    }
                    if (var12Lifetime1Lifetime1 < 100 ||
                      var21 != 0) {
                      kj.field_D = 0;
                      var15_int = 4 * var12Lifetime1Lifetime1 / 100;
                    }
                    var2_intLifetime1 = -(fd.field_h.field_q >> 1) + var2_intLifetime1;
                    kj.field_D = be.a(var17Lifetime1 != 0, var15_int, var13Lifetime1Lifetime1, var3, var2_intLifetime1, param0 ^ 19, kj.field_D, var16_intLifetime1);
                    ie.field_f[var13Lifetime1Lifetime1][0].g(var2_intLifetime1, var3);
                    var3 = 10 + (129 + ui.field_i[0].field_v);
                    var2_intLifetime1 = -16 + (604 - ui.field_i[0].field_q - 90);
                    this.a(var2_intLifetime1, 2, var14Lifetime1Lifetime1, (byte) 13, 50, 1, 0, var3);
                    df.field_O = true;
                    decompiledFrameRemainder0 = (var21 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (ma.field_j == 5) {
                      var2_intLifetime1 = ui.field_i[0].field_q + 47;
                      var3 += 8;
                      var11Lifetime2Lifetime1 = var2_intLifetime1;
                      var12Lifetime1Lifetime1 = var3;
                      var13Lifetime1Lifetime1 = -(2 * ui.field_i[0].field_q) + 557;
                      qg.a(pf.field_g);
                      qg.a(var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, 240 + var11Lifetime2Lifetime1, 64 + var12Lifetime1Lifetime1);
                      of.a(var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, (byte) 107, false, 0);
                      var11Lifetime2Lifetime1 += 16;
                      qg.b(pf.field_g);
                      var12Lifetime1Lifetime1 = -ag.field_e.field_K + (af.field_f[3] + (var3 + 8 + var8));
                      ag.field_e.c(sl.field_d[0], var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, 0, -1);
                      var11Lifetime2Lifetime1 = var13Lifetime1Lifetime1 + var2_intLifetime1 - 240;
                      var12Lifetime1Lifetime1 = var3;
                      qg.a(var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, var11Lifetime2Lifetime1 + 240, var12Lifetime1Lifetime1 + 64);
                      var11Lifetime2Lifetime1 = var11Lifetime2Lifetime1 - 400;
                      of.a(var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, (byte) 93, false, 0);
                      qg.b(pf.field_g);
                      var12Lifetime1Lifetime1 = 16 + (var3 + af.field_f[3] + var8 - ag.field_e.field_K);
                      var11Lifetime2Lifetime1 = -50 - nh.field_db[2] + (var13Lifetime1Lifetime1 + var2_intLifetime1);
                      var14Lifetime1Lifetime1 = ag.field_e.b(sl.field_d[1], 220, 0);
                      ag.field_e.a(sl.field_d[1], var11Lifetime2Lifetime1, -ag.field_e.field_x + var12Lifetime1Lifetime1, 220, var14Lifetime1Lifetime1, 0, -1, 0, 0, 0);
                      var12Lifetime1Lifetime1 = -16 + (-ob.field_b[3] + 391 - ui.field_i[0].field_v);
                      var11Lifetime2Lifetime1 = var2_intLifetime1;
                      qg.a(var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, var11Lifetime2Lifetime1 + 360, ob.field_b[3] + (var12Lifetime1Lifetime1 + 16));
                      var12Lifetime1Lifetime1 = 16 + ob.field_b[3] + (-480 + var12Lifetime1Lifetime1);
                      of.a(var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, (byte) 80, false, 0);
                      var11Lifetime2Lifetime1 = var2_intLifetime1 + 16;
                      qg.b(pf.field_g);
                      var12Lifetime1Lifetime1 = ag.field_e.field_x + (-(var8 * 3) + (-16 - ui.field_i[0].field_v)) + (391 - ob.field_b[3]);
                      var14Lifetime1Lifetime1 = ag.field_e.b(sl.field_d[2], 240, 0);
                      ag.field_e.a(sl.field_d[2], var11Lifetime2Lifetime1, var12Lifetime1Lifetime1 - ag.field_e.field_x, 240, var14Lifetime1Lifetime1, 0, -1, 0, 0, 0);
                      var11Lifetime2Lifetime1 = var2_intLifetime1 + oj.field_e[0];
                      var12Lifetime1Lifetime1 = ag.field_e.field_x - var8 + (391 + (-ui.field_i[0].field_v - ob.field_b[3] - 16));
                      ag.field_e.c(sl.field_d[3], var11Lifetime2Lifetime1, var12Lifetime1Lifetime1, 0, -1);
                      df.field_O = true;
                      decompiledFrameRemainder0 = (var21 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (ma.field_j == 6) {
                        var11Lifetime2Lifetime2 = var3;
                        var12Lifetime1Lifetime1 = ui.field_i[0].field_q + 63;
                        var2_intLifetime1 = (-dk.field_c[0][0].field_q + var4 / 4) / 2 + var12Lifetime1Lifetime1;
                        var3 = 16 + (var3 + (-dk.field_c[0][0].field_v + dk.field_c[3][0].field_v) / 2);
                        dk.field_c[0][0].g(var2_intLifetime1, var3);
                        var6Lifetime1 = var4 / 8 + var12Lifetime1Lifetime1;
                        var7Lifetime1 = -ag.field_e.field_K + dk.field_c[3][0].field_v + (var3 + (4 + var8));
                        fc.field_p.a(k.field_a[0], var6Lifetime1, var7Lifetime1, 8015912, -1);
                        var3 = 16 + var11Lifetime2Lifetime2 + (-dk.field_c[1][0].field_v + dk.field_c[3][0].field_v) / 2;
                        var2_intLifetime1 = (var4 / 4 - dk.field_c[1][0].field_q) / 2 + (var4 / 4 + var12Lifetime1Lifetime1);
                        var6Lifetime1 = var4 / 8 + var12Lifetime1Lifetime1 + var4 / 4;
                        dk.field_c[1][0].g(var2_intLifetime1, var3);
                        fc.field_p.a(k.field_a[1], var6Lifetime1, var7Lifetime1, 8015912, -1);
                        var3 = 16 + (var11Lifetime2Lifetime2 + (dk.field_c[3][0].field_v - dk.field_c[2][0].field_v) / 2);
                        var2_intLifetime1 = (-dk.field_c[2][0].field_q + var4 / 4) / 2 + (var12Lifetime1Lifetime1 + var4 / 2);
                        var6Lifetime1 = var4 / 8 + (var12Lifetime1Lifetime1 + var4 / 2);
                        dk.field_c[2][0].g(var2_intLifetime1, var3);
                        fc.field_p.a(k.field_a[2], var6Lifetime1, var7Lifetime1, 8015912, -1);
                        var2_intLifetime1 = 3 * var4 / 4 + (var12Lifetime1Lifetime1 + (var4 / 4 - dk.field_c[3][0].field_q) / 2);
                        var3 = var11Lifetime2Lifetime2 + (16 + (dk.field_c[3][0].field_v - dk.field_c[3][0].field_v) / 2);
                        var6Lifetime1 = var12Lifetime1Lifetime1 + var4 * 3 / 4 + var4 / 8;
                        dk.field_c[3][0].g(var2_intLifetime1, var3);
                        fc.field_p.a(k.field_a[3], var6Lifetime1, var7Lifetime1, 8015912, -1);
                        decompiledFrameRemainder0 = (var21 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (ma.field_j == 7) {
                          var2_intLifetime1 = (-ec.field_a[0].field_q + var4 / 2) / 2 + (-(var4 / 2) + var2_intLifetime1 - ec.field_a[0].field_q / 2);
                          var3 = 16 + var3;
                          ec.field_a[0].g(var2_intLifetime1, var3);
                          var6Lifetime1Lifetime1 = 8 + (var2_intLifetime1 + ec.field_a[0].field_q);
                          var7Lifetime1Lifetime1 = ag.field_e.field_x + ((ec.field_a[0].field_x - var8) / 2 + var3);
                          fc.field_p.c(kl.field_d[0], var6Lifetime1Lifetime1, var7Lifetime1Lifetime1, 8015912, -1);
                          var3 = -ec.field_a[1].field_v + (-ec.field_a[1].field_x + ec.field_a[1].field_v) / 2 - 2 + (var3 + ec.field_a[0].field_v / 2);
                          var2_intLifetime1 = 32 + var4 / 2 + (16 + (ui.field_i[0].field_q + 47) - (-ec.field_a[1].field_u + ec.field_a[1].field_q) / 2);
                          if (kf.field_b == 3) {
                            var2_intLifetime1 += 15;
                          }
                          var11Lifetime2Lifetime3 = 0;
                          while (2 > var11Lifetime2Lifetime3) {
                            stackIn_169_0 = 0;
                            if (var21 != 0) {
                              decompiledFrameCompleted0 = false;
                              break;
                            }
                            var12Lifetime1Lifetime1 = stackIn_169_0;
                            while (var12Lifetime1Lifetime1 < 5) {
                              ec.field_a[1].g(var2_intLifetime1 + var12Lifetime1Lifetime1 * 30, var3);
                              var12Lifetime1Lifetime1++;
                            }
                            var3 = var3 + (ec.field_a[1].field_x + 4);
                            var11Lifetime2Lifetime3++;
                          }
                          if (decompiledFrameCompleted0) {
                            decompiledFrameRemainder0 = (var21 != 0);
                          }
                        }
                        if ((decompiledFrameRemainder0) &&
                          (decompiledFrameCompleted0)) {
                          if (ma.field_j == 8) {
                            var2_intLifetime1 = 16 + (47 + ui.field_i[0].field_q);
                            var3 = 16 + var3;
                            var6Lifetime1Lifetime2 = (var4 / 4 - ec.field_a[6].field_q) / 2 + (var4 / 4 + var2_intLifetime1 - 16);
                            ec.field_a[6].g(var6Lifetime1Lifetime2, var3);
                            var7Lifetime1Lifetime2 = ag.field_e.field_x + 8 + (ec.field_a[6].field_v + var3);
                            var6Lifetime1Lifetime2 = ec.field_a[6].field_v / 2 + var6Lifetime1Lifetime2;
                            fc.field_p.a(kl.field_d[1], var6Lifetime1Lifetime2, var7Lifetime1Lifetime2, 8015912, -1);
                            var6Lifetime1Lifetime2 = (-ec.field_a[7 + ok.field_b].field_q + var4 / 4) / 2 + var4 / 2 + (var2_intLifetime1 + 16);
                            ec.field_a[7 + ok.field_b].g(var6Lifetime1Lifetime2, var3);
                            var6Lifetime1Lifetime2 = var6Lifetime1Lifetime2 + ec.field_a[7 + ok.field_b].field_v / 2;
                            fc.field_p.a(kl.field_d[2], var6Lifetime1Lifetime2, var7Lifetime1Lifetime2, 8015912, -1);
                            decompiledFrameRemainder0 = (var21 != 0);
                          }
                          if ((decompiledFrameRemainder0) &&
                            (decompiledFrameRemainder0 = (9 == ma.field_j))) {
                            var2_intLifetime1 = ui.field_i[0].field_q + 63;
                            var6Lifetime1Lifetime2 = (-ec.field_a[5].field_q + var4) / 2 + var2_intLifetime1;
                            var3 = var3 + 16;
                            ec.field_a[5].g(var6Lifetime1Lifetime2, var3);
                            var6Lifetime1Lifetime2 = var6Lifetime1Lifetime2 + ec.field_a[5].field_q / 2;
                            var7Lifetime1Lifetime2 = 8 + (var3 + ec.field_a[5].field_v + ag.field_e.field_x);
                            fc.field_p.a(kl.field_d[3], var6Lifetime1Lifetime2, var7Lifetime1Lifetime2, 8015912, -1);
                            var11Lifetime2Lifetime4 = ef.field_k % 240;
                            if (119 <= var11Lifetime2Lifetime4) {
                              var6Lifetime1Lifetime2 = var4 / 2 + var2_intLifetime1;
                              var7Lifetime1Lifetime2 = var3 + ph.field_m[1].field_v;
                              if (cd.field_c != 30) {
                                hf.$cfr$intArgs$a$759f676cf37b(-73, true, cd.field_c, ci.field_q, gf.field_v, false);
                              }
                              ic.$cfr$intArgs$a$ceabca3815d0(ec.field_a[5].field_v / 2 + var7Lifetime1Lifetime2, cd.field_c, var6Lifetime1Lifetime2, var4, gf.field_v, gf.field_v, 127, true);
                            }
                            if (119 > var11Lifetime2Lifetime4 ||
                              var21 != 0) {
                              gf.field_v = kl.field_f;
                              ci.field_q = gh.field_y;
                              cd.field_c = 1;
                            }
                            decompiledFrameRemainder0 = (var21 != 0);
                          }
                        }
                      }
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameCompleted0)) {
                  var11Lifetime3 = this.a((byte) 37);
                  var12Lifetime1Lifetime2 = this.b(cj.field_j, (byte) 25);
                  var13Lifetime1Lifetime2 = this.a(0, var11Lifetime3, (byte) -27, var12Lifetime1Lifetime2);
                  var14Lifetime1Lifetime2 = this.a(1, var11Lifetime3, (byte) -27, var12Lifetime1Lifetime2);
                  var15_array = hl.field_c;
                  var19Lifetime1 = 0;
                  while (true) {
                    if (p.field_c.length > var19Lifetime1) {
                      var3 = 16 + (var19Lifetime1 * 38 + ui.field_i[0].field_v + 129 + (ag.field_e.field_x + 40));
                      var2_intLifetime1 = 47 - (-ui.field_i[0].field_q - 16);
                      stackIn_155_0 = ~var14Lifetime1Lifetime2;
                      stackIn_155_1 = ~var19Lifetime1;
                      if (var21 == 0) {
                        if (stackIn_155_0 != stackIn_155_1) {
                          if (!var15_array[var19Lifetime1][var13Lifetime1Lifetime2]) {
                            this.d((byte) 93);
                          }
                        } else {
                          this.b(50, true);
                        }
                        var18Lifetime1 = ag.field_e.b(p.field_d[1][var19Lifetime1], var9, 0);
                        ag.field_e.a(p.field_d[1][var19Lifetime1], var2_intLifetime1, -ag.field_e.field_x + var3, var9, var18Lifetime1, 0, -1, 0, 0, 0);
                        if (var15_array[var19Lifetime1][var13Lifetime1Lifetime2]) {
                          if (p.field_c[var19Lifetime1].length != 1) {
                            var16 = p.field_c[var19Lifetime1][0] + p.field_c[var19Lifetime1][1];
                          } else {
                            var16 = p.field_c[var19Lifetime1][0];
                          }
                          var17Lifetime2 = 0;
                        } else {
                          var17Lifetime2 = 16711680;
                          var16 = p.field_c[var19Lifetime1][0] + di.field_B;
                        }
                        var3 = 14 + var19Lifetime1 * 38 + (40 + ag.field_e.field_x) + 129 + ui.field_i[0].field_v;
                        var2_intLifetime1 = var9 + (ui.field_i[0].field_q + 47);
                        var18Lifetime1Lifetime1 = ag.field_e.b(var16, var9, 0);
                        ag.field_e.a(var16, var2_intLifetime1, var3 - ag.field_e.field_x, var9, var18Lifetime1Lifetime1, var17Lifetime2, -1, 0, 0, 0);
                        if (~var14Lifetime1Lifetime2 == ~var19Lifetime1 ||
                          !var15_array[var19Lifetime1][var13Lifetime1Lifetime2]) {
                          this.a(param0 - 71);
                        }
                        var19Lifetime1++;
                        continue;
                      }
                    } else {
                      var19Lifetime1 = vj.field_c;
                      vj.field_c = var13Lifetime1Lifetime2;
                      var2_intLifetime1 = (-64 + var9 >> 1) + 604 - (ui.field_i[0].field_q + var9);
                      stackIn_155_0 = 40 + ui.field_i[0].field_v + 129;
                      stackIn_155_1 = -ag.field_e.field_x;
                    }
                    break;
                  }
                  var3 = stackIn_155_0 - stackIn_155_1;
                  var20 = 0;
                  if (var14Lifetime1Lifetime2 == 0) {
                    var20 = 10;
                  }
                  if (var14Lifetime1Lifetime2 == 1) {
                    var20 = 9;
                  }
                  if (var14Lifetime1Lifetime2 == 2) {
                    var20 = 7;
                  }
                  if (3 == var14Lifetime1Lifetime2) {
                    var20 = 6;
                  }
                  this.a(200, var3, 0, var20, var2_intLifetime1, param0 + 22148, 50, var13Lifetime1Lifetime2);
                  var2_intLifetime1 = -16 + (-ui.field_i[0].field_q + 514);
                  var3 = 10 + (ui.field_i[0].field_v + 129);
                  this.a(var2_intLifetime1, 2, var13Lifetime1Lifetime2, (byte) 13, 50, 1, 0, var3);
                  vj.field_c = var19Lifetime1;
                }
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var3 = -8 - ui.field_i[0].field_v + (391 + (-var8 + ag.field_e.field_x));
            stackIn_169_0 = 588 - ui.field_i[0].field_q;
          }
          var2_intLifetime2 = stackIn_169_0;
          ag.field_e.b(gj.a(param0, (byte) -123, 1 + ma.field_j), var2_intLifetime2, var3, 0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.U(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2, ka param3) {
        String[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        String[] stackIn_27_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[][] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        ka[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        eg var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var20Lifetime1;
        var25 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = this.a(param1, (byte) -109);
          var6 = this.a(-111, param1);
          var7 = ef.field_j[0];
          var8 = ef.field_j[1];
          var9 = lg.field_d;
          if (kf.field_b == 1 &&
            null != fl.field_t[this.field_e]) {
            var9 = fl.field_t;
          }
          if (kf.field_b == 3 &&
            wj.field_c[this.field_e] != null) {
            var9 = wj.field_c;
          }
          var10 = ia.field_p[this.field_e][param1];
          var11 = we.field_c[var10][0];
          if (var10 == 31) {
            stackIn_19_0 = we.field_c[var10];
            if (!bl.field_U) {
              stackIn_20_1 = 1;
            } else {
              stackIn_20_1 = 0;
            }
            var11 = stackIn_19_0[stackIn_20_1];
          }
          if (20 == var10) {
            stackIn_27_0 = we.field_c[var10];
            if (this.field_e != 0) {
              stackIn_28_1 = 1;
            } else {
              stackIn_28_1 = 0;
            }
            var11 = stackIn_27_0[stackIn_28_1];
          }
          if (var10 == 5 &&
            this.field_e == 9) {
            var11 = we.field_c[20][1];
          }
          if (var11 == null) {
            var11 = oh.field_a;
          }
          var12 = var9[this.field_e][7];
          if (2 == this.field_e &&
            !d.p(-117)) {
            var12 = 180;
          }
          var13 = var9[this.field_e][8];
          var14 = ba.field_b;
          if (~ll.field_b != ~this.field_e) {
            ll.field_b = this.field_e;
            rj.a(2, this.field_e, var13, var14, var12);
          }
          if (param3 != null) {
            param3.d();
          }
          if (param0 >= -87) {
            this.field_b = 92;
          }
          var15 = var7 - var12 >> 1;
          var16 = var8 - var13 >> 1;
          de.field_a.g(-var15 + var6, -var16 + var5_int);
          var17 = 0;
          if (param2) {
            var17 = 1;
          }
          if (8 <= var10 &&
            var10 <= 10 &&
            tj.field_b == param1) {
            var17 = 1;
          }
          var18 = lg.field_d[this.field_e][20];
          if (var18 >= 0) {
            var18 = lg.field_d[cf.field_b][20];
          }
          if (var18 >= 0 &&
            pk.field_f &&
            ~this.field_e != ~cf.field_b) {
            var17 = 0;
          }
          var19 = tf.field_x;
          var20 = var19.field_x;
          var20Lifetime1 = 18;
          var21 = -var20Lifetime1 - ba.field_b[6].field_x + (-ba.field_b[0].field_x + var13) - var19.field_K;
          if (12 == var10 ||
            var10 == 13) {
            var22 = ee.field_s + 137;
            var23 = var6 + (-var22 + var12 >> 1);
            var19.c(var11, var23, (var21 >> 1) + var20Lifetime1 + (var5_int + ba.field_b[0].field_x), var17, -1);
            var23 = var23 + (8 + ee.field_s);
            qg.b(var23, var5_int + (var13 / 2 - 1), 129, 2, var17);
            if (var10 != 12) {
              stackIn_80_0 = nk.field_h;
            } else {
              stackIn_80_0 = sh.field_r;
            }
            var24 = stackIn_80_0;
            var24 = var24 * 128;
            if (var10 != 12) {
              var24 = var24 / 220;
            }
            if (var10 == 12 ||
              var25 != 0) {
              var24 = var24 / 256;
            }
            dh.field_Y.g(-1 + var23 + var24, -2 + (dh.field_Y.field_v >> 1) + var5_int);
            if (var25 == 0) {
              return;
            }
          }
          var19.a(var11, var6 + (var12 >> 1), (var21 >> 1) + (var20Lifetime1 + var5_int + ba.field_b[0].field_x), var17, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_90_0 = var5;
          stackIn_90_1 = new StringBuilder().append("pd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(')').toString());
        }
    }

    private final int b(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        boolean[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = s.field_q.length;
          if (param1 != 25) {
            field_f = (int[]) null;
          }
          var4 = 200;
          var5 = hl.field_c;
          var6 = 0;
          var7 = 0;
          while (true) {
            stackIn_6_0 = 3;
            if (stackIn_6_0 > var7) {
              stackIn_24_0 = var7;
              if (var9 == 0) {
                if (stackIn_24_0 == param0) {
                  stackIn_14_0 = var6;
                  return stackIn_14_0;
                }
                var8 = 0;
                while (var3_int > var8) {
                  stackOut_17_0 = var5[var8][var7];
                  stackIn_6_0 = stackOut_17_0 ? 1 : 0;
                  stackIn_18_0 = stackOut_17_0;
                  if (stackIn_18_0) {
                    var6 = var6 + var4;
                  }
                  var8++;
                }
                var7++;
                continue;
              }
            } else {
              stackIn_24_0 = -1;
            }
            return stackIn_24_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        String stackIn_76_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ae var5_ref_ae = null;
        int var6 = 0;
        String[][] var6_ref_String____ = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14_ref_String = null;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        String var2Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          var3 = 2 + ag.field_e.field_K + ag.field_e.field_x;
          var4 = 13;
          if (d.p(-91)) {
            var5 = (ag.field_e.a("10. ") >> 1) + ui.field_i[0].field_q;
            hd.a(ui.field_i, var3 * var4 + (ui.field_i[0].field_v + ui.field_i[6].field_v), var5 * 2 + 315, (byte) 61, -ui.field_i[0].field_v + 123, -var5 + 162);
            var2 = vf.field_c;
            decompiledFrameRemainder1 = (var17 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (rc.field_r == null) {
              rc.field_r = dh.a(31, 10, (byte) -69, 1, 3);
            }
            var5_ref_ae = rc.field_r;
            if (!var5_ref_ae.field_n) {
              var2 = lh.field_y;
              var6 = (ag.field_e.a("10. ") >> 1) + ui.field_i[0].field_q;
              hd.a(ui.field_i, ui.field_i[6].field_v + ui.field_i[0].field_v + var4 * var3, 2 * var6 + 315, (byte) -110, 123 - ui.field_i[0].field_v, -var6 + 162);
              decompiledFrameRemainder1 = (var17 != 0);
            }
            if (decompiledFrameRemainder1) {
              boolean decompiledFrameRemainder0 = true;
              var6_ref_String____ = var5_ref_ae.field_i;
              var7 = var5_ref_ae.field_l;
              var8 = tj.field_b;
              if (var6_ref_String____ == null) {
                var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                decompiledFrameRemainder0 = (var17 != 0);
              }
              if (decompiledFrameRemainder0) {
                boolean decompiledSharedTail0 = (!(var8 < 0) &&
                  !(var8 >= var6_ref_String____.length));
                if (!decompiledSharedTail0) {
                  var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                  decompiledSharedTail0 = (var17 != 0);
                }
                if ((decompiledSharedTail0) &&
                  (null == var6_ref_String____[var8])) {
                  var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                }
              }
              if (var7 == null) {
                var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                decompiledFrameRemainder1 = (var17 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (0 > var8 ||
                  var7.length <= var8) {
                  var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                  decompiledFrameRemainder1 = (var17 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (var7[var8] != null) {
                    var2 = vf.field_c;
                    var9 = bg.a(var8, kf.field_a, 21179, var5_ref_ae);
                    var10 = ag.field_e.a("10. ") >> 1;
                    var11 = (ag.field_e.a("10. ") >> 1) + ui.field_i[0].field_q;
                    hd.a(ui.field_i, ui.field_i[6].field_v + ui.field_i[0].field_v + var3 * var4, 2 * var11 + 315, (byte) 113, 123 - ui.field_i[0].field_v, -var11 + 162);
                    var12 = ag.field_e.field_x + 123;
                    var13 = 0;
                    while (var13 < 10) {
                      stackIn_69_0 = ~var6_ref_String____[var8].length;
                      stackIn_69_1 = ~var13;
                      if (var17 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_69_0 < stackIn_69_1 && (var13 < var7[var8].length ||
                        var17 != 0)) {
                        var14_ref_String = var6_ref_String____[var8][var13];
                        var15_int = var7[var8][var13];
                        if (null != var14_ref_String) {
                          var2 = "";
                          var16 = 6488064;
                          if (var9 == var13) {
                            var16 = 16711680;
                          }
                          ag.field_e.b(var13 + 1 + ". ", 162 + var10, var12, var16, -1);
                          ag.field_e.c(var14_ref_String, var10 + 162, var12, var16, -1);
                          ag.field_e.b(Integer.toString(var15_int), 477, var12, var16, -1);
                          var12 = var12 + var3;
                        }
                      }
                      var13++;
                    }
                    if (decompiledFrameCompleted0) {
                      var13Lifetime1 = 10;
                      if (ji.field_m != null &&
                        var9 == -1) {
                        var12Lifetime1 = var13Lifetime1 * var3 + (ag.field_e.field_x + 123);
                        var14 = 16711680;
                        var15 = mf.field_a;
                        if (null != var15) {
                          ag.field_e.c(var15, 162 + var10, var12Lifetime1, var14, -1);
                        }
                        ag.field_e.b(Integer.toString(tf.field_o), 477, var12Lifetime1, var14, -1);
                      }
                      if (var17 != 0) {
                        var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                      }
                    }
                  } else {
                    var2 = this.a(var4, var3, (byte) 6, ag.field_e);
                  }
                }
              }
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_69_0 = 10 * var3 / 2 + 123;
            stackIn_69_1 = -ag.field_e.field_x;
          }
          var5Lifetime1 = stackIn_69_0 - stackIn_69_1;
          var6Lifetime1 = 6488064;
          if (param0 < 22) {
            this.field_b = 122;
          }
          ag.field_e.a(var2, 320, var5Lifetime1, var6Lifetime1, -1);
          if (!d.p(-107)) {
            stackIn_76_0 = e.field_j;
          } else {
            stackIn_76_0 = gb.field_e;
          }
          var2Lifetime1 = stackIn_76_0;
          ag.field_e.a(var2Lifetime1, 320, ag.field_e.field_x + (123 + var3 * (-1 + var4)), 6488064, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "pd.LA(" + param0 + ')');
        }
    }

    private final void a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 103 / ((param0 - 20) / 59);
          while (var2_int < qf.field_e.length) {
            boolean decompiledFrameCompleted0 = true;
            if (var2_int == 0 ||
              var2_int == 5 ||
              var5 != 0) {
              var4 = 0;
              while (!(qf.field_e[var2_int].field_l.length <= var4)) {
                qf.field_e[var2_int].field_l[var4] = e.field_p[var2_int][var4];
                var4++;
                if (var5 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var2_int++;
            }
            if (var5 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.BB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          stackIn_5_0 = (gl.field_g[param3] != 0) ? 0 : 1;
          var8_int = stackIn_5_0;
          if (var8_int != 0) {
            return;
          }
          var9 = gl.field_g[param3];
          var10 = -1;
          if (var9 != 1) {
            if (var9 == 2) {
              if (param2 <= param1) {
                var10 = 0;
              }
              if ((!(param2 <= param1) ||
                var12 != 0) &&
                (!(param1 <= param2 - param4)) &&
                (!(param1 >= param2))) {
                var10 = 256 * (param2 - param1) / param4;
                if (var12 != 0) {
                  if (param1 <= 0) {
                    var10 = 0;
                    if (var12 != 0 && (param1 > 0 &&
                      param1 < param4)) {
                      var10 = 256 * param1 / param4;
                    }
                  } else {
                    if (param1 > 0 &&
                      param1 < param4) {
                      var10 = 256 * param1 / param4;
                    }
                  }
                }
              }}
          } else {
            if (param1 <= 0) {
              var10 = 0;
              if (var12 != 0 && (param1 > 0 &&
                param1 < param4)) {
                var10 = 256 * param1 / param4;
              }
            } else {
              if (param1 > 0 &&
                param1 < param4) {
                var10 = 256 * param1 / param4;
              }
            }
          }
          var11 = param0;
          if (ea.field_e - 6 >= 0) {
            var11 = 1;
          }
          cd.a(var10, var11, param6, 126, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var8), "pd.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param5 != 22158) {
            return;
          }
          this.c(false);
          var9_int = ef.field_k % param0;
          var10 = ja.a((byte) 107, param3) ? 1 : 0;
          stackIn_7_0 = (lj.field_n[param7].field_L != 17) ? 0 : 1;
          var11 = stackIn_7_0;
          var12 = bd.field_l ? 1 : 0;
          bd.field_l = false;
          vj.field_c = param7;
          if (var11 != 0 &&
            var9_int < 15) {
            var11 = 0;
            lj.field_n[param7].field_p = ef.field_k;
          }
          if (param3 == 10 &&
            var11 == 0) {
            lj.field_n[param7].field_L = param3;
          }
          if (param3 != 10 ||
            var11 != 0 || var15 != 0) {
            if (9 != param3 ||
              var11 != 0) {
              if (param3 != 7 ||
                var11 != 0) {
                if (6 != param3 ||
                  3 == lj.field_n[param7].field_L ||
                  4 == param3) {
                  if ((var10 == 0) &&
                    (var11 == 0)) {
                    lj.field_n[param7].field_L = param3;
                    if (var15 != 0) {
                      lj.field_n[param7].field_L = param3;
                      lj.field_n[param7].field_L = param3;
                      lj.field_n[param7].field_L = param3;
                    }
                  }
                } else {
                  lj.field_n[param7].field_L = param3;
                  if (var15 != 0) {
                    lj.field_n[param7].field_L = param3;
                    lj.field_n[param7].field_L = param3;
                  }
                }
              } else {
                lj.field_n[param7].field_L = param3;
                if (var15 != 0) {
                  lj.field_n[param7].field_L = param3;
                }
              }
            } else {
              lj.field_n[param7].field_L = param3;
            }
          }
          lj.field_n[param7].field_Q = param2;
          lj.field_n[param7].field_h = 0;
          lj.field_n[param7].field_a = 1;
          if (param2 < 0) {
            lj.field_n[param7].field_a = -1;
          }
          if (param3 == 2 &&
            param0 * 3 >> 2 < var9_int) {
            lj.field_n[param7].field_L = 0;
            lj.field_n[param7].field_eb = true;
          }
          if (param3 != 2 ||
            param0 * 3 >> 2 >= var9_int || var15 != 0) {
            lj.field_n[param7].field_eb = false;
          }
          if (var11 == 0) {
            lj.field_n[param7].b(false, false);
          }
          var13 = -1;
          if (param0 > 0) {
            var14 = param6 >> 1;
            if (var9_int < var14) {
              var13 = 255 * var9_int / var14;
            }
            if (param0 - var14 < var9_int) {
              var13 = -(255 * (var9_int + var14 - param0) / (var14 - 10)) + 255;
              if (0 > var13) {
                var13 = 0;
              }
            }
          }
          if (var13 >= 0) {
            if (var10 != 0) {
              this.a((byte) 42, lj.field_n[param7].field_I, 0, lj.field_n[param7].field_w, param7, false, 16);
            }
            if (var10 == 0 ||
              var15 != 0) {
              lj.field_n[param7].a(jj.field_a[param7], 32, 128, (int[]) null, 0, -20861, 64, 0);
            }
            la.field_f.a(-74);
            param1 = -32 + param1;
            param4 = param4 - (jj.field_a[param7].field_q - lj.field_n[param7].field_I >> 1);
            if (0 > lj.field_n[param7].field_a) {
              param4 += 16;
            }
            jj.field_a[param7].d(param4, param1, var13);
            if (var15 != 0) {
              if (var10 == 0) {
                lj.field_n[param7].a((ka) null, param1, lj.field_n[param7].field_I + param4, (int[]) null, 0, -20861, param4, 0);
                this.a((byte) 42, lj.field_n[param7].field_I, param4, lj.field_n[param7].field_w, param7, true, 16 + param1);
              } else {
                this.a((byte) 42, lj.field_n[param7].field_I, param4, lj.field_n[param7].field_w, param7, true, 16 + param1);
              }
            }
          } else {
            boolean decompiledSharedTail0 = (var10 != 0);
            if (!decompiledSharedTail0) {
              lj.field_n[param7].a((ka) null, param1, lj.field_n[param7].field_I + param4, (int[]) null, 0, -20861, param4, 0);
              decompiledSharedTail0 = (var15 != 0);
            }
            if (decompiledSharedTail0) {
              this.a((byte) 42, lj.field_n[param7].field_I, param4, lj.field_n[param7].field_w, param7, true, 16 + param1);
            }
          }
          vj.field_c = ok.field_b;
          bd.field_l = var12 != 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var9), "pd.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void a(ka param0, int param1, int param2, boolean param3, int param4, ge param5) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var7_int = ef.field_k % param4;
          if (param3) {
            return;
          }
          var8 = -1;
          var9 = param4 >> 1;
          if (var7_int < var9) {
            var8 = var7_int * 255 / var9;
          }
          if (var9 < var7_int) {
            var8 = 255 - 255 * (-var9 + var7_int) / var9;
          }
          if (0 > var8) {
            if (param5 != null) {
              param5.a(param2, param1);
              if (var10 == 0) {
                return;
              }
            }
            param0.g(param2, param1);
            if (var10 == 0) {
              return;
            }
          }
          if (null != param5) {
            param5.a(param2, param1, var8, 16777215);
            if (var10 == 0) {
              return;
            }
          }
          param0.a(param2, param1, var8, 16777215);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("pd.I(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final int a(int param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e == 2 &&
            !d.p(-86)) {
            if (param0 >= 3) {
              stackIn_10_0 = il.field_q[this.field_e] + ea.field_d[this.field_e];
              return stackIn_10_0;
            }
            stackIn_8_0 = il.field_q[this.field_e];
            return stackIn_8_0;
          }
          var3_int = lg.field_d[this.field_e][0];
          if (var3_int == 1) {
            stackIn_13_0 = il.field_q[this.field_e];
            return stackIn_13_0;
          }
          if (0 == var3_int) {
            stackIn_16_0 = ea.field_d[this.field_e] * param0 + il.field_q[this.field_e];
            return stackIn_16_0;
          }
          if (param1 > -13) {
            field_f = (int[]) null;
          }
          stackIn_21_0 = il.field_q[this.field_e];
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.MA(" + param0 + ',' + param1 + ')');
        }
    }

    pd(int param0, TorChallenge param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = -1;
        this.field_b = -1;
        try {
          this.field_e = param0;
          this.field_k = new rl(ia.field_p[param0].length);
          be.field_e = param1;
          if (param0 == 8) {
            ok.field_b = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("pd.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != -29802) {
            this.field_g = 73;
          }
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(ia.field_p[this.field_e].length > var4_int)))) {
            var5 = this.a(var4_int, (byte) -14);
            stackOut_6_0 = this.c(var4_int, (byte) 90);
            stackIn_26_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var9 == 0) {
              if (stackIn_7_0 &&
                param2 >= this.a(-89, var4_int) &&
                param2 < this.b(var4_int, 5826) &&
                var5 <= param1 &&
                param1 < (var5 + this.c(8, var4_int))) {
                stackIn_23_0 = var4_int;
                return stackIn_23_0;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_26_0 = this.field_e;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_26_0 == 8) {
            var8 = 0;
            while (var8 < 3) {
              var4_intLifetime1 = bg.field_I[var8][0];
              var7 = bg.field_I[var8][3];
              var5Lifetime1 = bg.field_I[var8][1];
              var6 = bg.field_I[var8][2];
              stackIn_48_0 = ~var4_intLifetime1;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_48_0 > ~param2 &&
                (var4_intLifetime1 + var6) > param2 &&
                param1 > var5Lifetime1 &&
                var5Lifetime1 + var7 > param1) {
                stackIn_45_0 = var8;
                return stackIn_45_0;
              }
              var8++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_48_0 = -1;
          }
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "pd.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 == this.field_e &&
            !d.p(-73)) {
            if (param1 >= 3) {
              stackIn_10_0 = 228;
              return stackIn_10_0;
            }
            stackIn_8_0 = 28 + 200 * param1;
            return stackIn_8_0;
          }
          var4 = 99 % ((-49 - param0) / 33);
          var3_int = lg.field_d[this.field_e][0];
          if (1 == var3_int) {
            var5 = lg.field_d[this.field_e][7] + lg.field_d[this.field_e][5];
            stackIn_13_0 = ne.field_b[this.field_e] + var5 * param1;
            return stackIn_13_0;
          }
          if (var3_int == 0) {
            stackIn_18_0 = ne.field_b[this.field_e];
            return stackIn_18_0;
          }
          stackIn_20_0 = ne.field_b[this.field_e];
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "pd.OA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(byte param0) {
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
        int var3Lifetime1;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = 112;
          if (param0 < 68) {
            return;
          }
          var7 = 0;
          while (var7 < qf.field_e.length) {
            boolean decompiledFrameCompleted0 = true;
            if (var7 == 0 ||
              var7 == 5 ||
              var9 != 0) {
              var8 = 0;
              while (!(var8 >= qf.field_e[var7].field_l.length)) {
                var3 = qf.field_e[var7].field_l[var8];
                var4 = (var3 & 16711680) >>> 16;
                var6 = 255 & var3;
                var5 = 255 & var3 >>> 8;
                var5 = var5 * var2_int >>> 8;
                var6 = var2_int * var6 >>> 8;
                var4 = var2_int * var4 >>> 8;
                var4 = 16774972 & var4 << 16;
                var6 = var6 & 255;
                var5 = (var5 & -1962934017) << 8;
                var3Lifetime1 = var6 | (var4 | var5);
                qf.field_e[var7].field_l[var8] = var3Lifetime1;
                var8++;
                if (var9 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var7++;
            }
            if (var9 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.N(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          jj.field_c = 0;
          eh.field_l = 0;
          wc.field_g.a(-14341);
          kj.field_B.a(-14341);
          if (hf.field_d != null) {
            var2_int = 0;
            while (!(var2_int >= hf.field_d.length)) {
              hf.field_d[var2_int] = (byte) 0;
              var2_int++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            vi.field_a = 0;
          }
          var2_intLifetime1 = 0;
          L3: while (true) {
            if (var2_intLifetime1 < 3) {
              stackIn_21_0 = 0;
              if (var4 != 0) {
                break L3;
              }
              var3 = stackIn_21_0;
              while (var3 < 6) {
                pi.field_d[var2_intLifetime1][var3] = 0;
                var3++;
              }
              k.field_b[var2_intLifetime1] = 0;
              hk.field_c[var2_intLifetime1] = 0;
              var2_intLifetime1++;
              continue L3;
            }
            bj.a((byte) 71);
            ab.field_d = 1;
            tf.field_o = 0;
            stackIn_21_0 = param0;
            break;
          }
          if (stackIn_21_0 >= -80) {
            this.field_j = -65;
          }
          while (db.field_D.c((byte) 113) != null) {
            db.field_D.a((byte) 60);
            if (var4 != 0) {
              return;
            }
          }
          fk.field_t = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "pd.H(" + param0 + ')');
        }
    }

    static {
        field_a = "This password contains your email address, and would be easy to guess";
        field_f = new int[]{0, 0, 1};
        field_i = null;
        field_d = "Type your email address again to make sure it's correct";
    }
}
