/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class n extends gn implements dm {
    private sh field_S;
    static int field_M;
    static fj[] field_L;
    static boolean field_P;
    static ah field_N;
    static int field_O;
    private String[] field_V;
    static hj field_U;
    private ae[] field_T;
    static String field_R;
    static boolean field_Q;

    final static String a(boolean param0, String param1, String param2, String param3) {
        int var5 = TetraLink.field_J;
        int var4 = param3.indexOf(param1);
        while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param1.length());
            var4 = param3.indexOf(param1, var4 - -param2.length());
        }
        if (!param0) {
            Object var6 = null;
            n.a((byte) -53, (fj) null);
        }
        return param3;
    }

    n(sh param0) {
        super(0, 0, 0, 0, (kg) null);
        ((n) this).field_S = param0;
    }

    public static void a(int param0) {
        field_U = null;
        if (param0 <= 69) {
            Object var2 = null;
            n.a((byte) 120, (fj) null);
        }
        field_R = null;
        field_L = null;
        field_N = null;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          if (param0 < 0) {
            break L0;
          } else {
            field_L = null;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((n) this).field_V.length) {
            L2: {
              if (((n) this).field_T[((n) this).field_V.length] != param1) {
                break L2;
              } else {
                ((n) this).field_S.a(true);
                break L2;
              }
            }
            return;
          } else {
            if (param1 == ((n) this).field_T[var6]) {
              ((n) this).field_S.a(-118, ((n) this).field_V[var6]);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
            return;
        }
        jb var5 = od.field_S;
        if (null != ((n) this).field_V) {
            int discarded$0 = var5.a(pg.field_c, param1 + ((n) this).field_t, param2 - -((n) this).field_w, ((n) this).field_F, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_N);
        }
    }

    final void a(int param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TetraLink.field_J;
          ((n) this).field_J.b(1);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length == 0) {
              break L0;
            } else {
              var3 = param1.length;
              ((n) this).field_V = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= var3) {
                  var4 = new q(od.field_S, param0, 1);
                  ((n) this).field_T = new ae[var3 - -1];
                  var5 = 0;
                  L2: while (true) {
                    if (var3 <= var5) {
                      ((n) this).field_T[var3] = new ae(qc.field_ab, (dn) this);
                      ((n) this).field_T[var3].field_H = (kg) (Object) var4;
                      ((n) this).field_T[var3].a(15, 16 + var3 * 16 + 20, param0 + 73, 0, 100);
                      ((n) this).c((na) (Object) ((n) this).field_T[var3], 10);
                      return;
                    } else {
                      ((n) this).field_T[var5] = new ae(((n) this).field_V[var5], (dn) this);
                      ((n) this).field_T[var5].field_H = (kg) (Object) var4;
                      ((n) this).field_T[var5].field_C = rn.field_a;
                      ((n) this).field_T[var5].a(15, 16 * var5 + 20, 80, 0, 80);
                      ((n) this).c((na) (Object) ((n) this).field_T[var5], 10);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((n) this).field_V[var4_int] = p.a((CharSequence) (Object) param1[var4_int], (byte) 43).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        }
        ((n) this).field_V = null;
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        if (super.a(param0, param1, param2, param3)) {
            return true;
        }
        if (98 == param0) {
            return ((n) this).d(param3, 54);
        }
        if (99 != param0) {
            return false;
        }
        return ((n) this).b(param3, 108);
    }

    final static void a(byte param0, fj param1) {
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        String var6 = null;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        String stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        String stackIn_1_2 = null;
        int stackIn_1_3 = 0;
        Object stackIn_1_4 = null;
        Object stackIn_1_5 = null;
        long stackIn_1_6 = 0L;
        hl stackIn_1_7 = null;
        String stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        String stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        Object stackIn_2_4 = null;
        Object stackIn_2_5 = null;
        long stackIn_2_6 = 0L;
        hl stackIn_2_7 = null;
        String stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        String stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        Object stackIn_3_4 = null;
        Object stackIn_3_5 = null;
        long stackIn_3_6 = 0L;
        hl stackIn_3_7 = null;
        int stackIn_3_8 = 0;
        String stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        String stackOut_0_2 = null;
        int stackOut_0_3 = 0;
        Object stackOut_0_4 = null;
        Object stackOut_0_5 = null;
        long stackOut_0_6 = 0L;
        hl stackOut_0_7 = null;
        String stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        String stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        Object stackOut_2_4 = null;
        Object stackOut_2_5 = null;
        long stackOut_2_6 = 0L;
        hl stackOut_2_7 = null;
        int stackOut_2_8 = 0;
        String stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        String stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        Object stackOut_1_4 = null;
        Object stackOut_1_5 = null;
        long stackOut_1_6 = 0L;
        hl stackOut_1_7 = null;
        int stackOut_1_8 = 0;
        L0: {
          stackOut_0_0 = param1.field_n;
          stackOut_0_1 = 255;
          stackOut_0_2 = param1.field_e;
          stackOut_0_3 = param1.field_i;
          stackOut_0_4 = null;
          stackOut_0_5 = null;
          stackOut_0_6 = param1.field_r;
          stackOut_0_7 = param1.field_f;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_2_5 = stackOut_0_5;
          stackIn_2_6 = stackOut_0_6;
          stackIn_2_7 = stackOut_0_7;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          stackIn_1_5 = stackOut_0_5;
          stackIn_1_6 = stackOut_0_6;
          stackIn_1_7 = stackOut_0_7;
          if ((param1.field_i ^ -1) == -2) {
            stackOut_2_0 = (String) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = (String) (Object) stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = stackIn_2_4;
            stackOut_2_5 = stackIn_2_5;
            stackOut_2_6 = stackIn_2_6;
            stackOut_2_7 = (hl) (Object) stackIn_2_7;
            stackOut_2_8 = param1.field_j;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            stackIn_3_6 = stackOut_2_6;
            stackIn_3_7 = stackOut_2_7;
            stackIn_3_8 = stackOut_2_8;
            break L0;
          } else {
            stackOut_1_0 = (String) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = (String) (Object) stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = stackIn_1_4;
            stackOut_1_5 = stackIn_1_5;
            stackOut_1_6 = stackIn_1_6;
            stackOut_1_7 = (hl) (Object) stackIn_1_7;
            stackOut_1_8 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            stackIn_3_6 = stackOut_1_6;
            stackIn_3_7 = stackOut_1_7;
            stackIn_3_8 = stackOut_1_8;
            break L0;
          }
        }
        L1: {
          gd.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, (rb) (Object) stackIn_3_4, (int[]) (Object) stackIn_3_5, stackIn_3_6, stackIn_3_7, stackIn_3_8);
          if (param1.field_i != 0) {
            break L1;
          } else {
            if (u.a(113)) {
              break L1;
            } else {
              if (null != qb.field_N) {
                break L1;
              } else {
                if (null == qe.field_a) {
                  L2: {
                    if (!fn.field_K) {
                      var5 = hd.field_s;
                      var6 = mn.field_f;
                      var5.field_j.a(var6, 1, 14);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = hd.field_s;
                  var8 = bc.field_x;
                  var7.field_j.a(var8, 1, 20);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L3: {
          if (-2 != (param1.field_i ^ -1)) {
            break L3;
          } else {
            if (u.a(param0 ^ 0)) {
              break L3;
            } else {
              if (null == qb.field_N) {
                break L3;
              } else {
                if (param1.field_j != qb.field_N.j(param0 ^ -7)) {
                  break L3;
                } else {
                  L4: {
                    if (fn.field_K) {
                      break L4;
                    } else {
                      var9 = hd.field_s;
                      var10 = lc.field_d;
                      var9.field_j.a(var10, 1, 14);
                      break L4;
                    }
                  }
                  var11 = hd.field_s;
                  var12 = bd.field_d;
                  var11.field_j.a(var12, param0 ^ 110, 20);
                  break L3;
                }
              }
            }
          }
        }
        if (param0 == 111) {
          hd.field_s.b((byte) 79);
          hd.field_s.a(param0 + -92, false);
          hd.field_s.a(param1.field_i, param1.field_a, true);
          hd.field_s.a(true);
          hd.field_s.a(param1, param0 ^ 99);
          var13 = hd.field_s;
          var3 = ci.field_B;
          var4 = li.field_o;
          var13.field_j.a(0, var4, -73, 0, var3);
          return;
        } else {
          return;
        }
    }

    static {
    }
}
