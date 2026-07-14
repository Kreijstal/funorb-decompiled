/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class Transmogrify extends ig {
    static String field_B;
    static String field_E;
    static int field_D;
    public static boolean field_A;

    final void e(int param0) {
        if (param0 != 0) {
            field_E = null;
        }
        gl.j(param0 + 31107);
        if (!(ub.field_c == null)) {
            qd.b(5);
        }
        lf.a(true);
    }

    public static void l(int param0) {
        L0: {
          field_B = null;
          field_E = null;
          if (param0 == 0) {
            break L0;
          } else {
            boolean discarded$2 = Transmogrify.d(false);
            break L0;
          }
        }
    }

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        gd var6 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var4 = field_A ? 1 : 0;
          sf.v(107);
          if (null == ub.field_c) {
            break L0;
          } else {
            if (!ub.field_c.field_c) {
              break L0;
            } else {
              qd.b(5);
              wk.b((byte) -120);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = 10017;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (ub.field_c == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((Transmogrify) this).a(stackIn_6_1, stackIn_6_2 != 0);
          if (!wf.field_a) {
            break L2;
          } else {
            this.j(-7632);
            wf.field_a = false;
            break L2;
          }
        }
        if (param0 <= -12) {
          L3: {
            L4: {
              if (!rd.b(63)) {
                break L4;
              } else {
                ((Transmogrify) this).b(false);
                if (!rd.b(72)) {
                  if (qj.b((byte) 99)) {
                    break L4;
                  } else {
                    sh.field_c = pj.a(29, (byte) -76, 3, 10, 1);
                    break L3;
                  }
                } else {
                  L5: {
                    if (pa.b(-120)) {
                      boolean discarded$1 = this.a((byte) -96, false);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              }
            }
            break L3;
          }
          L6: {
            gj.a(true, f.field_a);
            if (this.a((byte) -96, true)) {
              this.n(32198);
              vi.field_h = true;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!qj.b((byte) 122)) {
              L8: while (true) {
                var6 = (gd) (Object) mc.field_c.c(-128);
                if (var6 != null) {
                  te.a(var6, (byte) -10, 4);
                  continue L8;
                } else {
                  break L7;
                }
              }
            } else {
              break L7;
            }
          }
          L9: while (true) {
            if (!gj.a(ek.field_c, (byte) 114)) {
              L10: {
                rb.a(0, -377);
                if (vc.e(false)) {
                  var3 = ((Transmogrify) this).f((byte) 102);
                  if ((var3 ^ -1) != -3) {
                    break L10;
                  } else {
                    jd.a(240, 10, eh.field_c, 3, wf.field_d.field_y, 320, (kg) (Object) wf.field_d, wf.field_d.field_y * 3 / 2, 3, pf.field_h, false);
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              return;
            } else {
              ((Transmogrify) this).g(-89);
              continue L9;
            }
          }
        } else {
          return;
        }
    }

    final static String k(int param0) {
        if (param0 != 72) {
            field_D = -63;
        }
        return nf.field_l.g(12248);
    }

    final static void m(int param0) {
        hj var1 = null;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = field_A ? 1 : 0;
          if (param0 > 85) {
            break L0;
          } else {
            field_B = null;
            break L0;
          }
        }
        var1 = ff.field_D;
        L1: while (true) {
          if (!cg.g(-5591)) {
            return;
          } else {
            var1.a(false, 8);
            var1.field_h = var1.field_h + 1;
            var2 = var1.field_h + 1;
            lc.a((byte) 65, var1);
            ff.field_D.a((byte) -42, var1.field_h - var2);
            continue L1;
          }
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        mi stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        mi stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        mi stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        int stackIn_24_4 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        mi stackIn_25_2 = null;
        int stackIn_25_3 = 0;
        int stackIn_25_4 = 0;
        int stackIn_25_5 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        mi stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        mi stackIn_27_2 = null;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        mi stackIn_28_4 = null;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        mi stackIn_29_4 = null;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        mi stackIn_30_4 = null;
        int stackIn_30_5 = 0;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        mi stackIn_31_4 = null;
        int stackIn_31_5 = 0;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        mi stackIn_32_4 = null;
        int stackIn_32_5 = 0;
        int stackIn_32_6 = 0;
        int stackIn_32_7 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        mi stackIn_33_4 = null;
        int stackIn_33_5 = 0;
        int stackIn_33_6 = 0;
        int stackIn_33_7 = 0;
        int stackIn_33_8 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        mi stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        mi stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        int stackOut_23_4 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        mi stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        int stackOut_22_4 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        mi stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_24_5 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        mi stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        mi stackOut_25_2 = null;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        mi stackOut_27_4 = null;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        mi stackOut_29_4 = null;
        int stackOut_29_5 = 0;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        mi stackOut_28_4 = null;
        int stackOut_28_5 = 0;
        int stackOut_28_6 = 0;
        int stackOut_28_7 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        mi stackOut_30_4 = null;
        int stackOut_30_5 = 0;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        mi stackOut_32_4 = null;
        int stackOut_32_5 = 0;
        int stackOut_32_6 = 0;
        int stackOut_32_7 = 0;
        int stackOut_32_8 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        mi stackOut_31_4 = null;
        int stackOut_31_5 = 0;
        int stackOut_31_6 = 0;
        int stackOut_31_7 = 0;
        int stackOut_31_8 = 0;
        L0: {
          var4 = field_A ? 1 : 0;
          if (lb.field_i != 0) {
            if (1 != lb.field_i) {
              if (2 == lb.field_i) {
                L1: {
                  if (qj.b((byte) 104)) {
                    be.field_q = hf.field_i;
                    break L1;
                  } else {
                    kb.field_n = l.a((byte) 12, 4);
                    ug.b(true);
                    sh.field_c = pj.a(29, (byte) 114, 3, 10, 1);
                    be.field_q = vl.field_y;
                    break L1;
                  }
                }
                L2: {
                  if (be.field_q == -2) {
                    be.field_q = 0;
                    dj.a(true, true);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                lb.field_i = 3;
                qf.field_d = be.field_q;
                break L0;
              } else {
                lc.field_q = lc.field_q - 1;
                if ((lc.field_q ^ -1) != -1) {
                  break L0;
                } else {
                  lb.field_i = 0;
                  break L0;
                }
              }
            } else {
              lc.field_q = lc.field_q + 1;
              if ((lc.field_q ^ -1) != -17) {
                break L0;
              } else {
                L3: {
                  if (ll.c(true)) {
                    fg.d((byte) 91);
                    break L3;
                  } else {
                    qg.b(false);
                    break L3;
                  }
                }
                lb.field_i = 2;
                break L0;
              }
            }
          } else {
            if ((be.field_q ^ -1) == (qf.field_d ^ -1)) {
              if (be.field_q == -1) {
                ia.d(80);
                if (-2 == (qf.field_d ^ -1)) {
                  oh.field_j = oh.field_j + 1;
                  g.field_z = 0;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                ej.field_l[be.field_q].c((byte) 122);
                if (oh.field_j <= 2) {
                  break L0;
                } else {
                  if (-11 < (n.field_a ^ -1)) {
                    wk.field_c = wk.field_c + 1;
                    dc.field_a = dc.field_a + 1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            } else {
              L4: {
                lc.field_q = lc.field_q + 1;
                if (16 != lc.field_q + 1) {
                  if ((lc.field_q ^ -1) != -2) {
                    break L4;
                  } else {
                    if ((qf.field_d ^ -1) <= -1) {
                      L5: {
                        if (-1 != be.field_q) {
                          ej.field_l[qf.field_d].a(ej.field_l[be.field_q].field_j.field_f, param0 ^ 10923);
                          break L5;
                        } else {
                          ej.field_l[qf.field_d].a(false, 256);
                          break L5;
                        }
                      }
                      if (qf.field_d == 5) {
                        L6: {
                          var2 = 130;
                          var3 = wf.field_d.field_t + (wf.field_d.field_D + 4);
                          var2 = var2 + var3 * wf.field_d.b(sd.field_Q, 341);
                          stackOut_21_0 = var2;
                          stackOut_21_1 = var3;
                          stackOut_21_2 = wf.field_d;
                          stackOut_21_3 = 1;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          stackIn_23_2 = stackOut_21_2;
                          stackIn_23_3 = stackOut_21_3;
                          stackIn_22_0 = stackOut_21_0;
                          stackIn_22_1 = stackOut_21_1;
                          stackIn_22_2 = stackOut_21_2;
                          stackIn_22_3 = stackOut_21_3;
                          if (-1 == (hc.field_u ^ -1)) {
                            stackOut_23_0 = stackIn_23_0;
                            stackOut_23_1 = stackIn_23_1;
                            stackOut_23_2 = (mi) (Object) stackIn_23_2;
                            stackOut_23_3 = stackIn_23_3;
                            stackOut_23_4 = 0;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            stackIn_24_2 = stackOut_23_2;
                            stackIn_24_3 = stackOut_23_3;
                            stackIn_24_4 = stackOut_23_4;
                            break L6;
                          } else {
                            stackOut_22_0 = stackIn_22_0;
                            stackOut_22_1 = stackIn_22_1;
                            stackOut_22_2 = (mi) (Object) stackIn_22_2;
                            stackOut_22_3 = stackIn_22_3;
                            stackOut_22_4 = 1;
                            stackIn_24_0 = stackOut_22_0;
                            stackIn_24_1 = stackOut_22_1;
                            stackIn_24_2 = stackOut_22_2;
                            stackIn_24_3 = stackOut_22_3;
                            stackIn_24_4 = stackOut_22_4;
                            break L6;
                          }
                        }
                        L7: {
                          stackOut_24_0 = stackIn_24_0;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = (mi) (Object) stackIn_24_2;
                          stackOut_24_3 = stackIn_24_3;
                          stackOut_24_4 = stackIn_24_4;
                          stackOut_24_5 = 0;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          stackIn_26_3 = stackOut_24_3;
                          stackIn_26_4 = stackOut_24_4;
                          stackIn_26_5 = stackOut_24_5;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          stackIn_25_3 = stackOut_24_3;
                          stackIn_25_4 = stackOut_24_4;
                          stackIn_25_5 = stackOut_24_5;
                          if (0 == pf.field_g) {
                            stackOut_26_0 = stackIn_26_0;
                            stackOut_26_1 = stackIn_26_1;
                            stackOut_26_2 = (mi) (Object) stackIn_26_2;
                            stackOut_26_3 = stackIn_26_3;
                            stackOut_26_4 = stackIn_26_4;
                            stackOut_26_5 = stackIn_26_5;
                            stackOut_26_6 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            stackIn_27_2 = stackOut_26_2;
                            stackIn_27_3 = stackOut_26_3;
                            stackIn_27_4 = stackOut_26_4;
                            stackIn_27_5 = stackOut_26_5;
                            stackIn_27_6 = stackOut_26_6;
                            break L7;
                          } else {
                            stackOut_25_0 = stackIn_25_0;
                            stackOut_25_1 = stackIn_25_1;
                            stackOut_25_2 = (mi) (Object) stackIn_25_2;
                            stackOut_25_3 = stackIn_25_3;
                            stackOut_25_4 = stackIn_25_4;
                            stackOut_25_5 = stackIn_25_5;
                            stackOut_25_6 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            stackIn_27_2 = stackOut_25_2;
                            stackIn_27_3 = stackOut_25_3;
                            stackIn_27_4 = stackOut_25_4;
                            stackIn_27_5 = stackOut_25_5;
                            stackIn_27_6 = stackOut_25_6;
                            break L7;
                          }
                        }
                        L8: {
                          var2 = stackIn_27_0 + stackIn_27_1 * ((mi) (Object) stackIn_27_2).b(aj.a(stackIn_27_3 != 0, stackIn_27_4 != 0, stackIn_27_5 != 0, stackIn_27_6 != 0), 341);
                          fd.field_a[5] = var2 - -10;
                          stackOut_27_0 = fd.field_b;
                          stackOut_27_1 = 5;
                          stackOut_27_2 = var3 + jk.field_x.a(true);
                          stackOut_27_3 = var3;
                          stackOut_27_4 = wf.field_d;
                          stackOut_27_5 = -127;
                          stackOut_27_6 = 0;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_29_1 = stackOut_27_1;
                          stackIn_29_2 = stackOut_27_2;
                          stackIn_29_3 = stackOut_27_3;
                          stackIn_29_4 = stackOut_27_4;
                          stackIn_29_5 = stackOut_27_5;
                          stackIn_29_6 = stackOut_27_6;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          stackIn_28_2 = stackOut_27_2;
                          stackIn_28_3 = stackOut_27_3;
                          stackIn_28_4 = stackOut_27_4;
                          stackIn_28_5 = stackOut_27_5;
                          stackIn_28_6 = stackOut_27_6;
                          if (0 == pf.field_g) {
                            stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                            stackOut_29_1 = stackIn_29_1;
                            stackOut_29_2 = stackIn_29_2;
                            stackOut_29_3 = stackIn_29_3;
                            stackOut_29_4 = (mi) (Object) stackIn_29_4;
                            stackOut_29_5 = stackIn_29_5;
                            stackOut_29_6 = stackIn_29_6;
                            stackOut_29_7 = 0;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            stackIn_30_2 = stackOut_29_2;
                            stackIn_30_3 = stackOut_29_3;
                            stackIn_30_4 = stackOut_29_4;
                            stackIn_30_5 = stackOut_29_5;
                            stackIn_30_6 = stackOut_29_6;
                            stackIn_30_7 = stackOut_29_7;
                            break L8;
                          } else {
                            stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                            stackOut_28_1 = stackIn_28_1;
                            stackOut_28_2 = stackIn_28_2;
                            stackOut_28_3 = stackIn_28_3;
                            stackOut_28_4 = (mi) (Object) stackIn_28_4;
                            stackOut_28_5 = stackIn_28_5;
                            stackOut_28_6 = stackIn_28_6;
                            stackOut_28_7 = 1;
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            stackIn_30_2 = stackOut_28_2;
                            stackIn_30_3 = stackOut_28_3;
                            stackIn_30_4 = stackOut_28_4;
                            stackIn_30_5 = stackOut_28_5;
                            stackIn_30_6 = stackOut_28_6;
                            stackIn_30_7 = stackOut_28_7;
                            break L8;
                          }
                        }
                        L9: {
                          stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                          stackOut_30_1 = stackIn_30_1;
                          stackOut_30_2 = stackIn_30_2;
                          stackOut_30_3 = stackIn_30_3;
                          stackOut_30_4 = (mi) (Object) stackIn_30_4;
                          stackOut_30_5 = stackIn_30_5;
                          stackOut_30_6 = stackIn_30_6;
                          stackOut_30_7 = stackIn_30_7;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_32_1 = stackOut_30_1;
                          stackIn_32_2 = stackOut_30_2;
                          stackIn_32_3 = stackOut_30_3;
                          stackIn_32_4 = stackOut_30_4;
                          stackIn_32_5 = stackOut_30_5;
                          stackIn_32_6 = stackOut_30_6;
                          stackIn_32_7 = stackOut_30_7;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          stackIn_31_2 = stackOut_30_2;
                          stackIn_31_3 = stackOut_30_3;
                          stackIn_31_4 = stackOut_30_4;
                          stackIn_31_5 = stackOut_30_5;
                          stackIn_31_6 = stackOut_30_6;
                          stackIn_31_7 = stackOut_30_7;
                          if (-1 == (hc.field_u ^ -1)) {
                            stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                            stackOut_32_1 = stackIn_32_1;
                            stackOut_32_2 = stackIn_32_2;
                            stackOut_32_3 = stackIn_32_3;
                            stackOut_32_4 = (mi) (Object) stackIn_32_4;
                            stackOut_32_5 = stackIn_32_5;
                            stackOut_32_6 = stackIn_32_6;
                            stackOut_32_7 = stackIn_32_7;
                            stackOut_32_8 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            stackIn_33_2 = stackOut_32_2;
                            stackIn_33_3 = stackOut_32_3;
                            stackIn_33_4 = stackOut_32_4;
                            stackIn_33_5 = stackOut_32_5;
                            stackIn_33_6 = stackOut_32_6;
                            stackIn_33_7 = stackOut_32_7;
                            stackIn_33_8 = stackOut_32_8;
                            break L9;
                          } else {
                            stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = stackIn_31_2;
                            stackOut_31_3 = stackIn_31_3;
                            stackOut_31_4 = (mi) (Object) stackIn_31_4;
                            stackOut_31_5 = stackIn_31_5;
                            stackOut_31_6 = stackIn_31_6;
                            stackOut_31_7 = stackIn_31_7;
                            stackOut_31_8 = 1;
                            stackIn_33_0 = stackOut_31_0;
                            stackIn_33_1 = stackOut_31_1;
                            stackIn_33_2 = stackOut_31_2;
                            stackIn_33_3 = stackOut_31_3;
                            stackIn_33_4 = stackOut_31_4;
                            stackIn_33_5 = stackOut_31_5;
                            stackIn_33_6 = stackOut_31_6;
                            stackIn_33_7 = stackOut_31_7;
                            stackIn_33_8 = stackOut_31_8;
                            break L9;
                          }
                        }
                        stackIn_33_0[stackIn_33_1] = stackIn_33_2 + stackIn_33_3 * ((mi) (Object) stackIn_33_4).b(gd.a((byte) stackIn_33_5, stackIn_33_6 != 0, stackIn_33_7 != 0, stackIn_33_8 != 0), 341);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  L10: {
                    if (2 != be.field_q) {
                      break L10;
                    } else {
                      sh.field_c = null;
                      break L10;
                    }
                  }
                  L11: {
                    if (-6 != (be.field_q ^ -1)) {
                      break L11;
                    } else {
                      if (qj.b((byte) 99)) {
                        rh.field_n = 0;
                        hc.field_u = 0;
                        mc.field_c.g(-1);
                        pf.field_g = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  lc.field_q = 0;
                  be.field_q = qf.field_d;
                  if ((be.field_q ^ -1) == -1) {
                    wd.a(17099, true, bd.field_u[6]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              eg.field_b = eg.field_b + 1;
              if (oh.field_j <= 2) {
                break L0;
              } else {
                if (10 > n.field_a) {
                  wk.field_c = wk.field_c + 1;
                  dc.field_a = dc.field_a + 1;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L12: {
          if (param0 == 11179) {
            break L12;
          } else {
            ((Transmogrify) this).a(60);
            break L12;
          }
        }
    }

    final void b(int param0) {
        Object var2 = null;
        int var10 = 0;
        Object var11 = null;
        Object stackIn_3_0 = null;
        int stackIn_8_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        dg stackOut_1_0 = null;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        L0: {
          var10 = field_A ? 1 : 0;
          if (ub.field_c == null) {
            stackOut_2_0 = gd.field_k;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ub.field_c;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var11 = stackIn_3_0;
        var2 = var11;
        if (rd.b(65)) {
          L1: {
            if (null != ub.field_c) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = rj.field_b;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L1;
            }
          }
          da.a(stackIn_8_0 != 0, (byte) 119, (java.awt.Canvas) var11);
          return;
        } else {
          ng.a(false, (java.awt.Canvas) var11);
          return;
        }
    }

    public Transmogrify() {
    }

    private final boolean a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        ad[] var5 = null;
        int var6_int = 0;
        nf var6 = null;
        int var7_int = 0;
        sj var7 = null;
        int var8_int = 0;
        sj var8 = null;
        int var9_int = 0;
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
        var10 = field_A ? 1 : 0;
        if (null != pc.field_a) {
          L0: {
            if (!li.field_k.a((byte) -116)) {
              break L0;
            } else {
              if (!li.field_k.a((byte) -98, "basic")) {
                break L0;
              } else {
                L1: {
                  if (!pc.field_a.a((byte) -120)) {
                    break L1;
                  } else {
                    if (pc.field_a.c(param0 ^ -32065)) {
                      L2: {
                        if (!di.field_h.a((byte) -116)) {
                          break L2;
                        } else {
                          if (!di.field_h.c(32031)) {
                            break L2;
                          } else {
                            L3: {
                              if (!be.field_n.a((byte) -117)) {
                                break L3;
                              } else {
                                if (!be.field_n.c(32031)) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (!ta.field_d.a((byte) -115)) {
                                      break L4;
                                    } else {
                                      if (ta.field_d.c(32031)) {
                                        L5: {
                                          if (!oi.field_g.a((byte) -128)) {
                                            break L5;
                                          } else {
                                            if (oi.field_g.a((byte) 123, "")) {
                                              L6: {
                                                if (!wl.a(false, 0)) {
                                                  break L6;
                                                } else {
                                                  L7: {
                                                    if (!oi.field_g.a((byte) -113)) {
                                                      break L7;
                                                    } else {
                                                      if (oi.field_g.a((byte) 121, "halloween")) {
                                                        break L6;
                                                      } else {
                                                        break L7;
                                                      }
                                                    }
                                                  }
                                                  vf.a((byte) 36, 50.0f, ee.a(q.field_e, (byte) 114, ih.field_c, oi.field_g, "halloween"));
                                                  return false;
                                                }
                                              }
                                              L8: {
                                                if (!kk.field_a.a((byte) -118)) {
                                                  break L8;
                                                } else {
                                                  if (kk.field_a.c(32031)) {
                                                    if (li.field_k.a((byte) 126, "arialish12")) {
                                                      if (!ig.field_y.a((byte) 118, "arialish12")) {
                                                        vf.a((byte) -125, 52.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish12"));
                                                        return false;
                                                      } else {
                                                        if (li.field_k.a((byte) -13, "arialish20")) {
                                                          if (ig.field_y.a((byte) 117, "arialish20")) {
                                                            L9: {
                                                              if (!l.field_a.a((byte) -124)) {
                                                                break L9;
                                                              } else {
                                                                if (l.field_a.c(32031)) {
                                                                  vf.a((byte) 17, 73.0f, q.field_c);
                                                                  if (!param1) {
                                                                    return false;
                                                                  } else {
                                                                    cg.b((byte) -121);
                                                                    ((Transmogrify) this).b(15648);
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
                                                                } else {
                                                                  break L9;
                                                                }
                                                              }
                                                            }
                                                            vf.a((byte) -4, 54.0f, rj.a(l.field_a, (byte) -38));
                                                            return false;
                                                          } else {
                                                            vf.a((byte) -123, 53.0f, ee.a(dj.field_a, (byte) 123, i.field_c, li.field_k, "arialish20"));
                                                            return false;
                                                          }
                                                        } else {
                                                          vf.a((byte) 83, 53.0f, ee.a(dj.field_a, (byte) 106, i.field_c, li.field_k, "arialish20"));
                                                          return false;
                                                        }
                                                      }
                                                    } else {
                                                      vf.a((byte) -128, 52.0f, ee.a(dj.field_a, (byte) 102, i.field_c, li.field_k, "arialish12"));
                                                      return false;
                                                    }
                                                  } else {
                                                    break L8;
                                                  }
                                                }
                                              }
                                              vf.a((byte) 11, 51.0f, ee.a(dj.field_a, (byte) 75, i.field_c, kk.field_a, ""));
                                              return false;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        vf.a((byte) -128, 50.0f, ee.a(vg.field_a, (byte) 73, aa.field_f, oi.field_g, ""));
                                        return false;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  vf.a((byte) -128, 49.0f, ee.a(i.field_d, (byte) 97, kh.field_e, ta.field_d, ""));
                                  return false;
                                }
                              }
                            }
                            vf.a((byte) 25, 48.0f, fg.a(kh.field_e, be.field_n, 0, i.field_d, 32389));
                            return false;
                          }
                        }
                      }
                      vf.a((byte) -10, 2.0f, ee.a(i.field_d, (byte) 74, kh.field_e, di.field_h, ""));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                vf.a((byte) 90, 1.0f, ee.a(oc.field_H, (byte) 71, k.field_e, pc.field_a, ""));
                return false;
              }
            }
          }
          vf.a((byte) -121, 0.0f, ee.a(vg.field_a, (byte) 100, aa.field_f, li.field_k, "basic"));
          return false;
        } else {
          if (null == di.field_h) {
            if (null != ta.field_d) {
              vf.a((byte) -125, 75.0f, db.field_f);
              ((Transmogrify) this).b(15648);
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
              el.b(param0 + -6395);
              return false;
            } else {
              if (be.field_n == null) {
                L10: {
                  if (null != gb.field_a) {
                    break L10;
                  } else {
                    if (null == wf.field_d) {
                      vf.a((byte) -125, 92.0f, ha.field_b);
                      ((Transmogrify) this).b(param0 ^ -15744);
                      gb.field_a = ej.a((byte) -43, li.field_k, "", "arialish20");
                      el.b(-6491);
                      return false;
                    } else {
                      break L10;
                    }
                  }
                }
                if (le.field_A != null) {
                  L11: {
                    if (param0 == -96) {
                      break L11;
                    } else {
                      field_B = null;
                      break L11;
                    }
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
                    var4 = 0;
                    L12: while (true) {
                      if ((var4 ^ -1) <= (sb.field_h.length ^ -1)) {
                        L13: {
                          rk.field_r[4].e();
                          uj.field_e.f(0, 0);
                          if (!wl.a(false, 0)) {
                            pc.a("", "achievementsbg_nobox", oi.field_g, -126).c(0, 0);
                            break L13;
                          } else {
                            pc.a("halloween", "achievementsbg_nobox", oi.field_g, 18).c(0, 0);
                            break L13;
                          }
                        }
                        L14: {
                          var12.e(0, 0, 166);
                          wf.a(kk.field_d, 377, 7, 258, 2363394, 361, 72);
                          mk.field_y.c(337, 14);
                          rk.field_r[6] = rk.field_r[4];
                          rk.field_r[1] = new ti(640, 480);
                          rk.field_r[1].e();
                          uj.field_e.f(0, 0);
                          if (!wl.a(false, 0)) {
                            pc.a("", "pausemenu_nobox", oi.field_g, param0 ^ -1).c(0, 0);
                            break L14;
                          } else {
                            pc.a("halloween", "pausemenu_nobox", oi.field_g, -127).c(0, 0);
                            break L14;
                          }
                        }
                        wf.a(kk.field_d, 347, param0 + 103, 140, 2363394, 361, 72);
                        wf.a(ck.field_C, 347, 7, 140, 16777215, 361, 72);
                        pf.field_d.c(219, 14);
                        ri.field_k.a(param0 ^ -47);
                        rk.field_r[7] = rk.field_r[1];
                        el.b(-6491);
                        return false;
                      } else {
                        L15: {
                          if ((sb.field_h[var4] ^ -1) != -1) {
                            sb.field_h[var4] = 16777215;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var4++;
                        continue L12;
                      }
                    }
                  } else {
                    if (rk.field_r[0] != null) {
                      if (l.field_a == null) {
                        var3 = 0;
                        L16: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            be.field_q = 0;
                            ek.a(118);
                            el.b(-6491);
                            return true;
                          } else {
                            ej.field_l[var3] = new vg(var3);
                            var3++;
                            continue L16;
                          }
                        }
                      } else {
                        vf.a((byte) -11, 93.0f, vh.field_k);
                        ((Transmogrify) this).b(param0 + 15744);
                        var15 = kl.b(param0 + 12, l.field_a);
                        var4 = 0;
                        var5_int = 0;
                        L17: while (true) {
                          if (var5_int >= var15.length) {
                            var4--;
                            var16 = new ad[var4];
                            var5 = var16;
                            var6_int = var15.length - 1;
                            L18: while (true) {
                              if (-1 < (var6_int ^ -1)) {
                                we.field_l = new nf[var16.length];
                                var6_int = 0;
                                L19: while (true) {
                                  if ((var6_int ^ -1) <= (we.field_l.length ^ -1)) {
                                    var6 = we.field_l[am.field_n];
                                    var17 = w.a(de.field_d, 1, var6, (byte) 60, var6.field_d.charAt(0));
                                    var17.field_g = 1000;
                                    var8 = var17;
                                    var8.field_j = 1000;
                                    ob.a(1, 1, var17, 0);
                                    ue.field_c[1].field_h = var6.field_c.field_D - -8;
                                    var17.d(1);
                                    sg.field_p = w.a(de.field_d, 1, var6, (byte) 88, var6.field_n.charAt(1));
                                    var18 = w.a(de.field_d, 1, var6, (byte) 88, var6.field_n.charAt(1));
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
                                  } else {
                                    L20: {
                                      we.field_l[var6_int] = new nf(oi.field_g, kk.field_a, var16[var6_int]);
                                      if (we.field_l[var6_int].field_j.equals((Object) (Object) hi.field_d)) {
                                        am.field_n = var6_int;
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    var6_int++;
                                    continue L19;
                                  }
                                }
                              } else {
                                L21: {
                                  if (var15[var6_int] != null) {
                                    var4--;
                                    var5[var4] = var15[var6_int];
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                var6_int--;
                                continue L18;
                              }
                            }
                          } else {
                            L22: {
                              if (var15[var5_int] != null) {
                                var4++;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            var5_int++;
                            continue L17;
                          }
                        }
                      }
                    } else {
                      L23: {
                        if (wl.a(false, 0)) {
                          rk.field_r[0] = kf.a(pc.a("halloween", "mainmenu_packed", oi.field_g, -125), false, (byte) 101);
                          break L23;
                        } else {
                          rk.field_r[0] = kf.a(pc.a("", "mainmenu_packed", oi.field_g, -5), false, (byte) -93);
                          break L23;
                        }
                      }
                      L24: {
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
                          break L24;
                        } else {
                          pc.a("", "highscorebg_nobox", oi.field_g, -126).c(0, 0);
                          break L24;
                        }
                      }
                      a.field_R.c(10, 10);
                      wf.a(kk.field_d, 377, 7, 217, 2363394, 361, 20);
                      wf.a(ck.field_C, 377, param0 + 103, 217, 16777215, 361, 20);
                      ri.field_k.a(117);
                      jl.field_l = pc.a("", "intro_bigstar", oi.field_g, param0 ^ -58);
                      gk.field_c = kl.a(oi.field_g, (byte) 124, "", "intro_stars");
                      ij.field_h = pc.a("", "intro_host", oi.field_g, -124);
                      hc.field_r = pc.a("", "intro_hostess", oi.field_g, 95);
                      rh.field_s = kf.a(pc.a("", "intro_logo_packed", oi.field_g, param0 + -31), false, (byte) 126);
                      rh.field_s.b();
                      kk.field_d = null;
                      ck.field_C = null;
                      pf.field_d = null;
                      uj.field_e = null;
                      fc.field_h = kl.a(oi.field_g, (byte) 126, "", "achievements");
                      var13 = fc.field_h;
                      var4 = 0;
                      L25: while (true) {
                        if ((var13.length ^ -1) >= (var4 ^ -1)) {
                          L26: {
                            if (wl.a(false, 0)) {
                              ij.field_h = pc.a("halloween", "intro_host", oi.field_g, -128);
                              hc.field_r = pc.a("halloween", "intro_hostess", oi.field_g, 59);
                              qe.field_F = kl.a(oi.field_g, (byte) 127, "halloween", "hostanims_uniq");
                              rk.field_r[3] = pc.a("halloween", "instructions_bg", oi.field_g, -12);
                              dh.field_B = pc.a("halloween", "background", oi.field_g, 19);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          hk.a((kg) (Object) wf.field_d, param0 + 98, 400, (kg) (Object) wf.field_d);
                          ej.a(16, (byte) 108, 8, 2, new pg(pf.field_h), new pg(eh.field_c));
                          vf.a(new pg(mk.field_B), 10, 10, param0 + 211);
                          el.b(-6491);
                          return false;
                        } else {
                          var14 = var13[var4];
                          nh.a(var14, (byte) 110);
                          var4++;
                          continue L25;
                        }
                      }
                    }
                  }
                } else {
                  L27: {
                    var21 = ig.field_y.a("", (byte) 92, "arialish20");
                    wf.field_d = jd.a(var21, 98, gb.field_a);
                    og.field_a = ua.a(oi.field_g, "", 32, kk.field_a, "arialish20narrow");
                    le.field_A = eh.a(gb.field_a, param0 ^ -96, var21, 255, 119);
                    le.field_A.field_K[1] = new int[3];
                    hk.field_a = am.a("", li.field_k, (byte) 72, ig.field_y, "arialish12");
                    gb.field_a = null;
                    wf.field_d.a((k[]) (Object) ue.field_c, (int[]) null);
                    hk.field_a.a((k[]) (Object) ue.field_c, (int[]) null);
                    ff.field_z = pc.a("basic", "unachieved", li.field_k, param0 ^ 33);
                    nh.a(ff.field_z, (byte) 59);
                    var4 = wf.field_d.field_t + wf.field_d.field_y;
                    c.field_a = pc.a("basic", "orbcoin", li.field_k, param0 ^ 33);
                    li.field_k = null;
                    ig.field_y = null;
                    og.field_b = new ti(var4, var4);
                    og.field_b.e();
                    c.field_a.a(0, 0, var4, var4);
                    c.field_a = null;
                    ri.field_k.a(115);
                    dh.field_B = pc.a("", "background", oi.field_g, param0 + -28);
                    qe.field_F = kl.a(oi.field_g, (byte) 127, "", "hostanims_uniq");
                    mk.field_B = kl.a(oi.field_g, (byte) 125, "", "dialog_frame");
                    pf.field_h = kl.a(oi.field_g, (byte) 125, "", "button_frame");
                    eh.field_c = kl.a(oi.field_g, (byte) 121, "", "button_frame_hi");
                    jk.field_x = new mg(ej.a((byte) -43, oi.field_g, "var_button", ""));
                    var5_int = wf.field_d.a(mc.field_a[0]);
                    var6_int = wf.field_d.a(mc.field_a[1]);
                    if ((var5_int ^ -1) > (var6_int ^ -1)) {
                      var5_int = var6_int;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    var6_int = wf.field_d.a(mc.field_a[2]);
                    tb.field_b = new ti[3];
                    if ((var6_int ^ -1) >= (var5_int ^ -1)) {
                      break L28;
                    } else {
                      var5_int = var6_int;
                      break L28;
                    }
                  }
                  var5_int += 16;
                  var7_int = 4 - -wf.field_d.field_y + wf.field_d.field_t;
                  var8_int = 0;
                  L29: while (true) {
                    if (var8_int >= 3) {
                      ri.field_k.a(param0 + 199);
                      el.b(-6491);
                      return false;
                    } else {
                      tb.field_b[var8_int] = new ti(var5_int, var7_int);
                      tb.field_b[var8_int].e();
                      dk.a(var7_int, mk.field_B, -28018, 0, 0, var5_int);
                      var9_int = 0;
                      L30: while (true) {
                        if ((sb.field_h.length ^ -1) >= (var9_int ^ -1)) {
                          wf.field_d.c(mc.field_a[var8_int], var5_int >> 828777697, wf.field_d.field_y + 2, 1, -1);
                          var8_int++;
                          continue L29;
                        } else {
                          L31: {
                            if (-1 == (sb.field_h[var9_int] ^ -1)) {
                              break L31;
                            } else {
                              if (7500402 <= sb.field_h[var9_int]) {
                                break L31;
                              } else {
                                sb.field_h[var9_int] = 7500402;
                                break L31;
                              }
                            }
                          }
                          var9_int++;
                          continue L30;
                        }
                      }
                    }
                  }
                }
              } else {
                var3 = 0;
                L32: while (true) {
                  if (10 <= var3) {
                    jk.field_D.d(true);
                    rc.field_a = null;
                    be.field_n = null;
                    el.b(-6491);
                    return false;
                  } else {
                    L33: {
                      if (bd.field_u[var3] == null) {
                        break L33;
                      } else {
                        if (!jk.field_D.a(176400, false, rc.field_a, bd.field_u[var3], be.field_n)) {
                          return false;
                        } else {
                          break L33;
                        }
                      }
                    }
                    var3++;
                    continue L32;
                  }
                }
              }
            }
          } else {
            vf.a((byte) -121, 74.0f, q.field_c);
            ((Transmogrify) this).b(15648);
            dg.field_d[10] = ml.a(di.field_h, "", "trans14_crowd_cheer_long").b();
            dg.field_d[11] = ml.a(di.field_h, "", "trans15_crowd_cheer_short").b();
            var3 = 95190;
            var4 = 275371;
            dg.field_d[9] = ec.a(var4, 0, var3, dg.field_d[10]);
            dg.field_d[8] = ec.a(dg.field_d[10].field_l.length, 0, var4, dg.field_d[10]);
            dg.field_d[12] = ec.a(dg.field_d[10].field_l.length, 0, var3, dg.field_d[10]);
            di.field_h = null;
            el.b(-6491);
            return false;
          }
        }
    }

    final void a(int param0) {
        ((Transmogrify) this).a(8, param0 ^ -10, 13, 9, 11, 0, false, 10);
        lc var2 = new lc();
        if (param0 != -9) {
            return;
        }
        var2.b(128, 9, -23780);
        uh.a((java.awt.Component) (Object) gd.field_k, 22050, -21, lk.field_b, var2, true);
        uc.a(128, (byte) -119);
        u.field_b = 4473924;
        field_D = 128;
        pf.field_b = 255;
        ((Transmogrify) this).a(true, false, false, false, (byte) 9);
        ue.field_c = new ii[3];
    }

    private final void n(int param0) {
        L0: {
          if (qj.b((byte) 126)) {
            break L0;
          } else {
            if (kb.field_n == null) {
              kb.field_n = l.a((byte) 12, 4);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          wd.a(param0 + -15099, false, bd.field_u[0]);
          if (param0 == 32198) {
            break L1;
          } else {
            ((Transmogrify) this).c(9);
            break L1;
          }
        }
    }

    final static boolean d(boolean param0) {
        if (param0) {
            field_E = null;
            return true;
        }
        return true;
    }

    public final void init() {
        ((Transmogrify) this).a("transmogrify", false, 12);
    }

    private final void j(int param0) {
        L0: {
          if (null == nk.field_d) {
            break L0;
          } else {
            dl.a(nk.field_d, (byte) 119);
            nk.field_d = null;
            el.b(-6491);
            break L0;
          }
        }
        L1: {
          oi.field_g = cg.a((byte) -82, 1);
          pc.field_a = cg.a((byte) -82, 2);
          di.field_h = cg.a((byte) -82, 3);
          be.field_n = cg.a((byte) -82, 4);
          ta.field_d = cg.a((byte) -82, 5);
          l.field_a = cg.a((byte) -82, 6);
          kk.field_a = cg.a((byte) -82, 7);
          of.b(22);
          if (param0 == -7632) {
            break L1;
          } else {
            String discarded$2 = Transmogrify.k(115);
            break L1;
          }
        }
    }

    final void c(int param0) {
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
        gb.a(param0 + -5);
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
        rf.r(param0 + -2394);
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
        ba.d(param0 + -1);
        fd.a(127);
        wi.a(66);
        pa.a(122);
        ij.a(2);
        ue.a((byte) 18);
        lj.c(true);
        fi.h(param0 ^ 30382);
        bi.o(-31);
        mk.n(param0 + -116);
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
        le.i(param0 + -4);
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
        ((Transmogrify) this).field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "OK";
    }
}
