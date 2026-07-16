/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends fa {
    static uc field_p;
    static dl field_q;
    static String field_o;
    static boolean field_n;

    public static void c(int param0) {
        field_p = null;
        if (param0 != 128) {
            return;
        }
        field_o = null;
        field_q = null;
    }

    uh(long param0, String param1) {
        super(param0, param1);
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
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
        var10 = CrazyCrystals.field_B;
        if (param1 == 192) {
          var15 = new char[param3];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var11 = var12;
          var4 = var11;
          var5 = 0;
          var6 = param2;
          var7 = param2 + param3;
          L0: while (true) {
            if (var7 <= var6) {
              return new String(var15, 0, var5);
            } else {
              L1: {
                int incrementValue$8 = var6;
                var6++;
                var8 = param0[incrementValue$8] & 255;
                if (-129 < (var8 ^ -1)) {
                  if (-1 != (var8 ^ -1)) {
                    var9 = var8;
                    break L1;
                  } else {
                    var9 = 65533;
                    break L1;
                  }
                } else {
                  if ((var8 ^ -1) > -193) {
                    var9 = 65533;
                    break L1;
                  } else {
                    if (var8 < 224) {
                      L2: {
                        if (var6 >= var7) {
                          break L2;
                        } else {
                          if ((192 & param0[var6]) != 128) {
                            break L2;
                          } else {
                            int incrementValue$9 = var6;
                            var6++;
                            var9 = param0[incrementValue$9] & 63 | (var8 & 31) << 1013441158;
                            if (128 > var9) {
                              var9 = 65533;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      var9 = 65533;
                      break L1;
                    } else {
                      if (240 > var8) {
                        L3: {
                          if (var7 <= 1 + var6) {
                            break L3;
                          } else {
                            if (-129 != (192 & param0[var6] ^ -1)) {
                              break L3;
                            } else {
                              if ((192 & param0[var6 + 1]) == 128) {
                                int incrementValue$10 = var6;
                                var6++;
                                int incrementValue$11 = var6;
                                var6++;
                                var9 = param0[incrementValue$10] << 730108486 & 4032 | var8 << 1647473388 & 61440 | 63 & param0[incrementValue$11];
                                if (-2049 >= (var9 ^ -1)) {
                                  break L1;
                                } else {
                                  var9 = 65533;
                                  break L1;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        var9 = 65533;
                        break L1;
                      } else {
                        if (var8 < 248) {
                          L4: {
                            if (2 + var6 >= var7) {
                              break L4;
                            } else {
                              if ((param0[var6] & 192 ^ -1) != -129) {
                                break L4;
                              } else {
                                if ((192 & param0[var6 + 1] ^ -1) != -129) {
                                  break L4;
                                } else {
                                  if ((param0[var6 - -2] & 192) == 128) {
                                    L5: {
                                      int incrementValue$12 = var6;
                                      var6++;
                                      int incrementValue$13 = var6;
                                      var6++;
                                      int incrementValue$14 = var6;
                                      var6++;
                                      var9 = 1835008 & var8 << 2080498002 | (param0[incrementValue$12] & 63) << -335295220 | (param0[incrementValue$13] & 63) << -395589018 | param0[incrementValue$14] & 63;
                                      if (65536 > var9) {
                                        break L5;
                                      } else {
                                        if ((var9 ^ -1) < -1114112) {
                                          break L5;
                                        } else {
                                          var9 = 65533;
                                          break L1;
                                        }
                                      }
                                    }
                                    var9 = 65533;
                                    break L1;
                                  } else {
                                    break L4;
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
                      }
                    }
                  }
                }
              }
              int incrementValue$15 = var5;
              var5++;
              var11[incrementValue$15] = (char)var9;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final wh a(int param0) {
        if (param0 != 0) {
            wh discarded$0 = ((uh) this).a(106);
            return ea.field_q;
        }
        return ea.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Show All";
        field_p = null;
    }
}
