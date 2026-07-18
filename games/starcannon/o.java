/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    int field_a;
    int field_d;
    static String field_b;
    static String field_c;

    final static id a(ue param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        id stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        id stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param0.a(param1, false);
            var5 = param0.a(param2, true, var4_int);
            stackOut_0_0 = jl.a(var4_int, param0, (byte) 64, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("o.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + false + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, rb param1) {
        ta.field_e = param1.i(-1174051992) << 5;
        int var2_int = param1.j(7909);
        mc.field_f = (var2_int & 7) << 18;
        try {
            ta.field_e = ta.field_e + (var2_int >> 3);
            mc.field_f = mc.field_f + (param1.i(-1174051992) << 2);
            var2_int = param1.j(7909);
            rb.field_i = var2_int << 15 & 2064384;
            mc.field_f = mc.field_f + (var2_int >> 6);
            rb.field_i = rb.field_i + (param1.j(7909) << 7);
            var2_int = param1.j(7909);
            og.field_f = (var2_int & 1) << 16;
            rb.field_i = rb.field_i + (var2_int >> 1);
            og.field_f = og.field_f + param1.i(-1174051992);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "o.D(" + -20954 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    o(int param0, int param1, int param2, int param3) {
        ((o) this).field_d = param0;
        ((o) this).field_a = param3;
    }

    final static void a(boolean param0) {
        mj.field_c = new String[22];
        mj.field_c[12] = vc.field_f;
        mj.field_c[6] = StarCannon.field_C;
        mj.field_c[2] = gi.field_c;
        mj.field_c[14] = pe.field_b;
        mj.field_c[5] = StarCannon.field_C;
        mj.field_c[1] = rd.field_n;
        mj.field_c[4] = nc.field_e;
        mj.field_c[15] = oi.field_n;
        mj.field_c[11] = cf.field_j;
        mj.field_c[13] = ta.field_g;
        mj.field_c[7] = mf.field_b;
        mj.field_c[0] = fl.field_i;
        mj.field_c[3] = vg.field_c;
        mj.field_c[16] = qb.field_l;
        mj.field_c[17] = vb.field_j;
        mj.field_c[8] = hj.field_b[0];
        mj.field_c[10] = hj.field_b[2];
        mj.field_c[18] = ck.field_b;
        mj.field_c[9] = hj.field_b[1];
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, CharSequence param2, int param3, byte param4, byte[] param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_67_0 = 0;
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
        int stackOut_66_0 = 0;
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
        try {
          L0: {
            var6_int = param1;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                if (param4 < -26) {
                  stackOut_68_0 = var6_int;
                  stackIn_69_0 = stackOut_68_0;
                  break L0;
                } else {
                  stackOut_66_0 = -122;
                  stackIn_67_0 = stackOut_66_0;
                  return stackIn_67_0;
                }
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param2.charAt(var7);
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
                        param5[var7 + param0] = (byte) -126;
                        break L2;
                      } else {
                        if (var8 != 402) {
                          if (var8 == 8222) {
                            param5[var7 + param0] = (byte) -124;
                            break L2;
                          } else {
                            if (8230 == var8) {
                              param5[param0 + var7] = (byte) -123;
                              break L2;
                            } else {
                              if (var8 != 8224) {
                                if (var8 != 8225) {
                                  if (710 == var8) {
                                    param5[var7 + param0] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var8 == 8240) {
                                      param5[var7 + param0] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var8 != 352) {
                                        if (8249 != var8) {
                                          if (var8 != 338) {
                                            if (var8 != 381) {
                                              if (var8 == 8216) {
                                                param5[param0 - -var7] = (byte) -111;
                                                break L2;
                                              } else {
                                                if (var8 == 8217) {
                                                  param5[param0 - -var7] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param5[var7 + param0] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (var8 != 8226) {
                                                        if (8211 != var8) {
                                                          if (var8 != 8212) {
                                                            if (732 == var8) {
                                                              param5[param0 + var7] = (byte) -104;
                                                              break L2;
                                                            } else {
                                                              if (var8 == 8482) {
                                                                param5[param0 + var7] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var8 == 353) {
                                                                  param5[var7 + param0] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (var8 != 339) {
                                                                      if (var8 == 382) {
                                                                        param5[var7 + param0] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (376 != var8) {
                                                                          param5[var7 + param0] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          param5[var7 + param0] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param5[var7 + param0] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    param5[var7 + param0] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            param5[param0 - -var7] = (byte) -105;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param5[param0 - -var7] = (byte) -106;
                                                          break L2;
                                                        }
                                                      } else {
                                                        param5[var7 + param0] = (byte) -107;
                                                        break L2;
                                                      }
                                                    } else {
                                                      param5[param0 - -var7] = (byte) -108;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              param5[var7 + param0] = (byte) -114;
                                              break L2;
                                            }
                                          } else {
                                            param5[var7 + param0] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          param5[var7 + param0] = (byte) -117;
                                          break L2;
                                        }
                                      } else {
                                        param5[var7 + param0] = (byte) -118;
                                        break L2;
                                      }
                                    }
                                  }
                                } else {
                                  param5[param0 - -var7] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                param5[var7 + param0] = (byte) -122;
                                break L2;
                              }
                            }
                          }
                        } else {
                          param5[var7 + param0] = (byte) -125;
                          break L2;
                        }
                      }
                    } else {
                      param5[var7 + param0] = (byte) -128;
                      break L2;
                    }
                  }
                  param5[var7 + param0] = (byte)var8;
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
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("o.E(").append(param0).append(',').append(param1).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
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
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(0).append(',').append(param4).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
        return stackIn_69_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Try again";
    }
}
