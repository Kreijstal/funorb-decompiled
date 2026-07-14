/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tr extends oj {
    int field_D;
    static String field_y;
    int field_E;
    static String field_G;
    static wk field_z;
    static byte[] field_F;
    private int field_B;
    static int[][] field_C;
    static int field_A;

    public static void g(int param0) {
        if (param0 > -88) {
            field_A = 25;
        }
        field_z = null;
        field_C = null;
        field_G = null;
        field_F = null;
        field_y = null;
    }

    final static void h(int param0) {
        al.field_f = new je(0L, (je) null);
        if (fh.field_c) {
            al.field_f.a(t.field_g, 84);
        }
        al.field_f.a(nf.field_Kb, 104);
        pj.field_E = new ea(sa.field_c, al.field_f);
        if (param0 != 14570) {
            return;
        }
        no.field_T = new je(0L, (je) null);
        no.field_T.a((je) (Object) pj.field_E.field_a, 127);
        no.field_T.a(cp.field_d, 39);
        ak.b(false);
    }

    final String a(byte param0, boolean param1) {
        int var3 = -17 % ((param0 - 53) / 51);
        if (!(!param1)) {
            System.out.println("Deploy event debug");
            System.out.println("Unit at " + ((tr) this).field_E + "," + ((tr) this).field_D);
        }
        String var4 = "EventDeploy: pos: (" + ((tr) this).field_E + "," + ((tr) this).field_D + "), mods: " + ((tr) this).field_B;
        return var4;
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 >= -84) {
            field_y = null;
        }
        return ((tr) this).a((byte) -39, param2, param0, true);
    }

    final static of a(byte param0, long param1) {
        if (param0 != 121) {
            tr.h(23);
        }
        return (of) (Object) oi.field_d.a((byte) -27, param1);
    }

    final void a(ha param0, int param1) {
        ne var4_ref_ne = null;
        int var4 = 0;
        int var5 = 0;
        jd var6 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        if (param1 == -26661) {
          L0: {
            var6 = param0.c(((tr) this).field_D, true, ((tr) this).field_E);
            if (var6 == null) {
              break L0;
            } else {
              if (var6.c(false)) {
                break L0;
              } else {
                L1: {
                  if (var6.field_N != 7) {
                    break L1;
                  } else {
                    var6.e(param1 + 26577);
                    var4_ref_ne = param0.field_Eb[((tr) this).field_E - -(((tr) this).field_D * param0.field_v)];
                    var4_ref_ne.field_h = 11;
                    var4_ref_ne.field_j = 1;
                    var4_ref_ne.field_b = true;
                    var4_ref_ne.field_g = ((tr) this).field_B;
                    var4_ref_ne.field_a = var6.field_O;
                    break L1;
                  }
                }
                L2: {
                  if ((var6.field_N ^ -1) != -35) {
                    break L2;
                  } else {
                    var6.field_W = true;
                    var6.field_s = true;
                    var6.field_Y = 20;
                    var6.field_t = 20;
                    var6.a((byte) 71);
                    var6.z(10);
                    break L2;
                  }
                }
                if (var6.field_N == 17) {
                  L3: {
                    var6.e(param1 ^ 26692);
                    if ((1 & ((tr) this).field_B ^ -1) < -1) {
                      stackOut_12_0 = -1 + var6.field_J;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var6.field_J;
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var4 = stackIn_13_0;
                    if ((2 & ((tr) this).field_B) > 0) {
                      stackOut_15_0 = var6.field_w - 1;
                      stackIn_16_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = var6.field_w;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  var5 = stackIn_16_0;
                  param0.a(var5, var4, (byte) -13, var6.field_O);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          fl.a(param0, -115);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        at var4 = null;
        hl var5 = null;
        hl var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tg var16 = null;
        tg var17 = null;
        dn stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        dn stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        dn stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        je stackIn_19_0 = null;
        je stackIn_20_0 = null;
        je stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        dn stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        dn stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        dn stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        je stackOut_18_0 = null;
        je stackOut_20_0 = null;
        String stackOut_20_1 = null;
        je stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          var15 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 < -67) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = sc.field_g.field_Kb;
          stackOut_2_1 = param1;
          stackOut_2_2 = (2 + jn.field_d) * (3 * param2);
          stackOut_2_3 = jn.field_d - -2;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          stackIn_3_2 = stackOut_2_2;
          stackIn_3_3 = stackOut_2_3;
          if (pq.field_b != sc.field_g.field_Kb) {
            stackOut_4_0 = (dn) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = stackIn_4_3;
            stackOut_4_4 = 0;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            break L1;
          } else {
            stackOut_3_0 = (dn) (Object) stackIn_3_0;
            stackOut_3_1 = stackIn_3_1;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = stackIn_3_3;
            stackOut_3_4 = 1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            break L1;
          }
        }
        L2: {
          L3: {
            var3 = ((dn) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, 0, 2) ? 1 : 0;
            var4 = sc.field_g.field_Nb.field_fb;
            if (-3 == (th.field_a ^ -1)) {
              break L3;
            } else {
              if ((th.field_a ^ -1) == -2) {
                break L3;
              } else {
                sc.field_g.field_Kb.field_Nb.field_X = ef.field_a;
                sc.field_g.field_xb = false;
                jm.a(sc.field_g.field_Nb, -71);
                break L2;
              }
            }
          }
          sc.field_g.field_Kb.field_Nb.field_X = null;
          sc.field_g.field_xb = true;
          var5 = null;
          var6 = (hl) (Object) var4.e((byte) 110);
          L4: while (true) {
            if (var6 == null) {
              L5: {
                if (0 != sc.field_g.field_Ib.field_yb) {
                  tb.field_e = new oc(sc.field_g.field_Ib.field_V, sc.field_g.field_Ib.field_D, sc.field_g.field_Ib.field_gb, sc.field_g.field_Ib.field_ob, iw.field_o, kq.field_N, eq.field_h, eq.field_h);
                  ut.field_fb = 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (sc.field_g.field_Rb.field_yb == 0) {
                break L2;
              } else {
                tb.field_e = new oc(sc.field_g.field_Rb.field_V, sc.field_g.field_Rb.field_D, sc.field_g.field_Rb.field_gb, sc.field_g.field_Rb.field_ob, lw.field_kb, kq.field_N, eq.field_h, eq.field_h);
                ut.field_fb = 3;
                break L2;
              }
            } else {
              L6: {
                var7 = 0;
                if (var6.field_fb != null) {
                  break L6;
                } else {
                  var6.field_Qb = new je(0L, ga.field_i);
                  var6.a(var6.field_Qb, 114);
                  var6.field_Jb = new je(0L, ga.field_i);
                  var6.a(var6.field_Jb, 113);
                  var6.i(-10027);
                  var7 = 1;
                  break L6;
                }
              }
              L7: {
                var6.field_gb = sc.field_g.field_Nb.field_gb;
                var6.field_Qb.a(jn.field_d, -20500, var6.field_gb, 0, 0);
                var8 = 0;
                if (null == var6.field_Nb) {
                  break L7;
                } else {
                  if (!var6.field_Nb.equals((Object) (Object) "")) {
                    var6.field_Jb.field_cb = tl.field_e;
                    var6.field_Jb.field_W = 16737894;
                    var6.field_Jb.a(jn.field_d, -20500, tl.field_e.field_A + 3, 0, 0);
                    var8 = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                var9 = 0;
                var10 = var6.field_gb;
                if (var8 == 0) {
                  break L8;
                } else {
                  var9 = 3 + tl.field_e.field_A;
                  var10 = var10 - var9;
                  break L8;
                }
              }
              L9: {
                stackOut_18_0 = var6.field_Qb;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var10 <= 0) {
                  stackOut_20_0 = (je) (Object) stackIn_20_0;
                  stackOut_20_1 = var6.field_Mb;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L9;
                } else {
                  stackOut_19_0 = (je) (Object) stackIn_19_0;
                  stackOut_19_1 = ka.a(var6.field_Qb.field_Z, var6.field_Mb, var10);
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L9;
                }
              }
              L10: {
                ((je) (Object) stackIn_21_0).field_X = (String) (Object) stackIn_21_1;
                if (var6.field_Qb.field_X.equals((Object) (Object) var6.field_Mb)) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L10;
                } else {
                  stackOut_22_0 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  break L10;
                }
              }
              L11: {
                var11 = stackIn_24_0;
                var6.field_Qb.a(jn.field_d, -20500, var10, 0, var9);
                if (var3 != 0) {
                  break L11;
                } else {
                  var6.field_nb = -var6.field_ob + jn.field_d;
                  break L11;
                }
              }
              L12: {
                if (var7 == 0) {
                  break L12;
                } else {
                  sc.field_g.field_Nb.a((je) (Object) var6, true, 2, (je) (Object) var5);
                  break L12;
                }
              }
              L13: {
                L14: {
                  if (var6.field_Jb == null) {
                    break L14;
                  } else {
                    if (!var6.field_Jb.field_eb) {
                      break L14;
                    } else {
                      ad.field_I = var6.field_Nb;
                      break L13;
                    }
                  }
                }
                if (!var6.field_Qb.field_eb) {
                  break L13;
                } else {
                  if (var11 != 0) {
                    ad.field_I = var6.field_Mb;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L15: {
                if (0 != var6.field_yb) {
                  ng.a(sc.field_g.field_Kb, (je) (Object) var6, (int[]) null, var6.field_Mb, -1, -110, -1, var6.field_Pb, 0L);
                  var16 = tn.field_Z;
                  var13_ref = jm.field_u;
                  var16.field_i.a(7, var13_ref, (byte) -100);
                  var17 = tn.field_Z;
                  var13 = iu.field_t;
                  var14 = ur.field_z;
                  var17.field_i.a(0, var14, 0, (byte) -118, var13);
                  break L15;
                } else {
                  break L15;
                }
              }
              var5 = var6;
              var6 = (hl) (Object) var4.a((byte) 123);
              continue L4;
            }
          }
        }
    }

    tr(int param0, int param1, int param2) {
        ((tr) this).field_B = param2;
        ((tr) this).field_E = param0;
        ((tr) this).field_m = 18;
        ((tr) this).field_D = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "<%0> wants to join";
        field_y = "You win!";
        field_A = 0;
        field_C = new int[][]{null, null, null, null, null, null};
    }
}
