/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lia extends pw {
    static String field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        RuntimeException decompiledCaughtException = null;
        var35 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != param3) {
                  break L2;
                } else {
                  if (param8 != param2) {
                    break L2;
                  } else {
                    if (param4 != param7) {
                      break L2;
                    } else {
                      if (param6 != param1) {
                        break L2;
                      } else {
                        rsa.a(param5, param7, -1, param8, param6, param3);
                        break L1;
                      }
                    }
                  }
                }
              }
              var10_int = param3;
              var11 = param8;
              var12 = 3 * param3;
              var13 = param8 * 3;
              var14 = 3 * param0;
              var15 = param2 * 3;
              var16 = 3 * param4;
              var17 = 3 * param1;
              var18 = var14 + (-var16 + (param7 - param3));
              var19 = var15 + (-var17 + (param6 + -param8));
              var20 = var12 + var16 - (var14 - -var14);
              var21 = -var15 + var17 + (-var15 - -var13);
              var22 = -var12 + var14;
              var23 = var15 - var13;
              var24 = 128;
              L3: while (true) {
                if (var24 > 4096) {
                  break L1;
                } else {
                  var25 = var24 * var24 >> -2115857012;
                  var26 = var24 * var25 >> 673008108;
                  var27 = var18 * var26;
                  var28 = var19 * var26;
                  var29 = var25 * var20;
                  var30 = var21 * var25;
                  var31 = var24 * var22;
                  var32 = var23 * var24;
                  var33 = (var29 + (var27 + var31) >> 1145396172) + param3;
                  var34 = (var32 + var28 + var30 >> 2063301740) + param8;
                  rsa.a(param5, var33, param9 ^ 56, var11, var34, var10_int);
                  var11 = var34;
                  var10_int = var33;
                  var24 += 128;
                  continue L3;
                }
              }
            }
            if (param9 == -57) {
              break L0;
            } else {
              lia.a(-127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var10), "lia.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 80) {
            lia.a(89, -99, 30, -99, -30, -113, 13, -65, 25, (byte) 100);
        }
    }

    lia() {
        this.b((byte) 127);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
    }

    private final void b(byte param0) {
        if (param0 < 120) {
            lia.a(30, 28, 74, -119, -54, -124, 48, 123, 14, (byte) 25);
        }
    }

    static {
        field_c = "To Customer Support";
    }
}
