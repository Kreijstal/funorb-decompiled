/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static String field_c;
    static mn field_b;
    static String field_d;
    static String field_e;
    static int field_a;
    static volatile boolean field_f;
    static boolean field_g;
    static int field_h;

    final static int a(byte[] param0, byte param1, CharSequence param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var6_int = -param3 + param5;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                L2: {
                  if (param1 == -116) {
                    break L2;
                  } else {
                    field_b = (mn) null;
                    break L2;
                  }
                }
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param2.charAt(param3 + var7);
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
                        if (255 >= var8) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param0[param4 - -var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param0[var7 + param4] = (byte)-125;
                          break L3;
                        } else {
                          if (var8 == 8222) {
                            param0[param4 - -var7] = (byte)-124;
                            break L3;
                          } else {
                            if (var8 == 8230) {
                              param0[var7 + param4] = (byte)-123;
                              break L3;
                            } else {
                              if (var8 != 8224) {
                                if (var8 == 8225) {
                                  param0[var7 + param4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (710 != var8) {
                                    if (var8 == 8240) {
                                      param0[param4 + var7] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param0[param4 - -var7] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param0[param4 + var7] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (8216 == var8) {
                                                param0[var7 + param4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var8 == 8217) {
                                                  param0[param4 - -var7] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (8220 == var8) {
                                                    param0[param4 - -var7] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (8221 == var8) {
                                                      param0[var7 + param4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (8226 == var8) {
                                                        param0[var7 + param4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 != 8212) {
                                                            if (732 == var8) {
                                                              param0[var7 + param4] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var8 != 8482) {
                                                                if (var8 == 353) {
                                                                  param0[param4 - -var7] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (var8 == 339) {
                                                                      param0[param4 + var7] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 != var8) {
                                                                        if (var8 != 376) {
                                                                          param0[param4 + var7] = (byte)63;
                                                                          break L3;
                                                                        } else {
                                                                          param0[var7 + param4] = (byte)-97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param0[param4 + var7] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param0[var7 + param4] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              } else {
                                                                param0[var7 + param4] = (byte)-103;
                                                                break L3;
                                                              }
                                                            }
                                                          } else {
                                                            param0[var7 + param4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          param0[var7 + param4] = (byte)-106;
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          param0[var7 + param4] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        param0[var7 + param4] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param0[param4 - -var7] = (byte)-120;
                                    break L3;
                                  }
                                }
                              } else {
                                param0[var7 + param4] = (byte)-122;
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      param0[var7 + param4] = (byte)-128;
                      break L3;
                    }
                  }
                  param0[param4 + var7] = (byte)var8;
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
            stackOut_70_0 = (RuntimeException) (var6);
            stackOut_70_1 = new StringBuilder().append("ve.A(");
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param1).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_76_0), stackIn_76_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 != -340) {
            field_a = 68;
        }
    }

    static {
        field_c = "Power-ups awarded when your score crosses a threshold";
        field_d = "<%0> metres to Level <%1>";
        field_a = 0;
        field_e = "\"There's light at the end of the tunnel.\" - Ian T";
        field_b = new mn();
        field_f = true;
    }
}
