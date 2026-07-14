/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends ug {
    private ul field_T;
    static vd field_S;
    static long field_R;
    static int[][][] field_G;
    static boolean field_V;
    static gh field_U;

    final void h(byte param0) {
        int var4 = SteelSentinels.field_G;
        jc var2 = new jc(((ka) this).field_T);
        bb var3 = (bb) (Object) var2.b(2);
        while (var3 != null) {
            if (var3.i(-8350)) {
                var3.b(4);
            }
            var3 = (bb) (Object) var2.d(2);
        }
        if (param0 != -4) {
            return;
        }
        ((ka) this).field_J = (lh) (Object) ((ka) this).i(-1850);
    }

    final void h(int param0) {
        int var4 = SteelSentinels.field_G;
        jc var2 = new jc(((ka) this).field_T);
        if (param0 < 119) {
            ((ka) this).field_T = null;
        }
        bb var3 = (bb) (Object) var2.b(2);
        while (var3 != null) {
            var3.field_Q = false;
            var3 = (bb) (Object) var2.d(2);
        }
        ((ka) this).field_J = null;
    }

    final static int a(String param0, boolean param1, int param2, byte param3, int param4, ik param5, ik param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        gi stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        gi stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        gi stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        gi stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        gi stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        gi stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        String stackIn_18_2 = null;
        gi stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        gi stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        gi stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        gi stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        gi stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        String stackOut_17_2 = null;
        gi stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        String stackOut_16_2 = null;
        L0: {
          var16 = null;
          var13 = SteelSentinels.field_G;
          var15 = param5.a(2134230754);
          var8 = param6.a(2134230754);
          if (rb.field_h != null) {
            break L0;
          } else {
            if (!rc.a(119, false)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (lj.field_d != rn.field_v) {
            break L1;
          } else {
            L2: {
              mm.field_g.field_p = 0;
              ma.field_bb = null;
              if (param0 == null) {
                L3: {
                  ne.field_y.field_p = 0;
                  ne.field_y.b(true, rb.field_g.nextInt());
                  ne.field_y.b(true, rb.field_g.nextInt());
                  stackOut_12_0 = ne.field_y;
                  stackOut_12_1 = 13588;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (!param5.a((byte) 51)) {
                    stackOut_14_0 = (gi) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = "";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L3;
                  } else {
                    stackOut_13_0 = (gi) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = (String) var15;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L3;
                  }
                }
                L4: {
                  ((gi) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2);
                  stackOut_15_0 = ne.field_y;
                  stackOut_15_1 = 13588;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (!param6.a((byte) 51)) {
                    stackOut_17_0 = (gi) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = "";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L4;
                  } else {
                    stackOut_16_0 = (gi) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (String) var8;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L4;
                  }
                }
                ((gi) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2);
                mm.field_g.a((byte) 127, 16);
                mm.field_g.field_p = mm.field_g.field_p + 1;
                var9 = mm.field_g.field_p;
                qi.a(jd.field_ib, ne.field_y, (gi) (Object) mm.field_g, qe.field_d, 5);
                mm.field_g.b((byte) -32, -var9 + mm.field_g.field_p);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  ne.field_y.field_p = 0;
                  if (!param1) {
                    break L5;
                  } else {
                    var9 = var9 | 1;
                    break L5;
                  }
                }
                L6: {
                  ne.field_y.b(true, rb.field_g.nextInt());
                  ne.field_y.b(true, rb.field_g.nextInt());
                  ne.field_y.a(13588, var15);
                  ne.field_y.a(13588, var8);
                  var17 = (CharSequence) (Object) param0;
                  ne.field_y.a(13588, pd.a(-105, var17));
                  ne.field_y.d(param4, 104);
                  ne.field_y.a((byte) 124, param2);
                  ne.field_y.a((byte) 117, var9);
                  mm.field_g.a((byte) 117, 18);
                  mm.field_g.field_p = mm.field_g.field_p + 2;
                  var10 = mm.field_g.field_p;
                  var11_ref = gh.a(-58, wl.d((byte) -21));
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                mm.field_g.a(var11_ref, -63);
                qi.a(jd.field_ib, ne.field_y, (gi) (Object) mm.field_g, qe.field_d, 5);
                mm.field_g.c(30, -var10 + mm.field_g.field_p);
                break L2;
              }
            }
            gj.a(0, -1);
            rn.field_v = mc.field_c;
            break L1;
          }
        }
        L7: {
          if (mc.field_c != rn.field_v) {
            break L7;
          } else {
            if (!ve.a((byte) -96, 1)) {
              break L7;
            } else {
              L8: {
                var9 = rf.field_d.f((byte) -62);
                rf.field_d.field_p = 0;
                if (var9 < 100) {
                  break L8;
                } else {
                  if (var9 < -106) {
                    break L8;
                  } else {
                    vh.field_d = new String[var9 - 100];
                    rn.field_v = bl.field_k;
                    break L7;
                  }
                }
              }
              if (var9 == 248) {
                bj.a(-117, wl.d((byte) -21));
                di.field_e = ng.field_o;
                pm.m(83);
                ui.field_T = false;
                return var9;
              } else {
                if (-100 == var9) {
                  boolean discarded$1 = ve.a((byte) -85, rf.a(-58));
                  ma.field_bb = new Boolean(ai.a((gi) (Object) rf.field_d, -32599));
                  rf.field_d.field_p = 0;
                  break L7;
                } else {
                  rn.field_v = fg.field_Yb;
                  jg.field_f = -1;
                  ch.field_N = var9;
                  break L7;
                }
              }
            }
          }
        }
        L9: {
          if (param3 < -22) {
            break L9;
          } else {
            var14 = null;
            ka.a(true, -27, -92, 49, (String) null, 58, 48, 104);
            break L9;
          }
        }
        L10: {
          if (rn.field_v == bl.field_k) {
            var9 = 2;
            if (!ve.a((byte) -128, var9)) {
              break L10;
            } else {
              var10 = rf.field_d.c((byte) -60);
              rf.field_d.field_p = 0;
              if (ve.a((byte) -97, var10)) {
                var11 = vh.field_d.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    pm.m(-46);
                    ui.field_T = false;
                    return 100 - -var11;
                  } else {
                    vh.field_d[var12] = rf.field_d.e((byte) -97);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            }
          } else {
            break L10;
          }
        }
        L12: {
          if (fg.field_Yb == rn.field_v) {
            if (pm.n(37)) {
              L13: {
                if ((ch.field_N ^ -1) == -256) {
                  var9_ref = rf.field_d.g(-77);
                  if (var9_ref == null) {
                    break L13;
                  } else {
                    ri.a(var9_ref, wl.d((byte) -21), 124);
                    break L13;
                  }
                } else {
                  di.field_e = rf.field_d.h(1);
                  break L13;
                }
              }
              pm.m(-98);
              ui.field_T = false;
              return ch.field_N;
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (null != rb.field_h) {
            break L14;
          } else {
            if (!ui.field_T) {
              var9 = ll.field_l;
              ll.field_l = fe.field_F;
              fe.field_F = var9;
              ui.field_T = true;
              break L14;
            } else {
              L15: {
                if (ki.l(150) <= 30000L) {
                  di.field_e = bc.field_mb;
                  break L15;
                } else {
                  di.field_e = kj.field_E;
                  break L15;
                }
              }
              ui.field_T = false;
              return 249;
            }
          }
        }
        return -1;
    }

    final bb i(int param0) {
        jc var2 = null;
        bb var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          var2 = new jc(((ka) this).field_T);
          if (param0 == -1850) {
            break L0;
          } else {
            field_R = -76L;
            break L0;
          }
        }
        var3 = (bb) (Object) var2.b(2);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_Q) {
              return var3;
            } else {
              var3 = (bb) (Object) var2.d(2);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    public static void f(byte param0) {
        field_S = null;
        field_U = null;
        field_G = null;
        if (param0 <= 124) {
            ka.f((byte) 57);
        }
    }

    final void a(lh param0, int param1) {
        if (!(param0 instanceof bb)) {
            throw new IllegalArgumentException();
        }
        bb var3 = (bb) (Object) param0;
        ((ka) this).field_T.a((ck) (Object) var3, -21459);
        var3.field_Q = true;
        boolean discarded$0 = var3.a(1, (lh) this);
        int var4 = 82 % ((-51 - param1) / 61);
    }

    final lh a(byte param0) {
        jc var2 = null;
        bb var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (param0 == -2) {
            break L0;
          } else {
            field_R = 108L;
            break L0;
          }
        }
        var2 = new jc(((ka) this).field_T);
        var3 = (bb) (Object) var2.b(2);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_Q) {
              var3 = (bb) (Object) var2.d(param0 ^ -4);
              continue L1;
            } else {
              return var3.h(-1);
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = SteelSentinels.field_G;
        if (!(null == ((ka) this).field_p)) {
            ((ka) this).field_p.a(param2, (lh) this, (byte) -30, true, param0);
        }
        jc var5 = new jc(((ka) this).field_T);
        lh var6 = (lh) (Object) var5.c(2);
        while (var6 != null) {
            var6.a(((ka) this).field_z + param0, (byte) -109, param2 + ((ka) this).field_o, param3);
            var6 = (lh) (Object) var5.a(true);
        }
        if (param1 > -99) {
            bb discarded$0 = ((ka) this).i(117);
        }
    }

    final void g(byte param0) {
        int var4 = SteelSentinels.field_G;
        if (param0 != 103) {
            return;
        }
        jc var2 = new jc(((ka) this).field_T);
        bb var3 = (bb) (Object) var2.b(2);
        while (var3 != null) {
            if (var3.j(-102)) {
                var3.b(param0 + -99);
            }
            var3 = (bb) (Object) var2.d(2);
        }
    }

    final static String a(byte param0, String param1, String param2, cm param3) {
        if (param0 > -13) {
            field_G = null;
        }
        if (!param3.a(true)) {
            return param2;
        }
        return param1 + " - " + param3.a((byte) -33) + "%";
    }

    final static void a(boolean param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7) {
        if (ee.field_H.field_Eb == 0) {
        } else {
            if (fj.field_e) {
            } else {
                if (uc.field_g) {
                    pd.j(13171);
                } else {
                    jn.field_g = true;
                }
            }
        }
        if (jn.field_g) {
            ac.a(param1, param7, param1, param4, 20, param5, param2, param3, -126);
            hh.field_a.a((byte) 121, param0);
            if (!(!param0)) {
                if (!(vc.field_f.field_Eb == 0)) {
                    jn.field_g = false;
                }
                if (!(qa.field_N.field_Eb == 0)) {
                    pg.d(53);
                    jn.field_g = false;
                }
            }
        }
        if (param6 < 126) {
            field_S = null;
        }
    }

    public ka() {
        super(0, 0, ck.field_l, kd.field_u, (qk) null, (tn) null);
        ((ka) this).field_T = new ul();
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = SteelSentinels.field_G;
        if (param1) {
            ka.f((byte) 92);
        }
        CharSequence var10 = (CharSequence) (Object) param2;
        int var3 = pd.a(2019550017, var10, param0);
        String[] var4 = new String[var3 - -1];
        int var5 = 0;
        int var6 = 0;
        for (var7 = 0; var7 < var3; var7++) {
            for (var8 = var6; param0 != param2.charAt(var8); var8++) {
            }
            var5++;
            var4[var5] = param2.substring(var6, var8);
            var6 = var8 - -1;
        }
        var4[var3] = param2.substring(var6);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        int[][] var0 = null;
        field_S = new vd();
        field_G = new int[13][26][];
        var0_int = 0;
        L0: while (true) {
          if (13 <= var0_int) {
            var0 = field_G[0];
            var0[10] = new int[5];
            var0[15] = new int[5];
            var0[25] = new int[8];
            var0[14] = new int[5];
            var0[5] = new int[5];
            var0[9] = new int[5];
            var0[6] = new int[5];
            var0[16] = new int[5];
            var0[3] = new int[5];
            var0[18] = new int[5];
            var0[17] = new int[5];
            var0[11] = new int[5];
            var0[19] = new int[5];
            var0[22] = new int[5];
            var0[12] = new int[5];
            var0[20] = new int[5];
            var0[2] = new int[5];
            var0[4] = new int[5];
            var0[23] = new int[5];
            var0[1] = new int[5];
            var0[13] = new int[5];
            var0[24] = new int[5];
            var0[21] = new int[5];
            var0[8] = new int[5];
            var0[7] = new int[5];
            var0[0] = new int[5];
            var0 = field_G[1];
            var0[25] = new int[8];
            var0[22] = new int[13];
            var0[7] = new int[13];
            var0[20] = new int[13];
            var0[14] = new int[13];
            var0[11] = new int[13];
            var0[17] = new int[13];
            var0[21] = new int[13];
            var0[24] = new int[13];
            var0[6] = new int[13];
            var0[4] = new int[13];
            var0[16] = new int[13];
            var0[15] = new int[13];
            var0[0] = new int[13];
            var0[12] = new int[13];
            var0[8] = new int[13];
            var0[5] = new int[13];
            var0[18] = new int[13];
            var0[3] = new int[13];
            var0[9] = new int[13];
            var0[13] = new int[13];
            var0[2] = new int[13];
            var0[19] = new int[13];
            var0[23] = new int[13];
            var0[1] = new int[13];
            var0[10] = new int[13];
            var0 = field_G[2];
            var0[23] = new int[8];
            var0[21] = new int[8];
            var0[11] = new int[8];
            var0[13] = new int[8];
            var0[3] = new int[8];
            var0[12] = new int[8];
            var0[10] = new int[8];
            var0[7] = new int[8];
            var0[25] = new int[8];
            var0[2] = new int[8];
            var0[24] = new int[8];
            var0[19] = new int[8];
            var0[5] = new int[8];
            var0[4] = new int[8];
            var0[6] = new int[8];
            var0[17] = new int[8];
            var0[18] = new int[8];
            var0[1] = new int[8];
            var0[16] = new int[8];
            var0[9] = new int[8];
            var0[0] = new int[8];
            var0[14] = new int[8];
            var0[20] = new int[8];
            var0[8] = new int[8];
            var0[15] = new int[8];
            var0[22] = new int[8];
            var0 = field_G[3];
            var0[8] = new int[21];
            var0[15] = new int[21];
            var0[12] = new int[21];
            var0[5] = new int[21];
            var0[21] = new int[21];
            var0[24] = new int[21];
            var0[3] = new int[21];
            var0[18] = new int[21];
            var0[13] = new int[21];
            var0[7] = new int[21];
            var0[4] = new int[21];
            var0[9] = new int[21];
            var0[16] = new int[21];
            var0[2] = new int[21];
            var0[0] = new int[21];
            var0[14] = new int[21];
            var0[11] = new int[21];
            var0[10] = new int[21];
            var0[17] = new int[21];
            var0[22] = new int[21];
            var0[20] = new int[21];
            var0[1] = new int[21];
            var0[6] = new int[21];
            var0[25] = new int[8];
            var0[19] = new int[21];
            var0[23] = new int[21];
            var0 = field_G[4];
            var0[19] = new int[9];
            var0[0] = new int[9];
            var0[6] = new int[9];
            var0[10] = new int[9];
            var0[15] = new int[8];
            var0[21] = new int[9];
            var0[23] = new int[9];
            var0[7] = new int[9];
            var0[17] = new int[9];
            var0[20] = new int[9];
            var0[12] = new int[8];
            var0[3] = new int[9];
            var0[1] = new int[9];
            var0[2] = new int[9];
            var0[14] = new int[9];
            var0[22] = new int[9];
            var0[13] = new int[8];
            var0[4] = new int[9];
            var0[9] = new int[9];
            var0[11] = new int[9];
            var0[8] = new int[9];
            var0[24] = new int[9];
            var0[25] = new int[8];
            var0[16] = new int[8];
            var0[5] = new int[9];
            var0[18] = new int[9];
            var0 = field_G[5];
            var0[17] = new int[16];
            var0[8] = new int[16];
            var0[7] = new int[16];
            var0[16] = new int[16];
            var0[1] = new int[16];
            var0[0] = new int[16];
            var0[9] = new int[16];
            var0[11] = new int[16];
            var0[19] = new int[16];
            var0[13] = new int[16];
            var0[15] = new int[16];
            var0[24] = new int[16];
            var0[22] = new int[16];
            var0[3] = new int[16];
            var0[4] = new int[16];
            var0[20] = new int[16];
            var0[23] = new int[16];
            var0[5] = new int[16];
            var0[14] = new int[16];
            var0[12] = new int[16];
            var0[18] = new int[16];
            var0[25] = new int[8];
            var0[6] = new int[16];
            var0[2] = new int[16];
            var0[21] = new int[16];
            var0[10] = new int[16];
            var0 = field_G[6];
            var0[11] = new int[13];
            var0[5] = new int[2];
            var0[3] = new int[13];
            var0[22] = new int[2];
            var0[18] = new int[13];
            var0[8] = new int[12];
            var0[13] = new int[2];
            var0[20] = new int[13];
            var0[6] = new int[2];
            var0[16] = new int[13];
            var0[10] = new int[13];
            var0[17] = new int[13];
            var0[1] = new int[13];
            var0[4] = new int[13];
            var0[23] = new int[2];
            var0[19] = new int[13];
            var0[12] = new int[2];
            var0[9] = new int[13];
            var0[7] = new int[2];
            var0[0] = new int[13];
            var0[24] = new int[2];
            var0[14] = new int[13];
            var0[21] = new int[2];
            var0[25] = new int[8];
            var0[2] = new int[13];
            var0[15] = new int[13];
            var0 = field_G[7];
            var0[24] = new int[13];
            var0[3] = new int[13];
            var0[5] = new int[13];
            var0[23] = new int[13];
            var0[25] = new int[8];
            var0[12] = new int[13];
            var0[14] = new int[13];
            var0[6] = new int[13];
            var0[4] = new int[13];
            var0[20] = new int[13];
            var0[2] = new int[13];
            var0[21] = new int[13];
            var0[11] = new int[13];
            var0[9] = new int[13];
            var0[17] = new int[13];
            var0[1] = new int[13];
            var0[16] = new int[13];
            var0[7] = new int[13];
            var0[8] = new int[13];
            var0[15] = new int[13];
            var0[13] = new int[13];
            var0[19] = new int[13];
            var0[10] = new int[13];
            var0[0] = new int[13];
            var0[18] = new int[13];
            var0[22] = new int[13];
            var0 = field_G[8];
            var0[20] = new int[4];
            var0[0] = new int[4];
            var0[19] = new int[4];
            var0[1] = new int[4];
            var0[17] = new int[4];
            var0[3] = new int[4];
            var0[7] = new int[4];
            var0[14] = new int[4];
            var0[4] = new int[4];
            var0[8] = new int[4];
            var0[10] = new int[4];
            var0[15] = new int[4];
            var0[24] = new int[4];
            var0[21] = new int[4];
            var0[23] = new int[4];
            var0[12] = new int[4];
            var0[9] = new int[4];
            var0[22] = new int[4];
            var0[5] = new int[4];
            var0[2] = new int[4];
            var0[6] = new int[4];
            var0[16] = new int[4];
            var0[11] = new int[4];
            var0[13] = new int[4];
            var0[18] = new int[4];
            var0[25] = new int[8];
            var0 = field_G[9];
            var0[17] = new int[8];
            var0[20] = new int[8];
            var0[13] = new int[8];
            var0[3] = new int[8];
            var0[1] = new int[8];
            var0[18] = new int[8];
            var0[11] = new int[8];
            var0[25] = new int[8];
            var0[10] = new int[8];
            var0[16] = new int[8];
            var0[19] = new int[8];
            var0[24] = new int[8];
            var0[15] = new int[8];
            var0[2] = new int[8];
            var0[5] = new int[8];
            var0[23] = new int[8];
            var0[21] = new int[8];
            var0[6] = new int[8];
            var0[7] = new int[8];
            var0[9] = new int[8];
            var0[8] = new int[8];
            var0[22] = new int[8];
            var0[0] = new int[8];
            var0[14] = new int[8];
            var0[4] = new int[8];
            var0[12] = new int[8];
            var0 = field_G[10];
            var0[18] = new int[14];
            var0[10] = new int[14];
            var0[4] = new int[14];
            var0[20] = new int[14];
            var0[11] = new int[14];
            var0[8] = new int[14];
            var0[24] = new int[14];
            var0[6] = new int[14];
            var0[13] = new int[14];
            var0[17] = new int[14];
            var0[5] = new int[14];
            var0[19] = new int[14];
            var0[12] = new int[14];
            var0[0] = new int[14];
            var0[1] = new int[14];
            var0[22] = new int[14];
            var0[14] = new int[14];
            var0[2] = new int[14];
            var0[15] = new int[14];
            var0[3] = new int[14];
            var0[7] = new int[14];
            var0[16] = new int[14];
            var0[21] = new int[14];
            var0[9] = new int[14];
            var0[25] = new int[8];
            var0[23] = new int[14];
            var0 = field_G[11];
            var0[14] = new int[15];
            var0[12] = new int[15];
            var0[0] = new int[15];
            var0[25] = new int[8];
            var0[20] = new int[15];
            var0[10] = new int[15];
            var0[22] = new int[15];
            var0[11] = new int[15];
            var0[1] = new int[15];
            var0[18] = new int[15];
            var0[16] = new int[15];
            var0[23] = new int[15];
            var0[15] = new int[15];
            var0[8] = new int[15];
            var0[24] = new int[15];
            var0[21] = new int[15];
            var0[13] = new int[15];
            var0[2] = new int[15];
            var0[5] = new int[15];
            var0[4] = new int[15];
            var0[19] = new int[15];
            var0[7] = new int[15];
            var0[6] = new int[15];
            var0[17] = new int[15];
            var0[3] = new int[15];
            var0[9] = new int[15];
            field_V = true;
          } else {
            field_G[var0_int][25] = new int[8];
            field_G[var0_int][25][2] = 25;
            field_G[var0_int][25][3] = 8;
            field_G[var0_int][25][4] = 5;
            field_G[var0_int][25][0] = 32;
            field_G[var0_int][25][1] = 10;
            field_G[var0_int][25][7] = 8;
            field_G[var0_int][25][5] = 32;
            field_G[var0_int][25][6] = 10;
            var0_int++;
            continue L0;
          }
        }
    }
}
