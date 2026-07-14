/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gha implements pp {
    private static String[] field_b;
    static char[] field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 <= 27) {
            return true;
        }
        return -1 != (52 & param1 ^ -1) ? true : false;
    }

    final static mva[] a(mva[] param0, int param1, int param2, int param3, os param4, kh param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mva var9 = null;
        kh var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param3 == -16499) {
          L0: {
            var6 = param5.b((byte) 44, param2);
            if (var6 == 0) {
              param0 = null;
              break L0;
            } else {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length == var6) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = param4.a(var6, -26955);
                param0 = param0;
                break L1;
              }
              var7 = 0;
              L3: while (true) {
                if (var7 >= var6) {
                  break L0;
                } else {
                  if (uha.a(5907, param5)) {
                    L4: {
                      if (param0[var7] == null) {
                        param0[var7] = param4.a((byte) -124);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var8 = param1;
                      var9 = param0[var7];
                      var10 = param5;
                      if (1 != var8) {
                        break L5;
                      } else {
                        var9.a(var10, false);
                        break L5;
                      }
                    }
                    L6: {
                      if (var8 == -3) {
                        ((qs) (Object) var9).b(var10, true);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (-4 == var8) {
                      ((fc) (Object) var9).a(99, var10);
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  } else {
                    param0[var7] = null;
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 24 / ((param0 - -30) / 62);
        field_a = null;
    }

    final static oc a(String param0, String param1, int param2, cn param3) {
        int var4 = 0;
        Exception var5 = null;
        oc stackIn_2_0 = null;
        oc stackOut_1_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = -46 / ((-55 - param2) / 54);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackOut_1_0 = lga.a(param3, param1, param0, true);
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    var5 = (Exception) (Object) caughtException;
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[7];
        field_b[4] = "Light";
        field_b[3] = "Water";
        field_b[2] = "Blue Fire";
        field_b[6] = "White Light";
        field_b[5] = "Ice";
        field_b[0] = "Damage";
        field_b[1] = "Yellow Fire";
        field_a = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
