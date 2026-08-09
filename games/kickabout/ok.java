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
        RuntimeException var3 = null;
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
        int[] var18 = null;
        eg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var11 = new vn(gw.field_f[param1], true, false, true, true);
              var12 = var11;
              var15 = var12.field_p;
              var13 = var15;
              var4 = var13;
              if (param0 < -8) {
                break L1;
              } else {
                ok.a(-88);
                break L1;
              }
            }
            var5 = dq.a((byte) -34, 16777200, param2) - -1;
            var5 = 8355711 & var5 >> -1615253823;
            var6 = wk.a(var5, 63);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var15.length) {
                var18 = gt.field_f;
                var8 = var18[0] * t.field_o[1024] >> -562487120;
                var9 = t.field_f[1024] * var18[0] >> -1712015376;
                stackIn_10_0 = var11.b(var18[2], var18[3], var8, var18[1], var9);
                break L0;
              } else {
                L3: {
                  if (var15[var7] == 935) {
                    var4[var7] = (short)var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("ok.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static byte[] a(CharSequence param0, byte param1) {
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 == 106) {
                break L1;
              } else {
                field_d = (ut) null;
                break L1;
              }
            }
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackIn_69_0 = (byte[]) (var3);
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (var5 <= 0) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (var5 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var5 == 8364) {
                      var3[var4] = (byte)-128;
                      break L3;
                    } else {
                      if (var5 != 8218) {
                        if (402 == var5) {
                          var3[var4] = (byte)-125;
                          break L3;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte)-124;
                            break L3;
                          } else {
                            if (8230 == var5) {
                              var3[var4] = (byte)-123;
                              break L3;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte)-122;
                                break L3;
                              } else {
                                if (8225 == var5) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var5 == 381) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 != 8217) {
                                                  if (var5 != 8220) {
                                                    if (8221 != var5) {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var5 != 8211) {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (732 == var5) {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var5 != 339) {
                                                                      if (382 != var5) {
                                                                        if (376 == var5) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                }
                                              } else {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte)-126;
                        break L3;
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var2);

            stackIn_72_1 = new StringBuilder().append("ok.C(");

            if (param0 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
        return stackIn_69_0;
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
        field_a = new tf();
        field_d = new ut(256, 256);
    }
}
