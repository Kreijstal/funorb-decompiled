/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends rqa {
    static kb field_o;

    final nc a(nc[] param0, int param1) {
        si.a(199, 62, param0[0].a(45));
        if (param1 >= -119) {
          field_o = null;
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    ep(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
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
        L0: {
          var25 = VoidHunters.field_G;
          var6 = 0;
          var7 = param4;
          var8 = param3 * param3;
          var9 = param4 * param4;
          var10 = var9 << 1928738817;
          var11 = var8 << -309614431;
          var12 = param4 << -746754367;
          var13 = var10 + var8 * (-var12 + 1);
          var14 = var9 + -((var12 - 1) * var11);
          var15 = var8 << -796816286;
          var16 = var9 << -95260862;
          var17 = var10 * ((var6 << 1104085825) - -3);
          var18 = var11 * ((var7 << 837083265) + -3);
          var19 = var16 * (1 + var6);
          if (lua.field_c > param1) {
            break L0;
          } else {
            if (hab.field_i < param1) {
              break L0;
            } else {
              var21 = ksa.a(31123, ob.field_j, mt.field_o, param3 + param5);
              var22 = ksa.a(31123, ob.field_j, mt.field_o, -param3 + param5);
              ww.a(param2, var21, rba.field_b[param1], (byte) 75, var22);
              break L0;
            }
          }
        }
        var20 = (var7 + -1) * var15;
        if (param0 > -112) {
          field_o = null;
          L1: while (true) {
            if (var7 < -1) {
              if (0 > var13) {
                L2: while (true) {
                  if ((var13 ^ -1) <= -1) {
                    L3: {
                      if (-1 < (var14 ^ -1)) {
                        var14 = var14 + var19;
                        var13 = var13 + var17;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        var6++;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var14 = var14 + -var18;
                    var13 = var13 + -var20;
                    var7--;
                    var20 = var20 - var15;
                    var18 = var18 - var15;
                    var21 = param1 - var7;
                    var22 = var7 + param1;
                    if (var22 < lua.field_c) {
                      continue L1;
                    } else {
                      if (hab.field_i >= var21) {
                        L4: {
                          var23 = ksa.a(31123, ob.field_j, mt.field_o, param5 + var6);
                          var24 = ksa.a(31123, ob.field_j, mt.field_o, -var6 + param5);
                          if (lua.field_c <= var21) {
                            ww.a(param2, var23, rba.field_b[var21], (byte) 75, var24);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (hab.field_i >= var22) {
                          ww.a(param2, var23, rba.field_b[var22], (byte) 75, var24);
                          continue L1;
                        } else {
                          continue L1;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  } else {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var6++;
                    var19 = var19 + var16;
                    var17 = var17 + var16;
                    continue L2;
                  }
                }
              } else {
                L5: {
                  if (-1 > var14) {
                    var14 = var14 + var19;
                    var13 = var13 + var17;
                    var19 = var19 + var16;
                    var17 = var17 + var16;
                    var6++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var14 = var14 + -var18;
                var13 = var13 + -var20;
                var7--;
                var20 = var20 - var15;
                var18 = var18 - var15;
                var21 = param1 - var7;
                var22 = var7 + param1;
                if (var22 < lua.field_c) {
                  continue L1;
                } else {
                  if (hab.field_i >= var21) {
                    L6: {
                      var23 = ksa.a(31123, ob.field_j, mt.field_o, param5 + var6);
                      var24 = ksa.a(31123, ob.field_j, mt.field_o, -var6 + param5);
                      if (lua.field_c <= var21) {
                        ww.a(param2, var23, rba.field_b[var21], (byte) 75, var24);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (hab.field_i >= var22) {
                      ww.a(param2, var23, rba.field_b[var22], (byte) 75, var24);
                      continue L1;
                    } else {
                      continue L1;
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          L7: while (true) {
            if ((var7 ^ -1) < -1) {
              L8: {
                if (0 > var13) {
                  L9: while (true) {
                    if ((var13 ^ -1) <= -1) {
                      break L8;
                    } else {
                      var14 = var14 + var19;
                      var13 = var13 + var17;
                      var6++;
                      var19 = var19 + var16;
                      var17 = var17 + var16;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
              L10: {
                if (-1 < (var14 ^ -1)) {
                  var14 = var14 + var19;
                  var13 = var13 + var17;
                  var19 = var19 + var16;
                  var17 = var17 + var16;
                  var6++;
                  break L10;
                } else {
                  break L10;
                }
              }
              var14 = var14 + -var18;
              var13 = var13 + -var20;
              var7--;
              var20 = var20 - var15;
              var18 = var18 - var15;
              var21 = param1 - var7;
              var22 = var7 + param1;
              if (var22 < lua.field_c) {
                continue L7;
              } else {
                if (hab.field_i >= var21) {
                  L11: {
                    var23 = ksa.a(31123, ob.field_j, mt.field_o, param5 + var6);
                    var24 = ksa.a(31123, ob.field_j, mt.field_o, -var6 + param5);
                    if (lua.field_c <= var21) {
                      ww.a(param2, var23, rba.field_b[var21], (byte) 75, var24);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (hab.field_i >= var22) {
                    ww.a(param2, var23, rba.field_b[var22], (byte) 75, var24);
                    continue L7;
                  } else {
                    continue L7;
                  }
                } else {
                  continue L7;
                }
              }
            } else {
              return;
            }
          }
        }
    }

    public static void e(byte param0) {
        int var1 = 85 % ((-42 - param0) / 42);
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new kb(3);
    }
}
