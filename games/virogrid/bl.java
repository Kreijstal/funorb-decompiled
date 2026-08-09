/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends nb {
    int field_E;
    gl field_I;
    static p field_D;
    static String field_G;
    byte[] field_C;
    static int field_z;
    static String field_A;
    static boolean field_B;
    static int field_F;
    static String field_H;

    final int e(int param0) {
        if (param0 != 0) {
            field_F = -67;
        }
        if (this.field_t) {
            return 0;
        }
        return 100;
    }

    final byte[] b(byte param0) {
        if (param0 != 39) {
            return (byte[]) null;
        }
        if (this.field_t) {
            throw new RuntimeException();
        }
        return this.field_C;
    }

    public static void d(boolean param0) {
        field_D = null;
        field_A = null;
        field_G = null;
        if (param0) {
            bl.f(-30);
        }
        field_H = null;
    }

    final static int f(int param0) {
        if (param0 != 0) {
            return -60;
        }
        return 1;
    }

    final static void a(int param0, int param1, java.math.BigInteger param2, jc param3, byte[] param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = el.a(126, param1);
              if (dk.field_m != null) {
                break L1;
              } else {
                dk.field_m = new java.security.SecureRandom();
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L3: {
                  L4: {
                    if (am.field_e == null) {
                      break L4;
                    } else {
                      if (am.field_e.field_g.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  am.field_e = new jc(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    am.field_e.field_l = 0;
                    am.field_e.a(param4, param1, param6, (byte) 72);
                    am.field_e.b(var7_int, (byte) 0);
                    am.field_e.a(32768, var13);
                    if (lc.field_b == null) {
                      break L6;
                    } else {
                      if (-101 < (lc.field_b.field_g.length ^ -1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  lc.field_b = new jc(100);
                  break L5;
                }
                lc.field_b.field_l = param0;
                lc.field_b.a(10, 120);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (var11 >= 4) {
                    lc.field_b.a((byte) -68, param1);
                    lc.field_b.a(param2, param5, (byte) 122);
                    param3.a(lc.field_b.field_g, lc.field_b.field_l, 0, (byte) 20);
                    param3.a(am.field_e.field_g, am.field_e.field_l, 0, (byte) 9);
                    break L0;
                  } else {
                    lc.field_b.a(var13[var11], (byte) -42);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = dk.field_m.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var7);

            stackIn_21_1 = new StringBuilder().append("bl.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), stackIn_31_2 + ',' + param6 + ')');
        }
    }

    bl() {
    }

    static {
        field_G = "<%0> has been removed.";
        field_D = new p();
        field_z = 3;
        field_A = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_H = "<%0> is offering a rematch.";
        field_B = true;
    }
}
