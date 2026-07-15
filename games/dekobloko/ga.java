/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga implements lh {
    static String field_d;
    static jc field_e;
    static String field_a;
    static String field_c;
    static String field_b;

    final static int a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, mm param7, byte param8, int param9, int param10) {
        int var11 = 0;
        L0: {
          var11 = 2;
          if ((Object) (Object) param7 == (Object) (Object) se.field_S) {
            var11 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          int discarded$16 = param7.a(param3, param10 - var11, -var11 + param2, param0, param5, 65793, -1, param9, param1, param4);
          int discarded$17 = param7.a(param3, -var11 + param10, param2, param0, param5, 65793, -1, param9, param1, param4);
          int discarded$18 = param7.a(param3, param10 + -var11, param2 - -var11, param0, param5, 65793, -1, param9, param1, param4);
          int discarded$19 = param7.a(param3, param10, -var11 + param2, param0, param5, 65793, -1, param9, param1, param4);
          if (param8 <= -123) {
            break L1;
          } else {
            ga.a(false, -18, 81);
            break L1;
          }
        }
        L2: {
          int discarded$20 = param7.a(param3, param10, param2 - -var11, param0, param5, 65793, -1, param9, param1, param4);
          int discarded$21 = param7.a(param3, param10 - -var11, param2 + -var11, param0, param5, 65793, -1, param9, param1, param4);
          int discarded$22 = param7.a(param3, param10 - -var11, param2, param0, param5, 65793, -1, param9, param1, param4);
          int discarded$23 = param7.a(param3, var11 + param10, param2 + var11, param0, param5, 65793, -1, param9, param1, param4);
          if ((Object) (Object) param7 != (Object) (Object) w.field_kb) {
            break L2;
          } else {
            int discarded$24 = param7.a(param3, 1 + param10, -var11 + param2, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$25 = param7.a(param3, param10 + -1, -var11 + param2, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$26 = param7.a(param3, param10 + var11, -1 + param2, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$27 = param7.a(param3, -var11 + param10, param2 + -1, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$28 = param7.a(param3, var11 + param10, 1 + param2, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$29 = param7.a(param3, param10 - var11, param2 - -1, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$30 = param7.a(param3, param10 + 1, var11 + param2, param0, param5, 65793, -1, param9, param1, param4);
            int discarded$31 = param7.a(param3, -1 + param10, param2 - -var11, param0, param5, 65793, -1, param9, param1, param4);
            break L2;
          }
        }
        return param7.a(param3, param10, param2, param0, param5, param6, -1, param9, param1, param4);
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -52) {
            field_d = null;
        }
        field_e = null;
        field_a = null;
    }

    final static void b(byte param0) {
        aa.field_f = new vj();
        if (param0 != -112) {
            field_e = null;
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (param0) {
            field_a = null;
        }
        uf var3 = we.field_b;
        var3.f(param2, -4);
        var3.a(true, 3);
        var3.a(true, 10);
        var3.d(-1, param1);
    }

    final static jc a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        var2 = param1.length();
        if ((var2 ^ -1) == -1) {
          return hm.field_a;
        } else {
          if (var2 > 63) {
            return field_e;
          } else {
            L0: {
              var3 = 0;
              if (param0 == 7017) {
                break L0;
              } else {
                field_d = null;
                break L0;
              }
            }
            L1: while (true) {
              if ((var3 ^ -1) > (var2 ^ -1)) {
                L2: {
                  var4 = param1.charAt(var3);
                  if (45 != var4) {
                    if (0 == (v.field_c.indexOf(var4) ^ -1)) {
                      return be.field_x;
                    } else {
                      break L2;
                    }
                  } else {
                    L3: {
                      if (-1 == (var3 ^ -1)) {
                        break L3;
                      } else {
                        if (var3 != -1 + var2) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return be.field_x;
                  }
                }
                var3++;
                continue L1;
              } else {
                return null;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_a = "Rating";
        field_e = new jc();
        field_c = "Confirm Password: ";
        field_b = "Loading backgrounds";
    }
}
