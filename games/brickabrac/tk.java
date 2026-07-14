/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tk extends nm {
    static String field_o;
    static mh field_t;
    static int field_q;
    static jp[][] field_l;
    static int field_r;
    static String field_m;
    static byte[] field_k;
    long field_j;
    static String field_i;
    tk field_n;
    static String field_p;
    tk field_s;

    final void d(int param0) {
        if (null == ((tk) this).field_n) {
            return;
        }
        ((tk) this).field_n.field_s = ((tk) this).field_s;
        ((tk) this).field_s.field_n = ((tk) this).field_n;
        ((tk) this).field_n = null;
        if (param0 != 3) {
            ((tk) this).field_s = null;
        }
        ((tk) this).field_s = null;
    }

    final static void a(int param0, ak param1, bi param2, j param3, byte param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        var8 = 5;
        var9 = 5;
        var10 = 3 + param2.field_B + param2.field_P;
        var11 = var8 + param5;
        var12 = param6 + (var9 - -param2.field_B);
        param2.c(jo.field_j, var11, var12, 2, -1);
        var12 = var12 + var10;
        param2.c(lq.field_e, var11, var12, 1, -1);
        var12 = var12 + var10;
        param2.c(ff.field_j, var11, var12, 2, -1);
        var12 = var12 + var10;
        param2.c(vd.field_d, var11, var12, 0, -1);
        if (param4 < -96) {
          L0: {
            L1: {
              if (!r.field_A) {
                break L1;
              } else {
                if (!wl.field_N) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var11 -= 2;
            var12 = var12 + (param2.field_P + 4);
            var13 = 0;
            L2: while (true) {
              if (var13 >= -1 + param3.field_rb) {
                break L0;
              } else {
                L3: {
                  if (var13 < -2 + param3.field_rb) {
                    ch.field_l.a(var11, var12, 196);
                    break L3;
                  } else {
                    ch.field_l.e(ch.field_l.field_x / 2 + var11, var12 - -(ch.field_l.field_z / 2), 0, 4480 - -(BrickABrac.c(2048, 200 * de.field_x) * 384 >> -1633448240));
                    break L3;
                  }
                }
                L4: {
                  var11 = var11 + ch.field_l.field_D / 2;
                  if (param5 - -param7 < var11 - -ch.field_l.field_D) {
                    var12 = var12 + (ch.field_l.field_C - -2);
                    var11 = param5 - -var8 + -2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var12 + ch.field_l.field_C > param6 - (-param0 + var9)) {
                  break L0;
                } else {
                  var13++;
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != -2) {
            field_p = null;
        }
        field_m = null;
        field_l = null;
        field_k = null;
        field_i = null;
        field_t = null;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        if (param1 != -55) {
            field_k = null;
        }
        return sq.a((byte) -32, param0, true, param2);
    }

    final long e(int param0) {
        if (param0 != -19451) {
            ((tk) this).field_s = null;
        }
        return ((tk) this).field_j;
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            tk.a((byte) 86, 25, 9);
        }
        if (null == ((tk) this).field_n) {
            return false;
        }
        return true;
    }

    final void a(long param0, int param1) {
        if (!(((tk) this).field_n == null)) {
            throw new RuntimeException();
        }
        if (param1 >= -62) {
            field_k = null;
        }
        ((tk) this).field_j = param0;
    }

    final static void a(byte param0, int param1, int param2) {
        if (null != cf.field_c) {
            // if_icmpgt L18
        } else {
            cf.field_c = new int[param1 * 2];
        }
        if (ec.field_N != null) {
            // if_icmplt L43
        } else {
            ec.field_N = new int[param1 * 2];
        }
        if (lf.field_r != null) {
            // if_icmplt L68
        } else {
            lf.field_r = new int[param1 * 2];
        }
        if (ao.field_p != null) {
            // if_icmple L104
        }
        ao.field_p = new int[param1 * 2];
        if (null != ib.field_D) {
            // if_icmpgt L122
        } else {
            ib.field_D = new int[2 * param1];
        }
        if (pj.field_b != null) {
            // if_icmplt L147
        } else {
            pj.field_b = new int[2 * param1];
        }
        if (fj.field_Pb != null) {
            // if_icmpgt L174
        } else {
            fj.field_Pb = new int[2 * (param2 + param1)];
        }
        if (null != ga.field_l) {
            // if_icmpge L213
        }
        ga.field_l = new boolean[2 * param1];
        rn.field_l = -2147483648;
        if (param0 < 0) {
            return;
        }
        wi.field_m = 0;
        ba.field_w = 2147483647;
        pe.field_u = 2147483647;
        uf.field_b = -2147483648;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (!(bd.a(param0, 0, true))) {
            return false;
        }
        int var2 = 0;
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = tk.a((CharSequence) null, false);
        }
        while (param0.length() > var2) {
            if (!m.a(true, param0.charAt(var2))) {
                return false;
            }
            var2++;
        }
        return true;
    }

    protected tk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Honour";
        field_m = "Show game chat from my friends";
        field_k = new byte[]{(byte) 1};
        field_i = "Scamming";
    }
}
