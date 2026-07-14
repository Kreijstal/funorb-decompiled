/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends hf {
    int field_J;
    static int[] field_R;
    int field_O;
    static String field_K;
    int field_S;
    int field_I;
    int field_N;
    static nh field_L;
    static boolean field_Q;
    static int field_M;
    int field_T;
    static vh field_P;

    public static void b(boolean param0) {
        field_L = null;
        if (!param0) {
          field_Q = true;
          field_R = null;
          field_P = null;
          field_K = null;
          return;
        } else {
          field_R = null;
          field_P = null;
          field_K = null;
          return;
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (super.a(param0, param1, param2, (byte) 117, param4, param5, param6)) {
          var8 = param4 + -param5 + (-((nd) this).field_o + -((nd) this).field_O);
          var9 = param0 - param6 + -((nd) this).field_m - ((nd) this).field_S;
          if (((nd) this).field_J * ((nd) this).field_J > var9 * var9 + var8 * var8) {
            var10 = Math.atan2((double)var9, (double)var8) - pd.field_a;
            if (var10 < 0.0) {
              var10 = var10 - 3.141592653589793 / (double)((nd) this).field_T;
              ((nd) this).field_N = (int)(var10 * (double)((nd) this).field_T / 6.283185307179586);
              L0: while (true) {
                if (((nd) this).field_N >= ((nd) this).field_T) {
                  ((nd) this).field_N = ((nd) this).field_N - ((nd) this).field_T;
                  continue L0;
                } else {
                  L1: while (true) {
                    if ((((nd) this).field_N ^ -1) <= -1) {
                      return true;
                    } else {
                      ((nd) this).field_N = ((nd) this).field_N + ((nd) this).field_T;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              if (0.0 < var10) {
                var10 = var10 + 3.141592653589793 / (double)((nd) this).field_T;
                ((nd) this).field_N = (int)(var10 * (double)((nd) this).field_T / 6.283185307179586);
                L2: while (true) {
                  if (((nd) this).field_N >= ((nd) this).field_T) {
                    ((nd) this).field_N = ((nd) this).field_N - ((nd) this).field_T;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if ((((nd) this).field_N ^ -1) <= -1) {
                        return true;
                      } else {
                        ((nd) this).field_N = ((nd) this).field_N + ((nd) this).field_T;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((nd) this).field_N = (int)(var10 * (double)((nd) this).field_T / 6.283185307179586);
                L4: while (true) {
                  if (((nd) this).field_N >= ((nd) this).field_T) {
                    ((nd) this).field_N = ((nd) this).field_N - ((nd) this).field_T;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if ((((nd) this).field_N ^ -1) <= -1) {
                        return true;
                      } else {
                        ((nd) this).field_N = ((nd) this).field_N + ((nd) this).field_T;
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
        } else {
          if (param3 < 113) {
            ((nd) this).field_J = 25;
            return false;
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, String param1) {
        Object var3 = null;
        pi.field_J = param1;
        if (param0 != -1) {
          var3 = null;
          nd.a(100, (String) null);
          sf.a(12, 11649);
          return;
        } else {
          sf.a(12, 11649);
          return;
        }
    }

    private nd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new int[]{0, 0, 0, 0, 100, 1000, 5000, 0};
        field_M = 128;
        field_P = new vh();
    }
}
