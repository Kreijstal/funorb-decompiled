/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends gi {
    static int field_h;
    static he field_k;
    int field_n;
    static sa field_i;
    static int field_m;
    int field_j;
    static int field_l;

    public static void d(int param0) {
        field_i = null;
        if (param0 != -382) {
            og discarded$0 = b.a(true, 23);
            field_k = null;
            return;
        }
        field_k = null;
    }

    final static void e(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 <= -115) {
                  break L0;
                } else {
                  boolean discarded$1 = b.a(-17, 112);
                  break L0;
                }
              }
              var1_ref = Runtime.class.getMethod("maxMemory", new Class[0]);
              if (var1_ref != null) {
                try {
                  var2_ref = Runtime.getRuntime();
                  var4 = null;
                  var3 = (Long) var1_ref.invoke((Object) (Object) var2_ref, (Object[]) null);
                  pe.field_g = 1 + (int)(var3.longValue() / 1048576L);
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var2 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1) {
        int var2 = 85 % ((-66 - param0) / 36);
        return param1 == (param1 & -param1) ? true : false;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = param1.length();
        var3 = new byte[var2];
        if (param0 < -107) {
          var4 = 0;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L1: {
                L2: {
                  L3: {
                    var5 = param1.charAt(var4);
                    if (var5 <= 0) {
                      break L3;
                    } else {
                      if (128 > var5) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 < 160) {
                      break L4;
                    } else {
                      if (var5 > 255) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var5 != 8364) {
                    if (var5 != 8218) {
                      if (var5 == 402) {
                        var3[var4] = (byte)-125;
                        break L1;
                      } else {
                        if (var5 != 8222) {
                          if (var5 == 8230) {
                            var3[var4] = (byte)-123;
                            break L1;
                          } else {
                            if (var5 != 8224) {
                              if (8225 == var5) {
                                var3[var4] = (byte)-121;
                                break L1;
                              } else {
                                if (710 != var5) {
                                  if (var5 == 8240) {
                                    var3[var4] = (byte)-119;
                                    break L1;
                                  } else {
                                    if (352 == var5) {
                                      var3[var4] = (byte)-118;
                                      break L1;
                                    } else {
                                      if (var5 == 8249) {
                                        var3[var4] = (byte)-117;
                                        break L1;
                                      } else {
                                        if (338 != var5) {
                                          if (var5 == 381) {
                                            var3[var4] = (byte)-114;
                                            break L1;
                                          } else {
                                            if (var5 != 8216) {
                                              if (8217 != var5) {
                                                if (8220 != var5) {
                                                  if (var5 != 8221) {
                                                    if (var5 != 8226) {
                                                      if (var5 != 8211) {
                                                        if (var5 != 8212) {
                                                          if (732 == var5) {
                                                            var3[var4] = (byte)-104;
                                                            break L1;
                                                          } else {
                                                            if (var5 == 8482) {
                                                              var3[var4] = (byte)-103;
                                                              break L1;
                                                            } else {
                                                              if (var5 != 353) {
                                                                if (8250 != var5) {
                                                                  if (var5 == 339) {
                                                                    var3[var4] = (byte)-100;
                                                                    break L1;
                                                                  } else {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L1;
                                                                    } else {
                                                                      if (var5 == 376) {
                                                                        var3[var4] = (byte)-97;
                                                                        break L1;
                                                                      } else {
                                                                        var3[var4] = (byte)63;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-101;
                                                                  break L1;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-105;
                                                          break L1;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-106;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var3[var4] = (byte)-107;
                                                      break L1;
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-108;
                                                    break L1;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-109;
                                                  break L1;
                                                }
                                              } else {
                                                var3[var4] = (byte)-110;
                                                break L1;
                                              }
                                            } else {
                                              var3[var4] = (byte)-111;
                                              break L1;
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-116;
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-120;
                                  break L1;
                                }
                              }
                            } else {
                              var3[var4] = (byte)-122;
                              break L1;
                            }
                          }
                        } else {
                          var3[var4] = (byte)-124;
                          break L1;
                        }
                      }
                    } else {
                      var3[var4] = (byte)-126;
                      break L1;
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    break L1;
                  }
                }
                var3[var4] = (byte)var5;
                var4++;
                break L1;
              }
              var4++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final static og a(boolean param0, int param1) {
        og var2 = null;
        og stackIn_2_0 = null;
        og stackIn_3_0 = null;
        og stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        og stackIn_6_0 = null;
        og stackIn_7_0 = null;
        og stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        og stackOut_5_0 = null;
        og stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        og stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        og stackOut_1_0 = null;
        og stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        og stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param1 < 24) {
          L0: {
            field_i = null;
            var2 = new og(true);
            stackOut_5_0 = (og) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = (og) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (og) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_d = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new og(true);
            stackOut_1_0 = (og) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param0) {
              stackOut_3_0 = (og) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (og) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_d = stackIn_4_1 != 0;
          return var2;
        }
    }

    private b() throws Throwable {
        throw new Error();
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        nj var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 <= 0) {
          return null;
        } else {
          L0: {
            if (0 >= param0) {
              var4 = param2;
              break L0;
            } else {
              var8 = new byte[param3];
              var4 = var8;
              var5_int = 0;
              L1: while (true) {
                if (param3 <= var5_int) {
                  break L0;
                } else {
                  var8[var5_int] = param2[param0 + var5_int];
                  var5_int++;
                  continue L1;
                }
              }
            }
          }
          var5 = new nj();
          var5.a(true);
          var5.a((byte) -115, var4, (long)(param3 * 8));
          var6 = new byte[64];
          var5.a(0, (byte) -114, var6);
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 9;
        field_l = 0;
        field_i = new sa(9, 0, 4, 1);
    }
}
