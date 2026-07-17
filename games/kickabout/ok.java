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
        short[] var17 = null;
        short[] var19 = null;
        int[] var20 = null;
        eg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var11 = new vn(gw.field_f[param1], true, false, true, true);
              var12 = var11;
              var19 = var12.field_p;
              var17 = var19;
              var15 = var17;
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
            var5 = 8355711 & var5 >> 1;
            var6 = wk.a(var5, 63);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var19.length) {
                var20 = gt.field_f;
                var8 = var20[0] * t.field_o[1024] >> 16;
                var9 = t.field_f[1024] * var20[0] >> 16;
                stackOut_9_0 = var11.b(var20[2], var20[3], var8, var20[1], var9);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L3: {
                  if (var19[var7] == 935) {
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
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ok.B(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static byte[] a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackOut_66_0 = (byte[]) var3;
                stackIn_67_0 = stackOut_66_0;
                break L0;
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
                      var3[var4] = (byte) -128;
                      break L2;
                    } else {
                      if (var5 != 8218) {
                        if (402 == var5) {
                          var3[var4] = (byte) -125;
                          break L2;
                        } else {
                          if (var5 == 8222) {
                            var3[var4] = (byte) -124;
                            break L2;
                          } else {
                            if (8230 == var5) {
                              var3[var4] = (byte) -123;
                              break L2;
                            } else {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (8225 == var5) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var5 == 381) {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var5 != 8216) {
                                                if (var5 != 8217) {
                                                  if (var5 != 8220) {
                                                    if (8221 != var5) {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var5 != 8211) {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (732 == var5) {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            } else {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 != 339) {
                                                                      if (382 != var5) {
                                                                        if (376 == var5) {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var3[var4] = (byte) -126;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var2;
            stackOut_68_1 = new StringBuilder().append("ok.C(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + 44 + 106 + 41);
        }
        return stackIn_67_0;
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
