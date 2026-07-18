/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    boolean field_e;
    int field_g;
    int field_f;
    int field_c;
    static ee field_a;
    boolean field_i;
    boolean field_d;
    int field_j;
    static int[] field_h;
    static long[] field_b;

    final static int a(int param0, byte[] param1, CharSequence param2, int param3, int param4, int param5) {
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
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = param3;
              if (param0 > 80) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6_int) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param2.charAt(var7);
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
                      if (8218 != var8) {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param1[var7 + param5] = (byte) -122;
                                break L3;
                              } else {
                                if (var8 != 8225) {
                                  if (710 == var8) {
                                    param1[param5 - -var7] = (byte) -120;
                                    break L3;
                                  } else {
                                    if (8240 != var8) {
                                      if (352 != var8) {
                                        if (var8 != 8249) {
                                          if (338 != var8) {
                                            if (var8 == 381) {
                                              param1[var7 + param5] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (var8 == 8216) {
                                                param1[param5 + var7] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (8217 == var8) {
                                                  param1[param5 - -var7] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param1[var7 + param5] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var8 == 8221) {
                                                      param1[var7 + param5] = (byte) -108;
                                                      break L3;
                                                    } else {
                                                      if (8226 == var8) {
                                                        param1[param5 - -var7] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param1[var7 + param5] = (byte) -105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param1[var7 + param5] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (353 != var8) {
                                                                  if (var8 != 8250) {
                                                                    if (339 != var8) {
                                                                      if (382 != var8) {
                                                                        if (376 == var8) {
                                                                          param1[param5 - -var7] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          param1[param5 - -var7] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param1[var7 + param5] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      param1[var7 + param5] = (byte) -100;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    param1[param5 + var7] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  param1[var7 + param5] = (byte) -102;
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              param1[param5 + var7] = (byte) -104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          param1[var7 + param5] = (byte) -106;
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            param1[param5 - -var7] = (byte) -116;
                                            break L3;
                                          }
                                        } else {
                                          param1[param5 - -var7] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        param1[param5 + var7] = (byte) -118;
                                        break L3;
                                      }
                                    } else {
                                      param1[var7 + param5] = (byte) -119;
                                      break L3;
                                    }
                                  }
                                } else {
                                  param1[param5 - -var7] = (byte) -121;
                                  break L3;
                                }
                              }
                            } else {
                              param1[param5 + var7] = (byte) -123;
                              break L3;
                            }
                          } else {
                            param1[var7 + param5] = (byte) -124;
                            break L3;
                          }
                        } else {
                          param1[param5 + var7] = (byte) -125;
                          break L3;
                        }
                      } else {
                        param1[var7 + param5] = (byte) -126;
                        break L3;
                      }
                    }
                  }
                  param1[var7 + param5] = (byte)var8;
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
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("l.A(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param3 + ',' + 0 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_h = null;
    }

    final static void a(int param0) {
        mi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1 = uh.field_Wb;
            L1: while (true) {
              if (!kd.l(7)) {
                break L0;
              } else {
                var1.j(8, 118);
                int fieldTemp$5 = var1.field_u + 1;
                var1.field_u = var1.field_u + 1;
                var2 = fieldTemp$5;
                ml.a(var1, (byte) -25);
                uh.field_Wb.b((byte) 15, var1.field_u - var2);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1_ref, "l.C(" + 119 + ')');
        }
    }

    l() {
        ((l) this).field_e = false;
        ((l) this).field_d = true;
        ((l) this).field_i = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ee();
        field_h = new int[4];
        field_b = new long[32];
    }
}
