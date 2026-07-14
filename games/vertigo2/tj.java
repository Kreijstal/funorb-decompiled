/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static int field_b;
    static boolean field_c;
    static String field_a;

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 == -22697) {
          var3 = mq.a(param2, false);
          if (0 == (param1.indexOf(param2) ^ -1)) {
            if (param1.indexOf(var3) == -1) {
              if (!param1.startsWith(param2)) {
                if (!param1.startsWith(var3)) {
                  if (!param1.endsWith(param2)) {
                    if (param1.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(byte param0) {
        if (param0 > 34) {
          if ((Object) (Object) ir.field_c != this) {
            if ((Object) (Object) Vertigo2.field_E != this) {
              if (this == (Object) (Object) bm.field_I) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, od param2, bs param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        b var13 = null;
        oq.a(param2, -1, 4462, -1, param3.field_Wb, (int[]) null, (cr) (Object) param3, param3.field_Pb, param3.field_bc);
        un.field_Lb.a(0, true);
        un.field_Lb.a((int[]) null, 0, (byte) -79);
        un.field_Lb.c(-24634);
        var13 = un.field_Lb;
        var8 = param0;
        var9 = param6;
        var10 = param5;
        var11 = param1;
        var13.field_n.c(var11, var9, -1220, var8, var10);
        if (param4) {
          var12 = null;
          tj.a(57, -125, (od) null, (bs) null, true, 20, -118);
          return;
        } else {
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        if (param4 > -42) {
          field_b = -104;
          oj.field_O[param5] = param0;
          oj.field_M[param5] = param3;
          oj.field_I[param5] = param1;
          oj.field_F[param5] = param6;
          oj.field_H[param5] = param2;
          oj.field_Q[param5] = false;
          return;
        } else {
          oj.field_O[param5] = param0;
          oj.field_M[param5] = param3;
          oj.field_I[param5] = param1;
          oj.field_F[param5] = param6;
          oj.field_H[param5] = param2;
          oj.field_Q[param5] = false;
          return;
        }
    }

    static {
    }
}
