/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class dg extends ah {
    static ed field_t;
    private boolean field_q;
    static ed field_r;
    private lb field_p;
    static String field_s;
    static al field_o;
    private String field_n;

    final static String c(byte param0) {
        if (param0 > -8) {
            dg.g(7);
            return ca.field_d;
        }
        return ca.field_d;
    }

    public static void g(int param0) {
        field_o = null;
        field_s = null;
        if (param0 != 0) {
          String discarded$2 = dg.c((byte) 98);
          field_t = null;
          field_r = null;
          return;
        } else {
          field_t = null;
          field_r = null;
          return;
        }
    }

    dg(ul param0, ul param1) {
        super(param0);
        ((dg) this).field_q = false;
        ((dg) this).field_n = "";
        try {
            ((dg) this).field_p = new lb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "dg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final rf a(int param0, String param1) {
        d var3 = null;
        RuntimeException var3_ref = null;
        rf stackIn_2_0 = null;
        rf stackIn_7_0 = null;
        rf stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        rf stackOut_6_0 = null;
        rf stackOut_11_0 = null;
        rf stackOut_10_0 = null;
        rf stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (((dg) this).field_p.a(param0, param1) != ob.field_a) {
              L1: {
                if (param1.equals((Object) (Object) ((dg) this).field_n)) {
                  break L1;
                } else {
                  int discarded$2 = 1;
                  var3 = ja.a(param1);
                  if (!var3.b(0)) {
                    stackOut_6_0 = ug.field_c;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  } else {
                    ((dg) this).field_n = param1;
                    ((dg) this).field_q = var3.c(param0 + 14669);
                    break L1;
                  }
                }
              }
              L2: {
                if (((dg) this).field_q) {
                  stackOut_11_0 = df.field_h;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = ob.field_a;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = ob.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("dg.G(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_8_0 = null;
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
            if (((dg) this).field_p.a(-1, param1) == ob.field_a) {
              stackOut_2_0 = ((dg) this).field_p.a((byte) -53, param1);
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (((dg) this).a(-1, param1) == ob.field_a) {
                stackOut_6_0 = wa.field_a;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3_int = -120 % ((param0 - 10) / 51);
                stackOut_8_0 = ec.field_c;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("dg.L(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_9_0;
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var6_int = param0;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                stackOut_66_0 = var6_int;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param3.charAt(var7);
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
                      if (160 > var8) {
                        break L5;
                      } else {
                        if (var8 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 == 8364) {
                      param4[var7 + param1] = (byte) -128;
                      break L2;
                    } else {
                      if (8218 == var8) {
                        param4[param1 + var7] = (byte) -126;
                        break L2;
                      } else {
                        if (var8 != 402) {
                          if (8222 == var8) {
                            param4[param1 - -var7] = (byte) -124;
                            break L2;
                          } else {
                            if (var8 == 8230) {
                              param4[param1 - -var7] = (byte) -123;
                              break L2;
                            } else {
                              if (var8 != 8224) {
                                if (var8 == 8225) {
                                  param4[var7 + param1] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var8 != 710) {
                                    if (var8 != 8240) {
                                      if (var8 == 352) {
                                        param4[var7 + param1] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (8249 != var8) {
                                          if (var8 != 338) {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param4[param1 + var7] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (var8 != 8217) {
                                                  if (8220 == var8) {
                                                    param4[var7 + param1] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (var8 != 8226) {
                                                        if (var8 == 8211) {
                                                          param4[var7 + param1] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (8212 == var8) {
                                                            param4[param1 + var7] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 != 8482) {
                                                                if (353 == var8) {
                                                                  param4[var7 + param1] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (339 == var8) {
                                                                      param4[param1 + var7] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (382 == var8) {
                                                                        param4[var7 + param1] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param4[var7 + param1] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          param4[var7 + param1] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param4[param1 + var7] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                param4[var7 + param1] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              param4[param1 - -var7] = (byte) -104;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        param4[var7 + param1] = (byte) -107;
                                                        break L2;
                                                      }
                                                    } else {
                                                      param4[var7 + param1] = (byte) -108;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  param4[param1 + var7] = (byte) -110;
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              param4[param1 + var7] = (byte) -114;
                                              break L2;
                                            }
                                          } else {
                                            param4[param1 + var7] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          param4[param1 - -var7] = (byte) -117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param4[var7 + param1] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    param4[var7 + param1] = (byte) -120;
                                    break L2;
                                  }
                                }
                              } else {
                                param4[var7 + param1] = (byte) -122;
                                break L2;
                              }
                            }
                          }
                        } else {
                          param4[var7 + param1] = (byte) -125;
                          break L2;
                        }
                      }
                    }
                  }
                  param4[param1 - -var7] = (byte)var8;
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
            stackOut_68_1 = new StringBuilder().append("dg.H(").append(param0).append(',').append(param1).append(',').append(19409).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
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
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
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
          throw t.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + 0 + ')');
        }
        return stackIn_67_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Fuel bonus: ";
        field_o = new al();
    }
}
