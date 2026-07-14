/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds extends wf {
    byte[] field_f;
    int field_g;
    static eo field_e;

    public static void a(int param0) {
        field_e = null;
        if (param0 != -93) {
            field_e = (eo) null;
        }
    }

    private ds() throws Throwable {
        throw new Error();
    }

    final static w a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = AceOfSkies.field_G ? 1 : 0;
        var2 = param1.length();
        if (var2 == 0) {
          return nh.field_f;
        } else {
          if (64 < var2) {
            return ei.field_d;
          } else {
            if (param1.charAt(0) != 34) {
              var3 = param0 ? 1 : 0;
              var4 = 0;
              L0: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (var5 != 46) {
                    if (-1 == ph.field_f.indexOf(var5)) {
                      return td.field_d;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    L1: {
                      if (var4 == 0) {
                        break L1;
                      } else {
                        if (var4 == var2 - 1) {
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
                    return td.field_d;
                  }
                } else {
                  return null;
                }
              }
            } else {
              if (34 == param1.charAt(var2 - 1)) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var4 < var2 + -1) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L3;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_17_0;
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
                            return td.field_d;
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
                return td.field_d;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new eo(2);
    }
}
