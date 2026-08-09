/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static int[] field_b;
    static int[] field_d;
    static int field_c;
    static bd field_a;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 0 % ((param0 - -77) / 41);
        field_a = null;
        field_b = null;
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (param1 <= 0) {
                break L2;
              } else {
                if (param1 < 128) {
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param1 < 160) {
                break L3;
              } else {
                if (param1 > 255) {
                  break L3;
                } else {
                  return true;
                }
              }
            }
            L4: {
              if (param1 == 0) {
                break L4;
              } else {
                var6 = kh.field_hb;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var3 >= var6.length) {
                    break L4;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3++;
                      continue L5;
                    }
                  }
                }
              }
            }
            stackIn_20_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "j.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final static int a(int param0, int param1, int param2, byte param3, byte[] param4, CharSequence param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var6_int = param0 - param2;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                L2: {
                  if (param3 == -125) {
                    break L2;
                  } else {
                    var10 = (CharSequence) null;
                    j.a(-82, -13, -122, (byte) 122, (byte[]) null, (CharSequence) null);
                    break L2;
                  }
                }
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param5.charAt(var7 + param2);
                      if (-1 <= (var8 ^ -1)) {
                        break L5;
                      } else {
                        if (128 > var8) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param4[param1 - -var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param4[var7 + param1] = (byte)-125;
                          break L3;
                        } else {
                          if (var8 == 8222) {
                            param4[param1 + var7] = (byte)-124;
                            break L3;
                          } else {
                            if (var8 != 8230) {
                              if (8224 != var8) {
                                if (var8 == 8225) {
                                  param4[param1 - -var7] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var8 != 710) {
                                    if (8240 == var8) {
                                      param4[var7 + param1] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var8 == 352) {
                                        param4[var7 + param1] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (var8 == 8249) {
                                          param4[param1 + var7] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var8 == 338) {
                                            param4[var7 + param1] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param4[param1 + var7] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (8216 != var8) {
                                                if (8217 == var8) {
                                                  param4[param1 - -var7] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param4[var7 + param1] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (8226 != var8) {
                                                        if (8211 != var8) {
                                                          if (8212 == var8) {
                                                            param4[param1 + var7] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 == 732) {
                                                              param4[var7 + param1] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var8 != 8482) {
                                                                if (353 == var8) {
                                                                  param4[param1 - -var7] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param4[var7 + param1] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param4[var7 + param1] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 == 382) {
                                                                        param4[param1 - -var7] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 != 376) {
                                                                          param4[param1 - -var7] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          param4[param1 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param4[var7 + param1] = (byte)-103;
                                                                break L3;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          param4[param1 - -var7] = (byte)-106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        param4[var7 + param1] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      param4[param1 - -var7] = (byte)-108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param4[var7 + param1] = (byte)-111;
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    param4[param1 - -var7] = (byte)-120;
                                    break L3;
                                  }
                                }
                              } else {
                                param4[param1 - -var7] = (byte)-122;
                                break L3;
                              }
                            } else {
                              param4[var7 + param1] = (byte)-123;
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      param4[param1 - -var7] = (byte)-128;
                      break L3;
                    }
                  }
                  param4[param1 - -var7] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("j.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param5 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ')');
        }
        return stackIn_69_0;
    }

    static {
        field_d = new int[]{1, 2, 5, 5, 10, 1, 1, 1, 1, 1, 1, 2, 3, 3, 5, 5, 10, 3, 10, 2, 5, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 5, 3, 1, 1, 2, 2, 2, 3, 3, 5, 10};
        field_b = new int[]{24, 27, 5};
        field_c = 0;
    }
}
