/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ci {
    static String field_Ob;
    private ci field_Kb;
    static String field_Jb;
    static int field_Tb;
    static ln field_Rb;
    static jc field_Sb;
    private ci field_Ib;
    static volatile int field_Eb;
    private ci field_Hb;
    private ci field_Qb;
    private int field_Pb;
    static int field_Fb;
    static long[] field_Nb;
    static un field_Lb;
    private ci field_Mb;
    private ci field_Gb;

    final static boolean a(byte param0, ve param1, ve param2) {
        int var4 = Chess.field_G;
        if (param0 != -15) {
            return true;
        }
        int var3 = -param2.field_Ib + param1.field_Ib;
        if (f.field_a != param1.field_Lb) {
            // if_acmpne L72
            // wide iinc 3 200
        } else {
            // wide iinc 3 -200
        }
        if (param2.field_Lb != f.field_a) {
            // if_acmpne L114
            // wide iinc 3 -200
        } else {
            // wide iinc 3 200
        }
        return var3 > 0 ? true : false;
    }

    final static boolean a(String param0, byte param1) {
        int var3 = 0;
        int var4 = Chess.field_G;
        int var2 = param0.charAt(0);
        if (param1 < 81) {
            Object var5 = null;
            boolean discarded$0 = pd.a((String) null, (byte) -8);
        }
        for (var3 = 1; param0.length() > var3; var3++) {
            if (param0.charAt(var3) != var2) {
                return false;
            }
        }
        return true;
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = Chess.field_G;
        dc.a(nj.field_t, param0, true, (byte) -123, bj.field_gb, ed.field_b, 0);
        for (var2 = 0; var2 < ed.field_b; var2++) {
            vn.field_Ab[var2 + param0] = var2;
        }
        dc.a(bh.field_F, param0 + param0, false, (byte) -118, eb.field_y, ed.field_b + param0, param0);
        if (param1 >= -102) {
            boolean discarded$0 = pd.a(-89, -57, 110);
        }
        if (ed.field_b > param0) {
            ed.field_b = param0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        ((pd) this).field_M = param7;
        ((pd) this).field_V = param5;
        ((pd) this).field_mb = param4;
        ((pd) this).field_pb = param0;
        ((pd) this).a(true, param3, param2, param1);
        if (param6 > -32) {
            field_Lb = null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = ib.field_d != null ? 1 : 0;
        if (9 == vg.field_a) {
            if (ph.a(hn.field_s, (byte) -43, v.field_b, a.field_f, ca.field_i)) {
                if ((hn.field_s ^ -1) != -3) {
                    if (var3 != 0) {
                        return false;
                    }
                }
                return fl.a(ca.field_i, a.field_f, hn.field_s, v.field_b, (byte) 105);
            }
        }
        if (!((vg.field_a ^ -1) != -11)) {
            if (!(var3 == 0)) {
                return false;
            }
            sh.a(false);
            return true;
        }
        if (vg.field_a == 11) {
            if (!(!dc.field_m)) {
                if (vg.field_f == 2) {
                    if (!(kn.a(hd.field_e, tj.field_m, 29712))) {
                        return false;
                    }
                }
                if (vg.field_f != 2) {
                    if (!(var3 == 0)) {
                        return false;
                    }
                }
                if (dk.c(false)) {
                    ke.a(param0 ^ -17303, vg.field_f, hd.field_e, param1, ja.field_i, (String) null);
                }
                return true;
            }
        }
        if (param0 != -26057) {
            field_Fb = 32;
            return false;
        }
        return false;
    }

    public static void n(int param0) {
        field_Ob = null;
        field_Lb = null;
        field_Nb = null;
        field_Jb = null;
        field_Sb = null;
        if (param0 != 0) {
            return;
        }
        field_Rb = null;
    }

    final boolean o(int param0) {
        if (param0 != 25708) {
            return true;
        }
        if (!(0 == ((pd) this).field_Kb.field_L)) {
            ((pd) this).field_Pb = 20;
            return true;
        }
        if (((pd) this).field_Kb.field_kb != 0) {
            if (!(((pd) this).field_Pb <= 0)) {
                ((pd) this).field_Pb = ((pd) this).field_Pb - 1;
            }
            if (((pd) this).field_Pb == 0) {
                if (rf.field_b < ((pd) this).field_Qb.field_wb - -((pd) this).field_Qb.field_vb) {
                    ((pd) this).field_Pb = 3;
                    return true;
                }
            }
        }
        return false;
    }

    final boolean m(int param0) {
        if (param0 != 2) {
            boolean discarded$0 = ((pd) this).m(12);
        }
        return ((pd) this).field_Qb.field_kb != 0 ? true : false;
    }

    pd(long param0, pd param1) {
        this(param0, param1.field_Hb, param1.field_Ib, param1.field_Kb, param1.field_Qb);
    }

    final boolean l(int param0) {
        if (((pd) this).field_Mb.field_L != 0) {
            ((pd) this).field_Pb = 20;
            return true;
        }
        if (((pd) this).field_Mb.field_kb == param0) {
            return false;
        }
        if ((((pd) this).field_Pb ^ -1) < -1) {
            ((pd) this).field_Pb = ((pd) this).field_Pb - 1;
        }
        if (((pd) this).field_Pb == 0) {
            if (((pd) this).field_Qb.field_pb + ((pd) this).field_Qb.field_vb + (((pd) this).field_Qb.field_wb - -((pd) this).field_Qb.field_N) <= rf.field_b) {
                ((pd) this).field_Pb = 3;
                return true;
            }
        }
        return false;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ci var14 = null;
        ci var15 = null;
        ci var16 = null;
        ci var17 = null;
        ci var18 = null;
        ci var19 = null;
        ci stackIn_13_0 = null;
        ci stackIn_13_1 = null;
        ci stackIn_13_2 = null;
        ci stackIn_14_0 = null;
        ci stackIn_14_1 = null;
        ci stackIn_14_2 = null;
        ci stackIn_15_0 = null;
        ci stackIn_15_1 = null;
        ci stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        ci stackOut_12_0 = null;
        ci stackOut_12_1 = null;
        ci stackOut_12_2 = null;
        ci stackOut_14_0 = null;
        ci stackOut_14_1 = null;
        ci stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        ci stackOut_13_0 = null;
        ci stackOut_13_1 = null;
        ci stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        L0: {
          if (((pd) this).field_M * 2 > ((pd) this).field_pb) {
            var6 = ((pd) this).field_pb / 2;
            var5 = ((pd) this).field_pb / 2;
            break L0;
          } else {
            var6 = ((pd) this).field_pb + -((pd) this).field_M;
            var5 = ((pd) this).field_M;
            break L0;
          }
        }
        L1: {
          var7 = -var5 + var6;
          var8 = var7;
          if (0 < param3) {
            L2: {
              var8 = var8 * param1 / param3;
              if (var8 < ((pd) this).field_M) {
                var8 = ((pd) this).field_M;
                break L2;
              } else {
                break L2;
              }
            }
            if (var7 >= var8) {
              break L1;
            } else {
              var8 = var7;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = -param1 + param3;
          var10 = -var8 + var7;
          var11 = 0;
          if ((var9 ^ -1) >= -1) {
            break L3;
          } else {
            var11 = (var9 / 2 + var10 * param2) / var9;
            break L3;
          }
        }
        L4: {
          var12 = var11 - -(var8 / 2);
          var14 = ((pd) this).field_Hb;
          var14.field_V = 0;
          var14.field_M = ((pd) this).field_M;
          var14.field_mb = 0;
          var14.field_pb = var5;
          var15 = ((pd) this).field_Ib;
          var15.field_M = ((pd) this).field_M;
          var15.field_V = var6;
          var15.field_mb = 0;
          var15.field_pb = -var6 + ((pd) this).field_pb;
          var16 = ((pd) this).field_Gb;
          var16.field_M = ((pd) this).field_M;
          var16.field_mb = 0;
          var16.field_pb = var7;
          var16.field_V = var5;
          var17 = ((pd) this).field_Kb;
          var17.field_M = ((pd) this).field_M;
          var17.field_mb = 0;
          var17.field_V = 0;
          var17.field_pb = var12;
          var18 = ((pd) this).field_Mb;
          var18.field_mb = 0;
          var18.field_V = var12;
          var18.field_pb = -var12 + var7;
          var18.field_M = ((pd) this).field_M;
          var19 = ((pd) this).field_Qb;
          var19.field_M = ((pd) this).field_M;
          var19.field_pb = var8;
          stackOut_12_0 = ((pd) this).field_Hb;
          stackOut_12_1 = ((pd) this).field_Ib;
          stackOut_12_2 = ((pd) this).field_Gb;
          stackIn_14_0 = stackOut_12_0;
          stackIn_14_1 = stackOut_12_1;
          stackIn_14_2 = stackOut_12_2;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          stackIn_13_2 = stackOut_12_2;
          if (param3 <= param1) {
            stackOut_14_0 = (ci) (Object) stackIn_14_0;
            stackOut_14_1 = (ci) (Object) stackIn_14_1;
            stackOut_14_2 = (ci) (Object) stackIn_14_2;
            stackOut_14_3 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            stackIn_15_2 = stackOut_14_2;
            stackIn_15_3 = stackOut_14_3;
            break L4;
          } else {
            stackOut_13_0 = (ci) (Object) stackIn_13_0;
            stackOut_13_1 = (ci) (Object) stackIn_13_1;
            stackOut_13_2 = (ci) (Object) stackIn_13_2;
            stackOut_13_3 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_15_3 = stackOut_13_3;
            break L4;
          }
        }
        L5: {
          ((ci) (Object) stackIn_15_2).field_tb = stackIn_15_3 != 0;
          ((ci) (Object) stackIn_15_1).field_tb = stackIn_15_3 != 0;
          ((ci) (Object) stackIn_15_0).field_tb = stackIn_15_3 != 0;
          var19.field_V = var11;
          if (param0) {
            break L5;
          } else {
            ((pd) this).field_Gb = null;
            break L5;
          }
        }
        var19.field_mb = 0;
    }

    final boolean k(int param0) {
        if (param0 != 3384) {
            return true;
        }
        if (!(0 == ((pd) this).field_Hb.field_L)) {
            ((pd) this).field_Pb = 20;
            return true;
        }
        if (0 == ((pd) this).field_Hb.field_kb) {
            return false;
        }
        if (-1 > (((pd) this).field_Pb ^ -1)) {
            ((pd) this).field_Pb = ((pd) this).field_Pb - 1;
        }
        if (((pd) this).field_Pb == 0) {
            ((pd) this).field_Pb = 3;
            return true;
        }
        return false;
    }

    pd(long param0, ci param1, ci param2, ci param3, ci param4) {
        super(param0, (ci) null);
        ((pd) this).field_Hb = new ci(0L, param1);
        ((pd) this).field_Ib = new ci(0L, param2);
        ((pd) this).a((byte) 127, ((pd) this).field_Hb);
        ((pd) this).a((byte) 123, ((pd) this).field_Ib);
        ((pd) this).field_Gb = new ci(0L, (ci) null);
        ((pd) this).a((byte) 124, ((pd) this).field_Gb);
        ((pd) this).field_Kb = new ci(0L, param3);
        ((pd) this).field_Mb = new ci(0L, param3);
        ((pd) this).field_Mb.field_w = true;
        ci var9 = ((pd) this).field_Kb;
        ci var10 = var9;
        var10.field_w = true;
        ((pd) this).field_Gb.a((byte) 127, ((pd) this).field_Kb);
        ((pd) this).field_Gb.a((byte) 124, ((pd) this).field_Mb);
        ((pd) this).field_Qb = new ci(0L, param4);
        ((pd) this).field_Qb.field_rb = true;
        ((pd) this).field_Gb.a((byte) 124, ((pd) this).field_Qb);
    }

    final int b(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = -((pd) this).field_Qb.field_pb + ((pd) this).field_Gb.field_pb;
        if (0 < var6) {
            var7 = ((pd) this).field_Qb.field_V;
            var8 = -param3 + param1;
            var5 = (var8 * var7 - -(var6 / 2)) / var6;
        }
        if (param0 != -1) {
            boolean discarded$0 = ((pd) this).m(52);
        }
        if (!param2) {
            if (var5 > -param3 + param1) {
                var5 = -param3 + param1;
            }
            // ifge L140
            var5 = 0;
        } else {
            if (!((var5 ^ -1) <= -1)) {
                var5 = 0;
            }
            if (!(var5 <= param1 + -param3)) {
                var5 = param1 + -param3;
            }
        }
        return var5;
    }

    final boolean f(byte param0) {
        if (0 != ((pd) this).field_Ib.field_L) {
            ((pd) this).field_Pb = 20;
            return true;
        }
        if (!(0 == ((pd) this).field_Ib.field_kb)) {
            if (0 < ((pd) this).field_Pb) {
                ((pd) this).field_Pb = ((pd) this).field_Pb - 1;
            }
            if (((pd) this).field_Pb == 0) {
                ((pd) this).field_Pb = 3;
                return true;
            }
        }
        if (param0 != -38) {
            ((pd) this).field_Ib = null;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = "Orb points: ";
        field_Tb = 9;
        field_Jb = "Invite only";
        field_Eb = 0;
        field_Nb = new long[1000];
    }
}
