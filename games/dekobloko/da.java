/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static byte[] field_a;
    static i field_b;
    static cc field_c;
    static boolean[] field_d;
    static tf field_e;

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jc var7 = null;
        int var8 = 0;
        jc stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        jc stackIn_11_0 = null;
        jc stackIn_17_0 = null;
        jc stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        jc stackOut_3_0 = null;
        jc stackOut_10_0 = null;
        jc stackOut_19_0 = null;
        jc stackOut_16_0 = null;
        jc stackOut_6_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = hm.field_a;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int <= 255) {
                var3 = ji.a('.', (byte) 66, param0);
                if (2 > var3.length) {
                  stackOut_10_0 = hm.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      stackOut_19_0 = oe.a((byte) 86, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var6 = var4[var5];
                      var7 = ga.a(7017, var6);
                      if (var7 != null) {
                        stackOut_16_0 = (jc) var7;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                stackOut_6_0 = ga.field_e;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("da.F(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -2734 + 41);
        }
        return stackIn_20_0;
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -121) {
            field_d = null;
        }
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        fl.a(130, 256, 16694016, kc.field_s, 82 - -param0, (mm) (Object) w.field_kb);
        int var2 = 145;
        fb.field_c[0][0].c(82 + param0, var2, 18, 18);
        var2 = var2 + (ga.a(188, 0, var2, cc.field_d, 16, 64, 16777215, (mm) (Object) se.field_S, (byte) -124, 0, 110 + param0) * 16 + 16);
        fb.field_c[1][3].c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(188, 0, var2, dn.field_q, 16, 64, 16777215, (mm) (Object) se.field_S, (byte) -125, 0, 110 - -param0) * 16));
        ri.a(var2, kk.field_n, gi.field_c, -115, 190 + param0, nf.field_e, 0);
        hk.g(309 + param0, 117, 242, 263172);
        var2 = 116;
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(var2 - -14, 256, 16694016, ug.field_n, 322 + param0, (mm) (Object) w.field_kb);
        var2 += 29;
        fl.a(13 + var2, 256, 16777215, vk.field_b[0], param0 + 322, (mm) (Object) se.field_S);
        ph.field_yb[0].c(param0 + 480, var2 - -1);
        var2 += 18;
        fl.a(13 + var2, 256, 16777215, vk.field_b[1], 322 - -param0, (mm) (Object) se.field_S);
        ph.field_yb[1].c(param0 + 480, var2 - -1);
        var2 += 34;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[2], param0 + 322, (mm) (Object) se.field_S);
        ph.field_yb[3].c(480 - -param0, var2 + 1);
        var2 += 18;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[3], param0 + 322, (mm) (Object) se.field_S);
        ph.field_yb[4].c(param0 + 480, var2 - -1);
        ed.a(16777215, 506 - -param0, vk.field_b[4], var2 + 13, (byte) 75, (mm) (Object) se.field_S);
        ph.field_yb[2].c(516 + param0, var2 - -1);
        var2 += 34;
        fl.a(var2 + 13, 256, 16777215, vk.field_b[5], 322 + param0, (mm) (Object) se.field_S);
        ph.field_yb[5].c(param0 + 480, var2 + 1);
        var2 += 34;
        fl.a(14 + var2, 256, 16694016, kc.field_q, param0 + 322, (mm) (Object) w.field_kb);
        var2 += 29;
        fl.a(13 + var2, 256, 16777215, vk.field_b[6], 322 - -param0, (mm) (Object) se.field_S);
        ph.field_yb[6].c(480 + param0, 1 + var2);
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 != -109) {
                da.a((byte) -7);
            }
            db.a(-127, param1, param2, false);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "da.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
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
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -param5 + param0;
              var7 = 0;
              if (param2 == -8218) {
                break L1;
              } else {
                da.a(true, false);
                break L1;
              }
            }
            L2: while (true) {
              if (var7 >= var6_int) {
                stackOut_67_0 = var6_int;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(param5 + var7);
                      if (0 >= var8) {
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
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param4[param1 - -var7] = (byte) -126;
                        break L3;
                      } else {
                        if (var8 != 402) {
                          if (8222 == var8) {
                            param4[param1 + var7] = (byte) -124;
                            break L3;
                          } else {
                            if (var8 != 8230) {
                              if (var8 == 8224) {
                                param4[param1 - -var7] = (byte) -122;
                                break L3;
                              } else {
                                if (var8 == 8225) {
                                  param4[var7 + param1] = (byte) -121;
                                  break L3;
                                } else {
                                  if (710 != var8) {
                                    if (8240 == var8) {
                                      param4[param1 - -var7] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var8 == 352) {
                                        param4[param1 + var7] = (byte) -118;
                                        break L3;
                                      } else {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param4[var7 + param1] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (381 != var8) {
                                              if (var8 == 8216) {
                                                param4[var7 + param1] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (var8 == 8217) {
                                                  param4[var7 + param1] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (var8 != 8220) {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param4[param1 + var7] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 != 8212) {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param4[param1 - -var7] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (353 == var8) {
                                                                  param4[param1 - -var7] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (var8 != 339) {
                                                                      if (var8 == 382) {
                                                                        param4[param1 + var7] = (byte) -98;
                                                                        break L3;
                                                                      } else {
                                                                        if (376 == var8) {
                                                                          param4[var7 + param1] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          param4[var7 + param1] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param4[var7 + param1] = (byte) -100;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    param4[var7 + param1] = (byte) -101;
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param4[var7 + param1] = (byte) -104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            param4[var7 + param1] = (byte) -105;
                                                            break L3;
                                                          }
                                                        } else {
                                                          param4[param1 + var7] = (byte) -106;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      param4[var7 + param1] = (byte) -108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param4[var7 + param1] = (byte) -109;
                                                    break L3;
                                                  }
                                                }
                                              }
                                            } else {
                                              param4[param1 + var7] = (byte) -114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param4[var7 + param1] = (byte) -117;
                                          break L3;
                                        }
                                      }
                                    }
                                  } else {
                                    param4[param1 + var7] = (byte) -120;
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              param4[param1 + var7] = (byte) -123;
                              break L3;
                            }
                          }
                        } else {
                          param4[param1 + var7] = (byte) -125;
                          break L3;
                        }
                      }
                    } else {
                      param4[param1 + var7] = (byte) -128;
                      break L3;
                    }
                  }
                  param4[var7 + param1] = (byte)var8;
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
            stackOut_69_1 = new StringBuilder().append("da.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
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
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param4 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param5 + 41);
        }
        return stackIn_68_0;
    }

    final static void a(boolean param0, boolean param1) {
        he.a(param1, -95);
        if (param0) {
            return;
        }
        if (!(null == sl.field_g)) {
            qd.a(sl.field_g, -2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new i();
    }
}
