/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class pj extends rc {
    static int field_H;
    boolean field_F;
    static String field_G;
    boolean field_B;
    static int field_A;
    private boolean field_E;
    private boolean field_C;
    static hb field_D;

    final boolean b(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((pj) this).field_E;
    }

    pj(String param0, dg param1) {
        this(param0, ph.field_f.field_i, param1);
    }

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        if (((pj) this).field_B) {
            if (!(!((pj) this).a(param4, param3, param1, param5, -94))) {
                boolean discarded$0 = ((pj) this).a(-1463, param6);
                ((pj) this).field_u = param0;
                if (((pj) this).field_n != null) {
                    if (!(((pj) this).field_n instanceof oj)) {
                        return true;
                    }
                    ((oj) (Object) ((pj) this).field_n).a(param0, param4, -29264, param1, param5, param3, (pj) this);
                }
                return true;
            }
        }
        if (param2) {
            Object var9 = null;
            pj.a(-9, (da) null);
        }
        return false;
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 0;
        L0: {
          var5 = 98 % ((param1 - 31) / 56);
          if (!((pj) this).b(true)) {
            break L0;
          } else {
            L1: {
              if (param2 == 84) {
                break L1;
              } else {
                if ((param2 ^ -1) != -84) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((pj) this).a(true, -1, 1, -1);
            return true;
          }
        }
        return false;
    }

    final static boolean a(da param0, int param1, da param2, da param3) {
        Object var5 = null;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          if (param1 == -16925) {
            break L0;
          } else {
            var5 = null;
            pj.a(-17, (da) null);
            break L0;
          }
        }
        if (!param2.c((byte) -121)) {
          return false;
        } else {
          if (param2.a(param1 + 16927, "commonui")) {
            L1: {
              if (!param0.c((byte) -121)) {
                break L1;
              } else {
                if (param0.a(2, "commonui")) {
                  L2: {
                    L3: {
                      if (!param3.c((byte) -121)) {
                        break L3;
                      } else {
                        if (!param3.a(2, "button.gif")) {
                          break L3;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  }
                  return stackIn_14_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        if (null != ((pj) this).field_n) {
            if (!(!(((pj) this).field_n instanceof oj))) {
                ((oj) (Object) ((pj) this).field_n).a(param4, (byte) -88, (pj) this, param3, param0, param5);
            }
        }
        ((pj) this).field_u = param1;
    }

    public static void h(int param0) {
        field_G = null;
        int var1 = -33 / ((param0 - 0) / 41);
        field_D = null;
    }

    void a(boolean param0, int param1, int param2, int param3) {
        if (((pj) this).field_n != null) {
            if (!(!(((pj) this).field_n instanceof ka))) {
                ((ka) (Object) ((pj) this).field_n).a(param2, param1, param3, (pj) this, true);
            }
        }
        if (!param0) {
            field_G = null;
        }
    }

    final void g(int param0) {
        if (!(!((pj) this).field_E)) {
            ((pj) this).field_E = false;
            if (null != ((pj) this).field_n) {
                if (!(!(((pj) this).field_n instanceof p))) {
                    ((p) (Object) ((pj) this).field_n).a(true, (rc) this, ((pj) this).field_E);
                }
            }
        }
        if (param0 != 0) {
            ((pj) this).field_B = false;
        }
    }

    pj(String param0, j param1, dg param2) {
        super(param0, param1, param2);
        ((pj) this).field_B = true;
        ((pj) this).field_E = false;
        ((pj) this).field_C = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!(!((pj) this).a(param2, -1, param1, param3))) {
            ((pj) this).b(param2, 29, param1, param3);
            if (!(!((pj) this).field_F)) {
                StringBuilder discarded$0 = param2.append(" active");
            }
            if (!(((pj) this).field_B)) {
                StringBuilder discarded$1 = param2.append(" disabled");
            }
        }
        if (param0 >= -41) {
            ((pj) this).field_C = false;
        }
        return param2;
    }

    boolean a(int param0, rc param1) {
        if (!((pj) this).field_B) {
          return false;
        } else {
          if (((pj) this).field_C) {
            L0: {
              param1.g(param0 ^ param0);
              ((pj) this).field_E = true;
              if (((pj) this).field_n == null) {
                break L0;
              } else {
                if (!(((pj) this).field_n instanceof p)) {
                  break L0;
                } else {
                  ((p) (Object) ((pj) this).field_n).a(true, (rc) this, ((pj) this).field_E);
                  break L0;
                }
              }
            }
            return true;
          } else {
            return false;
          }
        }
    }

    final static short[] a(int param0, jd param1, int param2, short[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        var4 = param1.d((byte) 48, param2);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (var4 == param3.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param1.d((byte) 48, 4);
            var6 = (short)param1.d((byte) 48, 16);
            if ((var5 ^ -1) < param0) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param3[var7] = (short)(param1.d((byte) 48, var5) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param3[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    final static da a(int param0, byte param1, int param2, boolean param3, boolean param4) {
        int var5 = 10 / ((-74 - param1) / 37);
        return ab.a(2097152, param0, param2, false, param4, param3);
    }

    final static void a(int param0, da param1) {
        o var2 = new o(param1.a(4, "final_frame.jpg", ""), (java.awt.Component) (Object) dc.field_q);
        int var3 = var2.field_p;
        int var4 = var2.field_t;
        fl.b((byte) 91);
        gg.field_e = new o(var3, var4 * param0 / 4);
        gg.field_e.a();
        var2.c(0, 0);
        ql.field_p = new o(var3, -gg.field_e.field_t + var4);
        ql.field_p.a();
        var2.c(0, -gg.field_e.field_t);
        ql.field_p.field_n = gg.field_e.field_t;
        mf.e(4096);
    }

    void a(int param0, int param1, int param2, rc param3) {
        super.a(param0, param1, param2, param3);
        if (-1 != (((pj) this).field_u ^ -1)) {
            if (wb.field_c != ((pj) this).field_u) {
                if (((pj) this).a(ad.field_m, gb.field_j, param0, param2, -107)) {
                    if (!(wb.field_c != 0)) {
                        ((pj) this).a(true, gb.field_j - param0, ((pj) this).field_u, -param2 + ad.field_m);
                    }
                }
                ((pj) this).a(ad.field_m, 0, param3, param2, gb.field_j, param0);
            }
        }
    }

    protected pj() {
        ((pj) this).field_B = true;
        ((pj) this).field_E = false;
        ((pj) this).field_C = true;
        ((pj) this).field_w = ph.field_f.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = 10;
        field_H = 9;
        field_G = "Type your email address again to make sure it's correct";
    }
}
