/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    int field_b;
    static String[] field_d;
    int field_c;
    int field_a;

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 10) {
            uo.a((byte) -76);
        }
    }

    final static void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        g var11 = null;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        g var15 = null;
        ub var16 = null;
        g var17 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var16 = new ub(200);
        var2 = 0;
        var3 = 0;
        var4 = 0;
        L0: while (true) {
          if (kba.f(-1) <= var4) {
            qg.field_a = new g[var2];
            sja.field_i = new g[var3];
            if (param0 <= -54) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                if (var16.a(-1) <= var6) {
                  return;
                } else {
                  var14 = (g) var16.a(true, var6);
                  var17 = var14;
                  if (!var17.field_e.a(-25584)) {
                    var4++;
                    qg.field_a[var4] = var17;
                    var6++;
                    continue L1;
                  } else {
                    var5++;
                    sja.field_i[var5] = var14;
                    var6++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            var5 = rga.b(26499, var4);
            var6 = 0;
            L2: while (true) {
              if (var6 >= var5) {
                var4++;
                continue L0;
              } else {
                L3: {
                  var15 = paa.c(var4, 91, var6);
                  if (-1 != var15.field_a) {
                    break L3;
                  } else {
                    if (var15.field_e.a(-25584)) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                var8 = var15.field_e.c(1);
                if ((var8 ^ -1) < -1) {
                  var9 = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var16.a(-1) <= var10) {
                        break L5;
                      } else {
                        L6: {
                          var11 = (g) var16.a(true, var10);
                          var12 = var11.field_e.c(1);
                          if (var8 < var12) {
                            break L6;
                          } else {
                            if (var8 == var12) {
                              if (var11.field_a > var15.field_a) {
                                break L6;
                              } else {
                                var10++;
                                continue L4;
                              }
                            } else {
                              var10++;
                              continue L4;
                            }
                          }
                        }
                        var16.a(var10, 0, (Object) (Object) var15);
                        var9 = 1;
                        break L5;
                      }
                    }
                    L7: {
                      if (var9 == 0) {
                        var16.a((byte) -37, (Object) (Object) var15);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (!var15.field_e.a(-25584)) {
                      var2++;
                      var6++;
                      continue L2;
                    } else {
                      var3++;
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
    }
}
