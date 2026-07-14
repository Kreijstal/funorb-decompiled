/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class og {
    static String field_b;
    static int field_a;

    final static int a(boolean param0) {
        long var4 = 0L;
        int var6 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        int var1 = 0;
        int var2 = param0 ? 1 : 0;
        while (kj.e((byte) 118)) {
            ui.field_c.b(15275);
            if (ui.field_c.c((byte) 40)) {
                var1 = 1;
            }
            // if_icmpne L9
            var2 = 1;
        }
        ui.field_c.a((byte) 124, ha.a(ph.field_d, kc.field_u, -37), ha.a(ci.field_m, ik.field_a, -39));
        if (!(!ui.field_c.c((byte) 92))) {
            var1 = 1;
        }
        int var3 = 0;
        if (var1 == 0) {
            // ifeq L193
            // if_icmpeq L193
            fj.b((byte) -105);
        } else {
            if (0 > ui.field_c.field_j) {
                // if_icmpeq L193
                fj.b((byte) -105);
            } else {
                var3 = pe.field_db[ui.field_c.field_j];
                if ((var3 ^ -1) != -3) {
                    // if_icmpne L193
                }
                fj.b((byte) -103);
            }
        }
        if (var3 == -1) {
            if (-3 == nd.field_c) {
                var4 = -fd.field_e + ol.a(256);
                var6 = (int)((-var4 + 10999L) / 1000L);
                if (var6 <= 0) {
                    gj.a(-1, 5, true);
                    var3 = 2;
                }
            }
        }
        return var3;
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(java.awt.Component param0, byte param1);

    final static int a(int param0, byte param1, int param2) {
        int var5 = TorChallenge.field_F ? 1 : 0;
        int var3 = 0;
        while ((param2 ^ -1) < -1) {
            var3 = var3 << 133341953 | 1 & param0;
            param0 = param0 >>> 1;
            param2--;
        }
        int var4 = 75 % ((-57 - param1) / 42);
        return var3;
    }

    final static vh a(String param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return new vh(param0);
    }

    abstract int a(byte param0);

    public static void a(int param0) {
        field_b = null;
        if (param0 > -102) {
            int discarded$0 = og.a(-26, (byte) 90, -68);
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        L0: {
          var27 = TorChallenge.field_F ? 1 : 0;
          var3 = 1024;
          var4 = 512;
          var5 = param0;
          var5 = var5 % var3;
          var5 = -var5 + var3;
          var6 = param1;
          var6 = var6 % var4;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          var11 = 0;
          var12 = 0;
          var17 = lj.field_h[0].field_q;
          var18 = lj.field_h[0].field_v;
          var20 = 0;
          var21 = 480;
          var22 = 32;
          if (param2 == -15516) {
            break L0;
          } else {
            int discarded$1 = og.a(-113, (byte) -23, -27);
            break L0;
          }
        }
        var23 = 608;
        var24 = 0;
        L1: while (true) {
          if (4 <= var24) {
            return;
          } else {
            L2: {
              if (var24 == 0) {
                var9 = var5;
                var12 = var4;
                var8 = -var6;
                var7 = -var5;
                var11 = var6;
                var10 = var3;
                break L2;
              } else {
                if (1 != var24) {
                  if (-3 == var24) {
                    var8 = var4 + -var6;
                    var9 = 0;
                    var11 = 0;
                    var7 = -var5 + var3;
                    var12 = var6;
                    var10 = var5;
                    break L2;
                  } else {
                    if (-4 != var24) {
                      break L2;
                    } else {
                      var8 = -var6;
                      var9 = 0;
                      var12 = var4;
                      var11 = var6;
                      var10 = var5;
                      var7 = -var5 + var3;
                      break L2;
                    }
                  }
                } else {
                  var12 = var6;
                  var8 = -var6 + var4;
                  var7 = -var5;
                  var9 = var5;
                  var10 = var3;
                  var11 = 0;
                  break L2;
                }
              }
            }
            var25 = 0;
            L3: while (true) {
              if (var25 >= da.field_e) {
                var24++;
                continue L1;
              } else {
                if (wc.field_e[var25] != null) {
                  var26 = 0;
                  L4: while (true) {
                    if (wc.field_e[var25].length > var26) {
                      var15 = wc.field_e[var25][var26][1];
                      var13 = wc.field_e[var25][var26][0];
                      var16 = var18 + var15;
                      var14 = var17 + var13;
                      if (var16 >= var11) {
                        if (var15 < var12) {
                          if (var9 <= var14) {
                            if (var13 < var10) {
                              var16 = var16 + var8;
                              var14 = var14 + var7;
                              var15 = var15 + var8;
                              var13 = var13 + var7;
                              if (var16 >= var20) {
                                if (var21 > var15) {
                                  L5: {
                                    if (var13 < var22) {
                                      break L5;
                                    } else {
                                      if (var23 <= var14) {
                                        break L5;
                                      } else {
                                        var26++;
                                        continue L4;
                                      }
                                    }
                                  }
                                  var19 = wc.field_e[var25][var26][2];
                                  lj.field_h[var19].g(var13, var15);
                                  var26++;
                                  continue L4;
                                } else {
                                  var26++;
                                  continue L4;
                                }
                              } else {
                                var26++;
                                continue L4;
                              }
                            } else {
                              var26++;
                              continue L4;
                            }
                          } else {
                            var26++;
                            continue L4;
                          }
                        } else {
                          var26++;
                          continue L4;
                        }
                      } else {
                        var26++;
                        continue L4;
                      }
                    } else {
                      var25++;
                      continue L3;
                    }
                  }
                } else {
                  var25++;
                  continue L3;
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
        field_b = "Fullscreen";
    }
}
