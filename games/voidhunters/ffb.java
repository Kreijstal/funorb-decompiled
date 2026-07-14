/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ffb {
    static String field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        ps var4 = null;
        if (param1 != null) {
          if (param1 instanceof byte[]) {
            var3 = (byte[]) param1;
            if (param0) {
              return nia.a(var3, (byte) -116);
            } else {
              return var3;
            }
          } else {
            if (param1 instanceof ps) {
              var4 = (ps) param1;
              return var4.b(3);
            } else {
              if (!param2) {
                return null;
              } else {
                throw new IllegalArgumentException();
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        int var1 = -75 / ((-40 - param0) / 34);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
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
        var15 = VoidHunters.field_G;
        if (param1 >= -72) {
          field_d = null;
          var5 = 0;
          var6 = param0;
          var7 = -param0;
          var8 = -1;
          var9 = ksa.a(31123, ob.field_j, mt.field_o, param4 + param0);
          var10 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -param0);
          ww.a(param3, var9, rba.field_b[param2], (byte) 75, var10);
          L0: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L1: {
                var8 += 2;
                var7 = var7 + var8;
                if ((var7 ^ -1) >= -1) {
                  break L1;
                } else {
                  var6--;
                  var7 = var7 - (var6 << -162312607);
                  var11 = -var6 + param2;
                  var12 = param2 - -var6;
                  if (lua.field_c > var12) {
                    break L1;
                  } else {
                    if (hab.field_i >= var11) {
                      L2: {
                        var13 = ksa.a(31123, ob.field_j, mt.field_o, var5 + param4);
                        var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -var5);
                        if (var12 <= hab.field_i) {
                          ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (var11 >= lua.field_c) {
                        ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5++;
              var11 = -var5 + param2;
              var12 = var5 + param2;
              if (lua.field_c > var12) {
                continue L0;
              } else {
                if (var11 > hab.field_i) {
                  continue L0;
                } else {
                  L3: {
                    var13 = ksa.a(31123, ob.field_j, mt.field_o, param4 + var6);
                    var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var6);
                    if (hab.field_i >= var12) {
                      ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (lua.field_c > var11) {
                    continue L0;
                  } else {
                    ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          var5 = 0;
          var6 = param0;
          var7 = -param0;
          var8 = -1;
          var9 = ksa.a(31123, ob.field_j, mt.field_o, param4 + param0);
          var10 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -param0);
          ww.a(param3, var9, rba.field_b[param2], (byte) 75, var10);
          L4: while (true) {
            if (var6 <= var5) {
              return;
            } else {
              L5: {
                var8 += 2;
                var7 = var7 + var8;
                if ((var7 ^ -1) >= -1) {
                  break L5;
                } else {
                  var6--;
                  var7 = var7 - (var6 << -162312607);
                  var11 = -var6 + param2;
                  var12 = param2 - -var6;
                  if (lua.field_c > var12) {
                    break L5;
                  } else {
                    if (hab.field_i >= var11) {
                      L6: {
                        var13 = ksa.a(31123, ob.field_j, mt.field_o, var5 + param4);
                        var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 + -var5);
                        if (var12 <= hab.field_i) {
                          ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (var11 >= lua.field_c) {
                        ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var5++;
              var11 = -var5 + param2;
              var12 = var5 + param2;
              if (lua.field_c > var12) {
                continue L4;
              } else {
                if (var11 > hab.field_i) {
                  continue L4;
                } else {
                  L7: {
                    var13 = ksa.a(31123, ob.field_j, mt.field_o, param4 + var6);
                    var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var6);
                    if (hab.field_i >= var12) {
                      ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (lua.field_c > var11) {
                    continue L4;
                  } else {
                    ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                    continue L4;
                  }
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
        field_a = "Add condition (Node on team)";
        field_d = "Offer rematch";
        field_b = "Menu";
        field_c = "Player Name: ";
    }
}
