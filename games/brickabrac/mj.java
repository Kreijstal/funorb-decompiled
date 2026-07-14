/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static jp field_d;
    static mh field_c;
    static String field_b;
    static String field_a;

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = -69 / ((param0 - 66) / 57);
        field_b = null;
        field_d = null;
    }

    final static String a(byte param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        var15 = new char[param1];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var11 = var12;
        var4 = var11;
        var5 = 0;
        if (param0 < -89) {
          var6 = param2;
          var7 = param1 + param2;
          L0: while (true) {
            if (var6 >= var7) {
              return new String(var15, 0, var5);
            } else {
              L1: {
                var6++;
                var8 = 255 & param3[var6];
                if (-129 >= (var8 ^ -1)) {
                  if (var8 >= 192) {
                    if (224 > var8) {
                      L2: {
                        if (var6 >= var7) {
                          break L2;
                        } else {
                          if (-129 != (param3[var6] & 192 ^ -1)) {
                            break L2;
                          } else {
                            var6++;
                            var9 = 63 & param3[var6] | 1984 & var8 << 882579238;
                            if (var9 >= 128) {
                              break L1;
                            } else {
                              var9 = 65533;
                              break L1;
                            }
                          }
                        }
                      }
                      var9 = 65533;
                      break L1;
                    } else {
                      if (240 <= var8) {
                        if ((var8 ^ -1) > -249) {
                          L3: {
                            if (var7 <= var6 + 2) {
                              break L3;
                            } else {
                              if ((param3[var6] & 192 ^ -1) != -129) {
                                break L3;
                              } else {
                                if ((param3[var6 + 1] & 192) != 128) {
                                  break L3;
                                } else {
                                  if (-129 == (192 & param3[2 + var6] ^ -1)) {
                                    L4: {
                                      var6++;
                                      var6++;
                                      var6++;
                                      var9 = param3[var6] << -396318388 & 258048 | 1835008 & var8 << -110907822 | 4032 & param3[var6] << -1285759514 | param3[var6] & 63;
                                      if (-65537 < (var9 ^ -1)) {
                                        break L4;
                                      } else {
                                        if ((var9 ^ -1) >= -1114112) {
                                          var9 = 65533;
                                          break L1;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                    var9 = 65533;
                                    break L1;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                          var9 = 65533;
                          break L1;
                        } else {
                          var9 = 65533;
                          break L1;
                        }
                      } else {
                        L5: {
                          if (var6 - -1 >= var7) {
                            break L5;
                          } else {
                            if ((param3[var6] & 192 ^ -1) != -129) {
                              break L5;
                            } else {
                              if ((192 & param3[var6 - -1] ^ -1) == -129) {
                                var6++;
                                var6++;
                                var9 = (param3[var6] & 63) << -1842956154 | (15 & var8) << -1611718740 | param3[var6] & 63;
                                if (-2049 < (var9 ^ -1)) {
                                  var9 = 65533;
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L1;
                      }
                    }
                  } else {
                    var9 = 65533;
                    break L1;
                  }
                } else {
                  if (var8 == 0) {
                    var9 = 65533;
                    break L1;
                  } else {
                    var9 = var8;
                    break L1;
                  }
                }
              }
              var5++;
              var11[var5] = (char)var9;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0) {
        int var1 = 5 / ((41 - param0) / 62);
        return null == ua.field_d ? qa.field_r : true;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        eb.field_n = param0;
        vq.field_A = param1;
        cc.field_H = param3;
        if (param2) {
            Object var5 = null;
            String discarded$0 = mj.a((byte) 117, 3, -87, (byte[]) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Show all game chat";
        field_b = "Kick";
    }
}
