/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static int field_c;
    static int[] field_d;
    static int[] field_a;
    static String field_e;
    static int field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 92) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, int param4, be param5) {
        db[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        db[] var10 = null;
        eb var11 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        if (param5.b((byte) -100)) {
          L0: {
            if ((param1 ^ -1) == param3) {
              var10 = a.a(param5, -119);
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
                    if (var10[var8].field_d == param0) {
                      if (var10[var8].field_b == param4) {
                        L2: {
                          if (param2 == 0) {
                            break L2;
                          } else {
                            if (param2 == var10[var8].field_a) {
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
                            if (param1 < var10[var8].field_e) {
                              break L3;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                        param1 = var10[var8].field_e;
                        var7_int = 1;
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
            } else {
              break L0;
            }
          }
          var11 = param5.a(param1, param0, param2, param3 + 28253, param4);
          L4: while (true) {
            if (var11.field_a != 0) {
              var7 = (java.awt.Frame) var11.field_g;
              if (var7 != null) {
                if (-3 != (var11.field_a ^ -1)) {
                  return var7;
                } else {
                  tj.a(param5, var7, -23144);
                  return null;
                }
              } else {
                return null;
              }
            } else {
              hb.a(10L, param3 + 122);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, int param1) {
        bm.field_d.a((byte) 82, param1, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[12];
        field_d[1] = 1;
        field_d[4] = 5000;
        field_d[5] = 1000;
        field_d[3] = 5000;
        field_d[6] = 1;
        field_d[7] = 10;
        field_d[10] = 10;
        field_d[8] = 1;
        field_d[2] = 10;
        field_d[11] = 5000;
        field_d[0] = 1;
        field_d[9] = 10;
        field_e = "Unpacking music";
    }
}
