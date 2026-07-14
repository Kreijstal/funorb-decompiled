/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends mc {
    boolean field_s;
    int[] field_u;
    static boolean field_r;
    int field_t;
    static byte[] field_q;
    static int field_n;
    static vl field_p;
    static jb field_o;

    public static void b(byte param0) {
        if (param0 != 6) {
            return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    final static hb a(int param0) {
        if (param0 <= 22) {
            return null;
        }
        return new hb(i.e(-11), ld.j(-97));
    }

    final static boolean a(int param0, byte param1) {
        if (0 == (param0 ^ -1)) {
            return true;
        }
        if (param1 <= 104) {
            hb discarded$0 = cf.a(-75);
        }
        return (1 << param0 & me.field_a) != 0 ? true : false;
    }

    cf() {
        ((cf) this).field_s = false;
    }

    final static mh a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var6 = TetraLink.field_J;
          if (param1 <= -112) {
            break L0;
          } else {
            boolean discarded$2 = cf.a(-113, (byte) -111);
            break L0;
          }
        }
        var2 = param0.length();
        if (var2 == 0) {
          return c.field_o;
        } else {
          if (var2 > 64) {
            return nb.field_V;
          } else {
            if (param0.charAt(0) == 34) {
              if (param0.charAt(var2 - 1) == 34) {
                var3 = 0;
                var4 = 1;
                L1: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 == 92) {
                      L2: {
                        if (var3 != 0) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L2;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L2;
                        }
                      }
                      var3 = stackIn_20_0;
                      var4++;
                      continue L1;
                    } else {
                      L3: {
                        if (var5 != 34) {
                          break L3;
                        } else {
                          if (var3 != 0) {
                            break L3;
                          } else {
                            return jg.field_h;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L1;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return jg.field_h;
              }
            } else {
              var3 = 0;
              var4 = 0;
              L4: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (var5 == 46) {
                    L5: {
                      if (0 == var4) {
                        break L5;
                      } else {
                        if (var4 == -1 + var2) {
                          break L5;
                        } else {
                          if (var3 != 0) {
                            break L5;
                          } else {
                            var3 = 1;
                            var4++;
                            continue L4;
                          }
                        }
                      }
                    }
                    return jg.field_h;
                  } else {
                    if (0 != (lc.field_c.indexOf(var5) ^ -1)) {
                      var3 = 0;
                      var4++;
                      continue L4;
                    } else {
                      return jg.field_h;
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
        field_q = new byte[520];
        field_r = false;
    }
}
