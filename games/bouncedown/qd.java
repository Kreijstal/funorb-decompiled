/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static boolean field_a;
    static int field_b;

    final static jb a(int param0, int param1, si param2, int param3, int param4, int param5) {
        java.awt.Frame var8 = ed.a(4147, param2, param4, param0, param1, param5);
        java.awt.Frame var6 = var8;
        if (param3 < 121) {
            field_a = false;
        }
        if (var8 == null) {
            return null;
        }
        jb var7 = new jb();
        var7.field_e = var8;
        java.awt.Component discarded$0 = var7.field_e.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param1, param5);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    final static lj a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var7 = Bounce.field_N;
        var2 = param0.length();
        if (-1 == (var2 ^ -1)) {
          return uc.field_E;
        } else {
          if (var2 > 64) {
            return lk.field_t;
          } else {
            if (param0.charAt(0) == 34) {
              if (param0.charAt(-1 + var2) == 34) {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var4 < -1 + var2) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_18_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 != 0) {
                            break L2;
                          } else {
                            return mh.field_R;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return mh.field_R;
              }
            } else {
              var3 = 0;
              var4 = 53 / ((param1 - -7) / 38);
              var5 = 0;
              L3: while (true) {
                if (var2 > var5) {
                  var6 = param0.charAt(var5);
                  if (46 == var6) {
                    L4: {
                      if (var5 == 0) {
                        break L4;
                      } else {
                        if (var2 - 1 == var5) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var5++;
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return mh.field_R;
                  } else {
                    if ((ve.field_c.indexOf(var6) ^ -1) == 0) {
                      return mh.field_R;
                    } else {
                      var3 = 0;
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
