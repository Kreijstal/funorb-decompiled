/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ok {
    static tf field_a;
    static ut field_d;
    static boolean field_c;
    static String[] field_b;

    final static eg a(int param0, int param1, Random param2) {
        short[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vn var11 = null;
        vn var12 = null;
        short[] var13 = null;
        short[] var15 = null;
        short[] var17 = null;
        short[] var19 = null;
        int[] var20 = null;
        L0: {
          var10 = Kickabout.field_G;
          var11 = new vn(gw.field_f[param1], true, false, true, true);
          var12 = var11;
          var19 = var12.field_p;
          var17 = var19;
          var15 = var17;
          var13 = var15;
          var4 = var13;
          if (param0 < -8) {
            break L0;
          } else {
            ok.a(-88);
            break L0;
          }
        }
        var5 = dq.a((byte) -34, 16777200, param2) - -1;
        var5 = 8355711 & var5 >> -1615253823;
        var6 = wk.a(var5, 63);
        var7 = 0;
        L1: while (true) {
          if (var7 >= var19.length) {
            var20 = gt.field_f;
            var8 = var20[0] * t.field_o[1024] >> -562487120;
            var9 = t.field_f[1024] * var20[0] >> -1712015376;
            return var11.b(var20[2], var20[3], var8, var20[1], var9);
          } else {
            if (var19[var7] == 935) {
              var4[var7] = (short)var6;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          var2 = param0.length();
          if (param1 == 106) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param0.charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (var5 < 128) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 160) {
                    break L5;
                  } else {
                    if (var5 > 255) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (402 == var5) {
                      var3[var4] = (byte)-125;
                      break L2;
                    } else {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (8230 == var5) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (8225 == var5) {
                              var3[var4] = (byte)-121;
                              break L2;
                            } else {
                              if (var5 != 710) {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  } else {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 == 338) {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      } else {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (var5 != 8216) {
                                            if (var5 != 8217) {
                                              if (var5 != 8220) {
                                                if (8221 != var5) {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 != 8211) {
                                                      if (var5 == 8212) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (732 == var5) {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 353) {
                                                              if (var5 == 8250) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 339) {
                                                                  if (382 != var5) {
                                                                    if (376 == var5) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-120;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L2;
                  }
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 < 125) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new tf();
        field_d = new ut(256, 256);
    }
}
