/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static boolean[][] field_h;
    static hh field_d;
    static int field_c;
    static hd[] field_a;
    static String field_e;
    static String field_b;
    static boolean field_g;
    static String field_f;

    final static gf[] a(ml param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        gf[] var4 = null;
        int var5 = 0;
        gf var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        var2 = param0.l(8, 59);
        if (0 >= var2) {
          var3 = param0.l(12, 59);
          var4 = new gf[var3];
          if (param1 != -4) {
            return null;
          } else {
            var5 = 0;
            L0: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (mu.a(param0, (byte) -39)) {
                  var6 = new gf();
                  int discarded$6 = param0.l(24, param1 ^ -57);
                  int discarded$7 = param0.l(24, 59);
                  var6.field_g = param0.l(24, 59);
                  int discarded$8 = param0.l(9, 59);
                  int discarded$9 = param0.l(12, param1 ^ -57);
                  int discarded$10 = param0.l(12, 59);
                  int discarded$11 = param0.l(12, 59);
                  var4[var5] = var6;
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6_int = param0.l(kb.a(-1 + var5, false), param1 ^ -57);
                  var4[var5] = var4[var6_int];
                  var5++;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, bb param1) {
        qa.field_E.a((byte) -128, (hd) (Object) param1);
        if (param0 != -1) {
            field_c = -45;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 >= -3) {
            field_f = null;
        }
    }

    final static int a(int param0, int param1) {
        if (param1 != param0) {
          if (8 != param0) {
            if (11 != param0) {
              if ((param0 ^ -1) == -19) {
                return 1;
              } else {
                if ((param0 ^ -1) != -20) {
                  if ((param0 ^ -1) == -33) {
                    return 1;
                  } else {
                    if (37 == param0) {
                      return 1;
                    } else {
                      if (24 == param0) {
                        return 1;
                      } else {
                        if ((param0 ^ -1) == -26) {
                          return 1;
                        } else {
                          if (param0 != 23) {
                            if ((param0 ^ -1) != -30) {
                              if (34 != param0) {
                                if ((param0 ^ -1) != -31) {
                                  if (21 == param0) {
                                    return 0;
                                  } else {
                                    if (20 != param0) {
                                      return 0;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  return 1;
                                }
                              } else {
                                return 1;
                              }
                            } else {
                              return 1;
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          return 2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hh();
        field_c = 225;
        field_e = "Send private message";
        field_g = false;
        field_f = "Click to Spectate";
    }
}
