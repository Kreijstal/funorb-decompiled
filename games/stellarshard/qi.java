/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static int field_a;
    static int field_b;

    final static int a(byte[] param0, int param1, int param2, int param3, CharSequence param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var10 = stellarshard.field_B;
        try {
          L0: {
            var6_int = param5;
            var8 = 0 % ((71 - param1) / 48);
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6_int) {
                stackOut_66_0 = var6_int;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var9 = param4.charAt(var7);
                      if (var9 <= 0) {
                        break L4;
                      } else {
                        if (var9 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 160) {
                        break L5;
                      } else {
                        if (var9 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var9 == 8364) {
                      param0[var7 + param2] = (byte) -128;
                      break L2;
                    } else {
                      if (var9 == 8218) {
                        param0[var7 + param2] = (byte) -126;
                        break L2;
                      } else {
                        if (var9 == 402) {
                          param0[param2 - -var7] = (byte) -125;
                          break L2;
                        } else {
                          if (var9 == 8222) {
                            param0[param2 + var7] = (byte) -124;
                            break L2;
                          } else {
                            if (8230 != var9) {
                              if (var9 != 8224) {
                                if (8225 != var9) {
                                  if (710 != var9) {
                                    if (8240 == var9) {
                                      param0[var7 + param2] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var9 != 352) {
                                        if (8249 != var9) {
                                          if (var9 == 338) {
                                            param0[var7 + param2] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var9 != 381) {
                                              if (8216 != var9) {
                                                if (8217 != var9) {
                                                  if (var9 == 8220) {
                                                    param0[var7 + param2] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var9 == 8221) {
                                                      param0[var7 + param2] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var9 == 8226) {
                                                        param0[var7 + param2] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var9 == 8211) {
                                                          param0[param2 + var7] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var9 != 8212) {
                                                            if (var9 != 732) {
                                                              if (8482 != var9) {
                                                                if (var9 == 353) {
                                                                  param0[var7 + param2] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var9 == 8250) {
                                                                    param0[var7 + param2] = (byte) -101;
                                                                    break L2;
                                                                  } else {
                                                                    if (var9 != 339) {
                                                                      if (var9 == 382) {
                                                                        param0[var7 + param2] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var9 == 376) {
                                                                          param0[param2 - -var7] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          param0[var7 + param2] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param0[param2 - -var7] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param0[param2 - -var7] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              param0[var7 + param2] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param0[param2 + var7] = (byte) -105;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  param0[var7 + param2] = (byte) -110;
                                                  break L2;
                                                }
                                              } else {
                                                param0[var7 + param2] = (byte) -111;
                                                break L2;
                                              }
                                            } else {
                                              param0[var7 + param2] = (byte) -114;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          param0[param2 - -var7] = (byte) -117;
                                          break L2;
                                        }
                                      } else {
                                        param0[param2 + var7] = (byte) -118;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    param0[var7 + param2] = (byte) -120;
                                    break L2;
                                  }
                                } else {
                                  param0[param2 + var7] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                param0[param2 + var7] = (byte) -122;
                                break L2;
                              }
                            } else {
                              param0[param2 - -var7] = (byte) -123;
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  param0[param2 - -var7] = (byte)var9;
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
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("qi.A(");
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
          L7: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',').append(param1).append(',').append(param2).append(',').append(0).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L7;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param5 + ')');
        }
        return stackIn_67_0;
    }

    static {
    }
}
