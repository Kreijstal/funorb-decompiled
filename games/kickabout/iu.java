/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu extends gn {
    static int field_i;
    static String field_e;
    static boolean field_j;
    static ut field_k;
    bc field_g;
    static boolean field_h;
    int field_f;

    final static boolean a(int param0, int param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (param2 == 3) {
          return mt.a((byte) -43);
        } else {
          L0: {
            var3 = "";
            var4 = 0;
            var5 = -71;
            if (param2 != 2) {
              if (param2 == 1) {
                var4 = 3;
                var3 = "goal_pipe";
                break L0;
              } else {
                L1: {
                  if (param1 == 0) {
                    var3 = "goal_park";
                    var4 = 6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (1 != param1) {
                    break L2;
                  } else {
                    var4 = 5;
                    var3 = "goal_beach";
                    break L2;
                  }
                }
                if (param1 == 2) {
                  var3 = "goal_street";
                  var4 = 4;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var3 = "goal_rusty";
              var4 = 2;
              break L0;
            }
          }
          if (kc.field_g[var4] != null) {
            return true;
          } else {
            if (!bo.field_Cb.a("scenery", var3, (byte) -10)) {
              return false;
            } else {
              kc.field_g[var4] = bg.a("scenery", bo.field_Cb, (byte) 76, var3);
              return true;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_e = null;
    }

    final static int a(int param0, CharSequence param1, int param2, byte[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
        var9 = Kickabout.field_G;
        try {
          L0: {
            var6_int = param0;
            var7 = 0;
            if (param5 > 39) {
              L1: while (true) {
                if (var7 >= var6_int) {
                  stackOut_68_0 = var6_int;
                  stackIn_69_0 = stackOut_68_0;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param1.charAt(var7);
                        if (var8 <= 0) {
                          break L4;
                        } else {
                          if (128 > var8) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (160 > var8) {
                          break L5;
                        } else {
                          if (255 >= var8) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var8 == 8364) {
                        param3[var7 + param2] = (byte) -128;
                        break L2;
                      } else {
                        if (8218 != var8) {
                          if (402 != var8) {
                            if (var8 == 8222) {
                              param3[var7 + param2] = (byte) -124;
                              break L2;
                            } else {
                              if (var8 == 8230) {
                                param3[var7 + param2] = (byte) -123;
                                break L2;
                              } else {
                                if (8224 == var8) {
                                  param3[var7 + param2] = (byte) -122;
                                  break L2;
                                } else {
                                  if (var8 != 8225) {
                                    if (710 == var8) {
                                      param3[var7 + param2] = (byte) -120;
                                      break L2;
                                    } else {
                                      if (var8 == 8240) {
                                        param3[param2 + var7] = (byte) -119;
                                        break L2;
                                      } else {
                                        if (var8 != 352) {
                                          if (var8 != 8249) {
                                            if (var8 != 338) {
                                              if (var8 == 381) {
                                                param3[param2 + var7] = (byte) -114;
                                                break L2;
                                              } else {
                                                if (var8 != 8216) {
                                                  if (var8 == 8217) {
                                                    param3[param2 + var7] = (byte) -110;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8220) {
                                                      if (var8 == 8221) {
                                                        param3[param2 + var7] = (byte) -108;
                                                        break L2;
                                                      } else {
                                                        if (8226 != var8) {
                                                          if (8211 != var8) {
                                                            if (var8 == 8212) {
                                                              param3[var7 + param2] = (byte) -105;
                                                              break L2;
                                                            } else {
                                                              if (var8 != 732) {
                                                                if (var8 != 8482) {
                                                                  if (353 != var8) {
                                                                    if (8250 == var8) {
                                                                      param3[var7 + param2] = (byte) -101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 == 339) {
                                                                        param3[var7 + param2] = (byte) -100;
                                                                        break L2;
                                                                      } else {
                                                                        if (var8 != 382) {
                                                                          if (var8 != 376) {
                                                                            param3[var7 + param2] = (byte) 63;
                                                                            break L2;
                                                                          } else {
                                                                            param3[var7 + param2] = (byte) -97;
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          param3[param2 - -var7] = (byte) -98;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param3[var7 + param2] = (byte) -102;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param3[var7 + param2] = (byte) -103;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                param3[param2 - -var7] = (byte) -104;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            param3[param2 - -var7] = (byte) -106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param3[param2 - -var7] = (byte) -107;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      param3[param2 - -var7] = (byte) -109;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  param3[param2 - -var7] = (byte) -111;
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              param3[var7 + param2] = (byte) -116;
                                              break L2;
                                            }
                                          } else {
                                            param3[var7 + param2] = (byte) -117;
                                            break L2;
                                          }
                                        } else {
                                          param3[var7 + param2] = (byte) -118;
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    param3[var7 + param2] = (byte) -121;
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            param3[param2 + var7] = (byte) -125;
                            break L2;
                          }
                        } else {
                          param3[var7 + param2] = (byte) -126;
                          break L2;
                        }
                      }
                    }
                    param3[param2 + var7] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 23;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("iu.C(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          L7: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L7;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + 0 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final static void a(int param0, int param1) {
        int discarded$0 = hg.g(-88);
        int var2 = -23 / ((param0 - -81) / 34);
    }

    iu(bc param0, int param1) {
        try {
            ((iu) this).field_f = param1;
            ((iu) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "iu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has declined the invitation.";
    }
}
