/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static String field_h;
    static wo field_g;
    static int[] field_f;
    static int field_j;
    static int[] field_e;
    static int field_a;
    static String field_i;
    static int field_d;
    static String field_c;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_i = null;
        if (param0 != 938035464) {
            cl.a(107, -93, (byte) 122);
        }
        field_h = null;
        field_f = null;
        field_g = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (param0 != 8231) {
            return;
        }
        ln.field_q = false;
        lh.field_g = 0 == vi.field_o.f(255) ? true : false;
    }

    final static int a(int param0, byte[] param1, int param2, CharSequence param3, int param4, int param5) {
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
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var6_int = param2 - param4;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                L2: {
                  if (param5 == -21809) {
                    break L2;
                  } else {
                    cl.a(19, 73, (byte) -104);
                    break L2;
                  }
                }
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(param4 + var7);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
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
                    if (var8 == 8364) {
                      param1[param0 + var7] = (byte)-128;
                      break L3;
                    } else {
                      if (var8 != 8218) {
                        if (var8 == 402) {
                          param1[param0 + var7] = (byte)-125;
                          break L3;
                        } else {
                          if (var8 != 8222) {
                            if (var8 == 8230) {
                              param1[param0 + var7] = (byte)-123;
                              break L3;
                            } else {
                              if (var8 == 8224) {
                                param1[var7 + param0] = (byte)-122;
                                break L3;
                              } else {
                                if (8225 == var8) {
                                  param1[var7 + param0] = (byte)-121;
                                  break L3;
                                } else {
                                  if (710 != var8) {
                                    if (var8 != 8240) {
                                      if (352 == var8) {
                                        param1[var7 + param0] = (byte)-118;
                                        break L3;
                                      } else {
                                        if (8249 == var8) {
                                          param1[param0 - -var7] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var8 != 338) {
                                            if (var8 != 381) {
                                              if (var8 != 8216) {
                                                if (var8 != 8217) {
                                                  if (8220 != var8) {
                                                    if (var8 != 8221) {
                                                      if (var8 != 8226) {
                                                        if (var8 == 8211) {
                                                          param1[var7 + param0] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (var8 != 8212) {
                                                            if (var8 != 732) {
                                                              if (8482 != var8) {
                                                                if (var8 == 353) {
                                                                  param1[var7 + param0] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param1[param0 - -var7] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param1[var7 + param0] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 != var8) {
                                                                        if (var8 == 376) {
                                                                          param1[param0 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          param1[param0 - -var7] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param1[var7 + param0] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param1[var7 + param0] = (byte)-103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              param1[param0 + var7] = (byte)-104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            param1[var7 + param0] = (byte)-105;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        param1[var7 + param0] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      param1[var7 + param0] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param1[var7 + param0] = (byte)-109;
                                                    break L3;
                                                  }
                                                } else {
                                                  param1[var7 + param0] = (byte)-110;
                                                  break L3;
                                                }
                                              } else {
                                                param1[var7 + param0] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              param1[var7 + param0] = (byte)-114;
                                              break L3;
                                            }
                                          } else {
                                            param1[var7 + param0] = (byte)-116;
                                            break L3;
                                          }
                                        }
                                      }
                                    } else {
                                      param1[param0 + var7] = (byte)-119;
                                      break L3;
                                    }
                                  } else {
                                    param1[param0 - -var7] = (byte)-120;
                                    break L3;
                                  }
                                }
                              }
                            }
                          } else {
                            param1[var7 + param0] = (byte)-124;
                            break L3;
                          }
                        }
                      } else {
                        param1[var7 + param0] = (byte)-126;
                        break L3;
                      }
                    }
                  }
                  param1[var7 + param0] = (byte)var8;
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

            stackIn_72_1 = new StringBuilder().append("cl.B(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final static tf a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (param2 >= -40) {
            return (tf) null;
        }
        tf var6 = new tf(param0, param0);
        tf var3 = var6;
        for (var4 = 0; var4 < var3.field_G.length; var4++) {
            var6.field_G[var4] = param1;
        }
        return var3;
    }

    final static int a(byte param0, int param1) {
        int var2 = param1 >>> -918627519;
        var2 = var2 | var2 >>> -1027587327;
        var2 = var2 | var2 >>> -1743811166;
        if (param0 > -97) {
            cl.a((byte) -91, -19);
        }
        var2 = var2 | var2 >>> 140792772;
        var2 = var2 | var2 >>> 938035464;
        var2 = var2 | var2 >>> 947827344;
        return param1 & (var2 ^ -1);
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -93 / ((-55 - param0) / 55);
        if (!(null == up.field_o)) {
            dp.a(up.field_o, -2);
        }
        if (!(null == eg.field_n)) {
            eg.field_n.a(param1, (byte) 20);
        }
        de.a((byte) 28, param1);
        if (!(hc.field_M == null)) {
            hc.field_M.a(param1, 0);
        }
        kd.c(param1, -24721);
    }

    static {
        field_f = new int[]{2};
        field_j = 4;
        field_e = new int[]{5, 10, 20};
        field_a = 5;
        field_i = "Show game chat from my friends";
        field_b = "Friends";
        field_c = "Quit";
    }
}
