/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static wb field_a;
    int field_c;
    int field_e;
    int field_j;
    int field_f;
    byte[] field_g;
    byte[] field_h;
    int field_b;
    int field_i;
    int field_d;

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var4 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 8230) {
                break L1;
              } else {
                var4 = null;
                mq.a((fr) null, (byte) 109);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param1 <= var2_int) {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (!wm.field_f[var2_int]) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var2_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "mq.C(" + param0 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    public static void a(byte param0) {
        field_a = null;
    }

    final static void a(fr param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ip var8 = null;
        qb var10 = null;
        b var12 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 71 / ((param1 - 40) / 59);
              if (null == ic.field_b) {
                var8 = new ip();
                var20 = var8.a((byte) 10, 128, 128, 16);
                ic.field_b = aj.a((byte) -123, var20, false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (qu.field_j != null) {
                break L2;
              } else {
                var10 = new qb();
                var21 = var10.a(16, (byte) -8, 128, 128);
                qu.field_j = aj.a((byte) -117, var21, false);
                break L2;
              }
            }
            L3: {
              var12 = param0.field_Sb;
              if (!var12.b((byte) -101)) {
                break L3;
              } else {
                if (null == dj.field_m) {
                  var22 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, (ab) (Object) new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
                  dj.field_m = aj.a((byte) -126, var22, false);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("mq.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    final static int a(int param0, byte[] param1, byte param2, CharSequence param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -param0 + param4;
              var7 = 0;
              if (param2 < -106) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var6_int <= var7) {
                stackOut_67_0 = var6_int;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(var7 + param0);
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
                        if (var8 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param1[var7 + param5] = (byte) -128;
                      break L3;
                    } else {
                      if (var8 != 8218) {
                        if (402 != var8) {
                          if (var8 != 8222) {
                            if (var8 == 8230) {
                              param1[param5 - -var7] = (byte) -123;
                              break L3;
                            } else {
                              if (var8 == 8224) {
                                param1[var7 + param5] = (byte) -122;
                                break L3;
                              } else {
                                if (8225 != var8) {
                                  if (710 != var8) {
                                    if (var8 == 8240) {
                                      param1[var7 + param5] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var8 == 352) {
                                        param1[var7 + param5] = (byte) -118;
                                        break L3;
                                      } else {
                                        if (var8 == 8249) {
                                          param1[var7 + param5] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (338 == var8) {
                                            param1[param5 - -var7] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param1[param5 + var7] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (var8 == 8217) {
                                                  param1[var7 + param5] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (8220 == var8) {
                                                    param1[var7 + param5] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var8 == 8221) {
                                                      param1[param5 - -var7] = (byte) -108;
                                                      break L3;
                                                    } else {
                                                      if (var8 != 8226) {
                                                        if (var8 == 8211) {
                                                          param1[var7 + param5] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (8212 != var8) {
                                                            if (var8 != 732) {
                                                              if (8482 != var8) {
                                                                if (var8 == 353) {
                                                                  param1[param5 + var7] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param1[var7 + param5] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param1[param5 - -var7] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (376 != var8) {
                                                                          param1[param5 + var7] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          param1[param5 + var7] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param1[param5 + var7] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param1[param5 - -var7] = (byte) -103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              param1[param5 + var7] = (byte) -104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            param1[var7 + param5] = (byte) -105;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        param1[var7 + param5] = (byte) -107;
                                                        break L3;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              param1[var7 + param5] = (byte) -114;
                                              break L3;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    param1[param5 - -var7] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  param1[var7 + param5] = (byte) -121;
                                  break L3;
                                }
                              }
                            }
                          } else {
                            param1[param5 - -var7] = (byte) -124;
                            break L3;
                          }
                        } else {
                          param1[param5 - -var7] = (byte) -125;
                          break L3;
                        }
                      } else {
                        param1[var7 + param5] = (byte) -126;
                        break L3;
                      }
                    }
                  }
                  param1[param5 + var7] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var6;
            stackOut_69_1 = new StringBuilder().append("mq.D(").append(param0).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param1 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L7;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L7;
            }
          }
          L8: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44).append(param2).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param3 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L8;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_68_0;
    }

    static {
    }
}
