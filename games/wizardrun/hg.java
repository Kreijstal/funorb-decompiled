/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static o field_d;
    static ok field_c;
    static java.awt.Image field_b;
    static int field_a;

    final static String a(CharSequence param0, byte param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        if (param0 == null) {
          return kc.field_J;
        } else {
          L0: {
            var3 = param0.length();
            if (1 > var3) {
              break L0;
            } else {
              if (var3 <= 12) {
                L1: {
                  var4 = ta.a(-76, param0);
                  if (param1 <= -33) {
                    break L1;
                  } else {
                    hg.a(123, (byte) 15);
                    break L1;
                  }
                }
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (-2 < (var4.length() ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        if (d.a(true, var4.charAt(0))) {
                          break L3;
                        } else {
                          if (d.a(true, var4.charAt(var4.length() - 1))) {
                            break L3;
                          } else {
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (var6 >= param0.length()) {
                                if ((var5 ^ -1) < -1) {
                                  return lg.field_c;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param0.charAt(var6);
                                  if (d.a(true, (char) var7)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                if (-3 >= (var5 ^ -1)) {
                                  if (!param2) {
                                    return ll.field_g;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      return lg.field_c;
                    }
                  }
                }
                return kc.field_J;
              } else {
                break L0;
              }
            }
          }
          return kc.field_J;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            hg.a(0, (byte) -66);
        }
        field_c = null;
        field_b = null;
        field_d = null;
    }

    final static int b(int param0, byte param1) {
        if (param1 != -89) {
            field_a = 68;
        }
        return cj.field_e[2047 & param0];
    }

    final static void a(int param0, byte param1) {
        mg var2 = n.field_b;
        var2.c((byte) -70, param0);
        var2.b((byte) 11, 1);
        if (param1 != 106) {
            hg.a(-86, (byte) 34);
        }
        var2.b((byte) 11, 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ok();
    }
}
