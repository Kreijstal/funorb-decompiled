/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_d;
    static on field_b;
    static aj field_f;
    static String field_a;
    static km field_e;
    static int field_c;

    final static void a(int param0) {
        if (param0 != -64) {
          vf.a(true);
          gk.field_g.g(62, 8);
          gk.field_g.a(123, 117);
          return;
        } else {
          gk.field_g.g(62, 8);
          gk.field_g.a(123, 117);
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0) {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static hh a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (param1 == 8286) {
          var2 = param0.length();
          if (-1 == (var2 ^ -1)) {
            return a.field_H;
          } else {
            if (-64 > (var2 ^ -1)) {
              return cb.field_a;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2 > var3) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if ((ae.field_f.indexOf(var4) ^ -1) != 0) {
                        break L1;
                      } else {
                        return jj.field_f;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var3 != -1 + var2) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      return jj.field_f;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          field_d = null;
          var2 = param0.length();
          if (-1 == (var2 ^ -1)) {
            return a.field_H;
          } else {
            if (-64 > (var2 ^ -1)) {
              return cb.field_a;
            } else {
              var3 = 0;
              L3: while (true) {
                if (var2 > var3) {
                  L4: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if ((ae.field_f.indexOf(var4) ^ -1) != 0) {
                        break L4;
                      } else {
                        return jj.field_f;
                      }
                    } else {
                      L5: {
                        if (var3 == 0) {
                          break L5;
                        } else {
                          if (var3 != -1 + var2) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      return jj.field_f;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L3;
                  } else {
                    return null;
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
        field_d = "Both players have the same number of pieces";
        field_b = new on();
        field_a = "Try again";
        field_c = 360;
    }
}
