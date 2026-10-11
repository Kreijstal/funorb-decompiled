/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Transmogrify extends ig {
    static String field_B;
    static String field_E;
    static int field_D;
    public static boolean field_A;

    final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 0) {
            field_E = (String) null;
          }
          gl.j(param0 + 31107);
          if (ub.field_c != null) {
            qd.b(5);
          }
          lf.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.K(" + param0 + ')');
        }
    }

    public static void l(int param0) {
        try {
          field_B = null;
          field_E = null;
          if (param0 != 0) {
            Transmogrify.d(false);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.L(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        boolean discarded$0 = false;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        boolean stackIn_47_0 = false;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        var4 = field_A ? 1 : 0;
        try {
          sf.v(107);
          if (null != ub.field_c &&
            ub.field_c.field_c) {
            qd.b(5);
            wk.b((byte) -120);
          }
          stackIn_7_1 = 10017;
          stackIn_8_2 = (ub.field_c != null);
          this.a(stackIn_7_1, stackIn_8_2);
          if (wf.field_a) {
            this.j(-7632);
            wf.field_a = false;
          }
          if (param0 > -12) {
            return;
          }
          if (rd.b(63)) {
            this.b(false);
            if (rd.b(72)) {
              if (pa.b(-120)) {
                discarded$0 = this.a((byte) -96, false);
              }
              return;
            }
            if (!qj.b((byte) 99)) {
              sh.field_c = pj.a(29, (byte) -76, 3, 10, 1);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!vi.field_h) {
            gj.a(true, f.field_a);
            if (this.a((byte) -96, true)) {
              this.n(32198);
              vi.field_h = true;
            }
          } else {
            if (!qj.b((byte) 95) &&
              !ud.field_a &&
              lb.field_i != 2) {
              if (kb.field_n != null &&
                kb.field_n.field_i) {
                hc.field_u = hc.field_u & ~kb.field_n.field_k;
                rh.field_n = rh.field_n | kb.field_n.field_k;
                kb.field_n = null;
                cg.b((byte) -27);
                qd.a(-117);
                ud.field_a = true;
                if (((be.field_q == 6)) &&
                  ((0 == hc.field_u))) {
                  qf.field_d = 2;
                  be.field_q = 2;
                }
              } else {
                vf.a((byte) -123, 100.0f, gk.field_a);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!ll.c(true)) {
                if (!dj.b(-1)) {
                  if (tl.field_d < 169) {
                    tl.field_d = tl.field_d + fa.field_f;
                    if (169 <= tl.field_d) {
                      wd.a(17099, true, bd.field_u[6]);
                    }
                  } else {
                    this.o(11179);
                  }
                } else {
                  stackIn_47_0 = (ub.field_c != null);
                  var2_int = pc.a(stackIn_47_0, (ig) (this), (byte) 120);
                  switch (var2_int) {
                    case 1:
                      qd.b(5);
                      break;
                    case 2:
                      if (null != ub.field_c) {
                        qd.b(5);
                      }
                      vl.a((byte) 120, ha.b(85));
                      break;
                    case 2364824:
                      jd.a((byte) -77);
                      break;
                    default:
                      break;
                  }
                }
              } else {
                if (lb.field_i != 0) {
                  this.o(11179);
                } else {
                  var2_int = ll.s(120);
                  if (var2_int != 3) {
                    if (var2_int != 2) {
                      if (var2_int == 4) {
                        vb.a(-2, -2, (byte) 117);
                      }
                    } else {
                      qd.b(5);
                    }
                  } else {
                    dj.a(true, true);
                  }
                  if (!ll.c(true)) {
                    ej.field_l[be.field_q].a(true, 256);
                  }
                }
              }
            }
          }
          if (!qj.b((byte) 122)) {
            while (true) {
              var5 = (gd) (mc.field_c.c(-128));
              if (var5 == null) {
                break;
              }
              te.a(var5, (byte) -10, 4);
            }
          }
          while (gj.a(ek.field_c, (byte) 114)) {
            this.g(-89);
          }
          rb.a(0, -377);
          stackIn_95_0 = (!vc.e(false)) ? 0 : 1;
          var2_int = stackIn_95_0;
          if (var2_int != 0) {
            var3 = this.f((byte) 102);
            if (var3 == 2) {
              jd.a(240, 10, eh.field_c, 3, wf.field_d.field_y, 320, wf.field_d, wf.field_d.field_y * 3 / 2, 3, pf.field_h, false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.D(" + param0 + ')');
        }
    }

    final static String k(int param0) {
        RuntimeException var1 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 72) {
            field_D = -63;
          }
          stackIn_3_0 = nf.field_l.g(12248);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "Transmogrify.M(" + param0 + ')');
        }
    }

    final static void m(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        hj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = field_A ? 1 : 0;
        try {
          if (param0 <= 85) {
            field_B = (String) null;
          }
          var1 = ff.field_D;
          while (cg.g(-5591)) {
            var1.a(false, 8);
            fieldTemp$0 = var1.field_h + 1;
            var1.field_h = var1.field_h + 1;
            var2 = fieldTemp$0;
            lc.a((byte) 65, var1);
            ff.field_D.a((byte) -42, var1.field_h - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "Transmogrify.I(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_39_0;
        int stackIn_39_1;
        mi stackIn_39_2;
        int stackIn_39_3;
        int stackIn_40_4 = 0;
        int stackIn_43_0;
        int stackIn_43_1;
        mi stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        boolean stackIn_43_5;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        mi stackIn_44_2 = null;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        boolean stackIn_44_6 = false;
        int[] stackIn_47_0;
        int stackIn_47_1;
        int stackIn_47_2;
        int stackIn_47_3;
        mi stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        int stackIn_48_7 = 0;
        int[] stackIn_51_0;
        int stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        mi stackIn_51_4;
        int stackIn_51_5;
        int stackIn_51_6;
        int stackIn_51_7;
        int[] stackIn_52_0;
        int stackIn_52_1;
        int stackIn_52_2;
        int stackIn_52_3;
        mi stackIn_52_4;
        int stackIn_52_5;
        int stackIn_52_6;
        int stackIn_52_7;
        boolean stackIn_52_8;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = field_A ? 1 : 0;
        try {
          if (lb.field_i != 0) {
            if (1 != lb.field_i) {
              if (2 == lb.field_i) {
                if (qj.b((byte) 104)) {
                  be.field_q = hf.field_i;
                } else {
                  kb.field_n = l.a((byte) 12, 4);
                  ug.b(true);
                  sh.field_c = pj.a(29, (byte) 114, 3, 10, 1);
                  be.field_q = vl.field_y;
                }
                if (be.field_q == -2) {
                  be.field_q = 0;
                  dj.a(true, true);
                }
                lb.field_i = 3;
                qf.field_d = be.field_q;
              } else {
                lc.field_q = lc.field_q - 1;
                if (lc.field_q == 0) {
                  lb.field_i = 0;
                }
              }
            } else {
              lc.field_q = lc.field_q + 1;
              if (lc.field_q == 16) {
                if (ll.c(true)) {
                  fg.d((byte) 91);
                } else {
                  qg.b(false);
                }
                lb.field_i = 2;
              }
            }
          } else {
            if (~be.field_q == ~qf.field_d) {
              if (be.field_q == -1) {
                ia.d(80);
                if (qf.field_d == 1) {
                  oh.field_j = oh.field_j + 1;
                  g.field_z = 0;
                }
              } else {
                ej.field_l[be.field_q].c((byte) 122);
                if (oh.field_j > 2 &&
                  n.field_a < 10) {
                  wk.field_c = wk.field_c + 1;
                  dc.field_a = dc.field_a + 1;
                }
              }
            } else {
              fieldTemp$0 = lc.field_q + 1;
              lc.field_q = lc.field_q + 1;
              if (16 != fieldTemp$0) {
                if (lc.field_q == 1 &&
                  qf.field_d >= 0) {
                  if (-1 != be.field_q) {
                    ej.field_l[qf.field_d].a(ej.field_l[be.field_q].field_j.field_f, param0 ^ 10923);
                  } else {
                    ej.field_l[qf.field_d].a(false, 256);
                  }
                  if (qf.field_d == 5) {
                    var2_int = 130;
                    var3 = wf.field_d.field_t + (wf.field_d.field_D + 4);
                    var2_int = var2_int + var3 * wf.field_d.b(sd.field_Q, 341);
                    stackIn_39_0 = var2_int;
                    stackIn_39_1 = var3;
                    stackIn_39_2 = wf.field_d;
                    stackIn_39_3 = 1;
                    if (hc.field_u == 0) {
                      stackIn_40_4 = 0;
                    } else {
                      stackIn_40_4 = 1;
                    }
                    stackIn_43_0 = stackIn_39_0;
                    stackIn_43_1 = stackIn_39_1;
                    stackIn_43_2 = stackIn_39_2;
                    stackIn_43_3 = stackIn_39_3;
                    stackIn_43_4 = stackIn_40_4;
                    stackIn_43_5 = false;
                    if (0 == pf.field_g) {
                      stackIn_44_0 = stackIn_43_0;
                      stackIn_44_1 = stackIn_43_1;
                      stackIn_44_2 = stackIn_43_2;
                      stackIn_44_3 = stackIn_43_3;
                      stackIn_44_4 = stackIn_43_4;
                      stackIn_44_6 = false;
                    } else {
                      stackIn_44_0 = stackIn_39_0;
                      stackIn_44_1 = stackIn_39_1;
                      stackIn_44_2 = stackIn_39_2;
                      stackIn_44_3 = stackIn_39_3;
                      stackIn_44_4 = stackIn_40_4;
                      stackIn_44_6 = true;
                    }
                    var2_intLifetime1 = stackIn_44_0 + stackIn_44_1 * ((mi) (Object) stackIn_44_2).b(aj.a(stackIn_44_3 != 0, stackIn_44_4 != 0, stackIn_43_5, stackIn_44_6), 341);
                    fd.field_a[5] = var2_intLifetime1 + 10;
                    stackIn_47_0 = fd.field_b;
                    stackIn_47_1 = 5;
                    stackIn_47_2 = var3 + jk.field_x.a(true);
                    stackIn_47_3 = var3;
                    stackIn_47_4 = wf.field_d;
                    stackIn_47_5 = -127;
                    stackIn_47_6 = 0;
                    if (0 == pf.field_g) {
                      stackIn_48_7 = 0;
                    } else {
                      stackIn_48_7 = 1;
                    }
                    stackIn_51_0 = stackIn_47_0;
                    stackIn_51_1 = stackIn_47_1;
                    stackIn_51_2 = stackIn_47_2;
                    stackIn_51_3 = stackIn_47_3;
                    stackIn_51_4 = stackIn_47_4;
                    stackIn_51_5 = stackIn_47_5;
                    stackIn_51_6 = stackIn_47_6;
                    stackIn_51_7 = stackIn_48_7;
                    if (hc.field_u == 0) {
                      stackIn_52_0 = stackIn_51_0;
                      stackIn_52_1 = stackIn_51_1;
                      stackIn_52_2 = stackIn_51_2;
                      stackIn_52_3 = stackIn_51_3;
                      stackIn_52_4 = stackIn_51_4;
                      stackIn_52_5 = stackIn_51_5;
                      stackIn_52_6 = stackIn_51_6;
                      stackIn_52_7 = stackIn_51_7;
                      stackIn_52_8 = false;
                    } else {
                      stackIn_52_0 = stackIn_47_0;
                      stackIn_52_1 = stackIn_47_1;
                      stackIn_52_2 = stackIn_47_2;
                      stackIn_52_3 = stackIn_47_3;
                      stackIn_52_4 = stackIn_47_4;
                      stackIn_52_5 = stackIn_47_5;
                      stackIn_52_6 = stackIn_47_6;
                      stackIn_52_7 = stackIn_48_7;
                      stackIn_52_8 = true;
                    }
                    stackIn_52_0[stackIn_52_1] = stackIn_52_2 + stackIn_52_3 * ((mi) (Object) stackIn_52_4).b(gd.$cfr$intArgs$a$c7de0d339b2a(stackIn_52_5, stackIn_52_6 != 0, stackIn_52_7 != 0, stackIn_52_8), 341);
                  }
                }
              } else {
                if (2 == be.field_q) {
                  sh.field_c = null;
                }
                if (be.field_q == 5 &&
                  qj.b((byte) 99)) {
                  rh.field_n = 0;
                  hc.field_u = 0;
                  mc.field_c.g(-1);
                  pf.field_g = 0;
                }
                lc.field_q = 0;
                be.field_q = qf.field_d;
                if (be.field_q == 0) {
                  wd.a(17099, true, bd.field_u[6]);
                }
              }
              eg.field_b = eg.field_b + 1;
              if (oh.field_j > 2 &&
                10 > n.field_a) {
                wk.field_c = wk.field_c + 1;
                dc.field_a = dc.field_a + 1;
              }
            }
          }
          if (param0 != 11179) {
            this.a(60);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        Object stackIn_5_0 = null;
        boolean stackIn_12_0 = false;
        boolean stackIn_88_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        ti[] var3_ref_ti__ = null;
        int var3 = 0;
        int var4 = 0;
        ti var5_ref_ti = null;
        int var5 = 0;
        int var6 = 0;
        ti[] var7_ref_ti__ = null;
        int var7 = 0;
        int var8 = 0;
        ti var9 = null;
        int var10 = 0;
        Object var11 = null;
        int var3Lifetime1;
        int var8Lifetime1;
        var10 = field_A ? 1 : 0;
        try {
          if (ub.field_c == null) {
            stackIn_5_0 = gd.field_k;
          } else {
            stackIn_5_0 = ub.field_c;
          }
          var11 = stackIn_5_0;
          var2 = var11;
          if (rd.b(65)) {
            if (null != ub.field_c) {
              stackIn_12_0 = true;
            } else {
              stackIn_12_0 = rj.field_b;
            }
            da.a(stackIn_12_0, (byte) 119, (java.awt.Canvas) (var11));
            return;
          }
          if (!vi.field_h) {
            ng.a(false, (java.awt.Canvas) (var11));
            return;
          }
          if (!qj.b((byte) 119) &&
            !ud.field_a) {
            ng.a(false, (java.awt.Canvas) (var11));
            return;
          }
          if (be.field_q != qf.field_d) {
            if (qf.field_d == -1) {
              kd.a(param0 ^ 15706, 0);
            } else {
              ej.field_l[qf.field_d].d(param0 ^ 29608, 0);
            }
            if (be.field_q != -1) {
              ej.field_l[be.field_q].d(param0 ^ 29608, (lc.field_q << 1) - (lc.field_q << 5));
            } else {
              kd.a(98, (lc.field_q << 1) - (lc.field_q << 5));
            }
          } else {
            if (be.field_q != -1) {
              ej.field_l[be.field_q].d(param0 + 4456, 0);
              if (tl.field_d < 169) {
                if (tl.field_d < 151) {
                  jh.field_h.f(0, 0);
                  if (25 <= tl.field_d) {
                    var3_ref_ti__ = gk.field_c;
                    for (var4 = 0; var3_ref_ti__.length > var4; var4++) {
                      var5_ref_ti = var3_ref_ti__[var4];
                      var5_ref_ti.c(0, 0);
                    }
                    if (!(tl.field_d >= 134)) {
                      var3 = 3 * jl.field_l.field_r / 20;
                      var4 = jl.field_l.field_s * 3 / 20;
                      jl.field_l.b(320 - (var3 >> 1), -(var4 >> 1) + 240, var3, var4);
                    }
                  } else {
                    var3 = tl.field_d * 640 / 25;
                    var4 = tl.field_d * 480 / 25;
                    var5 = -var3 + 640 >> 1;
                    var6 = -var4 + 480 >> 1;
                    var7_ref_ti__ = gk.field_c;
                    for (var8 = 0; var8 < var7_ref_ti__.length; var8++) {
                      var9 = var7_ref_ti__[var8];
                      var9.b(var5, var6, var3, var4);
                    }
                    var7 = tl.field_d * 3 * jl.field_l.field_r / 500;
                    var8Lifetime1 = jl.field_l.field_s * 3 * tl.field_d / 500;
                    jl.field_l.b(-(var7 >> 1) + 320, -(var8Lifetime1 >> 1) + 240, var7, var8Lifetime1);
                  }
                  var3 = -10 + tl.field_d;
                  if (var3 >= 0) {
                    rh.field_s.c(0, (int)(Math.exp((double)(-var3) * 0.06) * -160.0 * Math.cos((double)var3 * 0.12)));
                  }
                  var3 = tl.field_d - 50;
                  if (var3 >= 0) {
                    var4 = (var3 << 4) - ij.field_h.field_n;
                    if (var4 > 16) {
                      var4 = 16;
                    }
                    ij.field_h.c(var4, 159);
                  }
                  var3 = -84 + tl.field_d;
                  if (var3 >= 0) {
                    var4 = 640 - 8 * var3;
                    if (var4 < 406) {
                      var4 = 406;
                    }
                    hc.field_r.c(var4, 112);
                  }
                  var3 = -134 + tl.field_d;
                  if (var3 >= 0) {
                    var4 = jl.field_l.field_r * (3 + var3 + var3 * var3 / 2) / 20;
                    var5 = jl.field_l.field_s * (3 - (-var3 - var3 * var3 / 2)) / 20;
                    jl.field_l.b(320 - (var4 >> 1), 240 - (var5 >> 1), var4, var5);
                  }
                } else {
                  var3 = 166 - tl.field_d;
                  if (var3 >= 0) {
                    var4 = (var3 + (3 + var3 * var3 / 2)) * jl.field_l.field_r / 20;
                    var5 = jl.field_l.field_s * (var3 * var3 / 2 + var3 + 3) / 20;
                  } else {
                    if (var3 >= -3) {
                      var4 = jl.field_l.field_r * (3 + var3) / 20;
                      var5 = jl.field_l.field_s * (3 + var3) / 20;
                    } else {
                      var4 = 0;
                      var5 = 0;
                    }
                  }
                  jl.field_l.b(320 - (var4 >> 1), 240 - (var5 >> 1), var4, var5);
                }
              }
            } else {
              kd.a(param0 ^ 15706, 0);
            }
          }
          if (param0 != 15648) {
            return;
          }
          if (ll.c(true)) {
            sb.e(0, 0, 640, 480);
            og.b(false);
          }
          if (0 != lb.field_i) {
            var3Lifetime1 = 256 * lc.field_q / 16;
            if (var3Lifetime1 > 0) {
              sb.c(0, 0, sb.field_c, sb.field_g, 0, var3Lifetime1);
            }
          }
          if (dj.b(-1) &&
            !ll.c(true)) {
            if (null != ub.field_c) {
              stackIn_88_0 = true;
            } else {
              stackIn_88_0 = rj.field_b;
            }
            cj.a(stackIn_88_0, 793);
          }
          ah.a(0, 0, (byte) 119, (java.awt.Canvas) (var11));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "Transmogrify.B(" + param0 + ')');
        }
    }

    public Transmogrify() {
    }

    private final boolean a(byte param0, boolean param1) {
        int var8_int = 0;
        int var9_int = 0;
        int incrementValue$0 = 0;
        int incrementValue$2 = 0;
        sj dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        ad[] var5 = null;
        int var6_int = 0;
        nf var6 = null;
        sj var7 = null;
        int var7_int = 0;
        sj var8 = null;
        sj var9 = null;
        int var10 = 0;
        ti var12 = null;
        ti[] var13 = null;
        ti var14 = null;
        ad[] var15 = null;
        ad[] var16 = null;
        sj var17 = null;
        sj var18 = null;
        byte[] var21 = null;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5_intLifetime1;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        var10 = field_A ? 1 : 0;
        try {
          if (null != pc.field_a) {
            if (li.field_k.a((byte) -116) &&
              li.field_k.a((byte) -98, "basic")) {
              if (pc.field_a.a((byte) -120) &&
                pc.field_a.c(param0 ^ -32065)) {
                if (di.field_h.a((byte) -116) &&
                  di.field_h.c(32031)) {
                  if (be.field_n.a((byte) -117) &&
                    be.field_n.c(32031)) {
                    if (ta.field_d.a((byte) -115) &&
                      ta.field_d.c(32031)) {
                      if (oi.field_g.a((byte) -128) &&
                        oi.field_g.a((byte) 123, "")) {
                        if (wl.a(false, 0) && (!oi.field_g.a((byte) -113) ||
                          !oi.field_g.a((byte) 121, "halloween"))) {
                          vf.a((byte) 36, 50.0f, ee.a(q.field_e, (byte) 114, ih.field_c, oi.field_g, "halloween"));
                          return false;
                        }
                        if (kk.field_a.a((byte) -118) &&
                          kk.field_a.c(32031)) {
                          if (!li.field_k.a((byte) 126, "arialish12")) {
                            vf.a((byte) -128, 52.0f, ee.a(dj.field_a, (byte) 102, i.field_c, li.field_k, "arialish12"));
                            return false;
                          }
                          if (!ig.field_y.a((byte) 118, "arialish12")) {
                            vf.a((byte) -125, 52.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish12"));
                            return false;
                          }
                          if (!li.field_k.a((byte) -13, "arialish20")) {
                            vf.a((byte) 83, 53.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish20"));
                            return false;
                          }
                          if (!ig.field_y.a((byte) 117, "arialish20")) {
                            vf.a((byte) -123, 53.0f, ee.a(dj.field_a, (byte) 123, i.field_c, li.field_k, "arialish20"));
                            return false;
                          }
                          if (l.field_a.a((byte) -124) &&
                            l.field_a.c(32031)) {
                            vf.a((byte) 17, 73.0f, q.field_c);
                            if (!param1) {
                              return false;
                            }
                            cg.b((byte) -121);
                            this.b(15648);
                            rc.field_a = new bl(pc.field_a, di.field_h);
                            dg.field_d[0] = r.a(pc.field_a, "", "trans16_button_click").a();
                            dg.field_d[1] = r.a(pc.field_a, "", "trans01_submit_accept").a();
                            dg.field_d[2] = r.a(pc.field_a, "", "trans02_submit_decline").a();
                            dg.field_d[3] = r.a(pc.field_a, "", "trans03_place_tile_1").a();
                            dg.field_d[4] = r.a(pc.field_a, "", "trans04_place_tile_2").a();
                            dg.field_d[5] = r.a(pc.field_a, "", "trans05_place_tile_3").a();
                            dg.field_d[6] = r.a(pc.field_a, "", "trans06_incorrect_letter").a();
                            dg.field_d[7] = r.a(pc.field_a, "", "trans07_popup_warning").a();
                            lj.field_u = bb.a(dg.field_d[1], 100, 255);
                            pc.field_a = null;
                            el.b(-6491);
                            return false;
                          }
                          vf.a((byte) -4, 54.0f, rj.a(l.field_a, (byte) -38));
                          return false;
                        }
                        vf.a((byte) 11, 51.0f, ee.a(dj.field_a, (byte) 75, i.field_c, kk.field_a, ""));
                        return false;
                      }
                      vf.a((byte) -128, 50.0f, ee.a(vg.field_a, (byte) 73, aa.field_f, oi.field_g, ""));
                      return false;
                    }
                    vf.a((byte) -128, 49.0f, ee.a(i.field_d, (byte) 97, kh.field_e, ta.field_d, ""));
                    return false;
                  }
                  vf.a((byte) 25, 48.0f, fg.a(kh.field_e, be.field_n, 0, i.field_d, 32389));
                  return false;
                }
                vf.a((byte) -10, 2.0f, ee.a(i.field_d, (byte) 74, kh.field_e, di.field_h, ""));
                return false;
              }
              vf.a((byte) 90, 1.0f, ee.a(oc.field_H, (byte) 71, k.field_e, pc.field_a, ""));
              return false;
            }
            vf.a((byte) -121, 0.0f, ee.a(vg.field_a, (byte) 100, aa.field_f, li.field_k, "basic"));
            return false;
          }
          if (null != di.field_h) {
            vf.a((byte) -121, 74.0f, q.field_c);
            this.b(15648);
            dg.field_d[10] = ml.a(di.field_h, "", "trans14_crowd_cheer_long").b();
            dg.field_d[11] = ml.a(di.field_h, "", "trans15_crowd_cheer_short").b();
            var3_int = 95190;
            var4 = 275371;
            dg.field_d[9] = ec.a(var4, 0, var3_int, dg.field_d[10]);
            dg.field_d[8] = ec.a(dg.field_d[10].field_l.length, 0, var4, dg.field_d[10]);
            dg.field_d[12] = ec.a(dg.field_d[10].field_l.length, 0, var3_int, dg.field_d[10]);
            di.field_h = null;
            el.b(-6491);
            return false;
          }
          if (null != ta.field_d) {
            vf.a((byte) -125, 75.0f, db.field_f);
            this.b(15648);
            bd.field_u = new pl[10];
            bd.field_u[0] = pl.a(ta.field_d, "", "transmogrify intro jingle");
            bd.field_u[1] = pl.a(ta.field_d, "", "transmogrify 1-3");
            bd.field_u[2] = pl.a(ta.field_d, "", "transmogrify 4-6");
            bd.field_u[3] = pl.a(ta.field_d, "", "transmogrify 7-9");
            bd.field_u[4] = pl.a(ta.field_d, "", "transmogrify 10");
            bd.field_u[5] = pl.a(ta.field_d, "", "transmogrify linking jingle");
            bd.field_u[6] = pl.a(ta.field_d, "", "transmogrify title");
            bd.field_u[7] = pl.a(ta.field_d, "", "transmogrify complete well jingle");
            bd.field_u[8] = pl.a(ta.field_d, "", "transmogrify complete ok jingle");
            bd.field_u[9] = pl.a(ta.field_d, "", "transmogrify complete poor jingle");
            ta.field_d = null;
            el.b(param0 - 6395);
            return false;
          }
          if (be.field_n != null) {
            for (var3_intLifetime1 = 0; 10 > var3_intLifetime1; var3_intLifetime1++) {
              if (bd.field_u[var3_intLifetime1] != null &&
                !jk.field_D.a(176400, false, rc.field_a, bd.field_u[var3_intLifetime1], be.field_n)) {
                return false;
              }
            }
            jk.field_D.d(true);
            rc.field_a = null;
            be.field_n = null;
            el.b(-6491);
            return false;
          }
          if (null == gb.field_a &&
            null == wf.field_d) {
            vf.a((byte) -125, 92.0f, ha.field_b);
            this.b(param0 ^ -15744);
            gb.field_a = ej.a((byte) -43, li.field_k, "", "arialish20");
            el.b(-6491);
            return false;
          }
          if (le.field_A == null) {
            var21 = ig.field_y.a("", (byte) 92, "arialish20");
            wf.field_d = jd.a(var21, 98, gb.field_a);
            og.field_a = ua.a(oi.field_g, "", 32, kk.field_a, "arialish20narrow");
            le.field_A = eh.a(gb.field_a, param0 ^ -96, var21, 255, 119);
            le.field_A.field_K[1] = new int[]{0, 16777215, 7829367};
            hk.field_a = am.a("", li.field_k, (byte) 72, ig.field_y, "arialish12");
            gb.field_a = null;
            wf.field_d.a(ue.field_c, (int[]) null);
            hk.field_a.a(ue.field_c, (int[]) null);
            ff.field_z = pc.a("basic", "unachieved", li.field_k, param0 ^ 33);
            nh.a(ff.field_z, (byte) 59);
            var4Lifetime1 = wf.field_d.field_t + wf.field_d.field_y;
            c.field_a = pc.a("basic", "orbcoin", li.field_k, param0 ^ 33);
            li.field_k = null;
            ig.field_y = null;
            og.field_b = new ti(var4Lifetime1, var4Lifetime1);
            og.field_b.e();
            c.field_a.a(0, 0, var4Lifetime1, var4Lifetime1);
            c.field_a = null;
            ri.field_k.a(115);
            dh.field_B = pc.a("", "background", oi.field_g, param0 - 28);
            qe.field_F = kl.a(oi.field_g, (byte) 127, "", "hostanims_uniq");
            mk.field_B = kl.a(oi.field_g, (byte) 125, "", "dialog_frame");
            pf.field_h = kl.a(oi.field_g, (byte) 125, "", "button_frame");
            eh.field_c = kl.a(oi.field_g, (byte) 121, "", "button_frame_hi");
            jk.field_x = new mg(ej.a((byte) -43, oi.field_g, "var_button", ""));
            var5_int = wf.field_d.a(mc.field_a[0]);
            var6_int = wf.field_d.a(mc.field_a[1]);
            if (var5_int < var6_int) {
              var5_int = var6_int;
            }
            var6_intLifetime3 = wf.field_d.a(mc.field_a[2]);
            tb.field_b = new ti[3];
            if (var6_intLifetime3 > var5_int) {
              var5_int = var6_intLifetime3;
            }
            var5_int += 16;
            var7_int = 4 + wf.field_d.field_y + wf.field_d.field_t;
            for (var8_int = 0; var8_int < 3; var8_int++) {
              tb.field_b[var8_int] = new ti(var5_int, var7_int);
              tb.field_b[var8_int].e();
              dk.a(var7_int, mk.field_B, -28018, 0, 0, var5_int);
              for (var9_int = 0; sb.field_h.length > var9_int; var9_int++) {
                if (sb.field_h[var9_int] != 0 &&
                  7500402 > sb.field_h[var9_int]) {
                  sb.field_h[var9_int] = 7500402;
                }
              }
              wf.field_d.c(mc.field_a[var8_int], var5_int >> 1, wf.field_d.field_y + 2, 1, -1);
            }
            ri.field_k.a(param0 + 199);
            el.b(-6491);
            return false;
          }
          if (param0 != -96) {
            field_B = (String) null;
          }
          if (null == rk.field_r[4]) {
            a.field_R = pc.a("", "logo_highscores", oi.field_g, param0 ^ 118);
            mk.field_y = pc.a("", "logo_achievements", oi.field_g, 58);
            se.field_t = pc.a("", "logo_instructions", oi.field_g, -33);
            uj.field_e = cf.a((byte) -122);
            kk.field_d = kl.a(oi.field_g, (byte) 121, "", "frame_trans");
            ck.field_C = kl.a(oi.field_g, (byte) 123, "", "frame_trans_inner");
            pf.field_d = pc.a("", "banner", oi.field_g, 71);
            rk.field_r[4] = new ti(640, 480);
            var12 = new ti(640, 480);
            var12.e();
            dk.a(377, ck.field_C, -28018, 258, 72, 361);
            mk.field_y.d(337, 14, 0);
            for (var4Lifetime2 = 0; var4Lifetime2 < sb.field_h.length; var4Lifetime2++) {
              if (sb.field_h[var4Lifetime2] != 0) {
                sb.field_h[var4Lifetime2] = 16777215;
              }
            }
            rk.field_r[4].e();
            uj.field_e.f(0, 0);
            if (!wl.a(false, 0)) {
              pc.a("", "achievementsbg_nobox", oi.field_g, -126).c(0, 0);
            } else {
              pc.a("halloween", "achievementsbg_nobox", oi.field_g, 18).c(0, 0);
            }
            var12.e(0, 0, 166);
            wf.a(kk.field_d, 377, 7, 258, 2363394, 361, 72);
            mk.field_y.c(337, 14);
            rk.field_r[6] = rk.field_r[4];
            rk.field_r[1] = new ti(640, 480);
            rk.field_r[1].e();
            uj.field_e.f(0, 0);
            if (!wl.a(false, 0)) {
              pc.a("", "pausemenu_nobox", oi.field_g, ~param0).c(0, 0);
            } else {
              pc.a("halloween", "pausemenu_nobox", oi.field_g, -127).c(0, 0);
            }
            wf.a(kk.field_d, 347, param0 + 103, 140, 2363394, 361, 72);
            wf.a(ck.field_C, 347, 7, 140, 16777215, 361, 72);
            pf.field_d.c(219, 14);
            ri.field_k.a(param0 ^ -47);
            rk.field_r[7] = rk.field_r[1];
            el.b(-6491);
            return false;
          }
          if (rk.field_r[0] == null) {
            if (wl.a(false, 0)) {
              rk.field_r[0] = kf.a(pc.a("halloween", "mainmenu_packed", oi.field_g, -125), false, (byte) 101);
            } else {
              rk.field_r[0] = kf.a(pc.a("", "mainmenu_packed", oi.field_g, -5), false, (byte) -93);
            }
            rk.field_r[0].e();
            pf.field_d.c(219, 21);
            rk.field_r[3] = pc.a("", "instructions_bg", oi.field_g, -128);
            rk.field_r[5] = rk.field_r[1];
            wl.field_K = pc.a("", "tile", oi.field_g, param0 + 149);
            rj.field_a = kl.a(oi.field_g, (byte) 122, "", "sparkles");
            hf.field_d = kl.a(oi.field_g, (byte) 122, "", "sparkle_array");
            jh.field_h = new ti(640, 480);
            jh.field_h.e();
            uj.field_e.f(0, 0);
            pc.a("", "spikes", oi.field_g, 45).c(0, 0);
            rk.field_r[2] = new ti(640, 480);
            rk.field_r[2].e();
            jh.field_h.f(0, 0);
            if (wl.a(false, 0)) {
              pc.a("halloween", "highscorebg_nobox", oi.field_g, -127).c(0, 0);
            } else {
              pc.a("", "highscorebg_nobox", oi.field_g, -126).c(0, 0);
            }
            a.field_R.c(10, 10);
            wf.a(kk.field_d, 377, 7, 217, 2363394, 361, 20);
            wf.a(ck.field_C, 377, param0 + 103, 217, 16777215, 361, 20);
            ri.field_k.a(117);
            jl.field_l = pc.a("", "intro_bigstar", oi.field_g, param0 ^ -58);
            gk.field_c = kl.a(oi.field_g, (byte) 124, "", "intro_stars");
            ij.field_h = pc.a("", "intro_host", oi.field_g, -124);
            hc.field_r = pc.a("", "intro_hostess", oi.field_g, 95);
            rh.field_s = kf.a(pc.a("", "intro_logo_packed", oi.field_g, param0 - 31), false, (byte) 126);
            rh.field_s.b();
            kk.field_d = null;
            ck.field_C = null;
            pf.field_d = null;
            uj.field_e = null;
            fc.field_h = kl.a(oi.field_g, (byte) 126, "", "achievements");
            var13 = fc.field_h;
            for (var4Lifetime3 = 0; var13.length > var4Lifetime3; var4Lifetime3++) {
              var14 = var13[var4Lifetime3];
              nh.a(var14, (byte) 110);
            }
            if (wl.a(false, 0)) {
              ij.field_h = pc.a("halloween", "intro_host", oi.field_g, -128);
              hc.field_r = pc.a("halloween", "intro_hostess", oi.field_g, 59);
              qe.field_F = kl.a(oi.field_g, (byte) 127, "halloween", "hostanims_uniq");
              rk.field_r[3] = pc.a("halloween", "instructions_bg", oi.field_g, -12);
              dh.field_B = pc.a("halloween", "background", oi.field_g, 19);
            }
            hk.a(wf.field_d, param0 + 98, 400, wf.field_d);
            ej.a(16, (byte) 108, 8, 2, new pg(pf.field_h), new pg(eh.field_c));
            vf.a(new pg(mk.field_B), 10, 10, param0 + 211);
            el.b(-6491);
            return false;
          }
          if (l.field_a == null) {
            for (var3_intLifetime2 = 0; var3_intLifetime2 < 8; var3_intLifetime2++) {
              ej.field_l[var3_intLifetime2] = new vg(var3_intLifetime2);
            }
            be.field_q = 0;
            ek.a(118);
            el.b(-6491);
            return true;
          }
          vf.a((byte) -11, 93.0f, vh.field_k);
          this.b(param0 + 15744);
          var15 = kl.b(param0 + 12, l.field_a);
          var4Lifetime4 = 0;
          for (var5_intLifetime1 = 0; var5_intLifetime1 < var15.length; var5_intLifetime1++) {
            if (var15[var5_intLifetime1] != null) {
              var4Lifetime4++;
            }
          }
          incrementValue$0 = var4Lifetime4;
          var4Lifetime4--;
          var16 = new ad[incrementValue$0];
          var5 = var16;
          for (var6_intLifetime1 = var15.length - 1; var6_intLifetime1 >= 0; var6_intLifetime1--) {
            if (var15[var6_intLifetime1] != null) {
              incrementValue$2 = var4Lifetime4;
              var4Lifetime4--;
              var5[incrementValue$2] = var15[var6_intLifetime1];
            }
          }
          we.field_l = new nf[var16.length];
          for (var6_intLifetime2 = 0; var6_intLifetime2 < we.field_l.length; var6_intLifetime2++) {
            we.field_l[var6_intLifetime2] = new nf(oi.field_g, kk.field_a, var16[var6_intLifetime2]);
            if (we.field_l[var6_intLifetime2].field_j.equals(hi.field_d)) {
              am.field_n = var6_intLifetime2;
            }
          }
          var6 = we.field_l[am.field_n];
          var17 = w.a(de.field_d, 1, var6, (byte) 60, var6.field_d.charAt(0));
          var17.field_g = 1000;
          var8 = var17;
          var8.field_j = 1000;
          ob.a(1, 1, var17, 0);
          ue.field_c[1].field_h = var6.field_c.field_D + 8;
          var17.d(1);
          dupTemp$1 = w.a(de.field_d, 1, var6, (byte) 88, var6.field_n.charAt(1));
          sg.field_p = dupTemp$1;
          var18 = dupTemp$1;
          var7 = var18;
          var7.field_g = 1000;
          var9 = var7;
          var9.field_j = 1000;
          var7.field_x = true;
          ob.a(1, 2, var18, 0);
          oi.field_g = null;
          l.field_a = null;
          ue.field_c[2].field_h = 8 + var6.field_c.field_D;
          kk.field_a = null;
          el.b(param0 ^ 6405);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "Transmogrify.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.a(8, param0 ^ -10, 13, 9, 11, 0, false, 10);
        lc var2 = new lc();
        if (param0 != -9) {
          return;
        }
        try {
          var2.b(128, 9, -23780);
          uh.a((java.awt.Component) ((Object) gd.field_k), 22050, -21, lk.field_b, var2, true);
          uc.a(128, (byte) -119);
          u.field_b = 4473924;
          field_D = 128;
          pf.field_b = 255;
          this.a(true, false, false, false, (byte) 9);
          ue.field_c = new ii[3];
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.F(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!qj.b((byte) 126) &&
            kb.field_n == null) {
            kb.field_n = l.a((byte) 12, 4);
          }
          wd.a(param0 - 15099, false, bd.field_u[0]);
          if (param0 != 32198) {
            this.c(9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.A(" + param0 + ')');
        }
    }

    final static boolean d(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return true;
          }
          field_E = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "Transmogrify.C(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("transmogrify", false, 12);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.init()");
        }
    }

    private final void j(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nk.field_d) {
            dl.a(nk.field_d, (byte) 119);
            nk.field_d = null;
            el.b(-6491);
          }
          oi.field_g = cg.a((byte) -82, 1);
          pc.field_a = cg.a((byte) -82, 2);
          di.field_h = cg.a((byte) -82, 3);
          be.field_n = cg.a((byte) -82, 4);
          ta.field_d = cg.a((byte) -82, 5);
          l.field_a = cg.a((byte) -82, 6);
          kk.field_a = cg.a((byte) -82, 7);
          of.b(22);
          if (param0 != -7632) {
            Transmogrify.k(115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "Transmogrify.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        try {
          Transmogrify.l(0);
          qj.c((byte) -115);
          ai.a((byte) 67);
          kb.b(false);
          ub.a(-31455);
          i.c(true);
          uh.c(-21);
          cd.a(107);
          dk.a((byte) 127);
          we.a(-11509);
          gj.b(-102);
          ci.d(-120);
          ig.i((byte) -49);
          kl.a(6);
          fa.f(-121);
          qb.a((byte) -62);
          ce.a((byte) -127);
          qi.a(74);
          rj.a(false);
          sb.a();
          mh.a(0);
          gb.a(param0 - 5);
          oa.b((byte) -99);
          lk.a((byte) -124);
          bc.a(122);
          n.a(false);
          vf.a(true);
          ql.a(100);
          ne.a((byte) 68);
          aa.a(param0 ^ 3);
          sg.a((byte) -121);
          ok.a(42);
          af.a((byte) 22);
          of.a(-21068);
          td.b(0);
          cj.a((byte) 119);
          gg.c(127);
          dg.a(-1);
          ea.b((byte) 100);
          mg.a((byte) -28);
          bl.b(116);
          vg.a((byte) -60);
          nf.a((byte) -41);
          gk.a(9);
          wf.a(false);
          lc.e(-122);
          ul.b();
          ej.b(false);
          qh.f();
          oj.e(param0 ^ 111);
          ga.a(true);
          al.a(-84);
          pg.a((byte) -119);
          l.a((byte) 108);
          kg.a();
          tb.a(true);
          fj.a((byte) -101);
          el.a((byte) 99);
          qd.c(69);
          ih.a((byte) -46);
          ad.a(1);
          lb.a((byte) 103);
          il.a((byte) -24);
          da.i(param0 ^ param0);
          sf.c(true);
          sd.e((byte) 4);
          rf.r(param0 - 2394);
          ik.s(param0 ^ 107);
          wl.d((byte) 66);
          jk.m(486302657);
          ff.m(param0 + 124);
          ck.l(-123);
          hg.b((byte) -15);
          vd.a((byte) -126);
          jj.a(96);
          mj.a();
          ml.c();
          mb.a();
          hk.a((byte) 35);
          ri.a((byte) 18);
          k.a(false);
          se.c((byte) 99);
          id.a((byte) 92);
          ei.a((byte) -110);
          j.a((byte) -119);
          ld.a(102);
          sj.b((byte) -15);
          ua.a(-124);
          hj.m(param0 ^ 252);
          d.a(1);
          uc.a(0);
          eh.a((byte) 26);
          ic.a(param0 ^ 2);
          bh.a(126);
          nk.a((byte) -119);
          kk.a(false);
          ug.a((byte) 118);
          mc.a(true);
          ef.a(-106);
          nd.e(0);
          tj.d((byte) 107);
          bk.b(-123);
          pj.g(124);
          ak.a((byte) 116);
          be.c((byte) 113);
          di.b(54);
          eg.a((byte) 66);
          rh.b(true);
          ec.c(0);
          rl.b(7);
          db.a(8192);
          dj.a(48);
          gf.a();
          re.a((byte) -37);
          ch.a(807);
          ll.q(5);
          u.a((byte) 125);
          h.a(95);
          ka.a();
          hd.c((byte) -104);
          oe.a(-27273);
          e.b(62);
          f.a(false);
          qf.a(param0 ^ 3);
          uf.a(103);
          tg.a(false);
          de.a((byte) -79);
          th.a((byte) -42);
          ae.b(-116);
          bj.c((byte) -79);
          wb.b((byte) 83);
          ah.a(param0 ^ -23430);
          c.a(param0 + 18123);
          ba.d(param0 - 1);
          fd.a(127);
          wi.a(66);
          pa.a(122);
          ij.a(2);
          ue.a((byte) 18);
          lj.c(true);
          fi.h(param0 ^ 30382);
          bi.o(-31);
          mk.n(param0 - 116);
          aj.h(32);
          rd.a(param0 ^ 31);
          cc.a(true);
          rk.b(false);
          pc.c(1);
          wc.a(7);
          lf.a(66);
          vj.a((byte) 40);
          pe.a((byte) -102);
          rb.a(-53);
          ha.a(-19424);
          kf.e(123);
          fg.b((byte) 107);
          og.a(false);
          nb.a(param0 + 17);
          wd.a((byte) 126);
          si.a((byte) 106);
          nh.a(-33);
          oc.i(124);
          vc.p(93);
          rg.g((byte) -43);
          a.e((byte) -13);
          qe.i(-156630320);
          dh.l(-1);
          le.i(param0 - 4);
          ve.a((byte) -108);
          ob.k(-128);
          bf.a((byte) 16);
          me.a((byte) 122);
          v.a(17320);
          ge.n(1843);
          wh.h(43);
          fk.a((byte) 114);
          jg.a();
          pi.a((byte) -110);
          mf.a(true);
          nl.d(-114);
          hf.a((byte) 118);
          jh.c(-1);
          te.a((byte) 41);
          vl.i(2147483647);
          g.i(19224);
          vi.a(param0 + 62);
          pf.a(17205);
          dl.b(false);
          hc.d((byte) 105);
          je.a((byte) -128);
          w.b((byte) -117);
          wg.a(20738);
          o.d(0);
          am.a((byte) 5);
          ta.a(param0 + 4);
          od.b(true);
          ek.a((byte) -38);
          ni.b(param0 + 252);
          nc.c(94);
          kd.a(-73);
          gl.i(param0 ^ 2480);
          ng.a((byte) 122);
          qk.a((byte) -86);
          oh.a((byte) 104);
          gd.d(111);
          pd.b((byte) -74);
          uj.b(-1);
          fc.a(false);
          hi.a(false);
          b.d(-22826);
          ee.l(-31263);
          kh.a(0);
          wj.c(param0 ^ 483);
          bd.b(true);
          ac.a((byte) -114);
          sh.a(false);
          ia.a((byte) -4);
          oi.d(-97);
          jl.a((byte) 27);
          he.a((byte) 58);
          gh.e(58);
          ab.b(-2147483648);
          ol.a(false);
          li.h(param0 ^ 122);
          bg.b((byte) 54);
          vh.b((byte) 118);
          md.b(true);
          wk.a(-30254);
          nj.d(param0 ^ -115);
          rc.a(true);
          ca.d(param0 ^ -577295245);
          q.a(4);
          this.field_q = null;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "Transmogrify.J(" + param0 + ')');
        }
    }

    static {
        field_E = "OK";
    }
}
