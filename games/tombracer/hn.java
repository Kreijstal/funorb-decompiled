/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hn extends kna {
    static String field_F;
    static String field_G;
    private int field_I;
    private int field_H;
    private int field_J;

    final boolean v(int param0) {
        if (param0 != 555277520) {
            Object var3 = null;
            fsa discarded$0 = ((hn) this).a(false, -3, (la) null);
            return true;
        }
        return true;
    }

    abstract boolean C(int param0);

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            ((hn) this).field_H = -72;
            return false;
        }
        return false;
    }

    void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            g discarded$0 = hn.b(88, -88);
        }
        if (!(!((hn) this).D(0))) {
            param1.a((byte) 107, ((hn) this).field_I, 3);
            if (!(0 >= ((hn) this).field_I)) {
                param1.a((byte) -128, ((hn) this).field_H, 2);
            }
        }
        if (!(!((hn) this).C(1))) {
            param1.a((byte) 100, ((hn) this).field_J, 2);
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var6 = new fsa(param2, param0);
        if (param1 != 3) {
            return null;
        }
        var6.b((byte) -11, ((hn) this).field_k, ((hn) this).field_l);
        var6.a((byte) -3, 0);
        var6.b((byte) 17, true);
        vd var5 = new vd(param2, param0);
        var5.b((byte) 105, false);
        var5.a((byte) -128, ((hn) this).a(param2, false, false));
        var5.a(((hn) this).a(5, false, param2), (byte) -94);
        var5.a(this.a(false, param2, (byte) -114), 2);
        var5.b(true, this.A(-1));
        var5.a(false, this.B(123));
        var6.a((byte) 83, (nv) (Object) var5);
        return var6;
    }

    abstract fsa a(la param0, boolean param1, boolean param2);

    hn(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        if (((hn) this).D(0)) {
            ((hn) this).field_I = param2.b((byte) 44, 3);
            if ((((hn) this).field_I ^ -1) < -1) {
                ((hn) this).field_H = param2.b((byte) 44, 2);
            }
        }
        if (((hn) this).C(1)) {
            ((hn) this).field_J = param2.b((byte) 44, 2);
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            ((hn) this).field_I = 109;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            Object var3 = null;
            fsa discarded$0 = ((hn) this).a(true, 54, (la) null);
        }
        return 7;
    }

    private final fsa a(boolean param0, la param1, byte param2) {
        int var5 = 0;
        ue var6 = null;
        int var7 = 0;
        dg var8 = null;
        fsa var9 = null;
        ue var10 = null;
        ue var11 = null;
        mfa var12 = null;
        if ((((hn) this).field_I ^ -1) < -1) {
          L0: {
            L1: {
              var9 = new fsa(param1, param0);
              var5 = -31 % ((param2 - -48) / 57);
              var9.b((byte) -11, 2097152, 2097152);
              var9.b((byte) 17, false);
              var7 = ((hn) this).field_H;
              if (var7 == 0) {
                break L1;
              } else {
                if (var7 != 1) {
                  break L1;
                } else {
                  var11 = new ue(param1, param0);
                  var11.a(0, false);
                  var6 = var11;
                  var9.a((byte) 83, (nv) (Object) var11);
                  break L0;
                }
              }
            }
            var10 = new ue(param1, param0);
            var10.a(1, false);
            var6 = var10;
            var9.a((byte) 83, (nv) (Object) var10);
            break L0;
          }
          var12 = rm.field_a;
          var8 = var12.a((gr) (Object) var6, (gma) (Object) var9, -102);
          var9.a((gr) (Object) var6, (byte) 124, var8);
          return var9;
        } else {
          return null;
        }
    }

    abstract boolean D(int param0);

    final static g b(int param0, int param1) {
        if (param0 != 0) {
            return null;
        }
        return sja.field_i[param1];
    }

    abstract fsa a(int param0, boolean param1, la param2);

    private final int B(int param0) {
        if (param0 <= 92) {
            return 85;
        }
        return 0;
    }

    final static void c(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jea var7_ref_jea = null;
        int var7 = 0;
        int var8 = 0;
        jea var8_ref_jea = null;
        int var9 = 0;
        tv var9_ref_tv = null;
        int var10 = 0;
        tv var10_ref_tv = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        jea stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        jea stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        jea stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_51_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        jea stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        jea stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        jea stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        L0: {
          var13 = TombRacer.field_G ? 1 : 0;
          ob.field_i = bea.field_g;
          jqa.field_g = bea.field_a;
          if (param0) {
            stackOut_2_0 = gt.field_a;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = fp.field_e;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          dga.a(stackIn_3_0, 199);
          rm.field_e.a(0, 0, param1 + 18, nra.field_c.field_G, -2 + nra.field_c.field_t + -40);
          cea.field_a.a(lk.field_l.field_G, di.field_a, param1 ^ -23774, 0, 0);
          stackOut_3_0 = uaa.field_b;
          stackOut_3_1 = lk.field_l.field_G;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (!rca.field_p) {
            stackOut_5_0 = (jea) (Object) stackIn_5_0;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = (jea) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 2 + (io.field_a + 40) - -2;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((jea) (Object) stackIn_6_0).a(stackIn_6_1 + -stackIn_6_2, 18, -23776, param1 + di.field_a, 0);
          lda.field_F.a(42 - -io.field_a, 18, param1 + -23778, 2 + di.field_a, -io.field_a + lk.field_l.field_G - 42);
          tn.field_n.a(lk.field_l.field_G, 2, (byte) 127, 0, io.field_a, lk.field_l.field_t - (di.field_a - -22), 20 + (2 + di.field_a));
          bc.field_b.a(nra.field_c.field_G, 40, -23776, -40 + nra.field_c.field_t, 0);
          wf.field_g.a(dka.field_b.field_G, 30, -23776, 0, 0);
          dba.field_g.a(dka.field_b.field_G, dka.field_b.field_t - 72, -23776, 30, 0);
          var2 = 3 + fk.field_b;
          if ((sg.field_u.length ^ -1) <= -3) {
            break L2;
          } else {
            var2--;
            break L2;
          }
        }
        L3: {
          if (param0) {
            var2--;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var3 = (-5 + (-5 + (dba.field_g.field_t + -10) - -2 - -((var2 + 1) / 2))) / (1 + var2) - 2;
          if (var3 <= 30) {
            break L4;
          } else {
            var3 = 30;
            break L4;
          }
        }
        L5: {
          var4 = -5 + (dba.field_g.field_t - 5 + -(var2 * (var3 + 2)));
          if (var4 > 40) {
            var4 = 40;
            break L5;
          } else {
            break L5;
          }
        }
        qna.field_b.a(-5 + (dba.field_g.field_G - 5), var4, -23776, 5, 5);
        var5 = 7 - -var4;
        var6 = 0;
        L6: while (true) {
          if (fk.field_b + 4 <= var6) {
            hf.field_a.a(360, -134 + (bea.field_a - 10), -23776, 10, bea.field_g + -360 >> -1367106463);
            vca.field_e.a(hf.field_a.field_G, 24, -23776, 0, 0);
            vs.field_R.a(hf.field_a.field_G, -24 + hf.field_a.field_t, -23776, 24, 0);
            vs.field_R.field_w = hca.c(vs.field_R.field_t, 1, 3, 11579568, param1 ^ -116, 8421504);
            rra.field_e.a(-10 + vs.field_R.field_G, -24 + vs.field_R.field_t - 12, -23776, 5, 5);
            fsa.field_q.a(80, 24, -23776, -5 + (vs.field_R.field_t + -24), (-80 + vs.field_R.field_G) / 2);
            da.a(false);
            return;
          } else {
            L7: {
              if (var6 != 1) {
                break L7;
              } else {
                if (sg.field_u.length >= 2) {
                  break L7;
                } else {
                  var6++;
                  continue L6;
                }
              }
            }
            L8: {
              if (-4 != var6) {
                break L8;
              } else {
                if (-2 < ws.field_r) {
                  break L8;
                } else {
                  var6++;
                  continue L6;
                }
              }
            }
            L9: {
              if (param0) {
                break L9;
              } else {
                if (var6 != 3) {
                  break L9;
                } else {
                  var7_ref_jea = rb.field_p[var6];
                  rb.field_p[var6].field_t = 0;
                  var7_ref_jea.field_G = 0;
                  var8 = 0;
                  L10: while (true) {
                    if (var8 < bf.field_b[var6].length) {
                      if (null != bf.field_b[var6][var8]) {
                        var9_ref_tv = bf.field_b[var6][var8];
                        bf.field_b[var6][var8].field_t = 0;
                        var9_ref_tv.field_G = 0;
                        var8++;
                        continue L10;
                      } else {
                        var8++;
                        continue L10;
                      }
                    } else {
                      var6++;
                      continue L6;
                    }
                  }
                }
              }
            }
            L11: {
              if (!param0) {
                break L11;
              } else {
                if (var6 != 0) {
                  break L11;
                } else {
                  var7_ref_jea = rb.field_p[var6];
                  rb.field_p[var6].field_t = 0;
                  var7_ref_jea.field_G = 0;
                  var8 = 0;
                  L12: while (true) {
                    if (var8 < bf.field_b[var6].length) {
                      if (null != bf.field_b[var6][var8]) {
                        var9_ref_tv = bf.field_b[var6][var8];
                        bf.field_b[var6][var8].field_t = 0;
                        var9_ref_tv.field_G = 0;
                        var8++;
                        continue L12;
                      } else {
                        var8++;
                        continue L12;
                      }
                    } else {
                      var6++;
                      continue L6;
                    }
                  }
                }
              }
            }
            L13: {
              if (param0) {
                if (var6 >= 4) {
                  if (null != vba.field_u) {
                    if (vba.field_u[var6 + -4]) {
                      stackOut_49_0 = 1;
                      stackIn_51_0 = stackOut_49_0;
                      break L13;
                    } else {
                      stackOut_48_0 = 0;
                      stackIn_51_0 = stackOut_48_0;
                      break L13;
                    }
                  } else {
                    stackOut_46_0 = 0;
                    stackIn_51_0 = stackOut_46_0;
                    break L13;
                  }
                } else {
                  stackOut_44_0 = 0;
                  stackIn_51_0 = stackOut_44_0;
                  break L13;
                }
              } else {
                stackOut_42_0 = 0;
                stackIn_51_0 = stackOut_42_0;
                break L13;
              }
            }
            var7 = stackIn_51_0;
            if (var7 == 0) {
              L14: {
                rb.field_p[var6].a(103, var3, -23776, var5, 5);
                var8 = 110;
                if (param0) {
                  bf.field_b[var6][0].a(38, var8, pda.field_c, var3, 0, 2, var5);
                  var8 += 40;
                  break L14;
                } else {
                  if (bf.field_b[var6][0] == null) {
                    break L14;
                  } else {
                    var9_ref_tv = bf.field_b[var6][0];
                    bf.field_b[var6][0].field_t = 0;
                    var9_ref_tv.field_G = 0;
                    break L14;
                  }
                }
              }
              var9 = -5 + dka.field_b.field_G - (var8 + -2);
              var10 = bf.field_b[var6].length - 1;
              var11 = 0;
              L15: while (true) {
                if (var10 <= var11) {
                  var5 = var5 + (2 + var3);
                  var6++;
                  continue L6;
                } else {
                  var12 = var11 * var9 / var10;
                  bf.field_b[var6][var11 + 1].a(var9 * (1 + var11) / var10 + -2 + -var12, var8 - -var12, pda.field_c, var3, param1 ^ 2, 2, var5);
                  var11++;
                  continue L15;
                }
              }
            } else {
              var8_ref_jea = rb.field_p[var6];
              rb.field_p[var6].field_t = 0;
              var8_ref_jea.field_G = 0;
              var9 = 0;
              L16: while (true) {
                if (var9 < bf.field_b[var6].length) {
                  if (bf.field_b[var6][var9] != null) {
                    var10_ref_tv = bf.field_b[var6][var9];
                    bf.field_b[var6][var9].field_t = 0;
                    var10_ref_tv.field_G = 0;
                    var9++;
                    continue L16;
                  } else {
                    var9++;
                    continue L16;
                  }
                } else {
                  var6++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    hn(la param0, int param1) {
        super(param0, param1);
    }

    private final int A(int param0) {
        if (param0 != -1) {
            field_F = null;
        }
        return ((hn) this).field_I;
    }

    public static void e(boolean param0) {
        field_G = null;
        field_F = null;
        if (param0) {
            hn.c(true, 116);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "These blocks are unstable - they'll crumble into dust if you shoot them.";
        field_F = null;
    }
}
