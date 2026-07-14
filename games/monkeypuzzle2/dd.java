/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends RuntimeException {
    static int field_d;
    Throwable field_b;
    String field_c;
    static String field_a;
    static int field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 74 / ((-51 - param0) / 54);
    }

    dd(Throwable param0, String param1) {
        ((dd) this).field_c = param1;
        ((dd) this).field_b = param0;
    }

    final static am a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param0.length();
        if (0 != var2) {
          if (-65 <= var2) {
            if (34 != param0.charAt(0)) {
              var3 = param1 ? 1 : 0;
              var4 = 0;
              L0: while (true) {
                if (var2 > var4) {
                  var5 = param0.charAt(var4);
                  if (var5 != 46) {
                    if (-1 == qd.field_b.indexOf(var5)) {
                      return lh.field_c;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    L1: {
                      if (-1 == (var4 ^ -1)) {
                        break L1;
                      } else {
                        if (var4 == var2 + -1) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return lh.field_c;
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (-35 == param0.charAt(-1 + var2)) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_15_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var5 != 34) {
                          break L4;
                        } else {
                          if (var3 != 0) {
                            break L4;
                          } else {
                            return lh.field_c;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return lh.field_c;
              }
            }
          } else {
            return wk.field_f;
          }
        } else {
          return si.field_s;
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = 21;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_e = 0;
    }
}
