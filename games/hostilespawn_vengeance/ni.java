/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int[] field_c;
    static java.applet.Applet field_g;
    static int field_f;
    static int[] field_a;
    static bd field_b;
    static boolean field_e;
    static bd field_d;

    final static int a(int param0, int param1) {
        param0 = param0 & 8191;
        if (4096 <= param0) {
            return param0 < 6144 ? -vd.field_B[-4096 + param0] : -vd.field_B[8192 - param0];
        }
        return param0 < 2048 ? vd.field_B[param0] : vd.field_B[4096 - param0];
    }

    final static boolean a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        L0: {
          L1: {
            var3 = HostileSpawn.field_I ? 1 : 0;
            var2 = param0;
            if (var2 == 1) {
              break L1;
            } else {
              if (var2 != 3) {
                if (4 != var2) {
                  if (var2 == 8) {
                    return true;
                  } else {
                    if (18 == var2) {
                      return true;
                    } else {
                      if (var2 == 19) {
                        return true;
                      } else {
                        if (26 == var2) {
                          return true;
                        } else {
                          if (var2 == 28) {
                            return true;
                          } else {
                            if (var2 != 24) {
                              if (27 != var2) {
                                if (var2 != 23) {
                                  if (var2 != 25) {
                                    if (var2 != 225) {
                                      if (231 == var2) {
                                        return true;
                                      } else {
                                        stackOut_21_0 = 0;
                                        stackIn_23_0 = stackOut_21_0;
                                        break L0;
                                      }
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    return true;
                                  }
                                } else {
                                  return true;
                                }
                              } else {
                                return true;
                              }
                            } else {
                              return true;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                return true;
              }
            }
          }
          stackOut_22_0 = 1;
          stackIn_23_0 = stackOut_22_0;
          break L0;
        }
        return stackIn_23_0 != 0;
    }

    final static void c() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        si.a(param5, param3, param1, param4, 0, 128);
        int var6 = 0;
        gn.a(param3, -1 + (param5 + param1), param5, 256, param4 + (param3 + -1), (byte) 101);
    }

    public static void b(int param0) {
        if (param0 <= 116) {
            field_b = null;
        }
        field_b = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static cn a(int param0) {
        if (param0 < 71) {
            cn discarded$0 = ni.a(123);
        }
        if (null == sa.field_a) {
            sa.field_a = new cn(jn.field_G, 20, 0, 0, 0, 11579568, -1, 0, 0, jn.field_G.field_y, -1, 2147483647, true);
        }
        return sa.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new int[255];
        for (var0 = 0; var0 < 255; var0++) {
            field_c[var0] = var0 * 65793;
        }
    }
}
