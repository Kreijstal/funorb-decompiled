/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_a;
    static lh field_b;
    static ci field_c;
    static String field_d;

    final static int a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            StringBuilder discarded$0 = rb.a('', (StringBuilder) null, 120, (byte) -15);
        }
        return in.field_i;
    }

    final static byte[] a(byte[] param0, byte param1, nk param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        var4 = param2.e(29, param3);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (var4 == param0.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param0 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param2.e(111, 3);
            var6 = (byte)param2.e(-5, 8);
            if (param1 <= -51) {
              break L2;
            } else {
              field_b = null;
              break L2;
            }
          }
          L3: {
            if (var5 <= 0) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param0[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (byte)(var6 + param2.e(-44, var5));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 != -18067) {
            field_a = null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static StringBuilder a(char param0, StringBuilder param1, int param2, byte param3) {
        int var5 = 0;
        int var7 = Chess.field_G;
        int var4 = param1.length();
        param1.setLength(param2);
        for (var5 = var4; param2 > var5; var5++) {
            param1.setCharAt(var5, param0);
        }
        int var6 = -99 % ((param3 - 51) / 45);
        return param1;
    }

    final static int a(byte param0) {
        if (param0 != 46) {
            field_b = null;
        }
        return aa.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_a = "This game has been updated! Please reload this page.";
    }
}
