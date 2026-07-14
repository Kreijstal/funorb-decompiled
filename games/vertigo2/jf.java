/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends d {
    static fe field_M;
    int field_K;
    static int[] field_N;
    private re field_I;
    private int field_H;
    static String field_J;
    int field_L;

    public static void b(boolean param0) {
        if (param0) {
            field_N = null;
        }
        field_N = null;
        field_M = null;
        field_J = null;
    }

    final int a(int param0, byte param1) {
        if (0 <= param0) {
            // if_icmple L21
        } else {
            return -1;
        }
        if (param1 <= 121) {
            int discarded$0 = ((jf) this).a(112, (byte) -62);
        }
        return ((jf) this).field_I.a(0, param0);
    }

    final static void c(int param0, int param1) {
        ue.b((byte) 77, param0);
        if (param1 < 84) {
            jf.c(-61, 78);
        }
    }

    final int a(byte param0) {
        if (param0 > -44) {
            int discarded$0 = ((jf) this).a(-3, (byte) 2);
        }
        return ((jf) this).field_I.b(117);
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            return -100;
        }
        if (bi.field_e >= param0 + param2) {
            return param2;
        }
        if (0 <= -param0 + (param1 + param2)) {
            return -param0 + param2 - -param1;
        }
        return bi.field_e + -param0;
    }

    final int c(boolean param0) {
        if (!param0) {
            field_N = null;
        }
        return ((jf) this).field_H;
    }

    private jf() throws Throwable {
        throw new Error();
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, (byte) -115, param6)) {
          L0: {
            if (param5 < -107) {
              break L0;
            } else {
              field_N = null;
              break L0;
            }
          }
          return false;
        } else {
          L1: {
            var8 = -param1 + (param0 - ((jf) this).field_K);
            var9 = ((jf) this).field_n + -(((jf) this).field_K * 2);
            if (var9 < var8) {
              var8 = var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((var8 ^ -1) > -1) {
              var8 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var8 = ((jf) this).field_H * var8 / var9;
            if (param4 == 1) {
              ((jf) this).field_I.a((byte) 103, var8);
              break L3;
            } else {
              if (2 != param4) {
                break L3;
              } else {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L4: while (true) {
                  if (var12 >= ((jf) this).field_I.b(127)) {
                    if (-1 < (var11 ^ -1)) {
                      return true;
                    } else {
                      ((jf) this).field_I.b(var11, 7810);
                      break L3;
                    }
                  } else {
                    var13 = -var8 + ((jf) this).field_I.a(0, var12);
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var10 = var13;
                      var11 = var12;
                      var12++;
                      continue L4;
                    } else {
                      var12++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Unable to add name - system busy";
    }
}
