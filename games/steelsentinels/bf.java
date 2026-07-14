/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends gd {
    static String field_Db;
    static boolean field_Gb;
    static gh field_Ab;
    static String field_Bb;
    static int field_Fb;
    static gk[] field_Cb;
    static String field_zb;
    static String field_Eb;

    bf(ka param0, lh param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(byte param0) {
        field_zb = null;
        field_Ab = null;
        field_Bb = null;
        field_Eb = null;
        field_Db = null;
        field_Cb = null;
        if (param0 > -110) {
            field_Ab = null;
        }
    }

    final static kf a(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = SteelSentinels.field_G;
        kf var5 = (kf) (Object) je.field_w.e(13058);
        int var6 = -56 % ((-3 - param0) / 44);
        while (var5 != null) {
            if (var5.field_C == param2) {
                return var5;
            }
            var5 = (kf) (Object) je.field_w.a((byte) -28);
        }
        kf var5_ref = new kf();
        var5_ref.field_u = param4;
        var5_ref.field_w = param1;
        var5_ref.field_C = param2;
        je.field_w.a(3, (ck) (Object) var5_ref);
        ma.a(param3, var5_ref, -2864);
        return var5_ref;
    }

    final static void a(byte param0, boolean param1) {
        gh stackIn_7_0 = null;
        gh stackIn_8_0 = null;
        gh stackIn_9_0 = null;
        gh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        gh stackIn_11_0 = null;
        gh stackIn_12_0 = null;
        gh stackIn_13_0 = null;
        gh stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        gh stackIn_21_0 = null;
        gh stackIn_22_0 = null;
        gh stackIn_23_0 = null;
        gh stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        gh stackIn_25_0 = null;
        gh stackIn_26_0 = null;
        gh stackIn_27_0 = null;
        gh stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        gh stackOut_6_0 = null;
        gh stackOut_7_0 = null;
        gh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        gh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        gh stackOut_10_0 = null;
        gh stackOut_11_0 = null;
        gh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        gh stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        gh stackOut_20_0 = null;
        gh stackOut_21_0 = null;
        gh stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        gh stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        gh stackOut_24_0 = null;
        gh stackOut_25_0 = null;
        gh stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        gh stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        if (param0 <= -102) {
          L0: {
            fe.a(-640 + pb.field_c >> -258143103, 0, -102, 640 + pb.field_c >> -22908735, pb.field_j);
            if ((je.field_t ^ -1) < -1) {
              L1: {
                if (null == ta.field_e) {
                  break L1;
                } else {
                  ta.field_e.f(mg.field_Ub.field_Y, 0);
                  break L1;
                }
              }
              L2: {
                L3: {
                  stackOut_6_0 = mg.field_Ub;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!param1) {
                    break L3;
                  } else {
                    stackOut_7_0 = (gh) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (im.field_b) {
                      break L3;
                    } else {
                      stackOut_8_0 = (gh) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L2;
                    }
                  }
                }
                stackOut_9_0 = (gh) (Object) stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              }
              L4: {
                L5: {
                  ((gh) (Object) stackIn_10_0).a(stackIn_10_1 != 0, (byte) 126);
                  stackOut_10_0 = pc.field_q;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!param1) {
                    break L5;
                  } else {
                    stackOut_11_0 = (gh) (Object) stackIn_11_0;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    if (im.field_b) {
                      break L5;
                    } else {
                      stackOut_12_0 = (gh) (Object) stackIn_12_0;
                      stackOut_12_1 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      break L4;
                    }
                  }
                }
                stackOut_13_0 = (gh) (Object) stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L4;
              }
              ((gh) (Object) stackIn_14_0).a(stackIn_14_1 != 0, (byte) 127);
              break L0;
            } else {
              break L0;
            }
          }
          L6: {
            L7: {
              if (-1 > (bd.field_c ^ -1)) {
                break L7;
              } else {
                if ((fj.field_f ^ -1) < -1) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (null == ta.field_e) {
                break L8;
              } else {
                ta.field_e.f(ql.field_ec.field_Y, 0);
                break L8;
              }
            }
            L9: {
              L10: {
                stackOut_20_0 = ql.field_ec;
                stackIn_23_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (!param1) {
                  break L10;
                } else {
                  stackOut_21_0 = (gh) (Object) stackIn_21_0;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (vb.field_c) {
                    break L10;
                  } else {
                    stackOut_22_0 = (gh) (Object) stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L9;
                  }
                }
              }
              stackOut_23_0 = (gh) (Object) stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L9;
            }
            L11: {
              L12: {
                ((gh) (Object) stackIn_24_0).a(stackIn_24_1 != 0, (byte) 127);
                stackOut_24_0 = gl.field_y;
                stackIn_27_0 = stackOut_24_0;
                stackIn_25_0 = stackOut_24_0;
                if (!param1) {
                  break L12;
                } else {
                  stackOut_25_0 = (gh) (Object) stackIn_25_0;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (vb.field_c) {
                    break L12;
                  } else {
                    stackOut_26_0 = (gh) (Object) stackIn_26_0;
                    stackOut_26_1 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    break L11;
                  }
                }
              }
              stackOut_27_0 = (gh) (Object) stackIn_27_0;
              stackOut_27_1 = 0;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L11;
            }
            ((gh) (Object) stackIn_28_0).a(stackIn_28_1 != 0, (byte) 126);
            break L6;
          }
          tk.f((byte) 98);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, cc param3, kg param4, int param5, int param6) {
        kk.a((gh) (Object) param3, -1, -1, (int[]) null, param3.field_mc, param3.field_Vb, 1073741824, param3.field_ec, param4);
        an.field_i.a(true, (byte) -126);
        an.field_i.a((int[]) null, -2, 0);
        an.field_i.c(-121);
        dd var12 = an.field_i;
        int var8 = param1;
        int var9 = param6;
        int var10 = param0;
        int var11 = param5;
        var12.field_j.a(var11, var10, var9, (byte) -101, var8);
        if (param2 != 4) {
            kf discarded$0 = bf.a((byte) -65, -107, 25, 12, -73);
        }
    }

    final static void a(byte param0, boolean param1, String param2) {
        nm.field_p = param1 ? true : false;
        kc.field_A = true;
        ch.field_O = new k(ag.field_p, gf.field_d, param2, de.field_d, nm.field_p);
        ag.field_p.a((lh) (Object) ch.field_O, -118);
        if (param0 > -63) {
            bf.m(57);
        }
    }

    final static void m(int param0) {
        ea.field_l = new gh(0L, (gh) null);
        if (param0 != 854) {
            field_zb = null;
        }
        if (!(!rm.field_p)) {
            ea.field_l.a(jb.field_C, 126);
        }
        ea.field_l.a(fl.field_c, 122);
        sn.field_f = new uf(kh.field_p, ea.field_l);
        mg.field_Ub = new gh(0L, (gh) null);
        mg.field_Ub.a((gh) (Object) sn.field_f.field_d, param0 + -734);
        mg.field_Ub.a(sg.field_i, 120);
        vl.d(0);
    }

    final void c(lh param0, int param1) {
        super.c(param0, param1 ^ 0);
        if (param1 != -22908735) {
            field_Bb = null;
        }
    }

    final static String a(int param0, int param1, byte param2, CharSequence[] param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = SteelSentinels.field_G;
        if (0 != param0) {
          if ((param0 ^ -1) == -2) {
            var10 = param3[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param1 + param0;
            var5 = 0;
            var6_int = param1;
            L0: while (true) {
              if (var6_int >= var4) {
                L1: {
                  var6 = new StringBuilder(var5);
                  if (param2 == 50) {
                    break L1;
                  } else {
                    bf.m((byte) 37);
                    break L1;
                  }
                }
                var7 = param1;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param3[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param3[var6_int];
                if (var7_ref_CharSequence != null) {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Gb = false;
        field_Db = "Return to Campaign";
        field_Bb = "Elapsed time";
        field_zb = "TECH VALUE: <%0> (<%1>)";
        field_Eb = "Mission Failed";
    }
}
