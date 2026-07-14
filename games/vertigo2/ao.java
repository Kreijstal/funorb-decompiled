/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends d {
    static String[] field_Q;
    static String field_P;
    int field_I;
    int field_L;
    static long field_N;
    int field_T;
    int field_S;
    static dm field_O;
    int field_M;
    int field_J;
    static int field_K;
    static int field_H;
    static String field_R;

    final static int a(int param0, String param1, boolean param2) {
        if (param0 > 113) {
          if (param2) {
            return hd.field_f.c(param1);
          } else {
            return oc.field_s.c(param1);
          }
        } else {
          field_R = null;
          if (param2) {
            return hd.field_f.c(param1);
          } else {
            return oc.field_s.c(param1);
          }
        }
    }

    final static void a(int param0, r param1) {
        er var2 = new er(param1.a("final_frame.jpg", "", 0), (java.awt.Component) (Object) ne.field_F);
        int var3 = var2.field_y;
        int var4 = var2.field_t;
        tg.a((byte) -31);
        qn.field_r = new er(var3, param0 * var4 / 4);
        qn.field_r.d();
        var2.c(0, 0);
        lr.field_O = new er(var3, -qn.field_r.field_t + var4);
        lr.field_O.d();
        var2.c(0, -qn.field_r.field_t);
        lr.field_O.field_z = qn.field_r.field_t;
        ln.d(-28558);
    }

    private ao() throws Throwable {
        throw new Error();
    }

    public static void h(int param0) {
        field_O = null;
        field_P = null;
        if (param0 != 0) {
          field_O = null;
          field_R = null;
          field_Q = null;
          return;
        } else {
          field_R = null;
          field_Q = null;
          return;
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        Object var13 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, (byte) -119, param6)) {
          if (param5 > -107) {
            var13 = null;
            ao.a(41, (r) null);
            return false;
          } else {
            return false;
          }
        } else {
          var8 = param0 - param1 - ((ao) this).field_o - ((ao) this).field_J;
          var9 = param6 + -((ao) this).field_t + (-param2 + -((ao) this).field_M);
          if (((ao) this).field_L * ((ao) this).field_L > var9 * var9 + var8 * var8) {
            var10 = Math.atan2((double)var9, (double)var8) - lb.field_g;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)((ao) this).field_S;
              ((ao) this).field_T = (int)((double)((ao) this).field_S * var10 / 6.283185307179586);
              L0: while (true) {
                if (((ao) this).field_T >= ((ao) this).field_S) {
                  ((ao) this).field_T = ((ao) this).field_T - ((ao) this).field_S;
                  continue L0;
                } else {
                  L1: while (true) {
                    if ((((ao) this).field_T ^ -1) <= -1) {
                      return true;
                    } else {
                      ((ao) this).field_T = ((ao) this).field_T + ((ao) this).field_S;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)((ao) this).field_S;
                ((ao) this).field_T = (int)((double)((ao) this).field_S * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((ao) this).field_T >= ((ao) this).field_S) {
                    ((ao) this).field_T = ((ao) this).field_T - ((ao) this).field_S;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if ((((ao) this).field_T ^ -1) <= -1) {
                        return true;
                      } else {
                        ((ao) this).field_T = ((ao) this).field_T + ((ao) this).field_S;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((ao) this).field_T = (int)((double)((ao) this).field_S * var10 / 6.283185307179586);
                L4: while (true) {
                  if (((ao) this).field_T >= ((ao) this).field_S) {
                    ((ao) this).field_T = ((ao) this).field_T - ((ao) this).field_S;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if ((((ao) this).field_T ^ -1) <= -1) {
                        return true;
                      } else {
                        ((ao) this).field_T = ((ao) this).field_T + ((ao) this).field_S;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = 3;
        field_P = "Show chat (<%0> unread messages)";
        field_R = "<col=ee9d32>The controls</col>";
    }
}
