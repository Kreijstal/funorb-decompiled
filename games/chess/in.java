/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_j;
    static mk field_g;
    static String field_e;
    static String field_h;
    static String[][] field_f;
    static boolean field_a;
    static boolean[] field_c;
    static int field_i;
    static ci field_b;
    static le field_d;

    final static java.awt.Frame a(int param0, int param1, jk param2, int param3, int param4, int param5) {
        tm[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tm[] var10 = null;
        nl var11 = null;
        var9 = Chess.field_G;
        if (param2.a(true)) {
          L0: {
            if (param0 != 0) {
              break L0;
            } else {
              var10 = ud.a(624968802, param2);
              var6 = var10;
              if (var6 != null) {
                var7_int = 0;
                var8 = 0;
                L1: while (true) {
                  if (var8 >= var10.length) {
                    if (var7_int != 0) {
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    if (param1 == var10[var8].field_g) {
                      if (var10[var8].field_e == param5) {
                        L2: {
                          if (-1 == (param3 ^ -1)) {
                            break L2;
                          } else {
                            if (param3 == var10[var8].field_f) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        L3: {
                          if (var7_int == 0) {
                            break L3;
                          } else {
                            if (var10[var8].field_i > param0) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        var7_int = 1;
                        param0 = var10[var8].field_i;
                        var8++;
                        continue L1;
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                return null;
              }
            }
          }
          var11 = param2.a(param1, param5, param4 + -3053, param0, param3);
          if (param4 == 3160) {
            L4: while (true) {
              if (var11.field_f != 0) {
                var7 = (java.awt.Frame) var11.field_b;
                if (var7 != null) {
                  if ((var11.field_f ^ -1) == -3) {
                    wf.a(var7, param2, param4 + -3057);
                    return null;
                  } else {
                    return var7;
                  }
                } else {
                  return null;
                }
              } else {
                bc.a(10L, (byte) -106);
                continue L4;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static int[] a(byte param0) {
        if (param0 != 20) {
            field_j = null;
        }
        return new int[8];
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        Object var4 = null;
        nj.a(param1, 2, (String) null, param2);
        if (param0 < 78) {
            field_j = null;
        }
    }

    public static void b(byte param0) {
        field_b = null;
        field_g = null;
        field_f = null;
        field_h = null;
        field_d = null;
        field_e = null;
        field_c = null;
        int var1 = 43 % ((-16 - param0) / 38);
        field_j = null;
    }

    final static int a(String param0, int param1, boolean param2) {
        int var3 = -96 % ((-37 - param1) / 60);
        if (param2) {
            return vl.field_M.b(param0);
        }
        return sj.field_d.b(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new mk();
        field_h = "Private";
        field_a = false;
        field_e = "Hide private chat and appear offline to friends";
    }
}
