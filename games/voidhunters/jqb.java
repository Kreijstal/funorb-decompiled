/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jqb extends rqa {
    static float[] field_o;

    jqb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, String param2, byte param3, int param4, int param5, da param6, ha param7, sw param8, int param9, int param10) {
        int var11 = param8.a(param2, 1);
        int var12 = param8.field_d + param8.field_e;
        int var13 = param10;
        if (!(6 + var11 + var13 <= param5)) {
            var13 = -6 + (-var11 + param5);
        }
        int var14 = -param8.field_d + param4 + 32;
        if (param1 < var12 + (var14 - -6)) {
            var14 = -6 + param1 + -var12;
        }
        param7.a(114, var14, 6 + var11, -16777216 | param0, var13, 6 + var12);
        if (param3 != 100) {
            Object var15 = null;
            java.awt.Frame discarded$0 = jqb.a(-53, -31, (eab) null, -44, -9, 98);
        }
        param7.a(var11 + 4, (byte) 120, -16777216 | param9, var12 + 4, 1 + var14, 1 + var13);
        param6.a(true, param0 | -16777216, -1, param2, var14 + 3 + param8.field_d, var13 + 3);
    }

    final static java.awt.Frame a(int param0, int param1, eab param2, int param3, int param4, int param5) {
        fm[] var6 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        fm[] var10 = null;
        mob var11 = null;
        var9 = VoidHunters.field_G;
        if (param2.a(param0 + -11168)) {
          L0: {
            if (-1 == (param1 ^ -1)) {
              var10 = dtb.a(param2, -30334);
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
                    if (var10[var8].field_c == param5) {
                      if (var10[var8].field_a == param3) {
                        L2: {
                          if (param4 == 0) {
                            break L2;
                          } else {
                            if (var10[var8].field_d == param4) {
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
                        var7_int = 1;
                        param1 = var10[var8].field_e;
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
          var11 = param2.a(param3, 4, param1, param5, param4);
          L4: while (true) {
            if (0 != var11.field_f) {
              var7 = (java.awt.Frame) var11.field_d;
              if (var7 != null) {
                L5: {
                  if (param0 == 11168) {
                    break L5;
                  } else {
                    field_o = null;
                    break L5;
                  }
                }
                if (2 == var11.field_f) {
                  db.a(var7, param2, (byte) 31);
                  return null;
                } else {
                  return var7;
                }
              } else {
                return null;
              }
            } else {
              gdb.b(121, 10L);
              continue L4;
            }
          }
        } else {
          return null;
        }
    }

    public static void e(byte param0) {
        if (param0 != -15) {
            jqb.e((byte) 23);
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            field_o = null;
        }
        return new nc(qoa.field_o);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new float[2];
    }
}
