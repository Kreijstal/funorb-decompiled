/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_d;
    static String field_a;
    static nf[] field_c;
    static bm[] field_b;

    final static String a(char param0, int param1, byte param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = Confined.field_J ? 1 : 0;
        var6 = new char[param1];
        var3 = var6;
        if (param2 >= -105) {
          boolean discarded$2 = qd.a(12, -41, -37, -115, false, -55, -83);
          var4 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (param1 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param0;
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 >= -98) {
            field_a = null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param4) {
          if (param0 >= param5) {
            if (param0 < param2 + param5) {
              if (param3 >= param1) {
                if (param6 + param1 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          String discarded$7 = qd.a('ﾏ', 69, (byte) -113);
          if (param0 >= param5) {
            if (param0 < param2 + param5) {
              if (param3 >= param1) {
                if (param6 + param1 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        param0 = sc.a(param0, '_', "", 99);
        if (!param2) {
          var3 = pn.a(-1, param1);
          if (0 == (param0.indexOf(param1) ^ -1)) {
            if (-1 != param0.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
    }
}
