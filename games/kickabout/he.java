/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends hd {
    int field_Sb;
    static String field_Kb;
    static rv field_yb;
    hd field_Hb;
    boolean field_Gb;
    static String field_Ub;
    String field_Rb;
    long field_Ab;
    String field_Nb;
    int field_Qb;
    hd field_zb;
    static String field_Eb;
    int field_Mb;
    boolean field_Fb;
    long field_Ib;
    hd field_Tb;
    hd field_Lb;
    boolean field_Cb;
    int field_Db;
    hd field_Ob;
    int field_Jb;
    int field_Pb;
    static String field_Bb;

    public static void b(int param0) {
        field_yb = null;
        field_Bb = null;
        field_Eb = null;
        if (param0 != 240) {
            field_Bb = null;
        }
        field_Kb = null;
        field_Ub = null;
    }

    final static int a(byte param0, int[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var2 = 0;
        int[] var3_ref_int__ = param1;
        for (var4 = 0; var4 < var3_ref_int__.length; var4++) {
            var5 = var3_ref_int__[var4];
            var2 = var2 + var5;
        }
        int var3 = -10 / ((param0 - 40) / 37);
        return var2;
    }

    final boolean a(he param0, byte param1) {
        if (!((((he) this).field_Fb ? 1 : 0) != (!param0.field_Fb ? 1 : 0))) {
            return ((he) this).field_Fb;
        }
        if (!((!((he) this).field_Gb ? 1 : 0) != (param0.field_Gb ? 1 : 0))) {
            return ((he) this).field_Gb;
        }
        if (param1 != -82) {
            return true;
        }
        return ((he) this).field_Ib < param0.field_Ib ? true : false;
    }

    final static String a(int param0) {
        if (!(nr.field_f != wk.field_f)) {
            return ld.field_a;
        }
        if (param0 != 320) {
            Object var2 = null;
            he.a((vm) null, false);
        }
        if (!lc.field_e.a((byte) -80)) {
            return lc.field_e.a(3);
        }
        if (mj.field_a == nr.field_f) {
            return lc.field_e.a(param0 ^ 323);
        }
        return ep.field_b;
    }

    final static void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        dt[] var4 = null;
        int var5 = 0;
        dt var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gm var10 = null;
        L0: {
          var9 = Kickabout.field_G;
          if (null == af.field_a) {
            break L0;
          } else {
            if (nw.field_b.field_R[ek.field_G].d(3511)) {
              L1: {
                var10 = (gm) (Object) nw.field_b.a((byte) -76, ek.field_G);
                var2 = ug.a(param0, var10.field_kb >> -806464464);
                var3 = lf.a((byte) -119, var10.field_bb >> -130399952);
                if (!lb.a(var2, var3, param0 ^ 480)) {
                  var2 = 320;
                  var3 = 240;
                  break L1;
                } else {
                  break L1;
                }
              }
              var4 = af.field_a;
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4.length) {
                  return;
                } else {
                  var6 = var4[var5];
                  var7 = -1;
                  var8 = 0;
                  L3: while (true) {
                    if (nw.field_b.field_I <= var8) {
                      var5++;
                      continue L2;
                    } else {
                      L4: {
                        if (nw.field_b.field_g[ek.field_G].field_p != nw.field_b.field_g[var8].field_p) {
                          break L4;
                        } else {
                          if (var6.field_h != nw.field_b.field_R[var8].field_g) {
                            break L4;
                          } else {
                            var7 = var8;
                            break L4;
                          }
                        }
                      }
                      var6.a(var2, var3, var7, -113);
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    he(String param0, String param1, long param2) {
        super(0L, (hd) null);
        ((he) this).field_Ab = param2;
        ((he) this).field_Rb = param0;
        ((he) this).field_Nb = param1;
        CharSequence var6 = (CharSequence) (Object) ((he) this).field_Rb;
        String discarded$0 = mo.a(0, var6);
    }

    final boolean h(int param0) {
        if (param0 != -13356) {
            ((he) this).field_Db = -100;
        }
        return !((he) this).a((byte) -60) ? true : false;
    }

    final static wh a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        boolean stackIn_3_1 = false;
        int stackIn_4_0 = 0;
        boolean stackIn_4_1 = false;
        int stackIn_5_0 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_6_0 = 0;
        boolean stackIn_6_1 = false;
        int stackIn_7_0 = 0;
        boolean stackIn_7_1 = false;
        int stackIn_7_2 = 0;
        int stackOut_2_0 = 0;
        boolean stackOut_2_1 = false;
        int stackOut_6_0 = 0;
        boolean stackOut_6_1 = false;
        boolean stackOut_6_2 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_3_1 = false;
        int stackOut_5_0 = 0;
        boolean stackOut_5_1 = false;
        int stackOut_5_2 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        L0: {
          if (param2 == 240) {
            break L0;
          } else {
            field_Ub = null;
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = param3;
          stackOut_2_1 = ga.field_O[param4];
          stackIn_6_0 = stackOut_2_0;
          stackIn_6_1 = stackOut_2_1;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          if (!em.field_e) {
            stackOut_6_0 = stackIn_6_0;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = param1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2 ? 1 : 0;
            break L1;
          } else {
            stackOut_3_0 = stackIn_3_0;
            stackOut_3_1 = stackIn_3_1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1) {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = 0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = 1;
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
        }
        return wt.a(stackIn_7_0, stackIn_7_1, stackIn_7_2 != 0, param4, param0, -121);
    }

    final static void a(vm param0, boolean param1) {
        if (!(null == vg.field_Bb)) {
            vg.field_Bb.b((lq) (Object) param0);
        }
        if (!param1) {
            he.i(10);
        }
    }

    final void a(byte param0, String param1, String param2) {
        ((he) this).field_Rb = param2;
        if (param0 != -2) {
            return;
        }
        ((he) this).field_Nb = param1;
        CharSequence var5 = (CharSequence) (Object) ((he) this).field_Rb;
        String discarded$0 = mo.a(param0 ^ -2, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ub = "home";
        field_Kb = "Visit the Account Management section on the main site to view.";
        field_Eb = "Bid";
        field_Bb = "MANAGEMENT";
        field_yb = new rv();
    }
}
