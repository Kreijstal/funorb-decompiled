/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends vb {
    static String field_fb;
    private rk field_gb;
    static String[] field_bb;
    static int field_ab;
    private rk field_hb;
    private boolean field_cb;
    static boolean field_db;
    static int[] field_eb;
    private rk field_ib;

    final static void a(int param0, long param1, String param2) {
        ed.field_c = param2;
        pk.field_r = 2;
        CharSequence var5 = (CharSequence) (Object) param2;
        cf.field_c = kf.a(var5, (byte) 2);
        int var4 = -54 / ((-27 - param0) / 54);
        fm.field_d = param1;
        v.b(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -103) {
            return;
        }
        super.a(param0, -120, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        param0 = param0 + ((pn) this).field_u;
        param3 = param3 + ((pn) this).field_D;
        this.a(param0, n.field_d, param3, (ce) (Object) ((pn) this).field_gb, 0);
        this.a(param0, ql.field_a, param3, (ce) (Object) ((pn) this).field_hb, 0);
        this.a(param0, pf.field_c, param3, (ce) (Object) ((pn) this).field_ib, 0);
    }

    final static void a(int param0, int param1, boolean param2, int param3, String param4, int param5, int param6, int param7) {
        if (param5 < 126) {
            pn.a(false, true, false);
        }
        if (0 == sk.field_c.field_ob) {
        } else {
            if (!wc.field_n) {
                if (!wl.field_p) {
                    jg.field_i = true;
                } else {
                    aj.a(-1045);
                }
            }
        }
        if (jg.field_i) {
            jb.a(20, param3, 113, param1, param7, param6, param6, param4, param0);
            tf.field_gb.a(false, param2);
            if (!(!param2)) {
                if (ve.field_vc.field_ob != 0) {
                    jg.field_i = false;
                }
                if (bf.field_v.field_ob != 0) {
                    qk.a((byte) 94);
                    jg.field_i = false;
                }
            }
        }
    }

    private pn(gl param0, boolean param1) {
        super(0, 0, 0, 0, (gl) null);
        ((pn) this).field_gb = (rk) (Object) new og("", (kg) null, 2);
        ((pn) this).field_hb = (rk) (Object) new og("", (kg) null, 2);
        ((pn) this).field_ib = (rk) (Object) new og("", (kg) null, 4);
        ((pn) this).field_ib.field_p = param0;
        ((pn) this).field_hb.field_p = param0;
        ((pn) this).field_gb.field_p = param0;
        ((pn) this).field_cb = param1 ? true : false;
        if (!((pn) this).field_cb) {
            ((pn) this).b((ce) (Object) ((pn) this).field_gb, (byte) -55);
            ((pn) this).b((ce) (Object) ((pn) this).field_hb, (byte) -55);
        } else {
            ((pn) this).b((ce) (Object) ((pn) this).field_hb, (byte) -55);
            ((pn) this).b((ce) (Object) ((pn) this).field_gb, (byte) -55);
        }
        ((pn) this).b((ce) (Object) ((pn) this).field_ib, (byte) -55);
    }

    final int b(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          if (!param0) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = 6;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = -1 + Integer.parseInt(((pn) this).field_hb.field_E);
          stackIn_4_0 = stackOut_3_0;
        }
        return 0;
    }

    final static void a(int param0, wl param1) {
        dj.field_Y = param1.e(3) << -610206843;
        int var2 = param1.d((byte) -39);
        tj.field_Pb = var2 << 1424118994 & 1835008;
        dj.field_Y = dj.field_Y + (var2 >> 1911408259);
        tj.field_Pb = tj.field_Pb + (param1.e(3) << 697928706);
        var2 = param1.d((byte) -59);
        oc.field_c = (var2 & param0) << -2074046513;
        tj.field_Pb = tj.field_Pb + (var2 >> 1459247494);
        oc.field_c = oc.field_c + (param1.d((byte) -105) << 2087446055);
        var2 = param1.d((byte) -81);
        vm.field_s = (1 & var2) << -1105099568;
        oc.field_c = oc.field_c + (var2 >> -344219967);
        vm.field_s = vm.field_s + param1.e(param0 + -60);
    }

    pn(gl param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((pn) this).b(param5, param4, param2, param3, -16555);
    }

    final String c(byte param0) {
        String var2 = ((pn) this).field_hb.c(param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!((pn) this).field_q) {
            return null;
        }
        return null == ((pn) this).field_B ? ((pn) this).field_E : ((pn) this).field_B;
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == -22079) {
            break L0;
          } else {
            ((pn) this).field_ib = null;
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((pn) this).field_gb.field_E);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final void a(byte param0, qf param1) {
        super.a((byte) 88, param1);
        if (param0 < 74) {
            Object var4 = null;
            boolean discarded$0 = pn.a((wb) null, (wb) null, true);
        }
        ((pn) this).field_gb.field_v = (kg) (Object) param1;
        ((pn) this).field_hb.field_v = (kg) (Object) param1;
        ((pn) this).field_ib.field_v = (kg) (Object) param1;
    }

    final static boolean a(wb param0, wb param1, boolean param2) {
        int var4 = client.field_A ? 1 : 0;
        if (param2) {
            Object var5 = null;
            boolean discarded$0 = pn.a((wb) null, (wb) null, true);
        }
        int var3 = -param0.field_Xb + param1.field_Xb;
        if (f.field_w == param1.field_Vb) {
            // wide iinc 3 -200
        } else {
            if (param1.field_Vb == null) {
                // wide iinc 3 200
            }
        }
        if (f.field_w != param0.field_Vb) {
            // ifnonnull L127
            // wide iinc 3 -200
        } else {
            // wide iinc 3 200
        }
        return -1 > (var3 ^ -1) ? true : false;
    }

    public static void l(int param0) {
        field_bb = null;
        field_eb = null;
        field_fb = null;
        if (param0 != 33) {
            field_ab = 39;
        }
    }

    private final void a(int param0, String param1, int param2, ce param3, int param4) {
        if (param4 != 0) {
            ((pn) this).field_ib = null;
        }
        bj.field_f.b(param1, (param3.field_t >> 1492292289) + param3.field_u + param0, param2 + (param3.field_D - 5), 16777215, -1);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, -16555);
        int var6 = param1 - 130 >> 401361505;
        if (((pn) this).field_cb) {
            ((pn) this).field_hb.b(param0, 25, var6, 0, -16555);
            ((pn) this).field_gb.b(param0, 25, 45 + var6, 0, -16555);
        } else {
            ((pn) this).field_gb.b(param0, 25, var6, 0, -16555);
            ((pn) this).field_hb.b(param0, 25, 45 + var6, 0, param4 + 0);
        }
        ((pn) this).field_ib.b(param0, 40, var6 - -90, 0, param4);
    }

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            field_db = false;
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((pn) this).field_ib.field_E);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final boolean k(int param0) {
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        if (((pn) this).field_gb.field_E == null) {
          return true;
        } else {
          if (0 != ((pn) this).field_gb.field_E.length()) {
            if (param0 > 64) {
              L0: {
                if (null == ((pn) this).field_hb.field_E) {
                  break L0;
                } else {
                  if (0 != ((pn) this).field_hb.field_E.length()) {
                    L1: {
                      L2: {
                        if (((pn) this).field_ib.field_E == null) {
                          break L2;
                        } else {
                          if (((pn) this).field_ib.field_E.length() == 0) {
                            break L2;
                          } else {
                            stackOut_12_0 = 0;
                            stackIn_14_0 = stackOut_12_0;
                            break L1;
                          }
                        }
                      }
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      break L1;
                    }
                    return stackIn_14_0 != 0;
                  } else {
                    break L0;
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static we a(String param0, int param1, int param2) {
        sc var3 = new sc();
        ((we) (Object) var3).field_d = param0;
        if (param2 != 23155) {
            pn.l(-1);
        }
        ((we) (Object) var3).field_f = param1;
        return (we) (Object) var3;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int var4 = 0;
        int var5 = client.field_A ? 1 : 0;
        cd.a(true);
        gh.field_e = null;
        kf.field_I = new qc(false, 0, false, 0, 0, 3, 0, (String[]) null, 0, false, param1, param0);
        if (!param1) {
            kf.field_I.field_p.a((bh) (Object) new in(sk.field_i, 10, false), 2777);
        } else {
            kf.field_I.field_p.a((bh) (Object) new in(ka.field_M, 10, false), 2777);
        }
        am.field_c = param2;
        gk.field_Ib = false;
        int[] var8 = j.field_d;
        int[] var7 = var8;
        int[] var6 = var7;
        int[] var3 = var6;
        for (var4 = 0; (var4 ^ -1) > -9; var4++) {
            var8[var4] = 0;
        }
        nn.a(kf.field_I.b(param2), sb.field_u[0][0], true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = 0;
        field_eb = new int[]{40, 33, 27, 22, 18, 15, 12, 10, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    }
}
