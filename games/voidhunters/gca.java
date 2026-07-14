/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gca extends rqa {
    static char[] field_q;
    static String field_o;
    static String field_p;
    static lkb field_r;

    gca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(202, 84));
    }

    final static sg a(pe param0, byte param1, int param2, sg param3) {
        int var5 = 0;
        sg var6 = null;
        int var7 = 0;
        sg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sg[] var13 = null;
        L0: {
          var12 = VoidHunters.field_G;
          var13 = param0.d(1000);
          var5 = 2147483647;
          if (-1 >= (param3.q((byte) 113) ^ -1)) {
            break L0;
          } else {
            var5 = cab.field_p;
            break L0;
          }
        }
        var6 = null;
        var7 = 0;
        L1: while (true) {
          if (var13.length <= var7) {
            L2: {
              if (param1 == 63) {
                break L2;
              } else {
                field_o = null;
                break L2;
              }
            }
            return var6;
          } else {
            var8 = var13[var7];
            if (var8 != null) {
              if (param3 != var8) {
                L3: {
                  if (var8.q((byte) 71) != param3.q((byte) 84)) {
                    break L3;
                  } else {
                    if (var8.q((byte) 86) == sja.field_c) {
                      if (var8.o((byte) -117) != param2) {
                        if (null == var8.k((byte) -108)) {
                          break L3;
                        } else {
                          if (var8.k((byte) -108).a((byte) 66) != param2) {
                            break L3;
                          } else {
                            var7++;
                            continue L1;
                          }
                        }
                      } else {
                        var7++;
                        continue L1;
                      }
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                L4: {
                  if (!param3.g(false)) {
                    break L4;
                  } else {
                    if (!param0.a((anb) (Object) var8, 119)) {
                      break L4;
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
                var9 = var8.field_d + -param3.field_d;
                var10 = var8.field_e - param3.field_e;
                var11 = ar.a(var9, (byte) 107, var10);
                if (var5 > var11) {
                  var5 = var11;
                  var6 = var8;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              } else {
                var7++;
                var7++;
                continue L1;
              }
            } else {
              var7++;
              var7++;
              continue L1;
            }
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_o = null;
        if (param0 > -110) {
          var2 = null;
          sg discarded$2 = gca.a((pe) null, (byte) -124, 125, (sg) null);
          field_p = null;
          field_q = null;
          field_r = null;
          return;
        } else {
          field_p = null;
          field_q = null;
          field_r = null;
          return;
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = VoidHunters.field_G;
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (param1.length <= var3_int) {
            var12 = new int[-(var2 * 2) + (param1.length + param1.length)];
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var3 = var9;
            var4 = 0;
            L1: while (true) {
              if (param1.length <= var4) {
                var4 = param1.length;
                if (param0 < 63) {
                  return null;
                } else {
                  L2: {
                    var5 = -2 + param1.length;
                    if (-1 < (var5 ^ -1)) {
                      break L2;
                    } else {
                      L3: {
                        var6 = param1[var5];
                        var7 = param1[1 + var5];
                        if (var7 != 0) {
                          var12[var4] = var6;
                          var3[var4 - -1] = -var7;
                          var4 += 2;
                          break L3;
                        } else {
                          var5 -= 2;
                          break L3;
                        }
                      }
                      var5 -= 2;
                      var5 -= 2;
                      break L2;
                    }
                  }
                  return var3;
                }
              } else {
                var3[var4] = param1[var4];
                var4++;
                continue L1;
              }
            }
          } else {
            var4 = param1[var3_int - -1];
            if (-1 == (var4 ^ -1)) {
              var2++;
              var3_int += 2;
              var3_int += 2;
              continue L0;
            } else {
              var3_int += 2;
              var3_int += 2;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new char[128];
        field_o = "Power plant";
        field_p = "Honour";
        field_r = new lkb();
    }
}
