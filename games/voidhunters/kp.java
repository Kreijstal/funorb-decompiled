/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp extends rqa {
    static String field_o;

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
            kp.a(9);
        }
        return new nc((Object) (Object) frb.a(228, 95));
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        kla var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          var1 = 0;
          var2 = -1;
          if (param0 <= -19) {
            break L0;
          } else {
            kp.e(-126);
            break L0;
          }
        }
        var3 = -1;
        var4 = -1;
        var5 = feb.a(og.field_r, true);
        var6 = 0;
        L1: while (true) {
          if (dma.field_j <= var6) {
            L2: {
              if (0 != var2) {
                var6 = dma.field_j;
                nr.a(var5, var3, var6, 2, var4, var2);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            var7 = -1;
            var8 = -1;
            var9 = 0;
            L3: while (true) {
              if (var9 >= dma.field_g) {
                if (-1 != var7) {
                  L4: {
                    if (var2 == -1) {
                      break L4;
                    } else {
                      L5: {
                        if ((Math.abs(var2 - var7) ^ -1) <= -9) {
                          break L5;
                        } else {
                          if (8 <= Math.abs(-var8 + var3)) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      nr.a(var5, var3, var6, 2, var4, var2);
                      var2 = -1;
                      var3 = -1;
                      if (var7 != 0) {
                        var3 = var8;
                        var2 = var7;
                        var4 = var6;
                        var6++;
                        continue L1;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  L6: {
                    if ((var2 ^ -1) == 0) {
                      var4 = var6;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  var2 = var7;
                  var3 = var8;
                  var6++;
                  continue L1;
                } else {
                  if (0 != var2) {
                    var3 = -1;
                    var2 = -1;
                    var6++;
                    continue L1;
                  } else {
                    var6++;
                    continue L1;
                  }
                }
              } else {
                if (-1 != (dma.field_i[var1] ^ -1)) {
                  var8 = var9;
                  if (var7 == 0) {
                    var7 = var9;
                    var1++;
                    var9++;
                    continue L3;
                  } else {
                    var1++;
                    var9++;
                    continue L3;
                  }
                } else {
                  var1++;
                  var9++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 <= 22) {
            field_o = null;
        }
        field_o = null;
    }

    kp(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Private";
    }
}
