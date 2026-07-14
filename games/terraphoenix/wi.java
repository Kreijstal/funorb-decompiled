/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends eb {
    private fc field_N;
    int field_K;
    private int field_L;
    int field_M;

    final int a(int param0) {
        if (param0 != 0) {
            ((wi) this).field_L = -92;
        }
        return ((wi) this).field_L;
    }

    final static void a(byte param0, e param1, int param2, int param3) {
        int var4 = 26 % ((param0 - -37) / 38);
        if (!(param1 == null)) {
            param1.a(0, param2 - 32, (byte) 127, 1, param3 - 64, kg.field_r[45]);
        }
        kg.field_r[76].c(-32 + param2, -64 + param3, 128);
    }

    final int b(int param0, int param1) {
        if (param1 <= param0) {
            // if_icmpge L22
        } else {
            return -1;
        }
        return ((wi) this).field_N.a((byte) -68, param0);
    }

    final int g(int param0) {
        if (param0 != 1) {
            ((wi) this).field_K = 39;
        }
        return ((wi) this).field_N.c(-16952);
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Terraphoenix.field_V;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = param1 - param3 - ((wi) this).field_M;
            var9 = ((wi) this).field_p + -(((wi) this).field_M * 2);
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
            var8 = ((wi) this).field_L * var8 / var9;
            if ((param4 ^ -1) != -2) {
              if (2 == param4) {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((wi) this).field_N.c(-16952)) {
                    if (0 > var11) {
                      break L2;
                    } else {
                      ((wi) this).field_N.b(var11, 122);
                      break L2;
                    }
                  } else {
                    var13 = ((wi) this).field_N.a((byte) -68, var12) + -var8;
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
                break L2;
              }
            } else {
              ((wi) this).field_N.c(0, var8);
              break L2;
            }
          }
          return true;
        } else {
          return false;
        }
    }

    final static void h(int param0) {
        int var1 = 0;
        int var2 = Terraphoenix.field_V;
        for (var1 = 0; 10 > var1; var1++) {
            km.field_q[var1] = new pg(var1);
        }
        if (param0 != -4168) {
            return;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
    }
}
