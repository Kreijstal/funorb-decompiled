/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends qb {
    int field_j;
    static String field_g;
    qb field_i;
    li field_h;

    public static void a(int param0) {
        if (param0 != 1159353185) {
            field_g = (String) null;
        }
        field_g = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Main.field_T;
        while (true) {
            param7--;
            if ((param7 ^ -1) > -1) {
                break;
            }
            var17 = param6;
            var10 = var17;
            var11 = param0;
            var12 = param2;
            var13 = param1;
            var14 = param4;
            var15 = 8355711 & var17[var11] >> -1726087775;
            var10[var11] = var15 - -(bc.a(var12, 33423360) >> 1159353185) + ((bc.a(var13, 33423391) >> 1029062761) + bc.a(var14 >> -2029655855, 255));
            param2 = param2 + param8;
            param4 = param4 + param9;
            param0++;
            param1 = param1 + param5;
        }
        if (param3 != 8355711) {
            field_g = (String) null;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var3 = gi.a(124, param2);
        if (param1 < -122) {
          if (0 != param0.indexOf(param2)) {
            return true;
          } else {
            if (0 == param0.indexOf(var3)) {
              L0: {
                L1: {
                  if (param0.startsWith(param2)) {
                    break L1;
                  } else {
                    if (param0.startsWith(var3)) {
                      break L1;
                    } else {
                      if (param0.endsWith(param2)) {
                        break L1;
                      } else {
                        if (!param0.endsWith(var3)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L0;
              }
              return stackIn_13_0 != 0;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, String param1) {
        int var4 = 0;
        int var5 = Main.field_T;
        int var2 = param1.length();
        char[] var3 = new char[var2];
        if (param0 <= 89) {
            return (String) null;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3[-var4 + var2 - 1] = param1.charAt(var4);
        }
        return new String(var3);
    }

    gi(li param0, qb param1) {
        ((gi) this).field_h = param0;
        ((gi) this).field_j = param0.g();
        ((gi) this).field_i = param1;
        ((gi) this).field_h.f(((gi) this).field_j * mf.field_i / 80);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = Main.field_T;
          if (param9 == 0) {
            break L0;
          } else {
            field_g = (String) null;
            break L0;
          }
        }
        L1: {
          if (param10 > param7) {
            if (param10 >= param11) {
              if (param11 > param7) {
                e.a(param7, param4, param6, param0, param15, param13, param5, vj.field_j, param11, param14, param12, param10, (byte) 88, param1, param3, param8, param2);
                break L1;
              } else {
                e.a(param11, param0, param13, param4, param3, param6, param5, vj.field_j, param7, param14, param2, param10, (byte) 96, param1, param15, param8, param12);
                break L1;
              }
            } else {
              e.a(param7, param4, param6, param5, param15, param14, param0, vj.field_j, param10, param13, param12, param11, (byte) 104, param3, param1, param2, param8);
              break L1;
            }
          } else {
            if (param7 < param11) {
              e.a(param10, param5, param14, param4, param1, param6, param0, vj.field_j, param7, param13, param8, param11, (byte) 13, param3, param15, param2, param12);
              break L1;
            } else {
              if (param10 < param11) {
                e.a(param10, param5, param14, param0, param1, param13, param4, vj.field_j, param11, param6, param8, param7, (byte) 62, param15, param3, param12, param2);
                break L1;
              } else {
                e.a(param11, param0, param13, param5, param3, param14, param4, vj.field_j, param10, param6, param2, param7, (byte) 83, param15, param1, param12, param8);
                break L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Email is valid";
    }
}
