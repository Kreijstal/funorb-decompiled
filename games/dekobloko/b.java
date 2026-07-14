/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends ek {
    private int field_O;
    private mb field_N;
    static int[] field_M;
    static String field_Q;
    int field_K;
    int field_L;
    static int[] field_P;

    public static void a(int param0) {
        field_Q = null;
        field_P = null;
        field_M = null;
        if (param0 > -53) {
            Object var2 = null;
            String discarded$0 = b.a(-83, (String) null);
        }
    }

    final int b(int param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (((b) this).field_N.a(126) > param1) {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  field_P = null;
                  break L1;
                }
              }
              return ((b) this).field_N.b(param1, 0);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final static int[] h(int param0) {
        int var1 = 110 / ((-90 - param0) / 32);
        return new int[8];
    }

    final static String a(int param0, String param1) {
        int var2 = ul.a(d.field_b, te.field_p, -28705);
        if ((var2 ^ -1) == -2) {
            param1 = "<img=0>" + param1;
        }
        if (!(var2 != 2)) {
            param1 = "<img=1>" + param1;
        }
        if (param0 < 78) {
            return null;
        }
        return param1;
    }

    final boolean a(int param0, int param1, ce param2, int param3, int param4, int param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = client.field_A ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = -param5 + param1 + -((b) this).field_L;
            var9 = ((b) this).field_t + -(((b) this).field_L * 2);
            if (var9 >= var8) {
              break L0;
            } else {
              var8 = var9;
              break L0;
            }
          }
          L1: {
            if (var8 < 0) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var8 = var8 * ((b) this).field_O / var9;
            if (-2 != (param3 ^ -1)) {
              if (2 == param3) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((b) this).field_N.a(114)) {
                    if (-1 >= (var11 ^ -1)) {
                      ((b) this).field_N.c(-91, var11);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var13 = ((b) this).field_N.b(var12, 0) + -var8;
                    var13 = var13 * var13;
                    if (var13 < var10) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              } else {
                return true;
              }
            } else {
              ((b) this).field_N.a(var8, false);
              break L2;
            }
          }
          return true;
        }
    }

    final int i(int param0) {
        if (param0 != -15317) {
            Object var3 = null;
            String discarded$0 = b.a(-69, (String) null);
        }
        return ((b) this).field_O;
    }

    final int b(boolean param0) {
        if (!param0) {
            return -57;
        }
        return ((b) this).field_N.a(-77);
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[8192];
        field_Q = "Master Challenge";
    }
}
