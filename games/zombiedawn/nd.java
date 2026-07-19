/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_e;
    static String field_d;
    static int field_a;
    static volatile boolean field_b;
    static int[] field_c;

    final static int a(boolean param0, CharSequence param1, byte[] param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var9 = ZombieDawn.field_J;
        try {
          L0: {
            var6_int = -param4 + param3;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                if (!param0) {
                  stackOut_69_0 = var6_int;
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_67_0 = -59;
                  stackIn_68_0 = stackOut_67_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param1.charAt(param4 + var7);
                      if (var8 <= 0) {
                        break L4;
                      } else {
                        if (var8 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var8 < 160) {
                        break L5;
                      } else {
                        if (var8 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (8218 == var8) {
                        param2[param5 + var7] = (byte)-126;
                        break L2;
                      } else {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param2[param5 + var7] = (byte)-122;
                                break L2;
                              } else {
                                if (8225 == var8) {
                                  param2[var7 + param5] = (byte)-121;
                                  break L2;
                                } else {
                                  if (var8 == 710) {
                                    param2[param5 + var7] = (byte)-120;
                                    break L2;
                                  } else {
                                    if (var8 != 8240) {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (338 != var8) {
                                            if (var8 == 381) {
                                              param2[param5 - -var7] = (byte)-114;
                                              break L2;
                                            } else {
                                              if (var8 != 8216) {
                                                if (var8 == 8217) {
                                                  param2[var7 + param5] = (byte)-110;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (var8 == 8221) {
                                                      param2[param5 - -var7] = (byte)-108;
                                                      break L2;
                                                    } else {
                                                      if (var8 != 8226) {
                                                        if (var8 != 8211) {
                                                          if (var8 != 8212) {
                                                            if (var8 != 732) {
                                                              if (8482 == var8) {
                                                                param2[param5 - -var7] = (byte)-103;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 353) {
                                                                  if (var8 == 8250) {
                                                                    param2[param5 - -var7] = (byte)-101;
                                                                    break L2;
                                                                  } else {
                                                                    if (339 == var8) {
                                                                      param2[var7 + param5] = (byte)-100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param2[param5 - -var7] = (byte)-97;
                                                                          break L2;
                                                                        } else {
                                                                          param2[param5 + var7] = (byte)63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param2[param5 - -var7] = (byte)-98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  param2[var7 + param5] = (byte)-102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param2[param5 - -var7] = (byte)-104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param2[param5 + var7] = (byte)-105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param2[param5 - -var7] = (byte)-106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        param2[var7 + param5] = (byte)-107;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    param2[param5 - -var7] = (byte)-109;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                param2[param5 - -var7] = (byte)-111;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            param2[param5 - -var7] = (byte)-116;
                                            break L2;
                                          }
                                        } else {
                                          param2[param5 + var7] = (byte)-117;
                                          break L2;
                                        }
                                      } else {
                                        param2[var7 + param5] = (byte)-118;
                                        break L2;
                                      }
                                    } else {
                                      param2[var7 + param5] = (byte)-119;
                                      break L2;
                                    }
                                  }
                                }
                              }
                            } else {
                              param2[var7 + param5] = (byte)-123;
                              break L2;
                            }
                          } else {
                            param2[var7 + param5] = (byte)-124;
                            break L2;
                          }
                        } else {
                          param2[var7 + param5] = (byte)-125;
                          break L2;
                        }
                      }
                    } else {
                      param2[var7 + param5] = (byte)-128;
                      break L2;
                    }
                  }
                  param2[param5 + var7] = (byte)var8;
                  break L2;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var6);
            stackOut_71_1 = new StringBuilder().append("nd.D(").append(param0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          L7: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L7;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_68_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 != 31336) {
            field_c = (int[]) null;
        }
        int var3 = param2 + -1 & param1 >> 1159192543;
        return (param1 + (param1 >>> 2036253983)) % param2 - -var3;
    }

    final static rc a(int param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8) {
        rc var9 = null;
        RuntimeException var9_ref = null;
        rc stackIn_2_0 = null;
        rc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_3_0 = null;
        rc stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param4 == 1159192543) {
              var9 = new rc(param2, param8, param7, param0, param1, param6, param3);
              hk.field_F.a(0, var9);
              rm.a((byte) -108, param5, var9);
              stackOut_3_0 = (rc) (var9);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (rc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var9_ref);
            stackOut_5_1 = new StringBuilder().append("nd.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, wg param2) {
        am var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = dp.field_e;
            var5.j(param1 ^ 10, param0);
            var5.field_j = var5.field_j + 1;
            var4 = var5.field_j;
            var5.i(param1, 35);
            var5.i(param2.field_i, -96);
            var5.a(17087, param2.field_r);
            var5.h(param1 ^ -126, param2.field_q);
            var5.h(param1 ^ -110, param2.field_k);
            var5.h(param1 ^ -113, param2.field_m);
            var5.h(param1 ^ 87, param2.field_h);
            discarded$0 = var5.e(-126, var4);
            var5.d(75, -var4 + var5.field_j);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "nd.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_c = null;
        field_e = null;
        if (param0 >= -124) {
            discarded$0 = nd.a(-84, -33, 91);
        }
        field_d = null;
    }

    static {
        field_e = "Connection lost. <%0>";
        field_d = "Waiting for fonts";
        field_c = new int[128];
        field_b = true;
    }
}
